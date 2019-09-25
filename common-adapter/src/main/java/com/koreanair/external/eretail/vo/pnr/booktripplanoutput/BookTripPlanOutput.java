
package com.koreanair.external.eretail.vo.pnr.booktripplanoutput;

import java.io.Serializable;
import java.math.BigDecimal;
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
import com.koreanair.external.eretail.vo.common.common.CurrencyType;
import com.koreanair.external.eretail.vo.common.common.LISTMSG;
import com.koreanair.external.eretail.vo.farecommon.farecommon.LISTFEEPRICEType;
import com.koreanair.external.eretail.vo.payment.paymentoutput.PAYMENT;
import com.koreanair.external.eretail.vo.pnr.common.CODENUMBERTYPE;
import com.koreanair.external.eretail.vo.pnr.common.LISTBLUELANESTATUS;
import com.koreanair.external.eretail.vo.pnr.common.LISTDIFFPRICE;
import com.koreanair.external.eretail.vo.profile.commonout.LISTMAILSERVICE;
import com.koreanair.external.eretail.vo.profile.commonout.LISTROOMSMOKING;
import com.koreanair.external.eretail.vo.profile.commonout.LISTTRAVELLERTYPE;
import com.koreanair.external.eretail.vo.profile.commonout.LISTTRAVELLERTYPEPRIMARY;
import com.koreanair.external.eretail.vo.profile.commonout.LISTUSEOF;
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
 *         &lt;group ref="{}BookTripPlanGroup"/&gt;
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
    "listmsg",
    "pageticket",
    "boolcheckfares",
    "difffareamount",
    "fareamount",
    "noairfare",
    "nomethodofguaranteesection",
    "boolairstatusmodified",
    "pendingtimelimit",
    "boolpnrmodificationaborted",
    "boolairlinerecordlocatormodify",
    "boolpendingtripplanerror",
    "strtripdeparturetime",
    "strtripdeparturedate",
    "siteagencyline1",
    "siteagencyline2",
    "siteagencyline3",
    "siteagencyline4",
    "siteagencyline5",
    "siteagencyline6",
    "siteagencyline7",
    "siteemailaddress",
    "listtravellertypeprimary",
    "listtravellertype",
    "boolnomod",
    "boolqueuingformatow",
    "boolpickupactoavailable",
    "booldelivertoavailable",
    "boolpickupairportavailable",
    "booleticketavailable",
    "boolhandavailable",
    "boolpickupavailable",
    "listprefrailclass",
    "listrailmop",
    "listrailmod",
    "boolexpressmailavailable",
    "boolmopddavailable",
    "boolmopccavailable",
    "boolmoppaylateravailable",
    "boolmopeclavailable",
    "listeclids",
    "boolplccavailableins",
    "booldfrravailableins",
    "boolccavailableins",
    "boolddavailableins",
    "boolcashavailableins",
    "boolextpayavailableins",
    "boolaccountrefavailable",
    "boolticketlessavailable",
    "boolpnrmodified",
    "deliverymailservicedescription",
    "deliverymailservicefee",
    "defaultofficeiddeliv",
    "defaultofficeidpickupat",
    "listuseof",
    "listroomsmoking",
    "defaultroomsmokingcode",
    "listprefshortseat",
    "listpreffullseat",
    "defaulthotelcompanycode",
    "defaultadditionalinformation",
    "boolguarantee",
    "booldeposit",
    "listdiffprice",
    "babyseat",
    "bluelaneavailable",
    "listbluelanestatus",
    "listmailservice",
    "listcancellationnumber",
    "listrerouteinformation",
    "oldtrainpnr",
    "itineraryrisklevel",
    "listfeeprice",
    "booldisplaymog",
    "booladdinsuranceavailable",
    "listcancellableinsuranceproductid",
    "listinsurancefeatures",
    "acknowledgementurl",
    "paymentreference",
    "donation",
    "listinsurancepricingperproduct",
    "deadlinedisplaydate",
    "apcperformed",
    "apc2NDCURRENCYUSED",
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
@XmlRootElement(name = "BookTripPlanOutput")
public class BookTripPlanOutput
    implements Serializable
{

    @XmlElement(name = "TX_STATUS", required = true)
    protected BigInteger txstatus;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "PAGE_TICKET")
    protected String pageticket;
    @XmlElement(name = "BOOL_CHECK_FARES")
    protected Boolean boolcheckfares;
    @XmlElement(name = "DIFFFARE_AMOUNT")
    protected BigDecimal difffareamount;
    @XmlElement(name = "FARE_AMOUNT")
    protected BigDecimal fareamount;
    @XmlElement(name = "NO_AIRFARE")
    protected String noairfare;
    @XmlElement(name = "NO_METHOD_OF_GUARANTEE_SECTION")
    protected Boolean nomethodofguaranteesection;
    @XmlElement(name = "BOOL_AIR_STATUS_MODIFIED")
    protected Boolean boolairstatusmodified;
    @XmlElement(name = "PENDING_TIME_LIMIT")
    protected String pendingtimelimit;
    @XmlElement(name = "BOOL_PNR_MODIFICATION_ABORTED")
    protected Boolean boolpnrmodificationaborted;
    @XmlElement(name = "BOOL_AIRLINE_RECORD_LOCATOR_MODIFY")
    protected Boolean boolairlinerecordlocatormodify;
    @XmlElement(name = "BOOL_PENDING_TRIP_PLAN_ERROR")
    protected Boolean boolpendingtripplanerror;
    @XmlElement(name = "STR_TRIP_DEPARTURE_TIME")
    protected BookTripPlanOutput.STRTRIPDEPARTURETIME strtripdeparturetime;
    @XmlElement(name = "STR_TRIP_DEPARTURE_DATE")
    protected BookTripPlanOutput.STRTRIPDEPARTUREDATE strtripdeparturedate;
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
    @XmlElement(name = "SITE_AGENCY_LINE7")
    protected String siteagencyline7;
    @XmlElement(name = "SITE_EMAIL_ADDRESS")
    protected String siteemailaddress;
    @XmlElement(name = "LIST_TRAVELLER_TYPE_PRIMARY")
    protected List<LISTTRAVELLERTYPEPRIMARY> listtravellertypeprimary;
    @XmlElement(name = "LIST_TRAVELLER_TYPE")
    protected List<LISTTRAVELLERTYPE> listtravellertype;
    @XmlElement(name = "BOOL_NO_MOD")
    protected Boolean boolnomod;
    @XmlElement(name = "BOOL_QUEUING_FORMAT_OW")
    protected Boolean boolqueuingformatow;
    @XmlElement(name = "BOOL_PICKUP_AC_TO_AVAILABLE")
    protected Boolean boolpickupactoavailable;
    @XmlElement(name = "BOOL_DELIVER_TO_AVAILABLE")
    protected Boolean booldelivertoavailable;
    @XmlElement(name = "BOOL_PICKUP_AIRPORT_AVAILABLE")
    protected Boolean boolpickupairportavailable;
    @XmlElement(name = "BOOL_E_TICKET_AVAILABLE")
    protected Boolean booleticketavailable;
    @XmlElement(name = "BOOL_HAND_AVAILABLE")
    protected Boolean boolhandavailable;
    @XmlElement(name = "BOOL_PICKUP_AVAILABLE")
    protected Boolean boolpickupavailable;
    @XmlElement(name = "LIST_PREF_RAIL_CLASS")
    protected List<BookTripPlanOutput.LISTPREFRAILCLASS> listprefrailclass;
    @XmlElement(name = "LIST_RAIL_MOP")
    protected List<BookTripPlanOutput.LISTRAILMOP> listrailmop;
    @XmlElement(name = "LIST_RAIL_MOD")
    protected List<BookTripPlanOutput.LISTRAILMOD> listrailmod;
    @XmlElement(name = "BOOL_EXPRESS_MAIL_AVAILABLE")
    protected Boolean boolexpressmailavailable;
    @XmlElement(name = "BOOL_MOP_DD_AVAILABLE")
    protected Boolean boolmopddavailable;
    @XmlElement(name = "BOOL_MOP_CC_AVAILABLE")
    protected Boolean boolmopccavailable;
    @XmlElement(name = "BOOL_MOP_PAYLATER_AVAILABLE")
    protected Boolean boolmoppaylateravailable;
    @XmlElement(name = "BOOL_MOP_ECL_AVAILABLE")
    protected Boolean boolmopeclavailable;
    @XmlElement(name = "LIST_ECL_IDS")
    protected List<BookTripPlanOutput.LISTECLIDS> listeclids;
    @XmlElement(name = "BOOL_PLCC_AVAILABLE_INS")
    protected Boolean boolplccavailableins;
    @XmlElement(name = "BOOL_DFRR_AVAILABLE_INS")
    protected Boolean booldfrravailableins;
    @XmlElement(name = "BOOL_CC_AVAILABLE_INS")
    protected Boolean boolccavailableins;
    @XmlElement(name = "BOOL_DD_AVAILABLE_INS")
    protected Boolean boolddavailableins;
    @XmlElement(name = "BOOL_CASH_AVAILABLE_INS")
    protected Boolean boolcashavailableins;
    @XmlElement(name = "BOOL_EXTPAY_AVAILABLE_INS")
    protected Boolean boolextpayavailableins;
    @XmlElement(name = "BOOL_ACCOUNT_REF_AVAILABLE")
    protected Boolean boolaccountrefavailable;
    @XmlElement(name = "BOOL_TICKETLESS_AVAILABLE")
    protected Boolean boolticketlessavailable;
    @XmlElement(name = "BOOL_PNR_MODIFIED")
    protected Boolean boolpnrmodified;
    @XmlElement(name = "DELIVERY_MAIL_SERVICE_DESCRIPTION")
    protected String deliverymailservicedescription;
    @XmlElement(name = "DELIVERY_MAIL_SERVICE_FEE")
    protected String deliverymailservicefee;
    @XmlElement(name = "DEFAULT_OFFICE_ID_DELIV")
    protected BigInteger defaultofficeiddeliv;
    @XmlElement(name = "DEFAULT_OFFICE_ID_PICKUPAT")
    protected BigInteger defaultofficeidpickupat;
    @XmlElement(name = "LIST_USE_OF")
    protected List<LISTUSEOF> listuseof;
    @XmlElement(name = "LIST_ROOM_SMOKING")
    protected List<LISTROOMSMOKING> listroomsmoking;
    @XmlElement(name = "DEFAULT_ROOM_SMOKING_CODE")
    protected String defaultroomsmokingcode;
    @XmlElement(name = "LIST_PREF_SHORT_SEAT")
    protected List<CODENUMBERTYPE> listprefshortseat;
    @XmlElement(name = "LIST_PREF_FULL_SEAT")
    protected List<CODENUMBERTYPE> listpreffullseat;
    @XmlElement(name = "DEFAULT_HOTEL_COMPANY_CODE")
    protected String defaulthotelcompanycode;
    @XmlElement(name = "DEFAULT_ADDITIONAL_INFORMATION")
    protected String defaultadditionalinformation;
    @XmlElement(name = "BOOL_GUARANTEE")
    protected Boolean boolguarantee;
    @XmlElement(name = "BOOL_DEPOSIT")
    protected Boolean booldeposit;
    @XmlElement(name = "LIST_DIFF_PRICE")
    protected List<LISTDIFFPRICE> listdiffprice;
    @XmlElement(name = "BABY_SEAT")
    protected Boolean babyseat;
    @XmlElement(name = "BLUE_LANE_AVAILABLE")
    protected Boolean bluelaneavailable;
    @XmlElement(name = "LIST_BLUE_LANE_STATUS")
    protected List<LISTBLUELANESTATUS> listbluelanestatus;
    @XmlElement(name = "LIST_MAIL_SERVICE")
    protected List<LISTMAILSERVICE> listmailservice;
    @XmlElement(name = "LIST_CANCELLATION_NUMBER")
    protected List<BookTripPlanOutput.LISTCANCELLATIONNUMBER> listcancellationnumber;
    @XmlElement(name = "LIST_REROUTE_INFORMATION")
    protected List<BookTripPlanOutput.LISTREROUTEINFORMATION> listrerouteinformation;
    @XmlElement(name = "OLD_TRAIN_PNR")
    protected String oldtrainpnr;
    @XmlElement(name = "ITINERARY_RISK_LEVEL")
    protected BookTripPlanOutput.ITINERARYRISKLEVEL itineraryrisklevel;
    @XmlElement(name = "LIST_FEE_PRICE")
    protected List<LISTFEEPRICEType> listfeeprice;
    @XmlElement(name = "BOOL_DISPLAY_MOG")
    protected Boolean booldisplaymog;
    @XmlElement(name = "BOOL_ADD_INSURANCE_AVAILABLE")
    protected Boolean booladdinsuranceavailable;
    @XmlElement(name = "LIST_CANCELLABLE_INSURANCE_PRODUCT_ID")
    protected List<BigInteger> listcancellableinsuranceproductid;
    @XmlElement(name = "LIST_INSURANCE_FEATURES")
    protected List<BookTripPlanOutput.LISTINSURANCEFEATURES> listinsurancefeatures;
    @XmlElement(name = "ACKNOWLEDGEMENT_URL")
    protected Object acknowledgementurl;
    @XmlElement(name = "PAYMENT_REFERENCE")
    protected Object paymentreference;
    @XmlElement(name = "DONATION")
    protected List<BookTripPlanOutput.DONATION> donation;
    @XmlElement(name = "LIST_INSURANCE_PRICING_PER_PRODUCT")
    protected List<BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT> listinsurancepricingperproduct;
    @XmlElement(name = "DEADLINE_DISPLAY_DATE")
    protected BookTripPlanOutput.DEADLINEDISPLAYDATE deadlinedisplaydate;
    @XmlElement(name = "APC_PERFORMED")
    protected Boolean apcperformed;
    @XmlElement(name = "APC_2ND_CURRENCY_USED")
    protected Boolean apc2NDCURRENCYUSED;
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
     * Gets the value of the boolcheckfares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLCHECKFARES() {
        return boolcheckfares;
    }

    /**
     * Sets the value of the boolcheckfares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLCHECKFARES(Boolean value) {
        this.boolcheckfares = value;
    }

    /**
     * Gets the value of the difffareamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDIFFFAREAMOUNT() {
        return difffareamount;
    }

    /**
     * Sets the value of the difffareamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDIFFFAREAMOUNT(BigDecimal value) {
        this.difffareamount = value;
    }

    /**
     * Gets the value of the fareamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFAREAMOUNT() {
        return fareamount;
    }

    /**
     * Sets the value of the fareamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFAREAMOUNT(BigDecimal value) {
        this.fareamount = value;
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
     * Gets the value of the nomethodofguaranteesection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNOMETHODOFGUARANTEESECTION() {
        return nomethodofguaranteesection;
    }

    /**
     * Sets the value of the nomethodofguaranteesection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNOMETHODOFGUARANTEESECTION(Boolean value) {
        this.nomethodofguaranteesection = value;
    }

    /**
     * Gets the value of the boolairstatusmodified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLAIRSTATUSMODIFIED() {
        return boolairstatusmodified;
    }

    /**
     * Sets the value of the boolairstatusmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLAIRSTATUSMODIFIED(Boolean value) {
        this.boolairstatusmodified = value;
    }

    /**
     * Gets the value of the pendingtimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENDINGTIMELIMIT() {
        return pendingtimelimit;
    }

    /**
     * Sets the value of the pendingtimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENDINGTIMELIMIT(String value) {
        this.pendingtimelimit = value;
    }

    /**
     * Gets the value of the boolpnrmodificationaborted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLPNRMODIFICATIONABORTED() {
        return boolpnrmodificationaborted;
    }

    /**
     * Sets the value of the boolpnrmodificationaborted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLPNRMODIFICATIONABORTED(Boolean value) {
        this.boolpnrmodificationaborted = value;
    }

    /**
     * Gets the value of the boolairlinerecordlocatormodify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLAIRLINERECORDLOCATORMODIFY() {
        return boolairlinerecordlocatormodify;
    }

    /**
     * Sets the value of the boolairlinerecordlocatormodify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLAIRLINERECORDLOCATORMODIFY(Boolean value) {
        this.boolairlinerecordlocatormodify = value;
    }

    /**
     * Gets the value of the boolpendingtripplanerror property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLPENDINGTRIPPLANERROR() {
        return boolpendingtripplanerror;
    }

    /**
     * Sets the value of the boolpendingtripplanerror property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLPENDINGTRIPPLANERROR(Boolean value) {
        this.boolpendingtripplanerror = value;
    }

    /**
     * Gets the value of the strtripdeparturetime property.
     * 
     * @return
     *     possible object is
     *     {@link BookTripPlanOutput.STRTRIPDEPARTURETIME }
     *     
     */
    public BookTripPlanOutput.STRTRIPDEPARTURETIME getSTRTRIPDEPARTURETIME() {
        return strtripdeparturetime;
    }

    /**
     * Sets the value of the strtripdeparturetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTripPlanOutput.STRTRIPDEPARTURETIME }
     *     
     */
    public void setSTRTRIPDEPARTURETIME(BookTripPlanOutput.STRTRIPDEPARTURETIME value) {
        this.strtripdeparturetime = value;
    }

    /**
     * Gets the value of the strtripdeparturedate property.
     * 
     * @return
     *     possible object is
     *     {@link BookTripPlanOutput.STRTRIPDEPARTUREDATE }
     *     
     */
    public BookTripPlanOutput.STRTRIPDEPARTUREDATE getSTRTRIPDEPARTUREDATE() {
        return strtripdeparturedate;
    }

    /**
     * Sets the value of the strtripdeparturedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTripPlanOutput.STRTRIPDEPARTUREDATE }
     *     
     */
    public void setSTRTRIPDEPARTUREDATE(BookTripPlanOutput.STRTRIPDEPARTUREDATE value) {
        this.strtripdeparturedate = value;
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
     * Gets the value of the siteagencyline7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITEAGENCYLINE7() {
        return siteagencyline7;
    }

    /**
     * Sets the value of the siteagencyline7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITEAGENCYLINE7(String value) {
        this.siteagencyline7 = value;
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
     * Gets the value of the listtravellertypeprimary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellertypeprimary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERTYPEPRIMARY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRAVELLERTYPEPRIMARY }
     * 
     * 
     */
    public List<LISTTRAVELLERTYPEPRIMARY> getLISTTRAVELLERTYPEPRIMARY() {
        if (listtravellertypeprimary == null) {
            listtravellertypeprimary = new ArrayList<LISTTRAVELLERTYPEPRIMARY>();
        }
        return this.listtravellertypeprimary;
    }

    /**
     * Gets the value of the listtravellertype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellertype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRAVELLERTYPE }
     * 
     * 
     */
    public List<LISTTRAVELLERTYPE> getLISTTRAVELLERTYPE() {
        if (listtravellertype == null) {
            listtravellertype = new ArrayList<LISTTRAVELLERTYPE>();
        }
        return this.listtravellertype;
    }

    /**
     * Gets the value of the boolnomod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLNOMOD() {
        return boolnomod;
    }

    /**
     * Sets the value of the boolnomod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLNOMOD(Boolean value) {
        this.boolnomod = value;
    }

    /**
     * Gets the value of the boolqueuingformatow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLQUEUINGFORMATOW() {
        return boolqueuingformatow;
    }

    /**
     * Sets the value of the boolqueuingformatow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLQUEUINGFORMATOW(Boolean value) {
        this.boolqueuingformatow = value;
    }

    /**
     * Gets the value of the boolpickupactoavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLPICKUPACTOAVAILABLE() {
        return boolpickupactoavailable;
    }

    /**
     * Sets the value of the boolpickupactoavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLPICKUPACTOAVAILABLE(Boolean value) {
        this.boolpickupactoavailable = value;
    }

    /**
     * Gets the value of the booldelivertoavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLDELIVERTOAVAILABLE() {
        return booldelivertoavailable;
    }

    /**
     * Sets the value of the booldelivertoavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLDELIVERTOAVAILABLE(Boolean value) {
        this.booldelivertoavailable = value;
    }

    /**
     * Gets the value of the boolpickupairportavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLPICKUPAIRPORTAVAILABLE() {
        return boolpickupairportavailable;
    }

    /**
     * Sets the value of the boolpickupairportavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLPICKUPAIRPORTAVAILABLE(Boolean value) {
        this.boolpickupairportavailable = value;
    }

    /**
     * Gets the value of the booleticketavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLETICKETAVAILABLE() {
        return booleticketavailable;
    }

    /**
     * Sets the value of the booleticketavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLETICKETAVAILABLE(Boolean value) {
        this.booleticketavailable = value;
    }

    /**
     * Gets the value of the boolhandavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLHANDAVAILABLE() {
        return boolhandavailable;
    }

    /**
     * Sets the value of the boolhandavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLHANDAVAILABLE(Boolean value) {
        this.boolhandavailable = value;
    }

    /**
     * Gets the value of the boolpickupavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLPICKUPAVAILABLE() {
        return boolpickupavailable;
    }

    /**
     * Sets the value of the boolpickupavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLPICKUPAVAILABLE(Boolean value) {
        this.boolpickupavailable = value;
    }

    /**
     * Gets the value of the listprefrailclass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprefrailclass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPREFRAILCLASS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanOutput.LISTPREFRAILCLASS }
     * 
     * 
     */
    public List<BookTripPlanOutput.LISTPREFRAILCLASS> getLISTPREFRAILCLASS() {
        if (listprefrailclass == null) {
            listprefrailclass = new ArrayList<BookTripPlanOutput.LISTPREFRAILCLASS>();
        }
        return this.listprefrailclass;
    }

    /**
     * Gets the value of the listrailmop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrailmop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRAILMOP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanOutput.LISTRAILMOP }
     * 
     * 
     */
    public List<BookTripPlanOutput.LISTRAILMOP> getLISTRAILMOP() {
        if (listrailmop == null) {
            listrailmop = new ArrayList<BookTripPlanOutput.LISTRAILMOP>();
        }
        return this.listrailmop;
    }

    /**
     * Gets the value of the listrailmod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrailmod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRAILMOD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanOutput.LISTRAILMOD }
     * 
     * 
     */
    public List<BookTripPlanOutput.LISTRAILMOD> getLISTRAILMOD() {
        if (listrailmod == null) {
            listrailmod = new ArrayList<BookTripPlanOutput.LISTRAILMOD>();
        }
        return this.listrailmod;
    }

    /**
     * Gets the value of the boolexpressmailavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLEXPRESSMAILAVAILABLE() {
        return boolexpressmailavailable;
    }

    /**
     * Sets the value of the boolexpressmailavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLEXPRESSMAILAVAILABLE(Boolean value) {
        this.boolexpressmailavailable = value;
    }

    /**
     * Gets the value of the boolmopddavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLMOPDDAVAILABLE() {
        return boolmopddavailable;
    }

    /**
     * Sets the value of the boolmopddavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLMOPDDAVAILABLE(Boolean value) {
        this.boolmopddavailable = value;
    }

    /**
     * Gets the value of the boolmopccavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLMOPCCAVAILABLE() {
        return boolmopccavailable;
    }

    /**
     * Sets the value of the boolmopccavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLMOPCCAVAILABLE(Boolean value) {
        this.boolmopccavailable = value;
    }

    /**
     * Gets the value of the boolmoppaylateravailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLMOPPAYLATERAVAILABLE() {
        return boolmoppaylateravailable;
    }

    /**
     * Sets the value of the boolmoppaylateravailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLMOPPAYLATERAVAILABLE(Boolean value) {
        this.boolmoppaylateravailable = value;
    }

    /**
     * Gets the value of the boolmopeclavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLMOPECLAVAILABLE() {
        return boolmopeclavailable;
    }

    /**
     * Sets the value of the boolmopeclavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLMOPECLAVAILABLE(Boolean value) {
        this.boolmopeclavailable = value;
    }

    /**
     * Gets the value of the listeclids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeclids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTECLIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanOutput.LISTECLIDS }
     * 
     * 
     */
    public List<BookTripPlanOutput.LISTECLIDS> getLISTECLIDS() {
        if (listeclids == null) {
            listeclids = new ArrayList<BookTripPlanOutput.LISTECLIDS>();
        }
        return this.listeclids;
    }

    /**
     * Gets the value of the boolplccavailableins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLPLCCAVAILABLEINS() {
        return boolplccavailableins;
    }

    /**
     * Sets the value of the boolplccavailableins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLPLCCAVAILABLEINS(Boolean value) {
        this.boolplccavailableins = value;
    }

    /**
     * Gets the value of the booldfrravailableins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLDFRRAVAILABLEINS() {
        return booldfrravailableins;
    }

    /**
     * Sets the value of the booldfrravailableins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLDFRRAVAILABLEINS(Boolean value) {
        this.booldfrravailableins = value;
    }

    /**
     * Gets the value of the boolccavailableins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLCCAVAILABLEINS() {
        return boolccavailableins;
    }

    /**
     * Sets the value of the boolccavailableins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLCCAVAILABLEINS(Boolean value) {
        this.boolccavailableins = value;
    }

    /**
     * Gets the value of the boolddavailableins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLDDAVAILABLEINS() {
        return boolddavailableins;
    }

    /**
     * Sets the value of the boolddavailableins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLDDAVAILABLEINS(Boolean value) {
        this.boolddavailableins = value;
    }

    /**
     * Gets the value of the boolcashavailableins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLCASHAVAILABLEINS() {
        return boolcashavailableins;
    }

    /**
     * Sets the value of the boolcashavailableins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLCASHAVAILABLEINS(Boolean value) {
        this.boolcashavailableins = value;
    }

    /**
     * Gets the value of the boolextpayavailableins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLEXTPAYAVAILABLEINS() {
        return boolextpayavailableins;
    }

    /**
     * Sets the value of the boolextpayavailableins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLEXTPAYAVAILABLEINS(Boolean value) {
        this.boolextpayavailableins = value;
    }

    /**
     * Gets the value of the boolaccountrefavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLACCOUNTREFAVAILABLE() {
        return boolaccountrefavailable;
    }

    /**
     * Sets the value of the boolaccountrefavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLACCOUNTREFAVAILABLE(Boolean value) {
        this.boolaccountrefavailable = value;
    }

    /**
     * Gets the value of the boolticketlessavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLTICKETLESSAVAILABLE() {
        return boolticketlessavailable;
    }

    /**
     * Sets the value of the boolticketlessavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLTICKETLESSAVAILABLE(Boolean value) {
        this.boolticketlessavailable = value;
    }

    /**
     * Gets the value of the boolpnrmodified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLPNRMODIFIED() {
        return boolpnrmodified;
    }

    /**
     * Sets the value of the boolpnrmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLPNRMODIFIED(Boolean value) {
        this.boolpnrmodified = value;
    }

    /**
     * Gets the value of the deliverymailservicedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYMAILSERVICEDESCRIPTION() {
        return deliverymailservicedescription;
    }

    /**
     * Sets the value of the deliverymailservicedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYMAILSERVICEDESCRIPTION(String value) {
        this.deliverymailservicedescription = value;
    }

    /**
     * Gets the value of the deliverymailservicefee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYMAILSERVICEFEE() {
        return deliverymailservicefee;
    }

    /**
     * Sets the value of the deliverymailservicefee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYMAILSERVICEFEE(String value) {
        this.deliverymailservicefee = value;
    }

    /**
     * Gets the value of the defaultofficeiddeliv property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDEFAULTOFFICEIDDELIV() {
        return defaultofficeiddeliv;
    }

    /**
     * Sets the value of the defaultofficeiddeliv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDEFAULTOFFICEIDDELIV(BigInteger value) {
        this.defaultofficeiddeliv = value;
    }

    /**
     * Gets the value of the defaultofficeidpickupat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDEFAULTOFFICEIDPICKUPAT() {
        return defaultofficeidpickupat;
    }

    /**
     * Sets the value of the defaultofficeidpickupat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDEFAULTOFFICEIDPICKUPAT(BigInteger value) {
        this.defaultofficeidpickupat = value;
    }

    /**
     * Gets the value of the listuseof property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listuseof property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTUSEOF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTUSEOF }
     * 
     * 
     */
    public List<LISTUSEOF> getLISTUSEOF() {
        if (listuseof == null) {
            listuseof = new ArrayList<LISTUSEOF>();
        }
        return this.listuseof;
    }

    /**
     * Gets the value of the listroomsmoking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listroomsmoking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTROOMSMOKING().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTROOMSMOKING }
     * 
     * 
     */
    public List<LISTROOMSMOKING> getLISTROOMSMOKING() {
        if (listroomsmoking == null) {
            listroomsmoking = new ArrayList<LISTROOMSMOKING>();
        }
        return this.listroomsmoking;
    }

    /**
     * Gets the value of the defaultroomsmokingcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTROOMSMOKINGCODE() {
        return defaultroomsmokingcode;
    }

    /**
     * Sets the value of the defaultroomsmokingcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTROOMSMOKINGCODE(String value) {
        this.defaultroomsmokingcode = value;
    }

    /**
     * Gets the value of the listprefshortseat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprefshortseat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPREFSHORTSEAT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CODENUMBERTYPE }
     * 
     * 
     */
    public List<CODENUMBERTYPE> getLISTPREFSHORTSEAT() {
        if (listprefshortseat == null) {
            listprefshortseat = new ArrayList<CODENUMBERTYPE>();
        }
        return this.listprefshortseat;
    }

    /**
     * Gets the value of the listpreffullseat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpreffullseat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPREFFULLSEAT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CODENUMBERTYPE }
     * 
     * 
     */
    public List<CODENUMBERTYPE> getLISTPREFFULLSEAT() {
        if (listpreffullseat == null) {
            listpreffullseat = new ArrayList<CODENUMBERTYPE>();
        }
        return this.listpreffullseat;
    }

    /**
     * Gets the value of the defaulthotelcompanycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTHOTELCOMPANYCODE() {
        return defaulthotelcompanycode;
    }

    /**
     * Sets the value of the defaulthotelcompanycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTHOTELCOMPANYCODE(String value) {
        this.defaulthotelcompanycode = value;
    }

    /**
     * Gets the value of the defaultadditionalinformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTADDITIONALINFORMATION() {
        return defaultadditionalinformation;
    }

    /**
     * Sets the value of the defaultadditionalinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTADDITIONALINFORMATION(String value) {
        this.defaultadditionalinformation = value;
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
     * This list is created if price differences are detected between availability and sell , for Car, Air, Hotel elements Gets the value of the listdiffprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiffprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDIFFPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTDIFFPRICE }
     * 
     * 
     */
    public List<LISTDIFFPRICE> getLISTDIFFPRICE() {
        if (listdiffprice == null) {
            listdiffprice = new ArrayList<LISTDIFFPRICE>();
        }
        return this.listdiffprice;
    }

    /**
     * Gets the value of the babyseat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBABYSEAT() {
        return babyseat;
    }

    /**
     * Sets the value of the babyseat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBABYSEAT(Boolean value) {
        this.babyseat = value;
    }

    /**
     * Gets the value of the bluelaneavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBLUELANEAVAILABLE() {
        return bluelaneavailable;
    }

    /**
     * Sets the value of the bluelaneavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBLUELANEAVAILABLE(Boolean value) {
        this.bluelaneavailable = value;
    }

    /**
     * Gets the value of the listbluelanestatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listbluelanestatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBLUELANESTATUS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTBLUELANESTATUS }
     * 
     * 
     */
    public List<LISTBLUELANESTATUS> getLISTBLUELANESTATUS() {
        if (listbluelanestatus == null) {
            listbluelanestatus = new ArrayList<LISTBLUELANESTATUS>();
        }
        return this.listbluelanestatus;
    }

    /**
     * Gets the value of the listmailservice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmailservice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMAILSERVICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMAILSERVICE }
     * 
     * 
     */
    public List<LISTMAILSERVICE> getLISTMAILSERVICE() {
        if (listmailservice == null) {
            listmailservice = new ArrayList<LISTMAILSERVICE>();
        }
        return this.listmailservice;
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
     * {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER }
     * 
     * 
     */
    public List<BookTripPlanOutput.LISTCANCELLATIONNUMBER> getLISTCANCELLATIONNUMBER() {
        if (listcancellationnumber == null) {
            listcancellationnumber = new ArrayList<BookTripPlanOutput.LISTCANCELLATIONNUMBER>();
        }
        return this.listcancellationnumber;
    }

    /**
     * Gets the value of the listrerouteinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrerouteinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREROUTEINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanOutput.LISTREROUTEINFORMATION }
     * 
     * 
     */
    public List<BookTripPlanOutput.LISTREROUTEINFORMATION> getLISTREROUTEINFORMATION() {
        if (listrerouteinformation == null) {
            listrerouteinformation = new ArrayList<BookTripPlanOutput.LISTREROUTEINFORMATION>();
        }
        return this.listrerouteinformation;
    }

    /**
     * Gets the value of the oldtrainpnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLDTRAINPNR() {
        return oldtrainpnr;
    }

    /**
     * Sets the value of the oldtrainpnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLDTRAINPNR(String value) {
        this.oldtrainpnr = value;
    }

    /**
     * Gets the value of the itineraryrisklevel property.
     * 
     * @return
     *     possible object is
     *     {@link BookTripPlanOutput.ITINERARYRISKLEVEL }
     *     
     */
    public BookTripPlanOutput.ITINERARYRISKLEVEL getITINERARYRISKLEVEL() {
        return itineraryrisklevel;
    }

    /**
     * Sets the value of the itineraryrisklevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTripPlanOutput.ITINERARYRISKLEVEL }
     *     
     */
    public void setITINERARYRISKLEVEL(BookTripPlanOutput.ITINERARYRISKLEVEL value) {
        this.itineraryrisklevel = value;
    }

    /**
     * Gets the value of the listfeeprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfeeprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFEEPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFEEPRICEType }
     * 
     * 
     */
    public List<LISTFEEPRICEType> getLISTFEEPRICE() {
        if (listfeeprice == null) {
            listfeeprice = new ArrayList<LISTFEEPRICEType>();
        }
        return this.listfeeprice;
    }

    /**
     * Gets the value of the booldisplaymog property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLDISPLAYMOG() {
        return booldisplaymog;
    }

    /**
     * Sets the value of the booldisplaymog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLDISPLAYMOG(Boolean value) {
        this.booldisplaymog = value;
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
     * Gets the value of the listinsurancefeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listinsurancefeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINSURANCEFEATURES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanOutput.LISTINSURANCEFEATURES }
     * 
     * 
     */
    public List<BookTripPlanOutput.LISTINSURANCEFEATURES> getLISTINSURANCEFEATURES() {
        if (listinsurancefeatures == null) {
            listinsurancefeatures = new ArrayList<BookTripPlanOutput.LISTINSURANCEFEATURES>();
        }
        return this.listinsurancefeatures;
    }

    /**
     * Gets the value of the acknowledgementurl property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getACKNOWLEDGEMENTURL() {
        return acknowledgementurl;
    }

    /**
     * Sets the value of the acknowledgementurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setACKNOWLEDGEMENTURL(Object value) {
        this.acknowledgementurl = value;
    }

    /**
     * Gets the value of the paymentreference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPAYMENTREFERENCE() {
        return paymentreference;
    }

    /**
     * Sets the value of the paymentreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPAYMENTREFERENCE(Object value) {
        this.paymentreference = value;
    }

    /**
     * Gets the value of the donation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the donation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDONATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanOutput.DONATION }
     * 
     * 
     */
    public List<BookTripPlanOutput.DONATION> getDONATION() {
        if (donation == null) {
            donation = new ArrayList<BookTripPlanOutput.DONATION>();
        }
        return this.donation;
    }

    /**
     * Gets the value of the listinsurancepricingperproduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listinsurancepricingperproduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINSURANCEPRICINGPERPRODUCT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT }
     * 
     * 
     */
    public List<BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT> getLISTINSURANCEPRICINGPERPRODUCT() {
        if (listinsurancepricingperproduct == null) {
            listinsurancepricingperproduct = new ArrayList<BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT>();
        }
        return this.listinsurancepricingperproduct;
    }

    /**
     * Gets the value of the deadlinedisplaydate property.
     * 
     * @return
     *     possible object is
     *     {@link BookTripPlanOutput.DEADLINEDISPLAYDATE }
     *     
     */
    public BookTripPlanOutput.DEADLINEDISPLAYDATE getDEADLINEDISPLAYDATE() {
        return deadlinedisplaydate;
    }

    /**
     * Sets the value of the deadlinedisplaydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTripPlanOutput.DEADLINEDISPLAYDATE }
     *     
     */
    public void setDEADLINEDISPLAYDATE(BookTripPlanOutput.DEADLINEDISPLAYDATE value) {
        this.deadlinedisplaydate = value;
    }

    /**
     * Gets the value of the apcperformed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAPCPERFORMED() {
        return apcperformed;
    }

    /**
     * Sets the value of the apcperformed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAPCPERFORMED(Boolean value) {
        this.apcperformed = value;
    }

    /**
     * Gets the value of the apc2NDCURRENCYUSED property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAPC2NDCURRENCYUSED() {
        return apc2NDCURRENCYUSED;
    }

    /**
     * Sets the value of the apc2NDCURRENCYUSED property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAPC2NDCURRENCYUSED(Boolean value) {
        this.apc2NDCURRENCYUSED = value;
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
     *         &lt;element name="DATE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TYPE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="LTD"/&gt;
     *               &lt;enumeration value="ATL"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BOOL_INFORMATIVE_DATA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "type",
        "boolinformativedata"
    })
    public static class DEADLINEDISPLAYDATE
        implements Serializable
    {

        @XmlElement(name = "DATE")
        protected BookTripPlanOutput.DEADLINEDISPLAYDATE.DATE date;
        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "BOOL_INFORMATIVE_DATA")
        protected Boolean boolinformativedata;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanOutput.DEADLINEDISPLAYDATE.DATE }
         *     
         */
        public BookTripPlanOutput.DEADLINEDISPLAYDATE.DATE getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.DEADLINEDISPLAYDATE.DATE }
         *     
         */
        public void setDATE(BookTripPlanOutput.DEADLINEDISPLAYDATE.DATE value) {
            this.date = value;
        }

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
         * Gets the value of the boolinformativedata property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBOOLINFORMATIVEDATA() {
            return boolinformativedata;
        }

        /**
         * Sets the value of the boolinformativedata property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBOOLINFORMATIVEDATA(Boolean value) {
            this.boolinformativedata = value;
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
        public static class DATE
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
     *         &lt;group ref="{}DonationStatusGroup"/&gt;
     *         &lt;group ref="{}DonationGroup"/&gt;
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
        "status",
        "donationid",
        "newsletter",
        "amount",
        "currency",
        "creditcardid",
        "contactid",
        "emailid"
    })
    public static class DONATION
        implements Serializable
    {

        @XmlElement(name = "STATUS", required = true)
        protected String status;
        @XmlElement(name = "DONATION_ID")
        protected String donationid;
        @XmlElement(name = "NEWSLETTER")
        protected Boolean newsletter;
        @XmlElement(name = "AMOUNT", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "CURRENCY", required = true)
        protected CurrencyType currency;
        @XmlElement(name = "CREDIT_CARD_ID", required = true)
        protected BigInteger creditcardid;
        @XmlElement(name = "CONTACT_ID", required = true)
        protected BigInteger contactid;
        @XmlElement(name = "EMAIL_ID", required = true)
        protected BigInteger emailid;

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUS(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the donationid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDONATIONID() {
            return donationid;
        }

        /**
         * Sets the value of the donationid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDONATIONID(String value) {
            this.donationid = value;
        }

        /**
         * Gets the value of the newsletter property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNEWSLETTER() {
            return newsletter;
        }

        /**
         * Sets the value of the newsletter property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNEWSLETTER(Boolean value) {
            this.newsletter = value;
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

        /**
         * Gets the value of the creditcardid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCREDITCARDID() {
            return creditcardid;
        }

        /**
         * Sets the value of the creditcardid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCREDITCARDID(BigInteger value) {
            this.creditcardid = value;
        }

        /**
         * Gets the value of the contactid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCONTACTID() {
            return contactid;
        }

        /**
         * Sets the value of the contactid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCONTACTID(BigInteger value) {
            this.contactid = value;
        }

        /**
         * Gets the value of the emailid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEMAILID() {
            return emailid;
        }

        /**
         * Sets the value of the emailid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEMAILID(BigInteger value) {
            this.emailid = value;
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
     *         &lt;element name="RISK_LEVEL"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PRIVILEGED_LEVEL" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="SE"/&gt;
     *                         &lt;enumeration value="E"/&gt;
     *                         &lt;enumeration value="P"/&gt;
     *                         &lt;enumeration value=" "/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
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
        "risklevel",
        "privilegedlevel"
    })
    public static class ITINERARYRISKLEVEL
        implements Serializable
    {

        @XmlElement(name = "RISK_LEVEL", required = true)
        protected BookTripPlanOutput.ITINERARYRISKLEVEL.RISKLEVEL risklevel;
        @XmlElement(name = "PRIVILEGED_LEVEL")
        protected BookTripPlanOutput.ITINERARYRISKLEVEL.PRIVILEGEDLEVEL privilegedlevel;

        /**
         * Gets the value of the risklevel property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanOutput.ITINERARYRISKLEVEL.RISKLEVEL }
         *     
         */
        public BookTripPlanOutput.ITINERARYRISKLEVEL.RISKLEVEL getRISKLEVEL() {
            return risklevel;
        }

        /**
         * Sets the value of the risklevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.ITINERARYRISKLEVEL.RISKLEVEL }
         *     
         */
        public void setRISKLEVEL(BookTripPlanOutput.ITINERARYRISKLEVEL.RISKLEVEL value) {
            this.risklevel = value;
        }

        /**
         * Gets the value of the privilegedlevel property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanOutput.ITINERARYRISKLEVEL.PRIVILEGEDLEVEL }
         *     
         */
        public BookTripPlanOutput.ITINERARYRISKLEVEL.PRIVILEGEDLEVEL getPRIVILEGEDLEVEL() {
            return privilegedlevel;
        }

        /**
         * Sets the value of the privilegedlevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.ITINERARYRISKLEVEL.PRIVILEGEDLEVEL }
         *     
         */
        public void setPRIVILEGEDLEVEL(BookTripPlanOutput.ITINERARYRISKLEVEL.PRIVILEGEDLEVEL value) {
            this.privilegedlevel = value;
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
         *         &lt;element name="CODE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="SE"/&gt;
         *               &lt;enumeration value="E"/&gt;
         *               &lt;enumeration value="P"/&gt;
         *               &lt;enumeration value=" "/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class PRIVILEGEDLEVEL
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
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "code"
        })
        public static class RISKLEVEL
            implements Serializable
        {

            @XmlElement(name = "NAME")
            protected String name;
            @XmlElement(name = "CODE", required = true)
            protected String code;

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
     *                                                 &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
     *                                                 &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                                 &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
     *                                       &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
        protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTELCHAIN hotelchain;
        @XmlElement(name = "B_LOCATION", required = true)
        protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.BLOCATION blocation;
        @XmlElement(name = "B_DATE", required = true)
        protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.BDATE bdate;
        @XmlElement(name = "PROPERTY_CODE", required = true)
        protected String propertycode;
        @XmlElement(name = "CANCELLATION_POLICY", required = true)
        protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY cancellationpolicy;
        @XmlElement(name = "ADDRESS")
        protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.ADDRESS address;
        @XmlElement(name = "HOTEL")
        protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL hotel;

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
         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTELCHAIN }
         *     
         */
        public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTELCHAIN getHOTELCHAIN() {
            return hotelchain;
        }

        /**
         * Sets the value of the hotelchain property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTELCHAIN }
         *     
         */
        public void setHOTELCHAIN(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTELCHAIN value) {
            this.hotelchain = value;
        }

        /**
         * Gets the value of the blocation property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.BLOCATION }
         *     
         */
        public BookTripPlanOutput.LISTCANCELLATIONNUMBER.BLOCATION getBLOCATION() {
            return blocation;
        }

        /**
         * Sets the value of the blocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.BLOCATION }
         *     
         */
        public void setBLOCATION(BookTripPlanOutput.LISTCANCELLATIONNUMBER.BLOCATION value) {
            this.blocation = value;
        }

        /**
         * Gets the value of the bdate property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.BDATE }
         *     
         */
        public BookTripPlanOutput.LISTCANCELLATIONNUMBER.BDATE getBDATE() {
            return bdate;
        }

        /**
         * Sets the value of the bdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.BDATE }
         *     
         */
        public void setBDATE(BookTripPlanOutput.LISTCANCELLATIONNUMBER.BDATE value) {
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
         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY }
         *     
         */
        public BookTripPlanOutput.LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY getCANCELLATIONPOLICY() {
            return cancellationpolicy;
        }

        /**
         * Sets the value of the cancellationpolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY }
         *     
         */
        public void setCANCELLATIONPOLICY(BookTripPlanOutput.LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY value) {
            this.cancellationpolicy = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.ADDRESS }
         *     
         */
        public BookTripPlanOutput.LISTCANCELLATIONNUMBER.ADDRESS getADDRESS() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.ADDRESS }
         *     
         */
        public void setADDRESS(BookTripPlanOutput.LISTCANCELLATIONNUMBER.ADDRESS value) {
            this.address = value;
        }

        /**
         * Gets the value of the hotel property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL }
         *     
         */
        public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL getHOTEL() {
            return hotel;
        }

        /**
         * Sets the value of the hotel property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL }
         *     
         */
        public void setHOTEL(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL value) {
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
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.ADDRESS.DIRECTION direction;
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
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.ADDRESS.DIRECTION }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.ADDRESS.DIRECTION getDIRECTION() {
                return direction;
            }

            /**
             * Sets the value of the direction property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.ADDRESS.DIRECTION }
             *     
             */
            public void setDIRECTION(BookTripPlanOutput.LISTCANCELLATIONNUMBER.ADDRESS.DIRECTION value) {
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
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY.APPLY apply;
            @XmlElement(name = "DESCRIPTION")
            protected String description;

            /**
             * Gets the value of the apply property.
             * 
             * @return
             *     possible object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY.APPLY }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY.APPLY getAPPLY() {
                return apply;
            }

            /**
             * Sets the value of the apply property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY.APPLY }
             *     
             */
            public void setAPPLY(BookTripPlanOutput.LISTCANCELLATIONNUMBER.CANCELLATIONPOLICY.APPLY value) {
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
         *                                       &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
         *                                       &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                                       &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
         *                             &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BLOCATION blocation;
            @XmlElement(name = "B_DATE", required = true)
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BDATE bdate;
            @XmlElement(name = "E_DATE", required = true)
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.EDATE edate;
            @XmlElement(name = "COMPANY", required = true)
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.COMPANY company;
            @XmlElement(name = "HOTEL", required = true)
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename hotel;
            @XmlElement(name = "OCCUPANCY")
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.OCCUPANCY occupancy;
            @XmlElement(name = "AREA")
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.AREA area;
            @XmlElement(name = "TRANSPORTATION")
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.TRANSPORTATION transportation;
            @XmlElement(name = "ROOM_TYPE", required = true)
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.ROOMTYPE roomtype;
            @XmlElement(name = "BED_TYPE")
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BEDTYPE bedtype;
            @XmlElement(name = "MEAL")
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.MEAL meal;
            @XmlElement(name = "BED_COUNT")
            protected BigInteger bedcount;
            @XmlElement(name = "CHECK_IN_POLICY")
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.CHECKINPOLICY checkinpolicy;
            @XmlElement(name = "SPECIAL_RATE_TYPE")
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.SPECIALRATETYPE specialratetype;
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
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES rates;
            @XmlElement(name = "TRAVELLER_ID", required = true)
            protected BigInteger travellerid;
            @XmlElement(name = "REMARK")
            protected String remark;
            @XmlElement(name = "CONFIRMATION_NUMBER")
            protected String confirmationnumber;
            @XmlElement(name = "STATUS")
            protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.STATUS status;
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
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BLOCATION }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BLOCATION getBLOCATION() {
                return blocation;
            }

            /**
             * Sets the value of the blocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BLOCATION }
             *     
             */
            public void setBLOCATION(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BLOCATION value) {
                this.blocation = value;
            }

            /**
             * Gets the value of the bdate property.
             * 
             * @return
             *     possible object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BDATE }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BDATE getBDATE() {
                return bdate;
            }

            /**
             * Sets the value of the bdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BDATE }
             *     
             */
            public void setBDATE(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BDATE value) {
                this.bdate = value;
            }

            /**
             * Gets the value of the edate property.
             * 
             * @return
             *     possible object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.EDATE }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.EDATE getEDATE() {
                return edate;
            }

            /**
             * Sets the value of the edate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.EDATE }
             *     
             */
            public void setEDATE(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.EDATE value) {
                this.edate = value;
            }

            /**
             * Gets the value of the company property.
             * 
             * @return
             *     possible object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.COMPANY }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.COMPANY getCOMPANY() {
                return company;
            }

            /**
             * Sets the value of the company property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.COMPANY }
             *     
             */
            public void setCOMPANY(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.COMPANY value) {
                this.company = value;
            }

            /**
             * Gets the value of the hotel property.
             * 
             * @return
             *     possible object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename getHOTEL() {
                return hotel;
            }

            /**
             * Sets the value of the hotel property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename }
             *     
             */
            public void setHOTEL(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename value) {
                this.hotel = value;
            }

            /**
             * Gets the value of the occupancy property.
             * 
             * @return
             *     possible object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.OCCUPANCY }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.OCCUPANCY getOCCUPANCY() {
                return occupancy;
            }

            /**
             * Sets the value of the occupancy property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.OCCUPANCY }
             *     
             */
            public void setOCCUPANCY(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.OCCUPANCY value) {
                this.occupancy = value;
            }

            /**
             * Gets the value of the area property.
             * 
             * @return
             *     possible object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.AREA }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.AREA getAREA() {
                return area;
            }

            /**
             * Sets the value of the area property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.AREA }
             *     
             */
            public void setAREA(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.AREA value) {
                this.area = value;
            }

            /**
             * Gets the value of the transportation property.
             * 
             * @return
             *     possible object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.TRANSPORTATION }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.TRANSPORTATION getTRANSPORTATION() {
                return transportation;
            }

            /**
             * Sets the value of the transportation property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.TRANSPORTATION }
             *     
             */
            public void setTRANSPORTATION(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.TRANSPORTATION value) {
                this.transportation = value;
            }

            /**
             * Gets the value of the roomtype property.
             * 
             * @return
             *     possible object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.ROOMTYPE }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.ROOMTYPE getROOMTYPE() {
                return roomtype;
            }

            /**
             * Sets the value of the roomtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.ROOMTYPE }
             *     
             */
            public void setROOMTYPE(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.ROOMTYPE value) {
                this.roomtype = value;
            }

            /**
             * Gets the value of the bedtype property.
             * 
             * @return
             *     possible object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BEDTYPE }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BEDTYPE getBEDTYPE() {
                return bedtype;
            }

            /**
             * Sets the value of the bedtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BEDTYPE }
             *     
             */
            public void setBEDTYPE(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.BEDTYPE value) {
                this.bedtype = value;
            }

            /**
             * Gets the value of the meal property.
             * 
             * @return
             *     possible object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.MEAL }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.MEAL getMEAL() {
                return meal;
            }

            /**
             * Sets the value of the meal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.MEAL }
             *     
             */
            public void setMEAL(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.MEAL value) {
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
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.CHECKINPOLICY }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.CHECKINPOLICY getCHECKINPOLICY() {
                return checkinpolicy;
            }

            /**
             * Sets the value of the checkinpolicy property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.CHECKINPOLICY }
             *     
             */
            public void setCHECKINPOLICY(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.CHECKINPOLICY value) {
                this.checkinpolicy = value;
            }

            /**
             * Gets the value of the specialratetype property.
             * 
             * @return
             *     possible object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.SPECIALRATETYPE }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.SPECIALRATETYPE getSPECIALRATETYPE() {
                return specialratetype;
            }

            /**
             * Sets the value of the specialratetype property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.SPECIALRATETYPE }
             *     
             */
            public void setSPECIALRATETYPE(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.SPECIALRATETYPE value) {
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
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES getRATES() {
                return rates;
            }

            /**
             * Sets the value of the rates property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES }
             *     
             */
            public void setRATES(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES value) {
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
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.STATUS }
             *     
             */
            public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.STATUS getSTATUS() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.STATUS }
             *     
             */
            public void setSTATUS(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.STATUS value) {
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
                protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS address;
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
                 *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS }
                 *     
                 */
                public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS getADDRESS() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS }
                 *     
                 */
                public void setADDRESS(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS value) {
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
                    protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS.DIRECTION direction;
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
                     *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS.DIRECTION }
                     *     
                     */
                    public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS.DIRECTION getDIRECTION() {
                        return direction;
                    }

                    /**
                     * Sets the value of the direction property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS.DIRECTION }
                     *     
                     */
                    public void setDIRECTION(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.HOTELRename.ADDRESS.DIRECTION value) {
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
             *                             &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
             *                             &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                             &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
             *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
                protected List<BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE> listrate;
                @XmlElement(name = "LIST_TOTAL_RATE", required = true)
                protected List<BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE> listtotalrate;

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
                 * {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE }
                 * 
                 * 
                 */
                public List<BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE> getLISTRATE() {
                    if (listrate == null) {
                        listrate = new ArrayList<BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE>();
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
                 * {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE }
                 * 
                 * 
                 */
                public List<BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE> getLISTTOTALRATE() {
                    if (listtotalrate == null) {
                        listtotalrate = new ArrayList<BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE>();
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
                 *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
                 *                   &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *                   &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
                    protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.BDATE bdate;
                    @XmlElement(name = "E_DATE")
                    protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.EDATE edate;
                    @XmlElement(name = "LIST_PRICE", required = true)
                    protected List<BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE> listprice;

                    /**
                     * Gets the value of the bdate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.BDATE }
                     *     
                     */
                    public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.BDATE getBDATE() {
                        return bdate;
                    }

                    /**
                     * Sets the value of the bdate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.BDATE }
                     *     
                     */
                    public void setBDATE(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.BDATE value) {
                        this.bdate = value;
                    }

                    /**
                     * Gets the value of the edate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.EDATE }
                     *     
                     */
                    public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.EDATE getEDATE() {
                        return edate;
                    }

                    /**
                     * Sets the value of the edate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.EDATE }
                     *     
                     */
                    public void setEDATE(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.EDATE value) {
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
                     * {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE }
                     * 
                     * 
                     */
                    public List<BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE> getLISTPRICE() {
                        if (listprice == null) {
                            listprice = new ArrayList<BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE>();
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
                     *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
                     *         &lt;element name="SUB_TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                     *         &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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

                        @XmlElement(name = "PRICE", required = true)
                        protected BigDecimal price;
                        @XmlElement(name = "CURRENCY")
                        protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE.CURRENCY currency;
                        @XmlElement(name = "SUB_TOTAL")
                        protected BigDecimal subtotal;
                        @XmlElement(name = "EXCHANGE_RATE")
                        protected BigDecimal exchangerate;

                        /**
                         * Gets the value of the price property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getPRICE() {
                            return price;
                        }

                        /**
                         * Sets the value of the price property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setPRICE(BigDecimal value) {
                            this.price = value;
                        }

                        /**
                         * Gets the value of the currency property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE.CURRENCY }
                         *     
                         */
                        public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE.CURRENCY getCURRENCY() {
                            return currency;
                        }

                        /**
                         * Sets the value of the currency property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE.CURRENCY }
                         *     
                         */
                        public void setCURRENCY(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTRATE.LISTPRICE.CURRENCY value) {
                            this.currency = value;
                        }

                        /**
                         * Gets the value of the subtotal property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getSUBTOTAL() {
                            return subtotal;
                        }

                        /**
                         * Sets the value of the subtotal property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setSUBTOTAL(BigDecimal value) {
                            this.subtotal = value;
                        }

                        /**
                         * Gets the value of the exchangerate property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getEXCHANGERATE() {
                            return exchangerate;
                        }

                        /**
                         * Sets the value of the exchangerate property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setEXCHANGERATE(BigDecimal value) {
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
                 *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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

                    @XmlElement(name = "PRICE", required = true)
                    protected BigDecimal price;
                    @XmlElement(name = "CURRENCY")
                    protected BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE.CURRENCY currency;

                    /**
                     * Gets the value of the price property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPRICE() {
                        return price;
                    }

                    /**
                     * Sets the value of the price property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPRICE(BigDecimal value) {
                        this.price = value;
                    }

                    /**
                     * Gets the value of the currency property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE.CURRENCY }
                     *     
                     */
                    public BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE.CURRENCY getCURRENCY() {
                        return currency;
                    }

                    /**
                     * Sets the value of the currency property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE.CURRENCY }
                     *     
                     */
                    public void setCURRENCY(BookTripPlanOutput.LISTCANCELLATIONNUMBER.HOTEL.RATES.LISTTOTALRATE.CURRENCY value) {
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
     *         &lt;element name="ECREDITLINE_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "ecreditlineid"
    })
    public static class LISTECLIDS
        implements Serializable
    {

        @XmlElement(name = "ECREDITLINE_ID")
        protected List<String> ecreditlineid;

        /**
         * Gets the value of the ecreditlineid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecreditlineid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECREDITLINEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getECREDITLINEID() {
            if (ecreditlineid == null) {
                ecreditlineid = new ArrayList<String>();
            }
            return this.ecreditlineid;
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
     *       &lt;all&gt;
     *         &lt;element name="PRODUCT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TEXT_FEATURES" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    public static class LISTINSURANCEFEATURES
        implements Serializable
    {

        @XmlElement(name = "PRODUCT_ID", required = true)
        protected BigInteger productid;
        @XmlElement(name = "TEXT_FEATURES", required = true)
        protected String textfeatures;

        /**
         * Gets the value of the productid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPRODUCTID() {
            return productid;
        }

        /**
         * Sets the value of the productid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPRODUCTID(BigInteger value) {
            this.productid = value;
        }

        /**
         * Gets the value of the textfeatures property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTEXTFEATURES() {
            return textfeatures;
        }

        /**
         * Sets the value of the textfeatures property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTEXTFEATURES(String value) {
            this.textfeatures = value;
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
     *         &lt;element name="PROVIDER"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PRODUCT"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="EXTENSION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PLAN_COST_INFO" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="CURRENCY" type="{}currencyType"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BOOL_IS_DEFAULT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TRAVELLER_PRICE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LIST_COVERED_TRAVELLER" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="CURRENCY" type="{}currencyType"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="B_DATE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="E_DATE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "provider",
        "product",
        "plancostinfo",
        "boolisdefault",
        "displayorder",
        "listtravellerprice",
        "bdate",
        "edate"
    })
    public static class LISTINSURANCEPRICINGPERPRODUCT
        implements Serializable
    {

        @XmlElement(name = "PROVIDER", required = true)
        protected BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PROVIDER provider;
        @XmlElement(name = "PRODUCT", required = true)
        protected BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PRODUCT product;
        @XmlElement(name = "PLAN_COST_INFO")
        protected BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO plancostinfo;
        @XmlElement(name = "BOOL_IS_DEFAULT")
        protected Boolean boolisdefault;
        @XmlElement(name = "DISPLAY_ORDER")
        protected BigInteger displayorder;
        @XmlElement(name = "LIST_TRAVELLER_PRICE", required = true)
        protected List<BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE> listtravellerprice;
        @XmlElement(name = "B_DATE")
        protected BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.BDATE bdate;
        @XmlElement(name = "E_DATE")
        protected BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.EDATE edate;

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PROVIDER }
         *     
         */
        public BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PROVIDER getPROVIDER() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PROVIDER }
         *     
         */
        public void setPROVIDER(BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PROVIDER value) {
            this.provider = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PRODUCT }
         *     
         */
        public BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PRODUCT getPRODUCT() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PRODUCT }
         *     
         */
        public void setPRODUCT(BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PRODUCT value) {
            this.product = value;
        }

        /**
         * Gets the value of the plancostinfo property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO }
         *     
         */
        public BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO getPLANCOSTINFO() {
            return plancostinfo;
        }

        /**
         * Sets the value of the plancostinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO }
         *     
         */
        public void setPLANCOSTINFO(BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO value) {
            this.plancostinfo = value;
        }

        /**
         * Gets the value of the boolisdefault property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBOOLISDEFAULT() {
            return boolisdefault;
        }

        /**
         * Sets the value of the boolisdefault property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBOOLISDEFAULT(Boolean value) {
            this.boolisdefault = value;
        }

        /**
         * Gets the value of the displayorder property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDISPLAYORDER() {
            return displayorder;
        }

        /**
         * Sets the value of the displayorder property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDISPLAYORDER(BigInteger value) {
            this.displayorder = value;
        }

        /**
         * Gets the value of the listtravellerprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtravellerprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRAVELLERPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE }
         * 
         * 
         */
        public List<BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE> getLISTTRAVELLERPRICE() {
            if (listtravellerprice == null) {
                listtravellerprice = new ArrayList<BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE>();
            }
            return this.listtravellerprice;
        }

        /**
         * Gets the value of the bdate property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.BDATE }
         *     
         */
        public BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.BDATE getBDATE() {
            return bdate;
        }

        /**
         * Sets the value of the bdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.BDATE }
         *     
         */
        public void setBDATE(BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.BDATE value) {
            this.bdate = value;
        }

        /**
         * Gets the value of the edate property.
         * 
         * @return
         *     possible object is
         *     {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.EDATE }
         *     
         */
        public BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.EDATE getEDATE() {
            return edate;
        }

        /**
         * Sets the value of the edate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.EDATE }
         *     
         */
        public void setEDATE(BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.EDATE value) {
            this.edate = value;
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
        public static class BDATE
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
        public static class EDATE
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
         *         &lt;element name="LIST_COVERED_TRAVELLER" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_PRICE" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="CURRENCY" type="{}currencyType"/&gt;
         *                 &lt;/all&gt;
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
            "listcoveredtraveller",
            "listprice"
        })
        public static class LISTTRAVELLERPRICE
            implements Serializable
        {

            @XmlElement(name = "LIST_COVERED_TRAVELLER", required = true)
            protected List<BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTCOVEREDTRAVELLER> listcoveredtraveller;
            @XmlElement(name = "LIST_PRICE", required = true)
            protected List<BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTPRICE> listprice;

            /**
             * Gets the value of the listcoveredtraveller property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listcoveredtraveller property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTCOVEREDTRAVELLER().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTCOVEREDTRAVELLER }
             * 
             * 
             */
            public List<BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTCOVEREDTRAVELLER> getLISTCOVEREDTRAVELLER() {
                if (listcoveredtraveller == null) {
                    listcoveredtraveller = new ArrayList<BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTCOVEREDTRAVELLER>();
                }
                return this.listcoveredtraveller;
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
             * {@link BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTPRICE }
             * 
             * 
             */
            public List<BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTPRICE> getLISTPRICE() {
                if (listprice == null) {
                    listprice = new ArrayList<BookTripPlanOutput.LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTPRICE>();
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
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
            public static class LISTCOVEREDTRAVELLER
                implements Serializable
            {

                @XmlElement(name = "TYPE", required = true)
                protected String type;
                @XmlElement(name = "TRAVELLER_ID", required = true)
                protected BigInteger travellerid;

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
             *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
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
            public static class LISTPRICE
                implements Serializable
            {

                @XmlElement(name = "AMOUNT", required = true)
                protected BigDecimal amount;
                @XmlElement(name = "CURRENCY", required = true)
                protected CurrencyType currency;

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
         *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
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
        public static class PLANCOSTINFO
            implements Serializable
        {

            @XmlElement(name = "TOTAL_AMOUNT", required = true)
            protected BigDecimal totalamount;
            @XmlElement(name = "CURRENCY", required = true)
            protected CurrencyType currency;

            /**
             * Gets the value of the totalamount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTOTALAMOUNT() {
                return totalamount;
            }

            /**
             * Sets the value of the totalamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTOTALAMOUNT(BigDecimal value) {
                this.totalamount = value;
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
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="EXTENSION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        public static class PRODUCT
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "EXTENSION_CODE")
            protected String extensioncode;
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
             * Gets the value of the extensioncode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXTENSIONCODE() {
                return extensioncode;
            }

            /**
             * Sets the value of the extensioncode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXTENSIONCODE(String value) {
                this.extensioncode = value;
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
         *       &lt;all&gt;
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        public static class PROVIDER
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
    public static class LISTPREFRAILCLASS
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
    public static class LISTRAILMOD
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
    public static class LISTRAILMOP
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LISTREROUTEINFORMATION
        implements Serializable
    {


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
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
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
    public static class STRTRIPDEPARTUREDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "date")
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
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
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
    public static class STRTRIPDEPARTURETIME
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "time")
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

}
