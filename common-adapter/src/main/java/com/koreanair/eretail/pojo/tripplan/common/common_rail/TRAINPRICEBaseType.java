
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CurrencyType;


/**
 * Prices for one train offer. Up to two prices can be given. One is price that corresponds to requested traveller profile, the other is full fare.
 * 
 * <p>Java class for TRAIN_PRICE_Base_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAIN_PRICE_Base_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PRICE_Type_BASE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_RECOMMENDATION_ID" type="{}unprotectedStringType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELSHOPPER_TICKET" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER" maxOccurs="6" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_SEGMENT_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TRAIN_COMPANY" type="{}TRAIN_COMPANY_Type" minOccurs="0"/&gt;
 *                             &lt;element name="RATE_TYPE"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="RATE_SUB_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="NEGOTIATED_RATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="TRAIN_CABIN" type="{}TRAIN_CABIN_Type" minOccurs="0"/&gt;
 *                             &lt;element name="OUTBOUND" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="SMOKING" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                   &lt;pattern value="true"/&gt;
 *                                   &lt;pattern value="false"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{}DISPLAY_RANK" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CLIENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESERVATION_PRICE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RESERVATION_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_BOUND_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_COMPLIANT_TICKET" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IS_DETAIL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_INFORMATION" type="{}FARE_INFORMATION_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GLOBAL_CONDITION" type="{}CODE_DESCRIPTOR_Type" minOccurs="0"/&gt;
 *         &lt;element name="LIST_BOUND_TATTOO" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SUPPLEMENT_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ACCOMMODATION_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FARE_CLASSIFICATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TRIP_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="VALIDITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="RESTRICTION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="RESERVATION_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="RESERVATION_MANDATORY_INBOUND" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="RESERVATION_MANDATORY_OUTBOUND" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="FARE_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="PUBLICATION_SEQUENCE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="PACKAGE_MARKER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="FARE_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="CAPRI_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="ROUTE_DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="ROUTE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PASSENGER_LIMITS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MIN_PASSENGERS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="MAX_PASSENGERS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="MIN_ADULTS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="MAX_ADULTS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="MIN_CHILDREN" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="MAX_CHILDREN" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROVIDER_ITEM_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRICE_BREAKDOWN" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRICE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="PAX_TYPE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NUMBER_OF_PAX" type="{}unprotectedStringType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BOOKED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="B_LOCATION" type="{}RAIL_LOCATION_Type" minOccurs="0"/&gt;
 *         &lt;element name="E_LOCATION" type="{}RAIL_LOCATION_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAIN_PRICE_Base_Type", propOrder = {
    "priceid",
    "listrecommendationid",
    "travelshopperticket",
    "listtraveller",
    "reservationprice",
    "pricetype",
    "listtravellerid",
    "listboundid",
    "listsegmentid",
    "listcompliantticket",
    "isdetail",
    "listfareinformation",
    "globalcondition",
    "listboundtattoo",
    "listsupplementid",
    "listaccommodationid",
    "fareclassification",
    "passengerlimits",
    "provideritemid",
    "tattoo",
    "listpricebreakdown",
    "booked",
    "blocation",
    "elocation"
})
@XmlSeeAlso({
    TRAINPRICEType.class
})
public class TRAINPRICEBaseType
    extends PRICETypeBASE
    implements Serializable
{

    @XmlElement(name = "PRICE_ID")
    protected String priceid;
    @XmlElement(name = "LIST_RECOMMENDATION_ID")
    protected List<String> listrecommendationid;
    @XmlElement(name = "TRAVELSHOPPER_TICKET")
    protected Byte travelshopperticket;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<TRAINPRICEBaseType.LISTTRAVELLER> listtraveller;
    @XmlElement(name = "RESERVATION_PRICE")
    protected TRAINPRICEBaseType.RESERVATIONPRICE reservationprice;
    @XmlElement(name = "PRICE_TYPE")
    protected String pricetype;
    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<String> listtravellerid;
    @XmlElement(name = "LIST_BOUND_ID")
    protected List<String> listboundid;
    @XmlElement(name = "LIST_SEGMENT_ID")
    protected List<String> listsegmentid;
    @XmlElement(name = "LIST_COMPLIANT_TICKET")
    protected List<String> listcompliantticket;
    @XmlElement(name = "IS_DETAIL")
    protected Boolean isdetail;
    @XmlElement(name = "LIST_FARE_INFORMATION")
    protected List<FAREINFORMATIONType> listfareinformation;
    @XmlElement(name = "GLOBAL_CONDITION")
    protected CODEDESCRIPTORType globalcondition;
    @XmlElement(name = "LIST_BOUND_TATTOO")
    protected List<String> listboundtattoo;
    @XmlElement(name = "LIST_SUPPLEMENT_ID")
    protected List<String> listsupplementid;
    @XmlElement(name = "LIST_ACCOMMODATION_ID")
    protected List<String> listaccommodationid;
    @XmlElement(name = "FARE_CLASSIFICATION")
    protected TRAINPRICEBaseType.FARECLASSIFICATION fareclassification;
    @XmlElement(name = "PASSENGER_LIMITS")
    protected TRAINPRICEBaseType.PASSENGERLIMITS passengerlimits;
    @XmlElement(name = "PROVIDER_ITEM_ID")
    protected String provideritemid;
    @XmlElement(name = "TATTOO")
    protected String tattoo;
    @XmlElement(name = "LIST_PRICE_BREAKDOWN")
    protected List<TRAINPRICEBaseType.LISTPRICEBREAKDOWN> listpricebreakdown;
    @XmlElement(name = "BOOKED")
    protected Boolean booked;
    @XmlElement(name = "B_LOCATION")
    protected RAILLOCATIONType blocation;
    @XmlElement(name = "E_LOCATION")
    protected RAILLOCATIONType elocation;

    /**
     * Gets the value of the priceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICEID() {
        return priceid;
    }

    /**
     * Sets the value of the priceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICEID(String value) {
        this.priceid = value;
    }

    /**
     * Gets the value of the listrecommendationid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrecommendationid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRECOMMENDATIONID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTRECOMMENDATIONID() {
        if (listrecommendationid == null) {
            listrecommendationid = new ArrayList<String>();
        }
        return this.listrecommendationid;
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
     * {@link TRAINPRICEBaseType.LISTTRAVELLER }
     * 
     * 
     */
    public List<TRAINPRICEBaseType.LISTTRAVELLER> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<TRAINPRICEBaseType.LISTTRAVELLER>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the reservationprice property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINPRICEBaseType.RESERVATIONPRICE }
     *     
     */
    public TRAINPRICEBaseType.RESERVATIONPRICE getRESERVATIONPRICE() {
        return reservationprice;
    }

    /**
     * Sets the value of the reservationprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINPRICEBaseType.RESERVATIONPRICE }
     *     
     */
    public void setRESERVATIONPRICE(TRAINPRICEBaseType.RESERVATIONPRICE value) {
        this.reservationprice = value;
    }

    /**
     * Gets the value of the pricetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICETYPE() {
        return pricetype;
    }

    /**
     * Sets the value of the pricetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICETYPE(String value) {
        this.pricetype = value;
    }

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<String>();
        }
        return this.listtravellerid;
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
     * Gets the value of the listsegmentid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegmentid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTSEGMENTID() {
        if (listsegmentid == null) {
            listsegmentid = new ArrayList<String>();
        }
        return this.listsegmentid;
    }

    /**
     * Gets the value of the listcompliantticket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcompliantticket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOMPLIANTTICKET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTCOMPLIANTTICKET() {
        if (listcompliantticket == null) {
            listcompliantticket = new ArrayList<String>();
        }
        return this.listcompliantticket;
    }

    /**
     * Gets the value of the isdetail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISDETAIL() {
        return isdetail;
    }

    /**
     * Sets the value of the isdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISDETAIL(Boolean value) {
        this.isdetail = value;
    }

    /**
     * Gets the value of the listfareinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FAREINFORMATIONType }
     * 
     * 
     */
    public List<FAREINFORMATIONType> getLISTFAREINFORMATION() {
        if (listfareinformation == null) {
            listfareinformation = new ArrayList<FAREINFORMATIONType>();
        }
        return this.listfareinformation;
    }

    /**
     * Gets the value of the globalcondition property.
     * 
     * @return
     *     possible object is
     *     {@link CODEDESCRIPTORType }
     *     
     */
    public CODEDESCRIPTORType getGLOBALCONDITION() {
        return globalcondition;
    }

    /**
     * Sets the value of the globalcondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODEDESCRIPTORType }
     *     
     */
    public void setGLOBALCONDITION(CODEDESCRIPTORType value) {
        this.globalcondition = value;
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
     * Gets the value of the fareclassification property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINPRICEBaseType.FARECLASSIFICATION }
     *     
     */
    public TRAINPRICEBaseType.FARECLASSIFICATION getFARECLASSIFICATION() {
        return fareclassification;
    }

    /**
     * Sets the value of the fareclassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINPRICEBaseType.FARECLASSIFICATION }
     *     
     */
    public void setFARECLASSIFICATION(TRAINPRICEBaseType.FARECLASSIFICATION value) {
        this.fareclassification = value;
    }

    /**
     * Gets the value of the passengerlimits property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINPRICEBaseType.PASSENGERLIMITS }
     *     
     */
    public TRAINPRICEBaseType.PASSENGERLIMITS getPASSENGERLIMITS() {
        return passengerlimits;
    }

    /**
     * Sets the value of the passengerlimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINPRICEBaseType.PASSENGERLIMITS }
     *     
     */
    public void setPASSENGERLIMITS(TRAINPRICEBaseType.PASSENGERLIMITS value) {
        this.passengerlimits = value;
    }

    /**
     * Gets the value of the provideritemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDERITEMID() {
        return provideritemid;
    }

    /**
     * Sets the value of the provideritemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDERITEMID(String value) {
        this.provideritemid = value;
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
     * Gets the value of the listpricebreakdown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpricebreakdown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICEBREAKDOWN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAINPRICEBaseType.LISTPRICEBREAKDOWN }
     * 
     * 
     */
    public List<TRAINPRICEBaseType.LISTPRICEBREAKDOWN> getLISTPRICEBREAKDOWN() {
        if (listpricebreakdown == null) {
            listpricebreakdown = new ArrayList<TRAINPRICEBaseType.LISTPRICEBREAKDOWN>();
        }
        return this.listpricebreakdown;
    }

    /**
     * Gets the value of the booked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOKED() {
        return booked;
    }

    /**
     * Sets the value of the booked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOKED(Boolean value) {
        this.booked = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public RAILLOCATIONType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public void setBLOCATION(RAILLOCATIONType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public RAILLOCATIONType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public void setELOCATION(RAILLOCATIONType value) {
        this.elocation = value;
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
     *         &lt;element name="TRIP_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="VALIDITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="RESTRICTION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="RESERVATION_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="RESERVATION_MANDATORY_INBOUND" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="RESERVATION_MANDATORY_OUTBOUND" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="FARE_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="PUBLICATION_SEQUENCE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="PACKAGE_MARKER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="FARE_GROUP" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="CAPRI_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="ROUTE_DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="ROUTE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "triptype",
        "validitycode",
        "restrictioncode",
        "reservationmandatory",
        "reservationmandatoryinbound",
        "reservationmandatoryoutbound",
        "fareclass",
        "publicationsequence",
        "packagemarker",
        "faregroup",
        "capricode",
        "routedescription",
        "routecode"
    })
    public static class FARECLASSIFICATION
        implements Serializable
    {

        @XmlElement(name = "TRIP_TYPE")
        protected String triptype;
        @XmlElement(name = "VALIDITY_CODE")
        protected String validitycode;
        @XmlElement(name = "RESTRICTION_CODE")
        protected String restrictioncode;
        @XmlElement(name = "RESERVATION_MANDATORY")
        protected Boolean reservationmandatory;
        @XmlElement(name = "RESERVATION_MANDATORY_INBOUND")
        protected Boolean reservationmandatoryinbound;
        @XmlElement(name = "RESERVATION_MANDATORY_OUTBOUND")
        protected Boolean reservationmandatoryoutbound;
        @XmlElement(name = "FARE_CLASS")
        protected String fareclass;
        @XmlElement(name = "PUBLICATION_SEQUENCE")
        protected String publicationsequence;
        @XmlElement(name = "PACKAGE_MARKER")
        protected String packagemarker;
        @XmlElement(name = "FARE_GROUP")
        protected String faregroup;
        @XmlElement(name = "CAPRI_CODE")
        protected String capricode;
        @XmlElement(name = "ROUTE_DESCRIPTION")
        protected String routedescription;
        @XmlElement(name = "ROUTE_CODE")
        protected String routecode;

        /**
         * Gets the value of the triptype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRIPTYPE() {
            return triptype;
        }

        /**
         * Sets the value of the triptype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRIPTYPE(String value) {
            this.triptype = value;
        }

        /**
         * Gets the value of the validitycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVALIDITYCODE() {
            return validitycode;
        }

        /**
         * Sets the value of the validitycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVALIDITYCODE(String value) {
            this.validitycode = value;
        }

        /**
         * Gets the value of the restrictioncode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRESTRICTIONCODE() {
            return restrictioncode;
        }

        /**
         * Sets the value of the restrictioncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRESTRICTIONCODE(String value) {
            this.restrictioncode = value;
        }

        /**
         * Gets the value of the reservationmandatory property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRESERVATIONMANDATORY() {
            return reservationmandatory;
        }

        /**
         * Sets the value of the reservationmandatory property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRESERVATIONMANDATORY(Boolean value) {
            this.reservationmandatory = value;
        }

        /**
         * Gets the value of the reservationmandatoryinbound property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRESERVATIONMANDATORYINBOUND() {
            return reservationmandatoryinbound;
        }

        /**
         * Sets the value of the reservationmandatoryinbound property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRESERVATIONMANDATORYINBOUND(Boolean value) {
            this.reservationmandatoryinbound = value;
        }

        /**
         * Gets the value of the reservationmandatoryoutbound property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRESERVATIONMANDATORYOUTBOUND() {
            return reservationmandatoryoutbound;
        }

        /**
         * Sets the value of the reservationmandatoryoutbound property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRESERVATIONMANDATORYOUTBOUND(Boolean value) {
            this.reservationmandatoryoutbound = value;
        }

        /**
         * Gets the value of the fareclass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFARECLASS() {
            return fareclass;
        }

        /**
         * Sets the value of the fareclass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFARECLASS(String value) {
            this.fareclass = value;
        }

        /**
         * Gets the value of the publicationsequence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPUBLICATIONSEQUENCE() {
            return publicationsequence;
        }

        /**
         * Sets the value of the publicationsequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPUBLICATIONSEQUENCE(String value) {
            this.publicationsequence = value;
        }

        /**
         * Gets the value of the packagemarker property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPACKAGEMARKER() {
            return packagemarker;
        }

        /**
         * Sets the value of the packagemarker property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPACKAGEMARKER(String value) {
            this.packagemarker = value;
        }

        /**
         * Gets the value of the faregroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAREGROUP() {
            return faregroup;
        }

        /**
         * Sets the value of the faregroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAREGROUP(String value) {
            this.faregroup = value;
        }

        /**
         * Gets the value of the capricode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCAPRICODE() {
            return capricode;
        }

        /**
         * Sets the value of the capricode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCAPRICODE(String value) {
            this.capricode = value;
        }

        /**
         * Gets the value of the routedescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROUTEDESCRIPTION() {
            return routedescription;
        }

        /**
         * Sets the value of the routedescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROUTEDESCRIPTION(String value) {
            this.routedescription = value;
        }

        /**
         * Gets the value of the routecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROUTECODE() {
            return routecode;
        }

        /**
         * Sets the value of the routecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROUTECODE(String value) {
            this.routecode = value;
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
     *         &lt;element name="PRICE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="PAX_TYPE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NUMBER_OF_PAX" type="{}unprotectedStringType"/&gt;
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
        "price",
        "paxtype",
        "numberofpax"
    })
    public static class LISTPRICEBREAKDOWN
        implements Serializable
    {

        @XmlElement(name = "PRICE", required = true)
        protected String price;
        @XmlElement(name = "PAX_TYPE", required = true)
        protected String paxtype;
        @XmlElement(name = "NUMBER_OF_PAX", required = true)
        protected String numberofpax;

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRICE() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRICE(String value) {
            this.price = value;
        }

        /**
         * Gets the value of the paxtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAXTYPE() {
            return paxtype;
        }

        /**
         * Sets the value of the paxtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAXTYPE(String value) {
            this.paxtype = value;
        }

        /**
         * Gets the value of the numberofpax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBEROFPAX() {
            return numberofpax;
        }

        /**
         * Sets the value of the numberofpax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBEROFPAX(String value) {
            this.numberofpax = value;
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
     *         &lt;element name="LIST_SEGMENT_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TRAIN_COMPANY" type="{}TRAIN_COMPANY_Type" minOccurs="0"/&gt;
     *                   &lt;element name="RATE_TYPE"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="RATE_SUB_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="NEGOTIATED_RATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="TRAIN_CABIN" type="{}TRAIN_CABIN_Type" minOccurs="0"/&gt;
     *                   &lt;element name="OUTBOUND" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="SMOKING" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                         &lt;pattern value="true"/&gt;
     *                         &lt;pattern value="false"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{}DISPLAY_RANK" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CLIENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "listsegmentinfo",
        "clientid"
    })
    public static class LISTTRAVELLER
        implements Serializable
    {

        @XmlElement(name = "LIST_SEGMENT_INFO")
        protected List<TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO> listsegmentinfo;
        @XmlElement(name = "CLIENT_ID")
        protected BigInteger clientid;

        /**
         * Gets the value of the listsegmentinfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listsegmentinfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEGMENTINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO }
         * 
         * 
         */
        public List<TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO> getLISTSEGMENTINFO() {
            if (listsegmentinfo == null) {
                listsegmentinfo = new ArrayList<TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO>();
            }
            return this.listsegmentinfo;
        }

        /**
         * Gets the value of the clientid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCLIENTID() {
            return clientid;
        }

        /**
         * Sets the value of the clientid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCLIENTID(BigInteger value) {
            this.clientid = value;
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
         *         &lt;element name="TRAIN_COMPANY" type="{}TRAIN_COMPANY_Type" minOccurs="0"/&gt;
         *         &lt;element name="RATE_TYPE"&gt;
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
         *         &lt;element name="RATE_SUB_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="NEGOTIATED_RATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="TRAIN_CABIN" type="{}TRAIN_CABIN_Type" minOccurs="0"/&gt;
         *         &lt;element name="OUTBOUND" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="SMOKING" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *               &lt;pattern value="true"/&gt;
         *               &lt;pattern value="false"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{}DISPLAY_RANK" minOccurs="0"/&gt;
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
            "traincompany",
            "ratetype",
            "ratesubtype",
            "negotiatedratecode",
            "traincabin",
            "outbound",
            "smoking",
            "displayrank"
        })
        public static class LISTSEGMENTINFO
            implements Serializable
        {

            @XmlElement(name = "TRAIN_COMPANY")
            protected TRAINCOMPANYType traincompany;
            @XmlElement(name = "RATE_TYPE", required = true)
            protected TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO.RATETYPE ratetype;
            @XmlElement(name = "RATE_SUB_TYPE")
            protected String ratesubtype;
            @XmlElement(name = "NEGOTIATED_RATE_CODE")
            protected String negotiatedratecode;
            @XmlElement(name = "TRAIN_CABIN")
            protected TRAINCABINType traincabin;
            @XmlElement(name = "OUTBOUND")
            protected Boolean outbound;
            @XmlElement(name = "SMOKING")
            protected Boolean smoking;
            @XmlElement(name = "DISPLAY_RANK")
            protected String displayrank;

            /**
             * Gets the value of the traincompany property.
             * 
             * @return
             *     possible object is
             *     {@link TRAINCOMPANYType }
             *     
             */
            public TRAINCOMPANYType getTRAINCOMPANY() {
                return traincompany;
            }

            /**
             * Sets the value of the traincompany property.
             * 
             * @param value
             *     allowed object is
             *     {@link TRAINCOMPANYType }
             *     
             */
            public void setTRAINCOMPANY(TRAINCOMPANYType value) {
                this.traincompany = value;
            }

            /**
             * Gets the value of the ratetype property.
             * 
             * @return
             *     possible object is
             *     {@link TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO.RATETYPE }
             *     
             */
            public TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO.RATETYPE getRATETYPE() {
                return ratetype;
            }

            /**
             * Sets the value of the ratetype property.
             * 
             * @param value
             *     allowed object is
             *     {@link TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO.RATETYPE }
             *     
             */
            public void setRATETYPE(TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO.RATETYPE value) {
                this.ratetype = value;
            }

            /**
             * Gets the value of the ratesubtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRATESUBTYPE() {
                return ratesubtype;
            }

            /**
             * Sets the value of the ratesubtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRATESUBTYPE(String value) {
                this.ratesubtype = value;
            }

            /**
             * Gets the value of the negotiatedratecode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNEGOTIATEDRATECODE() {
                return negotiatedratecode;
            }

            /**
             * Sets the value of the negotiatedratecode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNEGOTIATEDRATECODE(String value) {
                this.negotiatedratecode = value;
            }

            /**
             * Gets the value of the traincabin property.
             * 
             * @return
             *     possible object is
             *     {@link TRAINCABINType }
             *     
             */
            public TRAINCABINType getTRAINCABIN() {
                return traincabin;
            }

            /**
             * Sets the value of the traincabin property.
             * 
             * @param value
             *     allowed object is
             *     {@link TRAINCABINType }
             *     
             */
            public void setTRAINCABIN(TRAINCABINType value) {
                this.traincabin = value;
            }

            /**
             * Gets the value of the outbound property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOUTBOUND() {
                return outbound;
            }

            /**
             * Sets the value of the outbound property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOUTBOUND(Boolean value) {
                this.outbound = value;
            }

            /**
             * Gets the value of the smoking property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSMOKING() {
                return smoking;
            }

            /**
             * Sets the value of the smoking property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSMOKING(Boolean value) {
                this.smoking = value;
            }

            /**
             * Gets the value of the displayrank property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDISPLAYRANK() {
                return displayrank;
            }

            /**
             * Sets the value of the displayrank property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDISPLAYRANK(String value) {
                this.displayrank = value;
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
            public static class RATETYPE
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
     *         &lt;element name="MIN_PASSENGERS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="MAX_PASSENGERS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="MIN_ADULTS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="MAX_ADULTS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="MIN_CHILDREN" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="MAX_CHILDREN" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "minpassengers",
        "maxpassengers",
        "minadults",
        "maxadults",
        "minchildren",
        "maxchildren"
    })
    public static class PASSENGERLIMITS
        implements Serializable
    {

        @XmlElement(name = "MIN_PASSENGERS")
        protected String minpassengers;
        @XmlElement(name = "MAX_PASSENGERS")
        protected String maxpassengers;
        @XmlElement(name = "MIN_ADULTS")
        protected String minadults;
        @XmlElement(name = "MAX_ADULTS")
        protected String maxadults;
        @XmlElement(name = "MIN_CHILDREN")
        protected String minchildren;
        @XmlElement(name = "MAX_CHILDREN")
        protected String maxchildren;

        /**
         * Gets the value of the minpassengers property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMINPASSENGERS() {
            return minpassengers;
        }

        /**
         * Sets the value of the minpassengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMINPASSENGERS(String value) {
            this.minpassengers = value;
        }

        /**
         * Gets the value of the maxpassengers property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMAXPASSENGERS() {
            return maxpassengers;
        }

        /**
         * Sets the value of the maxpassengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMAXPASSENGERS(String value) {
            this.maxpassengers = value;
        }

        /**
         * Gets the value of the minadults property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMINADULTS() {
            return minadults;
        }

        /**
         * Sets the value of the minadults property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMINADULTS(String value) {
            this.minadults = value;
        }

        /**
         * Gets the value of the maxadults property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMAXADULTS() {
            return maxadults;
        }

        /**
         * Sets the value of the maxadults property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMAXADULTS(String value) {
            this.maxadults = value;
        }

        /**
         * Gets the value of the minchildren property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMINCHILDREN() {
            return minchildren;
        }

        /**
         * Sets the value of the minchildren property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMINCHILDREN(String value) {
            this.minchildren = value;
        }

        /**
         * Gets the value of the maxchildren property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMAXCHILDREN() {
            return maxchildren;
        }

        /**
         * Sets the value of the maxchildren property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMAXCHILDREN(String value) {
            this.maxchildren = value;
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
     *         &lt;element name="RESERVATION_MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
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
        "reservationmandatory",
        "amount",
        "currency"
    })
    public static class RESERVATIONPRICE
        implements Serializable
    {

        @XmlElement(name = "RESERVATION_MANDATORY")
        protected Boolean reservationmandatory;
        @XmlElement(name = "AMOUNT", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "CURRENCY", required = true)
        protected CurrencyType currency;

        /**
         * Gets the value of the reservationmandatory property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRESERVATIONMANDATORY() {
            return reservationmandatory;
        }

        /**
         * Sets the value of the reservationmandatory property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRESERVATIONMANDATORY(Boolean value) {
            this.reservationmandatory = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
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

    }

}
