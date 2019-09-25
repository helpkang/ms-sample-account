
package com.koreanair.eretail.pojo.fare.commoninput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Element to contain all discount information associated to a traveller
 * 			
 * 
 * <p>Java class for DISCOUNT_INFO_DirectFare_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DISCOUNT_INFO_DirectFare_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PTC_INFO" type="{}DISCOUNT_INFO_PTC_DirectFare_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISCOUNT_INFO_DirectFare_Type", propOrder = {
    "ptcinfo"
})
public class DISCOUNTINFODirectFareType
    implements Serializable
{

    @XmlElement(name = "PTC_INFO")
    protected DISCOUNTINFOPTCDirectFareType ptcinfo;

    /**
     * Gets the value of the ptcinfo property.
     * 
     * @return
     *     possible object is
     *     {@link DISCOUNTINFOPTCDirectFareType }
     *     
     */
    public DISCOUNTINFOPTCDirectFareType getPTCINFO() {
        return ptcinfo;
    }

    /**
     * Sets the value of the ptcinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOUNTINFOPTCDirectFareType }
     *     
     */
    public void setPTCINFO(DISCOUNTINFOPTCDirectFareType value) {
        this.ptcinfo = value;
    }

}
