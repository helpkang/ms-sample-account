//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 05:10:35 ���� KST 
//


package com.koreanair.external.altea.vo.service_integratedcataloguereply_13_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the conversion rate and the monetary amount.
 * 
 * <p>Java class for ConversionRateDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionRateDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionType" type="{http://xml.amadeus.com/TPICGR_13_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/TPICGR_13_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionRateDetailsType", propOrder = {
    "conversionType",
    "currency"
})
public class ConversionRateDetailsType {

    protected String conversionType;
    protected String currency;

    /**
     * Gets the value of the conversionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionType() {
        return conversionType;
    }

    /**
     * Sets the value of the conversionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionType(String value) {
        this.conversionType = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
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
    public void setCurrency(String value) {
        this.currency = value;
    }

}
