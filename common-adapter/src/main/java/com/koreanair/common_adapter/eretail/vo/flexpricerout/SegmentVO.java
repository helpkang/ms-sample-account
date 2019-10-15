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

import lombok.Data;

@Data
public class SegmentVO {
	private String segmentId = "";
	private String carrierCode = "";
	private String operationCarrierCode = "";
	private boolean codeshare = false;
	private String flightNo = "";
	private String departureAirport = "";
	private String arrivalAirport = "";
	private String departureCity = "";
	private String arrivalCity = "";
	private String departureDateTime = "";
	private String arrivalDateTime = "";
	private String terminal = "";
	private int numberOfStop = 0;
	private String aircraftType = "";
	private String aircraftDesc = "";
	private String flyingTime = "";
}