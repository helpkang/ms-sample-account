
package com.koreanair.eretail.pojo.tripplan.common.common_tr;

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
 * generated in the com.koreanair.eretail.pojo.tripplan.common.common_tr package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.eretail.pojo.tripplan.common.common_tr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrPassportInformationType }
     * 
     */
    public TrPassportInformationType createTrPassportInformationType() {
        return new TrPassportInformationType();
    }

    /**
     * Create an instance of {@link TrSearchCriteriaType }
     * 
     */
    public TrSearchCriteriaType createTrSearchCriteriaType() {
        return new TrSearchCriteriaType();
    }

    /**
     * Create an instance of {@link TrSearchCriteriaType.AMOUNT }
     * 
     */
    public TrSearchCriteriaType.AMOUNT createTrSearchCriteriaTypeAMOUNT() {
        return new TrSearchCriteriaType.AMOUNT();
    }

    /**
     * Create an instance of {@link TrBoundType }
     * 
     */
    public TrBoundType createTrBoundType() {
        return new TrBoundType();
    }

    /**
     * Create an instance of {@link TrOutBoundType }
     * 
     */
    public TrOutBoundType createTrOutBoundType() {
        return new TrOutBoundType();
    }

    /**
     * Create an instance of {@link TrAmount }
     * 
     */
    public TrAmount createTrAmount() {
        return new TrAmount();
    }

    /**
     * Create an instance of {@link TrAddressType }
     * 
     */
    public TrAddressType createTrAddressType() {
        return new TrAddressType();
    }

    /**
     * Create an instance of {@link TrMileageType }
     * 
     */
    public TrMileageType createTrMileageType() {
        return new TrMileageType();
    }

    /**
     * Create an instance of {@link TrDateWindow }
     * 
     */
    public TrDateWindow createTrDateWindow() {
        return new TrDateWindow();
    }

    /**
     * Create an instance of {@link TrLocation }
     * 
     */
    public TrLocation createTrLocation() {
        return new TrLocation();
    }

    /**
     * Create an instance of {@link TrAmountRange }
     * 
     */
    public TrAmountRange createTrAmountRange() {
        return new TrAmountRange();
    }

    /**
     * Create an instance of {@link TrProviderType }
     * 
     */
    public TrProviderType createTrProviderType() {
        return new TrProviderType();
    }

    /**
     * Create an instance of {@link TrVehiculeType }
     * 
     */
    public TrVehiculeType createTrVehiculeType() {
        return new TrVehiculeType();
    }

    /**
     * Create an instance of {@link TrBaseElementsIDsType }
     * 
     */
    public TrBaseElementsIDsType createTrBaseElementsIDsType() {
        return new TrBaseElementsIDsType();
    }

    /**
     * Create an instance of {@link TrBaseElementsType }
     * 
     */
    public TrBaseElementsType createTrBaseElementsType() {
        return new TrBaseElementsType();
    }

    /**
     * Create an instance of {@link TrCommonElementsType }
     * 
     */
    public TrCommonElementsType createTrCommonElementsType() {
        return new TrCommonElementsType();
    }

    /**
     * Create an instance of {@link TrOriginSystemType }
     * 
     */
    public TrOriginSystemType createTrOriginSystemType() {
        return new TrOriginSystemType();
    }

    /**
     * Create an instance of {@link TrBookingChannelType }
     * 
     */
    public TrBookingChannelType createTrBookingChannelType() {
        return new TrBookingChannelType();
    }

    /**
     * Create an instance of {@link TrExternalSystemType }
     * 
     */
    public TrExternalSystemType createTrExternalSystemType() {
        return new TrExternalSystemType();
    }

    /**
     * Create an instance of {@link TrReferenceType }
     * 
     */
    public TrReferenceType createTrReferenceType() {
        return new TrReferenceType();
    }

    /**
     * Create an instance of {@link TrTechnicalIdsType }
     * 
     */
    public TrTechnicalIdsType createTrTechnicalIdsType() {
        return new TrTechnicalIdsType();
    }

    /**
     * Create an instance of {@link TrPassportInformationType.COUNTRY }
     * 
     */
    public TrPassportInformationType.COUNTRY createTrPassportInformationTypeCOUNTRY() {
        return new TrPassportInformationType.COUNTRY();
    }

    /**
     * Create an instance of {@link TrSearchCriteriaType.CABIN }
     * 
     */
    public TrSearchCriteriaType.CABIN createTrSearchCriteriaTypeCABIN() {
        return new TrSearchCriteriaType.CABIN();
    }

    /**
     * Create an instance of {@link TrSearchCriteriaType.AMOUNT.RANGE }
     * 
     */
    public TrSearchCriteriaType.AMOUNT.RANGE createTrSearchCriteriaTypeAMOUNTRANGE() {
        return new TrSearchCriteriaType.AMOUNT.RANGE();
    }

    /**
     * Create an instance of {@link TrSearchCriteriaType.AMOUNT.CURRENCY }
     * 
     */
    public TrSearchCriteriaType.AMOUNT.CURRENCY createTrSearchCriteriaTypeAMOUNTCURRENCY() {
        return new TrSearchCriteriaType.AMOUNT.CURRENCY();
    }

    /**
     * Create an instance of {@link TrBoundType.LOCATION }
     * 
     */
    public TrBoundType.LOCATION createTrBoundTypeLOCATION() {
        return new TrBoundType.LOCATION();
    }

    /**
     * Create an instance of {@link TrOutBoundType.RADIUS }
     * 
     */
    public TrOutBoundType.RADIUS createTrOutBoundTypeRADIUS() {
        return new TrOutBoundType.RADIUS();
    }

    /**
     * Create an instance of {@link TrAmount.CURRENCY }
     * 
     */
    public TrAmount.CURRENCY createTrAmountCURRENCY() {
        return new TrAmount.CURRENCY();
    }

    /**
     * Create an instance of {@link TrAddressType.STATE }
     * 
     */
    public TrAddressType.STATE createTrAddressTypeSTATE() {
        return new TrAddressType.STATE();
    }

    /**
     * Create an instance of {@link TrAddressType.COUNTRY }
     * 
     */
    public TrAddressType.COUNTRY createTrAddressTypeCOUNTRY() {
        return new TrAddressType.COUNTRY();
    }

    /**
     * Create an instance of {@link TrAddressType.CITY }
     * 
     */
    public TrAddressType.CITY createTrAddressTypeCITY() {
        return new TrAddressType.CITY();
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
