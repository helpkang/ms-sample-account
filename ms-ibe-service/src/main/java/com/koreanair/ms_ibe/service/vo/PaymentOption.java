package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
@Data
public class PaymentOption {
    @ApiModelProperty(value = "프로모션 쿠폰번호")
    private String couponNumber;
    @ApiModelProperty(value = "총 결제 마일리지")
    private String totalMilesCost;				/* 총 결재마일리지 */
    @ApiModelProperty(value = "우대할인쿠폰 승객별 적용정보")
    private List<EcpnPassengerInfo> ecpnPassengerInfoList;
    @ApiModelProperty(value = "차저블싯 승객별 적용정보")
    private List<SeatMapPassengerInfo>seatMapPasssengerInfoList;

}
