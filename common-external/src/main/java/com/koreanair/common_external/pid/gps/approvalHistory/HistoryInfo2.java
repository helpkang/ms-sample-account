//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.12 at 04:24:28 ���� KST 
//


package com.koreanair.common_external.pid.gps.approvalHistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for historyInfo2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="historyInfo2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GpsLstId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PayMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfcId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IataNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReqSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReqNoTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReqNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CcVldYM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CcInsMths" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomIntTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApvNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApvDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReqAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevReqAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CcBrndCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CclDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForceApvYn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnrNmrlNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PnrRloc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayDstn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Authn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashRcptUseTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CcSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CcRcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CcRcRzn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChnlApvDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChnlCxlDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PccOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historyInfo2", propOrder = {
    "gpsLstId",
    "payMthdCd",
    "ofcId",
    "iataNo",
    "reqSys",
    "channel",
    "apvStatus",
    "reqNoTyp",
    "reqNo",
    "ccVldYM",
    "ccInsMths",
    "domIntTyp",
    "apvNo",
    "apvDT",
    "currency",
    "prevCurrency",
    "reqAmt",
    "prevReqAmt",
    "ccBrndCd",
    "cclDT",
    "errCd",
    "forceApvYn",
    "pnrNmrlNo",
    "pnrRloc",
    "payDstn",
    "authn",
    "mid",
    "cashRcptUseTyp",
    "tid",
    "sign",
    "ccSign",
    "ccRcCd",
    "ccRcRzn",
    "createBy",
    "createDT",
    "updateDT",
    "updateBy",
    "chnlApvDT",
    "chnlCxlDT",
    "pccOn"
})
public class HistoryInfo2 {

    @XmlElement(name = "GpsLstId")
    protected Integer gpsLstId;
    @XmlElement(name = "PayMthdCd")
    protected String payMthdCd;
    @XmlElement(name = "OfcId")
    protected String ofcId;
    @XmlElement(name = "IataNo")
    protected String iataNo;
    @XmlElement(name = "ReqSys")
    protected String reqSys;
    @XmlElement(name = "Channel")
    protected String channel;
    @XmlElement(name = "ApvStatus")
    protected String apvStatus;
    @XmlElement(name = "ReqNoTyp")
    protected String reqNoTyp;
    @XmlElement(name = "ReqNo")
    protected String reqNo;
    @XmlElement(name = "CcVldYM")
    protected String ccVldYM;
    @XmlElement(name = "CcInsMths")
    protected String ccInsMths;
    @XmlElement(name = "DomIntTyp")
    protected String domIntTyp;
    @XmlElement(name = "ApvNo")
    protected String apvNo;
    @XmlElement(name = "ApvDT")
    protected String apvDT;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "PrevCurrency")
    protected String prevCurrency;
    @XmlElement(name = "ReqAmt")
    protected String reqAmt;
    @XmlElement(name = "PrevReqAmt")
    protected String prevReqAmt;
    @XmlElement(name = "CcBrndCd")
    protected String ccBrndCd;
    @XmlElement(name = "CclDT")
    protected String cclDT;
    @XmlElement(name = "ErrCd")
    protected String errCd;
    @XmlElement(name = "ForceApvYn")
    protected String forceApvYn;
    @XmlElement(name = "PnrNmrlNo")
    protected Integer pnrNmrlNo;
    @XmlElement(name = "PnrRloc")
    protected String pnrRloc;
    @XmlElement(name = "PayDstn")
    protected String payDstn;
    @XmlElement(name = "Authn")
    protected String authn;
    @XmlElement(name = "Mid")
    protected String mid;
    @XmlElement(name = "CashRcptUseTyp")
    protected String cashRcptUseTyp;
    @XmlElement(name = "Tid")
    protected String tid;
    @XmlElement(name = "Sign")
    protected String sign;
    @XmlElement(name = "CcSign")
    protected String ccSign;
    @XmlElement(name = "CcRcCd")
    protected String ccRcCd;
    @XmlElement(name = "CcRcRzn")
    protected String ccRcRzn;
    @XmlElement(name = "CreateBy")
    protected String createBy;
    @XmlElement(name = "CreateDT")
    protected String createDT;
    @XmlElement(name = "UpdateDT")
    protected String updateDT;
    @XmlElement(name = "UpdateBy")
    protected String updateBy;
    @XmlElement(name = "ChnlApvDT")
    protected String chnlApvDT;
    @XmlElement(name = "ChnlCxlDT")
    protected String chnlCxlDT;
    @XmlElement(name = "PccOn")
    protected String pccOn;

    public String getCcSign() {
		return ccSign;
	}

	public void setCcSign(String ccSign) {
		this.ccSign = ccSign;
	}

	public String getPccOn() {
		return pccOn;
	}

	public void setPccOn(String pccOn) {
		this.pccOn = pccOn;
	}

	/**
     * Gets the value of the gpsLstId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGpsLstId() {
        return gpsLstId;
    }

    /**
     * Sets the value of the gpsLstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGpsLstId(Integer value) {
        this.gpsLstId = value;
    }

    /**
     * Gets the value of the payMthdCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMthdCd() {
        return payMthdCd;
    }

    /**
     * Sets the value of the payMthdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMthdCd(String value) {
        this.payMthdCd = value;
    }

    /**
     * Gets the value of the ofcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfcId() {
        return ofcId;
    }

    /**
     * Sets the value of the ofcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfcId(String value) {
        this.ofcId = value;
    }

    /**
     * Gets the value of the iataNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataNo() {
        return iataNo;
    }

    /**
     * Sets the value of the iataNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataNo(String value) {
        this.iataNo = value;
    }

    /**
     * Gets the value of the reqSys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqSys() {
        return reqSys;
    }

    /**
     * Sets the value of the reqSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqSys(String value) {
        this.reqSys = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the apvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApvStatus() {
        return apvStatus;
    }

    /**
     * Sets the value of the apvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApvStatus(String value) {
        this.apvStatus = value;
    }

    /**
     * Gets the value of the reqNoTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqNoTyp() {
        return reqNoTyp;
    }

    /**
     * Sets the value of the reqNoTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqNoTyp(String value) {
        this.reqNoTyp = value;
    }

    /**
     * Gets the value of the reqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqNo() {
        return reqNo;
    }

    /**
     * Sets the value of the reqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqNo(String value) {
        this.reqNo = value;
    }

    /**
     * Gets the value of the ccVldYM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcVldYM() {
        return ccVldYM;
    }

    /**
     * Sets the value of the ccVldYM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcVldYM(String value) {
        this.ccVldYM = value;
    }

    /**
     * Gets the value of the ccInsMths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcInsMths() {
        return ccInsMths;
    }

    /**
     * Sets the value of the ccInsMths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcInsMths(String value) {
        this.ccInsMths = value;
    }

    /**
     * Gets the value of the domIntTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomIntTyp() {
        return domIntTyp;
    }

    /**
     * Sets the value of the domIntTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomIntTyp(String value) {
        this.domIntTyp = value;
    }

    /**
     * Gets the value of the apvNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApvNo() {
        return apvNo;
    }

    /**
     * Sets the value of the apvNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApvNo(String value) {
        this.apvNo = value;
    }

    /**
     * Gets the value of the apvDT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApvDT() {
        return apvDT;
    }

    /**
     * Sets the value of the apvDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApvDT(String value) {
        this.apvDT = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the prevCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevCurrency() {
        return prevCurrency;
    }

    /**
     * Sets the value of the prevCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevCurrency(String value) {
        this.prevCurrency = value;
    }

    /**
     * Gets the value of the reqAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqAmt() {
        return reqAmt;
    }

    /**
     * Sets the value of the reqAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqAmt(String value) {
        this.reqAmt = value;
    }

    /**
     * Gets the value of the prevReqAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevReqAmt() {
        return prevReqAmt;
    }

    /**
     * Sets the value of the prevReqAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevReqAmt(String value) {
        this.prevReqAmt = value;
    }

    /**
     * Gets the value of the ccBrndCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcBrndCd() {
        return ccBrndCd;
    }

    /**
     * Sets the value of the ccBrndCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcBrndCd(String value) {
        this.ccBrndCd = value;
    }

    /**
     * Gets the value of the cclDT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCclDT() {
        return cclDT;
    }

    /**
     * Sets the value of the cclDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCclDT(String value) {
        this.cclDT = value;
    }

    /**
     * Gets the value of the errCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCd() {
        return errCd;
    }

    /**
     * Sets the value of the errCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrCd(String value) {
        this.errCd = value;
    }

    /**
     * Gets the value of the forceApvYn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceApvYn() {
        return forceApvYn;
    }

    /**
     * Sets the value of the forceApvYn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceApvYn(String value) {
        this.forceApvYn = value;
    }

    /**
     * Gets the value of the pnrNmrlNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPnrNmrlNo() {
        return pnrNmrlNo;
    }

    /**
     * Sets the value of the pnrNmrlNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPnrNmrlNo(Integer value) {
        this.pnrNmrlNo = value;
    }

    /**
     * Gets the value of the pnrRloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrRloc() {
        return pnrRloc;
    }

    /**
     * Sets the value of the pnrRloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrRloc(String value) {
        this.pnrRloc = value;
    }

    /**
     * Gets the value of the payDstn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayDstn() {
        return payDstn;
    }

    /**
     * Sets the value of the payDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayDstn(String value) {
        this.payDstn = value;
    }

    /**
     * Gets the value of the authn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthn() {
        return authn;
    }

    /**
     * Sets the value of the authn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthn(String value) {
        this.authn = value;
    }

    /**
     * Gets the value of the mid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMid() {
        return mid;
    }

    /**
     * Sets the value of the mid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMid(String value) {
        this.mid = value;
    }

    /**
     * Gets the value of the cashRcptUseTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashRcptUseTyp() {
        return cashRcptUseTyp;
    }

    /**
     * Sets the value of the cashRcptUseTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashRcptUseTyp(String value) {
        this.cashRcptUseTyp = value;
    }

    /**
     * Gets the value of the tid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTid() {
        return tid;
    }

    /**
     * Sets the value of the tid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTid(String value) {
        this.tid = value;
    }

    /**
     * Gets the value of the sign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSign() {
        return sign;
    }

    /**
     * Sets the value of the sign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSign(String value) {
        this.sign = value;
    }

    /**
     * Gets the value of the ccRcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcRcCd() {
        return ccRcCd;
    }

    /**
     * Sets the value of the ccRcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcRcCd(String value) {
        this.ccRcCd = value;
    }

    /**
     * Gets the value of the ccRcRzn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcRcRzn() {
        return ccRcRzn;
    }

    /**
     * Sets the value of the ccRcRzn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcRcRzn(String value) {
        this.ccRcRzn = value;
    }

    /**
     * Gets the value of the createBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * Sets the value of the createBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateBy(String value) {
        this.createBy = value;
    }

    /**
     * Gets the value of the createDT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDT() {
        return createDT;
    }

    /**
     * Sets the value of the createDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDT(String value) {
        this.createDT = value;
    }

    /**
     * Gets the value of the updateDT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDT() {
        return updateDT;
    }

    /**
     * Sets the value of the updateDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDT(String value) {
        this.updateDT = value;
    }

    /**
     * Gets the value of the updateBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * Sets the value of the updateBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateBy(String value) {
        this.updateBy = value;
    }

    /**
     * Gets the value of the chnlApvDT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChnlApvDT() {
        return chnlApvDT;
    }

    /**
     * Sets the value of the chnlApvDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChnlApvDT(String value) {
        this.chnlApvDT = value;
    }

    /**
     * Gets the value of the chnlCxlDT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChnlCxlDT() {
        return chnlCxlDT;
    }

    /**
     * Sets the value of the chnlCxlDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChnlCxlDT(String value) {
        this.chnlCxlDT = value;
    }

}
