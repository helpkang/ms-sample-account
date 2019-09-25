
package com.koreanair.external.eretail.vo.farecommon.farecontext;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CR 4958904. Element to contain all frequent flyer information associated to a traveller and to one segment or all.
 * 
 * <p>Java class for FREQUENT_FLYER_PRICING_OPTION_TRAVELLER_SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FREQUENT_FLYER_PRICING_OPTION_TRAVELLER_SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TIER_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FREQUENT_FLYER_PRICING_OPTION_TRAVELLER_SEGMENT_Type", propOrder = {
    "tierlevel"
})
public class FREQUENTFLYERPRICINGOPTIONTRAVELLERSEGMENTType
    implements Serializable
{

    @XmlElement(name = "TIER_LEVEL")
    protected String tierlevel;

    /**
     * Gets the value of the tierlevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIERLEVEL() {
        return tierlevel;
    }

    /**
     * Sets the value of the tierlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIERLEVEL(String value) {
        this.tierlevel = value;
    }

}
