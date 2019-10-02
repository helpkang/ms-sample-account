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
package com.koreanair.common_adapter.eretail.avail.flexpricer;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import com.kal.framework.integration.adaptor.UrlConnectionService;
import com.kal.framework.integration.adaptor.WebServiceVo;
import com.kal.framework.integration.adaptor.support.UrlConnectionImpl;
import com.koreanair.common_adapter.eretail.connector.ERetailSoapConnector;
import com.koreanair.common_adapter.eretail.vo.FlexPricerInputVO;
import com.koreanair.common_adapter.eretail.vo.PassengerConditionVO;
import com.koreanair.common_adapter.eretail.vo.SegmentInfoVO;
import com.koreanair.common_adapter.general.vo.consts.ERetailConsts;
import com.koreanair.common_adapter.general.vo.consts.ERetailTransactionId;
import com.koreanair.common_adapter.general.vo.consts.PAXType;
import com.koreanair.common_adapter.general.vo.consts.TripType;
import com.koreanair.common_adapter.utils.GenericException;
import com.koreanair.common_adapter.utils.GenericException.ExceptionCode;
import com.koreanair.common_adapter.utils.JAXBFactory;
import com.koreanair.common_adapter.utils.ObjectSerializeUtil;
import com.koreanair.common_adapter.utils.SchemaLocation;
import com.koreanair.external.eretail.vo.common.overrideinput.OverrideInput;
import com.koreanair.external.eretail.vo.common.overrideinput.OverrideInput.EMBEDDEDTRANSACTION;
import com.koreanair.external.eretail.vo.farecommon.farecontext.LISTCORPORATENUMBER;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.DISCOUNTINFOPTCLISTPTCType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.DISCOUNTINFOPTCType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.DISCOUNTINFOType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.INPUTLISTTRAVELLERType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.INPUTTRAVELLERType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.LISTTRAVELLERINFOType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityinput.FlexPricerAvailabilityInput;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityinputtype.LISTPRICINGOPTIONSTypeFlex;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityoutput.FlexPricerAvailabilityOutput;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.COMMERCIALFAREFAMILYInputType;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.DATERANGE;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.LISTDESTINATION;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlexPricerAdapter {
	public FlexPricerAvailabilityOutput getFlexPricerAvailability(FlexPricerInputVO inputVo) throws Exception {
		FlexPricerAvailabilityInput flexPricerAvailabilityInput = organizeFlexPricerAvailabilityInput(inputVo);
		OverrideInput override = organizeOverrideInput(flexPricerAvailabilityInput);
		JAXBFactory.setMultiClassInstance(OverrideInput.class, FlexPricerAvailabilityInput.class, OverrideInput.class, FlexPricerAvailabilityOutput.class );
		log.debug("{}", ObjectSerializeUtil.getObjectToJson(override));
		log.debug("{}", JAXBFactory.getObjectToXML(override));
		FlexPricerAvailabilityOutput out = (FlexPricerAvailabilityOutput) sendAndRecieve(override, FlexPricerAvailabilityOutput.class);
//		ERetailSoapConnector eRetail = new ERetailSoapConnector();
//		FlexPricerAvailabilityOutput out = (FlexPricerAvailabilityOutput) eRetail.sendAndReceive(override, FlexPricerAvailabilityOutput.class);

		log.debug("out = {}", JAXBFactory.getObjectToXML(out));
		return out;
	}

	private static Object sendAndRecieve(Object obj, Class outputClass) throws JAXBException, Exception {

		InetAddress local;
		String ip = "";
		try {
			local = InetAddress.getLocalHost();
			ip = local.getHostAddress();
		} catch (UnknownHostException e1) {
			log.error("",e1);
		}
		UrlConnectionService urlCon = new UrlConnectionImpl();
		WebServiceVo webserviceVo = new WebServiceVo();
		webserviceVo.setHost("https://uat5.aereww.amadeus.com/soap/SOAPRPCRouterServlet");
//		webserviceVo.setHost("http://127.0.0.1:8080/soap/SOAPRPCRouterServlet");
		webserviceVo.setHost("amadeus.ecommerce.host");
		webserviceVo.setHeaderType(2);	// WebServiceVo.amadeus_ecommerce_headertype
		webserviceVo.setRequestMethod("POST");
		webserviceVo.setEdgeproxycip(ip);
		webserviceVo.setBodyXml(getBodyStr(obj));
		log.debug("getBodyStr = {}", getBodyStr(obj));
		String responseMessage = urlCon.call(webserviceVo);
		responseMessage = getOutPutBody(responseMessage);
		log.debug("{}", responseMessage);
		Object retObj = JAXBFactory.unmarshal(responseMessage, outputClass);
		return retObj;
	}

	private FlexPricerAvailabilityInput organizeFlexPricerAvailabilityInput(FlexPricerInputVO inputVo) {

		if (ObjectUtils.isEmpty(inputVo.getCffCodeList())) {
			throw new GenericException(ExceptionCode.BAD_REQUEST, "CFF는 필수 사항입니다.");
		}
		if (ObjectUtils.isEmpty(inputVo.getPassengerConditionList())) {
			throw new GenericException(ExceptionCode.BAD_REQUEST, "탑승객 정보는 필수 사항입니다.");
		}

		FlexPricerAvailabilityInput flexPricerAvailabilityInput = new FlexPricerAvailabilityInput();
		flexPricerAvailabilityInput.setTRANSACTIONID(ERetailTransactionId.FLEX_PRICER_AVAILABILITY);
		flexPricerAvailabilityInput.setSITE(ERetailConsts.SITE_REVENUE);
		flexPricerAvailabilityInput.setLANGUAGE(ERetailConsts.LANGUAGE);
		flexPricerAvailabilityInput.setPRICINGTYPE("C");	// PRICING TYPE : I = Itinerary, C=One way Combinable , O=One Way Display
		flexPricerAvailabilityInput.setDISPLAYTYPE(BigInteger.valueOf(2));
		flexPricerAvailabilityInput.setTRIPTYPE(inputVo.getTripType().value());

		/* 정렬 기준
				P = Fare without tax
				T = Fare with taxes
				D = Departure time
				E = Elapsed flying time
				A = Arrival time
				N = Number of connections
				S = Sold Out /Unavailable flights
				R = ????
		 */
		flexPricerAvailabilityInput.setARRANGEBY(ERetailConsts.ARRANGE_BY);

		if (inputVo.getTripType() == TripType.OJ) {
			flexPricerAvailabilityInput.setOWCDUALFLOWSEQUENCE(BigInteger.ONE);
		}

		// 운임 종류 - Cabin등급에 따른 Fare 종류
		for(String cff : inputVo.getCffCodeList()) {
			COMMERCIALFAREFAMILYInputType cffType = new COMMERCIALFAREFAMILYInputType();
			cffType.setCODE(cff);
			flexPricerAvailabilityInput.getLISTCOMMERCIALFAREFAMILY().add(cffType);
		}

		for (SegmentInfoVO segmentInfo : ObjectUtils.defaultIfNull(inputVo.getSegmentInfoList(), Collections.<SegmentInfoVO>emptyList())) {
			LISTDESTINATION destination = new LISTDESTINATION();
			destination.setBLOCATION(segmentInfo.getDepartureAirport());
			destination.setELOCATION(segmentInfo.getArrivalAirport());
			destination.setBDATE(segmentInfo.getDepartureDateTime());	//yyyyMMddHHmm
			destination.setBANYTIME(true);
			if (inputVo.getDateRange() > 0) {
				DATERANGE value = new DATERANGE();
				value.setQUALIFIER("C"); // combination mode - UPSELL 과 CALENDAR FARE를 동시에 보여주기 위한 설정.
				value.setVALUE(String.valueOf(inputVo.getDateRange())); // 출발일자를 기준으로 +,- n일씩 CALENDAR FARE를 가져온다.
				destination.setDATERANGE(value);
			}
			flexPricerAvailabilityInput.getLISTDESTINATION().add(destination);
		}
		// 여정정보 구성 end.

		// 탑승객 정보 구성 start.
		List<PassengerConditionVO> infantPaxCondition = new ArrayList<>();
		for (PassengerConditionVO paxCondition : inputVo.getPassengerConditionList()) {
			if (PAXType.INF.equalsIgnoreCase(paxCondition.getPassengerType())) {	// 유아가 아닌 항목은 skip
				infantPaxCondition.add(paxCondition);
			}
		}

		int passangerCount = 1;
		for (PassengerConditionVO paxCondition : inputVo.getPassengerConditionList()) {

			// 유아의 경우 탑승여부를 성인항목의 hasinfant 항목으로 가지고 있어야 하기 때문에 skip한다.
			if (PAXType.INF.equalsIgnoreCase(paxCondition.getPassengerType())) {
				continue;
			}

			INPUTLISTTRAVELLERType travellerType = new INPUTLISTTRAVELLERType();
			INPUTTRAVELLERType traveller = new INPUTTRAVELLERType();
			traveller.setCODE(paxCondition.getPassengerType()); // ADT, CHD, INF
			travellerType.setTRAVELLERTYPE(traveller);
			travellerType.setTRAVELLERID(BigInteger.valueOf(passangerCount++));
			paxCondition.setPassengerNo(String.valueOf(travellerType.getTRAVELLERID()));

			flexPricerAvailabilityInput.getLISTTRAVELLER().add(travellerType);

			if (PAXType.ADT.equalsIgnoreCase(paxCondition.getPassengerType()) && ObjectUtils.isNotEmpty(infantPaxCondition)) {
				travellerType.setHASINFANT(true);
				infantPaxCondition.remove(0);
			}
		}
		// 탑승객 정보 구성 end.

		// 탑승객별 PTC Discount 구성
		for (PassengerConditionVO paxCondition : inputVo.getPassengerConditionList()) {
			LISTTRAVELLERINFOType listTravellerInfo = new LISTTRAVELLERINFOType();
			String ptcCode = paxCondition.getDefaultPTCDiscountInfo().getPtCode();
			if (StringUtils.isBlank(ptcCode)) {
				continue;
			}

			listTravellerInfo.setTRAVELLERID(NumberUtils.createBigInteger(paxCondition.getPassengerNo()));

			DISCOUNTINFOType discountInfo = new DISCOUNTINFOType();
			DISCOUNTINFOPTCType ptcInfo = new DISCOUNTINFOPTCType();
			ptcInfo.setISCUMULATIVEDISCOUNT(false); // 중복할인 여부 : ex> corporate 에 따른 할인 + PTC 할인
			DISCOUNTINFOPTCLISTPTCType discountCode = new DISCOUNTINFOPTCLISTPTCType();
			discountCode.setCODE(paxCondition.getDefaultPTCDiscountInfo().getPtCode());

			ptcInfo.getLISTPTC().add(discountCode);
			discountInfo.setPTCINFO(ptcInfo);
			listTravellerInfo.setDISCOUNTINFO(discountInfo);

			flexPricerAvailabilityInput.getLISTTRAVELLERINFO().add(listTravellerInfo);
		}

		if (StringUtils.isNotBlank(inputVo.getCorporatedId())) {
			LISTPRICINGOPTIONSTypeFlex listpricingoptions = new LISTPRICINGOPTIONSTypeFlex();
			listpricingoptions.setTYPEOFFARE(NumberUtils.createBigInteger("-2"));
			listpricingoptions.setISPRICEBYINPUT(true);
			listpricingoptions.setTYPEOFCORPORATEFARE(NumberUtils.createBigInteger("2"));

			List<LISTCORPORATENUMBER> listcorporatenumberList = listpricingoptions.getLISTCORPORATENUMBER();
			LISTCORPORATENUMBER listcorporatenumber = new LISTCORPORATENUMBER();
			listcorporatenumber.setCORPORATENUMBER(inputVo.getCorporatedId());
			listcorporatenumberList.add(listcorporatenumber);
			flexPricerAvailabilityInput.setLISTPRICINGOPTIONS(listpricingoptions);
		}
		return flexPricerAvailabilityInput;
	}

	private OverrideInput organizeOverrideInput(Object object) {
		OverrideInput overrideInupt = new OverrideInput();
		overrideInupt.setTRANSACTIONID("Override");
		overrideInupt.setSITE("CBFICBFI");
		overrideInupt.setLANGUAGE("GB");
		overrideInupt.setSOSITEOFFICEID("SELKE08DM");
		overrideInupt.setSOSITEMINAVAILDATESPAN("N30");
		overrideInupt.setSOSITENBFLIGHTSAVAIL("30");
		overrideInupt.setSOSITEPOINTOFSALE("SEL");
		overrideInupt.setSOSITEPOINTOFTICKETING("SEL");
		overrideInupt.setSOSITEMINIMALTIME("N30");
		overrideInupt.setSOSITEAPIV2SERVER("194.156.170.78");
		overrideInupt.setSOSITEAPIV2SERVERUSERID("GUEST");
		overrideInupt.setSOSITEAPIV2SERVERPWD("TAZ");

		log.debug("embedded call");
		EMBEDDEDTRANSACTION embedded = new EMBEDDEDTRANSACTION();
		String schemaLocation = SchemaLocation.get(object, "XSD_1.0");
		embedded.setSchemaRef(schemaLocation);
		embedded.getContent().add(object);
		overrideInupt.setEMBEDDEDTRANSACTION(embedded);

		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITEMANUALETKTCMD", "TTP/ET"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESISERVERIP", "193.23.185.67"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESISERVERPORT", "18006"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESISAP", "1ASIXJCPU"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESIUSER", "UNSET"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESIPASSWORD", "UNSET"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESI1AXMLFROM", "SEPJCP"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITECORPORATEID", "SEP-UAT"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITEAPIV2SERVERPORT", "20002"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITEPTCCONFVALIDATION", "FALSE"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITESENDFOIDAIRLINE", "FALSE"));
		overrideInupt.getAny().add(JAXBFactory.createElement("SOSITEMAXRESNUMATTEMPTS", "0"));

		return overrideInupt;
	}

	public static void main(String[] args) throws Exception {
		FlexPricerAdapter adapter = new FlexPricerAdapter();
		// SELKE08DW
		FlexPricerInputVO inputVo = new FlexPricerInputVO();
		inputVo.setDateRange(0);
		inputVo.setTripType(TripType.RT);
		inputVo.getCffCodeList().add("DOMECOEY");

		SegmentInfoVO segmentInfo = new SegmentInfoVO();
		segmentInfo.setDepartureAirport("GMP");
		segmentInfo.setArrivalAirport("CJU");
		segmentInfo.setDepartureDateTime("201910080000");
		inputVo.getSegmentInfoList().add(segmentInfo);
		segmentInfo = new SegmentInfoVO();
		segmentInfo.setDepartureAirport("CJU");
		segmentInfo.setArrivalAirport("GMP");
		segmentInfo.setDepartureDateTime("201910220000");
		inputVo.getSegmentInfoList().add(segmentInfo);

		PassengerConditionVO passengerCondition = new PassengerConditionVO();
		passengerCondition.setPassengerType(PAXType.ADT);
		inputVo.getPassengerConditionList().add(passengerCondition);
//
//		passengerCondition = new PassengerConditionVO();
//		passengerCondition.setPassengerType(PAXType.CHD);
//
//		PTCDiscountInfoVO defaultPTCDiscountInfo = new PTCDiscountInfoVO();
//		defaultPTCDiscountInfo.setPtCode("CH");
//		passengerCondition.setDefaultPTCDiscountInfo(defaultPTCDiscountInfo);
//		inputVo.getPassengerConditionList().add(passengerCondition);

		adapter.getFlexPricerAvailability(inputVo);

	}

	private static String getBodyStr(Object object) throws JAXBException {
		String bodyStr = null;
		String schemaLocation = SchemaLocation.get(object, "XSD_1.0");
		log.debug("schemaLocation = {}" , schemaLocation);

		bodyStr = JAXBFactory.marshal(object, schemaLocation);
		bodyStr = "<![CDATA[".concat(bodyStr).concat("]]>");
		return bodyStr;
	}

	/**
	 * marshalling 전에
	 * Direct E-Retail input Message의 xml 예약어를 치환함
	 * @param source
	 * @return source
	 */
	private static String xmlRetailSignEnc(String source) {
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
	private static String xmlRetailSignDec(String responseMessage) {
		responseMessage = responseMessage.replaceAll("&lt;", "<");
		responseMessage = responseMessage.replaceAll("&gt;", ">");
		responseMessage = responseMessage.replaceAll("&apos;", "'");
		return responseMessage;
	}
	private static final String SOAP_BODY_START = "<soapenv:Body";
	private static final String SOAP_BODY_END = "</soapenv:Body>";
	private static String getOutPutBody(String responseMessage) {
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

}
