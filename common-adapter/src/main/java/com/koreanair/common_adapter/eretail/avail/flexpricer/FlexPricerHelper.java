/*
 * Copyright 2011-2019 Koreanair.
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;

import com.koreanair.common.exception.GenericException;
import com.koreanair.common.exception.GenericException.ExceptionCode;
import com.koreanair.common.utils.ArrayUtil;
import com.koreanair.common.utils.DateUtil;
import com.koreanair.common.utils.StringUtil;
import com.koreanair.common_adapter.eretail.vo.FlexPricerInputVO;
import com.koreanair.common_adapter.eretail.vo.PassengerConditionVO;
import com.koreanair.common_adapter.eretail.vo.SegmentInfoVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.AvailBoundVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.BoundFareInfoVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.BoundFlightVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FareMatrixCalendarVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlexPricerCalendarOutputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlexPricerOutputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlightInfoVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.RecommendFlightVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.RecommendVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.SegmentFareInfoVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.SegmentVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.TaxInfoVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.TravellerTypeFareInfoVO;
import com.koreanair.common_adapter.general.vo.consts.ERetailConsts;
import com.koreanair.common_adapter.general.vo.consts.ERetailTransactionId;
import com.koreanair.common_adapter.general.vo.consts.PAXType;
import com.koreanair.common_adapter.general.vo.consts.TripType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.LISTTAXType;
import com.koreanair.external.eretail.vo.farecommon.farecontext.LISTCORPORATENUMBER;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.DISCOUNTINFOPTCLISTPTCType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.DISCOUNTINFOPTCType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.DISCOUNTINFOType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.INPUTLISTTRAVELLERType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.INPUTTRAVELLERType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.LISTTRAVELLERINFOType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.FFCFFDictionaryMapping;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.FFCFFDictionaryMapping.LISTFAREFAMILY;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTFLIGHTType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTPROPOSEDBOUNDType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListEmptyTabType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListEmptyTabType.LISTDATE;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListPNRType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListPanelType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListRecommendationGroupType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListSegmentType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListTabType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListTravellerType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListTravellerType.LISTBOUND.LISTSEGMENT;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.PriceType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityinput.FlexPricerAvailabilityInput;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityinputtype.LISTPRICINGOPTIONSTypeFlex;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityoutput.FlexPricerAvailabilityOutput;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.COMMERCIALFAREFAMILYInputType;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.DATERANGE;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.LISTDESTINATION;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlexPricerHelper {

	/**
	 * <pre>
	 * FlexPricerAvailabilityInput을 구성한다.
	 * </pre>
	 *
	 * @param inputVo
	 * @return
	 */
	public FlexPricerAvailabilityInput getFlexPricerAvailabilityInput(FlexPricerInputVO inputVo) {

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
		String pricingType = "C";
		if(inputVo.isOnlyCalendarFare()) {
			pricingType = "I";	// Calendar fare 형식은 가는날 , 오는날의 mix 된 형태의 fare를 표출하는 구조이기 때문에 굳이 owc 나 owd 형태로 표출할 필요가 없음.
		}
		flexPricerAvailabilityInput.setPRICINGTYPE(pricingType);	// PRICING TYPE : I = Itinerary, C=One way Combinable , O=One Way Display
		flexPricerAvailabilityInput.setDISPLAYTYPE(inputVo.isDualDisplay() ? BigInteger.valueOf(2) : BigInteger.ONE);	// 1 = Single Display, either Calendar or Upsell , 2 = Dual Display both calendar
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

	/**
	 * <pre>
	 * FlexPricerAvailabilityOutput 을 FlexPricerOutputVO 로 변환한다.
	 * Created by bdlee on 2019. 10. 16.
	 * </pre>
	 *
	 * @param flexPricerOutput
	 * @param jsessionId
	 * @return
	 */
	public FlexPricerOutputVO convertOutputVO(FlexPricerAvailabilityOutput flexPricerOutput, String jsessionId) {
		FlexPricerOutputVO output = new FlexPricerOutputVO();
		output.setJsessionId(jsessionId);

		Map<String , String> cffMap = new HashMap<>();
		for(LISTFAREFAMILY fareFamily : flexPricerOutput.getFAREFAMILYDICTIONARY().getLISTFAREFAMILY()) {
			cffMap.put(fareFamily.getFAREFAMILY(), fareFamily.getCOMMERCIALFAREFAMILY());
		}

		for (ListPanelType panel : flexPricerOutput.getLISTPANEL()) {

			if ("FP".equalsIgnoreCase(panel.getTYPE())) { // UPSELL 정보

				for (ListTabType tab : panel.getLISTTAB()) {
					String boundId = "";
					if(ObjectUtils.isNotEmpty(tab.getLISTPROPOSEDBOUND())) {
						if(tab.getLISTPROPOSEDBOUND().get(0).getBOUNDID() != null) {
							boundId = tab.getLISTPROPOSEDBOUND().get(0).getBOUNDID().toString();
						}
					}

					AvailBoundVO availBoundVo = new AvailBoundVO();
					availBoundVo.setBoundId(boundId);

					for (ListRecommendationGroupType recommend : tab.getLISTRECOMMENDATION()) {
						String recommendId = recommend.getRECOMMENDATIONID().toString();

						RecommendVO recommendVo = new RecommendVO();
						recommendVo.setRecommendId(recommendId);

						for(LISTBOUND boundOfRecommend : recommend.getLISTBOUND()) {

							if (!recommendVo.getBoundRecommendFlightMap().containsKey(boundId)) {
								List<RecommendFlightVO> recommendFlightList = new ArrayList<>();
								recommendVo.getBoundRecommendFlightMap().put(boundId, recommendFlightList);
							}

							for (LISTFLIGHT flightOfRecommend : boundOfRecommend.getLISTFLIGHT()) {

								RecommendFlightVO recommendFlightVo = new RecommendFlightVO();
								recommendFlightVo.setFlightId(flightOfRecommend.getFLIGHTID().toString());
								recommendFlightVo.setDefaultRBD(flightOfRecommend.getLSADEBUGINFO() != null ? StringUtil.getElementNSContents(flightOfRecommend.getLSADEBUGINFO().getRBD()) : "");
								recommendFlightVo.setNumberOfSeats(flightOfRecommend.getNUMBEROFLASTSEATS() != null ? flightOfRecommend.getNUMBEROFLASTSEATS().intValue() : 0);
								recommendFlightVo.setSoldout(recommendFlightVo.getNumberOfSeats() == 0);
								recommendVo.getBoundRecommendFlightMap().get(boundId).add(recommendFlightVo);
							}
						}

						recommendVo.setFareFamily(recommend.getFAREFAMILY().getSHORTNAME());
						recommendVo.setFareFamilyHierarchy(recommend.getFAREFAMILY().getHIERARCHY().toString());
						recommendVo.setCommercialFareFamily(cffMap.get(recommendVo.getFareFamily()));

						String currency = "";
						for(ListPNRType pnrType : recommend.getLISTPNR()) {
							for (ListTravellerType travellerType : pnrType.getLISTTRAVELLERTYPE()) {
								String paxType = travellerType.getTRAVELLERTYPE().getCODE();

								TravellerTypeFareInfoVO travellerTypeFareInfoVo = new TravellerTypeFareInfoVO();
								travellerTypeFareInfoVo.setTravellerType(paxType);
								travellerTypeFareInfoVo.setTravellerTypeCount(travellerType.getNUMBER().intValue());

								for (com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListTravellerType.LISTBOUND boundOfTraveller : travellerType.getLISTBOUND()) {
									BoundFareInfoVO boundFareInfoVo = new BoundFareInfoVO();
									boundFareInfoVo.setBoundId(boundId);

									for (LISTSEGMENT segmentOfTraveller : boundOfTraveller.getLISTSEGMENT()) {
										SegmentFareInfoVO segmentFareInfoVo = new SegmentFareInfoVO();
										segmentFareInfoVo.setSegmentId(segmentOfTraveller.getSEGMENTID().toString());
										segmentFareInfoVo.setCabinClass(segmentOfTraveller.getCABIN());
										segmentFareInfoVo.setRbd(segmentOfTraveller.getRBD());
										segmentFareInfoVo.setFareFamily(segmentOfTraveller.getFAREFAMILY().getSHORTNAME());
										segmentFareInfoVo.setFareClass(segmentOfTraveller.getFARECLASS());
										segmentFareInfoVo.setFareType(ObjectUtils.isNotEmpty(segmentOfTraveller.getLISTFARETYPES()) ? segmentOfTraveller.getLISTFARETYPES().get(0).getCODE() : "");
										boundFareInfoVo.getSegmentFareInfoList().add(segmentFareInfoVo);
									}
									travellerTypeFareInfoVo.getBoundFareInfoList().add(boundFareInfoVo);
								}

								for (PriceType travellerTypePrice : travellerType.getLISTTRAVELLERTYPEPRICE()) {
									currency = travellerTypePrice.getCURRENCY().getCODE();

									travellerTypeFareInfoVo.setAmount(travellerTypePrice.getAMOUNT().toString());
									travellerTypeFareInfoVo.setTax(travellerTypePrice.getTAX().toString());
									travellerTypeFareInfoVo.setTotalAmount(travellerTypePrice.getTOTALAMOUNT().toString());

									for(LISTTAXType displayTax : travellerTypePrice.getLISTDISPLAYTAX()) {
										TaxInfoVO taxInfo = new TaxInfoVO();
										taxInfo.setTaxCode(displayTax.getCODE());
										taxInfo.setTaxValue(displayTax.getVALUE().toString());
										travellerTypeFareInfoVo.getTaxList().add(taxInfo);
									}
								}

								recommendVo.getTravellerTypeFareInfoList().add(travellerTypeFareInfoVo);
							}
						}

						recommendVo.setCurrency(currency);

						availBoundVo.getRecommendList().add(recommendVo);
					}

					output.getAvailBoundList().add(availBoundVo);

					for (LISTPROPOSEDBOUNDType proposed : tab.getLISTPROPOSEDBOUND()) {
						BoundFlightVO boundFlightVo = new BoundFlightVO();
						boundFlightVo.setBoundId(proposed.getBOUNDID().toString());

						for(LISTFLIGHTType flight : proposed.getLISTFLIGHT()) {
							FlightInfoVO flightInfoVo = new FlightInfoVO();
							flightInfoVo.setFlightId(flight.getFLIGHTID().toString());
							flightInfoVo.setStatus(ObjectUtils.isNotEmpty(flight.getLISTSTATUS()) ? flight.getLISTSTATUS().get(0) : "");

							BigInteger totalFlyingTime = BigInteger.ZERO;
							for (ListSegmentType segment : flight.getLISTSEGMENT()) {
								SegmentVO segmentVo = new SegmentVO();
								segmentVo.setDepartureCity(segment.getBLOCATION().getCITYCODE());
								segmentVo.setArrivalCity(segment.getELOCATION().getCITYCODE());
								segmentVo.setDepartureAirport(segment.getBLOCATIONCODE());
								segmentVo.setArrivalAirport(segment.getELOCATIONCODE());
								segmentVo.setDepartureDateTime(DateUtil.getDateByUserFormat(segment.getBDATE().getCode(), "yyyyMMddHHmmss"));
								segmentVo.setArrivalDateTime(DateUtil.getDateByUserFormat(segment.getEDATE().getCode(), "yyyyMMddHHmmss"));
		                        segmentVo.setCarrierCode(segment.getAIRLINE().getCODE());
		                        segmentVo.setFlightNo(segment.getFLIGHTNUMBER());
		                        segmentVo.setDepartureAirport(segment.getBLOCATION().getLOCATIONCODE());
		                        segmentVo.setArrivalAirport(segment.getELOCATION().getLOCATIONCODE());
		                        segmentVo.setAircraftType(segment.getEQUIPMENT() != null ? segment.getEQUIPMENT().getCODE() : "");
		                        segmentVo.setAircraftDesc(segment.getEQUIPMENT() != null ? segment.getEQUIPMENT().getNAME() : "");
		                        segmentVo.setFlyingTime(DurationFormatUtils.formatDuration(segment.getSEGMENTFLIGHTTIME() != null ? Math.abs(segment.getSEGMENTFLIGHTTIME().longValue()) : 0L, "HH:mm")); // 시간으로 가져오기
								segmentVo.setNumberOfStop(segment.getNUMBEROFSTOPS() != null ? segment.getNUMBEROFSTOPS().intValue() : 0);
		                        segmentVo.setSegmentId(segment.getSEGMENTID().toString());

		                        // 코드쉐어가 존재하는 경우.
		                        if (segment.getOTHERAIRLINE() != null && segment.getOTHERAIRLINE().getCODE() != null) {
		                            segmentVo.setOperationCarrierCode(segment.getOTHERAIRLINE().getCODE());
		                            segmentVo.setCodeshare(true);
		                        }
								flightInfoVo.getSegmentList().add(segmentVo);

								totalFlyingTime = totalFlyingTime.add(segment.getELAPSEDFLYINGTIME() != null ? segment.getELAPSEDFLYINGTIME() : BigInteger.ZERO);
							}
							flightInfoVo.setFlyingTime(DurationFormatUtils.formatDuration(Math.abs(totalFlyingTime.longValue()), "HH:mm")); // 시간으로 가져오기
							boundFlightVo.getFlightInfoList().add(flightInfoVo);
						}

						availBoundVo.getBoundFlightList().add(boundFlightVo);
					}
				}
			}
		}


		return output;
	}

	/**
	 * <pre>
	 * FlexPricerAvailabilityOutput 를 이용하여 FlexPricerCalendarOutputVO 을 구성한다.
	 * Created by bdlee on 2019. 10. 16.
	 * </pre>
	 * @param flexPriceOutOfAmadues
	 * @param jsessionId
	 * @return
	 */
	public FlexPricerCalendarOutputVO convertCalendarFareOutputVO(FlexPricerAvailabilityOutput flexPriceOutOfAmadues, String jsessionId) {
		FlexPricerCalendarOutputVO output = new FlexPricerCalendarOutputVO();

		Map<String, String> cffMap = new HashMap<>();
        FFCFFDictionaryMapping fareFamilyDictionary = flexPriceOutOfAmadues.getFAREFAMILYDICTIONARY();
        if(fareFamilyDictionary != null) {
            for (LISTFAREFAMILY listFareFamily : fareFamilyDictionary.getLISTFAREFAMILY()) {
                cffMap.put(listFareFamily.getFAREFAMILY(), listFareFamily.getCOMMERCIALFAREFAMILY());
            }
        }

		List<ListPanelType> listPanel = flexPriceOutOfAmadues.getLISTPANEL();

		for (ListPanelType listPanelType : listPanel) {
			if (!"C".equalsIgnoreCase(listPanelType.getTYPE())) {    // CALENDAR
				continue;
			}

			List<FareMatrixCalendarVO> calendarDataList = new ArrayList<>();

			String cff = "";
			String currency ="";
			for (ListTabType tabType : listPanelType.getLISTTAB()) {

				ListRecommendationGroupType recommendationGroup = tabType.getLISTRECOMMENDATION().get(0);
				ListPNRType pnrType = recommendationGroup.getLISTPNR().get(0);
				String fareFamily = recommendationGroup.getFAREFAMILY().getSHORTNAME();
				cff = cffMap.get(fareFamily);

				List<TravellerTypeFareInfoVO> travellerTypeFareInfoVoList = new ArrayList<>();
				for (ListTravellerType listTravellerType : pnrType.getLISTTRAVELLERTYPE()) {

					TravellerTypeFareInfoVO travellerTypeFareInfoVo = new TravellerTypeFareInfoVO();
					String paxType = listTravellerType.getTRAVELLERTYPE().getCODE();

					travellerTypeFareInfoVo.setTravellerType(paxType);
					travellerTypeFareInfoVo.setTravellerTypeCount(listTravellerType.getNUMBER().intValue());


					for (PriceType travellerTypePrice : listTravellerType.getLISTTRAVELLERTYPEPRICE()) {
						currency = travellerTypePrice.getCURRENCY().getCODE();

						travellerTypeFareInfoVo.setAmount(StringUtil.removeZeroDecimals(travellerTypePrice.getAMOUNT().toString()));
						travellerTypeFareInfoVo.setTax(StringUtil.removeZeroDecimals(travellerTypePrice.getTAX().toString()));
						travellerTypeFareInfoVo.setTotalAmount(StringUtil.removeZeroDecimals(travellerTypePrice.getTOTALAMOUNT().toString()));

						for(LISTTAXType displayTax : travellerTypePrice.getLISTDISPLAYTAX()) {
							TaxInfoVO taxInfo = new TaxInfoVO();
							taxInfo.setTaxCode(displayTax.getCODE());
							taxInfo.setTaxValue(StringUtil.removeZeroDecimals(displayTax.getVALUE().toString()));
							travellerTypeFareInfoVo.getTaxList().add(taxInfo);
						}
					}
					travellerTypeFareInfoVoList.add(travellerTypeFareInfoVo);
				}

				FareMatrixCalendarVO fareCalendarData = new FareMatrixCalendarVO();
				fareCalendarData.getTravellerTypeFareInfoList().addAll(travellerTypeFareInfoVoList);

				int i = 0;
				for (com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListTabType.LISTDATE listDate : tabType.getLISTDATE()) {
					if (i == 0) {
						fareCalendarData.setDepartureDate(DateUtil.getDateByUserFormat(listDate.getDATE().getCode(), "yyyyMMdd"));
					} else {
						fareCalendarData.setReturnDate(DateUtil.getDateByUserFormat(listDate.getDATE().getCode(), "yyyyMMdd"));
					}
					i++;
				}

				fareCalendarData.setCurrency(currency);
				fareCalendarData.setFareFamilyType(fareFamily);
				fareCalendarData.setCommercialFareFamilyType(cff);
				calendarDataList.add(fareCalendarData);
			}

			// 운임이 없는 일자
			for (ListEmptyTabType listTab : listPanelType.getLISTEMPTYTAB()) {

				FareMatrixCalendarVO fareCalendarData = new FareMatrixCalendarVO();
				fareCalendarData.setEmptyFare(true);
				fareCalendarData.setCurrency("");
				fareCalendarData.setCommercialFareFamilyType("");

				int i=0;
				for (LISTDATE listDateOfEmpty : listTab.getLISTDATE()) {
					if (i == 0) {
						fareCalendarData.setDepartureDate(DateUtil.getDateByUserFormat(listDateOfEmpty.getDATE().getCode(), "yyyyMMdd"));
					} else {
						fareCalendarData.setReturnDate(DateUtil.getDateByUserFormat(listDateOfEmpty.getDATE().getCode(), "yyyyMMdd"));
					}
					i++;
				}
				calendarDataList.add(fareCalendarData);
			}
			ArrayUtil.sortCollection(calendarDataList, "getDepartureDate", "getReturnDate");
			output.getFareMatrixCalendarList().addAll(calendarDataList);
		}

		output.setJsessionId(jsessionId);

		return output;
	}
}
