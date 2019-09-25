
package com.koreanair.eretail.pojo.tripplan.common.common_segment;

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
 * generated in the com.koreanair.eretail.pojo.tripplan.common.common_segment package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.eretail.pojo.tripplan.common.common_segment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LISTLEGType }
     * 
     */
    public LISTLEGType createLISTLEGType() {
        return new LISTLEGType();
    }

    /**
     * Create an instance of {@link SegmentType }
     * 
     */
    public SegmentType createSegmentType() {
        return new SegmentType();
    }

    /**
     * Create an instance of {@link SegmentType.INFORMATIVEPRICE }
     * 
     */
    public SegmentType.INFORMATIVEPRICE createSegmentTypeINFORMATIVEPRICE() {
        return new SegmentType.INFORMATIVEPRICE();
    }

    /**
     * Create an instance of {@link SegmentType.LISTCHECKINPROPERTIES }
     * 
     */
    public SegmentType.LISTCHECKINPROPERTIES createSegmentTypeLISTCHECKINPROPERTIES() {
        return new SegmentType.LISTCHECKINPROPERTIES();
    }

    /**
     * Create an instance of {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN }
     * 
     */
    public SegmentType.LISTCHECKINPROPERTIES.CHECKIN createSegmentTypeLISTCHECKINPROPERTIESCHECKIN() {
        return new SegmentType.LISTCHECKINPROPERTIES.CHECKIN();
    }

    /**
     * Create an instance of {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD }
     * 
     */
    public SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD createSegmentTypeLISTCHECKINPROPERTIESCHECKINACCEPTANCEPERIOD() {
        return new SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD();
    }

    /**
     * Create an instance of {@link SegmentType.CHECKINPROPERTIES }
     * 
     */
    public SegmentType.CHECKINPROPERTIES createSegmentTypeCHECKINPROPERTIES() {
        return new SegmentType.CHECKINPROPERTIES();
    }

    /**
     * Create an instance of {@link SegmentType.CHECKINPROPERTIES.CHECKIN }
     * 
     */
    public SegmentType.CHECKINPROPERTIES.CHECKIN createSegmentTypeCHECKINPROPERTIESCHECKIN() {
        return new SegmentType.CHECKINPROPERTIES.CHECKIN();
    }

    /**
     * Create an instance of {@link SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD }
     * 
     */
    public SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD createSegmentTypeCHECKINPROPERTIESCHECKINACCEPTANCEPERIOD() {
        return new SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD();
    }

    /**
     * Create an instance of {@link SegmentType.SERVICES }
     * 
     */
    public SegmentType.SERVICES createSegmentTypeSERVICES() {
        return new SegmentType.SERVICES();
    }

    /**
     * Create an instance of {@link SegmentType.SERVICES.LISTPRICES }
     * 
     */
    public SegmentType.SERVICES.LISTPRICES createSegmentTypeSERVICESLISTPRICES() {
        return new SegmentType.SERVICES.LISTPRICES();
    }

    /**
     * Create an instance of {@link SegmentType.ELIGIBILITYINFORMATION }
     * 
     */
    public SegmentType.ELIGIBILITYINFORMATION createSegmentTypeELIGIBILITYINFORMATION() {
        return new SegmentType.ELIGIBILITYINFORMATION();
    }

    /**
     * Create an instance of {@link SegmentType.LISTCABIN }
     * 
     */
    public SegmentType.LISTCABIN createSegmentTypeLISTCABIN() {
        return new SegmentType.LISTCABIN();
    }

    /**
     * Create an instance of {@link SEGMENTLOCATIONType }
     * 
     */
    public SEGMENTLOCATIONType createSEGMENTLOCATIONType() {
        return new SEGMENTLOCATIONType();
    }

    /**
     * Create an instance of {@link AIRLINEType }
     * 
     */
    public AIRLINEType createAIRLINEType() {
        return new AIRLINEType();
    }

    /**
     * Create an instance of {@link MILEAGEINFORMATIONType }
     * 
     */
    public MILEAGEINFORMATIONType createMILEAGEINFORMATIONType() {
        return new MILEAGEINFORMATIONType();
    }

    /**
     * Create an instance of {@link STOPType }
     * 
     */
    public STOPType createSTOPType() {
        return new STOPType();
    }

    /**
     * Create an instance of {@link LegLOCATIONType }
     * 
     */
    public LegLOCATIONType createLegLOCATIONType() {
        return new LegLOCATIONType();
    }

    /**
     * Create an instance of {@link DATEType }
     * 
     */
    public DATEType createDATEType() {
        return new DATEType();
    }

    /**
     * Create an instance of {@link FLIGHTCONFIGURATIONType }
     * 
     */
    public FLIGHTCONFIGURATIONType createFLIGHTCONFIGURATIONType() {
        return new FLIGHTCONFIGURATIONType();
    }

    /**
     * Create an instance of {@link SEGMENTCUSTOMREGIONType }
     * 
     */
    public SEGMENTCUSTOMREGIONType createSEGMENTCUSTOMREGIONType() {
        return new SEGMENTCUSTOMREGIONType();
    }

    /**
     * Create an instance of {@link LISTLEGType.EQUIPMENT }
     * 
     */
    public LISTLEGType.EQUIPMENT createLISTLEGTypeEQUIPMENT() {
        return new LISTLEGType.EQUIPMENT();
    }

    /**
     * Create an instance of {@link SegmentType.EDATE }
     * 
     */
    public SegmentType.EDATE createSegmentTypeEDATE() {
        return new SegmentType.EDATE();
    }

    /**
     * Create an instance of {@link SegmentType.BDATE }
     * 
     */
    public SegmentType.BDATE createSegmentTypeBDATE() {
        return new SegmentType.BDATE();
    }

    /**
     * Create an instance of {@link SegmentType.OTHERAIRLINE }
     * 
     */
    public SegmentType.OTHERAIRLINE createSegmentTypeOTHERAIRLINE() {
        return new SegmentType.OTHERAIRLINE();
    }

    /**
     * Create an instance of {@link SegmentType.CHECKINTIME }
     * 
     */
    public SegmentType.CHECKINTIME createSegmentTypeCHECKINTIME() {
        return new SegmentType.CHECKINTIME();
    }

    /**
     * Create an instance of {@link SegmentType.LISTSTATUS }
     * 
     */
    public SegmentType.LISTSTATUS createSegmentTypeLISTSTATUS() {
        return new SegmentType.LISTSTATUS();
    }

    /**
     * Create an instance of {@link SegmentType.LISTMEAL }
     * 
     */
    public SegmentType.LISTMEAL createSegmentTypeLISTMEAL() {
        return new SegmentType.LISTMEAL();
    }

    /**
     * Create an instance of {@link SegmentType.EQUIPMENT }
     * 
     */
    public SegmentType.EQUIPMENT createSegmentTypeEQUIPMENT() {
        return new SegmentType.EQUIPMENT();
    }

    /**
     * Create an instance of {@link SegmentType.FAREFAMILY }
     * 
     */
    public SegmentType.FAREFAMILY createSegmentTypeFAREFAMILY() {
        return new SegmentType.FAREFAMILY();
    }

    /**
     * Create an instance of {@link SegmentType.SELECTIONINFOFORUPGRADE }
     * 
     */
    public SegmentType.SELECTIONINFOFORUPGRADE createSegmentTypeSELECTIONINFOFORUPGRADE() {
        return new SegmentType.SELECTIONINFOFORUPGRADE();
    }

    /**
     * Create an instance of {@link SegmentType.LISTFLIGHTFACT }
     * 
     */
    public SegmentType.LISTFLIGHTFACT createSegmentTypeLISTFLIGHTFACT() {
        return new SegmentType.LISTFLIGHTFACT();
    }

    /**
     * Create an instance of {@link SegmentType.INFORMATIVEPRICE.CURENCY }
     * 
     */
    public SegmentType.INFORMATIVEPRICE.CURENCY createSegmentTypeINFORMATIVEPRICECURENCY() {
        return new SegmentType.INFORMATIVEPRICE.CURENCY();
    }

    /**
     * Create an instance of {@link SegmentType.LISTCHECKINPROPERTIES.LISTPASSENGER }
     * 
     */
    public SegmentType.LISTCHECKINPROPERTIES.LISTPASSENGER createSegmentTypeLISTCHECKINPROPERTIESLISTPASSENGER() {
        return new SegmentType.LISTCHECKINPROPERTIES.LISTPASSENGER();
    }

    /**
     * Create an instance of {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN.FLIGHTELIGIBILITYSTATUS }
     * 
     */
    public SegmentType.LISTCHECKINPROPERTIES.CHECKIN.FLIGHTELIGIBILITYSTATUS createSegmentTypeLISTCHECKINPROPERTIESCHECKINFLIGHTELIGIBILITYSTATUS() {
        return new SegmentType.LISTCHECKINPROPERTIES.CHECKIN.FLIGHTELIGIBILITYSTATUS();
    }

    /**
     * Create an instance of {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN }
     * 
     */
    public SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN createSegmentTypeLISTCHECKINPROPERTIESCHECKINACCEPTANCEPERIODBEGIN() {
        return new SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN();
    }

    /**
     * Create an instance of {@link SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END }
     * 
     */
    public SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END createSegmentTypeLISTCHECKINPROPERTIESCHECKINACCEPTANCEPERIODEND() {
        return new SegmentType.LISTCHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END();
    }

    /**
     * Create an instance of {@link SegmentType.CHECKINPROPERTIES.LISTPASSENGER }
     * 
     */
    public SegmentType.CHECKINPROPERTIES.LISTPASSENGER createSegmentTypeCHECKINPROPERTIESLISTPASSENGER() {
        return new SegmentType.CHECKINPROPERTIES.LISTPASSENGER();
    }

    /**
     * Create an instance of {@link SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN }
     * 
     */
    public SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN createSegmentTypeCHECKINPROPERTIESCHECKINACCEPTANCEPERIODBEGIN() {
        return new SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.BEGIN();
    }

    /**
     * Create an instance of {@link SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END }
     * 
     */
    public SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END createSegmentTypeCHECKINPROPERTIESCHECKINACCEPTANCEPERIODEND() {
        return new SegmentType.CHECKINPROPERTIES.CHECKIN.ACCEPTANCEPERIOD.END();
    }

    /**
     * Create an instance of {@link SegmentType.SERVICES.PAYMENT }
     * 
     */
    public SegmentType.SERVICES.PAYMENT createSegmentTypeSERVICESPAYMENT() {
        return new SegmentType.SERVICES.PAYMENT();
    }

    /**
     * Create an instance of {@link SegmentType.SERVICES.RULE }
     * 
     */
    public SegmentType.SERVICES.RULE createSegmentTypeSERVICESRULE() {
        return new SegmentType.SERVICES.RULE();
    }

    /**
     * Create an instance of {@link SegmentType.SERVICES.LISTPRICES.CURENCY }
     * 
     */
    public SegmentType.SERVICES.LISTPRICES.CURENCY createSegmentTypeSERVICESLISTPRICESCURENCY() {
        return new SegmentType.SERVICES.LISTPRICES.CURENCY();
    }

    /**
     * Create an instance of {@link SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERTYPEOFPAX }
     * 
     */
    public SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERTYPEOFPAX createSegmentTypeELIGIBILITYINFORMATIONLISTPRICEFORUPGRADEPERTYPEOFPAX() {
        return new SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERTYPEOFPAX();
    }

    /**
     * Create an instance of {@link SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERPAX }
     * 
     */
    public SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERPAX createSegmentTypeELIGIBILITYINFORMATIONLISTPRICEFORUPGRADEPERPAX() {
        return new SegmentType.ELIGIBILITYINFORMATION.LISTPRICEFORUPGRADEPERPAX();
    }

    /**
     * Create an instance of {@link SegmentType.LISTCABIN.FAREFAMILY }
     * 
     */
    public SegmentType.LISTCABIN.FAREFAMILY createSegmentTypeLISTCABINFAREFAMILY() {
        return new SegmentType.LISTCABIN.FAREFAMILY();
    }

    /**
     * Create an instance of {@link SegmentType.LISTCABIN.LISTRBD }
     * 
     */
    public SegmentType.LISTCABIN.LISTRBD createSegmentTypeLISTCABINLISTRBD() {
        return new SegmentType.LISTCABIN.LISTRBD();
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
