package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PaycoAuthenticationOutput extends PaymentAuthenticationOutput {
    //payco result
    @ApiModelProperty(value = "payco response")
    private String code;
    @ApiModelProperty(value = "payco response")
    private String message;
    @ApiModelProperty(value = "payco output")
    private PaycoResult result;
}
