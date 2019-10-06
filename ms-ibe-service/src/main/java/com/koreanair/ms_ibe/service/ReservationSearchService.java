package com.koreanair.ms_ibe.service;



import com.koreanair.common_adapter.altea.service.AlteaRepository;
import com.koreanair.common_adapter.common.vo.CommonPnrReply;
import com.koreanair.ms_ibe.domain.rp.VwReservationOutput;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class ReservationSearchService {

    @Transactional
    public VwReservationOutput getReservation(String recLoc) throws Exception {
        CommonPnrReply reply = AlteaRepository.retrievePnr(recLoc);
        VwReservationOutput output = new VwReservationOutput();
        BeanUtils.copyProperties(reply, output);
        return output;
    }

}