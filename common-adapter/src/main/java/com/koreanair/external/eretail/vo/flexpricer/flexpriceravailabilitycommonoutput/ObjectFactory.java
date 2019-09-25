
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput;

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


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput package. 
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
    private final static QName _RBD_QNAME = new QName("", "RBD");
    private final static QName _SEGMENTID_QNAME = new QName("", "SEGMENT_ID");
    private final static QName _LISTPNRPRICE_QNAME = new QName("", "LIST_PNR_PRICE");
    private final static QName _LISTTRIPPRICE_QNAME = new QName("", "LIST_TRIP_PRICE");
    private final static QName _LISTITINERARY_QNAME = new QName("", "LIST_ITINERARY");
    private final static QName _LISTSEGMENT_QNAME = new QName("", "LIST_SEGMENT");
    private final static QName _FARECOMMAND_QNAME = new QName("", "FARE_COMMAND");
    private final static QName _ISPRIMARYTRAVELLER_QNAME = new QName("", "IS_PRIMARY_TRAVELLER");
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

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTDATE }
     * 
     */
    public com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTDATE createLISTDATE() {
        return new com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTDATE();
    }

    /**
     * Create an instance of {@link com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND }
     * 
     */
    public com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND createLISTBOUND() {
        return new com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEREFS }
     * 
     */
    public LISTSERVICEFEEREFS createLISTSERVICEFEEREFS() {
        return new LISTSERVICEFEEREFS();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType }
     * 
     */
    public LISTSERVICEFEESGROUPType createLISTSERVICEFEESGROUPType() {
        return new LISTSERVICEFEESGROUPType();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUP() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPFEEDESCRIPTIONGROUP() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPFEEDESCRIPTIONGROUPITEMNUMBERINFO() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPFEEDESCRIPTIONGROUPSERVICEDESCRIPTIONINFO() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPFEEDESCRIPTIONGROUPCOMMERCIALNAME() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPFEEDESCRIPTIONGROUPSERVICEATTRIBUTESINFO() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPSERVICEOPTIONINFO() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICECOVERAGEINFOGROUPType }
     * 
     */
    public LISTSERVICECOVERAGEINFOGROUPType createLISTSERVICECOVERAGEINFOGROUPType() {
        return new LISTSERVICECOVERAGEINFOGROUPType();
    }

    /**
     * Create an instance of {@link LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO }
     * 
     */
    public LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO createLISTSERVICECOVERAGEINFOGROUPTypeITEMNUMBERINFO() {
        return new LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP }
     * 
     */
    public LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP createLISTSERVICECOVERAGEINFOGROUPTypeSERVICECOVINFOGROUP() {
        return new LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP();
    }

    /**
     * Create an instance of {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO }
     * 
     */
    public LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO createLISTSERVICECOVERAGEINFOGROUPTypeSERVICECOVINFOGROUPCOVERAGEPERFLIGHTSINFO() {
        return new LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO }
     * 
     */
    public LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO createLISTSERVICECOVERAGEINFOGROUPTypeSERVICECOVINFOGROUPREFINFO() {
        return new LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO }
     * 
     */
    public LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO createLISTSERVICECOVERAGEINFOGROUPTypeSERVICECOVINFOGROUPPAXREFINFO() {
        return new LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType createLISTSERVICEFEEINFOGROUPType() {
        return new LISTSERVICEFEEINFOGROUPType();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO createLISTSERVICEFEEINFOGROUPTypeITEMNUMBERINFO() {
        return new LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP createLISTSERVICEFEEINFOGROUPTypeSERVICEDETAILSGROUP() {
        return new LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO createLISTSERVICEFEEINFOGROUPTypeSERVICEDETAILSGROUPREFINFO() {
        return new LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP createLISTSERVICEFEEINFOGROUPTypeSERVICEDETAILSGROUPSERVICEMATCHEDINFOGROUP() {
        return new LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO createLISTSERVICEFEEINFOGROUPTypeSERVICEDETAILSGROUPSERVICEMATCHEDINFOGROUPPAXREFINFO() {
        return new LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO createLISTSERVICEFEEINFOGROUPTypeSERVICEDETAILSGROUPSERVICEMATCHEDINFOGROUPAMOUNTINFO() {
        return new LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO createLISTSERVICEFEEINFOGROUPTypeSERVICEDETAILSGROUPSERVICEMATCHEDINFOGROUPPRICINGINFO() {
        return new LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO();
    }

    /**
     * Create an instance of {@link FFCFFDictionaryMapping }
     * 
     */
    public FFCFFDictionaryMapping createFFCFFDictionaryMapping() {
        return new FFCFFDictionaryMapping();
    }

    /**
     * Create an instance of {@link FFCFFDictionaryMapping.LISTFAREFAMILY }
     * 
     */
    public FFCFFDictionaryMapping.LISTFAREFAMILY createFFCFFDictionaryMappingLISTFAREFAMILY() {
        return new FFCFFDictionaryMapping.LISTFAREFAMILY();
    }

    /**
     * Create an instance of {@link FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE }
     * 
     */
    public FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE createFFCFFDictionaryMappingLISTFAREFAMILYLISTRECOLOWESTPRICE() {
        return new FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE();
    }

    /**
     * Create an instance of {@link FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND }
     * 
     */
    public FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND createFFCFFDictionaryMappingLISTFAREFAMILYLISTRECOLOWESTPRICELISTBOUND() {
        return new FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType }
     * 
     */
    public ListRecommendationGroupType createListRecommendationGroupType() {
        return new ListRecommendationGroupType();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION }
     * 
     */
    public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION createListRecommendationGroupTypeRECOMMENDATIONDESCRIPTION() {
        return new ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION }
     * 
     */
    public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION createListRecommendationGroupTypeRECOMMENDATIONDESCRIPTIONLISTCOMBINATIONDESCRIPTION() {
        return new ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION }
     * 
     */
    public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION createListRecommendationGroupTypeRECOMMENDATIONDESCRIPTIONLISTCOMBINATIONDESCRIPTIONLISTTRAVELLERDESCRIPTION() {
        return new ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE }
     * 
     */
    public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE createListRecommendationGroupTypeRECOMMENDATIONDESCRIPTIONLISTCOMBINATIONDESCRIPTIONLISTTRAVELLERDESCRIPTIONBAGGAGEALLOWANCE() {
        return new ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND }
     * 
     */
    public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND createListRecommendationGroupTypeRECOMMENDATIONDESCRIPTIONLISTCOMBINATIONDESCRIPTIONLISTTRAVELLERDESCRIPTIONBAGGAGEALLOWANCELISTBOUND() {
        return new ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT }
     * 
     */
    public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT createListRecommendationGroupTypeRECOMMENDATIONDESCRIPTIONLISTCOMBINATIONDESCRIPTIONLISTTRAVELLERDESCRIPTIONBAGGAGEALLOWANCELISTBOUNDLISTSEGMENT() {
        return new ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO }
     * 
     */
    public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO createListRecommendationGroupTypeRECOMMENDATIONDESCRIPTIONLISTCOMBINATIONDESCRIPTIONLISTTRAVELLERDESCRIPTIONBAGGAGEALLOWANCELISTBOUNDLISTSEGMENTLISTFBDINFO() {
        return new ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO();
    }

    /**
     * Create an instance of {@link REDEMPTIONLISTTRAVELLERTYPE }
     * 
     */
    public REDEMPTIONLISTTRAVELLERTYPE createREDEMPTIONLISTTRAVELLERTYPE() {
        return new REDEMPTIONLISTTRAVELLERTYPE();
    }

    /**
     * Create an instance of {@link REDEMPTIONINFOType }
     * 
     */
    public REDEMPTIONINFOType createREDEMPTIONINFOType() {
        return new REDEMPTIONINFOType();
    }

    /**
     * Create an instance of {@link REDEMPTIONINFOType.LISTREDEMPTION }
     * 
     */
    public REDEMPTIONINFOType.LISTREDEMPTION createREDEMPTIONINFOTypeLISTREDEMPTION() {
        return new REDEMPTIONINFOType.LISTREDEMPTION();
    }

    /**
     * Create an instance of {@link REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION }
     * 
     */
    public REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION createREDEMPTIONINFOTypeLISTREDEMPTIONREDEMPTION() {
        return new REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION();
    }

    /**
     * Create an instance of {@link REDEMPTIONINFOType.LISTTRAVELLER }
     * 
     */
    public REDEMPTIONINFOType.LISTTRAVELLER createREDEMPTIONINFOTypeLISTTRAVELLER() {
        return new REDEMPTIONINFOType.LISTTRAVELLER();
    }

    /**
     * Create an instance of {@link BookedLISTTRAVELLERTYPE }
     * 
     */
    public BookedLISTTRAVELLERTYPE createBookedLISTTRAVELLERTYPE() {
        return new BookedLISTTRAVELLERTYPE();
    }

    /**
     * Create an instance of {@link BOOKEDPRICEType }
     * 
     */
    public BOOKEDPRICEType createBOOKEDPRICEType() {
        return new BOOKEDPRICEType();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEREFS.REFINFO }
     * 
     */
    public LISTSERVICEFEEREFS.REFINFO createLISTSERVICEFEEREFSREFINFO() {
        return new LISTSERVICEFEEREFS.REFINFO();
    }

    /**
     * Create an instance of {@link com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT }
     * 
     */
    public com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT createLISTBOUNDLISTFLIGHT() {
        return new com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT();
    }

    /**
     * Create an instance of {@link com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.LISTSEGMENT }
     * 
     */
    public com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.LISTSEGMENT createLISTBOUNDLISTFLIGHTLISTSEGMENT() {
        return new com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.LISTSEGMENT();
    }

    /**
     * Create an instance of {@link TripPriceType }
     * 
     */
    public TripPriceType createTripPriceType() {
        return new TripPriceType();
    }

    /**
     * Create an instance of {@link ListTravellerType }
     * 
     */
    public ListTravellerType createListTravellerType() {
        return new ListTravellerType();
    }

    /**
     * Create an instance of {@link ListTravellerType.LISTBOUND }
     * 
     */
    public ListTravellerType.LISTBOUND createListTravellerTypeLISTBOUND() {
        return new ListTravellerType.LISTBOUND();
    }

    /**
     * Create an instance of {@link ListTravellerType.LISTBOUND.LISTSEGMENT }
     * 
     */
    public ListTravellerType.LISTBOUND.LISTSEGMENT createListTravellerTypeLISTBOUNDLISTSEGMENT() {
        return new ListTravellerType.LISTBOUND.LISTSEGMENT();
    }

    /**
     * Create an instance of {@link ListPNRType }
     * 
     */
    public ListPNRType createListPNRType() {
        return new ListPNRType();
    }

    /**
     * Create an instance of {@link ListPanelType }
     * 
     */
    public ListPanelType createListPanelType() {
        return new ListPanelType();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY }
     * 
     */
    public ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY createListPanelTypeMINIRULESTYPEQUALIFIERDICTIONARY() {
        return new ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESDICTIONARY }
     * 
     */
    public ListPanelType.MINIRULESDICTIONARY createListPanelTypeMINIRULESDICTIONARY() {
        return new ListPanelType.MINIRULESDICTIONARY();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS }
     * 
     */
    public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS createListPanelTypeMINIRULESDICTIONARYLISTMNRDETAILS() {
        return new ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP }
     * 
     */
    public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP createListPanelTypeMINIRULESDICTIONARYLISTMNRDETAILSCATGRP() {
        return new ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP }
     * 
     */
    public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP createListPanelTypeMINIRULESDICTIONARYLISTMNRDETAILSCATGRPLISTCATGROUP() {
        return new ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO }
     * 
     */
    public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO createListPanelTypeMINIRULESDICTIONARYLISTMNRDETAILSCATGRPLISTCATGROUPSTATUSINFO() {
        return new ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO }
     * 
     */
    public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO createListPanelTypeMINIRULESDICTIONARYLISTMNRDETAILSCATGRPLISTCATGROUPMONETARYINFO() {
        return new ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO();
    }

    /**
     * Create an instance of {@link ListPanelType.TICKETINGINFORMATIONDICTIONARY }
     * 
     */
    public ListPanelType.TICKETINGINFORMATIONDICTIONARY createListPanelTypeTICKETINGINFORMATIONDICTIONARY() {
        return new ListPanelType.TICKETINGINFORMATIONDICTIONARY();
    }

    /**
     * Create an instance of {@link ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE }
     * 
     */
    public ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE createListPanelTypeTICKETINGINFORMATIONDICTIONARYLISTPRICINGMESSAGE() {
        return new ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE();
    }

    /**
     * Create an instance of {@link ListPanelType.TRAVELLERTYPEDICTIONARY }
     * 
     */
    public ListPanelType.TRAVELLERTYPEDICTIONARY createListPanelTypeTRAVELLERTYPEDICTIONARY() {
        return new ListPanelType.TRAVELLERTYPEDICTIONARY();
    }

    /**
     * Create an instance of {@link ListPanelType.EQUIPMENTDICTIONARY }
     * 
     */
    public ListPanelType.EQUIPMENTDICTIONARY createListPanelTypeEQUIPMENTDICTIONARY() {
        return new ListPanelType.EQUIPMENTDICTIONARY();
    }

    /**
     * Create an instance of {@link ListPanelType.AIRLINEDICTIONARY }
     * 
     */
    public ListPanelType.AIRLINEDICTIONARY createListPanelTypeAIRLINEDICTIONARY() {
        return new ListPanelType.AIRLINEDICTIONARY();
    }

    /**
     * Create an instance of {@link ListPanelType.PRICEDICTIONARY }
     * 
     */
    public ListPanelType.PRICEDICTIONARY createListPanelTypePRICEDICTIONARY() {
        return new ListPanelType.PRICEDICTIONARY();
    }

    /**
     * Create an instance of {@link ListPanelType.THEMEDICTIONARY }
     * 
     */
    public ListPanelType.THEMEDICTIONARY createListPanelTypeTHEMEDICTIONARY() {
        return new ListPanelType.THEMEDICTIONARY();
    }

    /**
     * Create an instance of {@link ListPanelType.FLIGHTDICTIONARY }
     * 
     */
    public ListPanelType.FLIGHTDICTIONARY createListPanelTypeFLIGHTDICTIONARY() {
        return new ListPanelType.FLIGHTDICTIONARY();
    }

    /**
     * Create an instance of {@link ListDestinationType }
     * 
     */
    public ListDestinationType createListDestinationType() {
        return new ListDestinationType();
    }

    /**
     * Create an instance of {@link SearchDataType }
     * 
     */
    public SearchDataType createSearchDataType() {
        return new SearchDataType();
    }

    /**
     * Create an instance of {@link LISTOCRECOMMENDATIONType }
     * 
     */
    public LISTOCRECOMMENDATIONType createLISTOCRECOMMENDATIONType() {
        return new LISTOCRECOMMENDATIONType();
    }

    /**
     * Create an instance of {@link ListEmptyTabType }
     * 
     */
    public ListEmptyTabType createListEmptyTabType() {
        return new ListEmptyTabType();
    }

    /**
     * Create an instance of {@link ListEmptyTabType.LISTDATE }
     * 
     */
    public ListEmptyTabType.LISTDATE createListEmptyTabTypeLISTDATE() {
        return new ListEmptyTabType.LISTDATE();
    }

    /**
     * Create an instance of {@link ListTabType }
     * 
     */
    public ListTabType createListTabType() {
        return new ListTabType();
    }

    /**
     * Create an instance of {@link ListTabType.LISTDATE }
     * 
     */
    public ListTabType.LISTDATE createListTabTypeLISTDATE() {
        return new ListTabType.LISTDATE();
    }

    /**
     * Create an instance of {@link TravellerPriceType }
     * 
     */
    public TravellerPriceType createTravellerPriceType() {
        return new TravellerPriceType();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link LISTRBD }
     * 
     */
    public LISTRBD createLISTRBD() {
        return new LISTRBD();
    }

    /**
     * Create an instance of {@link ListItineraryType }
     * 
     */
    public ListItineraryType createListItineraryType() {
        return new ListItineraryType();
    }

    /**
     * Create an instance of {@link ListSegmentType }
     * 
     */
    public ListSegmentType createListSegmentType() {
        return new ListSegmentType();
    }

    /**
     * Create an instance of {@link REQUESTEDTRAVELLERTYPE }
     * 
     */
    public REQUESTEDTRAVELLERTYPE createREQUESTEDTRAVELLERTYPE() {
        return new REQUESTEDTRAVELLERTYPE();
    }

    /**
     * Create an instance of {@link ElementType }
     * 
     */
    public ElementType createElementType() {
        return new ElementType();
    }

    /**
     * Create an instance of {@link LISTPTCAPPLIED }
     * 
     */
    public LISTPTCAPPLIED createLISTPTCAPPLIED() {
        return new LISTPTCAPPLIED();
    }

    /**
     * Create an instance of {@link com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTDATE.DATE }
     * 
     */
    public com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTDATE.DATE createLISTDATEDATE() {
        return new com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTDATE.DATE();
    }

    /**
     * Create an instance of {@link LISTJOURNEY }
     * 
     */
    public LISTJOURNEY createLISTJOURNEY() {
        return new LISTJOURNEY();
    }

    /**
     * Create an instance of {@link FlexSTOPType }
     * 
     */
    public FlexSTOPType createFlexSTOPType() {
        return new FlexSTOPType();
    }

    /**
     * Create an instance of {@link LISTDISCOUNT }
     * 
     */
    public LISTDISCOUNT createLISTDISCOUNT() {
        return new LISTDISCOUNT();
    }

    /**
     * Create an instance of {@link LISTPRICETICKETINGTYPE }
     * 
     */
    public LISTPRICETICKETINGTYPE createLISTPRICETICKETINGTYPE() {
        return new LISTPRICETICKETINGTYPE();
    }

    /**
     * Create an instance of {@link TYPEDBAGGAGEALLOWANCEType }
     * 
     */
    public TYPEDBAGGAGEALLOWANCEType createTYPEDBAGGAGEALLOWANCEType() {
        return new TYPEDBAGGAGEALLOWANCEType();
    }

    /**
     * Create an instance of {@link INFANTType }
     * 
     */
    public INFANTType createINFANTType() {
        return new INFANTType();
    }

    /**
     * Create an instance of {@link SimpleFareFamilyType }
     * 
     */
    public SimpleFareFamilyType createSimpleFareFamilyType() {
        return new SimpleFareFamilyType();
    }

    /**
     * Create an instance of {@link SEGMENTType }
     * 
     */
    public SEGMENTType createSEGMENTType() {
        return new SEGMENTType();
    }

    /**
     * Create an instance of {@link BookedTRIPFAREType }
     * 
     */
    public BookedTRIPFAREType createBookedTRIPFAREType() {
        return new BookedTRIPFAREType();
    }

    /**
     * Create an instance of {@link BookedLISTTRIPELEMENTType }
     * 
     */
    public BookedLISTTRIPELEMENTType createBookedLISTTRIPELEMENTType() {
        return new BookedLISTTRIPELEMENTType();
    }

    /**
     * Create an instance of {@link FareTypeType }
     * 
     */
    public FareTypeType createFareTypeType() {
        return new FareTypeType();
    }

    /**
     * Create an instance of {@link LISTPROPOSEDBOUNDType }
     * 
     */
    public LISTPROPOSEDBOUNDType createLISTPROPOSEDBOUNDType() {
        return new LISTPROPOSEDBOUNDType();
    }

    /**
     * Create an instance of {@link LISTFLIGHTType }
     * 
     */
    public LISTFLIGHTType createLISTFLIGHTType() {
        return new LISTFLIGHTType();
    }

    /**
     * Create an instance of {@link ListRecommendationOrientedPanelType }
     * 
     */
    public ListRecommendationOrientedPanelType createListRecommendationOrientedPanelType() {
        return new ListRecommendationOrientedPanelType();
    }

    /**
     * Create an instance of {@link CurrencyRefType }
     * 
     */
    public CurrencyRefType createCurrencyRefType() {
        return new CurrencyRefType();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEFEEINFOPERBOUND }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEFEEINFOPERBOUND createLISTSERVICEFEESGROUPTypeLISTSERVICEFEEINFOPERBOUND() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEFEEINFOPERBOUND();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICECOVERAGEINFOPERBOUND }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICECOVERAGEINFOPERBOUND createLISTSERVICEFEESGROUPTypeLISTSERVICECOVERAGEINFOPERBOUND() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICECOVERAGEINFOPERBOUND();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEFEEREFSPERBOUND }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEFEEREFSPERBOUND createLISTSERVICEFEESGROUPTypeLISTSERVICEFEEREFSPERBOUND() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEFEEREFSPERBOUND();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO.ITEMNUMBERDETAILS }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO.ITEMNUMBERDETAILS createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPFEEDESCRIPTIONGROUPITEMNUMBERINFOITEMNUMBERDETAILS() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.ITEMNUMBERINFO.ITEMNUMBERDETAILS();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SERVICEREQUIREMENTSINFO }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SERVICEREQUIREMENTSINFO createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPFEEDESCRIPTIONGROUPSERVICEDESCRIPTIONINFOSERVICEREQUIREMENTSINFO() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SERVICEREQUIREMENTSINFO();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SEATDETAILS }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SEATDETAILS createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPFEEDESCRIPTIONGROUPSERVICEDESCRIPTIONINFOSEATDETAILS() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEDESCRIPTIONINFO.SEATDETAILS();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME.FREETEXTQUALIFICATION }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME.FREETEXTQUALIFICATION createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPFEEDESCRIPTIONGROUPCOMMERCIALNAMEFREETEXTQUALIFICATION() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.COMMERCIALNAME.FREETEXTQUALIFICATION();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO.ATTRIBUTEDETAILS }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO.ATTRIBUTEDETAILS createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPFEEDESCRIPTIONGROUPSERVICEATTRIBUTESINFOATTRIBUTEDETAILS() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.FEEDESCRIPTIONGROUP.SERVICEATTRIBUTESINFO.ATTRIBUTEDETAILS();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATATYPEINFORMATION }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATATYPEINFORMATION createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPSERVICEOPTIONINFODATATYPEINFORMATION() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATATYPEINFORMATION();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATAINFORMATION }
     * 
     */
    public LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATAINFORMATION createLISTSERVICEFEESGROUPTypeLISTSERVICEDETAILSGROUPSERVICEOPTIONINFODATAINFORMATION() {
        return new LISTSERVICEFEESGROUPType.LISTSERVICEDETAILSGROUP.SERVICEOPTIONINFO.DATAINFORMATION();
    }

    /**
     * Create an instance of {@link LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER }
     * 
     */
    public LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER createLISTSERVICECOVERAGEINFOGROUPTypeITEMNUMBERINFOITEMNUMBER() {
        return new LISTSERVICECOVERAGEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER();
    }

    /**
     * Create an instance of {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.NUMBEROFITEMSDETAILS }
     * 
     */
    public LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.NUMBEROFITEMSDETAILS createLISTSERVICECOVERAGEINFOGROUPTypeSERVICECOVINFOGROUPCOVERAGEPERFLIGHTSINFONUMBEROFITEMSDETAILS() {
        return new LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.NUMBEROFITEMSDETAILS();
    }

    /**
     * Create an instance of {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.LASTITEMSDETAILS }
     * 
     */
    public LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.LASTITEMSDETAILS createLISTSERVICECOVERAGEINFOGROUPTypeSERVICECOVINFOGROUPCOVERAGEPERFLIGHTSINFOLASTITEMSDETAILS() {
        return new LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.COVERAGEPERFLIGHTSINFO.LASTITEMSDETAILS();
    }

    /**
     * Create an instance of {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO.REFERENCINGDETAIL }
     * 
     */
    public LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO.REFERENCINGDETAIL createLISTSERVICECOVERAGEINFOGROUPTypeSERVICECOVINFOGROUPREFINFOREFERENCINGDETAIL() {
        return new LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.REFINFO.REFERENCINGDETAIL();
    }

    /**
     * Create an instance of {@link LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO.TRAVELLERDETAILS }
     * 
     */
    public LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO.TRAVELLERDETAILS createLISTSERVICECOVERAGEINFOGROUPTypeSERVICECOVINFOGROUPPAXREFINFOTRAVELLERDETAILS() {
        return new LISTSERVICECOVERAGEINFOGROUPType.SERVICECOVINFOGROUP.PAXREFINFO.TRAVELLERDETAILS();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER createLISTSERVICEFEEINFOGROUPTypeITEMNUMBERINFOITEMNUMBER() {
        return new LISTSERVICEFEEINFOGROUPType.ITEMNUMBERINFO.ITEMNUMBER();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO.REFERENCINGDETAIL }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO.REFERENCINGDETAIL createLISTSERVICEFEEINFOGROUPTypeSERVICEDETAILSGROUPREFINFOREFERENCINGDETAIL() {
        return new LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.REFINFO.REFERENCINGDETAIL();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO.TRAVELLERDETAILS }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO.TRAVELLERDETAILS createLISTSERVICEFEEINFOGROUPTypeSERVICEDETAILSGROUPSERVICEMATCHEDINFOGROUPPAXREFINFOTRAVELLERDETAILS() {
        return new LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PAXREFINFO.TRAVELLERDETAILS();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO.MONETARYDETAIL }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO.MONETARYDETAIL createLISTSERVICEFEEINFOGROUPTypeSERVICEDETAILSGROUPSERVICEMATCHEDINFOGROUPAMOUNTINFOMONETARYDETAIL() {
        return new LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.AMOUNTINFO.MONETARYDETAIL();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO.FAREDETAILS }
     * 
     */
    public LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO.FAREDETAILS createLISTSERVICEFEEINFOGROUPTypeSERVICEDETAILSGROUPSERVICEMATCHEDINFOGROUPPRICINGINFOFAREDETAILS() {
        return new LISTSERVICEFEEINFOGROUPType.SERVICEDETAILSGROUP.SERVICEMATCHEDINFOGROUP.PRICINGINFO.FAREDETAILS();
    }

    /**
     * Create an instance of {@link FFCFFDictionaryMapping.LISTFAREFAMILY.LISTQUALIFIER }
     * 
     */
    public FFCFFDictionaryMapping.LISTFAREFAMILY.LISTQUALIFIER createFFCFFDictionaryMappingLISTFAREFAMILYLISTQUALIFIER() {
        return new FFCFFDictionaryMapping.LISTFAREFAMILY.LISTQUALIFIER();
    }

    /**
     * Create an instance of {@link FFCFFDictionaryMapping.LISTFAREFAMILY.LISTSERVICE }
     * 
     */
    public FFCFFDictionaryMapping.LISTFAREFAMILY.LISTSERVICE createFFCFFDictionaryMappingLISTFAREFAMILYLISTSERVICE() {
        return new FFCFFDictionaryMapping.LISTFAREFAMILY.LISTSERVICE();
    }

    /**
     * Create an instance of {@link FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND.LISTRECOMMENDATIONID }
     * 
     */
    public FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND.LISTRECOMMENDATIONID createFFCFFDictionaryMappingLISTFAREFAMILYLISTRECOLOWESTPRICELISTBOUNDLISTRECOMMENDATIONID() {
        return new FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND.LISTRECOMMENDATIONID();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.LISTTAB }
     * 
     */
    public ListRecommendationGroupType.LISTTAB createListRecommendationGroupTypeLISTTAB() {
        return new ListRecommendationGroupType.LISTTAB();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.TRIPPRICE }
     * 
     */
    public ListRecommendationGroupType.TRIPPRICE createListRecommendationGroupTypeTRIPPRICE() {
        return new ListRecommendationGroupType.TRIPPRICE();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.LISTEXCLUDED }
     * 
     */
    public ListRecommendationGroupType.LISTEXCLUDED createListRecommendationGroupTypeLISTEXCLUDED() {
        return new ListRecommendationGroupType.LISTEXCLUDED();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.LISTTHEME }
     * 
     */
    public ListRecommendationGroupType.LISTTHEME createListRecommendationGroupTypeLISTTHEME() {
        return new ListRecommendationGroupType.LISTTHEME();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.LISTTICKETINGINFORMATION }
     * 
     */
    public ListRecommendationGroupType.LISTTICKETINGINFORMATION createListRecommendationGroupTypeLISTTICKETINGINFORMATION() {
        return new ListRecommendationGroupType.LISTTICKETINGINFORMATION();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTBOUND }
     * 
     */
    public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTBOUND createListRecommendationGroupTypeRECOMMENDATIONDESCRIPTIONLISTCOMBINATIONDESCRIPTIONLISTBOUND() {
        return new ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTBOUND();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.TRAVELLERTYPE }
     * 
     */
    public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.TRAVELLERTYPE createListRecommendationGroupTypeRECOMMENDATIONDESCRIPTIONLISTCOMBINATIONDESCRIPTIONLISTTRAVELLERDESCRIPTIONTRAVELLERTYPE() {
        return new ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.TRAVELLERTYPE();
    }

    /**
     * Create an instance of {@link ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO.LISTALLOWANCEDESCRIPTOR }
     * 
     */
    public ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO.LISTALLOWANCEDESCRIPTOR createListRecommendationGroupTypeRECOMMENDATIONDESCRIPTIONLISTCOMBINATIONDESCRIPTIONLISTTRAVELLERDESCRIPTIONBAGGAGEALLOWANCELISTBOUNDLISTSEGMENTLISTFBDINFOLISTALLOWANCEDESCRIPTOR() {
        return new ListRecommendationGroupType.RECOMMENDATIONDESCRIPTION.LISTCOMBINATIONDESCRIPTION.LISTTRAVELLERDESCRIPTION.BAGGAGEALLOWANCE.LISTBOUND.LISTSEGMENT.LISTFBDINFO.LISTALLOWANCEDESCRIPTOR();
    }

    /**
     * Create an instance of {@link REDEMPTIONLISTTRAVELLERTYPE.LISTTRAVELLER }
     * 
     */
    public REDEMPTIONLISTTRAVELLERTYPE.LISTTRAVELLER createREDEMPTIONLISTTRAVELLERTYPELISTTRAVELLER() {
        return new REDEMPTIONLISTTRAVELLERTYPE.LISTTRAVELLER();
    }

    /**
     * Create an instance of {@link REDEMPTIONLISTTRAVELLERTYPE.TRAVELLERTYPE }
     * 
     */
    public REDEMPTIONLISTTRAVELLERTYPE.TRAVELLERTYPE createREDEMPTIONLISTTRAVELLERTYPETRAVELLERTYPE() {
        return new REDEMPTIONLISTTRAVELLERTYPE.TRAVELLERTYPE();
    }

    /**
     * Create an instance of {@link REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.TYPE }
     * 
     */
    public REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.TYPE createREDEMPTIONINFOTypeLISTREDEMPTIONREDEMPTIONTYPE() {
        return new REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.TYPE();
    }

    /**
     * Create an instance of {@link REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.SUBTYPE }
     * 
     */
    public REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.SUBTYPE createREDEMPTIONINFOTypeLISTREDEMPTIONREDEMPTIONSUBTYPE() {
        return new REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.SUBTYPE();
    }

    /**
     * Create an instance of {@link REDEMPTIONINFOType.LISTTRAVELLER.TRAVELLERTYPE }
     * 
     */
    public REDEMPTIONINFOType.LISTTRAVELLER.TRAVELLERTYPE createREDEMPTIONINFOTypeLISTTRAVELLERTRAVELLERTYPE() {
        return new REDEMPTIONINFOType.LISTTRAVELLER.TRAVELLERTYPE();
    }

    /**
     * Create an instance of {@link BookedLISTTRAVELLERTYPE.LISTTRAVELLER }
     * 
     */
    public BookedLISTTRAVELLERTYPE.LISTTRAVELLER createBookedLISTTRAVELLERTYPELISTTRAVELLER() {
        return new BookedLISTTRAVELLERTYPE.LISTTRAVELLER();
    }

    /**
     * Create an instance of {@link BookedLISTTRAVELLERTYPE.TRAVELLERTYPE }
     * 
     */
    public BookedLISTTRAVELLERTYPE.TRAVELLERTYPE createBookedLISTTRAVELLERTYPETRAVELLERTYPE() {
        return new BookedLISTTRAVELLERTYPE.TRAVELLERTYPE();
    }

    /**
     * Create an instance of {@link BOOKEDPRICEType.CURRENCY }
     * 
     */
    public BOOKEDPRICEType.CURRENCY createBOOKEDPRICETypeCURRENCY() {
        return new BOOKEDPRICEType.CURRENCY();
    }

    /**
     * Create an instance of {@link LISTSERVICEFEEREFS.REFINFO.REFERENCINGDETAIL }
     * 
     */
    public LISTSERVICEFEEREFS.REFINFO.REFERENCINGDETAIL createLISTSERVICEFEEREFSREFINFOREFERENCINGDETAIL() {
        return new LISTSERVICEFEEREFS.REFINFO.REFERENCINGDETAIL();
    }

    /**
     * Create an instance of {@link com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.LSADEBUGINFO }
     * 
     */
    public com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.LSADEBUGINFO createLISTBOUNDLISTFLIGHTLSADEBUGINFO() {
        return new com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.LSADEBUGINFO();
    }

    /**
     * Create an instance of {@link com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.LISTFLIGHTFACT }
     * 
     */
    public com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.LISTFLIGHTFACT createLISTBOUNDLISTFLIGHTLISTFLIGHTFACT() {
        return new com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.LISTFLIGHTFACT();
    }

    /**
     * Create an instance of {@link com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.ELIGIBLEOCRECOMMENDATION }
     * 
     */
    public com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.ELIGIBLEOCRECOMMENDATION createLISTBOUNDLISTFLIGHTELIGIBLEOCRECOMMENDATION() {
        return new com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.ELIGIBLEOCRECOMMENDATION();
    }

    /**
     * Create an instance of {@link com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.LISTSEGMENT.LISTRBDINFO }
     * 
     */
    public com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.LISTSEGMENT.LISTRBDINFO createLISTBOUNDLISTFLIGHTLISTSEGMENTLISTRBDINFO() {
        return new com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput.LISTBOUND.LISTFLIGHT.LISTSEGMENT.LISTRBDINFO();
    }

    /**
     * Create an instance of {@link TripPriceType.CURRENCY }
     * 
     */
    public TripPriceType.CURRENCY createTripPriceTypeCURRENCY() {
        return new TripPriceType.CURRENCY();
    }

    /**
     * Create an instance of {@link ListTravellerType.LISTTRAVELLER }
     * 
     */
    public ListTravellerType.LISTTRAVELLER createListTravellerTypeLISTTRAVELLER() {
        return new ListTravellerType.LISTTRAVELLER();
    }

    /**
     * Create an instance of {@link ListTravellerType.TRAVELLERTYPE }
     * 
     */
    public ListTravellerType.TRAVELLERTYPE createListTravellerTypeTRAVELLERTYPE() {
        return new ListTravellerType.TRAVELLERTYPE();
    }

    /**
     * Create an instance of {@link ListTravellerType.TRAVELLERPRICE }
     * 
     */
    public ListTravellerType.TRAVELLERPRICE createListTravellerTypeTRAVELLERPRICE() {
        return new ListTravellerType.TRAVELLERPRICE();
    }

    /**
     * Create an instance of {@link ListTravellerType.TRAVELLERTYPEPRICE }
     * 
     */
    public ListTravellerType.TRAVELLERTYPEPRICE createListTravellerTypeTRAVELLERTYPEPRICE() {
        return new ListTravellerType.TRAVELLERTYPEPRICE();
    }

    /**
     * Create an instance of {@link ListTravellerType.LISTBOUND.LISTSEGMENT.LISTFARETYPES }
     * 
     */
    public ListTravellerType.LISTBOUND.LISTSEGMENT.LISTFARETYPES createListTravellerTypeLISTBOUNDLISTSEGMENTLISTFARETYPES() {
        return new ListTravellerType.LISTBOUND.LISTSEGMENT.LISTFARETYPES();
    }

    /**
     * Create an instance of {@link ListPNRType.PNRPRICE }
     * 
     */
    public ListPNRType.PNRPRICE createListPNRTypePNRPRICE() {
        return new ListPNRType.PNRPRICE();
    }

    /**
     * Create an instance of {@link ListPanelType.LOCATIONDICTIONARY }
     * 
     */
    public ListPanelType.LOCATIONDICTIONARY createListPanelTypeLOCATIONDICTIONARY() {
        return new ListPanelType.LOCATIONDICTIONARY();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY.LISTMONETARYDETAILS }
     * 
     */
    public ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY.LISTMONETARYDETAILS createListPanelTypeMINIRULESTYPEQUALIFIERDICTIONARYLISTMONETARYDETAILS() {
        return new ListPanelType.MINIRULESTYPEQUALIFIERDICTIONARY.LISTMONETARYDETAILS();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.MNRREF }
     * 
     */
    public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.MNRREF createListPanelTypeMINIRULESDICTIONARYLISTMNRDETAILSMNRREF() {
        return new ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.MNRREF();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.CATINFO }
     * 
     */
    public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.CATINFO createListPanelTypeMINIRULESDICTIONARYLISTMNRDETAILSCATGRPLISTCATGROUPCATINFO() {
        return new ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.CATINFO();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO.LISTSTATUSINFORMATION }
     * 
     */
    public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO.LISTSTATUSINFORMATION createListPanelTypeMINIRULESDICTIONARYLISTMNRDETAILSCATGRPLISTCATGROUPSTATUSINFOLISTSTATUSINFORMATION() {
        return new ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.STATUSINFO.LISTSTATUSINFORMATION();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.MONETARYDETAILS }
     * 
     */
    public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.MONETARYDETAILS createListPanelTypeMINIRULESDICTIONARYLISTMNRDETAILSCATGRPLISTCATGROUPMONETARYINFOMONETARYDETAILS() {
        return new ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.MONETARYDETAILS();
    }

    /**
     * Create an instance of {@link ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.OTHERMONETARYDETAILS }
     * 
     */
    public ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.OTHERMONETARYDETAILS createListPanelTypeMINIRULESDICTIONARYLISTMNRDETAILSCATGRPLISTCATGROUPMONETARYINFOOTHERMONETARYDETAILS() {
        return new ListPanelType.MINIRULESDICTIONARY.LISTMNRDETAILS.CATGRP.LISTCATGROUP.MONETARYINFO.OTHERMONETARYDETAILS();
    }

    /**
     * Create an instance of {@link ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE.LISTMONETARYDETAIL }
     * 
     */
    public ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE.LISTMONETARYDETAIL createListPanelTypeTICKETINGINFORMATIONDICTIONARYLISTPRICINGMESSAGELISTMONETARYDETAIL() {
        return new ListPanelType.TICKETINGINFORMATIONDICTIONARY.LISTPRICINGMESSAGE.LISTMONETARYDETAIL();
    }

    /**
     * Create an instance of {@link ListPanelType.TRAVELLERTYPEDICTIONARY.LISTTRAVELLERTYPE }
     * 
     */
    public ListPanelType.TRAVELLERTYPEDICTIONARY.LISTTRAVELLERTYPE createListPanelTypeTRAVELLERTYPEDICTIONARYLISTTRAVELLERTYPE() {
        return new ListPanelType.TRAVELLERTYPEDICTIONARY.LISTTRAVELLERTYPE();
    }

    /**
     * Create an instance of {@link ListPanelType.EQUIPMENTDICTIONARY.LISTEQUIPMENT }
     * 
     */
    public ListPanelType.EQUIPMENTDICTIONARY.LISTEQUIPMENT createListPanelTypeEQUIPMENTDICTIONARYLISTEQUIPMENT() {
        return new ListPanelType.EQUIPMENTDICTIONARY.LISTEQUIPMENT();
    }

    /**
     * Create an instance of {@link ListPanelType.AIRLINEDICTIONARY.LISTAIRLINE }
     * 
     */
    public ListPanelType.AIRLINEDICTIONARY.LISTAIRLINE createListPanelTypeAIRLINEDICTIONARYLISTAIRLINE() {
        return new ListPanelType.AIRLINEDICTIONARY.LISTAIRLINE();
    }

    /**
     * Create an instance of {@link ListPanelType.PRICEDICTIONARY.LISTPRICE }
     * 
     */
    public ListPanelType.PRICEDICTIONARY.LISTPRICE createListPanelTypePRICEDICTIONARYLISTPRICE() {
        return new ListPanelType.PRICEDICTIONARY.LISTPRICE();
    }

    /**
     * Create an instance of {@link ListPanelType.THEMEDICTIONARY.LISTTHEME }
     * 
     */
    public ListPanelType.THEMEDICTIONARY.LISTTHEME createListPanelTypeTHEMEDICTIONARYLISTTHEME() {
        return new ListPanelType.THEMEDICTIONARY.LISTTHEME();
    }

    /**
     * Create an instance of {@link ListPanelType.FLIGHTDICTIONARY.LISTFLIGHTSPERBOUND }
     * 
     */
    public ListPanelType.FLIGHTDICTIONARY.LISTFLIGHTSPERBOUND createListPanelTypeFLIGHTDICTIONARYLISTFLIGHTSPERBOUND() {
        return new ListPanelType.FLIGHTDICTIONARY.LISTFLIGHTSPERBOUND();
    }

    /**
     * Create an instance of {@link ListDestinationType.BDATE }
     * 
     */
    public ListDestinationType.BDATE createListDestinationTypeBDATE() {
        return new ListDestinationType.BDATE();
    }

    /**
     * Create an instance of {@link ListDestinationType.DATERANGE }
     * 
     */
    public ListDestinationType.DATERANGE createListDestinationTypeDATERANGE() {
        return new ListDestinationType.DATERANGE();
    }

    /**
     * Create an instance of {@link SearchDataType.LISTLIGHTFAREFAMILY }
     * 
     */
    public SearchDataType.LISTLIGHTFAREFAMILY createSearchDataTypeLISTLIGHTFAREFAMILY() {
        return new SearchDataType.LISTLIGHTFAREFAMILY();
    }

    /**
     * Create an instance of {@link LISTOCRECOMMENDATIONType.LISTBOUND }
     * 
     */
    public LISTOCRECOMMENDATIONType.LISTBOUND createLISTOCRECOMMENDATIONTypeLISTBOUND() {
        return new LISTOCRECOMMENDATIONType.LISTBOUND();
    }

    /**
     * Create an instance of {@link ListEmptyTabType.LISTREASON }
     * 
     */
    public ListEmptyTabType.LISTREASON createListEmptyTabTypeLISTREASON() {
        return new ListEmptyTabType.LISTREASON();
    }

    /**
     * Create an instance of {@link ListEmptyTabType.LISTDATE.DATE }
     * 
     */
    public ListEmptyTabType.LISTDATE.DATE createListEmptyTabTypeLISTDATEDATE() {
        return new ListEmptyTabType.LISTDATE.DATE();
    }

    /**
     * Create an instance of {@link ListTabType.LISTCITY }
     * 
     */
    public ListTabType.LISTCITY createListTabTypeLISTCITY() {
        return new ListTabType.LISTCITY();
    }

    /**
     * Create an instance of {@link ListTabType.LISTDATE.DATE }
     * 
     */
    public ListTabType.LISTDATE.DATE createListTabTypeLISTDATEDATE() {
        return new ListTabType.LISTDATE.DATE();
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

}
