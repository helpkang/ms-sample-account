package com.koreanair.common_adapter.pid.gps;

import com.koreanair.common_adapter.pid.gps.connector.PidConnector;
import com.koreanair.common_adapter.pid.gps.vo.CbscAuthenticationInput;
import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalOutputVo;
import com.koreanair.common_adapter.pid.vo.PidInputVo;
import com.koreanair.common_external.pid.gps.approvalRequest.ApprovalRequestService;
import com.koreanair.common_external.pid.gps.approvalRequest.GeneralInfo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GpsAuthenticationServiceAdapter {
/*
    @Autowired
    private PaymentAuthentic authenticationHelper;

    @Autowired
    private PidConnector gpsConnector;

    public PaymentApprovalOutputVo approvalRequest(CbscAuthenticationInput input)throws Exception{
        ApprovalRequestService inputVo = authenticationHelper.makeAuthenticationServiceInput(input);
        PidInputVo pidInputVo = new PidInputVo();
        pidInputVo.setInputBody(inputVo);
        GeneralInfo2 output = (GeneralInfo2)gpsConnector.call(pidInputVo);
        PaymentApprovalOutputVo outputVo = authenticationHelper.makeAuthenticationServiceOutput(output);
        return outputVo;
    }*/
}