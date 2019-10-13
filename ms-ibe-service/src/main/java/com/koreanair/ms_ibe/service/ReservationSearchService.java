package com.koreanair.ms_ibe.service;

import com.koreanair.common_adapter.common.vo.CommonPnrReply;
import com.koreanair.ms_ibe.domain.rp.VwReservationOutput;
import com.koreanair.ms_ibe.repository.AlteaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class ReservationSearchService {
    @Autowired
    private AlteaRepository alteaRepository;

    @Transactional
    public VwReservationOutput getReservation(String recLoc) throws Exception {
        CommonPnrReply reply = alteaRepository.reservationSearch(recLoc);
        VwReservationOutput output = new VwReservationOutput();
        BeanUtils.copyProperties(reply, output);
        return output;
    }
}