package com.koreanair.ms_ibe.service.vo;

import com.koreanair.common_adapter.pid.gps.vo.KonbiniInputVo;
import com.koreanair.common_adapter.pid.gps.vo.PayEase;
import com.koreanair.common_external.pid.gps.approvalRequest.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="approvalmodel", description="")
public class PaymentApprovalInput {

        @ApiModelProperty(value = "")
        protected String paymentType;
        @ApiModelProperty(value = "")
        protected GeneralInfo generalinfo;
        @ApiModelProperty(value = "")
        protected TktInfo tktinfo;
        @ApiModelProperty(value = "")
        protected TasfInfo tasfinfo;
        @ApiModelProperty(value = "")
        protected CybersourceAddedInfo cybersourceaddedinfo;
        @ApiModelProperty(value = "")
        protected CybersourceDmInfo cybersourceDmInfo;
        @ApiModelProperty(value = "")
        protected AuthInfo authinfo;
        @ApiModelProperty(value = "")
        protected KonbiniInputVo conveni;
        @ApiModelProperty(value = "")
        protected PayEase payEase;
        @ApiModelProperty(value = "")
        protected String cardType;
        @ApiModelProperty(value = "")
        protected boolean domestic;
        @ApiModelProperty(value = "")
        protected boolean award;
        @ApiModelProperty(value = "")
        protected String officeId;
}