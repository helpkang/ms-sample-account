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
 * <p>Java class for SpecialRequirementsTypeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsTypeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceClassification" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}AlphaNumericString_Length1To4"/>
 *         &lt;element name="serviceMarketingCarrier" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="serviceGroup" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="serviceSubGroup" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="serviceFreeText" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}AlphaNumericString_Length1To70" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsTypeDetailsType", propOrder = {
    "serviceClassification",
    "serviceMarketingCarrier",
    "serviceGroup",
    "serviceSubGroup",
    "serviceFreeText"
})
public class SpecialRequirementsTypeDetailsType {

    @XmlElement(required = true)
    protected String serviceClassification;
    protected String serviceMarketingCarrier;
    protected String serviceGroup;
    protected String serviceSubGroup;
    protected List<String> serviceFreeText;

    /**
     * Gets the value of the serviceClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceClassification() {
        return serviceClassification;
    }

    /**
     * Sets the value of the serviceClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceClassification(String value) {
        this.serviceClassification = value;
    }

    /**
     * Gets the value of the serviceMarketingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceMarketingCarrier() {
        return serviceMarketingCarrier;
    }

    /**
     * Sets the value of the serviceMarketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceMarketingCarrier(String value) {
        this.serviceMarketingCarrier = value;
    }

    /**
     * Gets the value of the serviceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceGroup() {
        return serviceGroup;
    }

    /**
     * Sets the value of the serviceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceGroup(String value) {
        this.serviceGroup = value;
    }

    /**
     * Gets the value of the serviceSubGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubGroup() {
        return serviceSubGroup;
    }

    /**
     * Sets the value of the serviceSubGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSubGroup(String value) {
        this.serviceSubGroup = value;
    }

    /**
     * Gets the value of the serviceFreeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFreeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFreeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceFreeText() {
        if (serviceFreeText == null) {
            serviceFreeText = new ArrayList<String>();
        }
        return this.serviceFreeText;
    }

}
