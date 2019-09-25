
package com.koreanair.external.eretail.vo.air.commonout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the type of the award segment.
 * 
 * <p>Java class for AWARD_SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AWARD_SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="B_LOCATION" type="{}LOCATION_Type"/&gt;
 *         &lt;element name="E_LOCATION" type="{}LOCATION_Type"/&gt;
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
 *         &lt;element name="MEAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ENTERTAINMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EQUIPMENT_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TIME_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LAST_SEAT_AVAILABILITY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CODE_SHARE_INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SHUTTLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EQUIPMENT" type="{}EQUIPMENT_Type" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CABIN" type="{}AWARD_FLIGHT_CABIN_Type" maxOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AWARD_SEGMENT_Type", propOrder = {
    "blocation",
    "elocation",
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
    "meal",
    "entertainment",
    "equipmentchange",
    "timechange",
    "lastseatavailability",
    "codeshareindicator",
    "shuttle",
    "equipment",
    "listcabin"
})
public class AWARDSEGMENTType
    implements Serializable
{

    @XmlElement(name = "B_LOCATION", required = true)
    protected LOCATIONType blocation;
    @XmlElement(name = "E_LOCATION", required = true)
    protected LOCATIONType elocation;
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
    @XmlElement(name = "EQUIPMENT")
    protected EQUIPMENTType equipment;
    @XmlElement(name = "LIST_CABIN", required = true)
    protected List<AWARDFLIGHTCABINType> listcabin;

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
     * {@link AWARDFLIGHTCABINType }
     * 
     * 
     */
    public List<AWARDFLIGHTCABINType> getLISTCABIN() {
        if (listcabin == null) {
            listcabin = new ArrayList<AWARDFLIGHTCABINType>();
        }
        return this.listcabin;
    }

}
