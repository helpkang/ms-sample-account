
package com.koreanair.eretail.pojo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for THREEDS_DATA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="THREEDS_DATA_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VERES_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PARES_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACS_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTHENTICATION_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTHENTICATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANSACTION_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "THREEDS_DATA_Type", propOrder = {
    "veresstatus",
    "paresstatus",
    "acsurl",
    "authenticationindicator",
    "authenticationcode",
    "transactionidentifier"
})
public class THREEDSDATAType
    implements Serializable
{

    @XmlElement(name = "VERES_STATUS")
    protected String veresstatus;
    @XmlElement(name = "PARES_STATUS")
    protected String paresstatus;
    @XmlElement(name = "ACS_URL")
    protected String acsurl;
    @XmlElement(name = "AUTHENTICATION_INDICATOR")
    protected String authenticationindicator;
    @XmlElement(name = "AUTHENTICATION_CODE")
    protected String authenticationcode;
    @XmlElement(name = "TRANSACTION_IDENTIFIER")
    protected String transactionidentifier;

    /**
     * Gets the value of the veresstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERESSTATUS() {
        return veresstatus;
    }

    /**
     * Sets the value of the veresstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERESSTATUS(String value) {
        this.veresstatus = value;
    }

    /**
     * Gets the value of the paresstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARESSTATUS() {
        return paresstatus;
    }

    /**
     * Sets the value of the paresstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARESSTATUS(String value) {
        this.paresstatus = value;
    }

    /**
     * Gets the value of the acsurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSURL() {
        return acsurl;
    }

    /**
     * Sets the value of the acsurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSURL(String value) {
        this.acsurl = value;
    }

    /**
     * Gets the value of the authenticationindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHENTICATIONINDICATOR() {
        return authenticationindicator;
    }

    /**
     * Sets the value of the authenticationindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHENTICATIONINDICATOR(String value) {
        this.authenticationindicator = value;
    }

    /**
     * Gets the value of the authenticationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHENTICATIONCODE() {
        return authenticationcode;
    }

    /**
     * Sets the value of the authenticationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHENTICATIONCODE(String value) {
        this.authenticationcode = value;
    }

    /**
     * Gets the value of the transactionidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONIDENTIFIER() {
        return transactionidentifier;
    }

    /**
     * Sets the value of the transactionidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONIDENTIFIER(String value) {
        this.transactionidentifier = value;
    }

}
