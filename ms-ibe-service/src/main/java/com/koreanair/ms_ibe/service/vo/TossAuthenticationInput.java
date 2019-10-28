package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="결제 인증 요청", description="결제 인증 요청시 사용되는 클래스")
public class TossAuthenticationInput extends PaymentAuthenticationInput{
    //토스에서 사용하는 변수
    @ApiModelProperty(value = "toss apiKey")
    private String apikey;

}