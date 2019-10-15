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
package com.koreanair.common_adapter.eretail.vo.flexpricerout;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class FareMatrixCalendarVO {
	private String departureDate = "";
	private String returnDate = "";
	private String corporateNumber = ""; // 적용된 corporate number
	private String designator = "";
	private String availSeat = "";
	private String availFlight = "";
	private String currency = "";
	private boolean highSeason = false; // 성수기 여부
	private String commercialFareFamilyType = "";
	private String fareFamilyType = "";
	private boolean applyOnlineCoupon = false; // 할인 쿠폰 적용여부.

	private List<TravellerTypeFareInfoVO> travellerTypeFareInfoList = new ArrayList<>();
}
