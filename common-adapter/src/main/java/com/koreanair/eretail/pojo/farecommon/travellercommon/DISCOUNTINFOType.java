
package com.koreanair.eretail.pojo.farecommon.travellercommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element to contain all discount information associated to a traveller.  Note: For new version see DISCOUNT_INFO_TRAVELLER_SEGMENT_Type in FareCommon					
 * 
 * <p>Java class for DISCOUNT_INFO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DISCOUNT_INFO_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PTC_INFO" type="{}DISCOUNT_INFO_PTC_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISCOUNT_INFO_Type", propOrder = {
    "ptcinfo"
})
public class DISCOUNTINFOType
    implements Serializable
{

    @XmlElement(name = "PTC_INFO", required = true)
    protected DISCOUNTINFOPTCType ptcinfo;

    /**
     * Gets the value of the ptcinfo property.
     * 
     * @return
     *     possible object is
     *     {@link DISCOUNTINFOPTCType }
     *     
     */
    public DISCOUNTINFOPTCType getPTCINFO() {
        return ptcinfo;
    }

    /**
     * Sets the value of the ptcinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOUNTINFOPTCType }
     *     
     */
    public void setPTCINFO(DISCOUNTINFOPTCType value) {
        this.ptcinfo = value;
    }

}
