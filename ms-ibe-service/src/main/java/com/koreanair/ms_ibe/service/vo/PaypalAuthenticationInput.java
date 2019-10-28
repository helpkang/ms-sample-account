package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="결제 인증 요청", description="결제 인증 요청시 사용되는 클래스")
public class PaypalAuthenticationInput extends PaymentAuthenticationInput{
    //paypal에서 사용하는 변수
    @ApiModelProperty(value = "paypal userId")
    private String userId;
    @ApiModelProperty(value = "paypal pwd")
    private String pwd;
    @ApiModelProperty(value = "paypal signature")
    private String signature;
}