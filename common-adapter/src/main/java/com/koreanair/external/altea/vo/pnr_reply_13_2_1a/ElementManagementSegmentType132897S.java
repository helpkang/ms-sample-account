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
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the PNR segments/elements references and action to apply
 * 
 * <p>Java class for ElementManagementSegmentType_132897S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementManagementSegmentType_132897S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="elementReference" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ReferencingDetailsType_127526C" minOccurs="0"/>
 *         &lt;element name="segmentName" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="lineNumber" type="{http://xml.amadeus.com/PNRACC_13_2_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementManagementSegmentType_132897S", propOrder = {
    "status",
    "elementReference",
    "segmentName",
    "lineNumber"
})
public class ElementManagementSegmentType132897S {

    protected String status;
    protected ReferencingDetailsType127526C elementReference;
    protected String segmentName;
    protected BigInteger lineNumber;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the elementReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsType127526C }
     *     
     */
    public ReferencingDetailsType127526C getElementReference() {
        return elementReference;
    }

    /**
     * Sets the value of the elementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsType127526C }
     *     
     */
    public void setElementReference(ReferencingDetailsType127526C value) {
        this.elementReference = value;
    }

    /**
     * Gets the value of the segmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentName() {
        return segmentName;
    }

    /**
     * Sets the value of the segmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentName(String value) {
        this.segmentName = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

}
