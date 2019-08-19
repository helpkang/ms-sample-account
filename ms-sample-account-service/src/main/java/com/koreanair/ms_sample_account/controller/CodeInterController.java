package com.koreanair.ms_sample_account.controller;

import java.util.AbstractMap;

import com.koreanair.ms_sample_account.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/inter/Code")
@Api(value = "code", description = "code search")
public class CodeInterController {

    @Autowired
    AccountService service;

    @GetMapping(value = "/{name}")
    @ApiOperation(value = "코드명으로 코드 조회",
    notes = "코드명만 있으면 명칭 조회"
    )
    @ApiImplicitParams({
        @ApiImplicitParam(name = "name", value = "코드명", required = true, dataType = "string", paramType = "path"),
    })
    public AbstractMap.SimpleEntry<String, String> getAccount(@PathVariable String name) {
        AbstractMap.SimpleEntry<String, String> code = new AbstractMap.SimpleEntry<>(name, "test");
        return code;    
    }

    
}