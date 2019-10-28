package com.koreanair.ms_ibe.service.vo;

import lombok.Data;

@Data
public class ChinapayAuthenticationOutput extends PaymentAuthenticationOutput {
    private String Version;
    private String AccessType;
    private String AcqCode;
    private String MerId;
    private String url;
    private String TranType;
    private String BusiType;
    private String CurryNo;
    private String TranDate;
    private String TranTime;
    private String MerBgUrl;
    private String MerPageUrl;
    private String MerOrderNo;
    private String OrderAmt;
    private String Signature;

}
