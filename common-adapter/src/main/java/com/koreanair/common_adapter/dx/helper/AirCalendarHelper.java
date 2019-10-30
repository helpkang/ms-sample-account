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
package com.koreanair.common_adapter.dx.helper;

import java.util.HashMap;
import java.util.Map;

import com.koreanair.common.utils.DateUtil;
import com.koreanair.common_adapter.dx.vo.AirCalendarOutputVO;
import com.koreanair.common_adapter.dx.vo.AirMatrixCalendarVO;
import com.koreanair.common_adapter.dx.vo.CalendarBoundVO;
import com.koreanair.external.dx.vo.AirCalendar;
import com.koreanair.external.dx.vo.AirCalendarReply;
import com.koreanair.external.dx.vo.BoundCommon;
import com.koreanair.external.dx.vo.FareFamilyWithServicesDictionaryItem;
import com.koreanair.external.dx.vo.FareInfo;
import com.koreanair.external.dx.vo.Price;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AirCalendarHelper {

	/**
	 * <pre>
	 * AirCalendarReply 를 AirCalendarOutput 로 변환 , 데이터 정규화
	 * </pre>
	 *
	 * @param airCalendarReply
	 */
	public AirCalendarOutputVO convertAirCalendarReply2AirCalendarOutput(AirCalendarReply airCalendarReply) {
		log.debug("convertAirCalendarReply2AirCalendarOutput start!");
		AirCalendarOutputVO output = new AirCalendarOutputVO();

		Map<String, String> cffMap = new HashMap<>();
		Map<String, FareFamilyWithServicesDictionaryItem> ffMap = airCalendarReply.getDictionaries().getFareFamilyWithServices();
		for (Map.Entry<String, FareFamilyWithServicesDictionaryItem> entry : ffMap.entrySet()) {
			cffMap.put(entry.getKey(), entry.getValue().getCommercialFareFamily());
		}


		for (AirCalendar airCalendar : airCalendarReply.getData()) {
			AirMatrixCalendarVO airMatrixCalendar = new AirMatrixCalendarVO();
			airMatrixCalendar.setDepartureDate(DateUtil.getStringDate(airCalendar.getDepartureDate()));
			airMatrixCalendar.setReturnDate(airCalendar.getReturnDate() != null ? DateUtil.getStringDate(airCalendar.getReturnDate()) : null);
			airMatrixCalendar.setFareFamilyType(airCalendar.getFareFamilyCode());
			airMatrixCalendar.setCommercialFareFamilyType(cffMap.get(airCalendar.getFareFamilyCode()));

			for (FareInfo fareInfo : airCalendar.getFareInfos()) {
				airMatrixCalendar.setFareClass(fareInfo.getFareClass());
			}

			int boundIdx = 1;
			for(BoundCommon bound : airCalendar.getBounds()) {
				CalendarBoundVO calendarBound = new CalendarBoundVO();
				calendarBound.setBoundId(String.valueOf(boundIdx));
				calendarBound.setDepartureAirport(bound.getOriginLocationCode());
				calendarBound.setArrivalAirport(bound.getDestinationLocationCode());
				calendarBound.setFareFamilyType(bound.getFareFamilyCode());

				for(Price price : bound.getPrices().getTotalPrices()) {
					calendarBound.setBase(String.valueOf(price.getBase()));
					calendarBound.setTotal(String.valueOf(price.getTotal()));
					calendarBound.setTotalTax(String.valueOf(price.getTotalTaxes()));
					output.setCurrency(price.getCurrencyCode());
				}
				airMatrixCalendar.getCalendarBoundList().add(calendarBound);
				boundIdx++;
			}

			output.getAirMatrixCalendarList().add(airMatrixCalendar);
		}

		return output;
	}
}
