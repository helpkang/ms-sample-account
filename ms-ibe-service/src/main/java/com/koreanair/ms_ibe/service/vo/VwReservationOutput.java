package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VwReservationOutput {
    @ApiModelProperty(value = "split pnr여부")
    private boolean splitPnr;
    @ApiModelProperty(value = "8자리 숫자예약번호")
    private String reservationNumber;
    @ApiModelProperty(value = "6자리 예약번호")
    private String reservationRecLoc;
    @ApiModelProperty(value = "pnr의 officeId")
    private String officeId;                                            //officeid
    @ApiModelProperty(value = "통화코드")
    private String currency;                                            //결제통화
    @ApiModelProperty(value = "회사코드", notes = "ex)KE, AL..")
    private String companyId;											//회사코드
    @ApiModelProperty(value = "예약별명")
    private String aliasName;											//예약 별명
    @ApiModelProperty(value = "pnr생성 시점")
    private String pnrCreateDateTime;								/*PNR 생성일*/
    @ApiModelProperty(value = "iata번호")
    private String iataNumber;
    @ApiModelProperty(value = "etkt 정보")
    private ArrayList<TicketInformation> ticketInformationList;         //ETKT 정보
    @ApiModelProperty(value = "emd tkt정보")
    private ArrayList<TicketInformation> emdTicketInformationList;      //Emd Tkt 정보
    @ApiModelProperty(value = "승객 정보")
    private ArrayList<TravellerInformation>travellerInformationList;    //승객정보
    @ApiModelProperty(value = "여정 정보")
    private ArrayList<Itinerary>itineraryList;                          //여정정보
    @ApiModelProperty(value = "연락처 정보")
    private ArrayList<ContactPoint> contactPointList;                   //연락처정보



}