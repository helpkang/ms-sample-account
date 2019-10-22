package com.koreanair.ms_ibe.service.vo;

import java.util.List;

public class EcpnPassengerInfo {
    private String passengerId;
    private String passengerLastName;
    private String passengerFirstName;
    private String passengerSkypassNo;
    private String passengerTypeCode;
    private String passengerAmountWithoutTax;
    private String passengerTax;
    private String passengerAmount;
    private String passengerFuelSurCharge;
    private String passengerEcpnId;
    private boolean isEcpnValidate;
    //discount coupon
    private String discountAmountWithoutTax;
    private String discountTax;
    private String discountAmount;
    private String discount;

    private String ecpnRemainAmount;
    private String ecpnDiscount;

    private List<EcpnItem> ecpnList;
    private String ecpnResultCode;

    private String otNumber;
}
