package com.koreanair.ms_ibe.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.koreanair.external.dx.vo.AirOffersListReply;
import com.koreanair.ms_ibe.service.AirOfferService;
import com.koreanair.ms_ibe.service.vo.availability.RevAvailCriteriaMsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/airOffer")
@Api(value = "airoffer", description = "DxApi의 AirOffer 호출 처리")
@Slf4j
public class AirOfferController {

    @Autowired
    AirOfferService service;

    @PostMapping(value = "/getAirOfferList" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "airOffer List 조회", notes = "airOffer List 조회" )
    @ResponseBody
    public AirOffersListReply getAirOfferList(@RequestBody RevAvailCriteriaMsVO inputVo) throws ParseException {
    	log.debug("getAirOfferList start!");
        return service.getAirOfferList(inputVo);
    }

}