package com.koreanair.ms_ibe.service;

import com.koreanair.common_adapter.pid.gps.connector.HttpConnector;
import com.koreanair.common_adapter.pid.gps.connector.PaycoUtil;
import com.koreanair.ms_ibe.domain.PaymentAuthenticationDomain;
import com.koreanair.ms_ibe.helper.PaymentAuthenticationHelper;
import com.koreanair.ms_ibe.service.vo.*;
import com.koreanair.ms_ibe.repository.PaymentAuthenticationDbRepository;
import com.koreanair.ms_ibe.repository.PaymentAuthenticationGpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PaymentAuthenticationService {

    @Autowired
    private PaymentAuthenticationDomain paymentAuthenticationDomain;

    @Autowired
    private PaymentAuthenticationDbRepository dbRepository;

    @Autowired
    private PaymentAuthenticationGpsRepository gpsRepository;

    @Autowired
    private PaymentAuthenticationHelper paymentAuthenticationHelper;

    public KakaoAuthenticationOutput kakao(PaymentAuthenticationInput inputVo) throws Exception {
        //DB 시퀀스 추출
        String seq = dbRepository.getKakao();
        inputVo = paymentAuthenticationDomain.getKakaoInput(inputVo,seq);
        HashMap<String,String> envMap = paymentAuthenticationHelper.makeKakaoHeaderInputData(inputVo);
        String json = paymentAuthenticationHelper.makeKakaoBodyInputData(inputVo);
        String resultStr = HttpConnector.httpsServiceCall(json, envMap);
        return paymentAuthenticationHelper.makeKakaoResultData(inputVo, resultStr);
    }

    public PaycoAuthenticationOutput payco(PaymentAuthenticationInput inputVo) throws Exception{
        //DB 시퀀스 추출
        String seq = dbRepository.getPayco();
        inputVo = paymentAuthenticationDomain.getPaycoInput(inputVo,seq);
        HashMap<String,Object> map = paymentAuthenticationHelper.makePaycoBodyInputData(inputVo);
        PaycoUtil paycoUtil = new PaycoUtil("live");
        String resultStr = paycoUtil.payco_reserve(map,"Y");
        return paymentAuthenticationHelper.makePaycoResultData(inputVo, resultStr);
    }

    public PaypalAuthenticationOutput paypal(PaymentAuthenticationInput inputVo) throws Exception {
        //DB 시퀀스 추출
        String seq = dbRepository.getPaypal();
        inputVo = paymentAuthenticationDomain.getPaypalInput(inputVo,seq);
        HashMap<String,String> envMap = paymentAuthenticationHelper.makePaypalHeaderInputData(inputVo);
        String json = paymentAuthenticationHelper.makePaypalBodyInputData(inputVo);
        String resultStr = HttpConnector.httpsServiceCall(json, envMap);
        return paymentAuthenticationHelper.makePaypalResultData(inputVo, resultStr);
    }

    public TossAuthenticationOutput toss(PaymentAuthenticationInput inputVo) throws Exception{
        PaymentAuthenticationOutput output = new PaymentAuthenticationOutput();
        //DB 시퀀스 추출
        String seq = dbRepository.getToss();
        inputVo = paymentAuthenticationDomain.getTossInput(inputVo,seq);
        HashMap<String,String> envMap = paymentAuthenticationHelper.makeTossHeaderInputData(inputVo);
        String json = paymentAuthenticationHelper.makeTossBodyInputData(inputVo);
        String resultStr = HttpConnector.httpsServiceCall(json, envMap);
        return paymentAuthenticationHelper.makeTossResultData(inputVo, resultStr);
    }

    public AlipayAuthenticationOutput alipay(PaymentAuthenticationInput inputVo) {
        AlipayAuthenticationOutput output = new AlipayAuthenticationOutput();
        //GPS jsp 페이지 연동하여, 토큰값을 받아온다.
        //발권 input값을 db에 저장
        output = dbRepository.insertAlipay(inputVo);
        return output;
    }

    public ChinapayAuthenticationOutput chinapay(PaymentAuthenticationInput inputVo) {
        ChinapayAuthenticationOutput output = new ChinapayAuthenticationOutput();
        //GPS jsp 페이지 연동하여, 토큰값을 받아온다.
        //발권 input값을 db에 저장
        output = dbRepository.insertChinapay(inputVo);
        return output;
    }

    public CbscAuthenticationOutput cbsc(PaymentAuthenticationInput inputVo) {

        return null;
    }
}