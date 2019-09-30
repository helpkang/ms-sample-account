//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information about discounts and penalties
 * 
 * <p>Java class for DiscountAndPenaltyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountAndPenaltyInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discountPenaltyQualifier" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="discountPenaltyDetails" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}DiscountPenaltyMonetaryInformationTypeI" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountAndPenaltyInformationType", propOrder = {
    "discountPenaltyQualifier",
    "discountPenaltyDetails"
})
public class DiscountAndPenaltyInformationType {

    protected String discountPenaltyQualifier;
    protected List<DiscountPenaltyMonetaryInformationTypeI> discountPenaltyDetails;

    /**
     * Gets the value of the discountPenaltyQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPenaltyQualifier() {
        return discountPenaltyQualifier;
    }

    /**
     * Sets the value of the discountPenaltyQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPenaltyQualifier(String value) {
        this.discountPenaltyQualifier = value;
    }

    /**
     * Gets the value of the discountPenaltyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountPenaltyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountPenaltyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountPenaltyMonetaryInformationTypeI }
     * 
     * 
     */
    public List<DiscountPenaltyMonetaryInformationTypeI> getDiscountPenaltyDetails() {
        if (discountPenaltyDetails == null) {
            discountPenaltyDetails = new ArrayList<DiscountPenaltyMonetaryInformationTypeI>();
        }
        return this.discountPenaltyDetails;
    }

}
