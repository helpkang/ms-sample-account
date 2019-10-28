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
package com.koreanair.common_adapter.dx.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class AirMatrixCalendarVO {
	private String departureDate = "";
	private String returnDate = "";
	private String currency = "";
	private String commercialFareFamilyType = "";
	private String fareFamilyType = "";
	private String fareClass = "";
	private boolean emptyFare = false;
	private List<CalendarBoundVO> calendarBoundList = new ArrayList<>();
}
