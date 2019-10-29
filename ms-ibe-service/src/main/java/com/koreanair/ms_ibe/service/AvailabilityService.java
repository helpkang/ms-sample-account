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
package com.koreanair.ms_ibe.service;

import java.io.IOException;
import java.text.ParseException;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreanair.common_adapter.dx.vo.AirCalendarInputVO;
import com.koreanair.common_adapter.dx.vo.AirCalendarOutputVO;
import com.koreanair.common_adapter.dx.vo.AirOfferInputVO;
import com.koreanair.common_adapter.eretail.vo.FlexPricerInputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlexPricerCalendarOutputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlexPricerOutputVO;
import com.koreanair.external.dx.vo.AirOffersListReply;
import com.koreanair.ms_ibe.helper.AvailabilityHelper;
import com.koreanair.ms_ibe.repository.AirCalendarRepository;
import com.koreanair.ms_ibe.repository.AirOfferRepository;
import com.koreanair.ms_ibe.repository.AvailabilityRepository;
import com.koreanair.ms_ibe.service.vo.FareCalendarVO;
import com.koreanair.ms_ibe.service.vo.availability.BookingCriteriaVO;
import com.koreanair.ms_ibe.service.vo.availability.RevAvailCriteriaMsVO;
import com.koreanair.ms_ibe.service.vo.availability.RevUpsellAvailMsVO;
import com.koreanair.ms_ibe.service.vo.availability.UpsellBoundAvailVO;

@Service
public class AvailabilityService {

	@Autowired
	private AvailabilityRepository availRepository;

	@Autowired
    private AirOfferRepository airOfferRepository;

	@Autowired
	private AirCalendarRepository airCalendarRepository;

	@Autowired
	private AvailabilityHelper availHelper;

	public FlexPricerOutputVO getDomesticAvailForRevenue(FlexPricerInputVO inputVo) throws JAXBException, IOException, SOAPException {
		return availRepository.getFlexPricerAvailability(inputVo);
	}

	public FareCalendarVO getCalendarFareAvail(BookingCriteriaVO inputVo) throws JAXBException, IOException, SOAPException {

		FlexPricerInputVO flexPricerInputVo = availHelper.availBookingCriteria2FlexPricerInput(inputVo);	// UI의 조건을 Avail 조회 vo로 변환한다.

		FlexPricerCalendarOutputVO flexPricerCalendarOutputVo = availRepository.getFlexPricerCalendarAvailability(flexPricerInputVo);	// 1a로 부터 fare calendar의 raw 데이터를 가져온다.

		FareCalendarVO fareCalendarVo = availHelper.organizeMatrixFareCalendar(flexPricerCalendarOutputVo);	// UI에서 사용할 형태로 Model을 구성한다.

		return adjustFareCalendar(fareCalendarVo);	// UI에서 사용할 FareCalendar 데이터의 보정 작업.
	}

	private FareCalendarVO adjustFareCalendar(FareCalendarVO fareCalendarVo) {
		// DB 조회를 통한 FF , CFF 정보 채우기
		// 기타 비지니스 로직 포함.
		return fareCalendarVo;
	}

	/**
	 * <pre>
	 * Revenue의 UPSELL을 구성한다.
	 * </pre>
	 *
	 * @param inputVo
	 * @return
	 * @throws ParseException
	 */
	public RevUpsellAvailMsVO getAvailFlightOfRevenue(RevAvailCriteriaMsVO inputVo) throws ParseException {
		AirOfferInputVO  airOfferInput = availHelper.bookingCriteria2AirOfferInput(inputVo);	// 조회조건을 AirOffer input 형태로 변경
		AirCalendarInputVO airCalendarInput = availHelper.bookingCriteria2AirCalendarInput(inputVo);	// 조회조건을 airCalendar 의 input 형태로 변경

		AirOffersListReply airOfferList = airOfferRepository.getAirOfferList(airOfferInput);	// airOffer의 조회
		AirCalendarOutputVO airCalendarOutput = airCalendarRepository.getAirCalendar(airCalendarInput);	// airCalendar의 조회

		RevUpsellAvailMsVO upsellBoundAvail = availHelper.organizeAvailFlight(inputVo, airOfferList, airCalendarOutput);	// airOfferReply와 airCalendar의 결과를 이용하여 upsell 형태를 구성한다.

		return upsellBoundAvail;
	}
}
