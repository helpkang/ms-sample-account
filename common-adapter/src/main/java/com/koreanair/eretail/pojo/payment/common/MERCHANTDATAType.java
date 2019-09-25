
package com.koreanair.eretail.pojo.payment.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MERCHANT_DATAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MERCHANT_DATAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="MERCHANT_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="PASSWORD" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="ACQUIRER_BIN" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="MERCHANT_URL" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="MERCHANT_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MERCHANT_DATAType", propOrder = {
    "countrycode",
    "merchantid",
    "password",
    "acquirerbin",
    "merchanturl",
    "merchantcode"
})
public class MERCHANTDATAType
    implements Serializable
{

    @XmlElement(name = "COUNTRY_CODE", required = true)
    protected String countrycode;
    @XmlElement(name = "MERCHANT_ID", required = true)
    protected String merchantid;
    @XmlElement(name = "PASSWORD", required = true)
    protected String password;
    @XmlElement(name = "ACQUIRER_BIN", required = true)
    protected String acquirerbin;
    @XmlElement(name = "MERCHANT_URL", required = true)
    protected String merchanturl;
    @XmlElement(name = "MERCHANT_CODE", required = true)
    protected Object merchantcode;

    /**
     * Gets the value of the countrycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRYCODE() {
        return countrycode;
    }

    /**
     * Sets the value of the countrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRYCODE(String value) {
        this.countrycode = value;
    }

    /**
     * Gets the value of the merchantid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMERCHANTID() {
        return merchantid;
    }

    /**
     * Sets the value of the merchantid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMERCHANTID(String value) {
        this.merchantid = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSWORD() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSWORD(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the acquirerbin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACQUIRERBIN() {
        return acquirerbin;
    }

    /**
     * Sets the value of the acquirerbin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACQUIRERBIN(String value) {
        this.acquirerbin = value;
    }

    /**
     * Gets the value of the merchanturl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMERCHANTURL() {
        return merchanturl;
    }

    /**
     * Sets the value of the merchanturl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMERCHANTURL(String value) {
        this.merchanturl = value;
    }

    /**
     * Gets the value of the merchantcode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMERCHANTCODE() {
        return merchantcode;
    }

    /**
     * Sets the value of the merchantcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMERCHANTCODE(Object value) {
        this.merchantcode = value;
    }

}
