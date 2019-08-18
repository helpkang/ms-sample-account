package com.koreanair.ms_sample_account;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

// @TestConfiguration
public class TestConfig {
    // @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate() {
            @Override
            public <T> T getForObject(String url, Class<T> responseType, Object... uriVariables) throws RestClientException {
                System.out.println("Good");
                if (responseType == String.class) {
                    return (T) "Good";
                } else {
                    throw new IllegalArgumentException();
                }
            }
        };
    }
}