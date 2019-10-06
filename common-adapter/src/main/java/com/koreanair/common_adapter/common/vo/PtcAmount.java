package com.koreanair.common_adapter.common.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class PtcAmount {
    //무상 예매 관련
    private BigInteger ptcMilesCost; 					/* 승객별 마일리지 Cost */
    private BigInteger ptcTypeMilesCost; 				/* 승객 타입별 마일리지 Cost */
    private Float ptcTypeTotalAmount;					/* 승객 타입별 마일리지 Cost */
    private BigInteger pnrMilesCost;					/*  승객 타입별 PNR 마일리지 Cost */
    private Float pnrTotalAmount; 						/* 전체 PNR 마일리지 Cost */

    /* 재발행 */
    private ArrayList<String> originalAmount;				/* 기존 여정운임 : 재발행 BooktriplanOutput 사용*/
    private ArrayList<String> originalCurrency;				/* 기존 여정운임코드 : 재발행 BooktriplanOutput 사용 */

    //Data Dictionary style 유상예매
    private String passengerTypeCode;								/*승객타입*/
    private Float passengerTypeCodeBaseFare;						/*승객타입 1인 할인 전 운임*/
    private Float passengerTypeCodeFare;							/*승객타입 1인 할인 후 운임 or 기본운임*/
    private Float passengerTypeCodeFareWithoutTax;					/*승객타입 1인 세금 제외 운임*/
    private Float passengerTypeCodeBaseFareWithoutTax;				/*승객타입 1인 세금 제외 할인 전 운임*/
    private Float passengerTypeCodeTax;								/*승객타입 1인 세금*/
    private Float passengerTypeCodeTotalTax;						/*승객타입 인원수의 총 세금*/
    private Float passengerTypeCodeFuelsurcharges;					/*승객타입 1인 유류할증료*/
    private String passengerTypeCodeCount;							/*승객타입에 해당하는 승객수*/
    private Float passengerTypeCodeBaseTotalFare;					/*승객타입 할인 전 총운임 */
    private Float passengerTypeCodeTotalFare;						/*승객타입 총운임*/
    private ArrayList<TaxDetail>taxDetailList;							/*세금상세내역*/
    private PtcDiscountFareCode passengerDiscountFareCode;
    //Data Dictionary style 무상예매
    private BigInteger passengerTypeCodeMilesCost;					/*  승객 1인당 PNR 마일리지 Cost */
    private BigInteger passengerTypeCodeTotalMilesCost;				/*  승객 타입별 PNR 마일리지 Cost */
    private BigInteger passengerTypeCodeCollectMilesCost; 			/* 기존 승객별 추가지불 마일리지 */
    private BigInteger passengerTypeCodeTotalCollectMilesCost;		/* 기존 총 추가지불 마일리지 */
    private String discountPassengerTypeCode;						/* 할인 승객 코드 */
    private Float passengerTypeCodeTotalFareWithoutTax;				/* 승객 타입별 세금 제외 운임 */
    //Data Dictionary style 조회 후 구매
    private String currencyCode;									/* 통화 Code */
    private ArrayList<FareListSegmentsType> discountPassengerList;		/* 승객별 DiscountPTC 적용 */
    private ArrayList<String> fareRulesList;
    private String passengerTravellerId;							/* 승객 Traveller Id*/
    private ArrayList<String> ticketdesignatorList;						/* DiscountPTC 적용금액Code */
    //Data Dictionary style 재발행
    private Float passengerTypeCodeRebookFee;						/* 승객별 기존 기타추가금액 */
    private Float passengerTypeCodeCollectFare;						/* 승객별 기존 추가지불금액 */
    private Float passengerTypeCodePreviusFare;						/* 승객별 기존여정운임 */
    private Float passengerTypeCodePreviusFareWithoutTax;			/* 승객별 기존여정 세금 제외 운임 */
    private Float passengerTypeCodePreviusTax;						/* 승객별 기존여정 세금 */
    private Float passengerTypeCodePreviusSurCharges;				/* 승객별 기존여정 유류할증료 */
    private Float passengerTypeCodeRefundFare;						/* 승객별 환불받을금액 */
    private Float passengerTypeCodeTotalRefundFare;					/* 총 환불받을금액 */
    private Float passengerTypeCodeTotalCollectFare;				/* 총 추가지불금액 */
    private String previusCurrencyCode;								/* 기존통화Code */
    private Float passengerTypeCodeNonRefundableFare;				/* 추가세금금액 */
    private Float passengerTypeCodeTotalPreviusFare;				/* 승객별 총 기존여정운임  */
    private Float passengerTypeCodeNoShowFee;						/* 취소위약금 */
    private Float passengerTypeCodeChangeFee;						/* 승객별 수수료 */
    private Float passengerTypeCodeOtherCharges;					/* 승객별 기타추가금액*/
    private Float passengerTypeCodeNonReusableFare;					/* 할인쿠폰금액 */
    private BigInteger passengerTypeCodePreviusMilesCost;			/* 승객별 기존 1인 마일리지 Cost*/
    private BigInteger passengerTypeCodeRefundMilesCost;			/* 승객별 기존 1인 환불받을 마일리지 Cost*/
    private Float passengerTypeCodePreviusFuelsurcharges;			/* 승객별 기존여정 유류할증료 */
    private Float passengerTypeCodeDifferFare;						/* 승객별 운임 차액 */
    private String passengerTatooNumber;							/*20150924 PLUAT-1879 처리를 위해 타투번호를 임시로 담기위해 사용됨 output으로 내리지는 않음*/
    private BigInteger passengerTypeCodeExpiredMilesCost;				/* 승객 type별 소멸 마일리지 */
    private ArrayList<BoundAmount>boundAmountList;
}
