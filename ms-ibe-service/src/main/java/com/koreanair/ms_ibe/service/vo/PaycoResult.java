package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PaycoResult {
    //payco
    @ApiModelProperty(value = "payco 에서 발급한 거래번호 ")
    private String reserveOrderNo;
    @ApiModelProperty(value = "payco url")
    private String orderSheetUrl;

}