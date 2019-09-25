
package com.koreanair.external.eretail.vo.tripplan.ancillary_services;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for discountReasonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="discountReasonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DISCOUNT_REASON_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT_TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT_AIRLINE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discountReasonType", propOrder = {
    "discountreasoncode",
    "discountreason",
    "discounttypecode",
    "discounttype",
    "discountairlinecode"
})
public class DiscountReasonType
    implements Serializable
{

    @XmlElement(name = "DISCOUNT_REASON_CODE")
    protected String discountreasoncode;
    @XmlElement(name = "DISCOUNT_REASON")
    protected String discountreason;
    @XmlElement(name = "DISCOUNT_TYPE_CODE")
    protected String discounttypecode;
    @XmlElement(name = "DISCOUNT_TYPE")
    protected String discounttype;
    @XmlElement(name = "DISCOUNT_AIRLINE_CODE")
    protected String discountairlinecode;

    /**
     * Gets the value of the discountreasoncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTREASONCODE() {
        return discountreasoncode;
    }

    /**
     * Sets the value of the discountreasoncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTREASONCODE(String value) {
        this.discountreasoncode = value;
    }

    /**
     * Gets the value of the discountreason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTREASON() {
        return discountreason;
    }

    /**
     * Sets the value of the discountreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTREASON(String value) {
        this.discountreason = value;
    }

    /**
     * Gets the value of the discounttypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTTYPECODE() {
        return discounttypecode;
    }

    /**
     * Sets the value of the discounttypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTTYPECODE(String value) {
        this.discounttypecode = value;
    }

    /**
     * Gets the value of the discounttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTTYPE() {
        return discounttype;
    }

    /**
     * Sets the value of the discounttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTTYPE(String value) {
        this.discounttype = value;
    }

    /**
     * Gets the value of the discountairlinecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTAIRLINECODE() {
        return discountairlinecode;
    }

    /**
     * Sets the value of the discountairlinecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTAIRLINECODE(String value) {
        this.discountairlinecode = value;
    }

}
