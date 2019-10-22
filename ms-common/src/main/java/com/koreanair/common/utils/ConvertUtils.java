package com.koreanair.common.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;


public class ConvertUtils {

    public static String objectToJson(Object o) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson = null;
        try {
            requestJson = ow.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return requestJson;
    }
    public static <T> T jsonToObject(String jstring,  Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        T requestJson = null;
            try {
                requestJson = mapper.readValue(jstring, clazz);
            } catch (IOException e) {
                e.printStackTrace();
            }
        return requestJson;
    }

    // public static void main(String[] args) {
    //     Map map = jsonToObject("{\"name\":\"Bob\", \"age\":13}", Map.class);
    //     System.out.println(map);
    // }
}