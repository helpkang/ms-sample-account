package com.koreanair.common_adapter.common.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.ArrayList;
@Getter
@Setter
@NoArgsConstructor
public class Amount {
    //무상 예매 관련
    private BigInteger milesCost; /* 마일리지 */

    //data Dictionary 변수
    private String currencyCode;						/* 통화코드*/
    private ArrayList<PtcAmount>passengerTypeCodeFareList;	/* ptc별 운임을 담은 리스트*/
    private String cabinClass;							/* 해당하는 좌석등급*/
    private String standardPassengerTypeCode;			/* 여정의 달력에 표시되는 금액의 기준이 되는 ptc*/
    private Float baseFare;								/* base fare amount(기본운임)*/
    private Float fare;									/* bfa가 존재 할 경우 할인운임, bfa가 존재하지 않을 경우 기본운임*/
    private Float baseFareTotalFare;					/* 여정의 총 base fare amount(기본운임)*/
    private Float totalFare;							/* bfa가 존재 할 경우 할인운임, bfa가 존재하지 않을 경우 여정의 총 기본운임*/
    private String listStatus;
    private BigInteger numberofLastseats;
    private String discountFareCode;
    private String recommendationId;

    //data Dictionary 변수 (AP)
    private Float totalTax;	 /*총 tax*/
    private Float totalFareWithoutTax; /*총 withoutTax*/
    private Float totalBaseFare; /*총 할인전 운임*/
    private BigInteger totalMilesCost; /*총 마일리지*/
    private Float standardFare;     /*기준정보 가격*/
    private BigInteger standardMilesCost; /*기준정보 마일리지*/
    private Float standardBaseFare; /*기준정보 할인 가격*/
    private ArrayList<CabinClass> cabinClassList;
    private ArrayList<BookingClass>bookingClassList;
    private ArrayList<BoundAmount>boundAmountList;
}
