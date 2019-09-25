
package com.koreanair.external.eretail.vo.common.common;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CURRENCY_FROM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CURRENCY_TO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BANKERS_RATE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionInformationType", propOrder = {
    "currencyfrom",
    "currencyto",
    "bankersrate"
})
public class ConversionInformationType
    implements Serializable
{

    @XmlElement(name = "CURRENCY_FROM", required = true)
    protected String currencyfrom;
    @XmlElement(name = "CURRENCY_TO", required = true)
    protected String currencyto;
    @XmlElement(name = "BANKERS_RATE")
    protected BigInteger bankersrate;

    /**
     * Gets the value of the currencyfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYFROM() {
        return currencyfrom;
    }

    /**
     * Sets the value of the currencyfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYFROM(String value) {
        this.currencyfrom = value;
    }

    /**
     * Gets the value of the currencyto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYTO() {
        return currencyto;
    }

    /**
     * Sets the value of the currencyto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYTO(String value) {
        this.currencyto = value;
    }

    /**
     * Gets the value of the bankersrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBANKERSRATE() {
        return bankersrate;
    }

    /**
     * Sets the value of the bankersrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBANKERSRATE(BigInteger value) {
        this.bankersrate = value;
    }

}
