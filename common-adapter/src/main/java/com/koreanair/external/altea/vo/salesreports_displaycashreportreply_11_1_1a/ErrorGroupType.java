//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:07:47 ���� KST 
//


package com.koreanair.external.altea.vo.salesreports_displaycashreportreply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys a potential error.
 * 
 * <p>Java class for ErrorGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorOrWarningCodeDetails" type="{http://xml.amadeus.com/TSRCRR_11_1_1A}ApplicationErrorInformationType"/>
 *         &lt;element name="errorWarningDescription" type="{http://xml.amadeus.com/TSRCRR_11_1_1A}FreeTextInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorGroupType", propOrder = {
    "errorOrWarningCodeDetails",
    "errorWarningDescription"
})
public class ErrorGroupType {

    @XmlElement(required = true)
    protected ApplicationErrorInformationType errorOrWarningCodeDetails;
    protected FreeTextInformationType errorWarningDescription;

    /**
     * Gets the value of the errorOrWarningCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationType }
     *     
     */
    public ApplicationErrorInformationType getErrorOrWarningCodeDetails() {
        return errorOrWarningCodeDetails;
    }

    /**
     * Sets the value of the errorOrWarningCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationType }
     *     
     */
    public void setErrorOrWarningCodeDetails(ApplicationErrorInformationType value) {
        this.errorOrWarningCodeDetails = value;
    }

    /**
     * Gets the value of the errorWarningDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType }
     *     
     */
    public FreeTextInformationType getErrorWarningDescription() {
        return errorWarningDescription;
    }

    /**
     * Sets the value of the errorWarningDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType }
     *     
     */
    public void setErrorWarningDescription(FreeTextInformationType value) {
        this.errorWarningDescription = value;
    }

}
