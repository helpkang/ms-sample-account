package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="chinapaymodel", description="")
public class ChinapayAuthenticationInput extends PaymentAuthenticationInput{

    //카카오페이 인증시 사용하는 변수 서버단에서 채우는 값
    @ApiModelProperty(value = "notifyUrl")
    private String notifyUrl;

    private String tranDate;
    private String tranTime;
}