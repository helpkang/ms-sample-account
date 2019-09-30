//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 11:07:43 AM KST 
//


package com.koreanair.external.altea.vo.air_retrieveseatmap_14_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler information.
 * 
 * <p>Java class for FrequentTravellerInformationTypeI_187045S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerInformationTypeI_187045S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequentTravellerDetails" type="{http://xml.amadeus.com/SMPREQ_14_2_1A}FrequentTravellerIdentificationTypeI"/>
 *         &lt;element name="otherFrequentTravellerDetails" type="{http://xml.amadeus.com/SMPREQ_14_2_1A}FrequentTravellerIdentificationTypeI" maxOccurs="98" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerInformationTypeI_187045S", propOrder = {
    "frequentTravellerDetails",
    "otherFrequentTravellerDetails"
})
public class FrequentTravellerInformationTypeI187045S {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationTypeI frequentTravellerDetails;
    protected List<FrequentTravellerIdentificationTypeI> otherFrequentTravellerDetails;

    /**
     * Gets the value of the frequentTravellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationTypeI }
     *     
     */
    public FrequentTravellerIdentificationTypeI getFrequentTravellerDetails() {
        return frequentTravellerDetails;
    }

    /**
     * Sets the value of the frequentTravellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationTypeI }
     *     
     */
    public void setFrequentTravellerDetails(FrequentTravellerIdentificationTypeI value) {
        this.frequentTravellerDetails = value;
    }

    /**
     * Gets the value of the otherFrequentTravellerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherFrequentTravellerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherFrequentTravellerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequentTravellerIdentificationTypeI }
     * 
     * 
     */
    public List<FrequentTravellerIdentificationTypeI> getOtherFrequentTravellerDetails() {
        if (otherFrequentTravellerDetails == null) {
            otherFrequentTravellerDetails = new ArrayList<FrequentTravellerIdentificationTypeI>();
        }
        return this.otherFrequentTravellerDetails;
    }

}
