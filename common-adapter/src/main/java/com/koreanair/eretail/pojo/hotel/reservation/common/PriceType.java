
package com.koreanair.eretail.pojo.hotel.reservation.common;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}SimplePriceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType", propOrder = {
    "exchangerate"
})
@XmlSeeAlso({
    PriceWithMarkupType.class
})
public class PriceType
    extends SimplePriceType
    implements Serializable
{

    @XmlElement(name = "EXCHANGE_RATE")
    protected BigDecimal exchangerate;

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
