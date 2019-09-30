//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 07:17:29 ���� KST 
//


package com.koreanair.external.altea.vo.ticket_processedocairportcontrolreply_12_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightDate" type="{http://xml.amadeus.com/TACRES_12_1_1A}ProductDateTimeTypeI_99921C" minOccurs="0"/>
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/TACRES_12_1_1A}LocationTypeI_99908C" minOccurs="0"/>
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/TACRES_12_1_1A}LocationTypeI_99908C" minOccurs="0"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/TACRES_12_1_1A}CompanyIdentificationTypeI_99918C" minOccurs="0"/>
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/TACRES_12_1_1A}ProductIdentificationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="flightTypeDetails" type="{http://xml.amadeus.com/TACRES_12_1_1A}ProductTypeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="itemNumber" type="{http://xml.amadeus.com/TACRES_12_1_1A}NumericInteger_Length1To6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationTypeI", propOrder = {
    "flightDate",
    "boardPointDetails",
    "offpointDetails",
    "companyDetails",
    "flightIdentification",
    "flightTypeDetails",
    "itemNumber"
})
public class TravelProductInformationTypeI {

    protected ProductDateTimeTypeI99921C flightDate;
    protected LocationTypeI99908C boardPointDetails;
    protected LocationTypeI99908C offpointDetails;
    protected CompanyIdentificationTypeI99918C companyDetails;
    protected ProductIdentificationDetailsTypeI flightIdentification;
    protected ProductTypeDetailsTypeI flightTypeDetails;
    protected BigInteger itemNumber;

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI99921C }
     *     
     */
    public ProductDateTimeTypeI99921C getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI99921C }
     *     
     */
    public void setFlightDate(ProductDateTimeTypeI99921C value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the boardPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI99908C }
     *     
     */
    public LocationTypeI99908C getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI99908C }
     *     
     */
    public void setBoardPointDetails(LocationTypeI99908C value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI99908C }
     *     
     */
    public LocationTypeI99908C getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI99908C }
     *     
     */
    public void setOffpointDetails(LocationTypeI99908C value) {
        this.offpointDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI99918C }
     *     
     */
    public CompanyIdentificationTypeI99918C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI99918C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI99918C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public ProductIdentificationDetailsTypeI getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsTypeI value) {
        this.flightIdentification = value;
    }

    /**
     * Gets the value of the flightTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public ProductTypeDetailsTypeI getFlightTypeDetails() {
        return flightTypeDetails;
    }

    /**
     * Sets the value of the flightTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public void setFlightTypeDetails(ProductTypeDetailsTypeI value) {
        this.flightTypeDetails = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemNumber(BigInteger value) {
        this.itemNumber = value;
    }

}
