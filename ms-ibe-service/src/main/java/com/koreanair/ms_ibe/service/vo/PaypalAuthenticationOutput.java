package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PaypalAuthenticationOutput extends PaymentAuthenticationOutput {
    //paypal result
    @ApiModelProperty(value = "paypal resultCode")
    private String resultCode;
    @ApiModelProperty(value = "paypal token")
    private String token;
    @ApiModelProperty(value = "paypal 인증창 url")
    private String url;
}
