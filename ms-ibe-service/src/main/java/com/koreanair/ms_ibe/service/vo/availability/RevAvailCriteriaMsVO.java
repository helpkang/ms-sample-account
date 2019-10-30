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
package com.koreanair.ms_ibe.service.vo.availability;

import java.util.ArrayList;
import java.util.List;

import com.koreanair.common_adapter.general.vo.consts.TripType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "Revenue availability flight criteria model")
@Data
public class RevAvailCriteriaMsVO {
	@ApiModelProperty(required = true, value="Commercial Fare Family List", notes = "1개 이상", example = "[\"ECONOMY0\", \"PRESTIGE0\", \"FIRST0\"]" , dataType = "List", position = 0)	// 노선과 office id를 이용하여 찾아야 한다.
	private List<String> cffCodeList = new ArrayList<>();

	@ApiModelProperty(required = true, value="Trip Type", notes = "RT : Round Trip, OW: Oneway trip", example = "RT", position = 1, dataType = "TripType")
	private TripType tripType;

	@ApiModelProperty(required = false, value="Adult passenger type count", notes = "", example = "1", position = 2, dataType = "int")
	private int adult = 0;
	@ApiModelProperty(required = false, value="Child passenger type count", notes = "", example = "0", position = 3, dataType = "int")
	private int child = 0;
	@ApiModelProperty(required = false, value="Infant passenger type count", notes = "", example = "0", position = 4, dataType = "int")
	private int infant = 0;

	@ApiModelProperty(required = false, value="Revenue availability segment criteria", notes = "여행 일정 조건", example = "[{\"departureDate\": 20200214, \"departureAirport\": \"ICN\", \"arrivalAirport\": \"NRT\"},{\"departureDate\": 20200305, \"departureAirport\": \"NRT\", \"arrivalAirport\": \"ICN\"}]", dataType = "List", position = 5)
	private List<RevAvailSegmentCriteriaMsVO> segmentList = new ArrayList<>();
}
