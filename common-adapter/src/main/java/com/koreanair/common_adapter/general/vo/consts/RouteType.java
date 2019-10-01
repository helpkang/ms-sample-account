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

/**
 * <pre>
 * 국내,국제 구분
 * </pre>
 * @author bdlee
 * @version 1.0.0
 */
public class RouteType {

	private  RouteType() {
		throw new IllegalStateException("Consts class");
	}

	public static final String DOMESTIC = "D";
	public static final String INTERNATIONAL = "I";
}
