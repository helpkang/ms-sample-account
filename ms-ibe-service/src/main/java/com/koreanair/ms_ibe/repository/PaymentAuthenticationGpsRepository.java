package com.koreanair.ms_ibe.repository;

import com.koreanair.ms_ibe.service.vo.PaymentAuthenticationInput;
import com.koreanair.ms_ibe.service.vo.PaymentAuthenticationOutput;
import org.springframework.stereotype.Repository;


@Repository
public class PaymentAuthenticationGpsRepository {

    public PaymentAuthenticationOutput getAlipay(PaymentAuthenticationInput inputVo) {

        //url커넥션으로 gps페이지 호출하여, alipay url과 암호화된 token값을 받아온다.
        return null;
    }
    public PaymentAuthenticationOutput getChinapay(PaymentAuthenticationInput inputVo) {
        //url커넥션으로 gps페이지 호출하여, alipay url과 암호화된 token값을 받아온다.
        return null;
    }

    public PaymentAuthenticationOutput getCbsc(PaymentAuthenticationInput inputVo) {
        //의존성 주입된 아답터에서 GPS페이지를 호출하여,
        return null;
    }

    public PaymentAuthenticationOutput insertAlipay(PaymentAuthenticationInput inputVo) {
        return null;
    }

    public PaymentAuthenticationOutput insertChinapay(PaymentAuthenticationInput inputVo) {
        return null;
    }
}