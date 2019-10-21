package com.koreanair.ms_ibe.service;

import com.koreanair.ms_ibe.domain.PaymentAuthenticationDomain;
import com.koreanair.ms_ibe.service.vo.PaymentAuthenticationInput;
import com.koreanair.ms_ibe.service.vo.PaymentAuthenticationOutput;
import com.koreanair.ms_ibe.repository.PaymentAuthenticationDbRepository;
import com.koreanair.ms_ibe.repository.PaymentAuthenticationGpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentAuthenticationService {

    @Autowired
    private PaymentAuthenticationDomain paymentAuthenticationDomain;

    @Autowired
    private PaymentAuthenticationDbRepository dbRepository;

    @Autowired
    private PaymentAuthenticationGpsRepository gpsRepository;

    public PaymentAuthenticationOutput kakao(PaymentAuthenticationInput inputVo) {
        PaymentAuthenticationOutput output = new PaymentAuthenticationOutput();
        //DB 시퀀스 추출
        String seq = dbRepository.getKakao();
        inputVo = paymentAuthenticationDomain.getKakaoInput(inputVo,seq);

        return output;
    }

    public PaymentAuthenticationOutput payco(PaymentAuthenticationInput inputVo) {
        PaymentAuthenticationOutput output = new PaymentAuthenticationOutput();
        //DB 시퀀스 추출
        String seq = dbRepository.getPayco();
        inputVo = paymentAuthenticationDomain.getPaycoInput(inputVo,seq);
        return output;
    }

    public PaymentAuthenticationOutput paypal(PaymentAuthenticationInput inputVo) {
        PaymentAuthenticationOutput output = new PaymentAuthenticationOutput();
        //DB 시퀀스 추출
        String seq = dbRepository.getPaypal();
        inputVo = paymentAuthenticationDomain.getPaypalInput(inputVo,seq);

        return output;
    }

    public PaymentAuthenticationOutput toss(PaymentAuthenticationInput inputVo) {
        PaymentAuthenticationOutput output = new PaymentAuthenticationOutput();
        //DB 시퀀스 추출
        String seq = dbRepository.getToss();
        inputVo = paymentAuthenticationDomain.getTossInput(inputVo,seq);
        return output;
    }

    public PaymentAuthenticationOutput alipay(PaymentAuthenticationInput inputVo) {
        PaymentAuthenticationOutput output = new PaymentAuthenticationOutput();
        //GPS jsp 페이지 연동하여, 토큰값을 받아온다.
        //발권 input값을 db에 저장
        output = gpsRepository.insertAlipay(inputVo);
        return output;
    }

    public PaymentAuthenticationOutput chinapay(PaymentAuthenticationInput inputVo) {
        PaymentAuthenticationOutput output = new PaymentAuthenticationOutput();
        //GPS jsp 페이지 연동하여, 토큰값을 받아온다.
        //발권 input값을 db에 저장
        output = gpsRepository.insertChinapay(inputVo);
        return output;
    }

    public PaymentAuthenticationOutput cbsc(PaymentAuthenticationInput inputVo) {
        PaymentAuthenticationOutput output = new PaymentAuthenticationOutput();
        //GPS jsp 페이지 연동하여, 토큰값을 받아온다.
        output = gpsRepository.getCbsc(inputVo);
        return output;
    }
}