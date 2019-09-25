
package com.koreanair.external.eretail.vo.payment.paymentoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CREDIT_CARD_OUTPUT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_CARD_OUTPUT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="SUBTYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DIGIT_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DIGIT_CODE_OPTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ISSUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NAME_ON_CARD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CREDIT_CARD_OUTPUT_Type", propOrder = {
    "accountnumber",
    "expirydate",
    "type",
    "subtype",
    "digitcode",
    "digitcodeoption",
    "issuenumber",
    "startdate",
    "nameoncard"
})
public class CREDITCARDOUTPUTType
    implements Serializable
{

    @XmlElement(name = "ACCOUNT_NUMBER", required = true)
    protected Object accountnumber;
    @XmlElement(name = "EXPIRY_DATE")
    protected Object expirydate;
    @XmlElement(name = "TYPE", required = true)
    protected Object type;
    @XmlElement(name = "SUBTYPE")
    protected Object subtype;
    @XmlElement(name = "DIGIT_CODE")
    protected Object digitcode;
    @XmlElement(name = "DIGIT_CODE_OPTION")
    protected Object digitcodeoption;
    @XmlElement(name = "ISSUE_NUMBER")
    protected Object issuenumber;
    @XmlElement(name = "START_DATE")
    protected Object startdate;
    @XmlElement(name = "NAME_ON_CARD")
    protected Object nameoncard;

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getACCOUNTNUMBER() {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setACCOUNTNUMBER(Object value) {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the expirydate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEXPIRYDATE(Object value) {
        this.expirydate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTYPE(Object value) {
        this.type = value;
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

    /**
     * Gets the value of the digitcode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDIGITCODE() {
        return digitcode;
    }

    /**
     * Sets the value of the digitcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDIGITCODE(Object value) {
        this.digitcode = value;
    }

    /**
     * Gets the value of the digitcodeoption property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDIGITCODEOPTION() {
        return digitcodeoption;
    }

    /**
     * Sets the value of the digitcodeoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDIGITCODEOPTION(Object value) {
        this.digitcodeoption = value;
    }

    /**
     * Gets the value of the issuenumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISSUENUMBER() {
        return issuenumber;
    }

    /**
     * Sets the value of the issuenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISSUENUMBER(Object value) {
        this.issuenumber = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSTARTDATE() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSTARTDATE(Object value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the nameoncard property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNAMEONCARD() {
        return nameoncard;
    }

    /**
     * Sets the value of the nameoncard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNAMEONCARD(Object value) {
        this.nameoncard = value;
    }

}
