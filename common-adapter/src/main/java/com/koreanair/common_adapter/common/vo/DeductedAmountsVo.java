package com.koreanair.common_adapter.common.vo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class DeductedAmountsVo {
    private String passengerLastName;					/* 영문 이름(성) */
    private String passengerFirstName;					/* 영문 이름(이름) */
    private String passengerTypeCode;					/* 승객타입*/
    private String paidAmountInMiles;					/* 지불 마일리지 금액 */
    private String usedFareMiles;						/* 사용 마일리지 금액 */
    private String refundPenalty;						/* 환불 패널티 금액 */
    private String refundMilesAmount;					/* 환불될 마일리지 */
    private String refundAmount;						/* 환불될 금액 */
    private String ticketNumber;						/*티켓번호 ex)180-xxxx....*/
    private ArrayList<String> childTicketNumberList;			/*conjenction ticket일경우만 생성됨*/
    private String raanNumber;							/*naora에서 발급한 환불접수번호*/
    private String refundPenaltyMiles;						/* 환불 패널티 금액 */
    private String authNo;
    private String expiredMileage;
}
