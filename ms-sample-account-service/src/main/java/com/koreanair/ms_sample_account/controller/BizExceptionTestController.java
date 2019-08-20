package com.koreanair.ms_sample_account.controller;

import java.util.AbstractMap;

import com.koreanair.exception.InValidBizException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/inter/bizexception")
@Api(value = "status", description = "status test")
public class BizExceptionTestController {

    @GetMapping(value = "/my/{status}")
    @ApiOperation(value = "get",
    notes = "코드명만 있으면 명칭 조회"
    )
    public AbstractMap.SimpleEntry<String, String> get(@PathVariable HttpStatus status) {
        AbstractMap.SimpleEntry<String, String> code = new AbstractMap.SimpleEntry<>("name", "test");
        int a = 1+1;
        if(a==2) throw new InValidBizException("code", "invalid parameter");
		return code;
    }

    @PutMapping(value = "/testput")
    @ApiOperation(value = "test put",
    notes = "코드명만 있으면 명칭 조회"
    )
    @ResponseStatus(HttpStatus.OK)
    public AbstractMap.SimpleEntry<String, String> put() {
        AbstractMap.SimpleEntry<String, String> code = new AbstractMap.SimpleEntry<>("name", "test");
		return code;
    }


    @DeleteMapping(value = "/testput")
    @ApiOperation(value = "test delete",
    notes = "코드명만 있으면 명칭 조회"
    )
    public AbstractMap.SimpleEntry<String, String> delete() {
        AbstractMap.SimpleEntry<String, String> code = new AbstractMap.SimpleEntry<>("name", "test");
		return code;
    }



    
}



