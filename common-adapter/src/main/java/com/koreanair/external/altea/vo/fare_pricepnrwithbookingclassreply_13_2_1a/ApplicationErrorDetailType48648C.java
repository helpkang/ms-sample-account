//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.01 at 09:23:07 AM KST 
//


package com.koreanair.external.altea.vo.fare_pricepnrwithbookingclassreply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationErrorDetailType_48648C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorDetailType_48648C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationErrorCode" type="{http://xml.amadeus.com/TPCBRR_13_2_1A}AlphaNumericString_Length1To5"/>
 *         &lt;element name="codeListQualifier" type="{http://xml.amadeus.com/TPCBRR_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="codeListResponsibleAgency" type="{http://xml.amadeus.com/TPCBRR_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorDetailType_48648C", propOrder = {
    "applicationErrorCode",
    "codeListQualifier",
    "codeListResponsibleAgency"
})
public class ApplicationErrorDetailType48648C {

    @XmlElement(required = true)
    protected String applicationErrorCode;
    protected String codeListQualifier;
    protected String codeListResponsibleAgency;

    /**
     * Gets the value of the applicationErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationErrorCode() {
        return applicationErrorCode;
    }

    /**
     * Sets the value of the applicationErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationErrorCode(String value) {
        this.applicationErrorCode = value;
    }

    /**
     * Gets the value of the codeListQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListQualifier() {
        return codeListQualifier;
    }

    /**
     * Sets the value of the codeListQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListQualifier(String value) {
        this.codeListQualifier = value;
    }

    /**
     * Gets the value of the codeListResponsibleAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListResponsibleAgency() {
        return codeListResponsibleAgency;
    }

    /**
     * Sets the value of the codeListResponsibleAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListResponsibleAgency(String value) {
        this.codeListResponsibleAgency = value;
    }

}
