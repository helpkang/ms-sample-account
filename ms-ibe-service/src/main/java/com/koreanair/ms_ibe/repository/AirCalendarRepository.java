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
package com.koreanair.ms_ibe.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koreanair.common_adapter.dx.airopper.AirCalendarAdapter;
import com.koreanair.common_adapter.dx.vo.AirCalendarInputVO;
import com.koreanair.external.dx.vo.AirCalendarReply;

@Repository
public class AirCalendarRepository {

	@Autowired
	private AirCalendarAdapter airCalendar;

	public AirCalendarReply getAirCalendar(AirCalendarInputVO inputVo) {
		return airCalendar.getAirCalendar(inputVo);
	}

}
