//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 03:42:07 ���� KST 
//


package com.koreanair.external.altea.vo.security_opentrustedsession_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a place or a location and/or related locations.
 * 
 * <p>Java class for PlaceLocationIdentificationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceLocationIdentificationTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationType" type="{http://xml.amadeus.com/VTRSAQ_12_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="locationDescription" type="{http://xml.amadeus.com/VTRSAQ_12_1_1A}LocationIdentificationBatchTypeU"/>
 *         &lt;element name="firstLocationDetails" type="{http://xml.amadeus.com/VTRSAQ_12_1_1A}RelatedLocationOneIdentificationTypeU" minOccurs="0"/>
 *         &lt;element name="secondLocationDetails" type="{http://xml.amadeus.com/VTRSAQ_12_1_1A}RelatedLocationTwoIdentificationTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceLocationIdentificationTypeU", propOrder = {
    "locationType",
    "locationDescription",
    "firstLocationDetails",
    "secondLocationDetails"
})
public class PlaceLocationIdentificationTypeU {

    @XmlElement(required = true)
    protected String locationType;
    @XmlElement(required = true)
    protected LocationIdentificationBatchTypeU locationDescription;
    protected RelatedLocationOneIdentificationTypeU firstLocationDetails;
    protected RelatedLocationTwoIdentificationTypeU secondLocationDetails;

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentificationBatchTypeU }
     *     
     */
    public LocationIdentificationBatchTypeU getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentificationBatchTypeU }
     *     
     */
    public void setLocationDescription(LocationIdentificationBatchTypeU value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the firstLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLocationOneIdentificationTypeU }
     *     
     */
    public RelatedLocationOneIdentificationTypeU getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /**
     * Sets the value of the firstLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLocationOneIdentificationTypeU }
     *     
     */
    public void setFirstLocationDetails(RelatedLocationOneIdentificationTypeU value) {
        this.firstLocationDetails = value;
    }

    /**
     * Gets the value of the secondLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLocationTwoIdentificationTypeU }
     *     
     */
    public RelatedLocationTwoIdentificationTypeU getSecondLocationDetails() {
        return secondLocationDetails;
    }

    /**
     * Sets the value of the secondLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLocationTwoIdentificationTypeU }
     *     
     */
    public void setSecondLocationDetails(RelatedLocationTwoIdentificationTypeU value) {
        this.secondLocationDetails = value;
    }

}
