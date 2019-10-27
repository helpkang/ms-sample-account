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
package com.koreanair.common_adapter.dx.airopper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.koreanair.common.exception.GenericException;
import com.koreanair.common.exception.GenericException.ExceptionCode;
import com.koreanair.common.utils.ObjectSerializeUtil;
import com.koreanair.common_adapter.dx.vo.AirCalendarInputVO;
import com.koreanair.common_adapter.general.vo.consts.DXHeaders;
import com.koreanair.common_adapter.general.vo.consts.PAXType;
import com.koreanair.common_adapter.utils.RestfulInterceptor;
import com.koreanair.external.dx.vo.AirCalendarReply;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class AirCalendarAdapter {

	private static RestTemplate restTemplate = new RestTemplate();

	/**
	 * <pre>
	 * airOffer List를 가져온다.
	 * Created by bdlee on 2019. 9. 27.
	 * </pre>
	 *
	 * @param inputVo
	 * @return
	 */
	public AirCalendarReply getAirCalendar(AirCalendarInputVO inputVo) {

		if (StringUtils.isBlank(inputVo.getDepartureDateTime())) {
			throw new GenericException(ExceptionCode.BAD_REQUEST, "출발일시는 필수 사항입니다.");
		}
		if (StringUtils.isBlank(inputVo.getOriginLocationCode())) {
			throw new GenericException(ExceptionCode.BAD_REQUEST, "출발공항은 필수 사항입니다.");
		}
		if (StringUtils.isBlank(inputVo.getDestinationLocationCode())) {
			throw new GenericException(ExceptionCode.BAD_REQUEST, "도착공항은 필수 사항입니다.");
		}
		if (ObjectUtils.isEmpty(inputVo.getCommercialFareFamilies())) {
			throw new GenericException(ExceptionCode.BAD_REQUEST, "CFF는 한개 이상 입력되어야 합니다.");
		}

		// Get Parameter로 전달될 항목들
		MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
		multiValueMap.add("departureDateTime", inputVo.getDepartureDateTime());
		multiValueMap.add("originLocationCode", inputVo.getOriginLocationCode());
		multiValueMap.add("destinationLocationCode", inputVo.getDestinationLocationCode());
		multiValueMap.add("commercialFareFamilies", StringUtils.join(inputVo.getCommercialFareFamilies(),","));
		multiValueMap.add("returnDateTime", inputVo.getReturnDateTime());

		List<String> travelerList = new ArrayList<>();
		if (inputVo.getAdult() > 0) {
			travelerList.add(inputVo.getAdult() + PAXType.ADT);
		}
		if (inputVo.getChild() > 0) {
			travelerList.add(inputVo.getAdult() + PAXType.CHD);
		}
		if (inputVo.getInfant() > 0) {
			travelerList.add(inputVo.getAdult() + PAXType.INF);
		}
		multiValueMap.add("travelers", StringUtils.join(travelerList, ","));
		if(inputVo.getMax() > 0) {
			multiValueMap.add("max", String.valueOf(inputVo.getMax()));
		}
		if(inputVo.getMaxPrice() > 0) {
			multiValueMap.add("maxPrice", String.valueOf(inputVo.getMaxPrice()));
		}
		if(inputVo.getDepartureTimeWindow() > 0) {
			multiValueMap.add("departureTimeWindow", String.valueOf(inputVo.getDepartureTimeWindow()));
		}
		if(inputVo.getReturnTimeWindow() > 0) {
			multiValueMap.add("returnTimeWindow", String.valueOf(inputVo.getReturnTimeWindow()));
		}
		if(StringUtils.isNotBlank(inputVo.getAlternateOriginLocationCode())) {
			multiValueMap.add("alternateOriginLocationCode", inputVo.getAlternateOriginLocationCode());
		}
		if(StringUtils.isNotBlank(inputVo.getAlternateOriginLocationCode())) {
			multiValueMap.add("alternateDestinationLocationCode", inputVo.getAlternateDestinationLocationCode());
		}
		if(StringUtils.isNotBlank(inputVo.getAlternateOriginLocationCode())) {
			multiValueMap.add("corporateCodes", String.valueOf(inputVo.getCorporateCodes()));
		}
		multiValueMap.add("directFlights", String.valueOf(inputVo.isDirectFlights()));
		if(StringUtils.isNotBlank(inputVo.getPromotionCode())) {
			multiValueMap.add("promotionCode", inputVo.getPromotionCode());
		}
		if(StringUtils.isNotBlank(inputVo.getPromotionAirlineCode())) {
			multiValueMap.add("promotionAirlineCode", inputVo.getPromotionAirlineCode());
		}
		multiValueMap.add("showSoldOut", String.valueOf(inputVo.isShowSoldOut()));
		if(StringUtils.isNotBlank(inputVo.getLang())) {
			multiValueMap.add("lang", inputVo.getLang());
		}
		multiValueMap.add("flexibility", String.valueOf(inputVo.getFlexibility()));

		// Get URL 구성
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://proxy.digitalforairlines.com/v2/search/air-calendars");
		builder.queryParams(multiValueMap);
		String endPoint = builder.build().toUriString();
		log.debug("endPoint = {}", endPoint);

		// http header에 인증값
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", DXHeaders.Authorization);
		headers.set("Content-Type", "application/json");

		HttpEntity<?> entity = new HttpEntity<>(headers);
		restTemplate.setInterceptors(Collections.singletonList(new RestfulInterceptor()));

		// Rest 를 Get으로 호출하여 AirOfferList를 가져온다.
		ResponseEntity<AirCalendarReply> responseEntity = restTemplate.exchange(builder.build().toUri(), HttpMethod.GET, entity, AirCalendarReply.class);
		log.debug("{}", ObjectSerializeUtil.getObjectToJson(responseEntity));
		AirCalendarReply airCalendarList = responseEntity.getBody();
		log.debug("{}", ObjectSerializeUtil.getObjectToJson(airCalendarList));

		return airCalendarList;
	}

	public static void main(String[] args) {

		AirCalendarInputVO inputVo = new AirCalendarInputVO();
		inputVo.setDepartureDateTime("2020-02-14");
		inputVo.setReturnDateTime("2020-03-05");
		inputVo.setOriginLocationCode("ICN");
		inputVo.setDestinationLocationCode("DXB");
		inputVo.setCommercialFareFamilies(Arrays.asList("ECONOMY0", "PRESTIGE0", "FIRST0"));
		inputVo.setAdult(2);
		inputVo.setChild(2);
		inputVo.setDirectFlights(false);
		inputVo.setShowSoldOut(false);
		inputVo.setFlexibility(3);

		AirCalendarAdapter adapter = new AirCalendarAdapter();
		adapter.getAirCalendar(inputVo);
	}
}
