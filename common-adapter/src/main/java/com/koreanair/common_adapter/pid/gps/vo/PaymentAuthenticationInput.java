package com.koreanair.common_adapter.pid.gps.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "결제 인증 요청", description = "결제 인증 요청시 사용되는 클래스")
public class PaymentAuthenticationInput {
    //ui에서 받는 값
    private Boolean domestic;
    private Boolean award;              //
    private String reservationRecLoc;   //6자리예약번호
    private String reservationNumber;   //8자리예약번호
    private String amount;              //결제금액
    private String callbackUrl;
    private String cancelUrl;
    private String failUrl;
    private String currency;
    private String officeId;
    private String tid;
    private String installments;
    private String deviceCode;
    private String orderNo;
    private String productName;         //상품명
    private String amountTaxFree;
    private String mode;

}