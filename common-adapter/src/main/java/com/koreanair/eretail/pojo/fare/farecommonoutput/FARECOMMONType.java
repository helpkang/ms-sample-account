
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.common.common.APISMANAGEROUTPUTTYPE;
import com.koreanair.eretail.pojo.common.common.APISRULESTYPE;
import com.koreanair.eretail.pojo.common.common.LISTMSG;
import com.koreanair.eretail.pojo.farecommon.farecommon.COMMERCIALFAREFAMILYType;
import com.koreanair.eretail.pojo.farecommon.farecommon.SERVICELEVELDICTIONARYType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.FAREFAMILYFareType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.LISTITINERARYType;
import com.koreanair.eretail.pojo.farecommon.flowsignature.FLOWSIGNATUREType;
import com.koreanair.eretail.pojo.farecommon.travellercommon.INPUTLISTTRAVELLERType;
import com.koreanair.eretail.pojo.farecommon.travellercommon.LISTTRAVELLERINFOType;
import com.koreanair.eretail.pojo.flexpricer.flexpricercertificateavailabilityrulestype.AVAILABILITYRULESType;
import com.koreanair.eretail.pojo.profile.commonprofileout.LISTFREQUENTFLYERTYPE;
import com.koreanair.eretail.pojo.taxexemption.taxexemptionoutput.TAXEXEMPTIONDATA;
import com.koreanair.eretail.pojo.ticketchanger.ticketchangercommon.LISTELEMENTUPDATEType;
import com.koreanair.eretail.pojo.ticketchanger.ticketchangercommonoutput.BOOKEDTRIPType;
import com.koreanair.eretail.pojo.ticketchanger.ticketchangercommonoutput.LISTREDEMPTIONType;


/**
 * <p>Java class for FARE_COMMON_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_COMMON_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}PAGE_TICKET"/&gt;
 *         &lt;group ref="{}FareOutputGroup"/&gt;
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
@XmlType(name = "FARE_COMMON_Type", propOrder = {
    "pageticket",
    "creationmode",
    "listfarehostcommand",
    "requestoptions",
    "flowsignature",
    "restriction",
    "triptype",
    "listmsg",
    "tripfare",
    "listtripfare",
    "listpricingsolution",
    "listrepricingsolution",
    "listitinerary",
    "listtickettype",
    "dictionary",
    "cabin",
    "requestedusercabin",
    "listpriceinfo",
    "listredemption",
    "listelementupdate",
    "listexternalid",
    "frompage",
    "apismanageroutput",
    "apisrules",
    "apiscollectionmode",
    "travelsponsor",
    "listrecommendation",
    "listpanelstatistics",
    "requestedfarefamily",
    "listrules",
    "listcommercialfarefamily",
    "listlightfarefamily",
    "listtripelement",
    "listfpalternatetripelement",
    "fpbuyupsearchdata",
    "listtaxexemption",
    "listoriginatingrecommendation",
    "pricingtype",
    "listfarecontext",
    "bookedtrip",
    "listtraveller",
    "listtravellerinfo",
    "forceptc",
    "availabilitytime",
    "serviceleveldictionary",
    "availabilityrules"
})
public class FARECOMMONType
    implements Serializable
{

    @XmlElement(name = "PAGE_TICKET", required = true)
    protected String pageticket;
    @XmlElement(name = "CREATION_MODE")
    protected BigInteger creationmode;
    @XmlElement(name = "LIST_FARE_HOST_COMMAND")
    protected List<LISTFAREHOSTCOMMANDType> listfarehostcommand;
    @XmlElement(name = "REQUEST_OPTIONS")
    protected REQUESTOPTIONSType requestoptions;
    @XmlElement(name = "FLOW_SIGNATURE")
    protected FLOWSIGNATUREType flowsignature;
    @XmlElement(name = "RESTRICTION")
    protected Boolean restriction;
    @XmlElement(name = "TRIP_TYPE")
    protected String triptype;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "TRIP_FARE")
    protected FareOutputType tripfare;
    @XmlElement(name = "LIST_TRIP_FARE")
    protected List<LISTTRIPFAREType> listtripfare;
    @XmlElement(name = "LIST_PRICING_SOLUTION")
    protected List<LISTPRICINGSOLUTIONType> listpricingsolution;
    @XmlElement(name = "LIST_REPRICING_SOLUTION")
    protected List<FareOutputType> listrepricingsolution;
    @XmlElement(name = "LIST_ITINERARY")
    protected List<LISTITINERARYType> listitinerary;
    @XmlElement(name = "LIST_TICKET_TYPE")
    protected List<TICKETTYPEType> listtickettype;
    @XmlElement(name = "DICTIONARY")
    protected DICTIONARY dictionary;
    @XmlElement(name = "CABIN")
    protected String cabin;
    @XmlElement(name = "REQUESTED_USER_CABIN")
    protected String requestedusercabin;
    @XmlElement(name = "LIST_PRICE_INFO")
    protected List<LISTPRICEINFOType> listpriceinfo;
    @XmlElement(name = "LIST_REDEMPTION")
    protected List<LISTREDEMPTIONType> listredemption;
    @XmlElement(name = "LIST_ELEMENT_UPDATE")
    protected List<LISTELEMENTUPDATEType> listelementupdate;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<Object> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "APIS_MANAGER_OUTPUT")
    protected APISMANAGEROUTPUTTYPE apismanageroutput;
    @XmlElement(name = "APIS_RULES")
    protected APISRULESTYPE apisrules;
    @XmlElement(name = "APIS_COLLECTION_MODE")
    protected Object apiscollectionmode;
    @XmlElement(name = "TRAVEL_SPONSOR")
    protected FARECOMMONType.TRAVELSPONSOR travelsponsor;
    @XmlElement(name = "LIST_RECOMMENDATION")
    protected List<LISTRECOMMENDATIONType> listrecommendation;
    @XmlElement(name = "LIST_PANEL_STATISTICS")
    protected List<FARECOMMONType.LISTPANELSTATISTICS> listpanelstatistics;
    @XmlElement(name = "REQUESTED_FARE_FAMILY")
    protected FAREFAMILYFareType requestedfarefamily;
    @XmlElement(name = "LIST_RULES")
    protected List<LISTRULES> listrules;
    @XmlElement(name = "LIST_COMMERCIAL_FARE_FAMILY")
    protected List<COMMERCIALFAREFAMILYType> listcommercialfarefamily;
    @XmlElement(name = "LIST_LIGHT_FARE_FAMILY")
    protected List<LIGHTFAREFAMILYType> listlightfarefamily;
    @XmlElement(name = "LIST_TRIP_ELEMENT")
    protected List<LISTTRIPELEMENTType> listtripelement;
    @XmlElement(name = "LIST_FP_ALTERNATE_TRIP_ELEMENT")
    protected List<LISTFPALTERNATETRIPELEMENTType> listfpalternatetripelement;
    @XmlElement(name = "FP_BUYUP_SEARCH_DATA")
    protected FPBUYUPSEARCHDATAType fpbuyupsearchdata;
    @XmlElement(name = "LIST_TAX_EXEMPTION")
    protected List<TAXEXEMPTIONDATA> listtaxexemption;
    @XmlElement(name = "LIST_ORIGINATING_RECOMMENDATION")
    protected List<LISTORIGINATINGRECOMMENDATIONType> listoriginatingrecommendation;
    @XmlElement(name = "PRICING_TYPE")
    protected String pricingtype;
    @XmlElement(name = "LIST_FARE_CONTEXT")
    protected LISTFARECONTEXTType listfarecontext;
    @XmlElement(name = "BOOKED_TRIP")
    protected BOOKEDTRIPType bookedtrip;
    @XmlElement(name = "LIST_TRAVELLER")
    protected List<INPUTLISTTRAVELLERType> listtraveller;
    @XmlElement(name = "LIST_TRAVELLER_INFO")
    protected List<LISTTRAVELLERINFOType> listtravellerinfo;
    @XmlElement(name = "FORCE_PTC")
    protected Boolean forceptc;
    @XmlElement(name = "AVAILABILITY_TIME")
    protected String availabilitytime;
    @XmlElement(name = "SERVICE_LEVEL_DICTIONARY")
    protected SERVICELEVELDICTIONARYType serviceleveldictionary;
    @XmlElement(name = "AVAILABILITY_RULES")
    protected AVAILABILITYRULESType availabilityrules;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the pageticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAGETICKET() {
        return pageticket;
    }

    /**
     * Sets the value of the pageticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAGETICKET(String value) {
        this.pageticket = value;
    }

    /**
     * Gets the value of the creationmode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCREATIONMODE() {
        return creationmode;
    }

    /**
     * Sets the value of the creationmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCREATIONMODE(BigInteger value) {
        this.creationmode = value;
    }

    /**
     * Gets the value of the listfarehostcommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarehostcommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREHOSTCOMMAND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFAREHOSTCOMMANDType }
     * 
     * 
     */
    public List<LISTFAREHOSTCOMMANDType> getLISTFAREHOSTCOMMAND() {
        if (listfarehostcommand == null) {
            listfarehostcommand = new ArrayList<LISTFAREHOSTCOMMANDType>();
        }
        return this.listfarehostcommand;
    }

    /**
     * Gets the value of the requestoptions property.
     * 
     * @return
     *     possible object is
     *     {@link REQUESTOPTIONSType }
     *     
     */
    public REQUESTOPTIONSType getREQUESTOPTIONS() {
        return requestoptions;
    }

    /**
     * Sets the value of the requestoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUESTOPTIONSType }
     *     
     */
    public void setREQUESTOPTIONS(REQUESTOPTIONSType value) {
        this.requestoptions = value;
    }

    /**
     * Gets the value of the flowsignature property.
     * 
     * @return
     *     possible object is
     *     {@link FLOWSIGNATUREType }
     *     
     */
    public FLOWSIGNATUREType getFLOWSIGNATURE() {
        return flowsignature;
    }

    /**
     * Sets the value of the flowsignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLOWSIGNATUREType }
     *     
     */
    public void setFLOWSIGNATURE(FLOWSIGNATUREType value) {
        this.flowsignature = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRESTRICTION() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRESTRICTION(Boolean value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the triptype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIPTYPE() {
        return triptype;
    }

    /**
     * Sets the value of the triptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIPTYPE(String value) {
        this.triptype = value;
    }

    /**
     * Gets the value of the listmsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMSG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMSG }
     * 
     * 
     */
    public List<LISTMSG> getLISTMSG() {
        if (listmsg == null) {
            listmsg = new ArrayList<LISTMSG>();
        }
        return this.listmsg;
    }

    /**
     * Gets the value of the tripfare property.
     * 
     * @return
     *     possible object is
     *     {@link FareOutputType }
     *     
     */
    public FareOutputType getTRIPFARE() {
        return tripfare;
    }

    /**
     * Sets the value of the tripfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareOutputType }
     *     
     */
    public void setTRIPFARE(FareOutputType value) {
        this.tripfare = value;
    }

    /**
     * Gets the value of the listtripfare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtripfare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRIPFARE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRIPFAREType }
     * 
     * 
     */
    public List<LISTTRIPFAREType> getLISTTRIPFARE() {
        if (listtripfare == null) {
            listtripfare = new ArrayList<LISTTRIPFAREType>();
        }
        return this.listtripfare;
    }

    /**
     * Gets the value of the listpricingsolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpricingsolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICINGSOLUTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICINGSOLUTIONType }
     * 
     * 
     */
    public List<LISTPRICINGSOLUTIONType> getLISTPRICINGSOLUTION() {
        if (listpricingsolution == null) {
            listpricingsolution = new ArrayList<LISTPRICINGSOLUTIONType>();
        }
        return this.listpricingsolution;
    }

    /**
     * Gets the value of the listrepricingsolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrepricingsolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREPRICINGSOLUTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareOutputType }
     * 
     * 
     */
    public List<FareOutputType> getLISTREPRICINGSOLUTION() {
        if (listrepricingsolution == null) {
            listrepricingsolution = new ArrayList<FareOutputType>();
        }
        return this.listrepricingsolution;
    }

    /**
     * Gets the value of the listitinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listitinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTITINERARY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTITINERARYType }
     * 
     * 
     */
    public List<LISTITINERARYType> getLISTITINERARY() {
        if (listitinerary == null) {
            listitinerary = new ArrayList<LISTITINERARYType>();
        }
        return this.listitinerary;
    }

    /**
     * Gets the value of the listtickettype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtickettype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTICKETTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TICKETTYPEType }
     * 
     * 
     */
    public List<TICKETTYPEType> getLISTTICKETTYPE() {
        if (listtickettype == null) {
            listtickettype = new ArrayList<TICKETTYPEType>();
        }
        return this.listtickettype;
    }

    /**
     * Gets the value of the dictionary property.
     * 
     * @return
     *     possible object is
     *     {@link DICTIONARY }
     *     
     */
    public DICTIONARY getDICTIONARY() {
        return dictionary;
    }

    /**
     * Sets the value of the dictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DICTIONARY }
     *     
     */
    public void setDICTIONARY(DICTIONARY value) {
        this.dictionary = value;
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
     * Gets the value of the requestedusercabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQUESTEDUSERCABIN() {
        return requestedusercabin;
    }

    /**
     * Sets the value of the requestedusercabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQUESTEDUSERCABIN(String value) {
        this.requestedusercabin = value;
    }

    /**
     * Gets the value of the listpriceinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpriceinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICEINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPRICEINFOType }
     * 
     * 
     */
    public List<LISTPRICEINFOType> getLISTPRICEINFO() {
        if (listpriceinfo == null) {
            listpriceinfo = new ArrayList<LISTPRICEINFOType>();
        }
        return this.listpriceinfo;
    }

    /**
     * Gets the value of the listredemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listredemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREDEMPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTREDEMPTIONType }
     * 
     * 
     */
    public List<LISTREDEMPTIONType> getLISTREDEMPTION() {
        if (listredemption == null) {
            listredemption = new ArrayList<LISTREDEMPTIONType>();
        }
        return this.listredemption;
    }

    /**
     * Gets the value of the listelementupdate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelementupdate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENTUPDATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTELEMENTUPDATEType }
     * 
     * 
     */
    public List<LISTELEMENTUPDATEType> getLISTELEMENTUPDATE() {
        if (listelementupdate == null) {
            listelementupdate = new ArrayList<LISTELEMENTUPDATEType>();
        }
        return this.listelementupdate;
    }

    /**
     * Gets the value of the listexternalid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexternalid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXTERNALID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLISTEXTERNALID() {
        if (listexternalid == null) {
            listexternalid = new ArrayList<Object>();
        }
        return this.listexternalid;
    }

    /**
     * Gets the value of the frompage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFROMPAGE() {
        return frompage;
    }

    /**
     * Sets the value of the frompage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFROMPAGE(Object value) {
        this.frompage = value;
    }

    /**
     * Gets the value of the apismanageroutput property.
     * 
     * @return
     *     possible object is
     *     {@link APISMANAGEROUTPUTTYPE }
     *     
     */
    public APISMANAGEROUTPUTTYPE getAPISMANAGEROUTPUT() {
        return apismanageroutput;
    }

    /**
     * Sets the value of the apismanageroutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISMANAGEROUTPUTTYPE }
     *     
     */
    public void setAPISMANAGEROUTPUT(APISMANAGEROUTPUTTYPE value) {
        this.apismanageroutput = value;
    }

    /**
     * Gets the value of the apisrules property.
     * 
     * @return
     *     possible object is
     *     {@link APISRULESTYPE }
     *     
     */
    public APISRULESTYPE getAPISRULES() {
        return apisrules;
    }

    /**
     * Sets the value of the apisrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISRULESTYPE }
     *     
     */
    public void setAPISRULES(APISRULESTYPE value) {
        this.apisrules = value;
    }

    /**
     * Gets the value of the apiscollectionmode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCOLLECTIONMODE() {
        return apiscollectionmode;
    }

    /**
     * Sets the value of the apiscollectionmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCOLLECTIONMODE(Object value) {
        this.apiscollectionmode = value;
    }

    /**
     * Gets the value of the travelsponsor property.
     * 
     * @return
     *     possible object is
     *     {@link FARECOMMONType.TRAVELSPONSOR }
     *     
     */
    public FARECOMMONType.TRAVELSPONSOR getTRAVELSPONSOR() {
        return travelsponsor;
    }

    /**
     * Sets the value of the travelsponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link FARECOMMONType.TRAVELSPONSOR }
     *     
     */
    public void setTRAVELSPONSOR(FARECOMMONType.TRAVELSPONSOR value) {
        this.travelsponsor = value;
    }

    /**
     * Gets the value of the listrecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRECOMMENDATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTRECOMMENDATIONType }
     * 
     * 
     */
    public List<LISTRECOMMENDATIONType> getLISTRECOMMENDATION() {
        if (listrecommendation == null) {
            listrecommendation = new ArrayList<LISTRECOMMENDATIONType>();
        }
        return this.listrecommendation;
    }

    /**
     * Gets the value of the listpanelstatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpanelstatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPANELSTATISTICS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FARECOMMONType.LISTPANELSTATISTICS }
     * 
     * 
     */
    public List<FARECOMMONType.LISTPANELSTATISTICS> getLISTPANELSTATISTICS() {
        if (listpanelstatistics == null) {
            listpanelstatistics = new ArrayList<FARECOMMONType.LISTPANELSTATISTICS>();
        }
        return this.listpanelstatistics;
    }

    /**
     * Gets the value of the requestedfarefamily property.
     * 
     * @return
     *     possible object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public FAREFAMILYFareType getREQUESTEDFAREFAMILY() {
        return requestedfarefamily;
    }

    /**
     * Sets the value of the requestedfarefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public void setREQUESTEDFAREFAMILY(FAREFAMILYFareType value) {
        this.requestedfarefamily = value;
    }

    /**
     * Gets the value of the listrules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRULES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTRULES }
     * 
     * 
     */
    public List<LISTRULES> getLISTRULES() {
        if (listrules == null) {
            listrules = new ArrayList<LISTRULES>();
        }
        return this.listrules;
    }

    /**
     * Gets the value of the listcommercialfarefamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcommercialfarefamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOMMERCIALFAREFAMILY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COMMERCIALFAREFAMILYType }
     * 
     * 
     */
    public List<COMMERCIALFAREFAMILYType> getLISTCOMMERCIALFAREFAMILY() {
        if (listcommercialfarefamily == null) {
            listcommercialfarefamily = new ArrayList<COMMERCIALFAREFAMILYType>();
        }
        return this.listcommercialfarefamily;
    }

    /**
     * Gets the value of the listlightfarefamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listlightfarefamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTLIGHTFAREFAMILY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIGHTFAREFAMILYType }
     * 
     * 
     */
    public List<LIGHTFAREFAMILYType> getLISTLIGHTFAREFAMILY() {
        if (listlightfarefamily == null) {
            listlightfarefamily = new ArrayList<LIGHTFAREFAMILYType>();
        }
        return this.listlightfarefamily;
    }

    /**
     * Gets the value of the listtripelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtripelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRIPELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRIPELEMENTType }
     * 
     * 
     */
    public List<LISTTRIPELEMENTType> getLISTTRIPELEMENT() {
        if (listtripelement == null) {
            listtripelement = new ArrayList<LISTTRIPELEMENTType>();
        }
        return this.listtripelement;
    }

    /**
     * Gets the value of the listfpalternatetripelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfpalternatetripelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFPALTERNATETRIPELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFPALTERNATETRIPELEMENTType }
     * 
     * 
     */
    public List<LISTFPALTERNATETRIPELEMENTType> getLISTFPALTERNATETRIPELEMENT() {
        if (listfpalternatetripelement == null) {
            listfpalternatetripelement = new ArrayList<LISTFPALTERNATETRIPELEMENTType>();
        }
        return this.listfpalternatetripelement;
    }

    /**
     * Gets the value of the fpbuyupsearchdata property.
     * 
     * @return
     *     possible object is
     *     {@link FPBUYUPSEARCHDATAType }
     *     
     */
    public FPBUYUPSEARCHDATAType getFPBUYUPSEARCHDATA() {
        return fpbuyupsearchdata;
    }

    /**
     * Sets the value of the fpbuyupsearchdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPBUYUPSEARCHDATAType }
     *     
     */
    public void setFPBUYUPSEARCHDATA(FPBUYUPSEARCHDATAType value) {
        this.fpbuyupsearchdata = value;
    }

    /**
     * Gets the value of the listtaxexemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtaxexemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTAXEXEMPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAXEXEMPTIONDATA }
     * 
     * 
     */
    public List<TAXEXEMPTIONDATA> getLISTTAXEXEMPTION() {
        if (listtaxexemption == null) {
            listtaxexemption = new ArrayList<TAXEXEMPTIONDATA>();
        }
        return this.listtaxexemption;
    }

    /**
     * Gets the value of the listoriginatingrecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listoriginatingrecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTORIGINATINGRECOMMENDATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTORIGINATINGRECOMMENDATIONType }
     * 
     * 
     */
    public List<LISTORIGINATINGRECOMMENDATIONType> getLISTORIGINATINGRECOMMENDATION() {
        if (listoriginatingrecommendation == null) {
            listoriginatingrecommendation = new ArrayList<LISTORIGINATINGRECOMMENDATIONType>();
        }
        return this.listoriginatingrecommendation;
    }

    /**
     * Gets the value of the pricingtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICINGTYPE() {
        return pricingtype;
    }

    /**
     * Sets the value of the pricingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICINGTYPE(String value) {
        this.pricingtype = value;
    }

    /**
     * Gets the value of the listfarecontext property.
     * 
     * @return
     *     possible object is
     *     {@link LISTFARECONTEXTType }
     *     
     */
    public LISTFARECONTEXTType getLISTFARECONTEXT() {
        return listfarecontext;
    }

    /**
     * Sets the value of the listfarecontext property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTFARECONTEXTType }
     *     
     */
    public void setLISTFARECONTEXT(LISTFARECONTEXTType value) {
        this.listfarecontext = value;
    }

    /**
     * Gets the value of the bookedtrip property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKEDTRIPType }
     *     
     */
    public BOOKEDTRIPType getBOOKEDTRIP() {
        return bookedtrip;
    }

    /**
     * Sets the value of the bookedtrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKEDTRIPType }
     *     
     */
    public void setBOOKEDTRIP(BOOKEDTRIPType value) {
        this.bookedtrip = value;
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
     * {@link INPUTLISTTRAVELLERType }
     * 
     * 
     */
    public List<INPUTLISTTRAVELLERType> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<INPUTLISTTRAVELLERType>();
        }
        return this.listtraveller;
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
     * Gets the value of the availabilitytime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABILITYTIME() {
        return availabilitytime;
    }

    /**
     * Sets the value of the availabilitytime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABILITYTIME(String value) {
        this.availabilitytime = value;
    }

    /**
     * Gets the value of the serviceleveldictionary property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICELEVELDICTIONARYType }
     *     
     */
    public SERVICELEVELDICTIONARYType getSERVICELEVELDICTIONARY() {
        return serviceleveldictionary;
    }

    /**
     * Sets the value of the serviceleveldictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICELEVELDICTIONARYType }
     *     
     */
    public void setSERVICELEVELDICTIONARY(SERVICELEVELDICTIONARYType value) {
        this.serviceleveldictionary = value;
    }

    /**
     * Gets the value of the availabilityrules property.
     * 
     * @return
     *     possible object is
     *     {@link AVAILABILITYRULESType }
     *     
     */
    public AVAILABILITYRULESType getAVAILABILITYRULES() {
        return availabilityrules;
    }

    /**
     * Sets the value of the availabilityrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVAILABILITYRULESType }
     *     
     */
    public void setAVAILABILITYRULES(AVAILABILITYRULESType value) {
        this.availabilityrules = value;
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
     *         &lt;element name="PANEL_INFO"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ELEMENT" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="B_LOCATION" type="{}unprotectedStringType" maxOccurs="unbounded"/&gt;
     *                             &lt;element name="E_LOCATION" type="{}unprotectedStringType" maxOccurs="unbounded"/&gt;
     *                             &lt;element ref="{}DATE"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PANEL_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="STATISTICS"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PANEL" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="LOWEST_FARES"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="LOWEST_CONVERTED_MILES" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="HIGHEST_FARES" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="HIGHEST_CONVERTED_MILES" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="RECOMMENDATION_COUNT" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="LIST_FARE_FAMILY_COUNT" type="{}FARE_FAMILY_COUNT_Type" maxOccurs="unbounded"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="SOLUTION_COUNT" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="LIST_FARE_FAMILY_COUNT" type="{}FARE_FAMILY_COUNT_Type" maxOccurs="unbounded"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TOTAL_RECOMMENDATION_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="TOTAL_SOLUTION_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SELECTION" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
     *                             &lt;element name="FARE_FAMILY" type="{}unprotectedStringType"/&gt;
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
        "panelinfo",
        "statistics"
    })
    public static class LISTPANELSTATISTICS
        implements Serializable
    {

        @XmlElement(name = "PANEL_INFO", required = true)
        protected FARECOMMONType.LISTPANELSTATISTICS.PANELINFO panelinfo;
        @XmlElement(name = "STATISTICS", required = true)
        protected FARECOMMONType.LISTPANELSTATISTICS.STATISTICS statistics;

        /**
         * Gets the value of the panelinfo property.
         * 
         * @return
         *     possible object is
         *     {@link FARECOMMONType.LISTPANELSTATISTICS.PANELINFO }
         *     
         */
        public FARECOMMONType.LISTPANELSTATISTICS.PANELINFO getPANELINFO() {
            return panelinfo;
        }

        /**
         * Sets the value of the panelinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FARECOMMONType.LISTPANELSTATISTICS.PANELINFO }
         *     
         */
        public void setPANELINFO(FARECOMMONType.LISTPANELSTATISTICS.PANELINFO value) {
            this.panelinfo = value;
        }

        /**
         * Gets the value of the statistics property.
         * 
         * @return
         *     possible object is
         *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS }
         *     
         */
        public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS getSTATISTICS() {
            return statistics;
        }

        /**
         * Sets the value of the statistics property.
         * 
         * @param value
         *     allowed object is
         *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS }
         *     
         */
        public void setSTATISTICS(FARECOMMONType.LISTPANELSTATISTICS.STATISTICS value) {
            this.statistics = value;
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
         *         &lt;element name="ELEMENT" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="B_LOCATION" type="{}unprotectedStringType" maxOccurs="unbounded"/&gt;
         *                   &lt;element name="E_LOCATION" type="{}unprotectedStringType" maxOccurs="unbounded"/&gt;
         *                   &lt;element ref="{}DATE"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PANEL_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "element",
            "paneltype"
        })
        public static class PANELINFO
            implements Serializable
        {

            @XmlElement(name = "ELEMENT", required = true)
            protected List<FARECOMMONType.LISTPANELSTATISTICS.PANELINFO.ELEMENT> element;
            @XmlElement(name = "PANEL_TYPE")
            protected String paneltype;

            /**
             * Gets the value of the element property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the element property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getELEMENT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FARECOMMONType.LISTPANELSTATISTICS.PANELINFO.ELEMENT }
             * 
             * 
             */
            public List<FARECOMMONType.LISTPANELSTATISTICS.PANELINFO.ELEMENT> getELEMENT() {
                if (element == null) {
                    element = new ArrayList<FARECOMMONType.LISTPANELSTATISTICS.PANELINFO.ELEMENT>();
                }
                return this.element;
            }

            /**
             * Gets the value of the paneltype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPANELTYPE() {
                return paneltype;
            }

            /**
             * Sets the value of the paneltype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPANELTYPE(String value) {
                this.paneltype = value;
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
             *         &lt;element name="B_LOCATION" type="{}unprotectedStringType" maxOccurs="unbounded"/&gt;
             *         &lt;element name="E_LOCATION" type="{}unprotectedStringType" maxOccurs="unbounded"/&gt;
             *         &lt;element ref="{}DATE"/&gt;
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
                "blocation",
                "elocation",
                "date"
            })
            public static class ELEMENT
                implements Serializable
            {

                @XmlElement(name = "B_LOCATION", required = true)
                protected List<String> blocation;
                @XmlElement(name = "E_LOCATION", required = true)
                protected List<String> elocation;
                @XmlElement(name = "DATE", required = true)
                protected DATE date;

                /**
                 * Gets the value of the blocation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the blocation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBLOCATION().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getBLOCATION() {
                    if (blocation == null) {
                        blocation = new ArrayList<String>();
                    }
                    return this.blocation;
                }

                /**
                 * Gets the value of the elocation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the elocation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getELOCATION().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getELOCATION() {
                    if (elocation == null) {
                        elocation = new ArrayList<String>();
                    }
                    return this.elocation;
                }

                /**
                 * Gets the value of the date property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DATE }
                 *     
                 */
                public DATE getDATE() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DATE }
                 *     
                 */
                public void setDATE(DATE value) {
                    this.date = value;
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
         *         &lt;element name="PANEL" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="LOWEST_FARES"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="LOWEST_CONVERTED_MILES" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="HIGHEST_FARES" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="HIGHEST_CONVERTED_MILES" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="RECOMMENDATION_COUNT" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="LIST_FARE_FAMILY_COUNT" type="{}FARE_FAMILY_COUNT_Type" maxOccurs="unbounded"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="SOLUTION_COUNT" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="LIST_FARE_FAMILY_COUNT" type="{}FARE_FAMILY_COUNT_Type" maxOccurs="unbounded"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="TOTAL_RECOMMENDATION_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="TOTAL_SOLUTION_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SELECTION" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
         *                   &lt;element name="FARE_FAMILY" type="{}unprotectedStringType"/&gt;
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
            "panel",
            "selection"
        })
        public static class STATISTICS
            implements Serializable
        {

            @XmlElement(name = "PANEL")
            protected FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL panel;
            @XmlElement(name = "SELECTION")
            protected FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.SELECTION selection;

            /**
             * Gets the value of the panel property.
             * 
             * @return
             *     possible object is
             *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL }
             *     
             */
            public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL getPANEL() {
                return panel;
            }

            /**
             * Sets the value of the panel property.
             * 
             * @param value
             *     allowed object is
             *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL }
             *     
             */
            public void setPANEL(FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL value) {
                this.panel = value;
            }

            /**
             * Gets the value of the selection property.
             * 
             * @return
             *     possible object is
             *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.SELECTION }
             *     
             */
            public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.SELECTION getSELECTION() {
                return selection;
            }

            /**
             * Sets the value of the selection property.
             * 
             * @param value
             *     allowed object is
             *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.SELECTION }
             *     
             */
            public void setSELECTION(FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.SELECTION value) {
                this.selection = value;
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
             *         &lt;element name="LOWEST_FARES"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="LOWEST_CONVERTED_MILES" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="HIGHEST_FARES" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="HIGHEST_CONVERTED_MILES" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="RECOMMENDATION_COUNT" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="LIST_FARE_FAMILY_COUNT" type="{}FARE_FAMILY_COUNT_Type" maxOccurs="unbounded"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="SOLUTION_COUNT" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="LIST_FARE_FAMILY_COUNT" type="{}FARE_FAMILY_COUNT_Type" maxOccurs="unbounded"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="TOTAL_RECOMMENDATION_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="TOTAL_SOLUTION_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
                "lowestfares",
                "lowestconvertedmiles",
                "highestfares",
                "highestconvertedmiles",
                "recommendationcount",
                "solutioncount",
                "totalrecommendationcount",
                "totalsolutioncount"
            })
            public static class PANEL
                implements Serializable
            {

                @XmlElement(name = "LOWEST_FARES", required = true)
                protected FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTFARES lowestfares;
                @XmlElement(name = "LOWEST_CONVERTED_MILES")
                protected FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTCONVERTEDMILES lowestconvertedmiles;
                @XmlElement(name = "HIGHEST_FARES")
                protected FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTFARES highestfares;
                @XmlElement(name = "HIGHEST_CONVERTED_MILES")
                protected FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTCONVERTEDMILES highestconvertedmiles;
                @XmlElement(name = "RECOMMENDATION_COUNT")
                protected FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.RECOMMENDATIONCOUNT recommendationcount;
                @XmlElement(name = "SOLUTION_COUNT")
                protected FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.SOLUTIONCOUNT solutioncount;
                @XmlElement(name = "TOTAL_RECOMMENDATION_COUNT")
                protected BigInteger totalrecommendationcount;
                @XmlElement(name = "TOTAL_SOLUTION_COUNT")
                protected BigInteger totalsolutioncount;

                /**
                 * Gets the value of the lowestfares property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTFARES }
                 *     
                 */
                public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTFARES getLOWESTFARES() {
                    return lowestfares;
                }

                /**
                 * Sets the value of the lowestfares property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTFARES }
                 *     
                 */
                public void setLOWESTFARES(FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTFARES value) {
                    this.lowestfares = value;
                }

                /**
                 * Gets the value of the lowestconvertedmiles property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTCONVERTEDMILES }
                 *     
                 */
                public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTCONVERTEDMILES getLOWESTCONVERTEDMILES() {
                    return lowestconvertedmiles;
                }

                /**
                 * Sets the value of the lowestconvertedmiles property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTCONVERTEDMILES }
                 *     
                 */
                public void setLOWESTCONVERTEDMILES(FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.LOWESTCONVERTEDMILES value) {
                    this.lowestconvertedmiles = value;
                }

                /**
                 * Gets the value of the highestfares property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTFARES }
                 *     
                 */
                public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTFARES getHIGHESTFARES() {
                    return highestfares;
                }

                /**
                 * Sets the value of the highestfares property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTFARES }
                 *     
                 */
                public void setHIGHESTFARES(FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTFARES value) {
                    this.highestfares = value;
                }

                /**
                 * Gets the value of the highestconvertedmiles property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTCONVERTEDMILES }
                 *     
                 */
                public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTCONVERTEDMILES getHIGHESTCONVERTEDMILES() {
                    return highestconvertedmiles;
                }

                /**
                 * Sets the value of the highestconvertedmiles property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTCONVERTEDMILES }
                 *     
                 */
                public void setHIGHESTCONVERTEDMILES(FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.HIGHESTCONVERTEDMILES value) {
                    this.highestconvertedmiles = value;
                }

                /**
                 * Gets the value of the recommendationcount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.RECOMMENDATIONCOUNT }
                 *     
                 */
                public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.RECOMMENDATIONCOUNT getRECOMMENDATIONCOUNT() {
                    return recommendationcount;
                }

                /**
                 * Sets the value of the recommendationcount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.RECOMMENDATIONCOUNT }
                 *     
                 */
                public void setRECOMMENDATIONCOUNT(FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.RECOMMENDATIONCOUNT value) {
                    this.recommendationcount = value;
                }

                /**
                 * Gets the value of the solutioncount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.SOLUTIONCOUNT }
                 *     
                 */
                public FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.SOLUTIONCOUNT getSOLUTIONCOUNT() {
                    return solutioncount;
                }

                /**
                 * Sets the value of the solutioncount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.SOLUTIONCOUNT }
                 *     
                 */
                public void setSOLUTIONCOUNT(FARECOMMONType.LISTPANELSTATISTICS.STATISTICS.PANEL.SOLUTIONCOUNT value) {
                    this.solutioncount = value;
                }

                /**
                 * Gets the value of the totalrecommendationcount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTOTALRECOMMENDATIONCOUNT() {
                    return totalrecommendationcount;
                }

                /**
                 * Sets the value of the totalrecommendationcount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTOTALRECOMMENDATIONCOUNT(BigInteger value) {
                    this.totalrecommendationcount = value;
                }

                /**
                 * Gets the value of the totalsolutioncount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTOTALSOLUTIONCOUNT() {
                    return totalsolutioncount;
                }

                /**
                 * Sets the value of the totalsolutioncount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTOTALSOLUTIONCOUNT(BigInteger value) {
                    this.totalsolutioncount = value;
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
                 *         &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
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
                    "listfarefamilyamount"
                })
                public static class HIGHESTCONVERTEDMILES
                    implements Serializable
                {

                    @XmlElement(name = "LIST_FARE_FAMILY_AMOUNT", required = true)
                    protected List<FAREFAMILYAMOUNTType> listfarefamilyamount;

                    /**
                     * Gets the value of the listfarefamilyamount property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the listfarefamilyamount property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLISTFAREFAMILYAMOUNT().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FAREFAMILYAMOUNTType }
                     * 
                     * 
                     */
                    public List<FAREFAMILYAMOUNTType> getLISTFAREFAMILYAMOUNT() {
                        if (listfarefamilyamount == null) {
                            listfarefamilyamount = new ArrayList<FAREFAMILYAMOUNTType>();
                        }
                        return this.listfarefamilyamount;
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
                 *         &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
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
                    "listfarefamilyamount"
                })
                public static class HIGHESTFARES
                    implements Serializable
                {

                    @XmlElement(name = "LIST_FARE_FAMILY_AMOUNT", required = true)
                    protected List<FAREFAMILYAMOUNTType> listfarefamilyamount;

                    /**
                     * Gets the value of the listfarefamilyamount property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the listfarefamilyamount property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLISTFAREFAMILYAMOUNT().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FAREFAMILYAMOUNTType }
                     * 
                     * 
                     */
                    public List<FAREFAMILYAMOUNTType> getLISTFAREFAMILYAMOUNT() {
                        if (listfarefamilyamount == null) {
                            listfarefamilyamount = new ArrayList<FAREFAMILYAMOUNTType>();
                        }
                        return this.listfarefamilyamount;
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
                 *         &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
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
                    "listfarefamilyamount"
                })
                public static class LOWESTCONVERTEDMILES
                    implements Serializable
                {

                    @XmlElement(name = "LIST_FARE_FAMILY_AMOUNT", required = true)
                    protected List<FAREFAMILYAMOUNTType> listfarefamilyamount;

                    /**
                     * Gets the value of the listfarefamilyamount property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the listfarefamilyamount property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLISTFAREFAMILYAMOUNT().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FAREFAMILYAMOUNTType }
                     * 
                     * 
                     */
                    public List<FAREFAMILYAMOUNTType> getLISTFAREFAMILYAMOUNT() {
                        if (listfarefamilyamount == null) {
                            listfarefamilyamount = new ArrayList<FAREFAMILYAMOUNTType>();
                        }
                        return this.listfarefamilyamount;
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
                 *         &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
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
                    "listfarefamilyamount"
                })
                public static class LOWESTFARES
                    implements Serializable
                {

                    @XmlElement(name = "LIST_FARE_FAMILY_AMOUNT", required = true)
                    protected List<FAREFAMILYAMOUNTType> listfarefamilyamount;

                    /**
                     * Gets the value of the listfarefamilyamount property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the listfarefamilyamount property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLISTFAREFAMILYAMOUNT().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FAREFAMILYAMOUNTType }
                     * 
                     * 
                     */
                    public List<FAREFAMILYAMOUNTType> getLISTFAREFAMILYAMOUNT() {
                        if (listfarefamilyamount == null) {
                            listfarefamilyamount = new ArrayList<FAREFAMILYAMOUNTType>();
                        }
                        return this.listfarefamilyamount;
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
                 *         &lt;element name="LIST_FARE_FAMILY_COUNT" type="{}FARE_FAMILY_COUNT_Type" maxOccurs="unbounded"/&gt;
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
                    "listfarefamilycount"
                })
                public static class RECOMMENDATIONCOUNT
                    implements Serializable
                {

                    @XmlElement(name = "LIST_FARE_FAMILY_COUNT", required = true)
                    protected List<FAREFAMILYCOUNTType> listfarefamilycount;

                    /**
                     * Gets the value of the listfarefamilycount property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the listfarefamilycount property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLISTFAREFAMILYCOUNT().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FAREFAMILYCOUNTType }
                     * 
                     * 
                     */
                    public List<FAREFAMILYCOUNTType> getLISTFAREFAMILYCOUNT() {
                        if (listfarefamilycount == null) {
                            listfarefamilycount = new ArrayList<FAREFAMILYCOUNTType>();
                        }
                        return this.listfarefamilycount;
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
                 *         &lt;element name="LIST_FARE_FAMILY_COUNT" type="{}FARE_FAMILY_COUNT_Type" maxOccurs="unbounded"/&gt;
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
                    "listfarefamilycount"
                })
                public static class SOLUTIONCOUNT
                    implements Serializable
                {

                    @XmlElement(name = "LIST_FARE_FAMILY_COUNT", required = true)
                    protected List<FAREFAMILYCOUNTType> listfarefamilycount;

                    /**
                     * Gets the value of the listfarefamilycount property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the listfarefamilycount property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLISTFAREFAMILYCOUNT().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FAREFAMILYCOUNTType }
                     * 
                     * 
                     */
                    public List<FAREFAMILYCOUNTType> getLISTFAREFAMILYCOUNT() {
                        if (listfarefamilycount == null) {
                            listfarefamilycount = new ArrayList<FAREFAMILYCOUNTType>();
                        }
                        return this.listfarefamilycount;
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
             *         &lt;element name="LIST_FARE_FAMILY_AMOUNT" type="{}FARE_FAMILY_AMOUNT_Type" maxOccurs="unbounded"/&gt;
             *         &lt;element name="FARE_FAMILY" type="{}unprotectedStringType"/&gt;
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
                "listfarefamilyamount",
                "farefamily"
            })
            public static class SELECTION
                implements Serializable
            {

                @XmlElement(name = "LIST_FARE_FAMILY_AMOUNT", required = true)
                protected List<FAREFAMILYAMOUNTType> listfarefamilyamount;
                @XmlElement(name = "FARE_FAMILY", required = true)
                protected String farefamily;

                /**
                 * Gets the value of the listfarefamilyamount property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listfarefamilyamount property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTFAREFAMILYAMOUNT().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FAREFAMILYAMOUNTType }
                 * 
                 * 
                 */
                public List<FAREFAMILYAMOUNTType> getLISTFAREFAMILYAMOUNT() {
                    if (listfarefamilyamount == null) {
                        listfarefamilyamount = new ArrayList<FAREFAMILYAMOUNTType>();
                    }
                    return this.listfarefamilyamount;
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
     *     &lt;extension base="{}LIST_FREQUENT_FLYER_TYPE"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TRAVELSPONSOR
        extends LISTFREQUENTFLYERTYPE
        implements Serializable
    {


    }

}
