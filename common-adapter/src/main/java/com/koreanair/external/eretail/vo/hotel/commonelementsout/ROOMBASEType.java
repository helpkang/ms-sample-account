
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.common.OCCUPANCYType;


/**
 * Base room type used also for the pricing
 * 
 * <p>Java class for ROOM_BASEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROOM_BASEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ROOM_TYPE" type="{}ROOM_TYPE_2" minOccurs="0"/&gt;
 *         &lt;element name="BED_TYPE" type="{}BED_TYPE_2" minOccurs="0"/&gt;
 *         &lt;element ref="{}BED_COUNT" minOccurs="0"/&gt;
 *         &lt;element name="SPECIAL_RATE_TYPE" type="{}SPECIAL_RATE_TYPE_TYPE_1" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_IN_POLICY" type="{}ROOM_CHECK_IN_POLICY_TYPE" minOccurs="0"/&gt;
 *         &lt;element ref="{}RATE_CHANGE" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element ref="{}CORPORATE_ID_REQUIRED" minOccurs="0"/&gt;
 *         &lt;element ref="{}GUARANTEE_REQUIRED" minOccurs="0"/&gt;
 *         &lt;element ref="{}DEPOSIT_REQUIRED" minOccurs="0"/&gt;
 *         &lt;element ref="{}CHECK_SELL_RULES" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CANCELLATION" type="{}CANCELLATION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TAX" type="{}TAXType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="COMMISSION" type="{}COMMISSION_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="LIST_RATE" type="{}LIST_RATE_TYPE_1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="STRUCTURED_OCCUPANCY" type="{}OCCUPANCYType"/&gt;
 *         &lt;element name="LIST_RATE_ROOM" type="{}LIST_RATEType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OCCUPANCY_CHANGED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROOM_BASEType", propOrder = {
    "roomtype",
    "bedtype",
    "bedcount",
    "specialratetype",
    "checkinpolicy",
    "ratechange",
    "bookingcode",
    "corporateidrequired",
    "guaranteerequired",
    "depositrequired",
    "checksellrules",
    "listcancellation",
    "listtax",
    "commission",
    "listrate",
    "structuredoccupancy",
    "listrateroom",
    "occupancychanged"
})
@XmlSeeAlso({
    LISTROOMITEMTYPE.class
})
public class ROOMBASEType
    implements Serializable
{

    @XmlElement(name = "ROOM_TYPE")
    protected ROOMTYPE2 roomtype;
    @XmlElement(name = "BED_TYPE")
    protected BEDTYPE2 bedtype;
    @XmlElement(name = "BED_COUNT")
    protected BigInteger bedcount;
    @XmlElement(name = "SPECIAL_RATE_TYPE")
    protected SPECIALRATETYPETYPE1 specialratetype;
    @XmlElement(name = "CHECK_IN_POLICY")
    protected ROOMCHECKINPOLICYTYPE checkinpolicy;
    @XmlElement(name = "RATE_CHANGE")
    protected Boolean ratechange;
    @XmlElement(name = "BOOKING_CODE")
    protected String bookingcode;
    @XmlElement(name = "CORPORATE_ID_REQUIRED")
    protected Boolean corporateidrequired;
    @XmlElement(name = "GUARANTEE_REQUIRED")
    protected Boolean guaranteerequired;
    @XmlElement(name = "DEPOSIT_REQUIRED")
    protected Boolean depositrequired;
    @XmlElement(name = "CHECK_SELL_RULES")
    protected Boolean checksellrules;
    @XmlElement(name = "LIST_CANCELLATION")
    protected List<CANCELLATIONTYPE> listcancellation;
    @XmlElement(name = "LIST_TAX")
    protected List<TAXType> listtax;
    @XmlElement(name = "COMMISSION")
    protected COMMISSIONTYPE commission;
    @XmlElement(name = "LIST_RATE")
    protected List<LISTRATETYPE1> listrate;
    @XmlElement(name = "STRUCTURED_OCCUPANCY", required = true)
    protected OCCUPANCYType structuredoccupancy;
    @XmlElement(name = "LIST_RATE_ROOM")
    protected List<LISTRATEType> listrateroom;
    @XmlElement(name = "OCCUPANCY_CHANGED")
    protected Boolean occupancychanged;

    /**
     * Gets the value of the roomtype property.
     * 
     * @return
     *     possible object is
     *     {@link ROOMTYPE2 }
     *     
     */
    public ROOMTYPE2 getROOMTYPE() {
        return roomtype;
    }

    /**
     * Sets the value of the roomtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROOMTYPE2 }
     *     
     */
    public void setROOMTYPE(ROOMTYPE2 value) {
        this.roomtype = value;
    }

    /**
     * Gets the value of the bedtype property.
     * 
     * @return
     *     possible object is
     *     {@link BEDTYPE2 }
     *     
     */
    public BEDTYPE2 getBEDTYPE() {
        return bedtype;
    }

    /**
     * Sets the value of the bedtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEDTYPE2 }
     *     
     */
    public void setBEDTYPE(BEDTYPE2 value) {
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
     * Gets the value of the ratechange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRATECHANGE() {
        return ratechange;
    }

    /**
     * Sets the value of the ratechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRATECHANGE(Boolean value) {
        this.ratechange = value;
    }

    /**
     * Gets the value of the bookingcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKINGCODE() {
        return bookingcode;
    }

    /**
     * Sets the value of the bookingcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKINGCODE(String value) {
        this.bookingcode = value;
    }

    /**
     * Gets the value of the corporateidrequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCORPORATEIDREQUIRED() {
        return corporateidrequired;
    }

    /**
     * Sets the value of the corporateidrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCORPORATEIDREQUIRED(Boolean value) {
        this.corporateidrequired = value;
    }

    /**
     * Gets the value of the guaranteerequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGUARANTEEREQUIRED() {
        return guaranteerequired;
    }

    /**
     * Sets the value of the guaranteerequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGUARANTEEREQUIRED(Boolean value) {
        this.guaranteerequired = value;
    }

    /**
     * Gets the value of the depositrequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDEPOSITREQUIRED() {
        return depositrequired;
    }

    /**
     * Sets the value of the depositrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDEPOSITREQUIRED(Boolean value) {
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
     * Gets the value of the listcancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCANCELLATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CANCELLATIONTYPE }
     * 
     * 
     */
    public List<CANCELLATIONTYPE> getLISTCANCELLATION() {
        if (listcancellation == null) {
            listcancellation = new ArrayList<CANCELLATIONTYPE>();
        }
        return this.listcancellation;
    }

    /**
     * Gets the value of the listtax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTAX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAXType }
     * 
     * 
     */
    public List<TAXType> getLISTTAX() {
        if (listtax == null) {
            listtax = new ArrayList<TAXType>();
        }
        return this.listtax;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link COMMISSIONTYPE }
     *     
     */
    public COMMISSIONTYPE getCOMMISSION() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMMISSIONTYPE }
     *     
     */
    public void setCOMMISSION(COMMISSIONTYPE value) {
        this.commission = value;
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
     * {@link LISTRATETYPE1 }
     * 
     * 
     */
    public List<LISTRATETYPE1> getLISTRATE() {
        if (listrate == null) {
            listrate = new ArrayList<LISTRATETYPE1>();
        }
        return this.listrate;
    }

    /**
     * Gets the value of the structuredoccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link OCCUPANCYType }
     *     
     */
    public OCCUPANCYType getSTRUCTUREDOCCUPANCY() {
        return structuredoccupancy;
    }

    /**
     * Sets the value of the structuredoccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCCUPANCYType }
     *     
     */
    public void setSTRUCTUREDOCCUPANCY(OCCUPANCYType value) {
        this.structuredoccupancy = value;
    }

    /**
     * Gets the value of the listrateroom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrateroom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRATEROOM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTRATEType }
     * 
     * 
     */
    public List<LISTRATEType> getLISTRATEROOM() {
        if (listrateroom == null) {
            listrateroom = new ArrayList<LISTRATEType>();
        }
        return this.listrateroom;
    }

    /**
     * Gets the value of the occupancychanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOCCUPANCYCHANGED() {
        return occupancychanged;
    }

    /**
     * Sets the value of the occupancychanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOCCUPANCYCHANGED(Boolean value) {
        this.occupancychanged = value;
    }

}
