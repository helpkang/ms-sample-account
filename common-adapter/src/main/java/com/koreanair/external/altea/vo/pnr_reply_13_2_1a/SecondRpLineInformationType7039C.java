//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.external.altea.vo.pnr_reply_13_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondRpLineInformationType_7039C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondRpLineInformationType_7039C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creationOfficeId" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To9"/>
 *         &lt;element name="agentSignature" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://xml.amadeus.com/PNRACC_13_2_1A}NumericInteger_Length6To6"/>
 *         &lt;element name="creatorIataCode" type="{http://xml.amadeus.com/PNRACC_13_2_1A}NumericInteger_Length1To9" minOccurs="0"/>
 *         &lt;element name="creationTime" type="{http://xml.amadeus.com/PNRACC_13_2_1A}Time24_HHMM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondRpLineInformationType_7039C", propOrder = {
    "creationOfficeId",
    "agentSignature",
    "creationDate",
    "creatorIataCode",
    "creationTime"
})
public class SecondRpLineInformationType7039C {

    @XmlElement(required = true)
    protected String creationOfficeId;
    protected String agentSignature;
    @XmlElement(required = true)
    protected BigInteger creationDate;
    protected BigInteger creatorIataCode;
    protected String creationTime;

    /**
     * Gets the value of the creationOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationOfficeId() {
        return creationOfficeId;
    }

    /**
     * Sets the value of the creationOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationOfficeId(String value) {
        this.creationOfficeId = value;
    }

    /**
     * Gets the value of the agentSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSignature() {
        return agentSignature;
    }

    /**
     * Sets the value of the agentSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentSignature(String value) {
        this.agentSignature = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreationDate(BigInteger value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the creatorIataCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreatorIataCode() {
        return creatorIataCode;
    }

    /**
     * Sets the value of the creatorIataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreatorIataCode(BigInteger value) {
        this.creatorIataCode = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTime(String value) {
        this.creationTime = value;
    }

}
