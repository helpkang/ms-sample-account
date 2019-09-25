
package com.koreanair.eretail.pojo.fare.commoninput;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.common.common.GDSCABINCODEType;
import com.koreanair.eretail.pojo.common.common.LISTTRIPREASONtype;
import com.koreanair.eretail.pojo.common.common.OperationalDataType;
import com.koreanair.eretail.pojo.farecommon.farecommon.APPLICABLEFEEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.AVAILDATASOURCEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.CollectionInfoType;
import com.koreanair.eretail.pojo.farecommon.farecommon.FEEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTTAXType;
import com.koreanair.eretail.pojo.farecommon.farecommon.MILESANDCASHCOSTType;
import com.koreanair.eretail.pojo.farecommon.farecommon.REBOOKFEEType;
import com.koreanair.eretail.pojo.farecommon.farediscount.ListDiscountCredentialsType;
import com.koreanair.eretail.pojo.farecommon.farediscount.ListResidentDiscountType;
import com.koreanair.eretail.pojo.profile.commonprofileout.ADDRESSINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.BANKACCOUNTINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.CHECKINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.CONTACTPOINTTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.CREDITCARDINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.EBANKVOUCHERINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.GOVERNMENTPAYMENTINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.IDENTITYDOCUMENTTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.IDENTITYINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.NOTIFICATIONINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.VOUCHERACCOUNTINFORMATIONTYPE;
import com.koreanair.eretail.pojo.tripplan.traveller_information.TRAVELLERINFORMATION;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.eretail.pojo.fare.commoninput package. 
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
    private final static QName _NEXTSERVLET_QNAME = new QName("", "NEXT_SERVLET");
    private final static QName _NEXTPROFILESERVLET_QNAME = new QName("", "NEXT_PROFILE_SERVLET");
    private final static QName _BOOLCREATINGNEWPROFILE_QNAME = new QName("", "BOOL_CREATING_NEW_PROFILE");
    private final static QName _BOOLNEWPROFILE_QNAME = new QName("", "BOOL_NEW_PROFILE");
    private final static QName _BOOLUPDATEDPROFILE_QNAME = new QName("", "BOOL_UPDATED_PROFILE");
    private final static QName _TXSTATUS_QNAME = new QName("", "TX_STATUS");
    private final static QName _DELIVERYMAILSERVICEDESCRIPTION_QNAME = new QName("", "DELIVERY_MAIL_SERVICE_DESCRIPTION");
    private final static QName _DELIVERYMAILSERVICEFEE_QNAME = new QName("", "DELIVERY_MAIL_SERVICE_FEE");
    private final static QName _DEFAULTOFFICEIDDELIV_QNAME = new QName("", "DEFAULT_OFFICE_ID_DELIV");
    private final static QName _DEFAULTOFFICEIDPICKUPAT_QNAME = new QName("", "DEFAULT_OFFICE_ID_PICKUPAT");
    private final static QName _DEFAULTROOMSMOKINGCODE_QNAME = new QName("", "DEFAULT_ROOM_SMOKING_CODE");
    private final static QName _DEFAULTHOTELCOMPANYCODE_QNAME = new QName("", "DEFAULT_HOTEL_COMPANY_CODE");
    private final static QName _BOOLADMINLOGGEDIN_QNAME = new QName("", "BOOL_ADMIN_LOGGEDIN");
    private final static QName _IDENTITYINFORMATION_QNAME = new QName("", "IDENTITY_INFORMATION");
    private final static QName _LISTNOTIFICATIONINFORMATION_QNAME = new QName("", "LIST_NOTIFICATION_INFORMATION");
    private final static QName _LISTADDRESSINFORMATION_QNAME = new QName("", "LIST_ADDRESS_INFORMATION");
    private final static QName _LISTCREDITCARDINFORMATION_QNAME = new QName("", "LIST_CREDIT_CARD_INFORMATION");
    private final static QName _LISTGOVERNMENTPAYMENTINFORMATION_QNAME = new QName("", "LIST_GOVERNMENT_PAYMENT_INFORMATION");
    private final static QName _LISTBANKACCOUNTINFORMATION_QNAME = new QName("", "LIST_BANK_ACCOUNT_INFORMATION");
    private final static QName _LISTEBANKVOUCHERINFORMATION_QNAME = new QName("", "LIST_EBANK_VOUCHER_INFORMATION");
    private final static QName _LISTCHECKINFORMATION_QNAME = new QName("", "LIST_CHECK_INFORMATION");
    private final static QName _LISTVOUCHERACCOUNTINFORMATION_QNAME = new QName("", "LIST_VOUCHER_ACCOUNT_INFORMATION");
    private final static QName _ISUSERLOGGEDIN_QNAME = new QName("", "IS_USER_LOGGED_IN");
    private final static QName _INFANT_QNAME = new QName("", "INFANT");
    private final static QName _LISTCONTACTPOINT_QNAME = new QName("", "LIST_CONTACT_POINT");
    private final static QName _LISTCONTACTPOINTPASSENGER_QNAME = new QName("", "LIST_CONTACT_POINT_PASSENGER");
    private final static QName _LISTIDENTITYDOCUMENT_QNAME = new QName("", "LIST_IDENTITY_DOCUMENT");
    private final static QName _TRANSACTIONID_QNAME = new QName("", "TRANSACTION_ID");
    private final static QName _SITE_QNAME = new QName("", "SITE");
    private final static QName _LANGUAGE_QNAME = new QName("", "LANGUAGE");
    private final static QName _FORCEPTC_QNAME = new QName("", "FORCE_PTC");
    private final static QName _USECABINOPTION_QNAME = new QName("", "USE_CABIN_OPTION");
    private final static QName _USECROSSCABIN_QNAME = new QName("", "USE_CROSS_CABIN");
    private final static QName _USEBACKUPCABINOPTION_QNAME = new QName("", "USE_BACKUP_CABIN_OPTION");
    private final static QName _USEBACKUPCROSSCABIN_QNAME = new QName("", "USE_BACKUP_CROSS_CABIN");
    private final static QName _FARECOMMANDID_QNAME = new QName("", "FARE_COMMAND_ID");
    private final static QName _BACKUPFARECOMMANDID_QNAME = new QName("", "BACKUP_FARE_COMMAND_ID");
    private final static QName _LISTFAREPARAMETER_QNAME = new QName("", "LIST_FARE_PARAMETER");
    private final static QName _LISTFAREBACKUPPARAMETER_QNAME = new QName("", "LIST_FARE_BACKUP_PARAMETER");
    private final static QName _PARAMETERID_QNAME = new QName("", "PARAMETER_ID");
    private final static QName _TYPEOFBACKUPFARE_QNAME = new QName("", "TYPE_OF_BACKUP_FARE");
    private final static QName _RESTRICTION_QNAME = new QName("", "RESTRICTION");
    private final static QName _TICKETDESIGNATOR_QNAME = new QName("", "TICKET_DESIGNATOR");
    private final static QName _ISPRIMARYTRAVELLER_QNAME = new QName("", "IS_PRIMARY_TRAVELLER");
    private final static QName _FARECOMMAND_QNAME = new QName("", "FARE_COMMAND");
    private final static QName _FLIGHTNUMBER_QNAME = new QName("", "FLIGHT_NUMBER");
    private final static QName _CABIN_QNAME = new QName("", "CABIN");
    private final static QName _RBD_QNAME = new QName("", "RBD");
    private final static QName _STATUS_QNAME = new QName("", "STATUS");
    private final static QName _WITHOUTFARECLASS_QNAME = new QName("", "WITHOUT_FARE_CLASS");
    private final static QName _PRICINGMODE_QNAME = new QName("", "PRICING_MODE");
    private final static QName _GLOBALINDICATORPRICINGOPTION_QNAME = new QName("", "GLOBAL_INDICATOR_PRICING_OPTION");
    private final static QName _TRAVELLERINFORMATION_QNAME = new QName("", "TRAVELLER_INFORMATION");
    private final static QName _FARECLASS_QNAME = new QName("", "FARE_CLASS");
    private final static QName _FAREBREAKPOINT_QNAME = new QName("", "FARE_BREAK_POINT");
    private final static QName _TRIPPRICEAMOUNT_QNAME = new QName("", "TRIP_PRICE_AMOUNT");
    private final static QName _TRIPPRICECURRENCY_QNAME = new QName("", "TRIP_PRICE_CURRENCY");
    private final static QName _FAREID_QNAME = new QName("", "FARE_ID");
    private final static QName _PASSCORPORATEID_QNAME = new QName("", "PASS_CORPORATE_ID");
    private final static QName _AIRRULEID_QNAME = new QName("", "AIR_RULE_ID");
    private final static QName _PRICEBYINPUTID_QNAME = new QName("", "PRICE_BY_INPUT_ID");
    private final static QName _ALLFARES_QNAME = new QName("", "ALL_FARES");
    private final static QName _LISTFAREBYBOUND_QNAME = new QName("", "LIST_FARE_BY_BOUND");
    private final static QName _USEDISCOUNTCARD_QNAME = new QName("", "USE_DISCOUNT_CARD");
    private final static QName _CABININFOID_QNAME = new QName("", "CABIN_INFO_ID");
    private final static QName _CABINOPTIONVALUE_QNAME = new QName("", "CABIN_OPTION_VALUE");
    private final static QName _BACKUPCABINOPTIONVALUE_QNAME = new QName("", "BACKUP_CABIN_OPTION_VALUE");
    private final static QName _LISTUPSELLCFF_QNAME = new QName("", "LIST_UPSELL_CFF");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.eretail.pojo.fare.commoninput
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LISTITINERARYDirectFareDecodedType }
     * 
     */
    public LISTITINERARYDirectFareDecodedType createLISTITINERARYDirectFareDecodedType() {
        return new LISTITINERARYDirectFareDecodedType();
    }

    /**
     * Create an instance of {@link LISTITINERARYDirectFareType }
     * 
     */
    public LISTITINERARYDirectFareType createLISTITINERARYDirectFareType() {
        return new LISTITINERARYDirectFareType();
    }

    /**
     * Create an instance of {@link LISTTRAVELLERDirectFareDecodedType }
     * 
     */
    public LISTTRAVELLERDirectFareDecodedType createLISTTRAVELLERDirectFareDecodedType() {
        return new LISTTRAVELLERDirectFareDecodedType();
    }

    /**
     * Create an instance of {@link LISTTRAVELLERDirectFareType }
     * 
     */
    public LISTTRAVELLERDirectFareType createLISTTRAVELLERDirectFareType() {
        return new LISTTRAVELLERDirectFareType();
    }

    /**
     * Create an instance of {@link PARAMETERIDType }
     * 
     */
    public PARAMETERIDType createPARAMETERIDType() {
        return new PARAMETERIDType();
    }

    /**
     * Create an instance of {@link LISTFAREHOSTCOMMAND }
     * 
     */
    public LISTFAREHOSTCOMMAND createLISTFAREHOSTCOMMAND() {
        return new LISTFAREHOSTCOMMAND();
    }

    /**
     * Create an instance of {@link SATURNEDISCOUNTCARD }
     * 
     */
    public SATURNEDISCOUNTCARD createSATURNEDISCOUNTCARD() {
        return new SATURNEDISCOUNTCARD();
    }

    /**
     * Create an instance of {@link LISTDISCOUNT }
     * 
     */
    public LISTDISCOUNT createLISTDISCOUNT() {
        return new LISTDISCOUNT();
    }

    /**
     * Create an instance of {@link CFFType }
     * 
     */
    public CFFType createCFFType() {
        return new CFFType();
    }

    /**
     * Create an instance of {@link LISTTRAVELLERINFODirectFareType }
     * 
     */
    public LISTTRAVELLERINFODirectFareType createLISTTRAVELLERINFODirectFareType() {
        return new LISTTRAVELLERINFODirectFareType();
    }

    /**
     * Create an instance of {@link DISCOUNTINFODirectFareType }
     * 
     */
    public DISCOUNTINFODirectFareType createDISCOUNTINFODirectFareType() {
        return new DISCOUNTINFODirectFareType();
    }

    /**
     * Create an instance of {@link DISCOUNTINFOPTCDirectFareType }
     * 
     */
    public DISCOUNTINFOPTCDirectFareType createDISCOUNTINFOPTCDirectFareType() {
        return new DISCOUNTINFOPTCDirectFareType();
    }

    /**
     * Create an instance of {@link DISCOUNTINFOPTCLISTPTCDirectFareType }
     * 
     */
    public DISCOUNTINFOPTCLISTPTCDirectFareType createDISCOUNTINFOPTCLISTPTCDirectFareType() {
        return new DISCOUNTINFOPTCLISTPTCDirectFareType();
    }

    /**
     * Create an instance of {@link InputLOCATIONType }
     * 
     */
    public InputLOCATIONType createInputLOCATIONType() {
        return new InputLOCATIONType();
    }

    /**
     * Create an instance of {@link LOCATIONDecodedType }
     * 
     */
    public LOCATIONDecodedType createLOCATIONDecodedType() {
        return new LOCATIONDecodedType();
    }

    /**
     * Create an instance of {@link AIRLINEType }
     * 
     */
    public AIRLINEType createAIRLINEType() {
        return new AIRLINEType();
    }

    /**
     * Create an instance of {@link AIRLINEDecodedType }
     * 
     */
    public AIRLINEDecodedType createAIRLINEDecodedType() {
        return new AIRLINEDecodedType();
    }

    /**
     * Create an instance of {@link EQUIPMENTType }
     * 
     */
    public EQUIPMENTType createEQUIPMENTType() {
        return new EQUIPMENTType();
    }

    /**
     * Create an instance of {@link EQUIPMENTDecodedType }
     * 
     */
    public EQUIPMENTDecodedType createEQUIPMENTDecodedType() {
        return new EQUIPMENTDecodedType();
    }

    /**
     * Create an instance of {@link LISTSEGMENTDirectFareType }
     * 
     */
    public LISTSEGMENTDirectFareType createLISTSEGMENTDirectFareType() {
        return new LISTSEGMENTDirectFareType();
    }

    /**
     * Create an instance of {@link LISTSEGMENTDirectFareDecodedType }
     * 
     */
    public LISTSEGMENTDirectFareDecodedType createLISTSEGMENTDirectFareDecodedType() {
        return new LISTSEGMENTDirectFareDecodedType();
    }

    /**
     * Create an instance of {@link CORPORATENUMBERType }
     * 
     */
    public CORPORATENUMBERType createCORPORATENUMBERType() {
        return new CORPORATENUMBERType();
    }

    /**
     * Create an instance of {@link LISTITINERARYDirectFareDecodedType.ELEMENT }
     * 
     */
    public LISTITINERARYDirectFareDecodedType.ELEMENT createLISTITINERARYDirectFareDecodedTypeELEMENT() {
        return new LISTITINERARYDirectFareDecodedType.ELEMENT();
    }

    /**
     * Create an instance of {@link LISTITINERARYDirectFareType.ELEMENT }
     * 
     */
    public LISTITINERARYDirectFareType.ELEMENT createLISTITINERARYDirectFareTypeELEMENT() {
        return new LISTITINERARYDirectFareType.ELEMENT();
    }

    /**
     * Create an instance of {@link LISTTRAVELLERDirectFareDecodedType.TRAVELLERTYPE }
     * 
     */
    public LISTTRAVELLERDirectFareDecodedType.TRAVELLERTYPE createLISTTRAVELLERDirectFareDecodedTypeTRAVELLERTYPE() {
        return new LISTTRAVELLERDirectFareDecodedType.TRAVELLERTYPE();
    }

    /**
     * Create an instance of {@link LISTTRAVELLERDirectFareType.TRAVELLERTYPE }
     * 
     */
    public LISTTRAVELLERDirectFareType.TRAVELLERTYPE createLISTTRAVELLERDirectFareTypeTRAVELLERTYPE() {
        return new LISTTRAVELLERDirectFareType.TRAVELLERTYPE();
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NEXT_SERVLET")
    public JAXBElement<String> createNEXTSERVLET(String value) {
        return new JAXBElement<String>(_NEXTSERVLET_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NEXT_PROFILE_SERVLET")
    public JAXBElement<String> createNEXTPROFILESERVLET(String value) {
        return new JAXBElement<String>(_NEXTPROFILESERVLET_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOOL_CREATING_NEW_PROFILE")
    public JAXBElement<Boolean> createBOOLCREATINGNEWPROFILE(Boolean value) {
        return new JAXBElement<Boolean>(_BOOLCREATINGNEWPROFILE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOOL_NEW_PROFILE")
    public JAXBElement<Boolean> createBOOLNEWPROFILE(Boolean value) {
        return new JAXBElement<Boolean>(_BOOLNEWPROFILE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOOL_UPDATED_PROFILE")
    public JAXBElement<Boolean> createBOOLUPDATEDPROFILE(Boolean value) {
        return new JAXBElement<Boolean>(_BOOLUPDATEDPROFILE_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TX_STATUS")
    public JAXBElement<BigInteger> createTXSTATUS(BigInteger value) {
        return new JAXBElement<BigInteger>(_TXSTATUS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DELIVERY_MAIL_SERVICE_DESCRIPTION")
    public JAXBElement<String> createDELIVERYMAILSERVICEDESCRIPTION(String value) {
        return new JAXBElement<String>(_DELIVERYMAILSERVICEDESCRIPTION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DELIVERY_MAIL_SERVICE_FEE")
    public JAXBElement<String> createDELIVERYMAILSERVICEFEE(String value) {
        return new JAXBElement<String>(_DELIVERYMAILSERVICEFEE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFAULT_OFFICE_ID_DELIV")
    public JAXBElement<BigInteger> createDEFAULTOFFICEIDDELIV(BigInteger value) {
        return new JAXBElement<BigInteger>(_DEFAULTOFFICEIDDELIV_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFAULT_OFFICE_ID_PICKUPAT")
    public JAXBElement<BigInteger> createDEFAULTOFFICEIDPICKUPAT(BigInteger value) {
        return new JAXBElement<BigInteger>(_DEFAULTOFFICEIDPICKUPAT_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFAULT_ROOM_SMOKING_CODE")
    public JAXBElement<String> createDEFAULTROOMSMOKINGCODE(String value) {
        return new JAXBElement<String>(_DEFAULTROOMSMOKINGCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFAULT_HOTEL_COMPANY_CODE")
    public JAXBElement<String> createDEFAULTHOTELCOMPANYCODE(String value) {
        return new JAXBElement<String>(_DEFAULTHOTELCOMPANYCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BOOL_ADMIN_LOGGEDIN")
    public JAXBElement<Object> createBOOLADMINLOGGEDIN(Object value) {
        return new JAXBElement<Object>(_BOOLADMINLOGGEDIN_QNAME, Object.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "LIST_CONTACT_POINT")
    public JAXBElement<CONTACTPOINTTYPE> createLISTCONTACTPOINT(CONTACTPOINTTYPE value) {
        return new JAXBElement<CONTACTPOINTTYPE>(_LISTCONTACTPOINT_QNAME, CONTACTPOINTTYPE.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRANSACTION_ID")
    public JAXBElement<String> createTRANSACTIONID(String value) {
        return new JAXBElement<String>(_TRANSACTIONID_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FORCE_PTC")
    public JAXBElement<Boolean> createFORCEPTC(Boolean value) {
        return new JAXBElement<Boolean>(_FORCEPTC_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USE_CABIN_OPTION")
    public JAXBElement<Boolean> createUSECABINOPTION(Boolean value) {
        return new JAXBElement<Boolean>(_USECABINOPTION_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USE_CROSS_CABIN")
    public JAXBElement<Boolean> createUSECROSSCABIN(Boolean value) {
        return new JAXBElement<Boolean>(_USECROSSCABIN_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USE_BACKUP_CABIN_OPTION")
    public JAXBElement<Boolean> createUSEBACKUPCABINOPTION(Boolean value) {
        return new JAXBElement<Boolean>(_USEBACKUPCABINOPTION_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USE_BACKUP_CROSS_CABIN")
    public JAXBElement<Boolean> createUSEBACKUPCROSSCABIN(Boolean value) {
        return new JAXBElement<Boolean>(_USEBACKUPCROSSCABIN_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_COMMAND_ID")
    public JAXBElement<BigInteger> createFARECOMMANDID(BigInteger value) {
        return new JAXBElement<BigInteger>(_FARECOMMANDID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BACKUP_FARE_COMMAND_ID")
    public JAXBElement<BigInteger> createBACKUPFARECOMMANDID(BigInteger value) {
        return new JAXBElement<BigInteger>(_BACKUPFARECOMMANDID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARAMETERIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FARE_PARAMETER")
    public JAXBElement<PARAMETERIDType> createLISTFAREPARAMETER(PARAMETERIDType value) {
        return new JAXBElement<PARAMETERIDType>(_LISTFAREPARAMETER_QNAME, PARAMETERIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PARAMETERIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FARE_BACKUP_PARAMETER")
    public JAXBElement<PARAMETERIDType> createLISTFAREBACKUPPARAMETER(PARAMETERIDType value) {
        return new JAXBElement<PARAMETERIDType>(_LISTFAREBACKUPPARAMETER_QNAME, PARAMETERIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PARAMETER_ID")
    public JAXBElement<BigInteger> createPARAMETERID(BigInteger value) {
        return new JAXBElement<BigInteger>(_PARAMETERID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TYPE_OF_BACKUP_FARE")
    public JAXBElement<BigInteger> createTYPEOFBACKUPFARE(BigInteger value) {
        return new JAXBElement<BigInteger>(_TYPEOFBACKUPFARE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RESTRICTION")
    public JAXBElement<Boolean> createRESTRICTION(Boolean value) {
        return new JAXBElement<Boolean>(_RESTRICTION_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TICKET_DESIGNATOR")
    public JAXBElement<String> createTICKETDESIGNATOR(String value) {
        return new JAXBElement<String>(_TICKETDESIGNATOR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_PRIMARY_TRAVELLER")
    public JAXBElement<Boolean> createISPRIMARYTRAVELLER(Boolean value) {
        return new JAXBElement<Boolean>(_ISPRIMARYTRAVELLER_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_COMMAND")
    public JAXBElement<BigInteger> createFARECOMMAND(BigInteger value) {
        return new JAXBElement<BigInteger>(_FARECOMMAND_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "CABIN")
    public JAXBElement<String> createCABIN(String value) {
        return new JAXBElement<String>(_CABIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RBD")
    public JAXBElement<String> createRBD(String value) {
        return new JAXBElement<String>(_RBD_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATUS")
    public JAXBElement<String> createSTATUS(String value) {
        return new JAXBElement<String>(_STATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WITHOUT_FARE_CLASS")
    public JAXBElement<Boolean> createWITHOUTFARECLASS(Boolean value) {
        return new JAXBElement<Boolean>(_WITHOUTFARECLASS_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICING_MODE")
    public JAXBElement<BigInteger> createPRICINGMODE(BigInteger value) {
        return new JAXBElement<BigInteger>(_PRICINGMODE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLOBAL_INDICATOR_PRICING_OPTION")
    public JAXBElement<String> createGLOBALINDICATORPRICINGOPTION(String value) {
        return new JAXBElement<String>(_GLOBALINDICATORPRICINGOPTION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRAVELLERINFORMATION }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRAVELLER_INFORMATION")
    public JAXBElement<TRAVELLERINFORMATION> createTRAVELLERINFORMATION(TRAVELLERINFORMATION value) {
        return new JAXBElement<TRAVELLERINFORMATION>(_TRAVELLERINFORMATION_QNAME, TRAVELLERINFORMATION.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_CLASS")
    public JAXBElement<String> createFARECLASS(String value) {
        return new JAXBElement<String>(_FARECLASS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_BREAK_POINT")
    public JAXBElement<Boolean> createFAREBREAKPOINT(Boolean value) {
        return new JAXBElement<Boolean>(_FAREBREAKPOINT_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRIP_PRICE_AMOUNT")
    public JAXBElement<BigDecimal> createTRIPPRICEAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TRIPPRICEAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRIP_PRICE_CURRENCY")
    public JAXBElement<String> createTRIPPRICECURRENCY(String value) {
        return new JAXBElement<String>(_TRIPPRICECURRENCY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FARE_ID")
    public JAXBElement<BigInteger> createFAREID(BigInteger value) {
        return new JAXBElement<BigInteger>(_FAREID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PASS_CORPORATE_ID")
    public JAXBElement<BigInteger> createPASSCORPORATEID(BigInteger value) {
        return new JAXBElement<BigInteger>(_PASSCORPORATEID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AIR_RULE_ID")
    public JAXBElement<BigInteger> createAIRRULEID(BigInteger value) {
        return new JAXBElement<BigInteger>(_AIRRULEID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE_BY_INPUT_ID")
    public JAXBElement<BigInteger> createPRICEBYINPUTID(BigInteger value) {
        return new JAXBElement<BigInteger>(_PRICEBYINPUTID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALL_FARES")
    public JAXBElement<BigInteger> createALLFARES(BigInteger value) {
        return new JAXBElement<BigInteger>(_ALLFARES_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_FARE_BY_BOUND")
    public JAXBElement<String> createLISTFAREBYBOUND(String value) {
        return new JAXBElement<String>(_LISTFAREBYBOUND_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USE_DISCOUNT_CARD")
    public JAXBElement<Boolean> createUSEDISCOUNTCARD(Boolean value) {
        return new JAXBElement<Boolean>(_USEDISCOUNTCARD_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CABIN_INFO_ID")
    public JAXBElement<BigInteger> createCABININFOID(BigInteger value) {
        return new JAXBElement<BigInteger>(_CABININFOID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CABIN_OPTION_VALUE")
    public JAXBElement<Object> createCABINOPTIONVALUE(Object value) {
        return new JAXBElement<Object>(_CABINOPTIONVALUE_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BACKUP_CABIN_OPTION_VALUE")
    public JAXBElement<Object> createBACKUPCABINOPTIONVALUE(Object value) {
        return new JAXBElement<Object>(_BACKUPCABINOPTIONVALUE_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CFFType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_UPSELL_CFF")
    public JAXBElement<CFFType> createLISTUPSELLCFF(CFFType value) {
        return new JAXBElement<CFFType>(_LISTUPSELLCFF_QNAME, CFFType.class, null, value);
    }

}
