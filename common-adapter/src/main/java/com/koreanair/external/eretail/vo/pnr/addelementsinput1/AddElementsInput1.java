
package com.koreanair.external.eretail.vo.pnr.addelementsinput1;

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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.common.common.LISTTRAVELERSELECTIONtype;
import com.koreanair.external.eretail.vo.farecommon.farediscount.ListDiscountCredentialsType;
import com.koreanair.external.eretail.vo.farecommon.farediscount.ListResidentDiscountType;
import com.koreanair.external.eretail.vo.hotel.hotelinputgroup.ETRTYPE;
import com.koreanair.external.eretail.vo.hotel.hotelinputgroup.MODIFYGROUP;
import com.koreanair.external.eretail.vo.hotel.hotelinputgroup.MODIFYHOTEL;
import com.koreanair.external.eretail.vo.hotel.hotelinputgroup.REQUESTEDHOTELTYPE;
import com.koreanair.external.eretail.vo.hotel.hotelinputgroup.REQUESTEDROOMTYPE;
import com.koreanair.external.eretail.vo.pnr.airinput.AIR;
import com.koreanair.external.eretail.vo.pnr.carinput.CAR;
import com.koreanair.external.eretail.vo.pnr.common.CORPORATENUMBERType;
import com.koreanair.external.eretail.vo.pnr.common.PARAMETERIDType;
import com.koreanair.external.eretail.vo.pnr.commonproductselection.SelectInsurancePricingType;
import com.koreanair.external.eretail.vo.pnr.hotelinput.HOTEL;
import com.koreanair.external.eretail.vo.pnr.listelementtoadd.ListElementToAddType;
import com.koreanair.external.eretail.vo.pnr.miscinput.MISC;
import com.koreanair.external.eretail.vo.pnr.optionsinput.INPUTOPTIONSType;
import com.koreanair.external.eretail.vo.tripplan.command.COMMANDType;
import com.koreanair.external.eretail.vo.tripplan.common.common_air_pricing.ReasonType;
import com.koreanair.external.eretail.vo.tripplan.common.common_air_pricing.TicketType;
import com.koreanair.external.eretail.vo.tripplan.common.common_document.FAFHType;
import com.koreanair.external.eretail.vo.tripplan.common.common_document.FOType;
import com.koreanair.external.eretail.vo.tripplan.common.common_document.MiscPricingRecordType;
import com.koreanair.external.eretail.vo.tripplan.common.common_price.AMOUNTBREAKDOWN;
import com.koreanair.external.eretail.vo.tripplan.common.common_price.AMOUNTSINTEGERTYPE;
import com.koreanair.external.eretail.vo.tripplan.common.common_price.AMOUNTSTYPE;
import com.koreanair.external.eretail.vo.tripplan.contact.CONTACT;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.ETR;
import com.koreanair.external.eretail.vo.tripplan.loyalty_card.LOYALTYCARD;
import com.koreanair.external.eretail.vo.tripplan.payment_group.PAYMENTGROUPType;
import com.koreanair.external.eretail.vo.tripplan.pnr.FareRemarkType;
import com.koreanair.external.eretail.vo.tripplan.pnr.PNRType;
import com.koreanair.external.eretail.vo.tripplan.pnr.QUEUESMGDSTYPE;
import com.koreanair.external.eretail.vo.tripplan.pnr.TICKETINGELEMENTType;
import com.koreanair.external.eretail.vo.tripplan.pricing_options.PRICINGOPTIONSType;
import com.koreanair.external.eretail.vo.tripplan.psf.LISTPSFGROUP;
import com.koreanair.external.eretail.vo.tripplan.tr_elements.TR;
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
 *         &lt;element name="IS_STRUCTURED_XML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANSACTION_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="SITE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LANGUAGE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="PAGE_TICKET" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="NO_VALIDATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="REQUESTED_VALIDATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="KEEP_CONTEXT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;group ref="{}AirFareGroup" minOccurs="0"/&gt;
 *         &lt;element name="OVERRIDE_REASON" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_REASON" type="{}reasonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IS_PROPOSAL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;group ref="{}LoginInfoGroup" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELER_SELECTION" type="{}LIST_TRAVELER_SELECTIONtype" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_TYPE" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ELEMENT_TO_ADD" type="{}ListElementToAddType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}AIR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}CAR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}HOTEL" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}MISC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}ETR" minOccurs="0"/&gt;
 *         &lt;element ref="{}TR" minOccurs="0"/&gt;
 *         &lt;element ref="{}NUMBER_OF_PROFILES" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_INFORMATION" type="{}TRAVELLER_INFORMATION" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ELEMENTS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="PRICING_SOLUTION_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="TRAVELSHOPPER_TICKET" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_TICKET" type="{}ticketType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_REMARKS" type="{}FareRemarkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}ProductSelectionInput" minOccurs="0"/&gt;
 *         &lt;element name="PNR" type="{}PNR_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FO" type="{}FO_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MISC_PRICING_RECORD" type="{}miscPricingRecordType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FAFH" type="{}FAFH_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DISABLE_GETTRIPPLAN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;group ref="{}TravellerAssociationInput" minOccurs="0"/&gt;
 *         &lt;element ref="{}CLEAR_TRIP_PLAN" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonInputGroup"/&gt;
 *         &lt;element name="LIST_RESIDENT_DISCOUNT" type="{}listResidentDiscountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DISCOUNT_CREDENTIALS" type="{}listDiscountCredentialsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SKIP_INSURANCE_CALL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FROM_PAX" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FROM_APIS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}CONTACT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LOYALTY_CARD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="USER_CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="GDS_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="GDS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ADD_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element ref="{}PAYMENT_GROUP" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TICKETING_ELEMENT" type="{}TICKETING_ELEMENT_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PSF_GROUP" minOccurs="0"/&gt;
 *         &lt;element ref="{}RETRIEVE_PSF_CONFIG" minOccurs="0"/&gt;
 *         &lt;element name="IS_TRAVELLER_NAME_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FORCE_REFRESH" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RESTORE_TST_WHEN_REFRESH" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BASKET_MODE_FLOW" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="COMMAND" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}COMMANDType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="TIMESTAMP_ENABLED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;anyAttribute processContents='lax'/&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QUEUES_MGDS" type="{}QUEUES_MGDS_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OPTIONS" type="{}INPUT_OPTIONS_Type" minOccurs="0"/&gt;
 *         &lt;element name="DISPLAY_CARRY_OVER_STATUS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CAR_POWERED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_PAYMENT_SOLUTION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TASF" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}miscPricingRecordType"&gt;
 *                 &lt;attribute name="technicalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="USE_FOP_CATALOG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UPGRADE_SELECTION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SOLUTIONS" type="{}UPGRADE_SOLUTIONType" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="GLOBAL_CURRENCY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_PRICING_OPTIONS" type="{}PRICING_OPTIONS_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}MilesAndCashGroup" minOccurs="0"/&gt;
 *         &lt;element name="IS_SWITCH_REFERENCE_NAME" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "isstructuredxml",
    "transactionid",
    "site",
    "language",
    "pageticket",
    "novalidation",
    "requestedvalidation",
    "keepcontext",
    "typeoffare",
    "listfarereference",
    "fareid",
    "typeofbackupfare",
    "listfareparameter",
    "listfarebackupparameter",
    "listcorporatenumber",
    "backuplistcorporatenumber",
    "farecommandid",
    "backupfarecommandid",
    "forceptc",
    "overridereason",
    "isproposal",
    "directlogin",
    "externallogin",
    "externaldirectlogin",
    "listtravelerselection",
    "type",
    "listtype",
    "listelementtoadd",
    "air",
    "car",
    "hotel",
    "misc",
    "etr",
    "tr",
    "numberofprofiles",
    "travellerinformation",
    "listelements",
    "listticket",
    "listfareremarks",
    "row",
    "subrow",
    "carrequestid",
    "externalprovider",
    "listserviceparameter",
    "listselectedinsuranceproducts",
    "listnegohotel",
    "listhotel",
    "listroom",
    "listmodifyhotel",
    "listmodifygroup",
    "listoffersource",
    "listetrhotel",
    "pnr",
    "listfo",
    "listmiscpricingrecord",
    "listfafh",
    "disablegettripplan",
    "associatedtravellerfirstname",
    "associatedtravellerlastname",
    "travellerassociation",
    "cleartripplan",
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
    "listresidentdiscount",
    "listdiscountcredentials",
    "skipinsurancecall",
    "frompax",
    "fromapis",
    "contact",
    "loyaltycard",
    "usercurrency",
    "itemid",
    "gdsid",
    "gds",
    "linenumber",
    "addtype",
    "paymentgroup",
    "listticketingelement",
    "listpsfgroup",
    "retrievepsfconfig",
    "istravellernamechange",
    "forcerefresh",
    "restoretstwhenrefresh",
    "basketmodeflow",
    "command",
    "queuesmgds",
    "options",
    "displaycarryoverstatus",
    "carpowered",
    "ispaymentsolution",
    "listtasf",
    "usefopcatalog",
    "upgradeselection",
    "listpricingoptions",
    "milesandcashcost",
    "isswitchreferencename"
})
@XmlRootElement(name = "AddElementsInput1")
public class AddElementsInput1
    implements Serializable
{

    @XmlElement(name = "IS_STRUCTURED_XML")
    protected String isstructuredxml;
    @XmlElement(name = "TRANSACTION_ID", required = true)
    protected String transactionid;
    @XmlElement(name = "SITE", required = true)
    protected String site;
    @XmlElement(name = "LANGUAGE", required = true)
    protected String language;
    @XmlElement(name = "PAGE_TICKET", required = true)
    protected String pageticket;
    @XmlElement(name = "NO_VALIDATION")
    protected Object novalidation;
    @XmlElement(name = "REQUESTED_VALIDATION")
    protected Object requestedvalidation;
    @XmlElement(name = "KEEP_CONTEXT")
    protected Boolean keepcontext;
    @XmlElement(name = "TYPE_OF_FARE")
    protected String typeoffare;
    @XmlElement(name = "LIST_FARE_REFERENCE")
    protected List<AddElementsInput1 .LISTFAREREFERENCE> listfarereference;
    @XmlElement(name = "FARE_ID")
    protected BigInteger fareid;
    @XmlElement(name = "TYPE_OF_BACKUP_FARE")
    protected String typeofbackupfare;
    @XmlElement(name = "LIST_FARE_PARAMETER")
    protected List<PARAMETERIDType> listfareparameter;
    @XmlElement(name = "LIST_FARE_BACKUP_PARAMETER")
    protected List<PARAMETERIDType> listfarebackupparameter;
    @XmlElement(name = "LIST_CORPORATE_NUMBER")
    protected List<CORPORATENUMBERType> listcorporatenumber;
    @XmlElement(name = "BACKUP_LIST_CORPORATE_NUMBER")
    protected List<CORPORATENUMBERType> backuplistcorporatenumber;
    @XmlElement(name = "FARE_COMMAND_ID")
    protected String farecommandid;
    @XmlElement(name = "BACKUP_FARE_COMMAND_ID")
    protected String backupfarecommandid;
    @XmlElement(name = "FORCE_PTC")
    protected Boolean forceptc;
    @XmlElement(name = "OVERRIDE_REASON")
    protected AddElementsInput1 .OVERRIDEREASON overridereason;
    @XmlElement(name = "IS_PROPOSAL")
    protected Object isproposal;
    @XmlElement(name = "DIRECT_LOGIN")
    protected String directlogin;
    @XmlElement(name = "EXTERNAL_LOGIN")
    protected String externallogin;
    @XmlElement(name = "EXTERNAL_DIRECT_LOGIN")
    protected String externaldirectlogin;
    @XmlElement(name = "LIST_TRAVELER_SELECTION")
    protected LISTTRAVELERSELECTIONtype listtravelerselection;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "LIST_TYPE")
    protected List<String> listtype;
    @XmlElement(name = "LIST_ELEMENT_TO_ADD")
    protected List<ListElementToAddType> listelementtoadd;
    @XmlElement(name = "AIR")
    protected List<AIR> air;
    @XmlElement(name = "CAR")
    protected List<CAR> car;
    @XmlElement(name = "HOTEL")
    protected List<HOTEL> hotel;
    @XmlElement(name = "MISC")
    protected List<MISC> misc;
    @XmlElement(name = "ETR")
    protected ETR etr;
    @XmlElement(name = "TR")
    protected TR tr;
    @XmlElement(name = "NUMBER_OF_PROFILES")
    protected BigInteger numberofprofiles;
    @XmlElement(name = "TRAVELLER_INFORMATION")
    protected List<TRAVELLERINFORMATION> travellerinformation;
    @XmlElement(name = "LIST_ELEMENTS")
    protected List<AddElementsInput1 .LISTELEMENTS> listelements;
    @XmlElement(name = "LIST_TICKET")
    protected List<TicketType> listticket;
    @XmlElement(name = "LIST_FARE_REMARKS")
    protected List<FareRemarkType> listfareremarks;
    @XmlElement(name = "ROW")
    protected BigInteger row;
    @XmlElement(name = "SUB_ROW")
    protected BigInteger subrow;
    @XmlElement(name = "CAR_REQUEST_ID")
    protected BigInteger carrequestid;
    @XmlElement(name = "EXTERNAL_PROVIDER")
    protected String externalprovider;
    @XmlElement(name = "LIST_SERVICE_PARAMETER")
    protected List<AddElementsInput1 .LISTSERVICEPARAMETER> listserviceparameter;
    @XmlElement(name = "LIST_SELECTED_INSURANCE_PRODUCTS")
    protected List<SelectInsurancePricingType> listselectedinsuranceproducts;
    @XmlElement(name = "LIST_NEGO_HOTEL")
    protected List<REQUESTEDHOTELTYPE> listnegohotel;
    @XmlElement(name = "LIST_HOTEL")
    protected List<REQUESTEDHOTELTYPE> listhotel;
    @XmlElement(name = "LIST_ROOM")
    protected List<REQUESTEDROOMTYPE> listroom;
    @XmlElement(name = "LIST_MODIFY_HOTEL")
    protected List<MODIFYHOTEL> listmodifyhotel;
    @XmlElement(name = "LIST_MODIFY_GROUP")
    protected List<MODIFYGROUP> listmodifygroup;
    @XmlElement(name = "LIST_OFFER_SOURCE")
    protected List<AddElementsInput1 .LISTOFFERSOURCE> listoffersource;
    @XmlElement(name = "LIST_ETR_HOTEL")
    protected List<ETRTYPE> listetrhotel;
    @XmlElement(name = "PNR")
    protected List<PNRType> pnr;
    @XmlElement(name = "LIST_FO")
    protected List<FOType> listfo;
    @XmlElement(name = "LIST_MISC_PRICING_RECORD")
    protected List<MiscPricingRecordType> listmiscpricingrecord;
    @XmlElement(name = "LIST_FAFH")
    protected List<FAFHType> listfafh;
    @XmlElement(name = "DISABLE_GETTRIPPLAN")
    protected Boolean disablegettripplan;
    @XmlElement(name = "ASSOCIATED_TRAVELLER_FIRST_NAME")
    protected String associatedtravellerfirstname;
    @XmlElement(name = "ASSOCIATED_TRAVELLER_LAST_NAME")
    protected String associatedtravellerlastname;
    @XmlElement(name = "TRAVELLER_ASSOCIATION")
    protected List<AddElementsInput1 .TRAVELLERASSOCIATION> travellerassociation;
    @XmlElement(name = "CLEAR_TRIP_PLAN")
    protected Boolean cleartripplan;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<String> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "REQUEST_INFO")
    protected AddElementsInput1 .REQUESTINFO requestinfo;
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
    protected List<AddElementsInput1 .APISCHECKSTRUCTUREPASSENGER> apischeckstructurepassenger;
    @XmlElement(name = "LIST_RESIDENT_DISCOUNT")
    protected List<ListResidentDiscountType> listresidentdiscount;
    @XmlElement(name = "LIST_DISCOUNT_CREDENTIALS")
    protected List<ListDiscountCredentialsType> listdiscountcredentials;
    @XmlElement(name = "SKIP_INSURANCE_CALL")
    protected Boolean skipinsurancecall;
    @XmlElement(name = "FROM_PAX")
    protected Boolean frompax;
    @XmlElement(name = "FROM_APIS")
    protected Boolean fromapis;
    @XmlElement(name = "CONTACT")
    protected List<CONTACT> contact;
    @XmlElement(name = "LOYALTY_CARD")
    protected List<LOYALTYCARD> loyaltycard;
    @XmlElement(name = "USER_CURRENCY")
    protected Object usercurrency;
    @XmlElement(name = "ITEM_ID")
    protected BigInteger itemid;
    @XmlElement(name = "GDS_ID")
    protected String gdsid;
    @XmlElement(name = "GDS")
    protected String gds;
    @XmlElement(name = "LINE_NUMBER")
    protected BigInteger linenumber;
    @XmlElement(name = "ADD_TYPE")
    protected String addtype;
    @XmlElement(name = "PAYMENT_GROUP")
    protected List<PAYMENTGROUPType> paymentgroup;
    @XmlElement(name = "LIST_TICKETING_ELEMENT")
    protected List<TICKETINGELEMENTType> listticketingelement;
    @XmlElement(name = "LIST_PSF_GROUP")
    protected LISTPSFGROUP listpsfgroup;
    @XmlElement(name = "RETRIEVE_PSF_CONFIG")
    protected Boolean retrievepsfconfig;
    @XmlElement(name = "IS_TRAVELLER_NAME_CHANGE")
    protected Boolean istravellernamechange;
    @XmlElement(name = "FORCE_REFRESH")
    protected Boolean forcerefresh;
    @XmlElement(name = "RESTORE_TST_WHEN_REFRESH")
    protected Boolean restoretstwhenrefresh;
    @XmlElement(name = "BASKET_MODE_FLOW")
    protected Boolean basketmodeflow;
    @XmlElement(name = "COMMAND")
    protected AddElementsInput1 .COMMAND command;
    @XmlElement(name = "QUEUES_MGDS")
    protected List<QUEUESMGDSTYPE> queuesmgds;
    @XmlElement(name = "OPTIONS")
    protected INPUTOPTIONSType options;
    @XmlElement(name = "DISPLAY_CARRY_OVER_STATUS")
    protected Boolean displaycarryoverstatus;
    @XmlElement(name = "CAR_POWERED")
    protected Boolean carpowered;
    @XmlElement(name = "IS_PAYMENT_SOLUTION")
    protected Boolean ispaymentsolution;
    @XmlElement(name = "LIST_TASF")
    protected List<AddElementsInput1 .LISTTASF> listtasf;
    @XmlElement(name = "USE_FOP_CATALOG")
    protected Boolean usefopcatalog;
    @XmlElement(name = "UPGRADE_SELECTION")
    protected AddElementsInput1 .UPGRADESELECTION upgradeselection;
    @XmlElement(name = "LIST_PRICING_OPTIONS")
    protected List<PRICINGOPTIONSType> listpricingoptions;
    @XmlElement(name = "MILES_AND_CASH_COST")
    protected AddElementsInput1 .MILESANDCASHCOST milesandcashcost;
    @XmlElement(name = "IS_SWITCH_REFERENCE_NAME")
    protected Boolean isswitchreferencename;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the novalidation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNOVALIDATION() {
        return novalidation;
    }

    /**
     * Sets the value of the novalidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNOVALIDATION(Object value) {
        this.novalidation = value;
    }

    /**
     * Gets the value of the requestedvalidation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREQUESTEDVALIDATION() {
        return requestedvalidation;
    }

    /**
     * Sets the value of the requestedvalidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREQUESTEDVALIDATION(Object value) {
        this.requestedvalidation = value;
    }

    /**
     * Gets the value of the keepcontext property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKEEPCONTEXT() {
        return keepcontext;
    }

    /**
     * Sets the value of the keepcontext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKEEPCONTEXT(Boolean value) {
        this.keepcontext = value;
    }

    /**
     * Gets the value of the typeoffare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEOFFARE() {
        return typeoffare;
    }

    /**
     * Sets the value of the typeoffare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEOFFARE(String value) {
        this.typeoffare = value;
    }

    /**
     * Gets the value of the listfarereference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarereference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREREFERENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddElementsInput1 .LISTFAREREFERENCE }
     * 
     * 
     */
    public List<AddElementsInput1 .LISTFAREREFERENCE> getLISTFAREREFERENCE() {
        if (listfarereference == null) {
            listfarereference = new ArrayList<AddElementsInput1 .LISTFAREREFERENCE>();
        }
        return this.listfarereference;
    }

    /**
     * Gets the value of the fareid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFAREID() {
        return fareid;
    }

    /**
     * Sets the value of the fareid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFAREID(BigInteger value) {
        this.fareid = value;
    }

    /**
     * Gets the value of the typeofbackupfare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEOFBACKUPFARE() {
        return typeofbackupfare;
    }

    /**
     * Sets the value of the typeofbackupfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEOFBACKUPFARE(String value) {
        this.typeofbackupfare = value;
    }

    /**
     * Gets the value of the listfareparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAMETERIDType }
     * 
     * 
     */
    public List<PARAMETERIDType> getLISTFAREPARAMETER() {
        if (listfareparameter == null) {
            listfareparameter = new ArrayList<PARAMETERIDType>();
        }
        return this.listfareparameter;
    }

    /**
     * Gets the value of the listfarebackupparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarebackupparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREBACKUPPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAMETERIDType }
     * 
     * 
     */
    public List<PARAMETERIDType> getLISTFAREBACKUPPARAMETER() {
        if (listfarebackupparameter == null) {
            listfarebackupparameter = new ArrayList<PARAMETERIDType>();
        }
        return this.listfarebackupparameter;
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
     * {@link CORPORATENUMBERType }
     * 
     * 
     */
    public List<CORPORATENUMBERType> getLISTCORPORATENUMBER() {
        if (listcorporatenumber == null) {
            listcorporatenumber = new ArrayList<CORPORATENUMBERType>();
        }
        return this.listcorporatenumber;
    }

    /**
     * Gets the value of the backuplistcorporatenumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backuplistcorporatenumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBACKUPLISTCORPORATENUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CORPORATENUMBERType }
     * 
     * 
     */
    public List<CORPORATENUMBERType> getBACKUPLISTCORPORATENUMBER() {
        if (backuplistcorporatenumber == null) {
            backuplistcorporatenumber = new ArrayList<CORPORATENUMBERType>();
        }
        return this.backuplistcorporatenumber;
    }

    /**
     * Gets the value of the farecommandid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECOMMANDID() {
        return farecommandid;
    }

    /**
     * Sets the value of the farecommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECOMMANDID(String value) {
        this.farecommandid = value;
    }

    /**
     * Gets the value of the backupfarecommandid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACKUPFARECOMMANDID() {
        return backupfarecommandid;
    }

    /**
     * Sets the value of the backupfarecommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACKUPFARECOMMANDID(String value) {
        this.backupfarecommandid = value;
    }

    /**
     * Gets the value of the forceptc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFORCEPTC() {
        return forceptc;
    }

    /**
     * Sets the value of the forceptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFORCEPTC(Boolean value) {
        this.forceptc = value;
    }

    /**
     * Gets the value of the overridereason property.
     * 
     * @return
     *     possible object is
     *     {@link AddElementsInput1 .OVERRIDEREASON }
     *     
     */
    public AddElementsInput1 .OVERRIDEREASON getOVERRIDEREASON() {
        return overridereason;
    }

    /**
     * Sets the value of the overridereason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddElementsInput1 .OVERRIDEREASON }
     *     
     */
    public void setOVERRIDEREASON(AddElementsInput1 .OVERRIDEREASON value) {
        this.overridereason = value;
    }

    /**
     * Gets the value of the isproposal property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISPROPOSAL() {
        return isproposal;
    }

    /**
     * Sets the value of the isproposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISPROPOSAL(Object value) {
        this.isproposal = value;
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
     * Gets the value of the externallogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALLOGIN() {
        return externallogin;
    }

    /**
     * Sets the value of the externallogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALLOGIN(String value) {
        this.externallogin = value;
    }

    /**
     * Gets the value of the externaldirectlogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALDIRECTLOGIN() {
        return externaldirectlogin;
    }

    /**
     * Sets the value of the externaldirectlogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALDIRECTLOGIN(String value) {
        this.externaldirectlogin = value;
    }

    /**
     * Gets the value of the listtravelerselection property.
     * 
     * @return
     *     possible object is
     *     {@link LISTTRAVELERSELECTIONtype }
     *     
     */
    public LISTTRAVELERSELECTIONtype getLISTTRAVELERSELECTION() {
        return listtravelerselection;
    }

    /**
     * Sets the value of the listtravelerselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTTRAVELERSELECTIONtype }
     *     
     */
    public void setLISTTRAVELERSELECTION(LISTTRAVELERSELECTIONtype value) {
        this.listtravelerselection = value;
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
     * Gets the value of the listtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTTYPE() {
        if (listtype == null) {
            listtype = new ArrayList<String>();
        }
        return this.listtype;
    }

    /**
     * Gets the value of the listelementtoadd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelementtoadd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENTTOADD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListElementToAddType }
     * 
     * 
     */
    public List<ListElementToAddType> getLISTELEMENTTOADD() {
        if (listelementtoadd == null) {
            listelementtoadd = new ArrayList<ListElementToAddType>();
        }
        return this.listelementtoadd;
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
     * Gets the value of the listelements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddElementsInput1 .LISTELEMENTS }
     * 
     * 
     */
    public List<AddElementsInput1 .LISTELEMENTS> getLISTELEMENTS() {
        if (listelements == null) {
            listelements = new ArrayList<AddElementsInput1 .LISTELEMENTS>();
        }
        return this.listelements;
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
     * Gets the value of the listfareremarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareremarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREREMARKS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRemarkType }
     * 
     * 
     */
    public List<FareRemarkType> getLISTFAREREMARKS() {
        if (listfareremarks == null) {
            listfareremarks = new ArrayList<FareRemarkType>();
        }
        return this.listfareremarks;
    }

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getROW() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setROW(BigInteger value) {
        this.row = value;
    }

    /**
     * Gets the value of the subrow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSUBROW() {
        return subrow;
    }

    /**
     * Sets the value of the subrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSUBROW(BigInteger value) {
        this.subrow = value;
    }

    /**
     * Gets the value of the carrequestid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCARREQUESTID() {
        return carrequestid;
    }

    /**
     * Sets the value of the carrequestid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCARREQUESTID(BigInteger value) {
        this.carrequestid = value;
    }

    /**
     * Gets the value of the externalprovider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALPROVIDER() {
        return externalprovider;
    }

    /**
     * Sets the value of the externalprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALPROVIDER(String value) {
        this.externalprovider = value;
    }

    /**
     * Gets the value of the listserviceparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listserviceparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICEPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddElementsInput1 .LISTSERVICEPARAMETER }
     * 
     * 
     */
    public List<AddElementsInput1 .LISTSERVICEPARAMETER> getLISTSERVICEPARAMETER() {
        if (listserviceparameter == null) {
            listserviceparameter = new ArrayList<AddElementsInput1 .LISTSERVICEPARAMETER>();
        }
        return this.listserviceparameter;
    }

    /**
     * Gets the value of the listselectedinsuranceproducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listselectedinsuranceproducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSELECTEDINSURANCEPRODUCTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectInsurancePricingType }
     * 
     * 
     */
    public List<SelectInsurancePricingType> getLISTSELECTEDINSURANCEPRODUCTS() {
        if (listselectedinsuranceproducts == null) {
            listselectedinsuranceproducts = new ArrayList<SelectInsurancePricingType>();
        }
        return this.listselectedinsuranceproducts;
    }

    /**
     * Gets the value of the listnegohotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listnegohotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTNEGOHOTEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REQUESTEDHOTELTYPE }
     * 
     * 
     */
    public List<REQUESTEDHOTELTYPE> getLISTNEGOHOTEL() {
        if (listnegohotel == null) {
            listnegohotel = new ArrayList<REQUESTEDHOTELTYPE>();
        }
        return this.listnegohotel;
    }

    /**
     * Gets the value of the listhotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listhotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTHOTEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REQUESTEDHOTELTYPE }
     * 
     * 
     */
    public List<REQUESTEDHOTELTYPE> getLISTHOTEL() {
        if (listhotel == null) {
            listhotel = new ArrayList<REQUESTEDHOTELTYPE>();
        }
        return this.listhotel;
    }

    /**
     * Gets the value of the listroom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listroom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTROOM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REQUESTEDROOMTYPE }
     * 
     * 
     */
    public List<REQUESTEDROOMTYPE> getLISTROOM() {
        if (listroom == null) {
            listroom = new ArrayList<REQUESTEDROOMTYPE>();
        }
        return this.listroom;
    }

    /**
     * Gets the value of the listmodifyhotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmodifyhotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMODIFYHOTEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MODIFYHOTEL }
     * 
     * 
     */
    public List<MODIFYHOTEL> getLISTMODIFYHOTEL() {
        if (listmodifyhotel == null) {
            listmodifyhotel = new ArrayList<MODIFYHOTEL>();
        }
        return this.listmodifyhotel;
    }

    /**
     * Gets the value of the listmodifygroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmodifygroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMODIFYGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MODIFYGROUP }
     * 
     * 
     */
    public List<MODIFYGROUP> getLISTMODIFYGROUP() {
        if (listmodifygroup == null) {
            listmodifygroup = new ArrayList<MODIFYGROUP>();
        }
        return this.listmodifygroup;
    }

    /**
     * Gets the value of the listoffersource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listoffersource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOFFERSOURCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddElementsInput1 .LISTOFFERSOURCE }
     * 
     * 
     */
    public List<AddElementsInput1 .LISTOFFERSOURCE> getLISTOFFERSOURCE() {
        if (listoffersource == null) {
            listoffersource = new ArrayList<AddElementsInput1 .LISTOFFERSOURCE>();
        }
        return this.listoffersource;
    }

    /**
     * Gets the value of the listetrhotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listetrhotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTETRHOTEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETRTYPE }
     * 
     * 
     */
    public List<ETRTYPE> getLISTETRHOTEL() {
        if (listetrhotel == null) {
            listetrhotel = new ArrayList<ETRTYPE>();
        }
        return this.listetrhotel;
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
     * Gets the value of the listfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FOType }
     * 
     * 
     */
    public List<FOType> getLISTFO() {
        if (listfo == null) {
            listfo = new ArrayList<FOType>();
        }
        return this.listfo;
    }

    /**
     * Gets the value of the listmiscpricingrecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmiscpricingrecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMISCPRICINGRECORD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscPricingRecordType }
     * 
     * 
     */
    public List<MiscPricingRecordType> getLISTMISCPRICINGRECORD() {
        if (listmiscpricingrecord == null) {
            listmiscpricingrecord = new ArrayList<MiscPricingRecordType>();
        }
        return this.listmiscpricingrecord;
    }

    /**
     * Gets the value of the listfafh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfafh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAFH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FAFHType }
     * 
     * 
     */
    public List<FAFHType> getLISTFAFH() {
        if (listfafh == null) {
            listfafh = new ArrayList<FAFHType>();
        }
        return this.listfafh;
    }

    /**
     * Gets the value of the disablegettripplan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISABLEGETTRIPPLAN() {
        return disablegettripplan;
    }

    /**
     * Sets the value of the disablegettripplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISABLEGETTRIPPLAN(Boolean value) {
        this.disablegettripplan = value;
    }

    /**
     * Gets the value of the associatedtravellerfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSOCIATEDTRAVELLERFIRSTNAME() {
        return associatedtravellerfirstname;
    }

    /**
     * Sets the value of the associatedtravellerfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSOCIATEDTRAVELLERFIRSTNAME(String value) {
        this.associatedtravellerfirstname = value;
    }

    /**
     * Gets the value of the associatedtravellerlastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSOCIATEDTRAVELLERLASTNAME() {
        return associatedtravellerlastname;
    }

    /**
     * Sets the value of the associatedtravellerlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSOCIATEDTRAVELLERLASTNAME(String value) {
        this.associatedtravellerlastname = value;
    }

    /**
     * Gets the value of the travellerassociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerassociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRAVELLERASSOCIATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddElementsInput1 .TRAVELLERASSOCIATION }
     * 
     * 
     */
    public List<AddElementsInput1 .TRAVELLERASSOCIATION> getTRAVELLERASSOCIATION() {
        if (travellerassociation == null) {
            travellerassociation = new ArrayList<AddElementsInput1 .TRAVELLERASSOCIATION>();
        }
        return this.travellerassociation;
    }

    /**
     * Gets the value of the cleartripplan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCLEARTRIPPLAN() {
        return cleartripplan;
    }

    /**
     * Sets the value of the cleartripplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCLEARTRIPPLAN(Boolean value) {
        this.cleartripplan = value;
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
     *     {@link AddElementsInput1 .REQUESTINFO }
     *     
     */
    public AddElementsInput1 .REQUESTINFO getREQUESTINFO() {
        return requestinfo;
    }

    /**
     * Sets the value of the requestinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddElementsInput1 .REQUESTINFO }
     *     
     */
    public void setREQUESTINFO(AddElementsInput1 .REQUESTINFO value) {
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
     * {@link AddElementsInput1 .APISCHECKSTRUCTUREPASSENGER }
     * 
     * 
     */
    public List<AddElementsInput1 .APISCHECKSTRUCTUREPASSENGER> getAPISCHECKSTRUCTUREPASSENGER() {
        if (apischeckstructurepassenger == null) {
            apischeckstructurepassenger = new ArrayList<AddElementsInput1 .APISCHECKSTRUCTUREPASSENGER>();
        }
        return this.apischeckstructurepassenger;
    }

    /**
     * Gets the value of the listresidentdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listresidentdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRESIDENTDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListResidentDiscountType }
     * 
     * 
     */
    public List<ListResidentDiscountType> getLISTRESIDENTDISCOUNT() {
        if (listresidentdiscount == null) {
            listresidentdiscount = new ArrayList<ListResidentDiscountType>();
        }
        return this.listresidentdiscount;
    }

    /**
     * Gets the value of the listdiscountcredentials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscountcredentials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNTCREDENTIALS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListDiscountCredentialsType }
     * 
     * 
     */
    public List<ListDiscountCredentialsType> getLISTDISCOUNTCREDENTIALS() {
        if (listdiscountcredentials == null) {
            listdiscountcredentials = new ArrayList<ListDiscountCredentialsType>();
        }
        return this.listdiscountcredentials;
    }

    /**
     * Gets the value of the skipinsurancecall property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSKIPINSURANCECALL() {
        return skipinsurancecall;
    }

    /**
     * Sets the value of the skipinsurancecall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKIPINSURANCECALL(Boolean value) {
        this.skipinsurancecall = value;
    }

    /**
     * Gets the value of the frompax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFROMPAX() {
        return frompax;
    }

    /**
     * Sets the value of the frompax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFROMPAX(Boolean value) {
        this.frompax = value;
    }

    /**
     * Gets the value of the fromapis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFROMAPIS() {
        return fromapis;
    }

    /**
     * Sets the value of the fromapis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFROMAPIS(Boolean value) {
        this.fromapis = value;
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
     * Gets the value of the usercurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUSERCURRENCY() {
        return usercurrency;
    }

    /**
     * Sets the value of the usercurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUSERCURRENCY(Object value) {
        this.usercurrency = value;
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
     * Gets the value of the gdsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDSID() {
        return gdsid;
    }

    /**
     * Sets the value of the gdsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDSID(String value) {
        this.gdsid = value;
    }

    /**
     * Gets the value of the gds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDS() {
        return gds;
    }

    /**
     * Sets the value of the gds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDS(String value) {
        this.gds = value;
    }

    /**
     * Gets the value of the linenumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLINENUMBER() {
        return linenumber;
    }

    /**
     * Sets the value of the linenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLINENUMBER(BigInteger value) {
        this.linenumber = value;
    }

    /**
     * Gets the value of the addtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDTYPE() {
        return addtype;
    }

    /**
     * Sets the value of the addtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDTYPE(String value) {
        this.addtype = value;
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
     * Gets the value of the listticketingelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listticketingelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTICKETINGELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TICKETINGELEMENTType }
     * 
     * 
     */
    public List<TICKETINGELEMENTType> getLISTTICKETINGELEMENT() {
        if (listticketingelement == null) {
            listticketingelement = new ArrayList<TICKETINGELEMENTType>();
        }
        return this.listticketingelement;
    }

    /**
     * Gets the value of the listpsfgroup property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPSFGROUP }
     *     
     */
    public LISTPSFGROUP getLISTPSFGROUP() {
        return listpsfgroup;
    }

    /**
     * Sets the value of the listpsfgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPSFGROUP }
     *     
     */
    public void setLISTPSFGROUP(LISTPSFGROUP value) {
        this.listpsfgroup = value;
    }

    /**
     * Gets the value of the retrievepsfconfig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRETRIEVEPSFCONFIG() {
        return retrievepsfconfig;
    }

    /**
     * Sets the value of the retrievepsfconfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRETRIEVEPSFCONFIG(Boolean value) {
        this.retrievepsfconfig = value;
    }

    /**
     * Gets the value of the istravellernamechange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISTRAVELLERNAMECHANGE() {
        return istravellernamechange;
    }

    /**
     * Sets the value of the istravellernamechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISTRAVELLERNAMECHANGE(Boolean value) {
        this.istravellernamechange = value;
    }

    /**
     * Gets the value of the forcerefresh property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFORCEREFRESH() {
        return forcerefresh;
    }

    /**
     * Sets the value of the forcerefresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFORCEREFRESH(Boolean value) {
        this.forcerefresh = value;
    }

    /**
     * Gets the value of the restoretstwhenrefresh property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRESTORETSTWHENREFRESH() {
        return restoretstwhenrefresh;
    }

    /**
     * Sets the value of the restoretstwhenrefresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRESTORETSTWHENREFRESH(Boolean value) {
        this.restoretstwhenrefresh = value;
    }

    /**
     * Gets the value of the basketmodeflow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBASKETMODEFLOW() {
        return basketmodeflow;
    }

    /**
     * Sets the value of the basketmodeflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBASKETMODEFLOW(Boolean value) {
        this.basketmodeflow = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link AddElementsInput1 .COMMAND }
     *     
     */
    public AddElementsInput1 .COMMAND getCOMMAND() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddElementsInput1 .COMMAND }
     *     
     */
    public void setCOMMAND(AddElementsInput1 .COMMAND value) {
        this.command = value;
    }

    /**
     * Gets the value of the queuesmgds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queuesmgds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQUEUESMGDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QUEUESMGDSTYPE }
     * 
     * 
     */
    public List<QUEUESMGDSTYPE> getQUEUESMGDS() {
        if (queuesmgds == null) {
            queuesmgds = new ArrayList<QUEUESMGDSTYPE>();
        }
        return this.queuesmgds;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link INPUTOPTIONSType }
     *     
     */
    public INPUTOPTIONSType getOPTIONS() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link INPUTOPTIONSType }
     *     
     */
    public void setOPTIONS(INPUTOPTIONSType value) {
        this.options = value;
    }

    /**
     * Gets the value of the displaycarryoverstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISPLAYCARRYOVERSTATUS() {
        return displaycarryoverstatus;
    }

    /**
     * Sets the value of the displaycarryoverstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISPLAYCARRYOVERSTATUS(Boolean value) {
        this.displaycarryoverstatus = value;
    }

    /**
     * Gets the value of the carpowered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCARPOWERED() {
        return carpowered;
    }

    /**
     * Sets the value of the carpowered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCARPOWERED(Boolean value) {
        this.carpowered = value;
    }

    /**
     * Gets the value of the ispaymentsolution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPAYMENTSOLUTION() {
        return ispaymentsolution;
    }

    /**
     * Sets the value of the ispaymentsolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPAYMENTSOLUTION(Boolean value) {
        this.ispaymentsolution = value;
    }

    /**
     * Gets the value of the listtasf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtasf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTASF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddElementsInput1 .LISTTASF }
     * 
     * 
     */
    public List<AddElementsInput1 .LISTTASF> getLISTTASF() {
        if (listtasf == null) {
            listtasf = new ArrayList<AddElementsInput1 .LISTTASF>();
        }
        return this.listtasf;
    }

    /**
     * Gets the value of the usefopcatalog property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSEFOPCATALOG() {
        return usefopcatalog;
    }

    /**
     * Sets the value of the usefopcatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSEFOPCATALOG(Boolean value) {
        this.usefopcatalog = value;
    }

    /**
     * Gets the value of the upgradeselection property.
     * 
     * @return
     *     possible object is
     *     {@link AddElementsInput1 .UPGRADESELECTION }
     *     
     */
    public AddElementsInput1 .UPGRADESELECTION getUPGRADESELECTION() {
        return upgradeselection;
    }

    /**
     * Sets the value of the upgradeselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddElementsInput1 .UPGRADESELECTION }
     *     
     */
    public void setUPGRADESELECTION(AddElementsInput1 .UPGRADESELECTION value) {
        this.upgradeselection = value;
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
     * {@link PRICINGOPTIONSType }
     * 
     * 
     */
    public List<PRICINGOPTIONSType> getLISTPRICINGOPTIONS() {
        if (listpricingoptions == null) {
            listpricingoptions = new ArrayList<PRICINGOPTIONSType>();
        }
        return this.listpricingoptions;
    }

    /**
     * Gets the value of the milesandcashcost property.
     * 
     * @return
     *     possible object is
     *     {@link AddElementsInput1 .MILESANDCASHCOST }
     *     
     */
    public AddElementsInput1 .MILESANDCASHCOST getMILESANDCASHCOST() {
        return milesandcashcost;
    }

    /**
     * Sets the value of the milesandcashcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddElementsInput1 .MILESANDCASHCOST }
     *     
     */
    public void setMILESANDCASHCOST(AddElementsInput1 .MILESANDCASHCOST value) {
        this.milesandcashcost = value;
    }

    /**
     * Gets the value of the isswitchreferencename property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISSWITCHREFERENCENAME() {
        return isswitchreferencename;
    }

    /**
     * Sets the value of the isswitchreferencename property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISSWITCHREFERENCENAME(Boolean value) {
        this.isswitchreferencename = value;
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
     *     &lt;extension base="{}COMMANDType"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="TIMESTAMP_ENABLED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;anyAttribute processContents='lax'/&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "timestampenabled"
    })
    public static class COMMAND
        extends COMMANDType
        implements Serializable
    {

        @XmlElement(name = "TIMESTAMP_ENABLED")
        protected Boolean timestampenabled;

        /**
         * Gets the value of the timestampenabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTIMESTAMPENABLED() {
            return timestampenabled;
        }

        /**
         * Sets the value of the timestampenabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTIMESTAMPENABLED(Boolean value) {
            this.timestampenabled = value;
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
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="PRICING_SOLUTION_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="TRAVELSHOPPER_TICKET" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "pricingsolutionid",
        "elementid",
        "travelshopperticket"
    })
    public static class LISTELEMENTS
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected Object type;
        @XmlElement(name = "PRICING_SOLUTION_ID", required = true)
        protected Object pricingsolutionid;
        @XmlElement(name = "ELEMENT_ID", required = true)
        protected Object elementid;
        @XmlElement(name = "TRAVELSHOPPER_TICKET", required = true)
        protected Object travelshopperticket;

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
         * Gets the value of the pricingsolutionid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPRICINGSOLUTIONID() {
            return pricingsolutionid;
        }

        /**
         * Sets the value of the pricingsolutionid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPRICINGSOLUTIONID(Object value) {
            this.pricingsolutionid = value;
        }

        /**
         * Gets the value of the elementid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getELEMENTID() {
            return elementid;
        }

        /**
         * Sets the value of the elementid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setELEMENTID(Object value) {
            this.elementid = value;
        }

        /**
         * Gets the value of the travelshopperticket property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTRAVELSHOPPERTICKET() {
            return travelshopperticket;
        }

        /**
         * Sets the value of the travelshopperticket property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTRAVELSHOPPERTICKET(Object value) {
            this.travelshopperticket = value;
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
     *         &lt;element name="FARE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TICKET_GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element ref="{}TRAVELLER_ID" minOccurs="0"/&gt;
     *         &lt;element name="INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_PROPOSAL" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "fareid",
        "ticketgroupid",
        "travellerid",
        "infant",
        "isproposal"
    })
    public static class LISTFAREREFERENCE
        implements Serializable
    {

        @XmlElement(name = "FARE_ID", required = true)
        protected BigInteger fareid;
        @XmlElement(name = "TICKET_GROUP_ID")
        protected int ticketgroupid;
        @XmlElement(name = "TRAVELLER_ID")
        protected BigInteger travellerid;
        @XmlElement(name = "INFANT")
        protected Boolean infant;
        @XmlElement(name = "IS_PROPOSAL")
        protected Object isproposal;

        /**
         * Gets the value of the fareid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFAREID() {
            return fareid;
        }

        /**
         * Sets the value of the fareid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFAREID(BigInteger value) {
            this.fareid = value;
        }

        /**
         * Gets the value of the ticketgroupid property.
         * 
         */
        public int getTICKETGROUPID() {
            return ticketgroupid;
        }

        /**
         * Sets the value of the ticketgroupid property.
         * 
         */
        public void setTICKETGROUPID(int value) {
            this.ticketgroupid = value;
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
         * Gets the value of the infant property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isINFANT() {
            return infant;
        }

        /**
         * Sets the value of the infant property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setINFANT(Boolean value) {
            this.infant = value;
        }

        /**
         * Gets the value of the isproposal property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getISPROPOSAL() {
            return isproposal;
        }

        /**
         * Sets the value of the isproposal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setISPROPOSAL(Object value) {
            this.isproposal = value;
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
     *         &lt;element name="OFFER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "offerid"
    })
    public static class LISTOFFERSOURCE
        implements Serializable
    {

        @XmlElement(name = "OFFER_ID", required = true)
        protected Object offerid;

        /**
         * Gets the value of the offerid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOFFERID() {
            return offerid;
        }

        /**
         * Sets the value of the offerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOFFERID(Object value) {
            this.offerid = value;
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
     *         &lt;element name="KEY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "key",
        "value"
    })
    public static class LISTSERVICEPARAMETER
        implements Serializable
    {

        @XmlElement(name = "KEY", required = true)
        protected String key;
        @XmlElement(name = "VALUE", required = true)
        protected String value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKEY() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKEY(String value) {
            this.key = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}miscPricingRecordType"&gt;
     *       &lt;attribute name="technicalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LISTTASF
        extends MiscPricingRecordType
        implements Serializable
    {

        @XmlAttribute(name = "technicalId")
        protected String technicalId;

        /**
         * Gets the value of the technicalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnicalId() {
            return technicalId;
        }

        /**
         * Sets the value of the technicalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnicalId(String value) {
            this.technicalId = value;
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
     *         &lt;group ref="{}AwardMileAndCash"/&gt;
     *         &lt;group ref="{}Currency"/&gt;
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
        "resultingmiles",
        "convertedamount",
        "nonconvertedamount",
        "convertedcashmiles",
        "minimummilescost",
        "sliderrankposition",
        "numberofsliderranks",
        "slidertype",
        "listoption",
        "currency"
    })
    public static class MILESANDCASHCOST
        implements Serializable
    {

        @XmlElement(name = "RESULTING_MILES")
        protected AMOUNTSINTEGERTYPE resultingmiles;
        @XmlElement(name = "CONVERTED_AMOUNT")
        protected AMOUNTSTYPE convertedamount;
        @XmlElement(name = "NON_CONVERTED_AMOUNT")
        protected AMOUNTBREAKDOWN nonconvertedamount;
        @XmlElement(name = "CONVERTED_CASH_MILES")
        protected Object convertedcashmiles;
        @XmlElement(name = "MINIMUM_MILES_COST")
        protected Object minimummilescost;
        @XmlElement(name = "SLIDER_RANK_POSITION")
        protected Integer sliderrankposition;
        @XmlElement(name = "NUMBER_OF_SLIDER_RANKS")
        protected Integer numberofsliderranks;
        @XmlElement(name = "SLIDER_TYPE")
        protected String slidertype;
        @XmlElement(name = "LIST_OPTION")
        protected List<String> listoption;
        @XmlElement(name = "CURRENCY")
        protected AddElementsInput1 .MILESANDCASHCOST.CURRENCY currency;

        /**
         * Gets the value of the resultingmiles property.
         * 
         * @return
         *     possible object is
         *     {@link AMOUNTSINTEGERTYPE }
         *     
         */
        public AMOUNTSINTEGERTYPE getRESULTINGMILES() {
            return resultingmiles;
        }

        /**
         * Sets the value of the resultingmiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOUNTSINTEGERTYPE }
         *     
         */
        public void setRESULTINGMILES(AMOUNTSINTEGERTYPE value) {
            this.resultingmiles = value;
        }

        /**
         * Gets the value of the convertedamount property.
         * 
         * @return
         *     possible object is
         *     {@link AMOUNTSTYPE }
         *     
         */
        public AMOUNTSTYPE getCONVERTEDAMOUNT() {
            return convertedamount;
        }

        /**
         * Sets the value of the convertedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOUNTSTYPE }
         *     
         */
        public void setCONVERTEDAMOUNT(AMOUNTSTYPE value) {
            this.convertedamount = value;
        }

        /**
         * Gets the value of the nonconvertedamount property.
         * 
         * @return
         *     possible object is
         *     {@link AMOUNTBREAKDOWN }
         *     
         */
        public AMOUNTBREAKDOWN getNONCONVERTEDAMOUNT() {
            return nonconvertedamount;
        }

        /**
         * Sets the value of the nonconvertedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOUNTBREAKDOWN }
         *     
         */
        public void setNONCONVERTEDAMOUNT(AMOUNTBREAKDOWN value) {
            this.nonconvertedamount = value;
        }

        /**
         * Gets the value of the convertedcashmiles property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCONVERTEDCASHMILES() {
            return convertedcashmiles;
        }

        /**
         * Sets the value of the convertedcashmiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCONVERTEDCASHMILES(Object value) {
            this.convertedcashmiles = value;
        }

        /**
         * Gets the value of the minimummilescost property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMINIMUMMILESCOST() {
            return minimummilescost;
        }

        /**
         * Sets the value of the minimummilescost property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMINIMUMMILESCOST(Object value) {
            this.minimummilescost = value;
        }

        /**
         * Gets the value of the sliderrankposition property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSLIDERRANKPOSITION() {
            return sliderrankposition;
        }

        /**
         * Sets the value of the sliderrankposition property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSLIDERRANKPOSITION(Integer value) {
            this.sliderrankposition = value;
        }

        /**
         * Gets the value of the numberofsliderranks property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNUMBEROFSLIDERRANKS() {
            return numberofsliderranks;
        }

        /**
         * Sets the value of the numberofsliderranks property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNUMBEROFSLIDERRANKS(Integer value) {
            this.numberofsliderranks = value;
        }

        /**
         * Gets the value of the slidertype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSLIDERTYPE() {
            return slidertype;
        }

        /**
         * Sets the value of the slidertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSLIDERTYPE(String value) {
            this.slidertype = value;
        }

        /**
         * Gets the value of the listoption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listoption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTOPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTOPTION() {
            if (listoption == null) {
                listoption = new ArrayList<String>();
            }
            return this.listoption;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link AddElementsInput1 .MILESANDCASHCOST.CURRENCY }
         *     
         */
        public AddElementsInput1 .MILESANDCASHCOST.CURRENCY getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddElementsInput1 .MILESANDCASHCOST.CURRENCY }
         *     
         */
        public void setCURRENCY(AddElementsInput1 .MILESANDCASHCOST.CURRENCY value) {
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
     *         &lt;element name="LIST_REASON" type="{}reasonType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listreason"
    })
    public static class OVERRIDEREASON
        implements Serializable
    {

        @XmlElement(name = "LIST_REASON")
        protected List<ReasonType> listreason;

        /**
         * Gets the value of the listreason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listreason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTREASON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReasonType }
         * 
         * 
         */
        public List<ReasonType> getLISTREASON() {
            if (listreason == null) {
                listreason = new ArrayList<ReasonType>();
            }
            return this.listreason;
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
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="HOTEL"/&gt;
     *               &lt;enumeration value="CAR"/&gt;
     *               &lt;enumeration value="EXTERNAL_PROVIDER"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="HOTEL_GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "itemid",
        "travellerid",
        "hotelgroupid"
    })
    public static class TRAVELLERASSOCIATION
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "ITEM_ID")
        protected BigInteger itemid;
        @XmlElement(name = "TRAVELLER_ID")
        protected BigInteger travellerid;
        @XmlElement(name = "HOTEL_GROUP_ID")
        protected BigInteger hotelgroupid;

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
         * Gets the value of the hotelgroupid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHOTELGROUPID() {
            return hotelgroupid;
        }

        /**
         * Sets the value of the hotelgroupid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHOTELGROUPID(BigInteger value) {
            this.hotelgroupid = value;
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
     *         &lt;element name="SOLUTIONS" type="{}UPGRADE_SOLUTIONType" maxOccurs="unbounded"/&gt;
     *         &lt;element name="GLOBAL_CURRENCY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "solutions",
        "globalcurrencytype"
    })
    public static class UPGRADESELECTION
        implements Serializable
    {

        @XmlElement(name = "SOLUTIONS", required = true)
        protected List<UPGRADESOLUTIONType> solutions;
        @XmlElement(name = "GLOBAL_CURRENCY_TYPE")
        protected String globalcurrencytype;

        /**
         * Gets the value of the solutions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the solutions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOLUTIONS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UPGRADESOLUTIONType }
         * 
         * 
         */
        public List<UPGRADESOLUTIONType> getSOLUTIONS() {
            if (solutions == null) {
                solutions = new ArrayList<UPGRADESOLUTIONType>();
            }
            return this.solutions;
        }

        /**
         * Gets the value of the globalcurrencytype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGLOBALCURRENCYTYPE() {
            return globalcurrencytype;
        }

        /**
         * Sets the value of the globalcurrencytype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGLOBALCURRENCYTYPE(String value) {
            this.globalcurrencytype = value;
        }

    }

}
