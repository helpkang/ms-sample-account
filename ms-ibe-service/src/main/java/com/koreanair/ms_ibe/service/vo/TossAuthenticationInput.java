package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="tossauthmodel", description="")
public class TossAuthenticationInput extends PaymentAuthenticationInput{
    //토스에서 사용하는 변수
    @ApiModelProperty(value = "tossapiKey")
    private String apikey;

}