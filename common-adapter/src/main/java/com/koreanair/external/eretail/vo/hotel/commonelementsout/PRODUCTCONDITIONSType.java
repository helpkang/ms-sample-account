
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * general information concerning pricing and booking a product.
 * 
 * <p>Java class for PRODUCT_CONDITIONSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRODUCT_CONDITIONSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRICING_INFORMATION" type="{}PRICING_INFORMATIONType" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_CONDITIONS" type="{}BOOKING_CONDITIONSType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRODUCT_CONDITIONSType", propOrder = {
    "pricinginformation",
    "bookingconditions"
})
public class PRODUCTCONDITIONSType
    implements Serializable
{

    @XmlElement(name = "PRICING_INFORMATION")
    protected PRICINGINFORMATIONType pricinginformation;
    @XmlElement(name = "BOOKING_CONDITIONS")
    protected BOOKINGCONDITIONSType bookingconditions;

    /**
     * Gets the value of the pricinginformation property.
     * 
     * @return
     *     possible object is
     *     {@link PRICINGINFORMATIONType }
     *     
     */
    public PRICINGINFORMATIONType getPRICINGINFORMATION() {
        return pricinginformation;
    }

    /**
     * Sets the value of the pricinginformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICINGINFORMATIONType }
     *     
     */
    public void setPRICINGINFORMATION(PRICINGINFORMATIONType value) {
        this.pricinginformation = value;
    }

    /**
     * Gets the value of the bookingconditions property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKINGCONDITIONSType }
     *     
     */
    public BOOKINGCONDITIONSType getBOOKINGCONDITIONS() {
        return bookingconditions;
    }

    /**
     * Sets the value of the bookingconditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKINGCONDITIONSType }
     *     
     */
    public void setBOOKINGCONDITIONS(BOOKINGCONDITIONSType value) {
        this.bookingconditions = value;
    }

}
