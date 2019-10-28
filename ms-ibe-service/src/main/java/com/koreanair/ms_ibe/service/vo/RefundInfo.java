package com.koreanair.ms_ibe.service.vo;

import com.koreanair.common_adapter.common.vo.Coupons;
import lombok.Data;

import java.math.BigInteger;
import java.util.ArrayList;

@Data
public class RefundInfo {

    private String refundRegistration;				/* 환불등록번호 */
    private ArrayList<String> passengerEMDNumber;		/* 환불받을 번호 */
    private Float refundFare;						/* 환불금액 */
    private BigInteger refundMilesCost;             /* 환불마일리지 */
    private String refundCurrencyCode;				/* 환불금액통화Code */
    private Integer refundMiles;					/* 환불마일리지 */
    private String passengerLastName;
    private String passengerFirstName;
    private Float paidFare;
    private Float usedFare;
    private Float refundPenalty;
    private Float discountFare;
    private Float unUsedTax;
    private String currency;
    private String processingStatus;
    private String ticketNumber;
    private String reservationNumber;
    private String couponStatus;
    private String sequenceNumber;
    private String billingAccountAppoint;
    private String raanNumber;
    private String accountInputDisplayYn;

    private String penaltyCode;
    private String taxCode1;
    private Float taxAmount1;
    private String taxCode2;
    private Float taxAmount2;
    private String taxCode3;
    private Float taxAmount3;
    private String taxCode4;
    private Float taxAmount4;
    private String taxCode5;
    private Float taxAmount5;
    private String taxCode6;
    private Float taxAmount6;
    private String taxCode7;
    private Float taxAmount7;
    private String taxCode8;
    private Float taxAmount8;
    private String taxCode9;
    private Float taxAmount9;
    private String taxCode10;
    private Float taxAmount10;
    private String taxCode11;
    private Float taxAmount11;
    private String taxCode12;
    private Float taxAmount12;
    private String taxCode13;
    private Float taxAmount13;
    private String taxCode14;
    private Float taxAmount14;
    private String taxCode15;
    private Float taxAmount15;

    private Float xfAmount1;
    private String xfAirPortCode1;
    private Float xfAmount2;
    private String xfAirPortCode2;
    private Float xfAmount3;
    private String xfAirPortCode3;
    private Float xfAmount4;
    private String xfAirPortCode4;
    private String exchagerageCode;
    private Float exchagerageRate;
    private Float netRefund;
    private String equivCurrencyCode;
    private Float equivRefund;
    private Float fareExcludeTax;
    private Float noshowPenalty;
    private String email;
    private String phoneNumber;
    private ArrayList<Coupons>couponList;			/*coupon의 정보를 가지는 리스트. 하나의 티켓에는 여러개의 쿠폰이있다*/
}
