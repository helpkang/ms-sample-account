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
 * To specify the details for making a selection.
 * 
 * <p>Java class for SelectionDetailsType_67537S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionDetailsType_67537S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrierFeeDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}SelectionDetailsInformationType_105599C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionDetailsType_67537S", propOrder = {
    "carrierFeeDetails"
})
public class SelectionDetailsType67537S {

    @XmlElement(required = true)
    protected SelectionDetailsInformationType105599C carrierFeeDetails;

    /**
     * Gets the value of the carrierFeeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsInformationType105599C }
     *     
     */
    public SelectionDetailsInformationType105599C getCarrierFeeDetails() {
        return carrierFeeDetails;
    }

    /**
     * Sets the value of the carrierFeeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsInformationType105599C }
     *     
     */
    public void setCarrierFeeDetails(SelectionDetailsInformationType105599C value) {
        this.carrierFeeDetails = value;
    }

}
