
package com.koreanair.eretail.pojo.pnr.displaytripplanoutput1;

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
import com.koreanair.eretail.pojo.common.common.APISMANAGEROUTPUTTYPE;
import com.koreanair.eretail.pojo.common.common.APISRULESTYPE;
import com.koreanair.eretail.pojo.common.common.LISTELEMENTSTATUS;
import com.koreanair.eretail.pojo.common.common.LISTMSG;
import com.koreanair.eretail.pojo.common.common.LISTRULEFRAMEWORKRESULT;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTFEEPRICEType;
import com.koreanair.eretail.pojo.payment.paymentoutput.PAYMENT;
import com.koreanair.eretail.pojo.profile.apisinformationoutput.LISTAPISCOUNTRIES;
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
 *         &lt;group ref="{}DisplayTripPlanGroup1"/&gt;
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
    "boolemptytripplan",
    "listmsg",
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
    "boolexpressmailavailable",
    "boolmopddavailable",
    "boolmopccavailable",
    "boolaccountrefavailable",
    "boolticketlessavailable",
    "boolmoppaylateravailable",
    "boolmopeclavailable",
    "listeclids",
    "deliverymailservicedescription",
    "deliverymailservicefee",
    "defaultofficeiddeliv",
    "defaultofficeidpickupat",
    "listprefrailclass",
    "listrailmop",
    "listrailmod",
    "listuseof",
    "listroomsmoking",
    "defaultroomsmokingcode",
    "listprefshortseat",
    "listpreffullseat",
    "defaulthotelcompanycode",
    "defaultadditionalinformation",
    "boolguarantee",
    "booldeposit",
    "listfeeprice",
    "booldisplaymog",
    "listapiscountries",
    "pageticket",
    "listruleframeworkresult",
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
@XmlRootElement(name = "DisplayTripPlanOutput1")
public class DisplayTripPlanOutput1
    implements Serializable
{

    @XmlElement(name = "TX_STATUS", required = true)
    protected BigInteger txstatus;
    @XmlElement(name = "BOOL_EMPTY_TRIP_PLAN")
    protected Boolean boolemptytripplan;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "LIST_TRAVELLER_TYPE_PRIMARY")
    protected List<DisplayTripPlanOutput1 .LISTTRAVELLERTYPEPRIMARY> listtravellertypeprimary;
    @XmlElement(name = "LIST_TRAVELLER_TYPE")
    protected List<DisplayTripPlanOutput1 .LISTTRAVELLERTYPE> listtravellertype;
    @XmlElement(name = "BOOL_NO_MOD")
    protected Boolean boolnomod;
    @XmlElement(name = "BOOL_QUEUING_FORMAT_OW")
    protected boolean boolqueuingformatow;
    @XmlElement(name = "BOOL_PICKUP_AC_TO_AVAILABLE")
    protected boolean boolpickupactoavailable;
    @XmlElement(name = "BOOL_DELIVER_TO_AVAILABLE")
    protected boolean booldelivertoavailable;
    @XmlElement(name = "BOOL_PICKUP_AIRPORT_AVAILABLE")
    protected boolean boolpickupairportavailable;
    @XmlElement(name = "BOOL_E_TICKET_AVAILABLE")
    protected boolean booleticketavailable;
    @XmlElement(name = "BOOL_HAND_AVAILABLE")
    protected boolean boolhandavailable;
    @XmlElement(name = "BOOL_PICKUP_AVAILABLE")
    protected boolean boolpickupavailable;
    @XmlElement(name = "BOOL_EXPRESS_MAIL_AVAILABLE")
    protected boolean boolexpressmailavailable;
    @XmlElement(name = "BOOL_MOP_DD_AVAILABLE")
    protected Boolean boolmopddavailable;
    @XmlElement(name = "BOOL_MOP_CC_AVAILABLE")
    protected Boolean boolmopccavailable;
    @XmlElement(name = "BOOL_ACCOUNT_REF_AVAILABLE")
    protected boolean boolaccountrefavailable;
    @XmlElement(name = "BOOL_TICKETLESS_AVAILABLE")
    protected boolean boolticketlessavailable;
    @XmlElement(name = "BOOL_MOP_PAYLATER_AVAILABLE")
    protected Boolean boolmoppaylateravailable;
    @XmlElement(name = "BOOL_MOP_ECL_AVAILABLE")
    protected Boolean boolmopeclavailable;
    @XmlElement(name = "LIST_ECL_IDS")
    protected List<DisplayTripPlanOutput1 .LISTECLIDS> listeclids;
    @XmlElement(name = "DELIVERY_MAIL_SERVICE_DESCRIPTION")
    protected String deliverymailservicedescription;
    @XmlElement(name = "DELIVERY_MAIL_SERVICE_FEE")
    protected String deliverymailservicefee;
    @XmlElement(name = "DEFAULT_OFFICE_ID_DELIV")
    protected String defaultofficeiddeliv;
    @XmlElement(name = "DEFAULT_OFFICE_ID_PICKUPAT")
    protected String defaultofficeidpickupat;
    @XmlElement(name = "LIST_PREF_RAIL_CLASS")
    protected List<DisplayTripPlanOutput1 .LISTPREFRAILCLASS> listprefrailclass;
    @XmlElement(name = "LIST_RAIL_MOP")
    protected List<DisplayTripPlanOutput1 .LISTRAILMOP> listrailmop;
    @XmlElement(name = "LIST_RAIL_MOD")
    protected List<DisplayTripPlanOutput1 .LISTRAILMOD> listrailmod;
    @XmlElement(name = "LIST_USE_OF")
    protected List<DisplayTripPlanOutput1 .LISTUSEOF> listuseof;
    @XmlElement(name = "LIST_ROOM_SMOKING")
    protected List<DisplayTripPlanOutput1 .LISTROOMSMOKING> listroomsmoking;
    @XmlElement(name = "DEFAULT_ROOM_SMOKING_CODE")
    protected String defaultroomsmokingcode;
    @XmlElement(name = "LIST_PREF_SHORT_SEAT")
    protected List<DisplayTripPlanOutput1 .LISTPREFSHORTSEAT> listprefshortseat;
    @XmlElement(name = "LIST_PREF_FULL_SEAT")
    protected List<DisplayTripPlanOutput1 .LISTPREFFULLSEAT> listpreffullseat;
    @XmlElement(name = "DEFAULT_HOTEL_COMPANY_CODE")
    protected String defaulthotelcompanycode;
    @XmlElement(name = "DEFAULT_ADDITIONAL_INFORMATION")
    protected String defaultadditionalinformation;
    @XmlElement(name = "BOOL_GUARANTEE")
    protected Boolean boolguarantee;
    @XmlElement(name = "BOOL_DEPOSIT")
    protected Boolean booldeposit;
    @XmlElement(name = "LIST_FEE_PRICE")
    protected List<LISTFEEPRICEType> listfeeprice;
    @XmlElement(name = "BOOL_DISPLAY_MOG")
    protected Boolean booldisplaymog;
    @XmlElement(name = "LIST_APIS_COUNTRIES")
    protected List<LISTAPISCOUNTRIES> listapiscountries;
    @XmlElement(name = "PAGE_TICKET", required = true)
    protected String pageticket;
    @XmlElement(name = "LIST_RULE_FRAMEWORK_RESULT")
    protected List<LISTRULEFRAMEWORKRESULT> listruleframeworkresult;
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
     * Gets the value of the boolemptytripplan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLEMPTYTRIPPLAN() {
        return boolemptytripplan;
    }

    /**
     * Sets the value of the boolemptytripplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLEMPTYTRIPPLAN(Boolean value) {
        this.boolemptytripplan = value;
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
     * {@link DisplayTripPlanOutput1 .LISTTRAVELLERTYPEPRIMARY }
     * 
     * 
     */
    public List<DisplayTripPlanOutput1 .LISTTRAVELLERTYPEPRIMARY> getLISTTRAVELLERTYPEPRIMARY() {
        if (listtravellertypeprimary == null) {
            listtravellertypeprimary = new ArrayList<DisplayTripPlanOutput1 .LISTTRAVELLERTYPEPRIMARY>();
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
     * {@link DisplayTripPlanOutput1 .LISTTRAVELLERTYPE }
     * 
     * 
     */
    public List<DisplayTripPlanOutput1 .LISTTRAVELLERTYPE> getLISTTRAVELLERTYPE() {
        if (listtravellertype == null) {
            listtravellertype = new ArrayList<DisplayTripPlanOutput1 .LISTTRAVELLERTYPE>();
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
     */
    public boolean isBOOLQUEUINGFORMATOW() {
        return boolqueuingformatow;
    }

    /**
     * Sets the value of the boolqueuingformatow property.
     * 
     */
    public void setBOOLQUEUINGFORMATOW(boolean value) {
        this.boolqueuingformatow = value;
    }

    /**
     * Gets the value of the boolpickupactoavailable property.
     * 
     */
    public boolean isBOOLPICKUPACTOAVAILABLE() {
        return boolpickupactoavailable;
    }

    /**
     * Sets the value of the boolpickupactoavailable property.
     * 
     */
    public void setBOOLPICKUPACTOAVAILABLE(boolean value) {
        this.boolpickupactoavailable = value;
    }

    /**
     * Gets the value of the booldelivertoavailable property.
     * 
     */
    public boolean isBOOLDELIVERTOAVAILABLE() {
        return booldelivertoavailable;
    }

    /**
     * Sets the value of the booldelivertoavailable property.
     * 
     */
    public void setBOOLDELIVERTOAVAILABLE(boolean value) {
        this.booldelivertoavailable = value;
    }

    /**
     * Gets the value of the boolpickupairportavailable property.
     * 
     */
    public boolean isBOOLPICKUPAIRPORTAVAILABLE() {
        return boolpickupairportavailable;
    }

    /**
     * Sets the value of the boolpickupairportavailable property.
     * 
     */
    public void setBOOLPICKUPAIRPORTAVAILABLE(boolean value) {
        this.boolpickupairportavailable = value;
    }

    /**
     * Gets the value of the booleticketavailable property.
     * 
     */
    public boolean isBOOLETICKETAVAILABLE() {
        return booleticketavailable;
    }

    /**
     * Sets the value of the booleticketavailable property.
     * 
     */
    public void setBOOLETICKETAVAILABLE(boolean value) {
        this.booleticketavailable = value;
    }

    /**
     * Gets the value of the boolhandavailable property.
     * 
     */
    public boolean isBOOLHANDAVAILABLE() {
        return boolhandavailable;
    }

    /**
     * Sets the value of the boolhandavailable property.
     * 
     */
    public void setBOOLHANDAVAILABLE(boolean value) {
        this.boolhandavailable = value;
    }

    /**
     * Gets the value of the boolpickupavailable property.
     * 
     */
    public boolean isBOOLPICKUPAVAILABLE() {
        return boolpickupavailable;
    }

    /**
     * Sets the value of the boolpickupavailable property.
     * 
     */
    public void setBOOLPICKUPAVAILABLE(boolean value) {
        this.boolpickupavailable = value;
    }

    /**
     * Gets the value of the boolexpressmailavailable property.
     * 
     */
    public boolean isBOOLEXPRESSMAILAVAILABLE() {
        return boolexpressmailavailable;
    }

    /**
     * Sets the value of the boolexpressmailavailable property.
     * 
     */
    public void setBOOLEXPRESSMAILAVAILABLE(boolean value) {
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
     * Gets the value of the boolaccountrefavailable property.
     * 
     */
    public boolean isBOOLACCOUNTREFAVAILABLE() {
        return boolaccountrefavailable;
    }

    /**
     * Sets the value of the boolaccountrefavailable property.
     * 
     */
    public void setBOOLACCOUNTREFAVAILABLE(boolean value) {
        this.boolaccountrefavailable = value;
    }

    /**
     * Gets the value of the boolticketlessavailable property.
     * 
     */
    public boolean isBOOLTICKETLESSAVAILABLE() {
        return boolticketlessavailable;
    }

    /**
     * Sets the value of the boolticketlessavailable property.
     * 
     */
    public void setBOOLTICKETLESSAVAILABLE(boolean value) {
        this.boolticketlessavailable = value;
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
     * {@link DisplayTripPlanOutput1 .LISTECLIDS }
     * 
     * 
     */
    public List<DisplayTripPlanOutput1 .LISTECLIDS> getLISTECLIDS() {
        if (listeclids == null) {
            listeclids = new ArrayList<DisplayTripPlanOutput1 .LISTECLIDS>();
        }
        return this.listeclids;
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
     *     {@link String }
     *     
     */
    public String getDEFAULTOFFICEIDDELIV() {
        return defaultofficeiddeliv;
    }

    /**
     * Sets the value of the defaultofficeiddeliv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTOFFICEIDDELIV(String value) {
        this.defaultofficeiddeliv = value;
    }

    /**
     * Gets the value of the defaultofficeidpickupat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFAULTOFFICEIDPICKUPAT() {
        return defaultofficeidpickupat;
    }

    /**
     * Sets the value of the defaultofficeidpickupat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFAULTOFFICEIDPICKUPAT(String value) {
        this.defaultofficeidpickupat = value;
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
     * {@link DisplayTripPlanOutput1 .LISTPREFRAILCLASS }
     * 
     * 
     */
    public List<DisplayTripPlanOutput1 .LISTPREFRAILCLASS> getLISTPREFRAILCLASS() {
        if (listprefrailclass == null) {
            listprefrailclass = new ArrayList<DisplayTripPlanOutput1 .LISTPREFRAILCLASS>();
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
     * {@link DisplayTripPlanOutput1 .LISTRAILMOP }
     * 
     * 
     */
    public List<DisplayTripPlanOutput1 .LISTRAILMOP> getLISTRAILMOP() {
        if (listrailmop == null) {
            listrailmop = new ArrayList<DisplayTripPlanOutput1 .LISTRAILMOP>();
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
     * {@link DisplayTripPlanOutput1 .LISTRAILMOD }
     * 
     * 
     */
    public List<DisplayTripPlanOutput1 .LISTRAILMOD> getLISTRAILMOD() {
        if (listrailmod == null) {
            listrailmod = new ArrayList<DisplayTripPlanOutput1 .LISTRAILMOD>();
        }
        return this.listrailmod;
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
     * {@link DisplayTripPlanOutput1 .LISTUSEOF }
     * 
     * 
     */
    public List<DisplayTripPlanOutput1 .LISTUSEOF> getLISTUSEOF() {
        if (listuseof == null) {
            listuseof = new ArrayList<DisplayTripPlanOutput1 .LISTUSEOF>();
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
     * {@link DisplayTripPlanOutput1 .LISTROOMSMOKING }
     * 
     * 
     */
    public List<DisplayTripPlanOutput1 .LISTROOMSMOKING> getLISTROOMSMOKING() {
        if (listroomsmoking == null) {
            listroomsmoking = new ArrayList<DisplayTripPlanOutput1 .LISTROOMSMOKING>();
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
     * {@link DisplayTripPlanOutput1 .LISTPREFSHORTSEAT }
     * 
     * 
     */
    public List<DisplayTripPlanOutput1 .LISTPREFSHORTSEAT> getLISTPREFSHORTSEAT() {
        if (listprefshortseat == null) {
            listprefshortseat = new ArrayList<DisplayTripPlanOutput1 .LISTPREFSHORTSEAT>();
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
     * {@link DisplayTripPlanOutput1 .LISTPREFFULLSEAT }
     * 
     * 
     */
    public List<DisplayTripPlanOutput1 .LISTPREFFULLSEAT> getLISTPREFFULLSEAT() {
        if (listpreffullseat == null) {
            listpreffullseat = new ArrayList<DisplayTripPlanOutput1 .LISTPREFFULLSEAT>();
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
    public static class LISTROOMSMOKING
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
     *         &lt;element name="IS_DATE_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "isdaterequired"
    })
    public static class LISTTRAVELLERTYPE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME", required = true)
        protected String name;
        @XmlElement(name = "IS_DATE_REQUIRED")
        protected boolean isdaterequired;

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
         * Gets the value of the isdaterequired property.
         * 
         */
        public boolean isISDATEREQUIRED() {
            return isdaterequired;
        }

        /**
         * Sets the value of the isdaterequired property.
         * 
         */
        public void setISDATEREQUIRED(boolean value) {
            this.isdaterequired = value;
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
     *         &lt;element name="IS_DATE_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "isdaterequired"
    })
    public static class LISTTRAVELLERTYPEPRIMARY
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME", required = true)
        protected String name;
        @XmlElement(name = "IS_DATE_REQUIRED")
        protected boolean isdaterequired;

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
         * Gets the value of the isdaterequired property.
         * 
         */
        public boolean isISDATEREQUIRED() {
            return isdaterequired;
        }

        /**
         * Sets the value of the isdaterequired property.
         * 
         */
        public void setISDATEREQUIRED(boolean value) {
            this.isdaterequired = value;
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
    public static class LISTUSEOF
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
