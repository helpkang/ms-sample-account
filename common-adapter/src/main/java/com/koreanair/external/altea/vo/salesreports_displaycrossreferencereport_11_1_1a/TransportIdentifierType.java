//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:11:03 ���� KST 
//


package com.koreanair.external.altea.vo.salesreports_displaycrossreferencereport_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the transport service(s) which is /are to be updated or cancelled
 * 
 * <p>Java class for TransportIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyIdentification" type="{http://xml.amadeus.com/TSRXRQ_11_1_1A}CompanyIdentificationTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportIdentifierType", propOrder = {
    "companyIdentification"
})
public class TransportIdentifierType {

    protected CompanyIdentificationTypeI companyIdentification;

    /**
     * Gets the value of the companyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public CompanyIdentificationTypeI getCompanyIdentification() {
        return companyIdentification;
    }

    /**
     * Sets the value of the companyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI }
     *     
     */
    public void setCompanyIdentification(CompanyIdentificationTypeI value) {
        this.companyIdentification = value;
    }

}
