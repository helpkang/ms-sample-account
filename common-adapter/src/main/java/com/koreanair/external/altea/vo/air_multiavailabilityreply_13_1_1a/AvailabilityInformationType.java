//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:29:17 ���� KST 
//


package com.koreanair.external.altea.vo.air_multiavailabilityreply_13_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify Availability Information.
 * 
 * <p>Java class for AvailabilityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availabilityInformation" type="{http://xml.amadeus.com/SATRSP_13_1_1A}AvailabilityInformationDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityInformationType", propOrder = {
    "availabilityInformation"
})
public class AvailabilityInformationType {

    @XmlElement(required = true)
    protected AvailabilityInformationDetailsType availabilityInformation;

    /**
     * Gets the value of the availabilityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityInformationDetailsType }
     *     
     */
    public AvailabilityInformationDetailsType getAvailabilityInformation() {
        return availabilityInformation;
    }

    /**
     * Sets the value of the availabilityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityInformationDetailsType }
     *     
     */
    public void setAvailabilityInformation(AvailabilityInformationDetailsType value) {
        this.availabilityInformation = value;
    }

}
