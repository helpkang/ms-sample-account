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
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
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
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.koreanair.common_adapter.utils.JAXBFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * Created by bdlee on 2019. 10. 2.
 * </pre>
 *
 * @author bdlee
 *
 * @version 1.0.0
 * @since 2019. 10. 2.
 */
@Slf4j
public class ERetailSoapConnector {

	/**
	 * <pre>
	 * Created by bdlee on 2019. 10. 2.
	 * </pre>
	 *
	 */
	public ERetailSoapConnector() {
		log.debug("eRetail용 SOAP Connector 생성");
	}

	public Object sendAndReceive(Object requestClass) throws  SOAPException, IOException, TransformerException, TransformerFactoryConfigurationError, ClassNotFoundException, JAXBException, SAXException, ParserConfigurationException {
		SOAPMessage soapMessage = createRequestSoapMessage(requestClass);
		String responseXml = call(soapMessage);
		return unmarshalFromResponse(responseXml);
	}

	public Object sendAndReceive(Object requestClass, Class<?> responseClass) throws  SOAPException, IOException, TransformerException, TransformerFactoryConfigurationError, ClassNotFoundException, JAXBException, SAXException, ParserConfigurationException {
		SOAPMessage soapMessage = createRequestSoapMessage(requestClass);
		String responseXml = call(soapMessage);
		return unmarshalFromResponse(responseXml, responseClass);
	}

	private Object unmarshalFromResponse(String inputXml) throws JAXBException, ClassNotFoundException, SAXException, IOException, ParserConfigurationException {
		Document responseDom = getStringToDOM(inputXml);
		String responseObjName = responseDom.getFirstChild().getNodeName();
		log.debug("res node = {}", responseObjName);
		Class<?> responseClass = Class.forName(responseObjName).getClass();
		return JAXBFactory.unmarshal(inputXml , responseClass);
	}

	private Object unmarshalFromResponse(String inputXml, Class<?> responseClass) throws JAXBException, ClassNotFoundException, SAXException, IOException, ParserConfigurationException {
		Document responseDom = getStringToDOM(inputXml);
		String responseObjName = responseDom.getFirstChild().getNodeName();
		log.debug("res node = {}", responseObjName);
		return JAXBFactory.unmarshal(inputXml , responseClass);
	}


	/**
	 * XML 문자열을 DOM(Document) 객체로 변환
	 * @param inputXml    XML문자열
	 * @return
	 * @throws IOException
	 * @throws SAXException
	 * @throws ParserConfigurationException
	 * @throws Exception
	 */
	private static Document getStringToDOM(String inputXml) throws SAXException, IOException, ParserConfigurationException {
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder builder = factory.newDocumentBuilder();
	    return builder.parse(new InputSource(new StringReader(inputXml)));
	}

	private SOAPMessage createRequestSoapMessage(Object requestClass) throws SOAPException, IOException, TransformerConfigurationException, TransformerException, TransformerFactoryConfigurationError {

		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage soapMessage = messageFactory.createMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();

		SOAPEnvelope envelope = soapPart.getEnvelope();
		//SOAPHeader header = envelope.getHeader()
		SOAPBody body = envelope.getBody();

		MimeHeaders headers = soapMessage.getMimeHeaders();
		headers.addHeader("SOAPAction", "urn:TripFlow");

		envelope.addNamespaceDeclaration("xsd","http://www.w3.org/2001/XMLSchema");
		envelope.addNamespaceDeclaration("xsi","http://www.w3.org/2001/XMLSchema-instance");

		SOAPBodyElement operation = body.addBodyElement(envelope.createName("process", "ns1", "urn:TripFlow"));
		operation.addNamespaceDeclaration("xsd","http://www.w3.org/2001/XMLSchema");
		operation.addNamespaceDeclaration("xsi","http://www.w3.org/2001/XMLSchema-instance");

		javax.xml.soap.SOAPElement element = operation.addChildElement(envelope.createName("request"));
		element.addAttribute(new QName("xsi:type"), "xsd:string");

		String requestXml = JAXBFactory.getObjectToXML(requestClass);

		CDATASection requestXmlWithCData = soapPart.createCDATASection(requestXml);
		element.appendChild(requestXmlWithCData);

		soapMessage.saveChanges();

		if (log.isDebugEnabled()) {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			soapMessage.writeTo(os);
			log.debug("Request SOAP : {}", new String(os.toByteArray(), StandardCharsets.UTF_8));
			os.close();

			DOMSource source = new DOMSource(soapMessage.getSOAPBody());
			StringWriter sw = new StringWriter();
			TransformerFactory.newInstance().newTransformer().transform(source, new StreamResult(sw));
			log.debug("Request SOAP Message: {}", sw.toString());
			sw.close();
		}

		return soapMessage;
	}

	private String call(SOAPMessage soapMessage) throws SOAPException, IOException, TransformerException, TransformerFactoryConfigurationError {
		SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
		SOAPConnection soapConnection = soapConnectionFactory.createConnection();
		SOAPMessage soapResponse = soapConnection.call(soapMessage, "https://uat5.aereww.amadeus.com/soap/SOAPRPCRouterServlet");

		if (log.isDebugEnabled()) {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			soapResponse.writeTo(os);
			log.debug(new String(os.toByteArray(), StandardCharsets.UTF_8));
			os.close();

			DOMSource source = new DOMSource(soapResponse.getSOAPBody());
			StringWriter sw = new StringWriter();
			TransformerFactory.newInstance().newTransformer().transform(source, new StreamResult(sw));
			log.debug("Response SOAP Message: {}", sw.toString());
			sw.close();
		}

		String responseXml = "";
		NodeList bodyNodList = soapResponse.getSOAPBody().getElementsByTagName("return");	// eretail 전용 응답 tag
		if (bodyNodList != null) {
			responseXml = bodyNodList.item(0).getTextContent();
		}
		log.debug("responseXml = {}", responseXml);
		return responseXml;
	}
}
