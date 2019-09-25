
package com.koreanair.eretail.pojo.payment.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CREDIT_CARDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_CARDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="EXPIRY_MONTH" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="EXPIRY_YEAR" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="VERIFICATION_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SUBTYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CREDIT_CARDType", propOrder = {
    "accountnumber",
    "expirymonth",
    "expiryyear",
    "type",
    "verificationnumber",
    "subtype"
})
public class CREDITCARDType
    implements Serializable
{

    @XmlElement(name = "ACCOUNT_NUMBER", required = true)
    protected String accountnumber;
    @XmlElement(name = "EXPIRY_MONTH", required = true)
    protected String expirymonth;
    @XmlElement(name = "EXPIRY_YEAR", required = true)
    protected String expiryyear;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "VERIFICATION_NUMBER")
    protected String verificationnumber;
    @XmlElement(name = "SUBTYPE")
    protected Object subtype;

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTNUMBER() {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTNUMBER(String value) {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the expirymonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPIRYMONTH() {
        return expirymonth;
    }

    /**
     * Sets the value of the expirymonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPIRYMONTH(String value) {
        this.expirymonth = value;
    }

    /**
     * Gets the value of the expiryyear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPIRYYEAR() {
        return expiryyear;
    }

    /**
     * Sets the value of the expiryyear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPIRYYEAR(String value) {
        this.expiryyear = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the verificationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERIFICATIONNUMBER() {
        return verificationnumber;
    }

    /**
     * Sets the value of the verificationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERIFICATIONNUMBER(String value) {
        this.verificationnumber = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSUBTYPE() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSUBTYPE(Object value) {
        this.subtype = value;
    }

}
