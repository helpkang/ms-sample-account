package com.koreanair.ms_ibe.repository;

import com.koreanair.ms_ibe.service.vo.AlipayAuthenticationOutput;
import com.koreanair.ms_ibe.service.vo.ChinapayAuthenticationOutput;
import com.koreanair.ms_ibe.service.vo.PaymentAuthenticationInput;
import org.springframework.stereotype.Repository;


@Repository
public class PaymentAuthenticationDbRepository {

    public String getKakao() {
        return "";
    }

    public String getPayco() {
        return "";
    }

    public String getPaypal() {
        return "";
    }

    public String getToss() {
        return "";
    }

    public AlipayAuthenticationOutput insertAlipay(PaymentAuthenticationInput inputVo) {
        return null;
    }

    public ChinapayAuthenticationOutput insertChinapay(PaymentAuthenticationInput inputVo) {
        return null;
    }
}