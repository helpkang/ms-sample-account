
package com.koreanair.external.eretail.vo.farecommon.travellercommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element to contain all discount information associated to a traveller.  Note: For new version see DISCOUNT_INFO_TRAVELLER_SEGMENT_Type in FareCommon					
 * 
 * <p>Java class for DISCOUNT_INFO_ATC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DISCOUNT_INFO_ATC_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PTC_INFO" type="{}DISCOUNT_INFO_PTC_ATC_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISCOUNT_INFO_ATC_Type", propOrder = {
    "ptcinfo"
})
public class DISCOUNTINFOATCType
    implements Serializable
{

    @XmlElement(name = "PTC_INFO", required = true)
    protected DISCOUNTINFOPTCATCType ptcinfo;

    /**
     * Gets the value of the ptcinfo property.
     * 
     * @return
     *     possible object is
     *     {@link DISCOUNTINFOPTCATCType }
     *     
     */
    public DISCOUNTINFOPTCATCType getPTCINFO() {
        return ptcinfo;
    }

    /**
     * Sets the value of the ptcinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOUNTINFOPTCATCType }
     *     
     */
    public void setPTCINFO(DISCOUNTINFOPTCATCType value) {
        this.ptcinfo = value;
    }

}
