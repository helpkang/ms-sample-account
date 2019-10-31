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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "Revenue availability upsell calendar fare model")
@Data
public class UpsellCalendarFareVO {
	@ApiModelProperty(required = true, value="date", notes = "departure date , yyyyMMdd", example = "20191202", position = 1, dataType = "String", allowEmptyValue = false)
	private String date = "";

	@ApiModelProperty(required = true, value="commercial fare family", notes = "commercial fare family", example = "ECONOMY0", position = 2, dataType = "String", allowEmptyValue = false)
	private String commercialFareFamilyType = "";

	@ApiModelProperty(required = false, value="commercial fare family description", notes = "commercial fare family description(name), Cabin 기준의 운임", example = "economy fare", position = 3, dataType = "String", allowEmptyValue = true)
	private String commercialFareFamilyDesc = "";

	@ApiModelProperty(required = true, value="fare family", notes = "fare family<br>RBD 기준의 운임", example = "YHSKW1", position = 4, dataType = "String", allowEmptyValue = false)
	private String fareFamilyType = "";

	@ApiModelProperty(required = false, value="fare family", notes = "fare family description", example = "basic fare", position = 5, dataType = "String", allowEmptyValue = true)
	private String fareFamilyDesc = "";

	@ApiModelProperty(required = false, value="fare class", notes = "fare class", example = "YRT", position = 6, dataType = "String", allowEmptyValue = true)
	private String fareClass = "";

	@ApiModelProperty(required = true, value="base fare", notes = "base fare<br>운임", example = "200000", position = 7, dataType = "String", allowEmptyValue = false)
	private String baseFare = "";

	@ApiModelProperty(required = true, value="base fare", notes = "base fare<br>운임", example = "10000", position = 8, dataType = "String", allowEmptyValue = false)
	private String totalTax = "";

	@ApiModelProperty(required = true, value="total fare", notes = "total fare<br>base fare + total Tax", example = "210000", position = 9, dataType = "String", allowEmptyValue = false)
	private String totalFare = "";

}
