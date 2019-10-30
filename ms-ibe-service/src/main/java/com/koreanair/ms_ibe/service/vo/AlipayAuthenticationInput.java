package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="alipaymodel", description="")
public class AlipayAuthenticationInput extends PaymentAuthenticationInput{

    //카카오페이 인증시 사용하는 변수 서버단에서 채우는 값
    @ApiModelProperty(value = "notifyUrl")
    private String notifyUrl;

}