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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.time.DurationFormatUtils;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
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
import com.koreanair.common_adapter.eretail.vo.PassengerConditionVO;
import com.koreanair.common_adapter.eretail.vo.SegmentInfoVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FareMatrixCalendarVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlexPricerCalendarOutputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.TaxInfoVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.TravellerTypeFareInfoVO;
import com.koreanair.common_adapter.general.vo.consts.PAXType;
import com.koreanair.common_adapter.general.vo.consts.TripType;
import com.koreanair.external.dx.vo.AirOffer;
import com.koreanair.external.dx.vo.AirOfferItem;
import com.koreanair.external.dx.vo.AirOffersListReply;
import com.koreanair.external.dx.vo.Bound;
import com.koreanair.external.dx.vo.FareFamilyWithServicesDictionaryItem;
import com.koreanair.external.dx.vo.FlightItem;
import com.koreanair.external.dx.vo.Price;
import com.koreanair.ms_ibe.service.vo.FareCalendarElementVO;
import com.koreanair.ms_ibe.service.vo.FareCalendarVO;
import com.koreanair.ms_ibe.service.vo.availability.AvailFlightVO;
import com.koreanair.ms_ibe.service.vo.availability.CommercialFareFamilyVO;
import com.koreanair.ms_ibe.service.vo.availability.FareFamilyVO;
import com.koreanair.ms_ibe.service.vo.availability.FlightInfoVO;
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
	public FlexPricerInputVO availBookingCriteria2FlexPricerInput(RevAvailCriteriaMsVO availCriteria) {
		FlexPricerInputVO flexPricerInputVo = new FlexPricerInputVO();

		try {
			flexPricerInputVo.setOfficeId("SELKE08IW");
			//flexPricerInputVo.setOfficeId("SELKE08DM");

			flexPricerInputVo.setDualDisplay(false);
			flexPricerInputVo.setOnlyCalendarFare(true);
			flexPricerInputVo.setDateRange(3);
			flexPricerInputVo.setTripType(availCriteria.getTripType());
			flexPricerInputVo.getCffCodeList().addAll(availCriteria.getCffCodeList());

			for (RevAvailSegmentCriteriaMsVO segment : availCriteria.getSegmentList()) {
				SegmentInfoVO segmentInfo = new SegmentInfoVO();
				segmentInfo.setDepartureAirport(segment.getDepartureAirport());
				segmentInfo.setArrivalAirport(segment.getArrivalAirport());
				segmentInfo.setDepartureDateTime(DateUtil.changeDateFormat(segment.getDepartureDate(),"yyyyMMdd","yyyyMMddHHmm"));
				flexPricerInputVo.getSegmentInfoList().add(segmentInfo);
			}

			for (int i = 0; i < availCriteria.getAdult(); i++) {
				PassengerConditionVO passengerCondition = new PassengerConditionVO();
				passengerCondition.setPassengerType(PAXType.ADT);
				flexPricerInputVo.getPassengerConditionList().add(passengerCondition);
			}
			for (int i = 0; i < availCriteria.getChild(); i++) {
				PassengerConditionVO passengerCondition = new PassengerConditionVO();
				passengerCondition.setPassengerType(PAXType.CHD);
				flexPricerInputVo.getPassengerConditionList().add(passengerCondition);
			}
			for (int i = 0; i < availCriteria.getInfant(); i++) {
				PassengerConditionVO passengerCondition = new PassengerConditionVO();
				passengerCondition.setPassengerType(PAXType.INF);
				flexPricerInputVo.getPassengerConditionList().add(passengerCondition);
			}

		} catch (BeansException  e) {
			log.error("",e);
		} catch (ParseException e) {
			throw new GenericException(ExceptionCode.BUSINESS_ERROR, "Date parse error!", e);
		}
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
	 * @param airOfferList
	 * @param airCalendarOutput
	 * @return
	 */
	public RevUpsellAvailMsVO organizeAvailFlight(RevAvailCriteriaMsVO availCriteria, AirOffersListReply airOfferList, AirCalendarOutputVO airCalendarOutput) {
		RevUpsellAvailMsVO revUpsellAvailMsVo = new RevUpsellAvailMsVO();

		String departureDate = "";
		String returnDate = "";
		int i=0;
		for(RevAvailSegmentCriteriaMsVO segment : availCriteria.getSegmentList()) {
			if(i==0) {
				departureDate = segment.getDepartureDate();
			} else {
				returnDate = segment.getDepartureDate();
			}
			i++;
		}

		boolean isRoundTrip = false;
		if (TripType.RT == availCriteria.getTripType()) {
			isRoundTrip = true;
		}

		UpsellBoundAvailVO departureUpsellBoundAvail = new UpsellBoundAvailVO();
		UpsellBoundAvailVO returnUpsellBoundAvail = new UpsellBoundAvailVO();

		// 상단 7 Calendar 구성 start
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
		// 상단 7 Calendar 구성 end

		// bound별 flight UPSELL 구성
		String currency = "";
		Map<String, String> cffMap = new HashMap<>();
		Map<String, FareFamilyWithServicesDictionaryItem> ffMap = airOfferList.getDictionaries().getFareFamilyWithServices();
		for (Map.Entry<String, FareFamilyWithServicesDictionaryItem> entry : ffMap.entrySet()) {
			cffMap.put(entry.getKey(), entry.getValue().getCommercialFareFamily());
		}

		for(AirOffer airOffer : airOfferList.getData().getAirOffers()) {
			String offerId = airOffer.getId();

			Bound departureAirBound = null;
			Bound returnAirBound = null;
			String offerFareFamily = "";
			String offerCffCode = "";
			for (AirOfferItem offerItem : airOffer.getOfferItems()) {

				for (int boundIdx = 0, n = offerItem.getAir().getBounds().size(); boundIdx < n; boundIdx++) {
					Bound airBound = offerItem.getAir().getBounds().get(boundIdx);
					if(boundIdx == 0) {
						departureAirBound = airBound;
					} else {
						returnAirBound = airBound;
					}
				}
				offerFareFamily = offerItem.getAir().getFareFamilyCode();
				offerCffCode = cffMap.get(offerFareFamily);
			}

			Price departurePrice = null;
			for(Price price : departureAirBound.getPrices().getTotalPrices()) {
				departurePrice = price;
				currency = departurePrice.getCurrencyCode();
			}

			Price returnPrice = null;
			if (isRoundTrip) {
				for(Price price : returnAirBound.getPrices().getTotalPrices()) {
					returnPrice = price;
				}
			}


			AvailFlightVO departureAvailFlight = new AvailFlightVO();
			organizeBoundUpsellAvailFlight(airOfferList, offerId, departureAirBound, offerCffCode, departurePrice, departureAvailFlight);
			departureUpsellBoundAvail.getAvailFlightList().add(departureAvailFlight);

			if (isRoundTrip) {
				AvailFlightVO returnAvailFlight = new AvailFlightVO();
				organizeBoundUpsellAvailFlight(airOfferList, offerId, returnAirBound, offerCffCode, returnPrice, returnAvailFlight);
				returnUpsellBoundAvail.getAvailFlightList().add(returnAvailFlight);
			}

		}
		revUpsellAvailMsVo.setCurrency(currency);

		mergeUpsellFlight(departureUpsellBoundAvail);
		if (isRoundTrip) {
			mergeUpsellFlight(returnUpsellBoundAvail);
		}

		return revUpsellAvailMsVo;
	}

	/**
	 * <pre>
	 * 각 bound별 항공편 정보를 구성한다.
	 * </pre>
	 *
	 * @param airOfferList
	 * @param offerId
	 * @param airBound
	 * @param offerCffCode
	 * @param boundPrice
	 * @param availFlightVo
	 */
	private void organizeBoundUpsellAvailFlight(AirOffersListReply airOfferList, String offerId, Bound airBound, String offerCffCode, Price boundPrice, AvailFlightVO availFlightVo) {
		availFlightVo.setDepartureAirport(airBound.getOriginLocationCode());
		availFlightVo.setArrivalAirport(airBound.getDestinationLocationCode());
		availFlightVo.setTotalFlyingTime(DurationFormatUtils.formatDuration(TimeUnit.SECONDS.toMillis(airBound.getDuration()), "HH:mm"));	// 초를 밀리초로 변경하고 duration을 HH:mm 형식으로 표기

		int fltIdx = 0;
		String primaryCarrierCode = "";
		String primaryFlightNo = "";
		String primaryBookingClass = "";
		String primaryCabinClass = "";

		for(FlightItem flightItem : airBound.getFlights()) {

			com.koreanair.external.dx.vo.Flight flight = airOfferList.getDictionaries().getFlight().get(flightItem.getId());

			FlightInfoVO fltInfo = new FlightInfoVO();
			fltInfo.setDepartureAirport(flight.getDeparture().getLocationCode());
			fltInfo.setArrivalAirport(flight.getArrival().getLocationCode());
			fltInfo.setDepartureDate(DateUtil.getStringDate(flight.getDeparture().getDateTime()));
			fltInfo.setArrivalDate(DateUtil.getStringDate(flight.getArrival().getDateTime()));
			fltInfo.setDepartureTerminal(flight.getDeparture().getTerminal());
			fltInfo.setArrivalTerminal(flight.getArrival().getTerminal());
			fltInfo.setCarrierCode(flight.getMarketingAirlineCode());
			fltInfo.setOperationCarrierCode(flight.getOperatingAirlineCode());
			fltInfo.setFlightNo(flight.getMarketingFlightNumber());
			fltInfo.setAircraftType(flight.getAircraftCode());
			fltInfo.setFlyingTime(DurationFormatUtils.formatDuration(TimeUnit.SECONDS.toMillis(flight.getDuration()), "HH:mm"));
			availFlightVo.getFlightInfoList().add(fltInfo);

			if (fltIdx == 0) {
				primaryCarrierCode = fltInfo.getCarrierCode();
				primaryFlightNo = fltInfo.getFlightNo();
				primaryBookingClass = flightItem.getBookingClass();
				primaryCabinClass = flightItem.getCabin();
			}
			fltIdx++;
		}

		availFlightVo.setPrimaryCarrierCode(primaryCarrierCode);
		availFlightVo.setPrimaryFlightNo(primaryFlightNo);


		CommercialFareFamilyVO cff = new CommercialFareFamilyVO();
		cff.setCommercialFareFamily(offerCffCode);

		FareFamilyVO fareFamily = new FareFamilyVO();
		fareFamily.setFareFamily(airBound.getFareFamilyCode());
		fareFamily.setBaseFare(String.valueOf(boundPrice.getBase()));
		fareFamily.setTotalFare(String.valueOf(boundPrice.getTotal()));
		fareFamily.setTotalTax(String.valueOf(boundPrice.getTotalTaxes()));
		fareFamily.setBookingClass(primaryBookingClass);
		fareFamily.setCabinClass(primaryCabinClass);
		fareFamily.getOfferIdList().add(offerId);
		cff.getFareFamilyDatas().add(fareFamily);
		availFlightVo.getCommercialFareFamilyList().add(cff);
	}

	private void mergeUpsellFlight(UpsellBoundAvailVO upsellBoundAvail) {
		// upsell 항공편을 운임 종류에 따라 병합 처리
		Map<String, AvailFlightVO> boundAvailMap = new LinkedHashMap<>();
		for (AvailFlightVO availFlight : upsellBoundAvail.getAvailFlightList()) {

			List<String> fltNoList = new ArrayList<>();
			for(FlightInfoVO fltInfo : availFlight.getFlightInfoList()) {
				fltNoList.add(fltInfo.getFlightNo());
			}
			String fltNos = StringUtil.join(fltNoList,"/");

			List<String> rbdList = new ArrayList<>();	// RBD (Reservation Booking Designator, 예약클래스 코드)
			for(CommercialFareFamilyVO cff : availFlight.getCommercialFareFamilyList()) {
				for (FareFamilyVO farefamily : cff.getFareFamilyDatas()) {
					rbdList.add(farefamily.getBookingClass());
				}
			}
			String rbds = StringUtil.join(fltNoList,"/");

			//String availKey = fltNos.concat("_").concat(rbds);
			String availKey = fltNos;

			if (!boundAvailMap.containsKey(availKey)) {	// 신규항목인 경우
				boundAvailMap.put(availKey, SerializationUtils.clone(availFlight));
			} else {
				AvailFlightVO alreadyAvailFlight = boundAvailMap.get(availKey);

				CommercialFareFamilyVO currentCommercialFareFamilyVo = SerializationUtils.clone(availFlight.getCommercialFareFamilyList().get(0));
				String currentCff = currentCommercialFareFamilyVo.getCommercialFareFamily();
				FareFamilyVO currentFareFamilyVo = SerializationUtils.clone(currentCommercialFareFamilyVo.getFareFamilyDatas().get(0));

				boolean existsAlreadyCff = false;
				for(CommercialFareFamilyVO alreadyCff : alreadyAvailFlight.getCommercialFareFamilyList()) {
					if (currentCff.equalsIgnoreCase(alreadyCff.getCommercialFareFamily())) {
						existsAlreadyCff = true;

						boolean existsAlreadyFF = false;
						for (FareFamilyVO alreadyFF : alreadyCff.getFareFamilyDatas()) {
							if (alreadyFF.getFareFamily().equalsIgnoreCase(currentFareFamilyVo.getFareFamily())) {
								alreadyFF.getOfferIdList().addAll(currentFareFamilyVo.getOfferIdList());
								existsAlreadyFF = true;
								break;
							}
						}
						if (!existsAlreadyFF) {
							alreadyCff.getFareFamilyDatas().addAll(currentCommercialFareFamilyVo.getFareFamilyDatas());
						}

						break;
					}
				}

				if(!existsAlreadyCff) {
					alreadyAvailFlight.getCommercialFareFamilyList().addAll(availFlight.getCommercialFareFamilyList());
				}
			}
		}
		upsellBoundAvail.getAvailFlightList().clear();
		upsellBoundAvail.getAvailFlightList().addAll(boundAvailMap.values());
	}

	public static void main(String[] args) {
		RevAvailCriteriaMsVO availCriteria = new RevAvailCriteriaMsVO();
		availCriteria.setTripType(TripType.RT);
		availCriteria.getCffCodeList().add("A");
		availCriteria.getCffCodeList().add("B");
		log.debug("RevAvailCriteriaMsVO = {}", ObjectSerializeUtil.getObjectToJson(availCriteria));
		log.debug("{}",DurationFormatUtils.formatDuration( TimeUnit.SECONDS.toMillis(9000), "HH:mm"));
	}
}
