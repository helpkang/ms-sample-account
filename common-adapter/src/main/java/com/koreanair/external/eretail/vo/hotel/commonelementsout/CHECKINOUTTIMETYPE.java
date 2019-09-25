
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Times for check in and check out during your stay.
 * 
 * <p>Java class for CHECK_IN_OUT_TIME_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHECK_IN_OUT_TIME_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CHECK_IN" type="{}DATE_DESCRIPTION_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_OUT" type="{}DATE_DESCRIPTION_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHECK_IN_OUT_TIME_TYPE", propOrder = {
    "checkin",
    "checkout"
})
public class CHECKINOUTTIMETYPE
    implements Serializable
{

    @XmlElement(name = "CHECK_IN")
    protected DATEDESCRIPTIONTYPE checkin;
    @XmlElement(name = "CHECK_OUT")
    protected DATEDESCRIPTIONTYPE checkout;

    /**
     * Gets the value of the checkin property.
     * 
     * @return
     *     possible object is
     *     {@link DATEDESCRIPTIONTYPE }
     *     
     */
    public DATEDESCRIPTIONTYPE getCHECKIN() {
        return checkin;
    }

    /**
     * Sets the value of the checkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATEDESCRIPTIONTYPE }
     *     
     */
    public void setCHECKIN(DATEDESCRIPTIONTYPE value) {
        this.checkin = value;
    }

    /**
     * Gets the value of the checkout property.
     * 
     * @return
     *     possible object is
     *     {@link DATEDESCRIPTIONTYPE }
     *     
     */
    public DATEDESCRIPTIONTYPE getCHECKOUT() {
        return checkout;
    }

    /**
     * Sets the value of the checkout property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATEDESCRIPTIONTYPE }
     *     
     */
    public void setCHECKOUT(DATEDESCRIPTIONTYPE value) {
        this.checkout = value;
    }

}
