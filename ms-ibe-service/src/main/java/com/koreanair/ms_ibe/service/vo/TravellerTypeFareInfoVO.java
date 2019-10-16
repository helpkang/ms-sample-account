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
package com.koreanair.ms_ibe.service.vo;

import lombok.Data;

@Data
public class TravellerTypeFareInfoVO {
	private String travellerType = "";	// ADT , CHD, INF
	private String travellerTypeDesc = "";	// ADT , CHD, INF
	private int travellerTypeCount = 0;
	private String totalAmount = "0";
	private String amount = "0";
	private String tax = "0";
	private String fuelCharge = "0";
	private String mileage = "";
}
