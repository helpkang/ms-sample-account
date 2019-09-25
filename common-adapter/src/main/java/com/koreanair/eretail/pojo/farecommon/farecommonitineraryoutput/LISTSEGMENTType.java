
package com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput;

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
 * <p>Java class for LIST_SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="B_LOCATION" type="{}DecodedLocationType"/&gt;
 *         &lt;element name="E_LOCATION" type="{}DecodedLocationType"/&gt;
 *         &lt;element ref="{}AIRLINE"/&gt;
 *         &lt;element ref="{}OTHER_AIRLINE" minOccurs="0"/&gt;
 *         &lt;element ref="{}FLIGHT_NUMBER"/&gt;
 *         &lt;element ref="{}B_DATE"/&gt;
 *         &lt;element ref="{}E_DATE"/&gt;
 *         &lt;element ref="{}B_TERMINAL" minOccurs="0"/&gt;
 *         &lt;element ref="{}E_TERMINAL" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_DAY_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element ref="{}E_DAY_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element ref="{}TRAFFIC_RESTRICTION" minOccurs="0"/&gt;
 *         &lt;element ref="{}ON_TIME_PERFORMANCE" minOccurs="0"/&gt;
 *         &lt;element ref="{}IRREGULARITY" minOccurs="0"/&gt;
 *         &lt;element ref="{}OP_FLAG" minOccurs="0"/&gt;
 *         &lt;element ref="{}ACCESS_LEVEL" minOccurs="0"/&gt;
 *         &lt;element ref="{}E_TICKETING" minOccurs="0"/&gt;
 *         &lt;element ref="{}NUMBER_OF_STOPS" minOccurs="0"/&gt;
 *         &lt;element ref="{}FLIGHT_TIME" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_LEG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}MEAL" minOccurs="0"/&gt;
 *         &lt;element name="MILEAGE_INFORMATION" type="{}MILEAGE_INFORMATION_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}ENTERTAIMENT" minOccurs="0"/&gt;
 *         &lt;element ref="{}EQUIPMENT_CHANGE" minOccurs="0"/&gt;
 *         &lt;element ref="{}TIME_CHANGE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LAST_SEAT_AVAILABILITY" minOccurs="0"/&gt;
 *         &lt;element ref="{}CODE_SHARE_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element ref="{}BOOKABLE" minOccurs="0"/&gt;
 *         &lt;element ref="{}EQUIPMENT" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_CABIN" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_FAMILY" minOccurs="0"/&gt;
 *         &lt;element ref="{}SEGMENT_TATTOO" minOccurs="0"/&gt;
 *         &lt;element ref="{}BOOL_FLOWN" minOccurs="0"/&gt;
 *         &lt;element ref="{}LINE_NUMBER" minOccurs="0"/&gt;
 *         &lt;element ref="{}MODIFICATION_STATUS" minOccurs="0"/&gt;
 *         &lt;element name="UPG_ELIGIBLE_TO_UPGRADE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UPG_NON_ELIGIBILITY_REASON" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_CONFIGURATION" type="{}FLIGHT_CONFIGURATION_type" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FLIGHT_FACT" type="{}FlightFactType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_INFLIGHT_SERVICES" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HAS_GOVT_APPROVAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ON_TIME_FLIGHT_PERFORMANCE" type="{}ON_TIME_PERFORMANCE_Type" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MEAL_SERVICES" type="{}LIST_MEAL_SERVICES_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IS_SECURED_FLIGHT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ALLIANCE_INFO" type="{}CodeDescriptorType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_COMMERCIAL_AGREEMENT" type="{}LIST_COMMERCIAL_AGREEMENT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_SEGMENT_Type", propOrder = {
    "segmentid",
    "blocation",
    "elocation",
    "airline",
    "otherairline",
    "flightnumber",
    "bdate",
    "edate",
    "bterminal",
    "eterminal",
    "bdayindicator",
    "edayindicator",
    "trafficrestriction",
    "ontimeperformance",
    "irregularity",
    "opflag",
    "accesslevel",
    "eticketing",
    "numberofstops",
    "flighttime",
    "listleg",
    "meal",
    "mileageinformation",
    "entertaiment",
    "equipmentchange",
    "timechange",
    "lastseatavailability",
    "codeshareindicator",
    "bookable",
    "equipment",
    "listcabin",
    "farefamily",
    "segmenttattoo",
    "boolflown",
    "linenumber",
    "modificationstatus",
    "upgeligibletoupgrade",
    "upgnoneligibilityreason",
    "flightconfiguration",
    "listflightfact",
    "listinflightservices",
    "hasgovtapproval",
    "ontimeflightperformance",
    "listmealservices",
    "issecuredflight",
    "allianceinfo",
    "listcommercialagreement"
})
public class LISTSEGMENTType
    implements Serializable
{

    @XmlElement(name = "SEGMENT_ID", required = true)
    protected BigInteger segmentid;
    @XmlElement(name = "B_LOCATION", required = true)
    protected DecodedLocationType blocation;
    @XmlElement(name = "E_LOCATION", required = true)
    protected DecodedLocationType elocation;
    @XmlElement(name = "AIRLINE", required = true)
    protected AIRLINEType airline;
    @XmlElement(name = "OTHER_AIRLINE")
    protected AIRLINEType otherairline;
    @XmlElement(name = "FLIGHT_NUMBER", required = true)
    protected String flightnumber;
    @XmlElement(name = "B_DATE", required = true)
    protected BDATE bdate;
    @XmlElement(name = "E_DATE", required = true)
    protected EDATE edate;
    @XmlElement(name = "B_TERMINAL")
    protected String bterminal;
    @XmlElement(name = "E_TERMINAL")
    protected String eterminal;
    @XmlElement(name = "B_DAY_INDICATOR")
    protected BigInteger bdayindicator;
    @XmlElement(name = "E_DAY_INDICATOR")
    protected BigInteger edayindicator;
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
    @XmlElement(name = "LIST_LEG")
    protected List<LISTLEGType> listleg;
    @XmlElement(name = "MEAL")
    protected Boolean meal;
    @XmlElement(name = "MILEAGE_INFORMATION")
    protected MILEAGEINFORMATIONType mileageinformation;
    @XmlElement(name = "ENTERTAIMENT")
    protected Boolean entertaiment;
    @XmlElement(name = "EQUIPMENT_CHANGE")
    protected Boolean equipmentchange;
    @XmlElement(name = "TIME_CHANGE")
    protected Boolean timechange;
    @XmlElement(name = "LAST_SEAT_AVAILABILITY")
    protected Boolean lastseatavailability;
    @XmlElement(name = "CODE_SHARE_INDICATOR")
    protected String codeshareindicator;
    @XmlElement(name = "BOOKABLE")
    protected Boolean bookable;
    @XmlElement(name = "EQUIPMENT")
    protected EQUIPMENT equipment;
    @XmlElement(name = "LIST_CABIN")
    protected List<LISTCABINType> listcabin;
    @XmlElement(name = "FARE_FAMILY")
    protected FAREFAMILYFareType farefamily;
    @XmlElement(name = "SEGMENT_TATTOO")
    protected BigInteger segmenttattoo;
    @XmlElement(name = "BOOL_FLOWN")
    protected Boolean boolflown;
    @XmlElement(name = "LINE_NUMBER")
    protected BigInteger linenumber;
    @XmlElement(name = "MODIFICATION_STATUS")
    protected String modificationstatus;
    @XmlElement(name = "UPG_ELIGIBLE_TO_UPGRADE")
    protected Boolean upgeligibletoupgrade;
    @XmlElement(name = "UPG_NON_ELIGIBILITY_REASON")
    protected BigInteger upgnoneligibilityreason;
    @XmlElement(name = "FLIGHT_CONFIGURATION")
    protected FLIGHTCONFIGURATIONType flightconfiguration;
    @XmlElement(name = "LIST_FLIGHT_FACT")
    protected List<FlightFactType> listflightfact;
    @XmlElement(name = "LIST_INFLIGHT_SERVICES")
    protected List<CodeDescriptorType> listinflightservices;
    @XmlElement(name = "HAS_GOVT_APPROVAL")
    protected Boolean hasgovtapproval;
    @XmlElement(name = "ON_TIME_FLIGHT_PERFORMANCE")
    protected ONTIMEPERFORMANCEType ontimeflightperformance;
    @XmlElement(name = "LIST_MEAL_SERVICES")
    protected List<LISTMEALSERVICESType> listmealservices;
    @XmlElement(name = "IS_SECURED_FLIGHT")
    protected Boolean issecuredflight;
    @XmlElement(name = "ALLIANCE_INFO")
    protected CodeDescriptorType allianceinfo;
    @XmlElement(name = "LIST_COMMERCIAL_AGREEMENT")
    protected List<LISTCOMMERCIALAGREEMENTType> listcommercialagreement;

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTID(BigInteger value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link DecodedLocationType }
     *     
     */
    public DecodedLocationType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecodedLocationType }
     *     
     */
    public void setBLOCATION(DecodedLocationType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link DecodedLocationType }
     *     
     */
    public DecodedLocationType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecodedLocationType }
     *     
     */
    public void setELOCATION(DecodedLocationType value) {
        this.elocation = value;
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
     *     {@link AIRLINEType }
     *     
     */
    public AIRLINEType getOTHERAIRLINE() {
        return otherairline;
    }

    /**
     * Sets the value of the otherairline property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRLINEType }
     *     
     */
    public void setOTHERAIRLINE(AIRLINEType value) {
        this.otherairline = value;
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
     * Gets the value of the mileageinformation property.
     * 
     * @return
     *     possible object is
     *     {@link MILEAGEINFORMATIONType }
     *     
     */
    public MILEAGEINFORMATIONType getMILEAGEINFORMATION() {
        return mileageinformation;
    }

    /**
     * Sets the value of the mileageinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MILEAGEINFORMATIONType }
     *     
     */
    public void setMILEAGEINFORMATION(MILEAGEINFORMATIONType value) {
        this.mileageinformation = value;
    }

    /**
     * Gets the value of the entertaiment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isENTERTAIMENT() {
        return entertaiment;
    }

    /**
     * Sets the value of the entertaiment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setENTERTAIMENT(Boolean value) {
        this.entertaiment = value;
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
     * Gets the value of the bookable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOKABLE() {
        return bookable;
    }

    /**
     * Sets the value of the bookable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOKABLE(Boolean value) {
        this.bookable = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link EQUIPMENT }
     *     
     */
    public EQUIPMENT getEQUIPMENT() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EQUIPMENT }
     *     
     */
    public void setEQUIPMENT(EQUIPMENT value) {
        this.equipment = value;
    }

    /**
     * NOT mandatory in the case of an ATC Upgrade (TicketChangerInformativeUpgradeAvailThenFareOutput) when it is not possible to give the RBDs status (i.e. there is an error at availability) Gets the value of the listcabin property.
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
     * {@link LISTCABINType }
     * 
     * 
     */
    public List<LISTCABINType> getLISTCABIN() {
        if (listcabin == null) {
            listcabin = new ArrayList<LISTCABINType>();
        }
        return this.listcabin;
    }

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public FAREFAMILYFareType getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public void setFAREFAMILY(FAREFAMILYFareType value) {
        this.farefamily = value;
    }

    /**
     * Gets the value of the segmenttattoo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTTATTOO() {
        return segmenttattoo;
    }

    /**
     * Sets the value of the segmenttattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTTATTOO(BigInteger value) {
        this.segmenttattoo = value;
    }

    /**
     * Gets the value of the boolflown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLFLOWN() {
        return boolflown;
    }

    /**
     * Sets the value of the boolflown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLFLOWN(Boolean value) {
        this.boolflown = value;
    }

    /**
     * Gets the value of the linenumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLINENUMBER() {
        return linenumber;
    }

    /**
     * Sets the value of the linenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLINENUMBER(BigInteger value) {
        this.linenumber = value;
    }

    /**
     * Gets the value of the modificationstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODIFICATIONSTATUS() {
        return modificationstatus;
    }

    /**
     * Sets the value of the modificationstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODIFICATIONSTATUS(String value) {
        this.modificationstatus = value;
    }

    /**
     * Gets the value of the upgeligibletoupgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUPGELIGIBLETOUPGRADE() {
        return upgeligibletoupgrade;
    }

    /**
     * Sets the value of the upgeligibletoupgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUPGELIGIBLETOUPGRADE(Boolean value) {
        this.upgeligibletoupgrade = value;
    }

    /**
     * Gets the value of the upgnoneligibilityreason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUPGNONELIGIBILITYREASON() {
        return upgnoneligibilityreason;
    }

    /**
     * Sets the value of the upgnoneligibilityreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUPGNONELIGIBILITYREASON(BigInteger value) {
        this.upgnoneligibilityreason = value;
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
     * Gets the value of the ontimeflightperformance property.
     * 
     * @return
     *     possible object is
     *     {@link ONTIMEPERFORMANCEType }
     *     
     */
    public ONTIMEPERFORMANCEType getONTIMEFLIGHTPERFORMANCE() {
        return ontimeflightperformance;
    }

    /**
     * Sets the value of the ontimeflightperformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONTIMEPERFORMANCEType }
     *     
     */
    public void setONTIMEFLIGHTPERFORMANCE(ONTIMEPERFORMANCEType value) {
        this.ontimeflightperformance = value;
    }

    /**
     * Gets the value of the listmealservices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmealservices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMEALSERVICES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMEALSERVICESType }
     * 
     * 
     */
    public List<LISTMEALSERVICESType> getLISTMEALSERVICES() {
        if (listmealservices == null) {
            listmealservices = new ArrayList<LISTMEALSERVICESType>();
        }
        return this.listmealservices;
    }

    /**
     * Gets the value of the issecuredflight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISSECUREDFLIGHT() {
        return issecuredflight;
    }

    /**
     * Sets the value of the issecuredflight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISSECUREDFLIGHT(Boolean value) {
        this.issecuredflight = value;
    }

    /**
     * Gets the value of the allianceinfo property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getALLIANCEINFO() {
        return allianceinfo;
    }

    /**
     * Sets the value of the allianceinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setALLIANCEINFO(CodeDescriptorType value) {
        this.allianceinfo = value;
    }

    /**
     * Gets the value of the listcommercialagreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcommercialagreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOMMERCIALAGREEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTCOMMERCIALAGREEMENTType }
     * 
     * 
     */
    public List<LISTCOMMERCIALAGREEMENTType> getLISTCOMMERCIALAGREEMENT() {
        if (listcommercialagreement == null) {
            listcommercialagreement = new ArrayList<LISTCOMMERCIALAGREEMENTType>();
        }
        return this.listcommercialagreement;
    }

}
