package com.koreanair.ms_ibe.service;


import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalInputVo;
import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalOutputVo;
import com.koreanair.ms_ibe.helper.PaymentApprovallHelper;
import com.koreanair.ms_ibe.repository.PaymentApprovalGpsRepository;
import com.koreanair.ms_ibe.service.vo.PaymentApprovalInput;
import com.koreanair.ms_ibe.service.vo.PaymentApprovalOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentApprovalService {

    @Autowired
    PaymentApprovalGpsRepository gpsRepository;
    @Autowired
    PaymentApprovallHelper paymentApprovallHelper;

    public PaymentApprovalOutput paymentApproval(PaymentApprovalInput input)throws Exception{
        PaymentApprovalInputVo inputVo = paymentApprovallHelper.makeApprovalRequestServiceInput(input);
        PaymentApprovalOutputVo output = gpsRepository.approvalService(inputVo);
        PaymentApprovalOutput outputVo = paymentApprovallHelper.makeApprovalRequestServiceOutput(output);
        return outputVo;
    }
}