//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:40 AM KST 
//


package com.koreanair.external.altea.vo.service_integratedpricingreply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the selection criteria for a seat map request.
 * 
 * <p>Java class for SeatRequestParametersTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRequestParametersTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genericDetails" type="{http://xml.amadeus.com/TPISGR_15_1_1A}GenericDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRequestParametersTypeI", propOrder = {
    "genericDetails"
})
public class SeatRequestParametersTypeI {

    protected GenericDetailsTypeI genericDetails;

    /**
     * Gets the value of the genericDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GenericDetailsTypeI }
     *     
     */
    public GenericDetailsTypeI getGenericDetails() {
        return genericDetails;
    }

    /**
     * Sets the value of the genericDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericDetailsTypeI }
     *     
     */
    public void setGenericDetails(GenericDetailsTypeI value) {
        this.genericDetails = value;
    }

}
