//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:25 AM KST 
//


package com.koreanair.external.altea.vo.service_standalonepricingreply_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details which qualify a fare
 * 
 * <p>Java class for FareQualifierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareQualifierDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareCategories" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}FareCategoryCodesTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQualifierDetailsType", propOrder = {
    "fareCategories"
})
public class FareQualifierDetailsType {

    protected FareCategoryCodesTypeI fareCategories;

    /**
     * Gets the value of the fareCategories property.
     * 
     * @return
     *     possible object is
     *     {@link FareCategoryCodesTypeI }
     *     
     */
    public FareCategoryCodesTypeI getFareCategories() {
        return fareCategories;
    }

    /**
     * Sets the value of the fareCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareCategoryCodesTypeI }
     *     
     */
    public void setFareCategories(FareCategoryCodesTypeI value) {
        this.fareCategories = value;
    }

}
