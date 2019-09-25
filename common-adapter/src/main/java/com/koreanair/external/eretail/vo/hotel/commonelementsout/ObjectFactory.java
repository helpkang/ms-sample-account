
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.common.common.GDSCABINCODEType;
import com.koreanair.external.eretail.vo.common.common.LISTTRIPREASONtype;
import com.koreanair.external.eretail.vo.common.common.OperationalDataType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.external.eretail.vo.hotel.commonelementsout package. 
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
    private final static QName _ROOMCLASSID_QNAME = new QName("", "ROOM_CLASS_ID");
    private final static QName _PORCOUNTRYCODE_QNAME = new QName("", "POR_COUNTRY_CODE");
    private final static QName _PORSTATECODE_QNAME = new QName("", "POR_STATE_CODE");
    private final static QName _PORCATEGORY_QNAME = new QName("", "POR_CATEGORY");
    private final static QName _LISTFACILITY_QNAME = new QName("", "LIST_FACILITY");
    private final static QName _LISTHOTELNAME_QNAME = new QName("", "LIST_HOTEL_NAME");
    private final static QName _STREETADDRESS_QNAME = new QName("", "STREET_ADDRESS");
    private final static QName _ZIPCODE_QNAME = new QName("", "ZIP_CODE");
    private final static QName _COUNTRYCODE_QNAME = new QName("", "COUNTRY_CODE");
    private final static QName _MULTIPLICITY_QNAME = new QName("", "MULTIPLICITY");
    private final static QName _TARGET_QNAME = new QName("", "TARGET");
    private final static QName _POLICYAGENCY_QNAME = new QName("", "POLICY_AGENCY");
    private final static QName _TRAVELLERPREFERENCES_QNAME = new QName("", "TRAVELLER_PREFERENCES");
    private final static QName _POLICIES_QNAME = new QName("", "POLICIES");
    private final static QName _POLICYCOMPANY_QNAME = new QName("", "POLICY_COMPANY");
    private final static QName _LISTHOTELCHAINS_QNAME = new QName("", "LIST_HOTEL_CHAINS");
    private final static QName _HOTELNAME_QNAME = new QName("", "HOTEL_NAME");
    private final static QName _LISTFACILITIES_QNAME = new QName("", "LIST_FACILITIES");
    private final static QName _MAXIMUMPRICE_QNAME = new QName("", "MAXIMUM_PRICE");
    private final static QName _TRAVELLERROOMTYPE_QNAME = new QName("", "TRAVELLER_ROOM_TYPE");
    private final static QName _LISTTRAVELLERPREFERENCES_QNAME = new QName("", "LIST_TRAVELLER_PREFERENCES");
    private final static QName _AREA_QNAME = new QName("", "AREA");
    private final static QName _BEDTYPE_QNAME = new QName("", "BED_TYPE");
    private final static QName _BEDCOUNT_QNAME = new QName("", "BED_COUNT");
    private final static QName _CHECKSELLRULES_QNAME = new QName("", "CHECK_SELL_RULES");
    private final static QName _CORPORATEIDREQUIRED_QNAME = new QName("", "CORPORATE_ID_REQUIRED");
    private final static QName _DEPOSITREQUIRED_QNAME = new QName("", "DEPOSIT_REQUIRED");
    private final static QName _GUARANTEEREQUIRED_QNAME = new QName("", "GUARANTEE_REQUIRED");
    private final static QName _MAXBUDGET_QNAME = new QName("", "MAX_BUDGET");
    private final static QName _MINBUDGET_QNAME = new QName("", "MIN_BUDGET");
    private final static QName _MEAL_QNAME = new QName("", "MEAL");
    private final static QName _OCCUPANCY_QNAME = new QName("", "OCCUPANCY");
    private final static QName _PRICE_QNAME = new QName("", "PRICE");
    private final static QName _RATECHANGE_QNAME = new QName("", "RATE_CHANGE");
    private final static QName _ROOMTYPE_QNAME = new QName("", "ROOM_TYPE");
    private final static QName _SORTCRITERIA_QNAME = new QName("", "SORT_CRITERIA");
    private final static QName _TRANSPORTATION_QNAME = new QName("", "TRANSPORTATION");
    private final static QName _LISTHOTEL_QNAME = new QName("", "LIST_HOTEL");
    private final static QName _LISTNEGOHOTEL_QNAME = new QName("", "LIST_NEGO_HOTEL");
    private final static QName _PORLATITUDE_QNAME = new QName("", "POR_LATITUDE");
    private final static QName _PORLONGITUDE_QNAME = new QName("", "POR_LONGITUDE");
    private final static QName _LISTPOI_QNAME = new QName("", "LIST_POI");
    private final static QName _LISTSTRUCTUREDPOI_QNAME = new QName("", "LIST_STRUCTURED_POI");
    private final static QName _LISTSPECIALRATE_QNAME = new QName("", "LIST_SPECIAL_RATE");
    private final static QName _SPECIALRATEMODE_QNAME = new QName("", "SPECIAL_RATE_MODE");
    private final static QName _USERSPECIALRATEMODE_QNAME = new QName("", "USER_SPECIAL_RATE_MODE");
    private final static QName _LISTUSERSPECIALRATE_QNAME = new QName("", "LIST_USER_SPECIAL_RATE");
    private final static QName _LISTUSERSPECIALRATEPROFILE_QNAME = new QName("", "LIST_USER_SPECIAL_RATE_PROFILE");
    private final static QName _LISTAVAILABLERATE_QNAME = new QName("", "LIST_AVAILABLE_RATE");
    private final static QName _BESTAVAILABLERATE_QNAME = new QName("", "BEST_AVAILABLE_RATE");
    private final static QName _LISTROOM_QNAME = new QName("", "LIST_ROOM");
    private final static QName _LISTTERM_QNAME = new QName("", "LIST_TERM");
    private final static QName _BOOKINGCODE_QNAME = new QName("", "BOOKING_CODE");
    private final static QName _ROOMID_QNAME = new QName("", "ROOM_ID");
    private final static QName _AVAILABILITY_QNAME = new QName("", "AVAILABILITY");
    private final static QName _GDSCODE_QNAME = new QName("", "GDS_CODE");
    private final static QName _ACCESSLEVEL_QNAME = new QName("", "ACCESS_LEVEL");
    private final static QName _PROVIDERDESCRIPTION_QNAME = new QName("", "PROVIDER_DESCRIPTION");
    private final static QName _AMOUNTWITHOUTMARKUP_QNAME = new QName("", "AMOUNT_WITHOUT_MARKUP");
    private final static QName _MARKUPOVERRIDABLE_QNAME = new QName("", "MARKUP_OVERRIDABLE");
    private final static QName _PRICEWITHMARKUP_QNAME = new QName("", "PRICE_WITH_MARKUP");
    private final static QName _MARKUPINDICATOR_QNAME = new QName("", "MARKUP_INDICATOR");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.external.eretail.vo.hotel.commonelementsout
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MARKUP }
     * 
     */
    public MARKUP createMARKUP() {
        return new MARKUP();
    }

    /**
     * Create an instance of {@link MARKUPAMOUNT }
     * 
     */
    public MARKUPAMOUNT createMARKUPAMOUNT() {
        return new MARKUPAMOUNT();
    }

    /**
     * Create an instance of {@link DESCRIPTIONMULTDESCTYPE }
     * 
     */
    public DESCRIPTIONMULTDESCTYPE createDESCRIPTIONMULTDESCTYPE() {
        return new DESCRIPTIONMULTDESCTYPE();
    }

    /**
     * Create an instance of {@link CANCELLATIONPOLICYTYPE }
     * 
     */
    public CANCELLATIONPOLICYTYPE createCANCELLATIONPOLICYTYPE() {
        return new CANCELLATIONPOLICYTYPE();
    }

    /**
     * Create an instance of {@link CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE }
     * 
     */
    public CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE createCANCELLATIONPOLICYTYPERELATIVEDEADLINEDATE() {
        return new CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE();
    }

    /**
     * Create an instance of {@link MISCPETPOLICYTYPE }
     * 
     */
    public MISCPETPOLICYTYPE createMISCPETPOLICYTYPE() {
        return new MISCPETPOLICYTYPE();
    }

    /**
     * Create an instance of {@link MISCPETPOLICYTYPE.MAXIMUMMEASURE }
     * 
     */
    public MISCPETPOLICYTYPE.MAXIMUMMEASURE createMISCPETPOLICYTYPEMAXIMUMMEASURE() {
        return new MISCPETPOLICYTYPE.MAXIMUMMEASURE();
    }

    /**
     * Create an instance of {@link MISCGUESTPOLICYTYPE }
     * 
     */
    public MISCGUESTPOLICYTYPE createMISCGUESTPOLICYTYPE() {
        return new MISCGUESTPOLICYTYPE();
    }

    /**
     * Create an instance of {@link MISCPOLICIESTYPE }
     * 
     */
    public MISCPOLICIESTYPE createMISCPOLICIESTYPE() {
        return new MISCPOLICIESTYPE();
    }

    /**
     * Create an instance of {@link GUESTROOMTYPE }
     * 
     */
    public GUESTROOMTYPE createGUESTROOMTYPE() {
        return new GUESTROOMTYPE();
    }

    /**
     * Create an instance of {@link GUESTROOMTYPE.LISTROOMAMENITIES }
     * 
     */
    public GUESTROOMTYPE.LISTROOMAMENITIES createGUESTROOMTYPELISTROOMAMENITIES() {
        return new GUESTROOMTYPE.LISTROOMAMENITIES();
    }

    /**
     * Create an instance of {@link GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE }
     * 
     */
    public GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE createGUESTROOMTYPELISTROOMAMENITIESLISTCHARGE() {
        return new GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE();
    }

    /**
     * Create an instance of {@link RESTAURANTTYPE }
     * 
     */
    public RESTAURANTTYPE createRESTAURANTTYPE() {
        return new RESTAURANTTYPE();
    }

    /**
     * Create an instance of {@link RESTAURANTTYPE.LISTOPERATIONSCHEDULE }
     * 
     */
    public RESTAURANTTYPE.LISTOPERATIONSCHEDULE createRESTAURANTTYPELISTOPERATIONSCHEDULE() {
        return new RESTAURANTTYPE.LISTOPERATIONSCHEDULE();
    }

    /**
     * Create an instance of {@link RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE }
     * 
     */
    public RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE createRESTAURANTTYPELISTOPERATIONSCHEDULELISTCHARGE() {
        return new RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE();
    }

    /**
     * Create an instance of {@link MEETINGROOMTYPE }
     * 
     */
    public MEETINGROOMTYPE createMEETINGROOMTYPE() {
        return new MEETINGROOMTYPE();
    }

    /**
     * Create an instance of {@link LOYALPROGRAMTYPE }
     * 
     */
    public LOYALPROGRAMTYPE createLOYALPROGRAMTYPE() {
        return new LOYALPROGRAMTYPE();
    }

    /**
     * Create an instance of {@link HOTELINFOTYPE }
     * 
     */
    public HOTELINFOTYPE createHOTELINFOTYPE() {
        return new HOTELINFOTYPE();
    }

    /**
     * Create an instance of {@link AREARECREATIONTYPE }
     * 
     */
    public AREARECREATIONTYPE createAREARECREATIONTYPE() {
        return new AREARECREATIONTYPE();
    }

    /**
     * Create an instance of {@link AREARECREATIONTYPE.LISTRECREATIONDETAILS }
     * 
     */
    public AREARECREATIONTYPE.LISTRECREATIONDETAILS createAREARECREATIONTYPELISTRECREATIONDETAILS() {
        return new AREARECREATIONTYPE.LISTRECREATIONDETAILS();
    }

    /**
     * Create an instance of {@link LISTPAYMENTTYPEType }
     * 
     */
    public LISTPAYMENTTYPEType createLISTPAYMENTTYPEType() {
        return new LISTPAYMENTTYPEType();
    }

    /**
     * Create an instance of {@link TOTALPRICINGSimpleType }
     * 
     */
    public TOTALPRICINGSimpleType createTOTALPRICINGSimpleType() {
        return new TOTALPRICINGSimpleType();
    }

    /**
     * Create an instance of {@link HOTELFEATURESCATEGORIESIMAGESTYPE }
     * 
     */
    public HOTELFEATURESCATEGORIESIMAGESTYPE createHOTELFEATURESCATEGORIESIMAGESTYPE() {
        return new HOTELFEATURESCATEGORIESIMAGESTYPE();
    }

    /**
     * Create an instance of {@link STRUTUREDPORCITY }
     * 
     */
    public STRUTUREDPORCITY createSTRUTUREDPORCITY() {
        return new STRUTUREDPORCITY();
    }

    /**
     * Create an instance of {@link HOTELTYPE2 }
     * 
     */
    public HOTELTYPE2 createHOTELTYPE2() {
        return new HOTELTYPE2();
    }

    /**
     * Create an instance of {@link HOTELTYPE1 }
     * 
     */
    public HOTELTYPE1 createHOTELTYPE1() {
        return new HOTELTYPE1();
    }

    /**
     * Create an instance of {@link LISTRATETYPE1 }
     * 
     */
    public LISTRATETYPE1 createLISTRATETYPE1() {
        return new LISTRATETYPE1();
    }

    /**
     * Create an instance of {@link MARKUPAMOUNT.LISTPRICE }
     * 
     */
    public MARKUPAMOUNT.LISTPRICE createMARKUPAMOUNTLISTPRICE() {
        return new MARKUPAMOUNT.LISTPRICE();
    }

    /**
     * Create an instance of {@link LISTTERMITEMTYPE }
     * 
     */
    public LISTTERMITEMTYPE createLISTTERMITEMTYPE() {
        return new LISTTERMITEMTYPE();
    }

    /**
     * Create an instance of {@link LISTROOMITEMTYPE }
     * 
     */
    public LISTROOMITEMTYPE createLISTROOMITEMTYPE() {
        return new LISTROOMITEMTYPE();
    }

    /**
     * Create an instance of {@link STRUTUREDPOITYPE }
     * 
     */
    public STRUTUREDPOITYPE createSTRUTUREDPOITYPE() {
        return new STRUTUREDPOITYPE();
    }

    /**
     * Create an instance of {@link HTLPOLICYTYPE }
     * 
     */
    public HTLPOLICYTYPE createHTLPOLICYTYPE() {
        return new HTLPOLICYTYPE();
    }

    /**
     * Create an instance of {@link TRAVELLERPREFERENCETYPE }
     * 
     */
    public TRAVELLERPREFERENCETYPE createTRAVELLERPREFERENCETYPE() {
        return new TRAVELLERPREFERENCETYPE();
    }

    /**
     * Create an instance of {@link HTLPOLICIESTYPE }
     * 
     */
    public HTLPOLICIESTYPE createHTLPOLICIESTYPE() {
        return new HTLPOLICIESTYPE();
    }

    /**
     * Create an instance of {@link PREFERENCETYPE }
     * 
     */
    public PREFERENCETYPE createPREFERENCETYPE() {
        return new PREFERENCETYPE();
    }

    /**
     * Create an instance of {@link LISTTRAVELLERPREFERENCETYPE }
     * 
     */
    public LISTTRAVELLERPREFERENCETYPE createLISTTRAVELLERPREFERENCETYPE() {
        return new LISTTRAVELLERPREFERENCETYPE();
    }

    /**
     * Create an instance of {@link HTLAREATYPE }
     * 
     */
    public HTLAREATYPE createHTLAREATYPE() {
        return new HTLAREATYPE();
    }

    /**
     * Create an instance of {@link BEDTYPE1 }
     * 
     */
    public BEDTYPE1 createBEDTYPE1() {
        return new BEDTYPE1();
    }

    /**
     * Create an instance of {@link MEALTYPE }
     * 
     */
    public MEALTYPE createMEALTYPE() {
        return new MEALTYPE();
    }

    /**
     * Create an instance of {@link ROOMTYPE1 }
     * 
     */
    public ROOMTYPE1 createROOMTYPE1() {
        return new ROOMTYPE1();
    }

    /**
     * Create an instance of {@link TRANSPORTATIONTYPE }
     * 
     */
    public TRANSPORTATIONTYPE createTRANSPORTATIONTYPE() {
        return new TRANSPORTATIONTYPE();
    }

    /**
     * Create an instance of {@link HOTELSTANDARDTYPE }
     * 
     */
    public HOTELSTANDARDTYPE createHOTELSTANDARDTYPE() {
        return new HOTELSTANDARDTYPE();
    }

    /**
     * Create an instance of {@link HOTELNEGOTYPE }
     * 
     */
    public HOTELNEGOTYPE createHOTELNEGOTYPE() {
        return new HOTELNEGOTYPE();
    }

    /**
     * Create an instance of {@link LISTRATE }
     * 
     */
    public LISTRATE createLISTRATE() {
        return new LISTRATE();
    }

    /**
     * Create an instance of {@link HTLPRICETYPE }
     * 
     */
    public HTLPRICETYPE createHTLPRICETYPE() {
        return new HTLPRICETYPE();
    }

    /**
     * Create an instance of {@link MARKUP.LISTPRICE }
     * 
     */
    public MARKUP.LISTPRICE createMARKUPLISTPRICE() {
        return new MARKUP.LISTPRICE();
    }

    /**
     * Create an instance of {@link LISTADDRESS }
     * 
     */
    public LISTADDRESS createLISTADDRESS() {
        return new LISTADDRESS();
    }

    /**
     * Create an instance of {@link GEOCODETYPE }
     * 
     */
    public GEOCODETYPE createGEOCODETYPE() {
        return new GEOCODETYPE();
    }

    /**
     * Create an instance of {@link RATEDETAILS }
     * 
     */
    public RATEDETAILS createRATEDETAILS() {
        return new RATEDETAILS();
    }

    /**
     * Create an instance of {@link DESCRIPTIONTYPE }
     * 
     */
    public DESCRIPTIONTYPE createDESCRIPTIONTYPE() {
        return new DESCRIPTIONTYPE();
    }

    /**
     * Create an instance of {@link QUESTIONTYPE }
     * 
     */
    public QUESTIONTYPE createQUESTIONTYPE() {
        return new QUESTIONTYPE();
    }

    /**
     * Create an instance of {@link CATEGORYRATINGTYPE }
     * 
     */
    public CATEGORYRATINGTYPE createCATEGORYRATINGTYPE() {
        return new CATEGORYRATINGTYPE();
    }

    /**
     * Create an instance of {@link ROOMFEE }
     * 
     */
    public ROOMFEE createROOMFEE() {
        return new ROOMFEE();
    }

    /**
     * Create an instance of {@link HTLBDATE }
     * 
     */
    public HTLBDATE createHTLBDATE() {
        return new HTLBDATE();
    }

    /**
     * Create an instance of {@link HTLEDATE }
     * 
     */
    public HTLEDATE createHTLEDATE() {
        return new HTLEDATE();
    }

    /**
     * Create an instance of {@link HTLRATETYPE }
     * 
     */
    public HTLRATETYPE createHTLRATETYPE() {
        return new HTLRATETYPE();
    }

    /**
     * Create an instance of {@link MARKETINGTEXTTYPE }
     * 
     */
    public MARKETINGTEXTTYPE createMARKETINGTEXTTYPE() {
        return new MARKETINGTEXTTYPE();
    }

    /**
     * Create an instance of {@link MULTIMEDIATYPE }
     * 
     */
    public MULTIMEDIATYPE createMULTIMEDIATYPE() {
        return new MULTIMEDIATYPE();
    }

    /**
     * Create an instance of {@link MULTIMEDIAERRORSTYPE }
     * 
     */
    public MULTIMEDIAERRORSTYPE createMULTIMEDIAERRORSTYPE() {
        return new MULTIMEDIAERRORSTYPE();
    }

    /**
     * Create an instance of {@link BLOCATIONITEMTYPE1 }
     * 
     */
    public BLOCATIONITEMTYPE1 createBLOCATIONITEMTYPE1() {
        return new BLOCATIONITEMTYPE1();
    }

    /**
     * Create an instance of {@link BLOCATIONITEMTYPE2 }
     * 
     */
    public BLOCATIONITEMTYPE2 createBLOCATIONITEMTYPE2() {
        return new BLOCATIONITEMTYPE2();
    }

    /**
     * Create an instance of {@link BLOCATIONITEMTYPE3 }
     * 
     */
    public BLOCATIONITEMTYPE3 createBLOCATIONITEMTYPE3() {
        return new BLOCATIONITEMTYPE3();
    }

    /**
     * Create an instance of {@link BLOCATIONITEMTYPE5 }
     * 
     */
    public BLOCATIONITEMTYPE5 createBLOCATIONITEMTYPE5() {
        return new BLOCATIONITEMTYPE5();
    }

    /**
     * Create an instance of {@link BEDTYPE2 }
     * 
     */
    public BEDTYPE2 createBEDTYPE2() {
        return new BEDTYPE2();
    }

    /**
     * Create an instance of {@link CHECKINPOLICYTYPE }
     * 
     */
    public CHECKINPOLICYTYPE createCHECKINPOLICYTYPE() {
        return new CHECKINPOLICYTYPE();
    }

    /**
     * Create an instance of {@link CATEGORYTYPE }
     * 
     */
    public CATEGORYTYPE createCATEGORYTYPE() {
        return new CATEGORYTYPE();
    }

    /**
     * Create an instance of {@link FACILITYTYPE }
     * 
     */
    public FACILITYTYPE createFACILITYTYPE() {
        return new FACILITYTYPE();
    }

    /**
     * Create an instance of {@link IATATYPE }
     * 
     */
    public IATATYPE createIATATYPE() {
        return new IATATYPE();
    }

    /**
     * Create an instance of {@link COMPANYTYPE2 }
     * 
     */
    public COMPANYTYPE2 createCOMPANYTYPE2() {
        return new COMPANYTYPE2();
    }

    /**
     * Create an instance of {@link COMPANYTYPE3 }
     * 
     */
    public COMPANYTYPE3 createCOMPANYTYPE3() {
        return new COMPANYTYPE3();
    }

    /**
     * Create an instance of {@link COMPANYTYPE1 }
     * 
     */
    public COMPANYTYPE1 createCOMPANYTYPE1() {
        return new COMPANYTYPE1();
    }

    /**
     * Create an instance of {@link CURRENCYTYPE2 }
     * 
     */
    public CURRENCYTYPE2 createCURRENCYTYPE2() {
        return new CURRENCYTYPE2();
    }

    /**
     * Create an instance of {@link CURRENCYTYPE3 }
     * 
     */
    public CURRENCYTYPE3 createCURRENCYTYPE3() {
        return new CURRENCYTYPE3();
    }

    /**
     * Create an instance of {@link DATETYPE }
     * 
     */
    public DATETYPE createDATETYPE() {
        return new DATETYPE();
    }

    /**
     * Create an instance of {@link DIRECTIONTYPE }
     * 
     */
    public DIRECTIONTYPE createDIRECTIONTYPE() {
        return new DIRECTIONTYPE();
    }

    /**
     * Create an instance of {@link GEOCODETYPESTRING }
     * 
     */
    public GEOCODETYPESTRING createGEOCODETYPESTRING() {
        return new GEOCODETYPESTRING();
    }

    /**
     * Create an instance of {@link DISTANCESIMPLETYPE }
     * 
     */
    public DISTANCESIMPLETYPE createDISTANCESIMPLETYPE() {
        return new DISTANCESIMPLETYPE();
    }

    /**
     * Create an instance of {@link DISTANCESIMPLETYPE2 }
     * 
     */
    public DISTANCESIMPLETYPE2 createDISTANCESIMPLETYPE2() {
        return new DISTANCESIMPLETYPE2();
    }

    /**
     * Create an instance of {@link RATINGCATEGORYTYPE }
     * 
     */
    public RATINGCATEGORYTYPE createRATINGCATEGORYTYPE() {
        return new RATINGCATEGORYTYPE();
    }

    /**
     * Create an instance of {@link ANSWERTYPE }
     * 
     */
    public ANSWERTYPE createANSWERTYPE() {
        return new ANSWERTYPE();
    }

    /**
     * Create an instance of {@link FIELDERRORITEMTYPE }
     * 
     */
    public FIELDERRORITEMTYPE createFIELDERRORITEMTYPE() {
        return new FIELDERRORITEMTYPE();
    }

    /**
     * Create an instance of {@link HOTELITEMCONTACTDETAILSTYPE }
     * 
     */
    public HOTELITEMCONTACTDETAILSTYPE createHOTELITEMCONTACTDETAILSTYPE() {
        return new HOTELITEMCONTACTDETAILSTYPE();
    }

    /**
     * Create an instance of {@link HOTELCOORDINATES }
     * 
     */
    public HOTELCOORDINATES createHOTELCOORDINATES() {
        return new HOTELCOORDINATES();
    }

    /**
     * Create an instance of {@link HOTELITEMSIMPLETYPE }
     * 
     */
    public HOTELITEMSIMPLETYPE createHOTELITEMSIMPLETYPE() {
        return new HOTELITEMSIMPLETYPE();
    }

    /**
     * Create an instance of {@link HOTELSIMPLETYPE }
     * 
     */
    public HOTELSIMPLETYPE createHOTELSIMPLETYPE() {
        return new HOTELSIMPLETYPE();
    }

    /**
     * Create an instance of {@link HOTELSIMPLETYPENOAVAIL }
     * 
     */
    public HOTELSIMPLETYPENOAVAIL createHOTELSIMPLETYPENOAVAIL() {
        return new HOTELSIMPLETYPENOAVAIL();
    }

    /**
     * Create an instance of {@link HOTELSIMPLETYPENEGO }
     * 
     */
    public HOTELSIMPLETYPENEGO createHOTELSIMPLETYPENEGO() {
        return new HOTELSIMPLETYPENEGO();
    }

    /**
     * Create an instance of {@link HOTELSIMPLETYPESTANDARD }
     * 
     */
    public HOTELSIMPLETYPESTANDARD createHOTELSIMPLETYPESTANDARD() {
        return new HOTELSIMPLETYPESTANDARD();
    }

    /**
     * Create an instance of {@link SERVICEPRICINGTYPE }
     * 
     */
    public SERVICEPRICINGTYPE createSERVICEPRICINGTYPE() {
        return new SERVICEPRICINGTYPE();
    }

    /**
     * Create an instance of {@link SERVICETYPE }
     * 
     */
    public SERVICETYPE createSERVICETYPE() {
        return new SERVICETYPE();
    }

    /**
     * Create an instance of {@link SERVICETYPEDETAILS }
     * 
     */
    public SERVICETYPEDETAILS createSERVICETYPEDETAILS() {
        return new SERVICETYPEDETAILS();
    }

    /**
     * Create an instance of {@link MESSAGETYPE }
     * 
     */
    public MESSAGETYPE createMESSAGETYPE() {
        return new MESSAGETYPE();
    }

    /**
     * Create an instance of {@link OCCUPANCYTYPE }
     * 
     */
    public OCCUPANCYTYPE createOCCUPANCYTYPE() {
        return new OCCUPANCYTYPE();
    }

    /**
     * Create an instance of {@link ROOMCHECKINPOLICYTYPE }
     * 
     */
    public ROOMCHECKINPOLICYTYPE createROOMCHECKINPOLICYTYPE() {
        return new ROOMCHECKINPOLICYTYPE();
    }

    /**
     * Create an instance of {@link ROOMCPLXTYPE }
     * 
     */
    public ROOMCPLXTYPE createROOMCPLXTYPE() {
        return new ROOMCPLXTYPE();
    }

    /**
     * Create an instance of {@link ROOMTYPE2 }
     * 
     */
    public ROOMTYPE2 createROOMTYPE2() {
        return new ROOMTYPE2();
    }

    /**
     * Create an instance of {@link RATETYPETYPE }
     * 
     */
    public RATETYPETYPE createRATETYPETYPE() {
        return new RATETYPETYPE();
    }

    /**
     * Create an instance of {@link SPECIALRATETYPETYPE1 }
     * 
     */
    public SPECIALRATETYPETYPE1 createSPECIALRATETYPETYPE1() {
        return new SPECIALRATETYPETYPE1();
    }

    /**
     * Create an instance of {@link SPECIALRATETYPETYPE2 }
     * 
     */
    public SPECIALRATETYPETYPE2 createSPECIALRATETYPETYPE2() {
        return new SPECIALRATETYPETYPE2();
    }

    /**
     * Create an instance of {@link UNITTYPE }
     * 
     */
    public UNITTYPE createUNITTYPE() {
        return new UNITTYPE();
    }

    /**
     * Create an instance of {@link LISTRATETYPE2 }
     * 
     */
    public LISTRATETYPE2 createLISTRATETYPE2() {
        return new LISTRATETYPE2();
    }

    /**
     * Create an instance of {@link LISTRATETYPE3 }
     * 
     */
    public LISTRATETYPE3 createLISTRATETYPE3() {
        return new LISTRATETYPE3();
    }

    /**
     * Create an instance of {@link AVAILABILITYSTATUSTYPE }
     * 
     */
    public AVAILABILITYSTATUSTYPE createAVAILABILITYSTATUSTYPE() {
        return new AVAILABILITYSTATUSTYPE();
    }

    /**
     * Create an instance of {@link DISTANCETYPE }
     * 
     */
    public DISTANCETYPE createDISTANCETYPE() {
        return new DISTANCETYPE();
    }

    /**
     * Create an instance of {@link DISTANCENODIRECTIONTYPE }
     * 
     */
    public DISTANCENODIRECTIONTYPE createDISTANCENODIRECTIONTYPE() {
        return new DISTANCENODIRECTIONTYPE();
    }

    /**
     * Create an instance of {@link PRICETYPE2 }
     * 
     */
    public PRICETYPE2 createPRICETYPE2() {
        return new PRICETYPE2();
    }

    /**
     * Create an instance of {@link LISTFEATUREITEMTYPE1 }
     * 
     */
    public LISTFEATUREITEMTYPE1 createLISTFEATUREITEMTYPE1() {
        return new LISTFEATUREITEMTYPE1();
    }

    /**
     * Create an instance of {@link LISTFEATUREITEMTYPE2 }
     * 
     */
    public LISTFEATUREITEMTYPE2 createLISTFEATUREITEMTYPE2() {
        return new LISTFEATUREITEMTYPE2();
    }

    /**
     * Create an instance of {@link LISTFEATUREITEMTYPE3 }
     * 
     */
    public LISTFEATUREITEMTYPE3 createLISTFEATUREITEMTYPE3() {
        return new LISTFEATUREITEMTYPE3();
    }

    /**
     * Create an instance of {@link HOTELSTANDARDSHORTTYPE }
     * 
     */
    public HOTELSTANDARDSHORTTYPE createHOTELSTANDARDSHORTTYPE() {
        return new HOTELSTANDARDSHORTTYPE();
    }

    /**
     * Create an instance of {@link MULTIMEDIAFEATURESTYPE }
     * 
     */
    public MULTIMEDIAFEATURESTYPE createMULTIMEDIAFEATURESTYPE() {
        return new MULTIMEDIAFEATURESTYPE();
    }

    /**
     * Create an instance of {@link MULTIMEDIAADRESSES }
     * 
     */
    public MULTIMEDIAADRESSES createMULTIMEDIAADRESSES() {
        return new MULTIMEDIAADRESSES();
    }

    /**
     * Create an instance of {@link HOTELFEATURESCATEGORIESTYPE }
     * 
     */
    public HOTELFEATURESCATEGORIESTYPE createHOTELFEATURESCATEGORIESTYPE() {
        return new HOTELFEATURESCATEGORIESTYPE();
    }

    /**
     * Create an instance of {@link HOTELFEATURESIMAGESIZETYPE }
     * 
     */
    public HOTELFEATURESIMAGESIZETYPE createHOTELFEATURESIMAGESIZETYPE() {
        return new HOTELFEATURESIMAGESIZETYPE();
    }

    /**
     * Create an instance of {@link REVIEWCOMPANY }
     * 
     */
    public REVIEWCOMPANY createREVIEWCOMPANY() {
        return new REVIEWCOMPANY();
    }

    /**
     * Create an instance of {@link USERUGC }
     * 
     */
    public USERUGC createUSERUGC() {
        return new USERUGC();
    }

    /**
     * Create an instance of {@link LISTREVIEW1 }
     * 
     */
    public LISTREVIEW1 createLISTREVIEW1() {
        return new LISTREVIEW1();
    }

    /**
     * Create an instance of {@link GLOBALREVIEWS1 }
     * 
     */
    public GLOBALREVIEWS1 createGLOBALREVIEWS1() {
        return new GLOBALREVIEWS1();
    }

    /**
     * Create an instance of {@link USERSREVIEWS1 }
     * 
     */
    public USERSREVIEWS1 createUSERSREVIEWS1() {
        return new USERSREVIEWS1();
    }

    /**
     * Create an instance of {@link HOTELDESCRIPTIVECONTENTTYPE }
     * 
     */
    public HOTELDESCRIPTIVECONTENTTYPE createHOTELDESCRIPTIVECONTENTTYPE() {
        return new HOTELDESCRIPTIVECONTENTTYPE();
    }

    /**
     * Create an instance of {@link HOTELDESCRIPTIVECONTENTSUBSETTYPE }
     * 
     */
    public HOTELDESCRIPTIVECONTENTSUBSETTYPE createHOTELDESCRIPTIVECONTENTSUBSETTYPE() {
        return new HOTELDESCRIPTIVECONTENTSUBSETTYPE();
    }

    /**
     * Create an instance of {@link LANGUAGETYPE }
     * 
     */
    public LANGUAGETYPE createLANGUAGETYPE() {
        return new LANGUAGETYPE();
    }

    /**
     * Create an instance of {@link ARCSTYLETYPE }
     * 
     */
    public ARCSTYLETYPE createARCSTYLETYPE() {
        return new ARCSTYLETYPE();
    }

    /**
     * Create an instance of {@link ROOMSDESCTYPE }
     * 
     */
    public ROOMSDESCTYPE createROOMSDESCTYPE() {
        return new ROOMSDESCTYPE();
    }

    /**
     * Create an instance of {@link ROOMTYPESIMPLE }
     * 
     */
    public ROOMTYPESIMPLE createROOMTYPESIMPLE() {
        return new ROOMTYPESIMPLE();
    }

    /**
     * Create an instance of {@link DESCRIPTIONFREETEXTTYPE }
     * 
     */
    public DESCRIPTIONFREETEXTTYPE createDESCRIPTIONFREETEXTTYPE() {
        return new DESCRIPTIONFREETEXTTYPE();
    }

    /**
     * Create an instance of {@link DESCRIPTIONFREETEXTTEXTTYPE }
     * 
     */
    public DESCRIPTIONFREETEXTTEXTTYPE createDESCRIPTIONFREETEXTTEXTTYPE() {
        return new DESCRIPTIONFREETEXTTEXTTYPE();
    }

    /**
     * Create an instance of {@link REFERENCEPOINTTYPE }
     * 
     */
    public REFERENCEPOINTTYPE createREFERENCEPOINTTYPE() {
        return new REFERENCEPOINTTYPE();
    }

    /**
     * Create an instance of {@link DUALDISTANCETYPE }
     * 
     */
    public DUALDISTANCETYPE createDUALDISTANCETYPE() {
        return new DUALDISTANCETYPE();
    }

    /**
     * Create an instance of {@link TRANSPORTATIONOPTIONTYPE }
     * 
     */
    public TRANSPORTATIONOPTIONTYPE createTRANSPORTATIONOPTIONTYPE() {
        return new TRANSPORTATIONOPTIONTYPE();
    }

    /**
     * Create an instance of {@link PAYMENTMETHODTYPE }
     * 
     */
    public PAYMENTMETHODTYPE createPAYMENTMETHODTYPE() {
        return new PAYMENTMETHODTYPE();
    }

    /**
     * Create an instance of {@link PAYMENTCARDSTYPE }
     * 
     */
    public PAYMENTCARDSTYPE createPAYMENTCARDSTYPE() {
        return new PAYMENTCARDSTYPE();
    }

    /**
     * Create an instance of {@link FACILITYTYPEAVAIL }
     * 
     */
    public FACILITYTYPEAVAIL createFACILITYTYPEAVAIL() {
        return new FACILITYTYPEAVAIL();
    }

    /**
     * Create an instance of {@link ATTRACTIONTYPE }
     * 
     */
    public ATTRACTIONTYPE createATTRACTIONTYPE() {
        return new ATTRACTIONTYPE();
    }

    /**
     * Create an instance of {@link SERVICEFEATURETYPE }
     * 
     */
    public SERVICEFEATURETYPE createSERVICEFEATURETYPE() {
        return new SERVICEFEATURETYPE();
    }

    /**
     * Create an instance of {@link CONTACTDETAILSTYPE }
     * 
     */
    public CONTACTDETAILSTYPE createCONTACTDETAILSTYPE() {
        return new CONTACTDETAILSTYPE();
    }

    /**
     * Create an instance of {@link PHONETYPE }
     * 
     */
    public PHONETYPE createPHONETYPE() {
        return new PHONETYPE();
    }

    /**
     * Create an instance of {@link CODENAMETYPEDAYS }
     * 
     */
    public CODENAMETYPEDAYS createCODENAMETYPEDAYS() {
        return new CODENAMETYPEDAYS();
    }

    /**
     * Create an instance of {@link TOTALPRICINGType }
     * 
     */
    public TOTALPRICINGType createTOTALPRICINGType() {
        return new TOTALPRICINGType();
    }

    /**
     * Create an instance of {@link COMMISSIONTYPE }
     * 
     */
    public COMMISSIONTYPE createCOMMISSIONTYPE() {
        return new COMMISSIONTYPE();
    }

    /**
     * Create an instance of {@link MARKUPTYPE }
     * 
     */
    public MARKUPTYPE createMARKUPTYPE() {
        return new MARKUPTYPE();
    }

    /**
     * Create an instance of {@link AMOUNTTYPE }
     * 
     */
    public AMOUNTTYPE createAMOUNTTYPE() {
        return new AMOUNTTYPE();
    }

    /**
     * Create an instance of {@link LISTPACKAGETYPE }
     * 
     */
    public LISTPACKAGETYPE createLISTPACKAGETYPE() {
        return new LISTPACKAGETYPE();
    }

    /**
     * Create an instance of {@link PKGROOMTYPE }
     * 
     */
    public PKGROOMTYPE createPKGROOMTYPE() {
        return new PKGROOMTYPE();
    }

    /**
     * Create an instance of {@link CANCELLATIONTYPE }
     * 
     */
    public CANCELLATIONTYPE createCANCELLATIONTYPE() {
        return new CANCELLATIONTYPE();
    }

    /**
     * Create an instance of {@link TAXType }
     * 
     */
    public TAXType createTAXType() {
        return new TAXType();
    }

    /**
     * Create an instance of {@link BOARDBASISType }
     * 
     */
    public BOARDBASISType createBOARDBASISType() {
        return new BOARDBASISType();
    }

    /**
     * Create an instance of {@link PREDEFINEDLOCATIONTYPE }
     * 
     */
    public PREDEFINEDLOCATIONTYPE createPREDEFINEDLOCATIONTYPE() {
        return new PREDEFINEDLOCATIONTYPE();
    }

    /**
     * Create an instance of {@link STRUCTUREDOCCUPANCY }
     * 
     */
    public STRUCTUREDOCCUPANCY createSTRUCTUREDOCCUPANCY() {
        return new STRUCTUREDOCCUPANCY();
    }

    /**
     * Create an instance of {@link CHECKINOUTTIMETYPE }
     * 
     */
    public CHECKINOUTTIMETYPE createCHECKINOUTTIMETYPE() {
        return new CHECKINOUTTIMETYPE();
    }

    /**
     * Create an instance of {@link DATEDESCRIPTIONTYPE }
     * 
     */
    public DATEDESCRIPTIONTYPE createDATEDESCRIPTIONTYPE() {
        return new DATEDESCRIPTIONTYPE();
    }

    /**
     * Create an instance of {@link ADVANCEDBOOKINGTYPE }
     * 
     */
    public ADVANCEDBOOKINGTYPE createADVANCEDBOOKINGTYPE() {
        return new ADVANCEDBOOKINGTYPE();
    }

    /**
     * Create an instance of {@link MINMAXLOSTYPE }
     * 
     */
    public MINMAXLOSTYPE createMINMAXLOSTYPE() {
        return new MINMAXLOSTYPE();
    }

    /**
     * Create an instance of {@link LENGTHOFSTAY }
     * 
     */
    public LENGTHOFSTAY createLENGTHOFSTAY() {
        return new LENGTHOFSTAY();
    }

    /**
     * Create an instance of {@link LISTCCTYPEType }
     * 
     */
    public LISTCCTYPEType createLISTCCTYPEType() {
        return new LISTCCTYPEType();
    }

    /**
     * Create an instance of {@link PAYMENTTYPE }
     * 
     */
    public PAYMENTTYPE createPAYMENTTYPE() {
        return new PAYMENTTYPE();
    }

    /**
     * Create an instance of {@link LISTCCFIELDType }
     * 
     */
    public LISTCCFIELDType createLISTCCFIELDType() {
        return new LISTCCFIELDType();
    }

    /**
     * Create an instance of {@link MOBTYPEType }
     * 
     */
    public MOBTYPEType createMOBTYPEType() {
        return new MOBTYPEType();
    }

    /**
     * Create an instance of {@link GUARANTEEDEPOSITTYPE }
     * 
     */
    public GUARANTEEDEPOSITTYPE createGUARANTEEDEPOSITTYPE() {
        return new GUARANTEEDEPOSITTYPE();
    }

    /**
     * Create an instance of {@link ROOMBASEType }
     * 
     */
    public ROOMBASEType createROOMBASEType() {
        return new ROOMBASEType();
    }

    /**
     * Create an instance of {@link LISTRATEType }
     * 
     */
    public LISTRATEType createLISTRATEType() {
        return new LISTRATEType();
    }

    /**
     * Create an instance of {@link PRICINGINFORMATIONType }
     * 
     */
    public PRICINGINFORMATIONType createPRICINGINFORMATIONType() {
        return new PRICINGINFORMATIONType();
    }

    /**
     * Create an instance of {@link OFFSETTIMETYPE }
     * 
     */
    public OFFSETTIMETYPE createOFFSETTIMETYPE() {
        return new OFFSETTIMETYPE();
    }

    /**
     * Create an instance of {@link PRODUCTCONDITIONSType }
     * 
     */
    public PRODUCTCONDITIONSType createPRODUCTCONDITIONSType() {
        return new PRODUCTCONDITIONSType();
    }

    /**
     * Create an instance of {@link BOOKINGCONDITIONSType }
     * 
     */
    public BOOKINGCONDITIONSType createBOOKINGCONDITIONSType() {
        return new BOOKINGCONDITIONSType();
    }

    /**
     * Create an instance of {@link GUARANTEEPAYMENTMETHODTYPE }
     * 
     */
    public GUARANTEEPAYMENTMETHODTYPE createGUARANTEEPAYMENTMETHODTYPE() {
        return new GUARANTEEPAYMENTMETHODTYPE();
    }

    /**
     * Create an instance of {@link SERVICESTYPE }
     * 
     */
    public SERVICESTYPE createSERVICESTYPE() {
        return new SERVICESTYPE();
    }

    /**
     * Create an instance of {@link MEETINGFACILITIESTYPE }
     * 
     */
    public MEETINGFACILITIESTYPE createMEETINGFACILITIESTYPE() {
        return new MEETINGFACILITIESTYPE();
    }

    /**
     * Create an instance of {@link ROOMFACILITIESTYPE }
     * 
     */
    public ROOMFACILITIESTYPE createROOMFACILITIESTYPE() {
        return new ROOMFACILITIESTYPE();
    }

    /**
     * Create an instance of {@link DININGFACILITIESTYPE }
     * 
     */
    public DININGFACILITIESTYPE createDININGFACILITIESTYPE() {
        return new DININGFACILITIESTYPE();
    }

    /**
     * Create an instance of {@link MISCTAXPOLICYTYPE }
     * 
     */
    public MISCTAXPOLICYTYPE createMISCTAXPOLICYTYPE() {
        return new MISCTAXPOLICYTYPE();
    }

    /**
     * Create an instance of {@link STAYREQUIREMENTTYPE }
     * 
     */
    public STAYREQUIREMENTTYPE createSTAYREQUIREMENTTYPE() {
        return new STAYREQUIREMENTTYPE();
    }

    /**
     * Create an instance of {@link COMMISSIONPOLICYTYPE }
     * 
     */
    public COMMISSIONPOLICYTYPE createCOMMISSIONPOLICYTYPE() {
        return new COMMISSIONPOLICYTYPE();
    }

    /**
     * Create an instance of {@link HOLDPOLICYTYPE }
     * 
     */
    public HOLDPOLICYTYPE createHOLDPOLICYTYPE() {
        return new HOLDPOLICYTYPE();
    }

    /**
     * Create an instance of {@link SERVICESELEMENTTYPE }
     * 
     */
    public SERVICESELEMENTTYPE createSERVICESELEMENTTYPE() {
        return new SERVICESELEMENTTYPE();
    }

    /**
     * Create an instance of {@link LISTDAYTYPE }
     * 
     */
    public LISTDAYTYPE createLISTDAYTYPE() {
        return new LISTDAYTYPE();
    }

    /**
     * Create an instance of {@link ROOMCATEGORYTYPE1 }
     * 
     */
    public ROOMCATEGORYTYPE1 createROOMCATEGORYTYPE1() {
        return new ROOMCATEGORYTYPE1();
    }

    /**
     * Create an instance of {@link ROOMTYPECODE1 }
     * 
     */
    public ROOMTYPECODE1 createROOMTYPECODE1() {
        return new ROOMTYPECODE1();
    }

    /**
     * Create an instance of {@link HOTELFEATURESVIDEOFORMATTYPE }
     * 
     */
    public HOTELFEATURESVIDEOFORMATTYPE createHOTELFEATURESVIDEOFORMATTYPE() {
        return new HOTELFEATURESVIDEOFORMATTYPE();
    }

    /**
     * Create an instance of {@link HOTELFEATURESCATEGORIESVIDEOTYPE }
     * 
     */
    public HOTELFEATURESCATEGORIESVIDEOTYPE createHOTELFEATURESCATEGORIESVIDEOTYPE() {
        return new HOTELFEATURESCATEGORIESVIDEOTYPE();
    }

    /**
     * Create an instance of {@link DESCRIPTIONMULTDESCTYPE.TITLE }
     * 
     */
    public DESCRIPTIONMULTDESCTYPE.TITLE createDESCRIPTIONMULTDESCTYPETITLE() {
        return new DESCRIPTIONMULTDESCTYPE.TITLE();
    }

    /**
     * Create an instance of {@link CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE.UNIT }
     * 
     */
    public CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE.UNIT createCANCELLATIONPOLICYTYPERELATIVEDEADLINEDATEUNIT() {
        return new CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE.UNIT();
    }

    /**
     * Create an instance of {@link MISCPETPOLICYTYPE.LISTDESCRIPTION }
     * 
     */
    public MISCPETPOLICYTYPE.LISTDESCRIPTION createMISCPETPOLICYTYPELISTDESCRIPTION() {
        return new MISCPETPOLICYTYPE.LISTDESCRIPTION();
    }

    /**
     * Create an instance of {@link MISCPETPOLICYTYPE.MAXIMUMMEASURE.UNIT }
     * 
     */
    public MISCPETPOLICYTYPE.MAXIMUMMEASURE.UNIT createMISCPETPOLICYTYPEMAXIMUMMEASUREUNIT() {
        return new MISCPETPOLICYTYPE.MAXIMUMMEASURE.UNIT();
    }

    /**
     * Create an instance of {@link MISCGUESTPOLICYTYPE.LISTDESCRIPTION }
     * 
     */
    public MISCGUESTPOLICYTYPE.LISTDESCRIPTION createMISCGUESTPOLICYTYPELISTDESCRIPTION() {
        return new MISCGUESTPOLICYTYPE.LISTDESCRIPTION();
    }

    /**
     * Create an instance of {@link MISCPOLICIESTYPE.LISTGUARANTEEPAYMENTPOLICY }
     * 
     */
    public MISCPOLICIESTYPE.LISTGUARANTEEPAYMENTPOLICY createMISCPOLICIESTYPELISTGUARANTEEPAYMENTPOLICY() {
        return new MISCPOLICIESTYPE.LISTGUARANTEEPAYMENTPOLICY();
    }

    /**
     * Create an instance of {@link GUESTROOMTYPE.LISTROOMTYPE }
     * 
     */
    public GUESTROOMTYPE.LISTROOMTYPE createGUESTROOMTYPELISTROOMTYPE() {
        return new GUESTROOMTYPE.LISTROOMTYPE();
    }

    /**
     * Create an instance of {@link GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE.LISTDESCRIPTION }
     * 
     */
    public GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE.LISTDESCRIPTION createGUESTROOMTYPELISTROOMAMENITIESLISTCHARGELISTDESCRIPTION() {
        return new GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE.LISTDESCRIPTION();
    }

    /**
     * Create an instance of {@link RESTAURANTTYPE.CATEGORY }
     * 
     */
    public RESTAURANTTYPE.CATEGORY createRESTAURANTTYPECATEGORY() {
        return new RESTAURANTTYPE.CATEGORY();
    }

    /**
     * Create an instance of {@link RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTOPERATIONTIME }
     * 
     */
    public RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTOPERATIONTIME createRESTAURANTTYPELISTOPERATIONSCHEDULELISTOPERATIONTIME() {
        return new RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTOPERATIONTIME();
    }

    /**
     * Create an instance of {@link RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE.LISTDESCRIPTION }
     * 
     */
    public RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE.LISTDESCRIPTION createRESTAURANTTYPELISTOPERATIONSCHEDULELISTCHARGELISTDESCRIPTION() {
        return new RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE.LISTDESCRIPTION();
    }

    /**
     * Create an instance of {@link MEETINGROOMTYPE.DIMENSION }
     * 
     */
    public MEETINGROOMTYPE.DIMENSION createMEETINGROOMTYPEDIMENSION() {
        return new MEETINGROOMTYPE.DIMENSION();
    }

    /**
     * Create an instance of {@link MEETINGROOMTYPE.LISTROOMCONFIGURATION }
     * 
     */
    public MEETINGROOMTYPE.LISTROOMCONFIGURATION createMEETINGROOMTYPELISTROOMCONFIGURATION() {
        return new MEETINGROOMTYPE.LISTROOMCONFIGURATION();
    }

    /**
     * Create an instance of {@link LOYALPROGRAMTYPE.LISTDESCRIPTION }
     * 
     */
    public LOYALPROGRAMTYPE.LISTDESCRIPTION createLOYALPROGRAMTYPELISTDESCRIPTION() {
        return new LOYALPROGRAMTYPE.LISTDESCRIPTION();
    }

    /**
     * Create an instance of {@link HOTELINFOTYPE.LISTROOMINFO }
     * 
     */
    public HOTELINFOTYPE.LISTROOMINFO createHOTELINFOTYPELISTROOMINFO() {
        return new HOTELINFOTYPE.LISTROOMINFO();
    }

    /**
     * Create an instance of {@link HOTELINFOTYPE.LISTRENOVATION }
     * 
     */
    public HOTELINFOTYPE.LISTRENOVATION createHOTELINFOTYPELISTRENOVATION() {
        return new HOTELINFOTYPE.LISTRENOVATION();
    }

    /**
     * Create an instance of {@link AREARECREATIONTYPE.LISTRECREATIONDETAILS.RECREATIONDETAIL }
     * 
     */
    public AREARECREATIONTYPE.LISTRECREATIONDETAILS.RECREATIONDETAIL createAREARECREATIONTYPELISTRECREATIONDETAILSRECREATIONDETAIL() {
        return new AREARECREATIONTYPE.LISTRECREATIONDETAILS.RECREATIONDETAIL();
    }

    /**
     * Create an instance of {@link LISTPAYMENTTYPEType.DUEDATE }
     * 
     */
    public LISTPAYMENTTYPEType.DUEDATE createLISTPAYMENTTYPETypeDUEDATE() {
        return new LISTPAYMENTTYPEType.DUEDATE();
    }

    /**
     * Create an instance of {@link TOTALPRICINGSimpleType.TOTALAMOUNTTAXINC }
     * 
     */
    public TOTALPRICINGSimpleType.TOTALAMOUNTTAXINC createTOTALPRICINGSimpleTypeTOTALAMOUNTTAXINC() {
        return new TOTALPRICINGSimpleType.TOTALAMOUNTTAXINC();
    }

    /**
     * Create an instance of {@link TOTALPRICINGSimpleType.BASEPRICE }
     * 
     */
    public TOTALPRICINGSimpleType.BASEPRICE createTOTALPRICINGSimpleTypeBASEPRICE() {
        return new TOTALPRICINGSimpleType.BASEPRICE();
    }

    /**
     * Create an instance of {@link TOTALPRICINGSimpleType.AMOUNTWITHOUTTAX }
     * 
     */
    public TOTALPRICINGSimpleType.AMOUNTWITHOUTTAX createTOTALPRICINGSimpleTypeAMOUNTWITHOUTTAX() {
        return new TOTALPRICINGSimpleType.AMOUNTWITHOUTTAX();
    }

    /**
     * Create an instance of {@link HOTELFEATURESCATEGORIESIMAGESTYPE.ORIGINALIMAGESIZE }
     * 
     */
    public HOTELFEATURESCATEGORIESIMAGESTYPE.ORIGINALIMAGESIZE createHOTELFEATURESCATEGORIESIMAGESTYPEORIGINALIMAGESIZE() {
        return new HOTELFEATURESCATEGORIESIMAGESTYPE.ORIGINALIMAGESIZE();
    }

    /**
     * Create an instance of {@link STRUTUREDPORCITY.PORCITYDESCRIPTION }
     * 
     */
    public STRUTUREDPORCITY.PORCITYDESCRIPTION createSTRUTUREDPORCITYPORCITYDESCRIPTION() {
        return new STRUTUREDPORCITY.PORCITYDESCRIPTION();
    }

    /**
     * Create an instance of {@link HOTELTYPE2 .ADDRESS }
     * 
     */
    public HOTELTYPE2 .ADDRESS createHOTELTYPE2ADDRESS() {
        return new HOTELTYPE2 .ADDRESS();
    }

    /**
     * Create an instance of {@link HOTELTYPE1 .TYPE }
     * 
     */
    public HOTELTYPE1 .TYPE createHOTELTYPE1TYPE() {
        return new HOTELTYPE1 .TYPE();
    }

    /**
     * Create an instance of {@link LISTRATETYPE1 .BDATE }
     * 
     */
    public LISTRATETYPE1 .BDATE createLISTRATETYPE1BDATE() {
        return new LISTRATETYPE1 .BDATE();
    }

    /**
     * Create an instance of {@link LISTRATETYPE1 .EDATE }
     * 
     */
    public LISTRATETYPE1 .EDATE createLISTRATETYPE1EDATE() {
        return new LISTRATETYPE1 .EDATE();
    }

    /**
     * Create an instance of {@link LISTRATETYPE1 .LISTPRICE }
     * 
     */
    public LISTRATETYPE1 .LISTPRICE createLISTRATETYPE1LISTPRICE() {
        return new LISTRATETYPE1 .LISTPRICE();
    }

    /**
     * Create an instance of {@link MARKUPAMOUNT.LISTPRICE.CURRENCY }
     * 
     */
    public MARKUPAMOUNT.LISTPRICE.CURRENCY createMARKUPAMOUNTLISTPRICECURRENCY() {
        return new MARKUPAMOUNT.LISTPRICE.CURRENCY();
    }

    /**
     * Create an instance of {@link LISTTERMITEMTYPE.LISTCONTENT }
     * 
     */
    public LISTTERMITEMTYPE.LISTCONTENT createLISTTERMITEMTYPELISTCONTENT() {
        return new LISTTERMITEMTYPE.LISTCONTENT();
    }

    /**
     * Create an instance of {@link LISTROOMITEMTYPE.LISTTOTALRATE }
     * 
     */
    public LISTROOMITEMTYPE.LISTTOTALRATE createLISTROOMITEMTYPELISTTOTALRATE() {
        return new LISTROOMITEMTYPE.LISTTOTALRATE();
    }

    /**
     * Create an instance of {@link STRUTUREDPOITYPE.POIDESCRIPTION }
     * 
     */
    public STRUTUREDPOITYPE.POIDESCRIPTION createSTRUTUREDPOITYPEPOIDESCRIPTION() {
        return new STRUTUREDPOITYPE.POIDESCRIPTION();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ROOM_CLASS_ID")
    public JAXBElement<String> createROOMCLASSID(String value) {
        return new JAXBElement<String>(_ROOMCLASSID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POR_COUNTRY_CODE")
    public JAXBElement<String> createPORCOUNTRYCODE(String value) {
        return new JAXBElement<String>(_PORCOUNTRYCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POR_STATE_CODE")
    public JAXBElement<String> createPORSTATECODE(String value) {
        return new JAXBElement<String>(_PORSTATECODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POR_CATEGORY")
    public JAXBElement<String> createPORCATEGORY(String value) {
        return new JAXBElement<String>(_PORCATEGORY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FACILITY")
    public JAXBElement<String> createLISTFACILITY(String value) {
        return new JAXBElement<String>(_LISTFACILITY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_HOTEL_NAME")
    public JAXBElement<String> createLISTHOTELNAME(String value) {
        return new JAXBElement<String>(_LISTHOTELNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STREET_ADDRESS")
    public JAXBElement<String> createSTREETADDRESS(String value) {
        return new JAXBElement<String>(_STREETADDRESS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ZIP_CODE")
    public JAXBElement<String> createZIPCODE(String value) {
        return new JAXBElement<String>(_ZIPCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COUNTRY_CODE")
    public JAXBElement<String> createCOUNTRYCODE(String value) {
        return new JAXBElement<String>(_COUNTRYCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MULTIPLICITY")
    public JAXBElement<BigInteger> createMULTIPLICITY(BigInteger value) {
        return new JAXBElement<BigInteger>(_MULTIPLICITY_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TARGET", defaultValue = "DISTRIBUTION")
    public JAXBElement<String> createTARGET(String value) {
        return new JAXBElement<String>(_TARGET_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTLPOLICYTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POLICY_AGENCY")
    public JAXBElement<HTLPOLICYTYPE> createPOLICYAGENCY(HTLPOLICYTYPE value) {
        return new JAXBElement<HTLPOLICYTYPE>(_POLICYAGENCY_QNAME, HTLPOLICYTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRAVELLERPREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRAVELLER_PREFERENCES")
    public JAXBElement<TRAVELLERPREFERENCETYPE> createTRAVELLERPREFERENCES(TRAVELLERPREFERENCETYPE value) {
        return new JAXBElement<TRAVELLERPREFERENCETYPE>(_TRAVELLERPREFERENCES_QNAME, TRAVELLERPREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTLPOLICIESTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POLICIES")
    public JAXBElement<HTLPOLICIESTYPE> createPOLICIES(HTLPOLICIESTYPE value) {
        return new JAXBElement<HTLPOLICIESTYPE>(_POLICIES_QNAME, HTLPOLICIESTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTLPOLICYTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POLICY_COMPANY")
    public JAXBElement<HTLPOLICYTYPE> createPOLICYCOMPANY(HTLPOLICYTYPE value) {
        return new JAXBElement<HTLPOLICYTYPE>(_POLICYCOMPANY_QNAME, HTLPOLICYTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_HOTEL_CHAINS")
    public JAXBElement<PREFERENCETYPE> createLISTHOTELCHAINS(PREFERENCETYPE value) {
        return new JAXBElement<PREFERENCETYPE>(_LISTHOTELCHAINS_QNAME, PREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HOTEL_NAME")
    public JAXBElement<PREFERENCETYPE> createHOTELNAME(PREFERENCETYPE value) {
        return new JAXBElement<PREFERENCETYPE>(_HOTELNAME_QNAME, PREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FACILITIES")
    public JAXBElement<PREFERENCETYPE> createLISTFACILITIES(PREFERENCETYPE value) {
        return new JAXBElement<PREFERENCETYPE>(_LISTFACILITIES_QNAME, PREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MAXIMUM_PRICE")
    public JAXBElement<PREFERENCETYPE> createMAXIMUMPRICE(PREFERENCETYPE value) {
        return new JAXBElement<PREFERENCETYPE>(_MAXIMUMPRICE_QNAME, PREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRAVELLER_ROOM_TYPE")
    public JAXBElement<PREFERENCETYPE> createTRAVELLERROOMTYPE(PREFERENCETYPE value) {
        return new JAXBElement<PREFERENCETYPE>(_TRAVELLERROOMTYPE_QNAME, PREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTRAVELLERPREFERENCETYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRAVELLER_PREFERENCES")
    public JAXBElement<LISTTRAVELLERPREFERENCETYPE> createLISTTRAVELLERPREFERENCES(LISTTRAVELLERPREFERENCETYPE value) {
        return new JAXBElement<LISTTRAVELLERPREFERENCETYPE>(_LISTTRAVELLERPREFERENCES_QNAME, LISTTRAVELLERPREFERENCETYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTLAREATYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AREA")
    public JAXBElement<HTLAREATYPE> createAREA(HTLAREATYPE value) {
        return new JAXBElement<HTLAREATYPE>(_AREA_QNAME, HTLAREATYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BEDTYPE1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BED_TYPE")
    public JAXBElement<BEDTYPE1> createBEDTYPE(BEDTYPE1 value) {
        return new JAXBElement<BEDTYPE1>(_BEDTYPE_QNAME, BEDTYPE1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BED_COUNT")
    public JAXBElement<BigInteger> createBEDCOUNT(BigInteger value) {
        return new JAXBElement<BigInteger>(_BEDCOUNT_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CHECK_SELL_RULES")
    public JAXBElement<Boolean> createCHECKSELLRULES(Boolean value) {
        return new JAXBElement<Boolean>(_CHECKSELLRULES_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CORPORATE_ID_REQUIRED")
    public JAXBElement<Boolean> createCORPORATEIDREQUIRED(Boolean value) {
        return new JAXBElement<Boolean>(_CORPORATEIDREQUIRED_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEPOSIT_REQUIRED")
    public JAXBElement<Boolean> createDEPOSITREQUIRED(Boolean value) {
        return new JAXBElement<Boolean>(_DEPOSITREQUIRED_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GUARANTEE_REQUIRED")
    public JAXBElement<Boolean> createGUARANTEEREQUIRED(Boolean value) {
        return new JAXBElement<Boolean>(_GUARANTEEREQUIRED_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MAX_BUDGET")
    public JAXBElement<BigInteger> createMAXBUDGET(BigInteger value) {
        return new JAXBElement<BigInteger>(_MAXBUDGET_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MIN_BUDGET")
    public JAXBElement<BigInteger> createMINBUDGET(BigInteger value) {
        return new JAXBElement<BigInteger>(_MINBUDGET_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEALTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MEAL")
    public JAXBElement<MEALTYPE> createMEAL(MEALTYPE value) {
        return new JAXBElement<MEALTYPE>(_MEAL_QNAME, MEALTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OCCUPANCY")
    public JAXBElement<BigInteger> createOCCUPANCY(BigInteger value) {
        return new JAXBElement<BigInteger>(_OCCUPANCY_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE")
    public JAXBElement<Float> createPRICE(Float value) {
        return new JAXBElement<Float>(_PRICE_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RATE_CHANGE")
    public JAXBElement<Boolean> createRATECHANGE(Boolean value) {
        return new JAXBElement<Boolean>(_RATECHANGE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ROOMTYPE1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ROOM_TYPE")
    public JAXBElement<ROOMTYPE1> createROOMTYPE(ROOMTYPE1 value) {
        return new JAXBElement<ROOMTYPE1>(_ROOMTYPE_QNAME, ROOMTYPE1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SORT_CRITERIA")
    public JAXBElement<String> createSORTCRITERIA(String value) {
        return new JAXBElement<String>(_SORTCRITERIA_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRANSPORTATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRANSPORTATION")
    public JAXBElement<TRANSPORTATIONTYPE> createTRANSPORTATION(TRANSPORTATIONTYPE value) {
        return new JAXBElement<TRANSPORTATIONTYPE>(_TRANSPORTATION_QNAME, TRANSPORTATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HOTELSTANDARDTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_HOTEL")
    public JAXBElement<HOTELSTANDARDTYPE> createLISTHOTEL(HOTELSTANDARDTYPE value) {
        return new JAXBElement<HOTELSTANDARDTYPE>(_LISTHOTEL_QNAME, HOTELSTANDARDTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HOTELNEGOTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_NEGO_HOTEL")
    public JAXBElement<HOTELNEGOTYPE> createLISTNEGOHOTEL(HOTELNEGOTYPE value) {
        return new JAXBElement<HOTELNEGOTYPE>(_LISTNEGOHOTEL_QNAME, HOTELNEGOTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POR_LATITUDE")
    public JAXBElement<BigInteger> createPORLATITUDE(BigInteger value) {
        return new JAXBElement<BigInteger>(_PORLATITUDE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POR_LONGITUDE")
    public JAXBElement<BigInteger> createPORLONGITUDE(BigInteger value) {
        return new JAXBElement<BigInteger>(_PORLONGITUDE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_POI")
    public JAXBElement<String> createLISTPOI(String value) {
        return new JAXBElement<String>(_LISTPOI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STRUTUREDPOITYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_STRUCTURED_POI")
    public JAXBElement<STRUTUREDPOITYPE> createLISTSTRUCTUREDPOI(STRUTUREDPOITYPE value) {
        return new JAXBElement<STRUTUREDPOITYPE>(_LISTSTRUCTUREDPOI_QNAME, STRUTUREDPOITYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_SPECIAL_RATE")
    public JAXBElement<String> createLISTSPECIALRATE(String value) {
        return new JAXBElement<String>(_LISTSPECIALRATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SPECIAL_RATE_MODE")
    public JAXBElement<String> createSPECIALRATEMODE(String value) {
        return new JAXBElement<String>(_SPECIALRATEMODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USER_SPECIAL_RATE_MODE")
    public JAXBElement<String> createUSERSPECIALRATEMODE(String value) {
        return new JAXBElement<String>(_USERSPECIALRATEMODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_USER_SPECIAL_RATE")
    public JAXBElement<String> createLISTUSERSPECIALRATE(String value) {
        return new JAXBElement<String>(_LISTUSERSPECIALRATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_USER_SPECIAL_RATE_PROFILE")
    public JAXBElement<String> createLISTUSERSPECIALRATEPROFILE(String value) {
        return new JAXBElement<String>(_LISTUSERSPECIALRATEPROFILE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_AVAILABLE_RATE")
    public JAXBElement<String> createLISTAVAILABLERATE(String value) {
        return new JAXBElement<String>(_LISTAVAILABLERATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BEST_AVAILABLE_RATE")
    public JAXBElement<Boolean> createBESTAVAILABLERATE(Boolean value) {
        return new JAXBElement<Boolean>(_BESTAVAILABLERATE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTROOMITEMTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_ROOM")
    public JAXBElement<LISTROOMITEMTYPE> createLISTROOM(LISTROOMITEMTYPE value) {
        return new JAXBElement<LISTROOMITEMTYPE>(_LISTROOM_QNAME, LISTROOMITEMTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTERMITEMTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TERM")
    public JAXBElement<LISTTERMITEMTYPE> createLISTTERM(LISTTERMITEMTYPE value) {
        return new JAXBElement<LISTTERMITEMTYPE>(_LISTTERM_QNAME, LISTTERMITEMTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOOKING_CODE")
    public JAXBElement<String> createBOOKINGCODE(String value) {
        return new JAXBElement<String>(_BOOKINGCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ROOM_ID")
    public JAXBElement<String> createROOMID(String value) {
        return new JAXBElement<String>(_ROOMID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AVAILABILITY")
    public JAXBElement<Object> createAVAILABILITY(Object value) {
        return new JAXBElement<Object>(_AVAILABILITY_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GDS_CODE")
    public JAXBElement<Object> createGDSCODE(Object value) {
        return new JAXBElement<Object>(_GDSCODE_QNAME, Object.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PROVIDER_DESCRIPTION")
    public JAXBElement<String> createPROVIDERDESCRIPTION(String value) {
        return new JAXBElement<String>(_PROVIDERDESCRIPTION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AMOUNT_WITHOUT_MARKUP")
    public JAXBElement<Object> createAMOUNTWITHOUTMARKUP(Object value) {
        return new JAXBElement<Object>(_AMOUNTWITHOUTMARKUP_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MARKUP_OVERRIDABLE")
    public JAXBElement<Object> createMARKUPOVERRIDABLE(Object value) {
        return new JAXBElement<Object>(_MARKUPOVERRIDABLE_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE_WITH_MARKUP")
    public JAXBElement<Object> createPRICEWITHMARKUP(Object value) {
        return new JAXBElement<Object>(_PRICEWITHMARKUP_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MARKUP_INDICATOR")
    public JAXBElement<Object> createMARKUPINDICATOR(Object value) {
        return new JAXBElement<Object>(_MARKUPINDICATOR_QNAME, Object.class, null, value);
    }

}
