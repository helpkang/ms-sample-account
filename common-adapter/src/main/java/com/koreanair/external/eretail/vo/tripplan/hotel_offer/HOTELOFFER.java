
package com.koreanair.external.eretail.vo.tripplan.hotel_offer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.hotel.reservation.common.CodeNameType;
import com.koreanair.external.eretail.vo.hotel.reservation.common.DateType;
import com.koreanair.external.eretail.vo.hotel.reservation.common.ListPriceType;
import com.koreanair.external.eretail.vo.hotel.reservation.common.SimplePriceType;
import com.koreanair.external.eretail.vo.hotel.reservation.common.TotalPricingType;
import com.koreanair.external.eretail.vo.tripplan.common.common_technical_ids.TechnicalIds;
import com.koreanair.external.eretail.vo.tripplan.hotel.AdditionalFieldType;
import com.koreanair.external.eretail.vo.tripplan.hotel.AdditionalPricingInfoType;
import com.koreanair.external.eretail.vo.tripplan.hotel.AddressInformationType;
import com.koreanair.external.eretail.vo.tripplan.hotel.BillbackDataType;
import com.koreanair.external.eretail.vo.tripplan.hotel.CancellationType;
import com.koreanair.external.eretail.vo.tripplan.hotel.CommissionType;
import com.koreanair.external.eretail.vo.tripplan.hotel.CompanyType;
import com.koreanair.external.eretail.vo.tripplan.hotel.ContactType;
import com.koreanair.external.eretail.vo.tripplan.hotel.DailyRateType;
import com.koreanair.external.eretail.vo.tripplan.hotel.GeocodeType;
import com.koreanair.external.eretail.vo.tripplan.hotel.HotelInformationType;
import com.koreanair.external.eretail.vo.tripplan.hotel.IdentityDocumentInformationType;
import com.koreanair.external.eretail.vo.tripplan.hotel.InternalGroupDataType;
import com.koreanair.external.eretail.vo.tripplan.hotel.MultimediaDetailsType;
import com.koreanair.external.eretail.vo.tripplan.hotel.PaymentInformationType;
import com.koreanair.external.eretail.vo.tripplan.hotel.RoomInformationType;
import com.koreanair.external.eretail.vo.tripplan.hotel.SellInformationType;
import com.koreanair.external.eretail.vo.tripplan.hotel.ServiceType;
import com.koreanair.external.eretail.vo.tripplan.hotel.SpecialServiceRequestType;
import com.koreanair.external.eretail.vo.tripplan.hotel.StructuredPorType;
import com.koreanair.external.eretail.vo.tripplan.hotel.TotalRateType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}hotelofferGroup"/&gt;
 *         &lt;group ref="{}CommonItinerary"/&gt;
 *         &lt;group ref="{}hotelGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "offerid",
    "offertattoo",
    "offerstatus",
    "nonhomogeneous",
    "validitydate",
    "offerupdated",
    "newofferrates",
    "type",
    "itemid",
    "activegds",
    "segmenttatoo",
    "tatooother",
    "status",
    "description",
    "initialelement",
    "deletedelement",
    "isreplacing",
    "tobereplaced",
    "bookedelement",
    "itemidtobereplaced",
    "listtravellerid",
    "permissions",
    "eligibilityinformation",
    "pnrinformation",
    "issuedate",
    "technicalids",
    "actioncode",
    "blocation",
    "bdate",
    "edate",
    "company",
    "groupinfo",
    "payment",
    "hotel",
    "geocode",
    "multimediadetails",
    "occupancy",
    "guarantee",
    "area",
    "transportation",
    "roomtype",
    "bedtype",
    "meal",
    "listservice",
    "bedcount",
    "gdsroomtype",
    "checkinpolicy",
    "specialratetype",
    "ratechange",
    "corporateidrequired",
    "guaranteerequired",
    "depositrequired",
    "checkotherfeatures",
    "rates",
    "travellerid",
    "remark",
    "confirmationnumber",
    "cancellationnumber",
    "cancellationpolicy",
    "corporateid",
    "numberofrooms",
    "bookingcode",
    "listadditionalfield",
    "listproviderroomratedescription",
    "checksellrules",
    "listspecialrate",
    "numofnights",
    "bookingsource",
    "linenumber",
    "remarksellfail",
    "boolisoutofpolicy",
    "hotelinpolicy",
    "justificationcode",
    "justificationcodedesc",
    "justificationfreetext",
    "lowestrate",
    "specialservicerequests",
    "listsellinformation",
    "listroominfo",
    "listcontact",
    "invoice",
    "source",
    "isonestepcmt",
    "termsandconditions",
    "commission",
    "listcancellation",
    "additionalpricinginfo",
    "markupoverridable",
    "markupindicator",
    "ugcoptouturl",
    "multiplicity",
    "breakfast"
})
@XmlRootElement(name = "HOTEL_OFFER")
public class HOTELOFFER
    implements Serializable
{

    @XmlElement(name = "OFFER_ID", required = true)
    protected BigInteger offerid;
    @XmlElement(name = "OFFER_TATTOO")
    protected String offertattoo;
    @XmlElement(name = "OFFER_STATUS")
    protected HOTELOFFER.OFFERSTATUS offerstatus;
    @XmlElement(name = "NON_HOMOGENEOUS")
    protected Boolean nonhomogeneous;
    @XmlElement(name = "VALIDITY_DATE")
    protected HOTELOFFER.VALIDITYDATE validitydate;
    @XmlElement(name = "OFFER_UPDATED")
    protected Boolean offerupdated;
    @XmlElement(name = "NEW_OFFER_RATES")
    protected HOTELOFFER.NEWOFFERRATES newofferrates;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "ITEM_ID")
    protected BigInteger itemid;
    @XmlElement(name = "ACTIVE_GDS")
    protected String activegds;
    @XmlElement(name = "SEGMENT_TATOO")
    protected BigInteger segmenttatoo;
    @XmlElement(name = "TATOO_OTHER")
    protected BigInteger tatooother;
    @XmlElement(name = "STATUS")
    protected HOTELOFFER.STATUS status;
    @XmlElement(name = "DESCRIPTION")
    protected HOTELOFFER.DESCRIPTION description;
    @XmlElement(name = "INITIAL_ELEMENT")
    protected Boolean initialelement;
    @XmlElement(name = "DELETED_ELEMENT")
    protected Boolean deletedelement;
    @XmlElement(name = "IS_REPLACING")
    protected Boolean isreplacing;
    @XmlElement(name = "TO_BE_REPLACED")
    protected Boolean tobereplaced;
    @XmlElement(name = "BOOKED_ELEMENT")
    protected Boolean bookedelement;
    @XmlElement(name = "ITEM_ID_TO_BE_REPLACED")
    protected BigInteger itemidtobereplaced;
    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<BigInteger> listtravellerid;
    @XmlElement(name = "PERMISSIONS")
    protected HOTELOFFER.PERMISSIONS permissions;
    @XmlElement(name = "ELIGIBILITY_INFORMATION")
    protected HOTELOFFER.ELIGIBILITYINFORMATION eligibilityinformation;
    @XmlElement(name = "PNR_INFORMATION")
    protected HOTELOFFER.PNRINFORMATION pnrinformation;
    @XmlElement(name = "ISSUE_DATE")
    protected HOTELOFFER.ISSUEDATE issuedate;
    @XmlElement(name = "TECHNICAL_IDS")
    protected TechnicalIds technicalids;
    @XmlElement(name = "ACTION_CODE")
    protected String actioncode;
    @XmlElement(name = "B_LOCATION", required = true)
    protected HOTELOFFER.BLOCATION blocation;
    @XmlElement(name = "B_DATE", required = true)
    protected DateType bdate;
    @XmlElement(name = "E_DATE", required = true)
    protected DateType edate;
    @XmlElement(name = "COMPANY", required = true)
    protected CompanyType company;
    @XmlElement(name = "GROUP_INFO")
    protected HOTELOFFER.GROUPINFO groupinfo;
    @XmlElement(name = "PAYMENT")
    protected PaymentInformationType payment;
    @XmlElement(name = "HOTEL", required = true)
    protected HotelInformationType hotel;
    @XmlElement(name = "GEOCODE")
    protected GeocodeType geocode;
    @XmlElement(name = "MULTIMEDIA_DETAILS")
    protected MultimediaDetailsType multimediadetails;
    @XmlElement(name = "OCCUPANCY")
    protected CodeNameType occupancy;
    @XmlElement(name = "GUARANTEE")
    protected HOTELOFFER.GUARANTEE guarantee;
    @XmlElement(name = "AREA")
    protected CodeNameType area;
    @XmlElement(name = "TRANSPORTATION")
    protected CodeNameType transportation;
    @XmlElement(name = "ROOM_TYPE", required = true)
    protected CodeNameType roomtype;
    @XmlElement(name = "BED_TYPE")
    protected CodeNameType bedtype;
    @XmlElement(name = "MEAL")
    protected CodeNameType meal;
    @XmlElement(name = "LIST_SERVICE")
    protected List<ServiceType> listservice;
    @XmlElement(name = "BED_COUNT")
    protected Integer bedcount;
    @XmlElement(name = "GDS_ROOM_TYPE")
    protected String gdsroomtype;
    @XmlElement(name = "CHECK_IN_POLICY")
    protected CodeNameType checkinpolicy;
    @XmlElement(name = "SPECIAL_RATE_TYPE")
    protected HOTELOFFER.SPECIALRATETYPE specialratetype;
    @XmlElement(name = "RATE_CHANGE")
    protected Boolean ratechange;
    @XmlElement(name = "CORPORATE_ID_REQUIRED")
    protected Boolean corporateidrequired;
    @XmlElement(name = "GUARANTEE_REQUIRED")
    protected Boolean guaranteerequired;
    @XmlElement(name = "DEPOSIT_REQUIRED")
    protected Boolean depositrequired;
    @XmlElement(name = "CHECK_OTHER_FEATURES")
    protected Boolean checkotherfeatures;
    @XmlElement(name = "RATES")
    protected HOTELOFFER.RATES rates;
    @XmlElement(name = "TRAVELLER_ID")
    protected Integer travellerid;
    @XmlElement(name = "REMARK")
    protected String remark;
    @XmlElement(name = "CONFIRMATION_NUMBER")
    protected String confirmationnumber;
    @XmlElement(name = "CANCELLATION_NUMBER")
    protected String cancellationnumber;
    @XmlElement(name = "CANCELLATION_POLICY")
    protected String cancellationpolicy;
    @XmlElement(name = "CORPORATE_ID")
    protected String corporateid;
    @XmlElement(name = "NUMBER_OF_ROOMS")
    protected Integer numberofrooms;
    @XmlElement(name = "BOOKING_CODE")
    protected String bookingcode;
    @XmlElement(name = "LIST_ADDITIONAL_FIELD")
    protected List<AdditionalFieldType> listadditionalfield;
    @XmlElement(name = "LIST_PROVIDER_ROOM_RATE_DESCRIPTION")
    protected List<String> listproviderroomratedescription;
    @XmlElement(name = "CHECK_SELL_RULES")
    protected Boolean checksellrules;
    @XmlElement(name = "LIST_SPECIAL_RATE")
    protected List<String> listspecialrate;
    @XmlElement(name = "NUM_OF_NIGHTS")
    protected Integer numofnights;
    @XmlElement(name = "BOOKING_SOURCE")
    protected String bookingsource;
    @XmlElement(name = "LINE_NUMBER")
    protected Integer linenumber;
    @XmlElement(name = "REMARK_SELL_FAIL")
    protected String remarksellfail;
    @XmlElement(name = "BOOL_IS_OUT_OF_POLICY")
    protected Boolean boolisoutofpolicy;
    @XmlElement(name = "HOTEL_IN_POLICY")
    protected Boolean hotelinpolicy;
    @XmlElement(name = "JUSTIFICATION_CODE")
    protected String justificationcode;
    @XmlElement(name = "JUSTIFICATION_CODE_DESC")
    protected String justificationcodedesc;
    @XmlElement(name = "JUSTIFICATION_FREE_TEXT")
    protected String justificationfreetext;
    @XmlElement(name = "LOWEST_RATE")
    protected ListPriceType lowestrate;
    @XmlElement(name = "SPECIAL_SERVICE_REQUESTS")
    protected SpecialServiceRequestType specialservicerequests;
    @XmlElement(name = "LIST_SELL_INFORMATION")
    protected List<SellInformationType> listsellinformation;
    @XmlElement(name = "LIST_ROOM_INFO")
    protected List<RoomInformationType> listroominfo;
    @XmlElement(name = "LIST_CONTACT")
    protected List<ContactType> listcontact;
    @XmlElement(name = "INVOICE")
    protected HOTELOFFER.INVOICE invoice;
    @XmlElement(name = "SOURCE")
    protected String source;
    @XmlElement(name = "IS_ONE_STEP_CMT")
    protected Boolean isonestepcmt;
    @XmlElement(name = "TERMS_AND_CONDITIONS")
    protected HOTELOFFER.TERMSANDCONDITIONS termsandconditions;
    @XmlElement(name = "COMMISSION")
    protected CommissionType commission;
    @XmlElement(name = "LIST_CANCELLATION")
    protected List<CancellationType> listcancellation;
    @XmlElement(name = "ADDITIONAL_PRICING_INFO")
    protected AdditionalPricingInfoType additionalpricinginfo;
    @XmlElement(name = "MARKUP_OVERRIDABLE")
    protected Boolean markupoverridable;
    @XmlElement(name = "MARKUP_INDICATOR")
    protected Boolean markupindicator;
    @XmlElement(name = "UGC_OPTOUT_URL")
    protected String ugcoptouturl;
    @XmlElement(name = "MULTIPLICITY")
    protected HOTELOFFER.MULTIPLICITY multiplicity;
    @XmlElement(name = "BREAKFAST")
    protected HOTELOFFER.BREAKFAST breakfast;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the offerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOFFERID() {
        return offerid;
    }

    /**
     * Sets the value of the offerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOFFERID(BigInteger value) {
        this.offerid = value;
    }

    /**
     * Gets the value of the offertattoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFERTATTOO() {
        return offertattoo;
    }

    /**
     * Sets the value of the offertattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFERTATTOO(String value) {
        this.offertattoo = value;
    }

    /**
     * Gets the value of the offerstatus property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.OFFERSTATUS }
     *     
     */
    public HOTELOFFER.OFFERSTATUS getOFFERSTATUS() {
        return offerstatus;
    }

    /**
     * Sets the value of the offerstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.OFFERSTATUS }
     *     
     */
    public void setOFFERSTATUS(HOTELOFFER.OFFERSTATUS value) {
        this.offerstatus = value;
    }

    /**
     * Gets the value of the nonhomogeneous property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNONHOMOGENEOUS() {
        return nonhomogeneous;
    }

    /**
     * Sets the value of the nonhomogeneous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNONHOMOGENEOUS(Boolean value) {
        this.nonhomogeneous = value;
    }

    /**
     * Gets the value of the validitydate property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.VALIDITYDATE }
     *     
     */
    public HOTELOFFER.VALIDITYDATE getVALIDITYDATE() {
        return validitydate;
    }

    /**
     * Sets the value of the validitydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.VALIDITYDATE }
     *     
     */
    public void setVALIDITYDATE(HOTELOFFER.VALIDITYDATE value) {
        this.validitydate = value;
    }

    /**
     * Gets the value of the offerupdated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOFFERUPDATED() {
        return offerupdated;
    }

    /**
     * Sets the value of the offerupdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOFFERUPDATED(Boolean value) {
        this.offerupdated = value;
    }

    /**
     * Gets the value of the newofferrates property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.NEWOFFERRATES }
     *     
     */
    public HOTELOFFER.NEWOFFERRATES getNEWOFFERRATES() {
        return newofferrates;
    }

    /**
     * Sets the value of the newofferrates property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.NEWOFFERRATES }
     *     
     */
    public void setNEWOFFERRATES(HOTELOFFER.NEWOFFERRATES value) {
        this.newofferrates = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMID(BigInteger value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the activegds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIVEGDS() {
        return activegds;
    }

    /**
     * Sets the value of the activegds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIVEGDS(String value) {
        this.activegds = value;
    }

    /**
     * Gets the value of the segmenttatoo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTTATOO() {
        return segmenttatoo;
    }

    /**
     * Sets the value of the segmenttatoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTTATOO(BigInteger value) {
        this.segmenttatoo = value;
    }

    /**
     * Gets the value of the tatooother property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTATOOOTHER() {
        return tatooother;
    }

    /**
     * Sets the value of the tatooother property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTATOOOTHER(BigInteger value) {
        this.tatooother = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.STATUS }
     *     
     */
    public HOTELOFFER.STATUS getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.STATUS }
     *     
     */
    public void setSTATUS(HOTELOFFER.STATUS value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.DESCRIPTION }
     *     
     */
    public HOTELOFFER.DESCRIPTION getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.DESCRIPTION }
     *     
     */
    public void setDESCRIPTION(HOTELOFFER.DESCRIPTION value) {
        this.description = value;
    }

    /**
     * Gets the value of the initialelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINITIALELEMENT() {
        return initialelement;
    }

    /**
     * Sets the value of the initialelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINITIALELEMENT(Boolean value) {
        this.initialelement = value;
    }

    /**
     * Gets the value of the deletedelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDELETEDELEMENT() {
        return deletedelement;
    }

    /**
     * Sets the value of the deletedelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDELETEDELEMENT(Boolean value) {
        this.deletedelement = value;
    }

    /**
     * Gets the value of the isreplacing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISREPLACING() {
        return isreplacing;
    }

    /**
     * Sets the value of the isreplacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISREPLACING(Boolean value) {
        this.isreplacing = value;
    }

    /**
     * Gets the value of the tobereplaced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTOBEREPLACED() {
        return tobereplaced;
    }

    /**
     * Sets the value of the tobereplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTOBEREPLACED(Boolean value) {
        this.tobereplaced = value;
    }

    /**
     * Gets the value of the bookedelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOKEDELEMENT() {
        return bookedelement;
    }

    /**
     * Sets the value of the bookedelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOKEDELEMENT(Boolean value) {
        this.bookedelement = value;
    }

    /**
     * Gets the value of the itemidtobereplaced property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMIDTOBEREPLACED() {
        return itemidtobereplaced;
    }

    /**
     * Sets the value of the itemidtobereplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMIDTOBEREPLACED(BigInteger value) {
        this.itemidtobereplaced = value;
    }

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<BigInteger>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.PERMISSIONS }
     *     
     */
    public HOTELOFFER.PERMISSIONS getPERMISSIONS() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.PERMISSIONS }
     *     
     */
    public void setPERMISSIONS(HOTELOFFER.PERMISSIONS value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the eligibilityinformation property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.ELIGIBILITYINFORMATION }
     *     
     */
    public HOTELOFFER.ELIGIBILITYINFORMATION getELIGIBILITYINFORMATION() {
        return eligibilityinformation;
    }

    /**
     * Sets the value of the eligibilityinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.ELIGIBILITYINFORMATION }
     *     
     */
    public void setELIGIBILITYINFORMATION(HOTELOFFER.ELIGIBILITYINFORMATION value) {
        this.eligibilityinformation = value;
    }

    /**
     * Gets the value of the pnrinformation property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.PNRINFORMATION }
     *     
     */
    public HOTELOFFER.PNRINFORMATION getPNRINFORMATION() {
        return pnrinformation;
    }

    /**
     * Sets the value of the pnrinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.PNRINFORMATION }
     *     
     */
    public void setPNRINFORMATION(HOTELOFFER.PNRINFORMATION value) {
        this.pnrinformation = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.ISSUEDATE }
     *     
     */
    public HOTELOFFER.ISSUEDATE getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.ISSUEDATE }
     *     
     */
    public void setISSUEDATE(HOTELOFFER.ISSUEDATE value) {
        this.issuedate = value;
    }

    /**
     * Gets the value of the technicalids property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalIds }
     *     
     */
    public TechnicalIds getTECHNICALIDS() {
        return technicalids;
    }

    /**
     * Sets the value of the technicalids property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalIds }
     *     
     */
    public void setTECHNICALIDS(TechnicalIds value) {
        this.technicalids = value;
    }

    /**
     * Gets the value of the actioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIONCODE() {
        return actioncode;
    }

    /**
     * Sets the value of the actioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIONCODE(String value) {
        this.actioncode = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.BLOCATION }
     *     
     */
    public HOTELOFFER.BLOCATION getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.BLOCATION }
     *     
     */
    public void setBLOCATION(HOTELOFFER.BLOCATION value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setBDATE(DateType value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setEDATE(DateType value) {
        this.edate = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getCOMPANY() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setCOMPANY(CompanyType value) {
        this.company = value;
    }

    /**
     * Gets the value of the groupinfo property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.GROUPINFO }
     *     
     */
    public HOTELOFFER.GROUPINFO getGROUPINFO() {
        return groupinfo;
    }

    /**
     * Sets the value of the groupinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.GROUPINFO }
     *     
     */
    public void setGROUPINFO(HOTELOFFER.GROUPINFO value) {
        this.groupinfo = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInformationType }
     *     
     */
    public PaymentInformationType getPAYMENT() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInformationType }
     *     
     */
    public void setPAYMENT(PaymentInformationType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInformationType }
     *     
     */
    public HotelInformationType getHOTEL() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInformationType }
     *     
     */
    public void setHOTEL(HotelInformationType value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the geocode property.
     * 
     * @return
     *     possible object is
     *     {@link GeocodeType }
     *     
     */
    public GeocodeType getGEOCODE() {
        return geocode;
    }

    /**
     * Sets the value of the geocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeocodeType }
     *     
     */
    public void setGEOCODE(GeocodeType value) {
        this.geocode = value;
    }

    /**
     * Gets the value of the multimediadetails property.
     * 
     * @return
     *     possible object is
     *     {@link MultimediaDetailsType }
     *     
     */
    public MultimediaDetailsType getMULTIMEDIADETAILS() {
        return multimediadetails;
    }

    /**
     * Sets the value of the multimediadetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultimediaDetailsType }
     *     
     */
    public void setMULTIMEDIADETAILS(MultimediaDetailsType value) {
        this.multimediadetails = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNameType }
     *     
     */
    public CodeNameType getOCCUPANCY() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNameType }
     *     
     */
    public void setOCCUPANCY(CodeNameType value) {
        this.occupancy = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.GUARANTEE }
     *     
     */
    public HOTELOFFER.GUARANTEE getGUARANTEE() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.GUARANTEE }
     *     
     */
    public void setGUARANTEE(HOTELOFFER.GUARANTEE value) {
        this.guarantee = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNameType }
     *     
     */
    public CodeNameType getAREA() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNameType }
     *     
     */
    public void setAREA(CodeNameType value) {
        this.area = value;
    }

    /**
     * Gets the value of the transportation property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNameType }
     *     
     */
    public CodeNameType getTRANSPORTATION() {
        return transportation;
    }

    /**
     * Sets the value of the transportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNameType }
     *     
     */
    public void setTRANSPORTATION(CodeNameType value) {
        this.transportation = value;
    }

    /**
     * Gets the value of the roomtype property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNameType }
     *     
     */
    public CodeNameType getROOMTYPE() {
        return roomtype;
    }

    /**
     * Sets the value of the roomtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNameType }
     *     
     */
    public void setROOMTYPE(CodeNameType value) {
        this.roomtype = value;
    }

    /**
     * Gets the value of the bedtype property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNameType }
     *     
     */
    public CodeNameType getBEDTYPE() {
        return bedtype;
    }

    /**
     * Sets the value of the bedtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNameType }
     *     
     */
    public void setBEDTYPE(CodeNameType value) {
        this.bedtype = value;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNameType }
     *     
     */
    public CodeNameType getMEAL() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNameType }
     *     
     */
    public void setMEAL(CodeNameType value) {
        this.meal = value;
    }

    /**
     * Gets the value of the listservice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * 
     * 
     */
    public List<ServiceType> getLISTSERVICE() {
        if (listservice == null) {
            listservice = new ArrayList<ServiceType>();
        }
        return this.listservice;
    }

    /**
     * Gets the value of the bedcount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBEDCOUNT() {
        return bedcount;
    }

    /**
     * Sets the value of the bedcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBEDCOUNT(Integer value) {
        this.bedcount = value;
    }

    /**
     * Gets the value of the gdsroomtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDSROOMTYPE() {
        return gdsroomtype;
    }

    /**
     * Sets the value of the gdsroomtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDSROOMTYPE(String value) {
        this.gdsroomtype = value;
    }

    /**
     * Gets the value of the checkinpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNameType }
     *     
     */
    public CodeNameType getCHECKINPOLICY() {
        return checkinpolicy;
    }

    /**
     * Sets the value of the checkinpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNameType }
     *     
     */
    public void setCHECKINPOLICY(CodeNameType value) {
        this.checkinpolicy = value;
    }

    /**
     * Gets the value of the specialratetype property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.SPECIALRATETYPE }
     *     
     */
    public HOTELOFFER.SPECIALRATETYPE getSPECIALRATETYPE() {
        return specialratetype;
    }

    /**
     * Sets the value of the specialratetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.SPECIALRATETYPE }
     *     
     */
    public void setSPECIALRATETYPE(HOTELOFFER.SPECIALRATETYPE value) {
        this.specialratetype = value;
    }

    /**
     * Gets the value of the ratechange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRATECHANGE() {
        return ratechange;
    }

    /**
     * Sets the value of the ratechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRATECHANGE(Boolean value) {
        this.ratechange = value;
    }

    /**
     * Gets the value of the corporateidrequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCORPORATEIDREQUIRED() {
        return corporateidrequired;
    }

    /**
     * Sets the value of the corporateidrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCORPORATEIDREQUIRED(Boolean value) {
        this.corporateidrequired = value;
    }

    /**
     * Gets the value of the guaranteerequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGUARANTEEREQUIRED() {
        return guaranteerequired;
    }

    /**
     * Sets the value of the guaranteerequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGUARANTEEREQUIRED(Boolean value) {
        this.guaranteerequired = value;
    }

    /**
     * Gets the value of the depositrequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDEPOSITREQUIRED() {
        return depositrequired;
    }

    /**
     * Sets the value of the depositrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDEPOSITREQUIRED(Boolean value) {
        this.depositrequired = value;
    }

    /**
     * Gets the value of the checkotherfeatures property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCHECKOTHERFEATURES() {
        return checkotherfeatures;
    }

    /**
     * Sets the value of the checkotherfeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCHECKOTHERFEATURES(Boolean value) {
        this.checkotherfeatures = value;
    }

    /**
     * Gets the value of the rates property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.RATES }
     *     
     */
    public HOTELOFFER.RATES getRATES() {
        return rates;
    }

    /**
     * Sets the value of the rates property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.RATES }
     *     
     */
    public void setRATES(HOTELOFFER.RATES value) {
        this.rates = value;
    }

    /**
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTRAVELLERID(Integer value) {
        this.travellerid = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the confirmationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIRMATIONNUMBER() {
        return confirmationnumber;
    }

    /**
     * Sets the value of the confirmationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIRMATIONNUMBER(String value) {
        this.confirmationnumber = value;
    }

    /**
     * Gets the value of the cancellationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANCELLATIONNUMBER() {
        return cancellationnumber;
    }

    /**
     * Sets the value of the cancellationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANCELLATIONNUMBER(String value) {
        this.cancellationnumber = value;
    }

    /**
     * Gets the value of the cancellationpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANCELLATIONPOLICY() {
        return cancellationpolicy;
    }

    /**
     * Sets the value of the cancellationpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANCELLATIONPOLICY(String value) {
        this.cancellationpolicy = value;
    }

    /**
     * Gets the value of the corporateid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCORPORATEID() {
        return corporateid;
    }

    /**
     * Sets the value of the corporateid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCORPORATEID(String value) {
        this.corporateid = value;
    }

    /**
     * Gets the value of the numberofrooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUMBEROFROOMS() {
        return numberofrooms;
    }

    /**
     * Sets the value of the numberofrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUMBEROFROOMS(Integer value) {
        this.numberofrooms = value;
    }

    /**
     * Gets the value of the bookingcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKINGCODE() {
        return bookingcode;
    }

    /**
     * Sets the value of the bookingcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKINGCODE(String value) {
        this.bookingcode = value;
    }

    /**
     * Gets the value of the listadditionalfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALFIELD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFieldType }
     * 
     * 
     */
    public List<AdditionalFieldType> getLISTADDITIONALFIELD() {
        if (listadditionalfield == null) {
            listadditionalfield = new ArrayList<AdditionalFieldType>();
        }
        return this.listadditionalfield;
    }

    /**
     * Gets the value of the listproviderroomratedescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproviderroomratedescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROVIDERROOMRATEDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTPROVIDERROOMRATEDESCRIPTION() {
        if (listproviderroomratedescription == null) {
            listproviderroomratedescription = new ArrayList<String>();
        }
        return this.listproviderroomratedescription;
    }

    /**
     * Gets the value of the checksellrules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCHECKSELLRULES() {
        return checksellrules;
    }

    /**
     * Sets the value of the checksellrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCHECKSELLRULES(Boolean value) {
        this.checksellrules = value;
    }

    /**
     * Gets the value of the listspecialrate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listspecialrate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSPECIALRATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTSPECIALRATE() {
        if (listspecialrate == null) {
            listspecialrate = new ArrayList<String>();
        }
        return this.listspecialrate;
    }

    /**
     * Gets the value of the numofnights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUMOFNIGHTS() {
        return numofnights;
    }

    /**
     * Sets the value of the numofnights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUMOFNIGHTS(Integer value) {
        this.numofnights = value;
    }

    /**
     * Gets the value of the bookingsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKINGSOURCE() {
        return bookingsource;
    }

    /**
     * Sets the value of the bookingsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKINGSOURCE(String value) {
        this.bookingsource = value;
    }

    /**
     * Gets the value of the linenumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLINENUMBER() {
        return linenumber;
    }

    /**
     * Sets the value of the linenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLINENUMBER(Integer value) {
        this.linenumber = value;
    }

    /**
     * Gets the value of the remarksellfail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARKSELLFAIL() {
        return remarksellfail;
    }

    /**
     * Sets the value of the remarksellfail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARKSELLFAIL(String value) {
        this.remarksellfail = value;
    }

    /**
     * Gets the value of the boolisoutofpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLISOUTOFPOLICY() {
        return boolisoutofpolicy;
    }

    /**
     * Sets the value of the boolisoutofpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLISOUTOFPOLICY(Boolean value) {
        this.boolisoutofpolicy = value;
    }

    /**
     * Gets the value of the hotelinpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHOTELINPOLICY() {
        return hotelinpolicy;
    }

    /**
     * Sets the value of the hotelinpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHOTELINPOLICY(Boolean value) {
        this.hotelinpolicy = value;
    }

    /**
     * Gets the value of the justificationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJUSTIFICATIONCODE() {
        return justificationcode;
    }

    /**
     * Sets the value of the justificationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJUSTIFICATIONCODE(String value) {
        this.justificationcode = value;
    }

    /**
     * Gets the value of the justificationcodedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJUSTIFICATIONCODEDESC() {
        return justificationcodedesc;
    }

    /**
     * Sets the value of the justificationcodedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJUSTIFICATIONCODEDESC(String value) {
        this.justificationcodedesc = value;
    }

    /**
     * Gets the value of the justificationfreetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJUSTIFICATIONFREETEXT() {
        return justificationfreetext;
    }

    /**
     * Sets the value of the justificationfreetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJUSTIFICATIONFREETEXT(String value) {
        this.justificationfreetext = value;
    }

    /**
     * Gets the value of the lowestrate property.
     * 
     * @return
     *     possible object is
     *     {@link ListPriceType }
     *     
     */
    public ListPriceType getLOWESTRATE() {
        return lowestrate;
    }

    /**
     * Sets the value of the lowestrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPriceType }
     *     
     */
    public void setLOWESTRATE(ListPriceType value) {
        this.lowestrate = value;
    }

    /**
     * Gets the value of the specialservicerequests property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialServiceRequestType }
     *     
     */
    public SpecialServiceRequestType getSPECIALSERVICEREQUESTS() {
        return specialservicerequests;
    }

    /**
     * Sets the value of the specialservicerequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialServiceRequestType }
     *     
     */
    public void setSPECIALSERVICEREQUESTS(SpecialServiceRequestType value) {
        this.specialservicerequests = value;
    }

    /**
     * Gets the value of the listsellinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsellinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSELLINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellInformationType }
     * 
     * 
     */
    public List<SellInformationType> getLISTSELLINFORMATION() {
        if (listsellinformation == null) {
            listsellinformation = new ArrayList<SellInformationType>();
        }
        return this.listsellinformation;
    }

    /**
     * Gets the value of the listroominfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listroominfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTROOMINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomInformationType }
     * 
     * 
     */
    public List<RoomInformationType> getLISTROOMINFO() {
        if (listroominfo == null) {
            listroominfo = new ArrayList<RoomInformationType>();
        }
        return this.listroominfo;
    }

    /**
     * Gets the value of the listcontact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcontact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCONTACT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getLISTCONTACT() {
        if (listcontact == null) {
            listcontact = new ArrayList<ContactType>();
        }
        return this.listcontact;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.INVOICE }
     *     
     */
    public HOTELOFFER.INVOICE getINVOICE() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.INVOICE }
     *     
     */
    public void setINVOICE(HOTELOFFER.INVOICE value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCE(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the isonestepcmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISONESTEPCMT() {
        return isonestepcmt;
    }

    /**
     * Sets the value of the isonestepcmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISONESTEPCMT(Boolean value) {
        this.isonestepcmt = value;
    }

    /**
     * Gets the value of the termsandconditions property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.TERMSANDCONDITIONS }
     *     
     */
    public HOTELOFFER.TERMSANDCONDITIONS getTERMSANDCONDITIONS() {
        return termsandconditions;
    }

    /**
     * Sets the value of the termsandconditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.TERMSANDCONDITIONS }
     *     
     */
    public void setTERMSANDCONDITIONS(HOTELOFFER.TERMSANDCONDITIONS value) {
        this.termsandconditions = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCOMMISSION() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCOMMISSION(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the listcancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCANCELLATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationType }
     * 
     * 
     */
    public List<CancellationType> getLISTCANCELLATION() {
        if (listcancellation == null) {
            listcancellation = new ArrayList<CancellationType>();
        }
        return this.listcancellation;
    }

    /**
     * Gets the value of the additionalpricinginfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalPricingInfoType }
     *     
     */
    public AdditionalPricingInfoType getADDITIONALPRICINGINFO() {
        return additionalpricinginfo;
    }

    /**
     * Sets the value of the additionalpricinginfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalPricingInfoType }
     *     
     */
    public void setADDITIONALPRICINGINFO(AdditionalPricingInfoType value) {
        this.additionalpricinginfo = value;
    }

    /**
     * Gets the value of the markupoverridable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMARKUPOVERRIDABLE() {
        return markupoverridable;
    }

    /**
     * Sets the value of the markupoverridable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMARKUPOVERRIDABLE(Boolean value) {
        this.markupoverridable = value;
    }

    /**
     * Gets the value of the markupindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMARKUPINDICATOR() {
        return markupindicator;
    }

    /**
     * Sets the value of the markupindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMARKUPINDICATOR(Boolean value) {
        this.markupindicator = value;
    }

    /**
     * Gets the value of the ugcoptouturl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUGCOPTOUTURL() {
        return ugcoptouturl;
    }

    /**
     * Sets the value of the ugcoptouturl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUGCOPTOUTURL(String value) {
        this.ugcoptouturl = value;
    }

    /**
     * Gets the value of the multiplicity property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.MULTIPLICITY }
     *     
     */
    public HOTELOFFER.MULTIPLICITY getMULTIPLICITY() {
        return multiplicity;
    }

    /**
     * Sets the value of the multiplicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.MULTIPLICITY }
     *     
     */
    public void setMULTIPLICITY(HOTELOFFER.MULTIPLICITY value) {
        this.multiplicity = value;
    }

    /**
     * Gets the value of the breakfast property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELOFFER.BREAKFAST }
     *     
     */
    public HOTELOFFER.BREAKFAST getBREAKFAST() {
        return breakfast;
    }

    /**
     * Sets the value of the breakfast property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELOFFER.BREAKFAST }
     *     
     */
    public void setBREAKFAST(HOTELOFFER.BREAKFAST value) {
        this.breakfast = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CITY_CODE" type="{}HTL_unprotectedStringType"/&gt;
     *         &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}HTL_unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STATE_CODE" type="{}HTL_unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_CODE" type="{}HTL_unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STRUCTURED_POR_CITY" type="{}StructuredPorType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "citycode",
        "cityname",
        "locationcode",
        "locationname",
        "statecode",
        "statename",
        "countrycode",
        "countryname",
        "structuredporcity"
    })
    public static class BLOCATION
        implements Serializable
    {

        @XmlElement(name = "CITY_CODE", required = true)
        protected String citycode;
        @XmlElement(name = "CITY_NAME")
        protected String cityname;
        @XmlElement(name = "LOCATION_CODE")
        protected String locationcode;
        @XmlElement(name = "LOCATION_NAME")
        protected String locationname;
        @XmlElement(name = "STATE_CODE")
        protected String statecode;
        @XmlElement(name = "STATE_NAME")
        protected String statename;
        @XmlElement(name = "COUNTRY_CODE")
        protected String countrycode;
        @XmlElement(name = "COUNTRY_NAME")
        protected String countryname;
        @XmlElement(name = "STRUCTURED_POR_CITY")
        protected StructuredPorType structuredporcity;

        /**
         * Gets the value of the citycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYCODE() {
            return citycode;
        }

        /**
         * Sets the value of the citycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYCODE(String value) {
            this.citycode = value;
        }

        /**
         * Gets the value of the cityname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYNAME() {
            return cityname;
        }

        /**
         * Sets the value of the cityname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYNAME(String value) {
            this.cityname = value;
        }

        /**
         * Gets the value of the locationcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONCODE() {
            return locationcode;
        }

        /**
         * Sets the value of the locationcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONCODE(String value) {
            this.locationcode = value;
        }

        /**
         * Gets the value of the locationname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCATIONNAME() {
            return locationname;
        }

        /**
         * Sets the value of the locationname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCATIONNAME(String value) {
            this.locationname = value;
        }

        /**
         * Gets the value of the statecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATECODE() {
            return statecode;
        }

        /**
         * Sets the value of the statecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATECODE(String value) {
            this.statecode = value;
        }

        /**
         * Gets the value of the statename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATENAME() {
            return statename;
        }

        /**
         * Sets the value of the statename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATENAME(String value) {
            this.statename = value;
        }

        /**
         * Gets the value of the countrycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYCODE() {
            return countrycode;
        }

        /**
         * Sets the value of the countrycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYCODE(String value) {
            this.countrycode = value;
        }

        /**
         * Gets the value of the countryname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYNAME() {
            return countryname;
        }

        /**
         * Sets the value of the countryname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYNAME(String value) {
            this.countryname = value;
        }

        /**
         * Gets the value of the structuredporcity property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredPorType }
         *     
         */
        public StructuredPorType getSTRUCTUREDPORCITY() {
            return structuredporcity;
        }

        /**
         * Sets the value of the structuredporcity property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredPorType }
         *     
         */
        public void setSTRUCTUREDPORCITY(StructuredPorType value) {
            this.structuredporcity = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="INCLUDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "included"
    })
    public static class BREAKFAST
        implements Serializable
    {

        @XmlElement(name = "INCLUDED")
        protected Boolean included;

        /**
         * Gets the value of the included property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isINCLUDED() {
            return included;
        }

        /**
         * Sets the value of the included property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setINCLUDED(Boolean value) {
            this.included = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "name"
    })
    public static class DESCRIPTION
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODE(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="IS_ELIGIBLE_FOR_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_ELIGIBLE_FOR_REBOOK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PRICE_FOR_UPGRADE_IN_VOUCHERS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="PRICE_FOR_UPGRADE_IN_MILES" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "iseligibleforupgrade",
        "iseligibleforrebook",
        "priceforupgradeinvouchers",
        "priceforupgradeinmiles"
    })
    public static class ELIGIBILITYINFORMATION
        implements Serializable
    {

        @XmlElement(name = "IS_ELIGIBLE_FOR_UPGRADE")
        protected Boolean iseligibleforupgrade;
        @XmlElement(name = "IS_ELIGIBLE_FOR_REBOOK")
        protected Boolean iseligibleforrebook;
        @XmlElement(name = "PRICE_FOR_UPGRADE_IN_VOUCHERS")
        protected BigInteger priceforupgradeinvouchers;
        @XmlElement(name = "PRICE_FOR_UPGRADE_IN_MILES")
        protected BigInteger priceforupgradeinmiles;

        /**
         * Gets the value of the iseligibleforupgrade property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISELIGIBLEFORUPGRADE() {
            return iseligibleforupgrade;
        }

        /**
         * Sets the value of the iseligibleforupgrade property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISELIGIBLEFORUPGRADE(Boolean value) {
            this.iseligibleforupgrade = value;
        }

        /**
         * Gets the value of the iseligibleforrebook property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISELIGIBLEFORREBOOK() {
            return iseligibleforrebook;
        }

        /**
         * Sets the value of the iseligibleforrebook property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISELIGIBLEFORREBOOK(Boolean value) {
            this.iseligibleforrebook = value;
        }

        /**
         * Gets the value of the priceforupgradeinvouchers property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPRICEFORUPGRADEINVOUCHERS() {
            return priceforupgradeinvouchers;
        }

        /**
         * Sets the value of the priceforupgradeinvouchers property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPRICEFORUPGRADEINVOUCHERS(BigInteger value) {
            this.priceforupgradeinvouchers = value;
        }

        /**
         * Gets the value of the priceforupgradeinmiles property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPRICEFORUPGRADEINMILES() {
            return priceforupgradeinmiles;
        }

        /**
         * Sets the value of the priceforupgradeinmiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPRICEFORUPGRADEINMILES(BigInteger value) {
            this.priceforupgradeinmiles = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="GUESTS_INFO_NEEDED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GROUP_DATA" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}InternalGroupDataType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="COMMISSION" type="{}CommissionType" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_CANCELLATION" type="{}CancellationType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_SELL_INFORMATION" type="{}SellInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="TOTAL_PRICING" type="{}TotalPricingType" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_ADDITIONAL_FIELD" type="{}AdditionalFieldType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="PROFILE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ID" type="{}HTL_unprotectedStringType"/&gt;
     *                             &lt;element name="TYPE" type="{}HTL_unprotectedStringType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type",
        "groupid",
        "guestsinfoneeded",
        "groupdata"
    })
    public static class GROUPINFO
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "GROUP_ID")
        protected int groupid;
        @XmlElement(name = "GUESTS_INFO_NEEDED")
        protected String guestsinfoneeded;
        @XmlElement(name = "GROUP_DATA")
        protected HOTELOFFER.GROUPINFO.GROUPDATA groupdata;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the groupid property.
         * 
         */
        public int getGROUPID() {
            return groupid;
        }

        /**
         * Sets the value of the groupid property.
         * 
         */
        public void setGROUPID(int value) {
            this.groupid = value;
        }

        /**
         * Gets the value of the guestsinfoneeded property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGUESTSINFONEEDED() {
            return guestsinfoneeded;
        }

        /**
         * Sets the value of the guestsinfoneeded property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGUESTSINFONEEDED(String value) {
            this.guestsinfoneeded = value;
        }

        /**
         * Gets the value of the groupdata property.
         * 
         * @return
         *     possible object is
         *     {@link HOTELOFFER.GROUPINFO.GROUPDATA }
         *     
         */
        public HOTELOFFER.GROUPINFO.GROUPDATA getGROUPDATA() {
            return groupdata;
        }

        /**
         * Sets the value of the groupdata property.
         * 
         * @param value
         *     allowed object is
         *     {@link HOTELOFFER.GROUPINFO.GROUPDATA }
         *     
         */
        public void setGROUPDATA(HOTELOFFER.GROUPINFO.GROUPDATA value) {
            this.groupdata = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{}InternalGroupDataType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="COMMISSION" type="{}CommissionType" minOccurs="0"/&gt;
         *         &lt;element name="LIST_CANCELLATION" type="{}CancellationType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="LIST_SELL_INFORMATION" type="{}SellInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="TOTAL_PRICING" type="{}TotalPricingType" minOccurs="0"/&gt;
         *         &lt;element name="LIST_ADDITIONAL_FIELD" type="{}AdditionalFieldType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="PROFILE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ID" type="{}HTL_unprotectedStringType"/&gt;
         *                   &lt;element name="TYPE" type="{}HTL_unprotectedStringType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "listtravellerid",
            "commission",
            "listcancellation",
            "listsellinformation",
            "totalpricing",
            "listadditionalfield",
            "profile"
        })
        public static class GROUPDATA
            extends InternalGroupDataType
            implements Serializable
        {

            @XmlElement(name = "LIST_TRAVELLER_ID", type = Integer.class)
            protected List<Integer> listtravellerid;
            @XmlElement(name = "COMMISSION")
            protected CommissionType commission;
            @XmlElement(name = "LIST_CANCELLATION")
            protected List<CancellationType> listcancellation;
            @XmlElement(name = "LIST_SELL_INFORMATION")
            protected List<SellInformationType> listsellinformation;
            @XmlElement(name = "TOTAL_PRICING")
            protected TotalPricingType totalpricing;
            @XmlElement(name = "LIST_ADDITIONAL_FIELD")
            protected List<AdditionalFieldType> listadditionalfield;
            @XmlElement(name = "PROFILE")
            protected HOTELOFFER.GROUPINFO.GROUPDATA.PROFILE profile;

            /**
             * Gets the value of the listtravellerid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTTRAVELLERID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Integer }
             * 
             * 
             */
            public List<Integer> getLISTTRAVELLERID() {
                if (listtravellerid == null) {
                    listtravellerid = new ArrayList<Integer>();
                }
                return this.listtravellerid;
            }

            /**
             * Gets the value of the commission property.
             * 
             * @return
             *     possible object is
             *     {@link CommissionType }
             *     
             */
            public CommissionType getCOMMISSION() {
                return commission;
            }

            /**
             * Sets the value of the commission property.
             * 
             * @param value
             *     allowed object is
             *     {@link CommissionType }
             *     
             */
            public void setCOMMISSION(CommissionType value) {
                this.commission = value;
            }

            /**
             * Gets the value of the listcancellation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listcancellation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTCANCELLATION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CancellationType }
             * 
             * 
             */
            public List<CancellationType> getLISTCANCELLATION() {
                if (listcancellation == null) {
                    listcancellation = new ArrayList<CancellationType>();
                }
                return this.listcancellation;
            }

            /**
             * Gets the value of the listsellinformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listsellinformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTSELLINFORMATION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SellInformationType }
             * 
             * 
             */
            public List<SellInformationType> getLISTSELLINFORMATION() {
                if (listsellinformation == null) {
                    listsellinformation = new ArrayList<SellInformationType>();
                }
                return this.listsellinformation;
            }

            /**
             * Gets the value of the totalpricing property.
             * 
             * @return
             *     possible object is
             *     {@link TotalPricingType }
             *     
             */
            public TotalPricingType getTOTALPRICING() {
                return totalpricing;
            }

            /**
             * Sets the value of the totalpricing property.
             * 
             * @param value
             *     allowed object is
             *     {@link TotalPricingType }
             *     
             */
            public void setTOTALPRICING(TotalPricingType value) {
                this.totalpricing = value;
            }

            /**
             * Gets the value of the listadditionalfield property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listadditionalfield property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTADDITIONALFIELD().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AdditionalFieldType }
             * 
             * 
             */
            public List<AdditionalFieldType> getLISTADDITIONALFIELD() {
                if (listadditionalfield == null) {
                    listadditionalfield = new ArrayList<AdditionalFieldType>();
                }
                return this.listadditionalfield;
            }

            /**
             * Gets the value of the profile property.
             * 
             * @return
             *     possible object is
             *     {@link HOTELOFFER.GROUPINFO.GROUPDATA.PROFILE }
             *     
             */
            public HOTELOFFER.GROUPINFO.GROUPDATA.PROFILE getPROFILE() {
                return profile;
            }

            /**
             * Sets the value of the profile property.
             * 
             * @param value
             *     allowed object is
             *     {@link HOTELOFFER.GROUPINFO.GROUPDATA.PROFILE }
             *     
             */
            public void setPROFILE(HOTELOFFER.GROUPINFO.GROUPDATA.PROFILE value) {
                this.profile = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="ID" type="{}HTL_unprotectedStringType"/&gt;
             *         &lt;element name="TYPE" type="{}HTL_unprotectedStringType" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "type"
            })
            public static class PROFILE
                implements Serializable
            {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "TYPE")
                protected String type;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setID(String value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTYPE() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTYPE(String value) {
                    this.type = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER" type="{}HTL_unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="EXPIRATION_DATE" type="{}DateType" minOccurs="0"/&gt;
     *         &lt;element name="BILLBACK_DATA" type="{}BillbackDataType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type",
        "number",
        "expirationdate",
        "billbackdata"
    })
    public static class GUARANTEE
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "NUMBER")
        protected String number;
        @XmlElement(name = "EXPIRATION_DATE")
        protected DateType expirationdate;
        @XmlElement(name = "BILLBACK_DATA")
        protected BillbackDataType billbackdata;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBER() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBER(String value) {
            this.number = value;
        }

        /**
         * Gets the value of the expirationdate property.
         * 
         * @return
         *     possible object is
         *     {@link DateType }
         *     
         */
        public DateType getEXPIRATIONDATE() {
            return expirationdate;
        }

        /**
         * Sets the value of the expirationdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateType }
         *     
         */
        public void setEXPIRATIONDATE(DateType value) {
            this.expirationdate = value;
        }

        /**
         * Gets the value of the billbackdata property.
         * 
         * @return
         *     possible object is
         *     {@link BillbackDataType }
         *     
         */
        public BillbackDataType getBILLBACKDATA() {
            return billbackdata;
        }

        /**
         * Sets the value of the billbackdata property.
         * 
         * @param value
         *     allowed object is
         *     {@link BillbackDataType }
         *     
         */
        public void setBILLBACKDATA(BillbackDataType value) {
            this.billbackdata = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LIST_ADDRESS_INFO" type="{}AddressInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_IDENTITY_DOCUMENT_INFO" type="{}IdentityDocumentInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "listaddressinfo",
        "listidentitydocumentinfo"
    })
    public static class INVOICE
        implements Serializable
    {

        @XmlElement(name = "LIST_ADDRESS_INFO")
        protected List<AddressInformationType> listaddressinfo;
        @XmlElement(name = "LIST_IDENTITY_DOCUMENT_INFO")
        protected List<IdentityDocumentInformationType> listidentitydocumentinfo;

        /**
         * Gets the value of the listaddressinfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listaddressinfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTADDRESSINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddressInformationType }
         * 
         * 
         */
        public List<AddressInformationType> getLISTADDRESSINFO() {
            if (listaddressinfo == null) {
                listaddressinfo = new ArrayList<AddressInformationType>();
            }
            return this.listaddressinfo;
        }

        /**
         * Gets the value of the listidentitydocumentinfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listidentitydocumentinfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTIDENTITYDOCUMENTINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IdentityDocumentInformationType }
         * 
         * 
         */
        public List<IdentityDocumentInformationType> getLISTIDENTITYDOCUMENTINFO() {
            if (listidentitydocumentinfo == null) {
                listidentitydocumentinfo = new ArrayList<IdentityDocumentInformationType>();
            }
            return this.listidentitydocumentinfo;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ISSUEDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "value"
    })
    public static class MULTIPLICITY
        implements Serializable
    {

        @XmlElement(name = "ID")
        protected int id;
        @XmlElement(name = "VALUE")
        protected int value;

        /**
         * Gets the value of the id property.
         * 
         */
        public int getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setID(int value) {
            this.id = value;
        }

        /**
         * Gets the value of the value property.
         * 
         */
        public int getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setVALUE(int value) {
            this.value = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LIST_TOTAL_RATE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="CURRENCY" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}HTL_unprotectedStringType" minOccurs="0"/&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TAX_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "listtotalrate"
    })
    public static class NEWOFFERRATES
        implements Serializable
    {

        @XmlElement(name = "LIST_TOTAL_RATE", required = true)
        protected List<HOTELOFFER.NEWOFFERRATES.LISTTOTALRATE> listtotalrate;

        /**
         * Gets the value of the listtotalrate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtotalrate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTOTALRATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HOTELOFFER.NEWOFFERRATES.LISTTOTALRATE }
         * 
         * 
         */
        public List<HOTELOFFER.NEWOFFERRATES.LISTTOTALRATE> getLISTTOTALRATE() {
            if (listtotalrate == null) {
                listtotalrate = new ArrayList<HOTELOFFER.NEWOFFERRATES.LISTTOTALRATE>();
            }
            return this.listtotalrate;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="CURRENCY" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}HTL_unprotectedStringType" minOccurs="0"/&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TAX_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "price",
            "currency",
            "taxindicator"
        })
        public static class LISTTOTALRATE
            implements Serializable
        {

            @XmlElement(name = "PRICE")
            protected BigDecimal price;
            @XmlElement(name = "CURRENCY")
            protected HOTELOFFER.NEWOFFERRATES.LISTTOTALRATE.CURRENCY currency;
            @XmlElement(name = "TAX_INDICATOR")
            protected Object taxindicator;

            /**
             * Gets the value of the price property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPRICE() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPRICE(BigDecimal value) {
                this.price = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link HOTELOFFER.NEWOFFERRATES.LISTTOTALRATE.CURRENCY }
             *     
             */
            public HOTELOFFER.NEWOFFERRATES.LISTTOTALRATE.CURRENCY getCURRENCY() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link HOTELOFFER.NEWOFFERRATES.LISTTOTALRATE.CURRENCY }
             *     
             */
            public void setCURRENCY(HOTELOFFER.NEWOFFERRATES.LISTTOTALRATE.CURRENCY value) {
                this.currency = value;
            }

            /**
             * Gets the value of the taxindicator property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTAXINDICATOR() {
                return taxindicator;
            }

            /**
             * Sets the value of the taxindicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTAXINDICATOR(Object value) {
                this.taxindicator = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="CODE" type="{}HTL_unprotectedStringType" minOccurs="0"/&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "name"
            })
            public static class CURRENCY
                implements Serializable
            {

                @XmlElement(name = "CODE")
                protected String code;
                @XmlElement(name = "NAME")
                protected String name;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCODE() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCODE(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNAME() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNAME(String value) {
                    this.name = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NAME" type="{}unprotectedStringType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "name"
    })
    public static class OFFERSTATUS
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME", required = true)
        protected String name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODE(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="IS_MODIFICATION_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_CANCELLATION_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_DATE_CHANGE_ONLY_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="IS_SCHEDULE_CHANGE_ACK_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ismodificationallowed",
        "iscancellationallowed",
        "isdatechangeonlyallowed",
        "isschedulechangeackallowed"
    })
    public static class PERMISSIONS
        implements Serializable
    {

        @XmlElement(name = "IS_MODIFICATION_ALLOWED")
        protected Boolean ismodificationallowed;
        @XmlElement(name = "IS_CANCELLATION_ALLOWED")
        protected Boolean iscancellationallowed;
        @XmlElement(name = "IS_DATE_CHANGE_ONLY_ALLOWED")
        protected Boolean isdatechangeonlyallowed;
        @XmlElement(name = "IS_SCHEDULE_CHANGE_ACK_ALLOWED")
        protected Boolean isschedulechangeackallowed;

        /**
         * Gets the value of the ismodificationallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISMODIFICATIONALLOWED() {
            return ismodificationallowed;
        }

        /**
         * Sets the value of the ismodificationallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISMODIFICATIONALLOWED(Boolean value) {
            this.ismodificationallowed = value;
        }

        /**
         * Gets the value of the iscancellationallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISCANCELLATIONALLOWED() {
            return iscancellationallowed;
        }

        /**
         * Sets the value of the iscancellationallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISCANCELLATIONALLOWED(Boolean value) {
            this.iscancellationallowed = value;
        }

        /**
         * Gets the value of the isdatechangeonlyallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISDATECHANGEONLYALLOWED() {
            return isdatechangeonlyallowed;
        }

        /**
         * Sets the value of the isdatechangeonlyallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISDATECHANGEONLYALLOWED(Boolean value) {
            this.isdatechangeonlyallowed = value;
        }

        /**
         * Gets the value of the isschedulechangeackallowed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISSCHEDULECHANGEACKALLOWED() {
            return isschedulechangeackallowed;
        }

        /**
         * Sets the value of the isschedulechangeackallowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISSCHEDULECHANGEACKALLOWED(Boolean value) {
            this.isschedulechangeackallowed = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PARENT_PNR_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="IS_THIRD_PARTY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "parentpnrid",
        "isthirdparty"
    })
    public static class PNRINFORMATION
        implements Serializable
    {

        @XmlElement(name = "PARENT_PNR_ID", required = true)
        protected BigInteger parentpnrid;
        @XmlElement(name = "IS_THIRD_PARTY")
        protected Boolean isthirdparty;

        /**
         * Gets the value of the parentpnrid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPARENTPNRID() {
            return parentpnrid;
        }

        /**
         * Sets the value of the parentpnrid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPARENTPNRID(BigInteger value) {
            this.parentpnrid = value;
        }

        /**
         * Gets the value of the isthirdparty property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISTHIRDPARTY() {
            return isthirdparty;
        }

        /**
         * Sets the value of the isthirdparty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISTHIRDPARTY(Boolean value) {
            this.isthirdparty = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LIST_RATE" type="{}DailyRateType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TOTAL_RATE" type="{}TotalRateType" maxOccurs="unbounded"/&gt;
     *         &lt;element name="REPORT_TOTAL_RATE" type="{}SimplePriceType" minOccurs="0"/&gt;
     *         &lt;element name="TOTAL_PRICING" type="{}TotalPricingType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "listrate",
        "listtotalrate",
        "reporttotalrate",
        "totalpricing"
    })
    public static class RATES
        implements Serializable
    {

        @XmlElement(name = "LIST_RATE")
        protected List<DailyRateType> listrate;
        @XmlElement(name = "LIST_TOTAL_RATE", required = true)
        protected List<TotalRateType> listtotalrate;
        @XmlElement(name = "REPORT_TOTAL_RATE")
        protected SimplePriceType reporttotalrate;
        @XmlElement(name = "TOTAL_PRICING")
        protected TotalPricingType totalpricing;

        /**
         * Gets the value of the listrate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listrate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTRATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DailyRateType }
         * 
         * 
         */
        public List<DailyRateType> getLISTRATE() {
            if (listrate == null) {
                listrate = new ArrayList<DailyRateType>();
            }
            return this.listrate;
        }

        /**
         * Gets the value of the listtotalrate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtotalrate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTOTALRATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TotalRateType }
         * 
         * 
         */
        public List<TotalRateType> getLISTTOTALRATE() {
            if (listtotalrate == null) {
                listtotalrate = new ArrayList<TotalRateType>();
            }
            return this.listtotalrate;
        }

        /**
         * Gets the value of the reporttotalrate property.
         * 
         * @return
         *     possible object is
         *     {@link SimplePriceType }
         *     
         */
        public SimplePriceType getREPORTTOTALRATE() {
            return reporttotalrate;
        }

        /**
         * Sets the value of the reporttotalrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimplePriceType }
         *     
         */
        public void setREPORTTOTALRATE(SimplePriceType value) {
            this.reporttotalrate = value;
        }

        /**
         * Gets the value of the totalpricing property.
         * 
         * @return
         *     possible object is
         *     {@link TotalPricingType }
         *     
         */
        public TotalPricingType getTOTALPRICING() {
            return totalpricing;
        }

        /**
         * Sets the value of the totalpricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link TotalPricingType }
         *     
         */
        public void setTOTALPRICING(TotalPricingType value) {
            this.totalpricing = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}CodeNameType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PROMO_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "promocode"
    })
    public static class SPECIALRATETYPE
        extends CodeNameType
        implements Serializable
    {

        @XmlElement(name = "PROMO_CODE")
        protected String promocode;

        /**
         * Gets the value of the promocode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROMOCODE() {
            return promocode;
        }

        /**
         * Sets the value of the promocode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROMOCODE(String value) {
            this.promocode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "name"
    })
    public static class STATUS
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODE(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="VALIDATION_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "url",
        "validationrequired"
    })
    public static class TERMSANDCONDITIONS
        implements Serializable
    {

        @XmlElement(name = "URL")
        protected String url;
        @XmlElement(name = "VALIDATION_REQUIRED")
        protected String validationrequired;

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURL() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURL(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the validationrequired property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVALIDATIONREQUIRED() {
            return validationrequired;
        }

        /**
         * Sets the value of the validationrequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVALIDATIONREQUIRED(String value) {
            this.validationrequired = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class VALIDITYDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
        }

    }

}
