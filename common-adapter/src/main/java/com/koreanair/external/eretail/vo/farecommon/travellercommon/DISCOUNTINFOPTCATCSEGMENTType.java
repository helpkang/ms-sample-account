
package com.koreanair.external.eretail.vo.farecommon.travellercommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element to contain all PTC discount information associated to a traveller without cumulating discounts with NM element.
 * 
 * <p>Java class for DISCOUNT_INFO_PTC_ATC_SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DISCOUNT_INFO_PTC_ATC_SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="LIST_PTC" type="{}DISCOUNT_INFO_PTC_LIST_PTC_Type"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="REQUEST_PREVIOUS_PTC" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISCOUNT_INFO_PTC_ATC_SEGMENT_Type", propOrder = {
    "listptc",
    "requestpreviousptc"
})
public class DISCOUNTINFOPTCATCSEGMENTType
    implements Serializable
{

    @XmlElement(name = "LIST_PTC")
    protected DISCOUNTINFOPTCLISTPTCType listptc;
    @XmlElement(name = "REQUEST_PREVIOUS_PTC")
    protected Boolean requestpreviousptc;

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

    /**
     * Gets the value of the requestpreviousptc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREQUESTPREVIOUSPTC() {
        return requestpreviousptc;
    }

    /**
     * Sets the value of the requestpreviousptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREQUESTPREVIOUSPTC(Boolean value) {
        this.requestpreviousptc = value;
    }

}
