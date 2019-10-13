package com.koreanair.common_adapter.common.vo;

import lombok.Data;

@Data
public class Coupons {

    private String status;				/* 항공편 상태값 */
    private String flightNumber;		/* 항공편 번호 */
    private String airLineCode;			/* 항공편 Code */
    private Integer couponIndex;			/* 쿠폰번호*/
    private String couponNumber;			/* 쿠폰번호*/
    private String couponStatus;			/* 쿠폰상태*/
    private String departureTime;		/* 쿠폰의 출발시각*/
    private String departureLocationCode;
    private String arrivalLocationCode;
    private String fareBasisCode;
    private String arrivalTime;
    private String fareBasisAnotherCode;	/*STCR, STCR보호자, EXST, CBBG등을 걸러내기위함*/
    private String departureDate;	/*출발일*/
    private String arrivallDate;	/*도착일*/
    private String departureDateDomestic;	/*출발일*/
    private String departureTimeDomestic;	/*출발시간*/
    private String arrivallDateDomestic;	/*도착일*/
    private String arrivallTimeDomestic;	/*도착시간*/
    private String arrivalDate;						/*도착날짜*/
    private Action action;
    private String bookingClass;
    private String beforeDepartureRefundPenaltyAmount;		//출발 전 환불패널티 금액
    private String afterDepartureRefundPenaltyAmount;		//출발 후 환불패널티 금액
    private String penaltyCurrency;							//환불패널티 통화코드

}
