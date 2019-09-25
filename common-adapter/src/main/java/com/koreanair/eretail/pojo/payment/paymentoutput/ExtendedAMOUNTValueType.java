
package com.koreanair.eretail.pojo.payment.paymentoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedAMOUNTValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedAMOUNTValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="VALUE_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ABSOLUTE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedAMOUNTValueType", propOrder = {
    "value",
    "currency",
    "valuetype",
    "absoluteamount"
})
public class ExtendedAMOUNTValueType
    implements Serializable
{

    @XmlElement(name = "VALUE", required = true)
    protected Object value;
    @XmlElement(name = "CURRENCY")
    protected Object currency;
    @XmlElement(name = "VALUE_TYPE", required = true)
    protected Object valuetype;
    @XmlElement(name = "ABSOLUTE_AMOUNT")
    protected Object absoluteamount;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVALUE(Object value) {
        this.value = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCURRENCY(Object value) {
        this.currency = value;
    }

    /**
     * Gets the value of the valuetype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVALUETYPE() {
        return valuetype;
    }

    /**
     * Sets the value of the valuetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVALUETYPE(Object value) {
        this.valuetype = value;
    }

    /**
     * Gets the value of the absoluteamount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getABSOLUTEAMOUNT() {
        return absoluteamount;
    }

    /**
     * Sets the value of the absoluteamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setABSOLUTEAMOUNT(Object value) {
        this.absoluteamount = value;
    }

}
