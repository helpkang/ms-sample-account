package com.koreanair.ms_ibe.service.vo;

import com.koreanair.common_adapter.common.vo.TravellerInformation;
import com.koreanair.external.dx.vo.Itinerary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
@ApiModel(value="결제 인증 요청", description="결제 인증 요청시 사용되는 클래스")
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
    @ApiModelProperty(value = "UI에서 발급한 고유 값", notes = "결제로그 table이나, 사이버소스 결제시 pares값을 저장하고 부르는 키값으로 사용됨")
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
    @ApiModelProperty(value = "payco languagecode 2자리", notes="ex) EN, KR")
    private String language;
    @ApiModelProperty(value = "payco 무통장입금완료통보 url ")
    private String nonBankbookDepositInformUrl;
    @ApiModelProperty(value = "payco orderchannal(PC or MOBILE)")
    private String orderChannel;

    //토스에서 사용하는 변수
    @ApiModelProperty(value = "toss apiKey")
    private String apikey;
    @ApiModelProperty(value = "비과세")
    private String amountTaxFree;

    //paypal에서 사용하는 변수
    @ApiModelProperty(value = "paypal userId")
    private String userId;
    @ApiModelProperty(value = "paypal pwd")
    private String pwd;
    @ApiModelProperty(value = "paypal signature")
    private String signature;

    //alipay에서 사용하는 변수
    private PaymentOption paymentOption;

    //cbsc acsurl요청시 사용되는 변수
    private String expireMonth;
    private String expireYear;
    private String address1;
    private String address2;
    private String city;
    private String country;
    private String email;
    private String firstName;
    private String lastName;
    private String postalCode;
    private String state;

    //cbsc2.0에서 사용하는 변수
    private ArrayList<TravellerInformation>travellerInformationList;
    private ArrayList<Itinerary>itineraryList;
    private String telephone;
    private String referenceId;

    private String address;
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
    private String mode;
    private String notiUrl;
    private String confirmUrl;
    private String accountNumber;
    private String partnerUserId;

}