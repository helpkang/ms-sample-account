//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:29:08 ���� KST 
//


package com.koreanair.external.altea.vo.air_multiavailability_13_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify physical measurements, including dimension tolerances, weights and counts.
 * 
 * <p>Java class for MeasurementsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualifier" type="{http://xml.amadeus.com/SATRQT_13_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="valueRange" type="{http://xml.amadeus.com/SATRQT_13_1_1A}ValueRangeTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementsTypeI", propOrder = {
    "qualifier",
    "valueRange"
})
public class MeasurementsTypeI {

    @XmlElement(required = true)
    protected String qualifier;
    @XmlElement(required = true)
    protected ValueRangeTypeI valueRange;

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the valueRange property.
     * 
     * @return
     *     possible object is
     *     {@link ValueRangeTypeI }
     *     
     */
    public ValueRangeTypeI getValueRange() {
        return valueRange;
    }

    /**
     * Sets the value of the valueRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueRangeTypeI }
     *     
     */
    public void setValueRange(ValueRangeTypeI value) {
        this.valueRange = value;
    }

}
