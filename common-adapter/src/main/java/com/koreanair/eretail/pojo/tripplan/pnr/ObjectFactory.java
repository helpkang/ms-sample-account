
package com.koreanair.eretail.pojo.tripplan.pnr;

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
import com.koreanair.eretail.pojo.farecommon.farecontext.LISTAPPLIEDPRICINGOPTIONSType;
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
import com.koreanair.eretail.pojo.tripplan.common.common_fare.REQUESTOPTIONSType;
import com.koreanair.eretail.pojo.tripplan.common.common_rail.TRAINDISCOUNTCARDType;
import com.koreanair.eretail.pojo.tripplan.installment_plan.INSTALLMENTPLANType;
import com.koreanair.eretail.pojo.tripplan.payment_group.PAYMENTGROUPType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.koreanair.eretail.pojo.tripplan.pnr package. 
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
    private final static QName _INSTALLMENTPLAN_QNAME = new QName("", "INSTALLMENT_PLAN");
    private final static QName _PAYMENTGROUP_QNAME = new QName("", "PAYMENT_GROUP");
    private final static QName _RANKPOSITIONPAY_QNAME = new QName("", "RANK_POSITION_PAY");
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
    private final static QName _TOTALSUPPLEMENTS_QNAME = new QName("", "TOTAL_SUPPLEMENTS");
    private final static QName _UNITPRICE_QNAME = new QName("", "UNIT_PRICE");
    private final static QName _NUMBEROFUNITS_QNAME = new QName("", "NUMBER_OF_UNITS");
    private final static QName _SURCHARGES_QNAME = new QName("", "SURCHARGES");
    private final static QName _TSMAMOUNT_QNAME = new QName("", "TSM_AMOUNT");
    private final static QName _TSMCURRENCY_QNAME = new QName("", "TSM_CURRENCY");
    private final static QName _RANKPOSITION_QNAME = new QName("", "RANK_POSITION");
    private final static QName _REQUESTOPTIONS_QNAME = new QName("", "REQUEST_OPTIONS");
    private final static QName _LISTPRICINGOPTIONS_QNAME = new QName("", "LIST_PRICING_OPTIONS");
    private final static QName _SYSTEMPROVIDER_QNAME = new QName("", "SYSTEM_PROVIDER");
    private final static QName _RULEID_QNAME = new QName("", "RULE_ID");
    private final static QName _TRAINTYPE_QNAME = new QName("", "TRAIN_TYPE");
    private final static QName _LISTDISCOUNTCARD_QNAME = new QName("", "LIST_DISCOUNT_CARD");
    private final static QName _ISALTERNATESTATION_QNAME = new QName("", "IS_ALTERNATE_STATION");
    private final static QName _PNR_QNAME = new QName("", "PNR");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.koreanair.eretail.pojo.tripplan.pnr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceRequestDetailsType }
     * 
     */
    public ServiceRequestDetailsType createServiceRequestDetailsType() {
        return new ServiceRequestDetailsType();
    }

    /**
     * Create an instance of {@link ServiceRequestDetailsType.SEATREQUEST }
     * 
     */
    public ServiceRequestDetailsType.SEATREQUEST createServiceRequestDetailsTypeSEATREQUEST() {
        return new ServiceRequestDetailsType.SEATREQUEST();
    }

    /**
     * Create an instance of {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS }
     * 
     */
    public ServiceRequestDetailsType.SEATREQUEST.LISTSEATS createServiceRequestDetailsTypeSEATREQUESTLISTSEATS() {
        return new ServiceRequestDetailsType.SEATREQUEST.LISTSEATS();
    }

    /**
     * Create an instance of {@link PosType }
     * 
     */
    public PosType createPosType() {
        return new PosType();
    }

    /**
     * Create an instance of {@link QUEUESMGDSTYPE }
     * 
     */
    public QUEUESMGDSTYPE createQUEUESMGDSTYPE() {
        return new QUEUESMGDSTYPE();
    }

    /**
     * Create an instance of {@link FareRemarkType }
     * 
     */
    public FareRemarkType createFareRemarkType() {
        return new FareRemarkType();
    }

    /**
     * Create an instance of {@link TICKETINGELEMENTType }
     * 
     */
    public TICKETINGELEMENTType createTICKETINGELEMENTType() {
        return new TICKETINGELEMENTType();
    }

    /**
     * Create an instance of {@link PNRType }
     * 
     */
    public PNRType createPNRType() {
        return new PNRType();
    }

    /**
     * Create an instance of {@link PNRType.DCSDATA }
     * 
     */
    public PNRType.DCSDATA createPNRTypeDCSDATA() {
        return new PNRType.DCSDATA();
    }

    /**
     * Create an instance of {@link PNRType.DCSDATA.LISTLEG }
     * 
     */
    public PNRType.DCSDATA.LISTLEG createPNRTypeDCSDATALISTLEG() {
        return new PNRType.DCSDATA.LISTLEG();
    }

    /**
     * Create an instance of {@link PNRType.LISTELEMENTSECURITY }
     * 
     */
    public PNRType.LISTELEMENTSECURITY createPNRTypeLISTELEMENTSECURITY() {
        return new PNRType.LISTELEMENTSECURITY();
    }

    /**
     * Create an instance of {@link PNRType.LISTSERVICEREQUEST }
     * 
     */
    public PNRType.LISTSERVICEREQUEST createPNRTypeLISTSERVICEREQUEST() {
        return new PNRType.LISTSERVICEREQUEST();
    }

    /**
     * Create an instance of {@link PNRType.LISTTICKETINGELEMENT }
     * 
     */
    public PNRType.LISTTICKETINGELEMENT createPNRTypeLISTTICKETINGELEMENT() {
        return new PNRType.LISTTICKETINGELEMENT();
    }

    /**
     * Create an instance of {@link PNRType.INVOICEDATA }
     * 
     */
    public PNRType.INVOICEDATA createPNRTypeINVOICEDATA() {
        return new PNRType.INVOICEDATA();
    }

    /**
     * Create an instance of {@link PNRType.LISTMCO }
     * 
     */
    public PNRType.LISTMCO createPNRTypeLISTMCO() {
        return new PNRType.LISTMCO();
    }

    /**
     * Create an instance of {@link PNRType.LISTMCO.FAREAMOUNT }
     * 
     */
    public PNRType.LISTMCO.FAREAMOUNT createPNRTypeLISTMCOFAREAMOUNT() {
        return new PNRType.LISTMCO.FAREAMOUNT();
    }

    /**
     * Create an instance of {@link PNRType.LISTMCO.LISTTAX }
     * 
     */
    public PNRType.LISTMCO.LISTTAX createPNRTypeLISTMCOLISTTAX() {
        return new PNRType.LISTMCO.LISTTAX();
    }

    /**
     * Create an instance of {@link PNRType.EXTERNALDEPENDENCIES }
     * 
     */
    public PNRType.EXTERNALDEPENDENCIES createPNRTypeEXTERNALDEPENDENCIES() {
        return new PNRType.EXTERNALDEPENDENCIES();
    }

    /**
     * Create an instance of {@link PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY }
     * 
     */
    public PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY createPNRTypeEXTERNALDEPENDENCIESAPICONNECTIVITY() {
        return new PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY();
    }

    /**
     * Create an instance of {@link PNRType.LISTAIRLINERECLOC }
     * 
     */
    public PNRType.LISTAIRLINERECLOC createPNRTypeLISTAIRLINERECLOC() {
        return new PNRType.LISTAIRLINERECLOC();
    }

    /**
     * Create an instance of {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SMOKING }
     * 
     */
    public ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SMOKING createServiceRequestDetailsTypeSEATREQUESTLISTSEATSSMOKING() {
        return new ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SMOKING();
    }

    /**
     * Create an instance of {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATLOCATION }
     * 
     */
    public ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATLOCATION createServiceRequestDetailsTypeSEATREQUESTLISTSEATSSEATLOCATION() {
        return new ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATLOCATION();
    }

    /**
     * Create an instance of {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.LISTSEATCHARACTERISTIC }
     * 
     */
    public ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.LISTSEATCHARACTERISTIC createServiceRequestDetailsTypeSEATREQUESTLISTSEATSLISTSEATCHARACTERISTIC() {
        return new ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.LISTSEATCHARACTERISTIC();
    }

    /**
     * Create an instance of {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATSTATUS }
     * 
     */
    public ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATSTATUS createServiceRequestDetailsTypeSEATREQUESTLISTSEATSSEATSTATUS() {
        return new ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATSTATUS();
    }

    /**
     * Create an instance of {@link PosType.LOCATION }
     * 
     */
    public PosType.LOCATION createPosTypeLOCATION() {
        return new PosType.LOCATION();
    }

    /**
     * Create an instance of {@link QUEUESMGDSTYPE.LISTPRODUCT }
     * 
     */
    public QUEUESMGDSTYPE.LISTPRODUCT createQUEUESMGDSTYPELISTPRODUCT() {
        return new QUEUESMGDSTYPE.LISTPRODUCT();
    }

    /**
     * Create an instance of {@link FareRemarkType.ENDORSEMENT }
     * 
     */
    public FareRemarkType.ENDORSEMENT createFareRemarkTypeENDORSEMENT() {
        return new FareRemarkType.ENDORSEMENT();
    }

    /**
     * Create an instance of {@link FareRemarkType.DISCOUNTCOUPONINFORMATION }
     * 
     */
    public FareRemarkType.DISCOUNTCOUPONINFORMATION createFareRemarkTypeDISCOUNTCOUPONINFORMATION() {
        return new FareRemarkType.DISCOUNTCOUPONINFORMATION();
    }

    /**
     * Create an instance of {@link TICKETINGELEMENTType.DATE }
     * 
     */
    public TICKETINGELEMENTType.DATE createTICKETINGELEMENTTypeDATE() {
        return new TICKETINGELEMENTType.DATE();
    }

    /**
     * Create an instance of {@link PNRType.LISTPRODUCT }
     * 
     */
    public PNRType.LISTPRODUCT createPNRTypeLISTPRODUCT() {
        return new PNRType.LISTPRODUCT();
    }

    /**
     * Create an instance of {@link PNRType.LISTHOMOGENEOUSCHECK }
     * 
     */
    public PNRType.LISTHOMOGENEOUSCHECK createPNRTypeLISTHOMOGENEOUSCHECK() {
        return new PNRType.LISTHOMOGENEOUSCHECK();
    }

    /**
     * Create an instance of {@link PNRType.LISTRESERVATIONNUMBER }
     * 
     */
    public PNRType.LISTRESERVATIONNUMBER createPNRTypeLISTRESERVATIONNUMBER() {
        return new PNRType.LISTRESERVATIONNUMBER();
    }

    /**
     * Create an instance of {@link PNRType.BDATE }
     * 
     */
    public PNRType.BDATE createPNRTypeBDATE() {
        return new PNRType.BDATE();
    }

    /**
     * Create an instance of {@link PNRType.EDATE }
     * 
     */
    public PNRType.EDATE createPNRTypeEDATE() {
        return new PNRType.EDATE();
    }

    /**
     * Create an instance of {@link PNRType.BLOCATION }
     * 
     */
    public PNRType.BLOCATION createPNRTypeBLOCATION() {
        return new PNRType.BLOCATION();
    }

    /**
     * Create an instance of {@link PNRType.ELOCATION }
     * 
     */
    public PNRType.ELOCATION createPNRTypeELOCATION() {
        return new PNRType.ELOCATION();
    }

    /**
     * Create an instance of {@link PNRType.POSDETAILS }
     * 
     */
    public PNRType.POSDETAILS createPNRTypePOSDETAILS() {
        return new PNRType.POSDETAILS();
    }

    /**
     * Create an instance of {@link PNRType.QUEUEDATE }
     * 
     */
    public PNRType.QUEUEDATE createPNRTypeQUEUEDATE() {
        return new PNRType.QUEUEDATE();
    }

    /**
     * Create an instance of {@link PNRType.QUEUES }
     * 
     */
    public PNRType.QUEUES createPNRTypeQUEUES() {
        return new PNRType.QUEUES();
    }

    /**
     * Create an instance of {@link PNRType.QUEUEMODE }
     * 
     */
    public PNRType.QUEUEMODE createPNRTypeQUEUEMODE() {
        return new PNRType.QUEUEMODE();
    }

    /**
     * Create an instance of {@link PNRType.CREATIONDATE }
     * 
     */
    public PNRType.CREATIONDATE createPNRTypeCREATIONDATE() {
        return new PNRType.CREATIONDATE();
    }

    /**
     * Create an instance of {@link PNRType.EXPIREDATE }
     * 
     */
    public PNRType.EXPIREDATE createPNRTypeEXPIREDATE() {
        return new PNRType.EXPIREDATE();
    }

    /**
     * Create an instance of {@link PNRType.EXPIREDATEGMT }
     * 
     */
    public PNRType.EXPIREDATEGMT createPNRTypeEXPIREDATEGMT() {
        return new PNRType.EXPIREDATEGMT();
    }

    /**
     * Create an instance of {@link PNRType.BS }
     * 
     */
    public PNRType.BS createPNRTypeBS() {
        return new PNRType.BS();
    }

    /**
     * Create an instance of {@link PNRType.TICKETSTATUS }
     * 
     */
    public PNRType.TICKETSTATUS createPNRTypeTICKETSTATUS() {
        return new PNRType.TICKETSTATUS();
    }

    /**
     * Create an instance of {@link PNRType.ENDTRANSACTDATE }
     * 
     */
    public PNRType.ENDTRANSACTDATE createPNRTypeENDTRANSACTDATE() {
        return new PNRType.ENDTRANSACTDATE();
    }

    /**
     * Create an instance of {@link PNRType.TICKETTYPE }
     * 
     */
    public PNRType.TICKETTYPE createPNRTypeTICKETTYPE() {
        return new PNRType.TICKETTYPE();
    }

    /**
     * Create an instance of {@link PNRType.LISTPNRPRICE }
     * 
     */
    public PNRType.LISTPNRPRICE createPNRTypeLISTPNRPRICE() {
        return new PNRType.LISTPNRPRICE();
    }

    /**
     * Create an instance of {@link PNRType.LISTMISCPRICINGRECORD }
     * 
     */
    public PNRType.LISTMISCPRICINGRECORD createPNRTypeLISTMISCPRICINGRECORD() {
        return new PNRType.LISTMISCPRICINGRECORD();
    }

    /**
     * Create an instance of {@link PNRType.LISTTASF }
     * 
     */
    public PNRType.LISTTASF createPNRTypeLISTTASF() {
        return new PNRType.LISTTASF();
    }

    /**
     * Create an instance of {@link PNRType.LISTEXPIREDATE }
     * 
     */
    public PNRType.LISTEXPIREDATE createPNRTypeLISTEXPIREDATE() {
        return new PNRType.LISTEXPIREDATE();
    }

    /**
     * Create an instance of {@link PNRType.UPDATEDATE }
     * 
     */
    public PNRType.UPDATEDATE createPNRTypeUPDATEDATE() {
        return new PNRType.UPDATEDATE();
    }

    /**
     * Create an instance of {@link PNRType.HEADER }
     * 
     */
    public PNRType.HEADER createPNRTypeHEADER() {
        return new PNRType.HEADER();
    }

    /**
     * Create an instance of {@link PNRType.GROUPPNR }
     * 
     */
    public PNRType.GROUPPNR createPNRTypeGROUPPNR() {
        return new PNRType.GROUPPNR();
    }

    /**
     * Create an instance of {@link PNRType.TOTALBALANCE }
     * 
     */
    public PNRType.TOTALBALANCE createPNRTypeTOTALBALANCE() {
        return new PNRType.TOTALBALANCE();
    }

    /**
     * Create an instance of {@link PNRType.TPOS }
     * 
     */
    public PNRType.TPOS createPNRTypeTPOS() {
        return new PNRType.TPOS();
    }

    /**
     * Create an instance of {@link PNRType.AWARDCODE }
     * 
     */
    public PNRType.AWARDCODE createPNRTypeAWARDCODE() {
        return new PNRType.AWARDCODE();
    }

    /**
     * Create an instance of {@link PNRType.LISTPROGRAMINFORMATION }
     * 
     */
    public PNRType.LISTPROGRAMINFORMATION createPNRTypeLISTPROGRAMINFORMATION() {
        return new PNRType.LISTPROGRAMINFORMATION();
    }

    /**
     * Create an instance of {@link PNRType.LISTCOMMANDINFO }
     * 
     */
    public PNRType.LISTCOMMANDINFO createPNRTypeLISTCOMMANDINFO() {
        return new PNRType.LISTCOMMANDINFO();
    }

    /**
     * Create an instance of {@link PNRType.PNROPTIONS }
     * 
     */
    public PNRType.PNROPTIONS createPNRTypePNROPTIONS() {
        return new PNRType.PNROPTIONS();
    }

    /**
     * Create an instance of {@link PNRType.DCSDATA.LISTLEG.PAXINFO }
     * 
     */
    public PNRType.DCSDATA.LISTLEG.PAXINFO createPNRTypeDCSDATALISTLEGPAXINFO() {
        return new PNRType.DCSDATA.LISTLEG.PAXINFO();
    }

    /**
     * Create an instance of {@link PNRType.DCSDATA.LISTLEG.CHECKININFO }
     * 
     */
    public PNRType.DCSDATA.LISTLEG.CHECKININFO createPNRTypeDCSDATALISTLEGCHECKININFO() {
        return new PNRType.DCSDATA.LISTLEG.CHECKININFO();
    }

    /**
     * Create an instance of {@link PNRType.DCSDATA.LISTLEG.BAGGAGEINFO }
     * 
     */
    public PNRType.DCSDATA.LISTLEG.BAGGAGEINFO createPNRTypeDCSDATALISTLEGBAGGAGEINFO() {
        return new PNRType.DCSDATA.LISTLEG.BAGGAGEINFO();
    }

    /**
     * Create an instance of {@link PNRType.DCSDATA.LISTLEG.BOARDINGINFO }
     * 
     */
    public PNRType.DCSDATA.LISTLEG.BOARDINGINFO createPNRTypeDCSDATALISTLEGBOARDINGINFO() {
        return new PNRType.DCSDATA.LISTLEG.BOARDINGINFO();
    }

    /**
     * Create an instance of {@link PNRType.DCSDATA.LISTLEG.REGRADEINFO }
     * 
     */
    public PNRType.DCSDATA.LISTLEG.REGRADEINFO createPNRTypeDCSDATALISTLEGREGRADEINFO() {
        return new PNRType.DCSDATA.LISTLEG.REGRADEINFO();
    }

    /**
     * Create an instance of {@link PNRType.LISTELEMENTSECURITY.LISTRECEIVER }
     * 
     */
    public PNRType.LISTELEMENTSECURITY.LISTRECEIVER createPNRTypeLISTELEMENTSECURITYLISTRECEIVER() {
        return new PNRType.LISTELEMENTSECURITY.LISTRECEIVER();
    }

    /**
     * Create an instance of {@link PNRType.LISTSERVICEREQUEST.AIRLINE }
     * 
     */
    public PNRType.LISTSERVICEREQUEST.AIRLINE createPNRTypeLISTSERVICEREQUESTAIRLINE() {
        return new PNRType.LISTSERVICEREQUEST.AIRLINE();
    }

    /**
     * Create an instance of {@link PNRType.LISTSERVICEREQUEST.LISTADDITIONALSEATLINKED }
     * 
     */
    public PNRType.LISTSERVICEREQUEST.LISTADDITIONALSEATLINKED createPNRTypeLISTSERVICEREQUESTLISTADDITIONALSEATLINKED() {
        return new PNRType.LISTSERVICEREQUEST.LISTADDITIONALSEATLINKED();
    }

    /**
     * Create an instance of {@link PNRType.LISTSERVICEREQUEST.ELOCATION }
     * 
     */
    public PNRType.LISTSERVICEREQUEST.ELOCATION createPNRTypeLISTSERVICEREQUESTELOCATION() {
        return new PNRType.LISTSERVICEREQUEST.ELOCATION();
    }

    /**
     * Create an instance of {@link PNRType.LISTSERVICEREQUEST.BLOCATION }
     * 
     */
    public PNRType.LISTSERVICEREQUEST.BLOCATION createPNRTypeLISTSERVICEREQUESTBLOCATION() {
        return new PNRType.LISTSERVICEREQUEST.BLOCATION();
    }

    /**
     * Create an instance of {@link PNRType.LISTTICKETINGELEMENT.DATE }
     * 
     */
    public PNRType.LISTTICKETINGELEMENT.DATE createPNRTypeLISTTICKETINGELEMENTDATE() {
        return new PNRType.LISTTICKETINGELEMENT.DATE();
    }

    /**
     * Create an instance of {@link PNRType.LISTTICKETINGELEMENT.AIRLINE }
     * 
     */
    public PNRType.LISTTICKETINGELEMENT.AIRLINE createPNRTypeLISTTICKETINGELEMENTAIRLINE() {
        return new PNRType.LISTTICKETINGELEMENT.AIRLINE();
    }

    /**
     * Create an instance of {@link PNRType.INVOICEDATA.AIRFAREFROMREMARKS }
     * 
     */
    public PNRType.INVOICEDATA.AIRFAREFROMREMARKS createPNRTypeINVOICEDATAAIRFAREFROMREMARKS() {
        return new PNRType.INVOICEDATA.AIRFAREFROMREMARKS();
    }

    /**
     * Create an instance of {@link PNRType.LISTMCO.CURRENCY }
     * 
     */
    public PNRType.LISTMCO.CURRENCY createPNRTypeLISTMCOCURRENCY() {
        return new PNRType.LISTMCO.CURRENCY();
    }

    /**
     * Create an instance of {@link PNRType.LISTMCO.FAREAMOUNT.CURRENCY }
     * 
     */
    public PNRType.LISTMCO.FAREAMOUNT.CURRENCY createPNRTypeLISTMCOFAREAMOUNTCURRENCY() {
        return new PNRType.LISTMCO.FAREAMOUNT.CURRENCY();
    }

    /**
     * Create an instance of {@link PNRType.LISTMCO.LISTTAX.CURRENCY }
     * 
     */
    public PNRType.LISTMCO.LISTTAX.CURRENCY createPNRTypeLISTMCOLISTTAXCURRENCY() {
        return new PNRType.LISTMCO.LISTTAX.CURRENCY();
    }

    /**
     * Create an instance of {@link PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY.APISETTINGS }
     * 
     */
    public PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY.APISETTINGS createPNRTypeEXTERNALDEPENDENCIESAPICONNECTIVITYAPISETTINGS() {
        return new PNRType.EXTERNALDEPENDENCIES.APICONNECTIVITY.APISETTINGS();
    }

    /**
     * Create an instance of {@link PNRType.LISTAIRLINERECLOC.AIRLINE }
     * 
     */
    public PNRType.LISTAIRLINERECLOC.AIRLINE createPNRTypeLISTAIRLINERECLOCAIRLINE() {
        return new PNRType.LISTAIRLINERECLOC.AIRLINE();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link INSTALLMENTPLANType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INSTALLMENT_PLAN")
    public JAXBElement<INSTALLMENTPLANType> createINSTALLMENTPLAN(INSTALLMENTPLANType value) {
        return new JAXBElement<INSTALLMENTPLANType>(_INSTALLMENTPLAN_QNAME, INSTALLMENTPLANType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PAYMENTGROUPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PAYMENT_GROUP")
    public JAXBElement<PAYMENTGROUPType> createPAYMENTGROUP(PAYMENTGROUPType value) {
        return new JAXBElement<PAYMENTGROUPType>(_PAYMENTGROUP_QNAME, PAYMENTGROUPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RANK_POSITION_PAY")
    public JAXBElement<Integer> createRANKPOSITIONPAY(Integer value) {
        return new JAXBElement<Integer>(_RANKPOSITIONPAY_QNAME, Integer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOTAL_SUPPLEMENTS")
    public JAXBElement<BigDecimal> createTOTALSUPPLEMENTS(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TOTALSUPPLEMENTS_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UNIT_PRICE")
    public JAXBElement<BigDecimal> createUNITPRICE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UNITPRICE_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NUMBER_OF_UNITS")
    public JAXBElement<BigInteger> createNUMBEROFUNITS(BigInteger value) {
        return new JAXBElement<BigInteger>(_NUMBEROFUNITS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SURCHARGES")
    public JAXBElement<BigDecimal> createSURCHARGES(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SURCHARGES_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TSM_AMOUNT")
    public JAXBElement<BigDecimal> createTSMAMOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TSMAMOUNT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TSM_CURRENCY")
    public JAXBElement<String> createTSMCURRENCY(String value) {
        return new JAXBElement<String>(_TSMCURRENCY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RANK_POSITION")
    public JAXBElement<Integer> createRANKPOSITION(Integer value) {
        return new JAXBElement<Integer>(_RANKPOSITION_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REQUESTOPTIONSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REQUEST_OPTIONS")
    public JAXBElement<REQUESTOPTIONSType> createREQUESTOPTIONS(REQUESTOPTIONSType value) {
        return new JAXBElement<REQUESTOPTIONSType>(_REQUESTOPTIONS_QNAME, REQUESTOPTIONSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTAPPLIEDPRICINGOPTIONSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LIST_PRICING_OPTIONS")
    public JAXBElement<LISTAPPLIEDPRICINGOPTIONSType> createLISTPRICINGOPTIONS(LISTAPPLIEDPRICINGOPTIONSType value) {
        return new JAXBElement<LISTAPPLIEDPRICINGOPTIONSType>(_LISTPRICINGOPTIONS_QNAME, LISTAPPLIEDPRICINGOPTIONSType.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PNRType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNR")
    public JAXBElement<PNRType> createPNR(PNRType value) {
        return new JAXBElement<PNRType>(_PNR_QNAME, PNRType.class, null, value);
    }

}
