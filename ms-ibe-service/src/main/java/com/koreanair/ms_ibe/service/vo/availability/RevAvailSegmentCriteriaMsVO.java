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

@ApiModel(description = "Revenue availability segment criteria model")
@Data
public class RevAvailSegmentCriteriaMsVO {

	@ApiModelProperty(required = true, value="departure date", notes = "yyyyMMdd", example = "20191115")
	private String departureDate = "";

	@ApiModelProperty(required = true, value="arrival date", notes = "yyyyMMdd", example = "20191118")
	private String arrivalDate = "";

	@ApiModelProperty(required = true, value="departure airport", notes = "IATA 3 Letter code", example = "ICN")
	private String departureAirport = "";

	@ApiModelProperty(required = true, value="arrival airport", notes = "IATA 3 Letter code", example = "NRT")
	private String arrivalAirport = "";
}
