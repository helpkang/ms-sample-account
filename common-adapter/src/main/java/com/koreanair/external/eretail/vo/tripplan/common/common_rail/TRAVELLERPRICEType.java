
package com.koreanair.external.eretail.vo.tripplan.common.common_rail;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Prices for one traveller in train offer.
 * 
 * <p>Java class for TRAVELLER_PRICE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAVELLER_PRICE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PRICE_Type_BASE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAVELLER_INDEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAVELLER_PRICE_Type", propOrder = {
    "travellerindex"
})
public class TRAVELLERPRICEType
    extends PRICETypeBASE
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_INDEX")
    protected String travellerindex;

    /**
     * Gets the value of the travellerindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERINDEX() {
        return travellerindex;
    }

    /**
     * Sets the value of the travellerindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERINDEX(String value) {
        this.travellerindex = value;
    }

}
