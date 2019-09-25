
package com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput;

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
    "boardpoint",
    "offpoint",
    "departuredate",
    "arrivaldate",
    "equipment",
    "duration",
    "meal",
    "mileageinformation"
})
public class LISTLEGType
    implements Serializable
{

    @XmlElement(name = "PRECEDING_TECHNICAL_STOP")
    protected STOPType precedingtechnicalstop;
    @XmlElement(name = "BOARD_POINT", required = true)
    protected AIRPORTLOCATIONType boardpoint;
    @XmlElement(name = "OFF_POINT", required = true)
    protected AIRPORTLOCATIONType offpoint;
    @XmlElement(name = "DEPARTURE_DATE")
    protected DATEType departuredate;
    @XmlElement(name = "ARRIVAL_DATE")
    protected DATEType arrivaldate;
    @XmlElement(name = "EQUIPMENT")
    protected EQUIPMENT equipment;
    @XmlElement(name = "DURATION")
    protected BigInteger duration;
    @XmlElement(name = "MEAL")
    protected Boolean meal;
    @XmlElement(name = "MILEAGE_INFORMATION")
    protected MILEAGEINFORMATIONType mileageinformation;

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
     * Gets the value of the boardpoint property.
     * 
     * @return
     *     possible object is
     *     {@link AIRPORTLOCATIONType }
     *     
     */
    public AIRPORTLOCATIONType getBOARDPOINT() {
        return boardpoint;
    }

    /**
     * Sets the value of the boardpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTLOCATIONType }
     *     
     */
    public void setBOARDPOINT(AIRPORTLOCATIONType value) {
        this.boardpoint = value;
    }

    /**
     * Gets the value of the offpoint property.
     * 
     * @return
     *     possible object is
     *     {@link AIRPORTLOCATIONType }
     *     
     */
    public AIRPORTLOCATIONType getOFFPOINT() {
        return offpoint;
    }

    /**
     * Sets the value of the offpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRPORTLOCATIONType }
     *     
     */
    public void setOFFPOINT(AIRPORTLOCATIONType value) {
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
     * The equipment of leg
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

}
