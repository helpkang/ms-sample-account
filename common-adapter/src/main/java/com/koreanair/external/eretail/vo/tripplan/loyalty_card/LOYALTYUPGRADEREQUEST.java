
package com.koreanair.external.eretail.vo.tripplan.loyalty_card;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOYALTY_UPGRADE_REQUEST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOYALTY_UPGRADE_REQUEST"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}LOYALTY_REDEMPTION_REQUEST"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ORIGINAL_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOYALTY_UPGRADE_REQUEST", propOrder = {
    "originalclass",
    "bookingclass"
})
public class LOYALTYUPGRADEREQUEST
    extends LOYALTYREDEMPTIONREQUEST
    implements Serializable
{

    @XmlElement(name = "ORIGINAL_CLASS")
    protected String originalclass;
    @XmlElement(name = "BOOKING_CLASS")
    protected String bookingclass;

    /**
     * Gets the value of the originalclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGINALCLASS() {
        return originalclass;
    }

    /**
     * Sets the value of the originalclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGINALCLASS(String value) {
        this.originalclass = value;
    }

    /**
     * Gets the value of the bookingclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKINGCLASS() {
        return bookingclass;
    }

    /**
     * Sets the value of the bookingclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKINGCLASS(String value) {
        this.bookingclass = value;
    }

}
