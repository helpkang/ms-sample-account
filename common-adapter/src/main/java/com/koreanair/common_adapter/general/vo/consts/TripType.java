/*
 * Copyright 2011-2019 AsianaIDT Inc.
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
package com.koreanair.common_adapter.general.vo.consts;

public enum TripType {
	RT("R"), OW("O"), OJ("M"), MT("M");

	private final String value;

	TripType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static TripType fromValue(String v) {
		for (TripType c : TripType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
