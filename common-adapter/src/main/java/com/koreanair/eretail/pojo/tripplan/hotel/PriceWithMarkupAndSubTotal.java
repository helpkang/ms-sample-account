
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.reservation.common.PriceWithMarkupType;


/**
 * <p>Java class for PriceWithMarkupAndSubTotal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceWithMarkupAndSubTotal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PriceWithMarkupType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceWithMarkupAndSubTotal", propOrder = {
    "subtotal"
})
public class PriceWithMarkupAndSubTotal
    extends PriceWithMarkupType
    implements Serializable
{

    @XmlElement(name = "SUB_TOTAL")
    protected BigDecimal subtotal;

    /**
     * Gets the value of the subtotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSUBTOTAL() {
        return subtotal;
    }

    /**
     * Sets the value of the subtotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSUBTOTAL(BigDecimal value) {
        this.subtotal = value;
    }

}
