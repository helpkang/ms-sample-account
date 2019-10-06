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
package com.koreanair.common_adapter.eretail.connector;

import java.util.Map;

import javax.xml.soap.SOAPException;

/**
 * <pre>
 * Created by bdlee on 2019. 10. 3.
 * </pre>
 *
 * @author bdlee
 *
 * @version 1.0.0
 * @since 2019. 10. 3.
 */
public interface ERetailConnector {

	public Map<String, String> getResponseCookieMap();
	public void setResponseCookieMap(Map<String, String> responseCookieMap);

	public Object sendAndReceive(Object obj, Class<?> responseClass) throws SOAPException;

	public String getJsessionId();
	public void setJsessionId(String jsessionId);
}
