//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:46 ���� KST 
//


package com.koreanair.external.altea.vo.ticket_repricepnrwithbookingclass_12_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutyTaxFeeDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyTaxFeeDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxRate" type="{http://xml.amadeus.com/TARIPQ_12_2_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="taxValueQualifier" type="{http://xml.amadeus.com/TARIPQ_12_2_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyTaxFeeDetailType", propOrder = {
    "taxRate",
    "taxValueQualifier"
})
public class DutyTaxFeeDetailType {

    protected String taxRate;
    protected String taxValueQualifier;

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRate(String value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxValueQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxValueQualifier() {
        return taxValueQualifier;
    }

    /**
     * Sets the value of the taxValueQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxValueQualifier(String value) {
        this.taxValueQualifier = value;
    }

}
