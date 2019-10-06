package com.koreanair.common_adapter.eretail.avail.flexpricer;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Component;

import com.koreanair.common_adapter.eretail.ERetailBaseAdapter;
import com.koreanair.common_adapter.eretail.connector.ERetailConnector;
import com.koreanair.common_adapter.eretail.connector.ERetailSoapConnectorImpl;
import com.koreanair.common_adapter.eretail.override.OverrideAdapter;
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
import com.koreanair.external.eretail.vo.common.overrideinput.OverrideInput;
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
@Component
public class FlexPricerAdapter extends ERetailBaseAdapter {

	private ERetailConnector retailCon = new ERetailSoapConnectorImpl();	// SOAPMesage 기반 connector
//	private ERetailConnector retailCon = new ERetailUrlConnectionConnectorImpl();	// URL Connection기반 connector

	public FlexPricerAdapter() {
		log.debug("FlexPricerAdapter ready!");
	}

	/**
	 * <pre>
	 * FlexPricerInput을 호출하고 그 응답을 받아온다.
	 * </pre>
	 *
	 * @param inputVo
	 * @return
	 * @throws JAXBException
	 * @throws IOException
	 * @throws SOAPException
	 * @throws Exception
	 */
	public FlexPricerAvailabilityOutput getFlexPricerAvailability(FlexPricerInputVO inputVo) throws JAXBException, IOException, SOAPException {

		// FlexPricerInput을 구성한다.
		FlexPricerAvailabilityInput flexPricerAvailabilityInput = organizeFlexPricerAvailabilityInput(inputVo);

		// FlexPricerInput을 OverrideInput에 Embedded 시킨다.
		OverrideAdapter overrideAdapter = new OverrideAdapter();
		OverrideInput overrideWithFlexPricerInput = overrideAdapter.getEmbeddedOverrideInput(flexPricerAvailabilityInput);

		// JAXB Marshal을 할때 한꺼번에 수행되어야 하는 POJO (VO) 를 JAXB instance로 등록한다.
		JAXBFactory.setMultiClassInstance(OverrideInput.class, FlexPricerAvailabilityInput.class, OverrideInput.class, FlexPricerAvailabilityOutput.class );

		log.debug("{}", ObjectSerializeUtil.getObjectToJson(overrideWithFlexPricerInput));
		log.debug("{}", JAXBFactory.getObjectToXML(overrideWithFlexPricerInput));

		// FlexPricerInput을 호출하고 그 응답을 받아온다.
		Object output = retailCon.sendAndReceive(overrideWithFlexPricerInput, FlexPricerAvailabilityOutput.class);

		setJsessionid(retailCon.getJsessionId());	// eRetail의 jsession 정보
		setReturnObject(output);	// 응답받은 Object

		FlexPricerAvailabilityOutput flexPricerOutput = null;
		if (output instanceof FlexPricerAvailabilityOutput) {
			flexPricerOutput = (FlexPricerAvailabilityOutput) output;
		}

		log.debug("out = {}", JAXBFactory.getObjectToXML(output));
		return flexPricerOutput;
	}


	/**
	 * <pre>
	 * FlexPricerInput을 구성한다.
	 * </pre>
	 *
	 * @param inputVo
	 * @return
	 */
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


}
