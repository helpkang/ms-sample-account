
package com.koreanair.eretail.pojo.farecommon.farecontext;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CR 05708699. Is the structure that contains different pricing options per traveler per segment. 
 * 
 * <p>Java class for LIST_TRAVELLER_SEGMENT_PRICING_OPTION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRAVELLER_SEGMENT_PRICING_OPTION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DISCOUNT_INFO" type="{}DISCOUNT_INFO_TRAVELLER_SEGMENT_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TRAVELLER_SEGMENT_PRICING_OPTION_Type", propOrder = {
    "discountinfo"
})
public class LISTTRAVELLERSEGMENTPRICINGOPTIONType
    implements Serializable
{

    @XmlElement(name = "DISCOUNT_INFO")
    protected DISCOUNTINFOTRAVELLERSEGMENTType discountinfo;

    /**
     * Gets the value of the discountinfo property.
     * 
     * @return
     *     possible object is
     *     {@link DISCOUNTINFOTRAVELLERSEGMENTType }
     *     
     */
    public DISCOUNTINFOTRAVELLERSEGMENTType getDISCOUNTINFO() {
        return discountinfo;
    }

    /**
     * Sets the value of the discountinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOUNTINFOTRAVELLERSEGMENTType }
     *     
     */
    public void setDISCOUNTINFO(DISCOUNTINFOTRAVELLERSEGMENTType value) {
        this.discountinfo = value;
    }

}
