
package com.koreanair.external.eretail.vo.tripplan.common.common_air_pricing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.AmountType;


/**
 * <p>Java class for REDEMPTION_CONVERSION_INFO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDEMPTION_CONVERSION_INFO_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POINTS_COST" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NON_CONVERTED_AMOUNT" type="{}amountType" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_IN_POINTS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REDEMPTION_CONVERSION_INFO_Type", propOrder = {
    "pointscost",
    "nonconvertedamount",
    "totalinpoints"
})
public class REDEMPTIONCONVERSIONINFOType
    implements Serializable
{

    @XmlElement(name = "POINTS_COST")
    protected Integer pointscost;
    @XmlElement(name = "NON_CONVERTED_AMOUNT")
    protected AmountType nonconvertedamount;
    @XmlElement(name = "TOTAL_IN_POINTS")
    protected Integer totalinpoints;

    /**
     * Gets the value of the pointscost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPOINTSCOST() {
        return pointscost;
    }

    /**
     * Sets the value of the pointscost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPOINTSCOST(Integer value) {
        this.pointscost = value;
    }

    /**
     * Gets the value of the nonconvertedamount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNONCONVERTEDAMOUNT() {
        return nonconvertedamount;
    }

    /**
     * Sets the value of the nonconvertedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNONCONVERTEDAMOUNT(AmountType value) {
        this.nonconvertedamount = value;
    }

    /**
     * Gets the value of the totalinpoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTOTALINPOINTS() {
        return totalinpoints;
    }

    /**
     * Sets the value of the totalinpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTOTALINPOINTS(Integer value) {
        this.totalinpoints = value;
    }

}
