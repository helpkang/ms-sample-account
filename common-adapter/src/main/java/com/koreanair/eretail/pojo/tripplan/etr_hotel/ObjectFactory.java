
package com.koreanair.eretail.pojo.tripplan.etr_hotel;

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
 * generated in the com.koreanair.eretail.pojo.tripplan.etr_hotel package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.eretail.pojo.tripplan.etr_hotel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EtrHotel }
     * 
     */
    public EtrHotel createEtrHotel() {
        return new EtrHotel();
    }

    /**
     * Create an instance of {@link EtrHotel.GUARANTEE }
     * 
     */
    public EtrHotel.GUARANTEE createEtrHotelGUARANTEE() {
        return new EtrHotel.GUARANTEE();
    }

    /**
     * Create an instance of {@link EtrHotel.ROOM }
     * 
     */
    public EtrHotel.ROOM createEtrHotelROOM() {
        return new EtrHotel.ROOM();
    }

    /**
     * Create an instance of {@link EtrHotel.HOTEL }
     * 
     */
    public EtrHotel.HOTEL createEtrHotelHOTEL() {
        return new EtrHotel.HOTEL();
    }

    /**
     * Create an instance of {@link ETRHTLOutputDateType }
     * 
     */
    public ETRHTLOutputDateType createETRHTLOutputDateType() {
        return new ETRHTLOutputDateType();
    }

    /**
     * Create an instance of {@link EtrHotel.COMPANY }
     * 
     */
    public EtrHotel.COMPANY createEtrHotelCOMPANY() {
        return new EtrHotel.COMPANY();
    }

    /**
     * Create an instance of {@link EtrHotel.BEDTYPE }
     * 
     */
    public EtrHotel.BEDTYPE createEtrHotelBEDTYPE() {
        return new EtrHotel.BEDTYPE();
    }

    /**
     * Create an instance of {@link EtrHotel.MEAL }
     * 
     */
    public EtrHotel.MEAL createEtrHotelMEAL() {
        return new EtrHotel.MEAL();
    }

    /**
     * Create an instance of {@link EtrHotel.LISTSERVICE }
     * 
     */
    public EtrHotel.LISTSERVICE createEtrHotelLISTSERVICE() {
        return new EtrHotel.LISTSERVICE();
    }

    /**
     * Create an instance of {@link EtrHotel.LISTCANCELLATION }
     * 
     */
    public EtrHotel.LISTCANCELLATION createEtrHotelLISTCANCELLATION() {
        return new EtrHotel.LISTCANCELLATION();
    }

    /**
     * Create an instance of {@link EtrHotel.LISTRATEINCLUSION }
     * 
     */
    public EtrHotel.LISTRATEINCLUSION createEtrHotelLISTRATEINCLUSION() {
        return new EtrHotel.LISTRATEINCLUSION();
    }

    /**
     * Create an instance of {@link EtrHotel.LISTOTHERRULE }
     * 
     */
    public EtrHotel.LISTOTHERRULE createEtrHotelLISTOTHERRULE() {
        return new EtrHotel.LISTOTHERRULE();
    }

    /**
     * Create an instance of {@link EtrHotel.CHECKIN }
     * 
     */
    public EtrHotel.CHECKIN createEtrHotelCHECKIN() {
        return new EtrHotel.CHECKIN();
    }

    /**
     * Create an instance of {@link EtrHotel.CHECKOUT }
     * 
     */
    public EtrHotel.CHECKOUT createEtrHotelCHECKOUT() {
        return new EtrHotel.CHECKOUT();
    }

    /**
     * Create an instance of {@link EtrHotel.PASSENGERINFO }
     * 
     */
    public EtrHotel.PASSENGERINFO createEtrHotelPASSENGERINFO() {
        return new EtrHotel.PASSENGERINFO();
    }

    /**
     * Create an instance of {@link EtrHotel.SPECIALRATECODE }
     * 
     */
    public EtrHotel.SPECIALRATECODE createEtrHotelSPECIALRATECODE() {
        return new EtrHotel.SPECIALRATECODE();
    }

    /**
     * Create an instance of {@link EtrHotel.GUARANTEE.LISTTAX }
     * 
     */
    public EtrHotel.GUARANTEE.LISTTAX createEtrHotelGUARANTEELISTTAX() {
        return new EtrHotel.GUARANTEE.LISTTAX();
    }

    /**
     * Create an instance of {@link EtrHotel.ROOM.TYPE }
     * 
     */
    public EtrHotel.ROOM.TYPE createEtrHotelROOMTYPE() {
        return new EtrHotel.ROOM.TYPE();
    }

    /**
     * Create an instance of {@link EtrHotel.ROOM.CATEGORY }
     * 
     */
    public EtrHotel.ROOM.CATEGORY createEtrHotelROOMCATEGORY() {
        return new EtrHotel.ROOM.CATEGORY();
    }

    /**
     * Create an instance of {@link EtrHotel.HOTEL.ADDRESS }
     * 
     */
    public EtrHotel.HOTEL.ADDRESS createEtrHotelHOTELADDRESS() {
        return new EtrHotel.HOTEL.ADDRESS();
    }

    /**
     * Create an instance of {@link EtrHotel.HOTEL.GEOCODE }
     * 
     */
    public EtrHotel.HOTEL.GEOCODE createEtrHotelHOTELGEOCODE() {
        return new EtrHotel.HOTEL.GEOCODE();
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
