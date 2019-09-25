
package com.koreanair.eretail.pojo.farecommon.farecontext;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.LISTREDEMPTIONOPTIONS;
import com.koreanair.eretail.pojo.farecommon.travellercommon.LISTTRAVELLERIDType;
import com.koreanair.eretail.pojo.farecommon.travellercommon.LISTTRAVELLERINFOType;


/**
 * 
 * 				List of faring/pricing options that can be sent in input
 * 			
 * 
 * <p>Java class for LIST_PRICING_OPTIONS_Input_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_PRICING_OPTIONS_Input_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}RequestedInputFareOptionsGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_PRICING_OPTIONS_Input_Type", propOrder = {
    "faringcommandid",
    "farecommandid",
    "typeoffare",
    "ispricebyinput",
    "priceschemereference",
    "inhibitservicefee",
    "pricingwithpublishedmiles",
    "milespublishingairline",
    "isupgrade",
    "listredemptionoptions",
    "pointofsale",
    "pointofticketing",
    "typeofcorporatefare",
    "listcorporatenumber",
    "listclid",
    "faringbyfareclassneeded",
    "listfareclass",
    "listfareparameter",
    "listtravellerinfo",
    "forceptc",
    "fareconversion",
    "fareselection",
    "withholdoptions",
    "exemptoptions",
    "listcarrieragreement",
    "pricingoptionsid",
    "customeridentifier",
    "listtravellersegmentoptions",
    "listtravellersegmentoptionsatc",
    "listtravellerpricingoptions",
    "listsegmentpricingoptions",
    "overridenonrefundableamount",
    "listupselllevel",
    "ispenaltywaived"
})
public class LISTPRICINGOPTIONSInputType
    implements Serializable
{

    @XmlElement(name = "FARING_COMMAND_ID")
    protected BigInteger faringcommandid;
    @XmlElement(name = "FARE_COMMAND_ID")
    protected BigInteger farecommandid;
    @XmlElement(name = "TYPE_OF_FARE")
    protected BigInteger typeoffare;
    @XmlElement(name = "IS_PRICE_BY_INPUT")
    protected Boolean ispricebyinput;
    @XmlElement(name = "PRICE_SCHEME_REFERENCE")
    protected String priceschemereference;
    @XmlElement(name = "INHIBIT_SERVICE_FEE")
    protected Boolean inhibitservicefee;
    @XmlElement(name = "PRICING_WITH_PUBLISHED_MILES")
    protected Boolean pricingwithpublishedmiles;
    @XmlElement(name = "MILES_PUBLISHING_AIRLINE")
    protected String milespublishingairline;
    @XmlElement(name = "IS_UPGRADE")
    protected Boolean isupgrade;
    @XmlElement(name = "LIST_REDEMPTION_OPTIONS")
    protected List<LISTREDEMPTIONOPTIONS> listredemptionoptions;
    @XmlElement(name = "POINT_OF_SALE")
    protected String pointofsale;
    @XmlElement(name = "POINT_OF_TICKETING")
    protected String pointofticketing;
    @XmlElement(name = "TYPE_OF_CORPORATE_FARE")
    protected BigInteger typeofcorporatefare;
    @XmlElement(name = "LIST_CORPORATE_NUMBER")
    protected List<LISTCORPORATENUMBER> listcorporatenumber;
    @XmlElement(name = "LIST_CLID")
    protected List<LISTCLID> listclid;
    @XmlElement(name = "FARING_BY_FARECLASS_NEEDED")
    protected Boolean faringbyfareclassneeded;
    @XmlElement(name = "LIST_FARE_CLASS")
    protected List<LISTFARECLASS> listfareclass;
    @XmlElement(name = "LIST_FARE_PARAMETER")
    protected List<LISTFAREPARAMETERType> listfareparameter;
    @XmlElement(name = "LIST_TRAVELLER_INFO")
    protected List<LISTTRAVELLERINFOType> listtravellerinfo;
    @XmlElement(name = "FORCE_PTC")
    protected Boolean forceptc;
    @XmlElement(name = "FARE_CONVERSION")
    protected String fareconversion;
    @XmlElement(name = "FARE_SELECTION")
    protected String fareselection;
    @XmlElement(name = "WITHHOLD_OPTIONS")
    @XmlSchemaType(name = "string")
    protected List<WithholdOptionType> withholdoptions;
    @XmlElement(name = "EXEMPT_OPTIONS")
    @XmlSchemaType(name = "string")
    protected List<ExemptOptionType> exemptoptions;
    @XmlElement(name = "LIST_CARRIER_AGREEMENT")
    protected List<LISTPRICINGOPTIONSInputType.LISTCARRIERAGREEMENT> listcarrieragreement;
    @XmlElement(name = "PRICING_OPTIONS_ID")
    protected BigInteger pricingoptionsid;
    @XmlElement(name = "CUSTOMER_IDENTIFIER")
    protected String customeridentifier;
    @XmlElement(name = "LIST_TRAVELLER_SEGMENT_OPTIONS")
    protected List<LISTPRICINGOPTIONSInputType.LISTTRAVELLERSEGMENTOPTIONS> listtravellersegmentoptions;
    @XmlElement(name = "LIST_TRAVELLER_SEGMENT_OPTIONS_ATC")
    protected List<LISTPRICINGOPTIONSInputType.LISTTRAVELLERSEGMENTOPTIONSATC> listtravellersegmentoptionsatc;
    @XmlElement(name = "LIST_TRAVELLER_PRICING_OPTIONS")
    protected List<LISTTRAVELLERPRICINGOPTIONSType> listtravellerpricingoptions;
    @XmlElement(name = "LIST_SEGMENT_PRICING_OPTIONS")
    protected LISTPRICINGOPTIONSInputType.LISTSEGMENTPRICINGOPTIONS listsegmentpricingoptions;
    @XmlElement(name = "OVERRIDE_NON_REFUNDABLE_AMOUNT")
    protected Boolean overridenonrefundableamount;
    @XmlElement(name = "LIST_UPSELL_LEVEL")
    protected List<LISTUPSELLLEVELType> listupselllevel;
    @XmlElement(name = "IS_PENALTY_WAIVED")
    protected Object ispenaltywaived;

    /**
     * Gets the value of the faringcommandid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFARINGCOMMANDID() {
        return faringcommandid;
    }

    /**
     * Sets the value of the faringcommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFARINGCOMMANDID(BigInteger value) {
        this.faringcommandid = value;
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
     * Gets the value of the typeoffare property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTYPEOFFARE() {
        return typeoffare;
    }

    /**
     * Sets the value of the typeoffare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTYPEOFFARE(BigInteger value) {
        this.typeoffare = value;
    }

    /**
     * Gets the value of the ispricebyinput property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPRICEBYINPUT() {
        return ispricebyinput;
    }

    /**
     * Sets the value of the ispricebyinput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPRICEBYINPUT(Boolean value) {
        this.ispricebyinput = value;
    }

    /**
     * Gets the value of the priceschemereference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICESCHEMEREFERENCE() {
        return priceschemereference;
    }

    /**
     * Sets the value of the priceschemereference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICESCHEMEREFERENCE(String value) {
        this.priceschemereference = value;
    }

    /**
     * Gets the value of the inhibitservicefee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINHIBITSERVICEFEE() {
        return inhibitservicefee;
    }

    /**
     * Sets the value of the inhibitservicefee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINHIBITSERVICEFEE(Boolean value) {
        this.inhibitservicefee = value;
    }

    /**
     * Gets the value of the pricingwithpublishedmiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPRICINGWITHPUBLISHEDMILES() {
        return pricingwithpublishedmiles;
    }

    /**
     * Sets the value of the pricingwithpublishedmiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPRICINGWITHPUBLISHEDMILES(Boolean value) {
        this.pricingwithpublishedmiles = value;
    }

    /**
     * Gets the value of the milespublishingairline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMILESPUBLISHINGAIRLINE() {
        return milespublishingairline;
    }

    /**
     * Sets the value of the milespublishingairline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMILESPUBLISHINGAIRLINE(String value) {
        this.milespublishingairline = value;
    }

    /**
     * Gets the value of the isupgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISUPGRADE() {
        return isupgrade;
    }

    /**
     * Sets the value of the isupgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISUPGRADE(Boolean value) {
        this.isupgrade = value;
    }

    /**
     * Gets the value of the listredemptionoptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listredemptionoptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREDEMPTIONOPTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTREDEMPTIONOPTIONS }
     * 
     * 
     */
    public List<LISTREDEMPTIONOPTIONS> getLISTREDEMPTIONOPTIONS() {
        if (listredemptionoptions == null) {
            listredemptionoptions = new ArrayList<LISTREDEMPTIONOPTIONS>();
        }
        return this.listredemptionoptions;
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
     * Gets the value of the typeofcorporatefare property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTYPEOFCORPORATEFARE() {
        return typeofcorporatefare;
    }

    /**
     * Sets the value of the typeofcorporatefare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTYPEOFCORPORATEFARE(BigInteger value) {
        this.typeofcorporatefare = value;
    }

    /**
     * Gets the value of the listcorporatenumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcorporatenumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCORPORATENUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTCORPORATENUMBER }
     * 
     * 
     */
    public List<LISTCORPORATENUMBER> getLISTCORPORATENUMBER() {
        if (listcorporatenumber == null) {
            listcorporatenumber = new ArrayList<LISTCORPORATENUMBER>();
        }
        return this.listcorporatenumber;
    }

    /**
     * Gets the value of the listclid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listclid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCLID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTCLID }
     * 
     * 
     */
    public List<LISTCLID> getLISTCLID() {
        if (listclid == null) {
            listclid = new ArrayList<LISTCLID>();
        }
        return this.listclid;
    }

    /**
     * Gets the value of the faringbyfareclassneeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFARINGBYFARECLASSNEEDED() {
        return faringbyfareclassneeded;
    }

    /**
     * Sets the value of the faringbyfareclassneeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFARINGBYFARECLASSNEEDED(Boolean value) {
        this.faringbyfareclassneeded = value;
    }

    /**
     * Gets the value of the listfareclass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareclass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARECLASS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFARECLASS }
     * 
     * 
     */
    public List<LISTFARECLASS> getLISTFARECLASS() {
        if (listfareclass == null) {
            listfareclass = new ArrayList<LISTFARECLASS>();
        }
        return this.listfareclass;
    }

    /**
     * Gets the value of the listfareparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFAREPARAMETERType }
     * 
     * 
     */
    public List<LISTFAREPARAMETERType> getLISTFAREPARAMETER() {
        if (listfareparameter == null) {
            listfareparameter = new ArrayList<LISTFAREPARAMETERType>();
        }
        return this.listfareparameter;
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
     * Gets the value of the forceptc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFORCEPTC() {
        return forceptc;
    }

    /**
     * Sets the value of the forceptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFORCEPTC(Boolean value) {
        this.forceptc = value;
    }

    /**
     * Gets the value of the fareconversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECONVERSION() {
        return fareconversion;
    }

    /**
     * Sets the value of the fareconversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECONVERSION(String value) {
        this.fareconversion = value;
    }

    /**
     * Gets the value of the fareselection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARESELECTION() {
        return fareselection;
    }

    /**
     * Sets the value of the fareselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARESELECTION(String value) {
        this.fareselection = value;
    }

    /**
     * Gets the value of the withholdoptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withholdoptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWITHHOLDOPTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WithholdOptionType }
     * 
     * 
     */
    public List<WithholdOptionType> getWITHHOLDOPTIONS() {
        if (withholdoptions == null) {
            withholdoptions = new ArrayList<WithholdOptionType>();
        }
        return this.withholdoptions;
    }

    /**
     * Gets the value of the exemptoptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemptoptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEXEMPTOPTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExemptOptionType }
     * 
     * 
     */
    public List<ExemptOptionType> getEXEMPTOPTIONS() {
        if (exemptoptions == null) {
            exemptoptions = new ArrayList<ExemptOptionType>();
        }
        return this.exemptoptions;
    }

    /**
     * Gets the value of the listcarrieragreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcarrieragreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCARRIERAGREEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICINGOPTIONSInputType.LISTCARRIERAGREEMENT }
     * 
     * 
     */
    public List<LISTPRICINGOPTIONSInputType.LISTCARRIERAGREEMENT> getLISTCARRIERAGREEMENT() {
        if (listcarrieragreement == null) {
            listcarrieragreement = new ArrayList<LISTPRICINGOPTIONSInputType.LISTCARRIERAGREEMENT>();
        }
        return this.listcarrieragreement;
    }

    /**
     * Gets the value of the pricingoptionsid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRICINGOPTIONSID() {
        return pricingoptionsid;
    }

    /**
     * Sets the value of the pricingoptionsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRICINGOPTIONSID(BigInteger value) {
        this.pricingoptionsid = value;
    }

    /**
     * Gets the value of the customeridentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERIDENTIFIER() {
        return customeridentifier;
    }

    /**
     * Sets the value of the customeridentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERIDENTIFIER(String value) {
        this.customeridentifier = value;
    }

    /**
     * Gets the value of the listtravellersegmentoptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellersegmentoptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERSEGMENTOPTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICINGOPTIONSInputType.LISTTRAVELLERSEGMENTOPTIONS }
     * 
     * 
     */
    public List<LISTPRICINGOPTIONSInputType.LISTTRAVELLERSEGMENTOPTIONS> getLISTTRAVELLERSEGMENTOPTIONS() {
        if (listtravellersegmentoptions == null) {
            listtravellersegmentoptions = new ArrayList<LISTPRICINGOPTIONSInputType.LISTTRAVELLERSEGMENTOPTIONS>();
        }
        return this.listtravellersegmentoptions;
    }

    /**
     * Gets the value of the listtravellersegmentoptionsatc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellersegmentoptionsatc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERSEGMENTOPTIONSATC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICINGOPTIONSInputType.LISTTRAVELLERSEGMENTOPTIONSATC }
     * 
     * 
     */
    public List<LISTPRICINGOPTIONSInputType.LISTTRAVELLERSEGMENTOPTIONSATC> getLISTTRAVELLERSEGMENTOPTIONSATC() {
        if (listtravellersegmentoptionsatc == null) {
            listtravellersegmentoptionsatc = new ArrayList<LISTPRICINGOPTIONSInputType.LISTTRAVELLERSEGMENTOPTIONSATC>();
        }
        return this.listtravellersegmentoptionsatc;
    }

    /**
     * Gets the value of the listtravellerpricingoptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerpricingoptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERPRICINGOPTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRAVELLERPRICINGOPTIONSType }
     * 
     * 
     */
    public List<LISTTRAVELLERPRICINGOPTIONSType> getLISTTRAVELLERPRICINGOPTIONS() {
        if (listtravellerpricingoptions == null) {
            listtravellerpricingoptions = new ArrayList<LISTTRAVELLERPRICINGOPTIONSType>();
        }
        return this.listtravellerpricingoptions;
    }

    /**
     * Gets the value of the listsegmentpricingoptions property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPRICINGOPTIONSInputType.LISTSEGMENTPRICINGOPTIONS }
     *     
     */
    public LISTPRICINGOPTIONSInputType.LISTSEGMENTPRICINGOPTIONS getLISTSEGMENTPRICINGOPTIONS() {
        return listsegmentpricingoptions;
    }

    /**
     * Sets the value of the listsegmentpricingoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPRICINGOPTIONSInputType.LISTSEGMENTPRICINGOPTIONS }
     *     
     */
    public void setLISTSEGMENTPRICINGOPTIONS(LISTPRICINGOPTIONSInputType.LISTSEGMENTPRICINGOPTIONS value) {
        this.listsegmentpricingoptions = value;
    }

    /**
     * Gets the value of the overridenonrefundableamount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOVERRIDENONREFUNDABLEAMOUNT() {
        return overridenonrefundableamount;
    }

    /**
     * Sets the value of the overridenonrefundableamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOVERRIDENONREFUNDABLEAMOUNT(Boolean value) {
        this.overridenonrefundableamount = value;
    }

    /**
     * Gets the value of the listupselllevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listupselllevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTUPSELLLEVEL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTUPSELLLEVELType }
     * 
     * 
     */
    public List<LISTUPSELLLEVELType> getLISTUPSELLLEVEL() {
        if (listupselllevel == null) {
            listupselllevel = new ArrayList<LISTUPSELLLEVELType>();
        }
        return this.listupselllevel;
    }

    /**
     * Gets the value of the ispenaltywaived property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISPENALTYWAIVED() {
        return ispenaltywaived;
    }

    /**
     * Sets the value of the ispenaltywaived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISPENALTYWAIVED(Object value) {
        this.ispenaltywaived = value;
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
     *         &lt;element name="COMPANY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="QUALIFIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "company",
        "qualifier"
    })
    public static class LISTCARRIERAGREEMENT
        implements Serializable
    {

        @XmlElement(name = "COMPANY", required = true)
        protected String company;
        @XmlElement(name = "QUALIFIER")
        protected String qualifier;

        /**
         * Gets the value of the company property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPANY() {
            return company;
        }

        /**
         * Sets the value of the company property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPANY(String value) {
            this.company = value;
        }

        /**
         * Gets the value of the qualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQUALIFIER() {
            return qualifier;
        }

        /**
         * Sets the value of the qualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQUALIFIER(String value) {
            this.qualifier = value;
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
     *         &lt;element name="LIST_SEGMENT_ID" type="{}SEGMENT_IDENTIFICATION_Type" maxOccurs="unbounded"/&gt;
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
        "listsegmentid"
    })
    public static class LISTSEGMENTPRICINGOPTIONS
        implements Serializable
    {

        @XmlElement(name = "LIST_SEGMENT_ID", required = true)
        protected List<SEGMENTIDENTIFICATIONType> listsegmentid;

        /**
         * Gets the value of the listsegmentid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listsegmentid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEGMENTID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SEGMENTIDENTIFICATIONType }
         * 
         * 
         */
        public List<SEGMENTIDENTIFICATIONType> getLISTSEGMENTID() {
            if (listsegmentid == null) {
                listsegmentid = new ArrayList<SEGMENTIDENTIFICATIONType>();
            }
            return this.listsegmentid;
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
     *         &lt;element name="LIST_BOUND" type="{}LIST_BOUND_SEGMENT_Type" maxOccurs="unbounded"/&gt;
     *         &lt;element name="LIST_TRAVELLER_ID" type="{}LIST_TRAVELLER_ID_Type" maxOccurs="unbounded"/&gt;
     *         &lt;element name="DISCOUNT_INFO" type="{}DISCOUNT_INFO_TRAVELLER_SEGMENT_Type" minOccurs="0"/&gt;
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
        "listbound",
        "listtravellerid",
        "discountinfo"
    })
    public static class LISTTRAVELLERSEGMENTOPTIONS
        implements Serializable
    {

        @XmlElement(name = "LIST_BOUND", required = true)
        protected List<LISTBOUNDSEGMENTType> listbound;
        @XmlElement(name = "LIST_TRAVELLER_ID", required = true)
        protected List<LISTTRAVELLERIDType> listtravellerid;
        @XmlElement(name = "DISCOUNT_INFO")
        protected DISCOUNTINFOTRAVELLERSEGMENTType discountinfo;

        /**
         * Gets the value of the listbound property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listbound property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTBOUND().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTBOUNDSEGMENTType }
         * 
         * 
         */
        public List<LISTBOUNDSEGMENTType> getLISTBOUND() {
            if (listbound == null) {
                listbound = new ArrayList<LISTBOUNDSEGMENTType>();
            }
            return this.listbound;
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
         * {@link LISTTRAVELLERIDType }
         * 
         * 
         */
        public List<LISTTRAVELLERIDType> getLISTTRAVELLERID() {
            if (listtravellerid == null) {
                listtravellerid = new ArrayList<LISTTRAVELLERIDType>();
            }
            return this.listtravellerid;
        }

        /**
         * Gets the value of the discountinfo property.
         * 
         * @return
         *     possible object is
         *     {@link DISCOUNTINFOTRAVELLERSEGMENTType }
         *     
         */
        public DISCOUNTINFOTRAVELLERSEGMENTType getDISCOUNTINFO() {
            return discountinfo;
        }

        /**
         * Sets the value of the discountinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DISCOUNTINFOTRAVELLERSEGMENTType }
         *     
         */
        public void setDISCOUNTINFO(DISCOUNTINFOTRAVELLERSEGMENTType value) {
            this.discountinfo = value;
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
     *         &lt;element name="LIST_BOUND" type="{}LIST_BOUND_SEGMENT_Type" maxOccurs="unbounded"/&gt;
     *         &lt;element name="LIST_TRAVELLER_ID" type="{}LIST_TRAVELLER_ID_Type" maxOccurs="unbounded"/&gt;
     *         &lt;element name="DISCOUNT_INFO" type="{}DISCOUNT_INFO_TRAVELLER_SEGMENT_ATC_Type" minOccurs="0"/&gt;
     *         &lt;element name="FREQUENT_FLYER_PRICING_OPTIONS" type="{}FREQUENT_FLYER_PRICING_OPTION_TRAVELLER_SEGMENT_Type" minOccurs="0"/&gt;
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
        "listbound",
        "listtravellerid",
        "discountinfo",
        "frequentflyerpricingoptions"
    })
    public static class LISTTRAVELLERSEGMENTOPTIONSATC
        implements Serializable
    {

        @XmlElement(name = "LIST_BOUND", required = true)
        protected List<LISTBOUNDSEGMENTType> listbound;
        @XmlElement(name = "LIST_TRAVELLER_ID", required = true)
        protected List<LISTTRAVELLERIDType> listtravellerid;
        @XmlElement(name = "DISCOUNT_INFO")
        protected DISCOUNTINFOTRAVELLERSEGMENTATCType discountinfo;
        @XmlElement(name = "FREQUENT_FLYER_PRICING_OPTIONS")
        protected FREQUENTFLYERPRICINGOPTIONTRAVELLERSEGMENTType frequentflyerpricingoptions;

        /**
         * Gets the value of the listbound property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listbound property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTBOUND().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTBOUNDSEGMENTType }
         * 
         * 
         */
        public List<LISTBOUNDSEGMENTType> getLISTBOUND() {
            if (listbound == null) {
                listbound = new ArrayList<LISTBOUNDSEGMENTType>();
            }
            return this.listbound;
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
         * {@link LISTTRAVELLERIDType }
         * 
         * 
         */
        public List<LISTTRAVELLERIDType> getLISTTRAVELLERID() {
            if (listtravellerid == null) {
                listtravellerid = new ArrayList<LISTTRAVELLERIDType>();
            }
            return this.listtravellerid;
        }

        /**
         * Gets the value of the discountinfo property.
         * 
         * @return
         *     possible object is
         *     {@link DISCOUNTINFOTRAVELLERSEGMENTATCType }
         *     
         */
        public DISCOUNTINFOTRAVELLERSEGMENTATCType getDISCOUNTINFO() {
            return discountinfo;
        }

        /**
         * Sets the value of the discountinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DISCOUNTINFOTRAVELLERSEGMENTATCType }
         *     
         */
        public void setDISCOUNTINFO(DISCOUNTINFOTRAVELLERSEGMENTATCType value) {
            this.discountinfo = value;
        }

        /**
         * Gets the value of the frequentflyerpricingoptions property.
         * 
         * @return
         *     possible object is
         *     {@link FREQUENTFLYERPRICINGOPTIONTRAVELLERSEGMENTType }
         *     
         */
        public FREQUENTFLYERPRICINGOPTIONTRAVELLERSEGMENTType getFREQUENTFLYERPRICINGOPTIONS() {
            return frequentflyerpricingoptions;
        }

        /**
         * Sets the value of the frequentflyerpricingoptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link FREQUENTFLYERPRICINGOPTIONTRAVELLERSEGMENTType }
         *     
         */
        public void setFREQUENTFLYERPRICINGOPTIONS(FREQUENTFLYERPRICINGOPTIONTRAVELLERSEGMENTType value) {
            this.frequentflyerpricingoptions = value;
        }

    }

}
