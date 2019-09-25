
package com.koreanair.external.eretail.vo.air.modifyflightinput;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.air.common.FLIGHTPREFERENCEType;
import com.koreanair.external.eretail.vo.air.commonin.BOOKEDELEMENTType;
import com.koreanair.external.eretail.vo.air.commonin.LINKSEGMENTType;
import com.koreanair.external.eretail.vo.air.commonin.LISTLOCATIONType;
import com.koreanair.external.eretail.vo.air.commonin.LISTTRAVELLERINFOAirType;
import com.koreanair.external.eretail.vo.air.commonin.POCOVERRIDEType;
import com.koreanair.external.eretail.vo.air.commonin.SEGMENTType;
import com.koreanair.external.eretail.vo.air.commonin.SELECTIONUPDATEType;
import com.koreanair.external.eretail.vo.air.commonin.TRAVELLERType;
import com.koreanair.external.eretail.vo.common.common.GDSCABINCODEType;
import com.koreanair.external.eretail.vo.common.common.LISTTRIPREASONtype;
import com.koreanair.external.eretail.vo.common.common.OperationalDataType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.external.eretail.vo.air.modifyflightinput package. 
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
    private final static QName _BOUNDTOMODIFY_QNAME = new QName("", "BOUND_TO_MODIFY");
    private final static QName _SEGMENTTATTOO_QNAME = new QName("", "SEGMENT_TATTOO");
    private final static QName _BOOLFLOWN_QNAME = new QName("", "BOOL_FLOWN");
    private final static QName _LINENUMBER_QNAME = new QName("", "LINE_NUMBER");
    private final static QName _REVALIDATIONINDICATOR_QNAME = new QName("", "REVALIDATION_INDICATOR");
    private final static QName _LISTBLOCATION_QNAME = new QName("", "LIST_B_LOCATION");
    private final static QName _LISTELOCATION_QNAME = new QName("", "LIST_E_LOCATION");
    private final static QName _BOOKEDELEMENT_QNAME = new QName("", "BOOKED_ELEMENT");
    private final static QName _POCOVERRIDE_QNAME = new QName("", "POC_OVERRIDE");
    private final static QName _LINKSEGMENT_QNAME = new QName("", "LINK_SEGMENT");
    private final static QName _LISTSELECTED_QNAME = new QName("", "LIST_SELECTED");
    private final static QName _LISTSEGMENT_QNAME = new QName("", "LIST_SEGMENT");
    private final static QName _SITE_QNAME = new QName("", "SITE");
    private final static QName _LANGUAGE_QNAME = new QName("", "LANGUAGE");
    private final static QName _FLIGHT_QNAME = new QName("", "FLIGHT");
    private final static QName _TRIPTYPE_QNAME = new QName("", "TRIP_TYPE");
    private final static QName _VIALOCATION_QNAME = new QName("", "VIA_LOCATION");
    private final static QName _FLIGHTSNEEDED_QNAME = new QName("", "FLIGHTS_NEEDED");
    private final static QName _ONLINECONNECTION_QNAME = new QName("", "ONLINE_CONNECTION");
    private final static QName _DIRECTNONSTOP_QNAME = new QName("", "DIRECT_NON_STOP");
    private final static QName _DIRECTSEARCH_QNAME = new QName("", "DIRECT_SEARCH");
    private final static QName _ARRANGEBY_QNAME = new QName("", "ARRANGE_BY");
    private final static QName _ALLOWWAITLIST_QNAME = new QName("", "ALLOW_WAITLIST");
    private final static QName _TRFLIGHTS_QNAME = new QName("", "TR_FLIGHTS");
    private final static QName _SHUTTLEFLIGHTS_QNAME = new QName("", "SHUTTLE_FLIGHTS");
    private final static QName _SCHEDULE_QNAME = new QName("", "SCHEDULE");
    private final static QName _BTIMEWINDOW_QNAME = new QName("", "B_TIME_WINDOW");
    private final static QName _ALLOWALTERNATEAVAILABILITY_QNAME = new QName("", "ALLOW_ALTERNATE_AVAILABILITY");
    private final static QName _CABIN_QNAME = new QName("", "CABIN");
    private final static QName _AIRLINEBIAS_QNAME = new QName("", "AIRLINE_BIAS");
    private final static QName _DEFAULTCABIN_QNAME = new QName("", "DEFAULT_CABIN");
    private final static QName _DISCOUNTCARDINDEX_QNAME = new QName("", "DISCOUNT_CARD_INDEX");
    private final static QName _LISTTRAVELLER_QNAME = new QName("", "LIST_TRAVELLER");
    private final static QName _LISTTRAVELLERINFO_QNAME = new QName("", "LIST_TRAVELLER_INFO");
    private final static QName _BANYTIME_QNAME = new QName("", "B_ANY_TIME");
    private final static QName _BDATE_QNAME = new QName("", "B_DATE");
    private final static QName _MINUSDATERANGE_QNAME = new QName("", "MINUS_DATE_RANGE");
    private final static QName _PLUSDATERANGE_QNAME = new QName("", "PLUS_DATE_RANGE");
    private final static QName _LOOKUPSTRATEGY_QNAME = new QName("", "LOOKUP_STRATEGY");
    private final static QName _EDATE_QNAME = new QName("", "E_DATE");
    private final static QName _ELOCATION_QNAME = new QName("", "E_LOCATION");
    private final static QName _BLOCATION_QNAME = new QName("", "B_LOCATION");
    private final static QName _LISTSELECTIONUPDATE_QNAME = new QName("", "LIST_SELECTION_UPDATE");
    private final static QName _INFORMATIVE_QNAME = new QName("", "INFORMATIVE");
    private final static QName _RESTRICTION_QNAME = new QName("", "RESTRICTION");
    private final static QName _EXTERNALFARE_QNAME = new QName("", "EXTERNAL_FARE");
    private final static QName _EXTERNALCURRENCYCODE_QNAME = new QName("", "EXTERNAL_CURRENCY_CODE");
    private final static QName _FORCERBD_QNAME = new QName("", "FORCE_RBD");
    private final static QName _ENGINERBDFILTERING_QNAME = new QName("", "ENGINE_RBD_FILTERING");
    private final static QName _REDEMPTIONAVAILABILITY_QNAME = new QName("", "REDEMPTION_AVAILABILITY");
    private final static QName _AWARDAVAILABILITY_QNAME = new QName("", "AWARD_AVAILABILITY");
    private final static QName _STAFFAVAILABILITY_QNAME = new QName("", "STAFF_AVAILABILITY");
    private final static QName _CABINFILTERING_QNAME = new QName("", "CABIN_FILTERING");
    private final static QName _ALTERNATIVECABIN_QNAME = new QName("", "ALTERNATIVE_CABIN");
    private final static QName _FLIGHTNUMBER_QNAME = new QName("", "FLIGHT_NUMBER");
    private final static QName _RBD_QNAME = new QName("", "RBD");
    private final static QName _COMPANIONMODE_QNAME = new QName("", "COMPANION_MODE");
    private final static QName _ISUMNRFLOW_QNAME = new QName("", "IS_UMNR_FLOW");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.external.eretail.vo.air.modifyflightinput
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModifyFlightInput }
     * 
     */
    public ModifyFlightInput createModifyFlightInput() {
        return new ModifyFlightInput();
    }

    /**
     * Create an instance of {@link ModifyFlightInput.REQUESTINFO }
     * 
     */
    public ModifyFlightInput.REQUESTINFO createModifyFlightInputREQUESTINFO() {
        return new ModifyFlightInput.REQUESTINFO();
    }

    /**
     * Create an instance of {@link ModifyFlightInput.APISCHECKSTRUCTUREPASSENGER }
     * 
     */
    public ModifyFlightInput.APISCHECKSTRUCTUREPASSENGER createModifyFlightInputAPISCHECKSTRUCTUREPASSENGER() {
        return new ModifyFlightInput.APISCHECKSTRUCTUREPASSENGER();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTLOCATIONType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_B_LOCATION")
    public JAXBElement<LISTLOCATIONType> createLISTBLOCATION(LISTLOCATIONType value) {
        return new JAXBElement<LISTLOCATIONType>(_LISTBLOCATION_QNAME, LISTLOCATIONType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTLOCATIONType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_E_LOCATION")
    public JAXBElement<LISTLOCATIONType> createLISTELOCATION(LISTLOCATIONType value) {
        return new JAXBElement<LISTLOCATIONType>(_LISTELOCATION_QNAME, LISTLOCATIONType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BOOKEDELEMENTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOOKED_ELEMENT")
    public JAXBElement<BOOKEDELEMENTType> createBOOKEDELEMENT(BOOKEDELEMENTType value) {
        return new JAXBElement<BOOKEDELEMENTType>(_BOOKEDELEMENT_QNAME, BOOKEDELEMENTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POCOVERRIDEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POC_OVERRIDE")
    public JAXBElement<POCOVERRIDEType> createPOCOVERRIDE(POCOVERRIDEType value) {
        return new JAXBElement<POCOVERRIDEType>(_POCOVERRIDE_QNAME, POCOVERRIDEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LINKSEGMENTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LINK_SEGMENT")
    public JAXBElement<LINKSEGMENTType> createLINKSEGMENT(LINKSEGMENTType value) {
        return new JAXBElement<LINKSEGMENTType>(_LINKSEGMENT_QNAME, LINKSEGMENTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_SELECTED")
    public JAXBElement<BigInteger> createLISTSELECTED(BigInteger value) {
        return new JAXBElement<BigInteger>(_LISTSELECTED_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SEGMENTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_SEGMENT")
    public JAXBElement<SEGMENTType> createLISTSEGMENT(SEGMENTType value) {
        return new JAXBElement<SEGMENTType>(_LISTSEGMENT_QNAME, SEGMENTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SITE")
    public JAXBElement<String> createSITE(String value) {
        return new JAXBElement<String>(_SITE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LANGUAGE")
    public JAXBElement<String> createLANGUAGE(String value) {
        return new JAXBElement<String>(_LANGUAGE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLIGHT")
    public JAXBElement<BigInteger> createFLIGHT(BigInteger value) {
        return new JAXBElement<BigInteger>(_FLIGHT_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "VIA_LOCATION")
    public JAXBElement<String> createVIALOCATION(String value) {
        return new JAXBElement<String>(_VIALOCATION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLIGHTS_NEEDED")
    public JAXBElement<BigInteger> createFLIGHTSNEEDED(BigInteger value) {
        return new JAXBElement<BigInteger>(_FLIGHTSNEEDED_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "DIRECT_NON_STOP")
    public JAXBElement<Boolean> createDIRECTNONSTOP(Boolean value) {
        return new JAXBElement<Boolean>(_DIRECTNONSTOP_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DIRECT_SEARCH")
    public JAXBElement<Boolean> createDIRECTSEARCH(Boolean value) {
        return new JAXBElement<Boolean>(_DIRECTSEARCH_QNAME, Boolean.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALLOW_WAITLIST")
    public JAXBElement<Boolean> createALLOWWAITLIST(Boolean value) {
        return new JAXBElement<Boolean>(_ALLOWWAITLIST_QNAME, Boolean.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "SCHEDULE")
    public JAXBElement<Boolean> createSCHEDULE(Boolean value) {
        return new JAXBElement<Boolean>(_SCHEDULE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "B_TIME_WINDOW")
    public JAXBElement<BigInteger> createBTIMEWINDOW(BigInteger value) {
        return new JAXBElement<BigInteger>(_BTIMEWINDOW_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALLOW_ALTERNATE_AVAILABILITY")
    public JAXBElement<Boolean> createALLOWALTERNATEAVAILABILITY(Boolean value) {
        return new JAXBElement<Boolean>(_ALLOWALTERNATEAVAILABILITY_QNAME, Boolean.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AIRLINE_BIAS")
    public JAXBElement<String> createAIRLINEBIAS(String value) {
        return new JAXBElement<String>(_AIRLINEBIAS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFAULT_CABIN")
    public JAXBElement<String> createDEFAULTCABIN(String value) {
        return new JAXBElement<String>(_DEFAULTCABIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DISCOUNT_CARD_INDEX")
    public JAXBElement<BigInteger> createDISCOUNTCARDINDEX(BigInteger value) {
        return new JAXBElement<BigInteger>(_DISCOUNTCARDINDEX_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRAVELLERType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRAVELLER")
    public JAXBElement<TRAVELLERType> createLISTTRAVELLER(TRAVELLERType value) {
        return new JAXBElement<TRAVELLERType>(_LISTTRAVELLER_QNAME, TRAVELLERType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTRAVELLERINFOAirType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_TRAVELLER_INFO")
    public JAXBElement<LISTTRAVELLERINFOAirType> createLISTTRAVELLERINFO(LISTTRAVELLERINFOAirType value) {
        return new JAXBElement<LISTTRAVELLERINFOAirType>(_LISTTRAVELLERINFO_QNAME, LISTTRAVELLERINFOAirType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "B_DATE")
    public JAXBElement<String> createBDATE(String value) {
        return new JAXBElement<String>(_BDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MINUS_DATE_RANGE")
    public JAXBElement<BigInteger> createMINUSDATERANGE(BigInteger value) {
        return new JAXBElement<BigInteger>(_MINUSDATERANGE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PLUS_DATE_RANGE")
    public JAXBElement<BigInteger> createPLUSDATERANGE(BigInteger value) {
        return new JAXBElement<BigInteger>(_PLUSDATERANGE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LOOKUP_STRATEGY")
    public JAXBElement<String> createLOOKUPSTRATEGY(String value) {
        return new JAXBElement<String>(_LOOKUPSTRATEGY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "E_DATE")
    public JAXBElement<String> createEDATE(String value) {
        return new JAXBElement<String>(_EDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "E_LOCATION")
    public JAXBElement<String> createELOCATION(String value) {
        return new JAXBElement<String>(_ELOCATION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "B_LOCATION")
    public JAXBElement<String> createBLOCATION(String value) {
        return new JAXBElement<String>(_BLOCATION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SELECTIONUPDATEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_SELECTION_UPDATE")
    public JAXBElement<SELECTIONUPDATEType> createLISTSELECTIONUPDATE(SELECTIONUPDATEType value) {
        return new JAXBElement<SELECTIONUPDATEType>(_LISTSELECTIONUPDATE_QNAME, SELECTIONUPDATEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INFORMATIVE")
    public JAXBElement<Boolean> createINFORMATIVE(Boolean value) {
        return new JAXBElement<Boolean>(_INFORMATIVE_QNAME, Boolean.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "EXTERNAL_FARE")
    public JAXBElement<String> createEXTERNALFARE(String value) {
        return new JAXBElement<String>(_EXTERNALFARE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXTERNAL_CURRENCY_CODE")
    public JAXBElement<String> createEXTERNALCURRENCYCODE(String value) {
        return new JAXBElement<String>(_EXTERNALCURRENCYCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FORCE_RBD")
    public JAXBElement<Boolean> createFORCERBD(Boolean value) {
        return new JAXBElement<Boolean>(_FORCERBD_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ENGINE_RBD_FILTERING")
    public JAXBElement<Boolean> createENGINERBDFILTERING(Boolean value) {
        return new JAXBElement<Boolean>(_ENGINERBDFILTERING_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REDEMPTION_AVAILABILITY")
    public JAXBElement<Boolean> createREDEMPTIONAVAILABILITY(Boolean value) {
        return new JAXBElement<Boolean>(_REDEMPTIONAVAILABILITY_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AWARD_AVAILABILITY")
    public JAXBElement<Boolean> createAWARDAVAILABILITY(Boolean value) {
        return new JAXBElement<Boolean>(_AWARDAVAILABILITY_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STAFF_AVAILABILITY")
    public JAXBElement<Boolean> createSTAFFAVAILABILITY(Boolean value) {
        return new JAXBElement<Boolean>(_STAFFAVAILABILITY_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CABIN_FILTERING")
    public JAXBElement<Boolean> createCABINFILTERING(Boolean value) {
        return new JAXBElement<Boolean>(_CABINFILTERING_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALTERNATIVE_CABIN")
    public JAXBElement<Boolean> createALTERNATIVECABIN(Boolean value) {
        return new JAXBElement<Boolean>(_ALTERNATIVECABIN_QNAME, Boolean.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "RBD")
    public JAXBElement<String> createRBD(String value) {
        return new JAXBElement<String>(_RBD_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COMPANION_MODE")
    public JAXBElement<String> createCOMPANIONMODE(String value) {
        return new JAXBElement<String>(_COMPANIONMODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_UMNR_FLOW")
    public JAXBElement<Boolean> createISUMNRFLOW(Boolean value) {
        return new JAXBElement<Boolean>(_ISUMNRFLOW_QNAME, Boolean.class, null, value);
    }

}
