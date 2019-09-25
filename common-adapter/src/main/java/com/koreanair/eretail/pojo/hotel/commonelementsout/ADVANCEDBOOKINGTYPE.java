
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the period where the product can be booked.
 * 
 * <p>Java class for ADVANCED_BOOKING_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADVANCED_BOOKING_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOOKABLE_FROM" type="{}DATE_DESCRIPTION_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="OFFSET_MAX" type="{}OFFSET_TIME_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="BOOKABLE_TO" type="{}DATE_DESCRIPTION_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="OFFSET_MIN" type="{}OFFSET_TIME_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADVANCED_BOOKING_TYPE", propOrder = {
    "bookablefrom",
    "offsetmax",
    "bookableto",
    "offsetmin"
})
public class ADVANCEDBOOKINGTYPE
    implements Serializable
{

    @XmlElement(name = "BOOKABLE_FROM")
    protected DATEDESCRIPTIONTYPE bookablefrom;
    @XmlElement(name = "OFFSET_MAX")
    protected OFFSETTIMETYPE offsetmax;
    @XmlElement(name = "BOOKABLE_TO")
    protected DATEDESCRIPTIONTYPE bookableto;
    @XmlElement(name = "OFFSET_MIN")
    protected OFFSETTIMETYPE offsetmin;

    /**
     * Gets the value of the bookablefrom property.
     * 
     * @return
     *     possible object is
     *     {@link DATEDESCRIPTIONTYPE }
     *     
     */
    public DATEDESCRIPTIONTYPE getBOOKABLEFROM() {
        return bookablefrom;
    }

    /**
     * Sets the value of the bookablefrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATEDESCRIPTIONTYPE }
     *     
     */
    public void setBOOKABLEFROM(DATEDESCRIPTIONTYPE value) {
        this.bookablefrom = value;
    }

    /**
     * Gets the value of the offsetmax property.
     * 
     * @return
     *     possible object is
     *     {@link OFFSETTIMETYPE }
     *     
     */
    public OFFSETTIMETYPE getOFFSETMAX() {
        return offsetmax;
    }

    /**
     * Sets the value of the offsetmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFFSETTIMETYPE }
     *     
     */
    public void setOFFSETMAX(OFFSETTIMETYPE value) {
        this.offsetmax = value;
    }

    /**
     * Gets the value of the bookableto property.
     * 
     * @return
     *     possible object is
     *     {@link DATEDESCRIPTIONTYPE }
     *     
     */
    public DATEDESCRIPTIONTYPE getBOOKABLETO() {
        return bookableto;
    }

    /**
     * Sets the value of the bookableto property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATEDESCRIPTIONTYPE }
     *     
     */
    public void setBOOKABLETO(DATEDESCRIPTIONTYPE value) {
        this.bookableto = value;
    }

    /**
     * Gets the value of the offsetmin property.
     * 
     * @return
     *     possible object is
     *     {@link OFFSETTIMETYPE }
     *     
     */
    public OFFSETTIMETYPE getOFFSETMIN() {
        return offsetmin;
    }

    /**
     * Sets the value of the offsetmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFFSETTIMETYPE }
     *     
     */
    public void setOFFSETMIN(OFFSETTIMETYPE value) {
        this.offsetmin = value;
    }

}
