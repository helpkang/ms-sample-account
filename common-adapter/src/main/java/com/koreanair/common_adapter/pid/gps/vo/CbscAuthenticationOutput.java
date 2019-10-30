package com.koreanair.common_adapter.pid.gps.vo;

import lombok.Data;

@Data
public class CbscAuthenticationOutput extends PaymentAuthenticationOutput {
    //cbsc auth output
    private String xid;
    private String acsUrl;
    private String eci;
    private String authenticationPath;
    private String commerceIndicator;
    private String cavv;
    private String cavvAlgorithm;
    private String paresStatus;
    private String eciRaw;
    private String authenticationResult;
    private String specificationVersion;
    private String authenticationTransactionID;
    private String ucafCollectionIndicator;
    private String ucafAuthenticationData;
    private String directoryServerTransactionID;
    private String paReq;
}
