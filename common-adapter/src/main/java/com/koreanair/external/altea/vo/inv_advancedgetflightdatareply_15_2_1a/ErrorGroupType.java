//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 06:01:13 ���� KST 
//


package com.koreanair.external.altea.vo.inv_advancedgetflightdatareply_15_2_1a;

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
 *         &lt;element name="applicationErrorInfo" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}ApplicationErrorInformationType"/>
 *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}FreeTextInformationType" minOccurs="0"/>
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
    "applicationErrorInfo",
    "interactiveFreeText"
})
public class ErrorGroupType {

    @XmlElement(required = true)
    protected ApplicationErrorInformationType applicationErrorInfo;
    protected FreeTextInformationType interactiveFreeText;

    /**
     * Gets the value of the applicationErrorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationType }
     *     
     */
    public ApplicationErrorInformationType getApplicationErrorInfo() {
        return applicationErrorInfo;
    }

    /**
     * Sets the value of the applicationErrorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationType }
     *     
     */
    public void setApplicationErrorInfo(ApplicationErrorInformationType value) {
        this.applicationErrorInfo = value;
    }

    /**
     * Gets the value of the interactiveFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType }
     *     
     */
    public FreeTextInformationType getInteractiveFreeText() {
        return interactiveFreeText;
    }

    /**
     * Sets the value of the interactiveFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType }
     *     
     */
    public void setInteractiveFreeText(FreeTextInformationType value) {
        this.interactiveFreeText = value;
    }

}
