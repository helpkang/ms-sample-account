
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details concerning the selected room.  Remark: The presence of this structure is linked to HotelFeaturesInput1. 
 * 
 * <p>Java class for ROOM_CPLX_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROOM_CPLX_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ROOM_TYPE" type="{}ROOM_TYPE_1"/&gt;
 *         &lt;element name="BED_TYPE" type="{}BED_TYPE_1"/&gt;
 *         &lt;element ref="{}BED_COUNT"/&gt;
 *         &lt;element name="MEAL" type="{}MEAL_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_IN_POLICY" type="{}ROOM_CHECK_IN_POLICY_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="RATE_TYPE" type="{}RATE_TYPE_TYPE"/&gt;
 *         &lt;element name="SPECIAL_RATE_TYPE" type="{}SPECIAL_RATE_TYPE_TYPE_1"/&gt;
 *         &lt;element ref="{}RATE_CHANGE"/&gt;
 *         &lt;element ref="{}CORPORATE_ID_REQUIRED"/&gt;
 *         &lt;element ref="{}GUARANTEE_REQUIRED"/&gt;
 *         &lt;element ref="{}DEPOSIT_REQUIRED"/&gt;
 *         &lt;element ref="{}CHECK_SELL_RULES" minOccurs="0"/&gt;
 *         &lt;element name="LIST_RATE" type="{}LIST_RATE_TYPE_2" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROOM_CPLX_TYPE", propOrder = {
    "roomtype",
    "bedtype",
    "bedcount",
    "meal",
    "checkinpolicy",
    "ratetype",
    "specialratetype",
    "ratechange",
    "corporateidrequired",
    "guaranteerequired",
    "depositrequired",
    "checksellrules",
    "listrate"
})
public class ROOMCPLXTYPE
    implements Serializable
{

    @XmlElement(name = "ROOM_TYPE", required = true)
    protected ROOMTYPE1 roomtype;
    @XmlElement(name = "BED_TYPE", required = true)
    protected BEDTYPE1 bedtype;
    @XmlElement(name = "BED_COUNT", required = true)
    protected BigInteger bedcount;
    @XmlElement(name = "MEAL")
    protected MEALTYPE meal;
    @XmlElement(name = "CHECK_IN_POLICY")
    protected ROOMCHECKINPOLICYTYPE checkinpolicy;
    @XmlElement(name = "RATE_TYPE", required = true)
    protected RATETYPETYPE ratetype;
    @XmlElement(name = "SPECIAL_RATE_TYPE", required = true)
    protected SPECIALRATETYPETYPE1 specialratetype;
    @XmlElement(name = "RATE_CHANGE")
    protected boolean ratechange;
    @XmlElement(name = "CORPORATE_ID_REQUIRED")
    protected boolean corporateidrequired;
    @XmlElement(name = "GUARANTEE_REQUIRED")
    protected boolean guaranteerequired;
    @XmlElement(name = "DEPOSIT_REQUIRED")
    protected boolean depositrequired;
    @XmlElement(name = "CHECK_SELL_RULES")
    protected Boolean checksellrules;
    @XmlElement(name = "LIST_RATE", required = true)
    protected List<LISTRATETYPE2> listrate;

    /**
     * Gets the value of the roomtype property.
     * 
     * @return
     *     possible object is
     *     {@link ROOMTYPE1 }
     *     
     */
    public ROOMTYPE1 getROOMTYPE() {
        return roomtype;
    }

    /**
     * Sets the value of the roomtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROOMTYPE1 }
     *     
     */
    public void setROOMTYPE(ROOMTYPE1 value) {
        this.roomtype = value;
    }

    /**
     * Gets the value of the bedtype property.
     * 
     * @return
     *     possible object is
     *     {@link BEDTYPE1 }
     *     
     */
    public BEDTYPE1 getBEDTYPE() {
        return bedtype;
    }

    /**
     * Sets the value of the bedtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEDTYPE1 }
     *     
     */
    public void setBEDTYPE(BEDTYPE1 value) {
        this.bedtype = value;
    }

    /**
     * Gets the value of the bedcount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBEDCOUNT() {
        return bedcount;
    }

    /**
     * Sets the value of the bedcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBEDCOUNT(BigInteger value) {
        this.bedcount = value;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link MEALTYPE }
     *     
     */
    public MEALTYPE getMEAL() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEALTYPE }
     *     
     */
    public void setMEAL(MEALTYPE value) {
        this.meal = value;
    }

    /**
     * Gets the value of the checkinpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ROOMCHECKINPOLICYTYPE }
     *     
     */
    public ROOMCHECKINPOLICYTYPE getCHECKINPOLICY() {
        return checkinpolicy;
    }

    /**
     * Sets the value of the checkinpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROOMCHECKINPOLICYTYPE }
     *     
     */
    public void setCHECKINPOLICY(ROOMCHECKINPOLICYTYPE value) {
        this.checkinpolicy = value;
    }

    /**
     * Gets the value of the ratetype property.
     * 
     * @return
     *     possible object is
     *     {@link RATETYPETYPE }
     *     
     */
    public RATETYPETYPE getRATETYPE() {
        return ratetype;
    }

    /**
     * Sets the value of the ratetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link RATETYPETYPE }
     *     
     */
    public void setRATETYPE(RATETYPETYPE value) {
        this.ratetype = value;
    }

    /**
     * Gets the value of the specialratetype property.
     * 
     * @return
     *     possible object is
     *     {@link SPECIALRATETYPETYPE1 }
     *     
     */
    public SPECIALRATETYPETYPE1 getSPECIALRATETYPE() {
        return specialratetype;
    }

    /**
     * Sets the value of the specialratetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPECIALRATETYPETYPE1 }
     *     
     */
    public void setSPECIALRATETYPE(SPECIALRATETYPETYPE1 value) {
        this.specialratetype = value;
    }

    /**
     * Gets the value of the ratechange property.
     * 
     */
    public boolean isRATECHANGE() {
        return ratechange;
    }

    /**
     * Sets the value of the ratechange property.
     * 
     */
    public void setRATECHANGE(boolean value) {
        this.ratechange = value;
    }

    /**
     * Gets the value of the corporateidrequired property.
     * 
     */
    public boolean isCORPORATEIDREQUIRED() {
        return corporateidrequired;
    }

    /**
     * Sets the value of the corporateidrequired property.
     * 
     */
    public void setCORPORATEIDREQUIRED(boolean value) {
        this.corporateidrequired = value;
    }

    /**
     * Gets the value of the guaranteerequired property.
     * 
     */
    public boolean isGUARANTEEREQUIRED() {
        return guaranteerequired;
    }

    /**
     * Sets the value of the guaranteerequired property.
     * 
     */
    public void setGUARANTEEREQUIRED(boolean value) {
        this.guaranteerequired = value;
    }

    /**
     * Gets the value of the depositrequired property.
     * 
     */
    public boolean isDEPOSITREQUIRED() {
        return depositrequired;
    }

    /**
     * Sets the value of the depositrequired property.
     * 
     */
    public void setDEPOSITREQUIRED(boolean value) {
        this.depositrequired = value;
    }

    /**
     * Gets the value of the checksellrules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCHECKSELLRULES() {
        return checksellrules;
    }

    /**
     * Sets the value of the checksellrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCHECKSELLRULES(Boolean value) {
        this.checksellrules = value;
    }

    /**
     * Gets the value of the listrate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTRATETYPE2 }
     * 
     * 
     */
    public List<LISTRATETYPE2> getLISTRATE() {
        if (listrate == null) {
            listrate = new ArrayList<LISTRATETYPE2>();
        }
        return this.listrate;
    }

}
