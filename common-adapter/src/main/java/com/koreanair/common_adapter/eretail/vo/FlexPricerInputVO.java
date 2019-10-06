/*
 * Copyright 2011-2019 KoreanAir
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
package com.koreanair.common_adapter.eretail.vo;

import java.util.ArrayList;
import java.util.List;

import com.koreanair.common_adapter.general.vo.consts.TripType;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * <pre>
 * Created by bdlee on 2019. 9. 30.
 * </pre>
 *
 * @author bdlee
 *
 * @version 1.0.0
 * @since 2019. 9. 30.
 */
@Data
@ApiModel(description = "FlexPrice를 이용하여 항공편 List를 조회할때 사용하는 모델")
public class FlexPricerInputVO {
	private String bizType = "";
	private TripType tripType;
	private List<String> cffCodeList = new ArrayList<>();
	private List<SegmentInfoVO> segmentInfoList = new ArrayList<>();
	private List<PassengerConditionVO> passengerConditionList = new ArrayList<>();
	private int dateRange = 0;
	private String corporatedId = "";
}
