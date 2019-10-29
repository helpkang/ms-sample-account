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
	@ApiModelProperty(required = true, value="Commercial Fare Family List", notes = "1개 이상", example = "ECONOMY0, PRESTIGE0, FIRST0" , dataType = "List")	// 노선과 office id를 이용하여 찾아야 한다.
	private List<String> cffCodeList = new ArrayList<>();

	@ApiModelProperty(required = true, value="Trip Type", notes = "RT : Round Trip, OW: Oneway trip", example = "RT")
	private TripType tripType;

	@ApiModelProperty(required = false, value="Adult passenger type count", notes = "", example = "1")
	private int adult = 0;
	@ApiModelProperty(required = false, value="Child passenger type count", notes = "", example = "0")
	private int child = 0;
	@ApiModelProperty(required = false, value="Infant passenger type count", notes = "", example = "0")
	private int infant = 0;

	@ApiModelProperty(required = false, value="Revenue availability segment criteria", notes = "여행 일정 조건", example = "", dataType = "List")
	private List<RevAvailSegmentCriteriaMsVO> segmentList = new ArrayList<>();
}
