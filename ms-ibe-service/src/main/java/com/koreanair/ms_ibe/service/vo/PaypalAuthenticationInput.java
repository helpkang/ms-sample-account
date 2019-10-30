package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="paypalauthmodel", description="")
public class PaypalAuthenticationInput extends PaymentAuthenticationInput{
    //paypal에서 사용하는 변수
    @ApiModelProperty(value = "paypaluserId")
    private String userId;
    @ApiModelProperty(value = "paypalpwd")
    private String pwd;
    @ApiModelProperty(value = "paypalsignature")
    private String signature;
}