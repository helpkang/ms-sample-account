//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.19 at 01:38:41 오후 KST 
//


package com.koreanair.common_external.pid.gps.approvalRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cybersourceAppInfo2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cybersourceAppInfo2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvedNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAuthReply_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAuthReply_authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAuthReply_authorizedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAuthReply_avsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAuthReply_avsCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAuthReply_cvCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAuthReply_cvCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAuthReply_processorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAuthReply_reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invalidField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_authenticationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_paresStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_eciRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_cavvAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_ucafAuthenticationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_ucafCollectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_eci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_specificationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerAuthValidateReply_directoryServerTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cybersourceAppInfo2", propOrder = {
    "approvedNo",
    "authenticationResult",
    "ccAuthReplyAmount",
    "ccAuthReplyAuthorizationCode",
    "ccAuthReplyAuthorizedDateTime",
    "ccAuthReplyAvsCode",
    "ccAuthReplyAvsCodeRaw",
    "ccAuthReplyCvCode",
    "ccAuthReplyCvCodeRaw",
    "ccAuthReplyProcessorResponse",
    "ccAuthReplyReasonCode",
    "decision",
    "invalidField",
    "payerAuthValidateReplyReasonCode",
    "reasonCode",
    "requestID",
    "requestToken",
    "transactionID",
    "payerAuthValidateReplyAuthenticationResult",
    "payerAuthValidateReplyParesStatus",
    "payerAuthValidateReplyXid",
    "payerAuthValidateReplyCommerceIndicator",
    "payerAuthValidateReplyEciRaw",
    "payerAuthValidateReplyCavv",
    "payerAuthValidateReplyCavvAlgorithm",
    "payerAuthValidateReplyUcafAuthenticationData",
    "payerAuthValidateReplyUcafCollectionIndicator",
    "payerAuthValidateReplyEci",
    "payerAuthValidateReplySpecificationVersion",
    "payerAuthValidateReplyDirectoryServerTransactionID"
})
public class CybersourceAppInfo2 {

    protected String approvedNo;
    protected String authenticationResult;
    @XmlElement(name = "ccAuthReply_amount")
    protected String ccAuthReplyAmount;
    @XmlElement(name = "ccAuthReply_authorizationCode")
    protected String ccAuthReplyAuthorizationCode;
    @XmlElement(name = "ccAuthReply_authorizedDateTime")
    protected String ccAuthReplyAuthorizedDateTime;
    @XmlElement(name = "ccAuthReply_avsCode")
    protected String ccAuthReplyAvsCode;
    @XmlElement(name = "ccAuthReply_avsCodeRaw")
    protected String ccAuthReplyAvsCodeRaw;
    @XmlElement(name = "ccAuthReply_cvCode")
    protected String ccAuthReplyCvCode;
    @XmlElement(name = "ccAuthReply_cvCodeRaw")
    protected String ccAuthReplyCvCodeRaw;
    @XmlElement(name = "ccAuthReply_processorResponse")
    protected String ccAuthReplyProcessorResponse;
    @XmlElement(name = "ccAuthReply_reasonCode")
    protected String ccAuthReplyReasonCode;
    protected String decision;
    protected String invalidField;
    @XmlElement(name = "payerAuthValidateReply_reasonCode")
    protected String payerAuthValidateReplyReasonCode;
    protected String reasonCode;
    protected String requestID;
    protected String requestToken;
    protected String transactionID;
    @XmlElement(name = "payerAuthValidateReply_authenticationResult")
    protected String payerAuthValidateReplyAuthenticationResult;
    @XmlElement(name = "payerAuthValidateReply_paresStatus")
    protected String payerAuthValidateReplyParesStatus;
    @XmlElement(name = "payerAuthValidateReply_xid")
    protected String payerAuthValidateReplyXid;
    @XmlElement(name = "payerAuthValidateReply_commerceIndicator")
    protected String payerAuthValidateReplyCommerceIndicator;
    @XmlElement(name = "payerAuthValidateReply_eciRaw")
    protected String payerAuthValidateReplyEciRaw;
    @XmlElement(name = "payerAuthValidateReply_cavv")
    protected String payerAuthValidateReplyCavv;
    @XmlElement(name = "payerAuthValidateReply_cavvAlgorithm")
    protected String payerAuthValidateReplyCavvAlgorithm;
    @XmlElement(name = "payerAuthValidateReply_ucafAuthenticationData")
    protected String payerAuthValidateReplyUcafAuthenticationData;
    @XmlElement(name = "payerAuthValidateReply_ucafCollectionIndicator")
    protected String payerAuthValidateReplyUcafCollectionIndicator;
    @XmlElement(name = "payerAuthValidateReply_eci")
    protected String payerAuthValidateReplyEci;
    @XmlElement(name = "payerAuthValidateReply_specificationVersion")
    protected String payerAuthValidateReplySpecificationVersion;
    @XmlElement(name = "payerAuthValidateReply_directoryServerTransactionID")
    protected String payerAuthValidateReplyDirectoryServerTransactionID;

    /**
     * Gets the value of the approvedNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedNo() {
        return approvedNo;
    }

    /**
     * Sets the value of the approvedNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedNo(String value) {
        this.approvedNo = value;
    }

    /**
     * Gets the value of the authenticationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * Sets the value of the authenticationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationResult(String value) {
        this.authenticationResult = value;
    }

    /**
     * Gets the value of the ccAuthReplyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAuthReplyAmount() {
        return ccAuthReplyAmount;
    }

    /**
     * Sets the value of the ccAuthReplyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAuthReplyAmount(String value) {
        this.ccAuthReplyAmount = value;
    }

    /**
     * Gets the value of the ccAuthReplyAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAuthReplyAuthorizationCode() {
        return ccAuthReplyAuthorizationCode;
    }

    /**
     * Sets the value of the ccAuthReplyAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAuthReplyAuthorizationCode(String value) {
        this.ccAuthReplyAuthorizationCode = value;
    }

    /**
     * Gets the value of the ccAuthReplyAuthorizedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAuthReplyAuthorizedDateTime() {
        return ccAuthReplyAuthorizedDateTime;
    }

    /**
     * Sets the value of the ccAuthReplyAuthorizedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAuthReplyAuthorizedDateTime(String value) {
        this.ccAuthReplyAuthorizedDateTime = value;
    }

    /**
     * Gets the value of the ccAuthReplyAvsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAuthReplyAvsCode() {
        return ccAuthReplyAvsCode;
    }

    /**
     * Sets the value of the ccAuthReplyAvsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAuthReplyAvsCode(String value) {
        this.ccAuthReplyAvsCode = value;
    }

    /**
     * Gets the value of the ccAuthReplyAvsCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAuthReplyAvsCodeRaw() {
        return ccAuthReplyAvsCodeRaw;
    }

    /**
     * Sets the value of the ccAuthReplyAvsCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAuthReplyAvsCodeRaw(String value) {
        this.ccAuthReplyAvsCodeRaw = value;
    }

    /**
     * Gets the value of the ccAuthReplyCvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAuthReplyCvCode() {
        return ccAuthReplyCvCode;
    }

    /**
     * Sets the value of the ccAuthReplyCvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAuthReplyCvCode(String value) {
        this.ccAuthReplyCvCode = value;
    }

    /**
     * Gets the value of the ccAuthReplyCvCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAuthReplyCvCodeRaw() {
        return ccAuthReplyCvCodeRaw;
    }

    /**
     * Sets the value of the ccAuthReplyCvCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAuthReplyCvCodeRaw(String value) {
        this.ccAuthReplyCvCodeRaw = value;
    }

    /**
     * Gets the value of the ccAuthReplyProcessorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAuthReplyProcessorResponse() {
        return ccAuthReplyProcessorResponse;
    }

    /**
     * Sets the value of the ccAuthReplyProcessorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAuthReplyProcessorResponse(String value) {
        this.ccAuthReplyProcessorResponse = value;
    }

    /**
     * Gets the value of the ccAuthReplyReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAuthReplyReasonCode() {
        return ccAuthReplyReasonCode;
    }

    /**
     * Sets the value of the ccAuthReplyReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAuthReplyReasonCode(String value) {
        this.ccAuthReplyReasonCode = value;
    }

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecision(String value) {
        this.decision = value;
    }

    /**
     * Gets the value of the invalidField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalidField() {
        return invalidField;
    }

    /**
     * Sets the value of the invalidField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalidField(String value) {
        this.invalidField = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplyReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplyReasonCode() {
        return payerAuthValidateReplyReasonCode;
    }

    /**
     * Sets the value of the payerAuthValidateReplyReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplyReasonCode(String value) {
        this.payerAuthValidateReplyReasonCode = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the requestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestToken() {
        return requestToken;
    }

    /**
     * Sets the value of the requestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestToken(String value) {
        this.requestToken = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplyAuthenticationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplyAuthenticationResult() {
        return payerAuthValidateReplyAuthenticationResult;
    }

    /**
     * Sets the value of the payerAuthValidateReplyAuthenticationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplyAuthenticationResult(String value) {
        this.payerAuthValidateReplyAuthenticationResult = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplyParesStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplyParesStatus() {
        return payerAuthValidateReplyParesStatus;
    }

    /**
     * Sets the value of the payerAuthValidateReplyParesStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplyParesStatus(String value) {
        this.payerAuthValidateReplyParesStatus = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplyXid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplyXid() {
        return payerAuthValidateReplyXid;
    }

    /**
     * Sets the value of the payerAuthValidateReplyXid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplyXid(String value) {
        this.payerAuthValidateReplyXid = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplyCommerceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplyCommerceIndicator() {
        return payerAuthValidateReplyCommerceIndicator;
    }

    /**
     * Sets the value of the payerAuthValidateReplyCommerceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplyCommerceIndicator(String value) {
        this.payerAuthValidateReplyCommerceIndicator = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplyEciRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplyEciRaw() {
        return payerAuthValidateReplyEciRaw;
    }

    /**
     * Sets the value of the payerAuthValidateReplyEciRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplyEciRaw(String value) {
        this.payerAuthValidateReplyEciRaw = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplyCavv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplyCavv() {
        return payerAuthValidateReplyCavv;
    }

    /**
     * Sets the value of the payerAuthValidateReplyCavv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplyCavv(String value) {
        this.payerAuthValidateReplyCavv = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplyCavvAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplyCavvAlgorithm() {
        return payerAuthValidateReplyCavvAlgorithm;
    }

    /**
     * Sets the value of the payerAuthValidateReplyCavvAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplyCavvAlgorithm(String value) {
        this.payerAuthValidateReplyCavvAlgorithm = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplyUcafAuthenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplyUcafAuthenticationData() {
        return payerAuthValidateReplyUcafAuthenticationData;
    }

    /**
     * Sets the value of the payerAuthValidateReplyUcafAuthenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplyUcafAuthenticationData(String value) {
        this.payerAuthValidateReplyUcafAuthenticationData = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplyUcafCollectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplyUcafCollectionIndicator() {
        return payerAuthValidateReplyUcafCollectionIndicator;
    }

    /**
     * Sets the value of the payerAuthValidateReplyUcafCollectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplyUcafCollectionIndicator(String value) {
        this.payerAuthValidateReplyUcafCollectionIndicator = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplyEci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplyEci() {
        return payerAuthValidateReplyEci;
    }

    /**
     * Sets the value of the payerAuthValidateReplyEci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplyEci(String value) {
        this.payerAuthValidateReplyEci = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplySpecificationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplySpecificationVersion() {
        return payerAuthValidateReplySpecificationVersion;
    }

    /**
     * Sets the value of the payerAuthValidateReplySpecificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplySpecificationVersion(String value) {
        this.payerAuthValidateReplySpecificationVersion = value;
    }

    /**
     * Gets the value of the payerAuthValidateReplyDirectoryServerTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthValidateReplyDirectoryServerTransactionID() {
        return payerAuthValidateReplyDirectoryServerTransactionID;
    }

    /**
     * Sets the value of the payerAuthValidateReplyDirectoryServerTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthValidateReplyDirectoryServerTransactionID(String value) {
        this.payerAuthValidateReplyDirectoryServerTransactionID = value;
    }

}