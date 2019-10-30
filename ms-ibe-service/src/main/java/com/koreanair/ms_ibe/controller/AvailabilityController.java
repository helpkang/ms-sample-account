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
package com.koreanair.ms_ibe.controller;

import java.io.IOException;
import java.text.ParseException;

import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.koreanair.common_adapter.eretail.vo.FlexPricerInputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlexPricerOutputVO;
//import com.koreanair.external.dx.vo.AirOffersListReply;
//import com.koreanair.ms_ibe.service.AirOfferService;
import com.koreanair.ms_ibe.service.AvailabilityService;
import com.koreanair.ms_ibe.service.vo.FareCalendarVO;
import com.koreanair.ms_ibe.service.vo.availability.BookingCriteriaVO;
import com.koreanair.ms_ibe.service.vo.availability.RevAvailCriteriaMsVO;
import com.koreanair.ms_ibe.service.vo.availability.RevUpsellAvailMsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/avail")
@Api(tags = { "Availability" }) // SwaggerConfig에 지정된 tag에 의해 설명이 구성된다.
@Slf4j
public class AvailabilityController {

	@Autowired
	private AvailabilityService availService;

	@PostMapping(value = "/CalendarFare", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Fare Calendar 조회", notes = "eRetail FlexPricer를 이용하여 Fare Calendar 조회")
	@ResponseBody
	public FareCalendarVO getCalendarFareAvail(@RequestBody RevAvailCriteriaMsVO availCriteria) throws JAXBException, IOException, SOAPException {
		log.debug("getCalendarFareAvail start");
		return availService.getCalendarFareAvail(availCriteria);
	}

	@PostMapping(value = "/AvailFlight", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "예약가능한 항공편 조회", notes = "DxAPI airOffer , airCalendar를 이용하여 upsell 구성", nickname = "")
	@ResponseBody
	public RevUpsellAvailMsVO getAvailFlightOfRevenue(@RequestBody RevAvailCriteriaMsVO availCriteria) throws ParseException {
		log.debug("getAvailFlightOfRevenue start!");
		return availService.getAvailFlightOfRevenue(availCriteria);
	}

//	@Autowired
//	private AirOfferService airOfferService;

/*
	@PostMapping(value = "/DomesticAvailForRevenue", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Revenue 국내선 항공편 조회", notes = "Revenue 국내선 항공편 조회")
	@ResponseBody
	public FlexPricerOutputVO getDomesticAvailForRevenue(@RequestBody FlexPricerInputVO inputVo) throws JAXBException, IOException, SOAPException {
		log.debug("getDomesticAvailForRevenue start");
		return availService.getDomesticAvailForRevenue(inputVo);
	}
*/

	/*
	@PostMapping(value = "/AirOfferList", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "airOffer List 조회", notes = "airOffer List 조회")
	@ResponseBody
	public AirOffersListReply getAirOfferList(@RequestBody RevAvailCriteriaMsVO inputVo) throws ParseException {
		log.debug("getAirOfferList start!");
		return airOfferService.getAirOfferList(inputVo);
	}
	*/

}
