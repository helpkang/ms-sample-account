
package com.koreanair.eretail.pojo.farecommon.farecontext;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.travellercommon.COUPONINFOSEGMENTType;
import com.koreanair.eretail.pojo.farecommon.travellercommon.DISCOUNTINFOPTCSEGMENTType;


/**
 *  CR05708699. Element to contain all discount information associated to a traveller and to one segment or all. Note: New version of DISCOUNT_INFO_Type defined in TravellerCommon but
 * 
 * <p>Java class for DISCOUNT_INFO_TRAVELLER_SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DISCOUNT_INFO_TRAVELLER_SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PTC_INFO" type="{}DISCOUNT_INFO_PTC_SEGMENT_Type" minOccurs="0"/&gt;
 *         &lt;element name="COUPON_INFO" type="{}COUPON_INFO_SEGMENT_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISCOUNT_INFO_TRAVELLER_SEGMENT_Type", propOrder = {
    "ptcinfo",
    "couponinfo"
})
public class DISCOUNTINFOTRAVELLERSEGMENTType
    implements Serializable
{

    @XmlElement(name = "PTC_INFO")
    protected DISCOUNTINFOPTCSEGMENTType ptcinfo;
    @XmlElement(name = "COUPON_INFO")
    protected COUPONINFOSEGMENTType couponinfo;

    /**
     * Gets the value of the ptcinfo property.
     * 
     * @return
     *     possible object is
     *     {@link DISCOUNTINFOPTCSEGMENTType }
     *     
     */
    public DISCOUNTINFOPTCSEGMENTType getPTCINFO() {
        return ptcinfo;
    }

    /**
     * Sets the value of the ptcinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOUNTINFOPTCSEGMENTType }
     *     
     */
    public void setPTCINFO(DISCOUNTINFOPTCSEGMENTType value) {
        this.ptcinfo = value;
    }

    /**
     * Gets the value of the couponinfo property.
     * 
     * @return
     *     possible object is
     *     {@link COUPONINFOSEGMENTType }
     *     
     */
    public COUPONINFOSEGMENTType getCOUPONINFO() {
        return couponinfo;
    }

    /**
     * Sets the value of the couponinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link COUPONINFOSEGMENTType }
     *     
     */
    public void setCOUPONINFO(COUPONINFOSEGMENTType value) {
        this.couponinfo = value;
    }

}
