/*
 * Copyright 2011-2019 KoreanAir
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.koreanair.common_adapter.eretail.connector;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpCookie;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeader;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.w3c.dom.CDATASection;
import org.w3c.dom.NodeList;

import com.koreanair.common_adapter.utils.ObjectSerializeUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * SOAPMessage 방식의 connector 구현체
 * Created by bdlee on 2019. 10. 2.
 * </pre>
 *
 * @author bdlee
 *
 * @version 1.0.0
 * @since 2019. 10. 2.
 */
@Slf4j
public class ERetailSoapConnectorImpl extends ERetailAbstractSoapConnector {

	protected String requestXml = "";

	public ERetailSoapConnectorImpl() {
		log.debug("eRetail용 SOAP Connector 생성");
	}

	public Object sendAndReceive(Object requestClass, Class<?> responseClass) throws SOAPException {
		Object retObj = null;
		try {
			SOAPMessage soapMessage = createRequestSoapMessage(requestClass);
			String responseXml = call(soapMessage);
			retObj = unmarshalFromResponse(responseXml, responseClass);
		} catch (Exception e) {
			throw new SOAPException(e);
		}
		return retObj;
	}

	private SOAPMessage createRequestSoapMessage(Object requestClass) throws SOAPException, IOException, TransformerConfigurationException, TransformerException, TransformerFactoryConfigurationError, JAXBException {

		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage soapReqMessage = messageFactory.createMessage();
		SOAPPart soapPart = soapReqMessage.getSOAPPart();

		SOAPEnvelope envelope = soapPart.getEnvelope();
		//SOAPHeader header = envelope.getHeader()
		SOAPBody body = envelope.getBody();

		MimeHeaders headers = soapReqMessage.getMimeHeaders();
		headers.addHeader("SOAPAction", "urn:TripFlow");

		envelope.addNamespaceDeclaration("xsd","http://www.w3.org/2001/XMLSchema");
		envelope.addNamespaceDeclaration("xsi","http://www.w3.org/2001/XMLSchema-instance");

		SOAPBodyElement operation = body.addBodyElement(envelope.createName("process", "ns1", "urn:TripFlow"));
		operation.addNamespaceDeclaration("xsd","http://www.w3.org/2001/XMLSchema");
		operation.addNamespaceDeclaration("xsi","http://www.w3.org/2001/XMLSchema-instance");

		javax.xml.soap.SOAPElement element = operation.addChildElement(envelope.createName("request"));
		element.addAttribute(new QName("xsi:type"), "xsd:string");

		requestXml = getBodyContents(requestClass);

		CDATASection requestXmlWithCData = soapPart.createCDATASection(requestXml);
		element.appendChild(requestXmlWithCData);

		soapReqMessage.saveChanges();

		return soapReqMessage;
	}

	private String call(SOAPMessage soapReqMessage) throws SOAPException, IOException, TransformerException, TransformerFactoryConfigurationError {

		SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
		SOAPConnection soapConnection = soapConnectionFactory.createConnection();
		URL endpoint = new URL(new URL("https://uat5.aereww.amadeus.com"), "/soap/SOAPRPCRouterServlet", new URLStreamHandler() {
			@Override
			protected URLConnection openConnection(URL url) throws IOException {
				URL target = new URL(url.toString());
				URLConnection connection = target.openConnection();
				// Connection settings
				connection.setConnectTimeout(10000); // 10 sec
				connection.setReadTimeout(60000); // 1 min
				return (connection);
			}
		});
		SOAPMessage soapResMessage = soapConnection.call(soapReqMessage, endpoint);
//		SOAPMessage soapResMessage = soapConnection.call(soapReqMessage, "https://uat5.aereww.amadeus.com/soap/SOAPRPCRouterServlet");

		log.debug("");
		log.debug("Outbound Message - To 1A");
		log.debug("──────────────────────────────────────────────────────────────────────────");

		if (log.isDebugEnabled()) {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			soapReqMessage.writeTo(os);
			log.debug("Request SOAP Message: {}", new String(os.toByteArray(), StandardCharsets.UTF_8));
			os.close();
		}

		@SuppressWarnings("unchecked")
		Iterator<MimeHeader> iteratorOfOutBound = soapReqMessage.getMimeHeaders().getAllHeaders();
		while (iteratorOfOutBound.hasNext()) {
			MimeHeader header = iteratorOfOutBound.next();
			log.debug("{} : {}", header.getName() , header.getValue());
		}
		log.debug("Payload : {} " , requestXml);
		log.debug("──────────────────────────────────────────────────────────────────────────");


		String responseXml = "";
		NodeList bodyNodList = soapResMessage.getSOAPBody().getElementsByTagName("return");	// eretail 전용 응답 tag
		if (bodyNodList != null) {
			responseXml = bodyNodList.item(0).getTextContent();
		}

		log.debug("");
		log.debug("Inbound Message - from 1A");
		log.debug("──────────────────────────────────────────────────────────────────────────");

		if (log.isDebugEnabled()) {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			soapResMessage.writeTo(os);
			log.debug("Response SOAP Message: {}",new String(os.toByteArray(), StandardCharsets.UTF_8));
			os.close();
		}

		@SuppressWarnings("unchecked")
		Iterator<MimeHeader> iteratorOfInBound = soapResMessage.getMimeHeaders().getAllHeaders();
		while (iteratorOfInBound.hasNext()) {
			MimeHeader header = iteratorOfInBound.next();
			log.debug("{} : {}", header.getName() , header.getValue());
		}
		log.debug("Payload : {} " , responseXml);
		log.debug("──────────────────────────────────────────────────────────────────────────");

		String[] cookies = soapResMessage.getMimeHeaders().getHeader("Set-Cookie");
		if (cookies != null) {
			for (String cookieStr : cookies) {
				for (HttpCookie cookie : HttpCookie.parse(cookieStr)) {
					super.responseCookieMap.put(cookie.getName(), cookie.getValue());
				}
			}
		}
		super.setJsessionId(responseCookieMap.get("JSESSIONID"));
		log.debug("cookie = {}" , ObjectSerializeUtil.getObjectToJson(super.responseCookieMap));
		return responseXml;
	}

}
