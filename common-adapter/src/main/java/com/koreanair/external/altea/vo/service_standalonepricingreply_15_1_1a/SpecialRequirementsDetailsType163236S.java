//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:25 AM KST 
//


package com.koreanair.external.altea.vo.service_standalonepricingreply_15_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify special requests or service s information relating to a traveller
 * 
 * <p>Java class for SpecialRequirementsDetailsType_163236S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsType_163236S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialRequirementsDetails" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}SpecialRequirementsTypeDetailsType_231319C"/>
 *         &lt;element name="specialRequirementsDataDetails" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}SpecialRequirementsDataDetailsType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsType_163236S", propOrder = {
    "specialRequirementsDetails",
    "specialRequirementsDataDetails"
})
public class SpecialRequirementsDetailsType163236S {

    @XmlElement(required = true)
    protected SpecialRequirementsTypeDetailsType231319C specialRequirementsDetails;
    protected List<SpecialRequirementsDataDetailsType> specialRequirementsDataDetails;

    /**
     * Gets the value of the specialRequirementsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsTypeDetailsType231319C }
     *     
     */
    public SpecialRequirementsTypeDetailsType231319C getSpecialRequirementsDetails() {
        return specialRequirementsDetails;
    }

    /**
     * Sets the value of the specialRequirementsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsTypeDetailsType231319C }
     *     
     */
    public void setSpecialRequirementsDetails(SpecialRequirementsTypeDetailsType231319C value) {
        this.specialRequirementsDetails = value;
    }

    /**
     * Gets the value of the specialRequirementsDataDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialRequirementsDataDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialRequirementsDataDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialRequirementsDataDetailsType }
     * 
     * 
     */
    public List<SpecialRequirementsDataDetailsType> getSpecialRequirementsDataDetails() {
        if (specialRequirementsDataDetails == null) {
            specialRequirementsDataDetails = new ArrayList<SpecialRequirementsDataDetailsType>();
        }
        return this.specialRequirementsDataDetails;
    }

}
