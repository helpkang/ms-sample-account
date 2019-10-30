package com.koreanair.common_adapter.pid.gps.vo;

import com.koreanair.common_adapter.common.vo.TravellerInformation;
import com.koreanair.external.dx.vo.Itinerary;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.ArrayList;

@Data
public class CbscAuthenticationInput extends PaymentAuthenticationInput{

    //cbsc acsurl요청시 사용되는 변수
    private String expireMonth;
    private String expireYear;
    private String address1;
    private String address2;
    private String city;
    private String country;
    private String email;
    private String firstName;
    private String lastName;
    private String postalCode;
    private String state;
    //cbsc2.0에서 사용하는 변수
    private ArrayList<TravellerInformation> travellerInformationList;
    private ArrayList<Itinerary>itineraryList;
    private String telephone;
    private String referenceId;
    private String address;
    private String cardType;
    private String bankType;
    private String cardNumber;
    private String iataNumber;
    private String originalCurrency;
    private String lang;
    private String urlRegion;
    private String cardCode;
    private String reqType;
    private String flightSessionId;
    private String mode;
    private String notiUrl;
    private String confirmUrl;
    private String accountNumber;
    private String partnerUserId;

}