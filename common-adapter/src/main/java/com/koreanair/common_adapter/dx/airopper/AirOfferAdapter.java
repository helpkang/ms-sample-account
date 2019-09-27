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
package com.koreanair.common_adapter.dx.airopper;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.koreanair.common_adapter.dx.vo.AirOfferInputVO;

/**
 * <pre>
 * AirOffer
 * </pre>
 *
 * @author bdlee
 *
 * @version 1.0.0
 * @since 2019. 9. 26.
 */
public class AirOfferAdapter {

	private static RestTemplate restTemplate = new RestTemplate();

	public void getAirOffer(AirOfferInputVO inputVo) {
		//https://proxy.digitalforairlines.com/v2/search/air-offers?
		//departureDateTime={{departureDate}}&originLocationCode={{departureLocation}}&destinationLocationCode={{arrivalLocation}}&commercialFareFamilies={{commercialFareFamilies}}&travelers=2ADT,1CHD&directFlights=false&showSoldOut=false&returnDateTime={{returnDate}}

		// send
		MultiValueMap<String, Object> multiValueMap = new LinkedMultiValueMap<>();
		multiValueMap.add("departureDateTime", inputVo.getDepartureDateTime());
		multiValueMap.add("originLocationCode", inputVo.getOriginLocationCode());
		multiValueMap.add("destinationLocationCode", inputVo.getDestinationLocationCode());
		multiValueMap.add("commercialFareFamilies", StringUtils.join(inputVo.getCommercialFareFamilies(),","));
		multiValueMap.add("returnDateTime", inputVo.getReturnDateTime());
		multiValueMap.add("travelers", StringUtils.join(inputVo.getTravelers(),","));
		multiValueMap.add("max", inputVo.getMax());
		multiValueMap.add("maxPrice", inputVo.getMaxPrice());
		multiValueMap.add("departureTimeWindow", inputVo.getDepartureTimeWindow());
		multiValueMap.add("returnTimeWindow", inputVo.getReturnTimeWindow());
		multiValueMap.add("alternateOriginLocationCode", inputVo.getAlternateOriginLocationCode());
		multiValueMap.add("alternateDestinationLocationCode", inputVo.getAlternateDestinationLocationCode());
		multiValueMap.add("corporateCodes", inputVo.getCorporateCodes());
		multiValueMap.add("directFlights", inputVo.isDirectFlights());
		multiValueMap.add("promotionCode", inputVo.getPromotionCode());
		multiValueMap.add("promotionAirlineCode", inputVo.getPromotionAirlineCode());
		multiValueMap.add("showSoldOut", inputVo.isShowSoldOut());
		multiValueMap.add("lang", inputVo.getLang());

		restTemplate.getForEntity("", String.class, multiValueMap);
	}
}
