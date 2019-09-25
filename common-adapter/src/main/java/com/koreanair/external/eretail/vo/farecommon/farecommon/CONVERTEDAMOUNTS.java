
package com.koreanair.external.eretail.vo.farecommon.farecommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TOTAL_AMOUNT" type="{}TYPED_AMOUNT_Type"/&gt;
 *         &lt;element name="TOTAL_TAX" type="{}TYPED_AMOUNT_Type"/&gt;
 *         &lt;element name="AMOUNT_WITHOUT_TAX" type="{}TYPED_AMOUNT_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "totalamount",
    "totaltax",
    "amountwithouttax"
})
@XmlRootElement(name = "CONVERTED_AMOUNTS")
public class CONVERTEDAMOUNTS
    implements Serializable
{

    @XmlElement(name = "TOTAL_AMOUNT", required = true)
    protected TYPEDAMOUNTType totalamount;
    @XmlElement(name = "TOTAL_TAX", required = true)
    protected TYPEDAMOUNTType totaltax;
    @XmlElement(name = "AMOUNT_WITHOUT_TAX", required = true)
    protected TYPEDAMOUNTType amountwithouttax;

    /**
     * Gets the value of the totalamount property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public TYPEDAMOUNTType getTOTALAMOUNT() {
        return totalamount;
    }

    /**
     * Sets the value of the totalamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public void setTOTALAMOUNT(TYPEDAMOUNTType value) {
        this.totalamount = value;
    }

    /**
     * Gets the value of the totaltax property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public TYPEDAMOUNTType getTOTALTAX() {
        return totaltax;
    }

    /**
     * Sets the value of the totaltax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public void setTOTALTAX(TYPEDAMOUNTType value) {
        this.totaltax = value;
    }

    /**
     * Gets the value of the amountwithouttax property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public TYPEDAMOUNTType getAMOUNTWITHOUTTAX() {
        return amountwithouttax;
    }

    /**
     * Sets the value of the amountwithouttax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public void setAMOUNTWITHOUTTAX(TYPEDAMOUNTType value) {
        this.amountwithouttax = value;
    }

}
