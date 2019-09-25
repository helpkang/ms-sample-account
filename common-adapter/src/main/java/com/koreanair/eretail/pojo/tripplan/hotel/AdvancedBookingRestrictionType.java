
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvancedBookingRestrictionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvancedBookingRestrictionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOOKABLE_FROM" type="{}DateDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="OFFSET_MAX" type="{}TimeDetailType" minOccurs="0"/&gt;
 *         &lt;element name="BOOKABLE_TO" type="{}DateDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="OFFSET_MIN" type="{}TimeDetailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvancedBookingRestrictionType", propOrder = {
    "bookablefrom",
    "offsetmax",
    "bookableto",
    "offsetmin"
})
public class AdvancedBookingRestrictionType
    implements Serializable
{

    @XmlElement(name = "BOOKABLE_FROM")
    protected DateDescriptionType bookablefrom;
    @XmlElement(name = "OFFSET_MAX")
    protected TimeDetailType offsetmax;
    @XmlElement(name = "BOOKABLE_TO")
    protected DateDescriptionType bookableto;
    @XmlElement(name = "OFFSET_MIN")
    protected TimeDetailType offsetmin;

    /**
     * Gets the value of the bookablefrom property.
     * 
     * @return
     *     possible object is
     *     {@link DateDescriptionType }
     *     
     */
    public DateDescriptionType getBOOKABLEFROM() {
        return bookablefrom;
    }

    /**
     * Sets the value of the bookablefrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateDescriptionType }
     *     
     */
    public void setBOOKABLEFROM(DateDescriptionType value) {
        this.bookablefrom = value;
    }

    /**
     * Gets the value of the offsetmax property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDetailType }
     *     
     */
    public TimeDetailType getOFFSETMAX() {
        return offsetmax;
    }

    /**
     * Sets the value of the offsetmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDetailType }
     *     
     */
    public void setOFFSETMAX(TimeDetailType value) {
        this.offsetmax = value;
    }

    /**
     * Gets the value of the bookableto property.
     * 
     * @return
     *     possible object is
     *     {@link DateDescriptionType }
     *     
     */
    public DateDescriptionType getBOOKABLETO() {
        return bookableto;
    }

    /**
     * Sets the value of the bookableto property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateDescriptionType }
     *     
     */
    public void setBOOKABLETO(DateDescriptionType value) {
        this.bookableto = value;
    }

    /**
     * Gets the value of the offsetmin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDetailType }
     *     
     */
    public TimeDetailType getOFFSETMIN() {
        return offsetmin;
    }

    /**
     * Sets the value of the offsetmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDetailType }
     *     
     */
    public void setOFFSETMIN(TimeDetailType value) {
        this.offsetmin = value;
    }

}
