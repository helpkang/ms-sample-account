package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TossAuthenticationOutput extends PaymentAuthenticationOutput {
    //toss result
    @ApiModelProperty(value = "toss resultCode")
    private String status;
    @ApiModelProperty(value = "paypal token")
    private String payToken;
    @ApiModelProperty(value = "paypal 인증창 url")
    private String checkoutPage;
    @ApiModelProperty(value = "paypal 인증창 app schema")
    private String checkoutAppScheme;

}
