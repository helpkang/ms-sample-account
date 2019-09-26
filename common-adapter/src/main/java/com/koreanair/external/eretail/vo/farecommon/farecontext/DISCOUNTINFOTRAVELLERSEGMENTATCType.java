
package com.koreanair.external.eretail.vo.farecommon.farecontext;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.COUPONINFOSEGMENTType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.DISCOUNTINFOPTCATCSEGMENTType;


/**
 *  CR06059358 ATC PTC handling-revenue domestic. Element to contain all discount information associated to a traveller and to one segment or all.
 * 
 * <p>Java class for DISCOUNT_INFO_TRAVELLER_SEGMENT_ATC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DISCOUNT_INFO_TRAVELLER_SEGMENT_ATC_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PTC_INFO" type="{}DISCOUNT_INFO_PTC_ATC_SEGMENT_Type" minOccurs="0"/&gt;
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
@XmlType(name = "DISCOUNT_INFO_TRAVELLER_SEGMENT_ATC_Type", propOrder = {
    "ptcinfo",
    "couponinfo"
})
public class DISCOUNTINFOTRAVELLERSEGMENTATCType
    implements Serializable
{

    @XmlElement(name = "PTC_INFO")
    protected DISCOUNTINFOPTCATCSEGMENTType ptcinfo;
    @XmlElement(name = "COUPON_INFO")
    protected COUPONINFOSEGMENTType couponinfo;

    /**
     * Gets the value of the ptcinfo property.
     * 
     * @return
     *     possible object is
     *     {@link DISCOUNTINFOPTCATCSEGMENTType }
     *     
     */
    public DISCOUNTINFOPTCATCSEGMENTType getPTCINFO() {
        return ptcinfo;
    }

    /**
     * Sets the value of the ptcinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOUNTINFOPTCATCSEGMENTType }
     *     
     */
    public void setPTCINFO(DISCOUNTINFOPTCATCSEGMENTType value) {
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