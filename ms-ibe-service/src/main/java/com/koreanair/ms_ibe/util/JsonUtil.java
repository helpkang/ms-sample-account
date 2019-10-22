package com.koreanair.ms_ibe.util;

import org.springframework.boot.json.JacksonJsonParser;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class JsonUtil {

    public static String mapToString(Map<String, Object> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String key : map.keySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            String value = map.get(key).toString();
            try {
                stringBuilder.append((key != null ? URLEncoder.encode(key, "UTF-8") : ""));
                stringBuilder.append("=");
                stringBuilder.append(value != null ? URLEncoder.encode(value, "UTF-8") : "");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("This method requires UTF-8 encoding support", e);
            }
        }
        return stringBuilder.toString();
    }

    public static Map<String, Object> stringToMap(String resultStr) {
        JacksonJsonParser json = new JacksonJsonParser();
        Map<String, Object>stringObjectMap = json.parseMap(resultStr);
        return stringObjectMap;
    }
}
