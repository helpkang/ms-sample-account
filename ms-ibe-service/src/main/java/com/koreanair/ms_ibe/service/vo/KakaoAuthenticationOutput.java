package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class KakaoAuthenticationOutput extends PaymentAuthenticationOutput {
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
}
