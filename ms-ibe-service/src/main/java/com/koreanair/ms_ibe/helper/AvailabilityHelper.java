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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.koreanair.common_adapter.eretail.vo.FlexPricerInputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FareMatrixCalendarVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.FlexPricerCalendarOutputVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.TaxInfoVO;
import com.koreanair.common_adapter.eretail.vo.flexpricerout.TravellerTypeFareInfoVO;
import com.koreanair.common_adapter.general.vo.consts.PAXType;
import com.koreanair.common_adapter.utils.ObjectSerializeUtil;
import com.koreanair.common_adapter.utils.StringUtil;
import com.koreanair.ms_ibe.service.vo.FareCalendarElementVO;
import com.koreanair.ms_ibe.service.vo.FareCalendarVO;
import com.koreanair.ms_ibe.service.vo.availability.AvailSearchCriteriaVO;

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
	public FlexPricerInputVO availSearchCriteria2FlexPricerInput(AvailSearchCriteriaVO inputVo) {
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


}
