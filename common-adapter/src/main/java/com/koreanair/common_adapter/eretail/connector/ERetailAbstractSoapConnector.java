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

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.koreanair.common.utils.JAXBFactory;
import com.koreanair.common_adapter.utils.SchemaLocation;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public abstract class ERetailAbstractSoapConnector implements ERetailConnector {

	/** eRetail jsessionid 정보 */
	protected String jsessionId = "";
	@Override
	public String getJsessionId() {
		return this.jsessionId;
	}

	@Override
	public void setJsessionId(String jsessionId) {
		this.jsessionId = jsessionId;
	}

	/** eRetail에서 전달받은 Cookie 정보 */
	protected Map<String, String> responseCookieMap = new LinkedHashMap<>();

	@Override
	public Map<String, String> getResponseCookieMap() {
		return responseCookieMap;
	}

	@Override
	public void setResponseCookieMap(Map<String, String> responseCookieMap) {
		this.responseCookieMap = responseCookieMap;
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
	protected static Document getStringToDOM(String inputXml) throws SAXException, IOException, ParserConfigurationException {
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder builder = factory.newDocumentBuilder();
	    return builder.parse(new InputSource(new StringReader(inputXml)));
	}

	protected Object unmarshalFromResponse(String inputXml) throws JAXBException, ClassNotFoundException, SAXException, IOException, ParserConfigurationException {
		Document responseDom = getStringToDOM(inputXml);
		String responseObjName = responseDom.getFirstChild().getNodeName();
		log.debug("res node = {}", responseObjName);
		Class<?> responseClass = Class.forName(responseObjName).getClass();
		return JAXBFactory.unmarshal(inputXml , responseClass);
	}

	protected Object unmarshalFromResponse(String inputXml, Class<?> responseClass) throws JAXBException, ClassNotFoundException, SAXException, IOException, ParserConfigurationException {
		Document responseDom = getStringToDOM(inputXml);
		String responseObjName = responseDom.getFirstChild().getNodeName();
		log.debug("res node = {}", responseObjName);
		return JAXBFactory.unmarshal(inputXml , responseClass);
	}

	/**
	 * marshalling 전에
	 * Direct E-Retail input Message의 xml 예약어를 치환함
	 * @param source
	 * @return source
	 */
	protected String xmlRetailSignEnc(String source) {
		source = source.replaceAll("<", "&lt;");
		source = source.replaceAll(">", "&gt;");
		return source;
	}

	/**
	 * unmarshalling 전에
	 * E-Retail output Message의 xml 예약어를 치환함
	 * @param responseMessage
	 * @return responseMessage
	 */
	protected String xmlRetailSignDec(String responseMessage) {
		responseMessage = responseMessage.replaceAll("&lt;", "<");
		responseMessage = responseMessage.replaceAll("&gt;", ">");
		responseMessage = responseMessage.replaceAll("&apos;", "'");
		return responseMessage;
	}

	protected String getBodyContents(Object object) throws JAXBException {
		String schemaLocation = SchemaLocation.get(object);
		log.debug("schemaLocation = {}" , schemaLocation);

		return JAXBFactory.marshal(object, schemaLocation);
	}


}
