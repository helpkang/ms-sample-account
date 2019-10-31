/*
 * Copyright 2011-2017 AsianaIDT Inc.
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
package com.koreanair.ms_ibe.filters;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * 사용자의 HTTP 요청 및 응답결과 추적 VO.
 * Created by bdlee on 2019. 10. 31.
 * </pre>
 * @author bdlee
 * @version 1.0.0
 * @since 2019. 10. 31.
 */
@Slf4j
@Data
public class HttpLog {

	// 요청정보 : URI, Request-Method, Content-Type, Request-Body
	private Integer seq;
	private String requestUri;
	private String requestContentType;
	private String requestMethod;
	private String requestMapping;
	private String requestBody;

	// 응답정보 : Status-Code, Content-Type, Response-Body
	private String responseStatus;
	private String responseContentType;
	private String responseBody;

	// 요청자정보 : 사용자ID, 사용자명, 역할, 접근 IP
	private String userId;
	private String userName;
	private String userRoles;
	private String userIp;

	// 수행정보 : 수행시간
	private double elapsedTime;

	public HttpLog() {
		log.debug("HttpLog constuct");
	}


}
