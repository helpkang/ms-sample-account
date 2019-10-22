package com.koreanair.ms_ibe.service.vo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class TravellerInformation {

    private String passengerFirstName;									/* 승객 이름*/
    private String passengerLastName;									/* 승객 성*/
    private Float passengerFare;										/* 승객운임*/
    private Float passengerFareWithoutTax;								/* 승객세금제외운임*/
    private Float passengerFuelSurCharges;								/* 승객유류할증료*/
    private Float passengerTax;										/* 승객세금*/
    private Float passengerDiscountFare;								/* promotion coupon으로 할인된 금액*/
    private String passengerTypeCode;									/* 승객타입*/
    private Integer passengerTypeCodeCount;							/* 승객타입에 해당하는 인원수*/
   // private InfantInfo hasInfantInformation;							/* 동반유아정보*/
    private String passengerTitleCode;
    private String passengerGenderCode;
    private String passengerTravellerId;				/* 승객 Traveller Id*/
    private String passengerDateOfBirthday;				/* 승객 Traveller Id*/
    private String passengerMemberShipCode;				/* 승객 Traveller Id*/
    private String passengerMemberShipNumber;			/* 승객 Traveller Id*/
    private String passengerTicketNumber;
    private Integer passengerAccrualMileage;								/* 적립마일리지*/
    private Integer passengerMileCost;

    private String passengerSkypassNumber;				/* 승객 skypass number*/
    private String skypassProviderCompany;				/* 승객 skypass number*/
    private String passengerDiscountCode;	     	   /* 국내의 승객의 discountPTC(유아inf 제외)*/
    private boolean hasInfant;							/* 동반유아여부*/

    private String currencyCode;						/* 통화Code */
    private ArrayList<String> ticketdesignator;				/* DiscountPTC 적용판단여부 */
    private String passengerKoreaFirstName;				/* 승객 한글이름*/
    private String passengerKoreaLastName;				/* 승객 한글성*/
    private String discountPassengerTypeCode;

    private Boolean memberFamily;						/* 회원가족 체크 */


    private String memberFamilyCode;					/* 회원 가족 Code */

    private Boolean splitPassenger;						/* split할 승객 유무 */


    private String passengerEMDNumber;					/* 환불용 EMD 번호 */


   // private ArrayList<IdentityDocumentType> identityDocumentType;		/* 성인 여권 정보 */
  //  private ArrayList<ListPreferences> listpreferences;					/* 좌석/음식 정보*/
  //  private ArrayList<AddressInformationType> addressInformation;		/*체류지 거지주 정보*/
 //   private ArrayList<String> etcInfos;
  //  private RsDpnaPaxVo dpnaInfos;

    /*Check In SeatMap에서 사용*/
    private String passengerId;
    private String passengerType; 								/*(M : adult Man) (F : Adult Woman) (C : Child) (I :infant) */
    private String nationality;									/*국가정보?*/

  //  private List<Segment>itineraryInformationList;				/*일정정보*/
 //   private PassPortInfo 			passportInformation;		/*여권정보*/
 //   private VisaInformation			visaInformation;			// 체크인 Visa
 //   private PermanentInformation	permanetInformation;		// 체크인 영주권자.
    private String	knownTravellerNumber;
    private Boolean tsaPassed;
  //  private DestinationInfo destinationInformation;				/**/
    private String countryOfResidence;							/**/
    private String seatNumber;
    private String passengerMiddleName;							/* 승객 중간이름*/
    private String reservationNumber;
    private String reservationRecLoc;
    private Boolean ssrPassenger;								/*국내선 국제선 특정 discount PTC가 있으면 예매후 remark처리를 해야하는데
	 															  그것에 관련된 element*/

    private String issueDate;									/* 티켓 발권일자 */
    private Boolean isBk;										/* apis Document ID (PSPT_BK_GLOBAL_DEFAULT_1 = true) */
    private Boolean isStu;
    private String FareFamily;
    private String passengerTatooNumber;						/*PLUAT-1769 */

 //   private List<BaggageInfo>baggageInfoList;
    //private String passengerEMDNumber;					/* 환불용 EMD 번호 */
    private String freeBaggage;							    /* freebagage 갯수 */
    private String ebStatus;								/* 결제가능한 eb갯수 3은 3개까지 , 2는 2개까지, 1은 1개까지, 0은 추가 불가*/
    private String ebAddCount;								/* 추가수화물 추가수 */
    private Boolean isTier;									/* MC 등급 이면서, MC 등급 유효기간이 출발날짜기간인지를 판단하여 true,false를 받아야한다.*/
  //  private List<String> tsmNumberList;						/* fare단계에서 tsm을 호출하는데, 그때 해당번호를 넣어준다.*/
    private String passengerMemberShipLevel;				/*타항공사의 레벨 정보를 읽어서 담아줄 데이터 */
    private String ebAddOption;								/* 추가수화물 무게추가1,무게추가2,크기추가 같은 부가 옵션을 담기위한 코드*/

    private String ecpnNumber;
    private Float ecpnDiscountFare;
    private Boolean groupPnr;
}
