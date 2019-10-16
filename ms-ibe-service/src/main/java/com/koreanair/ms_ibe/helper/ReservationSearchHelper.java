package com.koreanair.ms_ibe.helper;

import com.koreanair.common_adapter.common.vo.CommonPnrReply;
import com.koreanair.common_adapter.common.vo.CommonTicketReply;
import com.koreanair.ms_ibe.domain.rp.VwReservationOutput;
import org.springframework.stereotype.Component;

@Component
public class ReservationSearchHelper {
    public VwReservationOutput makeVwReservationOutput(CommonPnrReply reply, CommonTicketReply ticketReply) {
        VwReservationOutput vwReservationOutput = new VwReservationOutput();

        return vwReservationOutput;
    }
}
