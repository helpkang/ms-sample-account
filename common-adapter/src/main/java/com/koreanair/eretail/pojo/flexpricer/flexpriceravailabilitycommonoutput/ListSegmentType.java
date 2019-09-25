
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

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
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.AIRLINEType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.BDATE;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.EDATE;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.ETADATE;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.ETDDATE;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.FLIGHTCONFIGURATIONType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.LISTCOMMERCIALAGREEMENTType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.LISTMEALSERVICESType;
import com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput.ONTIMEPERFORMANCEType;
import com.koreanair.eretail.pojo.flexpricer.commonavailabilityoutput.EquipmentType;
import com.koreanair.eretail.pojo.flexpricer.commonavailabilityoutput.LocationType;


/**
 * <p>Java class for ListSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}B_LOCATION" minOccurs="0"/&gt;
 *           &lt;element name="B_LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}E_LOCATION" minOccurs="0"/&gt;
 *           &lt;element name="E_LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}AIRLINE"/&gt;
 *           &lt;element name="AIRLINE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}OTHER_AIRLINE" minOccurs="0"/&gt;
 *           &lt;element name="OTHER_AIRLINE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}FLIGHT_NUMBER"/&gt;
 *         &lt;element ref="{}B_DATE"/&gt;
 *         &lt;element ref="{}E_DATE"/&gt;
 *         &lt;element ref="{}ETD_DATE" minOccurs="0"/&gt;
 *         &lt;element ref="{}ETA_DATE" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_TERMINAL" minOccurs="0"/&gt;
 *         &lt;element ref="{}E_TERMINAL" minOccurs="0"/&gt;
 *         &lt;element ref="{}B_DAY_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element ref="{}E_DAY_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element ref="{}ETA_DAY_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element ref="{}ETD_DAY_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element ref="{}OP_FLAG" minOccurs="0"/&gt;
 *         &lt;element ref="{}ACCESS_LEVEL" minOccurs="0"/&gt;
 *         &lt;element ref="{}E_TICKETING" minOccurs="0"/&gt;
 *         &lt;element ref="{}NUMBER_OF_STOPS" minOccurs="0"/&gt;
 *         &lt;element ref="{}FLIGHT_TIME" minOccurs="0"/&gt;
 *         &lt;element ref="{}SEGMENT_FLIGHT_TIME" minOccurs="0"/&gt;
 *         &lt;element ref="{}EQUIPMENT_CHANGE" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="EQUIPMENT" type="{}EquipmentType"/&gt;
 *           &lt;element name="EQUIPMENT_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}CODE_SHARE_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element name="ELAPSED_FLYING_TIME" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_STOPS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FARE_FAMILY" type="{}SimpleFareFamilyType" minOccurs="0"/&gt;
 *         &lt;element ref="{}SEGMENT_TATTOO" minOccurs="0"/&gt;
 *         &lt;element ref="{}BOOL_FLOWN" minOccurs="0"/&gt;
 *         &lt;element ref="{}LINE_NUMBER" minOccurs="0"/&gt;
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
@XmlType(name = "ListSegmentType", propOrder = {
    "segmentid",
    "blocation",
    "blocationcode",
    "elocation",
    "elocationcode",
    "airline",
    "airlinecode",
    "otherairline",
    "otherairlinecode",
    "flightnumber",
    "bdate",
    "edate",
    "etddate",
    "etadate",
    "bterminal",
    "eterminal",
    "bdayindicator",
    "edayindicator",
    "etadayindicator",
    "etddayindicator",
    "opflag",
    "accesslevel",
    "eticketing",
    "numberofstops",
    "flighttime",
    "segmentflighttime",
    "equipmentchange",
    "equipment",
    "equipmentcode",
    "codeshareindicator",
    "elapsedflyingtime",
    "liststops",
    "farefamily",
    "segmenttattoo",
    "boolflown",
    "linenumber",
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
public class ListSegmentType
    implements Serializable
{

    @XmlElement(name = "SEGMENT_ID")
    protected BigInteger segmentid;
    @XmlElement(name = "B_LOCATION")
    protected LocationType blocation;
    @XmlElement(name = "B_LOCATION_CODE")
    protected String blocationcode;
    @XmlElement(name = "E_LOCATION")
    protected LocationType elocation;
    @XmlElement(name = "E_LOCATION_CODE")
    protected String elocationcode;
    @XmlElement(name = "AIRLINE")
    protected AIRLINEType airline;
    @XmlElement(name = "AIRLINE_CODE")
    protected String airlinecode;
    @XmlElement(name = "OTHER_AIRLINE")
    protected AIRLINEType otherairline;
    @XmlElement(name = "OTHER_AIRLINE_CODE")
    protected String otherairlinecode;
    @XmlElement(name = "FLIGHT_NUMBER", required = true)
    protected String flightnumber;
    @XmlElement(name = "B_DATE", required = true)
    protected BDATE bdate;
    @XmlElement(name = "E_DATE", required = true)
    protected EDATE edate;
    @XmlElement(name = "ETD_DATE")
    protected ETDDATE etddate;
    @XmlElement(name = "ETA_DATE")
    protected ETADATE etadate;
    @XmlElement(name = "B_TERMINAL")
    protected String bterminal;
    @XmlElement(name = "E_TERMINAL")
    protected String eterminal;
    @XmlElement(name = "B_DAY_INDICATOR")
    protected BigInteger bdayindicator;
    @XmlElement(name = "E_DAY_INDICATOR")
    protected BigInteger edayindicator;
    @XmlElement(name = "ETA_DAY_INDICATOR")
    protected BigInteger etadayindicator;
    @XmlElement(name = "ETD_DAY_INDICATOR")
    protected BigInteger etddayindicator;
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
    @XmlElement(name = "SEGMENT_FLIGHT_TIME")
    protected BigInteger segmentflighttime;
    @XmlElement(name = "EQUIPMENT_CHANGE")
    protected Boolean equipmentchange;
    @XmlElement(name = "EQUIPMENT")
    protected EquipmentType equipment;
    @XmlElement(name = "EQUIPMENT_CODE")
    protected String equipmentcode;
    @XmlElement(name = "CODE_SHARE_INDICATOR")
    protected String codeshareindicator;
    @XmlElement(name = "ELAPSED_FLYING_TIME")
    protected BigInteger elapsedflyingtime;
    @XmlElement(name = "LIST_STOPS")
    protected List<FlexSTOPType> liststops;
    @XmlElement(name = "FARE_FAMILY")
    protected SimpleFareFamilyType farefamily;
    @XmlElement(name = "SEGMENT_TATTOO")
    protected BigInteger segmenttattoo;
    @XmlElement(name = "BOOL_FLOWN")
    protected Boolean boolflown;
    @XmlElement(name = "LINE_NUMBER")
    protected BigInteger linenumber;
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
     *     {@link LocationType }
     *     
     */
    public LocationType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setBLOCATION(LocationType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the blocationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLOCATIONCODE() {
        return blocationcode;
    }

    /**
     * Sets the value of the blocationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLOCATIONCODE(String value) {
        this.blocationcode = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setELOCATION(LocationType value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the elocationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELOCATIONCODE() {
        return elocationcode;
    }

    /**
     * Sets the value of the elocationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELOCATIONCODE(String value) {
        this.elocationcode = value;
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
     * Gets the value of the airlinecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRLINECODE() {
        return airlinecode;
    }

    /**
     * Sets the value of the airlinecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRLINECODE(String value) {
        this.airlinecode = value;
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
     * Gets the value of the otherairlinecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHERAIRLINECODE() {
        return otherairlinecode;
    }

    /**
     * Sets the value of the otherairlinecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHERAIRLINECODE(String value) {
        this.otherairlinecode = value;
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
     * Gets the value of the etddate property.
     * 
     * @return
     *     possible object is
     *     {@link ETDDATE }
     *     
     */
    public ETDDATE getETDDATE() {
        return etddate;
    }

    /**
     * Sets the value of the etddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETDDATE }
     *     
     */
    public void setETDDATE(ETDDATE value) {
        this.etddate = value;
    }

    /**
     * Gets the value of the etadate property.
     * 
     * @return
     *     possible object is
     *     {@link ETADATE }
     *     
     */
    public ETADATE getETADATE() {
        return etadate;
    }

    /**
     * Sets the value of the etadate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETADATE }
     *     
     */
    public void setETADATE(ETADATE value) {
        this.etadate = value;
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
     * Gets the value of the etadayindicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getETADAYINDICATOR() {
        return etadayindicator;
    }

    /**
     * Sets the value of the etadayindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setETADAYINDICATOR(BigInteger value) {
        this.etadayindicator = value;
    }

    /**
     * Gets the value of the etddayindicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getETDDAYINDICATOR() {
        return etddayindicator;
    }

    /**
     * Sets the value of the etddayindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setETDDAYINDICATOR(BigInteger value) {
        this.etddayindicator = value;
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
     * Gets the value of the segmentflighttime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTFLIGHTTIME() {
        return segmentflighttime;
    }

    /**
     * Sets the value of the segmentflighttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTFLIGHTTIME(BigInteger value) {
        this.segmentflighttime = value;
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
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentType }
     *     
     */
    public EquipmentType getEQUIPMENT() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentType }
     *     
     */
    public void setEQUIPMENT(EquipmentType value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the equipmentcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQUIPMENTCODE() {
        return equipmentcode;
    }

    /**
     * Sets the value of the equipmentcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQUIPMENTCODE(String value) {
        this.equipmentcode = value;
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
     * Gets the value of the elapsedflyingtime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getELAPSEDFLYINGTIME() {
        return elapsedflyingtime;
    }

    /**
     * Sets the value of the elapsedflyingtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setELAPSEDFLYINGTIME(BigInteger value) {
        this.elapsedflyingtime = value;
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
     * {@link FlexSTOPType }
     * 
     * 
     */
    public List<FlexSTOPType> getLISTSTOPS() {
        if (liststops == null) {
            liststops = new ArrayList<FlexSTOPType>();
        }
        return this.liststops;
    }

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleFareFamilyType }
     *     
     */
    public SimpleFareFamilyType getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleFareFamilyType }
     *     
     */
    public void setFAREFAMILY(SimpleFareFamilyType value) {
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
