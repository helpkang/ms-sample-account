//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:45 AM KST 
//


package com.koreanair.external.altea.vo.service_priceserviceinstandardmodereply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubItineraryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubItineraryInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="includedSegmentsInfo" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}ActionDetailsType"/>
 *         &lt;element name="travelProductInfo" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}TravelProductInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubItineraryInfoType", propOrder = {
    "includedSegmentsInfo",
    "travelProductInfo"
})
public class SubItineraryInfoType {

    @XmlElement(required = true)
    protected ActionDetailsType includedSegmentsInfo;
    protected TravelProductInformationType travelProductInfo;

    /**
     * Gets the value of the includedSegmentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsType }
     *     
     */
    public ActionDetailsType getIncludedSegmentsInfo() {
        return includedSegmentsInfo;
    }

    /**
     * Sets the value of the includedSegmentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsType }
     *     
     */
    public void setIncludedSegmentsInfo(ActionDetailsType value) {
        this.includedSegmentsInfo = value;
    }

    /**
     * Gets the value of the travelProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationType }
     *     
     */
    public TravelProductInformationType getTravelProductInfo() {
        return travelProductInfo;
    }

    /**
     * Sets the value of the travelProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationType }
     *     
     */
    public void setTravelProductInfo(TravelProductInformationType value) {
        this.travelProductInfo = value;
    }

}
