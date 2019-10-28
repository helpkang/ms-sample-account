package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="결제 인증 요청", description="결제 인증 요청시 사용되는 클래스")
public class PaycoAuthenticationInput extends PaymentAuthenticationInput{
    //페이코에서 인증시 사용하는 변수 서버단에서 채우는 값
    @ApiModelProperty(value = "payco 가맹점번호")
    private String sellerKey;            //가맹점번호
    @ApiModelProperty(value = "payco cpId")
    private String cpId;                 //필수값
    @ApiModelProperty(value = "payco productId")
    private String productId;            //필수값

    @ApiModelProperty(value = "payco paymode")
    private String payMode;
    @ApiModelProperty(value = "payco (EASYPAY(비회원) or EASYPAY_F(회원))")
    private String orderMethod;
    @ApiModelProperty(value = "payco inApp결제여부")
    private String inAppYn;
    @ApiModelProperty(value = "payco app callbackurl")
    private String appUrl;
    @ApiModelProperty(value = "payco mobileCallbackurl")
    private String cancelMobileUrl;
    @ApiModelProperty(value = "payco languagecode 2자리", notes="ex) EN, KR")
    private String language;
    @ApiModelProperty(value = "payco 무통장입금완료통보 url ")
    private String nonBankbookDepositInformUrl;
    @ApiModelProperty(value = "payco orderchannal(PC or MOBILE)")
    private String orderChannel;
}