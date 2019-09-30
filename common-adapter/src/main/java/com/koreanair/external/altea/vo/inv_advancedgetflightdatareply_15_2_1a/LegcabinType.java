//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 06:01:13 ���� KST 
//


package com.koreanair.external.altea.vo.inv_advancedgetflightdatareply_15_2_1a;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegcabinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegcabinType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regradeAdjustment" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15"/>
 *         &lt;element name="maxiRegradeAdjustment" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericInteger_Length1To15"/>
 *         &lt;element name="unbalancedAdjustment" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericInteger_Length1To15"/>
 *         &lt;element name="groupsConstrainingYield" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="avsFlag" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="notificationLevel" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15" minOccurs="0"/>
 *         &lt;element name="avpoolOffset" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15" minOccurs="0"/>
 *         &lt;element name="avpool" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15" minOccurs="0"/>
 *         &lt;element name="maxiGroupProportion" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15" minOccurs="0"/>
 *         &lt;element name="regradeCounter" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}NumericDecimal_Length1To15" minOccurs="0"/>
 *         &lt;element name="blockedSpaceDetails" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}BlockspaceType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegcabinType", propOrder = {
    "regradeAdjustment",
    "maxiRegradeAdjustment",
    "unbalancedAdjustment",
    "groupsConstrainingYield",
    "avsFlag",
    "notificationLevel",
    "avpoolOffset",
    "avpool",
    "maxiGroupProportion",
    "regradeCounter",
    "blockedSpaceDetails"
})
public class LegcabinType {

    @XmlElement(required = true)
    protected BigDecimal regradeAdjustment;
    @XmlElement(required = true)
    protected BigInteger maxiRegradeAdjustment;
    @XmlElement(required = true)
    protected BigInteger unbalancedAdjustment;
    protected BigDecimal groupsConstrainingYield;
    protected String avsFlag;
    protected BigDecimal notificationLevel;
    protected BigDecimal avpoolOffset;
    protected BigDecimal avpool;
    protected BigDecimal maxiGroupProportion;
    protected BigDecimal regradeCounter;
    protected List<BlockspaceType> blockedSpaceDetails;

    /**
     * Gets the value of the regradeAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegradeAdjustment() {
        return regradeAdjustment;
    }

    /**
     * Sets the value of the regradeAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegradeAdjustment(BigDecimal value) {
        this.regradeAdjustment = value;
    }

    /**
     * Gets the value of the maxiRegradeAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxiRegradeAdjustment() {
        return maxiRegradeAdjustment;
    }

    /**
     * Sets the value of the maxiRegradeAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxiRegradeAdjustment(BigInteger value) {
        this.maxiRegradeAdjustment = value;
    }

    /**
     * Gets the value of the unbalancedAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnbalancedAdjustment() {
        return unbalancedAdjustment;
    }

    /**
     * Sets the value of the unbalancedAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnbalancedAdjustment(BigInteger value) {
        this.unbalancedAdjustment = value;
    }

    /**
     * Gets the value of the groupsConstrainingYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGroupsConstrainingYield() {
        return groupsConstrainingYield;
    }

    /**
     * Sets the value of the groupsConstrainingYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGroupsConstrainingYield(BigDecimal value) {
        this.groupsConstrainingYield = value;
    }

    /**
     * Gets the value of the avsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsFlag() {
        return avsFlag;
    }

    /**
     * Sets the value of the avsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsFlag(String value) {
        this.avsFlag = value;
    }

    /**
     * Gets the value of the notificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNotificationLevel() {
        return notificationLevel;
    }

    /**
     * Sets the value of the notificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNotificationLevel(BigDecimal value) {
        this.notificationLevel = value;
    }

    /**
     * Gets the value of the avpoolOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvpoolOffset() {
        return avpoolOffset;
    }

    /**
     * Sets the value of the avpoolOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvpoolOffset(BigDecimal value) {
        this.avpoolOffset = value;
    }

    /**
     * Gets the value of the avpool property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvpool() {
        return avpool;
    }

    /**
     * Sets the value of the avpool property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvpool(BigDecimal value) {
        this.avpool = value;
    }

    /**
     * Gets the value of the maxiGroupProportion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxiGroupProportion() {
        return maxiGroupProportion;
    }

    /**
     * Sets the value of the maxiGroupProportion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxiGroupProportion(BigDecimal value) {
        this.maxiGroupProportion = value;
    }

    /**
     * Gets the value of the regradeCounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegradeCounter() {
        return regradeCounter;
    }

    /**
     * Sets the value of the regradeCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegradeCounter(BigDecimal value) {
        this.regradeCounter = value;
    }

    /**
     * Gets the value of the blockedSpaceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockedSpaceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockedSpaceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlockspaceType }
     * 
     * 
     */
    public List<BlockspaceType> getBlockedSpaceDetails() {
        if (blockedSpaceDetails == null) {
            blockedSpaceDetails = new ArrayList<BlockspaceType>();
        }
        return this.blockedSpaceDetails;
    }

}
