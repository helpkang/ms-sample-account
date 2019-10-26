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
package com.koreanair.ms_ibe.service.vo.availability;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PassengerConditionVO implements Serializable {

	private static final long serialVersionUID = -3895672974421613114L;

	private String passengerNo = "";
	private String passengerType = ""; // ADT, CHD, INF
	private String passengerTypeDesc = "";
	private String title = "";
	private String gender = "";
	private String lastName = "";
	private String firstName = "";
	private String koreanFirstName = "";
	private String koreanLastName = "";
	private String birthDate = "";
	private String carrierCode = "";
	private String ffpNo = "";
	private PTCDiscountInfoVO defaultPTCDiscountInfo = new PTCDiscountInfoVO();
	private List<SegmentPTCDiscountInfoVO> segmentPTCDiscountList = new ArrayList<>();
	private String infantPassengerNo = "";
	private boolean hasInfant = false;
	private boolean primaryPassenger = false;
	private boolean savePassenger = false;

}
