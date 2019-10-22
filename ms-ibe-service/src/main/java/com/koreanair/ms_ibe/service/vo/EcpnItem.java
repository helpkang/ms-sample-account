package com.koreanair.ms_ibe.service.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GET_ECPN_WF_F_ITEM")
public class EcpnItem {
    @XmlElement(name = "ATTR_0", required = true)
    private String ecpnAuthNumber;
    @XmlElement(name = "ATTR_1", required = true)
    private String returnMsg;
    @XmlElement(name = "ATTR_2", required = true)
    private String accualDiscountAmount;
    @XmlElement(name = "ATTR_3", required = true)
    private String ecpnExpireDate;
    @XmlElement(name = "ATTR_4", required = true)
    private String couponStatusCode;
    @XmlElement(name = "ATTR_5", required = true)
    private String lastName;
    @XmlElement(name = "ATTR_6", required = true)
    private String firstName;
    @XmlElement(name = "ATTR_7", required = true)
    private String adultInfantChildCategoryCd;
    @XmlElement(name = "ATTR_8", required = true)
    private String birthDatev;
    @XmlElement(name = "ATTR_9", required = true)
    private String nationalityIsoTLtrCtrCd;
    @XmlElement(name = "ATTR_10", required = true)
    private String ffpMemberGradeCode;
    @XmlElement(name = "ATTR_11", required = true)
    private String ffpNumber;
    @XmlElement(name = "ATTR_12", required = true)
    private String emailAddress;
    @XmlElement(name = "ATTR_13", required = true)
    private String mobilePhoneNumber;
    @XmlElement(name = "ATTR_14", required = true)
    private String sendYn;
    @XmlElement(name = "ATTR_15", required = true)
    private String sendDate;
    @XmlElement(name = "ATTR_16", required = true)
    private String xxarEcpnIssueLineId;
    @XmlElement(name = "ATTR_17", required = true)
    private String remainDiscountAmount;
    @XmlElement(name = "ATTR_18", required = true)
    private String paxNameKor;

    private String exChangeCurrency;
    private String exChangeEcpnAmount;

    private String currency="KRW";
}
