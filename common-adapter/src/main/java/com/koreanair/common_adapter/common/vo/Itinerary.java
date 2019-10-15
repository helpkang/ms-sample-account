package com.koreanair.common_adapter.common.vo;

import lombok.Data;

import java.math.BigInteger;
import java.util.ArrayList;

@Data
public class Itinerary {

    private static final long serialVersionUID = 1L;
    /****ElementManagementItinerary****/
    private String segmentName;			/*비행기 세그먼트 네임*/
    private BigInteger lineNumber;		/*비행기 LINE NUMBER*/
    private String qualifier;			/*비행기 QUALIFIER*/
    private BigInteger segmentNumber;			/*비행기 NUMBER*/
//	private Boolean domestic;			/*국내석 국제선 구분*/
    /********************************/

    /****TravelProduct****/
    private String departureDate;			/*비행기 출발일*/
    private String departureTime;			/*비행기 출발 시간*/
    private String arrivalDate;			/*비행기 도착일*/
    private String arrivalTime;			/*비행기 도착 시간*/
    private BigInteger dayChangeIndicator;	/*다음날 도착 확인*/
    private String flightTime;			/*비행시간*/

    //boardpointDetail
    private String departureCityCode;	/*출발 공항 코드*/
    private String departureCityName;	/*출발 공항 이름*/

    //offpointDetail
    private String arrivalCityCode;		/*도착 공항 코드*/
    private String arrivalCityName;		/*도착 공항 이름*/

    //companyDetail
    private String airLineCode;		/*항공 회사(ex:KE, DL)*/

    //productDetails
    private String flightNumber;		/*항공기 번호*/
    private String cabinClass;			/*캐빈 클래스*/
    private String bookingClass;		/*부킹 클래스*/

    //typeDetail
    private String detail;					/*상세 코드*/
    /********************************/

    /****RelatedProduct****/
    private ArrayList<String> segmentStatus;			/*비행기 상태 코드*/
    /********************************/

    /****ItineraryfreeFormText****/
    private ArrayList<String> freeFormText;		/*대한항공 에서 타 항공사 운항 정보*/
    private String otherAirLineCode;		/* 공동운항(Code Share) 항공사 코드 */
    /********************************/

    /****flightDetail****/
    private BigInteger numberOfStops;			/*연결 황공편 횟수*/
    private String departureTerminal;			/*출발 터미널*/
    private String arrivalTerminal;			/*도착 터미널*/
    private BigInteger weekDay;				/*요일*/
    private String airCraftCode;				/*항공기종*/
    /********************************/

    private Boolean delay;					/*비행편 지연 여부*/
    private String changeDepartureDate;				/*비행편 지연 시간*/
    private Boolean cancel;					/*비행편 결항 여부*/

    private Boolean upgrade;				/* 좌석승급 가능 여부 */
    private Boolean upgradeRetry;			/* 좌석승급 재시도 여부 */
    private Boolean noShow;					/* No-show 여부 */

    private BigInteger quantity;					/* relatedProduct/quantity */
    //private GeneralErrorInfoVo segmentErrorInfo;
    private Boolean boundToModify;			/* 좌석승급 선택 */
    private String miles;					/* 여정의 마일리지 정보 */
    private Boolean fqtuUpdate;				/* fqtuUpdate 여부 */
    private String changeBookingClass;		/* 변경되는 bookingClass */
    private String changeCabinClass;		/* 변경되는 cabinClass */
    private String bookingClassDetailsOption;
    private String bookingClassDetailsDesignator;
    private String availableSeatCount;
    private String ticketingDate;

    private String freeBaggageAirLine;
    private String freeBaggageType;
    private String freeBaggageAdultQuantity;
    private String freeBaggageInfantQuantity;
    private String freeBaggageAdultWeight;
    private String freeBaggageInfantWeight;
    private String freeBaggageAdultMeasureUnit;
    private String freeBaggageInfantMeasureUnit;

    private String fareBasis;
}
