
package com.koreanair.eretail.pojo.air.commonout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CodeDescriptorType;
import com.koreanair.eretail.pojo.common.common.FlightFactType;


/**
 * <p>Java class for SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E_LOCATION" type="{}LOCATION_Type"/&gt;
 *         &lt;element name="B_LOCATION" type="{}LOCATION_Type"/&gt;
 *         &lt;element name="AVAILABLE_CABIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{}E_DATE" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_DATE" minOccurs="0"/&gt;
 *         &lt;element name="B_TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="E_TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="AIRLINE" type="{}AIRLINE_Type" minOccurs="0"/&gt;
 *         &lt;element name="OTHER_AIRLINE" type="{}OTHERAIRLINE_Type" minOccurs="0"/&gt;
 *         &lt;element name="TRAFFIC_RESTRICTION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ON_TIME_PERFORMANCE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="IRREGULARITY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OP_FLAG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ACCESS_LEVEL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="E_TICKETING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NUMBER_OF_STOPS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_TIME" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_INFLIGHT_SERVICES" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HAS_GOVT_APPROVAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FLIGHT_FACT" type="{}FlightFactType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MEAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ENTERTAINMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EQUIPMENT_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TIME_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LAST_SEAT_AVAILABILITY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CODE_SHARE_INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SHUTTLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SEGMENT_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SEGMENT_TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LINE_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CANCELLED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EQUIPMENT" type="{}EQUIPMENT_Type" minOccurs="0"/&gt;
 *         &lt;element name="LIST_LEG" type="{}LIST_LEGType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_STOPS" type="{}STOP_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CABIN" type="{}FLIGHT_CABIN_Type" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABILITY_FIRST" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABILITY_BUSINESS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABILITY_ECONOMY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABILITY_ECONOMY_RESTRICTED" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="AVAILABILITY_NEW_ECONOMY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FLOWN_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="B_DAY_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="E_DAY_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="BLACKLISTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ELIGIBLE_TO_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NON_ELIGIBLE_TO_UPGRADE_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_FOUND" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SEGMENT_IDENTIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_CONFIGURATION" type="{}FLIGHT_CONFIGURATION_type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEGMENT_Type", propOrder = {
    "elocation",
    "blocation",
    "availablecabin",
    "edate",
    "bdate",
    "bterminal",
    "eterminal",
    "flightnumber",
    "airline",
    "otherairline",
    "trafficrestriction",
    "ontimeperformance",
    "irregularity",
    "opflag",
    "accesslevel",
    "eticketing",
    "numberofstops",
    "flighttime",
    "listinflightservices",
    "hasgovtapproval",
    "listflightfact",
    "meal",
    "entertainment",
    "equipmentchange",
    "timechange",
    "lastseatavailability",
    "codeshareindicator",
    "shuttle",
    "segmentid",
    "segmenttattoo",
    "linenumber",
    "cancelled",
    "equipment",
    "listleg",
    "liststops",
    "listcabin",
    "availabilityfirst",
    "availabilitybusiness",
    "availabilityeconomy",
    "availabilityeconomyrestricted",
    "availabilityneweconomy",
    "flownindicator",
    "bdayindicator",
    "edayindicator",
    "blacklisted",
    "eligibletoupgrade",
    "noneligibletoupgradereason",
    "flightfound",
    "segmentidentifier",
    "flightconfiguration"
})
public class SEGMENTType
    implements Serializable
{

    @XmlElement(name = "E_LOCATION", required = true)
    protected LOCATIONType elocation;
    @XmlElement(name = "B_LOCATION", required = true)
    protected LOCATIONType blocation;
    @XmlElement(name = "AVAILABLE_CABIN")
    protected String availablecabin;
    @XmlElement(name = "E_DATE")
    protected EDATE edate;
    @XmlElement(name = "B_DATE")
    protected BDATE bdate;
    @XmlElement(name = "B_TERMINAL")
    protected String bterminal;
    @XmlElement(name = "E_TERMINAL")
    protected String eterminal;
    @XmlElement(name = "FLIGHT_NUMBER")
    protected String flightnumber;
    @XmlElement(name = "AIRLINE")
    protected AIRLINEType airline;
    @XmlElement(name = "OTHER_AIRLINE")
    protected OTHERAIRLINEType otherairline;
    @XmlElement(name = "TRAFFIC_RESTRICTION")
    protected Boolean trafficrestriction;
    @XmlElement(name = "ON_TIME_PERFORMANCE")
    protected BigInteger ontimeperformance;
    @XmlElement(name = "IRREGULARITY")
    protected Boolean irregularity;
    @XmlElement(name = "OP_FLAG")
    protected Boolean opflag;
    @XmlElement(name = "ACCESS_LEVEL")
    protected String accesslevel;
    @XmlElement(name = "E_TICKETING")
    protected Boolean eticketing;
    @XmlElement(name = "NUMBER_OF_STOPS")
    protected BigInteger numberofstops;
    @XmlElement(name = "FLIGHT_TIME")
    protected BigInteger flighttime;
    @XmlElement(name = "LIST_INFLIGHT_SERVICES")
    protected List<CodeDescriptorType> listinflightservices;
    @XmlElement(name = "HAS_GOVT_APPROVAL")
    protected Boolean hasgovtapproval;
    @XmlElement(name = "LIST_FLIGHT_FACT")
    protected List<FlightFactType> listflightfact;
    @XmlElement(name = "MEAL")
    protected Boolean meal;
    @XmlElement(name = "ENTERTAINMENT")
    protected Boolean entertainment;
    @XmlElement(name = "EQUIPMENT_CHANGE")
    protected Boolean equipmentchange;
    @XmlElement(name = "TIME_CHANGE")
    protected Boolean timechange;
    @XmlElement(name = "LAST_SEAT_AVAILABILITY")
    protected Boolean lastseatavailability;
    @XmlElement(name = "CODE_SHARE_INDICATOR")
    protected String codeshareindicator;
    @XmlElement(name = "SHUTTLE")
    protected Boolean shuttle;
    @XmlElement(name = "SEGMENT_ID")
    protected String segmentid;
    @XmlElement(name = "SEGMENT_TATTOO")
    protected String segmenttattoo;
    @XmlElement(name = "LINE_NUMBER")
    protected String linenumber;
    @XmlElement(name = "CANCELLED")
    protected Boolean cancelled;
    @XmlElement(name = "EQUIPMENT")
    protected EQUIPMENTType equipment;
    @XmlElement(name = "LIST_LEG")
    protected List<LISTLEGType> listleg;
    @XmlElement(name = "LIST_STOPS")
    protected List<STOPType> liststops;
    @XmlElement(name = "LIST_CABIN")
    protected List<FLIGHTCABINType> listcabin;
    @XmlElement(name = "AVAILABILITY_FIRST")
    protected String availabilityfirst;
    @XmlElement(name = "AVAILABILITY_BUSINESS")
    protected String availabilitybusiness;
    @XmlElement(name = "AVAILABILITY_ECONOMY")
    protected String availabilityeconomy;
    @XmlElement(name = "AVAILABILITY_ECONOMY_RESTRICTED")
    protected String availabilityeconomyrestricted;
    @XmlElement(name = "AVAILABILITY_NEW_ECONOMY")
    protected String availabilityneweconomy;
    @XmlElement(name = "FLOWN_INDICATOR")
    protected Boolean flownindicator;
    @XmlElement(name = "B_DAY_INDICATOR")
    protected BigInteger bdayindicator;
    @XmlElement(name = "E_DAY_INDICATOR")
    protected BigInteger edayindicator;
    @XmlElement(name = "BLACKLISTED")
    protected Boolean blacklisted;
    @XmlElement(name = "ELIGIBLE_TO_UPGRADE")
    protected Boolean eligibletoupgrade;
    @XmlElement(name = "NON_ELIGIBLE_TO_UPGRADE_REASON")
    protected String noneligibletoupgradereason;
    @XmlElement(name = "FLIGHT_FOUND")
    protected Boolean flightfound;
    @XmlElement(name = "SEGMENT_IDENTIFIER")
    protected String segmentidentifier;
    @XmlElement(name = "FLIGHT_CONFIGURATION")
    protected FLIGHTCONFIGURATIONType flightconfiguration;

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link LOCATIONType }
     *     
     */
    public LOCATIONType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATIONType }
     *     
     */
    public void setELOCATION(LOCATIONType value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link LOCATIONType }
     *     
     */
    public LOCATIONType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCATIONType }
     *     
     */
    public void setBLOCATION(LOCATIONType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the availablecabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABLECABIN() {
        return availablecabin;
    }

    /**
     * Sets the value of the availablecabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABLECABIN(String value) {
        this.availablecabin = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link EDATE }
     *     
     */
    public EDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDATE }
     *     
     */
    public void setEDATE(EDATE value) {
        this.edate = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link BDATE }
     *     
     */
    public BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDATE }
     *     
     */
    public void setBDATE(BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the bterminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTERMINAL() {
        return bterminal;
    }

    /**
     * Sets the value of the bterminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTERMINAL(String value) {
        this.bterminal = value;
    }

    /**
     * Gets the value of the eterminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETERMINAL() {
        return eterminal;
    }

    /**
     * Sets the value of the eterminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETERMINAL(String value) {
        this.eterminal = value;
    }

    /**
     * Gets the value of the flightnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIGHTNUMBER() {
        return flightnumber;
    }

    /**
     * Sets the value of the flightnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIGHTNUMBER(String value) {
        this.flightnumber = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link AIRLINEType }
     *     
     */
    public AIRLINEType getAIRLINE() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRLINEType }
     *     
     */
    public void setAIRLINE(AIRLINEType value) {
        this.airline = value;
    }

    /**
     * Gets the value of the otherairline property.
     * 
     * @return
     *     possible object is
     *     {@link OTHERAIRLINEType }
     *     
     */
    public OTHERAIRLINEType getOTHERAIRLINE() {
        return otherairline;
    }

    /**
     * Sets the value of the otherairline property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTHERAIRLINEType }
     *     
     */
    public void setOTHERAIRLINE(OTHERAIRLINEType value) {
        this.otherairline = value;
    }

    /**
     * Gets the value of the trafficrestriction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTRAFFICRESTRICTION() {
        return trafficrestriction;
    }

    /**
     * Sets the value of the trafficrestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTRAFFICRESTRICTION(Boolean value) {
        this.trafficrestriction = value;
    }

    /**
     * Gets the value of the ontimeperformance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getONTIMEPERFORMANCE() {
        return ontimeperformance;
    }

    /**
     * Sets the value of the ontimeperformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setONTIMEPERFORMANCE(BigInteger value) {
        this.ontimeperformance = value;
    }

    /**
     * Gets the value of the irregularity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIRREGULARITY() {
        return irregularity;
    }

    /**
     * Sets the value of the irregularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIRREGULARITY(Boolean value) {
        this.irregularity = value;
    }

    /**
     * Gets the value of the opflag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOPFLAG() {
        return opflag;
    }

    /**
     * Sets the value of the opflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOPFLAG(Boolean value) {
        this.opflag = value;
    }

    /**
     * Gets the value of the accesslevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCESSLEVEL() {
        return accesslevel;
    }

    /**
     * Sets the value of the accesslevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCESSLEVEL(String value) {
        this.accesslevel = value;
    }

    /**
     * Gets the value of the eticketing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isETICKETING() {
        return eticketing;
    }

    /**
     * Sets the value of the eticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETICKETING(Boolean value) {
        this.eticketing = value;
    }

    /**
     * Gets the value of the numberofstops property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBEROFSTOPS() {
        return numberofstops;
    }

    /**
     * Sets the value of the numberofstops property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBEROFSTOPS(BigInteger value) {
        this.numberofstops = value;
    }

    /**
     * Gets the value of the flighttime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFLIGHTTIME() {
        return flighttime;
    }

    /**
     * Sets the value of the flighttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFLIGHTTIME(BigInteger value) {
        this.flighttime = value;
    }

    /**
     * Gets the value of the listinflightservices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listinflightservices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINFLIGHTSERVICES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeDescriptorType }
     * 
     * 
     */
    public List<CodeDescriptorType> getLISTINFLIGHTSERVICES() {
        if (listinflightservices == null) {
            listinflightservices = new ArrayList<CodeDescriptorType>();
        }
        return this.listinflightservices;
    }

    /**
     * Gets the value of the hasgovtapproval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHASGOVTAPPROVAL() {
        return hasgovtapproval;
    }

    /**
     * Sets the value of the hasgovtapproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHASGOVTAPPROVAL(Boolean value) {
        this.hasgovtapproval = value;
    }

    /**
     * Gets the value of the listflightfact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listflightfact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFLIGHTFACT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightFactType }
     * 
     * 
     */
    public List<FlightFactType> getLISTFLIGHTFACT() {
        if (listflightfact == null) {
            listflightfact = new ArrayList<FlightFactType>();
        }
        return this.listflightfact;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMEAL() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMEAL(Boolean value) {
        this.meal = value;
    }

    /**
     * Gets the value of the entertainment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isENTERTAINMENT() {
        return entertainment;
    }

    /**
     * Sets the value of the entertainment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setENTERTAINMENT(Boolean value) {
        this.entertainment = value;
    }

    /**
     * Gets the value of the equipmentchange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEQUIPMENTCHANGE() {
        return equipmentchange;
    }

    /**
     * Sets the value of the equipmentchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEQUIPMENTCHANGE(Boolean value) {
        this.equipmentchange = value;
    }

    /**
     * Gets the value of the timechange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTIMECHANGE() {
        return timechange;
    }

    /**
     * Sets the value of the timechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTIMECHANGE(Boolean value) {
        this.timechange = value;
    }

    /**
     * Gets the value of the lastseatavailability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLASTSEATAVAILABILITY() {
        return lastseatavailability;
    }

    /**
     * Sets the value of the lastseatavailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLASTSEATAVAILABILITY(Boolean value) {
        this.lastseatavailability = value;
    }

    /**
     * Gets the value of the codeshareindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODESHAREINDICATOR() {
        return codeshareindicator;
    }

    /**
     * Sets the value of the codeshareindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODESHAREINDICATOR(String value) {
        this.codeshareindicator = value;
    }

    /**
     * Gets the value of the shuttle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSHUTTLE() {
        return shuttle;
    }

    /**
     * Sets the value of the shuttle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSHUTTLE(Boolean value) {
        this.shuttle = value;
    }

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTID(String value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the segmenttattoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTTATTOO() {
        return segmenttattoo;
    }

    /**
     * Sets the value of the segmenttattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTTATTOO(String value) {
        this.segmenttattoo = value;
    }

    /**
     * Gets the value of the linenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINENUMBER() {
        return linenumber;
    }

    /**
     * Sets the value of the linenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINENUMBER(String value) {
        this.linenumber = value;
    }

    /**
     * Gets the value of the cancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCANCELLED() {
        return cancelled;
    }

    /**
     * Sets the value of the cancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCANCELLED(Boolean value) {
        this.cancelled = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link EQUIPMENTType }
     *     
     */
    public EQUIPMENTType getEQUIPMENT() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EQUIPMENTType }
     *     
     */
    public void setEQUIPMENT(EQUIPMENTType value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the listleg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listleg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTLEG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTLEGType }
     * 
     * 
     */
    public List<LISTLEGType> getLISTLEG() {
        if (listleg == null) {
            listleg = new ArrayList<LISTLEGType>();
        }
        return this.listleg;
    }

    /**
     * Gets the value of the liststops property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liststops property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSTOPS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STOPType }
     * 
     * 
     */
    public List<STOPType> getLISTSTOPS() {
        if (liststops == null) {
            liststops = new ArrayList<STOPType>();
        }
        return this.liststops;
    }

    /**
     * Gets the value of the listcabin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcabin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCABIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FLIGHTCABINType }
     * 
     * 
     */
    public List<FLIGHTCABINType> getLISTCABIN() {
        if (listcabin == null) {
            listcabin = new ArrayList<FLIGHTCABINType>();
        }
        return this.listcabin;
    }

    /**
     * Gets the value of the availabilityfirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABILITYFIRST() {
        return availabilityfirst;
    }

    /**
     * Sets the value of the availabilityfirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABILITYFIRST(String value) {
        this.availabilityfirst = value;
    }

    /**
     * Gets the value of the availabilitybusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABILITYBUSINESS() {
        return availabilitybusiness;
    }

    /**
     * Sets the value of the availabilitybusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABILITYBUSINESS(String value) {
        this.availabilitybusiness = value;
    }

    /**
     * Gets the value of the availabilityeconomy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABILITYECONOMY() {
        return availabilityeconomy;
    }

    /**
     * Sets the value of the availabilityeconomy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABILITYECONOMY(String value) {
        this.availabilityeconomy = value;
    }

    /**
     * Gets the value of the availabilityeconomyrestricted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABILITYECONOMYRESTRICTED() {
        return availabilityeconomyrestricted;
    }

    /**
     * Sets the value of the availabilityeconomyrestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABILITYECONOMYRESTRICTED(String value) {
        this.availabilityeconomyrestricted = value;
    }

    /**
     * Gets the value of the availabilityneweconomy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILABILITYNEWECONOMY() {
        return availabilityneweconomy;
    }

    /**
     * Sets the value of the availabilityneweconomy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILABILITYNEWECONOMY(String value) {
        this.availabilityneweconomy = value;
    }

    /**
     * Gets the value of the flownindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFLOWNINDICATOR() {
        return flownindicator;
    }

    /**
     * Sets the value of the flownindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFLOWNINDICATOR(Boolean value) {
        this.flownindicator = value;
    }

    /**
     * Gets the value of the bdayindicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBDAYINDICATOR() {
        return bdayindicator;
    }

    /**
     * Sets the value of the bdayindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBDAYINDICATOR(BigInteger value) {
        this.bdayindicator = value;
    }

    /**
     * Gets the value of the edayindicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEDAYINDICATOR() {
        return edayindicator;
    }

    /**
     * Sets the value of the edayindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEDAYINDICATOR(BigInteger value) {
        this.edayindicator = value;
    }

    /**
     * Gets the value of the blacklisted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBLACKLISTED() {
        return blacklisted;
    }

    /**
     * Sets the value of the blacklisted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBLACKLISTED(Boolean value) {
        this.blacklisted = value;
    }

    /**
     * Gets the value of the eligibletoupgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isELIGIBLETOUPGRADE() {
        return eligibletoupgrade;
    }

    /**
     * Sets the value of the eligibletoupgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setELIGIBLETOUPGRADE(Boolean value) {
        this.eligibletoupgrade = value;
    }

    /**
     * Gets the value of the noneligibletoupgradereason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNONELIGIBLETOUPGRADEREASON() {
        return noneligibletoupgradereason;
    }

    /**
     * Sets the value of the noneligibletoupgradereason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNONELIGIBLETOUPGRADEREASON(String value) {
        this.noneligibletoupgradereason = value;
    }

    /**
     * Gets the value of the flightfound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFLIGHTFOUND() {
        return flightfound;
    }

    /**
     * Sets the value of the flightfound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFLIGHTFOUND(Boolean value) {
        this.flightfound = value;
    }

    /**
     * Gets the value of the segmentidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTIDENTIFIER() {
        return segmentidentifier;
    }

    /**
     * Sets the value of the segmentidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTIDENTIFIER(String value) {
        this.segmentidentifier = value;
    }

    /**
     * Gets the value of the flightconfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link FLIGHTCONFIGURATIONType }
     *     
     */
    public FLIGHTCONFIGURATIONType getFLIGHTCONFIGURATION() {
        return flightconfiguration;
    }

    /**
     * Sets the value of the flightconfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLIGHTCONFIGURATIONType }
     *     
     */
    public void setFLIGHTCONFIGURATION(FLIGHTCONFIGURATIONType value) {
        this.flightconfiguration = value;
    }

}
