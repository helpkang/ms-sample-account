
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.common.common.GDSCABINCODEType;
import com.koreanair.eretail.pojo.common.common.LISTTRIPREASONtype;
import com.koreanair.eretail.pojo.common.common.OperationalDataType;
import com.koreanair.eretail.pojo.farecommon.farediscount.ListDiscountCredentialsType;
import com.koreanair.eretail.pojo.farecommon.farediscount.ListResidentDiscountType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.eretail.pojo.farecommon.farecommon package. 
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
    private final static QName _HASINFANT_QNAME = new QName("", "HAS_INFANT");
    private final static QName _TITLE_QNAME = new QName("", "TITLE");
    private final static QName _FIRSTNAME_QNAME = new QName("", "FIRST_NAME");
    private final static QName _LASTNAME_QNAME = new QName("", "LAST_NAME");
    private final static QName _TRAVELLERID_QNAME = new QName("", "TRAVELLER_ID");
    private final static QName _REFERENCE_QNAME = new QName("", "REFERENCE");
    private final static QName _DATEOFBIRTH_QNAME = new QName("", "DATE_OF_BIRTH");
    private final static QName _TRAVELLEREXTERNALID_QNAME = new QName("", "TRAVELLER_EXTERNAL_ID");
    private final static QName _ISCUMULATIVEDISCOUNT_QNAME = new QName("", "IS_CUMULATIVE_DISCOUNT");
    private final static QName _LISTRESIDENTDISCOUNT_QNAME = new QName("", "LIST_RESIDENT_DISCOUNT");
    private final static QName _LISTDISCOUNTCREDENTIALS_QNAME = new QName("", "LIST_DISCOUNT_CREDENTIALS");
    private final static QName _CEMID_QNAME = new QName("", "CEM_ID");
    private final static QName _CEMAIRLINECODE_QNAME = new QName("", "CEM_AIRLINE_CODE");
    private final static QName _COMMANDEXECUTIONSTATUS_QNAME = new QName("", "COMMAND_EXECUTION_STATUS");
    private final static QName _FARINGCOMMANDID_QNAME = new QName("", "FARING_COMMAND_ID");
    private final static QName _TYPEOFFARE_QNAME = new QName("", "TYPE_OF_FARE");
    private final static QName _PRICINGWITHPUBLISHEDMILES_QNAME = new QName("", "PRICING_WITH_PUBLISHED_MILES");
    private final static QName _MILESPUBLISHINGAIRLINE_QNAME = new QName("", "MILES_PUBLISHING_AIRLINE");
    private final static QName _ISUPGRADE_QNAME = new QName("", "IS_UPGRADE");
    private final static QName _POINTOFSALE_QNAME = new QName("", "POINT_OF_SALE");
    private final static QName _POINTOFTICKETING_QNAME = new QName("", "POINT_OF_TICKETING");
    private final static QName _TYPEOFCORPORATEFARE_QNAME = new QName("", "TYPE_OF_CORPORATE_FARE");
    private final static QName _CUSTOMERIDENTIFIER_QNAME = new QName("", "CUSTOMER_IDENTIFIER");
    private final static QName _PRICINGOPTIONSID_QNAME = new QName("", "PRICING_OPTIONS_ID");
    private final static QName _NVA_QNAME = new QName("", "NVA");
    private final static QName _NVB_QNAME = new QName("", "NVB");
    private final static QName _ALLINCLUSIVE_QNAME = new QName("", "ALL_INCLUSIVE");
    private final static QName _LISTFEE_QNAME = new QName("", "LIST_FEE");
    private final static QName _LISTAPPLICABLEMARKUPDISCOUNT_QNAME = new QName("", "LIST_APPLICABLE_MARKUP_DISCOUNT");
    private final static QName _LISTAPPLICABLEFEE_QNAME = new QName("", "LIST_APPLICABLE_FEE");
    private final static QName _ESTIMATEDDISCOUNTAMOUNT_QNAME = new QName("", "ESTIMATED_DISCOUNT_AMOUNT");
    private final static QName _MILESCOST_QNAME = new QName("", "MILES_COST");
    private final static QName _AVAILDATASOURCE_QNAME = new QName("", "AVAIL_DATA_SOURCE");
    private final static QName _RECOMMREF_QNAME = new QName("", "RECOMM_REF");
    private final static QName _AMOUNTTOSUM_QNAME = new QName("", "AMOUNT_TO_SUM");
    private final static QName _AMOUNTTOMAX_QNAME = new QName("", "AMOUNT_TO_MAX");
    private final static QName _AMOUNT_QNAME = new QName("", "AMOUNT");
    private final static QName _AMOUNTWITHOUTTAX_QNAME = new QName("", "AMOUNT_WITHOUT_TAX");
    private final static QName _TAX_QNAME = new QName("", "TAX");
    private final static QName _TAXPAID_QNAME = new QName("", "TAX_PAID");
    private final static QName _REBOOKFEE_QNAME = new QName("", "REBOOK_FEE");
    private final static QName _NOSHOWFEE_QNAME = new QName("", "NO_SHOW_FEE");
    private final static QName _PRICEDPAXONLY_QNAME = new QName("", "PRICED_PAX_ONLY");
    private final static QName _REISSUESTATUS_QNAME = new QName("", "REISSUE_STATUS");
    private final static QName _TOTALAMOUNT_QNAME = new QName("", "TOTAL_AMOUNT");
    private final static QName _LISTDISPLAYTAX_QNAME = new QName("", "LIST_DISPLAY_TAX");
    private final static QName _CONVERTEDCASHMILES_QNAME = new QName("", "CONVERTED_CASH_MILES");
    private final static QName _MINIMUMMILESCOST_QNAME = new QName("", "MINIMUM_MILES_COST");
    private final static QName _MILESANDCASHCOST_QNAME = new QName("", "MILES_AND_CASH_COST");
    private final static QName _COLLECTIONINFO_QNAME = new QName("", "COLLECTION_INFO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.eretail.pojo.farecommon.farecommon
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LISTITINERARYMILESCOST }
     * 
     */
    public LISTITINERARYMILESCOST createLISTITINERARYMILESCOST() {
        return new LISTITINERARYMILESCOST();
    }

    /**
     * Create an instance of {@link MILESANDCASH }
     * 
     */
    public MILESANDCASH createMILESANDCASH() {
        return new MILESANDCASH();
    }

    /**
     * Create an instance of {@link LISTFAREINFO }
     * 
     */
    public LISTFAREINFO createLISTFAREINFO() {
        return new LISTFAREINFO();
    }

    /**
     * Create an instance of {@link MILESANDCASHCOSTRefundType }
     * 
     */
    public MILESANDCASHCOSTRefundType createMILESANDCASHCOSTRefundType() {
        return new MILESANDCASHCOSTRefundType();
    }

    /**
     * Create an instance of {@link COMMERCIALFAREFAMILYType }
     * 
     */
    public COMMERCIALFAREFAMILYType createCOMMERCIALFAREFAMILYType() {
        return new COMMERCIALFAREFAMILYType();
    }

    /**
     * Create an instance of {@link LISTFEEPRICEType }
     * 
     */
    public LISTFEEPRICEType createLISTFEEPRICEType() {
        return new LISTFEEPRICEType();
    }

    /**
     * Create an instance of {@link FEETYPEType }
     * 
     */
    public FEETYPEType createFEETYPEType() {
        return new FEETYPEType();
    }

    /**
     * Create an instance of {@link MILESANDCASHCOSTType }
     * 
     */
    public MILESANDCASHCOSTType createMILESANDCASHCOSTType() {
        return new MILESANDCASHCOSTType();
    }

    /**
     * Create an instance of {@link FEEType }
     * 
     */
    public FEEType createFEEType() {
        return new FEEType();
    }

    /**
     * Create an instance of {@link LISTMEAL }
     * 
     */
    public LISTMEAL createLISTMEAL() {
        return new LISTMEAL();
    }

    /**
     * Create an instance of {@link APPLICABLEFEEType }
     * 
     */
    public APPLICABLEFEEType createAPPLICABLEFEEType() {
        return new APPLICABLEFEEType();
    }

    /**
     * Create an instance of {@link REBOOKFEEType }
     * 
     */
    public REBOOKFEEType createREBOOKFEEType() {
        return new REBOOKFEEType();
    }

    /**
     * Create an instance of {@link LISTTAXType }
     * 
     */
    public LISTTAXType createLISTTAXType() {
        return new LISTTAXType();
    }

    /**
     * Create an instance of {@link com.koreanair.eretail.pojo.farecommon.farecommon.RESULTINGMILES }
     * 
     */
    public com.koreanair.eretail.pojo.farecommon.farecommon.RESULTINGMILES createRESULTINGMILES() {
        return new com.koreanair.eretail.pojo.farecommon.farecommon.RESULTINGMILES();
    }

    /**
     * Create an instance of {@link CONVERTEDAMOUNT }
     * 
     */
    public CONVERTEDAMOUNT createCONVERTEDAMOUNT() {
        return new CONVERTEDAMOUNT();
    }

    /**
     * Create an instance of {@link com.koreanair.eretail.pojo.farecommon.farecommon.NONCONVERTEDAMOUNT }
     * 
     */
    public com.koreanair.eretail.pojo.farecommon.farecommon.NONCONVERTEDAMOUNT createNONCONVERTEDAMOUNT() {
        return new com.koreanair.eretail.pojo.farecommon.farecommon.NONCONVERTEDAMOUNT();
    }

    /**
     * Create an instance of {@link LISTITINERARYMILESCOST.ITINERARYCABIN }
     * 
     */
    public LISTITINERARYMILESCOST.ITINERARYCABIN createLISTITINERARYMILESCOSTITINERARYCABIN() {
        return new LISTITINERARYMILESCOST.ITINERARYCABIN();
    }

    /**
     * Create an instance of {@link LISTITINERARYMILESCOST.LISTBOUNDMILESCOST }
     * 
     */
    public LISTITINERARYMILESCOST.LISTBOUNDMILESCOST createLISTITINERARYMILESCOSTLISTBOUNDMILESCOST() {
        return new LISTITINERARYMILESCOST.LISTBOUNDMILESCOST();
    }

    /**
     * Create an instance of {@link NONCONVERTEDAMOUNTS }
     * 
     */
    public NONCONVERTEDAMOUNTS createNONCONVERTEDAMOUNTS() {
        return new NONCONVERTEDAMOUNTS();
    }

    /**
     * Create an instance of {@link TYPEDAMOUNTType }
     * 
     */
    public TYPEDAMOUNTType createTYPEDAMOUNTType() {
        return new TYPEDAMOUNTType();
    }

    /**
     * Create an instance of {@link CONVERTEDAMOUNTS }
     * 
     */
    public CONVERTEDAMOUNTS createCONVERTEDAMOUNTS() {
        return new CONVERTEDAMOUNTS();
    }

    /**
     * Create an instance of {@link MILESANDCASH.RESULTINGMILES }
     * 
     */
    public MILESANDCASH.RESULTINGMILES createMILESANDCASHRESULTINGMILES() {
        return new MILESANDCASH.RESULTINGMILES();
    }

    /**
     * Create an instance of {@link CollectionInfoType }
     * 
     */
    public CollectionInfoType createCollectionInfoType() {
        return new CollectionInfoType();
    }

    /**
     * Create an instance of {@link LISTFAREINFO.LISTREASON }
     * 
     */
    public LISTFAREINFO.LISTREASON createLISTFAREINFOLISTREASON() {
        return new LISTFAREINFO.LISTREASON();
    }

    /**
     * Create an instance of {@link FEEVALUEType }
     * 
     */
    public FEEVALUEType createFEEVALUEType() {
        return new FEEVALUEType();
    }

    /**
     * Create an instance of {@link FEEADDITIONALINFOType }
     * 
     */
    public FEEADDITIONALINFOType createFEEADDITIONALINFOType() {
        return new FEEADDITIONALINFOType();
    }

    /**
     * Create an instance of {@link FEESUBTYPEType }
     * 
     */
    public FEESUBTYPEType createFEESUBTYPEType() {
        return new FEESUBTYPEType();
    }

    /**
     * Create an instance of {@link FEEVALUETYPEType }
     * 
     */
    public FEEVALUETYPEType createFEEVALUETYPEType() {
        return new FEEVALUETYPEType();
    }

    /**
     * Create an instance of {@link FEEVALUECATEGORYType }
     * 
     */
    public FEEVALUECATEGORYType createFEEVALUECATEGORYType() {
        return new FEEVALUECATEGORYType();
    }

    /**
     * Create an instance of {@link CODENAMEPAIRType }
     * 
     */
    public CODENAMEPAIRType createCODENAMEPAIRType() {
        return new CODENAMEPAIRType();
    }

    /**
     * Create an instance of {@link PROMOTIONBasicType }
     * 
     */
    public PROMOTIONBasicType createPROMOTIONBasicType() {
        return new PROMOTIONBasicType();
    }

    /**
     * Create an instance of {@link PROMOTIONType }
     * 
     */
    public PROMOTIONType createPROMOTIONType() {
        return new PROMOTIONType();
    }

    /**
     * Create an instance of {@link LISTPROMOTIONCODEBasicType }
     * 
     */
    public LISTPROMOTIONCODEBasicType createLISTPROMOTIONCODEBasicType() {
        return new LISTPROMOTIONCODEBasicType();
    }

    /**
     * Create an instance of {@link LISTPROMOTIONCODEType }
     * 
     */
    public LISTPROMOTIONCODEType createLISTPROMOTIONCODEType() {
        return new LISTPROMOTIONCODEType();
    }

    /**
     * Create an instance of {@link LISTPROMOTIONINFOType }
     * 
     */
    public LISTPROMOTIONINFOType createLISTPROMOTIONINFOType() {
        return new LISTPROMOTIONINFOType();
    }

    /**
     * Create an instance of {@link PROMOTIONFARESType }
     * 
     */
    public PROMOTIONFARESType createPROMOTIONFARESType() {
        return new PROMOTIONFARESType();
    }

    /**
     * Create an instance of {@link MESSAGEType }
     * 
     */
    public MESSAGEType createMESSAGEType() {
        return new MESSAGEType();
    }

    /**
     * Create an instance of {@link INFORMATIONCONTENTType }
     * 
     */
    public INFORMATIONCONTENTType createINFORMATIONCONTENTType() {
        return new INFORMATIONCONTENTType();
    }

    /**
     * Create an instance of {@link AMOUNTSIMPLEType }
     * 
     */
    public AMOUNTSIMPLEType createAMOUNTSIMPLEType() {
        return new AMOUNTSIMPLEType();
    }

    /**
     * Create an instance of {@link LISTFARECALCType }
     * 
     */
    public LISTFARECALCType createLISTFARECALCType() {
        return new LISTFARECALCType();
    }

    /**
     * Create an instance of {@link SingleAmountType }
     * 
     */
    public SingleAmountType createSingleAmountType() {
        return new SingleAmountType();
    }

    /**
     * Create an instance of {@link SingleAmountREUREFType }
     * 
     */
    public SingleAmountREUREFType createSingleAmountREUREFType() {
        return new SingleAmountREUREFType();
    }

    /**
     * Create an instance of {@link TRAVELFUNDType }
     * 
     */
    public TRAVELFUNDType createTRAVELFUNDType() {
        return new TRAVELFUNDType();
    }

    /**
     * Create an instance of {@link REBOOKBALANCEType }
     * 
     */
    public REBOOKBALANCEType createREBOOKBALANCEType() {
        return new REBOOKBALANCEType();
    }

    /**
     * Create an instance of {@link LISTPRICEType }
     * 
     */
    public LISTPRICEType createLISTPRICEType() {
        return new LISTPRICEType();
    }

    /**
     * Create an instance of {@link REBOOKBALANCETRAVType }
     * 
     */
    public REBOOKBALANCETRAVType createREBOOKBALANCETRAVType() {
        return new REBOOKBALANCETRAVType();
    }

    /**
     * Create an instance of {@link FAREREFERENCEType }
     * 
     */
    public FAREREFERENCEType createFAREREFERENCEType() {
        return new FAREREFERENCEType();
    }

    /**
     * Create an instance of {@link DictionaryChoice }
     * 
     */
    public DictionaryChoice createDictionaryChoice() {
        return new DictionaryChoice();
    }

    /**
     * Create an instance of {@link DESCSERVICELEVELType }
     * 
     */
    public DESCSERVICELEVELType createDESCSERVICELEVELType() {
        return new DESCSERVICELEVELType();
    }

    /**
     * Create an instance of {@link SERVICELEVELDICTIONARYType }
     * 
     */
    public SERVICELEVELDICTIONARYType createSERVICELEVELDICTIONARYType() {
        return new SERVICELEVELDICTIONARYType();
    }

    /**
     * Create an instance of {@link LISTBOUNDPRICEType }
     * 
     */
    public LISTBOUNDPRICEType createLISTBOUNDPRICEType() {
        return new LISTBOUNDPRICEType();
    }

    /**
     * Create an instance of {@link CURRENCYType }
     * 
     */
    public CURRENCYType createCURRENCYType() {
        return new CURRENCYType();
    }

    /**
     * Create an instance of {@link TICKETDOCUMENTType }
     * 
     */
    public TICKETDOCUMENTType createTICKETDOCUMENTType() {
        return new TICKETDOCUMENTType();
    }

    /**
     * Create an instance of {@link COUPONFORUPDATEType }
     * 
     */
    public COUPONFORUPDATEType createCOUPONFORUPDATEType() {
        return new COUPONFORUPDATEType();
    }

    /**
     * Create an instance of {@link REFUNDBALANCEType }
     * 
     */
    public REFUNDBALANCEType createREFUNDBALANCEType() {
        return new REFUNDBALANCEType();
    }

    /**
     * Create an instance of {@link FareFamilyType }
     * 
     */
    public FareFamilyType createFareFamilyType() {
        return new FareFamilyType();
    }

    /**
     * Create an instance of {@link MILESANDCASHCOSTRefundType.NONCONVERTEDAMOUNT }
     * 
     */
    public MILESANDCASHCOSTRefundType.NONCONVERTEDAMOUNT createMILESANDCASHCOSTRefundTypeNONCONVERTEDAMOUNT() {
        return new MILESANDCASHCOSTRefundType.NONCONVERTEDAMOUNT();
    }

    /**
     * Create an instance of {@link MILESANDCASHCOSTRefundType.RESULTINGMILES }
     * 
     */
    public MILESANDCASHCOSTRefundType.RESULTINGMILES createMILESANDCASHCOSTRefundTypeRESULTINGMILES() {
        return new MILESANDCASHCOSTRefundType.RESULTINGMILES();
    }

    /**
     * Create an instance of {@link COMMERCIALFAREFAMILYType.LISTCRITERIA }
     * 
     */
    public COMMERCIALFAREFAMILYType.LISTCRITERIA createCOMMERCIALFAREFAMILYTypeLISTCRITERIA() {
        return new COMMERCIALFAREFAMILYType.LISTCRITERIA();
    }

    /**
     * Create an instance of {@link LISTFEEPRICEType.CURRENCY }
     * 
     */
    public LISTFEEPRICEType.CURRENCY createLISTFEEPRICETypeCURRENCY() {
        return new LISTFEEPRICEType.CURRENCY();
    }

    /**
     * Create an instance of {@link FEETYPEType.CONDITION }
     * 
     */
    public FEETYPEType.CONDITION createFEETYPETypeCONDITION() {
        return new FEETYPEType.CONDITION();
    }

    /**
     * Create an instance of {@link MILESANDCASHCOSTType.RESULTINGMILES }
     * 
     */
    public MILESANDCASHCOSTType.RESULTINGMILES createMILESANDCASHCOSTTypeRESULTINGMILES() {
        return new MILESANDCASHCOSTType.RESULTINGMILES();
    }

    /**
     * Create an instance of {@link MILESANDCASHCOSTType.LISTADDITIONALMILESCASHINFO }
     * 
     */
    public MILESANDCASHCOSTType.LISTADDITIONALMILESCASHINFO createMILESANDCASHCOSTTypeLISTADDITIONALMILESCASHINFO() {
        return new MILESANDCASHCOSTType.LISTADDITIONALMILESCASHINFO();
    }

    /**
     * Create an instance of {@link FEEType.FEEID }
     * 
     */
    public FEEType.FEEID createFEETypeFEEID() {
        return new FEEType.FEEID();
    }

    /**
     * Create an instance of {@link FEEType.FEECODE }
     * 
     */
    public FEEType.FEECODE createFEETypeFEECODE() {
        return new FEEType.FEECODE();
    }

    /**
     * Create an instance of {@link FEEType.COMMAND }
     * 
     */
    public FEEType.COMMAND createFEETypeCOMMAND() {
        return new FEEType.COMMAND();
    }

    /**
     * Create an instance of {@link FEEType.PASSENGERS }
     * 
     */
    public FEEType.PASSENGERS createFEETypePASSENGERS() {
        return new FEEType.PASSENGERS();
    }

    /**
     * Create an instance of {@link FEEType.BALANCE }
     * 
     */
    public FEEType.BALANCE createFEETypeBALANCE() {
        return new FEEType.BALANCE();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListResidentDiscountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_RESIDENT_DISCOUNT")
    public JAXBElement<ListResidentDiscountType> createLISTRESIDENTDISCOUNT(ListResidentDiscountType value) {
        return new JAXBElement<ListResidentDiscountType>(_LISTRESIDENTDISCOUNT_QNAME, ListResidentDiscountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDiscountCredentialsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_DISCOUNT_CREDENTIALS")
    public JAXBElement<ListDiscountCredentialsType> createLISTDISCOUNTCREDENTIALS(ListDiscountCredentialsType value) {
        return new JAXBElement<ListDiscountCredentialsType>(_LISTDISCOUNTCREDENTIALS_QNAME, ListDiscountCredentialsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CEM_ID")
    public JAXBElement<String> createCEMID(String value) {
        return new JAXBElement<String>(_CEMID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CEM_AIRLINE_CODE")
    public JAXBElement<String> createCEMAIRLINECODE(String value) {
        return new JAXBElement<String>(_CEMAIRLINECODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COMMAND_EXECUTION_STATUS")
    public JAXBElement<String> createCOMMANDEXECUTIONSTATUS(String value) {
        return new JAXBElement<String>(_COMMANDEXECUTIONSTATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARING_COMMAND_ID")
    public JAXBElement<BigInteger> createFARINGCOMMANDID(BigInteger value) {
        return new JAXBElement<BigInteger>(_FARINGCOMMANDID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TYPE_OF_FARE")
    public JAXBElement<BigInteger> createTYPEOFFARE(BigInteger value) {
        return new JAXBElement<BigInteger>(_TYPEOFFARE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICING_WITH_PUBLISHED_MILES")
    public JAXBElement<Boolean> createPRICINGWITHPUBLISHEDMILES(Boolean value) {
        return new JAXBElement<Boolean>(_PRICINGWITHPUBLISHEDMILES_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MILES_PUBLISHING_AIRLINE")
    public JAXBElement<String> createMILESPUBLISHINGAIRLINE(String value) {
        return new JAXBElement<String>(_MILESPUBLISHINGAIRLINE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_UPGRADE")
    public JAXBElement<Boolean> createISUPGRADE(Boolean value) {
        return new JAXBElement<Boolean>(_ISUPGRADE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POINT_OF_SALE")
    public JAXBElement<String> createPOINTOFSALE(String value) {
        return new JAXBElement<String>(_POINTOFSALE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POINT_OF_TICKETING")
    public JAXBElement<String> createPOINTOFTICKETING(String value) {
        return new JAXBElement<String>(_POINTOFTICKETING_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TYPE_OF_CORPORATE_FARE")
    public JAXBElement<BigInteger> createTYPEOFCORPORATEFARE(BigInteger value) {
        return new JAXBElement<BigInteger>(_TYPEOFCORPORATEFARE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CUSTOMER_IDENTIFIER")
    public JAXBElement<String> createCUSTOMERIDENTIFIER(String value) {
        return new JAXBElement<String>(_CUSTOMERIDENTIFIER_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICING_OPTIONS_ID")
    public JAXBElement<BigInteger> createPRICINGOPTIONSID(BigInteger value) {
        return new JAXBElement<BigInteger>(_PRICINGOPTIONSID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NVA")
    public JAXBElement<String> createNVA(String value) {
        return new JAXBElement<String>(_NVA_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NVB")
    public JAXBElement<String> createNVB(String value) {
        return new JAXBElement<String>(_NVB_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALL_INCLUSIVE")
    public JAXBElement<Boolean> createALLINCLUSIVE(Boolean value) {
        return new JAXBElement<Boolean>(_ALLINCLUSIVE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FEEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FEE")
    public JAXBElement<FEEType> createLISTFEE(FEEType value) {
        return new JAXBElement<FEEType>(_LISTFEE_QNAME, FEEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPLICABLEFEEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_APPLICABLE_MARKUP_DISCOUNT")
    public JAXBElement<APPLICABLEFEEType> createLISTAPPLICABLEMARKUPDISCOUNT(APPLICABLEFEEType value) {
        return new JAXBElement<APPLICABLEFEEType>(_LISTAPPLICABLEMARKUPDISCOUNT_QNAME, APPLICABLEFEEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPLICABLEFEEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_APPLICABLE_FEE")
    public JAXBElement<APPLICABLEFEEType> createLISTAPPLICABLEFEE(APPLICABLEFEEType value) {
        return new JAXBElement<APPLICABLEFEEType>(_LISTAPPLICABLEFEE_QNAME, APPLICABLEFEEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ESTIMATED_DISCOUNT_AMOUNT")
    public JAXBElement<BigDecimal> createESTIMATEDDISCOUNTAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ESTIMATEDDISCOUNTAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MILES_COST")
    public JAXBElement<BigInteger> createMILESCOST(BigInteger value) {
        return new JAXBElement<BigInteger>(_MILESCOST_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVAILDATASOURCEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AVAIL_DATA_SOURCE")
    public JAXBElement<AVAILDATASOURCEType> createAVAILDATASOURCE(AVAILDATASOURCEType value) {
        return new JAXBElement<AVAILDATASOURCEType>(_AVAILDATASOURCE_QNAME, AVAILDATASOURCEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RECOMM_REF")
    public JAXBElement<BigInteger> createRECOMMREF(BigInteger value) {
        return new JAXBElement<BigInteger>(_RECOMMREF_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AMOUNT_TO_SUM")
    public JAXBElement<BigDecimal> createAMOUNTTOSUM(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AMOUNTTOSUM_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AMOUNT_TO_MAX")
    public JAXBElement<BigDecimal> createAMOUNTTOMAX(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AMOUNTTOMAX_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AMOUNT")
    public JAXBElement<BigDecimal> createAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AMOUNT_WITHOUT_TAX")
    public JAXBElement<BigDecimal> createAMOUNTWITHOUTTAX(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AMOUNTWITHOUTTAX_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TAX")
    public JAXBElement<BigDecimal> createTAX(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TAX_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TAX_PAID")
    public JAXBElement<BigDecimal> createTAXPAID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TAXPAID_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REBOOKFEEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REBOOK_FEE")
    public JAXBElement<REBOOKFEEType> createREBOOKFEE(REBOOKFEEType value) {
        return new JAXBElement<REBOOKFEEType>(_REBOOKFEE_QNAME, REBOOKFEEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REBOOKFEEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NO_SHOW_FEE")
    public JAXBElement<REBOOKFEEType> createNOSHOWFEE(REBOOKFEEType value) {
        return new JAXBElement<REBOOKFEEType>(_NOSHOWFEE_QNAME, REBOOKFEEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICED_PAX_ONLY")
    public JAXBElement<Boolean> createPRICEDPAXONLY(Boolean value) {
        return new JAXBElement<Boolean>(_PRICEDPAXONLY_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REISSUE_STATUS")
    public JAXBElement<String> createREISSUESTATUS(String value) {
        return new JAXBElement<String>(_REISSUESTATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOTAL_AMOUNT")
    public JAXBElement<BigDecimal> createTOTALAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TOTALAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTTAXType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_DISPLAY_TAX")
    public JAXBElement<LISTTAXType> createLISTDISPLAYTAX(LISTTAXType value) {
        return new JAXBElement<LISTTAXType>(_LISTDISPLAYTAX_QNAME, LISTTAXType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CONVERTED_CASH_MILES")
    public JAXBElement<BigInteger> createCONVERTEDCASHMILES(BigInteger value) {
        return new JAXBElement<BigInteger>(_CONVERTEDCASHMILES_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MINIMUM_MILES_COST")
    public JAXBElement<BigInteger> createMINIMUMMILESCOST(BigInteger value) {
        return new JAXBElement<BigInteger>(_MINIMUMMILESCOST_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MILESANDCASHCOSTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MILES_AND_CASH_COST")
    public JAXBElement<MILESANDCASHCOSTType> createMILESANDCASHCOST(MILESANDCASHCOSTType value) {
        return new JAXBElement<MILESANDCASHCOSTType>(_MILESANDCASHCOST_QNAME, MILESANDCASHCOSTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COLLECTION_INFO")
    public JAXBElement<CollectionInfoType> createCOLLECTIONINFO(CollectionInfoType value) {
        return new JAXBElement<CollectionInfoType>(_COLLECTIONINFO_QNAME, CollectionInfoType.class, null, value);
    }

}
