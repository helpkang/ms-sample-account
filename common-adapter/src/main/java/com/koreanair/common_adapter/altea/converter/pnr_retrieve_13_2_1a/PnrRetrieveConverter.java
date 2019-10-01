package com.koreanair.common_adapter.altea.converter.pnr_retrieve_13_2_1a;

import com.koreanair.external.altea.vo.pnr_reply_13_2_1a.PNRReply;
import com.koreanair.external.altea.vo.pnr_retrieve_13_2_1a.PNRRetrieve;
import com.koreanair.external.altea.vo.pnr_retrieve_13_2_1a.ReservationControlInformationDetailsType;
import com.koreanair.external.altea.vo.pnr_retrieve_13_2_1a.ReservationControlInformationType;
import com.koreanair.external.altea.vo.pnr_retrieve_13_2_1a.RetrievePNRType;

import java.math.BigInteger;
import java.util.List;

public class PnrRetrieveConverter {
    public static PNRRetrieve makeRetrievePNRInput(String reservation) {
        reservation = reservation.replaceAll("-","");
        PNRRetrieve input = new PNRRetrieve();
        PNRRetrieve.RetrievalFacts refacts = new PNRRetrieve.RetrievalFacts();
        RetrievePNRType retrievepnr = new RetrievePNRType();
        retrievepnr.setType(BigInteger.valueOf(2));
        refacts.setRetrieve(retrievepnr);
        ReservationControlInformationType value = new ReservationControlInformationType();
        List<ReservationControlInformationDetailsType> list = value.getReservation();
        ReservationControlInformationDetailsType element = new ReservationControlInformationDetailsType();
        element.setControlNumber(reservation);
        element.setCompanyId("KE");
        if(reservation.length()==8){
            element.setControlType("I");
        }
        list.add(0, element);
        refacts.setReservationOrProfileIdentifier(value);
        input.setRetrievalFacts(refacts);
        return input;
    }

    public static CommonPnrReply makeRetrievePNROutput(PNRReply pnrReply){

        return null;
    }
}
