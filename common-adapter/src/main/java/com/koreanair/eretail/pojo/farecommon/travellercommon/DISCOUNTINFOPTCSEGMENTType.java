
package com.koreanair.eretail.pojo.farecommon.travellercommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Only 1 PTC code is allowed per bound.
 * 
 * <p>Java class for DISCOUNT_INFO_PTC_SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DISCOUNT_INFO_PTC_SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_PTC" type="{}DISCOUNT_INFO_PTC_LIST_PTC_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISCOUNT_INFO_PTC_SEGMENT_Type", propOrder = {
    "listptc"
})
public class DISCOUNTINFOPTCSEGMENTType
    implements Serializable
{

    @XmlElement(name = "LIST_PTC", required = true)
    protected DISCOUNTINFOPTCLISTPTCType listptc;

    /**
     * Gets the value of the listptc property.
     * 
     * @return
     *     possible object is
     *     {@link DISCOUNTINFOPTCLISTPTCType }
     *     
     */
    public DISCOUNTINFOPTCLISTPTCType getLISTPTC() {
        return listptc;
    }

    /**
     * Sets the value of the listptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOUNTINFOPTCLISTPTCType }
     *     
     */
    public void setLISTPTC(DISCOUNTINFOPTCLISTPTCType value) {
        this.listptc = value;
    }

}
