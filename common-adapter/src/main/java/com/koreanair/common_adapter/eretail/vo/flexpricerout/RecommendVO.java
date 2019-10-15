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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class RecommendVO {
	private String recommendId = "";
	private Map<String, List<RecommendFlightVO>> boundRecommendFlightMap = new LinkedHashMap<>();
	private String commercialFareFamily = "";
	private String fareFamily = "";
	private String fareFamilyHierarchy = "";
	private String currency = "";
	private String displayCurrency = "";
	private List<TravellerTypeFareInfoVO> travellerTypeFareInfoList = new ArrayList<>();
}