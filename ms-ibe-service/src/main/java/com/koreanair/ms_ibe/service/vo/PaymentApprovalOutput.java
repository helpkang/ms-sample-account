package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;

@Data
@ApiModel(value="결제 승인 요청", description="결제 승인 요청에 대한 output정보를 담는 클래스")
public class PaymentApprovalOutput {
    @ApiModelProperty(value = "결제타입 코드")
    private String paymentType;				// 결제타입
    @ApiModelProperty(value = "결과코드")
    private String resultCode;				// 결과코드
    @ApiModelProperty(value = "결과메시지")
    private String resultMessage;			// 결과메시지
    @ApiModelProperty(value = "승인번호")
    private String approvalNumber;			// 승인번호
    @ApiModelProperty(value = "승인일시")
    private String approvalDateTime;		// 승인일시
    @ApiModelProperty(value = "지불된 금액")
    private String paidAmount;				// 지불된 금액
    @ApiModelProperty(value = "할부기간")
    private String installments;			// 할부기간
    @ApiModelProperty(value = "카드명")
    private String cardName;				// 카드명
    @ApiModelProperty(value = "카드번호")
    private String cardNumber;				// 카드번호
    @ApiModelProperty(value = "마스킹카드번호")
    private String maskingCardNumber;		// 마스킹카드번호
    @ApiModelProperty(value = "카드타입")
    private String cardType;				// 카드타입
    @ApiModelProperty(value = "지불계좌의 환불가능여부")
    private Boolean isRefundableAccount;	// 지불계좌의 환불가능여부
    @ApiModelProperty(value = "pcc-On여부", notes = "실물카드 지참여부")
    private String pccOn;					// pcc-On
    @ApiModelProperty(value = "입금시한" , notes = "콘비니에서 사용")
    private String depositLimitTime;		// 입금시한(Konbini용), yyyyMMddHHmmss
    @ApiModelProperty(value = "Konbini Popup Code")
    private String konbiniPopupCode;		// Konbini Popup Code
    @ApiModelProperty(value = "계좌이체 거래ID")
    private String bankTransactionId;		// 계좌이체 거래ID
    @ApiModelProperty(value = "신용카드 유효기간(MMYY)")
    private String ccExpireMonthYear;
    @ApiModelProperty(value = "콘비니결제 url")
    private String konibiUrl;
    @ApiModelProperty(value = "발권날짜")
    private String tickettingDate;
    @ApiModelProperty(value = "콘비니 db insert를 위한 map정보")
    private HashMap<String, String> konbinInsertMap;	//
    @ApiModelProperty(value = "콘비니 freeArea")
    private String freeArea;
    @ApiModelProperty(value = "pnr recloc")
    private String pnrRloc;
    @ApiModelProperty(value = "pnr 숫자번호")
    private Integer pnrNmrlNo;
    @ApiModelProperty(value = "거래번호")
    private String reqNo;
}