
package com.koreanair.external.eretail.vo.pnr.retrievepnroutput2;

import java.io.Serializable;
import java.math.BigInteger;
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
import com.koreanair.external.eretail.vo.common.common.APISMANAGEROUTPUTTYPE;
import com.koreanair.external.eretail.vo.common.common.APISRULESTYPE;
import com.koreanair.external.eretail.vo.common.common.LISTELEMENTSTATUS;
import com.koreanair.external.eretail.vo.common.common.LISTMSG;
import com.koreanair.external.eretail.vo.farecommon.farecontext.LISTPRICINGOPTIONSType;
import com.koreanair.external.eretail.vo.payment.paymentoutput.PAYMENT;
import com.koreanair.external.eretail.vo.profile.apisinformationoutput.LISTAPISCOUNTRIES;
import com.koreanair.external.eretail.vo.specialservices.service_selection.SERVICESELECTION;
import com.koreanair.external.eretail.vo.specialservices.service_selection_before_rebook.SERVICESELECTIONBEFOREREBOOK;
import com.koreanair.external.eretail.vo.tripplan.accountable_document.ACCOUNTABLEDOCUMENTType;
import com.koreanair.external.eretail.vo.tripplan.air.AIR;
import com.koreanair.external.eretail.vo.tripplan.air_offer.AIROFFER;
import com.koreanair.external.eretail.vo.tripplan.airport_transfer.AIRPORTTRANSFER;
import com.koreanair.external.eretail.vo.tripplan.ancillary_services.ANCILLARYSERVICES;
import com.koreanair.external.eretail.vo.tripplan.atx.ATX;
import com.koreanair.external.eretail.vo.tripplan.car.CAR;
import com.koreanair.external.eretail.vo.tripplan.command.COMMANDType;
import com.koreanair.external.eretail.vo.tripplan.common.common_air_pricing.TicketType;
import com.koreanair.external.eretail.vo.tripplan.contact.CONTACT;
import com.koreanair.external.eretail.vo.tripplan.cruise.CRUISE;
import com.koreanair.external.eretail.vo.tripplan.document.DOCUMENT;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.ETR;
import com.koreanair.external.eretail.vo.tripplan.external_provider.EXTERNALPROVIDER;
import com.koreanair.external.eretail.vo.tripplan.facts.FACTS;
import com.koreanair.external.eretail.vo.tripplan.ferry.FERRY;
import com.koreanair.external.eretail.vo.tripplan.ground.GROUND;
import com.koreanair.external.eretail.vo.tripplan.hotel_offer.HOTELOFFER;
import com.koreanair.external.eretail.vo.tripplan.insurance.INSURANCE;
import com.koreanair.external.eretail.vo.tripplan.list_ticket_group.LISTTICKETGROUP;
import com.koreanair.external.eretail.vo.tripplan.loyalty_card.LOYALTYCARD;
import com.koreanair.external.eretail.vo.tripplan.misc.MISC;
import com.koreanair.external.eretail.vo.tripplan.payment_group.PAYMENTGROUPType;
import com.koreanair.external.eretail.vo.tripplan.pnr.PNRType;
import com.koreanair.external.eretail.vo.tripplan.proposal.PROPOSAL;
import com.koreanair.external.eretail.vo.tripplan.psf.LISTPSFGROUP;
import com.koreanair.external.eretail.vo.tripplan.psf.PSFCONFIGURATION;
import com.koreanair.external.eretail.vo.tripplan.rail.RAIL;
import com.koreanair.external.eretail.vo.tripplan.requirement.REQUIREMENT;
import com.koreanair.external.eretail.vo.tripplan.shopping_basket.SHOPPINGBASKET;
import com.koreanair.external.eretail.vo.tripplan.tour.TOUR;
import com.koreanair.external.eretail.vo.tripplan.tr_elements.TR;
import com.koreanair.external.eretail.vo.tripplan.traveller_information.TRAVELLERINFORMATION;
import com.koreanair.external.eretail.vo.tripplan.traveller_link.TRAVELLERLINK;
import com.koreanair.external.eretail.vo.tripplan.trip.TRIP;
import com.koreanair.external.eretail.vo.tripplan.web_fare.WEBFARE;


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
 *         &lt;group ref="{}RetrievePNRGroup2"/&gt;
 *         &lt;group ref="{}TripPlanGroup" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonOutputGroup"/&gt;
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
    "txstatus",
    "siteswitch",
    "marketinformation",
    "listmsg",
    "listelementstatus",
    "triplist",
    "allowpnrcancel",
    "allowpnrserv",
    "directretrieve",
    "listqueueingofficeinformation",
    "validpnrforcancel",
    "validpnrformodif",
    "taname",
    "siteagencyline1",
    "siteagencyline2",
    "siteagencyline3",
    "siteagencyline4",
    "siteagencyline5",
    "siteagencyline6",
    "siteemailaddress",
    "isconfirmationallowed",
    "allowairelementadd",
    "noairfare",
    "boolguarantee",
    "booldeposit",
    "hasschedulechange",
    "listcancellationnumber",
    "ispnrreconfirmable",
    "reconferrorlist",
    "listapproversreassign",
    "listapiscountries",
    "listpnrextradata",
    "booladdinsuranceavailable",
    "listcancellableinsuranceproductid",
    "listticket",
    "listpricingoptions",
    "eligibility",
    "status",
    "trip",
    "pnr",
    "air",
    "airoffer",
    "ancillaryservices",
    "car",
    "hotel",
    "hoteloffer",
    "webfare",
    "rail",
    "externalprovider",
    "insurance",
    "airporttransfer",
    "command",
    "ground",
    "atx",
    "cruise",
    "tour",
    "misc",
    "ferry",
    "travellerinformation",
    "serviceselection",
    "serviceselectionbeforerebook",
    "payment",
    "recloc",
    "officeidtimezone",
    "shoppingbasket",
    "requirement",
    "proposal",
    "contact",
    "loyaltycard",
    "paymentgroup",
    "document",
    "listpsfgroup",
    "psfconfiguration",
    "listticketgroup",
    "accountabledocument",
    "listtravellerlink",
    "etr",
    "tr",
    "facts",
    "listexternalid",
    "frompage",
    "apismanageroutput",
    "apisrules",
    "apiscollectionmode"
})
@XmlRootElement(name = "RetrievePNROutput2")
public class RetrievePNROutput2
    implements Serializable
{

    @XmlElement(name = "TX_STATUS", required = true)
    protected BigInteger txstatus;
    @XmlElement(name = "SITE_SWITCH")
    protected Boolean siteswitch;
    @XmlElement(name = "MARKET_INFORMATION")
    protected RetrievePNROutput2 .MARKETINFORMATION marketinformation;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "LIST_ELEMENT_STATUS")
    protected List<LISTELEMENTSTATUS> listelementstatus;
    @XmlElement(name = "TRIPLIST")
    protected Boolean triplist;
    @XmlElement(name = "ALLOW_PNR_CANCEL")
    protected Boolean allowpnrcancel;
    @XmlElement(name = "ALLOW_PNR_SERV")
    protected String allowpnrserv;
    @XmlElement(name = "DIRECT_RETRIEVE")
    protected Boolean directretrieve;
    @XmlElement(name = "LIST_QUEUEING_OFFICE_INFORMATION")
    protected List<RetrievePNROutput2 .LISTQUEUEINGOFFICEINFORMATION> listqueueingofficeinformation;
    @XmlElement(name = "VALID_PNR_FOR_CANCEL")
    protected Boolean validpnrforcancel;
    @XmlElement(name = "VALID_PNR_FOR_MODIF")
    protected Boolean validpnrformodif;
    @XmlElement(name = "TA_NAME")
    protected String taname;
    @XmlElement(name = "SITE_AGENCY_LINE1")
    protected String siteagencyline1;
    @XmlElement(name = "SITE_AGENCY_LINE2")
    protected String siteagencyline2;
    @XmlElement(name = "SITE_AGENCY_LINE3")
    protected String siteagencyline3;
    @XmlElement(name = "SITE_AGENCY_LINE4")
    protected String siteagencyline4;
    @XmlElement(name = "SITE_AGENCY_LINE5")
    protected String siteagencyline5;
    @XmlElement(name = "SITE_AGENCY_LINE6")
    protected String siteagencyline6;
    @XmlElement(name = "SITE_EMAIL_ADDRESS")
    protected String siteemailaddress;
    @XmlElement(name = "IS_CONFIRMATION_ALLOWED")
    protected Boolean isconfirmationallowed;
    @XmlElement(name = "ALLOW_AIR_ELEMENT_ADD")
    protected Boolean allowairelementadd;
    @XmlElement(name = "NO_AIRFARE")
    protected String noairfare;
    @XmlElement(name = "BOOL_GUARANTEE")
    protected Boolean boolguarantee;
    @XmlElement(name = "BOOL_DEPOSIT")
    protected Boolean booldeposit;
    @XmlElement(name = "HAS_SCHEDULE_CHANGE")
    protected Boolean hasschedulechange;
    @XmlElement(name = "LIST_CANCELLATION_NUMBER")
    protected List<RetrievePNROutput2 .LISTCANCELLATIONNUMBER> listcancellationnumber;
    @XmlElement(name = "IS_PNR_RECONFIRMABLE")
    protected Boolean ispnrreconfirmable;
    @XmlElement(name = "RECONF_ERRORLIST")
    protected List<RetrievePNROutput2 .RECONFERRORLIST> reconferrorlist;
    @XmlElement(name = "LIST_APPROVERS_REASSIGN")
    protected RetrievePNROutput2 .LISTAPPROVERSREASSIGN listapproversreassign;
    @XmlElement(name = "LIST_APIS_COUNTRIES")
    protected List<LISTAPISCOUNTRIES> listapiscountries;
    @XmlElement(name = "LIST_PNR_EXTRA_DATA")
    protected RetrievePNROutput2 .LISTPNREXTRADATA listpnrextradata;
    @XmlElement(name = "BOOL_ADD_INSURANCE_AVAILABLE")
    protected Boolean booladdinsuranceavailable;
    @XmlElement(name = "LIST_CANCELLABLE_INSURANCE_PRODUCT_ID")
    protected List<BigInteger> listcancellableinsuranceproductid;
    @XmlElement(name = "LIST_TICKET")
    protected List<TicketType> listticket;
    @XmlElement(name = "LIST_PRICING_OPTIONS")
    protected List<LISTPRICINGOPTIONSType> listpricingoptions;
    @XmlElement(name = "ELIGIBILITY")
    protected List<RetrievePNROutput2 .ELIGIBILITY> eligibility;
    @XmlElement(name = "STATUS")
    protected com.koreanair.external.eretail.vo.tripplan.status.STATUS status;
    @XmlElement(name = "TRIP")
    protected TRIP trip;
    @XmlElement(name = "PNR")
    protected List<PNRType> pnr;
    @XmlElement(name = "AIR")
    protected List<AIR> air;
    @XmlElement(name = "AIR_OFFER")
    protected List<AIROFFER> airoffer;
    @XmlElement(name = "ANCILLARY_SERVICES")
    protected List<ANCILLARYSERVICES> ancillaryservices;
    @XmlElement(name = "CAR")
    protected List<CAR> car;
    @XmlElement(name = "HOTEL")
    protected List<com.koreanair.external.eretail.vo.tripplan.hotel.HOTEL> hotel;
    @XmlElement(name = "HOTEL_OFFER")
    protected List<HOTELOFFER> hoteloffer;
    @XmlElement(name = "WEB_FARE")
    protected List<WEBFARE> webfare;
    @XmlElement(name = "RAIL")
    protected List<RAIL> rail;
    @XmlElement(name = "EXTERNAL_PROVIDER")
    protected List<EXTERNALPROVIDER> externalprovider;
    @XmlElement(name = "INSURANCE")
    protected INSURANCE insurance;
    @XmlElement(name = "AIRPORT_TRANSFER")
    protected List<AIRPORTTRANSFER> airporttransfer;
    @XmlElement(name = "COMMAND")
    protected List<COMMANDType> command;
    @XmlElement(name = "GROUND")
    protected List<GROUND> ground;
    @XmlElement(name = "ATX")
    protected List<ATX> atx;
    @XmlElement(name = "CRUISE")
    protected List<CRUISE> cruise;
    @XmlElement(name = "TOUR")
    protected List<TOUR> tour;
    @XmlElement(name = "MISC")
    protected List<MISC> misc;
    @XmlElement(name = "FERRY")
    protected List<FERRY> ferry;
    @XmlElement(name = "TRAVELLER_INFORMATION")
    protected List<TRAVELLERINFORMATION> travellerinformation;
    @XmlElement(name = "SERVICE_SELECTION")
    protected List<SERVICESELECTION> serviceselection;
    @XmlElement(name = "SERVICE_SELECTION_BEFORE_REBOOK")
    protected List<SERVICESELECTIONBEFOREREBOOK> serviceselectionbeforerebook;
    @XmlElement(name = "PAYMENT")
    protected PAYMENT payment;
    @XmlElement(name = "REC_LOC")
    protected String recloc;
    @XmlElement(name = "OFFICE_ID_TIME_ZONE")
    protected BigInteger officeidtimezone;
    @XmlElement(name = "SHOPPING_BASKET")
    protected SHOPPINGBASKET shoppingbasket;
    @XmlElement(name = "REQUIREMENT")
    protected List<REQUIREMENT> requirement;
    @XmlElement(name = "PROPOSAL")
    protected List<PROPOSAL> proposal;
    @XmlElement(name = "CONTACT")
    protected List<CONTACT> contact;
    @XmlElement(name = "LOYALTY_CARD")
    protected List<LOYALTYCARD> loyaltycard;
    @XmlElement(name = "PAYMENT_GROUP")
    protected List<PAYMENTGROUPType> paymentgroup;
    @XmlElement(name = "DOCUMENT")
    protected List<DOCUMENT> document;
    @XmlElement(name = "LIST_PSF_GROUP")
    protected List<LISTPSFGROUP> listpsfgroup;
    @XmlElement(name = "PSF_CONFIGURATION")
    protected PSFCONFIGURATION psfconfiguration;
    @XmlElement(name = "LIST_TICKET_GROUP")
    protected List<LISTTICKETGROUP> listticketgroup;
    @XmlElement(name = "ACCOUNTABLE_DOCUMENT")
    protected ACCOUNTABLEDOCUMENTType accountabledocument;
    @XmlElement(name = "LIST_TRAVELLER_LINK")
    protected List<TRAVELLERLINK> listtravellerlink;
    @XmlElement(name = "ETR")
    protected ETR etr;
    @XmlElement(name = "TR")
    protected TR tr;
    @XmlElement(name = "FACTS")
    protected FACTS facts;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<Object> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "APIS_MANAGER_OUTPUT")
    protected APISMANAGEROUTPUTTYPE apismanageroutput;
    @XmlElement(name = "APIS_RULES")
    protected APISRULESTYPE apisrules;
    @XmlElement(name = "APIS_COLLECTION_MODE")
    protected Object apiscollectionmode;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the txstatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTXSTATUS() {
        return txstatus;
    }

    /**
     * Sets the value of the txstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTXSTATUS(BigInteger value) {
        this.txstatus = value;
    }

    /**
     * Gets the value of the siteswitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSITESWITCH() {
        return siteswitch;
    }

    /**
     * Sets the value of the siteswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSITESWITCH(Boolean value) {
        this.siteswitch = value;
    }

    /**
     * Gets the value of the marketinformation property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievePNROutput2 .MARKETINFORMATION }
     *     
     */
    public RetrievePNROutput2 .MARKETINFORMATION getMARKETINFORMATION() {
        return marketinformation;
    }

    /**
     * Sets the value of the marketinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievePNROutput2 .MARKETINFORMATION }
     *     
     */
    public void setMARKETINFORMATION(RetrievePNROutput2 .MARKETINFORMATION value) {
        this.marketinformation = value;
    }

    /**
     * A list of potential errors.  Gets the value of the listmsg property.
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
     * Gets the value of the listelementstatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelementstatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENTSTATUS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTELEMENTSTATUS }
     * 
     * 
     */
    public List<LISTELEMENTSTATUS> getLISTELEMENTSTATUS() {
        if (listelementstatus == null) {
            listelementstatus = new ArrayList<LISTELEMENTSTATUS>();
        }
        return this.listelementstatus;
    }

    /**
     * Gets the value of the triplist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTRIPLIST() {
        return triplist;
    }

    /**
     * Sets the value of the triplist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTRIPLIST(Boolean value) {
        this.triplist = value;
    }

    /**
     * Gets the value of the allowpnrcancel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALLOWPNRCANCEL() {
        return allowpnrcancel;
    }

    /**
     * Sets the value of the allowpnrcancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALLOWPNRCANCEL(Boolean value) {
        this.allowpnrcancel = value;
    }

    /**
     * Gets the value of the allowpnrserv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWPNRSERV() {
        return allowpnrserv;
    }

    /**
     * Sets the value of the allowpnrserv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWPNRSERV(String value) {
        this.allowpnrserv = value;
    }

    /**
     * Gets the value of the directretrieve property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDIRECTRETRIEVE() {
        return directretrieve;
    }

    /**
     * Sets the value of the directretrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDIRECTRETRIEVE(Boolean value) {
        this.directretrieve = value;
    }

    /**
     * Gets the value of the listqueueingofficeinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listqueueingofficeinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTQUEUEINGOFFICEINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrievePNROutput2 .LISTQUEUEINGOFFICEINFORMATION }
     * 
     * 
     */
    public List<RetrievePNROutput2 .LISTQUEUEINGOFFICEINFORMATION> getLISTQUEUEINGOFFICEINFORMATION() {
        if (listqueueingofficeinformation == null) {
            listqueueingofficeinformation = new ArrayList<RetrievePNROutput2 .LISTQUEUEINGOFFICEINFORMATION>();
        }
        return this.listqueueingofficeinformation;
    }

    /**
     * Gets the value of the validpnrforcancel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVALIDPNRFORCANCEL() {
        return validpnrforcancel;
    }

    /**
     * Sets the value of the validpnrforcancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVALIDPNRFORCANCEL(Boolean value) {
        this.validpnrforcancel = value;
    }

    /**
     * Gets the value of the validpnrformodif property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVALIDPNRFORMODIF() {
        return validpnrformodif;
    }

    /**
     * Sets the value of the validpnrformodif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVALIDPNRFORMODIF(Boolean value) {
        this.validpnrformodif = value;
    }

    /**
     * Gets the value of the taname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTANAME() {
        return taname;
    }

    /**
     * Sets the value of the taname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTANAME(String value) {
        this.taname = value;
    }

    /**
     * Gets the value of the siteagencyline1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITEAGENCYLINE1() {
        return siteagencyline1;
    }

    /**
     * Sets the value of the siteagencyline1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITEAGENCYLINE1(String value) {
        this.siteagencyline1 = value;
    }

    /**
     * Gets the value of the siteagencyline2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITEAGENCYLINE2() {
        return siteagencyline2;
    }

    /**
     * Sets the value of the siteagencyline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITEAGENCYLINE2(String value) {
        this.siteagencyline2 = value;
    }

    /**
     * Gets the value of the siteagencyline3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITEAGENCYLINE3() {
        return siteagencyline3;
    }

    /**
     * Sets the value of the siteagencyline3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITEAGENCYLINE3(String value) {
        this.siteagencyline3 = value;
    }

    /**
     * Gets the value of the siteagencyline4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITEAGENCYLINE4() {
        return siteagencyline4;
    }

    /**
     * Sets the value of the siteagencyline4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITEAGENCYLINE4(String value) {
        this.siteagencyline4 = value;
    }

    /**
     * Gets the value of the siteagencyline5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITEAGENCYLINE5() {
        return siteagencyline5;
    }

    /**
     * Sets the value of the siteagencyline5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITEAGENCYLINE5(String value) {
        this.siteagencyline5 = value;
    }

    /**
     * Gets the value of the siteagencyline6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITEAGENCYLINE6() {
        return siteagencyline6;
    }

    /**
     * Sets the value of the siteagencyline6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITEAGENCYLINE6(String value) {
        this.siteagencyline6 = value;
    }

    /**
     * Gets the value of the siteemailaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITEEMAILADDRESS() {
        return siteemailaddress;
    }

    /**
     * Sets the value of the siteemailaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITEEMAILADDRESS(String value) {
        this.siteemailaddress = value;
    }

    /**
     * Gets the value of the isconfirmationallowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISCONFIRMATIONALLOWED() {
        return isconfirmationallowed;
    }

    /**
     * Sets the value of the isconfirmationallowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISCONFIRMATIONALLOWED(Boolean value) {
        this.isconfirmationallowed = value;
    }

    /**
     * Gets the value of the allowairelementadd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALLOWAIRELEMENTADD() {
        return allowairelementadd;
    }

    /**
     * Sets the value of the allowairelementadd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALLOWAIRELEMENTADD(Boolean value) {
        this.allowairelementadd = value;
    }

    /**
     * Gets the value of the noairfare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOAIRFARE() {
        return noairfare;
    }

    /**
     * Sets the value of the noairfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOAIRFARE(String value) {
        this.noairfare = value;
    }

    /**
     * Gets the value of the boolguarantee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLGUARANTEE() {
        return boolguarantee;
    }

    /**
     * Sets the value of the boolguarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLGUARANTEE(Boolean value) {
        this.boolguarantee = value;
    }

    /**
     * Gets the value of the booldeposit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLDEPOSIT() {
        return booldeposit;
    }

    /**
     * Sets the value of the booldeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLDEPOSIT(Boolean value) {
        this.booldeposit = value;
    }

    /**
     * Gets the value of the hasschedulechange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHASSCHEDULECHANGE() {
        return hasschedulechange;
    }

    /**
     * Sets the value of the hasschedulechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHASSCHEDULECHANGE(Boolean value) {
        this.hasschedulechange = value;
    }

    /**
     * Gets the value of the listcancellationnumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcancellationnumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCANCELLATIONNUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER }
     * 
     * 
     */
    public List<RetrievePNROutput2 .LISTCANCELLATIONNUMBER> getLISTCANCELLATIONNUMBER() {
        if (listcancellationnumber == null) {
            listcancellationnumber = new ArrayList<RetrievePNROutput2 .LISTCANCELLATIONNUMBER>();
        }
        return this.listcancellationnumber;
    }

    /**
     * Gets the value of the ispnrreconfirmable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPNRRECONFIRMABLE() {
        return ispnrreconfirmable;
    }

    /**
     * Sets the value of the ispnrreconfirmable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPNRRECONFIRMABLE(Boolean value) {
        this.ispnrreconfirmable = value;
    }

    /**
     * Gets the value of the reconferrorlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reconferrorlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECONFERRORLIST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrievePNROutput2 .RECONFERRORLIST }
     * 
     * 
     */
    public List<RetrievePNROutput2 .RECONFERRORLIST> getRECONFERRORLIST() {
        if (reconferrorlist == null) {
            reconferrorlist = new ArrayList<RetrievePNROutput2 .RECONFERRORLIST>();
        }
        return this.reconferrorlist;
    }

    /**
     * Gets the value of the listapproversreassign property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievePNROutput2 .LISTAPPROVERSREASSIGN }
     *     
     */
    public RetrievePNROutput2 .LISTAPPROVERSREASSIGN getLISTAPPROVERSREASSIGN() {
        return listapproversreassign;
    }

    /**
     * Sets the value of the listapproversreassign property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievePNROutput2 .LISTAPPROVERSREASSIGN }
     *     
     */
    public void setLISTAPPROVERSREASSIGN(RetrievePNROutput2 .LISTAPPROVERSREASSIGN value) {
        this.listapproversreassign = value;
    }

    /**
     * Gets the value of the listapiscountries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listapiscountries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAPISCOUNTRIES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTAPISCOUNTRIES }
     * 
     * 
     */
    public List<LISTAPISCOUNTRIES> getLISTAPISCOUNTRIES() {
        if (listapiscountries == null) {
            listapiscountries = new ArrayList<LISTAPISCOUNTRIES>();
        }
        return this.listapiscountries;
    }

    /**
     * Gets the value of the listpnrextradata property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievePNROutput2 .LISTPNREXTRADATA }
     *     
     */
    public RetrievePNROutput2 .LISTPNREXTRADATA getLISTPNREXTRADATA() {
        return listpnrextradata;
    }

    /**
     * Sets the value of the listpnrextradata property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievePNROutput2 .LISTPNREXTRADATA }
     *     
     */
    public void setLISTPNREXTRADATA(RetrievePNROutput2 .LISTPNREXTRADATA value) {
        this.listpnrextradata = value;
    }

    /**
     * Gets the value of the booladdinsuranceavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLADDINSURANCEAVAILABLE() {
        return booladdinsuranceavailable;
    }

    /**
     * Sets the value of the booladdinsuranceavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLADDINSURANCEAVAILABLE(Boolean value) {
        this.booladdinsuranceavailable = value;
    }

    /**
     * Gets the value of the listcancellableinsuranceproductid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcancellableinsuranceproductid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCANCELLABLEINSURANCEPRODUCTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTCANCELLABLEINSURANCEPRODUCTID() {
        if (listcancellableinsuranceproductid == null) {
            listcancellableinsuranceproductid = new ArrayList<BigInteger>();
        }
        return this.listcancellableinsuranceproductid;
    }

    /**
     * Gets the value of the listticket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listticket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTICKET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketType }
     * 
     * 
     */
    public List<TicketType> getLISTTICKET() {
        if (listticket == null) {
            listticket = new ArrayList<TicketType>();
        }
        return this.listticket;
    }

    /**
     * Gets the value of the listpricingoptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpricingoptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICINGOPTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICINGOPTIONSType }
     * 
     * 
     */
    public List<LISTPRICINGOPTIONSType> getLISTPRICINGOPTIONS() {
        if (listpricingoptions == null) {
            listpricingoptions = new ArrayList<LISTPRICINGOPTIONSType>();
        }
        return this.listpricingoptions;
    }

    /**
     * Gets the value of the eligibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eligibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getELIGIBILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrievePNROutput2 .ELIGIBILITY }
     * 
     * 
     */
    public List<RetrievePNROutput2 .ELIGIBILITY> getELIGIBILITY() {
        if (eligibility == null) {
            eligibility = new ArrayList<RetrievePNROutput2 .ELIGIBILITY>();
        }
        return this.eligibility;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link com.koreanair.external.eretail.vo.tripplan.status.STATUS }
     *     
     */
    public com.koreanair.external.eretail.vo.tripplan.status.STATUS getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.koreanair.external.eretail.vo.tripplan.status.STATUS }
     *     
     */
    public void setSTATUS(com.koreanair.external.eretail.vo.tripplan.status.STATUS value) {
        this.status = value;
    }

    /**
     * Gets the value of the trip property.
     * 
     * @return
     *     possible object is
     *     {@link TRIP }
     *     
     */
    public TRIP getTRIP() {
        return trip;
    }

    /**
     * Sets the value of the trip property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRIP }
     *     
     */
    public void setTRIP(TRIP value) {
        this.trip = value;
    }

    /**
     * Gets the value of the pnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPNR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRType }
     * 
     * 
     */
    public List<PNRType> getPNR() {
        if (pnr == null) {
            pnr = new ArrayList<PNRType>();
        }
        return this.pnr;
    }

    /**
     * Gets the value of the air property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the air property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAIR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIR }
     * 
     * 
     */
    public List<AIR> getAIR() {
        if (air == null) {
            air = new ArrayList<AIR>();
        }
        return this.air;
    }

    /**
     * Gets the value of the airoffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airoffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAIROFFER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIROFFER }
     * 
     * 
     */
    public List<AIROFFER> getAIROFFER() {
        if (airoffer == null) {
            airoffer = new ArrayList<AIROFFER>();
        }
        return this.airoffer;
    }

    /**
     * Gets the value of the ancillaryservices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryservices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getANCILLARYSERVICES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ANCILLARYSERVICES }
     * 
     * 
     */
    public List<ANCILLARYSERVICES> getANCILLARYSERVICES() {
        if (ancillaryservices == null) {
            ancillaryservices = new ArrayList<ANCILLARYSERVICES>();
        }
        return this.ancillaryservices;
    }

    /**
     * Gets the value of the car property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the car property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCAR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAR }
     * 
     * 
     */
    public List<CAR> getCAR() {
        if (car == null) {
            car = new ArrayList<CAR>();
        }
        return this.car;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHOTEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.koreanair.external.eretail.vo.tripplan.hotel.HOTEL }
     * 
     * 
     */
    public List<com.koreanair.external.eretail.vo.tripplan.hotel.HOTEL> getHOTEL() {
        if (hotel == null) {
            hotel = new ArrayList<com.koreanair.external.eretail.vo.tripplan.hotel.HOTEL>();
        }
        return this.hotel;
    }

    /**
     * Gets the value of the hoteloffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hoteloffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHOTELOFFER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HOTELOFFER }
     * 
     * 
     */
    public List<HOTELOFFER> getHOTELOFFER() {
        if (hoteloffer == null) {
            hoteloffer = new ArrayList<HOTELOFFER>();
        }
        return this.hoteloffer;
    }

    /**
     * Gets the value of the webfare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webfare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWEBFARE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WEBFARE }
     * 
     * 
     */
    public List<WEBFARE> getWEBFARE() {
        if (webfare == null) {
            webfare = new ArrayList<WEBFARE>();
        }
        return this.webfare;
    }

    /**
     * Gets the value of the rail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRAIL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAIL }
     * 
     * 
     */
    public List<RAIL> getRAIL() {
        if (rail == null) {
            rail = new ArrayList<RAIL>();
        }
        return this.rail;
    }

    /**
     * Gets the value of the externalprovider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalprovider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXTERNALPROVIDER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXTERNALPROVIDER }
     * 
     * 
     */
    public List<EXTERNALPROVIDER> getEXTERNALPROVIDER() {
        if (externalprovider == null) {
            externalprovider = new ArrayList<EXTERNALPROVIDER>();
        }
        return this.externalprovider;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link INSURANCE }
     *     
     */
    public INSURANCE getINSURANCE() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link INSURANCE }
     *     
     */
    public void setINSURANCE(INSURANCE value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the airporttransfer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airporttransfer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAIRPORTTRANSFER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIRPORTTRANSFER }
     * 
     * 
     */
    public List<AIRPORTTRANSFER> getAIRPORTTRANSFER() {
        if (airporttransfer == null) {
            airporttransfer = new ArrayList<AIRPORTTRANSFER>();
        }
        return this.airporttransfer;
    }

    /**
     * Gets the value of the command property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the command property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOMMAND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COMMANDType }
     * 
     * 
     */
    public List<COMMANDType> getCOMMAND() {
        if (command == null) {
            command = new ArrayList<COMMANDType>();
        }
        return this.command;
    }

    /**
     * Gets the value of the ground property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ground property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGROUND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GROUND }
     * 
     * 
     */
    public List<GROUND> getGROUND() {
        if (ground == null) {
            ground = new ArrayList<GROUND>();
        }
        return this.ground;
    }

    /**
     * Gets the value of the atx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATX }
     * 
     * 
     */
    public List<ATX> getATX() {
        if (atx == null) {
            atx = new ArrayList<ATX>();
        }
        return this.atx;
    }

    /**
     * Gets the value of the cruise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cruise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRUISE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRUISE }
     * 
     * 
     */
    public List<CRUISE> getCRUISE() {
        if (cruise == null) {
            cruise = new ArrayList<CRUISE>();
        }
        return this.cruise;
    }

    /**
     * Gets the value of the tour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOUR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOUR }
     * 
     * 
     */
    public List<TOUR> getTOUR() {
        if (tour == null) {
            tour = new ArrayList<TOUR>();
        }
        return this.tour;
    }

    /**
     * Gets the value of the misc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the misc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMISC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MISC }
     * 
     * 
     */
    public List<MISC> getMISC() {
        if (misc == null) {
            misc = new ArrayList<MISC>();
        }
        return this.misc;
    }

    /**
     * Gets the value of the ferry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ferry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFERRY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FERRY }
     * 
     * 
     */
    public List<FERRY> getFERRY() {
        if (ferry == null) {
            ferry = new ArrayList<FERRY>();
        }
        return this.ferry;
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
     * Gets the value of the serviceselection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceselection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSERVICESELECTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICESELECTION }
     * 
     * 
     */
    public List<SERVICESELECTION> getSERVICESELECTION() {
        if (serviceselection == null) {
            serviceselection = new ArrayList<SERVICESELECTION>();
        }
        return this.serviceselection;
    }

    /**
     * Gets the value of the serviceselectionbeforerebook property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceselectionbeforerebook property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSERVICESELECTIONBEFOREREBOOK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SERVICESELECTIONBEFOREREBOOK }
     * 
     * 
     */
    public List<SERVICESELECTIONBEFOREREBOOK> getSERVICESELECTIONBEFOREREBOOK() {
        if (serviceselectionbeforerebook == null) {
            serviceselectionbeforerebook = new ArrayList<SERVICESELECTIONBEFOREREBOOK>();
        }
        return this.serviceselectionbeforerebook;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENT }
     *     
     */
    public PAYMENT getPAYMENT() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENT }
     *     
     */
    public void setPAYMENT(PAYMENT value) {
        this.payment = value;
    }

    /**
     * Gets the value of the recloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECLOC() {
        return recloc;
    }

    /**
     * Sets the value of the recloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECLOC(String value) {
        this.recloc = value;
    }

    /**
     * Gets the value of the officeidtimezone property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOFFICEIDTIMEZONE() {
        return officeidtimezone;
    }

    /**
     * Sets the value of the officeidtimezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOFFICEIDTIMEZONE(BigInteger value) {
        this.officeidtimezone = value;
    }

    /**
     * Gets the value of the shoppingbasket property.
     * 
     * @return
     *     possible object is
     *     {@link SHOPPINGBASKET }
     *     
     */
    public SHOPPINGBASKET getSHOPPINGBASKET() {
        return shoppingbasket;
    }

    /**
     * Sets the value of the shoppingbasket property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHOPPINGBASKET }
     *     
     */
    public void setSHOPPINGBASKET(SHOPPINGBASKET value) {
        this.shoppingbasket = value;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREQUIREMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REQUIREMENT }
     * 
     * 
     */
    public List<REQUIREMENT> getREQUIREMENT() {
        if (requirement == null) {
            requirement = new ArrayList<REQUIREMENT>();
        }
        return this.requirement;
    }

    /**
     * Gets the value of the proposal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proposal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROPOSAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PROPOSAL }
     * 
     * 
     */
    public List<PROPOSAL> getPROPOSAL() {
        if (proposal == null) {
            proposal = new ArrayList<PROPOSAL>();
        }
        return this.proposal;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTACT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONTACT }
     * 
     * 
     */
    public List<CONTACT> getCONTACT() {
        if (contact == null) {
            contact = new ArrayList<CONTACT>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the loyaltycard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltycard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLOYALTYCARD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOYALTYCARD }
     * 
     * 
     */
    public List<LOYALTYCARD> getLOYALTYCARD() {
        if (loyaltycard == null) {
            loyaltycard = new ArrayList<LOYALTYCARD>();
        }
        return this.loyaltycard;
    }

    /**
     * Gets the value of the paymentgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPAYMENTGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENTGROUPType }
     * 
     * 
     */
    public List<PAYMENTGROUPType> getPAYMENTGROUP() {
        if (paymentgroup == null) {
            paymentgroup = new ArrayList<PAYMENTGROUPType>();
        }
        return this.paymentgroup;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOCUMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOCUMENT }
     * 
     * 
     */
    public List<DOCUMENT> getDOCUMENT() {
        if (document == null) {
            document = new ArrayList<DOCUMENT>();
        }
        return this.document;
    }

    /**
     * Gets the value of the listpsfgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpsfgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPSFGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPSFGROUP }
     * 
     * 
     */
    public List<LISTPSFGROUP> getLISTPSFGROUP() {
        if (listpsfgroup == null) {
            listpsfgroup = new ArrayList<LISTPSFGROUP>();
        }
        return this.listpsfgroup;
    }

    /**
     * Gets the value of the psfconfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link PSFCONFIGURATION }
     *     
     */
    public PSFCONFIGURATION getPSFCONFIGURATION() {
        return psfconfiguration;
    }

    /**
     * Sets the value of the psfconfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSFCONFIGURATION }
     *     
     */
    public void setPSFCONFIGURATION(PSFCONFIGURATION value) {
        this.psfconfiguration = value;
    }

    /**
     * Gets the value of the listticketgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listticketgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTICKETGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTICKETGROUP }
     * 
     * 
     */
    public List<LISTTICKETGROUP> getLISTTICKETGROUP() {
        if (listticketgroup == null) {
            listticketgroup = new ArrayList<LISTTICKETGROUP>();
        }
        return this.listticketgroup;
    }

    /**
     * Gets the value of the accountabledocument property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTABLEDOCUMENTType }
     *     
     */
    public ACCOUNTABLEDOCUMENTType getACCOUNTABLEDOCUMENT() {
        return accountabledocument;
    }

    /**
     * Sets the value of the accountabledocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTABLEDOCUMENTType }
     *     
     */
    public void setACCOUNTABLEDOCUMENT(ACCOUNTABLEDOCUMENTType value) {
        this.accountabledocument = value;
    }

    /**
     * Gets the value of the listtravellerlink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerlink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERLINK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELLERLINK }
     * 
     * 
     */
    public List<TRAVELLERLINK> getLISTTRAVELLERLINK() {
        if (listtravellerlink == null) {
            listtravellerlink = new ArrayList<TRAVELLERLINK>();
        }
        return this.listtravellerlink;
    }

    /**
     * Gets the value of the etr property.
     * 
     * @return
     *     possible object is
     *     {@link ETR }
     *     
     */
    public ETR getETR() {
        return etr;
    }

    /**
     * Sets the value of the etr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETR }
     *     
     */
    public void setETR(ETR value) {
        this.etr = value;
    }

    /**
     * Gets the value of the tr property.
     * 
     * @return
     *     possible object is
     *     {@link TR }
     *     
     */
    public TR getTR() {
        return tr;
    }

    /**
     * Sets the value of the tr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TR }
     *     
     */
    public void setTR(TR value) {
        this.tr = value;
    }

    /**
     * Gets the value of the facts property.
     * 
     * @return
     *     possible object is
     *     {@link FACTS }
     *     
     */
    public FACTS getFACTS() {
        return facts;
    }

    /**
     * Sets the value of the facts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FACTS }
     *     
     */
    public void setFACTS(FACTS value) {
        this.facts = value;
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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLISTEXTERNALID() {
        if (listexternalid == null) {
            listexternalid = new ArrayList<Object>();
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
     * Gets the value of the apismanageroutput property.
     * 
     * @return
     *     possible object is
     *     {@link APISMANAGEROUTPUTTYPE }
     *     
     */
    public APISMANAGEROUTPUTTYPE getAPISMANAGEROUTPUT() {
        return apismanageroutput;
    }

    /**
     * Sets the value of the apismanageroutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISMANAGEROUTPUTTYPE }
     *     
     */
    public void setAPISMANAGEROUTPUT(APISMANAGEROUTPUTTYPE value) {
        this.apismanageroutput = value;
    }

    /**
     * Gets the value of the apisrules property.
     * 
     * @return
     *     possible object is
     *     {@link APISRULESTYPE }
     *     
     */
    public APISRULESTYPE getAPISRULES() {
        return apisrules;
    }

    /**
     * Sets the value of the apisrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISRULESTYPE }
     *     
     */
    public void setAPISRULES(APISRULESTYPE value) {
        this.apisrules = value;
    }

    /**
     * Gets the value of the apiscollectionmode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCOLLECTIONMODE() {
        return apiscollectionmode;
    }

    /**
     * Sets the value of the apiscollectionmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCOLLECTIONMODE(Object value) {
        this.apiscollectionmode = value;
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
     *         &lt;element name="ELIGIBILITY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ELIGIBILITY_CONDITION" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CONDITION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "eligibilitytype",
        "iseligible",
        "eligibilityreason",
        "eligibilitycondition"
    })
    public static class ELIGIBILITY
        implements Serializable
    {

        @XmlElement(name = "ELIGIBILITY_TYPE", required = true)
        protected String eligibilitytype;
        @XmlElement(name = "IS_ELIGIBLE")
        protected boolean iseligible;
        @XmlElement(name = "ELIGIBILITY_REASON")
        protected String eligibilityreason;
        @XmlElement(name = "ELIGIBILITY_CONDITION")
        protected List<RetrievePNROutput2 .ELIGIBILITY.ELIGIBILITYCONDITION> eligibilitycondition;

        /**
         * Gets the value of the eligibilitytype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getELIGIBILITYTYPE() {
            return eligibilitytype;
        }

        /**
         * Sets the value of the eligibilitytype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setELIGIBILITYTYPE(String value) {
            this.eligibilitytype = value;
        }

        /**
         * Gets the value of the iseligible property.
         * 
         */
        public boolean isISELIGIBLE() {
            return iseligible;
        }

        /**
         * Sets the value of the iseligible property.
         * 
         */
        public void setISELIGIBLE(boolean value) {
            this.iseligible = value;
        }

        /**
         * Gets the value of the eligibilityreason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getELIGIBILITYREASON() {
            return eligibilityreason;
        }

        /**
         * Sets the value of the eligibilityreason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setELIGIBILITYREASON(String value) {
            this.eligibilityreason = value;
        }

        /**
         * Gets the value of the eligibilitycondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eligibilitycondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getELIGIBILITYCONDITION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RetrievePNROutput2 .ELIGIBILITY.ELIGIBILITYCONDITION }
         * 
         * 
         */
        public List<RetrievePNROutput2 .ELIGIBILITY.ELIGIBILITYCONDITION> getELIGIBILITYCONDITION() {
            if (eligibilitycondition == null) {
                eligibilitycondition = new ArrayList<RetrievePNROutput2 .ELIGIBILITY.ELIGIBILITYCONDITION>();
            }
            return this.eligibilitycondition;
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
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CONDITION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "condition"
        })
        public static class ELIGIBILITYCONDITION
            implements Serializable
        {

            @XmlElement(name = "NAME", required = true)
            protected String name;
            @XmlElement(name = "CONDITION", required = true)
            protected String condition;

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
             * Gets the value of the condition property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONDITION() {
                return condition;
            }

            /**
             * Sets the value of the condition property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONDITION(String value) {
                this.condition = value;
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
     *         &lt;element name="COMMUNITY_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "communityid",
        "userid",
        "firstname",
        "lastname"
    })
    public static class LISTAPPROVERSREASSIGN
        implements Serializable
    {

        @XmlElement(name = "COMMUNITY_ID", required = true)
        protected Object communityid;
        @XmlElement(name = "USER_ID", required = true)
        protected Object userid;
        @XmlElement(name = "FIRST_NAME", required = true)
        protected Object firstname;
        @XmlElement(name = "LAST_NAME", required = true)
        protected Object lastname;

        /**
         * Gets the value of the communityid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCOMMUNITYID() {
            return communityid;
        }

        /**
         * Sets the value of the communityid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCOMMUNITYID(Object value) {
            this.communityid = value;
        }

        /**
         * Gets the value of the userid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getUSERID() {
            return userid;
        }

        /**
         * Sets the value of the userid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setUSERID(Object value) {
            this.userid = value;
        }

        /**
         * Gets the value of the firstname property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getFIRSTNAME() {
            return firstname;
        }

        /**
         * Sets the value of the firstname property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setFIRSTNAME(Object value) {
            this.firstname = value;
        }

        /**
         * Gets the value of the lastname property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLASTNAME() {
            return lastname;
        }

        /**
         * Sets the value of the lastname property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLASTNAME(Object value) {
            this.lastname = value;
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
     *         &lt;element name="CANCELLATION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CONFIRMATION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="HOTEL_CHAIN"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="B_LOCATION"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="B_DATE"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PROPERTY_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CANCELLATION_POLICY"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="APPLY"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ADDRESS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SUITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STREET_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STREET_NO_SUFFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DIRECTION" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PO_BOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FIRST_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SECOND_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FAX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TELEX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ZIP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="HOTEL" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="INITIAL_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="DELETED_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="B_LOCATION"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CITY_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="LOCATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="STATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="B_DATE"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="E_DATE"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="COMPANY"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ACCESS_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="HOTEL"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="ADDRESS" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="SUITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="STREET_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="STREET_NO_SUFFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="DIRECTION" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;all&gt;
     *                                                 &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                               &lt;/all&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="PO_BOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="STATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="RR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="FIRST_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="SECOND_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="ZIP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="TELEX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="FAX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OCCUPANCY" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AREA" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TRANSPORTATION" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ROOM_TYPE"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="BED_TYPE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="MEAL" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="BED_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="CHECK_IN_POLICY" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SPECIAL_RATE_TYPE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="RATE_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="CORPORATE_ID_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="GUARANTEE_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="DEPOSIT_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="CHECK_OTHER_FEATURES" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="RATES" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="LIST_RATE" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="B_DATE" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                               &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="E_DATE" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                               &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                                                 &lt;element name="CURRENCY" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                           &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
     *                                                 &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="LIST_TOTAL_RATE" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                                       &lt;element name="CURRENCY" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CONFIRMATION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="STATUS" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CANCELLATION_POLICY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CORPORATE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMBER_OF_ROOMS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="BOOKING_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_PROVIDER_ROOM_RATE_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="CHECK_SELL_RULES" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_SPECIAL_RATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="NUM_OF_NIGHTS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="BOOKING_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;anyAttribute processContents='lax'/&gt;
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
        "cancellationnumber",
        "confirmationnumber",
        "hotelchain",
        "blocation",
        "bdate",
        "propertycode",
        "cancellationpolicy",
        "address",
        "hotel"
    })
    public static class LISTCANCELLATIONNUMBER
        implements Serializable
    {

        @XmlElement(name = "CANCELLATION_NUMBER", required = true)
        protected String cancellationnumber;
        @XmlElement(name = "CONFIRMATION_NUMBER", required = true)
        protected String confirmationnumber;
        @XmlElement(name = "HOTEL_CHAIN", required = true)
        protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTELCHAIN hotelchain;
        @XmlElement(name = "B_LOCATION", required = true)
        protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.BLOCATION blocation;
        @XmlElement(name = "B_DATE", required = true)
        protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.BDATE bdate;
        @XmlElement(name = "PROPERTY_CODE", required = true)
        protected String propertycode;
        @XmlElement(name = "CANCELLATION_POLICY", required = true)
        protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY cancellationpolicy;
        @XmlElement(name = "ADDRESS")
        protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.ADDRESS address;
        @XmlElement(name = "HOTEL")
        protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL hotel;

        /**
         * Gets the value of the cancellationnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCANCELLATIONNUMBER() {
            return cancellationnumber;
        }

        /**
         * Sets the value of the cancellationnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCANCELLATIONNUMBER(String value) {
            this.cancellationnumber = value;
        }

        /**
         * Gets the value of the confirmationnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONFIRMATIONNUMBER() {
            return confirmationnumber;
        }

        /**
         * Sets the value of the confirmationnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONFIRMATIONNUMBER(String value) {
            this.confirmationnumber = value;
        }

        /**
         * Gets the value of the hotelchain property.
         * 
         * @return
         *     possible object is
         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTELCHAIN }
         *     
         */
        public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTELCHAIN getHOTELCHAIN() {
            return hotelchain;
        }

        /**
         * Sets the value of the hotelchain property.
         * 
         * @param value
         *     allowed object is
         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTELCHAIN }
         *     
         */
        public void setHOTELCHAIN(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTELCHAIN value) {
            this.hotelchain = value;
        }

        /**
         * Gets the value of the blocation property.
         * 
         * @return
         *     possible object is
         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.BLOCATION }
         *     
         */
        public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.BLOCATION getBLOCATION() {
            return blocation;
        }

        /**
         * Sets the value of the blocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.BLOCATION }
         *     
         */
        public void setBLOCATION(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.BLOCATION value) {
            this.blocation = value;
        }

        /**
         * Gets the value of the bdate property.
         * 
         * @return
         *     possible object is
         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.BDATE }
         *     
         */
        public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.BDATE getBDATE() {
            return bdate;
        }

        /**
         * Sets the value of the bdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.BDATE }
         *     
         */
        public void setBDATE(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.BDATE value) {
            this.bdate = value;
        }

        /**
         * Gets the value of the propertycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROPERTYCODE() {
            return propertycode;
        }

        /**
         * Sets the value of the propertycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROPERTYCODE(String value) {
            this.propertycode = value;
        }

        /**
         * Gets the value of the cancellationpolicy property.
         * 
         * @return
         *     possible object is
         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY }
         *     
         */
        public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY getCANCELLATIONPOLICY() {
            return cancellationpolicy;
        }

        /**
         * Sets the value of the cancellationpolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY }
         *     
         */
        public void setCANCELLATIONPOLICY(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY value) {
            this.cancellationpolicy = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.ADDRESS }
         *     
         */
        public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.ADDRESS getADDRESS() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.ADDRESS }
         *     
         */
        public void setADDRESS(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.ADDRESS value) {
            this.address = value;
        }

        /**
         * Gets the value of the hotel property.
         * 
         * @return
         *     possible object is
         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL }
         *     
         */
        public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL getHOTEL() {
            return hotel;
        }

        /**
         * Sets the value of the hotel property.
         * 
         * @param value
         *     allowed object is
         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL }
         *     
         */
        public void setHOTEL(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL value) {
            this.hotel = value;
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
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SUITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STREET_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STREET_NO_SUFFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DIRECTION" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PO_BOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FIRST_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SECOND_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FAX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TELEX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ZIP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "suite",
            "streetno",
            "streetnosuffix",
            "direction",
            "pobox",
            "station",
            "rrnumber",
            "firstaddressline",
            "secondaddressline",
            "phonenumber",
            "faxnumber",
            "telexnumber",
            "city",
            "zipcode",
            "state",
            "country"
        })
        public static class ADDRESS
            implements Serializable
        {

            @XmlElement(name = "NAME")
            protected String name;
            @XmlElement(name = "SUITE")
            protected String suite;
            @XmlElement(name = "STREET_NO")
            protected String streetno;
            @XmlElement(name = "STREET_NO_SUFFIX")
            protected String streetnosuffix;
            @XmlElement(name = "DIRECTION")
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.ADDRESS.DIRECTION direction;
            @XmlElement(name = "PO_BOX")
            protected String pobox;
            @XmlElement(name = "STATION")
            protected String station;
            @XmlElement(name = "RR_NUMBER")
            protected String rrnumber;
            @XmlElement(name = "FIRST_ADDRESS_LINE")
            protected String firstaddressline;
            @XmlElement(name = "SECOND_ADDRESS_LINE")
            protected String secondaddressline;
            @XmlElement(name = "PHONE_NUMBER")
            protected String phonenumber;
            @XmlElement(name = "FAX_NUMBER")
            protected String faxnumber;
            @XmlElement(name = "TELEX_NUMBER")
            protected String telexnumber;
            @XmlElement(name = "CITY")
            protected String city;
            @XmlElement(name = "ZIP_CODE")
            protected String zipcode;
            @XmlElement(name = "STATE")
            protected String state;
            @XmlElement(name = "COUNTRY")
            protected String country;

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
             * Gets the value of the suite property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSUITE() {
                return suite;
            }

            /**
             * Sets the value of the suite property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSUITE(String value) {
                this.suite = value;
            }

            /**
             * Gets the value of the streetno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTREETNO() {
                return streetno;
            }

            /**
             * Sets the value of the streetno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTREETNO(String value) {
                this.streetno = value;
            }

            /**
             * Gets the value of the streetnosuffix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTREETNOSUFFIX() {
                return streetnosuffix;
            }

            /**
             * Sets the value of the streetnosuffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTREETNOSUFFIX(String value) {
                this.streetnosuffix = value;
            }

            /**
             * Gets the value of the direction property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.ADDRESS.DIRECTION }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.ADDRESS.DIRECTION getDIRECTION() {
                return direction;
            }

            /**
             * Sets the value of the direction property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.ADDRESS.DIRECTION }
             *     
             */
            public void setDIRECTION(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.ADDRESS.DIRECTION value) {
                this.direction = value;
            }

            /**
             * Gets the value of the pobox property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOBOX() {
                return pobox;
            }

            /**
             * Sets the value of the pobox property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOBOX(String value) {
                this.pobox = value;
            }

            /**
             * Gets the value of the station property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATION() {
                return station;
            }

            /**
             * Sets the value of the station property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATION(String value) {
                this.station = value;
            }

            /**
             * Gets the value of the rrnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRRNUMBER() {
                return rrnumber;
            }

            /**
             * Sets the value of the rrnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRRNUMBER(String value) {
                this.rrnumber = value;
            }

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
             * Gets the value of the faxnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAXNUMBER() {
                return faxnumber;
            }

            /**
             * Sets the value of the faxnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAXNUMBER(String value) {
                this.faxnumber = value;
            }

            /**
             * Gets the value of the telexnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTELEXNUMBER() {
                return telexnumber;
            }

            /**
             * Sets the value of the telexnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTELEXNUMBER(String value) {
                this.telexnumber = value;
            }

            /**
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCITY() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCITY(String value) {
                this.city = value;
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
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATE() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATE(String value) {
                this.state = value;
            }

            /**
             * Gets the value of the country property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOUNTRY() {
                return country;
            }

            /**
             * Sets the value of the country property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOUNTRY(String value) {
                this.country = value;
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
             *       &lt;all&gt;
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/all&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class DIRECTION
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
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
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
        public static class BDATE
            implements Serializable
        {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "code", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar code;

            /**
             * Gets the value of the value property.
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        public static class BLOCATION
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "NAME", required = true)
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
         *         &lt;element name="APPLY"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "apply",
            "description"
        })
        public static class CANCELLATIONPOLICY
            implements Serializable
        {

            @XmlElement(name = "APPLY", required = true)
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY.APPLY apply;
            @XmlElement(name = "DESCRIPTION")
            protected String description;

            /**
             * Gets the value of the apply property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY.APPLY }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY.APPLY getAPPLY() {
                return apply;
            }

            /**
             * Sets the value of the apply property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY.APPLY }
             *     
             */
            public void setAPPLY(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY.APPLY value) {
                this.apply = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
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
            public static class APPLY
                implements Serializable
            {

                @XmlValue
                protected boolean value;

                /**
                 * Gets the value of the value property.
                 * 
                 */
                public boolean isValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 */
                public void setValue(boolean value) {
                    this.value = value;
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
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="INITIAL_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="DELETED_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="B_LOCATION"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CITY_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="LOCATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="STATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="B_DATE"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="E_DATE"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="COMPANY"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ACCESS_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="HOTEL"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="ADDRESS" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="SUITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="STREET_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="STREET_NO_SUFFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="DIRECTION" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;all&gt;
         *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                     &lt;/all&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="PO_BOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="STATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="RR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="FIRST_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="SECOND_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="ZIP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="TELEX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="FAX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OCCUPANCY" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AREA" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TRANSPORTATION" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ROOM_TYPE"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="MEAL" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="BED_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="CHECK_IN_POLICY" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SPECIAL_RATE_TYPE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="RATE_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="CORPORATE_ID_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="GUARANTEE_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="DEPOSIT_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="CHECK_OTHER_FEATURES" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="RATES" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="LIST_RATE" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="B_DATE" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="E_DATE" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *                                       &lt;element name="CURRENCY" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                               &lt;/sequence&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
         *                                       &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="LIST_TOTAL_RATE" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *                             &lt;element name="CURRENCY" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
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
         *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CONFIRMATION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="STATUS" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CANCELLATION_POLICY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CORPORATE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMBER_OF_ROOMS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="BOOKING_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LIST_PROVIDER_ROOM_RATE_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="CHECK_SELL_RULES" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="LIST_SPECIAL_RATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="NUM_OF_NIGHTS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="BOOKING_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "type",
            "itemid",
            "initialelement",
            "deletedelement",
            "blocation",
            "bdate",
            "edate",
            "company",
            "hotel",
            "occupancy",
            "area",
            "transportation",
            "roomtype",
            "bedtype",
            "meal",
            "bedcount",
            "checkinpolicy",
            "specialratetype",
            "ratechange",
            "corporateidrequired",
            "guaranteerequired",
            "depositrequired",
            "checkotherfeatures",
            "rates",
            "travellerid",
            "remark",
            "confirmationnumber",
            "status",
            "cancellationpolicy",
            "corporateid",
            "numberofrooms",
            "bookingcode",
            "listproviderroomratedescription",
            "checksellrules",
            "listspecialrate",
            "numofnights",
            "bookingsource"
        })
        public static class HOTEL
            implements Serializable
        {

            @XmlElement(name = "TYPE", required = true)
            protected String type;
            @XmlElement(name = "ITEM_ID", required = true)
            protected BigInteger itemid;
            @XmlElement(name = "INITIAL_ELEMENT")
            protected Boolean initialelement;
            @XmlElement(name = "DELETED_ELEMENT")
            protected Boolean deletedelement;
            @XmlElement(name = "B_LOCATION", required = true)
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BLOCATION blocation;
            @XmlElement(name = "B_DATE", required = true)
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BDATE bdate;
            @XmlElement(name = "E_DATE", required = true)
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.EDATE edate;
            @XmlElement(name = "COMPANY", required = true)
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.COMPANY company;
            @XmlElement(name = "HOTEL", required = true)
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename hotel;
            @XmlElement(name = "OCCUPANCY")
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.OCCUPANCY occupancy;
            @XmlElement(name = "AREA")
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.AREA area;
            @XmlElement(name = "TRANSPORTATION")
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.TRANSPORTATION transportation;
            @XmlElement(name = "ROOM_TYPE", required = true)
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.ROOMTYPE roomtype;
            @XmlElement(name = "BED_TYPE")
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BEDTYPE bedtype;
            @XmlElement(name = "MEAL")
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.MEAL meal;
            @XmlElement(name = "BED_COUNT")
            protected BigInteger bedcount;
            @XmlElement(name = "CHECK_IN_POLICY")
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.CHECKINPOLICY checkinpolicy;
            @XmlElement(name = "SPECIAL_RATE_TYPE")
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.SPECIALRATETYPE specialratetype;
            @XmlElement(name = "RATE_CHANGE")
            protected Boolean ratechange;
            @XmlElement(name = "CORPORATE_ID_REQUIRED")
            protected Boolean corporateidrequired;
            @XmlElement(name = "GUARANTEE_REQUIRED")
            protected Boolean guaranteerequired;
            @XmlElement(name = "DEPOSIT_REQUIRED")
            protected Boolean depositrequired;
            @XmlElement(name = "CHECK_OTHER_FEATURES")
            protected Boolean checkotherfeatures;
            @XmlElement(name = "RATES")
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES rates;
            @XmlElement(name = "TRAVELLER_ID", required = true)
            protected BigInteger travellerid;
            @XmlElement(name = "REMARK")
            protected String remark;
            @XmlElement(name = "CONFIRMATION_NUMBER")
            protected String confirmationnumber;
            @XmlElement(name = "STATUS")
            protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.STATUS status;
            @XmlElement(name = "CANCELLATION_POLICY")
            protected String cancellationpolicy;
            @XmlElement(name = "CORPORATE_ID")
            protected String corporateid;
            @XmlElement(name = "NUMBER_OF_ROOMS")
            protected BigInteger numberofrooms;
            @XmlElement(name = "BOOKING_CODE")
            protected String bookingcode;
            @XmlElement(name = "LIST_PROVIDER_ROOM_RATE_DESCRIPTION")
            protected List<String> listproviderroomratedescription;
            @XmlElement(name = "CHECK_SELL_RULES")
            protected Boolean checksellrules;
            @XmlElement(name = "LIST_SPECIAL_RATE")
            protected List<String> listspecialrate;
            @XmlElement(name = "NUM_OF_NIGHTS")
            protected BigInteger numofnights;
            @XmlElement(name = "BOOKING_SOURCE")
            protected String bookingsource;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the itemid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getITEMID() {
                return itemid;
            }

            /**
             * Sets the value of the itemid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setITEMID(BigInteger value) {
                this.itemid = value;
            }

            /**
             * Gets the value of the initialelement property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isINITIALELEMENT() {
                return initialelement;
            }

            /**
             * Sets the value of the initialelement property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setINITIALELEMENT(Boolean value) {
                this.initialelement = value;
            }

            /**
             * Gets the value of the deletedelement property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDELETEDELEMENT() {
                return deletedelement;
            }

            /**
             * Sets the value of the deletedelement property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDELETEDELEMENT(Boolean value) {
                this.deletedelement = value;
            }

            /**
             * Gets the value of the blocation property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BLOCATION }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BLOCATION getBLOCATION() {
                return blocation;
            }

            /**
             * Sets the value of the blocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BLOCATION }
             *     
             */
            public void setBLOCATION(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BLOCATION value) {
                this.blocation = value;
            }

            /**
             * Gets the value of the bdate property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BDATE }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BDATE getBDATE() {
                return bdate;
            }

            /**
             * Sets the value of the bdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BDATE }
             *     
             */
            public void setBDATE(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BDATE value) {
                this.bdate = value;
            }

            /**
             * Gets the value of the edate property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.EDATE }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.EDATE getEDATE() {
                return edate;
            }

            /**
             * Sets the value of the edate property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.EDATE }
             *     
             */
            public void setEDATE(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.EDATE value) {
                this.edate = value;
            }

            /**
             * Gets the value of the company property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.COMPANY }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.COMPANY getCOMPANY() {
                return company;
            }

            /**
             * Sets the value of the company property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.COMPANY }
             *     
             */
            public void setCOMPANY(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.COMPANY value) {
                this.company = value;
            }

            /**
             * Gets the value of the hotel property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename getHOTEL() {
                return hotel;
            }

            /**
             * Sets the value of the hotel property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename }
             *     
             */
            public void setHOTEL(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename value) {
                this.hotel = value;
            }

            /**
             * Gets the value of the occupancy property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.OCCUPANCY }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.OCCUPANCY getOCCUPANCY() {
                return occupancy;
            }

            /**
             * Sets the value of the occupancy property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.OCCUPANCY }
             *     
             */
            public void setOCCUPANCY(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.OCCUPANCY value) {
                this.occupancy = value;
            }

            /**
             * Gets the value of the area property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.AREA }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.AREA getAREA() {
                return area;
            }

            /**
             * Sets the value of the area property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.AREA }
             *     
             */
            public void setAREA(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.AREA value) {
                this.area = value;
            }

            /**
             * Gets the value of the transportation property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.TRANSPORTATION }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.TRANSPORTATION getTRANSPORTATION() {
                return transportation;
            }

            /**
             * Sets the value of the transportation property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.TRANSPORTATION }
             *     
             */
            public void setTRANSPORTATION(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.TRANSPORTATION value) {
                this.transportation = value;
            }

            /**
             * Gets the value of the roomtype property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.ROOMTYPE }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.ROOMTYPE getROOMTYPE() {
                return roomtype;
            }

            /**
             * Sets the value of the roomtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.ROOMTYPE }
             *     
             */
            public void setROOMTYPE(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.ROOMTYPE value) {
                this.roomtype = value;
            }

            /**
             * Gets the value of the bedtype property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BEDTYPE }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BEDTYPE getBEDTYPE() {
                return bedtype;
            }

            /**
             * Sets the value of the bedtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BEDTYPE }
             *     
             */
            public void setBEDTYPE(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.BEDTYPE value) {
                this.bedtype = value;
            }

            /**
             * Gets the value of the meal property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.MEAL }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.MEAL getMEAL() {
                return meal;
            }

            /**
             * Sets the value of the meal property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.MEAL }
             *     
             */
            public void setMEAL(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.MEAL value) {
                this.meal = value;
            }

            /**
             * Gets the value of the bedcount property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBEDCOUNT() {
                return bedcount;
            }

            /**
             * Sets the value of the bedcount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBEDCOUNT(BigInteger value) {
                this.bedcount = value;
            }

            /**
             * Gets the value of the checkinpolicy property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.CHECKINPOLICY }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.CHECKINPOLICY getCHECKINPOLICY() {
                return checkinpolicy;
            }

            /**
             * Sets the value of the checkinpolicy property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.CHECKINPOLICY }
             *     
             */
            public void setCHECKINPOLICY(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.CHECKINPOLICY value) {
                this.checkinpolicy = value;
            }

            /**
             * Gets the value of the specialratetype property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.SPECIALRATETYPE }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.SPECIALRATETYPE getSPECIALRATETYPE() {
                return specialratetype;
            }

            /**
             * Sets the value of the specialratetype property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.SPECIALRATETYPE }
             *     
             */
            public void setSPECIALRATETYPE(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.SPECIALRATETYPE value) {
                this.specialratetype = value;
            }

            /**
             * Gets the value of the ratechange property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRATECHANGE() {
                return ratechange;
            }

            /**
             * Sets the value of the ratechange property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRATECHANGE(Boolean value) {
                this.ratechange = value;
            }

            /**
             * Gets the value of the corporateidrequired property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCORPORATEIDREQUIRED() {
                return corporateidrequired;
            }

            /**
             * Sets the value of the corporateidrequired property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCORPORATEIDREQUIRED(Boolean value) {
                this.corporateidrequired = value;
            }

            /**
             * Gets the value of the guaranteerequired property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isGUARANTEEREQUIRED() {
                return guaranteerequired;
            }

            /**
             * Sets the value of the guaranteerequired property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setGUARANTEEREQUIRED(Boolean value) {
                this.guaranteerequired = value;
            }

            /**
             * Gets the value of the depositrequired property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDEPOSITREQUIRED() {
                return depositrequired;
            }

            /**
             * Sets the value of the depositrequired property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDEPOSITREQUIRED(Boolean value) {
                this.depositrequired = value;
            }

            /**
             * Gets the value of the checkotherfeatures property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCHECKOTHERFEATURES() {
                return checkotherfeatures;
            }

            /**
             * Sets the value of the checkotherfeatures property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCHECKOTHERFEATURES(Boolean value) {
                this.checkotherfeatures = value;
            }

            /**
             * Gets the value of the rates property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES getRATES() {
                return rates;
            }

            /**
             * Sets the value of the rates property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES }
             *     
             */
            public void setRATES(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES value) {
                this.rates = value;
            }

            /**
             * Gets the value of the travellerid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTRAVELLERID() {
                return travellerid;
            }

            /**
             * Sets the value of the travellerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTRAVELLERID(BigInteger value) {
                this.travellerid = value;
            }

            /**
             * Gets the value of the remark property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMARK() {
                return remark;
            }

            /**
             * Sets the value of the remark property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMARK(String value) {
                this.remark = value;
            }

            /**
             * Gets the value of the confirmationnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONFIRMATIONNUMBER() {
                return confirmationnumber;
            }

            /**
             * Sets the value of the confirmationnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONFIRMATIONNUMBER(String value) {
                this.confirmationnumber = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.STATUS }
             *     
             */
            public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.STATUS getSTATUS() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.STATUS }
             *     
             */
            public void setSTATUS(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.STATUS value) {
                this.status = value;
            }

            /**
             * Gets the value of the cancellationpolicy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCANCELLATIONPOLICY() {
                return cancellationpolicy;
            }

            /**
             * Sets the value of the cancellationpolicy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCANCELLATIONPOLICY(String value) {
                this.cancellationpolicy = value;
            }

            /**
             * Gets the value of the corporateid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCORPORATEID() {
                return corporateid;
            }

            /**
             * Sets the value of the corporateid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCORPORATEID(String value) {
                this.corporateid = value;
            }

            /**
             * Gets the value of the numberofrooms property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMBEROFROOMS() {
                return numberofrooms;
            }

            /**
             * Sets the value of the numberofrooms property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMBEROFROOMS(BigInteger value) {
                this.numberofrooms = value;
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
             * Gets the value of the checksellrules property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCHECKSELLRULES() {
                return checksellrules;
            }

            /**
             * Sets the value of the checksellrules property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCHECKSELLRULES(Boolean value) {
                this.checksellrules = value;
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
             * Gets the value of the numofnights property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMOFNIGHTS() {
                return numofnights;
            }

            /**
             * Sets the value of the numofnights property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMOFNIGHTS(BigInteger value) {
                this.numofnights = value;
            }

            /**
             * Gets the value of the bookingsource property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBOOKINGSOURCE() {
                return bookingsource;
            }

            /**
             * Sets the value of the bookingsource property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBOOKINGSOURCE(String value) {
                this.bookingsource = value;
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            public static class AREA
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
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
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
            public static class BDATE
                implements Serializable
            {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "code", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar code;

                /**
                 * Gets the value of the value property.
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
             *         &lt;element name="CITY_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="LOCATION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="STATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "citycode",
                "cityname",
                "locationcode",
                "locationname",
                "statecode",
                "statename",
                "countrycode",
                "countryname"
            })
            public static class BLOCATION
                implements Serializable
            {

                @XmlElement(name = "CITY_CODE", required = true)
                protected String citycode;
                @XmlElement(name = "CITY_NAME")
                protected String cityname;
                @XmlElement(name = "LOCATION_CODE")
                protected String locationcode;
                @XmlElement(name = "LOCATION_NAME")
                protected String locationname;
                @XmlElement(name = "STATE_CODE")
                protected String statecode;
                @XmlElement(name = "STATE_NAME")
                protected String statename;
                @XmlElement(name = "COUNTRY_CODE")
                protected String countrycode;
                @XmlElement(name = "COUNTRY_NAME")
                protected String countryname;

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
                 * Gets the value of the locationcode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLOCATIONCODE() {
                    return locationcode;
                }

                /**
                 * Sets the value of the locationcode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLOCATIONCODE(String value) {
                    this.locationcode = value;
                }

                /**
                 * Gets the value of the locationname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLOCATIONNAME() {
                    return locationname;
                }

                /**
                 * Sets the value of the locationname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLOCATIONNAME(String value) {
                    this.locationname = value;
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
                 * Gets the value of the statename property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSTATENAME() {
                    return statename;
                }

                /**
                 * Sets the value of the statename property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSTATENAME(String value) {
                    this.statename = value;
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
                 * Gets the value of the countryname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCOUNTRYNAME() {
                    return countryname;
                }

                /**
                 * Sets the value of the countryname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCOUNTRYNAME(String value) {
                    this.countryname = value;
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            public static class CHECKINPOLICY
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ACCESS_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "name"
            })
            public static class COMPANY
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "ACCESS_LEVEL")
                protected String accesslevel;
                @XmlElement(name = "NAME", required = true)
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

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
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
            public static class EDATE
                implements Serializable
            {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "code", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar code;

                /**
                 * Gets the value of the value property.
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="ADDRESS" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="SUITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="STREET_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="STREET_NO_SUFFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="DIRECTION" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;all&gt;
             *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                           &lt;/all&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="PO_BOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="STATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="RR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="FIRST_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="SECOND_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="ZIP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PHONE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="TELEX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="FAX_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "name",
                "address",
                "phonenumber",
                "telexnumber",
                "faxnumber"
            })
            public static class HOTELRename
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "NAME")
                protected String name;
                @XmlElement(name = "ADDRESS")
                protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS address;
                @XmlElement(name = "PHONE_NUMBER")
                protected String phonenumber;
                @XmlElement(name = "TELEX_NUMBER")
                protected String telexnumber;
                @XmlElement(name = "FAX_NUMBER")
                protected String faxnumber;

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

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS }
                 *     
                 */
                public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS getADDRESS() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS }
                 *     
                 */
                public void setADDRESS(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS value) {
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
                 * Gets the value of the telexnumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTELEXNUMBER() {
                    return telexnumber;
                }

                /**
                 * Sets the value of the telexnumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTELEXNUMBER(String value) {
                    this.telexnumber = value;
                }

                /**
                 * Gets the value of the faxnumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFAXNUMBER() {
                    return faxnumber;
                }

                /**
                 * Sets the value of the faxnumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFAXNUMBER(String value) {
                    this.faxnumber = value;
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
                 *         &lt;element name="SUITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="STREET_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="STREET_NO_SUFFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="DIRECTION" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;all&gt;
                 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                 &lt;/all&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="PO_BOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="STATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="RR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="FIRST_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="SECOND_ADDRESS_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="ZIP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "suite",
                    "streetno",
                    "streetnosuffix",
                    "direction",
                    "pobox",
                    "station",
                    "rrnumber",
                    "firstaddressline",
                    "secondaddressline",
                    "zipcode",
                    "city",
                    "state",
                    "country"
                })
                public static class ADDRESS
                    implements Serializable
                {

                    @XmlElement(name = "SUITE")
                    protected String suite;
                    @XmlElement(name = "STREET_NO")
                    protected String streetno;
                    @XmlElement(name = "STREET_NO_SUFFIX")
                    protected String streetnosuffix;
                    @XmlElement(name = "DIRECTION")
                    protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS.DIRECTION direction;
                    @XmlElement(name = "PO_BOX")
                    protected String pobox;
                    @XmlElement(name = "STATION")
                    protected String station;
                    @XmlElement(name = "RR_NUMBER")
                    protected String rrnumber;
                    @XmlElement(name = "FIRST_ADDRESS_LINE")
                    protected String firstaddressline;
                    @XmlElement(name = "SECOND_ADDRESS_LINE")
                    protected String secondaddressline;
                    @XmlElement(name = "ZIP_CODE")
                    protected String zipcode;
                    @XmlElement(name = "CITY")
                    protected String city;
                    @XmlElement(name = "STATE")
                    protected String state;
                    @XmlElement(name = "COUNTRY")
                    protected String country;

                    /**
                     * Gets the value of the suite property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSUITE() {
                        return suite;
                    }

                    /**
                     * Sets the value of the suite property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSUITE(String value) {
                        this.suite = value;
                    }

                    /**
                     * Gets the value of the streetno property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSTREETNO() {
                        return streetno;
                    }

                    /**
                     * Sets the value of the streetno property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSTREETNO(String value) {
                        this.streetno = value;
                    }

                    /**
                     * Gets the value of the streetnosuffix property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSTREETNOSUFFIX() {
                        return streetnosuffix;
                    }

                    /**
                     * Sets the value of the streetnosuffix property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSTREETNOSUFFIX(String value) {
                        this.streetnosuffix = value;
                    }

                    /**
                     * Gets the value of the direction property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS.DIRECTION }
                     *     
                     */
                    public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS.DIRECTION getDIRECTION() {
                        return direction;
                    }

                    /**
                     * Sets the value of the direction property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS.DIRECTION }
                     *     
                     */
                    public void setDIRECTION(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS.DIRECTION value) {
                        this.direction = value;
                    }

                    /**
                     * Gets the value of the pobox property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPOBOX() {
                        return pobox;
                    }

                    /**
                     * Sets the value of the pobox property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPOBOX(String value) {
                        this.pobox = value;
                    }

                    /**
                     * Gets the value of the station property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSTATION() {
                        return station;
                    }

                    /**
                     * Sets the value of the station property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSTATION(String value) {
                        this.station = value;
                    }

                    /**
                     * Gets the value of the rrnumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRRNUMBER() {
                        return rrnumber;
                    }

                    /**
                     * Sets the value of the rrnumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRRNUMBER(String value) {
                        this.rrnumber = value;
                    }

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
                     * Gets the value of the city property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCITY() {
                        return city;
                    }

                    /**
                     * Sets the value of the city property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCITY(String value) {
                        this.city = value;
                    }

                    /**
                     * Gets the value of the state property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSTATE() {
                        return state;
                    }

                    /**
                     * Sets the value of the state property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSTATE(String value) {
                        this.state = value;
                    }

                    /**
                     * Gets the value of the country property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCOUNTRY() {
                        return country;
                    }

                    /**
                     * Sets the value of the country property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCOUNTRY(String value) {
                        this.country = value;
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
                     *       &lt;all&gt;
                     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *       &lt;/all&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {

                    })
                    public static class DIRECTION
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
            public static class OCCUPANCY
                implements Serializable
            {

                @XmlElement(name = "CODE")
                protected BigInteger code;
                @XmlElement(name = "NAME")
                protected String name;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCODE() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCODE(BigInteger value) {
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
             *         &lt;element name="LIST_RATE" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="B_DATE" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="E_DATE" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
             *                             &lt;element name="CURRENCY" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                                     &lt;/sequence&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
             *                             &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
             *         &lt;element name="LIST_TOTAL_RATE" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
             *                   &lt;element name="CURRENCY" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "listrate",
                "listtotalrate"
            })
            public static class RATES
                implements Serializable
            {

                @XmlElement(name = "LIST_RATE")
                protected List<RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE> listrate;
                @XmlElement(name = "LIST_TOTAL_RATE", required = true)
                protected List<RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE> listtotalrate;

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
                 * {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE }
                 * 
                 * 
                 */
                public List<RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE> getLISTRATE() {
                    if (listrate == null) {
                        listrate = new ArrayList<RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE>();
                    }
                    return this.listrate;
                }

                /**
                 * Gets the value of the listtotalrate property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listtotalrate property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTTOTALRATE().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE }
                 * 
                 * 
                 */
                public List<RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE> getLISTTOTALRATE() {
                    if (listtotalrate == null) {
                        listtotalrate = new ArrayList<RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE>();
                    }
                    return this.listtotalrate;
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
                 *         &lt;element name="B_DATE" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/simpleContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="E_DATE" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/simpleContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
                 *                   &lt;element name="CURRENCY" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                           &lt;/sequence&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
                 *                   &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
                    "bdate",
                    "edate",
                    "listprice"
                })
                public static class LISTRATE
                    implements Serializable
                {

                    @XmlElement(name = "B_DATE")
                    protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.BDATE bdate;
                    @XmlElement(name = "E_DATE")
                    protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.EDATE edate;
                    @XmlElement(name = "LIST_PRICE", required = true)
                    protected List<RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE> listprice;

                    /**
                     * Gets the value of the bdate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.BDATE }
                     *     
                     */
                    public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.BDATE getBDATE() {
                        return bdate;
                    }

                    /**
                     * Sets the value of the bdate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.BDATE }
                     *     
                     */
                    public void setBDATE(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.BDATE value) {
                        this.bdate = value;
                    }

                    /**
                     * Gets the value of the edate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.EDATE }
                     *     
                     */
                    public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.EDATE getEDATE() {
                        return edate;
                    }

                    /**
                     * Sets the value of the edate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.EDATE }
                     *     
                     */
                    public void setEDATE(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.EDATE value) {
                        this.edate = value;
                    }

                    /**
                     * Gets the value of the listprice property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the listprice property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLISTPRICE().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE }
                     * 
                     * 
                     */
                    public List<RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE> getLISTPRICE() {
                        if (listprice == null) {
                            listprice = new ArrayList<RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE>();
                        }
                        return this.listprice;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;simpleContent&gt;
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
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
                    public static class BDATE
                        implements Serializable
                    {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "code", required = true)
                        @XmlSchemaType(name = "dateTime")
                        protected XMLGregorianCalendar code;

                        /**
                         * Gets the value of the value property.
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
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
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
                    public static class EDATE
                        implements Serializable
                    {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "code", required = true)
                        @XmlSchemaType(name = "dateTime")
                        protected XMLGregorianCalendar code;

                        /**
                         * Gets the value of the value property.
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
                     *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
                     *         &lt;element name="CURRENCY" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *                 &lt;/sequence&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
                     *         &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
                        "currency",
                        "subtotal",
                        "exchangerate"
                    })
                    public static class LISTPRICE
                        implements Serializable
                    {

                        @XmlElement(name = "PRICE")
                        protected float price;
                        @XmlElement(name = "CURRENCY")
                        protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE.CURRENCY currency;
                        @XmlElement(name = "SUB_TOTAL")
                        protected Float subtotal;
                        @XmlElement(name = "EXCHANGE_RATE")
                        protected Float exchangerate;

                        /**
                         * Gets the value of the price property.
                         * 
                         */
                        public float getPRICE() {
                            return price;
                        }

                        /**
                         * Sets the value of the price property.
                         * 
                         */
                        public void setPRICE(float value) {
                            this.price = value;
                        }

                        /**
                         * Gets the value of the currency property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE.CURRENCY }
                         *     
                         */
                        public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE.CURRENCY getCURRENCY() {
                            return currency;
                        }

                        /**
                         * Sets the value of the currency property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE.CURRENCY }
                         *     
                         */
                        public void setCURRENCY(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE.CURRENCY value) {
                            this.currency = value;
                        }

                        /**
                         * Gets the value of the subtotal property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Float }
                         *     
                         */
                        public Float getSUBTOTAL() {
                            return subtotal;
                        }

                        /**
                         * Sets the value of the subtotal property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Float }
                         *     
                         */
                        public void setSUBTOTAL(Float value) {
                            this.subtotal = value;
                        }

                        /**
                         * Gets the value of the exchangerate property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Float }
                         *     
                         */
                        public Float getEXCHANGERATE() {
                            return exchangerate;
                        }

                        /**
                         * Sets the value of the exchangerate property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Float }
                         *     
                         */
                        public void setEXCHANGERATE(Float value) {
                            this.exchangerate = value;
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
                         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                        public static class CURRENCY
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
                 *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
                 *         &lt;element name="CURRENCY" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "price",
                    "currency"
                })
                public static class LISTTOTALRATE
                    implements Serializable
                {

                    @XmlElement(name = "PRICE")
                    protected float price;
                    @XmlElement(name = "CURRENCY")
                    protected RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE.CURRENCY currency;

                    /**
                     * Gets the value of the price property.
                     * 
                     */
                    public float getPRICE() {
                        return price;
                    }

                    /**
                     * Sets the value of the price property.
                     * 
                     */
                    public void setPRICE(float value) {
                        this.price = value;
                    }

                    /**
                     * Gets the value of the currency property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE.CURRENCY }
                     *     
                     */
                    public RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE.CURRENCY getCURRENCY() {
                        return currency;
                    }

                    /**
                     * Sets the value of the currency property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE.CURRENCY }
                     *     
                     */
                    public void setCURRENCY(RetrievePNROutput2 .LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE.CURRENCY value) {
                        this.currency = value;
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
                     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    public static class CURRENCY
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            public static class ROOMTYPE
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            public static class SPECIALRATETYPE
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            public static class STATUS
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
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            public static class TRANSPORTATION
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        public static class HOTELCHAIN
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "NAME", required = true)
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
     *         &lt;element name="PNR_EXTRA_DATA" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="RM"/&gt;
     *                         &lt;enumeration value="OSI"/&gt;
     *                         &lt;enumeration value="RX"/&gt;
     *                         &lt;enumeration value="RC"/&gt;
     *                         &lt;enumeration value="HIRM"/&gt;
     *                         &lt;enumeration value="DIRM"/&gt;
     *                         &lt;enumeration value="IARM"/&gt;
     *                         &lt;enumeration value="ICRM"/&gt;
     *                         &lt;enumeration value="IHRM"/&gt;
     *                         &lt;enumeration value="TKRM"/&gt;
     *                         &lt;enumeration value="USRM"/&gt;
     *                         &lt;enumeration value="FT"/&gt;
     *                         &lt;enumeration value="SSR"/&gt;
     *                         &lt;enumeration value="SK"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REFERENCE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="LIST_PAX" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                             &lt;element name="LIST_SEGMENT" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "pnrextradata"
    })
    public static class LISTPNREXTRADATA
        implements Serializable
    {

        @XmlElement(name = "PNR_EXTRA_DATA")
        protected List<RetrievePNROutput2 .LISTPNREXTRADATA.PNREXTRADATA> pnrextradata;

        /**
         * Gets the value of the pnrextradata property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pnrextradata property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPNREXTRADATA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RetrievePNROutput2 .LISTPNREXTRADATA.PNREXTRADATA }
         * 
         * 
         */
        public List<RetrievePNROutput2 .LISTPNREXTRADATA.PNREXTRADATA> getPNREXTRADATA() {
            if (pnrextradata == null) {
                pnrextradata = new ArrayList<RetrievePNROutput2 .LISTPNREXTRADATA.PNREXTRADATA>();
            }
            return this.pnrextradata;
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
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="RM"/&gt;
         *               &lt;enumeration value="OSI"/&gt;
         *               &lt;enumeration value="RX"/&gt;
         *               &lt;enumeration value="RC"/&gt;
         *               &lt;enumeration value="HIRM"/&gt;
         *               &lt;enumeration value="DIRM"/&gt;
         *               &lt;enumeration value="IARM"/&gt;
         *               &lt;enumeration value="ICRM"/&gt;
         *               &lt;enumeration value="IHRM"/&gt;
         *               &lt;enumeration value="TKRM"/&gt;
         *               &lt;enumeration value="USRM"/&gt;
         *               &lt;enumeration value="FT"/&gt;
         *               &lt;enumeration value="SSR"/&gt;
         *               &lt;enumeration value="SK"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REFERENCE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="LIST_PAX" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                   &lt;element name="LIST_SEGMENT" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "value",
            "reference"
        })
        public static class PNREXTRADATA
            implements Serializable
        {

            @XmlElement(name = "TYPE")
            protected String type;
            @XmlElement(name = "VALUE")
            protected String value;
            @XmlElement(name = "REFERENCE")
            protected RetrievePNROutput2 .LISTPNREXTRADATA.PNREXTRADATA.REFERENCE reference;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVALUE() {
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
            public void setVALUE(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the reference property.
             * 
             * @return
             *     possible object is
             *     {@link RetrievePNROutput2 .LISTPNREXTRADATA.PNREXTRADATA.REFERENCE }
             *     
             */
            public RetrievePNROutput2 .LISTPNREXTRADATA.PNREXTRADATA.REFERENCE getREFERENCE() {
                return reference;
            }

            /**
             * Sets the value of the reference property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetrievePNROutput2 .LISTPNREXTRADATA.PNREXTRADATA.REFERENCE }
             *     
             */
            public void setREFERENCE(RetrievePNROutput2 .LISTPNREXTRADATA.PNREXTRADATA.REFERENCE value) {
                this.reference = value;
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
             *         &lt;element name="LIST_PAX" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;element name="LIST_SEGMENT" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "listpax",
                "listsegment"
            })
            public static class REFERENCE
                implements Serializable
            {

                @XmlElement(name = "LIST_PAX")
                protected List<Object> listpax;
                @XmlElement(name = "LIST_SEGMENT")
                protected List<Object> listsegment;

                /**
                 * Gets the value of the listpax property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listpax property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTPAX().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getLISTPAX() {
                    if (listpax == null) {
                        listpax = new ArrayList<Object>();
                    }
                    return this.listpax;
                }

                /**
                 * Gets the value of the listsegment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listsegment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTSEGMENT().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getLISTSEGMENT() {
                    if (listsegment == null) {
                        listsegment = new ArrayList<Object>();
                    }
                    return this.listsegment;
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
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "value"
    })
    public static class LISTQUEUEINGOFFICEINFORMATION
        implements Serializable
    {

        @XmlElement(name = "VALUE", required = true)
        protected String value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVALUE() {
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
        public void setVALUE(String value) {
            this.value = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="MARKETS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="MARKETS_TO_APPLY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "markets",
        "marketstoapply"
    })
    public static class MARKETINFORMATION
        implements Serializable
    {

        @XmlElement(name = "MARKETS")
        protected String markets;
        @XmlElement(name = "MARKETS_TO_APPLY")
        protected String marketstoapply;

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
         * Gets the value of the marketstoapply property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMARKETSTOAPPLY() {
            return marketstoapply;
        }

        /**
         * Sets the value of the marketstoapply property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMARKETSTOAPPLY(String value) {
            this.marketstoapply = value;
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
     *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "segmentid"
    })
    public static class RECONFERRORLIST
        implements Serializable
    {

        @XmlElement(name = "SEGMENT_ID", required = true)
        protected BigInteger segmentid;

        /**
         * Gets the value of the segmentid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSEGMENTID() {
            return segmentid;
        }

        /**
         * Sets the value of the segmentid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSEGMENTID(BigInteger value) {
            this.segmentid = value;
        }

    }

}
