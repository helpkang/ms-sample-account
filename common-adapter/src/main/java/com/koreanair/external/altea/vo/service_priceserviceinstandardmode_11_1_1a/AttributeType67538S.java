//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for AttributeType_67538S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType_67538S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeQualifier" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AttributeInformationType" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType_67538S", propOrder = {
    "attributeQualifier",
    "attributeDetails"
})
public class AttributeType67538S {

    protected String attributeQualifier;
    @XmlElement(required = true)
    protected List<AttributeInformationType> attributeDetails;

    /**
     * Gets the value of the attributeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeQualifier() {
        return attributeQualifier;
    }

    /**
     * Sets the value of the attributeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeQualifier(String value) {
        this.attributeQualifier = value;
    }

    /**
     * Gets the value of the attributeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeInformationType }
     * 
     * 
     */
    public List<AttributeInformationType> getAttributeDetails() {
        if (attributeDetails == null) {
            attributeDetails = new ArrayList<AttributeInformationType>();
        }
        return this.attributeDetails;
    }

}
