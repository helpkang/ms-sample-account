
package com.koreanair.eretail.pojo.tripplan.common.common_fare;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fareDataSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareDataSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FARE_FAMILY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRIMARY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NVB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BAGGAGE_ALLOWANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TICKETING_STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ROUTING" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CONNECTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="COUPON_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INVOLUNTARY_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SEQUENCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PNR_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareDataSegmentType", propOrder = {
    "number",
    "farefamily",
    "primarycode",
    "amount",
    "currency",
    "nva",
    "nvb",
    "farebasis",
    "baggageallowance",
    "discountindicator",
    "ticketingstatus",
    "routing",
    "connectiontype",
    "couponstatus",
    "involuntaryindicator",
    "segmentid",
    "sequencenumber",
    "pnrsegmentid"
})
public class FareDataSegmentType
    implements Serializable
{

    @XmlElement(name = "NUMBER")
    protected String number;
    @XmlElement(name = "FARE_FAMILY")
    protected String farefamily;
    @XmlElement(name = "PRIMARY_CODE")
    protected String primarycode;
    @XmlElement(name = "AMOUNT")
    protected String amount;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "NVA")
    protected String nva;
    @XmlElement(name = "NVB")
    protected String nvb;
    @XmlElement(name = "FARE_BASIS")
    protected String farebasis;
    @XmlElement(name = "BAGGAGE_ALLOWANCE")
    protected String baggageallowance;
    @XmlElement(name = "DISCOUNT_INDICATOR")
    protected Object discountindicator;
    @XmlElement(name = "TICKETING_STATUS")
    protected Object ticketingstatus;
    @XmlElement(name = "ROUTING")
    protected Object routing;
    @XmlElement(name = "CONNECTION_TYPE")
    protected Object connectiontype;
    @XmlElement(name = "COUPON_STATUS")
    protected String couponstatus;
    @XmlElement(name = "INVOLUNTARY_INDICATOR")
    protected String involuntaryindicator;
    @XmlElement(name = "SEGMENT_ID")
    protected Object segmentid;
    @XmlElement(name = "SEQUENCE_NUMBER")
    protected BigInteger sequencenumber;
    @XmlElement(name = "PNR_SEGMENT_ID")
    protected Object pnrsegmentid;
    @XmlAttribute(name = "isDeleted")
    protected String isDeleted;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMBER() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMBER(String value) {
        this.number = value;
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

    /**
     * Gets the value of the primarycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMARYCODE() {
        return primarycode;
    }

    /**
     * Sets the value of the primarycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMARYCODE(String value) {
        this.primarycode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNT(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the nva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVA() {
        return nva;
    }

    /**
     * Sets the value of the nva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVA(String value) {
        this.nva = value;
    }

    /**
     * Gets the value of the nvb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVB() {
        return nvb;
    }

    /**
     * Sets the value of the nvb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVB(String value) {
        this.nvb = value;
    }

    /**
     * Gets the value of the farebasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREBASIS() {
        return farebasis;
    }

    /**
     * Sets the value of the farebasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREBASIS(String value) {
        this.farebasis = value;
    }

    /**
     * Gets the value of the baggageallowance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAGGAGEALLOWANCE() {
        return baggageallowance;
    }

    /**
     * Sets the value of the baggageallowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAGGAGEALLOWANCE(String value) {
        this.baggageallowance = value;
    }

    /**
     * Gets the value of the discountindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDISCOUNTINDICATOR() {
        return discountindicator;
    }

    /**
     * Sets the value of the discountindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDISCOUNTINDICATOR(Object value) {
        this.discountindicator = value;
    }

    /**
     * Gets the value of the ticketingstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTICKETINGSTATUS() {
        return ticketingstatus;
    }

    /**
     * Sets the value of the ticketingstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTICKETINGSTATUS(Object value) {
        this.ticketingstatus = value;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getROUTING() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setROUTING(Object value) {
        this.routing = value;
    }

    /**
     * Gets the value of the connectiontype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCONNECTIONTYPE() {
        return connectiontype;
    }

    /**
     * Sets the value of the connectiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCONNECTIONTYPE(Object value) {
        this.connectiontype = value;
    }

    /**
     * Gets the value of the couponstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUPONSTATUS() {
        return couponstatus;
    }

    /**
     * Sets the value of the couponstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUPONSTATUS(String value) {
        this.couponstatus = value;
    }

    /**
     * Gets the value of the involuntaryindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVOLUNTARYINDICATOR() {
        return involuntaryindicator;
    }

    /**
     * Sets the value of the involuntaryindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVOLUNTARYINDICATOR(String value) {
        this.involuntaryindicator = value;
    }

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSEGMENTID(Object value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the sequencenumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEQUENCENUMBER() {
        return sequencenumber;
    }

    /**
     * Sets the value of the sequencenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEQUENCENUMBER(BigInteger value) {
        this.sequencenumber = value;
    }

    /**
     * Gets the value of the pnrsegmentid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPNRSEGMENTID() {
        return pnrsegmentid;
    }

    /**
     * Sets the value of the pnrsegmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPNRSEGMENTID(Object value) {
        this.pnrsegmentid = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDeleted(String value) {
        this.isDeleted = value;
    }

}
