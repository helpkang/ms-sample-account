
package com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput;

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


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput package. 
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

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FAREFAMILYFareType }
     * 
     */
    public FAREFAMILYFareType createFAREFAMILYFareType() {
        return new FAREFAMILYFareType();
    }

    /**
     * Create an instance of {@link BDATE }
     * 
     */
    public BDATE createBDATE() {
        return new BDATE();
    }

    /**
     * Create an instance of {@link EDATE }
     * 
     */
    public EDATE createEDATE() {
        return new EDATE();
    }

    /**
     * Create an instance of {@link ETDDATE }
     * 
     */
    public ETDDATE createETDDATE() {
        return new ETDDATE();
    }

    /**
     * Create an instance of {@link ETADATE }
     * 
     */
    public ETADATE createETADATE() {
        return new ETADATE();
    }

    /**
     * Create an instance of {@link AIRLINEType }
     * 
     */
    public AIRLINEType createAIRLINEType() {
        return new AIRLINEType();
    }

    /**
     * Create an instance of {@link LISTLEGType }
     * 
     */
    public LISTLEGType createLISTLEGType() {
        return new LISTLEGType();
    }

    /**
     * Create an instance of {@link EQUIPMENT }
     * 
     */
    public EQUIPMENT createEQUIPMENT() {
        return new EQUIPMENT();
    }

    /**
     * Create an instance of {@link LISTCABINType }
     * 
     */
    public LISTCABINType createLISTCABINType() {
        return new LISTCABINType();
    }

    /**
     * Create an instance of {@link FareFamilyType }
     * 
     */
    public FareFamilyType createFareFamilyType() {
        return new FareFamilyType();
    }

    /**
     * Create an instance of {@link FLIGHTCONFIGURATIONType }
     * 
     */
    public FLIGHTCONFIGURATIONType createFLIGHTCONFIGURATIONType() {
        return new FLIGHTCONFIGURATIONType();
    }

    /**
     * Create an instance of {@link LISTITINERARYLightType }
     * 
     */
    public LISTITINERARYLightType createLISTITINERARYLightType() {
        return new LISTITINERARYLightType();
    }

    /**
     * Create an instance of {@link LISTITINERARYType }
     * 
     */
    public LISTITINERARYType createLISTITINERARYType() {
        return new LISTITINERARYType();
    }

    /**
     * Create an instance of {@link ELEMENTType }
     * 
     */
    public ELEMENTType createELEMENTType() {
        return new ELEMENTType();
    }

    /**
     * Create an instance of {@link SEARCHDATAType }
     * 
     */
    public SEARCHDATAType createSEARCHDATAType() {
        return new SEARCHDATAType();
    }

    /**
     * Create an instance of {@link DecodedLocationType }
     * 
     */
    public DecodedLocationType createDecodedLocationType() {
        return new DecodedLocationType();
    }

    /**
     * Create an instance of {@link STOPType }
     * 
     */
    public STOPType createSTOPType() {
        return new STOPType();
    }

    /**
     * Create an instance of {@link LOCATIONType }
     * 
     */
    public LOCATIONType createLOCATIONType() {
        return new LOCATIONType();
    }

    /**
     * Create an instance of {@link MILEAGEINFORMATIONType }
     * 
     */
    public MILEAGEINFORMATIONType createMILEAGEINFORMATIONType() {
        return new MILEAGEINFORMATIONType();
    }

    /**
     * Create an instance of {@link DATEType }
     * 
     */
    public DATEType createDATEType() {
        return new DATEType();
    }

    /**
     * Create an instance of {@link AIRPORTLOCATIONType }
     * 
     */
    public AIRPORTLOCATIONType createAIRPORTLOCATIONType() {
        return new AIRPORTLOCATIONType();
    }

    /**
     * Create an instance of {@link LISTSEGMENTType }
     * 
     */
    public LISTSEGMENTType createLISTSEGMENTType() {
        return new LISTSEGMENTType();
    }

    /**
     * Create an instance of {@link ONTIMEPERFORMANCEType }
     * 
     */
    public ONTIMEPERFORMANCEType createONTIMEPERFORMANCEType() {
        return new ONTIMEPERFORMANCEType();
    }

    /**
     * Create an instance of {@link LISTCOMMERCIALAGREEMENTType }
     * 
     */
    public LISTCOMMERCIALAGREEMENTType createLISTCOMMERCIALAGREEMENTType() {
        return new LISTCOMMERCIALAGREEMENTType();
    }

    /**
     * Create an instance of {@link LISTMEALSERVICESType }
     * 
     */
    public LISTMEALSERVICESType createLISTMEALSERVICESType() {
        return new LISTMEALSERVICESType();
    }

    /**
     * Create an instance of {@link AIRRBDType }
     * 
     */
    public AIRRBDType createAIRRBDType() {
        return new AIRRBDType();
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

}
