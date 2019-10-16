package com.koreanair.ms_ibe.repository;

import com.koreanair.common_adapter.altea.RetrievePnrAdapter;
import com.koreanair.common_adapter.altea.TicketProcessEdocAdapter;
import com.koreanair.common_adapter.common.vo.CommonPnrReply;
import com.koreanair.common_adapter.common.vo.CommonTicketReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public class AlteaRepository {

    @Autowired
    private RetrievePnrAdapter pnrAdapter;

    @Autowired
    private TicketProcessEdocAdapter ticketProcessEdocAdapter;

    public CommonPnrReply reservationSearch(String recLoc, boolean stateful) throws Exception {
        CommonPnrReply reply = pnrAdapter.retrievePnr(recLoc, stateful);
        return reply;
    }

    public CommonTicketReply ticketSearch(ArrayList<String> ticketList, boolean stateful) throws Exception {
        CommonTicketReply reply = ticketProcessEdocAdapter.ticketProcessEdoc(ticketList, stateful);
        return reply;
    }
}