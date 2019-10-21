package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PaymentAuthenticationOutput {
    //kakaopay
    @ApiModelProperty(value = "kakaopay 에서 발급한 tid")
    private String tid;
    @ApiModelProperty(value = "kakaopay result")
    private String tms_result;
    @ApiModelProperty(value = "kakaopay result")
    private String next_redirect_app_url;
    @ApiModelProperty(value = "kakaopay result")
    private String next_redirect_mobile_url;
    @ApiModelProperty(value = "kakaopay result")
    private String android_app_scheme;
    @ApiModelProperty(value = "kakaopay result")
    private String ios_app_scheme;
    @ApiModelProperty(value = "kakaopay result")
    private String created_at;
    @ApiModelProperty(value = "간편결제 거래번호")
    private String orderNo;
    //payco
    @ApiModelProperty(value = "payco output")
    private PaycoResult result;

    //paypal
    @ApiModelProperty(value = "paypal resultCode")
    private String resultCode;
    @ApiModelProperty(value = "paypal orderKey(KE거래번호)")
    private String orderKey;
    @ApiModelProperty(value = "paypal token")
    private String token;
    @ApiModelProperty(value = "paypal 인증창 url")
    private String url;


}