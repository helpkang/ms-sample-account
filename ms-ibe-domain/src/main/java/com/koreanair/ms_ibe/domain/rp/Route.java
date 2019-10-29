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
package com.koreanair.ms_ibe.domain.rp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.koreanair.common.ddd.DomainType;
import com.koreanair.common.ddd.DomainType.Domain;
import lombok.Data;

@Data
@DomainType(Domain.Entity)
@Component
public class Route {

	private String domIntType = "";

	private List<Segment> segmentList = new ArrayList<>();

	public void getDomIntType(List<Segment> segmentList) {
		domIntType = "";
	}
}
