
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of traveller's preferences
 * 
 * <p>Java class for LIST_TRAVELLER_PREFERENCE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRAVELLER_PREFERENCE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LIST_HOTEL_CHAINS" minOccurs="0"/&gt;
 *         &lt;element ref="{}HOTEL_NAME" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FACILITIES" minOccurs="0"/&gt;
 *         &lt;element ref="{}MAXIMUM_PRICE" minOccurs="0"/&gt;
 *         &lt;element ref="{}TRAVELLER_ROOM_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TRAVELLER_PREFERENCE_TYPE", propOrder = {
    "listhotelchains",
    "hotelname",
    "listfacilities",
    "maximumprice",
    "travellerroomtype"
})
public class LISTTRAVELLERPREFERENCETYPE
    implements Serializable
{

    @XmlElement(name = "LIST_HOTEL_CHAINS")
    protected PREFERENCETYPE listhotelchains;
    @XmlElement(name = "HOTEL_NAME")
    protected PREFERENCETYPE hotelname;
    @XmlElement(name = "LIST_FACILITIES")
    protected PREFERENCETYPE listfacilities;
    @XmlElement(name = "MAXIMUM_PRICE")
    protected PREFERENCETYPE maximumprice;
    @XmlElement(name = "TRAVELLER_ROOM_TYPE")
    protected PREFERENCETYPE travellerroomtype;

    /**
     * Gets the value of the listhotelchains property.
     * 
     * @return
     *     possible object is
     *     {@link PREFERENCETYPE }
     *     
     */
    public PREFERENCETYPE getLISTHOTELCHAINS() {
        return listhotelchains;
    }

    /**
     * Sets the value of the listhotelchains property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREFERENCETYPE }
     *     
     */
    public void setLISTHOTELCHAINS(PREFERENCETYPE value) {
        this.listhotelchains = value;
    }

    /**
     * Gets the value of the hotelname property.
     * 
     * @return
     *     possible object is
     *     {@link PREFERENCETYPE }
     *     
     */
    public PREFERENCETYPE getHOTELNAME() {
        return hotelname;
    }

    /**
     * Sets the value of the hotelname property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREFERENCETYPE }
     *     
     */
    public void setHOTELNAME(PREFERENCETYPE value) {
        this.hotelname = value;
    }

    /**
     * Gets the value of the listfacilities property.
     * 
     * @return
     *     possible object is
     *     {@link PREFERENCETYPE }
     *     
     */
    public PREFERENCETYPE getLISTFACILITIES() {
        return listfacilities;
    }

    /**
     * Sets the value of the listfacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREFERENCETYPE }
     *     
     */
    public void setLISTFACILITIES(PREFERENCETYPE value) {
        this.listfacilities = value;
    }

    /**
     * Gets the value of the maximumprice property.
     * 
     * @return
     *     possible object is
     *     {@link PREFERENCETYPE }
     *     
     */
    public PREFERENCETYPE getMAXIMUMPRICE() {
        return maximumprice;
    }

    /**
     * Sets the value of the maximumprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREFERENCETYPE }
     *     
     */
    public void setMAXIMUMPRICE(PREFERENCETYPE value) {
        this.maximumprice = value;
    }

    /**
     * Gets the value of the travellerroomtype property.
     * 
     * @return
     *     possible object is
     *     {@link PREFERENCETYPE }
     *     
     */
    public PREFERENCETYPE getTRAVELLERROOMTYPE() {
        return travellerroomtype;
    }

    /**
     * Sets the value of the travellerroomtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREFERENCETYPE }
     *     
     */
    public void setTRAVELLERROOMTYPE(PREFERENCETYPE value) {
        this.travellerroomtype = value;
    }

}
