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
package com.koreanair.ms_ibe.helper;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.koreanair.common.exception.GenericException;
import com.koreanair.common.exception.GenericException.ExceptionCode;
import com.koreanair.common.utils.DateUtil;
import com.koreanair.common.utils.ObjectSerializeUtil;
import com.koreanair.common.utils.StringUtil;
import com.koreanair.common_adapter.dx.vo.AirCalendarInputVO;
import com.koreanair.common_adapter.dx.vo.AirCalendarOutputVO;
import com.koreanair.common_adapter.dx.vo.AirMatrixCalendarVO;
import com.koreanair.common_adapter.dx.vo.AirOfferInputVO;
import com.koreanair.common_adapter.dx.vo.CalendarBoundVO;
import com.koreanair.common_adapter.eretail.vo.FlexPricerInputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FareMatrixCalendarVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlexPricerCalendarOutputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.TaxInfoVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.TravellerTypeFareInfoVO;
import com.koreanair.common_adapter.general.vo.consts.PAXType;
import com.koreanair.common_adapter.general.vo.consts.TripType;
import com.koreanair.external.dx.vo.AirOffersListReply;
import com.koreanair.ms_ibe.service.vo.FareCalendarElementVO;
import com.koreanair.ms_ibe.service.vo.FareCalendarVO;
import com.koreanair.ms_ibe.service.vo.availability.BookingCriteriaVO;
import com.koreanair.ms_ibe.service.vo.availability.RevAvailCriteriaMsVO;
import com.koreanair.ms_ibe.service.vo.availability.RevAvailSegmentCriteriaMsVO;
import com.koreanair.ms_ibe.service.vo.availability.RevUpsellAvailMsVO;
import com.koreanair.ms_ibe.service.vo.availability.UpsellBoundAvailVO;
import com.koreanair.ms_ibe.service.vo.availability.UpsellCalendarFareVO;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AvailabilityHelper {

	/**
	 * <pre>
	 * UI의 조건을 Adapter에서 사용 가능한 형태로 변경한다.
	 * </pre>
	 * @param inputVo
	 * @return
	 */
	public FlexPricerInputVO availBookingCriteria2FlexPricerInput(BookingCriteriaVO inputVo) {
		FlexPricerInputVO flexPricerInputVo = new FlexPricerInputVO();
		BeanUtils.copyProperties(inputVo, flexPricerInputVo);
		return flexPricerInputVo;
	}

	public FareCalendarVO organizeMatrixFareCalendar(FlexPricerCalendarOutputVO flexPricerCalendarOutputVo ) throws IOException {
		FareCalendarVO fareCalendarVo = new FareCalendarVO();

		Map<String , List<FareCalendarElementVO>> calenarListMap = new LinkedHashMap<>();

		String currency = "";
		String lowestAmount = "";
		String preDate = "";
		List<FareCalendarElementVO> fareAvailList = null;
		for (FareMatrixCalendarVO fareMatrixCalendar : flexPricerCalendarOutputVo.getFareMatrixCalendarList()) {

			FareCalendarElementVO fareCalendarElementVo = new FareCalendarElementVO();
			BeanUtils.copyProperties(fareMatrixCalendar, fareCalendarElementVo);
			currency = fareMatrixCalendar.getCurrency();

			TravellerTypeFareInfoVO defaultTravellerFareInfo = null;
			if (!fareMatrixCalendar.isEmptyFare()) {
				for(TravellerTypeFareInfoVO travellerFareInfo : fareMatrixCalendar.getTravellerTypeFareInfoList()) {
					if (PAXType.ADT.equals(travellerFareInfo.getTravellerType())) {
						defaultTravellerFareInfo = travellerFareInfo;
						break;
					}
				}
				if(defaultTravellerFareInfo == null) {
					defaultTravellerFareInfo = fareMatrixCalendar.getTravellerTypeFareInfoList().get(0);
				}
			}

			if(defaultTravellerFareInfo != null) {
				String fuelCharge = "";
				for (TaxInfoVO taxInfo : defaultTravellerFareInfo.getTaxList()) {
					if ("YR".equalsIgnoreCase(taxInfo.getTaxCode()) || "YQ".equalsIgnoreCase(taxInfo.getTaxCode())) {
						fuelCharge = taxInfo.getTaxValue();
					}
				}

				double taxWithoutFuel = NumberUtils.toDouble(defaultTravellerFareInfo.getTax()) - NumberUtils.toDouble(fuelCharge)  ;

				if (StringUtils.isBlank(lowestAmount)) {
					lowestAmount = defaultTravellerFareInfo.getAmount();
				} else {
					if (NumberUtils.toDouble(lowestAmount) > NumberUtils.toDouble(defaultTravellerFareInfo.getAmount())) {
						lowestAmount = defaultTravellerFareInfo.getAmount();
					}
				}
				fareCalendarElementVo.setAmount(StringUtil.removeZeroDecimals(defaultTravellerFareInfo.getAmount()));
				fareCalendarElementVo.setTotalAmount(StringUtil.removeZeroDecimals(defaultTravellerFareInfo.getTotalAmount()));
				fareCalendarElementVo.setTax(StringUtil.removeZeroDecimals(String.valueOf(taxWithoutFuel)));
				fareCalendarElementVo.setFuelCharge(StringUtil.removeZeroDecimals(fuelCharge));
			}

			if (!preDate.equalsIgnoreCase(fareMatrixCalendar.getDepartureDate())) {
				fareAvailList = new ArrayList<>();
				fareAvailList.add(fareCalendarElementVo);

				calenarListMap.put(fareMatrixCalendar.getDepartureDate(), fareAvailList);
			} else {
				if(fareAvailList == null) {
					fareAvailList = new ArrayList<>();
				}
				fareAvailList.add(fareCalendarElementVo);
			}
			preDate = fareMatrixCalendar.getDepartureDate();
		}

		for (List<FareCalendarElementVO> calendarList : calenarListMap.values()) {
			for(FareCalendarElementVO calendarElement : calendarList) {
				if (!calendarElement.isEmptyFare() && NumberUtils.toDouble(lowestAmount) == NumberUtils.toDouble(calendarElement.getAmount())) {
					calendarElement.setLowest(true);
				}
			}
		}
		fareCalendarVo.setAvailFareMatrixMap(calenarListMap);
		fareCalendarVo.setCurrency(currency);

		log.debug("fareCalendarVo = {}", ObjectSerializeUtil.getObjectToJson(fareCalendarVo));
		return fareCalendarVo;
	}

	public AirOfferInputVO bookingCriteria2AirOfferInput(RevAvailCriteriaMsVO searchVo) throws ParseException {
		AirOfferInputVO airOfferInputVo = new AirOfferInputVO();

		if (TripType.RT != searchVo.getTripType() && TripType.OW != searchVo.getTripType()) {
			throw new GenericException(ExceptionCode.BUSINESS_ERROR, "편도, 왕복 인 경우만 사용 가능 합니다.");
		}

		airOfferInputVo.setAdult(searchVo.getAdult());
		airOfferInputVo.setChild(searchVo.getChild());
		airOfferInputVo.setInfant(searchVo.getInfant());

		int segIdx = 1;
		for (RevAvailSegmentCriteriaMsVO segmentInfo : searchVo.getSegmentList()) {
			if (segIdx == 1) {
				airOfferInputVo.setDepartureDateTime(DateUtil.changeDateFormat(segmentInfo.getDepartureDate(),"yyyyMMdd", "yyyy-MM-dd"));
				airOfferInputVo.setOriginLocationCode(segmentInfo.getDepartureAirport());
				airOfferInputVo.setDestinationLocationCode(segmentInfo.getArrivalAirport());
			} else {
				airOfferInputVo.setReturnDateTime(DateUtil.changeDateFormat(segmentInfo.getDepartureDate(),"yyyyMMdd", "yyyy-MM-dd"));
			}
			segIdx++;
		}
		airOfferInputVo.setCommercialFareFamilies(searchVo.getCffCodeList());

		airOfferInputVo.setDirectFlights(false);
		airOfferInputVo.setShowSoldOut(false);

		return airOfferInputVo;
	}

	public AirCalendarInputVO bookingCriteria2AirCalendarInput(RevAvailCriteriaMsVO searchVo) throws ParseException {
		AirCalendarInputVO airCalendarInputVo = new AirCalendarInputVO();

		if (TripType.RT != searchVo.getTripType() && TripType.OW != searchVo.getTripType()) {
			throw new GenericException(ExceptionCode.BUSINESS_ERROR, "편도, 왕복 인 경우만 사용 가능 합니다.");
		}

		airCalendarInputVo.setAdult(searchVo.getAdult());
		airCalendarInputVo.setChild(searchVo.getChild());
		airCalendarInputVo.setInfant(searchVo.getInfant());


		int segIdx = 1;
		for (RevAvailSegmentCriteriaMsVO segmentInfo : searchVo.getSegmentList()) {
			if (segIdx == 1) {
				airCalendarInputVo.setDepartureDateTime(DateUtil.changeDateFormat(segmentInfo.getDepartureDate(),"yyyyMMdd", "yyyy-MM-dd"));
				airCalendarInputVo.setOriginLocationCode(segmentInfo.getDepartureAirport());
				airCalendarInputVo.setDestinationLocationCode(segmentInfo.getArrivalAirport());
			} else {
				airCalendarInputVo.setReturnDateTime(DateUtil.changeDateFormat(segmentInfo.getDepartureDate(),"yyyyMMdd", "yyyy-MM-dd"));
			}
			segIdx++;
		}
		airCalendarInputVo.setCommercialFareFamilies(searchVo.getCffCodeList());

		airCalendarInputVo.setDirectFlights(false);
		airCalendarInputVo.setShowSoldOut(false);
		airCalendarInputVo.setFlexibility(3);	// 7*7 calendar 형식으로 표기

		return airCalendarInputVo;
	}

	/**
	 * <pre>
	 * airOfferReply와 airCalendar의 결과를 이용하여 upsell 형태를 구성한다.
	 * </pre>
	 *
	 * @param airOfferList
	 * @param airCalendarOutput
	 * @return
	 */
	public RevUpsellAvailMsVO organizeAvailFlight(RevAvailCriteriaMsVO inputVo, AirOffersListReply airOfferList, AirCalendarOutputVO airCalendarOutput) {
		RevUpsellAvailMsVO revUpsellAvailMsVo = new RevUpsellAvailMsVO();

		String departureDate = "";
		String returnDate = "";
		int i=0;
		for(RevAvailSegmentCriteriaMsVO segment : inputVo.getSegmentList()) {
			if(i==0) {
				departureDate = segment.getDepartureDate();
			} else {
				returnDate = segment.getDepartureDate();
			}
			i++;
		}

		boolean isRoundTrip = false;
		if (TripType.RT == inputVo.getTripType()) {
			isRoundTrip = true;
		}

		UpsellBoundAvailVO departureUpsellBoundAvail = new UpsellBoundAvailVO();
		UpsellBoundAvailVO returnUpsellBoundAvail = new UpsellBoundAvailVO();

		List<UpsellCalendarFareVO> departureUpsellCalendarFareList = new ArrayList<>();
		List<UpsellCalendarFareVO> returnUpsellCalendarFareList = new ArrayList<>();

		List<AirMatrixCalendarVO> departureCalendarList = new ArrayList<>();
		List<AirMatrixCalendarVO> returnCalendarList = new ArrayList<>();
		for (AirMatrixCalendarVO calendarData : airCalendarOutput.getAirMatrixCalendarList()) {

			int boundIdx = 0;
			CalendarBoundVO calendarBoundOfDeparture = new CalendarBoundVO();
			CalendarBoundVO calendarBoundOfReturn = new CalendarBoundVO();
			for (CalendarBoundVO calendarBound : calendarData.getCalendarBoundList()) {
				if (boundIdx == 0) {
					calendarBoundOfDeparture = calendarBound;
				} else {
					calendarBoundOfReturn = calendarBound;
				}
				boundIdx++;
			}

			if (!isRoundTrip || (isRoundTrip && StringUtils.isNotBlank(returnDate) && returnDate.equals(calendarData.getReturnDate()))) { // 돌아오는 날짜 기준으로 출발일 7 calendar를 구성한다.
				UpsellCalendarFareVO upsellCalendarFare = new UpsellCalendarFareVO();
				upsellCalendarFare.setDate(calendarData.getDepartureDate());
				upsellCalendarFare.setCommercialFareFamilyType(calendarData.getCommercialFareFamilyType());
				upsellCalendarFare.setFareFamilyType(calendarBoundOfDeparture.getFareFamilyType());
				upsellCalendarFare.setFareClass(calendarData.getFareClass());
				upsellCalendarFare.setBaseFare(calendarBoundOfDeparture.getBase());
				upsellCalendarFare.setTotalTax(calendarBoundOfDeparture.getTotalTax());
				upsellCalendarFare.setTotalFare(calendarBoundOfDeparture.getTotal());
				departureUpsellBoundAvail.setBoundId("1");
				departureUpsellBoundAvail.getUpsellCalendarFareList().add(upsellCalendarFare);
			}

			if (isRoundTrip && departureDate.equals(calendarData.getDepartureDate())) { // 왕복인 경우 출발일 기준으로 return의 7 calendar를 구성한다.
				UpsellCalendarFareVO upsellCalendarFare = new UpsellCalendarFareVO();
				upsellCalendarFare.setDate(calendarData.getReturnDate());
				upsellCalendarFare.setCommercialFareFamilyType(calendarData.getCommercialFareFamilyType());
				upsellCalendarFare.setFareFamilyType(calendarBoundOfReturn.getFareFamilyType());
				upsellCalendarFare.setFareClass(calendarData.getFareClass());
				upsellCalendarFare.setBaseFare(calendarBoundOfReturn.getBase());
				upsellCalendarFare.setTotalTax(calendarBoundOfReturn.getTotalTax());
				upsellCalendarFare.setTotalFare(calendarBoundOfReturn.getTotal());
				returnUpsellBoundAvail.setBoundId("2");
				returnUpsellBoundAvail.getUpsellCalendarFareList().add(upsellCalendarFare);
			}

		}

		revUpsellAvailMsVo.getUpsellBoundAvailList().add(departureUpsellBoundAvail);
		if (returnUpsellBoundAvail != null) {
			revUpsellAvailMsVo.getUpsellBoundAvailList().add(returnUpsellBoundAvail);
		}

		return revUpsellAvailMsVo;
	}
}
