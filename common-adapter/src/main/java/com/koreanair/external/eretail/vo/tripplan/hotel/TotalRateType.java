
package com.koreanair.external.eretail.vo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.reservation.common.PriceType;


/**
 * <p>Java class for TotalRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PriceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAX_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalRateType", propOrder = {
    "taxindicator"
})
public class TotalRateType
    extends PriceType
    implements Serializable
{

    @XmlElement(name = "TAX_INDICATOR")
    protected String taxindicator;

    /**
     * Gets the value of the taxindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXINDICATOR() {
        return taxindicator;
    }

    /**
     * Sets the value of the taxindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXINDICATOR(String value) {
        this.taxindicator = value;
    }

}
