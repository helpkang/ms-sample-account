
package com.koreanair.external.eretail.vo.payment.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AMOUNTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMOUNTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CURRENCY" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMOUNTType", propOrder = {
    "currency",
    "amount"
})
public class AMOUNTType
    implements Serializable
{

    @XmlElement(name = "CURRENCY", required = true)
    protected String currency;
    @XmlElement(name = "AMOUNT")
    protected float amount;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public float getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAMOUNT(float value) {
        this.amount = value;
    }

}