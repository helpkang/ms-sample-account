
package com.koreanair.external.eretail.vo.tripplan.common.common_rail;

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.common.common.LISTMSG;


/**
 * <p>Java class for TRAIN_RETRIEVE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAIN_RETRIEVE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TX_STATUS" type="{}TX_STATUS_Train_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}SYSTEM_PROVIDER"/&gt;
 *         &lt;element name="TRAIN_PNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LIST_ADDITIONAL_BOOKING_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_ITINERARY" type="{}BOOKED_OFFER_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIST_ADDITIONAL_PNR" type="{}TRAIN_RETRIEVE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER" type="{}TRAIN_TRAVELLER_Type" maxOccurs="9"/&gt;
 *         &lt;element name="PRICE" type="{}PRICE_Type_BASE"/&gt;
 *         &lt;element name="PAYMENT_INFORMATION" type="{}PAYMENT_INFORMATION_Type" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_INFORMATION" type="{}DELIVERY_INFORMATION_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FIELD_ERROR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TICKETING_TIME_LIMIT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
 *         &lt;element name="TICKETING_STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="NOT_TICKETED"/&gt;
 *               &lt;enumeration value="TICKETED"/&gt;
 *               &lt;enumeration value="PARTIALLY_TICKETED"/&gt;
 *               &lt;enumeration value="REFUNDED"/&gt;
 *               &lt;enumeration value="UNKNOWN"/&gt;
 *               &lt;enumeration value="OTHER"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "TRAIN_RETRIEVE_Type", propOrder = {
    "txstatus",
    "systemprovider",
    "trainpnr",
    "listadditionalbookingid",
    "bookingdate",
    "listitinerary",
    "listadditionalpnr",
    "listtraveller",
    "price",
    "paymentinformation",
    "deliveryinformation",
    "listmsg",
    "listfielderror",
    "ticketingtimelimit",
    "bookingstatus",
    "ticketingstatus"
})
public class TRAINRETRIEVEType
    implements Serializable
{

    @XmlElement(name = "TX_STATUS")
    @XmlSchemaType(name = "string")
    protected TXSTATUSTrainType txstatus;
    @XmlElement(name = "SYSTEM_PROVIDER", required = true)
    protected String systemprovider;
    @XmlElement(name = "TRAIN_PNR", required = true)
    protected String trainpnr;
    @XmlElement(name = "LIST_ADDITIONAL_BOOKING_ID")
    protected List<String> listadditionalbookingid;
    @XmlElement(name = "BOOKING_DATE", required = true)
    protected TRAINRETRIEVEType.BOOKINGDATE bookingdate;
    @XmlElement(name = "LIST_ITINERARY", required = true)
    protected List<BOOKEDOFFERType> listitinerary;
    @XmlElement(name = "LIST_ADDITIONAL_PNR")
    protected List<TRAINRETRIEVEType> listadditionalpnr;
    @XmlElement(name = "LIST_TRAVELLER", required = true)
    protected List<TRAINTRAVELLERType> listtraveller;
    @XmlElement(name = "PRICE", required = true)
    protected PRICETypeBASE price;
    @XmlElement(name = "PAYMENT_INFORMATION")
    protected PAYMENTINFORMATIONType paymentinformation;
    @XmlElement(name = "DELIVERY_INFORMATION")
    protected DELIVERYINFORMATIONType deliveryinformation;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "LIST_FIELD_ERROR")
    protected List<String> listfielderror;
    @XmlElement(name = "TICKETING_TIME_LIMIT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ticketingtimelimit;
    @XmlElement(name = "BOOKING_STATUS")
    protected String bookingstatus;
    @XmlElement(name = "TICKETING_STATUS")
    protected String ticketingstatus;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the txstatus property.
     * 
     * @return
     *     possible object is
     *     {@link TXSTATUSTrainType }
     *     
     */
    public TXSTATUSTrainType getTXSTATUS() {
        return txstatus;
    }

    /**
     * Sets the value of the txstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TXSTATUSTrainType }
     *     
     */
    public void setTXSTATUS(TXSTATUSTrainType value) {
        this.txstatus = value;
    }

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
     *     {@link TRAINRETRIEVEType.BOOKINGDATE }
     *     
     */
    public TRAINRETRIEVEType.BOOKINGDATE getBOOKINGDATE() {
        return bookingdate;
    }

    /**
     * Sets the value of the bookingdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINRETRIEVEType.BOOKINGDATE }
     *     
     */
    public void setBOOKINGDATE(TRAINRETRIEVEType.BOOKINGDATE value) {
        this.bookingdate = value;
    }

    /**
     * Gets the value of the listitinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listitinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTITINERARY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOOKEDOFFERType }
     * 
     * 
     */
    public List<BOOKEDOFFERType> getLISTITINERARY() {
        if (listitinerary == null) {
            listitinerary = new ArrayList<BOOKEDOFFERType>();
        }
        return this.listitinerary;
    }

    /**
     * Gets the value of the listadditionalpnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalpnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALPNR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAINRETRIEVEType }
     * 
     * 
     */
    public List<TRAINRETRIEVEType> getLISTADDITIONALPNR() {
        if (listadditionalpnr == null) {
            listadditionalpnr = new ArrayList<TRAINRETRIEVEType>();
        }
        return this.listadditionalpnr;
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
     * {@link TRAINTRAVELLERType }
     * 
     * 
     */
    public List<TRAINTRAVELLERType> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<TRAINTRAVELLERType>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PRICETypeBASE }
     *     
     */
    public PRICETypeBASE getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICETypeBASE }
     *     
     */
    public void setPRICE(PRICETypeBASE value) {
        this.price = value;
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
     * Gets the value of the listmsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMSG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMSG }
     * 
     * 
     */
    public List<LISTMSG> getLISTMSG() {
        if (listmsg == null) {
            listmsg = new ArrayList<LISTMSG>();
        }
        return this.listmsg;
    }

    /**
     * Gets the value of the listfielderror property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfielderror property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFIELDERROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFIELDERROR() {
        if (listfielderror == null) {
            listfielderror = new ArrayList<String>();
        }
        return this.listfielderror;
    }

    /**
     * Gets the value of the ticketingtimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTICKETINGTIMELIMIT() {
        return ticketingtimelimit;
    }

    /**
     * Sets the value of the ticketingtimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTICKETINGTIMELIMIT(XMLGregorianCalendar value) {
        this.ticketingtimelimit = value;
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

}
