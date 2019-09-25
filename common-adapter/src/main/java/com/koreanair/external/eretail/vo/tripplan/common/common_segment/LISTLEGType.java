
package com.koreanair.external.eretail.vo.tripplan.common.common_segment;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_LEG_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_LEG_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRECEDING_TECHNICAL_STOP" type="{}STOP_Type" minOccurs="0"/&gt;
 *         &lt;group ref="{}LEG"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_LEG_Type", propOrder = {
    "precedingtechnicalstop",
    "legid",
    "boardpoint",
    "offpoint",
    "departuredate",
    "arrivaldate",
    "equipment",
    "duration",
    "meal"
})
public class LISTLEGType
    implements Serializable
{

    @XmlElement(name = "PRECEDING_TECHNICAL_STOP")
    protected STOPType precedingtechnicalstop;
    @XmlElement(name = "LEG_ID", required = true)
    protected BigInteger legid;
    @XmlElement(name = "BOARD_POINT", required = true)
    protected LegLOCATIONType boardpoint;
    @XmlElement(name = "OFF_POINT", required = true)
    protected LegLOCATIONType offpoint;
    @XmlElement(name = "DEPARTURE_DATE")
    protected DATEType departuredate;
    @XmlElement(name = "ARRIVAL_DATE")
    protected DATEType arrivaldate;
    @XmlElement(name = "EQUIPMENT")
    protected LISTLEGType.EQUIPMENT equipment;
    @XmlElement(name = "DURATION")
    protected BigInteger duration;
    @XmlElement(name = "MEAL")
    protected Boolean meal;

    /**
     * Gets the value of the precedingtechnicalstop property.
     * 
     * @return
     *     possible object is
     *     {@link STOPType }
     *     
     */
    public STOPType getPRECEDINGTECHNICALSTOP() {
        return precedingtechnicalstop;
    }

    /**
     * Sets the value of the precedingtechnicalstop property.
     * 
     * @param value
     *     allowed object is
     *     {@link STOPType }
     *     
     */
    public void setPRECEDINGTECHNICALSTOP(STOPType value) {
        this.precedingtechnicalstop = value;
    }

    /**
     * Gets the value of the legid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLEGID() {
        return legid;
    }

    /**
     * Sets the value of the legid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLEGID(BigInteger value) {
        this.legid = value;
    }

    /**
     * Gets the value of the boardpoint property.
     * 
     * @return
     *     possible object is
     *     {@link LegLOCATIONType }
     *     
     */
    public LegLOCATIONType getBOARDPOINT() {
        return boardpoint;
    }

    /**
     * Sets the value of the boardpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegLOCATIONType }
     *     
     */
    public void setBOARDPOINT(LegLOCATIONType value) {
        this.boardpoint = value;
    }

    /**
     * Gets the value of the offpoint property.
     * 
     * @return
     *     possible object is
     *     {@link LegLOCATIONType }
     *     
     */
    public LegLOCATIONType getOFFPOINT() {
        return offpoint;
    }

    /**
     * Sets the value of the offpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegLOCATIONType }
     *     
     */
    public void setOFFPOINT(LegLOCATIONType value) {
        this.offpoint = value;
    }

    /**
     * Gets the value of the departuredate property.
     * 
     * @return
     *     possible object is
     *     {@link DATEType }
     *     
     */
    public DATEType getDEPARTUREDATE() {
        return departuredate;
    }

    /**
     * Sets the value of the departuredate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATEType }
     *     
     */
    public void setDEPARTUREDATE(DATEType value) {
        this.departuredate = value;
    }

    /**
     * Gets the value of the arrivaldate property.
     * 
     * @return
     *     possible object is
     *     {@link DATEType }
     *     
     */
    public DATEType getARRIVALDATE() {
        return arrivaldate;
    }

    /**
     * Sets the value of the arrivaldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATEType }
     *     
     */
    public void setARRIVALDATE(DATEType value) {
        this.arrivaldate = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link LISTLEGType.EQUIPMENT }
     *     
     */
    public LISTLEGType.EQUIPMENT getEQUIPMENT() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTLEGType.EQUIPMENT }
     *     
     */
    public void setEQUIPMENT(LISTLEGType.EQUIPMENT value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDURATION() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDURATION(BigInteger value) {
        this.duration = value;
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
    public static class EQUIPMENT
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
