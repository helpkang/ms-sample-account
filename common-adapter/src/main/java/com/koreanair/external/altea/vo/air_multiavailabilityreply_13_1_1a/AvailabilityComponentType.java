//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:29:17 ���� KST 
//


package com.koreanair.external.altea.vo.air_multiavailabilityreply_13_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailabilityComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservationControlType" type="{http://xml.amadeus.com/SATRSP_13_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="informationLine" type="{http://xml.amadeus.com/SATRSP_13_1_1A}AlphaNumericString_Length1To54" minOccurs="0"/>
 *         &lt;element name="moreIndicator" type="{http://xml.amadeus.com/SATRSP_13_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityComponentType", propOrder = {
    "reservationControlType",
    "informationLine",
    "moreIndicator"
})
public class AvailabilityComponentType {

    protected String reservationControlType;
    protected String informationLine;
    protected String moreIndicator;

    /**
     * Gets the value of the reservationControlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationControlType() {
        return reservationControlType;
    }

    /**
     * Sets the value of the reservationControlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationControlType(String value) {
        this.reservationControlType = value;
    }

    /**
     * Gets the value of the informationLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationLine() {
        return informationLine;
    }

    /**
     * Sets the value of the informationLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationLine(String value) {
        this.informationLine = value;
    }

    /**
     * Gets the value of the moreIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreIndicator() {
        return moreIndicator;
    }

    /**
     * Sets the value of the moreIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreIndicator(String value) {
        this.moreIndicator = value;
    }

}
