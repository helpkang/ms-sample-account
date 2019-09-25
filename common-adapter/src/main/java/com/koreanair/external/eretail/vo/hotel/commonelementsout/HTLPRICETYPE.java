
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.CurrencyType;


/**
 * Price type
 * 
 * <p>Java class for HTL_PRICE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HTL_PRICE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element ref="{}PRICE_WITH_MARKUP" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *         &lt;element ref="{}EXCHANGE_RATE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTL_PRICE_TYPE", propOrder = {
    "price",
    "pricewithmarkup",
    "currency",
    "exchangerate"
})
public class HTLPRICETYPE
    implements Serializable
{

    @XmlElement(name = "PRICE")
    protected float price;
    @XmlElement(name = "PRICE_WITH_MARKUP")
    protected Object pricewithmarkup;
    @XmlElement(name = "CURRENCY", required = true)
    protected CurrencyType currency;
    @XmlElement(name = "EXCHANGE_RATE")
    protected BigDecimal exchangerate;

    /**
     * Gets the value of the price property.
     * 
     */
    public float getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPRICE(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the pricewithmarkup property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPRICEWITHMARKUP() {
        return pricewithmarkup;
    }

    /**
     * Sets the value of the pricewithmarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPRICEWITHMARKUP(Object value) {
        this.pricewithmarkup = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCURRENCY(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the exchangerate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXCHANGERATE() {
        return exchangerate;
    }

    /**
     * Sets the value of the exchangerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXCHANGERATE(BigDecimal value) {
        this.exchangerate = value;
    }

}
