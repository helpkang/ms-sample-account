package com.koreanair.common_adapter.common.vo;

import lombok.Data;

import java.math.BigInteger;
import java.util.ArrayList;

@Data
public class Segment {
    private String bDate;						/*출발날짜*/
    private String blocationCityName;			/*출발도시도시명*/
    private String blocationCode;				/*출발도시코드*/
    private String blocationName;				/*출발도시명*/
    private String eDate;						/*도착날짜*/
    private String elocationCityName;			/*도착도시도시명*/
    private String elocationCode;				/*도착도시코드*/
    private String elocationName;				/*도착도시명*/
    private String rbd;						/*좌석상세클래스*/
    private String bTerminal;					/*출발지터미널*/
    private String eTerminal;					/*도착지터미널*/
    private String equipmentName;				/*비행장비명*/
    private String equipmentCode;				/*비행장비코드*/
    private Boolean codeShare;					/*공동운항편여부*/
    //    //AP
    private String elapsedFlyingTime;			/*비행시간(경과비행시간)*/
    private Integer segCnt;					/*segment count*/
    private Boolean delay;						/*지연*/
    private Boolean cancel;					/*결항*/
    private String changeDepartureTime;		/* 변경된시간 */
    // 예약변경
    private String bdateValue;					/* 출발날짜 값(value) */
    private String edateValue;					/* 도착날짜 값(value) */
    private Boolean differentApo;				/* Different APO */
    //서비스
    private String elocationCityCode;			/*도착도시도시코드*/
    private String blocationCityCode;			/*출발도시도시코드*/
    private String bregionCode;				/*출발지 지역 코드 : USA코드가 미주 지역*/
    private String betaIssueCountry;			/*출발지 ETAS 필요 여부*/
    private String bdestinAddressNcsry;		/*출발지 체류지주소 필요 여부*/
    private String bfmlyOffer;					/*출발지 한가족서비스 제공여부*/
    private String bkeOnline;					/*출발지 KE ONLINE 여부*/
    private String eregionCode;				/*도착지 지역 코드 : USA코드가 미주 지역*/
    private String eetaIssueCountry;			/*도착지 ETAS 필요 여부*/
    private String edestinAddressNcsry;		/*도착지 체류지주소 필요 여부*/
    private String efmlyOffer;					/*도착지 한가족서비스 제공여부*/
    private String ekeOnline;					/*도착지 KE ONLINE 여부*/
    private String eTime;						/* 도착시간 */
    private String bTime;						/* 출발시간 */
    private String bDay;						/* 출발요일 */
    private String eDay;						/* 도착요일 */

    private String flightId;
    private String operationFlightNumber;
    private String airLineCode;				/*항공사코드*/
    private String flightNumber;				/*항공편번호*/
    private String departureDate;				/*출발날짜*/
    private String departureTime;				/*출발시각*/
    private String departureCityName;			/*출발지도시명*/

    private String departureCityCode;			/*출발지도시코드*/


    private String departureLocationCode;		/*출발지코드*/

    private String departureLocationName;		/*출발도시명*/


    private String arrivalDate;				/*도착날짜*/


    private String arrivalTime;				/*도착시각*/
    private String arrivalCityName;			/*도착지도시명*/


    private String arrivalCityCode;			/*도착지도시코드*/

    private String arrivalLocationCode;		/*도착지코드*/
    private String arrivalLocationName;		/*도착도시명*/
    private String departureTerminal;			/*출발지터미널*/
    private String arrivalTerminal;			/*도착지터미널*/
    private String airCraftName;				/*비행장비명*/
    private String airCraftCode;				/*비행장비코드*/
    private String changeDepartureDate;		/*지연또는 앞당겨진 항공편의 출발시간*/
    private String stopsCode;					/*중간기착도시코드*/
    private String connectionTime;				/*연결시간*/
    private String flightTime;					/*비행시간*/
    private Boolean differentAirport;			/* 연결편탑승시 공항변경표시 Different APO */
    private String cabinClass;					/*좌석클래스*/
    private String detailCabinClass;			/*상세좌석클래스*/
    private String segmentStatus;				/*여정상태*/
    private ArrayList<CabinClass> cabinClassList;

    /*data dictionary style 유상 재발행*/
    private BigInteger segmentId;				/*segmentId*/
    private String airLineName;					/*항공사이름*/
    private String otherAirLineCode;			/*공동운항편코드*/
    private String otherAirLineName;			/*공동운항편명*/
    private BigInteger numberOfStops;			/*중각기착횟수*/
    private String flightCouponStatus;			/*항공편상태값*/
    private ArrayList<FareRule> fareRuleList;		/* fareRule정보*/
    private String dateChange;					/* 출발일 도착일간 날짜 변경일 */
    private String seatNumber;
    private String beforeSeatNumber;

    private Boolean boundToModify;								/* 여정수정여부 체크 */

    private String preferredTime;				/* 선호시간대 */
    /*Web Check In*/
    private String handlingSystem;

    private String productId;
    private String checkInStatus;
    private String failureCode;
    private String failureMessage;
    private String boardingTime;
    private Boolean boardingPassEligibility;
    private Boolean isWebBoardingPassAllowed;
    private Boolean isMobileBoardingPassAllowed;
    private String encodedData;
    private String gate;
    private ArrayList<SeatInfo>seatList;
    private String fareFamilyCode;
    private String boardingZone;

    private Boolean accompanyAdultCheck;

    private String googleJwt;

    private String segmentTatooNumber;

    private String memberShipCode;				/*스카이 패스 회사 ex:DL*/
    private String memberShipNumber;			/*스카이 패스 번호 ex:DL*/
    private String seatRow;
    private String seatColumn;
    private String legId;

    //retrieve boarding pass output에서 사용하는 변수추가
    private String reservationNumber;   //SDP의 numericReservationNumber
    private String bookingClass;
    private String ticketNumber;
    private String loungeService;
    private String loungeType;
    private String securityNumber;
    private String fqtvNumber;

    private String fqtvProgramId;
    private String fqtvTierCode;
    private String skyPriority;

    private Boolean skyteamPriorityIndicator;

    private Boolean isEb;

    private String freeBaggageAirLine;
    private String freeBaggageType;
    private String freeBaggageAdultQuantity;
    private String freeBaggageInfantQuantity;
    private String freeBaggageAdultWeight;
    private String freeBaggageInfantWeight;
    private String freeBaggageAdultMeasureUnit;
    private String freeBaggageInfantMeasureUnit;
}
