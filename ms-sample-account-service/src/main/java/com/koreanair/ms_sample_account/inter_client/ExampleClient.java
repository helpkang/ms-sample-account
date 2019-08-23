package com.koreanair.ms_sample_account.inter_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "example", url = "${inter.test}")
public interface ExampleClient {
 
    @GetMapping("/{method}")
    String status(@PathVariable("method") String method);
}