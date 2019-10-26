package com.koreanair.ms_ibe.repository;

import com.koreanair.ms_ibe.service.vo.AlipayAuthenticationOutput;
import com.koreanair.ms_ibe.service.vo.ChinapayAuthenticationOutput;
import com.koreanair.ms_ibe.service.vo.PaymentAuthenticationInput;
import com.koreanair.ms_ibe.service.vo.PaymentAuthenticationOutput;
import org.springframework.stereotype.Repository;


@Repository
public class PaymentAuthenticationGpsRepository {

    public AlipayAuthenticationOutput getAlipay(PaymentAuthenticationInput inputVo) {
        //url커넥션으로 gps페이지 호출하여, alipay url과 암호화된 token값을 받아온다.
        return null;
    }
    public ChinapayAuthenticationOutput getChinapay(PaymentAuthenticationInput inputVo) {
        //url커넥션으로 gps페이지 호출하여, alipay url과 암호화된 token값을 받아온다.
        return null;
    }
}