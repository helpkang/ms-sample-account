//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.12 at 04:02:09 ���� KST 
//


package com.koreanair.common_external.pid.gps.approvalRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalRequestService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalRequestService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generalinfo" type="{http://GPS_Service_Library}generalInfo"/>
 *         &lt;element name="tktinfo" type="{http://GPS_Service_Library}tktInfo" minOccurs="0"/>
 *         &lt;element name="tasfinfo" type="{http://GPS_Service_Library}tasfInfo" minOccurs="0"/>
 *         &lt;element name="cybersourceaddedinfo" type="{http://GPS_Service_Library}cybersourceAddedInfo" minOccurs="0"/>
 *         &lt;element name="cybersourceDmInfo" type="{http://GPS_Service_Library}cybersourceDmInfo" minOccurs="0"/>
 *         &lt;element name="authinfo" type="{http://GPS_Service_Library}authInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalRequestService", propOrder = {
    "generalinfo",
    "tktinfo",
    "tasfinfo",
    "cybersourceaddedinfo",
    "cybersourceDmInfo",
    "authinfo",
    "PaypalInfo"
})
@XmlRootElement(name = "ApprovalRequestService")
public class ApprovalRequestService {

    @XmlElement(required = true)
    protected GeneralInfo generalinfo;
    protected TktInfo tktinfo;
    protected TasfInfo tasfinfo;
    protected CybersourceAddedInfo cybersourceaddedinfo;
    protected CybersourceDmInfo cybersourceDmInfo;
    protected AuthInfo authinfo;
    protected PaypalInfo2 PaypalInfo;

    
    public PaypalInfo2 getPaypalInfo() {
		return PaypalInfo;
	}

	public void setPaypalInfo(PaypalInfo2 paypalInfo) {
		PaypalInfo = paypalInfo;
	}

	/**
     * Gets the value of the generalinfo property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInfo }
     *     
     */
    public GeneralInfo getGeneralinfo() {
        return generalinfo;
    }

    /**
     * Sets the value of the generalinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInfo }
     *     
     */
    public void setGeneralinfo(GeneralInfo value) {
        this.generalinfo = value;
    }

    /**
     * Gets the value of the tktinfo property.
     * 
     * @return
     *     possible object is
     *     {@link TktInfo }
     *     
     */
    public TktInfo getTktinfo() {
        return tktinfo;
    }

    /**
     * Sets the value of the tktinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TktInfo }
     *     
     */
    public void setTktinfo(TktInfo value) {
        this.tktinfo = value;
    }

    /**
     * Gets the value of the tasfinfo property.
     * 
     * @return
     *     possible object is
     *     {@link TasfInfo }
     *     
     */
    public TasfInfo getTasfinfo() {
        return tasfinfo;
    }

    /**
     * Sets the value of the tasfinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TasfInfo }
     *     
     */
    public void setTasfinfo(TasfInfo value) {
        this.tasfinfo = value;
    }

    /**
     * Gets the value of the cybersourceaddedinfo property.
     * 
     * @return
     *     possible object is
     *     {@link CybersourceAddedInfo }
     *     
     */
    public CybersourceAddedInfo getCybersourceaddedinfo() {
        return cybersourceaddedinfo;
    }

    /**
     * Sets the value of the cybersourceaddedinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CybersourceAddedInfo }
     *     
     */
    public void setCybersourceaddedinfo(CybersourceAddedInfo value) {
        this.cybersourceaddedinfo = value;
    }

    /**
     * Gets the value of the cybersourceDmInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CybersourceDmInfo }
     *     
     */
    public CybersourceDmInfo getCybersourceDmInfo() {
        return cybersourceDmInfo;
    }

    /**
     * Sets the value of the cybersourceDmInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CybersourceDmInfo }
     *     
     */
    public void setCybersourceDmInfo(CybersourceDmInfo value) {
        this.cybersourceDmInfo = value;
    }

    /**
     * Gets the value of the authinfo property.
     * 
     * @return
     *     possible object is
     *     {@link AuthInfo }
     *     
     */
    public AuthInfo getAuthinfo() {
        return authinfo;
    }

    /**
     * Sets the value of the authinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthInfo }
     *     
     */
    public void setAuthinfo(AuthInfo value) {
        this.authinfo = value;
    }

}