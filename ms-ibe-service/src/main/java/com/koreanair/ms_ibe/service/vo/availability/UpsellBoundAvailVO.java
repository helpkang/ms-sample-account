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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "Revenue availability upsell bound model")
@Data
public class UpsellBoundAvailVO {
	@ApiModelProperty(required = true, value="bound id", notes = "bound index (bound order)", example = "1", dataType = "String")
	private String boundId = "";

	@ApiModelProperty(required = true, value="upsell calendar fare", notes = "upsell calendar fare", example = "", dataType = "List")
	List<UpsellCalendarFareVO> upsellCalendarFareList = new ArrayList<>();

	@ApiModelProperty(required = true, value="avail flights", notes = "avail flights", example = "", dataType = "List")
	List<AvailFlightVO> availFlightList = new ArrayList<>();
}