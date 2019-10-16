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
package com.koreanair.common_adapter.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringUtil extends StringUtils {
    public static String getElementNSContents(Object obj) {
        String strReturn = "";

        if(obj instanceof Element) {
        	Element elements = (Element)obj;
        	strReturn = defaultString(elements.getTextContent());
        } else if (obj instanceof String) {
            strReturn = (String) obj;
        }

        return strReturn;
    }

	public static String null2Zero(Object objValue) {
		String str = "0";
		if (objValue == null) {
			str = "0";
		} else if (objValue instanceof Integer) {
			str = objValue + "";
		} else if (objValue instanceof BigDecimal) {
			str = ((BigDecimal) objValue).toString();
		} else if (objValue instanceof BigInteger) {
			str = objValue + "";
		} else if (objValue instanceof String) {
			if (objValue.equals(""))
				str = "0";
			else
				str = objValue + "";
		} else if (objValue instanceof Long) {
			str = objValue + "";
		} else if (objValue instanceof Float) {
			str = objValue + "";
			if (str.indexOf('E') != -1) {
				DecimalFormat formatter = new DecimalFormat("####################.0#####");
				str = formatter.format(objValue) + "";
			}
			if (str.equals(".0")) {
				str = "0";
			}
		}

		return str;
	}
}
