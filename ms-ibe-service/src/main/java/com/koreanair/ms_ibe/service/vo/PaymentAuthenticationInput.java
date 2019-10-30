package com.koreanair.ms_ibe.service.vo;

import com.koreanair.common_adapter.common.vo.TravellerInformation;
import com.koreanair.external.dx.vo.Itinerary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
@ApiModel(value = "authcommonnmodel", description = "")
public class PaymentAuthenticationInput {
    //ui에서 받는 값
    @ApiModelProperty(value = "", required = true, example = "true")
    private Boolean domestic;
    @ApiModelProperty(value = "", required = true, example = "false")
    private Boolean award;              //
    @ApiModelProperty(value = "", example = "REC123")
    private String reservationRecLoc;   //6자리예약번호
    @ApiModelProperty(value = "", required = true, example = "12345678")
    private String reservationNumber;   //8자리예약번호
    @ApiModelProperty(value = "", required = true, example = "500")
    private String amount;              //결제금액
    @ApiModelProperty(value = "", example = "https://www.koreanair.com")
    private String callbackUrl;
    @ApiModelProperty(value = "",example = "https://www.koreanair.com")
    private String cancelUrl;
    @ApiModelProperty(value = "",example = "https://www.koreanair.com")
    private String failUrl;
    @ApiModelProperty(value = "", required = true, example = "KRW")
    private String currency;
    @ApiModelProperty(value = "", required = true,example = "SELKE08IW")
    private String officeId;
    @ApiModelProperty(value = "", notes = "")
    private String tid;
    @ApiModelProperty(value = "", notes = "", example = "0")
    private String installments;
    @ApiModelProperty(value = "deviceCode PCW, PHW, PHA")
    private String deviceCode;
    //간편결제 공통
    @ApiModelProperty(value = "")
    private String orderNo;

    @ApiModelProperty(value = "")
    private String productName;         //상품명
    @ApiModelProperty(value = "")
    private String amountTaxFree;
    @ApiModelProperty(value = "")
    private String mode;

}