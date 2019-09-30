package com.kal.framework.integration.adaptor;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.amadeus.xml.ws._2009._01.wbs_session_2_0.Session;
import com.kal.ibe.onea.service.AlteaSessionVO;

public class WebServiceVo {
	private String host; // "http://siteacceptance.wftc3.e-travel.com/soap/SOAPRPCRouterServlet"
							// "https://test.webservices.amadeus.com"
	private String wsap; // "1ASIWMDWKE"
	private String namespace; // "VLSSLQ_06_1_1A"
	private String soapAction; // "http://webservices.amadeus.com/wsap/VLSSLQ_06_1_1A"
	private String operationName; // "Security_Authenticate"
	private String bodyXml; // business xml
	private String guid; // "dk23d9s98s8df8sdjds"
	private String jsessionId; // "nF6BQZLRyr8GKr4FS1ndzDTjK2tkhyYLhQXQpNCz6WWVlQcDThTl!-2115827894!1098166712"
	private String requestMethod; // "POST", "GET"
	private String pipheaderVersion; // "HV1.0"
	private String piprequestSystem; // "IBE_TEST"
	private String pipemployeeNumber; // "EMP901617"
	private String piplssuserId; // "WSKEMDW"
	private String pipsourceofficeId; // "SELKE0101"
	private String pipuserName; // PAS
	private String pippassWord; // asdfsdfsdf
	private String pipsessionType; // 3
	private String messageId;
	private String pipdutyCode;
	private String query;
	private String contentsType;
	private Session session;
	private pip_service_library.pip_session.Session pipsession;
	private int headerType;
	private String companyName;
	private String workstationId;
	private String Reserved1;
	private String Reserved2;
	private String Reserved3;
	private String Reserved4;
	private String Reserved5;
	private String fileName;
	private String edgeproxycip;
	private String Xinfoperation;
	private String XinfflowCode;
	private String mustUnderstand;
	private String endPointUrl;
	private String soapMessage; // EAI Adaptor 에서 Soap Message 를 받기 위한 필드
	private String xAtcOption; // PIP 로 Altea의 특정 웹서비스 (ATC transaction 과금
								// audit) 호출 시에 Http Header 에 X-atc-Option:"A"
								// 값을 전달
	private Map<String, List<String>> resHttpHeaderFields; // Response Http Header Fields 정보들
	private Map<String, String> reqHttpHeaderFields;

	/** 특정 팀에서만 사용하는 필드들 */
	private String directSourceOfficeId; // 직결용 session pool 을 구분하기 위한 필드 (IBE요청)
	private String currentJobName;

	private String readTimeOut;

	private boolean outerApi;

	public Map<String, List<String>> getResHttpHeaderFields() {
		return resHttpHeaderFields;
	}

	public void setResHttpHeaderFields(Map<String, List<String>> resHttpHeaderFields) {
		this.resHttpHeaderFields = resHttpHeaderFields;
	}

	public Map<String, String> getReqHttpHeaderFields() {
		return reqHttpHeaderFields;
	}

	public void setReqHttpHeaderFields(Map<String, String> reqHttpHeaderFields) {
		this.reqHttpHeaderFields = reqHttpHeaderFields;
	}

	public String getxAtcOption() {
		return xAtcOption;
	}

	public void setxAtcOption(String xAtcOption) {
		this.xAtcOption = xAtcOption;
	}

	public String getCurrentJobName() {
		return currentJobName;
	}

	public void setCurrentJobName(String currentJobName) {
		this.currentJobName = currentJobName;
	}

	public String getSoapMessage() {
		return soapMessage;
	}

	public void setSoapMessage(String soapMessage) {
		this.soapMessage = soapMessage;
	}

	public String getDirectSourceOfficeId() {
		return directSourceOfficeId;
	}

	public void setDirectSourceOfficeId(String directSourceOfficeId) {
		this.directSourceOfficeId = directSourceOfficeId;
	}

	public String getMustUnderstand() {
		return mustUnderstand;
	}

	public String getEndPointUrl() {
		return endPointUrl;
	}

	public void setEndPointUrl(String endPointUrl) {
		this.endPointUrl = endPointUrl;
	}

	public void setMustUnderstand(String mustUnderstand) {
		this.mustUnderstand = mustUnderstand;
	}

	public String getEdgeproxycip() {
		return edgeproxycip;
	}

	public void setEdgeproxycip(String edgeproxycip) {
		this.edgeproxycip = edgeproxycip;
	}

	public String getXinfoperation() {
		return Xinfoperation;
	}

	public void setXinfoperation(String xinfoperation) {
		Xinfoperation = xinfoperation;
	}

	public String getXinfflowCode() {
		return XinfflowCode;
	}

	public void setXinfflowCode(String xinfflowCode) {
		XinfflowCode = xinfflowCode;
	}

	public WebServiceVo() {
		host = "";
		wsap = "";
		namespace = "";
		soapAction = "";
		operationName = "";
		bodyXml = "";
		guid = "";
		jsessionId = "";
		requestMethod = "";
		pipheaderVersion = "";
		piprequestSystem = "";
		pipemployeeNumber = "";
		piplssuserId = "";
		pipsourceofficeId = "";
		pipuserName = "";
		pippassWord = "";
		pipsessionType = "";
		messageId = "";
		pipdutyCode = "";
		query = "";
		contentsType = "";
		;
		session = null;
		pipsession = null;
		headerType = -1;
		companyName = "";
		workstationId = "";
		alteasessionVO = null;
		edgeproxycip = "";
		Xinfoperation = "";
		XinfflowCode = "";
		mustUnderstand = "";
		this.directSourceOfficeId = null;
		this.xAtcOption = "";
	}

	public AlteaSessionVO getAlteasessionVO() {
		return alteasessionVO;
	}

	public void setAlteasessionVO(AlteaSessionVO alteasessionVO) {
		this.alteasessionVO = alteasessionVO;
	}

	private AlteaSessionVO alteasessionVO;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWorkstationId() {
		return workstationId;
	}

	public void setWorkstationId(String workstationId) {
		this.workstationId = workstationId;
	}

	public String getContentsType() {
		return contentsType;
	}

	public void setContentsType(String contentsType) {
		this.contentsType = contentsType;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public pip_service_library.pip_session.Session getPipsession() {
		return pipsession;
	}

	public void setPipsession(pip_service_library.pip_session.Session pipsession) {
		this.pipsession = pipsession;
	}

	public String getPipdutyCode() {
		return pipdutyCode;
	}

	public void setPipdutyCode(String pipdutyCode) {
		this.pipdutyCode = pipdutyCode;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getWsap() {
		return wsap;
	}

	public void setWsap(String wsap) {
		this.wsap = wsap;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getSoapAction() {
		return soapAction;
	}

	public void setSoapAction(String soapAction) {
		this.soapAction = soapAction;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getBodyXml() {
		return bodyXml;
	}

	public void setBodyXml(String bodyXml) {
		this.bodyXml = bodyXml;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getPipheaderVersion() {
		return pipheaderVersion;
	}

	public void setPipheaderVersion(String pipheaderVersion) {
		this.pipheaderVersion = pipheaderVersion;
	}

	public String getPiprequestSystem() {
		return piprequestSystem;
	}

	public void setPiprequestSystem(String piprequestSystem) {
		this.piprequestSystem = piprequestSystem;
	}

	public String getPipemployeeNumber() {
		return pipemployeeNumber;
	}

	public void setPipemployeeNumber(String pipemployeeNumber) {
		this.pipemployeeNumber = pipemployeeNumber;
	}

	public String getPiplssuserId() {
		return piplssuserId;
	}

	public void setPiplssuserId(String piplssuserId) {
		this.piplssuserId = piplssuserId;
	}

	public String getPipSourceofficeId() {
		return pipsourceofficeId;
	}

	public void setPipSourceofficeId(String piposourcefficeId) {
		this.pipsourceofficeId = piposourcefficeId;
	}

	public String getPipuserName() {
		return pipuserName;
	}

	public void setPipuserName(String pipuserName) {
		this.pipuserName = pipuserName;
	}

	public String getPippassWord() {
		return pippassWord;
	}

	public void setPippassWord(String pippassWord) {
		this.pippassWord = pippassWord;
	}

	public String getJsessionId() {
		return jsessionId;
	}

	public void setJsessionId(String jsessionId) {
		this.jsessionId = jsessionId;
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public int getHeaderType() {
		return headerType;
	}

	public void setHeaderType(int headerType) {
		this.headerType = headerType;
	}

	public String getPipsessionType() {
		return pipsessionType;
	}

	public void setPipsessionType(String pipsessionType) {
		this.pipsessionType = pipsessionType;
	}

	public String getReadTimeOut() {
		return readTimeOut;
	}

	public void setReadTimeOut(String readTimeOut) {
		this.readTimeOut = readTimeOut;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getReserved1() {
		return Reserved1;
	}

	public void setReserved1(String reserved1) {
		Reserved1 = reserved1;
	}
	public String getReserved2() {
		return Reserved2;
	}

	public void setReserved2(String reserved2) {
		Reserved2 = reserved2;
	}

	public String getReserved3() {
		return Reserved3;
	}

	public void setReserved3(String reserved3) {
		Reserved3 = reserved3;
	}

	public String getReserved4() {
		return Reserved4;
	}

	public void setReserved4(String reserved4) {
		Reserved4 = reserved4;
	}

	public String getReserved5() {
		return Reserved5;
	}

	public void setReserved5(String reserved5) {
		Reserved5 = reserved5;
	}

	public boolean isOuterApi() {
		return outerApi;
	}

	public void setOuterApi(boolean outerApi) {
		this.outerApi = outerApi;
	}

	public String makeSecurityAuthenticateXml() {
		String result =

				"<Security_Authenticate xmlns=\"http://xml.amadeus.com/VLSSLQ_06_1_1A\">" + "<userIdentifier>"
						+ "<originIdentification>" + "<sourceOffice>SELKE06PN</sourceOffice>"
						+ "</originIdentification>" + "<originatorTypeCode>U</originatorTypeCode>"
						+ "<originator>WSKEPNS</originator>" + "</userIdentifier>" + "<dutyCode>" + "<dutyCodeDetails>"
						+ "<referenceQualifier>DUT</referenceQualifier>"
						+ "<referenceIdentifier>SU</referenceIdentifier>" + "</dutyCodeDetails>" + "</dutyCode>"
						+ "<systemDetails>" + "<organizationDetails>" + "<organizationId>KE</organizationId>"
						+ "</organizationDetails>" + "</systemDetails>" + "<passwordInfo>"
						+ "<dataLength>7</dataLength>" + "<dataType>E</dataType>"
						+ "<binaryData>QU1BREVVUw==</binaryData>" + "</passwordInfo>" + "</Security_Authenticate>";

		return result;
	}

	public String makeAirSellXml() throws Exception {
		String result =

				"airsell";

		return result;
	}

	public String makeAirMultiAvailabilityXml() throws Exception {
		String result =

				"<Air_MultiAvailability>" + "<messageActionDetails>" + "<functionDetails>"
						+ "<actionCode>44</actionCode>" + "</functionDetails>" + "</messageActionDetails>"
						+ "<requestSection>" + "<availabilityProductInfo>" + "<availabilityDetails>" + "<departureDate>"
						+ "141212" + "</departureDate>" + "</availabilityDetails>" + "<departureLocationInfo>"
						+ "<cityAirport>" + "ICN" + "</cityAirport>" + "</departureLocationInfo>"
						+ "<arrivalLocationInfo>" + "<cityAirport>" + "NRT" + "</cityAirport>"
						+ "</arrivalLocationInfo>" + "</availabilityProductInfo>" + "<airlineOrFlightOption>"
						+ "<flightIdentification>" + "<airlineCode>KE</airlineCode>" + "</flightIdentification>"
						+ "</airlineOrFlightOption>" + "<availabilityOptions>" + "<productTypeDetails>"
						+ "<typeOfRequest>TN</typeOfRequest>" + "</productTypeDetails>" + "</availabilityOptions>"
						+ "</requestSection>" + "</Air_MultiAvailability>";

		return result;
	}

	public String makePnrRetrieveXml() {
		// String result =
		// "<PNR_Retrieve><retrievalFacts><retrieve><type>2</type></retrieve><reservationOrProfileIdentifier><reservation><controlNumber>5SFW5F</controlNumber></reservation></reservationOrProfileIdentifier></retrievalFacts></PNR_Retrieve>";
		String result =

				"<PNR_Retrieve xmlns=\"http://xml.amadeus.com/PNRRET_13_2_1A\">" + "<retrievalFacts>" + "<retrieve>"
						+ "<type>2</type>" + "</retrieve>" + "<reservationOrProfileIdentifier>" + "<reservation>"
						+ "<controlNumber>26PY2X</controlNumber>" + "</reservation>"
						+ "</reservationOrProfileIdentifier>" + "</retrievalFacts>" + "</PNR_Retrieve>";

		return result;
	}

	public String makeOpenTrustedSessionXml() {
		String result =

				"<Security_OpenTrustedSession xmlns=\"http://xml.amadeus.com/VTRSAQ_12_1_1A\">" + "<userIdentifier>"
						+ "<originatorTypeCode>U</originatorTypeCode>" + "<originator>WSKEPNS</originator>"
						+ "</userIdentifier>" + "<dutyCode>" + "<referenceDetails>" + "<value>SU</value>"
						+ "</referenceDetails>" + "</dutyCode>" + "<systemDetails>" + "<deliveringSystem>"
						+ "<companyId>KE</companyId>" + "</deliveringSystem>" + "</systemDetails>" + "<applicationId>"
						+ "<applicationDetails>" + "<versionNumber>1</versionNumber>" + "<label>PNS</label>"
						+ "</applicationDetails>" + "</applicationId>" + "</Security_OpenTrustedSession>";

		return result;
	}

	public String makeSignOut() {
		String result = "<Security_SignOut xmlns=\"http://xml.amadeus.com/VLSSOQ_04_1_1A\"></Security_SignOut>";

		return result;
	}

	public String makeTicketProcessEDocXml() {
		String result =

				"<Ticket_ProcessEDoc xmlns=\"http://xml.amadeus.com/TATREQ_12_1_1A\">" + "<msgActionDetails>"
						+ "<messageFunctionDetails>" + "<messageFunction>131</messageFunction>"
						+ "</messageFunctionDetails>" + "</msgActionDetails>" + "<infoGroup>" + "<docInfo>"
						+ "<documentDetails>" + "<number>18085000130500</number>" + "</documentDetails>" + "</docInfo>"
						+ "</infoGroup>" + "</Ticket_ProcessEDoc>";

		return result;
	}

	public String makeAirFlightInfoXml() {
		String result = "<Air_FlightInfo><generalFlightInfo><flightDate><departureDate>131112</departureDate></flightDate><companyDetails><marketingCompany>KE</flir:marketingCompany></companyDetails><flightIdentification><flightNumber>001</flightNumber></flightIdentification></generalFlightInfo></Air_FlightInfo>";
		return result;
	}

	public String makePnrAddMultiElementsInfoXml() {
		String result = "<PNR_AddMultiElements><pnrActions><optionCode>0</optionCode></pnrActions><dataElementsMaster><marker1/><dataElementsIndiv><elementManagementData><segmentName>RF</segmentName></elementManagementData><freetextData><freetextDetail><subjectQualifier>3</subjectQualifier><type>P22</type><status>A</status></freetextDetail><longFreetext>1000009800</longFreetext></freetextData></dataElementsIndiv></dataElementsMaster></PNR_AddMultiElements>";
		return result;
	}

	public String makeCommandCrypticXml() {
		String result = "<Command_Cryptic><messageAction><messageFunctionDetails><messageFunction>M</messageFunction></messageFunctionDetails></messageAction><longTextString><textStringDetails>RT/TEST</textStringDetails></longTextString></Command_Cryptic>";
		return result;
	}

	public String makeOverrideIbe() {
		String reuslt =

				"&lt;?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?&gt;"
						+ "&lt;OverrideInput xsi:noNamespaceSchemaLocation=\"http://uat3.aereww.amadeus.com/XMLSchemas/V16.2/common/OverrideInput.xsd\" version=\"V16.2\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;"
						+ "&lt;TRANSACTION_ID&gt;Override&lt;/TRANSACTION_ID&gt;" + "&lt;SITE&gt;CBFICBFI&lt;/SITE&gt;"
						+ "&lt;LANGUAGE&gt;GB&lt;/LANGUAGE&gt;" + "&lt;/OverrideInput&gt;";

		return reuslt;
	}

	public String makeOverrideInputXml() {
		String result =

				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
						+ "<OverrideInput xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
						+ "xsi:noNamespaceSchemaLocation=\"http://wftc3.e-travel.com/XMLSchemas/V14.2/common/OverrideInput.xsd\">"
						+ "<TRANSACTION_ID>Override</TRANSACTION_ID >" + "<SITE>CBFICBFI</SITE>"
						+ "<LANGUAGE>GB</LANGUAGE>" + "<SO_SITE_OFFICE_ID>SELKE0101</SO_SITE_OFFICE_ID>"
						+ "<SO_SITE_ALLOW_LSA_INDICATOR>FALSE</SO_SITE_ALLOW_LSA_INDICATOR>"
						+ "<SO_SITE_DISPLAY_NBR_OF_LSA>FALSE</SO_SITE_DISPLAY_NBR_OF_LSA>"
						+ "<SO_SITE_CORPORATE_ID>SEP-UAT</SO_SITE_CORPORATE_ID>"
						+ "<SO_SITE_APIV2_SERVER>194.156.170.78</SO_SITE_APIV2_SERVER>"
						+ "<SO_SITE_APIV2_SERVER_PORT>20002</SO_SITE_APIV2_SERVER_PORT>"
						+ "<SO_SITE_APIV2_SERVER_USER_ID>GUEST</SO_SITE_APIV2_SERVER_USER_ID>"
						+ "<SO_SITE_APIV2_SERVER_PWD>TAZ</SO_SITE_APIV2_SERVER_PWD>"
						+ "<SO_SITE_SI_SAP>1ASIXJCPU</SO_SITE_SI_SAP>"
						+ "<SO_SITE_SI_SERVER_PORT>18006</SO_SITE_SI_SERVER_PORT>"
						+ "<SO_SITE_SI_SERVER_IP>193.23.185.67</SO_SITE_SI_SERVER_IP>" + " </OverrideInput>";

		return result;
	}

	public String makeFlexPricerIBE() {
		String result = "&lt;?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?&gt;"
				+ "&lt;FlexPricerAvailabilityInput xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"http://uat3.aereww.amadeus.com/XMLSchemas/V16.1/flexpricer/FlexPricerAvailabilityInput.xsd\" version=\"V16.1\"&gt;"
				+ "&lt;TRANSACTION_ID&gt;FlexPricerAvailability&lt;/TRANSACTION_ID&gt;"
				+ "&lt;PAGE_TICKET&gt;0&lt;/PAGE_TICKET&gt;" + "&lt;LIST_TRAVELLER&gt;" + "&lt;TRAVELLER_TYPE&gt;"
				+ "&lt;CODE&gt;ADT&lt;/CODE&gt;" + "&lt;/TRAVELLER_TYPE&gt;"
				+ "&lt;HAS_INFANT&gt;true&lt;/HAS_INFANT&gt;" + "&lt;TRAVELLER_ID&gt;1&lt;/TRAVELLER_ID&gt;"
				+ "&lt;/LIST_TRAVELLER&gt;" + "&lt;LIST_TRAVELLER&gt;" + "&lt;TRAVELLER_TYPE&gt;"
				+ "&lt;CODE&gt;CHD&lt;/CODE&gt;" + "&lt;/TRAVELLER_TYPE&gt;"
				+ "&lt;HAS_INFANT&gt;false&lt;/HAS_INFANT&gt;" + "&lt;TRAVELLER_ID&gt;2&lt;/TRAVELLER_ID&gt;"
				+ "&lt;/LIST_TRAVELLER&gt;" + "&lt;SITE&gt;CBFICBFI&lt;/SITE&gt;"
				+ "&lt;LANGUAGE&gt;GB&lt;/LANGUAGE&gt;" + "&lt;TRIP_TYPE&gt;R&lt;/TRIP_TYPE&gt;"
				+ "&lt;LIST_COMMERCIAL_FARE_FAMILY&gt;" + "&lt;CODE&gt;ECOEY&lt;/CODE&gt;"
				+ "&lt;/LIST_COMMERCIAL_FARE_FAMILY&gt;" + "&lt;LIST_DESTINATION&gt;"
				+ "&lt;B_LOCATION&gt;ICN&lt;/B_LOCATION&gt;" + "&lt;E_LOCATION&gt;CDG&lt;/E_LOCATION&gt;"
				+ "&lt;B_DATE&gt;201307170000&lt;/B_DATE&gt;" + "&lt;B_ANY_TIME&gt;true&lt;/B_ANY_TIME&gt;"
				+ "&lt;/LIST_DESTINATION&gt;" + "&lt;LIST_DESTINATION&gt;" + "&lt;B_LOCATION&gt;CDG&lt;/B_LOCATION&gt;"
				+ "&lt;E_LOCATION&gt;ICN&lt;/E_LOCATION&gt;" + "&lt;B_DATE&gt;201307270000&lt;/B_DATE&gt;"
				+ "&lt;B_ANY_TIME&gt;true&lt;/B_ANY_TIME&gt;" + "&lt;/LIST_DESTINATION&gt;"
				+ "&lt;ARRANGE_BY&gt;D&lt;/ARRANGE_BY&gt;" + "&lt;PRICING_TYPE&gt;I&lt;/PRICING_TYPE&gt;"
				+ "&lt;DISPLAY_TYPE&gt;1&lt;/DISPLAY_TYPE&gt;" + "&lt;/FlexPricerAvailabilityInput&gt;";

		return result;

	}

	public String makeFlexPricerAvailabilityXml() {
		String result =

				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
						+ "<FlexPricerAvailabilityInput xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
						+ "xsi:noNamespaceSchemaLocation=\"http://siteacceptance.wftc3.e-travel.com/XMLSchemas//V14.1/flexpricer/FlexPricerAvailabilityInput.xsd\">"
						+ "<TRANSACTION_ID>FlexPricerAvailability</TRANSACTION_ID>" + "<SITE>CBFICBFI</SITE>"
						+ "<LANGUAGE>GB</LANGUAGE>" + "<TRIP_TYPE>R</TRIP_TYPE>" + "<LIST_COMMERCIAL_FARE_FAMILY>"
						+ "<CODE>ECOEY</CODE>" + "</LIST_COMMERCIAL_FARE_FAMILY>" + "<LIST_DESTINATION>"
						+ "<B_LOCATION>ICN</B_LOCATION>" + "<E_LOCATION>MOW</E_LOCATION>"
						+ "<B_DATE>201210100000</B_DATE>" + "<B_ANY_TIME>true</B_ANY_TIME>" + "</LIST_DESTINATION>"
						+ "<LIST_DESTINATION>" + "<B_LOCATION>MOW</B_LOCATION>" + "<E_LOCATION>ICN</E_LOCATION>"
						+ "<B_DATE>201210150000</B_DATE>" + "<B_ANY_TIME>true</B_ANY_TIME>" + "</LIST_DESTINATION>"
						+ "<LIST_TRAVELLER>" + "<TRAVELLER_TYPE>" + "<CODE>ADT</CODE>" + "</TRAVELLER_TYPE>"
						+ "<HAS_INFANT>true</HAS_INFANT>" + "</LIST_TRAVELLER>" + "<LIST_TRAVELLER>"
						+ "<TRAVELLER_TYPE>" + "<CODE>ADT</CODE>" + "</TRAVELLER_TYPE>" + "</LIST_TRAVELLER>"
						+ "<LIST_TRAVELLER>" + "<TRAVELLER_TYPE>" + "<CODE>CHD</CODE>" + "</TRAVELLER_TYPE>"
						+ "<HAS_INFANT>false</HAS_INFANT>" + "</LIST_TRAVELLER>" + "<ARRANGE_BY>N</ARRANGE_BY>"
						+ "<PRICING_TYPE>I</PRICING_TYPE>" + "<DISPLAY_TYPE>1</DISPLAY_TYPE>"
						+ "</FlexPricerAvailabilityInput>";

		return result;
	}
}
