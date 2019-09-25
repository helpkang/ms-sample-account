
package com.koreanair.external.eretail.vo.flexpricer.flexpricercomplexitineraryavailabilityoutput;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.air.common.FLIGHTPREFERENCEType;
import com.koreanair.external.eretail.vo.common.common.GDSCABINCODEType;
import com.koreanair.external.eretail.vo.common.common.LISTTRIPREASONtype;
import com.koreanair.external.eretail.vo.common.common.OperationalDataType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.APPLICABLEFEEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.AVAILDATASOURCEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.CollectionInfoType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.FEEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.LISTTAXType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.MILESANDCASHCOSTType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.REBOOKFEEType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.AIRLINEType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.FAREFAMILYFareType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.LISTCABINType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.LISTLEGType;
import com.koreanair.external.eretail.vo.farecommon.farediscount.ListDiscountCredentialsType;
import com.koreanair.external.eretail.vo.farecommon.farediscount.ListResidentDiscountType;
import com.koreanair.external.eretail.vo.farecommon.flowsignature.FLOWSIGNATUREType;
import com.koreanair.external.eretail.vo.flexpricer.commonavailabilityoutput.LocationType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ElementType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.FlexSTOPType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTOCRECOMMENDATIONType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListDestinationType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListEmptyTabType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListItineraryType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListPNRType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListPanelType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListSegmentType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListTabType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.ListTravellerType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.PriceType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.SearchDataType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.TravellerPriceType;
import com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.TripPriceType;
import com.koreanair.external.eretail.vo.profile.commonprofileout.ADDRESSINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.BANKACCOUNTINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.CHECKINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.CONTACTPOINTTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.CREDITCARDINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.EBANKVOUCHERINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.GOVERNMENTPAYMENTINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.IDENTITYDOCUMENTTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.IDENTITYINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.NOTIFICATIONINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.VOUCHERACCOUNTINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.ticketchanger.ticketchangercommonoutput.BOOKEDTRIPType;
import com.koreanair.external.eretail.vo.ticketchanger.ticketchangercommonoutput.LISTREDEMPTIONType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.external.eretail.vo.flexpricer.flexpricercomplexitineraryavailabilityoutput package. 
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
    private final static QName _CREATIONMODE_QNAME = new QName("", "CREATION_MODE");
    private final static QName _FLOWSIGNATURE_QNAME = new QName("", "FLOW_SIGNATURE");
    private final static QName _TRIPTYPE_QNAME = new QName("", "TRIP_TYPE");
    private final static QName _PRICINGTYPE_QNAME = new QName("", "PRICING_TYPE");
    private final static QName _PANELTYPE_QNAME = new QName("", "PANEL_TYPE");
    private final static QName _BTIMEWINDOW_QNAME = new QName("", "B_TIME_WINDOW");
    private final static QName _DIRECTNONSTOP_QNAME = new QName("", "DIRECT_NON_STOP");
    private final static QName _FAREFAMILYCOMBINABILITY_QNAME = new QName("", "FARE_FAMILY_COMBINABILITY");
    private final static QName _ARRANGEBY_QNAME = new QName("", "ARRANGE_BY");
    private final static QName _CABIN_QNAME = new QName("", "CABIN");
    private final static QName _ONLINECONNECTION_QNAME = new QName("", "ONLINE_CONNECTION");
    private final static QName _SHUTTLEFLIGHTS_QNAME = new QName("", "SHUTTLE_FLIGHTS");
    private final static QName _RESTRICTION_QNAME = new QName("", "RESTRICTION");
    private final static QName _DISPLAYTYPE_QNAME = new QName("", "DISPLAY_TYPE");
    private final static QName _ISUMNRFLOW_QNAME = new QName("", "IS_UMNR_FLOW");
    private final static QName _OWCDUALFLOWSEQUENCE_QNAME = new QName("", "OWC_DUAL_FLOW_SEQUENCE");
    private final static QName _TRIPDURATION_QNAME = new QName("", "TRIP_DURATION");
    private final static QName _QUALIFIER_QNAME = new QName("", "QUALIFIER");
    private final static QName _VALUE_QNAME = new QName("", "VALUE");
    private final static QName _LISTFLIGHTPREFERENCE_QNAME = new QName("", "LIST_FLIGHT_PREFERENCE");
    private final static QName _SEVENDAYSEARCH_QNAME = new QName("", "SEVEN_DAY_SEARCH");
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
    private final static QName _LISTTAB_QNAME = new QName("", "LIST_TAB");
    private final static QName _LISTEMPTYTAB_QNAME = new QName("", "LIST_EMPTY_TAB");
    private final static QName _LISTOCRECOMMENDATION_QNAME = new QName("", "LIST_OC_RECOMMENDATION");
    private final static QName _SEARCHDATA_QNAME = new QName("", "SEARCH_DATA");
    private final static QName _LISTDESTINATION_QNAME = new QName("", "LIST_DESTINATION");
    private final static QName _LISTPANEL_QNAME = new QName("", "LIST_PANEL");
    private final static QName _LISTPNR_QNAME = new QName("", "LIST_PNR");
    private final static QName _LISTTRAVELLERTYPE_QNAME = new QName("", "LIST_TRAVELLER_TYPE");
    private final static QName _LISTTRAVELLERPRICE_QNAME = new QName("", "LIST_TRAVELLER_PRICE");
    private final static QName _LISTTRAVELLERTYPEPRICE_QNAME = new QName("", "LIST_TRAVELLER_TYPE_PRICE");
    private final static QName _LISTTAX_QNAME = new QName("", "LIST_TAX");
    private final static QName _LISTPNRPRICE_QNAME = new QName("", "LIST_PNR_PRICE");
    private final static QName _LISTTRIPPRICE_QNAME = new QName("", "LIST_TRIP_PRICE");
    private final static QName _LISTITINERARY_QNAME = new QName("", "LIST_ITINERARY");
    private final static QName _LISTSEGMENT_QNAME = new QName("", "LIST_SEGMENT");
    private final static QName _FARECOMMAND_QNAME = new QName("", "FARE_COMMAND");
    private final static QName _ISPRIMARYTRAVELLER_QNAME = new QName("", "IS_PRIMARY_TRAVELLER");
    private final static QName _RBD_QNAME = new QName("", "RBD");
    private final static QName _SEGMENTID_QNAME = new QName("", "SEGMENT_ID");
    private final static QName _ELEMENT_QNAME = new QName("", "ELEMENT");
    private final static QName _BLOCATION_QNAME = new QName("", "B_LOCATION");
    private final static QName _ELOCATION_QNAME = new QName("", "E_LOCATION");
    private final static QName _ENTERTAINMENT_QNAME = new QName("", "ENTERTAINMENT");
    private final static QName _SHUTTLE_QNAME = new QName("", "SHUTTLE");
    private final static QName _FAREBASIS_QNAME = new QName("", "FARE_BASIS");
    private final static QName _FLIGHTID_QNAME = new QName("", "FLIGHT_ID");
    private final static QName _NUMBEROFLASTSEATS_QNAME = new QName("", "NUMBER_OF_LAST_SEATS");
    private final static QName _APPLIEDLASTSEATRULE_QNAME = new QName("", "APPLIED_LAST_SEAT_RULE");
    private final static QName _DISPLAYLASTSEATS_QNAME = new QName("", "DISPLAY_LAST_SEATS");
    private final static QName _LISTSTOPS_QNAME = new QName("", "LIST_STOPS");
    private final static QName _LISTREDEMPTIONREMARK_QNAME = new QName("", "LIST_REDEMPTION_REMARK");
    private final static QName _FAREFAMILYREF_QNAME = new QName("", "FARE_FAMILY_REF");
    private final static QName _HIERARCHY_QNAME = new QName("", "HIERARCHY");
    private final static QName _BRANDNAME_QNAME = new QName("", "BRAND_NAME");
    private final static QName _COLOR_QNAME = new QName("", "COLOR");
    private final static QName _HIGHLIGHTINGCOLOR_QNAME = new QName("", "HIGHLIGHTING_COLOR");
    private final static QName _COLORNAME_QNAME = new QName("", "COLOR_NAME");
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

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.external.eretail.vo.flexpricer.flexpricercomplexitineraryavailabilityoutput
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlexPricerComplexItineraryAvailabilityOutput }
     * 
     */
    public FlexPricerComplexItineraryAvailabilityOutput createFlexPricerComplexItineraryAvailabilityOutput() {
        return new FlexPricerComplexItineraryAvailabilityOutput();
    }

    /**
     * Create an instance of {@link LISTTRIPELEMENTType }
     * 
     */
    public LISTTRIPELEMENTType createLISTTRIPELEMENTType() {
        return new LISTTRIPELEMENTType();
    }

    /**
     * Create an instance of {@link FlexPricerComplexItineraryAvailabilityOutput.FLIGHTFACTDICTIONARY }
     * 
     */
    public FlexPricerComplexItineraryAvailabilityOutput.FLIGHTFACTDICTIONARY createFlexPricerComplexItineraryAvailabilityOutputFLIGHTFACTDICTIONARY() {
        return new FlexPricerComplexItineraryAvailabilityOutput.FLIGHTFACTDICTIONARY();
    }

    /**
     * Create an instance of {@link FlexPricerComplexItineraryAvailabilityOutput.MEALSERVICESDICTIONARY }
     * 
     */
    public FlexPricerComplexItineraryAvailabilityOutput.MEALSERVICESDICTIONARY createFlexPricerComplexItineraryAvailabilityOutputMEALSERVICESDICTIONARY() {
        return new FlexPricerComplexItineraryAvailabilityOutput.MEALSERVICESDICTIONARY();
    }

    /**
     * Create an instance of {@link FlexPricerComplexItineraryAvailabilityOutput.INFLIGHTSERVICESDICTIONARY }
     * 
     */
    public FlexPricerComplexItineraryAvailabilityOutput.INFLIGHTSERVICESDICTIONARY createFlexPricerComplexItineraryAvailabilityOutputINFLIGHTSERVICESDICTIONARY() {
        return new FlexPricerComplexItineraryAvailabilityOutput.INFLIGHTSERVICESDICTIONARY();
    }

    /**
     * Create an instance of {@link FlexPricerComplexItineraryAvailabilityOutput.ALLIANCEDICTIONARY }
     * 
     */
    public FlexPricerComplexItineraryAvailabilityOutput.ALLIANCEDICTIONARY createFlexPricerComplexItineraryAvailabilityOutputALLIANCEDICTIONARY() {
        return new FlexPricerComplexItineraryAvailabilityOutput.ALLIANCEDICTIONARY();
    }

    /**
     * Create an instance of {@link FlexPricerComplexItineraryAvailabilityOutput.TRAVELSPONSOR }
     * 
     */
    public FlexPricerComplexItineraryAvailabilityOutput.TRAVELSPONSOR createFlexPricerComplexItineraryAvailabilityOutputTRAVELSPONSOR() {
        return new FlexPricerComplexItineraryAvailabilityOutput.TRAVELSPONSOR();
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
    @XmlElementDecl(namespace = "", name = "TRIP_TYPE")
    public JAXBElement<String> createTRIPTYPE(String value) {
        return new JAXBElement<String>(_TRIPTYPE_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "PANEL_TYPE")
    public JAXBElement<String> createPANELTYPE(String value) {
        return new JAXBElement<String>(_PANELTYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "B_TIME_WINDOW")
    public JAXBElement<String> createBTIMEWINDOW(String value) {
        return new JAXBElement<String>(_BTIMEWINDOW_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DIRECT_NON_STOP")
    public JAXBElement<Boolean> createDIRECTNONSTOP(Boolean value) {
        return new JAXBElement<Boolean>(_DIRECTNONSTOP_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_FAMILY_COMBINABILITY")
    public JAXBElement<Boolean> createFAREFAMILYCOMBINABILITY(Boolean value) {
        return new JAXBElement<Boolean>(_FAREFAMILYCOMBINABILITY_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ARRANGE_BY")
    public JAXBElement<String> createARRANGEBY(String value) {
        return new JAXBElement<String>(_ARRANGEBY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CABIN")
    public JAXBElement<String> createCABIN(String value) {
        return new JAXBElement<String>(_CABIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ONLINE_CONNECTION")
    public JAXBElement<Boolean> createONLINECONNECTION(Boolean value) {
        return new JAXBElement<Boolean>(_ONLINECONNECTION_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SHUTTLE_FLIGHTS")
    public JAXBElement<Boolean> createSHUTTLEFLIGHTS(Boolean value) {
        return new JAXBElement<Boolean>(_SHUTTLEFLIGHTS_QNAME, Boolean.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DISPLAY_TYPE")
    public JAXBElement<BigInteger> createDISPLAYTYPE(BigInteger value) {
        return new JAXBElement<BigInteger>(_DISPLAYTYPE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_UMNR_FLOW")
    public JAXBElement<Boolean> createISUMNRFLOW(Boolean value) {
        return new JAXBElement<Boolean>(_ISUMNRFLOW_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OWC_DUAL_FLOW_SEQUENCE")
    public JAXBElement<BigInteger> createOWCDUALFLOWSEQUENCE(BigInteger value) {
        return new JAXBElement<BigInteger>(_OWCDUALFLOWSEQUENCE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRIP_DURATION")
    public JAXBElement<BigInteger> createTRIPDURATION(BigInteger value) {
        return new JAXBElement<BigInteger>(_TRIPDURATION_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "QUALIFIER")
    public JAXBElement<String> createQUALIFIER(String value) {
        return new JAXBElement<String>(_QUALIFIER_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VALUE")
    public JAXBElement<String> createVALUE(String value) {
        return new JAXBElement<String>(_VALUE_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTabType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TAB")
    public JAXBElement<ListTabType> createLISTTAB(ListTabType value) {
        return new JAXBElement<ListTabType>(_LISTTAB_QNAME, ListTabType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEmptyTabType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_EMPTY_TAB")
    public JAXBElement<ListEmptyTabType> createLISTEMPTYTAB(ListEmptyTabType value) {
        return new JAXBElement<ListEmptyTabType>(_LISTEMPTYTAB_QNAME, ListEmptyTabType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTOCRECOMMENDATIONType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_OC_RECOMMENDATION")
    public JAXBElement<LISTOCRECOMMENDATIONType> createLISTOCRECOMMENDATION(LISTOCRECOMMENDATIONType value) {
        return new JAXBElement<LISTOCRECOMMENDATIONType>(_LISTOCRECOMMENDATION_QNAME, LISTOCRECOMMENDATIONType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SEARCH_DATA")
    public JAXBElement<SearchDataType> createSEARCHDATA(SearchDataType value) {
        return new JAXBElement<SearchDataType>(_SEARCHDATA_QNAME, SearchDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDestinationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_DESTINATION")
    public JAXBElement<ListDestinationType> createLISTDESTINATION(ListDestinationType value) {
        return new JAXBElement<ListDestinationType>(_LISTDESTINATION_QNAME, ListDestinationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPanelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_PANEL")
    public JAXBElement<ListPanelType> createLISTPANEL(ListPanelType value) {
        return new JAXBElement<ListPanelType>(_LISTPANEL_QNAME, ListPanelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPNRType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_PNR")
    public JAXBElement<ListPNRType> createLISTPNR(ListPNRType value) {
        return new JAXBElement<ListPNRType>(_LISTPNR_QNAME, ListPNRType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTravellerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRAVELLER_TYPE")
    public JAXBElement<ListTravellerType> createLISTTRAVELLERTYPE(ListTravellerType value) {
        return new JAXBElement<ListTravellerType>(_LISTTRAVELLERTYPE_QNAME, ListTravellerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravellerPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRAVELLER_PRICE")
    public JAXBElement<TravellerPriceType> createLISTTRAVELLERPRICE(TravellerPriceType value) {
        return new JAXBElement<TravellerPriceType>(_LISTTRAVELLERPRICE_QNAME, TravellerPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRAVELLER_TYPE_PRICE")
    public JAXBElement<PriceType> createLISTTRAVELLERTYPEPRICE(PriceType value) {
        return new JAXBElement<PriceType>(_LISTTRAVELLERTYPEPRICE_QNAME, PriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTAXType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TAX")
    public JAXBElement<LISTTAXType> createLISTTAX(LISTTAXType value) {
        return new JAXBElement<LISTTAXType>(_LISTTAX_QNAME, LISTTAXType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_PNR_PRICE")
    public JAXBElement<PriceType> createLISTPNRPRICE(PriceType value) {
        return new JAXBElement<PriceType>(_LISTPNRPRICE_QNAME, PriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRIP_PRICE")
    public JAXBElement<TripPriceType> createLISTTRIPPRICE(TripPriceType value) {
        return new JAXBElement<TripPriceType>(_LISTTRIPPRICE_QNAME, TripPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListItineraryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_ITINERARY")
    public JAXBElement<ListItineraryType> createLISTITINERARY(ListItineraryType value) {
        return new JAXBElement<ListItineraryType>(_LISTITINERARY_QNAME, ListItineraryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSegmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_SEGMENT")
    public JAXBElement<ListSegmentType> createLISTSEGMENT(ListSegmentType value) {
        return new JAXBElement<ListSegmentType>(_LISTSEGMENT_QNAME, ListSegmentType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_PRIMARY_TRAVELLER")
    public JAXBElement<Boolean> createISPRIMARYTRAVELLER(Boolean value) {
        return new JAXBElement<Boolean>(_ISPRIMARYTRAVELLER_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RBD")
    public JAXBElement<String> createRBD(String value) {
        return new JAXBElement<String>(_RBD_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SEGMENT_ID")
    public JAXBElement<BigInteger> createSEGMENTID(BigInteger value) {
        return new JAXBElement<BigInteger>(_SEGMENTID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ELEMENT")
    public JAXBElement<ElementType> createELEMENT(ElementType value) {
        return new JAXBElement<ElementType>(_ELEMENT_QNAME, ElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "B_LOCATION")
    public JAXBElement<LocationType> createBLOCATION(LocationType value) {
        return new JAXBElement<LocationType>(_BLOCATION_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "E_LOCATION")
    public JAXBElement<LocationType> createELOCATION(LocationType value) {
        return new JAXBElement<LocationType>(_ELOCATION_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ENTERTAINMENT")
    public JAXBElement<Boolean> createENTERTAINMENT(Boolean value) {
        return new JAXBElement<Boolean>(_ENTERTAINMENT_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SHUTTLE")
    public JAXBElement<Boolean> createSHUTTLE(Boolean value) {
        return new JAXBElement<Boolean>(_SHUTTLE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_BASIS")
    public JAXBElement<String> createFAREBASIS(String value) {
        return new JAXBElement<String>(_FAREBASIS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLIGHT_ID")
    public JAXBElement<BigInteger> createFLIGHTID(BigInteger value) {
        return new JAXBElement<BigInteger>(_FLIGHTID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NUMBER_OF_LAST_SEATS")
    public JAXBElement<BigInteger> createNUMBEROFLASTSEATS(BigInteger value) {
        return new JAXBElement<BigInteger>(_NUMBEROFLASTSEATS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "APPLIED_LAST_SEAT_RULE")
    public JAXBElement<String> createAPPLIEDLASTSEATRULE(String value) {
        return new JAXBElement<String>(_APPLIEDLASTSEATRULE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DISPLAY_LAST_SEATS")
    public JAXBElement<String> createDISPLAYLASTSEATS(String value) {
        return new JAXBElement<String>(_DISPLAYLASTSEATS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlexSTOPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_STOPS")
    public JAXBElement<FlexSTOPType> createLISTSTOPS(FlexSTOPType value) {
        return new JAXBElement<FlexSTOPType>(_LISTSTOPS_QNAME, FlexSTOPType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_FAMILY_REF")
    public JAXBElement<Object> createFAREFAMILYREF(Object value) {
        return new JAXBElement<Object>(_FAREFAMILYREF_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HIERARCHY")
    public JAXBElement<Object> createHIERARCHY(Object value) {
        return new JAXBElement<Object>(_HIERARCHY_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BRAND_NAME")
    public JAXBElement<Object> createBRANDNAME(Object value) {
        return new JAXBElement<Object>(_BRANDNAME_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COLOR")
    public JAXBElement<Object> createCOLOR(Object value) {
        return new JAXBElement<Object>(_COLOR_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HIGHLIGHTING_COLOR")
    public JAXBElement<Object> createHIGHLIGHTINGCOLOR(Object value) {
        return new JAXBElement<Object>(_HIGHLIGHTINGCOLOR_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COLOR_NAME")
    public JAXBElement<Object> createCOLORNAME(Object value) {
        return new JAXBElement<Object>(_COLORNAME_QNAME, Object.class, null, value);
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

}
