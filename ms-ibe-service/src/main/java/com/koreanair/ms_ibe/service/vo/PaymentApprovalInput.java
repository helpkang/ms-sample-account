package com.koreanair.ms_ibe.service.vo;

import com.koreanair.common_adapter.pid.gps.vo.KonbiniInputVo;
import com.koreanair.common_adapter.pid.gps.vo.PayEase;
import com.koreanair.common_external.pid.gps.approvalRequest.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="결제 승인 요청", description="결제 승인 요청시 사용되는 클래스")
public class PaymentApprovalInput {

        @ApiModelProperty(value = "결제수단코드")
        protected String paymentType;
        @ApiModelProperty(value = "GPS에 보내는 oid,pnr,코드 값을 담는 클래스")
        protected GeneralInfo generalinfo;
        @ApiModelProperty(value = "현금영수증 요청시 티켓정보를 담는 클래스")
        protected TktInfo tktinfo;
        @ApiModelProperty(value = "IBE에서 사용하지 않는 클래스")
        protected TasfInfo tasfinfo;
        @ApiModelProperty(value = "사이버소스 주소정보를 넣는 클래스")
        protected CybersourceAddedInfo cybersourceaddedinfo;
        @ApiModelProperty(value = "사이버소스 froud유저를 거르기 위한 정보를 담는 클래스")
        protected CybersourceDmInfo cybersourceDmInfo;
        @ApiModelProperty(value = "인증정보를 담는 클래스")
        protected AuthInfo authinfo;

        protected KonbiniInputVo conveni;
        @ApiModelProperty(value = "중국결제 거래번호")
        protected PayEase payEase;
        @ApiModelProperty(value = "KICC, MPI 카드타입 ")
        protected String cardType;
}