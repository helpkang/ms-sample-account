
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ADDRESS_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CREDIT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GOVERNMENT_PAYMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECL_ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENT_TYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_TICKETLESS_TRAVEL_REFERENCE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="COMPANY"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;length value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACCOUNT_PAYMENT_REFERENCE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ACCOUNT_NUMBER" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;length value="6"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VOUCHER_NUMBER" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;length value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="COMMISSION_RATE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;length value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACCOUNT_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DBI_CREDIT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EXTERNAL_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="DETAILS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_SPECIAL_PROGRAM" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="SPECIAL_PROGRAM_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="DELIVERY_TYPE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DP_TRANSACTION_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BANK_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="VOUCHER_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BILLING_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYLATER_PLAN_OPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PARAMETER" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KEY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "type",
    "addressid",
    "creditcardid",
    "governmentpaymentid",
    "eclaccountnumber",
    "paymenttype",
    "listticketlesstravelreference",
    "accountpaymentreference",
    "accountreference",
    "dbicreditcardid",
    "externalinformation",
    "listspecialprogram",
    "dptransactionreference",
    "bankaccountid",
    "voucheraccountid",
    "checkid",
    "billingaccount",
    "paylaterplanoption",
    "listparameter"
})
@XmlRootElement(name = "LIST_PAYMENT_INFORMATION")
public class LISTPAYMENTINFORMATION
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "ADDRESS_ID")
    protected String addressid;
    @XmlElement(name = "CREDIT_CARD_ID")
    protected String creditcardid;
    @XmlElement(name = "GOVERNMENT_PAYMENT_ID")
    protected String governmentpaymentid;
    @XmlElement(name = "ECL_ACCOUNT_NUMBER")
    protected String eclaccountnumber;
    @XmlElement(name = "PAYMENT_TYPE")
    protected LISTPAYMENTINFORMATION.PAYMENTTYPE paymenttype;
    @XmlElement(name = "LIST_TICKETLESS_TRAVEL_REFERENCE")
    protected List<LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE> listticketlesstravelreference;
    @XmlElement(name = "ACCOUNT_PAYMENT_REFERENCE")
    protected LISTPAYMENTINFORMATION.ACCOUNTPAYMENTREFERENCE accountpaymentreference;
    @XmlElement(name = "ACCOUNT_REFERENCE")
    protected String accountreference;
    @XmlElement(name = "DBI_CREDIT_CARD_ID")
    protected Object dbicreditcardid;
    @XmlElement(name = "EXTERNAL_INFORMATION")
    protected LISTPAYMENTINFORMATION.EXTERNALINFORMATION externalinformation;
    @XmlElement(name = "LIST_SPECIAL_PROGRAM")
    protected List<LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM> listspecialprogram;
    @XmlElement(name = "DP_TRANSACTION_REFERENCE")
    protected String dptransactionreference;
    @XmlElement(name = "BANK_ACCOUNT_ID")
    protected Object bankaccountid;
    @XmlElement(name = "VOUCHER_ACCOUNT_ID")
    protected Object voucheraccountid;
    @XmlElement(name = "CHECK_ID")
    protected Object checkid;
    @XmlElement(name = "BILLING_ACCOUNT")
    protected String billingaccount;
    @XmlElement(name = "PAYLATER_PLAN_OPTION")
    protected String paylaterplanoption;
    @XmlElement(name = "LIST_PARAMETER")
    protected List<LISTPAYMENTINFORMATION.LISTPARAMETER> listparameter;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
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
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the addressid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESSID() {
        return addressid;
    }

    /**
     * Sets the value of the addressid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESSID(String value) {
        this.addressid = value;
    }

    /**
     * Gets the value of the creditcardid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITCARDID() {
        return creditcardid;
    }

    /**
     * Sets the value of the creditcardid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITCARDID(String value) {
        this.creditcardid = value;
    }

    /**
     * Gets the value of the governmentpaymentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGOVERNMENTPAYMENTID() {
        return governmentpaymentid;
    }

    /**
     * Sets the value of the governmentpaymentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGOVERNMENTPAYMENTID(String value) {
        this.governmentpaymentid = value;
    }

    /**
     * Gets the value of the eclaccountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECLACCOUNTNUMBER() {
        return eclaccountnumber;
    }

    /**
     * Sets the value of the eclaccountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECLACCOUNTNUMBER(String value) {
        this.eclaccountnumber = value;
    }

    /**
     * Gets the value of the paymenttype property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPAYMENTINFORMATION.PAYMENTTYPE }
     *     
     */
    public LISTPAYMENTINFORMATION.PAYMENTTYPE getPAYMENTTYPE() {
        return paymenttype;
    }

    /**
     * Sets the value of the paymenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPAYMENTINFORMATION.PAYMENTTYPE }
     *     
     */
    public void setPAYMENTTYPE(LISTPAYMENTINFORMATION.PAYMENTTYPE value) {
        this.paymenttype = value;
    }

    /**
     * Gets the value of the listticketlesstravelreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listticketlesstravelreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTICKETLESSTRAVELREFERENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE }
     * 
     * 
     */
    public List<LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE> getLISTTICKETLESSTRAVELREFERENCE() {
        if (listticketlesstravelreference == null) {
            listticketlesstravelreference = new ArrayList<LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE>();
        }
        return this.listticketlesstravelreference;
    }

    /**
     * Gets the value of the accountpaymentreference property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPAYMENTINFORMATION.ACCOUNTPAYMENTREFERENCE }
     *     
     */
    public LISTPAYMENTINFORMATION.ACCOUNTPAYMENTREFERENCE getACCOUNTPAYMENTREFERENCE() {
        return accountpaymentreference;
    }

    /**
     * Sets the value of the accountpaymentreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPAYMENTINFORMATION.ACCOUNTPAYMENTREFERENCE }
     *     
     */
    public void setACCOUNTPAYMENTREFERENCE(LISTPAYMENTINFORMATION.ACCOUNTPAYMENTREFERENCE value) {
        this.accountpaymentreference = value;
    }

    /**
     * Gets the value of the accountreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTREFERENCE() {
        return accountreference;
    }

    /**
     * Sets the value of the accountreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTREFERENCE(String value) {
        this.accountreference = value;
    }

    /**
     * Gets the value of the dbicreditcardid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDBICREDITCARDID() {
        return dbicreditcardid;
    }

    /**
     * Sets the value of the dbicreditcardid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDBICREDITCARDID(Object value) {
        this.dbicreditcardid = value;
    }

    /**
     * Gets the value of the externalinformation property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPAYMENTINFORMATION.EXTERNALINFORMATION }
     *     
     */
    public LISTPAYMENTINFORMATION.EXTERNALINFORMATION getEXTERNALINFORMATION() {
        return externalinformation;
    }

    /**
     * Sets the value of the externalinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPAYMENTINFORMATION.EXTERNALINFORMATION }
     *     
     */
    public void setEXTERNALINFORMATION(LISTPAYMENTINFORMATION.EXTERNALINFORMATION value) {
        this.externalinformation = value;
    }

    /**
     * Gets the value of the listspecialprogram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listspecialprogram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSPECIALPROGRAM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM }
     * 
     * 
     */
    public List<LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM> getLISTSPECIALPROGRAM() {
        if (listspecialprogram == null) {
            listspecialprogram = new ArrayList<LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM>();
        }
        return this.listspecialprogram;
    }

    /**
     * Gets the value of the dptransactionreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPTRANSACTIONREFERENCE() {
        return dptransactionreference;
    }

    /**
     * Sets the value of the dptransactionreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPTRANSACTIONREFERENCE(String value) {
        this.dptransactionreference = value;
    }

    /**
     * Gets the value of the bankaccountid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBANKACCOUNTID() {
        return bankaccountid;
    }

    /**
     * Sets the value of the bankaccountid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBANKACCOUNTID(Object value) {
        this.bankaccountid = value;
    }

    /**
     * Gets the value of the voucheraccountid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVOUCHERACCOUNTID() {
        return voucheraccountid;
    }

    /**
     * Sets the value of the voucheraccountid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVOUCHERACCOUNTID(Object value) {
        this.voucheraccountid = value;
    }

    /**
     * Gets the value of the checkid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCHECKID() {
        return checkid;
    }

    /**
     * Sets the value of the checkid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCHECKID(Object value) {
        this.checkid = value;
    }

    /**
     * Gets the value of the billingaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLINGACCOUNT() {
        return billingaccount;
    }

    /**
     * Sets the value of the billingaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLINGACCOUNT(String value) {
        this.billingaccount = value;
    }

    /**
     * Gets the value of the paylaterplanoption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYLATERPLANOPTION() {
        return paylaterplanoption;
    }

    /**
     * Sets the value of the paylaterplanoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYLATERPLANOPTION(String value) {
        this.paylaterplanoption = value;
    }

    /**
     * Gets the value of the listparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPAYMENTINFORMATION.LISTPARAMETER }
     * 
     * 
     */
    public List<LISTPAYMENTINFORMATION.LISTPARAMETER> getLISTPARAMETER() {
        if (listparameter == null) {
            listparameter = new ArrayList<LISTPAYMENTINFORMATION.LISTPARAMETER>();
        }
        return this.listparameter;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="ACCOUNT_NUMBER" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;length value="6"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="VOUCHER_NUMBER" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;length value="10"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="COMMISSION_RATE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;length value="4"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ACCOUNTPAYMENTREFERENCE
        implements Serializable
    {

        @XmlElement(name = "ACCOUNT_NUMBER")
        protected String accountnumber;
        @XmlElement(name = "VOUCHER_NUMBER")
        protected String vouchernumber;
        @XmlElement(name = "COMMISSION_RATE")
        protected String commissionrate;

        /**
         * Gets the value of the accountnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNTNUMBER() {
            return accountnumber;
        }

        /**
         * Sets the value of the accountnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNTNUMBER(String value) {
            this.accountnumber = value;
        }

        /**
         * Gets the value of the vouchernumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVOUCHERNUMBER() {
            return vouchernumber;
        }

        /**
         * Sets the value of the vouchernumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVOUCHERNUMBER(String value) {
            this.vouchernumber = value;
        }

        /**
         * Gets the value of the commissionrate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMMISSIONRATE() {
            return commissionrate;
        }

        /**
         * Sets the value of the commissionrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMMISSIONRATE(String value) {
            this.commissionrate = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="DETAILS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class EXTERNALINFORMATION
        implements Serializable
    {

        @XmlElement(name = "LABEL", required = true)
        protected Object label;
        @XmlElement(name = "DETAILS")
        protected Object details;

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLABEL() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLABEL(Object value) {
            this.label = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDETAILS() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDETAILS(Object value) {
            this.details = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="KEY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class LISTPARAMETER
        implements Serializable
    {

        @XmlElement(name = "KEY", required = true)
        protected Object key;
        @XmlElement(name = "VALUE", required = true)
        protected Object value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getKEY() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setKEY(Object value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setVALUE(Object value) {
            this.value = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="SPECIAL_PROGRAM_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="DELIVERY_TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class LISTSPECIALPROGRAM
        implements Serializable
    {

        @XmlElement(name = "SPECIAL_PROGRAM_CODE")
        protected Object specialprogramcode;
        @XmlElement(name = "DELIVERY_TYPE")
        protected LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE deliverytype;

        /**
         * Gets the value of the specialprogramcode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSPECIALPROGRAMCODE() {
            return specialprogramcode;
        }

        /**
         * Sets the value of the specialprogramcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSPECIALPROGRAMCODE(Object value) {
            this.specialprogramcode = value;
        }

        /**
         * Gets the value of the deliverytype property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE }
         *     
         */
        public LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE getDELIVERYTYPE() {
            return deliverytype;
        }

        /**
         * Sets the value of the deliverytype property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE }
         *     
         */
        public void setDELIVERYTYPE(LISTPAYMENTINFORMATION.LISTSPECIALPROGRAM.DELIVERYTYPE value) {
            this.deliverytype = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class DELIVERYTYPE
            implements Serializable
        {

            @XmlElement(name = "CODE")
            protected Object code;
            @XmlElement(name = "NAME")
            protected Object name;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCODE(Object value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setNAME(Object value) {
                this.name = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="COMPANY"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;length value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class LISTTICKETLESSTRAVELREFERENCE
        implements Serializable
    {

        @XmlElement(name = "COMPANY_ACCOUNT_ID", required = true)
        protected BigInteger companyaccountid;
        @XmlElement(name = "ACCOUNT_NUMBER", required = true)
        protected String accountnumber;
        @XmlElement(name = "COMPANY", required = true)
        protected LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE.COMPANY company;

        /**
         * Gets the value of the companyaccountid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCOMPANYACCOUNTID() {
            return companyaccountid;
        }

        /**
         * Sets the value of the companyaccountid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCOMPANYACCOUNTID(BigInteger value) {
            this.companyaccountid = value;
        }

        /**
         * Gets the value of the accountnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNTNUMBER() {
            return accountnumber;
        }

        /**
         * Sets the value of the accountnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNTNUMBER(String value) {
            this.accountnumber = value;
        }

        /**
         * Gets the value of the company property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE.COMPANY }
         *     
         */
        public LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE.COMPANY getCOMPANY() {
            return company;
        }

        /**
         * Sets the value of the company property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE.COMPANY }
         *     
         */
        public void setCOMPANY(LISTPAYMENTINFORMATION.LISTTICKETLESSTRAVELREFERENCE.COMPANY value) {
            this.company = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="CODE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;length value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="40"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class COMPANY
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "NAME")
            protected String name;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODE(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class PAYMENTTYPE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected Object code;
        @XmlElement(name = "NAME")
        protected String name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCODE(Object value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

    }

}
