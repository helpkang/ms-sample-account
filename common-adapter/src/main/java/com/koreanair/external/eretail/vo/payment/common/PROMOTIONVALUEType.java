
package com.koreanair.external.eretail.vo.payment.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PROMOTIONVALUEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROMOTIONVALUEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VALUE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="CURRENCY" type="{}unprotectedStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROMOTIONVALUEType", propOrder = {
    "valuetype",
    "value",
    "currency"
})
public class PROMOTIONVALUEType
    implements Serializable
{

    @XmlElement(name = "VALUE_TYPE")
    protected String valuetype;
    @XmlElement(name = "VALUE")
    protected float value;
    @XmlElement(name = "CURRENCY", required = true)
    protected String currency;

    /**
     * Gets the value of the valuetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUETYPE() {
        return valuetype;
    }

    /**
     * Sets the value of the valuetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUETYPE(String value) {
        this.valuetype = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public float getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setVALUE(float value) {
        this.value = value;
    }

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

}
