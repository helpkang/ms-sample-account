//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:52 ���� KST 
//


package com.koreanair.external.altea.vo.ticket_repricepnrwithbookingclassreply_12_2_1a;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the number and weight of baggage.
 * 
 * <p>Java class for BaggageDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baggageQuantity" type="{http://xml.amadeus.com/TARIPR_12_2_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *         &lt;element name="baggageWeight" type="{http://xml.amadeus.com/TARIPR_12_2_1A}NumericDecimal_Length1To2" minOccurs="0"/>
 *         &lt;element name="baggageType" type="{http://xml.amadeus.com/TARIPR_12_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="measureUnit" type="{http://xml.amadeus.com/TARIPR_12_2_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDetailsTypeI", propOrder = {
    "baggageQuantity",
    "baggageWeight",
    "baggageType",
    "measureUnit"
})
public class BaggageDetailsTypeI {

    protected BigInteger baggageQuantity;
    protected BigDecimal baggageWeight;
    protected String baggageType;
    protected String measureUnit;

    /**
     * Gets the value of the baggageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaggageQuantity() {
        return baggageQuantity;
    }

    /**
     * Sets the value of the baggageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaggageQuantity(BigInteger value) {
        this.baggageQuantity = value;
    }

    /**
     * Gets the value of the baggageWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaggageWeight() {
        return baggageWeight;
    }

    /**
     * Sets the value of the baggageWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaggageWeight(BigDecimal value) {
        this.baggageWeight = value;
    }

    /**
     * Gets the value of the baggageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageType() {
        return baggageType;
    }

    /**
     * Sets the value of the baggageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageType(String value) {
        this.baggageType = value;
    }

    /**
     * Gets the value of the measureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureUnit() {
        return measureUnit;
    }

    /**
     * Sets the value of the measureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureUnit(String value) {
        this.measureUnit = value;
    }

}
