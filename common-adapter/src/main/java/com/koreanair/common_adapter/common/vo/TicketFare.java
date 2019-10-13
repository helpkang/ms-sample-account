package com.koreanair.common_adapter.common.vo;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class TicketFare {
    private String currency;           /*화폐타입*/
    private Integer fare; 	//baseFare
    private Integer noShowPenalty; 	//noShowFee
    private Integer usedFare; 	    //usedFareAmt
    private String loyaltyInformation;         //?
    private Integer refundAmount;//refundTotal;  //refundAmt
    private String   domRefundMthdCd; //??
    private Integer refundServiceCharge;      //canxFee
    private Integer refundTaxes;   //taxRefund
    private Integer couponAmount; //nonRefAmt;  //?
    private Integer refundMiles;       //?
    private Integer netRefund;       //
    private Integer farePaidInMiles;		//Fare paid in miles
    private Integer fareRefundInMiles;	//Fare refund in miles
    private Integer fareUsedInMiles;		//Fare used in miles
    private Integer refundTotalInMiles;	//Refund total in miles
    private Integer usedTax;
    private Integer refundPenaltyMiles;
    private Integer expiredMileage;
    private String authNo;
}
