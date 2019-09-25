
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Hotel standard type used when availability data is not required
 * 
 * <p>Java class for HOTEL_STANDARD_SHORT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_STANDARD_SHORT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COMPANY" type="{}COMPANY_TYPE_1"/&gt;
 *         &lt;element name="HOTEL" type="{}HOTEL_SIMPLE_TYPE_NOAVAIL"/&gt;
 *         &lt;element name="DISTANCE" type="{}DISTANCE_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="GEOCODE" type="{}GEOCODE_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="AREA" type="{}HTL_AREA_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="TRANSPORTATION" type="{}TRANSPORTATION_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_STANDARD_SHORT_TYPE", propOrder = {
    "company",
    "hotel",
    "distance",
    "geocode",
    "area",
    "transportation"
})
public class HOTELSTANDARDSHORTTYPE
    implements Serializable
{

    @XmlElement(name = "COMPANY", required = true)
    protected COMPANYTYPE1 company;
    @XmlElement(name = "HOTEL", required = true)
    protected HOTELSIMPLETYPENOAVAIL hotel;
    @XmlElement(name = "DISTANCE")
    protected DISTANCETYPE distance;
    @XmlElement(name = "GEOCODE")
    protected GEOCODETYPE geocode;
    @XmlElement(name = "AREA")
    protected HTLAREATYPE area;
    @XmlElement(name = "TRANSPORTATION")
    protected TRANSPORTATIONTYPE transportation;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link COMPANYTYPE1 }
     *     
     */
    public COMPANYTYPE1 getCOMPANY() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPANYTYPE1 }
     *     
     */
    public void setCOMPANY(COMPANYTYPE1 value) {
        this.company = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELSIMPLETYPENOAVAIL }
     *     
     */
    public HOTELSIMPLETYPENOAVAIL getHOTEL() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELSIMPLETYPENOAVAIL }
     *     
     */
    public void setHOTEL(HOTELSIMPLETYPENOAVAIL value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link DISTANCETYPE }
     *     
     */
    public DISTANCETYPE getDISTANCE() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISTANCETYPE }
     *     
     */
    public void setDISTANCE(DISTANCETYPE value) {
        this.distance = value;
    }

    /**
     * Gets the value of the geocode property.
     * 
     * @return
     *     possible object is
     *     {@link GEOCODETYPE }
     *     
     */
    public GEOCODETYPE getGEOCODE() {
        return geocode;
    }

    /**
     * Sets the value of the geocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEOCODETYPE }
     *     
     */
    public void setGEOCODE(GEOCODETYPE value) {
        this.geocode = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link HTLAREATYPE }
     *     
     */
    public HTLAREATYPE getAREA() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTLAREATYPE }
     *     
     */
    public void setAREA(HTLAREATYPE value) {
        this.area = value;
    }

    /**
     * Gets the value of the transportation property.
     * 
     * @return
     *     possible object is
     *     {@link TRANSPORTATIONTYPE }
     *     
     */
    public TRANSPORTATIONTYPE getTRANSPORTATION() {
        return transportation;
    }

    /**
     * Sets the value of the transportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSPORTATIONTYPE }
     *     
     */
    public void setTRANSPORTATION(TRANSPORTATIONTYPE value) {
        this.transportation = value;
    }

}
