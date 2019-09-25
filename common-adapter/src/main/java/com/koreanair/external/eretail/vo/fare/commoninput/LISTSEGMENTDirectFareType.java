
package com.koreanair.external.eretail.vo.fare.commoninput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.AVAILDATASOURCEType;


/**
 * <p>Java class for LIST_SEGMENT_DirectFare_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_SEGMENT_DirectFare_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="B_LOCATION" type="{}Input_LOCATION_Type"/&gt;
 *         &lt;element name="E_LOCATION" type="{}Input_LOCATION_Type"/&gt;
 *         &lt;element name="AIRLINE" type="{}AIRLINE_Type"/&gt;
 *         &lt;element name="OTHER_AIRLINE" type="{}AIRLINE_Type" minOccurs="0"/&gt;
 *         &lt;element name="UNKNOWN_OTHER_AIRLINE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}FLIGHT_NUMBER"/&gt;
 *         &lt;element name="B_DATE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="E_DATE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="B_TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="E_TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="B_DAY_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="E_DAY_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="E_TICKETING" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NUMBER_OF_STOPS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_TIME" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="EQUIPMENT" type="{}EQUIPMENT_Type" minOccurs="0"/&gt;
 *         &lt;element name="RBD" type="{}unprotectedStringType"/&gt;
 *         &lt;element ref="{}FARE_CLASS" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_BREAK_POINT" minOccurs="0"/&gt;
 *         &lt;element ref="{}AVAIL_DATA_SOURCE" minOccurs="0"/&gt;
 *         &lt;element name="BLACKLISTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_SEGMENT_DirectFare_Type", propOrder = {
    "blocation",
    "elocation",
    "airline",
    "otherairline",
    "unknownotherairline",
    "flightnumber",
    "bdate",
    "edate",
    "bterminal",
    "eterminal",
    "bdayindicator",
    "edayindicator",
    "eticketing",
    "numberofstops",
    "flighttime",
    "equipment",
    "rbd",
    "fareclass",
    "farebreakpoint",
    "availdatasource",
    "blacklisted"
})
public class LISTSEGMENTDirectFareType
    implements Serializable
{

    @XmlElement(name = "B_LOCATION", required = true)
    protected InputLOCATIONType blocation;
    @XmlElement(name = "E_LOCATION", required = true)
    protected InputLOCATIONType elocation;
    @XmlElement(name = "AIRLINE", required = true)
    protected AIRLINEType airline;
    @XmlElement(name = "OTHER_AIRLINE")
    protected AIRLINEType otherairline;
    @XmlElement(name = "UNKNOWN_OTHER_AIRLINE")
    protected Boolean unknownotherairline;
    @XmlElement(name = "FLIGHT_NUMBER", required = true)
    protected String flightnumber;
    @XmlElement(name = "B_DATE", required = true)
    protected String bdate;
    @XmlElement(name = "E_DATE", required = true)
    protected String edate;
    @XmlElement(name = "B_TERMINAL")
    protected String bterminal;
    @XmlElement(name = "E_TERMINAL")
    protected String eterminal;
    @XmlElement(name = "B_DAY_INDICATOR")
    protected BigInteger bdayindicator;
    @XmlElement(name = "E_DAY_INDICATOR")
    protected BigInteger edayindicator;
    @XmlElement(name = "E_TICKETING")
    protected Boolean eticketing;
    @XmlElement(name = "NUMBER_OF_STOPS")
    protected BigInteger numberofstops;
    @XmlElement(name = "FLIGHT_TIME")
    protected BigInteger flighttime;
    @XmlElement(name = "EQUIPMENT")
    protected EQUIPMENTType equipment;
    @XmlElement(name = "RBD", required = true)
    protected String rbd;
    @XmlElement(name = "FARE_CLASS")
    protected String fareclass;
    @XmlElement(name = "FARE_BREAK_POINT")
    protected Boolean farebreakpoint;
    @XmlElement(name = "AVAIL_DATA_SOURCE")
    @XmlSchemaType(name = "string")
    protected AVAILDATASOURCEType availdatasource;
    @XmlElement(name = "BLACKLISTED")
    protected Boolean blacklisted;

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link InputLOCATIONType }
     *     
     */
    public InputLOCATIONType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputLOCATIONType }
     *     
     */
    public void setBLOCATION(InputLOCATIONType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link InputLOCATIONType }
     *     
     */
    public InputLOCATIONType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputLOCATIONType }
     *     
     */
    public void setELOCATION(InputLOCATIONType value) {
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
     * Gets the value of the unknownotherairline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUNKNOWNOTHERAIRLINE() {
        return unknownotherairline;
    }

    /**
     * Sets the value of the unknownotherairline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUNKNOWNOTHERAIRLINE(Boolean value) {
        this.unknownotherairline = value;
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
     *     {@link String }
     *     
     */
    public String getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDATE(String value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDATE(String value) {
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
     * Gets the value of the rbd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBD() {
        return rbd;
    }

    /**
     * Sets the value of the rbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBD(String value) {
        this.rbd = value;
    }

    /**
     * Gets the value of the fareclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECLASS() {
        return fareclass;
    }

    /**
     * Sets the value of the fareclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECLASS(String value) {
        this.fareclass = value;
    }

    /**
     * Gets the value of the farebreakpoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFAREBREAKPOINT() {
        return farebreakpoint;
    }

    /**
     * Sets the value of the farebreakpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFAREBREAKPOINT(Boolean value) {
        this.farebreakpoint = value;
    }

    /**
     * Gets the value of the availdatasource property.
     * 
     * @return
     *     possible object is
     *     {@link AVAILDATASOURCEType }
     *     
     */
    public AVAILDATASOURCEType getAVAILDATASOURCE() {
        return availdatasource;
    }

    /**
     * Sets the value of the availdatasource property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVAILDATASOURCEType }
     *     
     */
    public void setAVAILDATASOURCE(AVAILDATASOURCEType value) {
        this.availdatasource = value;
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

}
