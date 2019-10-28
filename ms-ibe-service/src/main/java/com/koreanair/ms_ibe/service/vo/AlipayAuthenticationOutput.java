package com.koreanair.ms_ibe.service.vo;

import lombok.Data;

@Data
public class AlipayAuthenticationOutput extends PaymentAuthenticationOutput{
    //alipay에서 사용하는 변수
    private PaymentOption paymentOption;
    private String notifyUrl;
    private String md5;
    private String url;
}
