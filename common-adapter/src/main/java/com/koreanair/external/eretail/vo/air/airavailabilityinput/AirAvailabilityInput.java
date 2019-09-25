
package com.koreanair.external.eretail.vo.air.airavailabilityinput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.air.common.FLIGHTPREFERENCEType;
import com.koreanair.external.eretail.vo.air.common.LISTITINERARYMILESCOSTTYPE;
import com.koreanair.external.eretail.vo.air.commonin.BOOKEDELEMENTType;
import com.koreanair.external.eretail.vo.air.commonin.DESTINATIONType;
import com.koreanair.external.eretail.vo.air.commonin.LINKSEGMENTType;
import com.koreanair.external.eretail.vo.air.commonin.LISTCABINPRIORITY;
import com.koreanair.external.eretail.vo.air.commonin.LISTEXTERNALFARES;
import com.koreanair.external.eretail.vo.air.commonin.LISTTRAVELLERINFOAirType;
import com.koreanair.external.eretail.vo.air.commonin.POCOVERRIDEType;
import com.koreanair.external.eretail.vo.air.commonin.TRAVELLERType;
import com.koreanair.external.eretail.vo.tripplan.traveller_information.TRAVELLERINFORMATION;


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
 *         &lt;element name="TRANSACTION_ID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="AirAvailability"/&gt;
 *               &lt;enumeration value="AirAvailabilityForRebooking"/&gt;
 *               &lt;enumeration value="AirAvailabilityForInvoluntaryRebooking"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}PAGE_TICKET" minOccurs="0"/&gt;
 *         &lt;element ref="{}SITE"/&gt;
 *         &lt;element ref="{}LANGUAGE"/&gt;
 *         &lt;element ref="{}TRIP_TYPE"/&gt;
 *         &lt;element name="LIST_DESTINATION" type="{}DESTINATION_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}FLIGHTS_NEEDED" minOccurs="0"/&gt;
 *         &lt;element ref="{}ONLINE_CONNECTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}DIRECT_NON_STOP" minOccurs="0"/&gt;
 *         &lt;element ref="{}DIRECT_SEARCH" minOccurs="0"/&gt;
 *         &lt;element ref="{}ARRANGE_BY" minOccurs="0"/&gt;
 *         &lt;element ref="{}SEVEN_DAY_SEARCH" minOccurs="0"/&gt;
 *         &lt;element ref="{}ALLOW_WAITLIST" minOccurs="0"/&gt;
 *         &lt;element ref="{}TR_FLIGHTS" minOccurs="0"/&gt;
 *         &lt;element ref="{}SHUTTLE_FLIGHTS" minOccurs="0"/&gt;
 *         &lt;element ref="{}SCHEDULE" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_TIME_WINDOW" minOccurs="0"/&gt;
 *         &lt;element ref="{}ALLOW_ALTERNATE_AVAILABILITY" minOccurs="0"/&gt;
 *         &lt;element ref="{}CABIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}CABIN_FILTERING" minOccurs="0"/&gt;
 *         &lt;element ref="{}ALTERNATIVE_CABIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}AIRLINE_BIAS" minOccurs="0"/&gt;
 *         &lt;element ref="{}DEFAULT_CABIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_TRAVELLER" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_TRAVELLER_INFO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}FORCE_RBD" minOccurs="0"/&gt;
 *         &lt;element ref="{}ENGINE_RBD_FILTERING" minOccurs="0"/&gt;
 *         &lt;element ref="{}REDEMPTION_AVAILABILITY" minOccurs="0"/&gt;
 *         &lt;element ref="{}AWARD_AVAILABILITY" minOccurs="0"/&gt;
 *         &lt;element ref="{}STAFF_AVAILABILITY" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FLIGHT_PREFERENCE" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_CABIN_PRIORITY" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{}RESTRICTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}COMPANION_MODE" minOccurs="0"/&gt;
 *         &lt;element ref="{}EXTERNAL_FARE" minOccurs="0"/&gt;
 *         &lt;element ref="{}EXTERNAL_CURRENCY_CODE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_EXTERNAL_FARES" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ITINERARY_MILES_COST" type="{}LIST_ITINERARY_MILES_COST_TYPE" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{}DIRECT_LOGIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}DIRECT_LOGIN_AGENT" minOccurs="0"/&gt;
 *         &lt;element ref="{}IS_STRUCTURED_XML" minOccurs="0"/&gt;
 *         &lt;element ref="{}OFFICE_ID" minOccurs="0"/&gt;
 *         &lt;element ref="{}NUMBER_OF_PROFILES" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_INFORMATION" type="{}TRAVELLER_INFORMATION" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonInputGroup"/&gt;
 *         &lt;group ref="{}BookingContextGroup"/&gt;
 *         &lt;element name="LIST_CLID" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_CARRIER_CODE" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CLID_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}IS_UMNR_FLOW" minOccurs="0"/&gt;
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
    "transactionid",
    "pageticket",
    "site",
    "language",
    "triptype",
    "listdestination",
    "flightsneeded",
    "onlineconnection",
    "directnonstop",
    "directsearch",
    "arrangeby",
    "sevendaysearch",
    "allowwaitlist",
    "trflights",
    "shuttleflights",
    "schedule",
    "btimewindow",
    "allowalternateavailability",
    "cabin",
    "cabinfiltering",
    "alternativecabin",
    "airlinebias",
    "defaultcabin",
    "listtraveller",
    "listtravellerinfo",
    "forcerbd",
    "enginerbdfiltering",
    "redemptionavailability",
    "awardavailability",
    "staffavailability",
    "listflightpreference",
    "listcabinpriority",
    "restriction",
    "companionmode",
    "externalfare",
    "externalcurrencycode",
    "listexternalfares",
    "listitinerarymilescost",
    "directlogin",
    "directloginagent",
    "isstructuredxml",
    "officeid",
    "numberofprofiles",
    "travellerinformation",
    "listexternalid",
    "frompage",
    "requestinfo",
    "cleanoverrideonsiteswitch",
    "apischeckview",
    "apischeckcategory",
    "apischeckmandatory",
    "apischeckoptional",
    "apischeckstructure",
    "apischeckstructurepassenger",
    "listbookedelement",
    "listlinksegment",
    "pocoverride",
    "listclid",
    "isumnrflow"
})
@XmlRootElement(name = "AirAvailabilityInput")
public class AirAvailabilityInput
    implements Serializable
{

    @XmlElement(name = "TRANSACTION_ID", required = true)
    protected String transactionid;
    @XmlElement(name = "PAGE_TICKET")
    protected String pageticket;
    @XmlElement(name = "SITE", required = true)
    protected String site;
    @XmlElement(name = "LANGUAGE", required = true)
    protected String language;
    @XmlElement(name = "TRIP_TYPE", required = true)
    protected String triptype;
    @XmlElement(name = "LIST_DESTINATION", required = true)
    protected List<DESTINATIONType> listdestination;
    @XmlElement(name = "FLIGHTS_NEEDED")
    protected BigInteger flightsneeded;
    @XmlElement(name = "ONLINE_CONNECTION")
    protected Boolean onlineconnection;
    @XmlElement(name = "DIRECT_NON_STOP")
    protected Boolean directnonstop;
    @XmlElement(name = "DIRECT_SEARCH")
    protected Boolean directsearch;
    @XmlElement(name = "ARRANGE_BY")
    protected String arrangeby;
    @XmlElement(name = "SEVEN_DAY_SEARCH")
    protected Boolean sevendaysearch;
    @XmlElement(name = "ALLOW_WAITLIST")
    protected Boolean allowwaitlist;
    @XmlElement(name = "TR_FLIGHTS")
    protected Boolean trflights;
    @XmlElement(name = "SHUTTLE_FLIGHTS")
    protected Boolean shuttleflights;
    @XmlElement(name = "SCHEDULE")
    protected Boolean schedule;
    @XmlElement(name = "B_TIME_WINDOW")
    protected BigInteger btimewindow;
    @XmlElement(name = "ALLOW_ALTERNATE_AVAILABILITY")
    protected Boolean allowalternateavailability;
    @XmlElement(name = "CABIN")
    protected String cabin;
    @XmlElement(name = "CABIN_FILTERING")
    protected Boolean cabinfiltering;
    @XmlElement(name = "ALTERNATIVE_CABIN")
    protected Boolean alternativecabin;
    @XmlElement(name = "AIRLINE_BIAS")
    protected String airlinebias;
    @XmlElement(name = "DEFAULT_CABIN")
    protected String defaultcabin;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<TRAVELLERType> listtraveller;
    @XmlElement(name = "LIST_TRAVELLER_INFO")
    protected List<LISTTRAVELLERINFOAirType> listtravellerinfo;
    @XmlElement(name = "FORCE_RBD")
    protected Boolean forcerbd;
    @XmlElement(name = "ENGINE_RBD_FILTERING")
    protected Boolean enginerbdfiltering;
    @XmlElement(name = "REDEMPTION_AVAILABILITY")
    protected Boolean redemptionavailability;
    @XmlElement(name = "AWARD_AVAILABILITY")
    protected Boolean awardavailability;
    @XmlElement(name = "STAFF_AVAILABILITY")
    protected Boolean staffavailability;
    @XmlElement(name = "LIST_FLIGHT_PREFERENCE")
    protected List<FLIGHTPREFERENCEType> listflightpreference;
    @XmlElement(name = "LIST_CABIN_PRIORITY")
    protected List<LISTCABINPRIORITY> listcabinpriority;
    @XmlElement(name = "RESTRICTION")
    protected Boolean restriction;
    @XmlElement(name = "COMPANION_MODE")
    protected String companionmode;
    @XmlElement(name = "EXTERNAL_FARE")
    protected String externalfare;
    @XmlElement(name = "EXTERNAL_CURRENCY_CODE")
    protected String externalcurrencycode;
    @XmlElement(name = "LIST_EXTERNAL_FARES")
    protected List<LISTEXTERNALFARES> listexternalfares;
    @XmlElement(name = "LIST_ITINERARY_MILES_COST")
    protected List<LISTITINERARYMILESCOSTTYPE> listitinerarymilescost;
    @XmlElement(name = "DIRECT_LOGIN")
    protected String directlogin;
    @XmlElement(name = "DIRECT_LOGIN_AGENT")
    protected String directloginagent;
    @XmlElement(name = "IS_STRUCTURED_XML")
    protected String isstructuredxml;
    @XmlElement(name = "OFFICE_ID")
    protected String officeid;
    @XmlElement(name = "NUMBER_OF_PROFILES")
    protected BigInteger numberofprofiles;
    @XmlElement(name = "TRAVELLER_INFORMATION")
    protected List<TRAVELLERINFORMATION> travellerinformation;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<String> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "REQUEST_INFO")
    protected AirAvailabilityInput.REQUESTINFO requestinfo;
    @XmlElement(name = "CLEAN_OVERRIDE_ON_SITE_SWITCH")
    protected Boolean cleanoverrideonsiteswitch;
    @XmlElement(name = "APIS_CHECK_VIEW")
    protected Object apischeckview;
    @XmlElement(name = "APIS_CHECK_CATEGORY")
    protected Object apischeckcategory;
    @XmlElement(name = "APIS_CHECK_MANDATORY")
    protected Object apischeckmandatory;
    @XmlElement(name = "APIS_CHECK_OPTIONAL")
    protected Object apischeckoptional;
    @XmlElement(name = "APIS_CHECK_STRUCTURE")
    protected Object apischeckstructure;
    @XmlElement(name = "APIS_CHECK_STRUCTURE_PASSENGER")
    protected List<AirAvailabilityInput.APISCHECKSTRUCTUREPASSENGER> apischeckstructurepassenger;
    @XmlElement(name = "LIST_BOOKED_ELEMENT")
    protected List<BOOKEDELEMENTType> listbookedelement;
    @XmlElement(name = "LIST_LINK_SEGMENT")
    protected List<LINKSEGMENTType> listlinksegment;
    @XmlElement(name = "POC_OVERRIDE")
    protected POCOVERRIDEType pocoverride;
    @XmlElement(name = "LIST_CLID")
    protected List<AirAvailabilityInput.LISTCLID> listclid;
    @XmlElement(name = "IS_UMNR_FLOW")
    protected Boolean isumnrflow;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the transactionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONID() {
        return transactionid;
    }

    /**
     * Sets the value of the transactionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONID(String value) {
        this.transactionid = value;
    }

    /**
     * The PAGE_TICKET is mandatory in the rebooking flow (when TRANSACTION_ID=AirAvailabilityForRebooking or AirAvailabilityForInvoluntaryRebooking), it's not used in other cases
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAGETICKET() {
        return pageticket;
    }

    /**
     * Sets the value of the pageticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAGETICKET(String value) {
        this.pageticket = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITE() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITE(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
    }

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
     * Gets the value of the listdestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDESTINATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESTINATIONType }
     * 
     * 
     */
    public List<DESTINATIONType> getLISTDESTINATION() {
        if (listdestination == null) {
            listdestination = new ArrayList<DESTINATIONType>();
        }
        return this.listdestination;
    }

    /**
     * Gets the value of the flightsneeded property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFLIGHTSNEEDED() {
        return flightsneeded;
    }

    /**
     * Sets the value of the flightsneeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFLIGHTSNEEDED(BigInteger value) {
        this.flightsneeded = value;
    }

    /**
     * Gets the value of the onlineconnection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isONLINECONNECTION() {
        return onlineconnection;
    }

    /**
     * Sets the value of the onlineconnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setONLINECONNECTION(Boolean value) {
        this.onlineconnection = value;
    }

    /**
     * Gets the value of the directnonstop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDIRECTNONSTOP() {
        return directnonstop;
    }

    /**
     * Sets the value of the directnonstop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDIRECTNONSTOP(Boolean value) {
        this.directnonstop = value;
    }

    /**
     * Gets the value of the directsearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDIRECTSEARCH() {
        return directsearch;
    }

    /**
     * Sets the value of the directsearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDIRECTSEARCH(Boolean value) {
        this.directsearch = value;
    }

    /**
     * Gets the value of the arrangeby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARRANGEBY() {
        return arrangeby;
    }

    /**
     * Sets the value of the arrangeby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARRANGEBY(String value) {
        this.arrangeby = value;
    }

    /**
     * Gets the value of the sevendaysearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSEVENDAYSEARCH() {
        return sevendaysearch;
    }

    /**
     * Sets the value of the sevendaysearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSEVENDAYSEARCH(Boolean value) {
        this.sevendaysearch = value;
    }

    /**
     * Gets the value of the allowwaitlist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALLOWWAITLIST() {
        return allowwaitlist;
    }

    /**
     * Sets the value of the allowwaitlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALLOWWAITLIST(Boolean value) {
        this.allowwaitlist = value;
    }

    /**
     * Gets the value of the trflights property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTRFLIGHTS() {
        return trflights;
    }

    /**
     * Sets the value of the trflights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTRFLIGHTS(Boolean value) {
        this.trflights = value;
    }

    /**
     * Gets the value of the shuttleflights property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSHUTTLEFLIGHTS() {
        return shuttleflights;
    }

    /**
     * Sets the value of the shuttleflights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSHUTTLEFLIGHTS(Boolean value) {
        this.shuttleflights = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSCHEDULE() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSCHEDULE(Boolean value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the btimewindow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBTIMEWINDOW() {
        return btimewindow;
    }

    /**
     * Sets the value of the btimewindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBTIMEWINDOW(BigInteger value) {
        this.btimewindow = value;
    }

    /**
     * Gets the value of the allowalternateavailability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALLOWALTERNATEAVAILABILITY() {
        return allowalternateavailability;
    }

    /**
     * Sets the value of the allowalternateavailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALLOWALTERNATEAVAILABILITY(Boolean value) {
        this.allowalternateavailability = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCABIN() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCABIN(String value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the cabinfiltering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCABINFILTERING() {
        return cabinfiltering;
    }

    /**
     * Sets the value of the cabinfiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCABINFILTERING(Boolean value) {
        this.cabinfiltering = value;
    }

    /**
     * Gets the value of the alternativecabin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALTERNATIVECABIN() {
        return alternativecabin;
    }

    /**
     * Sets the value of the alternativecabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALTERNATIVECABIN(Boolean value) {
        this.alternativecabin = value;
    }

    /**
     * Gets the value of the airlinebias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRLINEBIAS() {
        return airlinebias;
    }

    /**
     * Sets the value of the airlinebias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRLINEBIAS(String value) {
        this.airlinebias = value;
    }

    /**
     * Gets the value of the defaultcabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTCABIN() {
        return defaultcabin;
    }

    /**
     * Sets the value of the defaultcabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTCABIN(String value) {
        this.defaultcabin = value;
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
     * {@link TRAVELLERType }
     * 
     * 
     */
    public List<TRAVELLERType> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<TRAVELLERType>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the listtravellerinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRAVELLERINFOAirType }
     * 
     * 
     */
    public List<LISTTRAVELLERINFOAirType> getLISTTRAVELLERINFO() {
        if (listtravellerinfo == null) {
            listtravellerinfo = new ArrayList<LISTTRAVELLERINFOAirType>();
        }
        return this.listtravellerinfo;
    }

    /**
     * Gets the value of the forcerbd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFORCERBD() {
        return forcerbd;
    }

    /**
     * Sets the value of the forcerbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFORCERBD(Boolean value) {
        this.forcerbd = value;
    }

    /**
     * Gets the value of the enginerbdfiltering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isENGINERBDFILTERING() {
        return enginerbdfiltering;
    }

    /**
     * Sets the value of the enginerbdfiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setENGINERBDFILTERING(Boolean value) {
        this.enginerbdfiltering = value;
    }

    /**
     * Gets the value of the redemptionavailability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREDEMPTIONAVAILABILITY() {
        return redemptionavailability;
    }

    /**
     * Sets the value of the redemptionavailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREDEMPTIONAVAILABILITY(Boolean value) {
        this.redemptionavailability = value;
    }

    /**
     * Gets the value of the awardavailability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAWARDAVAILABILITY() {
        return awardavailability;
    }

    /**
     * Sets the value of the awardavailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAWARDAVAILABILITY(Boolean value) {
        this.awardavailability = value;
    }

    /**
     * Gets the value of the staffavailability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSTAFFAVAILABILITY() {
        return staffavailability;
    }

    /**
     * Sets the value of the staffavailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSTAFFAVAILABILITY(Boolean value) {
        this.staffavailability = value;
    }

    /**
     * Gets the value of the listflightpreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listflightpreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFLIGHTPREFERENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FLIGHTPREFERENCEType }
     * 
     * 
     */
    public List<FLIGHTPREFERENCEType> getLISTFLIGHTPREFERENCE() {
        if (listflightpreference == null) {
            listflightpreference = new ArrayList<FLIGHTPREFERENCEType>();
        }
        return this.listflightpreference;
    }

    /**
     * Gets the value of the listcabinpriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcabinpriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCABINPRIORITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTCABINPRIORITY }
     * 
     * 
     */
    public List<LISTCABINPRIORITY> getLISTCABINPRIORITY() {
        if (listcabinpriority == null) {
            listcabinpriority = new ArrayList<LISTCABINPRIORITY>();
        }
        return this.listcabinpriority;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRESTRICTION() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRESTRICTION(Boolean value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the companionmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANIONMODE() {
        return companionmode;
    }

    /**
     * Sets the value of the companionmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANIONMODE(String value) {
        this.companionmode = value;
    }

    /**
     * Gets the value of the externalfare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALFARE() {
        return externalfare;
    }

    /**
     * Sets the value of the externalfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALFARE(String value) {
        this.externalfare = value;
    }

    /**
     * Gets the value of the externalcurrencycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALCURRENCYCODE() {
        return externalcurrencycode;
    }

    /**
     * Sets the value of the externalcurrencycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALCURRENCYCODE(String value) {
        this.externalcurrencycode = value;
    }

    /**
     * Gets the value of the listexternalfares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexternalfares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXTERNALFARES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTEXTERNALFARES }
     * 
     * 
     */
    public List<LISTEXTERNALFARES> getLISTEXTERNALFARES() {
        if (listexternalfares == null) {
            listexternalfares = new ArrayList<LISTEXTERNALFARES>();
        }
        return this.listexternalfares;
    }

    /**
     * Gets the value of the listitinerarymilescost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listitinerarymilescost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTITINERARYMILESCOST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTITINERARYMILESCOSTTYPE }
     * 
     * 
     */
    public List<LISTITINERARYMILESCOSTTYPE> getLISTITINERARYMILESCOST() {
        if (listitinerarymilescost == null) {
            listitinerarymilescost = new ArrayList<LISTITINERARYMILESCOSTTYPE>();
        }
        return this.listitinerarymilescost;
    }

    /**
     * Gets the value of the directlogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRECTLOGIN() {
        return directlogin;
    }

    /**
     * Sets the value of the directlogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRECTLOGIN(String value) {
        this.directlogin = value;
    }

    /**
     * Gets the value of the directloginagent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRECTLOGINAGENT() {
        return directloginagent;
    }

    /**
     * Sets the value of the directloginagent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRECTLOGINAGENT(String value) {
        this.directloginagent = value;
    }

    /**
     * Gets the value of the isstructuredxml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSTRUCTUREDXML() {
        return isstructuredxml;
    }

    /**
     * Sets the value of the isstructuredxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSTRUCTUREDXML(String value) {
        this.isstructuredxml = value;
    }

    /**
     * Gets the value of the officeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFICEID() {
        return officeid;
    }

    /**
     * Sets the value of the officeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFICEID(String value) {
        this.officeid = value;
    }

    /**
     * Gets the value of the numberofprofiles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBEROFPROFILES() {
        return numberofprofiles;
    }

    /**
     * Sets the value of the numberofprofiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBEROFPROFILES(BigInteger value) {
        this.numberofprofiles = value;
    }

    /**
     * Gets the value of the travellerinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRAVELLERINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELLERINFORMATION }
     * 
     * 
     */
    public List<TRAVELLERINFORMATION> getTRAVELLERINFORMATION() {
        if (travellerinformation == null) {
            travellerinformation = new ArrayList<TRAVELLERINFORMATION>();
        }
        return this.travellerinformation;
    }

    /**
     * Gets the value of the listexternalid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexternalid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXTERNALID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTEXTERNALID() {
        if (listexternalid == null) {
            listexternalid = new ArrayList<String>();
        }
        return this.listexternalid;
    }

    /**
     * Gets the value of the frompage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFROMPAGE() {
        return frompage;
    }

    /**
     * Sets the value of the frompage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFROMPAGE(Object value) {
        this.frompage = value;
    }

    /**
     * Gets the value of the requestinfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirAvailabilityInput.REQUESTINFO }
     *     
     */
    public AirAvailabilityInput.REQUESTINFO getREQUESTINFO() {
        return requestinfo;
    }

    /**
     * Sets the value of the requestinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirAvailabilityInput.REQUESTINFO }
     *     
     */
    public void setREQUESTINFO(AirAvailabilityInput.REQUESTINFO value) {
        this.requestinfo = value;
    }

    /**
     * Gets the value of the cleanoverrideonsiteswitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCLEANOVERRIDEONSITESWITCH() {
        return cleanoverrideonsiteswitch;
    }

    /**
     * Sets the value of the cleanoverrideonsiteswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCLEANOVERRIDEONSITESWITCH(Boolean value) {
        this.cleanoverrideonsiteswitch = value;
    }

    /**
     * Gets the value of the apischeckview property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKVIEW() {
        return apischeckview;
    }

    /**
     * Sets the value of the apischeckview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKVIEW(Object value) {
        this.apischeckview = value;
    }

    /**
     * Gets the value of the apischeckcategory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKCATEGORY() {
        return apischeckcategory;
    }

    /**
     * Sets the value of the apischeckcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKCATEGORY(Object value) {
        this.apischeckcategory = value;
    }

    /**
     * Gets the value of the apischeckmandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKMANDATORY() {
        return apischeckmandatory;
    }

    /**
     * Sets the value of the apischeckmandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKMANDATORY(Object value) {
        this.apischeckmandatory = value;
    }

    /**
     * Gets the value of the apischeckoptional property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKOPTIONAL() {
        return apischeckoptional;
    }

    /**
     * Sets the value of the apischeckoptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKOPTIONAL(Object value) {
        this.apischeckoptional = value;
    }

    /**
     * Gets the value of the apischeckstructure property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKSTRUCTURE() {
        return apischeckstructure;
    }

    /**
     * Sets the value of the apischeckstructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKSTRUCTURE(Object value) {
        this.apischeckstructure = value;
    }

    /**
     * Gets the value of the apischeckstructurepassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apischeckstructurepassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPISCHECKSTRUCTUREPASSENGER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirAvailabilityInput.APISCHECKSTRUCTUREPASSENGER }
     * 
     * 
     */
    public List<AirAvailabilityInput.APISCHECKSTRUCTUREPASSENGER> getAPISCHECKSTRUCTUREPASSENGER() {
        if (apischeckstructurepassenger == null) {
            apischeckstructurepassenger = new ArrayList<AirAvailabilityInput.APISCHECKSTRUCTUREPASSENGER>();
        }
        return this.apischeckstructurepassenger;
    }

    /**
     * Gets the value of the listbookedelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listbookedelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBOOKEDELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOOKEDELEMENTType }
     * 
     * 
     */
    public List<BOOKEDELEMENTType> getLISTBOOKEDELEMENT() {
        if (listbookedelement == null) {
            listbookedelement = new ArrayList<BOOKEDELEMENTType>();
        }
        return this.listbookedelement;
    }

    /**
     * Gets the value of the listlinksegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listlinksegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTLINKSEGMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LINKSEGMENTType }
     * 
     * 
     */
    public List<LINKSEGMENTType> getLISTLINKSEGMENT() {
        if (listlinksegment == null) {
            listlinksegment = new ArrayList<LINKSEGMENTType>();
        }
        return this.listlinksegment;
    }

    /**
     * Gets the value of the pocoverride property.
     * 
     * @return
     *     possible object is
     *     {@link POCOVERRIDEType }
     *     
     */
    public POCOVERRIDEType getPOCOVERRIDE() {
        return pocoverride;
    }

    /**
     * Sets the value of the pocoverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCOVERRIDEType }
     *     
     */
    public void setPOCOVERRIDE(POCOVERRIDEType value) {
        this.pocoverride = value;
    }

    /**
     * Gets the value of the listclid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listclid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCLID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirAvailabilityInput.LISTCLID }
     * 
     * 
     */
    public List<AirAvailabilityInput.LISTCLID> getLISTCLID() {
        if (listclid == null) {
            listclid = new ArrayList<AirAvailabilityInput.LISTCLID>();
        }
        return this.listclid;
    }

    /**
     * Gets the value of the isumnrflow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISUMNRFLOW() {
        return isumnrflow;
    }

    /**
     * Sets the value of the isumnrflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISUMNRFLOW(Boolean value) {
        this.isumnrflow = value;
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TRAVELER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_STRUCTURE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "travelerid",
        "liststructure"
    })
    public static class APISCHECKSTRUCTUREPASSENGER
        implements Serializable
    {

        @XmlElement(name = "TRAVELER_ID")
        protected Object travelerid;
        @XmlElement(name = "LIST_STRUCTURE")
        protected Object liststructure;

        /**
         * Gets the value of the travelerid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTRAVELERID() {
            return travelerid;
        }

        /**
         * Sets the value of the travelerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTRAVELERID(Object value) {
            this.travelerid = value;
        }

        /**
         * Gets the value of the liststructure property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLISTSTRUCTURE() {
            return liststructure;
        }

        /**
         * Sets the value of the liststructure property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLISTSTRUCTURE(Object value) {
            this.liststructure = value;
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
     *         &lt;element name="LIST_CARRIER_CODE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CLID_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "listcarriercode",
        "clididentifier"
    })
    public static class LISTCLID
        implements Serializable
    {

        @XmlElement(name = "LIST_CARRIER_CODE", required = true)
        protected List<AirAvailabilityInput.LISTCLID.LISTCARRIERCODE> listcarriercode;
        @XmlElement(name = "CLID_IDENTIFIER", required = true)
        protected Object clididentifier;

        /**
         * Gets the value of the listcarriercode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcarriercode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCARRIERCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirAvailabilityInput.LISTCLID.LISTCARRIERCODE }
         * 
         * 
         */
        public List<AirAvailabilityInput.LISTCLID.LISTCARRIERCODE> getLISTCARRIERCODE() {
            if (listcarriercode == null) {
                listcarriercode = new ArrayList<AirAvailabilityInput.LISTCLID.LISTCARRIERCODE>();
            }
            return this.listcarriercode;
        }

        /**
         * Gets the value of the clididentifier property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCLIDIDENTIFIER() {
            return clididentifier;
        }

        /**
         * Sets the value of the clididentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCLIDIDENTIFIER(Object value) {
            this.clididentifier = value;
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
         *         &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            "carriercode"
        })
        public static class LISTCARRIERCODE
            implements Serializable
        {

            @XmlElement(name = "CARRIER_CODE", required = true)
            protected Object carriercode;

            /**
             * Gets the value of the carriercode property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCARRIERCODE() {
                return carriercode;
            }

            /**
             * Sets the value of the carriercode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCARRIERCODE(Object value) {
                this.carriercode = value;
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
     *         &lt;element name="REQUEST_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IP_ADDRESSES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IS_SSL_REQUEST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="CLIENT_REFERRER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "requesturl",
        "ipaddresses",
        "issslrequest",
        "clientreferrer"
    })
    public static class REQUESTINFO
        implements Serializable
    {

        @XmlElement(name = "REQUEST_URL")
        protected String requesturl;
        @XmlElement(name = "IP_ADDRESSES")
        protected List<String> ipaddresses;
        @XmlElement(name = "IS_SSL_REQUEST")
        protected Boolean issslrequest;
        @XmlElement(name = "CLIENT_REFERRER")
        protected String clientreferrer;

        /**
         * Gets the value of the requesturl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREQUESTURL() {
            return requesturl;
        }

        /**
         * Sets the value of the requesturl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREQUESTURL(String value) {
            this.requesturl = value;
        }

        /**
         * Gets the value of the ipaddresses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ipaddresses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIPADDRESSES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIPADDRESSES() {
            if (ipaddresses == null) {
                ipaddresses = new ArrayList<String>();
            }
            return this.ipaddresses;
        }

        /**
         * Gets the value of the issslrequest property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISSSLREQUEST() {
            return issslrequest;
        }

        /**
         * Sets the value of the issslrequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISSSLREQUEST(Boolean value) {
            this.issslrequest = value;
        }

        /**
         * Gets the value of the clientreferrer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLIENTREFERRER() {
            return clientreferrer;
        }

        /**
         * Sets the value of the clientreferrer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLIENTREFERRER(String value) {
            this.clientreferrer = value;
        }

    }

}
