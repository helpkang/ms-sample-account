package com.koreanair.common_adapter.pid.gps;

import com.koreanair.common_adapter.pid.gps.connector.PidConnector;
import com.koreanair.common_adapter.pid.gps.helper.PaymentApprovalHelper;
import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalInputVo;
import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalOutputVo;
import com.koreanair.common_adapter.pid.vo.PidInputVo;
import com.koreanair.common_external.pid.gps.approvalRequest.ApprovalRequestService;
import com.koreanair.common_external.pid.gps.approvalRequest.GeneralInfo2;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GpsApprovalRequestServiceAdapter {

    @Autowired
    private PaymentApprovalHelper approvalHelper;

    @Autowired
    private PidConnector gpsConnector;

    public PaymentApprovalOutputVo approvalRequest(PaymentApprovalInputVo input)throws Exception{
        ApprovalRequestService inputVo = approvalHelper.makeApprovalRequestServiceInput(input);
        PidInputVo pidInputVo = new PidInputVo();
        pidInputVo.setInputBody(inputVo);
        GeneralInfo2 output = (GeneralInfo2)gpsConnector.call(pidInputVo);
        PaymentApprovalOutputVo outputVo = approvalHelper.makeApprovalRequestServiceOutput(output);
        return outputVo;
    }
}