
package com.koreanair.eretail.pojo.tripplan.common.common_shopping_basket;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CurrencyType;


/**
 * List of prices.
 * 
 * <p>Java class for AMOUNT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMOUNT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMOUNT", propOrder = {
    "currency",
    "value"
})
public class AMOUNT
    implements Serializable
{

    @XmlElement(name = "CURRENCY", required = true)
    protected CurrencyType currency;
    @XmlElement(name = "VALUE")
    protected double value;

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
     * Gets the value of the value property.
     * 
     */
    public double getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setVALUE(double value) {
        this.value = value;
    }

}
