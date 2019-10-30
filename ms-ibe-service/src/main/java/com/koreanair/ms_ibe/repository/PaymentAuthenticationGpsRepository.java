package com.koreanair.ms_ibe.repository;

import com.koreanair.common_adapter.pid.gps.GpsApprovalRequestServiceAdapter;
import com.koreanair.common_adapter.pid.gps.vo.CbscAuthenticationOutput;
import com.koreanair.ms_ibe.service.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class PaymentAuthenticationGpsRepository {

    @Autowired
    GpsApprovalRequestServiceAdapter adapter;

    public CbscAuthenticationOutput cbscAuth(CbscAuthenticationInput input){

        return null;
    }
    public AlipayAuthenticationOutput getAlipay(PaymentAuthenticationInput inputVo) {
        //url커넥션으로 gps페이지 호출하여, alipay url과 암호화된 token값을 받아온다.
        return null;
    }
    public ChinapayAuthenticationOutput getChinapay(PaymentAuthenticationInput inputVo) {
        //url커넥션으로 gps페이지 호출하여, alipay url과 암호화된 token값을 받아온다.
        return null;
    }
}