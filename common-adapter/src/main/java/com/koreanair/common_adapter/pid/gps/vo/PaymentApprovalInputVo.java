package com.koreanair.common_adapter.pid.gps.vo;

import com.koreanair.common_external.pid.gps.approvalRequest.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PaymentApprovalInputVo {

	protected String paymentType;
    protected GeneralInfo generalinfo;
    protected TktInfo tktinfo;
    protected TasfInfo tasfinfo;
    protected CybersourceAddedInfo cybersourceaddedinfo;
    protected CybersourceDmInfo cybersourceDmInfo;
    protected AuthInfo authinfo;
    protected KonbiniInputVo conveni;
    protected PayEase payEase;
    protected String cardType;
    protected boolean domestic;
    protected boolean award;
    protected String officeId;

}
