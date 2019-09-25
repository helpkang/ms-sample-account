
package com.koreanair.external.eretail.vo.tripplan.rail_data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.ACCOMMODATIONPREFERENCEType;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.ACCOMMODATIONType;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.DELIVERYINFORMATIONType;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.PAYMENTINFORMATIONType;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.RAILTICKETINFORMATIONType;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.SUPPLEMENTType;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.TRAINDISCOUNTCARDType;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.TRAINPRICEType;
import com.koreanair.external.eretail.vo.tripplan.common.common_rail.TRIPTYPEType;


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
 *         &lt;element ref="{}SYSTEM_PROVIDER"/&gt;
 *         &lt;element name="SEAT_ONLY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_RAIL_MODIFIED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="SEAT_ONLY"/&gt;
 *               &lt;enumeration value="TICKET_ONLY"/&gt;
 *               &lt;enumeration value="TICKET_WITH_SEAT"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRIP_TYPE" type="{}TRIP_TYPE_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}IS_ALTERNATE_STATION" minOccurs="0"/&gt;
 *         &lt;element name="PRICE" type="{}TRAIN_PRICE_Type"/&gt;
 *         &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}LIST_DISCOUNT_CARD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TRAVELLER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRAIN_PNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ADDITIONAL_BOOKING_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BOOKING_STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="PRE_BOOKED"/&gt;
 *               &lt;enumeration value="BOOKED"/&gt;
 *               &lt;enumeration value="MODIFIED"/&gt;
 *               &lt;enumeration value="CANCELLED"/&gt;
 *               &lt;enumeration value="REFUNDED"/&gt;
 *               &lt;enumeration value="TICKETED"/&gt;
 *               &lt;enumeration value="OTHER"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CANCELLATION_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAYMENT_INFORMATION" type="{}PAYMENT_INFORMATION_Type" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_INFORMATION" type="{}DELIVERY_INFORMATION_Type" minOccurs="0"/&gt;
 *         &lt;element name="TICKETING_TIME_LIMIT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_TICKETING_TIME_LIMIT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TICKETING_TIME_LIMIT" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_BOUND_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_BOUND_TATTOO" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_SUPPLEMENT_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_ACCOMMODATION_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QUEUES_RAIL" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}SYSTEM_PROVIDER" minOccurs="0"/&gt;
 *                   &lt;element name="RAIL_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RAIL_QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RAIL_TICKETING_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_TICKET_INFORMATION" type="{}RAIL_TICKET_INFORMATION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="METHOD_OF_TICKETING" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_PRINTER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TOD_PRINTER" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TOD_STATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMOTE_PRINTER_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SELECTED_PRINTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_SUPPLEMENT" type="{}SUPPLEMENT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ACCOMMODATION" type="{}ACCOMMODATION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ACCOMMODATION_PREFERENCE" type="{}ACCOMMODATION_PREFERENCE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ADDITIONAL_BOOKING_DATA" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ORDER_ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="LIST_PASSENGER_TATTOO" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="LIST_BOOKED_TRIP_TATTOO" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACC_SUPP_IN_PACKAGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELSHOPPER_TICKET" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="TICKETING_STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "systemprovider",
    "seatonly",
    "israilmodified",
    "bookingtype",
    "triptype",
    "isalternatestation",
    "price",
    "listtraveller",
    "trainpnr",
    "listadditionalbookingid",
    "bookingdate",
    "bookingstatus",
    "cancellationdate",
    "paymentinformation",
    "deliveryinformation",
    "ticketingtimelimit",
    "listticketingtimelimit",
    "queuesrail",
    "railticketinginformation",
    "listsupplement",
    "listaccommodation",
    "listaccommodationpreference",
    "listadditionalbookingdata",
    "accsuppinpackage",
    "travelshopperticket",
    "ticketingstatus"
})
@XmlRootElement(name = "RAIL_DATA")
public class RAILDATA
    implements Serializable
{

    @XmlElement(name = "SYSTEM_PROVIDER", required = true)
    protected String systemprovider;
    @XmlElement(name = "SEAT_ONLY")
    protected Boolean seatonly;
    @XmlElement(name = "IS_RAIL_MODIFIED")
    protected Boolean israilmodified;
    @XmlElement(name = "BOOKING_TYPE")
    protected String bookingtype;
    @XmlElement(name = "TRIP_TYPE")
    @XmlSchemaType(name = "string")
    protected TRIPTYPEType triptype;
    @XmlElement(name = "IS_ALTERNATE_STATION")
    protected Object isalternatestation;
    @XmlElement(name = "PRICE", required = true)
    protected TRAINPRICEType price;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<RAILDATA.LISTTRAVELLER> listtraveller;
    @XmlElement(name = "TRAIN_PNR")
    protected String trainpnr;
    @XmlElement(name = "LIST_ADDITIONAL_BOOKING_ID")
    protected List<String> listadditionalbookingid;
    @XmlElement(name = "BOOKING_DATE")
    protected RAILDATA.BOOKINGDATE bookingdate;
    @XmlElement(name = "BOOKING_STATUS")
    protected String bookingstatus;
    @XmlElement(name = "CANCELLATION_DATE")
    protected RAILDATA.CANCELLATIONDATE cancellationdate;
    @XmlElement(name = "PAYMENT_INFORMATION")
    protected PAYMENTINFORMATIONType paymentinformation;
    @XmlElement(name = "DELIVERY_INFORMATION")
    protected DELIVERYINFORMATIONType deliveryinformation;
    @XmlElement(name = "TICKETING_TIME_LIMIT")
    protected RAILDATA.TICKETINGTIMELIMIT ticketingtimelimit;
    @XmlElement(name = "LIST_TICKETING_TIME_LIMIT")
    protected List<RAILDATA.LISTTICKETINGTIMELIMIT> listticketingtimelimit;
    @XmlElement(name = "QUEUES_RAIL")
    protected List<RAILDATA.QUEUESRAIL> queuesrail;
    @XmlElement(name = "RAIL_TICKETING_INFORMATION")
    protected RAILDATA.RAILTICKETINGINFORMATION railticketinginformation;
    @XmlElement(name = "LIST_SUPPLEMENT")
    protected List<SUPPLEMENTType> listsupplement;
    @XmlElement(name = "LIST_ACCOMMODATION")
    protected List<ACCOMMODATIONType> listaccommodation;
    @XmlElement(name = "LIST_ACCOMMODATION_PREFERENCE")
    protected List<ACCOMMODATIONPREFERENCEType> listaccommodationpreference;
    @XmlElement(name = "LIST_ADDITIONAL_BOOKING_DATA")
    protected List<RAILDATA.LISTADDITIONALBOOKINGDATA> listadditionalbookingdata;
    @XmlElement(name = "ACC_SUPP_IN_PACKAGE")
    protected Boolean accsuppinpackage;
    @XmlElement(name = "TRAVELSHOPPER_TICKET")
    protected Byte travelshopperticket;
    @XmlElement(name = "TICKETING_STATUS")
    protected String ticketingstatus;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the systemprovider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSTEMPROVIDER() {
        return systemprovider;
    }

    /**
     * Sets the value of the systemprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSTEMPROVIDER(String value) {
        this.systemprovider = value;
    }

    /**
     * Gets the value of the seatonly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSEATONLY() {
        return seatonly;
    }

    /**
     * Sets the value of the seatonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSEATONLY(Boolean value) {
        this.seatonly = value;
    }

    /**
     * Gets the value of the israilmodified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISRAILMODIFIED() {
        return israilmodified;
    }

    /**
     * Sets the value of the israilmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISRAILMODIFIED(Boolean value) {
        this.israilmodified = value;
    }

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
     * Gets the value of the triptype property.
     * 
     * @return
     *     possible object is
     *     {@link TRIPTYPEType }
     *     
     */
    public TRIPTYPEType getTRIPTYPE() {
        return triptype;
    }

    /**
     * Sets the value of the triptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIPTYPEType }
     *     
     */
    public void setTRIPTYPE(TRIPTYPEType value) {
        this.triptype = value;
    }

    /**
     * Gets the value of the isalternatestation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISALTERNATESTATION() {
        return isalternatestation;
    }

    /**
     * Sets the value of the isalternatestation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISALTERNATESTATION(Object value) {
        this.isalternatestation = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINPRICEType }
     *     
     */
    public TRAINPRICEType getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINPRICEType }
     *     
     */
    public void setPRICE(TRAINPRICEType value) {
        this.price = value;
    }

    /**
     * Gets the value of the listtraveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtraveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAILDATA.LISTTRAVELLER }
     * 
     * 
     */
    public List<RAILDATA.LISTTRAVELLER> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<RAILDATA.LISTTRAVELLER>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the trainpnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAINPNR() {
        return trainpnr;
    }

    /**
     * Sets the value of the trainpnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAINPNR(String value) {
        this.trainpnr = value;
    }

    /**
     * Gets the value of the listadditionalbookingid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalbookingid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALBOOKINGID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTADDITIONALBOOKINGID() {
        if (listadditionalbookingid == null) {
            listadditionalbookingid = new ArrayList<String>();
        }
        return this.listadditionalbookingid;
    }

    /**
     * Gets the value of the bookingdate property.
     * 
     * @return
     *     possible object is
     *     {@link RAILDATA.BOOKINGDATE }
     *     
     */
    public RAILDATA.BOOKINGDATE getBOOKINGDATE() {
        return bookingdate;
    }

    /**
     * Sets the value of the bookingdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILDATA.BOOKINGDATE }
     *     
     */
    public void setBOOKINGDATE(RAILDATA.BOOKINGDATE value) {
        this.bookingdate = value;
    }

    /**
     * Gets the value of the bookingstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKINGSTATUS() {
        return bookingstatus;
    }

    /**
     * Sets the value of the bookingstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKINGSTATUS(String value) {
        this.bookingstatus = value;
    }

    /**
     * Gets the value of the cancellationdate property.
     * 
     * @return
     *     possible object is
     *     {@link RAILDATA.CANCELLATIONDATE }
     *     
     */
    public RAILDATA.CANCELLATIONDATE getCANCELLATIONDATE() {
        return cancellationdate;
    }

    /**
     * Sets the value of the cancellationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILDATA.CANCELLATIONDATE }
     *     
     */
    public void setCANCELLATIONDATE(RAILDATA.CANCELLATIONDATE value) {
        this.cancellationdate = value;
    }

    /**
     * Gets the value of the paymentinformation property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTINFORMATIONType }
     *     
     */
    public PAYMENTINFORMATIONType getPAYMENTINFORMATION() {
        return paymentinformation;
    }

    /**
     * Sets the value of the paymentinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTINFORMATIONType }
     *     
     */
    public void setPAYMENTINFORMATION(PAYMENTINFORMATIONType value) {
        this.paymentinformation = value;
    }

    /**
     * Gets the value of the deliveryinformation property.
     * 
     * @return
     *     possible object is
     *     {@link DELIVERYINFORMATIONType }
     *     
     */
    public DELIVERYINFORMATIONType getDELIVERYINFORMATION() {
        return deliveryinformation;
    }

    /**
     * Sets the value of the deliveryinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DELIVERYINFORMATIONType }
     *     
     */
    public void setDELIVERYINFORMATION(DELIVERYINFORMATIONType value) {
        this.deliveryinformation = value;
    }

    /**
     * Gets the value of the ticketingtimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link RAILDATA.TICKETINGTIMELIMIT }
     *     
     */
    public RAILDATA.TICKETINGTIMELIMIT getTICKETINGTIMELIMIT() {
        return ticketingtimelimit;
    }

    /**
     * Sets the value of the ticketingtimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILDATA.TICKETINGTIMELIMIT }
     *     
     */
    public void setTICKETINGTIMELIMIT(RAILDATA.TICKETINGTIMELIMIT value) {
        this.ticketingtimelimit = value;
    }

    /**
     * Gets the value of the listticketingtimelimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listticketingtimelimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTICKETINGTIMELIMIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAILDATA.LISTTICKETINGTIMELIMIT }
     * 
     * 
     */
    public List<RAILDATA.LISTTICKETINGTIMELIMIT> getLISTTICKETINGTIMELIMIT() {
        if (listticketingtimelimit == null) {
            listticketingtimelimit = new ArrayList<RAILDATA.LISTTICKETINGTIMELIMIT>();
        }
        return this.listticketingtimelimit;
    }

    /**
     * Gets the value of the queuesrail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queuesrail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQUEUESRAIL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAILDATA.QUEUESRAIL }
     * 
     * 
     */
    public List<RAILDATA.QUEUESRAIL> getQUEUESRAIL() {
        if (queuesrail == null) {
            queuesrail = new ArrayList<RAILDATA.QUEUESRAIL>();
        }
        return this.queuesrail;
    }

    /**
     * Gets the value of the railticketinginformation property.
     * 
     * @return
     *     possible object is
     *     {@link RAILDATA.RAILTICKETINGINFORMATION }
     *     
     */
    public RAILDATA.RAILTICKETINGINFORMATION getRAILTICKETINGINFORMATION() {
        return railticketinginformation;
    }

    /**
     * Sets the value of the railticketinginformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILDATA.RAILTICKETINGINFORMATION }
     *     
     */
    public void setRAILTICKETINGINFORMATION(RAILDATA.RAILTICKETINGINFORMATION value) {
        this.railticketinginformation = value;
    }

    /**
     * Gets the value of the listsupplement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsupplement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSUPPLEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SUPPLEMENTType }
     * 
     * 
     */
    public List<SUPPLEMENTType> getLISTSUPPLEMENT() {
        if (listsupplement == null) {
            listsupplement = new ArrayList<SUPPLEMENTType>();
        }
        return this.listsupplement;
    }

    /**
     * Gets the value of the listaccommodation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaccommodation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTACCOMMODATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACCOMMODATIONType }
     * 
     * 
     */
    public List<ACCOMMODATIONType> getLISTACCOMMODATION() {
        if (listaccommodation == null) {
            listaccommodation = new ArrayList<ACCOMMODATIONType>();
        }
        return this.listaccommodation;
    }

    /**
     * Gets the value of the listaccommodationpreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaccommodationpreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTACCOMMODATIONPREFERENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACCOMMODATIONPREFERENCEType }
     * 
     * 
     */
    public List<ACCOMMODATIONPREFERENCEType> getLISTACCOMMODATIONPREFERENCE() {
        if (listaccommodationpreference == null) {
            listaccommodationpreference = new ArrayList<ACCOMMODATIONPREFERENCEType>();
        }
        return this.listaccommodationpreference;
    }

    /**
     * Gets the value of the listadditionalbookingdata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalbookingdata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALBOOKINGDATA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAILDATA.LISTADDITIONALBOOKINGDATA }
     * 
     * 
     */
    public List<RAILDATA.LISTADDITIONALBOOKINGDATA> getLISTADDITIONALBOOKINGDATA() {
        if (listadditionalbookingdata == null) {
            listadditionalbookingdata = new ArrayList<RAILDATA.LISTADDITIONALBOOKINGDATA>();
        }
        return this.listadditionalbookingdata;
    }

    /**
     * Gets the value of the accsuppinpackage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCSUPPINPACKAGE() {
        return accsuppinpackage;
    }

    /**
     * Sets the value of the accsuppinpackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCSUPPINPACKAGE(Boolean value) {
        this.accsuppinpackage = value;
    }

    /**
     * Gets the value of the travelshopperticket property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTRAVELSHOPPERTICKET() {
        return travelshopperticket;
    }

    /**
     * Sets the value of the travelshopperticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTRAVELSHOPPERTICKET(Byte value) {
        this.travelshopperticket = value;
    }

    /**
     * Gets the value of the ticketingstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETINGSTATUS() {
        return ticketingstatus;
    }

    /**
     * Sets the value of the ticketingstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETINGSTATUS(String value) {
        this.ticketingstatus = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class BOOKINGDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * String type for value without CDATA
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CANCELLATIONDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * String type for value without CDATA
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
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
     *         &lt;element name="ORDER_ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="LIST_PASSENGER_TATTOO" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
     *         &lt;element name="LIST_BOOKED_TRIP_TATTOO" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
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
        "orderitemid",
        "listpassengertattoo",
        "listbookedtriptattoo"
    })
    public static class LISTADDITIONALBOOKINGDATA
        implements Serializable
    {

        @XmlElement(name = "ORDER_ITEM_ID")
        protected int orderitemid;
        @XmlElement(name = "LIST_PASSENGER_TATTOO", required = true)
        protected List<Object> listpassengertattoo;
        @XmlElement(name = "LIST_BOOKED_TRIP_TATTOO", required = true)
        protected List<Object> listbookedtriptattoo;

        /**
         * Gets the value of the orderitemid property.
         * 
         */
        public int getORDERITEMID() {
            return orderitemid;
        }

        /**
         * Sets the value of the orderitemid property.
         * 
         */
        public void setORDERITEMID(int value) {
            this.orderitemid = value;
        }

        /**
         * Gets the value of the listpassengertattoo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpassengertattoo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPASSENGERTATTOO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getLISTPASSENGERTATTOO() {
            if (listpassengertattoo == null) {
                listpassengertattoo = new ArrayList<Object>();
            }
            return this.listpassengertattoo;
        }

        /**
         * Gets the value of the listbookedtriptattoo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listbookedtriptattoo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTBOOKEDTRIPTATTOO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getLISTBOOKEDTRIPTATTOO() {
            if (listbookedtriptattoo == null) {
                listbookedtriptattoo = new ArrayList<Object>();
            }
            return this.listbookedtriptattoo;
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
     *         &lt;element name="TICKETING_TIME_LIMIT" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_BOUND_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_BOUND_TATTOO" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_SUPPLEMENT_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_ACCOMMODATION_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "ticketingtimelimit",
        "freetext",
        "tattoo",
        "listboundid",
        "listboundtattoo",
        "listsupplementid",
        "listaccommodationid"
    })
    public static class LISTTICKETINGTIMELIMIT
        implements Serializable
    {

        @XmlElement(name = "TICKETING_TIME_LIMIT")
        protected RAILDATA.LISTTICKETINGTIMELIMIT.TICKETINGTIMELIMIT ticketingtimelimit;
        @XmlElement(name = "FREE_TEXT")
        protected String freetext;
        @XmlElement(name = "TATTOO")
        protected String tattoo;
        @XmlElement(name = "LIST_BOUND_ID")
        protected List<String> listboundid;
        @XmlElement(name = "LIST_BOUND_TATTOO")
        protected List<String> listboundtattoo;
        @XmlElement(name = "LIST_SUPPLEMENT_ID")
        protected List<String> listsupplementid;
        @XmlElement(name = "LIST_ACCOMMODATION_ID")
        protected List<String> listaccommodationid;

        /**
         * Gets the value of the ticketingtimelimit property.
         * 
         * @return
         *     possible object is
         *     {@link RAILDATA.LISTTICKETINGTIMELIMIT.TICKETINGTIMELIMIT }
         *     
         */
        public RAILDATA.LISTTICKETINGTIMELIMIT.TICKETINGTIMELIMIT getTICKETINGTIMELIMIT() {
            return ticketingtimelimit;
        }

        /**
         * Sets the value of the ticketingtimelimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAILDATA.LISTTICKETINGTIMELIMIT.TICKETINGTIMELIMIT }
         *     
         */
        public void setTICKETINGTIMELIMIT(RAILDATA.LISTTICKETINGTIMELIMIT.TICKETINGTIMELIMIT value) {
            this.ticketingtimelimit = value;
        }

        /**
         * Gets the value of the freetext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFREETEXT() {
            return freetext;
        }

        /**
         * Sets the value of the freetext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFREETEXT(String value) {
            this.freetext = value;
        }

        /**
         * Gets the value of the tattoo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTATTOO() {
            return tattoo;
        }

        /**
         * Sets the value of the tattoo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTATTOO(String value) {
            this.tattoo = value;
        }

        /**
         * Gets the value of the listboundid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listboundid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTBOUNDID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTBOUNDID() {
            if (listboundid == null) {
                listboundid = new ArrayList<String>();
            }
            return this.listboundid;
        }

        /**
         * Gets the value of the listboundtattoo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listboundtattoo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTBOUNDTATTOO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTBOUNDTATTOO() {
            if (listboundtattoo == null) {
                listboundtattoo = new ArrayList<String>();
            }
            return this.listboundtattoo;
        }

        /**
         * Gets the value of the listsupplementid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listsupplementid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSUPPLEMENTID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTSUPPLEMENTID() {
            if (listsupplementid == null) {
                listsupplementid = new ArrayList<String>();
            }
            return this.listsupplementid;
        }

        /**
         * Gets the value of the listaccommodationid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listaccommodationid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTACCOMMODATIONID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTACCOMMODATIONID() {
            if (listaccommodationid == null) {
                listaccommodationid = new ArrayList<String>();
            }
            return this.listaccommodationid;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
         *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TICKETINGTIMELIMIT
            implements Serializable
        {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "code", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar code;

            /**
             * String type for value without CDATA
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCode(XMLGregorianCalendar value) {
                this.code = value;
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
     *         &lt;element ref="{}LIST_DISCOUNT_CARD" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TRAVELLER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "listdiscountcard",
        "travellertype"
    })
    public static class LISTTRAVELLER
        implements Serializable
    {

        @XmlElement(name = "LIST_DISCOUNT_CARD")
        protected List<TRAINDISCOUNTCARDType> listdiscountcard;
        @XmlElement(name = "TRAVELLER_TYPE")
        protected String travellertype;

        /**
         * Gets the value of the listdiscountcard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listdiscountcard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTDISCOUNTCARD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRAINDISCOUNTCARDType }
         * 
         * 
         */
        public List<TRAINDISCOUNTCARDType> getLISTDISCOUNTCARD() {
            if (listdiscountcard == null) {
                listdiscountcard = new ArrayList<TRAINDISCOUNTCARDType>();
            }
            return this.listdiscountcard;
        }

        /**
         * Gets the value of the travellertype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRAVELLERTYPE() {
            return travellertype;
        }

        /**
         * Sets the value of the travellertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRAVELLERTYPE(String value) {
            this.travellertype = value;
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
     *         &lt;element ref="{}SYSTEM_PROVIDER" minOccurs="0"/&gt;
     *         &lt;element name="RAIL_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RAIL_QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "systemprovider",
        "railofficeid",
        "railqueuenumber"
    })
    public static class QUEUESRAIL
        implements Serializable
    {

        @XmlElement(name = "SYSTEM_PROVIDER")
        protected String systemprovider;
        @XmlElement(name = "RAIL_OFFICE_ID")
        protected String railofficeid;
        @XmlElement(name = "RAIL_QUEUE_NUMBER")
        protected String railqueuenumber;

        /**
         * Gets the value of the systemprovider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSYSTEMPROVIDER() {
            return systemprovider;
        }

        /**
         * Sets the value of the systemprovider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSYSTEMPROVIDER(String value) {
            this.systemprovider = value;
        }

        /**
         * Gets the value of the railofficeid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRAILOFFICEID() {
            return railofficeid;
        }

        /**
         * Sets the value of the railofficeid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRAILOFFICEID(String value) {
            this.railofficeid = value;
        }

        /**
         * Gets the value of the railqueuenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRAILQUEUENUMBER() {
            return railqueuenumber;
        }

        /**
         * Sets the value of the railqueuenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRAILQUEUENUMBER(String value) {
            this.railqueuenumber = value;
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
     *         &lt;element name="LIST_TICKET_INFORMATION" type="{}RAIL_TICKET_INFORMATION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="METHOD_OF_TICKETING" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_PRINTER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TOD_PRINTER" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TOD_STATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMOTE_PRINTER_OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SELECTED_PRINTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "listticketinformation",
        "methodofticketing",
        "listprinter",
        "todprinter",
        "todstation",
        "remoteprinterofficeid",
        "selectedprinter"
    })
    public static class RAILTICKETINGINFORMATION
        implements Serializable
    {

        @XmlElement(name = "LIST_TICKET_INFORMATION")
        protected List<RAILTICKETINFORMATIONType> listticketinformation;
        @XmlElement(name = "METHOD_OF_TICKETING")
        protected Object methodofticketing;
        @XmlElement(name = "LIST_PRINTER")
        protected List<RAILDATA.RAILTICKETINGINFORMATION.LISTPRINTER> listprinter;
        @XmlElement(name = "TOD_PRINTER")
        protected RAILDATA.RAILTICKETINGINFORMATION.TODPRINTER todprinter;
        @XmlElement(name = "TOD_STATION")
        protected String todstation;
        @XmlElement(name = "REMOTE_PRINTER_OFFICE_ID")
        protected String remoteprinterofficeid;
        @XmlElement(name = "SELECTED_PRINTER")
        protected String selectedprinter;

        /**
         * Gets the value of the listticketinformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listticketinformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTICKETINFORMATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RAILTICKETINFORMATIONType }
         * 
         * 
         */
        public List<RAILTICKETINFORMATIONType> getLISTTICKETINFORMATION() {
            if (listticketinformation == null) {
                listticketinformation = new ArrayList<RAILTICKETINFORMATIONType>();
            }
            return this.listticketinformation;
        }

        /**
         * Gets the value of the methodofticketing property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMETHODOFTICKETING() {
            return methodofticketing;
        }

        /**
         * Sets the value of the methodofticketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMETHODOFTICKETING(Object value) {
            this.methodofticketing = value;
        }

        /**
         * Gets the value of the listprinter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listprinter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPRINTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RAILDATA.RAILTICKETINGINFORMATION.LISTPRINTER }
         * 
         * 
         */
        public List<RAILDATA.RAILTICKETINGINFORMATION.LISTPRINTER> getLISTPRINTER() {
            if (listprinter == null) {
                listprinter = new ArrayList<RAILDATA.RAILTICKETINGINFORMATION.LISTPRINTER>();
            }
            return this.listprinter;
        }

        /**
         * Gets the value of the todprinter property.
         * 
         * @return
         *     possible object is
         *     {@link RAILDATA.RAILTICKETINGINFORMATION.TODPRINTER }
         *     
         */
        public RAILDATA.RAILTICKETINGINFORMATION.TODPRINTER getTODPRINTER() {
            return todprinter;
        }

        /**
         * Sets the value of the todprinter property.
         * 
         * @param value
         *     allowed object is
         *     {@link RAILDATA.RAILTICKETINGINFORMATION.TODPRINTER }
         *     
         */
        public void setTODPRINTER(RAILDATA.RAILTICKETINGINFORMATION.TODPRINTER value) {
            this.todprinter = value;
        }

        /**
         * Gets the value of the todstation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTODSTATION() {
            return todstation;
        }

        /**
         * Sets the value of the todstation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTODSTATION(String value) {
            this.todstation = value;
        }

        /**
         * Gets the value of the remoteprinterofficeid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMOTEPRINTEROFFICEID() {
            return remoteprinterofficeid;
        }

        /**
         * Sets the value of the remoteprinterofficeid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMOTEPRINTEROFFICEID(String value) {
            this.remoteprinterofficeid = value;
        }

        /**
         * Gets the value of the selectedprinter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSELECTEDPRINTER() {
            return selectedprinter;
        }

        /**
         * Sets the value of the selectedprinter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSELECTEDPRINTER(String value) {
            this.selectedprinter = value;
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
         *         &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "identifier",
            "description",
            "tattoo"
        })
        public static class LISTPRINTER
            implements Serializable
        {

            @XmlElement(name = "IDENTIFIER")
            protected int identifier;
            @XmlElement(name = "DESCRIPTION")
            protected String description;
            @XmlElement(name = "TATTOO")
            protected String tattoo;

            /**
             * Gets the value of the identifier property.
             * 
             */
            public int getIDENTIFIER() {
                return identifier;
            }

            /**
             * Sets the value of the identifier property.
             * 
             */
            public void setIDENTIFIER(int value) {
                this.identifier = value;
            }

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

            /**
             * Gets the value of the tattoo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTATTOO() {
                return tattoo;
            }

            /**
             * Sets the value of the tattoo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTATTOO(String value) {
                this.tattoo = value;
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
         *         &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "identifier",
            "description",
            "tattoo"
        })
        public static class TODPRINTER
            implements Serializable
        {

            @XmlElement(name = "IDENTIFIER")
            protected int identifier;
            @XmlElement(name = "DESCRIPTION")
            protected String description;
            @XmlElement(name = "TATTOO")
            protected String tattoo;

            /**
             * Gets the value of the identifier property.
             * 
             */
            public int getIDENTIFIER() {
                return identifier;
            }

            /**
             * Sets the value of the identifier property.
             * 
             */
            public void setIDENTIFIER(int value) {
                this.identifier = value;
            }

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

            /**
             * Gets the value of the tattoo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTATTOO() {
                return tattoo;
            }

            /**
             * Sets the value of the tattoo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTATTOO(String value) {
                this.tattoo = value;
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TICKETINGTIMELIMIT
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * String type for value without CDATA
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
        }

    }

}
