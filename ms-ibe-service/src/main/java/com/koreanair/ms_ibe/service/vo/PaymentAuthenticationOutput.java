package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PaymentAuthenticationOutput {

    @ApiModelProperty(value = "")
    private String orderNo;
    //kakaopay result
    @ApiModelProperty(value = "")
    private String tid;

}