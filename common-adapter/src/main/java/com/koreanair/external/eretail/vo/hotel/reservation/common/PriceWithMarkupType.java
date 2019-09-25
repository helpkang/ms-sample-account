
package com.koreanair.external.eretail.vo.hotel.reservation.common;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Mark-up Price type
 * 
 * <p>Java class for PriceWithMarkupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceWithMarkupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PriceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRICE_WITH_MARKUP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceWithMarkupType", propOrder = {
    "pricewithmarkup"
})
public class PriceWithMarkupType
    extends PriceType
    implements Serializable
{

    @XmlElement(name = "PRICE_WITH_MARKUP")
    protected BigDecimal pricewithmarkup;

    /**
     * Gets the value of the pricewithmarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRICEWITHMARKUP() {
        return pricewithmarkup;
    }

    /**
     * Sets the value of the pricewithmarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRICEWITHMARKUP(BigDecimal value) {
        this.pricewithmarkup = value;
    }

}
