
package com.koreanair.eretail.pojo.pnr.addelementsoutput1;

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
import com.koreanair.eretail.pojo.common.common.LISTELEMENTSTATUS;
import com.koreanair.eretail.pojo.common.common.LISTMSG;
import com.koreanair.eretail.pojo.common.common.LISTRULEFRAMEWORKRESULT;
import com.koreanair.eretail.pojo.payment.paymentoutput.PAYMENT;
import com.koreanair.eretail.pojo.pnr.common.LISTBLUELANESTATUS;
import com.koreanair.eretail.pojo.pnr.common.LISTDIFFPRICE;
import com.koreanair.eretail.pojo.profile.apisinformationoutput.LISTAPISCOUNTRIES;
import com.koreanair.eretail.pojo.profile.commonout.LISTMAILSERVICE;
import com.koreanair.eretail.pojo.profile.commonout.LISTROOMSMOKING;
import com.koreanair.eretail.pojo.profile.commonout.LISTTRAVELLERTYPE;
import com.koreanair.eretail.pojo.profile.commonout.LISTTRAVELLERTYPEPRIMARY;
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
 *         &lt;group ref="{}AddElementsGroup1"/&gt;
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
    "listruleframeworkresult",
    "listelementstatus",
    "pageticket",
    "associatetraveller",
    "displayairoptions",
    "displaycaroptions",
    "displayhoteloptions",
    "displayrb",
    "isairelementbooked",
    "iswithoutmaintraveller",
    "listtraveller",
    "listtravellertypeprimary",
    "listtravellertype",
    "listroomsmoking",
    "defaultroomsmokingcode",
    "defaulthotelcompanycode",
    "listprefshortseat",
    "listpreffullseat",
    "bluelaneavailable",
    "listbluelanestatus",
    "listmailservice",
    "listdiffprice",
    "boolnomethodofguaranteesection",
    "listapiscountries",
    "deliverytypecode",
    "boolpickupairportavailable",
    "booleticketavailable",
    "boolptarestrictionroute",
    "booleticketbyemailavailable",
    "booleticketbyfaxavailable",
    "booleticketbymailavailable",
    "boolhandavailable",
    "boolpickupavailable",
    "boolexpressmailavailable",
    "listextpayavailablemops",
    "boolpromocodeavailable",
    "isconfirmationallowed",
    "defpayinformation",
    "eligibility",
    "deadlinedisplaydate",
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
@XmlRootElement(name = "AddElementsOutput1")
public class AddElementsOutput1
    implements Serializable
{

    @XmlElement(name = "TX_STATUS", required = true)
    protected BigInteger txstatus;
    @XmlElement(name = "EXTERNAL_LOGIN_STATUS")
    protected BigInteger externalloginstatus;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "LIST_RULE_FRAMEWORK_RESULT")
    protected List<LISTRULEFRAMEWORKRESULT> listruleframeworkresult;
    @XmlElement(name = "LIST_ELEMENT_STATUS")
    protected List<LISTELEMENTSTATUS> listelementstatus;
    @XmlElement(name = "PAGE_TICKET", required = true)
    protected String pageticket;
    @XmlElement(name = "ASSOCIATE_TRAVELLER")
    protected Boolean associatetraveller;
    @XmlElement(name = "DISPLAY_AIR_OPTIONS")
    protected Boolean displayairoptions;
    @XmlElement(name = "DISPLAY_CAR_OPTIONS")
    protected Boolean displaycaroptions;
    @XmlElement(name = "DISPLAY_HOTEL_OPTIONS")
    protected Boolean displayhoteloptions;
    @XmlElement(name = "DISPLAY_RB")
    protected Boolean displayrb;
    @XmlElement(name = "IS_AIR_ELEMENT_BOOKED")
    protected Boolean isairelementbooked;
    @XmlElement(name = "IS_WITHOUT_MAIN_TRAVELLER")
    protected Boolean iswithoutmaintraveller;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<AddElementsOutput1 .LISTTRAVELLER> listtraveller;
    @XmlElement(name = "LIST_TRAVELLER_TYPE_PRIMARY")
    protected List<LISTTRAVELLERTYPEPRIMARY> listtravellertypeprimary;
    @XmlElement(name = "LIST_TRAVELLER_TYPE")
    protected List<LISTTRAVELLERTYPE> listtravellertype;
    @XmlElement(name = "LIST_ROOM_SMOKING")
    protected List<LISTROOMSMOKING> listroomsmoking;
    @XmlElement(name = "DEFAULT_ROOM_SMOKING_CODE")
    protected String defaultroomsmokingcode;
    @XmlElement(name = "DEFAULT_HOTEL_COMPANY_CODE")
    protected String defaulthotelcompanycode;
    @XmlElement(name = "LIST_PREF_SHORT_SEAT")
    protected List<AddElementsOutput1 .LISTPREFSHORTSEAT> listprefshortseat;
    @XmlElement(name = "LIST_PREF_FULL_SEAT")
    protected List<AddElementsOutput1 .LISTPREFFULLSEAT> listpreffullseat;
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
    @XmlElement(name = "LIST_APIS_COUNTRIES")
    protected List<LISTAPISCOUNTRIES> listapiscountries;
    @XmlElement(name = "DELIVERY_TYPE_CODE")
    protected String deliverytypecode;
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
    @XmlElement(name = "LIST_EXTPAY_AVAILABLE_MOPS")
    protected List<AddElementsOutput1 .LISTEXTPAYAVAILABLEMOPS> listextpayavailablemops;
    @XmlElement(name = "BOOL_PROMO_CODE_AVAILABLE")
    protected Boolean boolpromocodeavailable;
    @XmlElement(name = "IS_CONFIRMATION_ALLOWED")
    protected Boolean isconfirmationallowed;
    @XmlElement(name = "DEF_PAY_INFORMATION")
    protected AddElementsOutput1 .DEFPAYINFORMATION defpayinformation;
    @XmlElement(name = "ELIGIBILITY")
    protected List<AddElementsOutput1 .ELIGIBILITY> eligibility;
    @XmlElement(name = "DEADLINE_DISPLAY_DATE")
    protected AddElementsOutput1 .DEADLINEDISPLAYDATE deadlinedisplaydate;
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
     * Gets the value of the listruleframeworkresult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listruleframeworkresult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRULEFRAMEWORKRESULT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTRULEFRAMEWORKRESULT }
     * 
     * 
     */
    public List<LISTRULEFRAMEWORKRESULT> getLISTRULEFRAMEWORKRESULT() {
        if (listruleframeworkresult == null) {
            listruleframeworkresult = new ArrayList<LISTRULEFRAMEWORKRESULT>();
        }
        return this.listruleframeworkresult;
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
     * Gets the value of the associatetraveller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isASSOCIATETRAVELLER() {
        return associatetraveller;
    }

    /**
     * Sets the value of the associatetraveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setASSOCIATETRAVELLER(Boolean value) {
        this.associatetraveller = value;
    }

    /**
     * Gets the value of the displayairoptions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISPLAYAIROPTIONS() {
        return displayairoptions;
    }

    /**
     * Sets the value of the displayairoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISPLAYAIROPTIONS(Boolean value) {
        this.displayairoptions = value;
    }

    /**
     * Gets the value of the displaycaroptions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISPLAYCAROPTIONS() {
        return displaycaroptions;
    }

    /**
     * Sets the value of the displaycaroptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISPLAYCAROPTIONS(Boolean value) {
        this.displaycaroptions = value;
    }

    /**
     * Gets the value of the displayhoteloptions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISPLAYHOTELOPTIONS() {
        return displayhoteloptions;
    }

    /**
     * Sets the value of the displayhoteloptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISPLAYHOTELOPTIONS(Boolean value) {
        this.displayhoteloptions = value;
    }

    /**
     * Gets the value of the displayrb property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISPLAYRB() {
        return displayrb;
    }

    /**
     * Sets the value of the displayrb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISPLAYRB(Boolean value) {
        this.displayrb = value;
    }

    /**
     * Gets the value of the isairelementbooked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISAIRELEMENTBOOKED() {
        return isairelementbooked;
    }

    /**
     * Sets the value of the isairelementbooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISAIRELEMENTBOOKED(Boolean value) {
        this.isairelementbooked = value;
    }

    /**
     * Gets the value of the iswithoutmaintraveller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISWITHOUTMAINTRAVELLER() {
        return iswithoutmaintraveller;
    }

    /**
     * Sets the value of the iswithoutmaintraveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISWITHOUTMAINTRAVELLER(Boolean value) {
        this.iswithoutmaintraveller = value;
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
     * {@link AddElementsOutput1 .LISTTRAVELLER }
     * 
     * 
     */
    public List<AddElementsOutput1 .LISTTRAVELLER> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<AddElementsOutput1 .LISTTRAVELLER>();
        }
        return this.listtraveller;
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
     * {@link AddElementsOutput1 .LISTPREFSHORTSEAT }
     * 
     * 
     */
    public List<AddElementsOutput1 .LISTPREFSHORTSEAT> getLISTPREFSHORTSEAT() {
        if (listprefshortseat == null) {
            listprefshortseat = new ArrayList<AddElementsOutput1 .LISTPREFSHORTSEAT>();
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
     * {@link AddElementsOutput1 .LISTPREFFULLSEAT }
     * 
     * 
     */
    public List<AddElementsOutput1 .LISTPREFFULLSEAT> getLISTPREFFULLSEAT() {
        if (listpreffullseat == null) {
            listpreffullseat = new ArrayList<AddElementsOutput1 .LISTPREFFULLSEAT>();
        }
        return this.listpreffullseat;
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
     * {@link AddElementsOutput1 .LISTEXTPAYAVAILABLEMOPS }
     * 
     * 
     */
    public List<AddElementsOutput1 .LISTEXTPAYAVAILABLEMOPS> getLISTEXTPAYAVAILABLEMOPS() {
        if (listextpayavailablemops == null) {
            listextpayavailablemops = new ArrayList<AddElementsOutput1 .LISTEXTPAYAVAILABLEMOPS>();
        }
        return this.listextpayavailablemops;
    }

    /**
     * Gets the value of the boolpromocodeavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLPROMOCODEAVAILABLE() {
        return boolpromocodeavailable;
    }

    /**
     * Sets the value of the boolpromocodeavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLPROMOCODEAVAILABLE(Boolean value) {
        this.boolpromocodeavailable = value;
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
     * Gets the value of the defpayinformation property.
     * 
     * @return
     *     possible object is
     *     {@link AddElementsOutput1 .DEFPAYINFORMATION }
     *     
     */
    public AddElementsOutput1 .DEFPAYINFORMATION getDEFPAYINFORMATION() {
        return defpayinformation;
    }

    /**
     * Sets the value of the defpayinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddElementsOutput1 .DEFPAYINFORMATION }
     *     
     */
    public void setDEFPAYINFORMATION(AddElementsOutput1 .DEFPAYINFORMATION value) {
        this.defpayinformation = value;
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
     * {@link AddElementsOutput1 .ELIGIBILITY }
     * 
     * 
     */
    public List<AddElementsOutput1 .ELIGIBILITY> getELIGIBILITY() {
        if (eligibility == null) {
            eligibility = new ArrayList<AddElementsOutput1 .ELIGIBILITY>();
        }
        return this.eligibility;
    }

    /**
     * Gets the value of the deadlinedisplaydate property.
     * 
     * @return
     *     possible object is
     *     {@link AddElementsOutput1 .DEADLINEDISPLAYDATE }
     *     
     */
    public AddElementsOutput1 .DEADLINEDISPLAYDATE getDEADLINEDISPLAYDATE() {
        return deadlinedisplaydate;
    }

    /**
     * Sets the value of the deadlinedisplaydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddElementsOutput1 .DEADLINEDISPLAYDATE }
     *     
     */
    public void setDEADLINEDISPLAYDATE(AddElementsOutput1 .DEADLINEDISPLAYDATE value) {
        this.deadlinedisplaydate = value;
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
        protected AddElementsOutput1 .DEADLINEDISPLAYDATE.DATE date;
        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "BOOL_INFORMATIVE_DATA")
        protected Boolean boolinformativedata;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link AddElementsOutput1 .DEADLINEDISPLAYDATE.DATE }
         *     
         */
        public AddElementsOutput1 .DEADLINEDISPLAYDATE.DATE getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddElementsOutput1 .DEADLINEDISPLAYDATE.DATE }
         *     
         */
        public void setDATE(AddElementsOutput1 .DEADLINEDISPLAYDATE.DATE value) {
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
        protected List<AddElementsOutput1 .DEFPAYINFORMATION.LISTEXPIRATIONINFO> listexpirationinfo;

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
         * {@link AddElementsOutput1 .DEFPAYINFORMATION.LISTEXPIRATIONINFO }
         * 
         * 
         */
        public List<AddElementsOutput1 .DEFPAYINFORMATION.LISTEXPIRATIONINFO> getLISTEXPIRATIONINFO() {
            if (listexpirationinfo == null) {
                listexpirationinfo = new ArrayList<AddElementsOutput1 .DEFPAYINFORMATION.LISTEXPIRATIONINFO>();
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
            protected List<AddElementsOutput1 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTEXPIREDATE> listexpiredate;
            @XmlElement(name = "LIST_ELIGIBILITY_CONDITION")
            protected List<AddElementsOutput1 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTELIGIBILITYCONDITION> listeligibilitycondition;

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
             * {@link AddElementsOutput1 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTEXPIREDATE }
             * 
             * 
             */
            public List<AddElementsOutput1 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTEXPIREDATE> getLISTEXPIREDATE() {
                if (listexpiredate == null) {
                    listexpiredate = new ArrayList<AddElementsOutput1 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTEXPIREDATE>();
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
             * {@link AddElementsOutput1 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTELIGIBILITYCONDITION }
             * 
             * 
             */
            public List<AddElementsOutput1 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTELIGIBILITYCONDITION> getLISTELIGIBILITYCONDITION() {
                if (listeligibilitycondition == null) {
                    listeligibilitycondition = new ArrayList<AddElementsOutput1 .DEFPAYINFORMATION.LISTEXPIRATIONINFO.LISTELIGIBILITYCONDITION>();
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
        protected List<AddElementsOutput1 .ELIGIBILITY.LISTELIGIBILITYCONDITION> listeligibilitycondition;

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
         * {@link AddElementsOutput1 .ELIGIBILITY.LISTELIGIBILITYCONDITION }
         * 
         * 
         */
        public List<AddElementsOutput1 .ELIGIBILITY.LISTELIGIBILITYCONDITION> getLISTELIGIBILITYCONDITION() {
            if (listeligibilitycondition == null) {
                listeligibilitycondition = new ArrayList<AddElementsOutput1 .ELIGIBILITY.LISTELIGIBILITYCONDITION>();
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
        protected List<AddElementsOutput1 .LISTEXTPAYAVAILABLEMOPS.MOPS> mops;

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
         * {@link AddElementsOutput1 .LISTEXTPAYAVAILABLEMOPS.MOPS }
         * 
         * 
         */
        public List<AddElementsOutput1 .LISTEXTPAYAVAILABLEMOPS.MOPS> getMOPS() {
            if (mops == null) {
                mops = new ArrayList<AddElementsOutput1 .LISTEXTPAYAVAILABLEMOPS.MOPS>();
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
            protected List<AddElementsOutput1 .LISTEXTPAYAVAILABLEMOPS.MOPS.TYPES> types;

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
             * {@link AddElementsOutput1 .LISTEXTPAYAVAILABLEMOPS.MOPS.TYPES }
             * 
             * 
             */
            public List<AddElementsOutput1 .LISTEXTPAYAVAILABLEMOPS.MOPS.TYPES> getTYPES() {
                if (types == null) {
                    types = new ArrayList<AddElementsOutput1 .LISTEXTPAYAVAILABLEMOPS.MOPS.TYPES>();
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "number"
    })
    public static class LISTPREFFULLSEAT
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME", required = true)
        protected String name;
        @XmlElement(name = "NUMBER", required = true)
        protected BigInteger number;

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
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNUMBER() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNUMBER(BigInteger value) {
            this.number = value;
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
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "number"
    })
    public static class LISTPREFSHORTSEAT
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME", required = true)
        protected String name;
        @XmlElement(name = "NUMBER", required = true)
        protected BigInteger number;

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
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNUMBER() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNUMBER(BigInteger value) {
            this.number = value;
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
     *         &lt;element name="DISPLAY_TRAVELLER" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="DISPLAY_NEW_TRAVELLER" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="TRAVELLER_SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="TRAVELLER_TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="HAS_INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="TRAVELLER_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "displaytraveller",
        "displaynewtraveller",
        "travellerid",
        "travellerselected",
        "travellertype",
        "hasinfant",
        "travellernumber"
    })
    public static class LISTTRAVELLER
        implements Serializable
    {

        @XmlElement(name = "DISPLAY_TRAVELLER")
        protected boolean displaytraveller;
        @XmlElement(name = "DISPLAY_NEW_TRAVELLER")
        protected boolean displaynewtraveller;
        @XmlElement(name = "TRAVELLER_ID")
        protected BigInteger travellerid;
        @XmlElement(name = "TRAVELLER_SELECTED")
        protected boolean travellerselected;
        @XmlElement(name = "TRAVELLER_TYPE")
        protected AddElementsOutput1 .LISTTRAVELLER.TRAVELLERTYPE travellertype;
        @XmlElement(name = "HAS_INFANT")
        protected boolean hasinfant;
        @XmlElement(name = "TRAVELLER_NUMBER", required = true)
        protected BigInteger travellernumber;

        /**
         * Gets the value of the displaytraveller property.
         * 
         */
        public boolean isDISPLAYTRAVELLER() {
            return displaytraveller;
        }

        /**
         * Sets the value of the displaytraveller property.
         * 
         */
        public void setDISPLAYTRAVELLER(boolean value) {
            this.displaytraveller = value;
        }

        /**
         * Gets the value of the displaynewtraveller property.
         * 
         */
        public boolean isDISPLAYNEWTRAVELLER() {
            return displaynewtraveller;
        }

        /**
         * Sets the value of the displaynewtraveller property.
         * 
         */
        public void setDISPLAYNEWTRAVELLER(boolean value) {
            this.displaynewtraveller = value;
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
         * Gets the value of the travellerselected property.
         * 
         */
        public boolean isTRAVELLERSELECTED() {
            return travellerselected;
        }

        /**
         * Sets the value of the travellerselected property.
         * 
         */
        public void setTRAVELLERSELECTED(boolean value) {
            this.travellerselected = value;
        }

        /**
         * Gets the value of the travellertype property.
         * 
         * @return
         *     possible object is
         *     {@link AddElementsOutput1 .LISTTRAVELLER.TRAVELLERTYPE }
         *     
         */
        public AddElementsOutput1 .LISTTRAVELLER.TRAVELLERTYPE getTRAVELLERTYPE() {
            return travellertype;
        }

        /**
         * Sets the value of the travellertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddElementsOutput1 .LISTTRAVELLER.TRAVELLERTYPE }
         *     
         */
        public void setTRAVELLERTYPE(AddElementsOutput1 .LISTTRAVELLER.TRAVELLERTYPE value) {
            this.travellertype = value;
        }

        /**
         * Gets the value of the hasinfant property.
         * 
         */
        public boolean isHASINFANT() {
            return hasinfant;
        }

        /**
         * Sets the value of the hasinfant property.
         * 
         */
        public void setHASINFANT(boolean value) {
            this.hasinfant = value;
        }

        /**
         * Gets the value of the travellernumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTRAVELLERNUMBER() {
            return travellernumber;
        }

        /**
         * Sets the value of the travellernumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTRAVELLERNUMBER(BigInteger value) {
            this.travellernumber = value;
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
        public static class TRAVELLERTYPE
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

}
