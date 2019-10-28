package com.koreanair.ms_ibe.controller;


import com.koreanair.ms_ibe.service.ReservationSearchService;
import com.koreanair.ms_ibe.service.vo.VwReservationOutput;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservation")
@Api(value = "예약조회서비스", tags = "예약조회")
@Slf4j
public class ReservationSearchController {

    @Autowired
    ReservationSearchService service;

    @GetMapping(value = "/{recLoc}")
    @ApiOperation(value = "예약조회",
            notes = "예약정보 조회"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "recLoc", value = "예약번호", required = true, dataType = "string", paramType = "path"),
    })
    public VwReservationOutput getReservation(@PathVariable String recLoc)throws Exception {
        return service.getReservation(recLoc);
    }
}