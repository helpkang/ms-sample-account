//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:40 AM KST 
//


package com.koreanair.external.altea.vo.service_integratedpricingreply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposedServiceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposedServiceDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proposedServiceDetails" type="{http://xml.amadeus.com/TPISGR_15_1_1A}SpecialRequirementsDetailsType_163236S"/>
 *         &lt;element name="proposedServiceRefInformation" type="{http://xml.amadeus.com/TPISGR_15_1_1A}ReferenceInfoType_163228S" minOccurs="0"/>
 *         &lt;element name="proposedServiceProductInfo" type="{http://xml.amadeus.com/TPISGR_15_1_1A}ProductInformationType_163234S" minOccurs="0"/>
 *         &lt;element name="proposedServiceParameters" type="{http://xml.amadeus.com/TPISGR_15_1_1A}SeatRequestParametersTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposedServiceDetailsType", propOrder = {
    "proposedServiceDetails",
    "proposedServiceRefInformation",
    "proposedServiceProductInfo",
    "proposedServiceParameters"
})
public class ProposedServiceDetailsType {

    @XmlElement(required = true)
    protected SpecialRequirementsDetailsType163236S proposedServiceDetails;
    protected ReferenceInfoType163228S proposedServiceRefInformation;
    protected ProductInformationType163234S proposedServiceProductInfo;
    protected SeatRequestParametersTypeI proposedServiceParameters;

    /**
     * Gets the value of the proposedServiceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsDetailsType163236S }
     *     
     */
    public SpecialRequirementsDetailsType163236S getProposedServiceDetails() {
        return proposedServiceDetails;
    }

    /**
     * Sets the value of the proposedServiceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsDetailsType163236S }
     *     
     */
    public void setProposedServiceDetails(SpecialRequirementsDetailsType163236S value) {
        this.proposedServiceDetails = value;
    }

    /**
     * Gets the value of the proposedServiceRefInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType163228S }
     *     
     */
    public ReferenceInfoType163228S getProposedServiceRefInformation() {
        return proposedServiceRefInformation;
    }

    /**
     * Sets the value of the proposedServiceRefInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType163228S }
     *     
     */
    public void setProposedServiceRefInformation(ReferenceInfoType163228S value) {
        this.proposedServiceRefInformation = value;
    }

    /**
     * Gets the value of the proposedServiceProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationType163234S }
     *     
     */
    public ProductInformationType163234S getProposedServiceProductInfo() {
        return proposedServiceProductInfo;
    }

    /**
     * Sets the value of the proposedServiceProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationType163234S }
     *     
     */
    public void setProposedServiceProductInfo(ProductInformationType163234S value) {
        this.proposedServiceProductInfo = value;
    }

    /**
     * Gets the value of the proposedServiceParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SeatRequestParametersTypeI }
     *     
     */
    public SeatRequestParametersTypeI getProposedServiceParameters() {
        return proposedServiceParameters;
    }

    /**
     * Sets the value of the proposedServiceParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatRequestParametersTypeI }
     *     
     */
    public void setProposedServiceParameters(SeatRequestParametersTypeI value) {
        this.proposedServiceParameters = value;
    }

}
