
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Hotel negotiated type
 * 
 * <p>Java class for HOTEL_NEGO_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_NEGO_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COMPANY" type="{}COMPANY_TYPE_1"/&gt;
 *         &lt;element name="HOTEL" type="{}HOTEL_SIMPLE_TYPE_NEGO"/&gt;
 *         &lt;element name="DISTANCE" type="{}DISTANCE_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="GEOCODE" type="{}GEOCODE_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="AREA" type="{}HTL_AREA_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="TRANSPORTATION" type="{}TRANSPORTATION_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_IN_POLICY" type="{}CHECK_IN_POLICY_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="HOST_CURRENCY_CONVERTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FEATURE_TO_CHECK" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_RATE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_AVAILABLE_RATE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DISPLAYED_RATE" type="{}HTL_RATE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_ROOM" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABILITY_STATUS" type="{}AVAILABILITY_STATUS_TYPE" minOccurs="0"/&gt;
 *         &lt;element ref="{}BEST_AVAILABLE_RATE" minOccurs="0"/&gt;
 *         &lt;element name="MULTIMEDIA" type="{}MULTIMEDIA_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="PRODUCT_CONDITIONS" type="{}PRODUCT_CONDITIONSType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_NEGO_TYPE", propOrder = {
    "company",
    "hotel",
    "distance",
    "geocode",
    "area",
    "transportation",
    "checkinpolicy",
    "hostcurrencyconverted",
    "listfeaturetocheck",
    "listrate",
    "listavailablerate",
    "listdisplayedrate",
    "listroom",
    "availabilitystatus",
    "bestavailablerate",
    "multimedia",
    "productconditions"
})
public class HOTELNEGOTYPE
    implements Serializable
{

    @XmlElement(name = "COMPANY", required = true)
    protected COMPANYTYPE1 company;
    @XmlElement(name = "HOTEL", required = true)
    protected HOTELSIMPLETYPENEGO hotel;
    @XmlElement(name = "DISTANCE")
    protected DISTANCETYPE distance;
    @XmlElement(name = "GEOCODE")
    protected GEOCODETYPE geocode;
    @XmlElement(name = "AREA")
    protected HTLAREATYPE area;
    @XmlElement(name = "TRANSPORTATION")
    protected TRANSPORTATIONTYPE transportation;
    @XmlElement(name = "CHECK_IN_POLICY")
    protected CHECKINPOLICYTYPE checkinpolicy;
    @XmlElement(name = "HOST_CURRENCY_CONVERTED")
    protected Boolean hostcurrencyconverted;
    @XmlElement(name = "LIST_FEATURE_TO_CHECK")
    protected List<String> listfeaturetocheck;
    @XmlElement(name = "LIST_RATE")
    protected List<LISTRATE> listrate;
    @XmlElement(name = "LIST_AVAILABLE_RATE")
    protected List<String> listavailablerate;
    @XmlElement(name = "LIST_DISPLAYED_RATE")
    protected List<HTLRATETYPE> listdisplayedrate;
    @XmlElement(name = "LIST_ROOM")
    protected List<LISTROOMITEMTYPE> listroom;
    @XmlElement(name = "AVAILABILITY_STATUS")
    protected AVAILABILITYSTATUSTYPE availabilitystatus;
    @XmlElement(name = "BEST_AVAILABLE_RATE")
    protected Boolean bestavailablerate;
    @XmlElement(name = "MULTIMEDIA")
    protected MULTIMEDIATYPE multimedia;
    @XmlElement(name = "PRODUCT_CONDITIONS")
    protected PRODUCTCONDITIONSType productconditions;

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
     *     {@link HOTELSIMPLETYPENEGO }
     *     
     */
    public HOTELSIMPLETYPENEGO getHOTEL() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELSIMPLETYPENEGO }
     *     
     */
    public void setHOTEL(HOTELSIMPLETYPENEGO value) {
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

    /**
     * Gets the value of the checkinpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link CHECKINPOLICYTYPE }
     *     
     */
    public CHECKINPOLICYTYPE getCHECKINPOLICY() {
        return checkinpolicy;
    }

    /**
     * Sets the value of the checkinpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHECKINPOLICYTYPE }
     *     
     */
    public void setCHECKINPOLICY(CHECKINPOLICYTYPE value) {
        this.checkinpolicy = value;
    }

    /**
     * Gets the value of the hostcurrencyconverted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHOSTCURRENCYCONVERTED() {
        return hostcurrencyconverted;
    }

    /**
     * Sets the value of the hostcurrencyconverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHOSTCURRENCYCONVERTED(Boolean value) {
        this.hostcurrencyconverted = value;
    }

    /**
     * Gets the value of the listfeaturetocheck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfeaturetocheck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFEATURETOCHECK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFEATURETOCHECK() {
        if (listfeaturetocheck == null) {
            listfeaturetocheck = new ArrayList<String>();
        }
        return this.listfeaturetocheck;
    }

    /**
     * Gets the value of the listrate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTRATE }
     * 
     * 
     */
    public List<LISTRATE> getLISTRATE() {
        if (listrate == null) {
            listrate = new ArrayList<LISTRATE>();
        }
        return this.listrate;
    }

    /**
     * Gets the value of the listavailablerate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listavailablerate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAVAILABLERATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTAVAILABLERATE() {
        if (listavailablerate == null) {
            listavailablerate = new ArrayList<String>();
        }
        return this.listavailablerate;
    }

    /**
     * Gets the value of the listdisplayedrate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdisplayedrate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISPLAYEDRATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HTLRATETYPE }
     * 
     * 
     */
    public List<HTLRATETYPE> getLISTDISPLAYEDRATE() {
        if (listdisplayedrate == null) {
            listdisplayedrate = new ArrayList<HTLRATETYPE>();
        }
        return this.listdisplayedrate;
    }

    /**
     * Gets the value of the listroom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listroom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTROOM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTROOMITEMTYPE }
     * 
     * 
     */
    public List<LISTROOMITEMTYPE> getLISTROOM() {
        if (listroom == null) {
            listroom = new ArrayList<LISTROOMITEMTYPE>();
        }
        return this.listroom;
    }

    /**
     * Gets the value of the availabilitystatus property.
     * 
     * @return
     *     possible object is
     *     {@link AVAILABILITYSTATUSTYPE }
     *     
     */
    public AVAILABILITYSTATUSTYPE getAVAILABILITYSTATUS() {
        return availabilitystatus;
    }

    /**
     * Sets the value of the availabilitystatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVAILABILITYSTATUSTYPE }
     *     
     */
    public void setAVAILABILITYSTATUS(AVAILABILITYSTATUSTYPE value) {
        this.availabilitystatus = value;
    }

    /**
     * Gets the value of the bestavailablerate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBESTAVAILABLERATE() {
        return bestavailablerate;
    }

    /**
     * Sets the value of the bestavailablerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBESTAVAILABLERATE(Boolean value) {
        this.bestavailablerate = value;
    }

    /**
     * Gets the value of the multimedia property.
     * 
     * @return
     *     possible object is
     *     {@link MULTIMEDIATYPE }
     *     
     */
    public MULTIMEDIATYPE getMULTIMEDIA() {
        return multimedia;
    }

    /**
     * Sets the value of the multimedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link MULTIMEDIATYPE }
     *     
     */
    public void setMULTIMEDIA(MULTIMEDIATYPE value) {
        this.multimedia = value;
    }

    /**
     * Gets the value of the productconditions property.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCTCONDITIONSType }
     *     
     */
    public PRODUCTCONDITIONSType getPRODUCTCONDITIONS() {
        return productconditions;
    }

    /**
     * Sets the value of the productconditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCTCONDITIONSType }
     *     
     */
    public void setPRODUCTCONDITIONS(PRODUCTCONDITIONSType value) {
        this.productconditions = value;
    }

}
