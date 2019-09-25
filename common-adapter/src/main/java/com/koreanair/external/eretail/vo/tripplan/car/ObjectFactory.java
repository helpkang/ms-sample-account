
package com.koreanair.external.eretail.vo.tripplan.car;

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
 * generated in the com.koreanair.external.eretail.vo.tripplan.car package. 
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
    private final static QName _SIZE_QNAME = new QName("", "SIZE");
    private final static QName _URL_QNAME = new QName("", "URL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.external.eretail.vo.tripplan.car
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CAR }
     * 
     */
    public CAR createCAR() {
        return new CAR();
    }

    /**
     * Create an instance of {@link CAR.LOWESTRATE }
     * 
     */
    public CAR.LOWESTRATE createCARLOWESTRATE() {
        return new CAR.LOWESTRATE();
    }

    /**
     * Create an instance of {@link CAR.ECARLOCATION }
     * 
     */
    public CAR.ECARLOCATION createCARECARLOCATION() {
        return new CAR.ECARLOCATION();
    }

    /**
     * Create an instance of {@link CAR.BCARLOCATION }
     * 
     */
    public CAR.BCARLOCATION createCARBCARLOCATION() {
        return new CAR.BCARLOCATION();
    }

    /**
     * Create an instance of {@link CAR.FREQUENTRENTERCARDS }
     * 
     */
    public CAR.FREQUENTRENTERCARDS createCARFREQUENTRENTERCARDS() {
        return new CAR.FREQUENTRENTERCARDS();
    }

    /**
     * Create an instance of {@link CAR.STATUS }
     * 
     */
    public CAR.STATUS createCARSTATUS() {
        return new CAR.STATUS();
    }

    /**
     * Create an instance of {@link CAR.DESCRIPTION }
     * 
     */
    public CAR.DESCRIPTION createCARDESCRIPTION() {
        return new CAR.DESCRIPTION();
    }

    /**
     * Create an instance of {@link CAR.PERMISSIONS }
     * 
     */
    public CAR.PERMISSIONS createCARPERMISSIONS() {
        return new CAR.PERMISSIONS();
    }

    /**
     * Create an instance of {@link CAR.ELIGIBILITYINFORMATION }
     * 
     */
    public CAR.ELIGIBILITYINFORMATION createCARELIGIBILITYINFORMATION() {
        return new CAR.ELIGIBILITYINFORMATION();
    }

    /**
     * Create an instance of {@link CAR.PNRINFORMATION }
     * 
     */
    public CAR.PNRINFORMATION createCARPNRINFORMATION() {
        return new CAR.PNRINFORMATION();
    }

    /**
     * Create an instance of {@link CAR.ISSUEDATE }
     * 
     */
    public CAR.ISSUEDATE createCARISSUEDATE() {
        return new CAR.ISSUEDATE();
    }

    /**
     * Create an instance of {@link CAR.BLOCATION }
     * 
     */
    public CAR.BLOCATION createCARBLOCATION() {
        return new CAR.BLOCATION();
    }

    /**
     * Create an instance of {@link CAR.ELOCATION }
     * 
     */
    public CAR.ELOCATION createCARELOCATION() {
        return new CAR.ELOCATION();
    }

    /**
     * Create an instance of {@link CAR.BDATE }
     * 
     */
    public CAR.BDATE createCARBDATE() {
        return new CAR.BDATE();
    }

    /**
     * Create an instance of {@link CAR.EDATE }
     * 
     */
    public CAR.EDATE createCAREDATE() {
        return new CAR.EDATE();
    }

    /**
     * Create an instance of {@link CAR.PRICEPLAN }
     * 
     */
    public CAR.PRICEPLAN createCARPRICEPLAN() {
        return new CAR.PRICEPLAN();
    }

    /**
     * Create an instance of {@link CAR.GUARANTEE }
     * 
     */
    public CAR.GUARANTEE createCARGUARANTEE() {
        return new CAR.GUARANTEE();
    }

    /**
     * Create an instance of {@link CAR.VV }
     * 
     */
    public CAR.VV createCARVV() {
        return new CAR.VV();
    }

    /**
     * Create an instance of {@link CAR.LOWESTRATE.NORMAL }
     * 
     */
    public CAR.LOWESTRATE.NORMAL createCARLOWESTRATENORMAL() {
        return new CAR.LOWESTRATE.NORMAL();
    }

    /**
     * Create an instance of {@link CAR.LOWESTRATE.TOTAL }
     * 
     */
    public CAR.LOWESTRATE.TOTAL createCARLOWESTRATETOTAL() {
        return new CAR.LOWESTRATE.TOTAL();
    }

    /**
     * Create an instance of {@link CAR.ECARLOCATION.LISTOPENINGHOURS }
     * 
     */
    public CAR.ECARLOCATION.LISTOPENINGHOURS createCARECARLOCATIONLISTOPENINGHOURS() {
        return new CAR.ECARLOCATION.LISTOPENINGHOURS();
    }

    /**
     * Create an instance of {@link CAR.BCARLOCATION.LISTOPENINGHOURS }
     * 
     */
    public CAR.BCARLOCATION.LISTOPENINGHOURS createCARBCARLOCATIONLISTOPENINGHOURS() {
        return new CAR.BCARLOCATION.LISTOPENINGHOURS();
    }

    /**
     * Create an instance of {@link CAR.FREQUENTRENTERCARDS.FTNUMBER }
     * 
     */
    public CAR.FREQUENTRENTERCARDS.FTNUMBER createCARFREQUENTRENTERCARDSFTNUMBER() {
        return new CAR.FREQUENTRENTERCARDS.FTNUMBER();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SIZE")
    public JAXBElement<BigInteger> createSIZE(BigInteger value) {
        return new JAXBElement<BigInteger>(_SIZE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "URL")
    public JAXBElement<String> createURL(String value) {
        return new JAXBElement<String>(_URL_QNAME, String.class, null, value);
    }

}
