//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.external.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the company information
 * 
 * <p>Java class for CompanyInformationType_129761S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyInformationType_129761S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyCode" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="companyLongName" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="profileReference" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyInformationType_129761S", propOrder = {
    "companyCode",
    "companyName",
    "companyLongName",
    "profileReference"
})
public class CompanyInformationType129761S {

    protected String companyCode;
    protected String companyName;
    protected String companyLongName;
    protected String profileReference;

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyLongName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyLongName() {
        return companyLongName;
    }

    /**
     * Sets the value of the companyLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyLongName(String value) {
        this.companyLongName = value;
    }

    /**
     * Gets the value of the profileReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileReference() {
        return profileReference;
    }

    /**
     * Sets the value of the profileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileReference(String value) {
        this.profileReference = value;
    }

}
