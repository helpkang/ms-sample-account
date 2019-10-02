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
package com.koreanair.common_adapter.eretail.vo;

import lombok.Data;

@Data
public class SegmentInfoVO {

	private String departureArea = "";
	private String departureCountry = "";
	private String departureCity = "";
	private String departureCityName = "";
	private String departureAirport = "";
	private String departureAirportName = "";
	private String arrivalArea = "";
	private String arrivalCountry = "";
	private String arrivalCity = "";
	private String arrivalCityName = "";
	private String arrivalAirport = "";
	private String arrivalAirportName = "";
    private String departureDateTime = ""; // yyyyMMddHHmm
    private String arrivalDateTime = "";
    private String cabinClass = "";
    private String cabinClassName = "";
    private String bookingClass = "";
}
