
package com.koreanair.eretail.pojo.pnr.addelementsoutput2;

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
import com.koreanair.eretail.pojo.common.common.APISMANAGEROUTPUTTYPE;
import com.koreanair.eretail.pojo.common.common.APISRULESTYPE;
import com.koreanair.eretail.pojo.common.common.CurrencyType;
import com.koreanair.eretail.pojo.common.common.LISTELEMENTSTATUS;
import com.koreanair.eretail.pojo.common.common.LISTMSG;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTFEEPRICEType;
import com.koreanair.eretail.pojo.payment.listmopoutput.LISTMOPType;
import com.koreanair.eretail.pojo.payment.paymentoutput.PAYMENT;
import com.koreanair.eretail.pojo.pnr.common.CODENUMBERTYPE;
import com.koreanair.eretail.pojo.pnr.common.LISTBLUELANESTATUS;
import com.koreanair.eretail.pojo.pnr.common.LISTDIFFPRICE;
import com.koreanair.eretail.pojo.profile.apisinformationoutput.LISTAPISCOUNTRIES;
import com.koreanair.eretail.pojo.profile.commonout.LISTMAILSERVICE;
import com.koreanair.eretail.pojo.profile.commonout.LISTROOMSMOKING;
import com.koreanair.eretail.pojo.profile.commonout.LISTUSEOF;
import com.koreanair.eretail.pojo.specialservices.service_selection.SERVICESELECTION;
import com.koreanair.eretail.pojo.specialservices.service_selection_before_rebook.SERVICESELECTIONBEFOREREBOOK;
import com.koreanair.eretail.pojo.tripplan.accountable_document.ACCOUNTABLEDOCUMENTType;
import com.koreanair.eretail.pojo.tripplan.air.AIR;
import com.koreanair.eretail.pojo.tripplan.air_offer.AIROFFER;
import com.koreanair.eretail.pojo.tripplan.airport_transfer.AIRPORTTRANSFER;
import com.koreanair.eretail.pojo.tripplan.ancillary_services.ANCILLARYSERVICES;
import com.koreanair.eretail.pojo.tripplan.atx.ATX;
import com.koreanair.eretail.pojo.tripplan.car.CAR;
import com.koreanair.eretail.pojo.tripplan.command.COMMANDType;
import com.koreanair.eretail.pojo.tripplan.contact.CONTACT;
import com.koreanair.eretail.pojo.tripplan.cruise.CRUISE;
import com.koreanair.eretail.pojo.tripplan.document.DOCUMENT;
import com.koreanair.eretail.pojo.tripplan.etr_elements.ETR;
import com.koreanair.eretail.pojo.tripplan.external_provider.EXTERNALPROVIDER;
import com.koreanair.eretail.pojo.tripplan.facts.FACTS;
import com.koreanair.eretail.pojo.tripplan.ferry.FERRY;
import com.koreanair.eretail.pojo.tripplan.ground.GROUND;
import com.koreanair.eretail.pojo.tripplan.hotel.HOTEL;
import com.koreanair.eretail.pojo.tripplan.hotel_offer.HOTELOFFER;
import com.koreanair.eretail.pojo.tripplan.insurance.INSURANCE;
import com.koreanair.eretail.pojo.tripplan.list_ticket_group.LISTTICKETGROUP;
import com.koreanair.eretail.pojo.tripplan.loyalty_card.LOYALTYCARD;
import com.koreanair.eretail.pojo.tripplan.misc.MISC;
import com.koreanair.eretail.pojo.tripplan.payment_group.PAYMENTGROUPType;
import com.koreanair.eretail.pojo.tripplan.pnr.PNRType;
import com.koreanair.eretail.pojo.tripplan.proposal.PROPOSAL;
import com.koreanair.eretail.pojo.tripplan.psf.LISTPSFGROUP;
import com.koreanair.eretail.pojo.tripplan.psf.PSFCONFIGURATION;
import com.koreanair.eretail.pojo.tripplan.rail.RAIL;
import com.koreanair.eretail.pojo.tripplan.requirement.REQUIREMENT;
import com.koreanair.eretail.pojo.tripplan.shopping_basket.SHOPPINGBASKET;
import com.koreanair.eretail.pojo.tripplan.status.STATUS;
import com.koreanair.eretail.pojo.tripplan.tour.TOUR;
import com.koreanair.eretail.pojo.tripplan.tr_elements.TR;
import com.koreanair.eretail.pojo.tripplan.traveller_information.TRAVELLERINFORMATION;
import com.koreanair.eretail.pojo.tripplan.traveller_link.TRAVELLERLINK;
import com.koreanair.eretail.pojo.tripplan.trip.TRIP;
import com.koreanair.eretail.pojo.tripplan.web_fare.WEBFARE;


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
 *         &lt;group ref="{}AddElementsGroup2"/&gt;
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
    "externalloginstatus",
    "listmsg",
    "pageticket",
    "liststandardrate",
    "hotelstatus",
    "boolcheckfares",
    "difffareamount",
    "fareamount",
    "usependingtrips",
    "isconfirmationallowed",
    "pendingtkdate",
    "eligibility",
    "boolexcludeinswithhold",
    "boolexcludeinswithdp",
    "boolexcludeinswithplcc",
    "boolblockholddbahncc",
    "noairfare",
    "boolnomod",
    "boolqueuingformatow",
    "deliverytypecode",
    "boolpickupactoavailable",
    "booldelivertoavailable",
    "boolpickupairportavailable",
    "booleticketavailable",
    "boolptarestrictionroute",
    "booleticketbyemailavailable",
    "booleticketbyfaxavailable",
    "booleticketbymailavailable",
    "boolhandavailable",
    "boolpickupavailable",
    "boolexpressmailavailable",
    "listmop",
    "listextpayavailablemops",
    "listcc",
    "listbank",
    "listgovernmentpayment",
    "boolmopddavailable",
    "boolmopccavailable",
    "boolmopeclavailable",
    "listeclids",
    "boolplccavailableins",
    "booldfrravailableins",
    "boolccavailableins",
    "boolddavailableins",
    "boolcashavailableins",
    "boolextpayavailable",
    "boolextpayavailableins",
    "boolaccountrefavailable",
    "boolticketlessavailable",
    "booldeferredpaymentavailable",
    "boolmoppaylateravailable",
    "listprefrailclass",
    "listrailmop",
    "listrailmod",
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
    "booladdcartoflight",
    "bluelaneavailable",
    "listbluelanestatus",
    "listmailservice",
    "listdiffprice",
    "boolnomethodofguaranteesection",
    "listfeeprice",
    "feeinfo",
    "booldisplaymog",
    "boolmultiplemop",
    "listapiscountries",
    "listinsurancepricingperproduct",
    "onholdinformation",
    "defpayinformation",
    "deadlinedisplaydate",
    "boolbirthrequiredbookins",
    "listelementstatus",
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
@XmlRootElement(name = "AddElementsOutput2")
public class AddElementsOutput2
    implements Serializable
{

    @XmlElement(name = "TX_STATUS", required = true)
    protected BigInteger txstatus;
    @XmlElement(name = "EXTERNAL_LOGIN_STATUS")
    protected BigInteger externalloginstatus;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "PAGE_TICKET")
    protected String pageticket;
    @XmlElement(name = "LIST_STANDARD_RATE")
    protected List<String> liststandardrate;
    @XmlElement(name = "HOTEL_STATUS")
    protected String hotelstatus;
    @XmlElement(name = "BOOL_CHECK_FARES")
    protected Boolean boolcheckfares;
    @XmlElement(name = "DIFFFARE_AMOUNT")
    protected Float difffareamount;
    @XmlElement(name = "FARE_AMOUNT")
    protected Float fareamount;
    @XmlElement(name = "USE_PENDING_TRIPS")
    protected Boolean usependingtrips;
    @XmlElement(name = "IS_CONFIRMATION_ALLOWED")
    protected Boolean isconfirmationallowed;
    @XmlElement(name = "PENDING_TK_DATE")
    protected Object pendingtkdate;
    @XmlElement(name = "ELIGIBILITY")
    protected List<AddElementsOutput2 .ELIGIBILITY> eligibility;
    @XmlElement(name = "BOOL_EXCLUDE_INS_WITH_HOLD")
    protected Boolean boolexcludeinswithhold;
    @XmlElement(name = "BOOL_EXCLUDE_INS_WITH_DP")
    protected Boolean boolexcludeinswithdp;
    @XmlElement(name = "BOOL_EXCLUDE_INS_WITH_PLCC")
    protected Boolean boolexcludeinswithplcc;
    @XmlElement(name = "BOOL_BLOCK_HOLD_DBAHN_CC")
    protected Boolean boolblockholddbahncc;
    @XmlElement(name = "NO_AIRFARE")
    protected String noairfare;
    @XmlElement(name = "BOOL_NO_MOD")
    protected Boolean boolnomod;
    @XmlElement(name = "BOOL_QUEUING_FORMAT_OW")
    protected Boolean boolqueuingformatow;
    @XmlElement(name = "DELIVERY_TYPE_CODE")
    protected String deliverytypecode;
    @XmlElement(name = "BOOL_PICKUP_AC_TO_AVAILABLE")
    protected Boolean boolpickupactoavailable;
    @XmlElement(name = "BOOL_DELIVER_TO_AVAILABLE")
    protected Boolean booldelivertoavailable;
    @XmlElement(name = "BOOL_PICKUP_AIRPORT_AVAILABLE")
    protected Boolean boolpickupairportavailable;
    @XmlElement(name = "BOOL_E_TICKET_AVAILABLE")
    protected Boolean booleticketavailable;
    @XmlElement(name = "BOOL_PTA_RESTRICTION_ROUTE")
    protected Boolean boolptarestrictionroute;
    @XmlElement(name = "BOOL_E_TICKET_BY_EMAIL_AVAILABLE")
    protected Boolean booleticketbyemailavailable;
    @XmlElement(name = "BOOL_E_TICKET_BY_FAX_AVAILABLE")
    protected Boolean booleticketbyfaxavailable;
    @XmlElement(name = "BOOL_E_TICKET_BY_MAIL_AVAILABLE")
    protected Boolean booleticketbymailavailable;
    @XmlElement(name = "BOOL_HAND_AVAILABLE")
    protected Boolean boolhandavailable;
    @XmlElement(name = "BOOL_PICKUP_AVAILABLE")
    protected Boolean boolpickupavailable;
    @XmlElement(name = "BOOL_EXPRESS_MAIL_AVAILABLE")
    protected Boolean boolexpressmailavailable;
    @XmlElement(name = "LIST_MOP")
    protected List<LISTMOPType> listmop;
    @XmlElement(name = "LIST_EXTPAY_AVAILABLE_MOPS")
    protected List<AddElementsOutput2 .LISTEXTPAYAVAILABLEMOPS> listextpayavailablemops;
    @XmlElement(name = "LIST_CC")
    protected List<AddElementsOutput2 .LISTCC> listcc;
    @XmlElement(name = "LIST_BANK")
    protected List<AddElementsOutput2 .LISTBANK> listbank;
    @XmlElement(name = "LIST_GOVERNMENT_PAYMENT")
    protected List<AddElementsOutput2 .LISTGOVERNMENTPAYMENT> listgovernmentpayment;
    @XmlElement(name = "BOOL_MOP_DD_AVAILABLE")
    protected Boolean boolmopddavailable;
    @XmlElement(name = "BOOL_MOP_CC_AVAILABLE")
    protected Boolean boolmopccavailable;
    @XmlElement(name = "BOOL_MOP_ECL_AVAILABLE")
    protected Boolean boolmopeclavailable;
    @XmlElement(name = "LIST_ECL_IDS")
    protected List<AddElementsOutput2 .LISTECLIDS> listeclids;
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
    @XmlElement(name = "BOOL_EXTPAY_AVAILABLE")
    protected Boolean boolextpayavailable;
    @XmlElement(name = "BOOL_EXTPAY_AVAILABLE_INS")
    protected Boolean boolextpayavailableins;
    @XmlElement(name = "BOOL_ACCOUNT_REF_AVAILABLE")
    protected Boolean boolaccountrefavailable;
    @XmlElement(name = "BOOL_TICKETLESS_AVAILABLE")
    protected Boolean boolticketlessavailable;
    @XmlElement(name = "BOOL_DEFERRED_PAYMENT_AVAILABLE")
    protected Boolean booldeferredpaymentavailable;
    @XmlElement(name = "BOOL_MOP_PAYLATER_AVAILABLE")
    protected Boolean boolmoppaylateravailable;
    @XmlElement(name = "LIST_PREF_RAIL_CLASS")
    protected List<AddElementsOutput2 .LISTPREFRAILCLASS> listprefrailclass;
    @XmlElement(name = "LIST_RAIL_MOP")
    protected List<AddElementsOutput2 .LISTRAILMOP> listrailmop;
    @XmlElement(name = "LIST_RAIL_MOD")
    protected List<AddElementsOutput2 .LISTRAILMOD> listrailmod;
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
    @XmlElement(name = "BOOL_ADD_CAR_TO_FLIGHT")
    protected Boolean booladdcartoflight;
    @XmlElement(name = "BLUE_LANE_AVAILABLE")
    protected Boolean bluelaneavailable;
    @XmlElement(name = "LIST_BLUE_LANE_STATUS")
    protected List<LISTBLUELANESTATUS> listbluelanestatus;
    @XmlElement(name = "LIST_MAIL_SERVICE")
    protected List<LISTMAILSERVICE> listmailservice;
    @XmlElement(name = "LIST_DIFF_PRICE")
    protected List<LISTDIFFPRICE> listdiffprice;
    @XmlElement(name = "BOOL_NO_METHOD_OF_GUARANTEE_SECTION")
    protected Boolean boolnomethodofguaranteesection;
    @XmlElement(name = "LIST_FEE_PRICE")
    protected List<LISTFEEPRICEType> listfeeprice;
    @XmlElement(name = "FEE_INFO")
    protected AddElementsOutput2 .FEEINFO feeinfo;
    @XmlElement(name = "BOOL_DISPLAY_MOG")
    protected Boolean booldisplaymog;
    @XmlElement(name = "BOOL_MULTIPLEMOP")
    protected Boolean boolmultiplemop;
    @XmlElement(name = "LIST_APIS_COUNTRIES")
    protected List<LISTAPISCOUNTRIES> listapiscountries;
    @XmlElement(name = "LIST_INSURANCE_PRICING_PER_PRODUCT")
    protected List<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT> listinsurancepricingperproduct;
    @XmlElement(name = "ON_HOLD_INFORMATION")
    protected AddElementsOutput2 .ONHOLDINFORMATION onholdinformation;
    @XmlElement(name = "DEF_PAY_INFORMATION")
    protected AddElementsOutput2 .DEFPAYINFORMATION defpayinformation;
    @XmlElement(name = "DEADLINE_DISPLAY_DATE")
    protected AddElementsOutput2 .DEADLINEDISPLAYDATE deadlinedisplaydate;
    @XmlElement(name = "BOOL_BIRTH_REQUIRED_BOOK_INS")
    protected Boolean boolbirthrequiredbookins;
    @XmlElement(name = "LIST_ELEMENT_STATUS")
    protected List<LISTELEMENTSTATUS> listelementstatus;
    @XmlElement(name = "STATUS")
    protected STATUS status;
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
    protected List<HOTEL> hotel;
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
     * Gets the value of the externalloginstatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEXTERNALLOGINSTATUS() {
        return externalloginstatus;
    }

    /**
     * Sets the value of the externalloginstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEXTERNALLOGINSTATUS(BigInteger value) {
        this.externalloginstatus = value;
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
     * Gets the value of the liststandardrate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liststandardrate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSTANDARDRATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTSTANDARDRATE() {
        if (liststandardrate == null) {
            liststandardrate = new ArrayList<String>();
        }
        return this.liststandardrate;
    }

    /**
     * Gets the value of the hotelstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOTELSTATUS() {
        return hotelstatus;
    }

    /**
     * Sets the value of the hotelstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOTELSTATUS(String value) {
        this.hotelstatus = value;
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
     *     {@link Float }
     *     
     */
    public Float getDIFFFAREAMOUNT() {
        return difffareamount;
    }

    /**
     * Sets the value of the difffareamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDIFFFAREAMOUNT(Float value) {
        this.difffareamount = value;
    }

    /**
     * Gets the value of the fareamount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFAREAMOUNT() {
        return fareamount;
    }

    /**
     * Sets the value of the fareamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFAREAMOUNT(Float value) {
        this.fareamount = value;
    }

    /**
     * Gets the value of the usependingtrips property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSEPENDINGTRIPS() {
        return usependingtrips;
    }

    /**
     * Sets the value of the usependingtrips property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSEPENDINGTRIPS(Boolean value) {
        this.usependingtrips = value;
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
     * Gets the value of the pendingtkdate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPENDINGTKDATE() {
        return pendingtkdate;
    }

    /**
     * Sets the value of the pendingtkdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPENDINGTKDATE(Object value) {
        this.pendingtkdate = value;
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
     * {@link AddElementsOutput2 .ELIGIBILITY }
     * 
     * 
     */
    public List<AddElementsOutput2 .ELIGIBILITY> getELIGIBILITY() {
        if (eligibility == null) {
            eligibility = new ArrayList<AddElementsOutput2 .ELIGIBILITY>();
        }
        return this.eligibility;
    }

    /**
     * Gets the value of the boolexcludeinswithhold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLEXCLUDEINSWITHHOLD() {
        return boolexcludeinswithhold;
    }

    /**
     * Sets the value of the boolexcludeinswithhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLEXCLUDEINSWITHHOLD(Boolean value) {
        this.boolexcludeinswithhold = value;
    }

    /**
     * Gets the value of the boolexcludeinswithdp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLEXCLUDEINSWITHDP() {
        return boolexcludeinswithdp;
    }

    /**
     * Sets the value of the boolexcludeinswithdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLEXCLUDEINSWITHDP(Boolean value) {
        this.boolexcludeinswithdp = value;
    }

    /**
     * Gets the value of the boolexcludeinswithplcc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLEXCLUDEINSWITHPLCC() {
        return boolexcludeinswithplcc;
    }

    /**
     * Sets the value of the boolexcludeinswithplcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLEXCLUDEINSWITHPLCC(Boolean value) {
        this.boolexcludeinswithplcc = value;
    }

    /**
     * Gets the value of the boolblockholddbahncc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLBLOCKHOLDDBAHNCC() {
        return boolblockholddbahncc;
    }

    /**
     * Sets the value of the boolblockholddbahncc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLBLOCKHOLDDBAHNCC(Boolean value) {
        this.boolblockholddbahncc = value;
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
     * Gets the value of the deliverytypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYTYPECODE() {
        return deliverytypecode;
    }

    /**
     * Sets the value of the deliverytypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYTYPECODE(String value) {
        this.deliverytypecode = value;
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
     * Gets the value of the boolptarestrictionroute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLPTARESTRICTIONROUTE() {
        return boolptarestrictionroute;
    }

    /**
     * Sets the value of the boolptarestrictionroute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLPTARESTRICTIONROUTE(Boolean value) {
        this.boolptarestrictionroute = value;
    }

    /**
     * Gets the value of the booleticketbyemailavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLETICKETBYEMAILAVAILABLE() {
        return booleticketbyemailavailable;
    }

    /**
     * Sets the value of the booleticketbyemailavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLETICKETBYEMAILAVAILABLE(Boolean value) {
        this.booleticketbyemailavailable = value;
    }

    /**
     * Gets the value of the booleticketbyfaxavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLETICKETBYFAXAVAILABLE() {
        return booleticketbyfaxavailable;
    }

    /**
     * Sets the value of the booleticketbyfaxavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLETICKETBYFAXAVAILABLE(Boolean value) {
        this.booleticketbyfaxavailable = value;
    }

    /**
     * Gets the value of the booleticketbymailavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLETICKETBYMAILAVAILABLE() {
        return booleticketbymailavailable;
    }

    /**
     * Sets the value of the booleticketbymailavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLETICKETBYMAILAVAILABLE(Boolean value) {
        this.booleticketbymailavailable = value;
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
     * Gets the value of the listmop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMOP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMOPType }
     * 
     * 
     */
    public List<LISTMOPType> getLISTMOP() {
        if (listmop == null) {
            listmop = new ArrayList<LISTMOPType>();
        }
        return this.listmop;
    }

    /**
     * Gets the value of the listextpayavailablemops property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listextpayavailablemops property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXTPAYAVAILABLEMOPS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddElementsOutput2 .LISTEXTPAYAVAILABLEMOPS }
     * 
     * 
     */
    public List<AddElementsOutput2 .LISTEXTPAYAVAILABLEMOPS> getLISTEXTPAYAVAILABLEMOPS() {
        if (listextpayavailablemops == null) {
            listextpayavailablemops = new ArrayList<AddElementsOutput2 .LISTEXTPAYAVAILABLEMOPS>();
        }
        return this.listextpayavailablemops;
    }

    /**
     * Gets the value of the listcc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddElementsOutput2 .LISTCC }
     * 
     * 
     */
    public List<AddElementsOutput2 .LISTCC> getLISTCC() {
        if (listcc == null) {
            listcc = new ArrayList<AddElementsOutput2 .LISTCC>();
        }
        return this.listcc;
    }

    /**
     * Gets the value of the listbank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listbank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBANK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddElementsOutput2 .LISTBANK }
     * 
     * 
     */
    public List<AddElementsOutput2 .LISTBANK> getLISTBANK() {
        if (listbank == null) {
            listbank = new ArrayList<AddElementsOutput2 .LISTBANK>();
        }
        return this.listbank;
    }

    /**
     * Gets the value of the listgovernmentpayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listgovernmentpayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTGOVERNMENTPAYMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddElementsOutput2 .LISTGOVERNMENTPAYMENT }
     * 
     * 
     */
    public List<AddElementsOutput2 .LISTGOVERNMENTPAYMENT> getLISTGOVERNMENTPAYMENT() {
        if (listgovernmentpayment == null) {
            listgovernmentpayment = new ArrayList<AddElementsOutput2 .LISTGOVERNMENTPAYMENT>();
        }
        return this.listgovernmentpayment;
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
     * {@link AddElementsOutput2 .LISTECLIDS }
     * 
     * 
     */
    public List<AddElementsOutput2 .LISTECLIDS> getLISTECLIDS() {
        if (listeclids == null) {
            listeclids = new ArrayList<AddElementsOutput2 .LISTECLIDS>();
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
     * Gets the value of the boolextpayavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLEXTPAYAVAILABLE() {
        return boolextpayavailable;
    }

    /**
     * Sets the value of the boolextpayavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLEXTPAYAVAILABLE(Boolean value) {
        this.boolextpayavailable = value;
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
     * Gets the value of the booldeferredpaymentavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLDEFERREDPAYMENTAVAILABLE() {
        return booldeferredpaymentavailable;
    }

    /**
     * Sets the value of the booldeferredpaymentavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLDEFERREDPAYMENTAVAILABLE(Boolean value) {
        this.booldeferredpaymentavailable = value;
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
     * {@link AddElementsOutput2 .LISTPREFRAILCLASS }
     * 
     * 
     */
    public List<AddElementsOutput2 .LISTPREFRAILCLASS> getLISTPREFRAILCLASS() {
        if (listprefrailclass == null) {
            listprefrailclass = new ArrayList<AddElementsOutput2 .LISTPREFRAILCLASS>();
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
     * {@link AddElementsOutput2 .LISTRAILMOP }
     * 
     * 
     */
    public List<AddElementsOutput2 .LISTRAILMOP> getLISTRAILMOP() {
        if (listrailmop == null) {
            listrailmop = new ArrayList<AddElementsOutput2 .LISTRAILMOP>();
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
     * {@link AddElementsOutput2 .LISTRAILMOD }
     * 
     * 
     */
    public List<AddElementsOutput2 .LISTRAILMOD> getLISTRAILMOD() {
        if (listrailmod == null) {
            listrailmod = new ArrayList<AddElementsOutput2 .LISTRAILMOD>();
        }
        return this.listrailmod;
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
     * Gets the value of the booladdcartoflight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLADDCARTOFLIGHT() {
        return booladdcartoflight;
    }

    /**
     * Sets the value of the booladdcartoflight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLADDCARTOFLIGHT(Boolean value) {
        this.booladdcartoflight = value;
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
     * Gets the value of the listdiffprice property.
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
     * Gets the value of the boolnomethodofguaranteesection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLNOMETHODOFGUARANTEESECTION() {
        return boolnomethodofguaranteesection;
    }

    /**
     * Sets the value of the boolnomethodofguaranteesection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLNOMETHODOFGUARANTEESECTION(Boolean value) {
        this.boolnomethodofguaranteesection = value;
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
     * Gets the value of the feeinfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddElementsOutput2 .FEEINFO }
     *     
     */
    public AddElementsOutput2 .FEEINFO getFEEINFO() {
        return feeinfo;
    }

    /**
     * Sets the value of the feeinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddElementsOutput2 .FEEINFO }
     *     
     */
    public void setFEEINFO(AddElementsOutput2 .FEEINFO value) {
        this.feeinfo = value;
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
     * Gets the value of the boolmultiplemop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLMULTIPLEMOP() {
        return boolmultiplemop;
    }

    /**
     * Sets the value of the boolmultiplemop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLMULTIPLEMOP(Boolean value) {
        this.boolmultiplemop = value;
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
     * {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT }
     * 
     * 
     */
    public List<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT> getLISTINSURANCEPRICINGPERPRODUCT() {
        if (listinsurancepricingperproduct == null) {
            listinsurancepricingperproduct = new ArrayList<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT>();
        }
        return this.listinsurancepricingperproduct;
    }

    /**
     * Gets the value of the onholdinformation property.
     * 
     * @return
     *     possible object is
     *     {@link AddElementsOutput2 .ONHOLDINFORMATION }
     *     
     */
    public AddElementsOutput2 .ONHOLDINFORMATION getONHOLDINFORMATION() {
        return onholdinformation;
    }

    /**
     * Sets the value of the onholdinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddElementsOutput2 .ONHOLDINFORMATION }
     *     
     */
    public void setONHOLDINFORMATION(AddElementsOutput2 .ONHOLDINFORMATION value) {
        this.onholdinformation = value;
    }

    /**
     * Gets the value of the defpayinformation property.
     * 
     * @return
     *     possible object is
     *     {@link AddElementsOutput2 .DEFPAYINFORMATION }
     *     
     */
    public AddElementsOutput2 .DEFPAYINFORMATION getDEFPAYINFORMATION() {
        return defpayinformation;
    }

    /**
     * Sets the value of the defpayinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddElementsOutput2 .DEFPAYINFORMATION }
     *     
     */
    public void setDEFPAYINFORMATION(AddElementsOutput2 .DEFPAYINFORMATION value) {
        this.defpayinformation = value;
    }

    /**
     * Gets the value of the deadlinedisplaydate property.
     * 
     * @return
     *     possible object is
     *     {@link AddElementsOutput2 .DEADLINEDISPLAYDATE }
     *     
     */
    public AddElementsOutput2 .DEADLINEDISPLAYDATE getDEADLINEDISPLAYDATE() {
        return deadlinedisplaydate;
    }

    /**
     * Sets the value of the deadlinedisplaydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddElementsOutput2 .DEADLINEDISPLAYDATE }
     *     
     */
    public void setDEADLINEDISPLAYDATE(AddElementsOutput2 .DEADLINEDISPLAYDATE value) {
        this.deadlinedisplaydate = value;
    }

    /**
     * Gets the value of the boolbirthrequiredbookins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLBIRTHREQUIREDBOOKINS() {
        return boolbirthrequiredbookins;
    }

    /**
     * Sets the value of the boolbirthrequiredbookins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLBIRTHREQUIREDBOOKINS(Boolean value) {
        this.boolbirthrequiredbookins = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link STATUS }
     *     
     */
    public STATUS getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUS }
     *     
     */
    public void setSTATUS(STATUS value) {
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
     * {@link HOTEL }
     * 
     * 
     */
    public List<HOTEL> getHOTEL() {
        if (hotel == null) {
            hotel = new ArrayList<HOTEL>();
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
        protected AddElementsOutput2 .DEADLINEDISPLAYDATE.DATE date;
        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "BOOL_INFORMATIVE_DATA")
        protected Boolean boolinformativedata;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link AddElementsOutput2 .DEADLINEDISPLAYDATE.DATE }
         *     
         */
        public AddElementsOutput2 .DEADLINEDISPLAYDATE.DATE getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddElementsOutput2 .DEADLINEDISPLAYDATE.DATE }
         *     
         */
        public void setDATE(AddElementsOutput2 .DEADLINEDISPLAYDATE.DATE value) {
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
     *         &lt;element name="LIST_EXPIRATION_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="EXPIRE_DATE_GMT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_EXPIRE_DATE" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                             &lt;element name="CITY_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_ELIGIBILITY_CONDITION" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "listexpirationinfo"
    })
    public static class DEFPAYINFORMATION
        implements Serializable
    {

        @XmlElement(name = "LIST_EXPIRATION_INFO")
        protected List<AddElementsOutput2 .DEFPAYINFORMATION.LISTEXPIRATIONINFO> listexpirationinfo;

        /**
         * Gets the value of the listexpirationinfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listexpirationinfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTEXPIRATIONINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddElementsOutput2 .DEFPAYINFORMATION.LISTEXPIRATIONINFO }
         * 
         * 
         */
        public List<AddElementsOutput2 .DEFPAYINFORMATION.LISTEXPIRATIONINFO> getLISTEXPIRATIONINFO() {
            if (listexpirationinfo == null) {
                listexpirationinfo = new ArrayList<AddElementsOutput2 .DEFPAYINFORMATION.LISTEXPIRATIONINFO>();
            }
            return this.listexpirationinfo;
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
         *         &lt;element name="EXPIRE_DATE_GMT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="LIST_EXPIRE_DATE" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                   &lt;element name="CITY_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_ELIGIBILITY_CONDITION" maxOccurs="unbounded" minOccurs="0"&gt;
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
            "expiredategmt",
            "listexpiredate",
            "listeligibilitycondition"
        })
        public static class LISTEXPIRATIONINFO
            implements Serializable
        {

            @XmlElement(name = "EXPIRE_DATE_GMT")
            protected Object expiredategmt;
            @XmlElement(name = "LIST_EXPIRE_DATE")
            protected List<AddElementsOutput2 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTEXPIREDATE> listexpiredate;
            @XmlElement(name = "LIST_ELIGIBILITY_CONDITION")
            protected List<AddElementsOutput2 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTELIGIBILITYCONDITION> listeligibilitycondition;

            /**
             * Gets the value of the expiredategmt property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getEXPIREDATEGMT() {
                return expiredategmt;
            }

            /**
             * Sets the value of the expiredategmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setEXPIREDATEGMT(Object value) {
                this.expiredategmt = value;
            }

            /**
             * Gets the value of the listexpiredate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listexpiredate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTEXPIREDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AddElementsOutput2 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTEXPIREDATE }
             * 
             * 
             */
            public List<AddElementsOutput2 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTEXPIREDATE> getLISTEXPIREDATE() {
                if (listexpiredate == null) {
                    listexpiredate = new ArrayList<AddElementsOutput2 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTEXPIREDATE>();
                }
                return this.listexpiredate;
            }

            /**
             * Gets the value of the listeligibilitycondition property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listeligibilitycondition property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTELIGIBILITYCONDITION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AddElementsOutput2 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTELIGIBILITYCONDITION }
             * 
             * 
             */
            public List<AddElementsOutput2 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTELIGIBILITYCONDITION> getLISTELIGIBILITYCONDITION() {
                if (listeligibilitycondition == null) {
                    listeligibilitycondition = new ArrayList<AddElementsOutput2 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTELIGIBILITYCONDITION>();
                }
                return this.listeligibilitycondition;
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
            public static class LISTELIGIBILITYCONDITION
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
             *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *         &lt;element name="CITY_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
                "cityreference",
                "date"
            })
            public static class LISTEXPIREDATE
                implements Serializable
            {

                @XmlElement(name = "TYPE")
                protected Object type;
                @XmlElement(name = "CITY_REFERENCE", required = true)
                protected Object cityreference;
                @XmlElement(name = "DATE", required = true)
                protected Object date;

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

                /**
                 * Gets the value of the cityreference property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getCITYREFERENCE() {
                    return cityreference;
                }

                /**
                 * Sets the value of the cityreference property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setCITYREFERENCE(Object value) {
                    this.cityreference = value;
                }

                /**
                 * Gets the value of the date property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getDATE() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setDATE(Object value) {
                    this.date = value;
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
     *         &lt;element name="ELIGIBILITY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="IS_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_ELIGIBILITY_CONDITION" maxOccurs="unbounded" minOccurs="0"&gt;
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
        "listeligibilitycondition"
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
        @XmlElement(name = "LIST_ELIGIBILITY_CONDITION")
        protected List<AddElementsOutput2 .ELIGIBILITY.LISTELIGIBILITYCONDITION> listeligibilitycondition;

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
         * Gets the value of the listeligibilitycondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listeligibilitycondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTELIGIBILITYCONDITION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddElementsOutput2 .ELIGIBILITY.LISTELIGIBILITYCONDITION }
         * 
         * 
         */
        public List<AddElementsOutput2 .ELIGIBILITY.LISTELIGIBILITYCONDITION> getLISTELIGIBILITYCONDITION() {
            if (listeligibilitycondition == null) {
                listeligibilitycondition = new ArrayList<AddElementsOutput2 .ELIGIBILITY.LISTELIGIBILITYCONDITION>();
            }
            return this.listeligibilitycondition;
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
        public static class LISTELIGIBILITYCONDITION
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
     *         &lt;element name="FEE_ACCEPTANCE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IS_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "feeacceptance"
    })
    public static class FEEINFO
        implements Serializable
    {

        @XmlElement(name = "FEE_ACCEPTANCE")
        protected AddElementsOutput2 .FEEINFO.FEEACCEPTANCE feeacceptance;

        /**
         * Gets the value of the feeacceptance property.
         * 
         * @return
         *     possible object is
         *     {@link AddElementsOutput2 .FEEINFO.FEEACCEPTANCE }
         *     
         */
        public AddElementsOutput2 .FEEINFO.FEEACCEPTANCE getFEEACCEPTANCE() {
            return feeacceptance;
        }

        /**
         * Sets the value of the feeacceptance property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddElementsOutput2 .FEEINFO.FEEACCEPTANCE }
         *     
         */
        public void setFEEACCEPTANCE(AddElementsOutput2 .FEEINFO.FEEACCEPTANCE value) {
            this.feeacceptance = value;
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
         *         &lt;element name="IS_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
            "isrequired"
        })
        public static class FEEACCEPTANCE
            implements Serializable
        {

            @XmlElement(name = "IS_REQUIRED")
            protected boolean isrequired;

            /**
             * Gets the value of the isrequired property.
             * 
             */
            public boolean isISREQUIRED() {
                return isrequired;
            }

            /**
             * Sets the value of the isrequired property.
             * 
             */
            public void setISREQUIRED(boolean value) {
                this.isrequired = value;
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
     *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="LIST_PROVIDER" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NAME" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="LIST_BANK_FROM_PROVIDER" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                             &lt;element name="LIST_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "type",
        "listprovider"
    })
    public static class LISTBANK
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "LIST_PROVIDER", required = true)
        protected List<AddElementsOutput2 .LISTBANK.LISTPROVIDER> listprovider;

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
         * Gets the value of the listprovider property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listprovider property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPROVIDER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddElementsOutput2 .LISTBANK.LISTPROVIDER }
         * 
         * 
         */
        public List<AddElementsOutput2 .LISTBANK.LISTPROVIDER> getLISTPROVIDER() {
            if (listprovider == null) {
                listprovider = new ArrayList<AddElementsOutput2 .LISTBANK.LISTPROVIDER>();
            }
            return this.listprovider;
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
         *         &lt;element name="NAME" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="LIST_BANK_FROM_PROVIDER" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *                   &lt;element name="LIST_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "listbankfromprovider"
        })
        public static class LISTPROVIDER
            implements Serializable
        {

            @XmlElement(name = "NAME", required = true)
            protected String name;
            @XmlElement(name = "LIST_BANK_FROM_PROVIDER", required = true)
            protected List<AddElementsOutput2 .LISTBANK.LISTPROVIDER.LISTBANKFROMPROVIDER> listbankfromprovider;

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
             * Gets the value of the listbankfromprovider property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listbankfromprovider property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTBANKFROMPROVIDER().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AddElementsOutput2 .LISTBANK.LISTPROVIDER.LISTBANKFROMPROVIDER }
             * 
             * 
             */
            public List<AddElementsOutput2 .LISTBANK.LISTPROVIDER.LISTBANKFROMPROVIDER> getLISTBANKFROMPROVIDER() {
                if (listbankfromprovider == null) {
                    listbankfromprovider = new ArrayList<AddElementsOutput2 .LISTBANK.LISTPROVIDER.LISTBANKFROMPROVIDER>();
                }
                return this.listbankfromprovider;
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
             *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
             *         &lt;element name="LIST_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
                "listtype"
            })
            public static class LISTBANKFROMPROVIDER
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "NAME")
                protected String name;
                @XmlElement(name = "LIST_TYPE")
                protected String listtype;

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
                 * Gets the value of the listtype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLISTTYPE() {
                    return listtype;
                }

                /**
                 * Sets the value of the listtype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLISTTYPE(String value) {
                    this.listtype = value;
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
     *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="PROVIDER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_CC_TYPE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="IS_CVV_SUPPORTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="MAIN_CC_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "provider",
        "listcctype"
    })
    public static class LISTCC
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "PROVIDER")
        protected String provider;
        @XmlElement(name = "LIST_CC_TYPE", required = true)
        protected List<AddElementsOutput2 .LISTCC.LISTCCTYPE> listcctype;

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
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVIDER() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVIDER(String value) {
            this.provider = value;
        }

        /**
         * Gets the value of the listcctype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcctype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCCTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddElementsOutput2 .LISTCC.LISTCCTYPE }
         * 
         * 
         */
        public List<AddElementsOutput2 .LISTCC.LISTCCTYPE> getLISTCCTYPE() {
            if (listcctype == null) {
                listcctype = new ArrayList<AddElementsOutput2 .LISTCC.LISTCCTYPE>();
            }
            return this.listcctype;
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
         *         &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="IS_CVV_SUPPORTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="MAIN_CC_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "description",
            "iscvvsupported",
            "maincccode"
        })
        public static class LISTCCTYPE
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "DESCRIPTION")
            protected String description;
            @XmlElement(name = "IS_CVV_SUPPORTED")
            protected Boolean iscvvsupported;
            @XmlElement(name = "MAIN_CC_CODE")
            protected String maincccode;

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
             * Gets the value of the iscvvsupported property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISCVVSUPPORTED() {
                return iscvvsupported;
            }

            /**
             * Sets the value of the iscvvsupported property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISCVVSUPPORTED(Boolean value) {
                this.iscvvsupported = value;
            }

            /**
             * Gets the value of the maincccode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMAINCCCODE() {
                return maincccode;
            }

            /**
             * Sets the value of the maincccode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMAINCCCODE(String value) {
                this.maincccode = value;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{}TX_STATUS"/&gt;
     *         &lt;element name="TRANSACTION_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="ERROR_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="ERROR_TEXT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNAL_TRANSACTION_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNAL_ORDER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNAL_BILL_TO_PARTY_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="MOPS" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="TYPES" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="MOP_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="AIRLINE_FEE_LEVEL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                             &lt;element name="VALID_THRU" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "txstatus",
        "transactionid",
        "errornumber",
        "errortext",
        "externaltransactionid",
        "externalorderid",
        "externalbilltopartyid",
        "mops"
    })
    public static class LISTEXTPAYAVAILABLEMOPS
        implements Serializable
    {

        @XmlElement(name = "TX_STATUS", required = true)
        protected BigInteger txstatus;
        @XmlElement(name = "TRANSACTION_ID")
        protected Object transactionid;
        @XmlElement(name = "ERROR_NUMBER")
        protected Object errornumber;
        @XmlElement(name = "ERROR_TEXT")
        protected Object errortext;
        @XmlElement(name = "EXTERNAL_TRANSACTION_ID")
        protected Object externaltransactionid;
        @XmlElement(name = "EXTERNAL_ORDER_ID")
        protected Object externalorderid;
        @XmlElement(name = "EXTERNAL_BILL_TO_PARTY_ID")
        protected Object externalbilltopartyid;
        @XmlElement(name = "MOPS")
        protected List<AddElementsOutput2 .LISTEXTPAYAVAILABLEMOPS.MOPS> mops;

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
         * Gets the value of the transactionid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTRANSACTIONID() {
            return transactionid;
        }

        /**
         * Sets the value of the transactionid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTRANSACTIONID(Object value) {
            this.transactionid = value;
        }

        /**
         * Gets the value of the errornumber property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getERRORNUMBER() {
            return errornumber;
        }

        /**
         * Sets the value of the errornumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setERRORNUMBER(Object value) {
            this.errornumber = value;
        }

        /**
         * Gets the value of the errortext property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getERRORTEXT() {
            return errortext;
        }

        /**
         * Sets the value of the errortext property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setERRORTEXT(Object value) {
            this.errortext = value;
        }

        /**
         * Gets the value of the externaltransactionid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEXTERNALTRANSACTIONID() {
            return externaltransactionid;
        }

        /**
         * Sets the value of the externaltransactionid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEXTERNALTRANSACTIONID(Object value) {
            this.externaltransactionid = value;
        }

        /**
         * Gets the value of the externalorderid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEXTERNALORDERID() {
            return externalorderid;
        }

        /**
         * Sets the value of the externalorderid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEXTERNALORDERID(Object value) {
            this.externalorderid = value;
        }

        /**
         * Gets the value of the externalbilltopartyid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEXTERNALBILLTOPARTYID() {
            return externalbilltopartyid;
        }

        /**
         * Sets the value of the externalbilltopartyid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEXTERNALBILLTOPARTYID(Object value) {
            this.externalbilltopartyid = value;
        }

        /**
         * Gets the value of the mops property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mops property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMOPS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddElementsOutput2 .LISTEXTPAYAVAILABLEMOPS.MOPS }
         * 
         * 
         */
        public List<AddElementsOutput2 .LISTEXTPAYAVAILABLEMOPS.MOPS> getMOPS() {
            if (mops == null) {
                mops = new ArrayList<AddElementsOutput2 .LISTEXTPAYAVAILABLEMOPS.MOPS>();
            }
            return this.mops;
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
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="TYPES" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="MOP_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="AIRLINE_FEE_LEVEL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                   &lt;element name="VALID_THRU" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "types"
        })
        public static class MOPS
            implements Serializable
        {

            @XmlElement(name = "NAME", required = true)
            protected Object name;
            @XmlElement(name = "TYPES", required = true)
            protected List<AddElementsOutput2 .LISTEXTPAYAVAILABLEMOPS.MOPS.TYPES> types;

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

            /**
             * Gets the value of the types property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the types property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTYPES().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AddElementsOutput2 .LISTEXTPAYAVAILABLEMOPS.MOPS.TYPES }
             * 
             * 
             */
            public List<AddElementsOutput2 .LISTEXTPAYAVAILABLEMOPS.MOPS.TYPES> getTYPES() {
                if (types == null) {
                    types = new ArrayList<AddElementsOutput2 .LISTEXTPAYAVAILABLEMOPS.MOPS.TYPES>();
                }
                return this.types;
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
             *         &lt;element name="MOP_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="AIRLINE_FEE_LEVEL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *         &lt;element name="VALID_THRU" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
                "moptype",
                "airlinefeelevel",
                "validthru"
            })
            public static class TYPES
                implements Serializable
            {

                @XmlElement(name = "MOP_TYPE", required = true)
                protected Object moptype;
                @XmlElement(name = "AIRLINE_FEE_LEVEL")
                protected Object airlinefeelevel;
                @XmlElement(name = "VALID_THRU")
                protected Object validthru;

                /**
                 * Gets the value of the moptype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getMOPTYPE() {
                    return moptype;
                }

                /**
                 * Sets the value of the moptype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setMOPTYPE(Object value) {
                    this.moptype = value;
                }

                /**
                 * Gets the value of the airlinefeelevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAIRLINEFEELEVEL() {
                    return airlinefeelevel;
                }

                /**
                 * Sets the value of the airlinefeelevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAIRLINEFEELEVEL(Object value) {
                    this.airlinefeelevel = value;
                }

                /**
                 * Gets the value of the validthru property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getVALIDTHRU() {
                    return validthru;
                }

                /**
                 * Sets the value of the validthru property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setVALIDTHRU(Object value) {
                    this.validthru = value;
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
     *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="LIST_ACCOUNT_TYPE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_ACCOUNT_NUMBER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ACCOUNT_NUMBER"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
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
        "type",
        "listaccounttype",
        "listaccountnumber"
    })
    public static class LISTGOVERNMENTPAYMENT
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "LIST_ACCOUNT_TYPE")
        protected List<AddElementsOutput2 .LISTGOVERNMENTPAYMENT.LISTACCOUNTTYPE> listaccounttype;
        @XmlElement(name = "LIST_ACCOUNT_NUMBER")
        protected List<AddElementsOutput2 .LISTGOVERNMENTPAYMENT.LISTACCOUNTNUMBER> listaccountnumber;

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
         * Gets the value of the listaccounttype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listaccounttype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTACCOUNTTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddElementsOutput2 .LISTGOVERNMENTPAYMENT.LISTACCOUNTTYPE }
         * 
         * 
         */
        public List<AddElementsOutput2 .LISTGOVERNMENTPAYMENT.LISTACCOUNTTYPE> getLISTACCOUNTTYPE() {
            if (listaccounttype == null) {
                listaccounttype = new ArrayList<AddElementsOutput2 .LISTGOVERNMENTPAYMENT.LISTACCOUNTTYPE>();
            }
            return this.listaccounttype;
        }

        /**
         * Gets the value of the listaccountnumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listaccountnumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTACCOUNTNUMBER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddElementsOutput2 .LISTGOVERNMENTPAYMENT.LISTACCOUNTNUMBER }
         * 
         * 
         */
        public List<AddElementsOutput2 .LISTGOVERNMENTPAYMENT.LISTACCOUNTNUMBER> getLISTACCOUNTNUMBER() {
            if (listaccountnumber == null) {
                listaccountnumber = new ArrayList<AddElementsOutput2 .LISTGOVERNMENTPAYMENT.LISTACCOUNTNUMBER>();
            }
            return this.listaccountnumber;
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
         *         &lt;element name="ACCOUNT_NUMBER"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="10"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
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
            "accountnumber"
        })
        public static class LISTACCOUNTNUMBER
            implements Serializable
        {

            @XmlElement(name = "ACCOUNT_NUMBER", required = true)
            protected String accountnumber;

            /**
             * Gets the value of the accountnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTNUMBER() {
                return accountnumber;
            }

            /**
             * Sets the value of the accountnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTNUMBER(String value) {
                this.accountnumber = value;
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
         *         &lt;element name="CODE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "description"
        })
        public static class LISTACCOUNTTYPE
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "DESCRIPTION")
            protected String description;

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
     *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCY" type="{}currencyType"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
     *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
     *         &lt;element name="BOOL_IS_DEFAULT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="DISPLAY_ORDER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="EXTENSION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="GENERAL_CONDITION_URL" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
     *         &lt;element name="IS_ANNUAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="LIST_ADDRESS_TYPES" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ADDRESS_TYPE" type="{}unprotectedStringType"/&gt;
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
        "provider",
        "product",
        "plancostinfo",
        "listtravellerprice",
        "boolisdefault",
        "displayorder",
        "extensioncode",
        "generalconditionurl",
        "bdate",
        "edate",
        "isannual",
        "listaddresstypes"
    })
    public static class LISTINSURANCEPRICINGPERPRODUCT
        implements Serializable
    {

        @XmlElement(name = "PROVIDER", required = true)
        protected AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PROVIDER provider;
        @XmlElement(name = "PRODUCT", required = true)
        protected AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PRODUCT product;
        @XmlElement(name = "PLAN_COST_INFO")
        protected AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO plancostinfo;
        @XmlElement(name = "LIST_TRAVELLER_PRICE", required = true)
        protected List<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE> listtravellerprice;
        @XmlElement(name = "BOOL_IS_DEFAULT")
        protected Boolean boolisdefault;
        @XmlElement(name = "DISPLAY_ORDER")
        protected BigInteger displayorder;
        @XmlElement(name = "EXTENSION_CODE")
        protected String extensioncode;
        @XmlElement(name = "GENERAL_CONDITION_URL")
        protected String generalconditionurl;
        @XmlElement(name = "B_DATE")
        protected AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.BDATE bdate;
        @XmlElement(name = "E_DATE")
        protected AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.EDATE edate;
        @XmlElement(name = "IS_ANNUAL")
        protected Boolean isannual;
        @XmlElement(name = "LIST_ADDRESS_TYPES")
        protected List<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTADDRESSTYPES> listaddresstypes;

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PROVIDER }
         *     
         */
        public AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PROVIDER getPROVIDER() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PROVIDER }
         *     
         */
        public void setPROVIDER(AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PROVIDER value) {
            this.provider = value;
        }

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PRODUCT }
         *     
         */
        public AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PRODUCT getPRODUCT() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PRODUCT }
         *     
         */
        public void setPRODUCT(AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PRODUCT value) {
            this.product = value;
        }

        /**
         * Gets the value of the plancostinfo property.
         * 
         * @return
         *     possible object is
         *     {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO }
         *     
         */
        public AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO getPLANCOSTINFO() {
            return plancostinfo;
        }

        /**
         * Sets the value of the plancostinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO }
         *     
         */
        public void setPLANCOSTINFO(AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.PLANCOSTINFO value) {
            this.plancostinfo = value;
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
         * {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE }
         * 
         * 
         */
        public List<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE> getLISTTRAVELLERPRICE() {
            if (listtravellerprice == null) {
                listtravellerprice = new ArrayList<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE>();
            }
            return this.listtravellerprice;
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
         * Gets the value of the generalconditionurl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENERALCONDITIONURL() {
            return generalconditionurl;
        }

        /**
         * Sets the value of the generalconditionurl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENERALCONDITIONURL(String value) {
            this.generalconditionurl = value;
        }

        /**
         * Gets the value of the bdate property.
         * 
         * @return
         *     possible object is
         *     {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.BDATE }
         *     
         */
        public AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.BDATE getBDATE() {
            return bdate;
        }

        /**
         * Sets the value of the bdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.BDATE }
         *     
         */
        public void setBDATE(AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.BDATE value) {
            this.bdate = value;
        }

        /**
         * Gets the value of the edate property.
         * 
         * @return
         *     possible object is
         *     {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.EDATE }
         *     
         */
        public AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.EDATE getEDATE() {
            return edate;
        }

        /**
         * Sets the value of the edate property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.EDATE }
         *     
         */
        public void setEDATE(AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.EDATE value) {
            this.edate = value;
        }

        /**
         * Gets the value of the isannual property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISANNUAL() {
            return isannual;
        }

        /**
         * Sets the value of the isannual property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISANNUAL(Boolean value) {
            this.isannual = value;
        }

        /**
         * Gets the value of the listaddresstypes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listaddresstypes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTADDRESSTYPES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTADDRESSTYPES }
         * 
         * 
         */
        public List<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTADDRESSTYPES> getLISTADDRESSTYPES() {
            if (listaddresstypes == null) {
                listaddresstypes = new ArrayList<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTADDRESSTYPES>();
            }
            return this.listaddresstypes;
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
         *         &lt;element name="ADDRESS_TYPE" type="{}unprotectedStringType"/&gt;
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
            "addresstype"
        })
        public static class LISTADDRESSTYPES
            implements Serializable
        {

            @XmlElement(name = "ADDRESS_TYPE", required = true)
            protected String addresstype;

            /**
             * Gets the value of the addresstype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRESSTYPE() {
                return addresstype;
            }

            /**
             * Sets the value of the addresstype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRESSTYPE(String value) {
                this.addresstype = value;
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
         *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
            protected List<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTCOVEREDTRAVELLER> listcoveredtraveller;
            @XmlElement(name = "LIST_PRICE", required = true)
            protected List<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTPRICE> listprice;

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
             * {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTCOVEREDTRAVELLER }
             * 
             * 
             */
            public List<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTCOVEREDTRAVELLER> getLISTCOVEREDTRAVELLER() {
                if (listcoveredtraveller == null) {
                    listcoveredtraveller = new ArrayList<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTCOVEREDTRAVELLER>();
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
             * {@link AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTPRICE }
             * 
             * 
             */
            public List<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTPRICE> getLISTPRICE() {
                if (listprice == null) {
                    listprice = new ArrayList<AddElementsOutput2 .LISTINSURANCEPRICINGPERPRODUCT.LISTTRAVELLERPRICE.LISTPRICE>();
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
             *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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

                @XmlElement(name = "AMOUNT")
                protected float amount;
                @XmlElement(name = "CURRENCY", required = true)
                protected CurrencyType currency;

                /**
                 * Gets the value of the amount property.
                 * 
                 */
                public float getAMOUNT() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 */
                public void setAMOUNT(float value) {
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
         *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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

            @XmlElement(name = "TOTAL_AMOUNT")
            protected float totalamount;
            @XmlElement(name = "AMOUNT")
            protected Float amount;
            @XmlElement(name = "CURRENCY", required = true)
            protected CurrencyType currency;

            /**
             * Gets the value of the totalamount property.
             * 
             */
            public float getTOTALAMOUNT() {
                return totalamount;
            }

            /**
             * Sets the value of the totalamount property.
             * 
             */
            public void setTOTALAMOUNT(float value) {
                this.totalamount = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getAMOUNT() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setAMOUNT(Float value) {
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
     *       &lt;sequence&gt;
     *         &lt;element name="EXPIRE_DATE_GMT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_EXPIRE_DATE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="CITY_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_TTT_SOLUTION" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TTT_SOLUTION_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="TTT_SOLUTION_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="TTT_SOLUTION_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="TTT_SOLUTION_DAYS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="LIST_EXPIRE_DATE" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                             &lt;element name="CITY_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "expiredategmt",
        "listexpiredate",
        "listtttsolution"
    })
    public static class ONHOLDINFORMATION
        implements Serializable
    {

        @XmlElement(name = "EXPIRE_DATE_GMT")
        protected Object expiredategmt;
        @XmlElement(name = "LIST_EXPIRE_DATE")
        protected List<AddElementsOutput2 .ONHOLDINFORMATION.LISTEXPIREDATE> listexpiredate;
        @XmlElement(name = "LIST_TTT_SOLUTION")
        protected List<AddElementsOutput2 .ONHOLDINFORMATION.LISTTTTSOLUTION> listtttsolution;

        /**
         * Gets the value of the expiredategmt property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEXPIREDATEGMT() {
            return expiredategmt;
        }

        /**
         * Sets the value of the expiredategmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEXPIREDATEGMT(Object value) {
            this.expiredategmt = value;
        }

        /**
         * Gets the value of the listexpiredate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listexpiredate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTEXPIREDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddElementsOutput2 .ONHOLDINFORMATION.LISTEXPIREDATE }
         * 
         * 
         */
        public List<AddElementsOutput2 .ONHOLDINFORMATION.LISTEXPIREDATE> getLISTEXPIREDATE() {
            if (listexpiredate == null) {
                listexpiredate = new ArrayList<AddElementsOutput2 .ONHOLDINFORMATION.LISTEXPIREDATE>();
            }
            return this.listexpiredate;
        }

        /**
         * Gets the value of the listtttsolution property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtttsolution property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTTTSOLUTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddElementsOutput2 .ONHOLDINFORMATION.LISTTTTSOLUTION }
         * 
         * 
         */
        public List<AddElementsOutput2 .ONHOLDINFORMATION.LISTTTTSOLUTION> getLISTTTTSOLUTION() {
            if (listtttsolution == null) {
                listtttsolution = new ArrayList<AddElementsOutput2 .ONHOLDINFORMATION.LISTTTTSOLUTION>();
            }
            return this.listtttsolution;
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
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="CITY_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            "cityreference",
            "date"
        })
        public static class LISTEXPIREDATE
            implements Serializable
        {

            @XmlElement(name = "TYPE")
            protected Object type;
            @XmlElement(name = "CITY_REFERENCE", required = true)
            protected Object cityreference;
            @XmlElement(name = "DATE", required = true)
            protected Object date;

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

            /**
             * Gets the value of the cityreference property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCITYREFERENCE() {
                return cityreference;
            }

            /**
             * Sets the value of the cityreference property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCITYREFERENCE(Object value) {
                this.cityreference = value;
            }

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getDATE() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setDATE(Object value) {
                this.date = value;
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
         *         &lt;element name="TTT_SOLUTION_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="TTT_SOLUTION_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="TTT_SOLUTION_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="TTT_SOLUTION_DAYS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="LIST_EXPIRE_DATE" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *                   &lt;element name="CITY_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            "tttsolutionid",
            "tttsolutionamount",
            "tttsolutioncurrency",
            "tttsolutiondays",
            "listexpiredate"
        })
        public static class LISTTTTSOLUTION
            implements Serializable
        {

            @XmlElement(name = "TTT_SOLUTION_ID", required = true)
            protected Object tttsolutionid;
            @XmlElement(name = "TTT_SOLUTION_AMOUNT", required = true)
            protected Object tttsolutionamount;
            @XmlElement(name = "TTT_SOLUTION_CURRENCY", required = true)
            protected Object tttsolutioncurrency;
            @XmlElement(name = "TTT_SOLUTION_DAYS", required = true)
            protected Object tttsolutiondays;
            @XmlElement(name = "LIST_EXPIRE_DATE")
            protected List<AddElementsOutput2 .ONHOLDINFORMATION.LISTTTTSOLUTION.LISTEXPIREDATE> listexpiredate;

            /**
             * Gets the value of the tttsolutionid property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTTTSOLUTIONID() {
                return tttsolutionid;
            }

            /**
             * Sets the value of the tttsolutionid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTTTSOLUTIONID(Object value) {
                this.tttsolutionid = value;
            }

            /**
             * Gets the value of the tttsolutionamount property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTTTSOLUTIONAMOUNT() {
                return tttsolutionamount;
            }

            /**
             * Sets the value of the tttsolutionamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTTTSOLUTIONAMOUNT(Object value) {
                this.tttsolutionamount = value;
            }

            /**
             * Gets the value of the tttsolutioncurrency property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTTTSOLUTIONCURRENCY() {
                return tttsolutioncurrency;
            }

            /**
             * Sets the value of the tttsolutioncurrency property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTTTSOLUTIONCURRENCY(Object value) {
                this.tttsolutioncurrency = value;
            }

            /**
             * Gets the value of the tttsolutiondays property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTTTSOLUTIONDAYS() {
                return tttsolutiondays;
            }

            /**
             * Sets the value of the tttsolutiondays property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTTTSOLUTIONDAYS(Object value) {
                this.tttsolutiondays = value;
            }

            /**
             * Gets the value of the listexpiredate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listexpiredate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTEXPIREDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AddElementsOutput2 .ONHOLDINFORMATION.LISTTTTSOLUTION.LISTEXPIREDATE }
             * 
             * 
             */
            public List<AddElementsOutput2 .ONHOLDINFORMATION.LISTTTTSOLUTION.LISTEXPIREDATE> getLISTEXPIREDATE() {
                if (listexpiredate == null) {
                    listexpiredate = new ArrayList<AddElementsOutput2 .ONHOLDINFORMATION.LISTTTTSOLUTION.LISTEXPIREDATE>();
                }
                return this.listexpiredate;
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
             *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
             *         &lt;element name="CITY_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
                "cityreference",
                "date"
            })
            public static class LISTEXPIREDATE
                implements Serializable
            {

                @XmlElement(name = "TYPE")
                protected Object type;
                @XmlElement(name = "CITY_REFERENCE", required = true)
                protected Object cityreference;
                @XmlElement(name = "DATE", required = true)
                protected Object date;

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

                /**
                 * Gets the value of the cityreference property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getCITYREFERENCE() {
                    return cityreference;
                }

                /**
                 * Sets the value of the cityreference property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setCITYREFERENCE(Object value) {
                    this.cityreference = value;
                }

                /**
                 * Gets the value of the date property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getDATE() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setDATE(Object value) {
                    this.date = value;
                }

            }

        }

    }

}
