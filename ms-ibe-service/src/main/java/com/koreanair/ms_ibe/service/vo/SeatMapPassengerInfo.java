package com.koreanair.ms_ibe.service.vo;

import lombok.Data;

@Data
public class SeatMapPassengerInfo {


    private String passengerId;
    private String segmentId;
    private String seatNumber;
    private String seatAmount;

    //승객별 모든 CS의 총액수
    private String passengerIdTotalAmount;
    //전체승객의 모든 CS의 총액
    private String totalAmount;
    private String currency;
    private String key;

}
