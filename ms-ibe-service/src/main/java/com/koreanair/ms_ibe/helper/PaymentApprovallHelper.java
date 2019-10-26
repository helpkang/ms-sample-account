package com.koreanair.ms_ibe.helper;

import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalInputVo;
import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalOutputVo;
import com.koreanair.common_external.pid.gps.approvalRequest.ApprovalRequestService;
import com.koreanair.common_external.pid.gps.approvalRequest.GeneralInfo;
import com.koreanair.ms_ibe.service.vo.PaymentApprovalInput;
import com.koreanair.ms_ibe.service.vo.PaymentApprovalOutput;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class PaymentApprovallHelper {

    public PaymentApprovalInputVo makeApprovalRequestServiceInput(PaymentApprovalInput input) {
        PaymentApprovalInputVo gpsinput = new PaymentApprovalInputVo();
        BeanUtils.copyProperties(gpsinput,input);
        return gpsinput;
    }

    public PaymentApprovalOutput makeApprovalRequestServiceOutput(PaymentApprovalOutputVo output) {
        PaymentApprovalOutput outputVo = new PaymentApprovalOutput();
        return outputVo;
    }
}
