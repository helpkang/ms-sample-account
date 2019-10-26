package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PaymentAuthenticationOutput {

    @ApiModelProperty(value = "간편결제 거래번호")
    private String orderNo;
    //kakaopay result
    @ApiModelProperty(value = "kakaopay 에서 발급한 tid, ui에서 발급한 tid")
    private String tid;






}