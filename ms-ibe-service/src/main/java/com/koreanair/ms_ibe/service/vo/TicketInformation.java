package com.koreanair.ms_ibe.service.vo;

import com.koreanair.common_adapter.common.vo.*;
import lombok.Data;

import java.util.ArrayList;

@Data
public class TicketInformation {

    private String ticketingDate;				/*발권날짜*/
    private String ticketStatus;				/*티켓상태값*/
    private ArrayList<Coupons>couponList;			/*coupon의 정보를 가지는 리스트. 하나의 티켓에는 여러개의 쿠폰이있다*/
    private ArrayList<String>couponNumberList;
    private TicketFare ticketFareInformation;	/*ATC refund 해온 환불금액 정보를 담는다. */
    private TicketFare emdFareInformation;	    /*ATC refund 해온 EMD 환불금액 정보를 담는다. */
    private ArrayList<Fops>fopList; 					/*dars interface 를 통한 fop 별 정보를 담는 class*/
    private Boolean noShow;						/*no show여부*/
    private Boolean reIssue;					/*재발행 여부*/
    private ArrayList<String>childTicketNumberList;	/*conjenction ticket일경우만 생성됨*/
    private Boolean totalRefund;				/*total refund여부( true면 total, false면 partial)*/

    private String requestDate;					/*환불신청날짜*/
    private String requestTime;					/*환불신청시간*/
    private String refundRequestOfficeId;		/*환불요청한officeId*/
    private String naoraId;						/*naoraId*/
    private String raanNumber;					/*naora에서 발급한 환불접수번호*/
    private String ticketNumber;				/*티켓번호 ex)180-xxxx....*/
    private String iataNumber;					/*티켓의 iata넘버*/
    private String userId;						/*userid*/

    private String reservationNumber;			/**/
    private String reservationRecLoc;
    private String passengerLastName;
    private String passengerFirstName;
    private String processingStatus;
    private String statusChangeDate;
    private String currency;						/*통화코드*/
    private String languageOfSite;					/**/
    private String email;							/*사용자가 환불 화면에서 입력받을 이메일*/
    private String phoneNumber;						/*사용자가 환불 화면에서 입력받을 연락처*/
    private ArrayList<PaymentInformation> paymentInformationList;			/*결제정보*/
    private Boolean refundable;
    private String airlineCode;						/*직항인지 체크하기위한*/
    private String officeId;
    private String sequenceNumber;
    private Boolean gdsTicket;
    private Boolean gtrTicket;
    private Boolean staffTicket;
    private Boolean pccTicket;
    private Boolean organizationTicket;

    private RefundInfo refundInfo;
    private String paidFare;
    private String passengerTypeCode;
    private String emdNumber;
    private Boolean emdRefundYn;

    /*무상 국제선 환불*/
    private String refundMile;
    private String penaltyMile;
    private String passengerId;
    private String issueDate;
    private String flightNumber;			// Security 체크  입력된 예약번호외 조회 된 예약 번호 비교  2014 년 8월 27일 수정 - by 이수택
    private String ruleTce;
    private String originalTicket;			//재발행 okcashbag의 기존 티켓을 찾기 위해 사용되는 필드 20151204
    private String emdIataNumber;

    private String beforeDepartureRefundPenaltyAmount;		//출발 전 환불패널티 금액
    private String afterDepartureRefundPenaltyAmount;		//출발 후 환불패널티 금액
    private String penaltyCurrency;							//환불패널티 통화코드
    private String ebStatus;
    private String otNumber;
    private String existAmount;						/*현금 영수증 제외금액*/
    private String cashReceiptIssueNumber;			/*현금 영수증 발급번호*/
    private String chargeablePostion;
    private String chargeableHourChk;
    private ArrayList<ReferenceCode> referenceCodeList;
}
