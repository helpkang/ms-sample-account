/*
 * Copyright 2011-2019 AsianaIDT Inc.
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
package com.koreanair.common_adapter.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
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
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.koreanair.external.eretail.vo.common.overrideinput.OverrideInput;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreateSOAPMessage {

	private String soapAction = "";
	private String soapEndpointUrl = "https://uat5.aereww.amadeus.com/soap/SOAPRPCRouterServlet";

	private Object rqHeaderType;

	public CreateSOAPMessage(String pSoapAction, String pSoapEndpointUrl) {
		this.soapAction = pSoapAction;
		this.soapEndpointUrl = pSoapEndpointUrl;
	}

	public String getSoapAction() {
		return soapAction;
	}

	public void setSoapAction(String soapAction) {
		this.soapAction = soapAction;
	}

	public String getSoapEndpointUrl() {
		return soapEndpointUrl;
	}

	public void setSoapEndpointUrl(String soapEndpointUrl) {
		this.soapEndpointUrl = soapEndpointUrl;
	}

	public Object getRqHeaderType() {
		return rqHeaderType;
	}

	public void setRqHeaderType(Object rqHeaderType) {
		this.rqHeaderType = rqHeaderType;
	}

	protected SOAPMessage createSOAPRequest(Class<?> request) throws SOAPException, JAXBException, ParserConfigurationException, IOException, TransformerException {
		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage soapMessage = messageFactory.createMessage();

		createSoapEnvelope(soapMessage, request);

		MimeHeaders headers = soapMessage.getMimeHeaders();
		headers.addHeader("SOAPAction", soapAction);
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

	protected void createSoapEnvelope(SOAPMessage soapMessage, Class<?> requestBodyClass) throws SOAPException, JAXBException, ParserConfigurationException {
		SOAPPart soapPart = soapMessage.getSOAPPart();
		// SOAP Envelope
		SOAPEnvelope envelope = soapPart.getEnvelope();

		// SOAP Header
		Object headerCls = getRqHeaderType();
		if (headerCls != null) {
			SOAPHeader soapHeader = envelope.getHeader();
			JAXBContext jaxbContext = JAXBFactory.getIntance(headerCls.getClass());
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(headerCls, soapHeader);
		}

		// SOAP Body
		SOAPBody soapBody = envelope.getBody();

		SOAPBodyElement operation = soapBody.addBodyElement(envelope.createName("process"));

		JAXBContext jaxbContext = JAXBFactory.getIntance(requestBodyClass.getClass());
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.newDocument();

		marshaller.marshal(requestBodyClass, document);
		soapBody.addDocument(document);

	}

	protected String callSoapWebService(Class<?> request) throws SOAPException, TransformerException, TransformerFactoryConfigurationError, IOException, JAXBException, ParserConfigurationException {
		SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
		SOAPConnection soapConnection = soapConnectionFactory.createConnection();

		try {
			SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(request), soapEndpointUrl);

			if (log.isDebugEnabled()) {
				/*ByteArrayOutputStream os = new ByteArrayOutputStream();
				soapResponse.writeTo(os);
				logger.debug(new String(os.toByteArray(),"UTF-8"));
				os.close();*/
				DOMSource source = new DOMSource(soapResponse.getSOAPBody());
				StringWriter sw = new StringWriter();
				TransformerFactory.newInstance().newTransformer().transform(source, new StreamResult(sw));
				log.debug("Response SOAP Message: {}", sw.toString());
				sw.close();
			}

			return getString(soapResponse.getSOAPBody().extractContentAsDocument());

		} finally {
			if (soapConnection != null)
				soapConnection.close();
		}
	}

	protected static String getString(Document document) throws TransformerException  {
		DOMSource domSource = new DOMSource(document);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.transform(domSource, result);
		return writer.toString();
	}

	public String toString(Document doc) {
		try {
			StringWriter sw = new StringWriter();
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

			transformer.transform(new DOMSource(doc), new StreamResult(sw));
			return sw.toString();
		} catch (Exception ex) {
			throw new RuntimeException("Error converting to String", ex);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
//
//			javax.xml.rpc.Service service = ServiceFactory.newInstance().createService(new QName(""));
//			Call call = (Call) service.createCall();
//			call.setTargetEndpointAddress(new URL(soapEndpointUrl));
//			call.setOperationName(new QName("urn:AttachmentsService", "echo"));
//			QName qnameAttachment = new QName("urn:AttachmentsService", "DataHandler");
//			// Add serializer for attachment.
//			call.registerTypeMapping(dhSource.getClass(), qnameAttachment, JAFDataHandlerSerializerFactory.class, JAFDataHandlerDeserializerFactory.class);
//			call.addParameter("source", qnameAttachment, ParameterMode.IN); // Add
//			call.setReturnType(XMLType.XSD_BOOLEAN);
//			call.setProperty(Call.ATTACHMENT_ENCAPSULATION_FORMAT, Call.ATTACHMENT_ENCAPSULATION_FORMAT_DIME);
//			call.setProperty(Call.SOAPACTION_USE_PROPERTY, new Boolean(true));
//			Object ret = call.invoke(new Object[] { dhSource });
//
//
//
//


			MessageFactory factory = MessageFactory.newInstance();
			SOAPMessage soapMsg = factory.createMessage();
			SOAPPart soapPart = soapMsg.getSOAPPart();

			SOAPEnvelope envelope = soapPart.getEnvelope();
			SOAPHeader header = envelope.getHeader();
			SOAPBody body = envelope.getBody();

			MimeHeaders headers = soapMsg.getMimeHeaders();
			headers.addHeader("SOAPAction", "urn:TripFlow");

//			envelope.addAttribute(new QName("xmlns:xsd"), "http://www.w3.org/2001/XMLSchema");
//			envelope.addAttribute(new QName("xmlns:xsi"), "http://www.w3.org/2001/XMLSchema-instance");
			envelope.addNamespaceDeclaration("xsd","http://www.w3.org/2001/XMLSchema");
			envelope.addNamespaceDeclaration("xsi","http://www.w3.org/2001/XMLSchema-instance");

//			header.addTextNode("Training Details");

			SOAPBodyElement operation = body.addBodyElement(envelope.createName("process", "ns1", "urn:TripFlow"));
//			operation.addAttribute(new QName("xmlns:xsd"), "http://www.w3.org/2001/XMLSchema");
//			operation.addAttribute(new QName("xmlns:xsi"), "http://www.w3.org/2001/XMLSchema-instance");
			operation.addNamespaceDeclaration("xsd","http://www.w3.org/2001/XMLSchema");
			operation.addNamespaceDeclaration("xsi","http://www.w3.org/2001/XMLSchema-instance");

			OverrideInput overrideInupt = new OverrideInput();
			overrideInupt.setTRANSACTIONID("Override");
			overrideInupt.setSITE("CBFICBFI");
			overrideInupt.setLANGUAGE("GB");
			String xml = JAXBFactory.getObjectToXML(overrideInupt);

			javax.xml.soap.SOAPElement element = operation.addChildElement(envelope.createName("request"));
			element.addAttribute(new QName("xsi:type"), "xsd:string");
			//element.addTextNode(xml);

			CDATASection requestXml = soapPart.createCDATASection(xml);
			element.appendChild(requestXml);

/*
			element.addChildElement("WS").addTextNode("Training on Web service");

			SOAPBodyElement element1 = body.addBodyElement(envelope.createName("JAVA", "training", "https://jitendrazaa.com/blog"));
			element1.addChildElement("Spring").addTextNode("Training on Spring 3.0");
*/

			soapMsg.saveChanges();

			if (log.isDebugEnabled()) {

				ByteArrayOutputStream os = new ByteArrayOutputStream();
				soapMsg.writeTo(os);
				log.debug("Request SOAP : {}", new String(os.toByteArray(), StandardCharsets.UTF_8));
				os.close();

				DOMSource source = new DOMSource(soapMsg.getSOAPBody());
				StringWriter sw = new StringWriter();
				TransformerFactory.newInstance().newTransformer().transform(source, new StreamResult(sw));
				log.debug("Request SOAP Message: {}", sw.toString());
				sw.close();

			}


			SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
			SOAPConnection soapConnection = soapConnectionFactory.createConnection();

			SOAPMessage soapResponse = soapConnection.call(soapMsg, "https://uat5.aereww.amadeus.com/soap/SOAPRPCRouterServlet");	//

			if (log.isDebugEnabled()) {
				/*ByteArrayOutputStream os = new ByteArrayOutputStream();
					soapResponse.writeTo(os);
					logger.debug(new String(os.toByteArray(),"UTF-8"));
					os.close();*/
				DOMSource source = new DOMSource(soapResponse.getSOAPBody());
				StringWriter sw = new StringWriter();
				TransformerFactory.newInstance().newTransformer().transform(source, new StreamResult(sw));
				log.debug("Response SOAP Message: {}", sw.toString());
				sw.close();
				//log.debug("Response Body : {}" , getString(soapResponse.getSOAPBody().extractContentAsDocument()));


//				DOMSource bodyDom = new DOMSource(soapResponse.getSOAPBody().extractContentAsDocument());


				//NodeList bodyNodList = soapResponse.getSOAPBody().getChildNodes();
				String responseXml = "";
				NodeList bodyNodList = soapResponse.getSOAPBody().getElementsByTagName("return");
				if(bodyNodList != null) {
					responseXml = bodyNodList.item(0).getTextContent();
				}
				log.debug("responseXml = {}" , responseXml);
				Document responseDom = getStringToDOM(responseXml);
				log.debug("res node = {}", responseDom.getFirstChild().getNodeName());
//
//				for (int i = 0; i < bodyNodList.getLength(); i++) {
//					Node nd = bodyNodList.item(i);
//					if (nd != null) {
//						log.debug("nd = {}", nd.getNodeName());
//						log.debug("nd = {}", nd.getTextContent());
//					}
//				}
			}


//			FileOutputStream fOut = new FileOutputStream("SoapMessage.xml");
//			soapMsg.writeTo(fOut);

		}catch(Exception e){
			e.printStackTrace();
		}

	}

	/**
	 * XML 문자열을 DOM(Document) 객체로 변환
	 * @param inputXml    XML문자열
	 * @return
	 * @throws Exception
	 */
	private static Document getStringToDOM(String inputXml) throws Exception {
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder builder = factory.newDocumentBuilder();
	    return builder.parse(new InputSource(new StringReader(inputXml)));
	}
}