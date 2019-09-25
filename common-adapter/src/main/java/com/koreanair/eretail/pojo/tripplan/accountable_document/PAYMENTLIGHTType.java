
package com.koreanair.eretail.pojo.tripplan.accountable_document;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.profile.commonprofileout.BANKACCOUNTINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.CREDITCARDINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.GOVERNMENTPAYMENTINFORMATIONTYPE;
import com.koreanair.eretail.pojo.profile.commonprofileout.VOUCHERACCOUNTINFORMATIONTYPE;
import com.koreanair.eretail.pojo.tripplan.payment_group.AMOPINFORMATIONType;
import com.koreanair.eretail.pojo.tripplan.payment_group.ASYNCHRONOUSINFORMATIONType;
import com.koreanair.eretail.pojo.tripplan.payment_group.CERTIFICATEINFORMATIONType;
import com.koreanair.eretail.pojo.tripplan.payment_group.CERTIFICATESEARCHINFORMATIONType;
import com.koreanair.eretail.pojo.tripplan.payment_group.CHECKINFORMATIONType;
import com.koreanair.eretail.pojo.tripplan.payment_group.DIRECTDEBITINFORMATIONType;
import com.koreanair.eretail.pojo.tripplan.payment_group.GIFTCARDINFORMATIONType;
import com.koreanair.eretail.pojo.tripplan.payment_group.LOYALTYINFORMATIONType;
import com.koreanair.eretail.pojo.tripplan.payment_group.NONREVENUEPASSSEARCHINFORMATIONType;
import com.koreanair.eretail.pojo.tripplan.payment_group.PASSINFORMATIONType;
import com.koreanair.eretail.pojo.tripplan.payment_group.PAYMENTTYPEType;
import com.koreanair.eretail.pojo.tripplan.payment_group.PAYPALINFORMATIONType;
import com.koreanair.eretail.pojo.tripplan.payment_group.TRAVELFUNDSINFORMATIONType;
import com.koreanair.eretail.pojo.tripplan.payment_group.TRAVELFUNDSSEARCHINFORMATIONType;


/**
 * This is basically a subset of "PAYMENT_Type" defined in "PAYMENT_GROUP.xsd".
 * 
 * <p>Java class for PAYMENT_LIGHT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYMENT_LIGHT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PAYMENT_TYPE" type="{}PAYMENT_TYPE_Type"/&gt;
 *         &lt;element name="FORM_OF_PAYMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="BASIC_FORM_OF_PAYMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="CREDIT_CARD_INFORMATION" type="{}CREDIT_CARD_INFORMATION_TYPE" minOccurs="0"/&gt;
 *           &lt;element name="PAYPAL_INFORMATION" type="{}PAYPAL_INFORMATION_Type" minOccurs="0"/&gt;
 *           &lt;element name="BANK_ACCOUNT_INFORMATION" type="{}BANK_ACCOUNT_INFORMATION_TYPE" minOccurs="0"/&gt;
 *           &lt;element name="ASYNCHRONOUS_INFORMATION" type="{}ASYNCHRONOUS_INFORMATIONType" minOccurs="0"/&gt;
 *           &lt;element name="GOVERNMENT_PAYMENT_INFORMATION" type="{}GOVERNMENT_PAYMENT_INFORMATION_TYPE" minOccurs="0"/&gt;
 *           &lt;element name="VOUCHER_ACCOUNT_INFORMATION" type="{}VOUCHER_ACCOUNT_INFORMATION_TYPE" minOccurs="0"/&gt;
 *           &lt;element name="LOYALTY_INFORMATION" type="{}LOYALTY_INFORMATION_Type" minOccurs="0"/&gt;
 *           &lt;element name="CHECK_INFORMATION" type="{}CHECK_INFORMATION_Type" minOccurs="0"/&gt;
 *           &lt;element name="DIRECT_DEBIT_INFORMATION" type="{}DIRECT_DEBIT_INFORMATION_Type" minOccurs="0"/&gt;
 *           &lt;element name="GIFTCARD_INFORMATION" type="{}GIFTCARD_INFORMATIONType" minOccurs="0"/&gt;
 *           &lt;element name="TRAVEL_FUNDS_SEARCH_INFORMATION" type="{}TRAVEL_FUNDS_SEARCH_INFORMATIONType" minOccurs="0"/&gt;
 *           &lt;element name="TRAVEL_FUNDS_INFORMATION" type="{}TRAVEL_FUNDS_INFORMATIONType" minOccurs="0"/&gt;
 *           &lt;element name="CERTIFICATE_SEARCH_INFORMATION" type="{}CERTIFICATE_SEARCH_INFORMATIONType" minOccurs="0"/&gt;
 *           &lt;element name="CERTIFICATE_INFORMATION" type="{}CERTIFICATE_INFORMATIONType" minOccurs="0"/&gt;
 *           &lt;element name="NON_REVENUE_PASS_SEARCH_INFORMATION" type="{}NON_REVENUE_PASS_SEARCH_INFORMATIONType" minOccurs="0"/&gt;
 *           &lt;element name="PASS_INFORMATION" type="{}PASS_INFORMATIONType" minOccurs="0"/&gt;
 *           &lt;element name="AMOP_INFORMATION" type="{}AMOP_INFORMATION_Type" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAYMENT_LIGHT_Type", propOrder = {
    "paymenttype",
    "formofpaymentid",
    "basicformofpayment",
    "creditcardinformation",
    "paypalinformation",
    "bankaccountinformation",
    "asynchronousinformation",
    "governmentpaymentinformation",
    "voucheraccountinformation",
    "loyaltyinformation",
    "checkinformation",
    "directdebitinformation",
    "giftcardinformation",
    "travelfundssearchinformation",
    "travelfundsinformation",
    "certificatesearchinformation",
    "certificateinformation",
    "nonrevenuepasssearchinformation",
    "passinformation",
    "amopinformation"
})
public class PAYMENTLIGHTType
    implements Serializable
{

    @XmlElement(name = "PAYMENT_TYPE", required = true)
    protected PAYMENTTYPEType paymenttype;
    @XmlElement(name = "FORM_OF_PAYMENT_ID")
    protected BigInteger formofpaymentid;
    @XmlElement(name = "BASIC_FORM_OF_PAYMENT")
    protected String basicformofpayment;
    @XmlElement(name = "CREDIT_CARD_INFORMATION")
    protected CREDITCARDINFORMATIONTYPE creditcardinformation;
    @XmlElement(name = "PAYPAL_INFORMATION")
    protected PAYPALINFORMATIONType paypalinformation;
    @XmlElement(name = "BANK_ACCOUNT_INFORMATION")
    protected BANKACCOUNTINFORMATIONTYPE bankaccountinformation;
    @XmlElement(name = "ASYNCHRONOUS_INFORMATION")
    protected ASYNCHRONOUSINFORMATIONType asynchronousinformation;
    @XmlElement(name = "GOVERNMENT_PAYMENT_INFORMATION")
    protected GOVERNMENTPAYMENTINFORMATIONTYPE governmentpaymentinformation;
    @XmlElement(name = "VOUCHER_ACCOUNT_INFORMATION")
    protected VOUCHERACCOUNTINFORMATIONTYPE voucheraccountinformation;
    @XmlElement(name = "LOYALTY_INFORMATION")
    protected LOYALTYINFORMATIONType loyaltyinformation;
    @XmlElement(name = "CHECK_INFORMATION")
    protected CHECKINFORMATIONType checkinformation;
    @XmlElement(name = "DIRECT_DEBIT_INFORMATION")
    protected DIRECTDEBITINFORMATIONType directdebitinformation;
    @XmlElement(name = "GIFTCARD_INFORMATION")
    protected GIFTCARDINFORMATIONType giftcardinformation;
    @XmlElement(name = "TRAVEL_FUNDS_SEARCH_INFORMATION")
    protected TRAVELFUNDSSEARCHINFORMATIONType travelfundssearchinformation;
    @XmlElement(name = "TRAVEL_FUNDS_INFORMATION")
    protected TRAVELFUNDSINFORMATIONType travelfundsinformation;
    @XmlElement(name = "CERTIFICATE_SEARCH_INFORMATION")
    protected CERTIFICATESEARCHINFORMATIONType certificatesearchinformation;
    @XmlElement(name = "CERTIFICATE_INFORMATION")
    protected CERTIFICATEINFORMATIONType certificateinformation;
    @XmlElement(name = "NON_REVENUE_PASS_SEARCH_INFORMATION")
    protected NONREVENUEPASSSEARCHINFORMATIONType nonrevenuepasssearchinformation;
    @XmlElement(name = "PASS_INFORMATION")
    protected PASSINFORMATIONType passinformation;
    @XmlElement(name = "AMOP_INFORMATION")
    protected AMOPINFORMATIONType amopinformation;

    /**
     * Gets the value of the paymenttype property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTTYPEType }
     *     
     */
    public PAYMENTTYPEType getPAYMENTTYPE() {
        return paymenttype;
    }

    /**
     * Sets the value of the paymenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTTYPEType }
     *     
     */
    public void setPAYMENTTYPE(PAYMENTTYPEType value) {
        this.paymenttype = value;
    }

    /**
     * Gets the value of the formofpaymentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFORMOFPAYMENTID() {
        return formofpaymentid;
    }

    /**
     * Sets the value of the formofpaymentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFORMOFPAYMENTID(BigInteger value) {
        this.formofpaymentid = value;
    }

    /**
     * Gets the value of the basicformofpayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASICFORMOFPAYMENT() {
        return basicformofpayment;
    }

    /**
     * Sets the value of the basicformofpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASICFORMOFPAYMENT(String value) {
        this.basicformofpayment = value;
    }

    /**
     * Gets the value of the creditcardinformation property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITCARDINFORMATIONTYPE }
     *     
     */
    public CREDITCARDINFORMATIONTYPE getCREDITCARDINFORMATION() {
        return creditcardinformation;
    }

    /**
     * Sets the value of the creditcardinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITCARDINFORMATIONTYPE }
     *     
     */
    public void setCREDITCARDINFORMATION(CREDITCARDINFORMATIONTYPE value) {
        this.creditcardinformation = value;
    }

    /**
     * Gets the value of the paypalinformation property.
     * 
     * @return
     *     possible object is
     *     {@link PAYPALINFORMATIONType }
     *     
     */
    public PAYPALINFORMATIONType getPAYPALINFORMATION() {
        return paypalinformation;
    }

    /**
     * Sets the value of the paypalinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYPALINFORMATIONType }
     *     
     */
    public void setPAYPALINFORMATION(PAYPALINFORMATIONType value) {
        this.paypalinformation = value;
    }

    /**
     * Gets the value of the bankaccountinformation property.
     * 
     * @return
     *     possible object is
     *     {@link BANKACCOUNTINFORMATIONTYPE }
     *     
     */
    public BANKACCOUNTINFORMATIONTYPE getBANKACCOUNTINFORMATION() {
        return bankaccountinformation;
    }

    /**
     * Sets the value of the bankaccountinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BANKACCOUNTINFORMATIONTYPE }
     *     
     */
    public void setBANKACCOUNTINFORMATION(BANKACCOUNTINFORMATIONTYPE value) {
        this.bankaccountinformation = value;
    }

    /**
     * Gets the value of the asynchronousinformation property.
     * 
     * @return
     *     possible object is
     *     {@link ASYNCHRONOUSINFORMATIONType }
     *     
     */
    public ASYNCHRONOUSINFORMATIONType getASYNCHRONOUSINFORMATION() {
        return asynchronousinformation;
    }

    /**
     * Sets the value of the asynchronousinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASYNCHRONOUSINFORMATIONType }
     *     
     */
    public void setASYNCHRONOUSINFORMATION(ASYNCHRONOUSINFORMATIONType value) {
        this.asynchronousinformation = value;
    }

    /**
     * Gets the value of the governmentpaymentinformation property.
     * 
     * @return
     *     possible object is
     *     {@link GOVERNMENTPAYMENTINFORMATIONTYPE }
     *     
     */
    public GOVERNMENTPAYMENTINFORMATIONTYPE getGOVERNMENTPAYMENTINFORMATION() {
        return governmentpaymentinformation;
    }

    /**
     * Sets the value of the governmentpaymentinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOVERNMENTPAYMENTINFORMATIONTYPE }
     *     
     */
    public void setGOVERNMENTPAYMENTINFORMATION(GOVERNMENTPAYMENTINFORMATIONTYPE value) {
        this.governmentpaymentinformation = value;
    }

    /**
     * Gets the value of the voucheraccountinformation property.
     * 
     * @return
     *     possible object is
     *     {@link VOUCHERACCOUNTINFORMATIONTYPE }
     *     
     */
    public VOUCHERACCOUNTINFORMATIONTYPE getVOUCHERACCOUNTINFORMATION() {
        return voucheraccountinformation;
    }

    /**
     * Sets the value of the voucheraccountinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOUCHERACCOUNTINFORMATIONTYPE }
     *     
     */
    public void setVOUCHERACCOUNTINFORMATION(VOUCHERACCOUNTINFORMATIONTYPE value) {
        this.voucheraccountinformation = value;
    }

    /**
     * Gets the value of the loyaltyinformation property.
     * 
     * @return
     *     possible object is
     *     {@link LOYALTYINFORMATIONType }
     *     
     */
    public LOYALTYINFORMATIONType getLOYALTYINFORMATION() {
        return loyaltyinformation;
    }

    /**
     * Sets the value of the loyaltyinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOYALTYINFORMATIONType }
     *     
     */
    public void setLOYALTYINFORMATION(LOYALTYINFORMATIONType value) {
        this.loyaltyinformation = value;
    }

    /**
     * Gets the value of the checkinformation property.
     * 
     * @return
     *     possible object is
     *     {@link CHECKINFORMATIONType }
     *     
     */
    public CHECKINFORMATIONType getCHECKINFORMATION() {
        return checkinformation;
    }

    /**
     * Sets the value of the checkinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHECKINFORMATIONType }
     *     
     */
    public void setCHECKINFORMATION(CHECKINFORMATIONType value) {
        this.checkinformation = value;
    }

    /**
     * Gets the value of the directdebitinformation property.
     * 
     * @return
     *     possible object is
     *     {@link DIRECTDEBITINFORMATIONType }
     *     
     */
    public DIRECTDEBITINFORMATIONType getDIRECTDEBITINFORMATION() {
        return directdebitinformation;
    }

    /**
     * Sets the value of the directdebitinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIRECTDEBITINFORMATIONType }
     *     
     */
    public void setDIRECTDEBITINFORMATION(DIRECTDEBITINFORMATIONType value) {
        this.directdebitinformation = value;
    }

    /**
     * Gets the value of the giftcardinformation property.
     * 
     * @return
     *     possible object is
     *     {@link GIFTCARDINFORMATIONType }
     *     
     */
    public GIFTCARDINFORMATIONType getGIFTCARDINFORMATION() {
        return giftcardinformation;
    }

    /**
     * Sets the value of the giftcardinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GIFTCARDINFORMATIONType }
     *     
     */
    public void setGIFTCARDINFORMATION(GIFTCARDINFORMATIONType value) {
        this.giftcardinformation = value;
    }

    /**
     * Gets the value of the travelfundssearchinformation property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELFUNDSSEARCHINFORMATIONType }
     *     
     */
    public TRAVELFUNDSSEARCHINFORMATIONType getTRAVELFUNDSSEARCHINFORMATION() {
        return travelfundssearchinformation;
    }

    /**
     * Sets the value of the travelfundssearchinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELFUNDSSEARCHINFORMATIONType }
     *     
     */
    public void setTRAVELFUNDSSEARCHINFORMATION(TRAVELFUNDSSEARCHINFORMATIONType value) {
        this.travelfundssearchinformation = value;
    }

    /**
     * Gets the value of the travelfundsinformation property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELFUNDSINFORMATIONType }
     *     
     */
    public TRAVELFUNDSINFORMATIONType getTRAVELFUNDSINFORMATION() {
        return travelfundsinformation;
    }

    /**
     * Sets the value of the travelfundsinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELFUNDSINFORMATIONType }
     *     
     */
    public void setTRAVELFUNDSINFORMATION(TRAVELFUNDSINFORMATIONType value) {
        this.travelfundsinformation = value;
    }

    /**
     * Gets the value of the certificatesearchinformation property.
     * 
     * @return
     *     possible object is
     *     {@link CERTIFICATESEARCHINFORMATIONType }
     *     
     */
    public CERTIFICATESEARCHINFORMATIONType getCERTIFICATESEARCHINFORMATION() {
        return certificatesearchinformation;
    }

    /**
     * Sets the value of the certificatesearchinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CERTIFICATESEARCHINFORMATIONType }
     *     
     */
    public void setCERTIFICATESEARCHINFORMATION(CERTIFICATESEARCHINFORMATIONType value) {
        this.certificatesearchinformation = value;
    }

    /**
     * Gets the value of the certificateinformation property.
     * 
     * @return
     *     possible object is
     *     {@link CERTIFICATEINFORMATIONType }
     *     
     */
    public CERTIFICATEINFORMATIONType getCERTIFICATEINFORMATION() {
        return certificateinformation;
    }

    /**
     * Sets the value of the certificateinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CERTIFICATEINFORMATIONType }
     *     
     */
    public void setCERTIFICATEINFORMATION(CERTIFICATEINFORMATIONType value) {
        this.certificateinformation = value;
    }

    /**
     * Gets the value of the nonrevenuepasssearchinformation property.
     * 
     * @return
     *     possible object is
     *     {@link NONREVENUEPASSSEARCHINFORMATIONType }
     *     
     */
    public NONREVENUEPASSSEARCHINFORMATIONType getNONREVENUEPASSSEARCHINFORMATION() {
        return nonrevenuepasssearchinformation;
    }

    /**
     * Sets the value of the nonrevenuepasssearchinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NONREVENUEPASSSEARCHINFORMATIONType }
     *     
     */
    public void setNONREVENUEPASSSEARCHINFORMATION(NONREVENUEPASSSEARCHINFORMATIONType value) {
        this.nonrevenuepasssearchinformation = value;
    }

    /**
     * Gets the value of the passinformation property.
     * 
     * @return
     *     possible object is
     *     {@link PASSINFORMATIONType }
     *     
     */
    public PASSINFORMATIONType getPASSINFORMATION() {
        return passinformation;
    }

    /**
     * Sets the value of the passinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PASSINFORMATIONType }
     *     
     */
    public void setPASSINFORMATION(PASSINFORMATIONType value) {
        this.passinformation = value;
    }

    /**
     * Gets the value of the amopinformation property.
     * 
     * @return
     *     possible object is
     *     {@link AMOPINFORMATIONType }
     *     
     */
    public AMOPINFORMATIONType getAMOPINFORMATION() {
        return amopinformation;
    }

    /**
     * Sets the value of the amopinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOPINFORMATIONType }
     *     
     */
    public void setAMOPINFORMATION(AMOPINFORMATIONType value) {
        this.amopinformation = value;
    }

}
