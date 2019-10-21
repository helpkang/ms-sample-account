package com.koreanair.ms_ibe.repository;

import com.koreanair.common_adapter.altea.RetrievePnrAdapter;
import com.koreanair.common_adapter.altea.TicketProcessEdocAdapter;
import com.koreanair.common_adapter.common.vo.CommonPnrReply;
import com.koreanair.common_adapter.common.vo.CommonTicketReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public class PaymentAuthenticationDbRepository {

    public String getKakao() {
        return "";
    }

    public String getPayco() {
        return "";
    }

    public String getPaypal() {
        return "";
    }

    public String getToss() {
        return "";
    }
}