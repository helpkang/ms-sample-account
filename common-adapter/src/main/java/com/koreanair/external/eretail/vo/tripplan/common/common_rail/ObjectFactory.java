
package com.koreanair.external.eretail.vo.tripplan.common.common_rail;

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
 * generated in the com.koreanair.external.eretail.vo.tripplan.common.common_rail package. 
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
    private final static QName _SYSTEMPROVIDER_QNAME = new QName("", "SYSTEM_PROVIDER");
    private final static QName _RULEID_QNAME = new QName("", "RULE_ID");
    private final static QName _TRAINTYPE_QNAME = new QName("", "TRAIN_TYPE");
    private final static QName _LISTDISCOUNTCARD_QNAME = new QName("", "LIST_DISCOUNT_CARD");
    private final static QName _ISALTERNATESTATION_QNAME = new QName("", "IS_ALTERNATE_STATION");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.external.eretail.vo.tripplan.common.common_rail
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ACCOMMODATIONType }
     * 
     */
    public ACCOMMODATIONType createACCOMMODATIONType() {
        return new ACCOMMODATIONType();
    }

    /**
     * Create an instance of {@link SUPPLEMENTType }
     * 
     */
    public SUPPLEMENTType createSUPPLEMENTType() {
        return new SUPPLEMENTType();
    }

    /**
     * Create an instance of {@link RAILTICKETINFORMATIONType }
     * 
     */
    public RAILTICKETINFORMATIONType createRAILTICKETINFORMATIONType() {
        return new RAILTICKETINFORMATIONType();
    }

    /**
     * Create an instance of {@link TRAINRETRIEVEType }
     * 
     */
    public TRAINRETRIEVEType createTRAINRETRIEVEType() {
        return new TRAINRETRIEVEType();
    }

    /**
     * Create an instance of {@link PAYMENTINFORMATIONType }
     * 
     */
    public PAYMENTINFORMATIONType createPAYMENTINFORMATIONType() {
        return new PAYMENTINFORMATIONType();
    }

    /**
     * Create an instance of {@link PAYMENTINFORMATIONType.CREDITCARDINFORMATION }
     * 
     */
    public PAYMENTINFORMATIONType.CREDITCARDINFORMATION createPAYMENTINFORMATIONTypeCREDITCARDINFORMATION() {
        return new PAYMENTINFORMATIONType.CREDITCARDINFORMATION();
    }

    /**
     * Create an instance of {@link PRICETypeBASE }
     * 
     */
    public PRICETypeBASE createPRICETypeBASE() {
        return new PRICETypeBASE();
    }

    /**
     * Create an instance of {@link TRAINPRICEBaseType }
     * 
     */
    public TRAINPRICEBaseType createTRAINPRICEBaseType() {
        return new TRAINPRICEBaseType();
    }

    /**
     * Create an instance of {@link TRAINPRICEBaseType.LISTTRAVELLER }
     * 
     */
    public TRAINPRICEBaseType.LISTTRAVELLER createTRAINPRICEBaseTypeLISTTRAVELLER() {
        return new TRAINPRICEBaseType.LISTTRAVELLER();
    }

    /**
     * Create an instance of {@link TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO }
     * 
     */
    public TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO createTRAINPRICEBaseTypeLISTTRAVELLERLISTSEGMENTINFO() {
        return new TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO();
    }

    /**
     * Create an instance of {@link OFFERTypeBASE }
     * 
     */
    public OFFERTypeBASE createOFFERTypeBASE() {
        return new OFFERTypeBASE();
    }

    /**
     * Create an instance of {@link OFFERAVAILType }
     * 
     */
    public OFFERAVAILType createOFFERAVAILType() {
        return new OFFERAVAILType();
    }

    /**
     * Create an instance of {@link SEGMENTType }
     * 
     */
    public SEGMENTType createSEGMENTType() {
        return new SEGMENTType();
    }

    /**
     * Create an instance of {@link SEGMENTType.LISTTRAVELLERSEAT }
     * 
     */
    public SEGMENTType.LISTTRAVELLERSEAT createSEGMENTTypeLISTTRAVELLERSEAT() {
        return new SEGMENTType.LISTTRAVELLERSEAT();
    }

    /**
     * Create an instance of {@link SEARCHDATAOUTPUTType }
     * 
     */
    public SEARCHDATAOUTPUTType createSEARCHDATAOUTPUTType() {
        return new SEARCHDATAOUTPUTType();
    }

    /**
     * Create an instance of {@link SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE }
     * 
     */
    public SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE createSEARCHDATAOUTPUTTypeLISTTRAINPREFERENCE() {
        return new SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE();
    }

    /**
     * Create an instance of {@link SEARCHDATAINPUTType }
     * 
     */
    public SEARCHDATAINPUTType createSEARCHDATAINPUTType() {
        return new SEARCHDATAINPUTType();
    }

    /**
     * Create an instance of {@link TRAINTRAVELLERType }
     * 
     */
    public TRAINTRAVELLERType createTRAINTRAVELLERType() {
        return new TRAINTRAVELLERType();
    }

    /**
     * Create an instance of {@link TRAINDISCOUNTCARDType }
     * 
     */
    public TRAINDISCOUNTCARDType createTRAINDISCOUNTCARDType() {
        return new TRAINDISCOUNTCARDType();
    }

    /**
     * Create an instance of {@link LISTSTANDARDRAILRULE }
     * 
     */
    public LISTSTANDARDRAILRULE createLISTSTANDARDRAILRULE() {
        return new LISTSTANDARDRAILRULE();
    }

    /**
     * Create an instance of {@link TRAINRULEPREFERENCEType }
     * 
     */
    public TRAINRULEPREFERENCEType createTRAINRULEPREFERENCEType() {
        return new TRAINRULEPREFERENCEType();
    }

    /**
     * Create an instance of {@link FARINGDETAILType }
     * 
     */
    public FARINGDETAILType createFARINGDETAILType() {
        return new FARINGDETAILType();
    }

    /**
     * Create an instance of {@link MAXPRICEType }
     * 
     */
    public MAXPRICEType createMAXPRICEType() {
        return new MAXPRICEType();
    }

    /**
     * Create an instance of {@link RAILUPGRADERULE }
     * 
     */
    public RAILUPGRADERULE createRAILUPGRADERULE() {
        return new RAILUPGRADERULE();
    }

    /**
     * Create an instance of {@link TRAINRULES }
     * 
     */
    public TRAINRULES createTRAINRULES() {
        return new TRAINRULES();
    }

    /**
     * Create an instance of {@link OTHERRAILRULES }
     * 
     */
    public OTHERRAILRULES createOTHERRAILRULES() {
        return new OTHERRAILRULES();
    }

    /**
     * Create an instance of {@link PROVIDERPREFERENCEType }
     * 
     */
    public PROVIDERPREFERENCEType createPROVIDERPREFERENCEType() {
        return new PROVIDERPREFERENCEType();
    }

    /**
     * Create an instance of {@link TRAINPREFERENCEType }
     * 
     */
    public TRAINPREFERENCEType createTRAINPREFERENCEType() {
        return new TRAINPREFERENCEType();
    }

    /**
     * Create an instance of {@link TRAINCOMPANYType }
     * 
     */
    public TRAINCOMPANYType createTRAINCOMPANYType() {
        return new TRAINCOMPANYType();
    }

    /**
     * Create an instance of {@link RAILLOCATIONType }
     * 
     */
    public RAILLOCATIONType createRAILLOCATIONType() {
        return new RAILLOCATIONType();
    }

    /**
     * Create an instance of {@link RAILVIALOCATIONType }
     * 
     */
    public RAILVIALOCATIONType createRAILVIALOCATIONType() {
        return new RAILVIALOCATIONType();
    }

    /**
     * Create an instance of {@link BOOKEDOFFERType }
     * 
     */
    public BOOKEDOFFERType createBOOKEDOFFERType() {
        return new BOOKEDOFFERType();
    }

    /**
     * Create an instance of {@link OFFERType }
     * 
     */
    public OFFERType createOFFERType() {
        return new OFFERType();
    }

    /**
     * Create an instance of {@link TRAVELLERPRICEType }
     * 
     */
    public TRAVELLERPRICEType createTRAVELLERPRICEType() {
        return new TRAVELLERPRICEType();
    }

    /**
     * Create an instance of {@link TRAINPRICEType }
     * 
     */
    public TRAINPRICEType createTRAINPRICEType() {
        return new TRAINPRICEType();
    }

    /**
     * Create an instance of {@link TRAINCABINType }
     * 
     */
    public TRAINCABINType createTRAINCABINType() {
        return new TRAINCABINType();
    }

    /**
     * Create an instance of {@link DELIVERYINFORMATIONType }
     * 
     */
    public DELIVERYINFORMATIONType createDELIVERYINFORMATIONType() {
        return new DELIVERYINFORMATIONType();
    }

    /**
     * Create an instance of {@link TRAINRATETYPEType }
     * 
     */
    public TRAINRATETYPEType createTRAINRATETYPEType() {
        return new TRAINRATETYPEType();
    }

    /**
     * Create an instance of {@link FAREINFORMATIONType }
     * 
     */
    public FAREINFORMATIONType createFAREINFORMATIONType() {
        return new FAREINFORMATIONType();
    }

    /**
     * Create an instance of {@link ACCOMMODATIONPREFERENCEType }
     * 
     */
    public ACCOMMODATIONPREFERENCEType createACCOMMODATIONPREFERENCEType() {
        return new ACCOMMODATIONPREFERENCEType();
    }

    /**
     * Create an instance of {@link CODEDESCRIPTORType }
     * 
     */
    public CODEDESCRIPTORType createCODEDESCRIPTORType() {
        return new CODEDESCRIPTORType();
    }

    /**
     * Create an instance of {@link PROVIDERCODEDESCRIPTORType }
     * 
     */
    public PROVIDERCODEDESCRIPTORType createPROVIDERCODEDESCRIPTORType() {
        return new PROVIDERCODEDESCRIPTORType();
    }

    /**
     * Create an instance of {@link ACCOMMODATIONType.LISTPROFILEPREFERENCE }
     * 
     */
    public ACCOMMODATIONType.LISTPROFILEPREFERENCE createACCOMMODATIONTypeLISTPROFILEPREFERENCE() {
        return new ACCOMMODATIONType.LISTPROFILEPREFERENCE();
    }

    /**
     * Create an instance of {@link SUPPLEMENTType.BDATE }
     * 
     */
    public SUPPLEMENTType.BDATE createSUPPLEMENTTypeBDATE() {
        return new SUPPLEMENTType.BDATE();
    }

    /**
     * Create an instance of {@link RAILTICKETINFORMATIONType.ISSUEDATE }
     * 
     */
    public RAILTICKETINFORMATIONType.ISSUEDATE createRAILTICKETINFORMATIONTypeISSUEDATE() {
        return new RAILTICKETINFORMATIONType.ISSUEDATE();
    }

    /**
     * Create an instance of {@link TRAINRETRIEVEType.BOOKINGDATE }
     * 
     */
    public TRAINRETRIEVEType.BOOKINGDATE createTRAINRETRIEVETypeBOOKINGDATE() {
        return new TRAINRETRIEVEType.BOOKINGDATE();
    }

    /**
     * Create an instance of {@link PAYMENTINFORMATIONType.CREDITCARDINFORMATION.COMPANY }
     * 
     */
    public PAYMENTINFORMATIONType.CREDITCARDINFORMATION.COMPANY createPAYMENTINFORMATIONTypeCREDITCARDINFORMATIONCOMPANY() {
        return new PAYMENTINFORMATIONType.CREDITCARDINFORMATION.COMPANY();
    }

    /**
     * Create an instance of {@link PRICETypeBASE.TRAINCABIN }
     * 
     */
    public PRICETypeBASE.TRAINCABIN createPRICETypeBASETRAINCABIN() {
        return new PRICETypeBASE.TRAINCABIN();
    }

    /**
     * Create an instance of {@link TRAINPRICEBaseType.RESERVATIONPRICE }
     * 
     */
    public TRAINPRICEBaseType.RESERVATIONPRICE createTRAINPRICEBaseTypeRESERVATIONPRICE() {
        return new TRAINPRICEBaseType.RESERVATIONPRICE();
    }

    /**
     * Create an instance of {@link TRAINPRICEBaseType.FARECLASSIFICATION }
     * 
     */
    public TRAINPRICEBaseType.FARECLASSIFICATION createTRAINPRICEBaseTypeFARECLASSIFICATION() {
        return new TRAINPRICEBaseType.FARECLASSIFICATION();
    }

    /**
     * Create an instance of {@link TRAINPRICEBaseType.PASSENGERLIMITS }
     * 
     */
    public TRAINPRICEBaseType.PASSENGERLIMITS createTRAINPRICEBaseTypePASSENGERLIMITS() {
        return new TRAINPRICEBaseType.PASSENGERLIMITS();
    }

    /**
     * Create an instance of {@link TRAINPRICEBaseType.LISTPRICEBREAKDOWN }
     * 
     */
    public TRAINPRICEBaseType.LISTPRICEBREAKDOWN createTRAINPRICEBaseTypeLISTPRICEBREAKDOWN() {
        return new TRAINPRICEBaseType.LISTPRICEBREAKDOWN();
    }

    /**
     * Create an instance of {@link TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO.RATETYPE }
     * 
     */
    public TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO.RATETYPE createTRAINPRICEBaseTypeLISTTRAVELLERLISTSEGMENTINFORATETYPE() {
        return new TRAINPRICEBaseType.LISTTRAVELLER.LISTSEGMENTINFO.RATETYPE();
    }

    /**
     * Create an instance of {@link OFFERTypeBASE.BDATE }
     * 
     */
    public OFFERTypeBASE.BDATE createOFFERTypeBASEBDATE() {
        return new OFFERTypeBASE.BDATE();
    }

    /**
     * Create an instance of {@link OFFERTypeBASE.EDATE }
     * 
     */
    public OFFERTypeBASE.EDATE createOFFERTypeBASEEDATE() {
        return new OFFERTypeBASE.EDATE();
    }

    /**
     * Create an instance of {@link OFFERAVAILType.BDATE }
     * 
     */
    public OFFERAVAILType.BDATE createOFFERAVAILTypeBDATE() {
        return new OFFERAVAILType.BDATE();
    }

    /**
     * Create an instance of {@link OFFERAVAILType.EDATE }
     * 
     */
    public OFFERAVAILType.EDATE createOFFERAVAILTypeEDATE() {
        return new OFFERAVAILType.EDATE();
    }

    /**
     * Create an instance of {@link SEGMENTType.EQUIPMENT }
     * 
     */
    public SEGMENTType.EQUIPMENT createSEGMENTTypeEQUIPMENT() {
        return new SEGMENTType.EQUIPMENT();
    }

    /**
     * Create an instance of {@link SEGMENTType.LISTSERVICE }
     * 
     */
    public SEGMENTType.LISTSERVICE createSEGMENTTypeLISTSERVICE() {
        return new SEGMENTType.LISTSERVICE();
    }

    /**
     * Create an instance of {@link SEGMENTType.MEAL }
     * 
     */
    public SEGMENTType.MEAL createSEGMENTTypeMEAL() {
        return new SEGMENTType.MEAL();
    }

    /**
     * Create an instance of {@link SEGMENTType.CLOSETO }
     * 
     */
    public SEGMENTType.CLOSETO createSEGMENTTypeCLOSETO() {
        return new SEGMENTType.CLOSETO();
    }

    /**
     * Create an instance of {@link SEGMENTType.LISTTRAVELLERSEAT.MEAL }
     * 
     */
    public SEGMENTType.LISTTRAVELLERSEAT.MEAL createSEGMENTTypeLISTTRAVELLERSEATMEAL() {
        return new SEGMENTType.LISTTRAVELLERSEAT.MEAL();
    }

    /**
     * Create an instance of {@link SEGMENTType.LISTTRAVELLERSEAT.LISTSEATINGINFO }
     * 
     */
    public SEGMENTType.LISTTRAVELLERSEAT.LISTSEATINGINFO createSEGMENTTypeLISTTRAVELLERSEATLISTSEATINGINFO() {
        return new SEGMENTType.LISTTRAVELLERSEAT.LISTSEATINGINFO();
    }

    /**
     * Create an instance of {@link SEARCHDATAOUTPUTType.BDATE }
     * 
     */
    public SEARCHDATAOUTPUTType.BDATE createSEARCHDATAOUTPUTTypeBDATE() {
        return new SEARCHDATAOUTPUTType.BDATE();
    }

    /**
     * Create an instance of {@link SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE.CLASSOFSERVICE }
     * 
     */
    public SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE.CLASSOFSERVICE createSEARCHDATAOUTPUTTypeLISTTRAINPREFERENCECLASSOFSERVICE() {
        return new SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE.CLASSOFSERVICE();
    }

    /**
     * Create an instance of {@link SEARCHDATAINPUTType.BDATE }
     * 
     */
    public SEARCHDATAINPUTType.BDATE createSEARCHDATAINPUTTypeBDATE() {
        return new SEARCHDATAINPUTType.BDATE();
    }

    /**
     * Create an instance of {@link TRAINTRAVELLERType.TRAVELLERTYPE }
     * 
     */
    public TRAINTRAVELLERType.TRAVELLERTYPE createTRAINTRAVELLERTypeTRAVELLERTYPE() {
        return new TRAINTRAVELLERType.TRAVELLERTYPE();
    }

    /**
     * Create an instance of {@link TRAINTRAVELLERType.LISTCONTACTPOINT }
     * 
     */
    public TRAINTRAVELLERType.LISTCONTACTPOINT createTRAINTRAVELLERTypeLISTCONTACTPOINT() {
        return new TRAINTRAVELLERType.LISTCONTACTPOINT();
    }

    /**
     * Create an instance of {@link TRAINTRAVELLERType.MEAL }
     * 
     */
    public TRAINTRAVELLERType.MEAL createTRAINTRAVELLERTypeMEAL() {
        return new TRAINTRAVELLERType.MEAL();
    }

    /**
     * Create an instance of {@link TRAINTRAVELLERType.LISTFREQUENTTRAVELLER }
     * 
     */
    public TRAINTRAVELLERType.LISTFREQUENTTRAVELLER createTRAINTRAVELLERTypeLISTFREQUENTTRAVELLER() {
        return new TRAINTRAVELLERType.LISTFREQUENTTRAVELLER();
    }

    /**
     * Create an instance of {@link TRAINDISCOUNTCARDType.EXPIRYDATE }
     * 
     */
    public TRAINDISCOUNTCARDType.EXPIRYDATE createTRAINDISCOUNTCARDTypeEXPIRYDATE() {
        return new TRAINDISCOUNTCARDType.EXPIRYDATE();
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
    @XmlElementDecl(namespace = "", name = "SYSTEM_PROVIDER")
    public JAXBElement<String> createSYSTEMPROVIDER(String value) {
        return new JAXBElement<String>(_SYSTEMPROVIDER_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RULE_ID")
    public JAXBElement<String> createRULEID(String value) {
        return new JAXBElement<String>(_RULEID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRAIN_TYPE")
    public JAXBElement<String> createTRAINTYPE(String value) {
        return new JAXBElement<String>(_TRAINTYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRAINDISCOUNTCARDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_DISCOUNT_CARD")
    public JAXBElement<TRAINDISCOUNTCARDType> createLISTDISCOUNTCARD(TRAINDISCOUNTCARDType value) {
        return new JAXBElement<TRAINDISCOUNTCARDType>(_LISTDISCOUNTCARD_QNAME, TRAINDISCOUNTCARDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_ALTERNATE_STATION")
    public JAXBElement<Object> createISALTERNATESTATION(Object value) {
        return new JAXBElement<Object>(_ISALTERNATESTATION_QNAME, Object.class, null, value);
    }

}
