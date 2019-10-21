package com.koreanair.ms_ibe.service;

import com.koreanair.common_adapter.common.vo.CommonPnrReply;
import com.koreanair.common_adapter.common.vo.CommonTicketReply;
import com.koreanair.common_adapter.common.vo.TicketInformation;
import com.koreanair.ms_ibe.domain.rp.ReservationSearchDomain;
import com.koreanair.ms_ibe.domain.rp.VwReservationOutput;
import com.koreanair.ms_ibe.helper.ReservationSearchHelper;
import com.koreanair.ms_ibe.repository.AlteaRepository;
import com.koreanair.ms_ibe.repository.PaymentApprovalGpsRepository;
import com.koreanair.ms_ibe.service.vo.PamentApprovalInput;
import com.koreanair.ms_ibe.service.vo.PaymentApprovalOutput;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
public class PaymentApprovalService {

    @Autowired
    PaymentApprovalGpsRepository gpsRepository;

    public PaymentApprovalOutput paymentApproval(PamentApprovalInput inputVo) {
        PaymentApprovalOutput outputVo = new PaymentApprovalOutput();
        //gpsRepository

        return outputVo;

    }
}