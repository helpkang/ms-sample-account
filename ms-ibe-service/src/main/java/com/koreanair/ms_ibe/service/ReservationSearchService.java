package com.koreanair.ms_ibe.service;

import com.koreanair.common_adapter.common.vo.CommonPnrReply;
import com.koreanair.common_adapter.common.vo.CommonTicketReply;
import com.koreanair.common_adapter.common.vo.TicketInformation;
import com.koreanair.ms_ibe.domain.rp.ReservationSearchDomain;
import com.koreanair.ms_ibe.domain.rp.VwReservationOutput;
import com.koreanair.ms_ibe.helper.ReservationSearchHelper;
import com.koreanair.ms_ibe.repository.AlteaRepository;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
public class ReservationSearchService {
    @Autowired
    private AlteaRepository alteaRepository;

    @Autowired
    private ReservationSearchHelper reservationSearchHelper;

    @Autowired
    private ReservationSearchDomain reservationSearchDomain;

    @Transactional
    public VwReservationOutput getReservation(String recLoc) throws Exception {
        CommonPnrReply reply = alteaRepository.reservationSearch(recLoc,false);
        ArrayList<String> ticketList = new ArrayList();
        if(CollectionUtils.isNotEmpty(reply.getTicketInformationList())){
            for(TicketInformation ticket : reply.getTicketInformationList()){
                ticketList.add(ticket.getTicketNumber());
            }
        }
        CommonTicketReply ticketReply = alteaRepository.ticketSearch(ticketList,false);

        //pnr과 ticket을 merge한다.
        VwReservationOutput output = reservationSearchHelper.makeVwReservationOutput(reply,ticketReply);
        reservationSearchDomain.reservationSearchProcess(output);

        return output;
    }
}