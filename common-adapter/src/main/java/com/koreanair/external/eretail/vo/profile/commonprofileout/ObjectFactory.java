
package com.koreanair.external.eretail.vo.profile.commonprofileout;

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
 * generated in the com.koreanair.external.eretail.vo.profile.commonprofileout package. 
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
    private final static QName _IDENTITYINFORMATION_QNAME = new QName("", "IDENTITY_INFORMATION");
    private final static QName _LISTNOTIFICATIONINFORMATION_QNAME = new QName("", "LIST_NOTIFICATION_INFORMATION");
    private final static QName _LISTCONTACTPOINT_QNAME = new QName("", "LIST_CONTACT_POINT");
    private final static QName _LISTADDRESSINFORMATION_QNAME = new QName("", "LIST_ADDRESS_INFORMATION");
    private final static QName _LISTCREDITCARDINFORMATION_QNAME = new QName("", "LIST_CREDIT_CARD_INFORMATION");
    private final static QName _LISTGOVERNMENTPAYMENTINFORMATION_QNAME = new QName("", "LIST_GOVERNMENT_PAYMENT_INFORMATION");
    private final static QName _LISTBANKACCOUNTINFORMATION_QNAME = new QName("", "LIST_BANK_ACCOUNT_INFORMATION");
    private final static QName _LISTEBANKVOUCHERINFORMATION_QNAME = new QName("", "LIST_EBANK_VOUCHER_INFORMATION");
    private final static QName _LISTCHECKINFORMATION_QNAME = new QName("", "LIST_CHECK_INFORMATION");
    private final static QName _LISTVOUCHERACCOUNTINFORMATION_QNAME = new QName("", "LIST_VOUCHER_ACCOUNT_INFORMATION");
    private final static QName _ISUSERLOGGEDIN_QNAME = new QName("", "IS_USER_LOGGED_IN");
    private final static QName _INFANT_QNAME = new QName("", "INFANT");
    private final static QName _LISTCONTACTPOINTPASSENGER_QNAME = new QName("", "LIST_CONTACT_POINT_PASSENGER");
    private final static QName _LISTIDENTITYDOCUMENT_QNAME = new QName("", "LIST_IDENTITY_DOCUMENT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.external.eretail.vo.profile.commonprofileout
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PROFILEINFORMATION }
     * 
     */
    public PROFILEINFORMATION createPROFILEINFORMATION() {
        return new PROFILEINFORMATION();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION }
     * 
     */
    public CORPORATEINFORMATION createCORPORATEINFORMATION() {
        return new CORPORATEINFORMATION();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION }
     * 
     */
    public ADDITIONALINFORMATION createADDITIONALINFORMATION() {
        return new ADDITIONALINFORMATION();
    }

    /**
     * Create an instance of {@link TRAVELAGENCYINFORMATION }
     * 
     */
    public TRAVELAGENCYINFORMATION createTRAVELAGENCYINFORMATION() {
        return new TRAVELAGENCYINFORMATION();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES }
     * 
     */
    public LISTPREFERENCES createLISTPREFERENCES() {
        return new LISTPREFERENCES();
    }

    /**
     * Create an instance of {@link LISTACCOUNTINGINFOMATION }
     * 
     */
    public LISTACCOUNTINGINFOMATION createLISTACCOUNTINGINFOMATION() {
        return new LISTACCOUNTINGINFOMATION();
    }

    /**
     * Create an instance of {@link LISTPAYMENTINFORMATION }
     * 
     */
    public LISTPAYMENTINFORMATION createLISTPAYMENTINFORMATION() {
        return new LISTPAYMENTINFORMATION();
    }

    /**
     * Create an instance of {@link LISTBOOKINGPAYMENTINFORMATION }
     * 
     */
    public LISTBOOKINGPAYMENTINFORMATION createLISTBOOKINGPAYMENTINFORMATION() {
        return new LISTBOOKINGPAYMENTINFORMATION();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION }
     * 
     */
    public LISTDELIVERYINFORMATION createLISTDELIVERYINFORMATION() {
        return new LISTDELIVERYINFORMATION();
    }

    /**
     * Create an instance of {@link LISTGUARANTEEINFORMATION }
     * 
     */
    public LISTGUARANTEEINFORMATION createLISTGUARANTEEINFORMATION() {
        return new LISTGUARANTEEINFORMATION();
    }

    /**
     * Create an instance of {@link LISTREMARKFIELDS }
     * 
     */
    public LISTREMARKFIELDS createLISTREMARKFIELDS() {
        return new LISTREMARKFIELDS();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION }
     * 
     */
    public LISTADDITIONALINFORMATION createLISTADDITIONALINFORMATION() {
        return new LISTADDITIONALINFORMATION();
    }

    /**
     * Create an instance of {@link LISTFHFA }
     * 
     */
    public LISTFHFA createLISTFHFA() {
        return new LISTFHFA();
    }

    /**
     * Create an instance of {@link LISTINSURANCEINFORMATION }
     * 
     */
    public LISTINSURANCEINFORMATION createLISTINSURANCEINFORMATION() {
        return new LISTINSURANCEINFORMATION();
    }

    /**
     * Create an instance of {@link LISTOFFICEAGENCYINFORMATION }
     * 
     */
    public LISTOFFICEAGENCYINFORMATION createLISTOFFICEAGENCYINFORMATION() {
        return new LISTOFFICEAGENCYINFORMATION();
    }

    /**
     * Create an instance of {@link LISTFARE }
     * 
     */
    public LISTFARE createLISTFARE() {
        return new LISTFARE();
    }

    /**
     * Create an instance of {@link LISTWEBFARESADDITIONALINFORMATION }
     * 
     */
    public LISTWEBFARESADDITIONALINFORMATION createLISTWEBFARESADDITIONALINFORMATION() {
        return new LISTWEBFARESADDITIONALINFORMATION();
    }

    /**
     * Create an instance of {@link LISTREDEMPTIONACCOUNTType }
     * 
     */
    public LISTREDEMPTIONACCOUNTType createLISTREDEMPTIONACCOUNTType() {
        return new LISTREDEMPTIONACCOUNTType();
    }

    /**
     * Create an instance of {@link LISTFREQUENTFLYERTYPE }
     * 
     */
    public LISTFREQUENTFLYERTYPE createLISTFREQUENTFLYERTYPE() {
        return new LISTFREQUENTFLYERTYPE();
    }

    /**
     * Create an instance of {@link FREQUENTFLYERREFERENCETYPE }
     * 
     */
    public FREQUENTFLYERREFERENCETYPE createFREQUENTFLYERREFERENCETYPE() {
        return new FREQUENTFLYERREFERENCETYPE();
    }

    /**
     * Create an instance of {@link IDENTITYTYPE }
     * 
     */
    public IDENTITYTYPE createIDENTITYTYPE() {
        return new IDENTITYTYPE();
    }

    /**
     * Create an instance of {@link DISCOUNTCARDCOMPLEXTYPE }
     * 
     */
    public DISCOUNTCARDCOMPLEXTYPE createDISCOUNTCARDCOMPLEXTYPE() {
        return new DISCOUNTCARDCOMPLEXTYPE();
    }

    /**
     * Create an instance of {@link DIMENSIONTYPEPROFILE }
     * 
     */
    public DIMENSIONTYPEPROFILE createDIMENSIONTYPEPROFILE() {
        return new DIMENSIONTYPEPROFILE();
    }

    /**
     * Create an instance of {@link WEIGHTTYPEPROFILE }
     * 
     */
    public WEIGHTTYPEPROFILE createWEIGHTTYPEPROFILE() {
        return new WEIGHTTYPEPROFILE();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT }
     * 
     */
    public LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT createLISTINSURANCEINFORMATIONIDENTIFICATIONDOCUMENT() {
        return new LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT();
    }

    /**
     * Create an instance of {@link SERVICEType }
     * 
     */
    public SERVICEType createSERVICEType() {
        return new SERVICEType();
    }

    /**
     * Create an instance of {@link SERVICEType.PROPERTIES }
     * 
     */
    public SERVICEType.PROPERTIES createSERVICETypePROPERTIES() {
        return new SERVICEType.PROPERTIES();
    }

    /**
     * Create an instance of {@link SERVICEType.PROPERTIES.LISTPROPERTY }
     * 
     */
    public SERVICEType.PROPERTIES.LISTPROPERTY createSERVICETypePROPERTIESLISTPROPERTY() {
        return new SERVICEType.PROPERTIES.LISTPROPERTY();
    }

    /**
     * Create an instance of {@link SPORTEQUIPMENTType }
     * 
     */
    public SPORTEQUIPMENTType createSPORTEQUIPMENTType() {
        return new SPORTEQUIPMENTType();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.LISTANIMAL }
     * 
     */
    public LISTADDITIONALINFORMATION.LISTANIMAL createLISTADDITIONALINFORMATIONLISTANIMAL() {
        return new LISTADDITIONALINFORMATION.LISTANIMAL();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON }
     * 
     */
    public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON createLISTADDITIONALINFORMATIONTOBEASSISTEDPERSON() {
        return new LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION }
     * 
     */
    public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION createLISTADDITIONALINFORMATIONTOBEASSISTEDPERSONWHEELCHAIRINFORMATION() {
        return new LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION();
    }

    /**
     * Create an instance of {@link LISTASSOCIATEDDOCUMENT }
     * 
     */
    public LISTASSOCIATEDDOCUMENT createLISTASSOCIATEDDOCUMENT() {
        return new LISTASSOCIATEDDOCUMENT();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM }
     * 
     */
    public LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM createLISTDELIVERYINFORMATIONLISTSPECIALPROGRAM() {
        return new LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM();
    }

    /**
     * Create an instance of {@link FOIDINFORMATIONTYPE }
     * 
     */
    public FOIDINFORMATIONTYPE createFOIDINFORMATIONTYPE() {
        return new FOIDINFORMATIONTYPE();
    }

    /**
     * Create an instance of {@link FOIDINFORMATIONTYPE.MEMO }
     * 
     */
    public FOIDINFORMATIONTYPE.MEMO createFOIDINFORMATIONTYPEMEMO() {
        return new FOIDINFORMATIONTYPE.MEMO();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.MAILREFERENCE }
     * 
     */
    public LISTDELIVERYINFORMATION.MAILREFERENCE createLISTDELIVERYINFORMATIONMAILREFERENCE() {
        return new LISTDELIVERYINFORMATION.MAILREFERENCE();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE }
     * 
     */
    public LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE createLISTDELIVERYINFORMATIONMAILREFERENCEQUEUINGOFFICE() {
        return new LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE }
     * 
     */
    public LISTDELIVERYINFORMATION.PICKUPREFERENCE createLISTDELIVERYINFORMATIONPICKUPREFERENCE() {
        return new LISTDELIVERYINFORMATION.PICKUPREFERENCE();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE }
     * 
     */
    public LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE createLISTDELIVERYINFORMATIONPICKUPREFERENCEQUEUINGOFFICE() {
        return new LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE();
    }

    /**
     * Create an instance of {@link BANKACCOUNTINFORMATIONTYPE }
     * 
     */
    public BANKACCOUNTINFORMATIONTYPE createBANKACCOUNTINFORMATIONTYPE() {
        return new BANKACCOUNTINFORMATIONTYPE();
    }

    /**
     * Create an instance of {@link LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT }
     * 
     */
    public LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT createLISTBOOKINGPAYMENTINFORMATIONLISTBOOKINGLISTFORMOFPAYMENT() {
        return new LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT();
    }

    /**
     * Create an instance of {@link LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM }
     * 
     */
    public LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM createLISTPAYMENTINFORMATIONLISTSPECIALPROGRAM() {
        return new LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM();
    }

    /**
     * Create an instance of {@link LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE }
     * 
     */
    public LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE createLISTPAYMENTINFORMATIONLISTTICKETLESSTRAVELREFERENCE() {
        return new LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE();
    }

    /**
     * Create an instance of {@link GOVERNMENTPAYMENTINFORMATIONTYPE }
     * 
     */
    public GOVERNMENTPAYMENTINFORMATIONTYPE createGOVERNMENTPAYMENTINFORMATIONTYPE() {
        return new GOVERNMENTPAYMENTINFORMATIONTYPE();
    }

    /**
     * Create an instance of {@link CREDITCARDINFORMATIONTYPE }
     * 
     */
    public CREDITCARDINFORMATIONTYPE createCREDITCARDINFORMATIONTYPE() {
        return new CREDITCARDINFORMATIONTYPE();
    }

    /**
     * Create an instance of {@link ADDRESSINFORMATIONTYPE }
     * 
     */
    public ADDRESSINFORMATIONTYPE createADDRESSINFORMATIONTYPE() {
        return new ADDRESSINFORMATIONTYPE();
    }

    /**
     * Create an instance of {@link ADDRESSINFORMATIONTYPE.TITLE }
     * 
     */
    public ADDRESSINFORMATIONTYPE.TITLE createADDRESSINFORMATIONTYPETITLE() {
        return new ADDRESSINFORMATIONTYPE.TITLE();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.LEISUREPREFERENCES }
     * 
     */
    public LISTPREFERENCES.LEISUREPREFERENCES createLISTPREFERENCESLEISUREPREFERENCES() {
        return new LISTPREFERENCES.LEISUREPREFERENCES();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES createLISTPREFERENCESRAILPREFERENCES() {
        return new LISTPREFERENCES.RAILPREFERENCES();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES createLISTPREFERENCESRAILPREFERENCESLISTNEGOCIATEDFARES() {
        return new LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION createLISTPREFERENCESRAILPREFERENCESACCOMMODATION() {
        return new LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD createLISTPREFERENCESRAILPREFERENCESLISTFREQUENTRAILCARD() {
        return new LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES createLISTPREFERENCESHOTELPREFERENCES() {
        return new LISTPREFERENCES.HOTELPREFERENCES();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST createLISTPREFERENCESHOTELPREFERENCESLISTFREQUENTGUEST() {
        return new LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST createLISTPREFERENCESHOTELPREFERENCESLISTCORPORATEGUEST() {
        return new LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST createLISTPREFERENCESHOTELPREFERENCESLISTCORPORATEGUESTCORPORATEGUEST() {
        return new LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES createLISTPREFERENCESHOTELPREFERENCESROOMPREFERENCES() {
        return new LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.CARPREFERENCES }
     * 
     */
    public LISTPREFERENCES.CARPREFERENCES createLISTPREFERENCESCARPREFERENCES() {
        return new LISTPREFERENCES.CARPREFERENCES();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES createLISTPREFERENCESAIRPREFERENCES() {
        return new LISTPREFERENCES.AIRPREFERENCES();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT createLISTPREFERENCESAIRPREFERENCESLISTADDITIONALSEAT() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD createLISTPREFERENCESAIRPREFERENCESLISTACCOUNTCARD() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD createLISTPREFERENCESAIRPREFERENCESLISTDISCOUNTCARD() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD();
    }

    /**
     * Create an instance of {@link TRAVELAGENCYINFORMATION.QUEUINGOFFICE }
     * 
     */
    public TRAVELAGENCYINFORMATION.QUEUINGOFFICE createTRAVELAGENCYINFORMATIONQUEUINGOFFICE() {
        return new TRAVELAGENCYINFORMATION.QUEUINGOFFICE();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.ANIMAL }
     * 
     */
    public ADDITIONALINFORMATION.ANIMAL createADDITIONALINFORMATIONANIMAL() {
        return new ADDITIONALINFORMATION.ANIMAL();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON }
     * 
     */
    public ADDITIONALINFORMATION.TOBEASSISTEDPERSON createADDITIONALINFORMATIONTOBEASSISTEDPERSON() {
        return new ADDITIONALINFORMATION.TOBEASSISTEDPERSON();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION }
     * 
     */
    public ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION createADDITIONALINFORMATIONTOBEASSISTEDPERSONWHEELCHAIRINFORMATION() {
        return new ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE }
     * 
     */
    public ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE createADDITIONALINFORMATIONLISTADDITIONALLUGGAGE() {
        return new ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION }
     * 
     */
    public CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION createCORPORATEINFORMATIONTRAVELAPPROVERINFORMATION() {
        return new CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.TRAVELARRANGERINFORMATION }
     * 
     */
    public CORPORATEINFORMATION.TRAVELARRANGERINFORMATION createCORPORATEINFORMATIONTRAVELARRANGERINFORMATION() {
        return new CORPORATEINFORMATION.TRAVELARRANGERINFORMATION();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER }
     * 
     */
    public CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER createCORPORATEINFORMATIONTRAVELARRANGERINFORMATIONLISTNOMINATEDTRAVELARRANGER() {
        return new CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION }
     * 
     */
    public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION createCORPORATEINFORMATIONADMINISTRATIVEINFORMATION() {
        return new CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE }
     * 
     */
    public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE createCORPORATEINFORMATIONADMINISTRATIVEINFORMATIONGROUPQUEUINGOFFICE() {
        return new CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE();
    }

    /**
     * Create an instance of {@link PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION }
     * 
     */
    public PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION createPROFILEINFORMATIONLISTADDITIONALPROFILEINFORMATION() {
        return new PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION();
    }

    /**
     * Create an instance of {@link NOTIFICATIONINFORMATIONTYPE }
     * 
     */
    public NOTIFICATIONINFORMATIONTYPE createNOTIFICATIONINFORMATIONTYPE() {
        return new NOTIFICATIONINFORMATIONTYPE();
    }

    /**
     * Create an instance of {@link IDENTITYINFORMATIONTYPE }
     * 
     */
    public IDENTITYINFORMATIONTYPE createIDENTITYINFORMATIONTYPE() {
        return new IDENTITYINFORMATIONTYPE();
    }

    /**
     * Create an instance of {@link INDEXTYPE }
     * 
     */
    public INDEXTYPE createINDEXTYPE() {
        return new INDEXTYPE();
    }

    /**
     * Create an instance of {@link USERAUTHENTIFICATION }
     * 
     */
    public USERAUTHENTIFICATION createUSERAUTHENTIFICATION() {
        return new USERAUTHENTIFICATION();
    }

    /**
     * Create an instance of {@link TRAVELLERTYPETYPE }
     * 
     */
    public TRAVELLERTYPETYPE createTRAVELLERTYPETYPE() {
        return new TRAVELLERTYPETYPE();
    }

    /**
     * Create an instance of {@link PROFILEINFORMATION.CEMDETAILS }
     * 
     */
    public PROFILEINFORMATION.CEMDETAILS createPROFILEINFORMATIONCEMDETAILS() {
        return new PROFILEINFORMATION.CEMDETAILS();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.PERMISSION }
     * 
     */
    public CORPORATEINFORMATION.PERMISSION createCORPORATEINFORMATIONPERMISSION() {
        return new CORPORATEINFORMATION.PERMISSION();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.OUTOFOFFICEINFORMATION }
     * 
     */
    public CORPORATEINFORMATION.OUTOFOFFICEINFORMATION createCORPORATEINFORMATIONOUTOFOFFICEINFORMATION() {
        return new CORPORATEINFORMATION.OUTOFOFFICEINFORMATION();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.LISTCOMMENTS }
     * 
     */
    public ADDITIONALINFORMATION.LISTCOMMENTS createADDITIONALINFORMATIONLISTCOMMENTS() {
        return new ADDITIONALINFORMATION.LISTCOMMENTS();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.CORPORATEDATA }
     * 
     */
    public ADDITIONALINFORMATION.CORPORATEDATA createADDITIONALINFORMATIONCORPORATEDATA() {
        return new ADDITIONALINFORMATION.CORPORATEDATA();
    }

    /**
     * Create an instance of {@link CONTACTPOINTTYPE }
     * 
     */
    public CONTACTPOINTTYPE createCONTACTPOINTTYPE() {
        return new CONTACTPOINTTYPE();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.CURRENCY }
     * 
     */
    public LISTPREFERENCES.CURRENCY createLISTPREFERENCESCURRENCY() {
        return new LISTPREFERENCES.CURRENCY();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.FAVOURITEDESTINATION }
     * 
     */
    public LISTPREFERENCES.FAVOURITEDESTINATION createLISTPREFERENCESFAVOURITEDESTINATION() {
        return new LISTPREFERENCES.FAVOURITEDESTINATION();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.COMMONPREFERENCES }
     * 
     */
    public LISTPREFERENCES.COMMONPREFERENCES createLISTPREFERENCESCOMMONPREFERENCES() {
        return new LISTPREFERENCES.COMMONPREFERENCES();
    }

    /**
     * Create an instance of {@link LISTECLIDS }
     * 
     */
    public LISTECLIDS createLISTECLIDS() {
        return new LISTECLIDS();
    }

    /**
     * Create an instance of {@link LISTACCOUNTINGINFOMATION.GSTDETAILS }
     * 
     */
    public LISTACCOUNTINGINFOMATION.GSTDETAILS createLISTACCOUNTINGINFOMATIONGSTDETAILS() {
        return new LISTACCOUNTINGINFOMATION.GSTDETAILS();
    }

    /**
     * Create an instance of {@link LISTPAYMENTINFORMATION.PAYMENTTYPE }
     * 
     */
    public LISTPAYMENTINFORMATION.PAYMENTTYPE createLISTPAYMENTINFORMATIONPAYMENTTYPE() {
        return new LISTPAYMENTINFORMATION.PAYMENTTYPE();
    }

    /**
     * Create an instance of {@link LISTPAYMENTINFORMATION.ACCOUNTPAYMENTREFERENCE }
     * 
     */
    public LISTPAYMENTINFORMATION.ACCOUNTPAYMENTREFERENCE createLISTPAYMENTINFORMATIONACCOUNTPAYMENTREFERENCE() {
        return new LISTPAYMENTINFORMATION.ACCOUNTPAYMENTREFERENCE();
    }

    /**
     * Create an instance of {@link LISTPAYMENTINFORMATION.EXTERNALINFORMATION }
     * 
     */
    public LISTPAYMENTINFORMATION.EXTERNALINFORMATION createLISTPAYMENTINFORMATIONEXTERNALINFORMATION() {
        return new LISTPAYMENTINFORMATION.EXTERNALINFORMATION();
    }

    /**
     * Create an instance of {@link LISTPAYMENTINFORMATION.LISTPARAMETER }
     * 
     */
    public LISTPAYMENTINFORMATION.LISTPARAMETER createLISTPAYMENTINFORMATIONLISTPARAMETER() {
        return new LISTPAYMENTINFORMATION.LISTPARAMETER();
    }

    /**
     * Create an instance of {@link EBANKVOUCHERINFORMATIONTYPE }
     * 
     */
    public EBANKVOUCHERINFORMATIONTYPE createEBANKVOUCHERINFORMATIONTYPE() {
        return new EBANKVOUCHERINFORMATIONTYPE();
    }

    /**
     * Create an instance of {@link CHECKINFORMATIONTYPE }
     * 
     */
    public CHECKINFORMATIONTYPE createCHECKINFORMATIONTYPE() {
        return new CHECKINFORMATIONTYPE();
    }

    /**
     * Create an instance of {@link VOUCHERACCOUNTINFORMATIONTYPE }
     * 
     */
    public VOUCHERACCOUNTINFORMATIONTYPE createVOUCHERACCOUNTINFORMATIONTYPE() {
        return new VOUCHERACCOUNTINFORMATIONTYPE();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.DELIVERYTYPE }
     * 
     */
    public LISTDELIVERYINFORMATION.DELIVERYTYPE createLISTDELIVERYINFORMATIONDELIVERYTYPE() {
        return new LISTDELIVERYINFORMATION.DELIVERYTYPE();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.EXTERNALINFORMATION }
     * 
     */
    public LISTDELIVERYINFORMATION.EXTERNALINFORMATION createLISTDELIVERYINFORMATIONEXTERNALINFORMATION() {
        return new LISTDELIVERYINFORMATION.EXTERNALINFORMATION();
    }

    /**
     * Create an instance of {@link DELIVERYIDENTIFIER }
     * 
     */
    public DELIVERYIDENTIFIER createDELIVERYIDENTIFIER() {
        return new DELIVERYIDENTIFIER();
    }

    /**
     * Create an instance of {@link LISTGUARANTEEINFORMATION.DOCUMENTTYPE }
     * 
     */
    public LISTGUARANTEEINFORMATION.DOCUMENTTYPE createLISTGUARANTEEINFORMATIONDOCUMENTTYPE() {
        return new LISTGUARANTEEINFORMATION.DOCUMENTTYPE();
    }

    /**
     * Create an instance of {@link LISTCUSTOMFIELDSINFORMATION }
     * 
     */
    public LISTCUSTOMFIELDSINFORMATION createLISTCUSTOMFIELDSINFORMATION() {
        return new LISTCUSTOMFIELDSINFORMATION();
    }

    /**
     * Create an instance of {@link LISTCOMMANDS }
     * 
     */
    public LISTCOMMANDS createLISTCOMMANDS() {
        return new LISTCOMMANDS();
    }

    /**
     * Create an instance of {@link LISTREMARKS }
     * 
     */
    public LISTREMARKS createLISTREMARKS() {
        return new LISTREMARKS();
    }

    /**
     * Create an instance of {@link LISTREMARKFIELDS.LISTOFFICES }
     * 
     */
    public LISTREMARKFIELDS.LISTOFFICES createLISTREMARKFIELDSLISTOFFICES() {
        return new LISTREMARKFIELDS.LISTOFFICES();
    }

    /**
     * Create an instance of {@link BILLINGDATAREMARK }
     * 
     */
    public BILLINGDATAREMARK createBILLINGDATAREMARK() {
        return new BILLINGDATAREMARK();
    }

    /**
     * Create an instance of {@link CONTACTPOINT }
     * 
     */
    public CONTACTPOINT createCONTACTPOINT() {
        return new CONTACTPOINT();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.MEALREQUESTED }
     * 
     */
    public LISTADDITIONALINFORMATION.MEALREQUESTED createLISTADDITIONALINFORMATIONMEALREQUESTED() {
        return new LISTADDITIONALINFORMATION.MEALREQUESTED();
    }

    /**
     * Create an instance of {@link LUGGAGEType }
     * 
     */
    public LUGGAGEType createLUGGAGEType() {
        return new LUGGAGEType();
    }

    /**
     * Create an instance of {@link SPONSORINFORMATION }
     * 
     */
    public SPONSORINFORMATION createSPONSORINFORMATION() {
        return new SPONSORINFORMATION();
    }

    /**
     * Create an instance of {@link LISTFHFA.AIRLINE }
     * 
     */
    public LISTFHFA.AIRLINE createLISTFHFAAIRLINE() {
        return new LISTFHFA.AIRLINE();
    }

    /**
     * Create an instance of {@link IDENTITYDOCUMENTTYPE }
     * 
     */
    public IDENTITYDOCUMENTTYPE createIDENTITYDOCUMENTTYPE() {
        return new IDENTITYDOCUMENTTYPE();
    }

    /**
     * Create an instance of {@link STRINGTYPEPFIELD }
     * 
     */
    public STRINGTYPEPFIELD createSTRINGTYPEPFIELD() {
        return new STRINGTYPEPFIELD();
    }

    /**
     * Create an instance of {@link LISTAPIS }
     * 
     */
    public LISTAPIS createLISTAPIS() {
        return new LISTAPIS();
    }

    /**
     * Create an instance of {@link LISTOFFICEAGENCYINFORMATION.LISTCONTACT }
     * 
     */
    public LISTOFFICEAGENCYINFORMATION.LISTCONTACT createLISTOFFICEAGENCYINFORMATIONLISTCONTACT() {
        return new LISTOFFICEAGENCYINFORMATION.LISTCONTACT();
    }

    /**
     * Create an instance of {@link LISTFARE.LISTDISCOUNT }
     * 
     */
    public LISTFARE.LISTDISCOUNT createLISTFARELISTDISCOUNT() {
        return new LISTFARE.LISTDISCOUNT();
    }

    /**
     * Create an instance of {@link LISTFARE.LISTFORMATTEDTOURCODE }
     * 
     */
    public LISTFARE.LISTFORMATTEDTOURCODE createLISTFARELISTFORMATTEDTOURCODE() {
        return new LISTFARE.LISTFORMATTEDTOURCODE();
    }

    /**
     * Create an instance of {@link LISTFARE.LISTSTAFFTOURCODE }
     * 
     */
    public LISTFARE.LISTSTAFFTOURCODE createLISTFARELISTSTAFFTOURCODE() {
        return new LISTFARE.LISTSTAFFTOURCODE();
    }

    /**
     * Create an instance of {@link LISTFARE.LISTFREEFLOWTOURCODE }
     * 
     */
    public LISTFARE.LISTFREEFLOWTOURCODE createLISTFARELISTFREEFLOWTOURCODE() {
        return new LISTFARE.LISTFREEFLOWTOURCODE();
    }

    /**
     * Create an instance of {@link LISTFARE.SHADOWDESTINATION }
     * 
     */
    public LISTFARE.SHADOWDESTINATION createLISTFARESHADOWDESTINATION() {
        return new LISTFARE.SHADOWDESTINATION();
    }

    /**
     * Create an instance of {@link LISTFARE.SERVICEFEEMODEL }
     * 
     */
    public LISTFARE.SERVICEFEEMODEL createLISTFARESERVICEFEEMODEL() {
        return new LISTFARE.SERVICEFEEMODEL();
    }

    /**
     * Create an instance of {@link LISTFARE.LISTCOMMISSION }
     * 
     */
    public LISTFARE.LISTCOMMISSION createLISTFARELISTCOMMISSION() {
        return new LISTFARE.LISTCOMMISSION();
    }

    /**
     * Create an instance of {@link LISTFARE.LISTPRICEOVERRIDE }
     * 
     */
    public LISTFARE.LISTPRICEOVERRIDE createLISTFARELISTPRICEOVERRIDE() {
        return new LISTFARE.LISTPRICEOVERRIDE();
    }

    /**
     * Create an instance of {@link LISTFARE.LISTENDORSEMENT }
     * 
     */
    public LISTFARE.LISTENDORSEMENT createLISTFARELISTENDORSEMENT() {
        return new LISTFARE.LISTENDORSEMENT();
    }

    /**
     * Create an instance of {@link APIS }
     * 
     */
    public APIS createAPIS() {
        return new APIS();
    }

    /**
     * Create an instance of {@link APISENTRYType }
     * 
     */
    public APISENTRYType createAPISENTRYType() {
        return new APISENTRYType();
    }

    /**
     * Create an instance of {@link LISTWEBFARESADDITIONALINFORMATION.LISTSELECTEDCONTACT }
     * 
     */
    public LISTWEBFARESADDITIONALINFORMATION.LISTSELECTEDCONTACT createLISTWEBFARESADDITIONALINFORMATIONLISTSELECTEDCONTACT() {
        return new LISTWEBFARESADDITIONALINFORMATION.LISTSELECTEDCONTACT();
    }

    /**
     * Create an instance of {@link LISTSTATUS }
     * 
     */
    public LISTSTATUS createLISTSTATUS() {
        return new LISTSTATUS();
    }

    /**
     * Create an instance of {@link CODENAMEPAIRTYPE }
     * 
     */
    public CODENAMEPAIRTYPE createCODENAMEPAIRTYPE() {
        return new CODENAMEPAIRTYPE();
    }

    /**
     * Create an instance of {@link DATETYPEPROFILE }
     * 
     */
    public DATETYPEPROFILE createDATETYPEPROFILE() {
        return new DATETYPEPROFILE();
    }

    /**
     * Create an instance of {@link PASSENGERNAMESTYPE }
     * 
     */
    public PASSENGERNAMESTYPE createPASSENGERNAMESTYPE() {
        return new PASSENGERNAMESTYPE();
    }

    /**
     * Create an instance of {@link BOOLEANTYPEPFIELD }
     * 
     */
    public BOOLEANTYPEPFIELD createBOOLEANTYPEPFIELD() {
        return new BOOLEANTYPEPFIELD();
    }

    /**
     * Create an instance of {@link STRINGTYPEAPISPFIELD }
     * 
     */
    public STRINGTYPEAPISPFIELD createSTRINGTYPEAPISPFIELD() {
        return new STRINGTYPEAPISPFIELD();
    }

    /**
     * Create an instance of {@link STRINGTYPENATIONALITYPFIELD }
     * 
     */
    public STRINGTYPENATIONALITYPFIELD createSTRINGTYPENATIONALITYPFIELD() {
        return new STRINGTYPENATIONALITYPFIELD();
    }

    /**
     * Create an instance of {@link STRINGTYPENATIONALITYAPISPFIELD }
     * 
     */
    public STRINGTYPENATIONALITYAPISPFIELD createSTRINGTYPENATIONALITYAPISPFIELD() {
        return new STRINGTYPENATIONALITYAPISPFIELD();
    }

    /**
     * Create an instance of {@link ADDRESSTYPEAPISPFIELD }
     * 
     */
    public ADDRESSTYPEAPISPFIELD createADDRESSTYPEAPISPFIELD() {
        return new ADDRESSTYPEAPISPFIELD();
    }

    /**
     * Create an instance of {@link ADDRESSTYPEPFIELD }
     * 
     */
    public ADDRESSTYPEPFIELD createADDRESSTYPEPFIELD() {
        return new ADDRESSTYPEPFIELD();
    }

    /**
     * Create an instance of {@link STRINGTYPEPFIELDWITHALLOWEDVALUES }
     * 
     */
    public STRINGTYPEPFIELDWITHALLOWEDVALUES createSTRINGTYPEPFIELDWITHALLOWEDVALUES() {
        return new STRINGTYPEPFIELDWITHALLOWEDVALUES();
    }

    /**
     * Create an instance of {@link UNPROTECTEDSTRINGTYPEPFIELD }
     * 
     */
    public UNPROTECTEDSTRINGTYPEPFIELD createUNPROTECTEDSTRINGTYPEPFIELD() {
        return new UNPROTECTEDSTRINGTYPEPFIELD();
    }

    /**
     * Create an instance of {@link DATETYPEPFIELD }
     * 
     */
    public DATETYPEPFIELD createDATETYPEPFIELD() {
        return new DATETYPEPFIELD();
    }

    /**
     * Create an instance of {@link DATETYPEAPISPFIELD }
     * 
     */
    public DATETYPEAPISPFIELD createDATETYPEAPISPFIELD() {
        return new DATETYPEAPISPFIELD();
    }

    /**
     * Create an instance of {@link APISTARGETType }
     * 
     */
    public APISTARGETType createAPISTARGETType() {
        return new APISTARGETType();
    }

    /**
     * Create an instance of {@link LISTREDEMPTIONACCOUNTType.AWARDCODE }
     * 
     */
    public LISTREDEMPTIONACCOUNTType.AWARDCODE createLISTREDEMPTIONACCOUNTTypeAWARDCODE() {
        return new LISTREDEMPTIONACCOUNTType.AWARDCODE();
    }

    /**
     * Create an instance of {@link LISTFREQUENTFLYERTYPE.ALLIANCETIERLEVEL }
     * 
     */
    public LISTFREQUENTFLYERTYPE.ALLIANCETIERLEVEL createLISTFREQUENTFLYERTYPEALLIANCETIERLEVEL() {
        return new LISTFREQUENTFLYERTYPE.ALLIANCETIERLEVEL();
    }

    /**
     * Create an instance of {@link FREQUENTFLYERREFERENCETYPE.PRODUCT }
     * 
     */
    public FREQUENTFLYERREFERENCETYPE.PRODUCT createFREQUENTFLYERREFERENCETYPEPRODUCT() {
        return new FREQUENTFLYERREFERENCETYPE.PRODUCT();
    }

    /**
     * Create an instance of {@link IDENTITYTYPE.TITLE }
     * 
     */
    public IDENTITYTYPE.TITLE createIDENTITYTYPETITLE() {
        return new IDENTITYTYPE.TITLE();
    }

    /**
     * Create an instance of {@link DISCOUNTCARDCOMPLEXTYPE.COMPANYINFORMATION }
     * 
     */
    public DISCOUNTCARDCOMPLEXTYPE.COMPANYINFORMATION createDISCOUNTCARDCOMPLEXTYPECOMPANYINFORMATION() {
        return new DISCOUNTCARDCOMPLEXTYPE.COMPANYINFORMATION();
    }

    /**
     * Create an instance of {@link DIMENSIONTYPEPROFILE.UNITOFMEASURE }
     * 
     */
    public DIMENSIONTYPEPROFILE.UNITOFMEASURE createDIMENSIONTYPEPROFILEUNITOFMEASURE() {
        return new DIMENSIONTYPEPROFILE.UNITOFMEASURE();
    }

    /**
     * Create an instance of {@link WEIGHTTYPEPROFILE.UNITOFMEASURE }
     * 
     */
    public WEIGHTTYPEPROFILE.UNITOFMEASURE createWEIGHTTYPEPROFILEUNITOFMEASURE() {
        return new WEIGHTTYPEPROFILE.UNITOFMEASURE();
    }

    /**
     * Create an instance of {@link PropertyType.LISTPARAMETER }
     * 
     */
    public PropertyType.LISTPARAMETER createPropertyTypeLISTPARAMETER() {
        return new PropertyType.LISTPARAMETER();
    }

    /**
     * Create an instance of {@link LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT.DOCUMENTTYPE }
     * 
     */
    public LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT.DOCUMENTTYPE createLISTINSURANCEINFORMATIONIDENTIFICATIONDOCUMENTDOCUMENTTYPE() {
        return new LISTINSURANCEINFORMATION.IDENTIFICATIONDOCUMENT.DOCUMENTTYPE();
    }

    /**
     * Create an instance of {@link SERVICEType.AIRLINE }
     * 
     */
    public SERVICEType.AIRLINE createSERVICETypeAIRLINE() {
        return new SERVICEType.AIRLINE();
    }

    /**
     * Create an instance of {@link SERVICEType.HOLDERELEMENT }
     * 
     */
    public SERVICEType.HOLDERELEMENT createSERVICETypeHOLDERELEMENT() {
        return new SERVICEType.HOLDERELEMENT();
    }

    /**
     * Create an instance of {@link SERVICEType.ORIGINCITY }
     * 
     */
    public SERVICEType.ORIGINCITY createSERVICETypeORIGINCITY() {
        return new SERVICEType.ORIGINCITY();
    }

    /**
     * Create an instance of {@link SERVICEType.DESTINATIONCITY }
     * 
     */
    public SERVICEType.DESTINATIONCITY createSERVICETypeDESTINATIONCITY() {
        return new SERVICEType.DESTINATIONCITY();
    }

    /**
     * Create an instance of {@link SERVICEType.PROPERTIES.LISTPROPERTY.LISTPARAMETER }
     * 
     */
    public SERVICEType.PROPERTIES.LISTPROPERTY.LISTPARAMETER createSERVICETypePROPERTIESLISTPROPERTYLISTPARAMETER() {
        return new SERVICEType.PROPERTIES.LISTPROPERTY.LISTPARAMETER();
    }

    /**
     * Create an instance of {@link SPORTEQUIPMENTType.LUGGAGETYPE }
     * 
     */
    public SPORTEQUIPMENTType.LUGGAGETYPE createSPORTEQUIPMENTTypeLUGGAGETYPE() {
        return new SPORTEQUIPMENTType.LUGGAGETYPE();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.LISTANIMAL.ANIMALTYPE }
     * 
     */
    public LISTADDITIONALINFORMATION.LISTANIMAL.ANIMALTYPE createLISTADDITIONALINFORMATIONLISTANIMALANIMALTYPE() {
        return new LISTADDITIONALINFORMATION.LISTANIMAL.ANIMALTYPE();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON }
     * 
     */
    public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON createLISTADDITIONALINFORMATIONTOBEASSISTEDPERSONTYPEOFASSISTEDPERSON() {
        return new LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRTYPE }
     * 
     */
    public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRTYPE createLISTADDITIONALINFORMATIONTOBEASSISTEDPERSONWHEELCHAIRTYPE() {
        return new LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRTYPE();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY }
     * 
     */
    public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY createLISTADDITIONALINFORMATIONTOBEASSISTEDPERSONWHEELCHAIRCATEGORY() {
        return new LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DEAFINFORMATION }
     * 
     */
    public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DEAFINFORMATION createLISTADDITIONALINFORMATIONTOBEASSISTEDPERSONDEAFINFORMATION() {
        return new LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DEAFINFORMATION();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.BLINDINFORMATION }
     * 
     */
    public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.BLINDINFORMATION createLISTADDITIONALINFORMATIONTOBEASSISTEDPERSONBLINDINFORMATION() {
        return new LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.BLINDINFORMATION();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DISABLEDPASSENGER }
     * 
     */
    public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DISABLEDPASSENGER createLISTADDITIONALINFORMATIONTOBEASSISTEDPERSONDISABLEDPASSENGER() {
        return new LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.DISABLEDPASSENGER();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.STRETCHERINFORMATION }
     * 
     */
    public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.STRETCHERINFORMATION createLISTADDITIONALINFORMATIONTOBEASSISTEDPERSONSTRETCHERINFORMATION() {
        return new LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.STRETCHERINFORMATION();
    }

    /**
     * Create an instance of {@link LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE }
     * 
     */
    public LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE createLISTADDITIONALINFORMATIONTOBEASSISTEDPERSONWHEELCHAIRINFORMATIONBATTERYTYPE() {
        return new LISTADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE();
    }

    /**
     * Create an instance of {@link LISTASSOCIATEDDOCUMENT.DOCUMENTVENDOR }
     * 
     */
    public LISTASSOCIATEDDOCUMENT.DOCUMENTVENDOR createLISTASSOCIATEDDOCUMENTDOCUMENTVENDOR() {
        return new LISTASSOCIATEDDOCUMENT.DOCUMENTVENDOR();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE }
     * 
     */
    public LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE createLISTDELIVERYINFORMATIONLISTSPECIALPROGRAMDELIVERYTYPE() {
        return new LISTDELIVERYINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE();
    }

    /**
     * Create an instance of {@link FOIDINFORMATIONTYPE.DOCUMENTTYPE }
     * 
     */
    public FOIDINFORMATIONTYPE.DOCUMENTTYPE createFOIDINFORMATIONTYPEDOCUMENTTYPE() {
        return new FOIDINFORMATIONTYPE.DOCUMENTTYPE();
    }

    /**
     * Create an instance of {@link FOIDINFORMATIONTYPE.DOCUMENTVENDOR }
     * 
     */
    public FOIDINFORMATIONTYPE.DOCUMENTVENDOR createFOIDINFORMATIONTYPEDOCUMENTVENDOR() {
        return new FOIDINFORMATIONTYPE.DOCUMENTVENDOR();
    }

    /**
     * Create an instance of {@link FOIDINFORMATIONTYPE.MEMO.MEMOTYPE }
     * 
     */
    public FOIDINFORMATIONTYPE.MEMO.MEMOTYPE createFOIDINFORMATIONTYPEMEMOMEMOTYPE() {
        return new FOIDINFORMATIONTYPE.MEMO.MEMOTYPE();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.MAILREFERENCE.SERVICE }
     * 
     */
    public LISTDELIVERYINFORMATION.MAILREFERENCE.SERVICE createLISTDELIVERYINFORMATIONMAILREFERENCESERVICE() {
        return new LISTDELIVERYINFORMATION.MAILREFERENCE.SERVICE();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.NORMALQUEUE }
     * 
     */
    public LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.NORMALQUEUE createLISTDELIVERYINFORMATIONMAILREFERENCEQUEUINGOFFICENORMALQUEUE() {
        return new LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.NORMALQUEUE();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.FAILUREQUEUE }
     * 
     */
    public LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.FAILUREQUEUE createLISTDELIVERYINFORMATIONMAILREFERENCEQUEUINGOFFICEFAILUREQUEUE() {
        return new LISTDELIVERYINFORMATION.MAILREFERENCE.QUEUINGOFFICE.FAILUREQUEUE();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE.PICKUPTYPE }
     * 
     */
    public LISTDELIVERYINFORMATION.PICKUPREFERENCE.PICKUPTYPE createLISTDELIVERYINFORMATIONPICKUPREFERENCEPICKUPTYPE() {
        return new LISTDELIVERYINFORMATION.PICKUPREFERENCE.PICKUPTYPE();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.NORMALQUEUE }
     * 
     */
    public LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.NORMALQUEUE createLISTDELIVERYINFORMATIONPICKUPREFERENCEQUEUINGOFFICENORMALQUEUE() {
        return new LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.NORMALQUEUE();
    }

    /**
     * Create an instance of {@link LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.FAILUREQUEUE }
     * 
     */
    public LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.FAILUREQUEUE createLISTDELIVERYINFORMATIONPICKUPREFERENCEQUEUINGOFFICEFAILUREQUEUE() {
        return new LISTDELIVERYINFORMATION.PICKUPREFERENCE.QUEUINGOFFICE.FAILUREQUEUE();
    }

    /**
     * Create an instance of {@link BANKACCOUNTINFORMATIONTYPE.BANK }
     * 
     */
    public BANKACCOUNTINFORMATIONTYPE.BANK createBANKACCOUNTINFORMATIONTYPEBANK() {
        return new BANKACCOUNTINFORMATIONTYPE.BANK();
    }

    /**
     * Create an instance of {@link LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT.PAYMENTTYPE }
     * 
     */
    public LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT.PAYMENTTYPE createLISTBOOKINGPAYMENTINFORMATIONLISTBOOKINGLISTFORMOFPAYMENTPAYMENTTYPE() {
        return new LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT.PAYMENTTYPE();
    }

    /**
     * Create an instance of {@link LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE }
     * 
     */
    public LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE createLISTPAYMENTINFORMATIONLISTSPECIALPROGRAMDELIVERYTYPE() {
        return new LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE();
    }

    /**
     * Create an instance of {@link LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE.COMPANY }
     * 
     */
    public LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE.COMPANY createLISTPAYMENTINFORMATIONLISTTICKETLESSTRAVELREFERENCECOMPANY() {
        return new LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE.COMPANY();
    }

    /**
     * Create an instance of {@link GOVERNMENTPAYMENTINFORMATIONTYPE.REFERENCELETTER }
     * 
     */
    public GOVERNMENTPAYMENTINFORMATIONTYPE.REFERENCELETTER createGOVERNMENTPAYMENTINFORMATIONTYPEREFERENCELETTER() {
        return new GOVERNMENTPAYMENTINFORMATIONTYPE.REFERENCELETTER();
    }

    /**
     * Create an instance of {@link CREDITCARDINFORMATIONTYPE.COMPANY }
     * 
     */
    public CREDITCARDINFORMATIONTYPE.COMPANY createCREDITCARDINFORMATIONTYPECOMPANY() {
        return new CREDITCARDINFORMATIONTYPE.COMPANY();
    }

    /**
     * Create an instance of {@link CREDITCARDINFORMATIONTYPE.USEOF }
     * 
     */
    public CREDITCARDINFORMATIONTYPE.USEOF createCREDITCARDINFORMATIONTYPEUSEOF() {
        return new CREDITCARDINFORMATIONTYPE.USEOF();
    }

    /**
     * Create an instance of {@link CREDITCARDINFORMATIONTYPE.EMVDATA }
     * 
     */
    public CREDITCARDINFORMATIONTYPE.EMVDATA createCREDITCARDINFORMATIONTYPEEMVDATA() {
        return new CREDITCARDINFORMATIONTYPE.EMVDATA();
    }

    /**
     * Create an instance of {@link ADDRESSINFORMATIONTYPE.DIRECTION }
     * 
     */
    public ADDRESSINFORMATIONTYPE.DIRECTION createADDRESSINFORMATIONTYPEDIRECTION() {
        return new ADDRESSINFORMATIONTYPE.DIRECTION();
    }

    /**
     * Create an instance of {@link ADDRESSINFORMATIONTYPE.FIRSTNAME }
     * 
     */
    public ADDRESSINFORMATIONTYPE.FIRSTNAME createADDRESSINFORMATIONTYPEFIRSTNAME() {
        return new ADDRESSINFORMATIONTYPE.FIRSTNAME();
    }

    /**
     * Create an instance of {@link ADDRESSINFORMATIONTYPE.LASTNAME }
     * 
     */
    public ADDRESSINFORMATIONTYPE.LASTNAME createADDRESSINFORMATIONTYPELASTNAME() {
        return new ADDRESSINFORMATIONTYPE.LASTNAME();
    }

    /**
     * Create an instance of {@link ADDRESSINFORMATIONTYPE.TITLE.CODE }
     * 
     */
    public ADDRESSINFORMATIONTYPE.TITLE.CODE createADDRESSINFORMATIONTYPETITLECODE() {
        return new ADDRESSINFORMATIONTYPE.TITLE.CODE();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.LEISUREPREFERENCES.LISTCHARACTERISTICS }
     * 
     */
    public LISTPREFERENCES.LEISUREPREFERENCES.LISTCHARACTERISTICS createLISTPREFERENCESLEISUREPREFERENCESLISTCHARACTERISTICS() {
        return new LISTPREFERENCES.LEISUREPREFERENCES.LISTCHARACTERISTICS();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.LEISUREPREFERENCES.LISTHOBBIES }
     * 
     */
    public LISTPREFERENCES.LEISUREPREFERENCES.LISTHOBBIES createLISTPREFERENCESLEISUREPREFERENCESLISTHOBBIES() {
        return new LISTPREFERENCES.LEISUREPREFERENCES.LISTHOBBIES();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.CLASS }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.CLASS createLISTPREFERENCESRAILPREFERENCESCLASS() {
        return new LISTPREFERENCES.RAILPREFERENCES.CLASS();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.SMOKING }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.SMOKING createLISTPREFERENCESRAILPREFERENCESSMOKING() {
        return new LISTPREFERENCES.RAILPREFERENCES.SMOKING();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.CARTYPE }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.CARTYPE createLISTPREFERENCESRAILPREFERENCESCARTYPE() {
        return new LISTPREFERENCES.RAILPREFERENCES.CARTYPE();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.LOCATION }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.LOCATION createLISTPREFERENCESRAILPREFERENCESLOCATION() {
        return new LISTPREFERENCES.RAILPREFERENCES.LOCATION();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.ICE }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.ICE createLISTPREFERENCESRAILPREFERENCESICE() {
        return new LISTPREFERENCES.RAILPREFERENCES.ICE();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.LISTACCOUNTCARD }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.LISTACCOUNTCARD createLISTPREFERENCESRAILPREFERENCESLISTACCOUNTCARD() {
        return new LISTPREFERENCES.RAILPREFERENCES.LISTACCOUNTCARD();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES.NEGOCIATEDFARE }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES.NEGOCIATEDFARE createLISTPREFERENCESRAILPREFERENCESLISTNEGOCIATEDFARESNEGOCIATEDFARE() {
        return new LISTPREFERENCES.RAILPREFERENCES.LISTNEGOCIATEDFARES.NEGOCIATEDFARE();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.STATUS }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.STATUS createLISTPREFERENCESRAILPREFERENCESACCOMMODATIONSTATUS() {
        return new LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.STATUS();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.LISTOPTIONS }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.LISTOPTIONS createLISTPREFERENCESRAILPREFERENCESACCOMMODATIONLISTOPTIONS() {
        return new LISTPREFERENCES.RAILPREFERENCES.ACCOMMODATION.LISTOPTIONS();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD.COMPANY }
     * 
     */
    public LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD.COMPANY createLISTPREFERENCESRAILPREFERENCESLISTFREQUENTRAILCARDCOMPANY() {
        return new LISTPREFERENCES.RAILPREFERENCES.LISTFREQUENTRAILCARD.COMPANY();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES.CATEGORY }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES.CATEGORY createLISTPREFERENCESHOTELPREFERENCESCATEGORY() {
        return new LISTPREFERENCES.HOTELPREFERENCES.CATEGORY();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES.CHECKIN }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES.CHECKIN createLISTPREFERENCESHOTELPREFERENCESCHECKIN() {
        return new LISTPREFERENCES.HOTELPREFERENCES.CHECKIN();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES.CHECKOUT }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES.CHECKOUT createLISTPREFERENCESHOTELPREFERENCESCHECKOUT() {
        return new LISTPREFERENCES.HOTELPREFERENCES.CHECKOUT();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES.LISTSPECIALSERVICE }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES.LISTSPECIALSERVICE createLISTPREFERENCESHOTELPREFERENCESLISTSPECIALSERVICE() {
        return new LISTPREFERENCES.HOTELPREFERENCES.LISTSPECIALSERVICE();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST.COMPANY }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST.COMPANY createLISTPREFERENCESHOTELPREFERENCESLISTFREQUENTGUESTCOMPANY() {
        return new LISTPREFERENCES.HOTELPREFERENCES.LISTFREQUENTGUEST.COMPANY();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST.COMPANY }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST.COMPANY createLISTPREFERENCESHOTELPREFERENCESLISTCORPORATEGUESTCORPORATEGUESTCOMPANY() {
        return new LISTPREFERENCES.HOTELPREFERENCES.LISTCORPORATEGUEST.CORPORATEGUEST.COMPANY();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.BEDTYPE }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.BEDTYPE createLISTPREFERENCESHOTELPREFERENCESROOMPREFERENCESBEDTYPE() {
        return new LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.BEDTYPE();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.SMOKING }
     * 
     */
    public LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.SMOKING createLISTPREFERENCESHOTELPREFERENCESROOMPREFERENCESSMOKING() {
        return new LISTPREFERENCES.HOTELPREFERENCES.ROOMPREFERENCES.SMOKING();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.CARPREFERENCES.SMOKING }
     * 
     */
    public LISTPREFERENCES.CARPREFERENCES.SMOKING createLISTPREFERENCESCARPREFERENCESSMOKING() {
        return new LISTPREFERENCES.CARPREFERENCES.SMOKING();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.CARPREFERENCES.LISTFREQUENTCARRENTER }
     * 
     */
    public LISTPREFERENCES.CARPREFERENCES.LISTFREQUENTCARRENTER createLISTPREFERENCESCARPREFERENCESLISTFREQUENTCARRENTER() {
        return new LISTPREFERENCES.CARPREFERENCES.LISTFREQUENTCARRENTER();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.CARPREFERENCES.LISTCORPORATECOMPANYINFORMATION }
     * 
     */
    public LISTPREFERENCES.CARPREFERENCES.LISTCORPORATECOMPANYINFORMATION createLISTPREFERENCESCARPREFERENCESLISTCORPORATECOMPANYINFORMATION() {
        return new LISTPREFERENCES.CARPREFERENCES.LISTCORPORATECOMPANYINFORMATION();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.CARPREFERENCES.LISTCARACCREDITIVECARDS }
     * 
     */
    public LISTPREFERENCES.CARPREFERENCES.LISTCARACCREDITIVECARDS createLISTPREFERENCESCARPREFERENCESLISTCARACCREDITIVECARDS() {
        return new LISTPREFERENCES.CARPREFERENCES.LISTCARACCREDITIVECARDS();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.HOMEAIRPORT }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.HOMEAIRPORT createLISTPREFERENCESAIRPREFERENCESHOMEAIRPORT() {
        return new LISTPREFERENCES.AIRPREFERENCES.HOMEAIRPORT();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.SMOKING }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.SMOKING createLISTPREFERENCESAIRPREFERENCESSMOKING() {
        return new LISTPREFERENCES.AIRPREFERENCES.SMOKING();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.SEATLOCATION }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.SEATLOCATION createLISTPREFERENCESAIRPREFERENCESSEATLOCATION() {
        return new LISTPREFERENCES.AIRPREFERENCES.SEATLOCATION();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTSEATCHARACTERISTIC }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTSEATCHARACTERISTIC createLISTPREFERENCESAIRPREFERENCESLISTSEATCHARACTERISTIC() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTSEATCHARACTERISTIC();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.SEATSTATUS }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.SEATSTATUS createLISTPREFERENCESAIRPREFERENCESSEATSTATUS() {
        return new LISTPREFERENCES.AIRPREFERENCES.SEATSTATUS();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.CABIN }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.CABIN createLISTPREFERENCESAIRPREFERENCESCABIN() {
        return new LISTPREFERENCES.AIRPREFERENCES.CABIN();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.MEAL }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.MEAL createLISTPREFERENCESAIRPREFERENCESMEAL() {
        return new LISTPREFERENCES.AIRPREFERENCES.MEAL();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.MEALSTATUS }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.MEALSTATUS createLISTPREFERENCESAIRPREFERENCESMEALSTATUS() {
        return new LISTPREFERENCES.AIRPREFERENCES.MEALSTATUS();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER createLISTPREFERENCESAIRPREFERENCESLISTFREQUENTFLYER() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTFREQUENTFLYER();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTTRAVELLERCLID }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTTRAVELLERCLID createLISTPREFERENCESAIRPREFERENCESLISTTRAVELLERCLID() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTTRAVELLERCLID();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTMILESACCOUNT }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTMILESACCOUNT createLISTPREFERENCESAIRPREFERENCESLISTMILESACCOUNT() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTMILESACCOUNT();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTUPGRADEACCOUNT }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTUPGRADEACCOUNT createLISTPREFERENCESAIRPREFERENCESLISTUPGRADEACCOUNT() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTUPGRADEACCOUNT();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTSERVICINGACCOUNT }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTSERVICINGACCOUNT createLISTPREFERENCESAIRPREFERENCESLISTSERVICINGACCOUNT() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTSERVICINGACCOUNT();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT.LISTSEATCHARACTERISTIC }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT.LISTSEATCHARACTERISTIC createLISTPREFERENCESAIRPREFERENCESLISTADDITIONALSEATLISTSEATCHARACTERISTIC() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTADDITIONALSEAT.LISTSEATCHARACTERISTIC();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.ACCOUNTCARDSTATUS }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.ACCOUNTCARDSTATUS createLISTPREFERENCESAIRPREFERENCESLISTACCOUNTCARDACCOUNTCARDSTATUS() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.ACCOUNTCARDSTATUS();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.LISTCORPORATENUMBER }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.LISTCORPORATENUMBER createLISTPREFERENCESAIRPREFERENCESLISTACCOUNTCARDLISTCORPORATENUMBER() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTACCOUNTCARD.LISTCORPORATENUMBER();
    }

    /**
     * Create an instance of {@link LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD.COMPANYINFORMATION }
     * 
     */
    public LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD.COMPANYINFORMATION createLISTPREFERENCESAIRPREFERENCESLISTDISCOUNTCARDCOMPANYINFORMATION() {
        return new LISTPREFERENCES.AIRPREFERENCES.LISTDISCOUNTCARD.COMPANYINFORMATION();
    }

    /**
     * Create an instance of {@link TRAVELAGENCYINFORMATION.QUEUINGOFFICE.NORMALQUEUE }
     * 
     */
    public TRAVELAGENCYINFORMATION.QUEUINGOFFICE.NORMALQUEUE createTRAVELAGENCYINFORMATIONQUEUINGOFFICENORMALQUEUE() {
        return new TRAVELAGENCYINFORMATION.QUEUINGOFFICE.NORMALQUEUE();
    }

    /**
     * Create an instance of {@link TRAVELAGENCYINFORMATION.QUEUINGOFFICE.FAILUREQUEUE }
     * 
     */
    public TRAVELAGENCYINFORMATION.QUEUINGOFFICE.FAILUREQUEUE createTRAVELAGENCYINFORMATIONQUEUINGOFFICEFAILUREQUEUE() {
        return new TRAVELAGENCYINFORMATION.QUEUINGOFFICE.FAILUREQUEUE();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.ANIMAL.ANIMALTYPE }
     * 
     */
    public ADDITIONALINFORMATION.ANIMAL.ANIMALTYPE createADDITIONALINFORMATIONANIMALANIMALTYPE() {
        return new ADDITIONALINFORMATION.ANIMAL.ANIMALTYPE();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON }
     * 
     */
    public ADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON createADDITIONALINFORMATIONTOBEASSISTEDPERSONTYPEOFASSISTEDPERSON() {
        return new ADDITIONALINFORMATION.TOBEASSISTEDPERSON.TYPEOFASSISTEDPERSON();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY }
     * 
     */
    public ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY createADDITIONALINFORMATIONTOBEASSISTEDPERSONWHEELCHAIRCATEGORY() {
        return new ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRCATEGORY();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE }
     * 
     */
    public ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE createADDITIONALINFORMATIONTOBEASSISTEDPERSONWHEELCHAIRINFORMATIONBATTERYTYPE() {
        return new ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.BATTERYTYPE();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRDIMENSIONS }
     * 
     */
    public ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRDIMENSIONS createADDITIONALINFORMATIONTOBEASSISTEDPERSONWHEELCHAIRINFORMATIONWHEELCHAIRDIMENSIONS() {
        return new ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRDIMENSIONS();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRTYPE }
     * 
     */
    public ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRTYPE createADDITIONALINFORMATIONTOBEASSISTEDPERSONWHEELCHAIRINFORMATIONWHEELCHAIRTYPE() {
        return new ADDITIONALINFORMATION.TOBEASSISTEDPERSON.WHEELCHAIRINFORMATION.WHEELCHAIRTYPE();
    }

    /**
     * Create an instance of {@link ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE.LUGGAGETYPE }
     * 
     */
    public ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE.LUGGAGETYPE createADDITIONALINFORMATIONLISTADDITIONALLUGGAGELUGGAGETYPE() {
        return new ADDITIONALINFORMATION.LISTADDITIONALLUGGAGE.LUGGAGETYPE();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION.TRAVELAPPROVERPERMISSION }
     * 
     */
    public CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION.TRAVELAPPROVERPERMISSION createCORPORATEINFORMATIONTRAVELAPPROVERINFORMATIONTRAVELAPPROVERPERMISSION() {
        return new CORPORATEINFORMATION.TRAVELAPPROVERINFORMATION.TRAVELAPPROVERPERMISSION();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.TRAVELARRANGEPERMISSION }
     * 
     */
    public CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.TRAVELARRANGEPERMISSION createCORPORATEINFORMATIONTRAVELARRANGERINFORMATIONTRAVELARRANGEPERMISSION() {
        return new CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.TRAVELARRANGEPERMISSION();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER.NOMINATEDTRAVELARRANGER }
     * 
     */
    public CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER.NOMINATEDTRAVELARRANGER createCORPORATEINFORMATIONTRAVELARRANGERINFORMATIONLISTNOMINATEDTRAVELARRANGERNOMINATEDTRAVELARRANGER() {
        return new CORPORATEINFORMATION.TRAVELARRANGERINFORMATION.LISTNOMINATEDTRAVELARRANGER.NOMINATEDTRAVELARRANGER();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.JOB }
     * 
     */
    public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.JOB createCORPORATEINFORMATIONADMINISTRATIVEINFORMATIONJOB() {
        return new CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.JOB();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTCOSTCENTER }
     * 
     */
    public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTCOSTCENTER createCORPORATEINFORMATIONADMINISTRATIVEINFORMATIONLISTCOSTCENTER() {
        return new CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTCOSTCENTER();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTRMDATA }
     * 
     */
    public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTRMDATA createCORPORATEINFORMATIONADMINISTRATIVEINFORMATIONLISTRMDATA() {
        return new CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTRMDATA();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTFCE }
     * 
     */
    public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTFCE createCORPORATEINFORMATIONADMINISTRATIVEINFORMATIONLISTFCE() {
        return new CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.LISTFCE();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.NORMALQUEUE }
     * 
     */
    public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.NORMALQUEUE createCORPORATEINFORMATIONADMINISTRATIVEINFORMATIONGROUPQUEUINGOFFICENORMALQUEUE() {
        return new CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.NORMALQUEUE();
    }

    /**
     * Create an instance of {@link CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.FAILUREQUEUE }
     * 
     */
    public CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.FAILUREQUEUE createCORPORATEINFORMATIONADMINISTRATIVEINFORMATIONGROUPQUEUINGOFFICEFAILUREQUEUE() {
        return new CORPORATEINFORMATION.ADMINISTRATIVEINFORMATION.GROUPQUEUINGOFFICE.FAILUREQUEUE();
    }

    /**
     * Create an instance of {@link PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION.LISTPARAMETER }
     * 
     */
    public PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION.LISTPARAMETER createPROFILEINFORMATIONLISTADDITIONALPROFILEINFORMATIONLISTPARAMETER() {
        return new PROFILEINFORMATION.LISTADDITIONALPROFILEINFORMATION.LISTPARAMETER();
    }

    /**
     * Create an instance of {@link NOTIFICATIONINFORMATIONTYPE.LISTPERMISSIONS }
     * 
     */
    public NOTIFICATIONINFORMATIONTYPE.LISTPERMISSIONS createNOTIFICATIONINFORMATIONTYPELISTPERMISSIONS() {
        return new NOTIFICATIONINFORMATIONTYPE.LISTPERMISSIONS();
    }

    /**
     * Create an instance of {@link IDENTITYINFORMATIONTYPE.AGE }
     * 
     */
    public IDENTITYINFORMATIONTYPE.AGE createIDENTITYINFORMATIONTYPEAGE() {
        return new IDENTITYINFORMATIONTYPE.AGE();
    }

    /**
     * Create an instance of {@link IDENTITYINFORMATIONTYPE.PASSPORTINFORMATION }
     * 
     */
    public IDENTITYINFORMATIONTYPE.PASSPORTINFORMATION createIDENTITYINFORMATIONTYPEPASSPORTINFORMATION() {
        return new IDENTITYINFORMATIONTYPE.PASSPORTINFORMATION();
    }

    /**
     * Create an instance of {@link IDENTITYINFORMATIONTYPE.TITLE }
     * 
     */
    public IDENTITYINFORMATIONTYPE.TITLE createIDENTITYINFORMATIONTYPETITLE() {
        return new IDENTITYINFORMATIONTYPE.TITLE();
    }

    /**
     * Create an instance of {@link IDENTITYINFORMATIONTYPE.RELATION }
     * 
     */
    public IDENTITYINFORMATIONTYPE.RELATION createIDENTITYINFORMATIONTYPERELATION() {
        return new IDENTITYINFORMATIONTYPE.RELATION();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IDENTITYINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IDENTITY_INFORMATION")
    public JAXBElement<IDENTITYINFORMATIONTYPE> createIDENTITYINFORMATION(IDENTITYINFORMATIONTYPE value) {
        return new JAXBElement<IDENTITYINFORMATIONTYPE>(_IDENTITYINFORMATION_QNAME, IDENTITYINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NOTIFICATIONINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_NOTIFICATION_INFORMATION")
    public JAXBElement<NOTIFICATIONINFORMATIONTYPE> createLISTNOTIFICATIONINFORMATION(NOTIFICATIONINFORMATIONTYPE value) {
        return new JAXBElement<NOTIFICATIONINFORMATIONTYPE>(_LISTNOTIFICATIONINFORMATION_QNAME, NOTIFICATIONINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CONTACTPOINTTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_CONTACT_POINT")
    public JAXBElement<CONTACTPOINTTYPE> createLISTCONTACTPOINT(CONTACTPOINTTYPE value) {
        return new JAXBElement<CONTACTPOINTTYPE>(_LISTCONTACTPOINT_QNAME, CONTACTPOINTTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ADDRESSINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_ADDRESS_INFORMATION")
    public JAXBElement<ADDRESSINFORMATIONTYPE> createLISTADDRESSINFORMATION(ADDRESSINFORMATIONTYPE value) {
        return new JAXBElement<ADDRESSINFORMATIONTYPE>(_LISTADDRESSINFORMATION_QNAME, ADDRESSINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CREDITCARDINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_CREDIT_CARD_INFORMATION")
    public JAXBElement<CREDITCARDINFORMATIONTYPE> createLISTCREDITCARDINFORMATION(CREDITCARDINFORMATIONTYPE value) {
        return new JAXBElement<CREDITCARDINFORMATIONTYPE>(_LISTCREDITCARDINFORMATION_QNAME, CREDITCARDINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GOVERNMENTPAYMENTINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_GOVERNMENT_PAYMENT_INFORMATION")
    public JAXBElement<GOVERNMENTPAYMENTINFORMATIONTYPE> createLISTGOVERNMENTPAYMENTINFORMATION(GOVERNMENTPAYMENTINFORMATIONTYPE value) {
        return new JAXBElement<GOVERNMENTPAYMENTINFORMATIONTYPE>(_LISTGOVERNMENTPAYMENTINFORMATION_QNAME, GOVERNMENTPAYMENTINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BANKACCOUNTINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_BANK_ACCOUNT_INFORMATION")
    public JAXBElement<BANKACCOUNTINFORMATIONTYPE> createLISTBANKACCOUNTINFORMATION(BANKACCOUNTINFORMATIONTYPE value) {
        return new JAXBElement<BANKACCOUNTINFORMATIONTYPE>(_LISTBANKACCOUNTINFORMATION_QNAME, BANKACCOUNTINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBANKVOUCHERINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_EBANK_VOUCHER_INFORMATION")
    public JAXBElement<EBANKVOUCHERINFORMATIONTYPE> createLISTEBANKVOUCHERINFORMATION(EBANKVOUCHERINFORMATIONTYPE value) {
        return new JAXBElement<EBANKVOUCHERINFORMATIONTYPE>(_LISTEBANKVOUCHERINFORMATION_QNAME, EBANKVOUCHERINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CHECKINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_CHECK_INFORMATION")
    public JAXBElement<CHECKINFORMATIONTYPE> createLISTCHECKINFORMATION(CHECKINFORMATIONTYPE value) {
        return new JAXBElement<CHECKINFORMATIONTYPE>(_LISTCHECKINFORMATION_QNAME, CHECKINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VOUCHERACCOUNTINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_VOUCHER_ACCOUNT_INFORMATION")
    public JAXBElement<VOUCHERACCOUNTINFORMATIONTYPE> createLISTVOUCHERACCOUNTINFORMATION(VOUCHERACCOUNTINFORMATIONTYPE value) {
        return new JAXBElement<VOUCHERACCOUNTINFORMATIONTYPE>(_LISTVOUCHERACCOUNTINFORMATION_QNAME, VOUCHERACCOUNTINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_USER_LOGGED_IN")
    public JAXBElement<Boolean> createISUSERLOGGEDIN(Boolean value) {
        return new JAXBElement<Boolean>(_ISUSERLOGGEDIN_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDENTITYINFORMATIONTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INFANT")
    public JAXBElement<IDENTITYINFORMATIONTYPE> createINFANT(IDENTITYINFORMATIONTYPE value) {
        return new JAXBElement<IDENTITYINFORMATIONTYPE>(_INFANT_QNAME, IDENTITYINFORMATIONTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CONTACTPOINTTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_CONTACT_POINT_PASSENGER")
    public JAXBElement<CONTACTPOINTTYPE> createLISTCONTACTPOINTPASSENGER(CONTACTPOINTTYPE value) {
        return new JAXBElement<CONTACTPOINTTYPE>(_LISTCONTACTPOINTPASSENGER_QNAME, CONTACTPOINTTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDENTITYDOCUMENTTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_IDENTITY_DOCUMENT")
    public JAXBElement<IDENTITYDOCUMENTTYPE> createLISTIDENTITYDOCUMENT(IDENTITYDOCUMENTTYPE value) {
        return new JAXBElement<IDENTITYDOCUMENTTYPE>(_LISTIDENTITYDOCUMENT_QNAME, IDENTITYDOCUMENTTYPE.class, null, value);
    }

}
