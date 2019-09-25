
package com.koreanair.eretail.pojo.tripplan.etr_elements;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.common.common.GDSCABINCODEType;
import com.koreanair.eretail.pojo.common.common.LISTTRIPREASONtype;
import com.koreanair.eretail.pojo.common.common.OperationalDataType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.eretail.pojo.tripplan.etr_elements package. 
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

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.eretail.pojo.tripplan.etr_elements
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ETR }
     * 
     */
    public ETR createETR() {
        return new ETR();
    }

    /**
     * Create an instance of {@link EtrShowAndEventType }
     * 
     */
    public EtrShowAndEventType createEtrShowAndEventType() {
        return new EtrShowAndEventType();
    }

    /**
     * Create an instance of {@link EtrQuotationType }
     * 
     */
    public EtrQuotationType createEtrQuotationType() {
        return new EtrQuotationType();
    }

    /**
     * Create an instance of {@link EtrTransferType }
     * 
     */
    public EtrTransferType createEtrTransferType() {
        return new EtrTransferType();
    }

    /**
     * Create an instance of {@link EtrTaxiType }
     * 
     */
    public EtrTaxiType createEtrTaxiType() {
        return new EtrTaxiType();
    }

    /**
     * Create an instance of {@link EtrServiceType }
     * 
     */
    public EtrServiceType createEtrServiceType() {
        return new EtrServiceType();
    }

    /**
     * Create an instance of {@link EtrMiscSleepType }
     * 
     */
    public EtrMiscSleepType createEtrMiscSleepType() {
        return new EtrMiscSleepType();
    }

    /**
     * Create an instance of {@link EtrMiscSleepType.CUSTOMERS }
     * 
     */
    public EtrMiscSleepType.CUSTOMERS createEtrMiscSleepTypeCUSTOMERS() {
        return new EtrMiscSleepType.CUSTOMERS();
    }

    /**
     * Create an instance of {@link EtrMiscServiceType }
     * 
     */
    public EtrMiscServiceType createEtrMiscServiceType() {
        return new EtrMiscServiceType();
    }

    /**
     * Create an instance of {@link EtrMiscMoveType }
     * 
     */
    public EtrMiscMoveType createEtrMiscMoveType() {
        return new EtrMiscMoveType();
    }

    /**
     * Create an instance of {@link EtrMiscEatAndDrinkType }
     * 
     */
    public EtrMiscEatAndDrinkType createEtrMiscEatAndDrinkType() {
        return new EtrMiscEatAndDrinkType();
    }

    /**
     * Create an instance of {@link EtrMiscActivityType }
     * 
     */
    public EtrMiscActivityType createEtrMiscActivityType() {
        return new EtrMiscActivityType();
    }

    /**
     * Create an instance of {@link EtrMeetingType }
     * 
     */
    public EtrMeetingType createEtrMeetingType() {
        return new EtrMeetingType();
    }

    /**
     * Create an instance of {@link EtrMeetingType.START }
     * 
     */
    public EtrMeetingType.START createEtrMeetingTypeSTART() {
        return new EtrMeetingType.START();
    }

    /**
     * Create an instance of {@link EtrMeetingType.START.ADDRESS }
     * 
     */
    public EtrMeetingType.START.ADDRESS createEtrMeetingTypeSTARTADDRESS() {
        return new EtrMeetingType.START.ADDRESS();
    }

    /**
     * Create an instance of {@link EtrAirSeatType }
     * 
     */
    public EtrAirSeatType createEtrAirSeatType() {
        return new EtrAirSeatType();
    }

    /**
     * Create an instance of {@link ETR.BOOKINGS }
     * 
     */
    public ETR.BOOKINGS createETRBOOKINGS() {
        return new ETR.BOOKINGS();
    }

    /**
     * Create an instance of {@link EtrAirType }
     * 
     */
    public EtrAirType createEtrAirType() {
        return new EtrAirType();
    }

    /**
     * Create an instance of {@link EtrHotelType }
     * 
     */
    public EtrHotelType createEtrHotelType() {
        return new EtrHotelType();
    }

    /**
     * Create an instance of {@link EtrDiscountElement }
     * 
     */
    public EtrDiscountElement createEtrDiscountElement() {
        return new EtrDiscountElement();
    }

    /**
     * Create an instance of {@link EtrRailType }
     * 
     */
    public EtrRailType createEtrRailType() {
        return new EtrRailType();
    }

    /**
     * Create an instance of {@link EtrCarType }
     * 
     */
    public EtrCarType createEtrCarType() {
        return new EtrCarType();
    }

    /**
     * Create an instance of {@link EtrCruiseType }
     * 
     */
    public EtrCruiseType createEtrCruiseType() {
        return new EtrCruiseType();
    }

    /**
     * Create an instance of {@link EtrInsuranceType }
     * 
     */
    public EtrInsuranceType createEtrInsuranceType() {
        return new EtrInsuranceType();
    }

    /**
     * Create an instance of {@link EtrPriceType }
     * 
     */
    public EtrPriceType createEtrPriceType() {
        return new EtrPriceType();
    }

    /**
     * Create an instance of {@link EtrShowAndEventType.START }
     * 
     */
    public EtrShowAndEventType.START createEtrShowAndEventTypeSTART() {
        return new EtrShowAndEventType.START();
    }

    /**
     * Create an instance of {@link EtrShowAndEventType.END }
     * 
     */
    public EtrShowAndEventType.END createEtrShowAndEventTypeEND() {
        return new EtrShowAndEventType.END();
    }

    /**
     * Create an instance of {@link EtrShowAndEventType.VALIDITY }
     * 
     */
    public EtrShowAndEventType.VALIDITY createEtrShowAndEventTypeVALIDITY() {
        return new EtrShowAndEventType.VALIDITY();
    }

    /**
     * Create an instance of {@link EtrQuotationType.PRICINGINFO }
     * 
     */
    public EtrQuotationType.PRICINGINFO createEtrQuotationTypePRICINGINFO() {
        return new EtrQuotationType.PRICINGINFO();
    }

    /**
     * Create an instance of {@link EtrQuotationType.TAX }
     * 
     */
    public EtrQuotationType.TAX createEtrQuotationTypeTAX() {
        return new EtrQuotationType.TAX();
    }

    /**
     * Create an instance of {@link EtrQuotationType.QUOTATIONTYPE }
     * 
     */
    public EtrQuotationType.QUOTATIONTYPE createEtrQuotationTypeQUOTATIONTYPE() {
        return new EtrQuotationType.QUOTATIONTYPE();
    }

    /**
     * Create an instance of {@link EtrQuotationType.POINT }
     * 
     */
    public EtrQuotationType.POINT createEtrQuotationTypePOINT() {
        return new EtrQuotationType.POINT();
    }

    /**
     * Create an instance of {@link EtrTransferType.START }
     * 
     */
    public EtrTransferType.START createEtrTransferTypeSTART() {
        return new EtrTransferType.START();
    }

    /**
     * Create an instance of {@link EtrTransferType.END }
     * 
     */
    public EtrTransferType.END createEtrTransferTypeEND() {
        return new EtrTransferType.END();
    }

    /**
     * Create an instance of {@link EtrTransferType.BAGGAGE }
     * 
     */
    public EtrTransferType.BAGGAGE createEtrTransferTypeBAGGAGE() {
        return new EtrTransferType.BAGGAGE();
    }

    /**
     * Create an instance of {@link EtrTransferType.CHECKIN }
     * 
     */
    public EtrTransferType.CHECKIN createEtrTransferTypeCHECKIN() {
        return new EtrTransferType.CHECKIN();
    }

    /**
     * Create an instance of {@link EtrTransferType.TICKET }
     * 
     */
    public EtrTransferType.TICKET createEtrTransferTypeTICKET() {
        return new EtrTransferType.TICKET();
    }

    /**
     * Create an instance of {@link EtrTaxiType.START }
     * 
     */
    public EtrTaxiType.START createEtrTaxiTypeSTART() {
        return new EtrTaxiType.START();
    }

    /**
     * Create an instance of {@link EtrTaxiType.END }
     * 
     */
    public EtrTaxiType.END createEtrTaxiTypeEND() {
        return new EtrTaxiType.END();
    }

    /**
     * Create an instance of {@link EtrTaxiType.BAGGAGE }
     * 
     */
    public EtrTaxiType.BAGGAGE createEtrTaxiTypeBAGGAGE() {
        return new EtrTaxiType.BAGGAGE();
    }

    /**
     * Create an instance of {@link EtrServiceType.SERVICEPROVIDER }
     * 
     */
    public EtrServiceType.SERVICEPROVIDER createEtrServiceTypeSERVICEPROVIDER() {
        return new EtrServiceType.SERVICEPROVIDER();
    }

    /**
     * Create an instance of {@link EtrServiceType.START }
     * 
     */
    public EtrServiceType.START createEtrServiceTypeSTART() {
        return new EtrServiceType.START();
    }

    /**
     * Create an instance of {@link EtrServiceType.END }
     * 
     */
    public EtrServiceType.END createEtrServiceTypeEND() {
        return new EtrServiceType.END();
    }

    /**
     * Create an instance of {@link EtrMiscSleepType.START }
     * 
     */
    public EtrMiscSleepType.START createEtrMiscSleepTypeSTART() {
        return new EtrMiscSleepType.START();
    }

    /**
     * Create an instance of {@link EtrMiscSleepType.END }
     * 
     */
    public EtrMiscSleepType.END createEtrMiscSleepTypeEND() {
        return new EtrMiscSleepType.END();
    }

    /**
     * Create an instance of {@link EtrMiscSleepType.CHECKIN }
     * 
     */
    public EtrMiscSleepType.CHECKIN createEtrMiscSleepTypeCHECKIN() {
        return new EtrMiscSleepType.CHECKIN();
    }

    /**
     * Create an instance of {@link EtrMiscSleepType.CHECKOUT }
     * 
     */
    public EtrMiscSleepType.CHECKOUT createEtrMiscSleepTypeCHECKOUT() {
        return new EtrMiscSleepType.CHECKOUT();
    }

    /**
     * Create an instance of {@link EtrMiscSleepType.GUARANTEE }
     * 
     */
    public EtrMiscSleepType.GUARANTEE createEtrMiscSleepTypeGUARANTEE() {
        return new EtrMiscSleepType.GUARANTEE();
    }

    /**
     * Create an instance of {@link EtrMiscSleepType.DEPOSIT }
     * 
     */
    public EtrMiscSleepType.DEPOSIT createEtrMiscSleepTypeDEPOSIT() {
        return new EtrMiscSleepType.DEPOSIT();
    }

    /**
     * Create an instance of {@link EtrMiscSleepType.CUSTOMERS.CHILDREN }
     * 
     */
    public EtrMiscSleepType.CUSTOMERS.CHILDREN createEtrMiscSleepTypeCUSTOMERSCHILDREN() {
        return new EtrMiscSleepType.CUSTOMERS.CHILDREN();
    }

    /**
     * Create an instance of {@link EtrMiscServiceType.START }
     * 
     */
    public EtrMiscServiceType.START createEtrMiscServiceTypeSTART() {
        return new EtrMiscServiceType.START();
    }

    /**
     * Create an instance of {@link EtrMiscServiceType.END }
     * 
     */
    public EtrMiscServiceType.END createEtrMiscServiceTypeEND() {
        return new EtrMiscServiceType.END();
    }

    /**
     * Create an instance of {@link EtrMiscMoveType.START }
     * 
     */
    public EtrMiscMoveType.START createEtrMiscMoveTypeSTART() {
        return new EtrMiscMoveType.START();
    }

    /**
     * Create an instance of {@link EtrMiscMoveType.END }
     * 
     */
    public EtrMiscMoveType.END createEtrMiscMoveTypeEND() {
        return new EtrMiscMoveType.END();
    }

    /**
     * Create an instance of {@link EtrMiscMoveType.BAGGAGE }
     * 
     */
    public EtrMiscMoveType.BAGGAGE createEtrMiscMoveTypeBAGGAGE() {
        return new EtrMiscMoveType.BAGGAGE();
    }

    /**
     * Create an instance of {@link EtrMiscMoveType.CHECKIN }
     * 
     */
    public EtrMiscMoveType.CHECKIN createEtrMiscMoveTypeCHECKIN() {
        return new EtrMiscMoveType.CHECKIN();
    }

    /**
     * Create an instance of {@link EtrMiscMoveType.TICKET }
     * 
     */
    public EtrMiscMoveType.TICKET createEtrMiscMoveTypeTICKET() {
        return new EtrMiscMoveType.TICKET();
    }

    /**
     * Create an instance of {@link EtrMiscEatAndDrinkType.START }
     * 
     */
    public EtrMiscEatAndDrinkType.START createEtrMiscEatAndDrinkTypeSTART() {
        return new EtrMiscEatAndDrinkType.START();
    }

    /**
     * Create an instance of {@link EtrMiscActivityType.START }
     * 
     */
    public EtrMiscActivityType.START createEtrMiscActivityTypeSTART() {
        return new EtrMiscActivityType.START();
    }

    /**
     * Create an instance of {@link EtrMiscActivityType.END }
     * 
     */
    public EtrMiscActivityType.END createEtrMiscActivityTypeEND() {
        return new EtrMiscActivityType.END();
    }

    /**
     * Create an instance of {@link EtrMiscActivityType.TICKET }
     * 
     */
    public EtrMiscActivityType.TICKET createEtrMiscActivityTypeTICKET() {
        return new EtrMiscActivityType.TICKET();
    }

    /**
     * Create an instance of {@link EtrMeetingType.END }
     * 
     */
    public EtrMeetingType.END createEtrMeetingTypeEND() {
        return new EtrMeetingType.END();
    }

    /**
     * Create an instance of {@link EtrMeetingType.START.ADDRESS.ROOM }
     * 
     */
    public EtrMeetingType.START.ADDRESS.ROOM createEtrMeetingTypeSTARTADDRESSROOM() {
        return new EtrMeetingType.START.ADDRESS.ROOM();
    }

    /**
     * Create an instance of {@link EtrAirSeatType.START }
     * 
     */
    public EtrAirSeatType.START createEtrAirSeatTypeSTART() {
        return new EtrAirSeatType.START();
    }

    /**
     * Create an instance of {@link EtrAirSeatType.END }
     * 
     */
    public EtrAirSeatType.END createEtrAirSeatTypeEND() {
        return new EtrAirSeatType.END();
    }

    /**
     * Create an instance of {@link EtrAirSeatType.SERVICEPROVIDER }
     * 
     */
    public EtrAirSeatType.SERVICEPROVIDER createEtrAirSeatTypeSERVICEPROVIDER() {
        return new EtrAirSeatType.SERVICEPROVIDER();
    }

    /**
     * Create an instance of {@link ETR.BOOKINGS.QUOTATIONS }
     * 
     */
    public ETR.BOOKINGS.QUOTATIONS createETRBOOKINGSQUOTATIONS() {
        return new ETR.BOOKINGS.QUOTATIONS();
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

}
