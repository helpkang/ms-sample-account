
package com.koreanair.external.eretail.vo.tripplan.payment_group;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.CurrencyType;
import com.koreanair.external.eretail.vo.common.common.OutputDateType;
import com.koreanair.external.eretail.vo.profile.commonprofileout.ADDRESSINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.BANKACCOUNTINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.CREDITCARDINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.GOVERNMENTPAYMENTINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.VOUCHERACCOUNTINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.tripplan.installment_plan.INSTALLMENTPLANType;


/**
 * <p>Java class for PAYMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PAYMENT_TYPE" type="{}PAYMENT_TYPE_Type"/&gt;
 *         &lt;element name="PAYMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENT_RECORD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;group ref="{}AmountGroup" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENT_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="APPROVAL_DATA" type="{}APPROVAL_DATA_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT_SUPPLEMENTARY_DATA" type="{}ACCOUNT_SUPPLEMENTARY_DATA_Type" minOccurs="0"/&gt;
 *         &lt;element name="TRANSFORMATION_DATA" type="{}TRANSFORMATION_DATA_Type" minOccurs="0"/&gt;
 *         &lt;element name="EXTRA_PAYMENT_INFO" type="{}EXTRA_PAYMENT_INFO_Type" minOccurs="0"/&gt;
 *         &lt;group ref="{}MOPType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAYMENT_Type", propOrder = {
    "paymenttype",
    "paymentid",
    "paymentrecordid",
    "status",
    "source",
    "amount",
    "currency",
    "paymentdate",
    "approvaldata",
    "accountsupplementarydata",
    "transformationdata",
    "extrapaymentinfo",
    "formofpaymentid",
    "requestedamount",
    "basicformofpaymentOrCREDITCARDINFORMATIONOrPAYPALINFORMATION",
    "addressinformation",
    "payerinformation",
    "installmentplan",
    "dcc",
    "isold",
    "isprepayment",
    "listparameter"
})
public class PAYMENTType
    implements Serializable
{

    @XmlElement(name = "PAYMENT_TYPE", required = true)
    protected PAYMENTTYPEType paymenttype;
    @XmlElement(name = "PAYMENT_ID")
    protected BigInteger paymentid;
    @XmlElement(name = "PAYMENT_RECORD_ID")
    protected String paymentrecordid;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "SOURCE")
    protected String source;
    @XmlElement(name = "AMOUNT")
    protected BigDecimal amount;
    @XmlElement(name = "CURRENCY")
    protected CurrencyType currency;
    @XmlElement(name = "PAYMENT_DATE")
    protected OutputDateType paymentdate;
    @XmlElement(name = "APPROVAL_DATA")
    protected APPROVALDATAType approvaldata;
    @XmlElement(name = "ACCOUNT_SUPPLEMENTARY_DATA")
    protected ACCOUNTSUPPLEMENTARYDATAType accountsupplementarydata;
    @XmlElement(name = "TRANSFORMATION_DATA")
    protected TRANSFORMATIONDATAType transformationdata;
    @XmlElement(name = "EXTRA_PAYMENT_INFO")
    protected EXTRAPAYMENTINFOType extrapaymentinfo;
    @XmlElement(name = "FORM_OF_PAYMENT_ID")
    protected BigInteger formofpaymentid;
    @XmlElement(name = "REQUESTED_AMOUNT")
    protected PAYMENTType.REQUESTEDAMOUNT requestedamount;
    @XmlElements({
        @XmlElement(name = "BASIC_FORM_OF_PAYMENT", type = String.class),
        @XmlElement(name = "CREDIT_CARD_INFORMATION", type = CREDITCARDINFORMATIONTYPE.class),
        @XmlElement(name = "PAYPAL_INFORMATION", type = PAYPALINFORMATIONType.class),
        @XmlElement(name = "ECREDIT_LINE_INFORMATION", type = ECREDITLINEINFORMATIONType.class),
        @XmlElement(name = "BANK_ACCOUNT_INFORMATION", type = BANKACCOUNTINFORMATIONTYPE.class),
        @XmlElement(name = "ASYNCHRONOUS_INFORMATION", type = ASYNCHRONOUSINFORMATIONType.class),
        @XmlElement(name = "GOVERNMENT_PAYMENT_INFORMATION", type = GOVERNMENTPAYMENTINFORMATIONTYPE.class),
        @XmlElement(name = "VOUCHER_ACCOUNT_INFORMATION", type = VOUCHERACCOUNTINFORMATIONTYPE.class),
        @XmlElement(name = "LOYALTY_INFORMATION", type = LOYALTYINFORMATIONType.class),
        @XmlElement(name = "CHECK_INFORMATION", type = CHECKINFORMATIONType.class),
        @XmlElement(name = "DIRECT_DEBIT_INFORMATION", type = DIRECTDEBITINFORMATIONType.class),
        @XmlElement(name = "GIFTCARD_INFORMATION", type = GIFTCARDINFORMATIONType.class),
        @XmlElement(name = "TRAVEL_FUNDS_SEARCH_INFORMATION", type = TRAVELFUNDSSEARCHINFORMATIONType.class),
        @XmlElement(name = "TRAVEL_FUNDS_INFORMATION", type = TRAVELFUNDSINFORMATIONType.class),
        @XmlElement(name = "CERTIFICATE_SEARCH_INFORMATION", type = CERTIFICATESEARCHINFORMATIONType.class),
        @XmlElement(name = "CERTIFICATE_INFORMATION", type = CERTIFICATEINFORMATIONType.class),
        @XmlElement(name = "NON_REVENUE_PASS_SEARCH_INFORMATION", type = NONREVENUEPASSSEARCHINFORMATIONType.class),
        @XmlElement(name = "PASS_INFORMATION", type = PASSINFORMATIONType.class),
        @XmlElement(name = "EPASS_INFORMATION", type = EPASSINFORMATIONType.class),
        @XmlElement(name = "AMOP_INFORMATION", type = AMOPINFORMATIONType.class),
        @XmlElement(name = "DIRECT_PAYMENT_INFORMATION", type = DIRECTPAYMENTINFORMATIONType.class),
        @XmlElement(name = "EBANK_VOUCHER_INFORMATION", type = EBANKVOUCHERINFORMATIONType.class)
    })
    protected List<Object> basicformofpaymentOrCREDITCARDINFORMATIONOrPAYPALINFORMATION;
    @XmlElement(name = "ADDRESS_INFORMATION")
    protected ADDRESSINFORMATIONTYPE addressinformation;
    @XmlElement(name = "PAYER_INFORMATION")
    protected PAYMENTType.PAYERINFORMATION payerinformation;
    @XmlElement(name = "INSTALLMENT_PLAN")
    protected INSTALLMENTPLANType installmentplan;
    @XmlElement(name = "DCC")
    protected PAYMENTType.DCC dcc;
    @XmlElement(name = "IS_OLD")
    protected Boolean isold;
    @XmlElement(name = "IS_PREPAYMENT")
    protected Boolean isprepayment;
    @XmlElement(name = "LIST_PARAMETER")
    protected List<LISTPARAMETERType> listparameter;

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
     * Gets the value of the paymentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPAYMENTID() {
        return paymentid;
    }

    /**
     * Sets the value of the paymentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPAYMENTID(BigInteger value) {
        this.paymentid = value;
    }

    /**
     * Gets the value of the paymentrecordid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTRECORDID() {
        return paymentrecordid;
    }

    /**
     * Sets the value of the paymentrecordid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTRECORDID(String value) {
        this.paymentrecordid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
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
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCE(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNT() {
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
    public void setAMOUNT(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCURRENCY(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the paymentdate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getPAYMENTDATE() {
        return paymentdate;
    }

    /**
     * Sets the value of the paymentdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setPAYMENTDATE(OutputDateType value) {
        this.paymentdate = value;
    }

    /**
     * Gets the value of the approvaldata property.
     * 
     * @return
     *     possible object is
     *     {@link APPROVALDATAType }
     *     
     */
    public APPROVALDATAType getAPPROVALDATA() {
        return approvaldata;
    }

    /**
     * Sets the value of the approvaldata property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPROVALDATAType }
     *     
     */
    public void setAPPROVALDATA(APPROVALDATAType value) {
        this.approvaldata = value;
    }

    /**
     * Gets the value of the accountsupplementarydata property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTSUPPLEMENTARYDATAType }
     *     
     */
    public ACCOUNTSUPPLEMENTARYDATAType getACCOUNTSUPPLEMENTARYDATA() {
        return accountsupplementarydata;
    }

    /**
     * Sets the value of the accountsupplementarydata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTSUPPLEMENTARYDATAType }
     *     
     */
    public void setACCOUNTSUPPLEMENTARYDATA(ACCOUNTSUPPLEMENTARYDATAType value) {
        this.accountsupplementarydata = value;
    }

    /**
     * Gets the value of the transformationdata property.
     * 
     * @return
     *     possible object is
     *     {@link TRANSFORMATIONDATAType }
     *     
     */
    public TRANSFORMATIONDATAType getTRANSFORMATIONDATA() {
        return transformationdata;
    }

    /**
     * Sets the value of the transformationdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSFORMATIONDATAType }
     *     
     */
    public void setTRANSFORMATIONDATA(TRANSFORMATIONDATAType value) {
        this.transformationdata = value;
    }

    /**
     * Gets the value of the extrapaymentinfo property.
     * 
     * @return
     *     possible object is
     *     {@link EXTRAPAYMENTINFOType }
     *     
     */
    public EXTRAPAYMENTINFOType getEXTRAPAYMENTINFO() {
        return extrapaymentinfo;
    }

    /**
     * Sets the value of the extrapaymentinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTRAPAYMENTINFOType }
     *     
     */
    public void setEXTRAPAYMENTINFO(EXTRAPAYMENTINFOType value) {
        this.extrapaymentinfo = value;
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
     * Gets the value of the requestedamount property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTType.REQUESTEDAMOUNT }
     *     
     */
    public PAYMENTType.REQUESTEDAMOUNT getREQUESTEDAMOUNT() {
        return requestedamount;
    }

    /**
     * Sets the value of the requestedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTType.REQUESTEDAMOUNT }
     *     
     */
    public void setREQUESTEDAMOUNT(PAYMENTType.REQUESTEDAMOUNT value) {
        this.requestedamount = value;
    }

    /**
     * Gets the value of the basicformofpaymentOrCREDITCARDINFORMATIONOrPAYPALINFORMATION property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basicformofpaymentOrCREDITCARDINFORMATIONOrPAYPALINFORMATION property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBASICFORMOFPAYMENTOrCREDITCARDINFORMATIONOrPAYPALINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link CREDITCARDINFORMATIONTYPE }
     * {@link PAYPALINFORMATIONType }
     * {@link ECREDITLINEINFORMATIONType }
     * {@link BANKACCOUNTINFORMATIONTYPE }
     * {@link ASYNCHRONOUSINFORMATIONType }
     * {@link GOVERNMENTPAYMENTINFORMATIONTYPE }
     * {@link VOUCHERACCOUNTINFORMATIONTYPE }
     * {@link LOYALTYINFORMATIONType }
     * {@link CHECKINFORMATIONType }
     * {@link DIRECTDEBITINFORMATIONType }
     * {@link GIFTCARDINFORMATIONType }
     * {@link TRAVELFUNDSSEARCHINFORMATIONType }
     * {@link TRAVELFUNDSINFORMATIONType }
     * {@link CERTIFICATESEARCHINFORMATIONType }
     * {@link CERTIFICATEINFORMATIONType }
     * {@link NONREVENUEPASSSEARCHINFORMATIONType }
     * {@link PASSINFORMATIONType }
     * {@link EPASSINFORMATIONType }
     * {@link AMOPINFORMATIONType }
     * {@link DIRECTPAYMENTINFORMATIONType }
     * {@link EBANKVOUCHERINFORMATIONType }
     * 
     * 
     */
    public List<Object> getBASICFORMOFPAYMENTOrCREDITCARDINFORMATIONOrPAYPALINFORMATION() {
        if (basicformofpaymentOrCREDITCARDINFORMATIONOrPAYPALINFORMATION == null) {
            basicformofpaymentOrCREDITCARDINFORMATIONOrPAYPALINFORMATION = new ArrayList<Object>();
        }
        return this.basicformofpaymentOrCREDITCARDINFORMATIONOrPAYPALINFORMATION;
    }

    /**
     * Gets the value of the addressinformation property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESSINFORMATIONTYPE }
     *     
     */
    public ADDRESSINFORMATIONTYPE getADDRESSINFORMATION() {
        return addressinformation;
    }

    /**
     * Sets the value of the addressinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESSINFORMATIONTYPE }
     *     
     */
    public void setADDRESSINFORMATION(ADDRESSINFORMATIONTYPE value) {
        this.addressinformation = value;
    }

    /**
     * Gets the value of the payerinformation property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTType.PAYERINFORMATION }
     *     
     */
    public PAYMENTType.PAYERINFORMATION getPAYERINFORMATION() {
        return payerinformation;
    }

    /**
     * Sets the value of the payerinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTType.PAYERINFORMATION }
     *     
     */
    public void setPAYERINFORMATION(PAYMENTType.PAYERINFORMATION value) {
        this.payerinformation = value;
    }

    /**
     * Gets the value of the installmentplan property.
     * 
     * @return
     *     possible object is
     *     {@link INSTALLMENTPLANType }
     *     
     */
    public INSTALLMENTPLANType getINSTALLMENTPLAN() {
        return installmentplan;
    }

    /**
     * Sets the value of the installmentplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link INSTALLMENTPLANType }
     *     
     */
    public void setINSTALLMENTPLAN(INSTALLMENTPLANType value) {
        this.installmentplan = value;
    }

    /**
     * Gets the value of the dcc property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTType.DCC }
     *     
     */
    public PAYMENTType.DCC getDCC() {
        return dcc;
    }

    /**
     * Sets the value of the dcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTType.DCC }
     *     
     */
    public void setDCC(PAYMENTType.DCC value) {
        this.dcc = value;
    }

    /**
     * Gets the value of the isold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISOLD() {
        return isold;
    }

    /**
     * Sets the value of the isold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISOLD(Boolean value) {
        this.isold = value;
    }

    /**
     * Gets the value of the isprepayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPREPAYMENT() {
        return isprepayment;
    }

    /**
     * Sets the value of the isprepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPREPAYMENT(Boolean value) {
        this.isprepayment = value;
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
     * {@link LISTPARAMETERType }
     * 
     * 
     */
    public List<LISTPARAMETERType> getLISTPARAMETER() {
        if (listparameter == null) {
            listparameter = new ArrayList<LISTPARAMETERType>();
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
     *       &lt;sequence&gt;
     *         &lt;element name="OFFER_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="CURRENCY" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="TOTAL_CONVERTED_AMOUNT" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="MARGIN" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="EXCHANGE_RATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="PROVIDER_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "offerid",
        "currency",
        "totalconvertedamount",
        "margin",
        "exchangerate",
        "providerid"
    })
    public static class DCC
        implements Serializable
    {

        @XmlElement(name = "OFFER_ID")
        protected Integer offerid;
        @XmlElement(name = "CURRENCY")
        protected String currency;
        @XmlElement(name = "TOTAL_CONVERTED_AMOUNT")
        protected String totalconvertedamount;
        @XmlElement(name = "MARGIN")
        protected String margin;
        @XmlElement(name = "EXCHANGE_RATE")
        protected String exchangerate;
        @XmlElement(name = "PROVIDER_ID")
        protected String providerid;

        /**
         * Gets the value of the offerid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOFFERID() {
            return offerid;
        }

        /**
         * Sets the value of the offerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOFFERID(Integer value) {
            this.offerid = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCURRENCY(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the totalconvertedamount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTOTALCONVERTEDAMOUNT() {
            return totalconvertedamount;
        }

        /**
         * Sets the value of the totalconvertedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTOTALCONVERTEDAMOUNT(String value) {
            this.totalconvertedamount = value;
        }

        /**
         * Gets the value of the margin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMARGIN() {
            return margin;
        }

        /**
         * Sets the value of the margin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMARGIN(String value) {
            this.margin = value;
        }

        /**
         * Gets the value of the exchangerate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEXCHANGERATE() {
            return exchangerate;
        }

        /**
         * Sets the value of the exchangerate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEXCHANGERATE(String value) {
            this.exchangerate = value;
        }

        /**
         * Gets the value of the providerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVIDERID() {
            return providerid;
        }

        /**
         * Sets the value of the providerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVIDERID(String value) {
            this.providerid = value;
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
     *         &lt;element name="FIRST_NAME" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LAST_NAME" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CUSTOMER_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "firstname",
        "lastname",
        "customernumber"
    })
    public static class PAYERINFORMATION
        implements Serializable
    {

        @XmlElement(name = "FIRST_NAME")
        protected String firstname;
        @XmlElement(name = "LAST_NAME")
        protected String lastname;
        @XmlElement(name = "CUSTOMER_NUMBER")
        protected String customernumber;

        /**
         * Gets the value of the firstname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIRSTNAME() {
            return firstname;
        }

        /**
         * Sets the value of the firstname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIRSTNAME(String value) {
            this.firstname = value;
        }

        /**
         * Gets the value of the lastname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLASTNAME() {
            return lastname;
        }

        /**
         * Sets the value of the lastname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLASTNAME(String value) {
            this.lastname = value;
        }

        /**
         * Gets the value of the customernumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERNUMBER() {
            return customernumber;
        }

        /**
         * Sets the value of the customernumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERNUMBER(String value) {
            this.customernumber = value;
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
     *         &lt;element name="QUALIFIER"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="MAX"/&gt;
     *               &lt;enumeration value="EXACT"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;group ref="{}AmountGroup"/&gt;
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
        "qualifier",
        "amount",
        "currency"
    })
    public static class REQUESTEDAMOUNT
        implements Serializable
    {

        @XmlElement(name = "QUALIFIER", required = true)
        protected String qualifier;
        @XmlElement(name = "AMOUNT", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "CURRENCY")
        protected CurrencyType currency;

        /**
         * Gets the value of the qualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQUALIFIER() {
            return qualifier;
        }

        /**
         * Sets the value of the qualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQUALIFIER(String value) {
            this.qualifier = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
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
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyType }
         *     
         */
        public CurrencyType getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyType }
         *     
         */
        public void setCURRENCY(CurrencyType value) {
            this.currency = value;
        }

    }

}
