
package com.koreanair.external.eretail.vo.fare.farecommoninput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.GDSCABINCODEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.TYPEDAMOUNTType;
import com.koreanair.external.eretail.vo.farecommon.farecommonpricingoptionsinput.LISTPRICINGOPTIONS;


/**
 * Common input structure for PNR pricing flows.
 * 
 * <p>Java class for BookedItineraryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookedItineraryRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}REQUEST_ID" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}SEGMENT_REQUEST_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT_TRAVELLER" type="{}SEGMENT_TRAVELLER_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER" type="{}TRAVELLER_REQUEST_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}GlobalPricingOptions"/&gt;
 *         &lt;element ref="{}LIST_PRICING_OPTIONS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IS_PRICE_NO_PAX" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookedItineraryRequestType", propOrder = {
    "requestid",
    "listsegment",
    "listsegmenttraveller",
    "listtraveller",
    "currencyselection",
    "currencyconversion",
    "ticketingdate",
    "pointofsale",
    "pointofticketing",
    "feehandling",
    "fee",
    "surchargehandling",
    "listfaretype",
    "listcorporate",
    "listfarerestriction",
    "globalindicatorpricingoption",
    "fareresponsetype",
    "taxhandling",
    "tax",
    "farecommandid",
    "cabin",
    "gdscabincode",
    "allowpricingsolutionbreakdownsplit",
    "isaward",
    "publishingcarrier",
    "globalfarebasistoapply",
    "farefamily",
    "pricingtype",
    "priceamountoverridevalue",
    "listfarecomponent",
    "listpricingoptions",
    "ispricenopax"
})
@XmlSeeAlso({
    AwardItineraryRequestType.class
})
public class BookedItineraryRequestType
    implements Serializable
{

    @XmlElement(name = "REQUEST_ID")
    protected Integer requestid;
    @XmlElement(name = "LIST_SEGMENT")
    protected List<SEGMENTREQUESTType> listsegment;
    @XmlElement(name = "LIST_SEGMENT_TRAVELLER")
    protected List<SEGMENTTRAVELLERType> listsegmenttraveller;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<TRAVELLERREQUESTType> listtraveller;
    @XmlElement(name = "CURRENCY_SELECTION")
    protected String currencyselection;
    @XmlElement(name = "CURRENCY_CONVERSION")
    protected String currencyconversion;
    @XmlElement(name = "TICKETING_DATE")
    protected String ticketingdate;
    @XmlElement(name = "POINT_OF_SALE")
    protected String pointofsale;
    @XmlElement(name = "POINT_OF_TICKETING")
    protected String pointofticketing;
    @XmlElement(name = "FEE_HANDLING")
    protected FareAdditionHandlingType feehandling;
    @XmlElement(name = "FEE")
    protected List<BookedItineraryRequestType.FEE> fee;
    @XmlElement(name = "SURCHARGE_HANDLING")
    protected String surchargehandling;
    @XmlElement(name = "LIST_FARE_TYPE")
    protected List<String> listfaretype;
    @XmlElement(name = "LIST_CORPORATE")
    protected List<BookedItineraryRequestType.LISTCORPORATE> listcorporate;
    @XmlElement(name = "LIST_FARE_RESTRICTION")
    protected List<FareRestrictionType> listfarerestriction;
    @XmlElement(name = "GLOBAL_INDICATOR_PRICING_OPTION")
    protected String globalindicatorpricingoption;
    @XmlElement(name = "FARE_RESPONSE_TYPE")
    protected String fareresponsetype;
    @XmlElement(name = "TAX_HANDLING")
    @XmlSchemaType(name = "string")
    protected FareAdditionHandlingType taxhandling;
    @XmlElement(name = "TAX")
    protected List<BookedItineraryRequestType.TAX> tax;
    @XmlElement(name = "FARE_COMMAND_ID")
    protected BigInteger farecommandid;
    @XmlElement(name = "CABIN")
    protected String cabin;
    @XmlElement(name = "GDS_CABIN_CODE")
    @XmlSchemaType(name = "string")
    protected GDSCABINCODEType gdscabincode;
    @XmlElement(name = "ALLOW_PRICING_SOLUTION_BREAKDOWN_SPLIT")
    protected Boolean allowpricingsolutionbreakdownsplit;
    @XmlElement(name = "IS_AWARD")
    protected Boolean isaward;
    @XmlElement(name = "PUBLISHING_CARRIER")
    protected Object publishingcarrier;
    @XmlElement(name = "GLOBAL_FARE_BASIS_TO_APPLY")
    protected String globalfarebasistoapply;
    @XmlElement(name = "FARE_FAMILY")
    protected String farefamily;
    @XmlElement(name = "PRICING_TYPE")
    @XmlSchemaType(name = "string")
    protected PricingType pricingtype;
    @XmlElement(name = "PRICE_AMOUNT_OVERRIDE_VALUE")
    protected TYPEDAMOUNTType priceamountoverridevalue;
    @XmlElement(name = "LIST_FARE_COMPONENT")
    protected List<FARECOMPONENTType> listfarecomponent;
    @XmlElement(name = "LIST_PRICING_OPTIONS")
    protected List<LISTPRICINGOPTIONS> listpricingoptions;
    @XmlElement(name = "IS_PRICE_NO_PAX")
    protected Boolean ispricenopax;

    /**
     * CR 3923840 : Removed from booked itinerary repricing request to fare common input to reuse in automatic ticket update request
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getREQUESTID() {
        return requestid;
    }

    /**
     * Sets the value of the requestid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setREQUESTID(Integer value) {
        this.requestid = value;
    }

    /**
     * Gets the value of the listsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEGMENTREQUESTType }
     * 
     * 
     */
    public List<SEGMENTREQUESTType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<SEGMENTREQUESTType>();
        }
        return this.listsegment;
    }

    /**
     * Gets the value of the listsegmenttraveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegmenttraveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENTTRAVELLER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEGMENTTRAVELLERType }
     * 
     * 
     */
    public List<SEGMENTTRAVELLERType> getLISTSEGMENTTRAVELLER() {
        if (listsegmenttraveller == null) {
            listsegmenttraveller = new ArrayList<SEGMENTTRAVELLERType>();
        }
        return this.listsegmenttraveller;
    }

    /**
     * Gets the value of the listtraveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtraveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELLERREQUESTType }
     * 
     * 
     */
    public List<TRAVELLERREQUESTType> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<TRAVELLERREQUESTType>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the currencyselection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYSELECTION() {
        return currencyselection;
    }

    /**
     * Sets the value of the currencyselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYSELECTION(String value) {
        this.currencyselection = value;
    }

    /**
     * Gets the value of the currencyconversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYCONVERSION() {
        return currencyconversion;
    }

    /**
     * Sets the value of the currencyconversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYCONVERSION(String value) {
        this.currencyconversion = value;
    }

    /**
     * Gets the value of the ticketingdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETINGDATE() {
        return ticketingdate;
    }

    /**
     * Sets the value of the ticketingdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETINGDATE(String value) {
        this.ticketingdate = value;
    }

    /**
     * Gets the value of the pointofsale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOINTOFSALE() {
        return pointofsale;
    }

    /**
     * Sets the value of the pointofsale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOINTOFSALE(String value) {
        this.pointofsale = value;
    }

    /**
     * Gets the value of the pointofticketing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOINTOFTICKETING() {
        return pointofticketing;
    }

    /**
     * Sets the value of the pointofticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOINTOFTICKETING(String value) {
        this.pointofticketing = value;
    }

    /**
     * Gets the value of the feehandling property.
     * 
     * @return
     *     possible object is
     *     {@link FareAdditionHandlingType }
     *     
     */
    public FareAdditionHandlingType getFEEHANDLING() {
        return feehandling;
    }

    /**
     * Sets the value of the feehandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAdditionHandlingType }
     *     
     */
    public void setFEEHANDLING(FareAdditionHandlingType value) {
        this.feehandling = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookedItineraryRequestType.FEE }
     * 
     * 
     */
    public List<BookedItineraryRequestType.FEE> getFEE() {
        if (fee == null) {
            fee = new ArrayList<BookedItineraryRequestType.FEE>();
        }
        return this.fee;
    }

    /**
     * Gets the value of the surchargehandling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSURCHARGEHANDLING() {
        return surchargehandling;
    }

    /**
     * Sets the value of the surchargehandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSURCHARGEHANDLING(String value) {
        this.surchargehandling = value;
    }

    /**
     * Gets the value of the listfaretype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfaretype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARETYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTFARETYPE() {
        if (listfaretype == null) {
            listfaretype = new ArrayList<String>();
        }
        return this.listfaretype;
    }

    /**
     * Gets the value of the listcorporate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcorporate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCORPORATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookedItineraryRequestType.LISTCORPORATE }
     * 
     * 
     */
    public List<BookedItineraryRequestType.LISTCORPORATE> getLISTCORPORATE() {
        if (listcorporate == null) {
            listcorporate = new ArrayList<BookedItineraryRequestType.LISTCORPORATE>();
        }
        return this.listcorporate;
    }

    /**
     * Gets the value of the listfarerestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarerestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARERESTRICTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRestrictionType }
     * 
     * 
     */
    public List<FareRestrictionType> getLISTFARERESTRICTION() {
        if (listfarerestriction == null) {
            listfarerestriction = new ArrayList<FareRestrictionType>();
        }
        return this.listfarerestriction;
    }

    /**
     * Gets the value of the globalindicatorpricingoption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLOBALINDICATORPRICINGOPTION() {
        return globalindicatorpricingoption;
    }

    /**
     * Sets the value of the globalindicatorpricingoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLOBALINDICATORPRICINGOPTION(String value) {
        this.globalindicatorpricingoption = value;
    }

    /**
     * Gets the value of the fareresponsetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARERESPONSETYPE() {
        return fareresponsetype;
    }

    /**
     * Sets the value of the fareresponsetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARERESPONSETYPE(String value) {
        this.fareresponsetype = value;
    }

    /**
     * Gets the value of the taxhandling property.
     * 
     * @return
     *     possible object is
     *     {@link FareAdditionHandlingType }
     *     
     */
    public FareAdditionHandlingType getTAXHANDLING() {
        return taxhandling;
    }

    /**
     * Sets the value of the taxhandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAdditionHandlingType }
     *     
     */
    public void setTAXHANDLING(FareAdditionHandlingType value) {
        this.taxhandling = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTAX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookedItineraryRequestType.TAX }
     * 
     * 
     */
    public List<BookedItineraryRequestType.TAX> getTAX() {
        if (tax == null) {
            tax = new ArrayList<BookedItineraryRequestType.TAX>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the farecommandid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFARECOMMANDID() {
        return farecommandid;
    }

    /**
     * Sets the value of the farecommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFARECOMMANDID(BigInteger value) {
        this.farecommandid = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCABIN() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCABIN(String value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the gdscabincode property.
     * 
     * @return
     *     possible object is
     *     {@link GDSCABINCODEType }
     *     
     */
    public GDSCABINCODEType getGDSCABINCODE() {
        return gdscabincode;
    }

    /**
     * Sets the value of the gdscabincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDSCABINCODEType }
     *     
     */
    public void setGDSCABINCODE(GDSCABINCODEType value) {
        this.gdscabincode = value;
    }

    /**
     * Gets the value of the allowpricingsolutionbreakdownsplit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALLOWPRICINGSOLUTIONBREAKDOWNSPLIT() {
        return allowpricingsolutionbreakdownsplit;
    }

    /**
     * Sets the value of the allowpricingsolutionbreakdownsplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALLOWPRICINGSOLUTIONBREAKDOWNSPLIT(Boolean value) {
        this.allowpricingsolutionbreakdownsplit = value;
    }

    /**
     * Gets the value of the isaward property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISAWARD() {
        return isaward;
    }

    /**
     * Sets the value of the isaward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISAWARD(Boolean value) {
        this.isaward = value;
    }

    /**
     * Gets the value of the publishingcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPUBLISHINGCARRIER() {
        return publishingcarrier;
    }

    /**
     * Sets the value of the publishingcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPUBLISHINGCARRIER(Object value) {
        this.publishingcarrier = value;
    }

    /**
     * Gets the value of the globalfarebasistoapply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLOBALFAREBASISTOAPPLY() {
        return globalfarebasistoapply;
    }

    /**
     * Sets the value of the globalfarebasistoapply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLOBALFAREBASISTOAPPLY(String value) {
        this.globalfarebasistoapply = value;
    }

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREFAMILY(String value) {
        this.farefamily = value;
    }

    /**
     * Gets the value of the pricingtype property.
     * 
     * @return
     *     possible object is
     *     {@link PricingType }
     *     
     */
    public PricingType getPRICINGTYPE() {
        return pricingtype;
    }

    /**
     * Sets the value of the pricingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingType }
     *     
     */
    public void setPRICINGTYPE(PricingType value) {
        this.pricingtype = value;
    }

    /**
     * Gets the value of the priceamountoverridevalue property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public TYPEDAMOUNTType getPRICEAMOUNTOVERRIDEVALUE() {
        return priceamountoverridevalue;
    }

    /**
     * Sets the value of the priceamountoverridevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public void setPRICEAMOUNTOVERRIDEVALUE(TYPEDAMOUNTType value) {
        this.priceamountoverridevalue = value;
    }

    /**
     * Gets the value of the listfarecomponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarecomponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARECOMPONENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FARECOMPONENTType }
     * 
     * 
     */
    public List<FARECOMPONENTType> getLISTFARECOMPONENT() {
        if (listfarecomponent == null) {
            listfarecomponent = new ArrayList<FARECOMPONENTType>();
        }
        return this.listfarecomponent;
    }

    /**
     * This structure is used for all new options. In the future old options will migrate here.Gets the value of the listpricingoptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpricingoptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICINGOPTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICINGOPTIONS }
     * 
     * 
     */
    public List<LISTPRICINGOPTIONS> getLISTPRICINGOPTIONS() {
        if (listpricingoptions == null) {
            listpricingoptions = new ArrayList<LISTPRICINGOPTIONS>();
        }
        return this.listpricingoptions;
    }

    /**
     * Gets the value of the ispricenopax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPRICENOPAX() {
        return ispricenopax;
    }

    /**
     * Sets the value of the ispricenopax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPRICENOPAX(Boolean value) {
        this.ispricenopax = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}FeeType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{}FEE_HANDLING"/&gt;
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
        "feehandling"
    })
    public static class FEE
        extends FeeType
        implements Serializable
    {

        @XmlElement(name = "FEE_HANDLING", required = true)
        protected FareAdditionHandlingType feehandling;

        /**
         * Gets the value of the feehandling property.
         * 
         * @return
         *     possible object is
         *     {@link FareAdditionHandlingType }
         *     
         */
        public FareAdditionHandlingType getFEEHANDLING() {
            return feehandling;
        }

        /**
         * Sets the value of the feehandling property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareAdditionHandlingType }
         *     
         */
        public void setFEEHANDLING(FareAdditionHandlingType value) {
            this.feehandling = value;
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
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LIST_SUPPLIER" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listsupplier"
    })
    public static class LISTCORPORATE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "LIST_SUPPLIER")
        protected List<String> listsupplier;

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
         * Gets the value of the listsupplier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listsupplier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSUPPLIER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTSUPPLIER() {
            if (listsupplier == null) {
                listsupplier = new ArrayList<String>();
            }
            return this.listsupplier;
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
     *     &lt;extension base="{}TaxType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{}TAX_HANDLING"/&gt;
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
        "taxhandling"
    })
    public static class TAX
        extends TaxType
        implements Serializable
    {

        @XmlElement(name = "TAX_HANDLING", required = true)
        @XmlSchemaType(name = "string")
        protected FareAdditionHandlingType taxhandling;

        /**
         * Gets the value of the taxhandling property.
         * 
         * @return
         *     possible object is
         *     {@link FareAdditionHandlingType }
         *     
         */
        public FareAdditionHandlingType getTAXHANDLING() {
            return taxhandling;
        }

        /**
         * Sets the value of the taxhandling property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareAdditionHandlingType }
         *     
         */
        public void setTAXHANDLING(FareAdditionHandlingType value) {
            this.taxhandling = value;
        }

    }

}
