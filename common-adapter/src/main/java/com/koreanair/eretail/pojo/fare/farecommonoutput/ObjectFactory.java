
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.air.common.FLIGHTPREFERENCEType;
import com.koreanair.eretail.pojo.common.common.GDSCABINCODEType;
import com.koreanair.eretail.pojo.common.common.LISTTRIPREASONtype;
import com.koreanair.eretail.pojo.common.common.OperationalDataType;
import com.koreanair.eretail.pojo.farecommon.farecommon.APPLICABLEFEEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.AVAILDATASOURCEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.COMMERCIALFAREFAMILYType;
import com.koreanair.eretail.pojo.farecommon.farecommon.CollectionInfoType;
import com.koreanair.eretail.pojo.farecommon.farecommon.FEEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTTAXType;
import com.koreanair.eretail.pojo.farecommon.farecommon.MILESANDCASHCOSTType;
import com.koreanair.eretail.pojo.farecommon.farecommon.REBOOKFEEType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.AIRLINEType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.FAREFAMILYFareType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.LISTCABINType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.LISTLEGType;
import com.koreanair.eretail.pojo.farecommon.farecontext.FARECONTEXTType;
import com.koreanair.eretail.pojo.farecommon.farecontext.LISTAPPLIEDPRICINGOPTIONSType;
import com.koreanair.eretail.pojo.farecommon.farediscount.ListDiscountCredentialsType;
import com.koreanair.eretail.pojo.farecommon.farediscount.ListResidentDiscountType;
import com.koreanair.eretail.pojo.farecommon.flowsignature.FLOWSIGNATUREType;
import com.koreanair.eretail.pojo.farecommon.travellercommon.LISTTRAVELLERINFOType;
import com.koreanair.eretail.pojo.profile.commonprofileout.ADDRESSINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.BANKACCOUNTINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.CHECKINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.CONTACTPOINTTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.CREDITCARDINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.EBANKVOUCHERINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.GOVERNMENTPAYMENTINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.IDENTITYDOCUMENTTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.IDENTITYINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.NOTIFICATIONINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.VOUCHERACCOUNTINFORMATIONTYPE;
import com.koreanair.eretail.pojo.taxexemption.taxexemptionoutput.TAXEXEMPTIONDATA;
import com.koreanair.eretail.pojo.ticketchanger.ticketchangercommon.LISTELEMENTUPDATEType;
import com.koreanair.eretail.pojo.ticketchanger.ticketchangercommonoutput.BOOKEDTRIPType;
import com.koreanair.eretail.pojo.ticketchanger.ticketchangercommonoutput.LISTREDEMPTIONType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.eretail.pojo.fare.farecommonoutput package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DISCOUNTCODE_QNAME = new QName("", "DISCOUNT_CODE");
    private final static QName _LISTFIELDERROR_QNAME = new QName("", "LIST_FIELD_ERROR");
    private final static QName _EXCHANGERATE_QNAME = new QName("", "EXCHANGE_RATE");
    private final static QName _DIRECTLOGIN_QNAME = new QName("", "DIRECT_LOGIN");
    private final static QName _DIRECTLOGINAGENT_QNAME = new QName("", "DIRECT_LOGIN_AGENT");
    private final static QName _EXTERNALLOGIN_QNAME = new QName("", "EXTERNAL_LOGIN");
    private final static QName _EXTERNALDIRECTLOGIN_QNAME = new QName("", "EXTERNAL_DIRECT_LOGIN");
    private final static QName _ISSTRUCTUREDXML_QNAME = new QName("", "IS_STRUCTURED_XML");
    private final static QName _NUMBEROFPROFILES_QNAME = new QName("", "NUMBER_OF_PROFILES");
    private final static QName _OFFICEID_QNAME = new QName("", "OFFICE_ID");
    private final static QName _TRIPREASONCODE_QNAME = new QName("", "TRIP_REASON_CODE");
    private final static QName _BOOLISOUTOFPOLICY_QNAME = new QName("", "BOOL_IS_OUT_OF_POLICY");
    private final static QName _DISPLAYRANK_QNAME = new QName("", "DISPLAY_RANK");
    private final static QName _PAGETICKET_QNAME = new QName("", "PAGE_TICKET");
    private final static QName _LISTTRIPREASON_QNAME = new QName("", "LIST_TRIP_REASON");
    private final static QName _RELATIONSHIP_QNAME = new QName("", "RELATIONSHIP");
    private final static QName _OPERATIONALDATA_QNAME = new QName("", "OPERATIONAL_DATA");
    private final static QName _MOREINFORMATIONAVAILABLE_QNAME = new QName("", "MORE_INFORMATION_AVAILABLE");
    private final static QName _AIRGDSCABINCODE_QNAME = new QName("", "AIR_GDS_CABIN_CODE");
    private final static QName _LISTFLIGHTPREFERENCE_QNAME = new QName("", "LIST_FLIGHT_PREFERENCE");
    private final static QName _SEVENDAYSEARCH_QNAME = new QName("", "SEVEN_DAY_SEARCH");
    private final static QName _HASINFANT_QNAME = new QName("", "HAS_INFANT");
    private final static QName _TITLE_QNAME = new QName("", "TITLE");
    private final static QName _FIRSTNAME_QNAME = new QName("", "FIRST_NAME");
    private final static QName _LASTNAME_QNAME = new QName("", "LAST_NAME");
    private final static QName _TRAVELLERID_QNAME = new QName("", "TRAVELLER_ID");
    private final static QName _REFERENCE_QNAME = new QName("", "REFERENCE");
    private final static QName _DATEOFBIRTH_QNAME = new QName("", "DATE_OF_BIRTH");
    private final static QName _TRAVELLEREXTERNALID_QNAME = new QName("", "TRAVELLER_EXTERNAL_ID");
    private final static QName _ISCUMULATIVEDISCOUNT_QNAME = new QName("", "IS_CUMULATIVE_DISCOUNT");
    private final static QName _LISTRESIDENTDISCOUNT_QNAME = new QName("", "LIST_RESIDENT_DISCOUNT");
    private final static QName _LISTDISCOUNTCREDENTIALS_QNAME = new QName("", "LIST_DISCOUNT_CREDENTIALS");
    private final static QName _CEMID_QNAME = new QName("", "CEM_ID");
    private final static QName _CEMAIRLINECODE_QNAME = new QName("", "CEM_AIRLINE_CODE");
    private final static QName _COMMANDEXECUTIONSTATUS_QNAME = new QName("", "COMMAND_EXECUTION_STATUS");
    private final static QName _FARINGCOMMANDID_QNAME = new QName("", "FARING_COMMAND_ID");
    private final static QName _TYPEOFFARE_QNAME = new QName("", "TYPE_OF_FARE");
    private final static QName _PRICINGWITHPUBLISHEDMILES_QNAME = new QName("", "PRICING_WITH_PUBLISHED_MILES");
    private final static QName _MILESPUBLISHINGAIRLINE_QNAME = new QName("", "MILES_PUBLISHING_AIRLINE");
    private final static QName _ISUPGRADE_QNAME = new QName("", "IS_UPGRADE");
    private final static QName _POINTOFSALE_QNAME = new QName("", "POINT_OF_SALE");
    private final static QName _POINTOFTICKETING_QNAME = new QName("", "POINT_OF_TICKETING");
    private final static QName _TYPEOFCORPORATEFARE_QNAME = new QName("", "TYPE_OF_CORPORATE_FARE");
    private final static QName _CUSTOMERIDENTIFIER_QNAME = new QName("", "CUSTOMER_IDENTIFIER");
    private final static QName _PRICINGOPTIONSID_QNAME = new QName("", "PRICING_OPTIONS_ID");
    private final static QName _NVA_QNAME = new QName("", "NVA");
    private final static QName _NVB_QNAME = new QName("", "NVB");
    private final static QName _ALLINCLUSIVE_QNAME = new QName("", "ALL_INCLUSIVE");
    private final static QName _LISTFEE_QNAME = new QName("", "LIST_FEE");
    private final static QName _LISTAPPLICABLEMARKUPDISCOUNT_QNAME = new QName("", "LIST_APPLICABLE_MARKUP_DISCOUNT");
    private final static QName _LISTAPPLICABLEFEE_QNAME = new QName("", "LIST_APPLICABLE_FEE");
    private final static QName _ESTIMATEDDISCOUNTAMOUNT_QNAME = new QName("", "ESTIMATED_DISCOUNT_AMOUNT");
    private final static QName _MILESCOST_QNAME = new QName("", "MILES_COST");
    private final static QName _AVAILDATASOURCE_QNAME = new QName("", "AVAIL_DATA_SOURCE");
    private final static QName _RECOMMREF_QNAME = new QName("", "RECOMM_REF");
    private final static QName _AMOUNTTOSUM_QNAME = new QName("", "AMOUNT_TO_SUM");
    private final static QName _AMOUNTTOMAX_QNAME = new QName("", "AMOUNT_TO_MAX");
    private final static QName _AMOUNT_QNAME = new QName("", "AMOUNT");
    private final static QName _AMOUNTWITHOUTTAX_QNAME = new QName("", "AMOUNT_WITHOUT_TAX");
    private final static QName _TAX_QNAME = new QName("", "TAX");
    private final static QName _TAXPAID_QNAME = new QName("", "TAX_PAID");
    private final static QName _REBOOKFEE_QNAME = new QName("", "REBOOK_FEE");
    private final static QName _NOSHOWFEE_QNAME = new QName("", "NO_SHOW_FEE");
    private final static QName _PRICEDPAXONLY_QNAME = new QName("", "PRICED_PAX_ONLY");
    private final static QName _REISSUESTATUS_QNAME = new QName("", "REISSUE_STATUS");
    private final static QName _TOTALAMOUNT_QNAME = new QName("", "TOTAL_AMOUNT");
    private final static QName _LISTDISPLAYTAX_QNAME = new QName("", "LIST_DISPLAY_TAX");
    private final static QName _CONVERTEDCASHMILES_QNAME = new QName("", "CONVERTED_CASH_MILES");
    private final static QName _MINIMUMMILESCOST_QNAME = new QName("", "MINIMUM_MILES_COST");
    private final static QName _MILESANDCASHCOST_QNAME = new QName("", "MILES_AND_CASH_COST");
    private final static QName _COLLECTIONINFO_QNAME = new QName("", "COLLECTION_INFO");
    private final static QName _BOUNDTOMODIFY_QNAME = new QName("", "BOUND_TO_MODIFY");
    private final static QName _SEGMENTTATTOO_QNAME = new QName("", "SEGMENT_TATTOO");
    private final static QName _BOOLFLOWN_QNAME = new QName("", "BOOL_FLOWN");
    private final static QName _LINENUMBER_QNAME = new QName("", "LINE_NUMBER");
    private final static QName _REVALIDATIONINDICATOR_QNAME = new QName("", "REVALIDATION_INDICATOR");
    private final static QName _FAREFAMILY_QNAME = new QName("", "FARE_FAMILY");
    private final static QName _HIGHLIGHT_QNAME = new QName("", "HIGHLIGHT");
    private final static QName _ITEMID_QNAME = new QName("", "ITEM_ID");
    private final static QName _MODIFICATIONSTATUS_QNAME = new QName("", "MODIFICATION_STATUS");
    private final static QName _BANYTIME_QNAME = new QName("", "B_ANY_TIME");
    private final static QName _TRFLIGHTS_QNAME = new QName("", "TR_FLIGHTS");
    private final static QName _AIRLINEBIAS_QNAME = new QName("", "AIRLINE_BIAS");
    private final static QName _SCHEDULE_QNAME = new QName("", "SCHEDULE");
    private final static QName _SEGMENTFLIGHTTIME_QNAME = new QName("", "SEGMENT_FLIGHT_TIME");
    private final static QName _AIRLINE_QNAME = new QName("", "AIRLINE");
    private final static QName _OTHERAIRLINE_QNAME = new QName("", "OTHER_AIRLINE");
    private final static QName _FLIGHTNUMBER_QNAME = new QName("", "FLIGHT_NUMBER");
    private final static QName _BTERMINAL_QNAME = new QName("", "B_TERMINAL");
    private final static QName _ETERMINAL_QNAME = new QName("", "E_TERMINAL");
    private final static QName _BDAYINDICATOR_QNAME = new QName("", "B_DAY_INDICATOR");
    private final static QName _EDAYINDICATOR_QNAME = new QName("", "E_DAY_INDICATOR");
    private final static QName _ETDDAYINDICATOR_QNAME = new QName("", "ETD_DAY_INDICATOR");
    private final static QName _ETADAYINDICATOR_QNAME = new QName("", "ETA_DAY_INDICATOR");
    private final static QName _TRAFFICRESTRICTION_QNAME = new QName("", "TRAFFIC_RESTRICTION");
    private final static QName _ONTIMEPERFORMANCE_QNAME = new QName("", "ON_TIME_PERFORMANCE");
    private final static QName _IRREGULARITY_QNAME = new QName("", "IRREGULARITY");
    private final static QName _OPFLAG_QNAME = new QName("", "OP_FLAG");
    private final static QName _ACCESSLEVEL_QNAME = new QName("", "ACCESS_LEVEL");
    private final static QName _ETICKETING_QNAME = new QName("", "E_TICKETING");
    private final static QName _NUMBEROFSTOPS_QNAME = new QName("", "NUMBER_OF_STOPS");
    private final static QName _FLIGHTTIME_QNAME = new QName("", "FLIGHT_TIME");
    private final static QName _LISTLEG_QNAME = new QName("", "LIST_LEG");
    private final static QName _BOOKABLE_QNAME = new QName("", "BOOKABLE");
    private final static QName _MEAL_QNAME = new QName("", "MEAL");
    private final static QName _ENTERTAIMENT_QNAME = new QName("", "ENTERTAIMENT");
    private final static QName _EQUIPMENTCHANGE_QNAME = new QName("", "EQUIPMENT_CHANGE");
    private final static QName _TIMECHANGE_QNAME = new QName("", "TIME_CHANGE");
    private final static QName _LASTSEATAVAILABILITY_QNAME = new QName("", "LAST_SEAT_AVAILABILITY");
    private final static QName _CODESHAREINDICATOR_QNAME = new QName("", "CODE_SHARE_INDICATOR");
    private final static QName _LISTCABIN_QNAME = new QName("", "LIST_CABIN");
    private final static QName _STATUS_QNAME = new QName("", "STATUS");
    private final static QName _BOOKEDTRIP_QNAME = new QName("", "BOOKED_TRIP");
    private final static QName _LISTREDEMPTION_QNAME = new QName("", "LIST_REDEMPTION");
    private final static QName _IDENTITYINFORMATION_QNAME = new QName("", "IDENTITY_INFORMATION");
    private final static QName _LISTNOTIFICATIONINFORMATION_QNAME = new QName("", "LIST_NOTIFICATION_INFORMATION");
    private final static QName _LISTADDRESSINFORMATION_QNAME = new QName("", "LIST_ADDRESS_INFORMATION");
    private final static QName _LISTCREDITCARDINFORMATION_QNAME = new QName("", "LIST_CREDIT_CARD_INFORMATION");
    private final static QName _LISTGOVERNMENTPAYMENTINFORMATION_QNAME = new QName("", "LIST_GOVERNMENT_PAYMENT_INFORMATION");
    private final static QName _LISTBANKACCOUNTINFORMATION_QNAME = new QName("", "LIST_BANK_ACCOUNT_INFORMATION");
    private final static QName _LISTEBANKVOUCHERINFORMATION_QNAME = new QName("", "LIST_EBANK_VOUCHER_INFORMATION");
    private final static QName _LISTCHECKINFORMATION_QNAME = new QName("", "LIST_CHECK_INFORMATION");
    private final static QName _LISTVOUCHERACCOUNTINFORMATION_QNAME = new QName("", "LIST_VOUCHER_ACCOUNT_INFORMATION");
    private final static QName _ISUSERLOGGEDIN_QNAME = new QName("", "IS_USER_LOGGED_IN");
    private final static QName _INFANT_QNAME = new QName("", "INFANT");
    private final static QName _LISTCONTACTPOINT_QNAME = new QName("", "LIST_CONTACT_POINT");
    private final static QName _LISTCONTACTPOINTPASSENGER_QNAME = new QName("", "LIST_CONTACT_POINT_PASSENGER");
    private final static QName _LISTIDENTITYDOCUMENT_QNAME = new QName("", "LIST_IDENTITY_DOCUMENT");
    private final static QName _CREATIONMODE_QNAME = new QName("", "CREATION_MODE");
    private final static QName _FLOWSIGNATURE_QNAME = new QName("", "FLOW_SIGNATURE");
    private final static QName _PRICINGTYPE_QNAME = new QName("", "PRICING_TYPE");
    private final static QName _LISTREDEMPTIONREMARK_QNAME = new QName("", "LIST_REDEMPTION_REMARK");
    private final static QName _RESTRICTION_QNAME = new QName("", "RESTRICTION");
    private final static QName _TRIPTYPE_QNAME = new QName("", "TRIP_TYPE");
    private final static QName _FAMILYFARE_QNAME = new QName("", "FAMILY_FARE");
    private final static QName _TYPEOFFAREAIR_QNAME = new QName("", "TYPE_OF_FARE_AIR");
    private final static QName _ISPRIMARYTRAVELLER_QNAME = new QName("", "IS_PRIMARY_TRAVELLER");
    private final static QName _NUMBER_QNAME = new QName("", "NUMBER");
    private final static QName _FAREID_QNAME = new QName("", "FARE_ID");
    private final static QName _PASSCORPORATEID_QNAME = new QName("", "PASS_CORPORATE_ID");
    private final static QName _AIRRULEID_QNAME = new QName("", "AIR_RULE_ID");
    private final static QName _PRICEBYINPUTID_QNAME = new QName("", "PRICE_BY_INPUT_ID");
    private final static QName _FAREBYBOUND_QNAME = new QName("", "FARE_BY_BOUND");
    private final static QName _REQUESTEDTRAVELLERTYPE_QNAME = new QName("", "REQUESTED_TRAVELLER_TYPE");
    private final static QName _TICKETINDICATOR_QNAME = new QName("", "TICKET_INDICATOR");
    private final static QName _FARETYPE_QNAME = new QName("", "FARE_TYPE");
    private final static QName _SERVICEFEEAMOUNT_QNAME = new QName("", "SERVICE_FEE_AMOUNT");
    private final static QName _SURCHARGES_QNAME = new QName("", "SURCHARGES");
    private final static QName _LISTTICKETTYPE_QNAME = new QName("", "LIST_TICKET_TYPE");
    private final static QName _TICKETTYPE_QNAME = new QName("", "TICKET_TYPE");
    private final static QName _LISTMOD_QNAME = new QName("", "LIST_MOD");
    private final static QName _LISTFAREFLAG_QNAME = new QName("", "LIST_FARE_FLAG");
    private final static QName _LISTUPSOLDSEGMENTID_QNAME = new QName("", "LIST_UPSOLD_SEGMENT_ID");
    private final static QName _FARECATEGORY_QNAME = new QName("", "FARE_CATEGORY");
    private final static QName _LISTPRICEINFO_QNAME = new QName("", "LIST_PRICE_INFO");
    private final static QName _FORMAT_QNAME = new QName("", "FORMAT");
    private final static QName _FARECOMMAND_QNAME = new QName("", "FARE_COMMAND");
    private final static QName _LISTRBD_QNAME = new QName("", "LIST_RBD");
    private final static QName _OLDPRICE_QNAME = new QName("", "OLD_PRICE");
    private final static QName _BLUEBIZCREDITS_QNAME = new QName("", "BLUEBIZ_CREDITS");
    private final static QName _PTCDISCOUNTED_QNAME = new QName("", "PTC_DISCOUNTED");
    private final static QName _REQUESTEDUSERCABIN_QNAME = new QName("", "REQUESTED_USER_CABIN");
    private final static QName _VALIDATINGCARRIER_QNAME = new QName("", "VALIDATING_CARRIER");
    private final static QName _LISTTRAVELLERPRICE_QNAME = new QName("", "LIST_TRAVELLER_PRICE");
    private final static QName _LISTTRAVELLERTYPEPRICE_QNAME = new QName("", "LIST_TRAVELLER_TYPE_PRICE");
    private final static QName _LISTTRAVELLERINFO_QNAME = new QName("", "LIST_TRAVELLER_INFO");
    private final static QName _LISTTRAVELLERTYPE_QNAME = new QName("", "LIST_TRAVELLER_TYPE");
    private final static QName _LISTPNRPRICE_QNAME = new QName("", "LIST_PNR_PRICE");
    private final static QName _LISTPNR_QNAME = new QName("", "LIST_PNR");
    private final static QName _REQUESTEDFAREFAMILY_QNAME = new QName("", "REQUESTED_FARE_FAMILY");
    private final static QName _LISTRECOMMENDATION_QNAME = new QName("", "LIST_RECOMMENDATION");
    private final static QName _LISTORIGINATINGRECOMMENDATION_QNAME = new QName("", "LIST_ORIGINATING_RECOMMENDATION");
    private final static QName _LISTTRIPELEMENT_QNAME = new QName("", "LIST_TRIP_ELEMENT");
    private final static QName _ETICKETDISCOUNT_QNAME = new QName("", "E_TICKET_DISCOUNT");
    private final static QName _FARECONTEXT_QNAME = new QName("", "FARE_CONTEXT");
    private final static QName _LISTFARECONTEXT_QNAME = new QName("", "LIST_FARE_CONTEXT");
    private final static QName _LISTCOMMERCIALFAREFAMILY_QNAME = new QName("", "LIST_COMMERCIAL_FARE_FAMILY");
    private final static QName _LISTLIGHTFAREFAMILY_QNAME = new QName("", "LIST_LIGHT_FARE_FAMILY");
    private final static QName _TICKETDESIGNATOR_QNAME = new QName("", "TICKET_DESIGNATOR");
    private final static QName _LISTTAXEXEMPTION_QNAME = new QName("", "LIST_TAX_EXEMPTION");
    private final static QName _LISTFPALTERNATETRIPELEMENT_QNAME = new QName("", "LIST_FP_ALTERNATE_TRIP_ELEMENT");
    private final static QName _FPBUYUPSEARCHDATA_QNAME = new QName("", "FP_BUYUP_SEARCH_DATA");
    private final static QName _ALTERNATEFAREFAMILY_QNAME = new QName("", "ALTERNATE_FARE_FAMILY");
    private final static QName _LISTRECOMMENDATIONID_QNAME = new QName("", "LIST_RECOMMENDATION_ID");
    private final static QName _LISTFLIGHTID_QNAME = new QName("", "LIST_FLIGHT_ID");
    private final static QName _RECOMMENDATIONID_QNAME = new QName("", "RECOMMENDATION_ID");
    private final static QName _LISTFAREHOSTCOMMAND_QNAME = new QName("", "LIST_FARE_HOST_COMMAND");
    private final static QName _TYPE_QNAME = new QName("", "TYPE");
    private final static QName _AVAILABILITYTIME_QNAME = new QName("", "AVAILABILITY_TIME");
    private final static QName _CITYREFERENCE_QNAME = new QName("", "CITY_REFERENCE");
    private final static QName _LISTELEMENTUPDATE_QNAME = new QName("", "LIST_ELEMENT_UPDATE");
    private final static QName _FORCEPTC_QNAME = new QName("", "FORCE_PTC");
    private final static QName _ENDORSEMSG_QNAME = new QName("", "ENDORSE_MSG");
    private final static QName _REQUESTOPTIONS_QNAME = new QName("", "REQUEST_OPTIONS");
    private final static QName _LISTPRICINGOPTIONS_QNAME = new QName("", "LIST_PRICING_OPTIONS");
    private final static QName _FARERESPONSETYPE_QNAME = new QName("", "FARE_RESPONSE_TYPE");
    private final static QName _MILEAGEACCRUALAMOUNT_QNAME = new QName("", "MILEAGE_ACCRUAL_AMOUNT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.eretail.pojo.fare.farecommonoutput
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SATURNEINFO }
     * 
     */
    public SATURNEINFO createSATURNEINFO() {
        return new SATURNEINFO();
    }

    /**
     * Create an instance of {@link SEGMENTRESPONSEType }
     * 
     */
    public SEGMENTRESPONSEType createSEGMENTRESPONSEType() {
        return new SEGMENTRESPONSEType();
    }

    /**
     * Create an instance of {@link ServiceInfoType }
     * 
     */
    public ServiceInfoType createServiceInfoType() {
        return new ServiceInfoType();
    }

    /**
     * Create an instance of {@link LISTFAREFAMILYDESCSEGMENTType }
     * 
     */
    public LISTFAREFAMILYDESCSEGMENTType createLISTFAREFAMILYDESCSEGMENTType() {
        return new LISTFAREFAMILYDESCSEGMENTType();
    }

    /**
     * Create an instance of {@link TicketingTimeLimitType }
     * 
     */
    public TicketingTimeLimitType createTicketingTimeLimitType() {
        return new TicketingTimeLimitType();
    }

    /**
     * Create an instance of {@link TicketImageType }
     * 
     */
    public TicketImageType createTicketImageType() {
        return new TicketImageType();
    }

    /**
     * Create an instance of {@link TicketImageType.LISTTRAVELLER }
     * 
     */
    public TicketImageType.LISTTRAVELLER createTicketImageTypeLISTTRAVELLER() {
        return new TicketImageType.LISTTRAVELLER();
    }

    /**
     * Create an instance of {@link TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO }
     * 
     */
    public TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO createTicketImageTypeLISTTRAVELLERFARETRAVELLERINFO() {
        return new TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO();
    }

    /**
     * Create an instance of {@link TicketImageType.LISTTAX }
     * 
     */
    public TicketImageType.LISTTAX createTicketImageTypeLISTTAX() {
        return new TicketImageType.LISTTAX();
    }

    /**
     * Create an instance of {@link TicketImageType.LISTTAX.TAXDETAIL }
     * 
     */
    public TicketImageType.LISTTAX.TAXDETAIL createTicketImageTypeLISTTAXTAXDETAIL() {
        return new TicketImageType.LISTTAX.TAXDETAIL();
    }

    /**
     * Create an instance of {@link TicketSegmentType }
     * 
     */
    public TicketSegmentType createTicketSegmentType() {
        return new TicketSegmentType();
    }

    /**
     * Create an instance of {@link TicketSegmentType.FARESEGMENTINFO }
     * 
     */
    public TicketSegmentType.FARESEGMENTINFO createTicketSegmentTypeFARESEGMENTINFO() {
        return new TicketSegmentType.FARESEGMENTINFO();
    }

    /**
     * Create an instance of {@link ONHOLDINFORMATIONType }
     * 
     */
    public ONHOLDINFORMATIONType createONHOLDINFORMATIONType() {
        return new ONHOLDINFORMATIONType();
    }

    /**
     * Create an instance of {@link ALTERNATEBALANCEType }
     * 
     */
    public ALTERNATEBALANCEType createALTERNATEBALANCEType() {
        return new ALTERNATEBALANCEType();
    }

    /**
     * Create an instance of {@link FARECOMMONType }
     * 
     */
    public FARECOMMONType createFARECOMMONType() {
        return new FARECOMMONType();
    }

    /**
     * Create an instance of {@link FARECOMMONType.LISTPANELSTATISTICS }
     * 
     */
    public FARECOMMONType.LISTPANELSTATISTICS createFARECOMMONTypeLISTPANELSTATISTICS() {
        return new FARECOMMONType.LISTPANELSTATISTICS();
    }

    /**
     * Create an instance of {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS }
     * 
     */
    public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS createFARECOMMONTypeLISTPANELSTATISTICSSTATISTICS() {
        return new FARECOMMONType.LISTPANELSTATISTICS.STATISTICS();
    }

    /**
     * Create an instance of {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL }
     * 
     */
    public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL createFARECOMMONTypeLISTPANELSTATISTICSSTATISTICSPANEL() {
        return new FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL();
    }

    /**
     * Create an instance of {@link FARECOMMONType.LISTPANELSTATISTICS.PANELINFO }
     * 
     */
    public FARECOMMONType.LISTPANELSTATISTICS.PANELINFO createFARECOMMONTypeLISTPANELSTATISTICSPANELINFO() {
        return new FARECOMMONType.LISTPANELSTATISTICS.PANELINFO();
    }

    /**
     * Create an instance of {@link TRIPFAREType }
     * 
     */
    public TRIPFAREType createTRIPFAREType() {
        return new TRIPFAREType();
    }

    /**
     * Create an instance of {@link FareFamilyDescType }
     * 
     */
    public FareFamilyDescType createFareFamilyDescType() {
        return new FareFamilyDescType();
    }

    /**
     * Create an instance of {@link LISTFARECONTEXTType }
     * 
     */
    public LISTFARECONTEXTType createLISTFARECONTEXTType() {
        return new LISTFARECONTEXTType();
    }

    /**
     * Create an instance of {@link LISTFARECONTEXTType.OVERRIDE }
     * 
     */
    public LISTFARECONTEXTType.OVERRIDE createLISTFARECONTEXTTypeOVERRIDE() {
        return new LISTFARECONTEXTType.OVERRIDE();
    }

    /**
     * Create an instance of {@link LISTAPPLIEDFAREDISCOUNT }
     * 
     */
    public LISTAPPLIEDFAREDISCOUNT createLISTAPPLIEDFAREDISCOUNT() {
        return new LISTAPPLIEDFAREDISCOUNT();
    }

    /**
     * Create an instance of {@link com.koreanair.eretail.pojo.fare.farecommonoutput.LISTSEGMENTID }
     * 
     */
    public com.koreanair.eretail.pojo.fare.farecommonoutput.LISTSEGMENTID createLISTSEGMENTID() {
        return new com.koreanair.eretail.pojo.fare.farecommonoutput.LISTSEGMENTID();
    }

    /**
     * Create an instance of {@link TRAVELERType }
     * 
     */
    public TRAVELERType createTRAVELERType() {
        return new TRAVELERType();
    }

    /**
     * Create an instance of {@link TICKETINDICATORType }
     * 
     */
    public TICKETINDICATORType createTICKETINDICATORType() {
        return new TICKETINDICATORType();
    }

    /**
     * Create an instance of {@link FARETYPEType }
     * 
     */
    public FARETYPEType createFARETYPEType() {
        return new FARETYPEType();
    }

    /**
     * Create an instance of {@link TICKETTYPEType }
     * 
     */
    public TICKETTYPEType createTICKETTYPEType() {
        return new TICKETTYPEType();
    }

    /**
     * Create an instance of {@link MODType }
     * 
     */
    public MODType createMODType() {
        return new MODType();
    }

    /**
     * Create an instance of {@link FAREFLAGType }
     * 
     */
    public FAREFLAGType createFAREFLAGType() {
        return new FAREFLAGType();
    }

    /**
     * Create an instance of {@link UPSOLDSEGMENTIDType }
     * 
     */
    public UPSOLDSEGMENTIDType createUPSOLDSEGMENTIDType() {
        return new UPSOLDSEGMENTIDType();
    }

    /**
     * Create an instance of {@link LISTPRICEINFOType }
     * 
     */
    public LISTPRICEINFOType createLISTPRICEINFOType() {
        return new LISTPRICEINFOType();
    }

    /**
     * Create an instance of {@link FARERBDType }
     * 
     */
    public FARERBDType createFARERBDType() {
        return new FARERBDType();
    }

    /**
     * Create an instance of {@link TICKETINGTIMELIMIT }
     * 
     */
    public TICKETINGTIMELIMIT createTICKETINGTIMELIMIT() {
        return new TICKETINGTIMELIMIT();
    }

    /**
     * Create an instance of {@link PENDINGTIMELIMIT }
     * 
     */
    public PENDINGTIMELIMIT createPENDINGTIMELIMIT() {
        return new PENDINGTIMELIMIT();
    }

    /**
     * Create an instance of {@link TICKETINGTIMELIMITGDS }
     * 
     */
    public TICKETINGTIMELIMITGDS createTICKETINGTIMELIMITGDS() {
        return new TICKETINGTIMELIMITGDS();
    }

    /**
     * Create an instance of {@link LISTFARERULE }
     * 
     */
    public LISTFARERULE createLISTFARERULE() {
        return new LISTFARERULE();
    }

    /**
     * Create an instance of {@link LISTFAREINDICATOR }
     * 
     */
    public LISTFAREINDICATOR createLISTFAREINDICATOR() {
        return new LISTFAREINDICATOR();
    }

    /**
     * Create an instance of {@link LISTTRAVPRICEType }
     * 
     */
    public LISTTRAVPRICEType createLISTTRAVPRICEType() {
        return new LISTTRAVPRICEType();
    }

    /**
     * Create an instance of {@link LISTTRAVTYPEPRICEType }
     * 
     */
    public LISTTRAVTYPEPRICEType createLISTTRAVTYPEPRICEType() {
        return new LISTTRAVTYPEPRICEType();
    }

    /**
     * Create an instance of {@link LISTBOUNDPRICE }
     * 
     */
    public LISTBOUNDPRICE createLISTBOUNDPRICE() {
        return new LISTBOUNDPRICE();
    }

    /**
     * Create an instance of {@link ADDITIONALMILESCOSTINFOType }
     * 
     */
    public ADDITIONALMILESCOSTINFOType createADDITIONALMILESCOSTINFOType() {
        return new ADDITIONALMILESCOSTINFOType();
    }

    /**
     * Create an instance of {@link LISTTRAVELLERTYPEType }
     * 
     */
    public LISTTRAVELLERTYPEType createLISTTRAVELLERTYPEType() {
        return new LISTTRAVELLERTYPEType();
    }

    /**
     * Create an instance of {@link PRICEType }
     * 
     */
    public PRICEType createPRICEType() {
        return new PRICEType();
    }

    /**
     * Create an instance of {@link LISTPNRType }
     * 
     */
    public LISTPNRType createLISTPNRType() {
        return new LISTPNRType();
    }

    /**
     * Create an instance of {@link LISTTRIPPRICE }
     * 
     */
    public LISTTRIPPRICE createLISTTRIPPRICE() {
        return new LISTTRIPPRICE();
    }

    /**
     * Create an instance of {@link TRIPPRICEType }
     * 
     */
    public TRIPPRICEType createTRIPPRICEType() {
        return new TRIPPRICEType();
    }

    /**
     * Create an instance of {@link LISTRECOMMENDATIONType }
     * 
     */
    public LISTRECOMMENDATIONType createLISTRECOMMENDATIONType() {
        return new LISTRECOMMENDATIONType();
    }

    /**
     * Create an instance of {@link LISTORIGINATINGRECOMMENDATIONType }
     * 
     */
    public LISTORIGINATINGRECOMMENDATIONType createLISTORIGINATINGRECOMMENDATIONType() {
        return new LISTORIGINATINGRECOMMENDATIONType();
    }

    /**
     * Create an instance of {@link LISTTRIPELEMENTType }
     * 
     */
    public LISTTRIPELEMENTType createLISTTRIPELEMENTType() {
        return new LISTTRIPELEMENTType();
    }

    /**
     * Create an instance of {@link SATURNEINFO.DISCOUNTCARD }
     * 
     */
    public SATURNEINFO.DISCOUNTCARD createSATURNEINFODISCOUNTCARD() {
        return new SATURNEINFO.DISCOUNTCARD();
    }

    /**
     * Create an instance of {@link LIGHTFAREFAMILYType }
     * 
     */
    public LIGHTFAREFAMILYType createLIGHTFAREFAMILYType() {
        return new LIGHTFAREFAMILYType();
    }

    /**
     * Create an instance of {@link LISTRULES }
     * 
     */
    public LISTRULES createLISTRULES() {
        return new LISTRULES();
    }

    /**
     * Create an instance of {@link LISTFPALTERNATETRIPELEMENTType }
     * 
     */
    public LISTFPALTERNATETRIPELEMENTType createLISTFPALTERNATETRIPELEMENTType() {
        return new LISTFPALTERNATETRIPELEMENTType();
    }

    /**
     * Create an instance of {@link FPBUYUPSEARCHDATAType }
     * 
     */
    public FPBUYUPSEARCHDATAType createFPBUYUPSEARCHDATAType() {
        return new FPBUYUPSEARCHDATAType();
    }

    /**
     * Create an instance of {@link LISTRECOMMENDATIONIDTYPE }
     * 
     */
    public LISTRECOMMENDATIONIDTYPE createLISTRECOMMENDATIONIDTYPE() {
        return new LISTRECOMMENDATIONIDTYPE();
    }

    /**
     * Create an instance of {@link LISTFAREHOSTCOMMANDType }
     * 
     */
    public LISTFAREHOSTCOMMANDType createLISTFAREHOSTCOMMANDType() {
        return new LISTFAREHOSTCOMMANDType();
    }

    /**
     * Create an instance of {@link DATE }
     * 
     */
    public DATE createDATE() {
        return new DATE();
    }

    /**
     * Create an instance of {@link REQUESTOPTIONSType }
     * 
     */
    public REQUESTOPTIONSType createREQUESTOPTIONSType() {
        return new REQUESTOPTIONSType();
    }

    /**
     * Create an instance of {@link DICTIONARY }
     * 
     */
    public DICTIONARY createDICTIONARY() {
        return new DICTIONARY();
    }

    /**
     * Create an instance of {@link IndexedTravellerType }
     * 
     */
    public IndexedTravellerType createIndexedTravellerType() {
        return new IndexedTravellerType();
    }

    /**
     * Create an instance of {@link SegmentInfo }
     * 
     */
    public SegmentInfo createSegmentInfo() {
        return new SegmentInfo();
    }

    /**
     * Create an instance of {@link SEGMENTType }
     * 
     */
    public SEGMENTType createSEGMENTType() {
        return new SEGMENTType();
    }

    /**
     * Create an instance of {@link LISTTRAVELLERType }
     * 
     */
    public LISTTRAVELLERType createLISTTRAVELLERType() {
        return new LISTTRAVELLERType();
    }

    /**
     * Create an instance of {@link FareOutputType }
     * 
     */
    public FareOutputType createFareOutputType() {
        return new FareOutputType();
    }

    /**
     * Create an instance of {@link LISTTRIPFAREType }
     * 
     */
    public LISTTRIPFAREType createLISTTRIPFAREType() {
        return new LISTTRIPFAREType();
    }

    /**
     * Create an instance of {@link LISTPRICINGSOLUTIONType }
     * 
     */
    public LISTPRICINGSOLUTIONType createLISTPRICINGSOLUTIONType() {
        return new LISTPRICINGSOLUTIONType();
    }

    /**
     * Create an instance of {@link FAREFAMILYAMOUNTType }
     * 
     */
    public FAREFAMILYAMOUNTType createFAREFAMILYAMOUNTType() {
        return new FAREFAMILYAMOUNTType();
    }

    /**
     * Create an instance of {@link FAREFAMILYCOUNTType }
     * 
     */
    public FAREFAMILYCOUNTType createFAREFAMILYCOUNTType() {
        return new FAREFAMILYCOUNTType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link LISTALTERNATEPNRType }
     * 
     */
    public LISTALTERNATEPNRType createLISTALTERNATEPNRType() {
        return new LISTALTERNATEPNRType();
    }

    /**
     * Create an instance of {@link LISTALTERNATETRAVELLERTYPEType }
     * 
     */
    public LISTALTERNATETRAVELLERTYPEType createLISTALTERNATETRAVELLERTYPEType() {
        return new LISTALTERNATETRAVELLERTYPEType();
    }

    /**
     * Create an instance of {@link LISTALTERNATETRAVELLERType }
     * 
     */
    public LISTALTERNATETRAVELLERType createLISTALTERNATETRAVELLERType() {
        return new LISTALTERNATETRAVELLERType();
    }

    /**
     * Create an instance of {@link ALTERNATECONVERTEDBALANCEType }
     * 
     */
    public ALTERNATECONVERTEDBALANCEType createALTERNATECONVERTEDBALANCEType() {
        return new ALTERNATECONVERTEDBALANCEType();
    }

    /**
     * Create an instance of {@link LISTBOUNDType }
     * 
     */
    public LISTBOUNDType createLISTBOUNDType() {
        return new LISTBOUNDType();
    }

    /**
     * Create an instance of {@link LISTONHOLDCITIESTIMELIMITType }
     * 
     */
    public LISTONHOLDCITIESTIMELIMITType createLISTONHOLDCITIESTIMELIMITType() {
        return new LISTONHOLDCITIESTIMELIMITType();
    }

    /**
     * Create an instance of {@link TYPEDBAGGAGEALLOWANCEType }
     * 
     */
    public TYPEDBAGGAGEALLOWANCEType createTYPEDBAGGAGEALLOWANCEType() {
        return new TYPEDBAGGAGEALLOWANCEType();
    }

    /**
     * Create an instance of {@link BasicTransportSegmentType }
     * 
     */
    public BasicTransportSegmentType createBasicTransportSegmentType() {
        return new BasicTransportSegmentType();
    }

    /**
     * Create an instance of {@link CityType }
     * 
     */
    public CityType createCityType() {
        return new CityType();
    }

    /**
     * Create an instance of {@link FARECOMPONENTType }
     * 
     */
    public FARECOMPONENTType createFARECOMPONENTType() {
        return new FARECOMPONENTType();
    }

    /**
     * Create an instance of {@link SEGMENTRESPONSEType.SEGMENT }
     * 
     */
    public SEGMENTRESPONSEType.SEGMENT createSEGMENTRESPONSETypeSEGMENT() {
        return new SEGMENTRESPONSEType.SEGMENT();
    }

    /**
     * Create an instance of {@link ServiceInfoType.MONETARYAMOUNT }
     * 
     */
    public ServiceInfoType.MONETARYAMOUNT createServiceInfoTypeMONETARYAMOUNT() {
        return new ServiceInfoType.MONETARYAMOUNT();
    }

    /**
     * Create an instance of {@link LISTFAREFAMILYDESCSEGMENTType.LISTSEGMENTID }
     * 
     */
    public LISTFAREFAMILYDESCSEGMENTType.LISTSEGMENTID createLISTFAREFAMILYDESCSEGMENTTypeLISTSEGMENTID() {
        return new LISTFAREFAMILYDESCSEGMENTType.LISTSEGMENTID();
    }

    /**
     * Create an instance of {@link TicketingTimeLimitType.MESSAGE }
     * 
     */
    public TicketingTimeLimitType.MESSAGE createTicketingTimeLimitTypeMESSAGE() {
        return new TicketingTimeLimitType.MESSAGE();
    }

    /**
     * Create an instance of {@link TicketImageType.PRICEDTRAVELLERTYPE }
     * 
     */
    public TicketImageType.PRICEDTRAVELLERTYPE createTicketImageTypePRICEDTRAVELLERTYPE() {
        return new TicketImageType.PRICEDTRAVELLERTYPE();
    }

    /**
     * Create an instance of {@link TicketImageType.ADDITIONALPRICINGINFO }
     * 
     */
    public TicketImageType.ADDITIONALPRICINGINFO createTicketImageTypeADDITIONALPRICINGINFO() {
        return new TicketImageType.ADDITIONALPRICINGINFO();
    }

    /**
     * Create an instance of {@link TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.ADDITIONALPRICINGINFO }
     * 
     */
    public TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.ADDITIONALPRICINGINFO createTicketImageTypeLISTTRAVELLERFARETRAVELLERINFOADDITIONALPRICINGINFO() {
        return new TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.ADDITIONALPRICINGINFO();
    }

    /**
     * Create an instance of {@link TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.OWNERACCOUNTIDENTITY }
     * 
     */
    public TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.OWNERACCOUNTIDENTITY createTicketImageTypeLISTTRAVELLERFARETRAVELLERINFOOWNERACCOUNTIDENTITY() {
        return new TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.OWNERACCOUNTIDENTITY();
    }

    /**
     * Create an instance of {@link TicketImageType.LISTTAX.TAXDETAIL.LISTLOCATIONDETAIL }
     * 
     */
    public TicketImageType.LISTTAX.TAXDETAIL.LISTLOCATIONDETAIL createTicketImageTypeLISTTAXTAXDETAILLISTLOCATIONDETAIL() {
        return new TicketImageType.LISTTAX.TAXDETAIL.LISTLOCATIONDETAIL();
    }

    /**
     * Create an instance of {@link TicketSegmentType.FARESEGMENTINFO.INDICATORS }
     * 
     */
    public TicketSegmentType.FARESEGMENTINFO.INDICATORS createTicketSegmentTypeFARESEGMENTINFOINDICATORS() {
        return new TicketSegmentType.FARESEGMENTINFO.INDICATORS();
    }

    /**
     * Create an instance of {@link ONHOLDINFORMATIONType.ONHOLDTIMELIMIT }
     * 
     */
    public ONHOLDINFORMATIONType.ONHOLDTIMELIMIT createONHOLDINFORMATIONTypeONHOLDTIMELIMIT() {
        return new ONHOLDINFORMATIONType.ONHOLDTIMELIMIT();
    }

    /**
     * Create an instance of {@link ALTERNATEBALANCEType.LISTALTERNATEBOUNDBALANCE }
     * 
     */
    public ALTERNATEBALANCEType.LISTALTERNATEBOUNDBALANCE createALTERNATEBALANCETypeLISTALTERNATEBOUNDBALANCE() {
        return new ALTERNATEBALANCEType.LISTALTERNATEBOUNDBALANCE();
    }

    /**
     * Create an instance of {@link FARECOMMONType.TRAVELSPONSOR }
     * 
     */
    public FARECOMMONType.TRAVELSPONSOR createFARECOMMONTypeTRAVELSPONSOR() {
        return new FARECOMMONType.TRAVELSPONSOR();
    }

    /**
     * Create an instance of {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.SELECTION }
     * 
     */
    public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.SELECTION createFARECOMMONTypeLISTPANELSTATISTICSSTATISTICSSELECTION() {
        return new FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.SELECTION();
    }

    /**
     * Create an instance of {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTFARES }
     * 
     */
    public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTFARES createFARECOMMONTypeLISTPANELSTATISTICSSTATISTICSPANELLOWESTFARES() {
        return new FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTFARES();
    }

    /**
     * Create an instance of {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTCONVERTEDMILES }
     * 
     */
    public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTCONVERTEDMILES createFARECOMMONTypeLISTPANELSTATISTICSSTATISTICSPANELLOWESTCONVERTEDMILES() {
        return new FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTCONVERTEDMILES();
    }

    /**
     * Create an instance of {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTFARES }
     * 
     */
    public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTFARES createFARECOMMONTypeLISTPANELSTATISTICSSTATISTICSPANELHIGHESTFARES() {
        return new FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTFARES();
    }

    /**
     * Create an instance of {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTCONVERTEDMILES }
     * 
     */
    public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTCONVERTEDMILES createFARECOMMONTypeLISTPANELSTATISTICSSTATISTICSPANELHIGHESTCONVERTEDMILES() {
        return new FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTCONVERTEDMILES();
    }

    /**
     * Create an instance of {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.RECOMMENDATIONCOUNT }
     * 
     */
    public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.RECOMMENDATIONCOUNT createFARECOMMONTypeLISTPANELSTATISTICSSTATISTICSPANELRECOMMENDATIONCOUNT() {
        return new FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.RECOMMENDATIONCOUNT();
    }

    /**
     * Create an instance of {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.SOLUTIONCOUNT }
     * 
     */
    public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.SOLUTIONCOUNT createFARECOMMONTypeLISTPANELSTATISTICSSTATISTICSPANELSOLUTIONCOUNT() {
        return new FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.SOLUTIONCOUNT();
    }

    /**
     * Create an instance of {@link FARECOMMONType.LISTPANELSTATISTICS.PANELINFO.ELEMENT }
     * 
     */
    public FARECOMMONType.LISTPANELSTATISTICS.PANELINFO.ELEMENT createFARECOMMONTypeLISTPANELSTATISTICSPANELINFOELEMENT() {
        return new FARECOMMONType.LISTPANELSTATISTICS.PANELINFO.ELEMENT();
    }

    /**
     * Create an instance of {@link TRIPFAREType.REFERENCEPNR }
     * 
     */
    public TRIPFAREType.REFERENCEPNR createTRIPFARETypeREFERENCEPNR() {
        return new TRIPFAREType.REFERENCEPNR();
    }

    /**
     * Create an instance of {@link FareFamilyDescType.ORIGINDESTINATION }
     * 
     */
    public FareFamilyDescType.ORIGINDESTINATION createFareFamilyDescTypeORIGINDESTINATION() {
        return new FareFamilyDescType.ORIGINDESTINATION();
    }

    /**
     * Create an instance of {@link LISTFARECONTEXTType.OVERRIDE.LISTCORPORATENUMBER }
     * 
     */
    public LISTFARECONTEXTType.OVERRIDE.LISTCORPORATENUMBER createLISTFARECONTEXTTypeOVERRIDELISTCORPORATENUMBER() {
        return new LISTFARECONTEXTType.OVERRIDE.LISTCORPORATENUMBER();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DISCOUNT_CODE")
    public JAXBElement<String> createDISCOUNTCODE(String value) {
        return new JAXBElement<String>(_DISCOUNTCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FIELD_ERROR")
    public JAXBElement<String> createLISTFIELDERROR(String value) {
        return new JAXBElement<String>(_LISTFIELDERROR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXCHANGE_RATE")
    public JAXBElement<BigDecimal> createEXCHANGERATE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EXCHANGERATE_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DIRECT_LOGIN")
    public JAXBElement<String> createDIRECTLOGIN(String value) {
        return new JAXBElement<String>(_DIRECTLOGIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DIRECT_LOGIN_AGENT")
    public JAXBElement<String> createDIRECTLOGINAGENT(String value) {
        return new JAXBElement<String>(_DIRECTLOGINAGENT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXTERNAL_LOGIN")
    public JAXBElement<String> createEXTERNALLOGIN(String value) {
        return new JAXBElement<String>(_EXTERNALLOGIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXTERNAL_DIRECT_LOGIN")
    public JAXBElement<String> createEXTERNALDIRECTLOGIN(String value) {
        return new JAXBElement<String>(_EXTERNALDIRECTLOGIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_STRUCTURED_XML")
    public JAXBElement<String> createISSTRUCTUREDXML(String value) {
        return new JAXBElement<String>(_ISSTRUCTUREDXML_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NUMBER_OF_PROFILES")
    public JAXBElement<BigInteger> createNUMBEROFPROFILES(BigInteger value) {
        return new JAXBElement<BigInteger>(_NUMBEROFPROFILES_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OFFICE_ID")
    public JAXBElement<String> createOFFICEID(String value) {
        return new JAXBElement<String>(_OFFICEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRIP_REASON_CODE")
    public JAXBElement<String> createTRIPREASONCODE(String value) {
        return new JAXBElement<String>(_TRIPREASONCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOOL_IS_OUT_OF_POLICY")
    public JAXBElement<Boolean> createBOOLISOUTOFPOLICY(Boolean value) {
        return new JAXBElement<Boolean>(_BOOLISOUTOFPOLICY_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DISPLAY_RANK")
    public JAXBElement<String> createDISPLAYRANK(String value) {
        return new JAXBElement<String>(_DISPLAYRANK_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PAGE_TICKET")
    public JAXBElement<String> createPAGETICKET(String value) {
        return new JAXBElement<String>(_PAGETICKET_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTRIPREASONtype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRIP_REASON")
    public JAXBElement<LISTTRIPREASONtype> createLISTTRIPREASON(LISTTRIPREASONtype value) {
        return new JAXBElement<LISTTRIPREASONtype>(_LISTTRIPREASON_QNAME, LISTTRIPREASONtype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RELATIONSHIP")
    public JAXBElement<String> createRELATIONSHIP(String value) {
        return new JAXBElement<String>(_RELATIONSHIP_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OPERATIONAL_DATA")
    public JAXBElement<OperationalDataType> createOPERATIONALDATA(OperationalDataType value) {
        return new JAXBElement<OperationalDataType>(_OPERATIONALDATA_QNAME, OperationalDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MORE_INFORMATION_AVAILABLE")
    public JAXBElement<Boolean> createMOREINFORMATIONAVAILABLE(Boolean value) {
        return new JAXBElement<Boolean>(_MOREINFORMATIONAVAILABLE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDSCABINCODEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AIR_GDS_CABIN_CODE")
    public JAXBElement<GDSCABINCODEType> createAIRGDSCABINCODE(GDSCABINCODEType value) {
        return new JAXBElement<GDSCABINCODEType>(_AIRGDSCABINCODE_QNAME, GDSCABINCODEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FLIGHTPREFERENCEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FLIGHT_PREFERENCE")
    public JAXBElement<FLIGHTPREFERENCEType> createLISTFLIGHTPREFERENCE(FLIGHTPREFERENCEType value) {
        return new JAXBElement<FLIGHTPREFERENCEType>(_LISTFLIGHTPREFERENCE_QNAME, FLIGHTPREFERENCEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SEVEN_DAY_SEARCH")
    public JAXBElement<Boolean> createSEVENDAYSEARCH(Boolean value) {
        return new JAXBElement<Boolean>(_SEVENDAYSEARCH_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HAS_INFANT")
    public JAXBElement<Boolean> createHASINFANT(Boolean value) {
        return new JAXBElement<Boolean>(_HASINFANT_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TITLE")
    public JAXBElement<String> createTITLE(String value) {
        return new JAXBElement<String>(_TITLE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FIRST_NAME")
    public JAXBElement<String> createFIRSTNAME(String value) {
        return new JAXBElement<String>(_FIRSTNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LAST_NAME")
    public JAXBElement<String> createLASTNAME(String value) {
        return new JAXBElement<String>(_LASTNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRAVELLER_ID")
    public JAXBElement<BigInteger> createTRAVELLERID(BigInteger value) {
        return new JAXBElement<BigInteger>(_TRAVELLERID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REFERENCE")
    public JAXBElement<BigInteger> createREFERENCE(BigInteger value) {
        return new JAXBElement<BigInteger>(_REFERENCE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DATE_OF_BIRTH")
    public JAXBElement<String> createDATEOFBIRTH(String value) {
        return new JAXBElement<String>(_DATEOFBIRTH_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRAVELLER_EXTERNAL_ID")
    public JAXBElement<BigInteger> createTRAVELLEREXTERNALID(BigInteger value) {
        return new JAXBElement<BigInteger>(_TRAVELLEREXTERNALID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_CUMULATIVE_DISCOUNT")
    public JAXBElement<Boolean> createISCUMULATIVEDISCOUNT(Boolean value) {
        return new JAXBElement<Boolean>(_ISCUMULATIVEDISCOUNT_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListResidentDiscountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_RESIDENT_DISCOUNT")
    public JAXBElement<ListResidentDiscountType> createLISTRESIDENTDISCOUNT(ListResidentDiscountType value) {
        return new JAXBElement<ListResidentDiscountType>(_LISTRESIDENTDISCOUNT_QNAME, ListResidentDiscountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDiscountCredentialsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_DISCOUNT_CREDENTIALS")
    public JAXBElement<ListDiscountCredentialsType> createLISTDISCOUNTCREDENTIALS(ListDiscountCredentialsType value) {
        return new JAXBElement<ListDiscountCredentialsType>(_LISTDISCOUNTCREDENTIALS_QNAME, ListDiscountCredentialsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CEM_ID")
    public JAXBElement<String> createCEMID(String value) {
        return new JAXBElement<String>(_CEMID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CEM_AIRLINE_CODE")
    public JAXBElement<String> createCEMAIRLINECODE(String value) {
        return new JAXBElement<String>(_CEMAIRLINECODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COMMAND_EXECUTION_STATUS")
    public JAXBElement<String> createCOMMANDEXECUTIONSTATUS(String value) {
        return new JAXBElement<String>(_COMMANDEXECUTIONSTATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARING_COMMAND_ID")
    public JAXBElement<BigInteger> createFARINGCOMMANDID(BigInteger value) {
        return new JAXBElement<BigInteger>(_FARINGCOMMANDID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TYPE_OF_FARE")
    public JAXBElement<BigInteger> createTYPEOFFARE(BigInteger value) {
        return new JAXBElement<BigInteger>(_TYPEOFFARE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICING_WITH_PUBLISHED_MILES")
    public JAXBElement<Boolean> createPRICINGWITHPUBLISHEDMILES(Boolean value) {
        return new JAXBElement<Boolean>(_PRICINGWITHPUBLISHEDMILES_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MILES_PUBLISHING_AIRLINE")
    public JAXBElement<String> createMILESPUBLISHINGAIRLINE(String value) {
        return new JAXBElement<String>(_MILESPUBLISHINGAIRLINE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_UPGRADE")
    public JAXBElement<Boolean> createISUPGRADE(Boolean value) {
        return new JAXBElement<Boolean>(_ISUPGRADE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POINT_OF_SALE")
    public JAXBElement<String> createPOINTOFSALE(String value) {
        return new JAXBElement<String>(_POINTOFSALE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POINT_OF_TICKETING")
    public JAXBElement<String> createPOINTOFTICKETING(String value) {
        return new JAXBElement<String>(_POINTOFTICKETING_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TYPE_OF_CORPORATE_FARE")
    public JAXBElement<BigInteger> createTYPEOFCORPORATEFARE(BigInteger value) {
        return new JAXBElement<BigInteger>(_TYPEOFCORPORATEFARE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CUSTOMER_IDENTIFIER")
    public JAXBElement<String> createCUSTOMERIDENTIFIER(String value) {
        return new JAXBElement<String>(_CUSTOMERIDENTIFIER_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICING_OPTIONS_ID")
    public JAXBElement<BigInteger> createPRICINGOPTIONSID(BigInteger value) {
        return new JAXBElement<BigInteger>(_PRICINGOPTIONSID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NVA")
    public JAXBElement<String> createNVA(String value) {
        return new JAXBElement<String>(_NVA_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NVB")
    public JAXBElement<String> createNVB(String value) {
        return new JAXBElement<String>(_NVB_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALL_INCLUSIVE")
    public JAXBElement<Boolean> createALLINCLUSIVE(Boolean value) {
        return new JAXBElement<Boolean>(_ALLINCLUSIVE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FEEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FEE")
    public JAXBElement<FEEType> createLISTFEE(FEEType value) {
        return new JAXBElement<FEEType>(_LISTFEE_QNAME, FEEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPLICABLEFEEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_APPLICABLE_MARKUP_DISCOUNT")
    public JAXBElement<APPLICABLEFEEType> createLISTAPPLICABLEMARKUPDISCOUNT(APPLICABLEFEEType value) {
        return new JAXBElement<APPLICABLEFEEType>(_LISTAPPLICABLEMARKUPDISCOUNT_QNAME, APPLICABLEFEEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPLICABLEFEEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_APPLICABLE_FEE")
    public JAXBElement<APPLICABLEFEEType> createLISTAPPLICABLEFEE(APPLICABLEFEEType value) {
        return new JAXBElement<APPLICABLEFEEType>(_LISTAPPLICABLEFEE_QNAME, APPLICABLEFEEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ESTIMATED_DISCOUNT_AMOUNT")
    public JAXBElement<BigDecimal> createESTIMATEDDISCOUNTAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ESTIMATEDDISCOUNTAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MILES_COST")
    public JAXBElement<BigInteger> createMILESCOST(BigInteger value) {
        return new JAXBElement<BigInteger>(_MILESCOST_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVAILDATASOURCEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AVAIL_DATA_SOURCE")
    public JAXBElement<AVAILDATASOURCEType> createAVAILDATASOURCE(AVAILDATASOURCEType value) {
        return new JAXBElement<AVAILDATASOURCEType>(_AVAILDATASOURCE_QNAME, AVAILDATASOURCEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RECOMM_REF")
    public JAXBElement<BigInteger> createRECOMMREF(BigInteger value) {
        return new JAXBElement<BigInteger>(_RECOMMREF_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AMOUNT_TO_SUM")
    public JAXBElement<BigDecimal> createAMOUNTTOSUM(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AMOUNTTOSUM_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AMOUNT_TO_MAX")
    public JAXBElement<BigDecimal> createAMOUNTTOMAX(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AMOUNTTOMAX_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AMOUNT")
    public JAXBElement<BigDecimal> createAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AMOUNT_WITHOUT_TAX")
    public JAXBElement<BigDecimal> createAMOUNTWITHOUTTAX(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AMOUNTWITHOUTTAX_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TAX")
    public JAXBElement<BigDecimal> createTAX(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TAX_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TAX_PAID")
    public JAXBElement<BigDecimal> createTAXPAID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TAXPAID_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REBOOKFEEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REBOOK_FEE")
    public JAXBElement<REBOOKFEEType> createREBOOKFEE(REBOOKFEEType value) {
        return new JAXBElement<REBOOKFEEType>(_REBOOKFEE_QNAME, REBOOKFEEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REBOOKFEEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NO_SHOW_FEE")
    public JAXBElement<REBOOKFEEType> createNOSHOWFEE(REBOOKFEEType value) {
        return new JAXBElement<REBOOKFEEType>(_NOSHOWFEE_QNAME, REBOOKFEEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICED_PAX_ONLY")
    public JAXBElement<Boolean> createPRICEDPAXONLY(Boolean value) {
        return new JAXBElement<Boolean>(_PRICEDPAXONLY_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REISSUE_STATUS")
    public JAXBElement<String> createREISSUESTATUS(String value) {
        return new JAXBElement<String>(_REISSUESTATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOTAL_AMOUNT")
    public JAXBElement<BigDecimal> createTOTALAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TOTALAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTAXType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_DISPLAY_TAX")
    public JAXBElement<LISTTAXType> createLISTDISPLAYTAX(LISTTAXType value) {
        return new JAXBElement<LISTTAXType>(_LISTDISPLAYTAX_QNAME, LISTTAXType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CONVERTED_CASH_MILES")
    public JAXBElement<BigInteger> createCONVERTEDCASHMILES(BigInteger value) {
        return new JAXBElement<BigInteger>(_CONVERTEDCASHMILES_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MINIMUM_MILES_COST")
    public JAXBElement<BigInteger> createMINIMUMMILESCOST(BigInteger value) {
        return new JAXBElement<BigInteger>(_MINIMUMMILESCOST_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MILESANDCASHCOSTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MILES_AND_CASH_COST")
    public JAXBElement<MILESANDCASHCOSTType> createMILESANDCASHCOST(MILESANDCASHCOSTType value) {
        return new JAXBElement<MILESANDCASHCOSTType>(_MILESANDCASHCOST_QNAME, MILESANDCASHCOSTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COLLECTION_INFO")
    public JAXBElement<CollectionInfoType> createCOLLECTIONINFO(CollectionInfoType value) {
        return new JAXBElement<CollectionInfoType>(_COLLECTIONINFO_QNAME, CollectionInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOUND_TO_MODIFY")
    public JAXBElement<Boolean> createBOUNDTOMODIFY(Boolean value) {
        return new JAXBElement<Boolean>(_BOUNDTOMODIFY_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SEGMENT_TATTOO")
    public JAXBElement<BigInteger> createSEGMENTTATTOO(BigInteger value) {
        return new JAXBElement<BigInteger>(_SEGMENTTATTOO_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOOL_FLOWN")
    public JAXBElement<Boolean> createBOOLFLOWN(Boolean value) {
        return new JAXBElement<Boolean>(_BOOLFLOWN_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LINE_NUMBER")
    public JAXBElement<BigInteger> createLINENUMBER(BigInteger value) {
        return new JAXBElement<BigInteger>(_LINENUMBER_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REVALIDATION_INDICATOR")
    public JAXBElement<Boolean> createREVALIDATIONINDICATOR(Boolean value) {
        return new JAXBElement<Boolean>(_REVALIDATIONINDICATOR_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FAREFAMILYFareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_FAMILY")
    public JAXBElement<FAREFAMILYFareType> createFAREFAMILY(FAREFAMILYFareType value) {
        return new JAXBElement<FAREFAMILYFareType>(_FAREFAMILY_QNAME, FAREFAMILYFareType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HIGHLIGHT")
    public JAXBElement<Boolean> createHIGHLIGHT(Boolean value) {
        return new JAXBElement<Boolean>(_HIGHLIGHT_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ITEM_ID")
    public JAXBElement<BigInteger> createITEMID(BigInteger value) {
        return new JAXBElement<BigInteger>(_ITEMID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MODIFICATION_STATUS")
    public JAXBElement<String> createMODIFICATIONSTATUS(String value) {
        return new JAXBElement<String>(_MODIFICATIONSTATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "B_ANY_TIME")
    public JAXBElement<Boolean> createBANYTIME(Boolean value) {
        return new JAXBElement<Boolean>(_BANYTIME_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TR_FLIGHTS")
    public JAXBElement<Boolean> createTRFLIGHTS(Boolean value) {
        return new JAXBElement<Boolean>(_TRFLIGHTS_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AIRLINE_BIAS")
    public JAXBElement<String> createAIRLINEBIAS(String value) {
        return new JAXBElement<String>(_AIRLINEBIAS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCHEDULE")
    public JAXBElement<Boolean> createSCHEDULE(Boolean value) {
        return new JAXBElement<Boolean>(_SCHEDULE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SEGMENT_FLIGHT_TIME")
    public JAXBElement<BigInteger> createSEGMENTFLIGHTTIME(BigInteger value) {
        return new JAXBElement<BigInteger>(_SEGMENTFLIGHTTIME_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AIRLINEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AIRLINE")
    public JAXBElement<AIRLINEType> createAIRLINE(AIRLINEType value) {
        return new JAXBElement<AIRLINEType>(_AIRLINE_QNAME, AIRLINEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AIRLINEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OTHER_AIRLINE")
    public JAXBElement<AIRLINEType> createOTHERAIRLINE(AIRLINEType value) {
        return new JAXBElement<AIRLINEType>(_OTHERAIRLINE_QNAME, AIRLINEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLIGHT_NUMBER")
    public JAXBElement<String> createFLIGHTNUMBER(String value) {
        return new JAXBElement<String>(_FLIGHTNUMBER_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "B_TERMINAL")
    public JAXBElement<String> createBTERMINAL(String value) {
        return new JAXBElement<String>(_BTERMINAL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "E_TERMINAL")
    public JAXBElement<String> createETERMINAL(String value) {
        return new JAXBElement<String>(_ETERMINAL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "B_DAY_INDICATOR")
    public JAXBElement<BigInteger> createBDAYINDICATOR(BigInteger value) {
        return new JAXBElement<BigInteger>(_BDAYINDICATOR_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "E_DAY_INDICATOR")
    public JAXBElement<BigInteger> createEDAYINDICATOR(BigInteger value) {
        return new JAXBElement<BigInteger>(_EDAYINDICATOR_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ETD_DAY_INDICATOR")
    public JAXBElement<BigInteger> createETDDAYINDICATOR(BigInteger value) {
        return new JAXBElement<BigInteger>(_ETDDAYINDICATOR_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ETA_DAY_INDICATOR")
    public JAXBElement<BigInteger> createETADAYINDICATOR(BigInteger value) {
        return new JAXBElement<BigInteger>(_ETADAYINDICATOR_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRAFFIC_RESTRICTION")
    public JAXBElement<Boolean> createTRAFFICRESTRICTION(Boolean value) {
        return new JAXBElement<Boolean>(_TRAFFICRESTRICTION_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ON_TIME_PERFORMANCE")
    public JAXBElement<BigInteger> createONTIMEPERFORMANCE(BigInteger value) {
        return new JAXBElement<BigInteger>(_ONTIMEPERFORMANCE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IRREGULARITY")
    public JAXBElement<Boolean> createIRREGULARITY(Boolean value) {
        return new JAXBElement<Boolean>(_IRREGULARITY_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OP_FLAG")
    public JAXBElement<Boolean> createOPFLAG(Boolean value) {
        return new JAXBElement<Boolean>(_OPFLAG_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACCESS_LEVEL")
    public JAXBElement<String> createACCESSLEVEL(String value) {
        return new JAXBElement<String>(_ACCESSLEVEL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "E_TICKETING")
    public JAXBElement<Boolean> createETICKETING(Boolean value) {
        return new JAXBElement<Boolean>(_ETICKETING_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NUMBER_OF_STOPS")
    public JAXBElement<BigInteger> createNUMBEROFSTOPS(BigInteger value) {
        return new JAXBElement<BigInteger>(_NUMBEROFSTOPS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLIGHT_TIME")
    public JAXBElement<BigInteger> createFLIGHTTIME(BigInteger value) {
        return new JAXBElement<BigInteger>(_FLIGHTTIME_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTLEGType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_LEG")
    public JAXBElement<LISTLEGType> createLISTLEG(LISTLEGType value) {
        return new JAXBElement<LISTLEGType>(_LISTLEG_QNAME, LISTLEGType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOOKABLE")
    public JAXBElement<Boolean> createBOOKABLE(Boolean value) {
        return new JAXBElement<Boolean>(_BOOKABLE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MEAL")
    public JAXBElement<Boolean> createMEAL(Boolean value) {
        return new JAXBElement<Boolean>(_MEAL_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ENTERTAIMENT")
    public JAXBElement<Boolean> createENTERTAIMENT(Boolean value) {
        return new JAXBElement<Boolean>(_ENTERTAIMENT_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EQUIPMENT_CHANGE")
    public JAXBElement<Boolean> createEQUIPMENTCHANGE(Boolean value) {
        return new JAXBElement<Boolean>(_EQUIPMENTCHANGE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TIME_CHANGE")
    public JAXBElement<Boolean> createTIMECHANGE(Boolean value) {
        return new JAXBElement<Boolean>(_TIMECHANGE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LAST_SEAT_AVAILABILITY")
    public JAXBElement<Boolean> createLASTSEATAVAILABILITY(Boolean value) {
        return new JAXBElement<Boolean>(_LASTSEATAVAILABILITY_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CODE_SHARE_INDICATOR")
    public JAXBElement<String> createCODESHAREINDICATOR(String value) {
        return new JAXBElement<String>(_CODESHAREINDICATOR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTCABINType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_CABIN")
    public JAXBElement<LISTCABINType> createLISTCABIN(LISTCABINType value) {
        return new JAXBElement<LISTCABINType>(_LISTCABIN_QNAME, LISTCABINType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATUS")
    public JAXBElement<String> createSTATUS(String value) {
        return new JAXBElement<String>(_STATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOOKEDTRIPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOOKED_TRIP")
    public JAXBElement<BOOKEDTRIPType> createBOOKEDTRIP(BOOKEDTRIPType value) {
        return new JAXBElement<BOOKEDTRIPType>(_BOOKEDTRIP_QNAME, BOOKEDTRIPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTREDEMPTIONType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_REDEMPTION")
    public JAXBElement<LISTREDEMPTIONType> createLISTREDEMPTION(LISTREDEMPTIONType value) {
        return new JAXBElement<LISTREDEMPTIONType>(_LISTREDEMPTION_QNAME, LISTREDEMPTIONType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDENTITYINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IDENTITY_INFORMATION")
    public JAXBElement<IDENTITYINFORMATIONTYPE> createIDENTITYINFORMATION(IDENTITYINFORMATIONTYPE value) {
        return new JAXBElement<IDENTITYINFORMATIONTYPE>(_IDENTITYINFORMATION_QNAME, IDENTITYINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NOTIFICATIONINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_NOTIFICATION_INFORMATION")
    public JAXBElement<NOTIFICATIONINFORMATIONTYPE> createLISTNOTIFICATIONINFORMATION(NOTIFICATIONINFORMATIONTYPE value) {
        return new JAXBElement<NOTIFICATIONINFORMATIONTYPE>(_LISTNOTIFICATIONINFORMATION_QNAME, NOTIFICATIONINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ADDRESSINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_ADDRESS_INFORMATION")
    public JAXBElement<ADDRESSINFORMATIONTYPE> createLISTADDRESSINFORMATION(ADDRESSINFORMATIONTYPE value) {
        return new JAXBElement<ADDRESSINFORMATIONTYPE>(_LISTADDRESSINFORMATION_QNAME, ADDRESSINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CREDITCARDINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_CREDIT_CARD_INFORMATION")
    public JAXBElement<CREDITCARDINFORMATIONTYPE> createLISTCREDITCARDINFORMATION(CREDITCARDINFORMATIONTYPE value) {
        return new JAXBElement<CREDITCARDINFORMATIONTYPE>(_LISTCREDITCARDINFORMATION_QNAME, CREDITCARDINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GOVERNMENTPAYMENTINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_GOVERNMENT_PAYMENT_INFORMATION")
    public JAXBElement<GOVERNMENTPAYMENTINFORMATIONTYPE> createLISTGOVERNMENTPAYMENTINFORMATION(GOVERNMENTPAYMENTINFORMATIONTYPE value) {
        return new JAXBElement<GOVERNMENTPAYMENTINFORMATIONTYPE>(_LISTGOVERNMENTPAYMENTINFORMATION_QNAME, GOVERNMENTPAYMENTINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BANKACCOUNTINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_BANK_ACCOUNT_INFORMATION")
    public JAXBElement<BANKACCOUNTINFORMATIONTYPE> createLISTBANKACCOUNTINFORMATION(BANKACCOUNTINFORMATIONTYPE value) {
        return new JAXBElement<BANKACCOUNTINFORMATIONTYPE>(_LISTBANKACCOUNTINFORMATION_QNAME, BANKACCOUNTINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBANKVOUCHERINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_EBANK_VOUCHER_INFORMATION")
    public JAXBElement<EBANKVOUCHERINFORMATIONTYPE> createLISTEBANKVOUCHERINFORMATION(EBANKVOUCHERINFORMATIONTYPE value) {
        return new JAXBElement<EBANKVOUCHERINFORMATIONTYPE>(_LISTEBANKVOUCHERINFORMATION_QNAME, EBANKVOUCHERINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CHECKINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_CHECK_INFORMATION")
    public JAXBElement<CHECKINFORMATIONTYPE> createLISTCHECKINFORMATION(CHECKINFORMATIONTYPE value) {
        return new JAXBElement<CHECKINFORMATIONTYPE>(_LISTCHECKINFORMATION_QNAME, CHECKINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VOUCHERACCOUNTINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_VOUCHER_ACCOUNT_INFORMATION")
    public JAXBElement<VOUCHERACCOUNTINFORMATIONTYPE> createLISTVOUCHERACCOUNTINFORMATION(VOUCHERACCOUNTINFORMATIONTYPE value) {
        return new JAXBElement<VOUCHERACCOUNTINFORMATIONTYPE>(_LISTVOUCHERACCOUNTINFORMATION_QNAME, VOUCHERACCOUNTINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_USER_LOGGED_IN")
    public JAXBElement<Boolean> createISUSERLOGGEDIN(Boolean value) {
        return new JAXBElement<Boolean>(_ISUSERLOGGEDIN_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDENTITYINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INFANT")
    public JAXBElement<IDENTITYINFORMATIONTYPE> createINFANT(IDENTITYINFORMATIONTYPE value) {
        return new JAXBElement<IDENTITYINFORMATIONTYPE>(_INFANT_QNAME, IDENTITYINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CONTACTPOINTTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_CONTACT_POINT")
    public JAXBElement<CONTACTPOINTTYPE> createLISTCONTACTPOINT(CONTACTPOINTTYPE value) {
        return new JAXBElement<CONTACTPOINTTYPE>(_LISTCONTACTPOINT_QNAME, CONTACTPOINTTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CONTACTPOINTTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_CONTACT_POINT_PASSENGER")
    public JAXBElement<CONTACTPOINTTYPE> createLISTCONTACTPOINTPASSENGER(CONTACTPOINTTYPE value) {
        return new JAXBElement<CONTACTPOINTTYPE>(_LISTCONTACTPOINTPASSENGER_QNAME, CONTACTPOINTTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDENTITYDOCUMENTTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_IDENTITY_DOCUMENT")
    public JAXBElement<IDENTITYDOCUMENTTYPE> createLISTIDENTITYDOCUMENT(IDENTITYDOCUMENTTYPE value) {
        return new JAXBElement<IDENTITYDOCUMENTTYPE>(_LISTIDENTITYDOCUMENT_QNAME, IDENTITYDOCUMENTTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CREATION_MODE")
    public JAXBElement<BigInteger> createCREATIONMODE(BigInteger value) {
        return new JAXBElement<BigInteger>(_CREATIONMODE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FLOWSIGNATUREType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLOW_SIGNATURE")
    public JAXBElement<FLOWSIGNATUREType> createFLOWSIGNATURE(FLOWSIGNATUREType value) {
        return new JAXBElement<FLOWSIGNATUREType>(_FLOWSIGNATURE_QNAME, FLOWSIGNATUREType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICING_TYPE")
    public JAXBElement<String> createPRICINGTYPE(String value) {
        return new JAXBElement<String>(_PRICINGTYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_REDEMPTION_REMARK")
    public JAXBElement<String> createLISTREDEMPTIONREMARK(String value) {
        return new JAXBElement<String>(_LISTREDEMPTIONREMARK_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RESTRICTION")
    public JAXBElement<Boolean> createRESTRICTION(Boolean value) {
        return new JAXBElement<Boolean>(_RESTRICTION_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRIP_TYPE")
    public JAXBElement<String> createTRIPTYPE(String value) {
        return new JAXBElement<String>(_TRIPTYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAMILY_FARE")
    public JAXBElement<Boolean> createFAMILYFARE(Boolean value) {
        return new JAXBElement<Boolean>(_FAMILYFARE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TYPE_OF_FARE_AIR")
    public JAXBElement<BigInteger> createTYPEOFFAREAIR(BigInteger value) {
        return new JAXBElement<BigInteger>(_TYPEOFFAREAIR_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_PRIMARY_TRAVELLER")
    public JAXBElement<Boolean> createISPRIMARYTRAVELLER(Boolean value) {
        return new JAXBElement<Boolean>(_ISPRIMARYTRAVELLER_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NUMBER")
    public JAXBElement<BigInteger> createNUMBER(BigInteger value) {
        return new JAXBElement<BigInteger>(_NUMBER_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_ID")
    public JAXBElement<BigInteger> createFAREID(BigInteger value) {
        return new JAXBElement<BigInteger>(_FAREID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PASS_CORPORATE_ID")
    public JAXBElement<BigInteger> createPASSCORPORATEID(BigInteger value) {
        return new JAXBElement<BigInteger>(_PASSCORPORATEID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AIR_RULE_ID")
    public JAXBElement<BigInteger> createAIRRULEID(BigInteger value) {
        return new JAXBElement<BigInteger>(_AIRRULEID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE_BY_INPUT_ID")
    public JAXBElement<BigInteger> createPRICEBYINPUTID(BigInteger value) {
        return new JAXBElement<BigInteger>(_PRICEBYINPUTID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_BY_BOUND")
    public JAXBElement<String> createFAREBYBOUND(String value) {
        return new JAXBElement<String>(_FAREBYBOUND_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRAVELERType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REQUESTED_TRAVELLER_TYPE")
    public JAXBElement<TRAVELERType> createREQUESTEDTRAVELLERTYPE(TRAVELERType value) {
        return new JAXBElement<TRAVELERType>(_REQUESTEDTRAVELLERTYPE_QNAME, TRAVELERType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TICKETINDICATORType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TICKET_INDICATOR")
    public JAXBElement<TICKETINDICATORType> createTICKETINDICATOR(TICKETINDICATORType value) {
        return new JAXBElement<TICKETINDICATORType>(_TICKETINDICATOR_QNAME, TICKETINDICATORType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FARETYPEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_TYPE")
    public JAXBElement<FARETYPEType> createFARETYPE(FARETYPEType value) {
        return new JAXBElement<FARETYPEType>(_FARETYPE_QNAME, FARETYPEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SERVICE_FEE_AMOUNT")
    public JAXBElement<BigDecimal> createSERVICEFEEAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SERVICEFEEAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SURCHARGES")
    public JAXBElement<BigDecimal> createSURCHARGES(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SURCHARGES_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TICKETTYPEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TICKET_TYPE")
    public JAXBElement<TICKETTYPEType> createLISTTICKETTYPE(TICKETTYPEType value) {
        return new JAXBElement<TICKETTYPEType>(_LISTTICKETTYPE_QNAME, TICKETTYPEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TICKETTYPEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TICKET_TYPE")
    public JAXBElement<TICKETTYPEType> createTICKETTYPE(TICKETTYPEType value) {
        return new JAXBElement<TICKETTYPEType>(_TICKETTYPE_QNAME, TICKETTYPEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MODType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_MOD")
    public JAXBElement<MODType> createLISTMOD(MODType value) {
        return new JAXBElement<MODType>(_LISTMOD_QNAME, MODType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FAREFLAGType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FARE_FLAG")
    public JAXBElement<FAREFLAGType> createLISTFAREFLAG(FAREFLAGType value) {
        return new JAXBElement<FAREFLAGType>(_LISTFAREFLAG_QNAME, FAREFLAGType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UPSOLDSEGMENTIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_UPSOLD_SEGMENT_ID")
    public JAXBElement<UPSOLDSEGMENTIDType> createLISTUPSOLDSEGMENTID(UPSOLDSEGMENTIDType value) {
        return new JAXBElement<UPSOLDSEGMENTIDType>(_LISTUPSOLDSEGMENTID_QNAME, UPSOLDSEGMENTIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_CATEGORY")
    public JAXBElement<String> createFARECATEGORY(String value) {
        return new JAXBElement<String>(_FARECATEGORY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTPRICEINFOType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_PRICE_INFO")
    public JAXBElement<LISTPRICEINFOType> createLISTPRICEINFO(LISTPRICEINFOType value) {
        return new JAXBElement<LISTPRICEINFOType>(_LISTPRICEINFO_QNAME, LISTPRICEINFOType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FORMAT")
    public JAXBElement<String> createFORMAT(String value) {
        return new JAXBElement<String>(_FORMAT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_COMMAND")
    public JAXBElement<BigInteger> createFARECOMMAND(BigInteger value) {
        return new JAXBElement<BigInteger>(_FARECOMMAND_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FARERBDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_RBD")
    public JAXBElement<FARERBDType> createLISTRBD(FARERBDType value) {
        return new JAXBElement<FARERBDType>(_LISTRBD_QNAME, FARERBDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OLD_PRICE")
    public JAXBElement<BigDecimal> createOLDPRICE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OLDPRICE_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BLUEBIZ_CREDITS")
    public JAXBElement<Float> createBLUEBIZCREDITS(Float value) {
        return new JAXBElement<Float>(_BLUEBIZCREDITS_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PTC_DISCOUNTED")
    public JAXBElement<Boolean> createPTCDISCOUNTED(Boolean value) {
        return new JAXBElement<Boolean>(_PTCDISCOUNTED_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REQUESTED_USER_CABIN")
    public JAXBElement<String> createREQUESTEDUSERCABIN(String value) {
        return new JAXBElement<String>(_REQUESTEDUSERCABIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VALIDATING_CARRIER")
    public JAXBElement<String> createVALIDATINGCARRIER(String value) {
        return new JAXBElement<String>(_VALIDATINGCARRIER_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTRAVPRICEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRAVELLER_PRICE")
    public JAXBElement<LISTTRAVPRICEType> createLISTTRAVELLERPRICE(LISTTRAVPRICEType value) {
        return new JAXBElement<LISTTRAVPRICEType>(_LISTTRAVELLERPRICE_QNAME, LISTTRAVPRICEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTRAVTYPEPRICEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRAVELLER_TYPE_PRICE")
    public JAXBElement<LISTTRAVTYPEPRICEType> createLISTTRAVELLERTYPEPRICE(LISTTRAVTYPEPRICEType value) {
        return new JAXBElement<LISTTRAVTYPEPRICEType>(_LISTTRAVELLERTYPEPRICE_QNAME, LISTTRAVTYPEPRICEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTRAVELLERINFOType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRAVELLER_INFO")
    public JAXBElement<LISTTRAVELLERINFOType> createLISTTRAVELLERINFO(LISTTRAVELLERINFOType value) {
        return new JAXBElement<LISTTRAVELLERINFOType>(_LISTTRAVELLERINFO_QNAME, LISTTRAVELLERINFOType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTRAVELLERTYPEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRAVELLER_TYPE")
    public JAXBElement<LISTTRAVELLERTYPEType> createLISTTRAVELLERTYPE(LISTTRAVELLERTYPEType value) {
        return new JAXBElement<LISTTRAVELLERTYPEType>(_LISTTRAVELLERTYPE_QNAME, LISTTRAVELLERTYPEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRICEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_PNR_PRICE")
    public JAXBElement<PRICEType> createLISTPNRPRICE(PRICEType value) {
        return new JAXBElement<PRICEType>(_LISTPNRPRICE_QNAME, PRICEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTPNRType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_PNR")
    public JAXBElement<LISTPNRType> createLISTPNR(LISTPNRType value) {
        return new JAXBElement<LISTPNRType>(_LISTPNR_QNAME, LISTPNRType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FAREFAMILYFareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REQUESTED_FARE_FAMILY")
    public JAXBElement<FAREFAMILYFareType> createREQUESTEDFAREFAMILY(FAREFAMILYFareType value) {
        return new JAXBElement<FAREFAMILYFareType>(_REQUESTEDFAREFAMILY_QNAME, FAREFAMILYFareType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTRECOMMENDATIONType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_RECOMMENDATION")
    public JAXBElement<LISTRECOMMENDATIONType> createLISTRECOMMENDATION(LISTRECOMMENDATIONType value) {
        return new JAXBElement<LISTRECOMMENDATIONType>(_LISTRECOMMENDATION_QNAME, LISTRECOMMENDATIONType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTORIGINATINGRECOMMENDATIONType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_ORIGINATING_RECOMMENDATION")
    public JAXBElement<LISTORIGINATINGRECOMMENDATIONType> createLISTORIGINATINGRECOMMENDATION(LISTORIGINATINGRECOMMENDATIONType value) {
        return new JAXBElement<LISTORIGINATINGRECOMMENDATIONType>(_LISTORIGINATINGRECOMMENDATION_QNAME, LISTORIGINATINGRECOMMENDATIONType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTRIPELEMENTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRIP_ELEMENT")
    public JAXBElement<LISTTRIPELEMENTType> createLISTTRIPELEMENT(LISTTRIPELEMENTType value) {
        return new JAXBElement<LISTTRIPELEMENTType>(_LISTTRIPELEMENT_QNAME, LISTTRIPELEMENTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "E_TICKET_DISCOUNT")
    public JAXBElement<Boolean> createETICKETDISCOUNT(Boolean value) {
        return new JAXBElement<Boolean>(_ETICKETDISCOUNT_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FARECONTEXTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_CONTEXT")
    public JAXBElement<FARECONTEXTType> createFARECONTEXT(FARECONTEXTType value) {
        return new JAXBElement<FARECONTEXTType>(_FARECONTEXT_QNAME, FARECONTEXTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTFARECONTEXTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FARE_CONTEXT")
    public JAXBElement<LISTFARECONTEXTType> createLISTFARECONTEXT(LISTFARECONTEXTType value) {
        return new JAXBElement<LISTFARECONTEXTType>(_LISTFARECONTEXT_QNAME, LISTFARECONTEXTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COMMERCIALFAREFAMILYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_COMMERCIAL_FARE_FAMILY")
    public JAXBElement<COMMERCIALFAREFAMILYType> createLISTCOMMERCIALFAREFAMILY(COMMERCIALFAREFAMILYType value) {
        return new JAXBElement<COMMERCIALFAREFAMILYType>(_LISTCOMMERCIALFAREFAMILY_QNAME, COMMERCIALFAREFAMILYType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LIGHTFAREFAMILYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_LIGHT_FARE_FAMILY")
    public JAXBElement<LIGHTFAREFAMILYType> createLISTLIGHTFAREFAMILY(LIGHTFAREFAMILYType value) {
        return new JAXBElement<LIGHTFAREFAMILYType>(_LISTLIGHTFAREFAMILY_QNAME, LIGHTFAREFAMILYType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TICKET_DESIGNATOR")
    public JAXBElement<String> createTICKETDESIGNATOR(String value) {
        return new JAXBElement<String>(_TICKETDESIGNATOR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAXEXEMPTIONDATA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TAX_EXEMPTION")
    public JAXBElement<TAXEXEMPTIONDATA> createLISTTAXEXEMPTION(TAXEXEMPTIONDATA value) {
        return new JAXBElement<TAXEXEMPTIONDATA>(_LISTTAXEXEMPTION_QNAME, TAXEXEMPTIONDATA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTFPALTERNATETRIPELEMENTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FP_ALTERNATE_TRIP_ELEMENT")
    public JAXBElement<LISTFPALTERNATETRIPELEMENTType> createLISTFPALTERNATETRIPELEMENT(LISTFPALTERNATETRIPELEMENTType value) {
        return new JAXBElement<LISTFPALTERNATETRIPELEMENTType>(_LISTFPALTERNATETRIPELEMENT_QNAME, LISTFPALTERNATETRIPELEMENTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FPBUYUPSEARCHDATAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FP_BUYUP_SEARCH_DATA")
    public JAXBElement<FPBUYUPSEARCHDATAType> createFPBUYUPSEARCHDATA(FPBUYUPSEARCHDATAType value) {
        return new JAXBElement<FPBUYUPSEARCHDATAType>(_FPBUYUPSEARCHDATA_QNAME, FPBUYUPSEARCHDATAType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FAREFAMILYFareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALTERNATE_FARE_FAMILY")
    public JAXBElement<FAREFAMILYFareType> createALTERNATEFAREFAMILY(FAREFAMILYFareType value) {
        return new JAXBElement<FAREFAMILYFareType>(_ALTERNATEFAREFAMILY_QNAME, FAREFAMILYFareType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTRECOMMENDATIONIDTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_RECOMMENDATION_ID")
    public JAXBElement<LISTRECOMMENDATIONIDTYPE> createLISTRECOMMENDATIONID(LISTRECOMMENDATIONIDTYPE value) {
        return new JAXBElement<LISTRECOMMENDATIONIDTYPE>(_LISTRECOMMENDATIONID_QNAME, LISTRECOMMENDATIONIDTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FLIGHT_ID")
    public JAXBElement<BigInteger> createLISTFLIGHTID(BigInteger value) {
        return new JAXBElement<BigInteger>(_LISTFLIGHTID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RECOMMENDATION_ID")
    public JAXBElement<BigInteger> createRECOMMENDATIONID(BigInteger value) {
        return new JAXBElement<BigInteger>(_RECOMMENDATIONID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTFAREHOSTCOMMANDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FARE_HOST_COMMAND")
    public JAXBElement<LISTFAREHOSTCOMMANDType> createLISTFAREHOSTCOMMAND(LISTFAREHOSTCOMMANDType value) {
        return new JAXBElement<LISTFAREHOSTCOMMANDType>(_LISTFAREHOSTCOMMAND_QNAME, LISTFAREHOSTCOMMANDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TYPE")
    public JAXBElement<String> createTYPE(String value) {
        return new JAXBElement<String>(_TYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AVAILABILITY_TIME")
    public JAXBElement<String> createAVAILABILITYTIME(String value) {
        return new JAXBElement<String>(_AVAILABILITYTIME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CITY_REFERENCE")
    public JAXBElement<String> createCITYREFERENCE(String value) {
        return new JAXBElement<String>(_CITYREFERENCE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTELEMENTUPDATEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_ELEMENT_UPDATE")
    public JAXBElement<LISTELEMENTUPDATEType> createLISTELEMENTUPDATE(LISTELEMENTUPDATEType value) {
        return new JAXBElement<LISTELEMENTUPDATEType>(_LISTELEMENTUPDATE_QNAME, LISTELEMENTUPDATEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FORCE_PTC")
    public JAXBElement<Boolean> createFORCEPTC(Boolean value) {
        return new JAXBElement<Boolean>(_FORCEPTC_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ENDORSE_MSG")
    public JAXBElement<String> createENDORSEMSG(String value) {
        return new JAXBElement<String>(_ENDORSEMSG_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REQUESTOPTIONSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REQUEST_OPTIONS")
    public JAXBElement<REQUESTOPTIONSType> createREQUESTOPTIONS(REQUESTOPTIONSType value) {
        return new JAXBElement<REQUESTOPTIONSType>(_REQUESTOPTIONS_QNAME, REQUESTOPTIONSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTAPPLIEDPRICINGOPTIONSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_PRICING_OPTIONS")
    public JAXBElement<LISTAPPLIEDPRICINGOPTIONSType> createLISTPRICINGOPTIONS(LISTAPPLIEDPRICINGOPTIONSType value) {
        return new JAXBElement<LISTAPPLIEDPRICINGOPTIONSType>(_LISTPRICINGOPTIONS_QNAME, LISTAPPLIEDPRICINGOPTIONSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_RESPONSE_TYPE")
    public JAXBElement<String> createFARERESPONSETYPE(String value) {
        return new JAXBElement<String>(_FARERESPONSETYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MILEAGE_ACCRUAL_AMOUNT")
    public JAXBElement<BigInteger> createMILEAGEACCRUALAMOUNT(BigInteger value) {
        return new JAXBElement<BigInteger>(_MILEAGEACCRUALAMOUNT_QNAME, BigInteger.class, null, value);
    }

}
