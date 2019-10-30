package com.koreanair.ms_ibe.service.vo;

import com.koreanair.common_adapter.common.vo.TravellerInformation;
import com.koreanair.external.dx.vo.Itinerary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
@ApiModel(value="", description="")
public class KakaoAuthenticationInput extends PaymentAuthenticationInput{

    //카카오페이 인증시 사용하는 변수 서버단에서 채우는 값
    @ApiModelProperty(value = "카카오페이 가맹점번호")
    private String cid;
    @ApiModelProperty(value = "카카오페이 adminKey")
    private String adminKey;

    @ApiModelProperty(value = "업무코드")
    private String partnerUserId;
}