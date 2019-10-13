package com.koreanair.common_adapter.common.vo;

import lombok.Data;
import java.util.ArrayList;

@Data
public class CommonPnrReply {

    private String reservationNumber;                                   //8자리 숫자 예약번호
    private String reservationRecLoc;                                   //6자리 예약번호
    private ArrayList<TicketInformation> ticketInformationList;         //ETKT 정보
    private ArrayList<TicketInformation> emdTicketInformationList;      //Emd Tkt 정보
    private ArrayList<TravellerInformation>travellerInformationList;    //승객정보
    private ArrayList<Itinerary>itineraryList;                          //여정정보
    private ArrayList<PaymentInformation>paymentInformationList;        //결제정보
    private ArrayList<TstData>tstDataList;                              //tst정보
    private ArrayList<FreeText>freeTextList;                            //기타 freetext정보
    private ArrayList<ContactPoint> contactPointList;                   //연락처정보
    private ArrayList<Service> serviceList;                   //연락처정보
    private String officeId;                                            //officeid
    private String companyId;											//회사코드
    private String pnrCreateDateTime;								    /*PNR 생성일*/
    private String iataNumber;                                          //iata번호

}
