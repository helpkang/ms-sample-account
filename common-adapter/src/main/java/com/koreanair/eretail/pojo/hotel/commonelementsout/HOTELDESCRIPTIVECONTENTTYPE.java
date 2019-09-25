
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.common.AWARDTYPE;


/**
 * main type for all hotel descriptive content being returned by the HDP database
 * 
 * <p>Java class for HOTEL_DESCRIPTIVE_CONTENT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_DESCRIPTIVE_CONTENT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DISABLED_ACCESS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FEMA_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CHECKIN_TIME" type="{}timeType" minOccurs="0"/&gt;
 *         &lt;element name="CHECKOUT_TIME" type="{}timeType" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_NUMBER_ROOMS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CONTACT_DETAILS" type="{}CONTACT_DETAILS_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PAYMENT_METHOD" type="{}PAYMENT_METHOD_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SPOKEN_LANGUAGE" type="{}LANGUAGE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ARCHITECTURAL_STYLE" type="{}ARC_STYLE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ROOM_TYPE" type="{}ROOMS_DESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FACILITY" type="{}FACILITY_TYPE_AVAIL" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AREA_REFERENCE_POINT" type="{}REFERENCE_POINT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AREA_ATTRACTION" type="{}ATTRACTION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AREA_RECREATION" type="{}AREA_RECREATION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AWARD" type="{}AWARD_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_USER_REVIEW" type="{}USERS_REVIEWS_1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_INFO" type="{}HOTEL_INFO_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="SERVICES" type="{}SERVICES_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_LOYAL_PROGRAM" type="{}LOYAL_PROGRAM_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MEETING_FACILITIES" type="{}MEETING_FACILITIES_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="ROOM_FACILITIES" type="{}ROOM_FACILITIES_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="DINING_FACILITIES" type="{}DINING_FACILITIES_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="POLICIES" type="{}MISC_POLICIES_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_DESCRIPTIVE_CONTENT_TYPE", propOrder = {
    "disabledaccess",
    "femaindicator",
    "checkintime",
    "checkouttime",
    "totalnumberrooms",
    "listcontactdetails",
    "listpaymentmethod",
    "listspokenlanguage",
    "listarchitecturalstyle",
    "listroomtype",
    "listfacility",
    "listareareferencepoint",
    "listareaattraction",
    "listarearecreation",
    "listaward",
    "listuserreview",
    "hotelinfo",
    "services",
    "listloyalprogram",
    "meetingfacilities",
    "roomfacilities",
    "diningfacilities",
    "policies",
    "listdescription"
})
public class HOTELDESCRIPTIVECONTENTTYPE
    implements Serializable
{

    @XmlElement(name = "DISABLED_ACCESS")
    protected Boolean disabledaccess;
    @XmlElement(name = "FEMA_INDICATOR")
    protected Boolean femaindicator;
    @XmlElement(name = "CHECKIN_TIME")
    protected String checkintime;
    @XmlElement(name = "CHECKOUT_TIME")
    protected String checkouttime;
    @XmlElement(name = "TOTAL_NUMBER_ROOMS")
    protected BigInteger totalnumberrooms;
    @XmlElement(name = "LIST_CONTACT_DETAILS")
    protected List<CONTACTDETAILSTYPE> listcontactdetails;
    @XmlElement(name = "LIST_PAYMENT_METHOD")
    protected List<PAYMENTMETHODTYPE> listpaymentmethod;
    @XmlElement(name = "LIST_SPOKEN_LANGUAGE")
    protected List<LANGUAGETYPE> listspokenlanguage;
    @XmlElement(name = "LIST_ARCHITECTURAL_STYLE")
    protected List<ARCSTYLETYPE> listarchitecturalstyle;
    @XmlElement(name = "LIST_ROOM_TYPE")
    protected List<ROOMSDESCTYPE> listroomtype;
    @XmlElement(name = "LIST_FACILITY")
    protected List<FACILITYTYPEAVAIL> listfacility;
    @XmlElement(name = "LIST_AREA_REFERENCE_POINT")
    protected List<REFERENCEPOINTTYPE> listareareferencepoint;
    @XmlElement(name = "LIST_AREA_ATTRACTION")
    protected List<ATTRACTIONTYPE> listareaattraction;
    @XmlElement(name = "LIST_AREA_RECREATION")
    protected List<AREARECREATIONTYPE> listarearecreation;
    @XmlElement(name = "LIST_AWARD")
    protected List<AWARDTYPE> listaward;
    @XmlElement(name = "LIST_USER_REVIEW")
    protected List<USERSREVIEWS1> listuserreview;
    @XmlElement(name = "HOTEL_INFO")
    protected HOTELINFOTYPE hotelinfo;
    @XmlElement(name = "SERVICES")
    protected List<SERVICESTYPE> services;
    @XmlElement(name = "LIST_LOYAL_PROGRAM")
    protected List<LOYALPROGRAMTYPE> listloyalprogram;
    @XmlElement(name = "MEETING_FACILITIES")
    protected MEETINGFACILITIESTYPE meetingfacilities;
    @XmlElement(name = "ROOM_FACILITIES")
    protected ROOMFACILITIESTYPE roomfacilities;
    @XmlElement(name = "DINING_FACILITIES")
    protected DININGFACILITIESTYPE diningfacilities;
    @XmlElement(name = "POLICIES")
    protected MISCPOLICIESTYPE policies;
    @XmlElement(name = "LIST_DESCRIPTION")
    protected List<DESCRIPTIONMULTDESCTYPE> listdescription;

    /**
     * Gets the value of the disabledaccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISABLEDACCESS() {
        return disabledaccess;
    }

    /**
     * Sets the value of the disabledaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISABLEDACCESS(Boolean value) {
        this.disabledaccess = value;
    }

    /**
     * Gets the value of the femaindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFEMAINDICATOR() {
        return femaindicator;
    }

    /**
     * Sets the value of the femaindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFEMAINDICATOR(Boolean value) {
        this.femaindicator = value;
    }

    /**
     * Gets the value of the checkintime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKINTIME() {
        return checkintime;
    }

    /**
     * Sets the value of the checkintime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKINTIME(String value) {
        this.checkintime = value;
    }

    /**
     * Gets the value of the checkouttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKOUTTIME() {
        return checkouttime;
    }

    /**
     * Sets the value of the checkouttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKOUTTIME(String value) {
        this.checkouttime = value;
    }

    /**
     * Gets the value of the totalnumberrooms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTOTALNUMBERROOMS() {
        return totalnumberrooms;
    }

    /**
     * Sets the value of the totalnumberrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTOTALNUMBERROOMS(BigInteger value) {
        this.totalnumberrooms = value;
    }

    /**
     * Gets the value of the listcontactdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcontactdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCONTACTDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONTACTDETAILSTYPE }
     * 
     * 
     */
    public List<CONTACTDETAILSTYPE> getLISTCONTACTDETAILS() {
        if (listcontactdetails == null) {
            listcontactdetails = new ArrayList<CONTACTDETAILSTYPE>();
        }
        return this.listcontactdetails;
    }

    /**
     * Gets the value of the listpaymentmethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpaymentmethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPAYMENTMETHOD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENTMETHODTYPE }
     * 
     * 
     */
    public List<PAYMENTMETHODTYPE> getLISTPAYMENTMETHOD() {
        if (listpaymentmethod == null) {
            listpaymentmethod = new ArrayList<PAYMENTMETHODTYPE>();
        }
        return this.listpaymentmethod;
    }

    /**
     * Gets the value of the listspokenlanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listspokenlanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSPOKENLANGUAGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LANGUAGETYPE }
     * 
     * 
     */
    public List<LANGUAGETYPE> getLISTSPOKENLANGUAGE() {
        if (listspokenlanguage == null) {
            listspokenlanguage = new ArrayList<LANGUAGETYPE>();
        }
        return this.listspokenlanguage;
    }

    /**
     * Gets the value of the listarchitecturalstyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listarchitecturalstyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTARCHITECTURALSTYLE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ARCSTYLETYPE }
     * 
     * 
     */
    public List<ARCSTYLETYPE> getLISTARCHITECTURALSTYLE() {
        if (listarchitecturalstyle == null) {
            listarchitecturalstyle = new ArrayList<ARCSTYLETYPE>();
        }
        return this.listarchitecturalstyle;
    }

    /**
     * Gets the value of the listroomtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listroomtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTROOMTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROOMSDESCTYPE }
     * 
     * 
     */
    public List<ROOMSDESCTYPE> getLISTROOMTYPE() {
        if (listroomtype == null) {
            listroomtype = new ArrayList<ROOMSDESCTYPE>();
        }
        return this.listroomtype;
    }

    /**
     * Gets the value of the listfacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFACILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FACILITYTYPEAVAIL }
     * 
     * 
     */
    public List<FACILITYTYPEAVAIL> getLISTFACILITY() {
        if (listfacility == null) {
            listfacility = new ArrayList<FACILITYTYPEAVAIL>();
        }
        return this.listfacility;
    }

    /**
     * Gets the value of the listareareferencepoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listareareferencepoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAREAREFERENCEPOINT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REFERENCEPOINTTYPE }
     * 
     * 
     */
    public List<REFERENCEPOINTTYPE> getLISTAREAREFERENCEPOINT() {
        if (listareareferencepoint == null) {
            listareareferencepoint = new ArrayList<REFERENCEPOINTTYPE>();
        }
        return this.listareareferencepoint;
    }

    /**
     * Gets the value of the listareaattraction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listareaattraction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAREAATTRACTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATTRACTIONTYPE }
     * 
     * 
     */
    public List<ATTRACTIONTYPE> getLISTAREAATTRACTION() {
        if (listareaattraction == null) {
            listareaattraction = new ArrayList<ATTRACTIONTYPE>();
        }
        return this.listareaattraction;
    }

    /**
     * Gets the value of the listarearecreation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listarearecreation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAREARECREATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AREARECREATIONTYPE }
     * 
     * 
     */
    public List<AREARECREATIONTYPE> getLISTAREARECREATION() {
        if (listarearecreation == null) {
            listarearecreation = new ArrayList<AREARECREATIONTYPE>();
        }
        return this.listarearecreation;
    }

    /**
     * Gets the value of the listaward property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaward property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAWARD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AWARDTYPE }
     * 
     * 
     */
    public List<AWARDTYPE> getLISTAWARD() {
        if (listaward == null) {
            listaward = new ArrayList<AWARDTYPE>();
        }
        return this.listaward;
    }

    /**
     * Gets the value of the listuserreview property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listuserreview property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTUSERREVIEW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link USERSREVIEWS1 }
     * 
     * 
     */
    public List<USERSREVIEWS1> getLISTUSERREVIEW() {
        if (listuserreview == null) {
            listuserreview = new ArrayList<USERSREVIEWS1>();
        }
        return this.listuserreview;
    }

    /**
     * Gets the value of the hotelinfo property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELINFOTYPE }
     *     
     */
    public HOTELINFOTYPE getHOTELINFO() {
        return hotelinfo;
    }

    /**
     * Sets the value of the hotelinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELINFOTYPE }
     *     
     */
    public void setHOTELINFO(HOTELINFOTYPE value) {
        this.hotelinfo = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSERVICES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICESTYPE }
     * 
     * 
     */
    public List<SERVICESTYPE> getSERVICES() {
        if (services == null) {
            services = new ArrayList<SERVICESTYPE>();
        }
        return this.services;
    }

    /**
     * Gets the value of the listloyalprogram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listloyalprogram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTLOYALPROGRAM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOYALPROGRAMTYPE }
     * 
     * 
     */
    public List<LOYALPROGRAMTYPE> getLISTLOYALPROGRAM() {
        if (listloyalprogram == null) {
            listloyalprogram = new ArrayList<LOYALPROGRAMTYPE>();
        }
        return this.listloyalprogram;
    }

    /**
     * Gets the value of the meetingfacilities property.
     * 
     * @return
     *     possible object is
     *     {@link MEETINGFACILITIESTYPE }
     *     
     */
    public MEETINGFACILITIESTYPE getMEETINGFACILITIES() {
        return meetingfacilities;
    }

    /**
     * Sets the value of the meetingfacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEETINGFACILITIESTYPE }
     *     
     */
    public void setMEETINGFACILITIES(MEETINGFACILITIESTYPE value) {
        this.meetingfacilities = value;
    }

    /**
     * Gets the value of the roomfacilities property.
     * 
     * @return
     *     possible object is
     *     {@link ROOMFACILITIESTYPE }
     *     
     */
    public ROOMFACILITIESTYPE getROOMFACILITIES() {
        return roomfacilities;
    }

    /**
     * Sets the value of the roomfacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROOMFACILITIESTYPE }
     *     
     */
    public void setROOMFACILITIES(ROOMFACILITIESTYPE value) {
        this.roomfacilities = value;
    }

    /**
     * Gets the value of the diningfacilities property.
     * 
     * @return
     *     possible object is
     *     {@link DININGFACILITIESTYPE }
     *     
     */
    public DININGFACILITIESTYPE getDININGFACILITIES() {
        return diningfacilities;
    }

    /**
     * Sets the value of the diningfacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link DININGFACILITIESTYPE }
     *     
     */
    public void setDININGFACILITIES(DININGFACILITIESTYPE value) {
        this.diningfacilities = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * @return
     *     possible object is
     *     {@link MISCPOLICIESTYPE }
     *     
     */
    public MISCPOLICIESTYPE getPOLICIES() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISCPOLICIESTYPE }
     *     
     */
    public void setPOLICIES(MISCPOLICIESTYPE value) {
        this.policies = value;
    }

    /**
     * Gets the value of the listdescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESCRIPTIONMULTDESCTYPE }
     * 
     * 
     */
    public List<DESCRIPTIONMULTDESCTYPE> getLISTDESCRIPTION() {
        if (listdescription == null) {
            listdescription = new ArrayList<DESCRIPTIONMULTDESCTYPE>();
        }
        return this.listdescription;
    }

}
