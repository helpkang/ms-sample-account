//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 07:17:29 ���� KST 
//


package com.koreanair.external.altea.vo.ticket_processedocairportcontrolreply_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide information relating to service times and terminals used by a service.
 * 
 * <p>Java class for TerminalTimeInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalTimeInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/TACRES_12_1_1A}LocationIdentificationTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalTimeInformationTypeI", propOrder = {
    "locationDetails"
})
public class TerminalTimeInformationTypeI {

    @XmlElement(required = true)
    protected LocationIdentificationTypeI locationDetails;

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentificationTypeI }
     *     
     */
    public LocationIdentificationTypeI getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentificationTypeI }
     *     
     */
    public void setLocationDetails(LocationIdentificationTypeI value) {
        this.locationDetails = value;
    }

}
