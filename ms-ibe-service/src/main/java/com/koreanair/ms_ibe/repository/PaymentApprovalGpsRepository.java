package com.koreanair.ms_ibe.repository;

import com.koreanair.common_adapter.pid.gps.GpsApprovalRequestServiceAdapter;

import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalInputVo;
import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalOutputVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class PaymentApprovalGpsRepository {

    @Autowired
    GpsApprovalRequestServiceAdapter approvalAdapter;

    public PaymentApprovalOutputVo approvalService(PaymentApprovalInputVo input)throws Exception {
        return approvalAdapter.approvalRequest(input);
    }
}