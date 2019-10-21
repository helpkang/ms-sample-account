package com.koreanair.common_adapter.pid.gps;

import com.koreanair.common_adapter.pid.gps.helper.PaymentApprovallHelper;
import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalInputVo;
import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalOutput;
import com.koreanair.common_external.pid.gps.approvalRequest.ApprovalRequestService;
import com.koreanair.common_external.pid.gps.approvalRequest.GeneralInfo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApprovalRequestServiceAdapter {

    @Autowired
    private PaymentApprovallHelper approvalHelper;

    public PaymentApprovalOutput approvalRequest(PaymentApprovalInputVo input)throws Exception{
        ApprovalRequestService inputVo = approvalHelper.makeApprovalRequestServiceInput(input);

        GeneralInfo2 output = new GeneralInfo2();
        PaymentApprovalOutput outputVo = approvalHelper.makeApprovalRequestServiceOutput(output);
        return outputVo;
    }
}