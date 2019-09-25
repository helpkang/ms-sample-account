
package com.koreanair.eretail.pojo.air.promptmodifyflightoutput;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.air.common.FLIGHTPREFERENCEType;
import com.koreanair.eretail.pojo.air.commonout.AVAILABILITYType;
import com.koreanair.eretail.pojo.air.commonout.CABINType;
import com.koreanair.eretail.pojo.air.commonout.CARDType;
import com.koreanair.eretail.pojo.air.commonout.ITINERARYType;
import com.koreanair.eretail.pojo.air.commonout.LOCATIONType;
import com.koreanair.eretail.pojo.air.commonout.SEGMENTType;
import com.koreanair.eretail.pojo.air.commonout.TRAVELLERType;
import com.koreanair.eretail.pojo.common.common.GDSCABINCODEType;
import com.koreanair.eretail.pojo.common.common.LISTTRIPREASONtype;
import com.koreanair.eretail.pojo.common.common.OperationalDataType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.eretail.pojo.air.promptmodifyflightoutput package. 
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
    private final static QName _LISTAVAILABILITY_QNAME = new QName("", "LIST_AVAILABILITY");
    private final static QName _LISTTRAVELLER_QNAME = new QName("", "LIST_TRAVELLER");
    private final static QName _LISTALLOWEDCABIN_QNAME = new QName("", "LIST_ALLOWED_CABIN");
    private final static QName _LISTITINERARY_QNAME = new QName("", "LIST_ITINERARY");
    private final static QName _LISTDISCOUNTCARD_QNAME = new QName("", "LIST_DISCOUNT_CARD");
    private final static QName _LISTELOCATION_QNAME = new QName("", "LIST_E_LOCATION");
    private final static QName _LISTBLOCATION_QNAME = new QName("", "LIST_B_LOCATION");
    private final static QName _LISTVIALOCATION_QNAME = new QName("", "LIST_VIA_LOCATION");
    private final static QName _ELOCATION_QNAME = new QName("", "E_LOCATION");
    private final static QName _BLOCATION_QNAME = new QName("", "B_LOCATION");
    private final static QName _BANYTIME_QNAME = new QName("", "B_ANY_TIME");
    private final static QName _LISTSEGMENT_QNAME = new QName("", "LIST_SEGMENT");
    private final static QName _ELOCATIONCODE_QNAME = new QName("", "E_LOCATION_CODE");
    private final static QName _BLOCATIONCODE_QNAME = new QName("", "B_LOCATION_CODE");
    private final static QName _RESTRICTION_QNAME = new QName("", "RESTRICTION");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.eretail.pojo.air.promptmodifyflightoutput
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PromptModifyFlightOutput }
     * 
     */
    public PromptModifyFlightOutput createPromptModifyFlightOutput() {
        return new PromptModifyFlightOutput();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AVAILABILITYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_AVAILABILITY")
    public JAXBElement<AVAILABILITYType> createLISTAVAILABILITY(AVAILABILITYType value) {
        return new JAXBElement<AVAILABILITYType>(_LISTAVAILABILITY_QNAME, AVAILABILITYType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CABINType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_ALLOWED_CABIN")
    public JAXBElement<CABINType> createLISTALLOWEDCABIN(CABINType value) {
        return new JAXBElement<CABINType>(_LISTALLOWEDCABIN_QNAME, CABINType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ITINERARYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_ITINERARY")
    public JAXBElement<ITINERARYType> createLISTITINERARY(ITINERARYType value) {
        return new JAXBElement<ITINERARYType>(_LISTITINERARY_QNAME, ITINERARYType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CARDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_DISCOUNT_CARD")
    public JAXBElement<CARDType> createLISTDISCOUNTCARD(CARDType value) {
        return new JAXBElement<CARDType>(_LISTDISCOUNTCARD_QNAME, CARDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOCATIONType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_E_LOCATION")
    public JAXBElement<LOCATIONType> createLISTELOCATION(LOCATIONType value) {
        return new JAXBElement<LOCATIONType>(_LISTELOCATION_QNAME, LOCATIONType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOCATIONType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_B_LOCATION")
    public JAXBElement<LOCATIONType> createLISTBLOCATION(LOCATIONType value) {
        return new JAXBElement<LOCATIONType>(_LISTBLOCATION_QNAME, LOCATIONType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOCATIONType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_VIA_LOCATION")
    public JAXBElement<LOCATIONType> createLISTVIALOCATION(LOCATIONType value) {
        return new JAXBElement<LOCATIONType>(_LISTVIALOCATION_QNAME, LOCATIONType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "B_ANY_TIME")
    public JAXBElement<Boolean> createBANYTIME(Boolean value) {
        return new JAXBElement<Boolean>(_BANYTIME_QNAME, Boolean.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "E_LOCATION_CODE")
    public JAXBElement<String> createELOCATIONCODE(String value) {
        return new JAXBElement<String>(_ELOCATIONCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "B_LOCATION_CODE")
    public JAXBElement<String> createBLOCATIONCODE(String value) {
        return new JAXBElement<String>(_BLOCATIONCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RESTRICTION")
    public JAXBElement<Boolean> createRESTRICTION(Boolean value) {
        return new JAXBElement<Boolean>(_RESTRICTION_QNAME, Boolean.class, null, value);
    }

}
