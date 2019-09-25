
package com.koreanair.eretail.pojo.tripplan.etr_hotel;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CurrencyType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrCommonElementsType;


/**
 * <p>Java class for etrHotel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrHotel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}etrCommonElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HOTEL"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NAME" type="{}ETRHTL_unprotectedStringType"/&gt;
 *                   &lt;element name="GDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FIRST_ADDRESS_LINE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="SECOND_ADDRESS_LINE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="ZIP_CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="STATE_CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="COUNTRY_CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="CITY_NAME" type="{}ETRHTL_unprotectedStringType"/&gt;
 *                             &lt;element name="CITY_CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PHONE_NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                   &lt;element name="GEOCODE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LATITUDE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *                             &lt;element name="LONGITUDE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COMPANY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="ACCESS_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NAME" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="REF" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ROOM" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{}ETRHTL_unprotectedStringType"/&gt;
 *                             &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CATEGORY" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{}ETRHTL_unprotectedStringType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BED_TYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_SPECIAL_RATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MEAL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SOURCE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SERVICE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DESCRIPTION" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_PROVIDER_ROOM_RATE_DESCRIPTION" type="{}ETRHTL_unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CANCELLATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DESCRIPTION" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_RATE_INCLUSION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DESCRIPTION" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_OTHER_RULE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DESCRIPTION" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CHECKIN"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE" type="{}ETRHTL_OutputDateType"/&gt;
 *                   &lt;element name="TIME_LIMIT" type="{}ETRHTL_OutputDateType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CHECKOUT"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE" type="{}ETRHTL_OutputDateType"/&gt;
 *                   &lt;element name="TIME_LIMIT" type="{}ETRHTL_OutputDateType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PASSENGER_INFO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OCCUPANCY_ADULT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="OCCUPANCY_CHILD" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_CHILD_AGE" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GUARANTEE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PAYMENT_TYPE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="G"/&gt;
 *                         &lt;enumeration value="D"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PAYMENT_FORM" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="PAYMENT_DETAILS" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TAX" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BASE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SPECIAL_RATE_CODE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etrHotel", propOrder = {
    "hotel",
    "company",
    "room",
    "bedtype",
    "listspecialrate",
    "meal",
    "source",
    "bookingcode",
    "listservice",
    "listproviderroomratedescription",
    "listcancellation",
    "listrateinclusion",
    "listotherrule",
    "checkin",
    "checkout",
    "passengerinfo",
    "guarantee",
    "specialratecode"
})
public class EtrHotel
    extends EtrCommonElementsType
    implements Serializable
{

    @XmlElement(name = "HOTEL", required = true)
    protected EtrHotel.HOTEL hotel;
    @XmlElement(name = "COMPANY")
    protected EtrHotel.COMPANY company;
    @XmlElement(name = "ROOM")
    protected EtrHotel.ROOM room;
    @XmlElement(name = "BED_TYPE")
    protected EtrHotel.BEDTYPE bedtype;
    @XmlElement(name = "LIST_SPECIAL_RATE")
    protected List<String> listspecialrate;
    @XmlElement(name = "MEAL")
    protected EtrHotel.MEAL meal;
    @XmlElement(name = "SOURCE")
    protected String source;
    @XmlElement(name = "BOOKING_CODE")
    protected String bookingcode;
    @XmlElement(name = "LIST_SERVICE")
    protected List<EtrHotel.LISTSERVICE> listservice;
    @XmlElement(name = "LIST_PROVIDER_ROOM_RATE_DESCRIPTION")
    protected List<String> listproviderroomratedescription;
    @XmlElement(name = "LIST_CANCELLATION")
    protected List<EtrHotel.LISTCANCELLATION> listcancellation;
    @XmlElement(name = "LIST_RATE_INCLUSION")
    protected List<EtrHotel.LISTRATEINCLUSION> listrateinclusion;
    @XmlElement(name = "LIST_OTHER_RULE")
    protected List<EtrHotel.LISTOTHERRULE> listotherrule;
    @XmlElement(name = "CHECKIN", required = true)
    protected EtrHotel.CHECKIN checkin;
    @XmlElement(name = "CHECKOUT", required = true)
    protected EtrHotel.CHECKOUT checkout;
    @XmlElement(name = "PASSENGER_INFO")
    protected EtrHotel.PASSENGERINFO passengerinfo;
    @XmlElement(name = "GUARANTEE")
    protected EtrHotel.GUARANTEE guarantee;
    @XmlElement(name = "SPECIAL_RATE_CODE")
    protected EtrHotel.SPECIALRATECODE specialratecode;

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link EtrHotel.HOTEL }
     *     
     */
    public EtrHotel.HOTEL getHOTEL() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrHotel.HOTEL }
     *     
     */
    public void setHOTEL(EtrHotel.HOTEL value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link EtrHotel.COMPANY }
     *     
     */
    public EtrHotel.COMPANY getCOMPANY() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrHotel.COMPANY }
     *     
     */
    public void setCOMPANY(EtrHotel.COMPANY value) {
        this.company = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link EtrHotel.ROOM }
     *     
     */
    public EtrHotel.ROOM getROOM() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrHotel.ROOM }
     *     
     */
    public void setROOM(EtrHotel.ROOM value) {
        this.room = value;
    }

    /**
     * Gets the value of the bedtype property.
     * 
     * @return
     *     possible object is
     *     {@link EtrHotel.BEDTYPE }
     *     
     */
    public EtrHotel.BEDTYPE getBEDTYPE() {
        return bedtype;
    }

    /**
     * Sets the value of the bedtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrHotel.BEDTYPE }
     *     
     */
    public void setBEDTYPE(EtrHotel.BEDTYPE value) {
        this.bedtype = value;
    }

    /**
     * Gets the value of the listspecialrate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listspecialrate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSPECIALRATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTSPECIALRATE() {
        if (listspecialrate == null) {
            listspecialrate = new ArrayList<String>();
        }
        return this.listspecialrate;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link EtrHotel.MEAL }
     *     
     */
    public EtrHotel.MEAL getMEAL() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrHotel.MEAL }
     *     
     */
    public void setMEAL(EtrHotel.MEAL value) {
        this.meal = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCE(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the bookingcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKINGCODE() {
        return bookingcode;
    }

    /**
     * Sets the value of the bookingcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKINGCODE(String value) {
        this.bookingcode = value;
    }

    /**
     * Gets the value of the listservice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EtrHotel.LISTSERVICE }
     * 
     * 
     */
    public List<EtrHotel.LISTSERVICE> getLISTSERVICE() {
        if (listservice == null) {
            listservice = new ArrayList<EtrHotel.LISTSERVICE>();
        }
        return this.listservice;
    }

    /**
     * Gets the value of the listproviderroomratedescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproviderroomratedescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROVIDERROOMRATEDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTPROVIDERROOMRATEDESCRIPTION() {
        if (listproviderroomratedescription == null) {
            listproviderroomratedescription = new ArrayList<String>();
        }
        return this.listproviderroomratedescription;
    }

    /**
     * Gets the value of the listcancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCANCELLATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EtrHotel.LISTCANCELLATION }
     * 
     * 
     */
    public List<EtrHotel.LISTCANCELLATION> getLISTCANCELLATION() {
        if (listcancellation == null) {
            listcancellation = new ArrayList<EtrHotel.LISTCANCELLATION>();
        }
        return this.listcancellation;
    }

    /**
     * Gets the value of the listrateinclusion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrateinclusion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRATEINCLUSION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EtrHotel.LISTRATEINCLUSION }
     * 
     * 
     */
    public List<EtrHotel.LISTRATEINCLUSION> getLISTRATEINCLUSION() {
        if (listrateinclusion == null) {
            listrateinclusion = new ArrayList<EtrHotel.LISTRATEINCLUSION>();
        }
        return this.listrateinclusion;
    }

    /**
     * Gets the value of the listotherrule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listotherrule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOTHERRULE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EtrHotel.LISTOTHERRULE }
     * 
     * 
     */
    public List<EtrHotel.LISTOTHERRULE> getLISTOTHERRULE() {
        if (listotherrule == null) {
            listotherrule = new ArrayList<EtrHotel.LISTOTHERRULE>();
        }
        return this.listotherrule;
    }

    /**
     * Gets the value of the checkin property.
     * 
     * @return
     *     possible object is
     *     {@link EtrHotel.CHECKIN }
     *     
     */
    public EtrHotel.CHECKIN getCHECKIN() {
        return checkin;
    }

    /**
     * Sets the value of the checkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrHotel.CHECKIN }
     *     
     */
    public void setCHECKIN(EtrHotel.CHECKIN value) {
        this.checkin = value;
    }

    /**
     * Gets the value of the checkout property.
     * 
     * @return
     *     possible object is
     *     {@link EtrHotel.CHECKOUT }
     *     
     */
    public EtrHotel.CHECKOUT getCHECKOUT() {
        return checkout;
    }

    /**
     * Sets the value of the checkout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrHotel.CHECKOUT }
     *     
     */
    public void setCHECKOUT(EtrHotel.CHECKOUT value) {
        this.checkout = value;
    }

    /**
     * Gets the value of the passengerinfo property.
     * 
     * @return
     *     possible object is
     *     {@link EtrHotel.PASSENGERINFO }
     *     
     */
    public EtrHotel.PASSENGERINFO getPASSENGERINFO() {
        return passengerinfo;
    }

    /**
     * Sets the value of the passengerinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrHotel.PASSENGERINFO }
     *     
     */
    public void setPASSENGERINFO(EtrHotel.PASSENGERINFO value) {
        this.passengerinfo = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link EtrHotel.GUARANTEE }
     *     
     */
    public EtrHotel.GUARANTEE getGUARANTEE() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrHotel.GUARANTEE }
     *     
     */
    public void setGUARANTEE(EtrHotel.GUARANTEE value) {
        this.guarantee = value;
    }

    /**
     * Gets the value of the specialratecode property.
     * 
     * @return
     *     possible object is
     *     {@link EtrHotel.SPECIALRATECODE }
     *     
     */
    public EtrHotel.SPECIALRATECODE getSPECIALRATECODE() {
        return specialratecode;
    }

    /**
     * Sets the value of the specialratecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrHotel.SPECIALRATECODE }
     *     
     */
    public void setSPECIALRATECODE(EtrHotel.SPECIALRATECODE value) {
        this.specialratecode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "name"
    })
    public static class BEDTYPE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODE(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DATE" type="{}ETRHTL_OutputDateType"/&gt;
     *         &lt;element name="TIME_LIMIT" type="{}ETRHTL_OutputDateType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "date",
        "timelimit"
    })
    public static class CHECKIN
        implements Serializable
    {

        @XmlElement(name = "DATE", required = true)
        protected ETRHTLOutputDateType date;
        @XmlElement(name = "TIME_LIMIT")
        protected ETRHTLOutputDateType timelimit;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link ETRHTLOutputDateType }
         *     
         */
        public ETRHTLOutputDateType getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link ETRHTLOutputDateType }
         *     
         */
        public void setDATE(ETRHTLOutputDateType value) {
            this.date = value;
        }

        /**
         * Gets the value of the timelimit property.
         * 
         * @return
         *     possible object is
         *     {@link ETRHTLOutputDateType }
         *     
         */
        public ETRHTLOutputDateType getTIMELIMIT() {
            return timelimit;
        }

        /**
         * Sets the value of the timelimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ETRHTLOutputDateType }
         *     
         */
        public void setTIMELIMIT(ETRHTLOutputDateType value) {
            this.timelimit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DATE" type="{}ETRHTL_OutputDateType"/&gt;
     *         &lt;element name="TIME_LIMIT" type="{}ETRHTL_OutputDateType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "date",
        "timelimit"
    })
    public static class CHECKOUT
        implements Serializable
    {

        @XmlElement(name = "DATE", required = true)
        protected ETRHTLOutputDateType date;
        @XmlElement(name = "TIME_LIMIT")
        protected ETRHTLOutputDateType timelimit;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link ETRHTLOutputDateType }
         *     
         */
        public ETRHTLOutputDateType getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link ETRHTLOutputDateType }
         *     
         */
        public void setDATE(ETRHTLOutputDateType value) {
            this.date = value;
        }

        /**
         * Gets the value of the timelimit property.
         * 
         * @return
         *     possible object is
         *     {@link ETRHTLOutputDateType }
         *     
         */
        public ETRHTLOutputDateType getTIMELIMIT() {
            return timelimit;
        }

        /**
         * Sets the value of the timelimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ETRHTLOutputDateType }
         *     
         */
        public void setTIMELIMIT(ETRHTLOutputDateType value) {
            this.timelimit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="ACCESS_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NAME" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="REF" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "accesslevel",
        "name",
        "ref"
    })
    public static class COMPANY
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "ACCESS_LEVEL")
        protected String accesslevel;
        @XmlElement(name = "NAME")
        protected String name;
        @XmlElement(name = "REF")
        protected String ref;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODE(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the accesslevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCESSLEVEL() {
            return accesslevel;
        }

        /**
         * Sets the value of the accesslevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCESSLEVEL(String value) {
            this.accesslevel = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREF() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREF(String value) {
            this.ref = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PAYMENT_TYPE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="G"/&gt;
     *               &lt;enumeration value="D"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PAYMENT_FORM" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="PAYMENT_DETAILS" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TAX" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BASE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paymenttype",
        "paymentform",
        "paymentdetails",
        "currency",
        "amount",
        "listtax",
        "baseamount"
    })
    public static class GUARANTEE
        implements Serializable
    {

        @XmlElement(name = "PAYMENT_TYPE")
        protected String paymenttype;
        @XmlElement(name = "PAYMENT_FORM")
        protected String paymentform;
        @XmlElement(name = "PAYMENT_DETAILS")
        protected String paymentdetails;
        @XmlElement(name = "CURRENCY")
        protected CurrencyType currency;
        @XmlElement(name = "AMOUNT")
        protected String amount;
        @XmlElement(name = "LIST_TAX")
        protected List<EtrHotel.GUARANTEE.LISTTAX> listtax;
        @XmlElement(name = "BASE_AMOUNT")
        protected Object baseamount;

        /**
         * Gets the value of the paymenttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMENTTYPE() {
            return paymenttype;
        }

        /**
         * Sets the value of the paymenttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMENTTYPE(String value) {
            this.paymenttype = value;
        }

        /**
         * Gets the value of the paymentform property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMENTFORM() {
            return paymentform;
        }

        /**
         * Sets the value of the paymentform property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMENTFORM(String value) {
            this.paymentform = value;
        }

        /**
         * Gets the value of the paymentdetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMENTDETAILS() {
            return paymentdetails;
        }

        /**
         * Sets the value of the paymentdetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMENTDETAILS(String value) {
            this.paymentdetails = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyType }
         *     
         */
        public CurrencyType getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyType }
         *     
         */
        public void setCURRENCY(CurrencyType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMOUNT(String value) {
            this.amount = value;
        }

        /**
         * Gets the value of the listtax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTAX().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrHotel.GUARANTEE.LISTTAX }
         * 
         * 
         */
        public List<EtrHotel.GUARANTEE.LISTTAX> getLISTTAX() {
            if (listtax == null) {
                listtax = new ArrayList<EtrHotel.GUARANTEE.LISTTAX>();
            }
            return this.listtax;
        }

        /**
         * Gets the value of the baseamount property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getBASEAMOUNT() {
            return baseamount;
        }

        /**
         * Sets the value of the baseamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setBASEAMOUNT(Object value) {
            this.baseamount = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "amount",
            "currencycode",
            "type"
        })
        public static class LISTTAX
            implements Serializable
        {

            @XmlElement(name = "AMOUNT")
            protected Object amount;
            @XmlElement(name = "CURRENCY_CODE")
            protected Object currencycode;
            @XmlElement(name = "TYPE")
            protected Object type;

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getAMOUNT() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setAMOUNT(Object value) {
                this.amount = value;
            }

            /**
             * Gets the value of the currencycode property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCURRENCYCODE() {
                return currencycode;
            }

            /**
             * Sets the value of the currencycode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCURRENCYCODE(Object value) {
                this.currencycode = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTYPE(Object value) {
                this.type = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="NAME" type="{}ETRHTL_unprotectedStringType"/&gt;
     *         &lt;element name="GDS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FIRST_ADDRESS_LINE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="SECOND_ADDRESS_LINE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="ZIP_CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="STATE_CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="COUNTRY_CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="CITY_NAME" type="{}ETRHTL_unprotectedStringType"/&gt;
     *                   &lt;element name="CITY_CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PHONE_NUMBER" type="{}etrAlphaNumericType" minOccurs="0"/&gt;
     *         &lt;element name="GEOCODE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LATITUDE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
     *                   &lt;element name="LONGITUDE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "gdscode",
        "address",
        "phonenumber",
        "geocode"
    })
    public static class HOTEL
        implements Serializable
    {

        @XmlElement(name = "NAME", required = true)
        protected String name;
        @XmlElement(name = "GDS_CODE")
        protected String gdscode;
        @XmlElement(name = "ADDRESS", required = true)
        protected EtrHotel.HOTEL.ADDRESS address;
        @XmlElement(name = "PHONE_NUMBER")
        protected String phonenumber;
        @XmlElement(name = "GEOCODE")
        protected EtrHotel.HOTEL.GEOCODE geocode;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the gdscode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGDSCODE() {
            return gdscode;
        }

        /**
         * Sets the value of the gdscode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGDSCODE(String value) {
            this.gdscode = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link EtrHotel.HOTEL.ADDRESS }
         *     
         */
        public EtrHotel.HOTEL.ADDRESS getADDRESS() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link EtrHotel.HOTEL.ADDRESS }
         *     
         */
        public void setADDRESS(EtrHotel.HOTEL.ADDRESS value) {
            this.address = value;
        }

        /**
         * Gets the value of the phonenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPHONENUMBER() {
            return phonenumber;
        }

        /**
         * Sets the value of the phonenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPHONENUMBER(String value) {
            this.phonenumber = value;
        }

        /**
         * Gets the value of the geocode property.
         * 
         * @return
         *     possible object is
         *     {@link EtrHotel.HOTEL.GEOCODE }
         *     
         */
        public EtrHotel.HOTEL.GEOCODE getGEOCODE() {
            return geocode;
        }

        /**
         * Sets the value of the geocode property.
         * 
         * @param value
         *     allowed object is
         *     {@link EtrHotel.HOTEL.GEOCODE }
         *     
         */
        public void setGEOCODE(EtrHotel.HOTEL.GEOCODE value) {
            this.geocode = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="FIRST_ADDRESS_LINE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="SECOND_ADDRESS_LINE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="ZIP_CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="STATE_CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="COUNTRY_CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="CITY_NAME" type="{}ETRHTL_unprotectedStringType"/&gt;
         *         &lt;element name="CITY_CODE" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "firstaddressline",
            "secondaddressline",
            "zipcode",
            "statecode",
            "countrycode",
            "cityname",
            "citycode"
        })
        public static class ADDRESS
            implements Serializable
        {

            @XmlElement(name = "FIRST_ADDRESS_LINE")
            protected String firstaddressline;
            @XmlElement(name = "SECOND_ADDRESS_LINE")
            protected String secondaddressline;
            @XmlElement(name = "ZIP_CODE")
            protected String zipcode;
            @XmlElement(name = "STATE_CODE")
            protected String statecode;
            @XmlElement(name = "COUNTRY_CODE")
            protected String countrycode;
            @XmlElement(name = "CITY_NAME", required = true)
            protected String cityname;
            @XmlElement(name = "CITY_CODE")
            protected String citycode;

            /**
             * Gets the value of the firstaddressline property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFIRSTADDRESSLINE() {
                return firstaddressline;
            }

            /**
             * Sets the value of the firstaddressline property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFIRSTADDRESSLINE(String value) {
                this.firstaddressline = value;
            }

            /**
             * Gets the value of the secondaddressline property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSECONDADDRESSLINE() {
                return secondaddressline;
            }

            /**
             * Sets the value of the secondaddressline property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSECONDADDRESSLINE(String value) {
                this.secondaddressline = value;
            }

            /**
             * Gets the value of the zipcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZIPCODE() {
                return zipcode;
            }

            /**
             * Sets the value of the zipcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZIPCODE(String value) {
                this.zipcode = value;
            }

            /**
             * Gets the value of the statecode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATECODE() {
                return statecode;
            }

            /**
             * Sets the value of the statecode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATECODE(String value) {
                this.statecode = value;
            }

            /**
             * Gets the value of the countrycode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOUNTRYCODE() {
                return countrycode;
            }

            /**
             * Sets the value of the countrycode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOUNTRYCODE(String value) {
                this.countrycode = value;
            }

            /**
             * Gets the value of the cityname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCITYNAME() {
                return cityname;
            }

            /**
             * Sets the value of the cityname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCITYNAME(String value) {
                this.cityname = value;
            }

            /**
             * Gets the value of the citycode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCITYCODE() {
                return citycode;
            }

            /**
             * Sets the value of the citycode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCITYCODE(String value) {
                this.citycode = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="LATITUDE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
         *         &lt;element name="LONGITUDE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "latitude",
            "longitude"
        })
        public static class GEOCODE
            implements Serializable
        {

            @XmlElement(name = "LATITUDE")
            protected Float latitude;
            @XmlElement(name = "LONGITUDE")
            protected Float longitude;

            /**
             * Gets the value of the latitude property.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLATITUDE() {
                return latitude;
            }

            /**
             * Sets the value of the latitude property.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLATITUDE(Float value) {
                this.latitude = value;
            }

            /**
             * Gets the value of the longitude property.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLONGITUDE() {
                return longitude;
            }

            /**
             * Sets the value of the longitude property.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLONGITUDE(Float value) {
                this.longitude = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DESCRIPTION" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class LISTCANCELLATION
        implements Serializable
    {

        @XmlElement(name = "DESCRIPTION")
        protected String description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DESCRIPTION" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class LISTOTHERRULE
        implements Serializable
    {

        @XmlElement(name = "DESCRIPTION")
        protected String description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DESCRIPTION" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class LISTRATEINCLUSION
        implements Serializable
    {

        @XmlElement(name = "DESCRIPTION")
        protected String description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DESCRIPTION" type="{}ETRHTL_unprotectedStringType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class LISTSERVICE
        implements Serializable
    {

        @XmlElement(name = "DESCRIPTION")
        protected String description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "name"
    })
    public static class MEAL
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODE(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OCCUPANCY_ADULT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="OCCUPANCY_CHILD" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="LIST_CHILD_AGE" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "occupancyadult",
        "occupancychild",
        "listchildage"
    })
    public static class PASSENGERINFO
        implements Serializable
    {

        @XmlElement(name = "OCCUPANCY_ADULT")
        protected BigInteger occupancyadult;
        @XmlElement(name = "OCCUPANCY_CHILD")
        protected BigInteger occupancychild;
        @XmlElement(name = "LIST_CHILD_AGE")
        protected List<BigInteger> listchildage;

        /**
         * Gets the value of the occupancyadult property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOCCUPANCYADULT() {
            return occupancyadult;
        }

        /**
         * Sets the value of the occupancyadult property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOCCUPANCYADULT(BigInteger value) {
            this.occupancyadult = value;
        }

        /**
         * Gets the value of the occupancychild property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOCCUPANCYCHILD() {
            return occupancychild;
        }

        /**
         * Sets the value of the occupancychild property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOCCUPANCYCHILD(BigInteger value) {
            this.occupancychild = value;
        }

        /**
         * Gets the value of the listchildage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listchildage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCHILDAGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getLISTCHILDAGE() {
            if (listchildage == null) {
                listchildage = new ArrayList<BigInteger>();
            }
            return this.listchildage;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}ETRHTL_unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CATEGORY" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}ETRHTL_unprotectedStringType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type",
        "category"
    })
    public static class ROOM
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected EtrHotel.ROOM.TYPE type;
        @XmlElement(name = "CATEGORY")
        protected EtrHotel.ROOM.CATEGORY category;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link EtrHotel.ROOM.TYPE }
         *     
         */
        public EtrHotel.ROOM.TYPE getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link EtrHotel.ROOM.TYPE }
         *     
         */
        public void setTYPE(EtrHotel.ROOM.TYPE value) {
            this.type = value;
        }

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link EtrHotel.ROOM.CATEGORY }
         *     
         */
        public EtrHotel.ROOM.CATEGORY getCATEGORY() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link EtrHotel.ROOM.CATEGORY }
         *     
         */
        public void setCATEGORY(EtrHotel.ROOM.CATEGORY value) {
            this.category = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CODE" type="{}ETRHTL_unprotectedStringType"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code"
        })
        public static class CATEGORY
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODE(String value) {
                this.code = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CODE" type="{}ETRHTL_unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "name"
        })
        public static class TYPE
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "NAME")
            protected String name;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODE(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "name"
    })
    public static class SPECIALRATECODE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected Object code;
        @XmlElement(name = "NAME")
        protected Object name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCODE(Object value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNAME(Object value) {
            this.name = value;
        }

    }

}
