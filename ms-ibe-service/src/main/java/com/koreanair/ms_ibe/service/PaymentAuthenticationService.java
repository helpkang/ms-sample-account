package com.koreanair.ms_ibe.service;

import com.koreanair.common_adapter.pid.gps.connector.HttpConnector;
import com.koreanair.common_adapter.pid.gps.connector.PaycoUtil;
import com.koreanair.ms_ibe.domain.PaymentAuthenticationDomain;
import com.koreanair.ms_ibe.helper.PaymentAuthenticationHelper;
import com.koreanair.ms_ibe.service.vo.*;
import com.koreanair.ms_ibe.repository.PaymentAuthenticationDbRepository;
import com.koreanair.ms_ibe.repository.PaymentAuthenticationGpsRepository;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.UriBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.ArrayList;
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

    public KakaoAuthenticationOutput kakao(KakaoAuthenticationInput inputVo) throws Exception {
        //DB 시퀀스 추출
        String seq = dbRepository.getKakao();
        inputVo = paymentAuthenticationDomain.getKakaoInput(inputVo,seq);
        HashMap<String,String> envMap = paymentAuthenticationHelper.makeKakaoHeaderInputData(inputVo);
        String json = paymentAuthenticationHelper.makeKakaoBodyInputData(inputVo);
        String resultStr = HttpConnector.httpsServiceCall(json, envMap);
        return paymentAuthenticationHelper.makeKakaoResultData(inputVo, resultStr);
    }

    public PaycoAuthenticationOutput payco(PaycoAuthenticationInput inputVo) throws Exception{
        //DB 시퀀스 추출
        String seq = dbRepository.getPayco();
        inputVo = paymentAuthenticationDomain.getPaycoInput(inputVo,seq);
        HashMap<String,Object> map = paymentAuthenticationHelper.makePaycoBodyInputData(inputVo);
        PaycoUtil paycoUtil = new PaycoUtil("live");
        String resultStr = paycoUtil.payco_reserve(map,"Y");
        return paymentAuthenticationHelper.makePaycoResultData(inputVo, resultStr);
    }

    public PaypalAuthenticationOutput paypal(PaypalAuthenticationInput inputVo) throws Exception {
        //DB 시퀀스 추출
        String seq = dbRepository.getPaypal();
        inputVo = paymentAuthenticationDomain.getPaypalInput(inputVo,seq);
        HashMap<String,String> envMap = paymentAuthenticationHelper.makePaypalHeaderInputData(inputVo);
        String json = paymentAuthenticationHelper.makePaypalBodyInputData(inputVo);
        String resultStr = HttpConnector.httpsServiceCall(json, envMap);
        return paymentAuthenticationHelper.makePaypalResultData(inputVo, resultStr);
    }

    public TossAuthenticationOutput toss(TossAuthenticationInput inputVo) throws Exception{
        PaymentAuthenticationOutput output = new PaymentAuthenticationOutput();
        //DB 시퀀스 추출
        String seq = dbRepository.getToss();
        inputVo = paymentAuthenticationDomain.getTossInput(inputVo,seq);
        HashMap<String,String> envMap = paymentAuthenticationHelper.makeTossHeaderInputData(inputVo);
        String json = paymentAuthenticationHelper.makeTossBodyInputData(inputVo);
        String resultStr = HttpConnector.httpsServiceCall(json, envMap);
        return paymentAuthenticationHelper.makeTossResultData(inputVo, resultStr);
    }

    public AlipayAuthenticationOutput alipay(AlipayAuthenticationInput inputVo)throws Exception {
        HashMap<String,Object> paramMap = paymentAuthenticationHelper.makeAlipayInputData(inputVo);
        //GPS jsp 페이지 연동하여, 토큰값을 받아온다.
        String result = getAlipayData(paramMap);
        AlipayAuthenticationOutput output = paymentAuthenticationHelper.makeAlipayOutputData(result, inputVo);
        //발권 input값을 db에 저장
        //output = dbRepository.insertAlipay(inputVo);
        return output;
    }

    public ChinapayAuthenticationOutput chinapay(ChinapayAuthenticationInput inputVo)throws Exception {
        HashMap<String,Object> paramMap = paymentAuthenticationHelper.makeChinapayInputData(inputVo);
        String result = getAlipayData(paramMap);
        ChinapayAuthenticationOutput output = paymentAuthenticationHelper.makeChinapayOutputData(result, inputVo);

        //발권 input값을 db에 저장
        //output = dbRepository.insertChinapay(inputVo);
        return output;
    }


    private String getAlipayData(HashMap<String, Object> paramMap) throws IOException {
        HttpClient client = new HttpClient();
        GetMethod getMethod = new GetMethod(paramMap.get("host").toString());
        ArrayList<NameValuePair> listNameValuePairs = new ArrayList<NameValuePair>();
        if(paramMap.get("param") != null){
            @SuppressWarnings("unchecked")
            HashMap<String, Object> params = (HashMap<String, Object>) paramMap.get("param");

            for(String paramKey : params.keySet()){
                if(params.get(paramKey) != null && !"".equals(params.get(paramKey))){
                    NameValuePair nameValuePair = new NameValuePair(paramKey,(String) params.get(paramKey));
                    listNameValuePairs.add(nameValuePair);
                }
            }
        }
        getMethod.setQueryString(listNameValuePairs.toArray(new NameValuePair[]{}));
        //	requestHeader setting
        if(paramMap != null && paramMap.get("headers") != null){
            @SuppressWarnings("unchecked")
            HashMap<String, String> headers = (HashMap<String, String>) paramMap.get("headers");
            for(String key : headers.keySet()){
                getMethod.addRequestHeader(key, headers.get(key));
            }
        }
        //	httpclient execute
        client.executeMethod(getMethod);
        if(getMethod.getStatusCode() != 200) return null;

        InputStream is = null;
        BufferedReader br = null;
        String line = null;
        StringBuffer sb = new StringBuffer();

        try {
            is = getMethod.getResponseBodyAsStream();
            br = new BufferedReader(new InputStreamReader(is));

            if (br != null) {
                while ((line = br.readLine()) != null)
                    sb.append(line);
            }
        } catch (Exception e) {
            throw e;
        } finally{
            if(br != null){
                try {
                    br.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    public ChinapayAuthenticationOutput chinapay(PaymentAuthenticationInput inputVo) {
        ChinapayAuthenticationOutput output = new ChinapayAuthenticationOutput();
        //GPS jsp 페이지 연동하여, 토큰값을 받아온다.
        //발권 input값을 db에 저장
        output = dbRepository.insertChinapay(inputVo);
        return output;
    }

    public CbscAuthenticationOutput cbsc(CbscAuthenticationInput inputVo) throws Exception{
        com.koreanair.common_adapter.pid.gps.vo.CbscAuthenticationOutput cbscAuthenticationOutput = gpsRepository.cbscAuth(inputVo);
        CbscAuthenticationOutput output  = paymentAuthenticationHelper.makeCbscAuthenticationOutput(cbscAuthenticationOutput);
        return output;
    }
}