package com.koreanair.common_adapter.common.vo;

import lombok.Data;
import java.util.ArrayList;

@Data
public class CommonPnrReply {

    private String reservationNumber;
    private String reservationRecLoc;
    private ArrayList<TicketInformation> ticketInformationList;
    private ArrayList<TicketInformation> emdTicketInformationList;
    private ArrayList<TravellerInformation>travellerInformationList;
    private ArrayList<Itinerary>itineraryList;
    private ArrayList<PaymentInformation>paymentInformationList;
    private ArrayList<TstData>tstDataList;
    private ArrayList<FreeText>freeTextList;                            //기타 freetext정보
    private ContactPoint contactPoint;                                  //연락처정보
    private String officeId;                                            //officeid
    private String currency;                                            //결제통화
    private String companyId;											//회사코드
    private String aliasName;											//예약 별명
    private String pnrCreateDateTime;								/*PNR 생성일*/
    private String iataNumber;

}
