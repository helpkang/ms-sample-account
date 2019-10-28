package com.koreanair.ms_ibe.service.vo;

import com.koreanair.common_adapter.common.vo.TravellerInformation;
import com.koreanair.external.dx.vo.Itinerary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
@ApiModel(value = "결제 인증 요청", description = "결제 인증 요청시 사용되는 클래스")
public class PaymentAuthenticationInput {
    //ui에서 받는 값
    @ApiModelProperty(value = "국내선여부", required = true, example = "true")
    private Boolean domestic;
    @ApiModelProperty(value = "무상여부", required = true, example = "false")
    private Boolean award;              //
    @ApiModelProperty(value = "6자리예약번호", example = "REC123")
    private String reservationRecLoc;   //6자리예약번호
    @ApiModelProperty(value = "8자리예약번호", required = true, example = "12345678")
    private String reservationNumber;   //8자리예약번호
    @ApiModelProperty(value = "결제금액", required = true, example = "500")
    private String amount;              //결제금액
    @ApiModelProperty(value = "callbackUrl", example = "https://www.koreanair.com")
    private String callbackUrl;
    @ApiModelProperty(value = "cancelUrl",example = "https://www.koreanair.com")
    private String cancelUrl;
    @ApiModelProperty(value = "failUrl",example = "https://www.koreanair.com")
    private String failUrl;
    @ApiModelProperty(value = "결제통화", required = true, example = "KRW")
    private String currency;
    @ApiModelProperty(value = "officeId", required = true,example = "SELKE08IW")
    private String officeId;
    @ApiModelProperty(value = "UI에서 발급한 고유 값", notes = "결제로그 table이나, 사이버소스 결제시 pares값을 저장하고 부르는 키값으로 사용됨")
    private String tid;
    @ApiModelProperty(value = "할부개월수", notes = "0은 일시불 할부 개월수 ", example = "0")
    private String installments;
    @ApiModelProperty(value = "deviceCode PCW, PHW, PHA")
    private String deviceCode;
    //간편결제 공통
    @ApiModelProperty(value = "간편결제 거래번호.")
    private String orderNo;

    @ApiModelProperty(value = "상품명")
    private String productName;         //상품명
    @ApiModelProperty(value = "비과세")
    private String amountTaxFree;
    @ApiModelProperty(value = "업무코드")
    private String mode;

}