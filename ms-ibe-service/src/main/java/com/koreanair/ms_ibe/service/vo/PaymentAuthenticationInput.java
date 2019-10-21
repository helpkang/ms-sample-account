package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="이체요청", description="이체요청")
public class PaymentAuthenticationInput {

    //ui에서 받는 값
    @ApiModelProperty(value = "국내선여부")
    private Boolean domestic;
    @ApiModelProperty(value = "무상여부")
    private Boolean award;              //
    @ApiModelProperty(value = "6자리예약번호")
    private String reservationRecLoc;   //6자리예약번호
    @ApiModelProperty(value = "8자리예약번호")
    private String reservationNumber;   //8자리예약번호
    @ApiModelProperty(value = "결제금액")
    private String amount;              //결제금액
    @ApiModelProperty(value = "callbackUrl")
    private String callbackUrl;
    @ApiModelProperty(value = "cancelUrl")
    private String cancelUrl;
    @ApiModelProperty(value = "failUrl")
    private String failUrl;
    @ApiModelProperty(value = "결제통화")
    private String currency;
    @ApiModelProperty(value = "officeId")
    private String officeId;
    @ApiModelProperty(value = "UI에서 발급한 고유값")
    private String tid;
    @ApiModelProperty(value = "할부개월수")
    private String installments;
    @ApiModelProperty(value = "deviceCode PCW, PHW, PHA")
    private String deviceCode;
    //간편결제 공통
    @ApiModelProperty(value = "간편결제 거래번호.")
    private String orderNo;
    
    //카카오페이 인증시 사용하는 변수 서버단에서 채우는 값
    @ApiModelProperty(value = "카카오페이 가맹점번호")
    private String cid;
    @ApiModelProperty(value = "카카오페이 adminKey")
    private String adminKey;


    //페이코에서 인증시 사용하는 변수 서버단에서 채우는 값
    @ApiModelProperty(value = "payco 가맹점번호")
    private String sellerKey;            //가맹점번호
    @ApiModelProperty(value = "payco cpId")
    private String cpId;                 //필수값
    @ApiModelProperty(value = "payco productId")
    private String productId;            //필수값
    @ApiModelProperty(value = "payco 상품명")
    private String productName;         //상품명
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
    @ApiModelProperty(value = "payco languagecode 2자리 ex) EN, KR")
    private String language;
    @ApiModelProperty(value = "payco 무통장입금완료통보 url ")
    private String nonBankbookDepositInformUrl;
    @ApiModelProperty(value = "payco orderchannal(PC or MOBILE)")
    private String orderChannel;

    //토스에서 사용하는 변수
    @ApiModelProperty(value = "toss apiKey")
    private String apikey;

    //paypal에서 사용하는 변수
    @ApiModelProperty(value = "paypal userId")
    private String userId;
    @ApiModelProperty(value = "paypal pwd")
    private String pwd;
    @ApiModelProperty(value = "paypal signature")
    private String signature;

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String cardType;
    private String bankType;
    private String cardNumber;
    private String iataNumber;
    private String originalCurrency;
    private String lang;
    private String urlRegion;
    private String cardCode;
    private String reqType;
    private String flightSessionId;
    private String country;

    private String mode;
    private String notiUrl;
    private String confirmUrl;
    private String accountNumber;
    private String referenceId;
    private String partnerUserId;

}