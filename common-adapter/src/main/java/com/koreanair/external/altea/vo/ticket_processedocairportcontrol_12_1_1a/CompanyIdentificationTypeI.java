//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 07:17:09 ���� KST 
//


package com.koreanair.external.altea.vo.ticket_processedocairportcontrol_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Code or name to identify a company and any associated companies.
 * 
 * <p>Java class for CompanyIdentificationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentificationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketingCompany" type="{http://xml.amadeus.com/TACREQ_12_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="operatingCompany" type="{http://xml.amadeus.com/TACREQ_12_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="otherCompany" type="{http://xml.amadeus.com/TACREQ_12_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentificationTypeI", propOrder = {
    "marketingCompany",
    "operatingCompany",
    "otherCompany"
})
public class CompanyIdentificationTypeI {

    protected String marketingCompany;
    protected String operatingCompany;
    protected String otherCompany;

    /**
     * Gets the value of the marketingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCompany() {
        return marketingCompany;
    }

    /**
     * Sets the value of the marketingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCompany(String value) {
        this.marketingCompany = value;
    }

    /**
     * Gets the value of the operatingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * Sets the value of the operatingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCompany(String value) {
        this.operatingCompany = value;
    }

    /**
     * Gets the value of the otherCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCompany() {
        return otherCompany;
    }

    /**
     * Sets the value of the otherCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCompany(String value) {
        this.otherCompany = value;
    }

}
