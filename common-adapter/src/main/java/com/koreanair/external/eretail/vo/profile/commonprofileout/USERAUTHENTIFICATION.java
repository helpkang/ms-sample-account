
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USER_TYPE" type="{}TRAVELLER_TYPE_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="USER_TRAVELLING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="REAL_LOGIN_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CSX_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECORD_LOCATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PASSWORD_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PASSWORD_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCKED_STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DEACTIVATED_STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOM_USER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "USER_AUTHENTIFICATION")
public class USERAUTHENTIFICATION
    implements Serializable
{

    @XmlElement(name = "USER_ID")
    protected String userid;
    @XmlElement(name = "USER_TYPE")
    protected TRAVELLERTYPETYPE usertype;
    @XmlElement(name = "USER_TRAVELLING")
    protected Boolean usertravelling;
    @XmlElement(name = "REAL_LOGIN_NAME")
    protected String realloginname;
    @XmlElement(name = "CSX_TYPE")
    protected String csxtype;
    @XmlElement(name = "RECORD_LOCATOR")
    protected String recordlocator;
    @XmlElement(name = "PASSWORD_1")
    protected String password1;
    @XmlElement(name = "PASSWORD_2")
    protected String password2;
    @XmlElement(name = "LOCKED_STATUS")
    protected Object lockedstatus;
    @XmlElement(name = "DEACTIVATED_STATUS")
    protected Object deactivatedstatus;
    @XmlElement(name = "CUSTOMER_CODE")
    protected String customercode;
    @XmlElement(name = "CUSTOM_USER_ID")
    protected Object customuserid;

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the usertype property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELLERTYPETYPE }
     *     
     */
    public TRAVELLERTYPETYPE getUSERTYPE() {
        return usertype;
    }

    /**
     * Sets the value of the usertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELLERTYPETYPE }
     *     
     */
    public void setUSERTYPE(TRAVELLERTYPETYPE value) {
        this.usertype = value;
    }

    /**
     * Gets the value of the usertravelling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSERTRAVELLING() {
        return usertravelling;
    }

    /**
     * Sets the value of the usertravelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSERTRAVELLING(Boolean value) {
        this.usertravelling = value;
    }

    /**
     * Gets the value of the realloginname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREALLOGINNAME() {
        return realloginname;
    }

    /**
     * Sets the value of the realloginname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREALLOGINNAME(String value) {
        this.realloginname = value;
    }

    /**
     * Gets the value of the csxtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSXTYPE() {
        return csxtype;
    }

    /**
     * Sets the value of the csxtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSXTYPE(String value) {
        this.csxtype = value;
    }

    /**
     * Gets the value of the recordlocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECORDLOCATOR() {
        return recordlocator;
    }

    /**
     * Sets the value of the recordlocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECORDLOCATOR(String value) {
        this.recordlocator = value;
    }

    /**
     * Gets the value of the password1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSWORD1() {
        return password1;
    }

    /**
     * Sets the value of the password1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSWORD1(String value) {
        this.password1 = value;
    }

    /**
     * Gets the value of the password2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSWORD2() {
        return password2;
    }

    /**
     * Sets the value of the password2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSWORD2(String value) {
        this.password2 = value;
    }

    /**
     * Gets the value of the lockedstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLOCKEDSTATUS() {
        return lockedstatus;
    }

    /**
     * Sets the value of the lockedstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLOCKEDSTATUS(Object value) {
        this.lockedstatus = value;
    }

    /**
     * Gets the value of the deactivatedstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDEACTIVATEDSTATUS() {
        return deactivatedstatus;
    }

    /**
     * Sets the value of the deactivatedstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDEACTIVATEDSTATUS(Object value) {
        this.deactivatedstatus = value;
    }

    /**
     * Gets the value of the customercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERCODE() {
        return customercode;
    }

    /**
     * Sets the value of the customercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERCODE(String value) {
        this.customercode = value;
    }

    /**
     * Gets the value of the customuserid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCUSTOMUSERID() {
        return customuserid;
    }

    /**
     * Sets the value of the customuserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCUSTOMUSERID(Object value) {
        this.customuserid = value;
    }

}
