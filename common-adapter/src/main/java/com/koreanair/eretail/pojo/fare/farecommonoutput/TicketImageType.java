
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CodeDescriptorType;
import com.koreanair.eretail.pojo.farecommon.farecalculation.ComplexExchangeRateType;
import com.koreanair.eretail.pojo.farecommon.farecalculation.FARECALCULATIONRAWType;
import com.koreanair.eretail.pojo.farecommon.farecommon.DictionaryChoice;
import com.koreanair.eretail.pojo.farecommon.farecommon.FEEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.MILESANDCASH;
import com.koreanair.eretail.pojo.farecommon.farecommon.TYPEDAMOUNTType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.DecodedLocationType;
import com.koreanair.eretail.pojo.farecommon.travellercommon.LISTTRAVELLERINFOType;


/**
 * The ticket image contains detailed information such as base fare, taxes, the raw fare calculation. It also contains traveller and segment information such as fare basis, ticket designator, baggage allowance and itinerary details. In an Amadeus Air contex it corresponds to the FQQ cryptic command.
 * 
 * <p>Java class for TicketImage_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketImage_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}Basic_FareCalculation_Group"/&gt;
 *         &lt;group ref="{}MilesOutputGroup"/&gt;
 *         &lt;element ref="{}MILES_AND_CASH" minOccurs="0"/&gt;
 *         &lt;group ref="{}PricingInfoGroup"/&gt;
 *         &lt;element name="LIST_SEGMENT_INFO" type="{}TicketSegment_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TICKETING_TIME_LIMIT" type="{}TicketingTimeLimit_Type" minOccurs="0"/&gt;
 *         &lt;element name="PRICED_TRAVELLER_TYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}IndexedTravellerType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FARE_TRAVELLER_INFO" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;group ref="{}LoyaltyProgramInfoGroup" minOccurs="0"/&gt;
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
 *         &lt;element name="MESSAGES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ENDORSEMENT_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VALIDATING_CARRIER" type="{}CodeDescriptorType" minOccurs="0"/&gt;
 *         &lt;element name="ADDITIONAL_PRICING_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="COMMISION_INFO_MESSAGE"/&gt;
 *                         &lt;enumeration value="ENDORSEMENT_MESSAGE"/&gt;
 *                         &lt;enumeration value="FORM_OF_PAYMENT_FEES_ELIGIBLE"/&gt;
 *                         &lt;enumeration value="LAST_TICKETING_DATE_MESSAGE"/&gt;
 *                         &lt;enumeration value="MILEAGE_BREAKDOWN_MESSAGE"/&gt;
 *                         &lt;enumeration value="PAYMENT_RESTRICTIONS_MESSAGE"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}FARE_RESPONSE_TYPE" minOccurs="0"/&gt;
 *         &lt;element ref="{}MILEAGE_ACCRUAL_AMOUNT" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_COMPONENT" type="{}FARE_COMPONENT_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketImage_Type", propOrder = {
    "localfare",
    "sellingfare",
    "nativefare",
    "totalfare",
    "listtax",
    "totaltax",
    "listfee",
    "listexchangerate",
    "farecalculationraw",
    "milescost",
    "additionalmilescostinfo",
    "milesandcash",
    "faretype",
    "listdiscount",
    "nva",
    "nvb",
    "corporatecode",
    "tourcode",
    "listsegmentinfo",
    "ticketingtimelimit",
    "pricedtravellertype",
    "listtraveller",
    "messages",
    "endorsementmessage",
    "validatingcarrier",
    "additionalpricinginfo",
    "fareresponsetype",
    "mileageaccrualamount",
    "listfarecomponent"
})
public class TicketImageType
    implements Serializable
{

    @XmlElement(name = "LOCAL_FARE")
    protected TYPEDAMOUNTType localfare;
    @XmlElement(name = "SELLING_FARE")
    protected TYPEDAMOUNTType sellingfare;
    @XmlElement(name = "NATIVE_FARE")
    protected TYPEDAMOUNTType nativefare;
    @XmlElement(name = "TOTAL_FARE")
    protected TYPEDAMOUNTType totalfare;
    @XmlElement(name = "LIST_TAX")
    protected List<TicketImageType.LISTTAX> listtax;
    @XmlElement(name = "TOTAL_TAX")
    protected TYPEDAMOUNTType totaltax;
    @XmlElement(name = "LIST_FEE")
    protected List<FEEType> listfee;
    @XmlElement(name = "LIST_EXCHANGE_RATE")
    protected List<ComplexExchangeRateType> listexchangerate;
    @XmlElement(name = "FARE_CALCULATION_RAW")
    protected FARECALCULATIONRAWType farecalculationraw;
    @XmlElement(name = "MILES_COST")
    protected BigInteger milescost;
    @XmlElement(name = "ADDITIONAL_MILES_COST_INFO")
    protected ADDITIONALMILESCOSTINFOType additionalmilescostinfo;
    @XmlElement(name = "MILES_AND_CASH")
    protected MILESANDCASH milesandcash;
    @XmlElement(name = "FARE_TYPE")
    protected FARETYPEType faretype;
    @XmlElement(name = "LIST_DISCOUNT")
    protected List<CodeDescriptorType> listdiscount;
    @XmlElement(name = "NVA")
    protected String nva;
    @XmlElement(name = "NVB")
    protected String nvb;
    @XmlElement(name = "CORPORATE_CODE")
    protected String corporatecode;
    @XmlElement(name = "TOUR_CODE")
    protected String tourcode;
    @XmlElement(name = "LIST_SEGMENT_INFO")
    protected List<TicketSegmentType> listsegmentinfo;
    @XmlElement(name = "TICKETING_TIME_LIMIT")
    protected TicketingTimeLimitType ticketingtimelimit;
    @XmlElement(name = "PRICED_TRAVELLER_TYPE")
    protected TicketImageType.PRICEDTRAVELLERTYPE pricedtravellertype;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<TicketImageType.LISTTRAVELLER> listtraveller;
    @XmlElement(name = "MESSAGES")
    protected List<String> messages;
    @XmlElement(name = "ENDORSEMENT_MESSAGE")
    protected String endorsementmessage;
    @XmlElement(name = "VALIDATING_CARRIER")
    protected CodeDescriptorType validatingcarrier;
    @XmlElement(name = "ADDITIONAL_PRICING_INFO")
    protected List<TicketImageType.ADDITIONALPRICINGINFO> additionalpricinginfo;
    @XmlElement(name = "FARE_RESPONSE_TYPE")
    protected String fareresponsetype;
    @XmlElement(name = "MILEAGE_ACCRUAL_AMOUNT")
    protected BigInteger mileageaccrualamount;
    @XmlElement(name = "LIST_FARE_COMPONENT")
    protected List<FARECOMPONENTType> listfarecomponent;

    /**
     * Gets the value of the localfare property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public TYPEDAMOUNTType getLOCALFARE() {
        return localfare;
    }

    /**
     * Sets the value of the localfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public void setLOCALFARE(TYPEDAMOUNTType value) {
        this.localfare = value;
    }

    /**
     * Gets the value of the sellingfare property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public TYPEDAMOUNTType getSELLINGFARE() {
        return sellingfare;
    }

    /**
     * Sets the value of the sellingfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public void setSELLINGFARE(TYPEDAMOUNTType value) {
        this.sellingfare = value;
    }

    /**
     * Gets the value of the nativefare property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public TYPEDAMOUNTType getNATIVEFARE() {
        return nativefare;
    }

    /**
     * Sets the value of the nativefare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public void setNATIVEFARE(TYPEDAMOUNTType value) {
        this.nativefare = value;
    }

    /**
     * Gets the value of the totalfare property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public TYPEDAMOUNTType getTOTALFARE() {
        return totalfare;
    }

    /**
     * Sets the value of the totalfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public void setTOTALFARE(TYPEDAMOUNTType value) {
        this.totalfare = value;
    }

    /**
     * Gets the value of the listtax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTAX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketImageType.LISTTAX }
     * 
     * 
     */
    public List<TicketImageType.LISTTAX> getLISTTAX() {
        if (listtax == null) {
            listtax = new ArrayList<TicketImageType.LISTTAX>();
        }
        return this.listtax;
    }

    /**
     * Gets the value of the totaltax property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public TYPEDAMOUNTType getTOTALTAX() {
        return totaltax;
    }

    /**
     * Sets the value of the totaltax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEDAMOUNTType }
     *     
     */
    public void setTOTALTAX(TYPEDAMOUNTType value) {
        this.totaltax = value;
    }

    /**
     * Gets the value of the listfee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFEE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEEType }
     * 
     * 
     */
    public List<FEEType> getLISTFEE() {
        if (listfee == null) {
            listfee = new ArrayList<FEEType>();
        }
        return this.listfee;
    }

    /**
     * Gets the value of the listexchangerate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexchangerate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXCHANGERATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexExchangeRateType }
     * 
     * 
     */
    public List<ComplexExchangeRateType> getLISTEXCHANGERATE() {
        if (listexchangerate == null) {
            listexchangerate = new ArrayList<ComplexExchangeRateType>();
        }
        return this.listexchangerate;
    }

    /**
     * Gets the value of the farecalculationraw property.
     * 
     * @return
     *     possible object is
     *     {@link FARECALCULATIONRAWType }
     *     
     */
    public FARECALCULATIONRAWType getFARECALCULATIONRAW() {
        return farecalculationraw;
    }

    /**
     * Sets the value of the farecalculationraw property.
     * 
     * @param value
     *     allowed object is
     *     {@link FARECALCULATIONRAWType }
     *     
     */
    public void setFARECALCULATIONRAW(FARECALCULATIONRAWType value) {
        this.farecalculationraw = value;
    }

    /**
     * Gets the value of the milescost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMILESCOST() {
        return milescost;
    }

    /**
     * Sets the value of the milescost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMILESCOST(BigInteger value) {
        this.milescost = value;
    }

    /**
     * Gets the value of the additionalmilescostinfo property.
     * 
     * @return
     *     possible object is
     *     {@link ADDITIONALMILESCOSTINFOType }
     *     
     */
    public ADDITIONALMILESCOSTINFOType getADDITIONALMILESCOSTINFO() {
        return additionalmilescostinfo;
    }

    /**
     * Sets the value of the additionalmilescostinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDITIONALMILESCOSTINFOType }
     *     
     */
    public void setADDITIONALMILESCOSTINFO(ADDITIONALMILESCOSTINFOType value) {
        this.additionalmilescostinfo = value;
    }

    /**
     * Gets the value of the milesandcash property.
     * 
     * @return
     *     possible object is
     *     {@link MILESANDCASH }
     *     
     */
    public MILESANDCASH getMILESANDCASH() {
        return milesandcash;
    }

    /**
     * Sets the value of the milesandcash property.
     * 
     * @param value
     *     allowed object is
     *     {@link MILESANDCASH }
     *     
     */
    public void setMILESANDCASH(MILESANDCASH value) {
        this.milesandcash = value;
    }

    /**
     * Gets the value of the faretype property.
     * 
     * @return
     *     possible object is
     *     {@link FARETYPEType }
     *     
     */
    public FARETYPEType getFARETYPE() {
        return faretype;
    }

    /**
     * Sets the value of the faretype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FARETYPEType }
     *     
     */
    public void setFARETYPE(FARETYPEType value) {
        this.faretype = value;
    }

    /**
     * Gets the value of the listdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeDescriptorType }
     * 
     * 
     */
    public List<CodeDescriptorType> getLISTDISCOUNT() {
        if (listdiscount == null) {
            listdiscount = new ArrayList<CodeDescriptorType>();
        }
        return this.listdiscount;
    }

    /**
     * Not Valid After. The format is DDMMM (15OCT for example).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVA() {
        return nva;
    }

    /**
     * Sets the value of the nva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVA(String value) {
        this.nva = value;
    }

    /**
     * Not Valid Before. The format is DDMMM (15OCT for example).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVB() {
        return nvb;
    }

    /**
     * Sets the value of the nvb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVB(String value) {
        this.nvb = value;
    }

    /**
     * Gets the value of the corporatecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCORPORATECODE() {
        return corporatecode;
    }

    /**
     * Sets the value of the corporatecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCORPORATECODE(String value) {
        this.corporatecode = value;
    }

    /**
     * Gets the value of the tourcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOURCODE() {
        return tourcode;
    }

    /**
     * Sets the value of the tourcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOURCODE(String value) {
        this.tourcode = value;
    }

    /**
     * Gets the value of the listsegmentinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegmentinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENTINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketSegmentType }
     * 
     * 
     */
    public List<TicketSegmentType> getLISTSEGMENTINFO() {
        if (listsegmentinfo == null) {
            listsegmentinfo = new ArrayList<TicketSegmentType>();
        }
        return this.listsegmentinfo;
    }

    /**
     * Gets the value of the ticketingtimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingTimeLimitType }
     *     
     */
    public TicketingTimeLimitType getTICKETINGTIMELIMIT() {
        return ticketingtimelimit;
    }

    /**
     * Sets the value of the ticketingtimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingTimeLimitType }
     *     
     */
    public void setTICKETINGTIMELIMIT(TicketingTimeLimitType value) {
        this.ticketingtimelimit = value;
    }

    /**
     * Gets the value of the pricedtravellertype property.
     * 
     * @return
     *     possible object is
     *     {@link TicketImageType.PRICEDTRAVELLERTYPE }
     *     
     */
    public TicketImageType.PRICEDTRAVELLERTYPE getPRICEDTRAVELLERTYPE() {
        return pricedtravellertype;
    }

    /**
     * Sets the value of the pricedtravellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketImageType.PRICEDTRAVELLERTYPE }
     *     
     */
    public void setPRICEDTRAVELLERTYPE(TicketImageType.PRICEDTRAVELLERTYPE value) {
        this.pricedtravellertype = value;
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
     * {@link TicketImageType.LISTTRAVELLER }
     * 
     * 
     */
    public List<TicketImageType.LISTTRAVELLER> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<TicketImageType.LISTTRAVELLER>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMESSAGES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMESSAGES() {
        if (messages == null) {
            messages = new ArrayList<String>();
        }
        return this.messages;
    }

    /**
     * Gets the value of the endorsementmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDORSEMENTMESSAGE() {
        return endorsementmessage;
    }

    /**
     * Sets the value of the endorsementmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDORSEMENTMESSAGE(String value) {
        this.endorsementmessage = value;
    }

    /**
     * Gets the value of the validatingcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getVALIDATINGCARRIER() {
        return validatingcarrier;
    }

    /**
     * Sets the value of the validatingcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setVALIDATINGCARRIER(CodeDescriptorType value) {
        this.validatingcarrier = value;
    }

    /**
     * Gets the value of the additionalpricinginfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalpricinginfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADDITIONALPRICINGINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketImageType.ADDITIONALPRICINGINFO }
     * 
     * 
     */
    public List<TicketImageType.ADDITIONALPRICINGINFO> getADDITIONALPRICINGINFO() {
        if (additionalpricinginfo == null) {
            additionalpricinginfo = new ArrayList<TicketImageType.ADDITIONALPRICINGINFO>();
        }
        return this.additionalpricinginfo;
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
     * Gets the value of the mileageaccrualamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMILEAGEACCRUALAMOUNT() {
        return mileageaccrualamount;
    }

    /**
     * Sets the value of the mileageaccrualamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMILEAGEACCRUALAMOUNT(BigInteger value) {
        this.mileageaccrualamount = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TYPE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="COMMISION_INFO_MESSAGE"/&gt;
     *               &lt;enumeration value="ENDORSEMENT_MESSAGE"/&gt;
     *               &lt;enumeration value="FORM_OF_PAYMENT_FEES_ELIGIBLE"/&gt;
     *               &lt;enumeration value="LAST_TICKETING_DATE_MESSAGE"/&gt;
     *               &lt;enumeration value="MILEAGE_BREAKDOWN_MESSAGE"/&gt;
     *               &lt;enumeration value="PAYMENT_RESTRICTIONS_MESSAGE"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "description"
    })
    public static class ADDITIONALPRICINGINFO
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "DESCRIPTION", required = true)
        protected String description;

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
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
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
     *         &lt;element name="INTERNAL_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;group ref="{}TYPED_AMOUNT_Group" minOccurs="0"/&gt;
     *         &lt;element name="TAX_DETAIL" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SUB_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_LOCATION_DETAIL" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="LOCATION" type="{}DecodedLocationType" minOccurs="0"/&gt;
     *                             &lt;group ref="{}TYPED_AMOUNT_Group"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{}REISSUE_STATUS" minOccurs="0"/&gt;
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
        "internalcode",
        "status",
        "currency",
        "amount",
        "taxdetail",
        "reissuestatus"
    })
    public static class LISTTAX
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "INTERNAL_CODE")
        protected Object internalcode;
        @XmlElement(name = "STATUS")
        protected String status;
        @XmlElement(name = "CURRENCY")
        protected DictionaryChoice currency;
        @XmlElement(name = "AMOUNT")
        protected BigDecimal amount;
        @XmlElement(name = "TAX_DETAIL")
        protected TicketImageType.LISTTAX.TAXDETAIL taxdetail;
        @XmlElement(name = "REISSUE_STATUS")
        protected String reissuestatus;

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
         * Gets the value of the internalcode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getINTERNALCODE() {
            return internalcode;
        }

        /**
         * Sets the value of the internalcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setINTERNALCODE(Object value) {
            this.internalcode = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUS(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link DictionaryChoice }
         *     
         */
        public DictionaryChoice getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link DictionaryChoice }
         *     
         */
        public void setCURRENCY(DictionaryChoice value) {
            this.currency = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the taxdetail property.
         * 
         * @return
         *     possible object is
         *     {@link TicketImageType.LISTTAX.TAXDETAIL }
         *     
         */
        public TicketImageType.LISTTAX.TAXDETAIL getTAXDETAIL() {
            return taxdetail;
        }

        /**
         * Sets the value of the taxdetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketImageType.LISTTAX.TAXDETAIL }
         *     
         */
        public void setTAXDETAIL(TicketImageType.LISTTAX.TAXDETAIL value) {
            this.taxdetail = value;
        }

        /**
         * Gets the value of the reissuestatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREISSUESTATUS() {
            return reissuestatus;
        }

        /**
         * Sets the value of the reissuestatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREISSUESTATUS(String value) {
            this.reissuestatus = value;
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
         *         &lt;element name="SUB_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="LIST_LOCATION_DETAIL" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="LOCATION" type="{}DecodedLocationType" minOccurs="0"/&gt;
         *                   &lt;group ref="{}TYPED_AMOUNT_Group"/&gt;
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
            "subcode",
            "listlocationdetail"
        })
        public static class TAXDETAIL
            implements Serializable
        {

            @XmlElement(name = "SUB_CODE")
            protected String subcode;
            @XmlElement(name = "LIST_LOCATION_DETAIL")
            protected List<TicketImageType.LISTTAX.TAXDETAIL.LISTLOCATIONDETAIL> listlocationdetail;

            /**
             * Gets the value of the subcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSUBCODE() {
                return subcode;
            }

            /**
             * Sets the value of the subcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSUBCODE(String value) {
                this.subcode = value;
            }

            /**
             * Gets the value of the listlocationdetail property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listlocationdetail property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTLOCATIONDETAIL().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TicketImageType.LISTTAX.TAXDETAIL.LISTLOCATIONDETAIL }
             * 
             * 
             */
            public List<TicketImageType.LISTTAX.TAXDETAIL.LISTLOCATIONDETAIL> getLISTLOCATIONDETAIL() {
                if (listlocationdetail == null) {
                    listlocationdetail = new ArrayList<TicketImageType.LISTTAX.TAXDETAIL.LISTLOCATIONDETAIL>();
                }
                return this.listlocationdetail;
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
             *         &lt;element name="LOCATION" type="{}DecodedLocationType" minOccurs="0"/&gt;
             *         &lt;group ref="{}TYPED_AMOUNT_Group"/&gt;
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
                "location",
                "currency",
                "amount"
            })
            public static class LISTLOCATIONDETAIL
                implements Serializable
            {

                @XmlElement(name = "LOCATION")
                protected DecodedLocationType location;
                @XmlElement(name = "CURRENCY")
                protected DictionaryChoice currency;
                @XmlElement(name = "AMOUNT", required = true)
                protected BigDecimal amount;

                /**
                 * Gets the value of the location property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DecodedLocationType }
                 *     
                 */
                public DecodedLocationType getLOCATION() {
                    return location;
                }

                /**
                 * Sets the value of the location property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DecodedLocationType }
                 *     
                 */
                public void setLOCATION(DecodedLocationType value) {
                    this.location = value;
                }

                /**
                 * Gets the value of the currency property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DictionaryChoice }
                 *     
                 */
                public DictionaryChoice getCURRENCY() {
                    return currency;
                }

                /**
                 * Sets the value of the currency property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DictionaryChoice }
                 *     
                 */
                public void setCURRENCY(DictionaryChoice value) {
                    this.currency = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAMOUNT() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAMOUNT(BigDecimal value) {
                    this.amount = value;
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
     *     &lt;extension base="{}IndexedTravellerType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="FARE_TRAVELLER_INFO" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;group ref="{}LoyaltyProgramInfoGroup" minOccurs="0"/&gt;
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
        "faretravellerinfo"
    })
    public static class LISTTRAVELLER
        extends IndexedTravellerType
        implements Serializable
    {

        @XmlElement(name = "FARE_TRAVELLER_INFO")
        protected TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO faretravellerinfo;

        /**
         * Gets the value of the faretravellerinfo property.
         * 
         * @return
         *     possible object is
         *     {@link TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO }
         *     
         */
        public TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO getFARETRAVELLERINFO() {
            return faretravellerinfo;
        }

        /**
         * Sets the value of the faretravellerinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO }
         *     
         */
        public void setFARETRAVELLERINFO(TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO value) {
            this.faretravellerinfo = value;
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
         *         &lt;group ref="{}LoyaltyProgramInfoGroup" minOccurs="0"/&gt;
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
            "accountnumber",
            "company",
            "messages",
            "validatingcarrier",
            "additionalpricinginfo",
            "owneraccountidentity",
            "listtravellerinfo"
        })
        public static class FARETRAVELLERINFO
            implements Serializable
        {

            @XmlElement(name = "ACCOUNT_NUMBER")
            protected String accountnumber;
            @XmlElement(name = "COMPANY")
            protected CodeDescriptorType company;
            @XmlElement(name = "MESSAGES")
            protected List<String> messages;
            @XmlElement(name = "VALIDATING_CARRIER")
            protected CodeDescriptorType validatingcarrier;
            @XmlElement(name = "ADDITIONAL_PRICING_INFO")
            protected List<TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.ADDITIONALPRICINGINFO> additionalpricinginfo;
            @XmlElement(name = "OWNER_ACCOUNT_IDENTITY")
            protected TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.OWNERACCOUNTIDENTITY owneraccountidentity;
            @XmlElement(name = "LIST_TRAVELLER_INFO")
            protected List<LISTTRAVELLERINFOType> listtravellerinfo;

            /**
             * Gets the value of the accountnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTNUMBER() {
                return accountnumber;
            }

            /**
             * Sets the value of the accountnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTNUMBER(String value) {
                this.accountnumber = value;
            }

            /**
             * Gets the value of the company property.
             * 
             * @return
             *     possible object is
             *     {@link CodeDescriptorType }
             *     
             */
            public CodeDescriptorType getCOMPANY() {
                return company;
            }

            /**
             * Sets the value of the company property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeDescriptorType }
             *     
             */
            public void setCOMPANY(CodeDescriptorType value) {
                this.company = value;
            }

            /**
             * Gets the value of the messages property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the messages property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMESSAGES().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMESSAGES() {
                if (messages == null) {
                    messages = new ArrayList<String>();
                }
                return this.messages;
            }

            /**
             * Gets the value of the validatingcarrier property.
             * 
             * @return
             *     possible object is
             *     {@link CodeDescriptorType }
             *     
             */
            public CodeDescriptorType getVALIDATINGCARRIER() {
                return validatingcarrier;
            }

            /**
             * Sets the value of the validatingcarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeDescriptorType }
             *     
             */
            public void setVALIDATINGCARRIER(CodeDescriptorType value) {
                this.validatingcarrier = value;
            }

            /**
             * Gets the value of the additionalpricinginfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the additionalpricinginfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getADDITIONALPRICINGINFO().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.ADDITIONALPRICINGINFO }
             * 
             * 
             */
            public List<TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.ADDITIONALPRICINGINFO> getADDITIONALPRICINGINFO() {
                if (additionalpricinginfo == null) {
                    additionalpricinginfo = new ArrayList<TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.ADDITIONALPRICINGINFO>();
                }
                return this.additionalpricinginfo;
            }

            /**
             * Gets the value of the owneraccountidentity property.
             * 
             * @return
             *     possible object is
             *     {@link TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.OWNERACCOUNTIDENTITY }
             *     
             */
            public TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.OWNERACCOUNTIDENTITY getOWNERACCOUNTIDENTITY() {
                return owneraccountidentity;
            }

            /**
             * Sets the value of the owneraccountidentity property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.OWNERACCOUNTIDENTITY }
             *     
             */
            public void setOWNERACCOUNTIDENTITY(TicketImageType.LISTTRAVELLER.FARETRAVELLERINFO.OWNERACCOUNTIDENTITY value) {
                this.owneraccountidentity = value;
            }

            /**
             * Gets the value of the listtravellerinfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listtravellerinfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTTRAVELLERINFO().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTTRAVELLERINFOType }
             * 
             * 
             */
            public List<LISTTRAVELLERINFOType> getLISTTRAVELLERINFO() {
                if (listtravellerinfo == null) {
                    listtravellerinfo = new ArrayList<LISTTRAVELLERINFOType>();
                }
                return this.listtravellerinfo;
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
             *         &lt;element name="TYPE"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;enumeration value="ENDORSEMENT_MESSAGE"/&gt;
             *               &lt;enumeration value="COMMISION_INFO_MESSAGE"/&gt;
             *               &lt;enumeration value="LAST_TICKETING_DATE_MESSAGE"/&gt;
             *               &lt;enumeration value="MILEAGE_BREAKDOWN_MESSAGE"/&gt;
             *               &lt;enumeration value="PAYMENT_RESTRICTIONS_MESSAGE"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "description"
            })
            public static class ADDITIONALPRICINGINFO
                implements Serializable
            {

                @XmlElement(name = "TYPE", required = true)
                protected String type;
                @XmlElement(name = "DESCRIPTION", required = true)
                protected String description;

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
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDESCRIPTION() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDESCRIPTION(String value) {
                    this.description = value;
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
             *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "firstname",
                "lastname",
                "title"
            })
            public static class OWNERACCOUNTIDENTITY
                implements Serializable
            {

                @XmlElement(name = "FIRST_NAME", required = true)
                protected String firstname;
                @XmlElement(name = "LAST_NAME", required = true)
                protected String lastname;
                @XmlElement(name = "TITLE")
                protected String title;

                /**
                 * Gets the value of the firstname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFIRSTNAME() {
                    return firstname;
                }

                /**
                 * Sets the value of the firstname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFIRSTNAME(String value) {
                    this.firstname = value;
                }

                /**
                 * Gets the value of the lastname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLASTNAME() {
                    return lastname;
                }

                /**
                 * Sets the value of the lastname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLASTNAME(String value) {
                    this.lastname = value;
                }

                /**
                 * Gets the value of the title property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTITLE() {
                    return title;
                }

                /**
                 * Sets the value of the title property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTITLE(String value) {
                    this.title = value;
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
    public static class PRICEDTRAVELLERTYPE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
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
