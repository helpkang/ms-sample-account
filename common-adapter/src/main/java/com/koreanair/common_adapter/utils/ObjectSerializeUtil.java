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
package com.koreanair.common_adapter.utils;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObjectSerializeUtil {

	private static final ObjectMapper jacksonMapper = new ObjectMapper();

	public ObjectSerializeUtil() {
	}

    public static ObjectMapper getJacksonmapper() {
        return jacksonMapper;
    }

	/**
	 * <pre>
	 * object를 json 문자열로 변경
	 * </pre>
	 * @param obj
	 * @return
	 */
	public static String getObjectToJson(Object obj) {
		String result = "";
		if (obj == null) {
			return "";
		}

		try {
			jacksonMapper.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE);
			jacksonMapper.setSerializationInclusion(Include.NON_NULL);
			result = jacksonMapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			log.error("", e);
		}
		return result;
	}

	public static Object convertJsonToObject(String str, Class clazz) throws JsonParseException, JsonMappingException, IOException {
	    Object obj= jacksonMapper.readValue(str, clazz);
	    return obj;
	}
}
