package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CbscAuthenticationOutput extends PaymentAuthenticationOutput {
    //cbsc auth output
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String xid;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output acsurl")
    private String acsUrl;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String eci;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String authenticationPath;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String commerceIndicator;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String cavv;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String cavvAlgorithm;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String paresStatus;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String eciRaw;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String authenticationResult;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String specificationVersion;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String authenticationTransactionID;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String ucafCollectionIndicator;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String ucafAuthenticationData;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String directoryServerTransactionID;
    @ApiModelProperty(value = "cbsc 인증창 요청시 output")
    private String paReq;
}
