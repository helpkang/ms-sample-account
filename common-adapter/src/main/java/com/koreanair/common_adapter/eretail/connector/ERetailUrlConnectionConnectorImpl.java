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

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

import com.kal.framework.integration.adaptor.UrlConnectionService;
import com.kal.framework.integration.adaptor.WebServiceVo;
import com.kal.framework.integration.adaptor.support.UrlConnectionImpl;
import com.koreanair.common_adapter.utils.JAXBFactory;
import com.koreanair.common_adapter.utils.SchemaLocation;

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
public class ERetailUrlConnectionConnectorImpl extends ERetailAbstractSoapConnector {

	private static final String SOAP_BODY_START = "<soapenv:Body";
	private static final String SOAP_BODY_END = "</soapenv:Body>";

	/**
	 * <pre>
	 * Created by bdlee on 2019. 10. 2.
	 * </pre>
	 *
	 */
	public ERetailUrlConnectionConnectorImpl() {
		log.debug("eRetail용 URL Connection SOAP Connector 생성");
	}

	public Object sendAndReceive(Object obj, Class<?> responseClass) throws SOAPException {

		Object retObj = null;
		try {
			InetAddress local;
			String ip = "";
			try {
				local = InetAddress.getLocalHost();
				ip = local.getHostAddress();
			} catch (UnknownHostException e1) {
				log.error("", e1);
			}
			UrlConnectionService urlCon = new UrlConnectionImpl();
			WebServiceVo webserviceVo = new WebServiceVo();
			webserviceVo.setHost("https://uat5.aereww.amadeus.com/soap/SOAPRPCRouterServlet");
			webserviceVo.setHost("amadeus.ecommerce.host");
			webserviceVo.setHeaderType(2);
			webserviceVo.setRequestMethod("POST");
			webserviceVo.setEdgeproxycip(ip);
			webserviceVo.setBodyXml(getBodyStr(obj));
			log.debug("getBodyStr = {}", getBodyStr(obj));
			String responseXml = urlCon.call(webserviceVo);
			responseXml = getOutPutBody(responseXml);
			log.debug("{}", responseXml);
			retObj = unmarshalFromResponse(responseXml, responseClass);
		} catch (Exception e) {
			throw new SOAPException(e);
		}
		return retObj;
	}


	private String getOutPutBody(String responseMessage) {
		int startIdx = 0;
		int endIdx = 0;
		String bodyStartSign = "&lt;";
		String bodyEndSign = "</return>";
		startIdx = responseMessage.indexOf(bodyStartSign);
		if (startIdx < 0) {
			return responseMessage;
		}
		if (SOAP_BODY_START.equals(bodyStartSign))
			startIdx = responseMessage.indexOf(">", startIdx) + 1;
		if ("<soap:Body".equals(bodyStartSign))
			startIdx = responseMessage.indexOf(">", startIdx) + 1;
		endIdx = responseMessage.indexOf(bodyEndSign);
		return xmlRetailSignDec(responseMessage.substring(startIdx, endIdx));
	}

	private static String getBodyStr(Object object) throws JAXBException {
		String bodyStr = null;
		String schemaLocation = SchemaLocation.get(object, "XSD_1.0");
		log.debug("schemaLocation = {}" , schemaLocation);

		bodyStr = JAXBFactory.marshal(object, schemaLocation);
		bodyStr = "<![CDATA[".concat(bodyStr).concat("]]>");
		return bodyStr;
	}

}
