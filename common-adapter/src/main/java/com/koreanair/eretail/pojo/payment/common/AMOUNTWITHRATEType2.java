
package com.koreanair.eretail.pojo.payment.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AMOUNT_WITH_RATEType2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMOUNT_WITH_RATEType2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}AMOUNTType2"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMOUNT_WITH_RATEType2", propOrder = {
    "exchangerate"
})
public class AMOUNTWITHRATEType2
    extends AMOUNTType2
    implements Serializable
{

    @XmlElement(name = "EXCHANGE_RATE", required = true)
    protected Object exchangerate;

    /**
     * Gets the value of the exchangerate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEXCHANGERATE() {
        return exchangerate;
    }

    /**
     * Sets the value of the exchangerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEXCHANGERATE(Object value) {
        this.exchangerate = value;
    }

}
