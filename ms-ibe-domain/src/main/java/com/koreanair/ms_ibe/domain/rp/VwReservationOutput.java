package com.koreanair.ms_ibe.domain.rp;

import com.koreanair.common.ddd.DomainType;
import com.koreanair.common.ddd.DomainType.Domain;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
public class VwReservationOutput {
    public boolean splitPnr;

    private String reservationNumber;
    private String reservationRecLoc;
    private String officeId;                                            //officeid
    private String currency;                                            //결제통화
    private String companyId;											//회사코드
    private String aliasName;											//예약 별명
    private String pnrCreateDateTime;								/*PNR 생성일*/
    private String iataNumber;

}