//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for PassengerFareBasisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerFareBasisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segmentRepetitionControl" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}SegmentRepetitionControlType"/>
 *         &lt;element name="specificTravellerDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}SpecificTravellerTypeI" minOccurs="0"/>
 *         &lt;element name="requestedPricingInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}PrincingByFareBasisType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerFareBasisType", propOrder = {
    "segmentRepetitionControl",
    "specificTravellerDetails",
    "requestedPricingInfo"
})
public class PassengerFareBasisType {

    @XmlElement(required = true)
    protected SegmentRepetitionControlType segmentRepetitionControl;
    protected SpecificTravellerTypeI specificTravellerDetails;
    protected PrincingByFareBasisType requestedPricingInfo;

    /**
     * Gets the value of the segmentRepetitionControl property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentRepetitionControlType }
     *     
     */
    public SegmentRepetitionControlType getSegmentRepetitionControl() {
        return segmentRepetitionControl;
    }

    /**
     * Sets the value of the segmentRepetitionControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentRepetitionControlType }
     *     
     */
    public void setSegmentRepetitionControl(SegmentRepetitionControlType value) {
        this.segmentRepetitionControl = value;
    }

    /**
     * Gets the value of the specificTravellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificTravellerTypeI }
     *     
     */
    public SpecificTravellerTypeI getSpecificTravellerDetails() {
        return specificTravellerDetails;
    }

    /**
     * Sets the value of the specificTravellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificTravellerTypeI }
     *     
     */
    public void setSpecificTravellerDetails(SpecificTravellerTypeI value) {
        this.specificTravellerDetails = value;
    }

    /**
     * Gets the value of the requestedPricingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrincingByFareBasisType }
     *     
     */
    public PrincingByFareBasisType getRequestedPricingInfo() {
        return requestedPricingInfo;
    }

    /**
     * Sets the value of the requestedPricingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincingByFareBasisType }
     *     
     */
    public void setRequestedPricingInfo(PrincingByFareBasisType value) {
        this.requestedPricingInfo = value;
    }

}
