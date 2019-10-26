package com.koreanair.common_adapter.pid.gps.vo;

import lombok.Data;

import java.util.HashMap;

@Data
public class PaymentApprovalOutputVo {

    private static final long serialVersionUID = 1L;
    private String paymentType;				// 결제타입
    private String resultCode;				// 결과코드
    private String resultMessage;			// 결과메시지
    private String approvalNumber;			// 승인번호
    private String approvalDateTime;		// 승인일시
    private String paidAmount;				// 지불된 금액
    private String installments;			// 할부기간
    private String cardName;				// 카드명
    private String cardNumber;				// 카드번호
    private String maskingCardNumber;		// 마스킹카드번호
    private String cardType;				// 카드타입
    private Boolean isRefundableAccount;	// 지불계좌의 환불가능여부
    private String pccOn;					// pcc-On
    private String depositLimitTime;		// 입금시한(Konbini용), yyyyMMddHHmmss
    private String konbiniPopupCode;		// Konbini Popup Code
    private String bankTransactionId;		// 계좌이체 거래ID
    private String ccExpireMonthYear;		// 신용카드 유효기간(MMYY)
    private String konibiUrl;
    private String tickettingDate;
    private HashMap<String, String> konbinInsertMap;	//
    private String freeArea;
    private String pnrRloc;
    private Integer pnrNmrlNo;
    private String reqNo;
}
