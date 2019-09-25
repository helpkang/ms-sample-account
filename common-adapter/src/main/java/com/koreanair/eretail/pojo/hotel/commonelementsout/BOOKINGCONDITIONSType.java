
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BOOKING_CONDITIONSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOOKING_CONDITIONSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOOKING_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="GUEST_INFORMATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOOKING_CONDITIONSType", propOrder = {
    "bookingtype",
    "guestinformation"
})
public class BOOKINGCONDITIONSType
    implements Serializable
{

    @XmlElement(name = "BOOKING_TYPE")
    protected String bookingtype;
    @XmlElement(name = "GUEST_INFORMATION")
    protected String guestinformation;

    /**
     * Gets the value of the bookingtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKINGTYPE() {
        return bookingtype;
    }

    /**
     * Sets the value of the bookingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKINGTYPE(String value) {
        this.bookingtype = value;
    }

    /**
     * Gets the value of the guestinformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUESTINFORMATION() {
        return guestinformation;
    }

    /**
     * Sets the value of the guestinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUESTINFORMATION(String value) {
        this.guestinformation = value;
    }

}
