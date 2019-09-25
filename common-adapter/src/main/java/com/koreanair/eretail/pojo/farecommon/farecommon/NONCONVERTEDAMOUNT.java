
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigDecimal;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}AMOUNT"/&gt;
 *         &lt;element ref="{}TAX" minOccurs="0"/&gt;
 *         &lt;element ref="{}AMOUNT_WITHOUT_TAX" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "amount",
    "tax",
    "amountwithouttax"
})
@XmlRootElement(name = "NON_CONVERTED_AMOUNT")
public class NONCONVERTEDAMOUNT
    implements Serializable
{

    @XmlElement(name = "AMOUNT", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "TAX")
    protected BigDecimal tax;
    @XmlElement(name = "AMOUNT_WITHOUT_TAX")
    protected BigDecimal amountwithouttax;

    /**
     * The total non converted cash amount. In the cash to miles conversion, some parts of the fare are converted to miles, and some others are not. The non-converted amout is provided here. 
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNT(BigDecimal value) {
        this.amount = value;
    }

    /**
     * The total non converted taxes amount. In the cash to miles conversion, some taxes of the fare are converted and some are not. The non-converted taxes is provided here.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAX() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAX(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the amountwithouttax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTWITHOUTTAX() {
        return amountwithouttax;
    }

    /**
     * Sets the value of the amountwithouttax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTWITHOUTTAX(BigDecimal value) {
        this.amountwithouttax = value;
    }

}
