//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:15:49 ���� KST 
//


package com.koreanair.external.altea.vo.salesreports_displaytransactionreportreply_11_1_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the form of payment type, amounts, approval codes, and other related information.
 * 
 * <p>Java class for FormOfPaymentDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://xml.amadeus.com/TSRTRR_11_1_1A}AlphaNumericString_Length1To10"/>
 *         &lt;element name="indicator" type="{http://xml.amadeus.com/TSRTRR_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://xml.amadeus.com/TSRTRR_11_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="vendorCode" type="{http://xml.amadeus.com/TSRTRR_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="creditCardNumber" type="{http://xml.amadeus.com/TSRTRR_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://xml.amadeus.com/TSRTRR_11_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="approvalCode" type="{http://xml.amadeus.com/TSRTRR_11_1_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="sourceOfApproval" type="{http://xml.amadeus.com/TSRTRR_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentDetailsTypeI", propOrder = {
    "type",
    "indicator",
    "amount",
    "vendorCode",
    "creditCardNumber",
    "expiryDate",
    "approvalCode",
    "sourceOfApproval"
})
public class FormOfPaymentDetailsTypeI {

    @XmlElement(required = true)
    protected String type;
    protected String indicator;
    protected BigDecimal amount;
    protected String vendorCode;
    protected String creditCardNumber;
    protected String expiryDate;
    protected String approvalCode;
    protected String sourceOfApproval;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the approvalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Sets the value of the approvalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
    }

    /**
     * Gets the value of the sourceOfApproval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfApproval() {
        return sourceOfApproval;
    }

    /**
     * Sets the value of the sourceOfApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfApproval(String value) {
        this.sourceOfApproval = value;
    }

}
