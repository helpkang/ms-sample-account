package com.koreanair.common_adapter.common.vo;

import lombok.Data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

@Data
public class PaymentInformation {
    private String paymentTypeName;					/* 결제종류명 신용카드 계좌이체 등 */
    private Float totalAmountResult;
    private String paymentTypeCode;					/* 결제종류 신용카드 계좌이체 등 */
    private String creditCardCompanyCode;			/* 신용 카드 종류*/
    private String accountNumber;					/* 신용 카드 번호*/
    private String approvalCode;					/* 승인번호*/
    private Integer numberofInstallments;			/* 할부개월수*/
    private Float discountTotalFare;				/* 쿠폰으로 할인된 총 금액*/
    private Float totalFare;						/* 총 결제된 금액*/
    private String cardCompany;						/* 신용카드 회사 */
    private String couponAmount;					/* TravellerInfo/passengerDiscountFare으로 사용(승객별 할인금액 입력으로 변화) */
    private String couponType;						/* 할인쿠폰Type : 0 / fareDC / rateDC */
    private String couponNumber;					/* 할인쿠폰 번호 */
    private String ownerName;						/* 신용카드소유주 이름 */
    private String expiryDate;						/* 유효기간 */
    private Float paymentFare;						/* GPS로 결재된 금액 */
    private String totalFareCurrencyCode;			/* 총 운임 통화 Code */
    private String totalFareCurrencyName;			/* 총 운임 통화 Name */
    private BigInteger totalMilesCost;				/* 총 결재마일리지 */
    private Float totalRefundFare;					/* 총 환불 금액 */
    private String freeText;
    private String bankCode;
    private Boolean isExchangeRate;					/* MCP적용여부 */
    private String paidAmountInMiles;
    private String refundMilesAmount;
    private String refundPenaltyMiles;
    private String expiredMileage;
    private String accountAppoint;					/**/
    private String otNumber;
    private String mcp;
    private HashMap<Integer,Float> discountFare; 		/* key : travellerID, value : save per passenger*/
    private ArrayList<ReferenceCode> referenceCodeList;
}
