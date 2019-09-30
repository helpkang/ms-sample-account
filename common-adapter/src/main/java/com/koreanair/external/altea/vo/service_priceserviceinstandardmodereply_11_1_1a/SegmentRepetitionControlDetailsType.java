//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:45 AM KST 
//


package com.koreanair.external.altea.vo.service_priceserviceinstandardmodereply_11_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the number of selection segments to be processed.
 * 
 * <p>Java class for SegmentRepetitionControlDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentRepetitionControlDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productReference" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="numberOfPAx" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentRepetitionControlDetailsType", propOrder = {
    "productReference",
    "numberOfUnits",
    "numberOfPAx"
})
public class SegmentRepetitionControlDetailsType {

    protected BigInteger productReference;
    protected BigInteger numberOfUnits;
    protected BigInteger numberOfPAx;

    /**
     * Gets the value of the productReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductReference() {
        return productReference;
    }

    /**
     * Sets the value of the productReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductReference(BigInteger value) {
        this.productReference = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the numberOfPAx property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPAx() {
        return numberOfPAx;
    }

    /**
     * Sets the value of the numberOfPAx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPAx(BigInteger value) {
        this.numberOfPAx = value;
    }

}
