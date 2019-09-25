
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilityinputtype;

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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.common.common.DATERANGEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.LISTITINERARYMILESCOST;
import com.koreanair.external.eretail.vo.farecommon.farecommon.TICKETDOCUMENTType;
import com.koreanair.external.eretail.vo.farecommon.farecontext.LISTCORPORATENUMBER;
import com.koreanair.external.eretail.vo.farecommon.flowsignature.FLOWSIGNATUREType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.INPUTLISTTRAVELLERType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.LISTTRAVELLERINFOType;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercertificateavailabilityrulestype.AVAILABILITYRULESType;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommon.LISTPRICINGTYPE;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommon.RBDType;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommon.TRIPDURATIONRANGE;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.COMMERCIALFAREFAMILYInputType;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.LISTDESTINATION;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.LISTLIGHTFAREFAMILY;
import com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput.LISTPRICEBYINPUT;
import com.koreanair.external.eretail.vo.tripplan.traveller_information.TRAVELLERINFORMATION;


/**
 * Scenario 1: Request for Calendar.
 * 			Scenario 2: Request for Upsell Panel.
 * 				Scenario 3: Request for Calendar and Upsell Panel Pricing by Itinearary.
 * 
 * <p>Java class for FlexPricerAvailabilityInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexPricerAvailabilityInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRANSACTION_ID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="FlexPricerAvailability"/&gt;
 *               &lt;enumeration value="FlexPricerAwardAvailability"/&gt;
 *               &lt;enumeration value="FlexPricerTicketChangerAvailability"/&gt;
 *               &lt;enumeration value="FlexPricerCertificateAvailability"/&gt;
 *               &lt;enumeration value="FlexPricerAvailabilityBoundCalculation"/&gt;
 *               &lt;enumeration value="FlexPricerTicketChangerDossierAvailability"/&gt;
 *               &lt;enumeration value="FlexPricerComplexItineraryAvailability"/&gt;
 *               &lt;enumeration value="FlexPricerAwardComplexItineraryAvailability"/&gt;
 *               &lt;enumeration value="FlexPricerTicketChangerComplexItineraryAvailability"/&gt;
 *               &lt;enumeration value="FlexPricerTicketChangerAvailabilityBoundCalculation"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}PAGE_TICKET" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_TRAVELLER" maxOccurs="9"/&gt;
 *         &lt;group ref="{}FlexPricerAvailabilityGroup"/&gt;
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
@XmlType(name = "FlexPricerAvailabilityInputType", propOrder = {
    "transactionid",
    "pageticket",
    "listtraveller",
    "flowsignature",
    "site",
    "language",
    "fromrequester",
    "availofficeid",
    "markets",
    "triptype",
    "iscalendar",
    "cabin",
    "combineffonlyinsamecff",
    "farefamilydistribution",
    "listcommercialfarefamily",
    "listlightfarefamily",
    "listpricebyinput",
    "listdestination",
    "directnonstop",
    "requestffservices",
    "requestrecoservices",
    "requestfrompriceservices",
    "outputstructure",
    "ojservicelevel",
    "pbinoertoutput",
    "arrangeby",
    "pricingtype",
    "backuppricingtype",
    "listpricingtype",
    "displaytype",
    "owcdualflowsequence",
    "tripduration",
    "tripdurationrange",
    "listitinerarymilescost",
    "directlogin",
    "numberofprofiles",
    "travellerinformation",
    "isstructuredxml",
    "refresh",
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
    "listcorporatenumber",
    "typeofcorporatefare",
    "listflightpreference",
    "owcstdgroupcalendars",
    "owcstdgroupupsells",
    "listtravellerinfo",
    "requestoptions",
    "listpricingoptions",
    "isupsellinowc",
    "waitlistratio",
    "cleanptccontext",
    "filter",
    "mergerules",
    "availabilityrules",
    "listdocument",
    "isumnrflow",
    "cemid",
    "promocode"
})
public class FlexPricerAvailabilityInputType
    implements Serializable
{

    @XmlElement(name = "TRANSACTION_ID", required = true)
    protected String transactionid;
    @XmlElement(name = "PAGE_TICKET")
    protected String pageticket;
    @XmlElement(name = "LIST_TRAVELLER", required = true)
    protected List<INPUTLISTTRAVELLERType> listtraveller;
    @XmlElement(name = "FLOW_SIGNATURE")
    protected FLOWSIGNATUREType flowsignature;
    @XmlElement(name = "SITE", required = true)
    protected String site;
    @XmlElement(name = "LANGUAGE", required = true)
    protected String language;
    @XmlElement(name = "FROM_REQUESTER")
    protected String fromrequester;
    @XmlElement(name = "AVAIL_OFFICE_ID")
    protected Object availofficeid;
    @XmlElement(name = "MARKETS")
    protected String markets;
    @XmlElement(name = "TRIP_TYPE", required = true)
    protected String triptype;
    @XmlElement(name = "IS_CALENDAR")
    protected Boolean iscalendar;
    @XmlElement(name = "CABIN")
    protected Object cabin;
    @XmlElement(name = "COMBINE_FF_ONLY_IN_SAME_CFF")
    protected Boolean combineffonlyinsamecff;
    @XmlElement(name = "FARE_FAMILY_DISTRIBUTION")
    protected Boolean farefamilydistribution;
    @XmlElement(name = "LIST_COMMERCIAL_FARE_FAMILY")
    protected List<COMMERCIALFAREFAMILYInputType> listcommercialfarefamily;
    @XmlElement(name = "LIST_LIGHT_FARE_FAMILY")
    protected List<LISTLIGHTFAREFAMILY> listlightfarefamily;
    @XmlElement(name = "LIST_PRICE_BY_INPUT")
    protected LISTPRICEBYINPUT listpricebyinput;
    @XmlElement(name = "LIST_DESTINATION", required = true)
    protected List<LISTDESTINATION> listdestination;
    @XmlElement(name = "DIRECT_NON_STOP")
    protected Boolean directnonstop;
    @XmlElement(name = "REQUEST_FF_SERVICES")
    protected Boolean requestffservices;
    @XmlElement(name = "REQUEST_RECO_SERVICES")
    protected Boolean requestrecoservices;
    @XmlElement(name = "REQUEST_FROM_PRICE_SERVICES")
    protected Boolean requestfrompriceservices;
    @XmlElement(name = "OUTPUT_STRUCTURE")
    protected String outputstructure;
    @XmlElement(name = "OJ_SERVICE_LEVEL")
    protected Boolean ojservicelevel;
    @XmlElement(name = "PBI_NO_ERT_OUTPUT")
    protected String pbinoertoutput;
    @XmlElement(name = "ARRANGE_BY")
    protected String arrangeby;
    @XmlElement(name = "PRICING_TYPE")
    protected String pricingtype;
    @XmlElement(name = "BACKUP_PRICING_TYPE")
    protected Object backuppricingtype;
    @XmlElement(name = "LIST_PRICING_TYPE")
    protected List<LISTPRICINGTYPE> listpricingtype;
    @XmlElement(name = "DISPLAY_TYPE")
    protected BigInteger displaytype;
    @XmlElement(name = "OWC_DUAL_FLOW_SEQUENCE")
    protected BigInteger owcdualflowsequence;
    @XmlElement(name = "TRIP_DURATION")
    protected BigInteger tripduration;
    @XmlElement(name = "TRIP_DURATION_RANGE")
    protected TRIPDURATIONRANGE tripdurationrange;
    @XmlElement(name = "LIST_ITINERARY_MILES_COST")
    protected List<LISTITINERARYMILESCOST> listitinerarymilescost;
    @XmlElement(name = "DIRECT_LOGIN")
    protected String directlogin;
    @XmlElement(name = "NUMBER_OF_PROFILES")
    protected BigInteger numberofprofiles;
    @XmlElement(name = "TRAVELLER_INFORMATION")
    protected List<TRAVELLERINFORMATION> travellerinformation;
    @XmlElement(name = "IS_STRUCTURED_XML")
    protected String isstructuredxml;
    @XmlElement(name = "REFRESH")
    protected BigInteger refresh;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<String> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "REQUEST_INFO")
    protected FlexPricerAvailabilityInputType.REQUESTINFO requestinfo;
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
    protected List<FlexPricerAvailabilityInputType.APISCHECKSTRUCTUREPASSENGER> apischeckstructurepassenger;
    @XmlElement(name = "LIST_CORPORATE_NUMBER")
    protected List<LISTCORPORATENUMBER> listcorporatenumber;
    @XmlElement(name = "TYPE_OF_CORPORATE_FARE")
    protected BigInteger typeofcorporatefare;
    @XmlElement(name = "LIST_FLIGHT_PREFERENCE")
    protected FlexPricerAvailabilityInputType.LISTFLIGHTPREFERENCE listflightpreference;
    @XmlElement(name = "OWC_STD_GROUP_CALENDARS")
    protected Boolean owcstdgroupcalendars;
    @XmlElement(name = "OWC_STD_GROUP_UPSELLS")
    protected Boolean owcstdgroupupsells;
    @XmlElement(name = "LIST_TRAVELLER_INFO")
    protected List<LISTTRAVELLERINFOType> listtravellerinfo;
    @XmlElement(name = "REQUEST_OPTIONS")
    protected REQUESTOPTIONSTypeFlex requestoptions;
    @XmlElement(name = "LIST_PRICING_OPTIONS")
    protected LISTPRICINGOPTIONSTypeFlex listpricingoptions;
    @XmlElement(name = "IS_UPSELL_IN_OWC")
    protected Object isupsellinowc;
    @XmlElement(name = "WAITLIST_RATIO")
    protected Object waitlistratio;
    @XmlElement(name = "CLEAN_PTC_CONTEXT")
    protected Boolean cleanptccontext;
    @XmlElement(name = "FILTER")
    protected FlexPricerAvailabilityInputType.FILTER filter;
    @XmlElement(name = "MERGE_RULES")
    protected FlexPricerAvailabilityInputType.MERGERULES mergerules;
    @XmlElement(name = "AVAILABILITY_RULES")
    protected AVAILABILITYRULESType availabilityrules;
    @XmlElement(name = "LIST_DOCUMENT")
    protected List<FlexPricerAvailabilityInputType.LISTDOCUMENT> listdocument;
    @XmlElement(name = "IS_UMNR_FLOW")
    protected Boolean isumnrflow;
    @XmlElement(name = "CEM_ID")
    protected String cemid;
    @XmlElement(name = "PROMOCODE")
    protected String promocode;
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
     * Gets the value of the pageticket property.
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
     * {@link INPUTLISTTRAVELLERType }
     * 
     * 
     */
    public List<INPUTLISTTRAVELLERType> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<INPUTLISTTRAVELLERType>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the flowsignature property.
     * 
     * @return
     *     possible object is
     *     {@link FLOWSIGNATUREType }
     *     
     */
    public FLOWSIGNATUREType getFLOWSIGNATURE() {
        return flowsignature;
    }

    /**
     * Sets the value of the flowsignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLOWSIGNATUREType }
     *     
     */
    public void setFLOWSIGNATURE(FLOWSIGNATUREType value) {
        this.flowsignature = value;
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
     * Gets the value of the fromrequester property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFROMREQUESTER() {
        return fromrequester;
    }

    /**
     * Sets the value of the fromrequester property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFROMREQUESTER(String value) {
        this.fromrequester = value;
    }

    /**
     * Gets the value of the availofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAVAILOFFICEID() {
        return availofficeid;
    }

    /**
     * Sets the value of the availofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAVAILOFFICEID(Object value) {
        this.availofficeid = value;
    }

    /**
     * Gets the value of the markets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARKETS() {
        return markets;
    }

    /**
     * Sets the value of the markets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARKETS(String value) {
        this.markets = value;
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
     * Gets the value of the iscalendar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISCALENDAR() {
        return iscalendar;
    }

    /**
     * Sets the value of the iscalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISCALENDAR(Boolean value) {
        this.iscalendar = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCABIN() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCABIN(Object value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the combineffonlyinsamecff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCOMBINEFFONLYINSAMECFF() {
        return combineffonlyinsamecff;
    }

    /**
     * Sets the value of the combineffonlyinsamecff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCOMBINEFFONLYINSAMECFF(Boolean value) {
        this.combineffonlyinsamecff = value;
    }

    /**
     * Gets the value of the farefamilydistribution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFAREFAMILYDISTRIBUTION() {
        return farefamilydistribution;
    }

    /**
     * Sets the value of the farefamilydistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFAREFAMILYDISTRIBUTION(Boolean value) {
        this.farefamilydistribution = value;
    }

    /**
     * Gets the value of the listcommercialfarefamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcommercialfarefamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOMMERCIALFAREFAMILY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COMMERCIALFAREFAMILYInputType }
     * 
     * 
     */
    public List<COMMERCIALFAREFAMILYInputType> getLISTCOMMERCIALFAREFAMILY() {
        if (listcommercialfarefamily == null) {
            listcommercialfarefamily = new ArrayList<COMMERCIALFAREFAMILYInputType>();
        }
        return this.listcommercialfarefamily;
    }

    /**
     * Gets the value of the listlightfarefamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listlightfarefamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTLIGHTFAREFAMILY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTLIGHTFAREFAMILY }
     * 
     * 
     */
    public List<LISTLIGHTFAREFAMILY> getLISTLIGHTFAREFAMILY() {
        if (listlightfarefamily == null) {
            listlightfarefamily = new ArrayList<LISTLIGHTFAREFAMILY>();
        }
        return this.listlightfarefamily;
    }

    /**
     * Gets the value of the listpricebyinput property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPRICEBYINPUT }
     *     
     */
    public LISTPRICEBYINPUT getLISTPRICEBYINPUT() {
        return listpricebyinput;
    }

    /**
     * Sets the value of the listpricebyinput property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPRICEBYINPUT }
     *     
     */
    public void setLISTPRICEBYINPUT(LISTPRICEBYINPUT value) {
        this.listpricebyinput = value;
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
     * {@link LISTDESTINATION }
     * 
     * 
     */
    public List<LISTDESTINATION> getLISTDESTINATION() {
        if (listdestination == null) {
            listdestination = new ArrayList<LISTDESTINATION>();
        }
        return this.listdestination;
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
     * Gets the value of the requestffservices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREQUESTFFSERVICES() {
        return requestffservices;
    }

    /**
     * Sets the value of the requestffservices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREQUESTFFSERVICES(Boolean value) {
        this.requestffservices = value;
    }

    /**
     * Gets the value of the requestrecoservices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREQUESTRECOSERVICES() {
        return requestrecoservices;
    }

    /**
     * Sets the value of the requestrecoservices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREQUESTRECOSERVICES(Boolean value) {
        this.requestrecoservices = value;
    }

    /**
     * Gets the value of the requestfrompriceservices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREQUESTFROMPRICESERVICES() {
        return requestfrompriceservices;
    }

    /**
     * Sets the value of the requestfrompriceservices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREQUESTFROMPRICESERVICES(Boolean value) {
        this.requestfrompriceservices = value;
    }

    /**
     * Gets the value of the outputstructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTPUTSTRUCTURE() {
        return outputstructure;
    }

    /**
     * Sets the value of the outputstructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTPUTSTRUCTURE(String value) {
        this.outputstructure = value;
    }

    /**
     * Gets the value of the ojservicelevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOJSERVICELEVEL() {
        return ojservicelevel;
    }

    /**
     * Sets the value of the ojservicelevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOJSERVICELEVEL(Boolean value) {
        this.ojservicelevel = value;
    }

    /**
     * Gets the value of the pbinoertoutput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBINOERTOUTPUT() {
        return pbinoertoutput;
    }

    /**
     * Sets the value of the pbinoertoutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBINOERTOUTPUT(String value) {
        this.pbinoertoutput = value;
    }

    /**
     *  Display availabilites by City Pair or by Itinerary. Value C = City Pair, Value I= Itinerary.
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
     *  -> Mandatory tag in standard Flexpricer mode.
     * -> In Flexpricer Dual flow, this flag could be empty or completely absent in the request. In this case LIST_PRICING_TYPE should be set.
     * -> When it is sent, it can take the following value: 	[C : Display availabilites by City Pair], [O : One Way Display], [I : Itinerary Display].
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICINGTYPE() {
        return pricingtype;
    }

    /**
     * Sets the value of the pricingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICINGTYPE(String value) {
        this.pricingtype = value;
    }

    /**
     * Gets the value of the backuppricingtype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBACKUPPRICINGTYPE() {
        return backuppricingtype;
    }

    /**
     * Sets the value of the backuppricingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBACKUPPRICINGTYPE(Object value) {
        this.backuppricingtype = value;
    }

    /**
     * Gets the value of the listpricingtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpricingtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICINGTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICINGTYPE }
     * 
     * 
     */
    public List<LISTPRICINGTYPE> getLISTPRICINGTYPE() {
        if (listpricingtype == null) {
            listpricingtype = new ArrayList<LISTPRICINGTYPE>();
        }
        return this.listpricingtype;
    }

    /**
     * Gets the value of the displaytype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDISPLAYTYPE() {
        return displaytype;
    }

    /**
     * Sets the value of the displaytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDISPLAYTYPE(BigInteger value) {
        this.displaytype = value;
    }

    /**
     * Gets the value of the owcdualflowsequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOWCDUALFLOWSEQUENCE() {
        return owcdualflowsequence;
    }

    /**
     * Sets the value of the owcdualflowsequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOWCDUALFLOWSEQUENCE(BigInteger value) {
        this.owcdualflowsequence = value;
    }

    /**
     * Only applicable to Round trips. Allowed values for trip duration are from 1 to 365 days.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRIPDURATION() {
        return tripduration;
    }

    /**
     * Sets the value of the tripduration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRIPDURATION(BigInteger value) {
        this.tripduration = value;
    }

    /**
     * Only applicable to Round trips. Only allowed if trip duation used. Allowed values for trip duration range are from +/- 1 for commercial fare families and =/-3 for light fare families.
     * 
     * @return
     *     possible object is
     *     {@link TRIPDURATIONRANGE }
     *     
     */
    public TRIPDURATIONRANGE getTRIPDURATIONRANGE() {
        return tripdurationrange;
    }

    /**
     * Sets the value of the tripdurationrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIPDURATIONRANGE }
     *     
     */
    public void setTRIPDURATIONRANGE(TRIPDURATIONRANGE value) {
        this.tripdurationrange = value;
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
     * {@link LISTITINERARYMILESCOST }
     * 
     * 
     */
    public List<LISTITINERARYMILESCOST> getLISTITINERARYMILESCOST() {
        if (listitinerarymilescost == null) {
            listitinerarymilescost = new ArrayList<LISTITINERARYMILESCOST>();
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
     * Gets the value of the refresh property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getREFRESH() {
        return refresh;
    }

    /**
     * Sets the value of the refresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setREFRESH(BigInteger value) {
        this.refresh = value;
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
     *     {@link FlexPricerAvailabilityInputType.REQUESTINFO }
     *     
     */
    public FlexPricerAvailabilityInputType.REQUESTINFO getREQUESTINFO() {
        return requestinfo;
    }

    /**
     * Sets the value of the requestinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerAvailabilityInputType.REQUESTINFO }
     *     
     */
    public void setREQUESTINFO(FlexPricerAvailabilityInputType.REQUESTINFO value) {
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
     * {@link FlexPricerAvailabilityInputType.APISCHECKSTRUCTUREPASSENGER }
     * 
     * 
     */
    public List<FlexPricerAvailabilityInputType.APISCHECKSTRUCTUREPASSENGER> getAPISCHECKSTRUCTUREPASSENGER() {
        if (apischeckstructurepassenger == null) {
            apischeckstructurepassenger = new ArrayList<FlexPricerAvailabilityInputType.APISCHECKSTRUCTUREPASSENGER>();
        }
        return this.apischeckstructurepassenger;
    }

    /**
     * Gets the value of the listcorporatenumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcorporatenumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCORPORATENUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTCORPORATENUMBER }
     * 
     * 
     */
    public List<LISTCORPORATENUMBER> getLISTCORPORATENUMBER() {
        if (listcorporatenumber == null) {
            listcorporatenumber = new ArrayList<LISTCORPORATENUMBER>();
        }
        return this.listcorporatenumber;
    }

    /**
     * not used for Light fare families.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTYPEOFCORPORATEFARE() {
        return typeofcorporatefare;
    }

    /**
     * Sets the value of the typeofcorporatefare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTYPEOFCORPORATEFARE(BigInteger value) {
        this.typeofcorporatefare = value;
    }

    /**
     * Gets the value of the listflightpreference property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerAvailabilityInputType.LISTFLIGHTPREFERENCE }
     *     
     */
    public FlexPricerAvailabilityInputType.LISTFLIGHTPREFERENCE getLISTFLIGHTPREFERENCE() {
        return listflightpreference;
    }

    /**
     * Sets the value of the listflightpreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerAvailabilityInputType.LISTFLIGHTPREFERENCE }
     *     
     */
    public void setLISTFLIGHTPREFERENCE(FlexPricerAvailabilityInputType.LISTFLIGHTPREFERENCE value) {
        this.listflightpreference = value;
    }

    /**
     * Gets the value of the owcstdgroupcalendars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOWCSTDGROUPCALENDARS() {
        return owcstdgroupcalendars;
    }

    /**
     * Sets the value of the owcstdgroupcalendars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOWCSTDGROUPCALENDARS(Boolean value) {
        this.owcstdgroupcalendars = value;
    }

    /**
     * Gets the value of the owcstdgroupupsells property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOWCSTDGROUPUPSELLS() {
        return owcstdgroupupsells;
    }

    /**
     * Sets the value of the owcstdgroupupsells property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOWCSTDGROUPUPSELLS(Boolean value) {
        this.owcstdgroupupsells = value;
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
     * {@link LISTTRAVELLERINFOType }
     * 
     * 
     */
    public List<LISTTRAVELLERINFOType> getLISTTRAVELLERINFO() {
        if (listtravellerinfo == null) {
            listtravellerinfo = new ArrayList<LISTTRAVELLERINFOType>();
        }
        return this.listtravellerinfo;
    }

    /**
     * Gets the value of the requestoptions property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTOPTIONSTypeFlex }
     *     
     */
    public REQUESTOPTIONSTypeFlex getREQUESTOPTIONS() {
        return requestoptions;
    }

    /**
     * Sets the value of the requestoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTOPTIONSTypeFlex }
     *     
     */
    public void setREQUESTOPTIONS(REQUESTOPTIONSTypeFlex value) {
        this.requestoptions = value;
    }

    /**
     * Gets the value of the listpricingoptions property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPRICINGOPTIONSTypeFlex }
     *     
     */
    public LISTPRICINGOPTIONSTypeFlex getLISTPRICINGOPTIONS() {
        return listpricingoptions;
    }

    /**
     * Sets the value of the listpricingoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPRICINGOPTIONSTypeFlex }
     *     
     */
    public void setLISTPRICINGOPTIONS(LISTPRICINGOPTIONSTypeFlex value) {
        this.listpricingoptions = value;
    }

    /**
     * Gets the value of the isupsellinowc property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISUPSELLINOWC() {
        return isupsellinowc;
    }

    /**
     * Sets the value of the isupsellinowc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISUPSELLINOWC(Object value) {
        this.isupsellinowc = value;
    }

    /**
     * Gets the value of the waitlistratio property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWAITLISTRATIO() {
        return waitlistratio;
    }

    /**
     * Sets the value of the waitlistratio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWAITLISTRATIO(Object value) {
        this.waitlistratio = value;
    }

    /**
     * Gets the value of the cleanptccontext property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCLEANPTCCONTEXT() {
        return cleanptccontext;
    }

    /**
     * Sets the value of the cleanptccontext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCLEANPTCCONTEXT(Boolean value) {
        this.cleanptccontext = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerAvailabilityInputType.FILTER }
     *     
     */
    public FlexPricerAvailabilityInputType.FILTER getFILTER() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerAvailabilityInputType.FILTER }
     *     
     */
    public void setFILTER(FlexPricerAvailabilityInputType.FILTER value) {
        this.filter = value;
    }

    /**
     * Gets the value of the mergerules property.
     * 
     * @return
     *     possible object is
     *     {@link FlexPricerAvailabilityInputType.MERGERULES }
     *     
     */
    public FlexPricerAvailabilityInputType.MERGERULES getMERGERULES() {
        return mergerules;
    }

    /**
     * Sets the value of the mergerules property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexPricerAvailabilityInputType.MERGERULES }
     *     
     */
    public void setMERGERULES(FlexPricerAvailabilityInputType.MERGERULES value) {
        this.mergerules = value;
    }

    /**
     * Gets the value of the availabilityrules property.
     * 
     * @return
     *     possible object is
     *     {@link AVAILABILITYRULESType }
     *     
     */
    public AVAILABILITYRULESType getAVAILABILITYRULES() {
        return availabilityrules;
    }

    /**
     * Sets the value of the availabilityrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVAILABILITYRULESType }
     *     
     */
    public void setAVAILABILITYRULES(AVAILABILITYRULESType value) {
        this.availabilityrules = value;
    }

    /**
     * Gets the value of the listdocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDOCUMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlexPricerAvailabilityInputType.LISTDOCUMENT }
     * 
     * 
     */
    public List<FlexPricerAvailabilityInputType.LISTDOCUMENT> getLISTDOCUMENT() {
        if (listdocument == null) {
            listdocument = new ArrayList<FlexPricerAvailabilityInputType.LISTDOCUMENT>();
        }
        return this.listdocument;
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
     * Gets the value of the cemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEMID() {
        return cemid;
    }

    /**
     * Sets the value of the cemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEMID(String value) {
        this.cemid = value;
    }

    /**
     * Gets the value of the promocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROMOCODE() {
        return promocode;
    }

    /**
     * Sets the value of the promocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROMOCODE(String value) {
        this.promocode = value;
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
     *         &lt;element name="DATE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ABSOLUTE_RANGE" type="{}DATE_RANGE_Type"/&gt;
     *                   &lt;element name="LIST_ANY_RANGE" type="{}DATE_RANGE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_BLACKLIST_RANGE" type="{}DATE_RANGE_Type" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_RBD" type="{}RBD_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FARE_COMPONENT" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MIN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="MAX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="MIN_INCLUSIVE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="MAX_EXCLUSIVE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "date",
        "listrbd",
        "farecomponent"
    })
    public static class FILTER
        implements Serializable
    {

        @XmlElement(name = "DATE", required = true)
        protected FlexPricerAvailabilityInputType.FILTER.DATE date;
        @XmlElement(name = "LIST_RBD")
        protected List<RBDType> listrbd;
        @XmlElement(name = "FARE_COMPONENT")
        protected FlexPricerAvailabilityInputType.FILTER.FARECOMPONENT farecomponent;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link FlexPricerAvailabilityInputType.FILTER.DATE }
         *     
         */
        public FlexPricerAvailabilityInputType.FILTER.DATE getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlexPricerAvailabilityInputType.FILTER.DATE }
         *     
         */
        public void setDATE(FlexPricerAvailabilityInputType.FILTER.DATE value) {
            this.date = value;
        }

        /**
         * Gets the value of the listrbd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listrbd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTRBD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RBDType }
         * 
         * 
         */
        public List<RBDType> getLISTRBD() {
            if (listrbd == null) {
                listrbd = new ArrayList<RBDType>();
            }
            return this.listrbd;
        }

        /**
         * Gets the value of the farecomponent property.
         * 
         * @return
         *     possible object is
         *     {@link FlexPricerAvailabilityInputType.FILTER.FARECOMPONENT }
         *     
         */
        public FlexPricerAvailabilityInputType.FILTER.FARECOMPONENT getFARECOMPONENT() {
            return farecomponent;
        }

        /**
         * Sets the value of the farecomponent property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlexPricerAvailabilityInputType.FILTER.FARECOMPONENT }
         *     
         */
        public void setFARECOMPONENT(FlexPricerAvailabilityInputType.FILTER.FARECOMPONENT value) {
            this.farecomponent = value;
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
         *         &lt;element name="ABSOLUTE_RANGE" type="{}DATE_RANGE_Type"/&gt;
         *         &lt;element name="LIST_ANY_RANGE" type="{}DATE_RANGE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="LIST_BLACKLIST_RANGE" type="{}DATE_RANGE_Type" minOccurs="0"/&gt;
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
            "absoluterange",
            "listanyrange",
            "listblacklistrange"
        })
        public static class DATE
            implements Serializable
        {

            @XmlElement(name = "ABSOLUTE_RANGE", required = true)
            protected DATERANGEType absoluterange;
            @XmlElement(name = "LIST_ANY_RANGE")
            protected List<DATERANGEType> listanyrange;
            @XmlElement(name = "LIST_BLACKLIST_RANGE")
            protected DATERANGEType listblacklistrange;

            /**
             * Gets the value of the absoluterange property.
             * 
             * @return
             *     possible object is
             *     {@link DATERANGEType }
             *     
             */
            public DATERANGEType getABSOLUTERANGE() {
                return absoluterange;
            }

            /**
             * Sets the value of the absoluterange property.
             * 
             * @param value
             *     allowed object is
             *     {@link DATERANGEType }
             *     
             */
            public void setABSOLUTERANGE(DATERANGEType value) {
                this.absoluterange = value;
            }

            /**
             * Gets the value of the listanyrange property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listanyrange property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTANYRANGE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DATERANGEType }
             * 
             * 
             */
            public List<DATERANGEType> getLISTANYRANGE() {
                if (listanyrange == null) {
                    listanyrange = new ArrayList<DATERANGEType>();
                }
                return this.listanyrange;
            }

            /**
             * Gets the value of the listblacklistrange property.
             * 
             * @return
             *     possible object is
             *     {@link DATERANGEType }
             *     
             */
            public DATERANGEType getLISTBLACKLISTRANGE() {
                return listblacklistrange;
            }

            /**
             * Sets the value of the listblacklistrange property.
             * 
             * @param value
             *     allowed object is
             *     {@link DATERANGEType }
             *     
             */
            public void setLISTBLACKLISTRANGE(DATERANGEType value) {
                this.listblacklistrange = value;
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
         *         &lt;element name="MIN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="MAX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="MIN_INCLUSIVE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="MAX_EXCLUSIVE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "min",
            "max",
            "mininclusive",
            "maxexclusive"
        })
        public static class FARECOMPONENT
            implements Serializable
        {

            @XmlElement(name = "MIN")
            protected Object min;
            @XmlElement(name = "MAX")
            protected Object max;
            @XmlElement(name = "MIN_INCLUSIVE")
            protected Object mininclusive;
            @XmlElement(name = "MAX_EXCLUSIVE")
            protected Object maxexclusive;

            /**
             * Gets the value of the min property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getMIN() {
                return min;
            }

            /**
             * Sets the value of the min property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setMIN(Object value) {
                this.min = value;
            }

            /**
             * Gets the value of the max property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getMAX() {
                return max;
            }

            /**
             * Sets the value of the max property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setMAX(Object value) {
                this.max = value;
            }

            /**
             * Gets the value of the mininclusive property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getMININCLUSIVE() {
                return mininclusive;
            }

            /**
             * Sets the value of the mininclusive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setMININCLUSIVE(Object value) {
                this.mininclusive = value;
            }

            /**
             * Gets the value of the maxexclusive property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getMAXEXCLUSIVE() {
                return maxexclusive;
            }

            /**
             * Sets the value of the maxexclusive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setMAXEXCLUSIVE(Object value) {
                this.maxexclusive = value;
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
     *         &lt;element name="DOCUMENT" type="{}TICKET_DOCUMENT_Type" minOccurs="0"/&gt;
     *         &lt;element name="LIST_ASSOCIATED_SEGMENT" type="{}ASSOCIATED_SEGMENT_TypeFlex" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "document",
        "listassociatedsegment"
    })
    public static class LISTDOCUMENT
        implements Serializable
    {

        @XmlElement(name = "DOCUMENT")
        protected TICKETDOCUMENTType document;
        @XmlElement(name = "LIST_ASSOCIATED_SEGMENT")
        protected List<ASSOCIATEDSEGMENTTypeFlex> listassociatedsegment;

        /**
         * Gets the value of the document property.
         * 
         * @return
         *     possible object is
         *     {@link TICKETDOCUMENTType }
         *     
         */
        public TICKETDOCUMENTType getDOCUMENT() {
            return document;
        }

        /**
         * Sets the value of the document property.
         * 
         * @param value
         *     allowed object is
         *     {@link TICKETDOCUMENTType }
         *     
         */
        public void setDOCUMENT(TICKETDOCUMENTType value) {
            this.document = value;
        }

        /**
         * Gets the value of the listassociatedsegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listassociatedsegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTASSOCIATEDSEGMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ASSOCIATEDSEGMENTTypeFlex }
         * 
         * 
         */
        public List<ASSOCIATEDSEGMENTTypeFlex> getLISTASSOCIATEDSEGMENT() {
            if (listassociatedsegment == null) {
                listassociatedsegment = new ArrayList<ASSOCIATEDSEGMENTTypeFlex>();
            }
            return this.listassociatedsegment;
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
     *         &lt;element name="AIRLINE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "airline"
    })
    public static class LISTFLIGHTPREFERENCE
        implements Serializable
    {

        @XmlElement(name = "AIRLINE", required = true)
        protected Object airline;

        /**
         * Gets the value of the airline property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAIRLINE() {
            return airline;
        }

        /**
         * Sets the value of the airline property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAIRLINE(Object value) {
            this.airline = value;
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
     *         &lt;element name="LIST_RBD" type="{}RBD_Type" maxOccurs="unbounded"/&gt;
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
        "listrbd"
    })
    public static class MERGERULES
        implements Serializable
    {

        @XmlElement(name = "LIST_RBD", required = true)
        protected List<RBDType> listrbd;

        /**
         * Gets the value of the listrbd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listrbd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTRBD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RBDType }
         * 
         * 
         */
        public List<RBDType> getLISTRBD() {
            if (listrbd == null) {
                listrbd = new ArrayList<RBDType>();
            }
            return this.listrbd;
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
