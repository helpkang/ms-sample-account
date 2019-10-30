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
@ApiModel(description = "Revenue availability upsell model")
@Data
public class RevUpsellAvailMsVO {

	@ApiModelProperty(required = true, value="", notes = "currency of upsell", example = "", dataType = "String")
	private String currency = "";

	@ApiModelProperty(required = true, value="Revenue upsell", notes = "Revenue upsell", example = "", dataType = "List")
	private List<UpsellBoundAvailVO> upsellBoundAvailList = new ArrayList<>();
}
