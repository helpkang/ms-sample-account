
package com.koreanair.external.eretail.vo.payment.paymentoutput;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.payment.amopexternaloutput.AMOPExternalOutputType;
import com.koreanair.external.eretail.vo.payment.amountcommon.AMOUNTValueType;


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
 *         &lt;element name="LIST_CREDIT_CARD" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="CREDIT_CARD_DATA" type="{}CREDIT_CARD_OUTPUT_Type"/&gt;
 *                   &lt;element name="MERCHANT_DATA" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MERCHANT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="MERCHANT_NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="MERCHANT_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="MERCHANT_PASSWORD" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="ACQUIRER_BIN" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="LOAD_FROM_DB" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BILLING_ADDRESS" type="{}BILLING_ADDRESS_OUTPUT_Type" minOccurs="0"/&gt;
 *                   &lt;element name="PAYER_AUTHENTICATION" type="{}PAYER_AUTHENTICATIONType" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT" type="{}AMOUNTValueType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_EXTRA_AMOUNT" type="{}EXTRA_AMOUNT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="MERCHANT_REFERENCE_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="PREVIOUS_MERCHANT_REFERENCE_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="AUTHORISATION_REQUESTID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="AUTHORIZATION_APPROVAL_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="VALIDATION_STATUS_Yes_No" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="CREDIT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;group ref="{}EXTERNAL_PROCESS_Group" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PROMOTION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="FAMILY"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="VALIDITY_PERIODE" type="{}PERIODEType" minOccurs="0"/&gt;
 *                             &lt;element name="TRAVEL_DATE" type="{}PERIODEType" maxOccurs="3" minOccurs="0"/&gt;
 *                             &lt;element name="PROMOTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="POS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="AMOUNT" type="{}ExtendedAMOUNTValueType" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_CONVERTED_AMOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NUMBER_OF_CODES" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="PAYMENT_REF" type="{}PAYMENT_REFType" minOccurs="0"/&gt;
 *                             &lt;element name="FAMILY_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PROMOTION_CODE" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="CODE_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="ESTIMATED_DISCOUNTED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="VALUE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="CODE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PROMO_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CURRENCY_CONVERSION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AMOUNT" type="{}AMOUNTValueType"/&gt;
 *                   &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="TRANSACTION_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="STORAGE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="IS_SELECTED" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_DIRECT_DEBIT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="ADDRESS_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="ACCOUNT_HOLDER_LASTNAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="BANK_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="BANK_NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="PROCESSING_MODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="DATA_SHEET" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="CHECK_DIGIT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="DIRECT_DEBIT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_OTHER" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PAYMENT_REF" type="{}PAYMENT_REFType"/&gt;
 *                   &lt;element name="OTHER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INSTALLMENT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AMOUNT" type="{}AMOUNTValueType"/&gt;
 *                   &lt;element name="DUE_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    "listcreditcard",
    "externalprocess",
    "listexternalpayment",
    "listpromotion",
    "currencyconversion",
    "listdirectdebit",
    "listother",
    "installment"
})
@XmlRootElement(name = "PAYMENT")
public class PAYMENT
    implements Serializable
{

    @XmlElement(name = "LIST_CREDIT_CARD")
    protected List<PAYMENT.LISTCREDITCARD> listcreditcard;
    @XmlElement(name = "EXTERNAL_PROCESS")
    protected AMOPExternalOutputType externalprocess;
    @XmlElement(name = "LIST_EXTERNAL_PAYMENT")
    protected List<LISTEXTERNALPAYMENTType> listexternalpayment;
    @XmlElement(name = "LIST_PROMOTION")
    protected List<PAYMENT.LISTPROMOTION> listpromotion;
    @XmlElement(name = "CURRENCY_CONVERSION")
    protected PAYMENT.CURRENCYCONVERSION currencyconversion;
    @XmlElement(name = "LIST_DIRECT_DEBIT")
    protected List<PAYMENT.LISTDIRECTDEBIT> listdirectdebit;
    @XmlElement(name = "LIST_OTHER")
    protected List<PAYMENT.LISTOTHER> listother;
    @XmlElement(name = "INSTALLMENT")
    protected PAYMENT.INSTALLMENT installment;

    /**
     * Gets the value of the listcreditcard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcreditcard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCREDITCARD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENT.LISTCREDITCARD }
     * 
     * 
     */
    public List<PAYMENT.LISTCREDITCARD> getLISTCREDITCARD() {
        if (listcreditcard == null) {
            listcreditcard = new ArrayList<PAYMENT.LISTCREDITCARD>();
        }
        return this.listcreditcard;
    }

    /**
     * Gets the value of the externalprocess property.
     * 
     * @return
     *     possible object is
     *     {@link AMOPExternalOutputType }
     *     
     */
    public AMOPExternalOutputType getEXTERNALPROCESS() {
        return externalprocess;
    }

    /**
     * Sets the value of the externalprocess property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOPExternalOutputType }
     *     
     */
    public void setEXTERNALPROCESS(AMOPExternalOutputType value) {
        this.externalprocess = value;
    }

    /**
     * Gets the value of the listexternalpayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexternalpayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXTERNALPAYMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTEXTERNALPAYMENTType }
     * 
     * 
     */
    public List<LISTEXTERNALPAYMENTType> getLISTEXTERNALPAYMENT() {
        if (listexternalpayment == null) {
            listexternalpayment = new ArrayList<LISTEXTERNALPAYMENTType>();
        }
        return this.listexternalpayment;
    }

    /**
     * Gets the value of the listpromotion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpromotion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROMOTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENT.LISTPROMOTION }
     * 
     * 
     */
    public List<PAYMENT.LISTPROMOTION> getLISTPROMOTION() {
        if (listpromotion == null) {
            listpromotion = new ArrayList<PAYMENT.LISTPROMOTION>();
        }
        return this.listpromotion;
    }

    /**
     * Gets the value of the currencyconversion property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENT.CURRENCYCONVERSION }
     *     
     */
    public PAYMENT.CURRENCYCONVERSION getCURRENCYCONVERSION() {
        return currencyconversion;
    }

    /**
     * Sets the value of the currencyconversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENT.CURRENCYCONVERSION }
     *     
     */
    public void setCURRENCYCONVERSION(PAYMENT.CURRENCYCONVERSION value) {
        this.currencyconversion = value;
    }

    /**
     * Gets the value of the listdirectdebit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdirectdebit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDIRECTDEBIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENT.LISTDIRECTDEBIT }
     * 
     * 
     */
    public List<PAYMENT.LISTDIRECTDEBIT> getLISTDIRECTDEBIT() {
        if (listdirectdebit == null) {
            listdirectdebit = new ArrayList<PAYMENT.LISTDIRECTDEBIT>();
        }
        return this.listdirectdebit;
    }

    /**
     * Gets the value of the listother property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listother property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOTHER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENT.LISTOTHER }
     * 
     * 
     */
    public List<PAYMENT.LISTOTHER> getLISTOTHER() {
        if (listother == null) {
            listother = new ArrayList<PAYMENT.LISTOTHER>();
        }
        return this.listother;
    }

    /**
     * Gets the value of the installment property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENT.INSTALLMENT }
     *     
     */
    public PAYMENT.INSTALLMENT getINSTALLMENT() {
        return installment;
    }

    /**
     * Sets the value of the installment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENT.INSTALLMENT }
     *     
     */
    public void setINSTALLMENT(PAYMENT.INSTALLMENT value) {
        this.installment = value;
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
     *         &lt;element name="AMOUNT" type="{}AMOUNTValueType"/&gt;
     *         &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="TRANSACTION_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="STORAGE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="IS_SELECTED" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "amount",
        "exchangerate",
        "transactionid",
        "type",
        "storageid",
        "isselected"
    })
    public static class CURRENCYCONVERSION
        implements Serializable
    {

        @XmlElement(name = "AMOUNT", required = true)
        protected AMOUNTValueType amount;
        @XmlElement(name = "EXCHANGE_RATE", required = true)
        protected Object exchangerate;
        @XmlElement(name = "TRANSACTION_ID", required = true)
        protected Object transactionid;
        @XmlElement(name = "TYPE", required = true)
        protected Object type;
        @XmlElement(name = "STORAGE_ID", required = true)
        protected Object storageid;
        @XmlElement(name = "IS_SELECTED", required = true)
        protected Object isselected;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link AMOUNTValueType }
         *     
         */
        public AMOUNTValueType getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOUNTValueType }
         *     
         */
        public void setAMOUNT(AMOUNTValueType value) {
            this.amount = value;
        }

        /**
         * Gets the value of the exchangerate property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEXCHANGERATE() {
            return exchangerate;
        }

        /**
         * Sets the value of the exchangerate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEXCHANGERATE(Object value) {
            this.exchangerate = value;
        }

        /**
         * Gets the value of the transactionid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTRANSACTIONID() {
            return transactionid;
        }

        /**
         * Sets the value of the transactionid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTRANSACTIONID(Object value) {
            this.transactionid = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTYPE(Object value) {
            this.type = value;
        }

        /**
         * Gets the value of the storageid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTORAGEID() {
            return storageid;
        }

        /**
         * Sets the value of the storageid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTORAGEID(Object value) {
            this.storageid = value;
        }

        /**
         * Gets the value of the isselected property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getISSELECTED() {
            return isselected;
        }

        /**
         * Sets the value of the isselected property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setISSELECTED(Object value) {
            this.isselected = value;
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
     *         &lt;element name="AMOUNT" type="{}AMOUNTValueType"/&gt;
     *         &lt;element name="DUE_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "amount",
        "duedate"
    })
    public static class INSTALLMENT
        implements Serializable
    {

        @XmlElement(name = "AMOUNT", required = true)
        protected AMOUNTValueType amount;
        @XmlElement(name = "DUE_DATE")
        protected Object duedate;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link AMOUNTValueType }
         *     
         */
        public AMOUNTValueType getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOUNTValueType }
         *     
         */
        public void setAMOUNT(AMOUNTValueType value) {
            this.amount = value;
        }

        /**
         * Gets the value of the duedate property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDUEDATE() {
            return duedate;
        }

        /**
         * Sets the value of the duedate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDUEDATE(Object value) {
            this.duedate = value;
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
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="CREDIT_CARD_DATA" type="{}CREDIT_CARD_OUTPUT_Type"/&gt;
     *         &lt;element name="MERCHANT_DATA" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MERCHANT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="MERCHANT_NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="MERCHANT_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="MERCHANT_PASSWORD" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="ACQUIRER_BIN" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="LOAD_FROM_DB" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BILLING_ADDRESS" type="{}BILLING_ADDRESS_OUTPUT_Type" minOccurs="0"/&gt;
     *         &lt;element name="PAYER_AUTHENTICATION" type="{}PAYER_AUTHENTICATIONType" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT" type="{}AMOUNTValueType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_EXTRA_AMOUNT" type="{}EXTRA_AMOUNT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="MERCHANT_REFERENCE_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="PREVIOUS_MERCHANT_REFERENCE_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="AUTHORISATION_REQUESTID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="AUTHORIZATION_APPROVAL_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="VALIDATION_STATUS_Yes_No" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="CREDIT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "status",
        "creditcarddata",
        "merchantdata",
        "billingaddress",
        "payerauthentication",
        "amount",
        "listextraamount",
        "merchantreferencecode",
        "previousmerchantreferencecode",
        "authorisationrequestid",
        "authorizationapprovalcode",
        "validationstatusYesNo",
        "creditcardid"
    })
    public static class LISTCREDITCARD
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected Object type;
        @XmlElement(name = "STATUS", required = true)
        protected Object status;
        @XmlElement(name = "CREDIT_CARD_DATA", required = true)
        protected CREDITCARDOUTPUTType creditcarddata;
        @XmlElement(name = "MERCHANT_DATA")
        protected PAYMENT.LISTCREDITCARD.MERCHANTDATA merchantdata;
        @XmlElement(name = "BILLING_ADDRESS")
        protected BILLINGADDRESSOUTPUTType billingaddress;
        @XmlElement(name = "PAYER_AUTHENTICATION")
        protected PAYERAUTHENTICATIONType payerauthentication;
        @XmlElement(name = "AMOUNT")
        protected AMOUNTValueType amount;
        @XmlElement(name = "LIST_EXTRA_AMOUNT")
        protected List<EXTRAAMOUNTType> listextraamount;
        @XmlElement(name = "MERCHANT_REFERENCE_CODE")
        protected Object merchantreferencecode;
        @XmlElement(name = "PREVIOUS_MERCHANT_REFERENCE_CODE")
        protected Object previousmerchantreferencecode;
        @XmlElement(name = "AUTHORISATION_REQUESTID")
        protected Object authorisationrequestid;
        @XmlElement(name = "AUTHORIZATION_APPROVAL_CODE")
        protected Object authorizationapprovalcode;
        @XmlElement(name = "VALIDATION_STATUS_Yes_No")
        protected Object validationstatusYesNo;
        @XmlElement(name = "CREDIT_CARD_ID", required = true)
        protected Object creditcardid;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTYPE(Object value) {
            this.type = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTATUS(Object value) {
            this.status = value;
        }

        /**
         * Gets the value of the creditcarddata property.
         * 
         * @return
         *     possible object is
         *     {@link CREDITCARDOUTPUTType }
         *     
         */
        public CREDITCARDOUTPUTType getCREDITCARDDATA() {
            return creditcarddata;
        }

        /**
         * Sets the value of the creditcarddata property.
         * 
         * @param value
         *     allowed object is
         *     {@link CREDITCARDOUTPUTType }
         *     
         */
        public void setCREDITCARDDATA(CREDITCARDOUTPUTType value) {
            this.creditcarddata = value;
        }

        /**
         * Gets the value of the merchantdata property.
         * 
         * @return
         *     possible object is
         *     {@link PAYMENT.LISTCREDITCARD.MERCHANTDATA }
         *     
         */
        public PAYMENT.LISTCREDITCARD.MERCHANTDATA getMERCHANTDATA() {
            return merchantdata;
        }

        /**
         * Sets the value of the merchantdata property.
         * 
         * @param value
         *     allowed object is
         *     {@link PAYMENT.LISTCREDITCARD.MERCHANTDATA }
         *     
         */
        public void setMERCHANTDATA(PAYMENT.LISTCREDITCARD.MERCHANTDATA value) {
            this.merchantdata = value;
        }

        /**
         * Gets the value of the billingaddress property.
         * 
         * @return
         *     possible object is
         *     {@link BILLINGADDRESSOUTPUTType }
         *     
         */
        public BILLINGADDRESSOUTPUTType getBILLINGADDRESS() {
            return billingaddress;
        }

        /**
         * Sets the value of the billingaddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link BILLINGADDRESSOUTPUTType }
         *     
         */
        public void setBILLINGADDRESS(BILLINGADDRESSOUTPUTType value) {
            this.billingaddress = value;
        }

        /**
         * Gets the value of the payerauthentication property.
         * 
         * @return
         *     possible object is
         *     {@link PAYERAUTHENTICATIONType }
         *     
         */
        public PAYERAUTHENTICATIONType getPAYERAUTHENTICATION() {
            return payerauthentication;
        }

        /**
         * Sets the value of the payerauthentication property.
         * 
         * @param value
         *     allowed object is
         *     {@link PAYERAUTHENTICATIONType }
         *     
         */
        public void setPAYERAUTHENTICATION(PAYERAUTHENTICATIONType value) {
            this.payerauthentication = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link AMOUNTValueType }
         *     
         */
        public AMOUNTValueType getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AMOUNTValueType }
         *     
         */
        public void setAMOUNT(AMOUNTValueType value) {
            this.amount = value;
        }

        /**
         * Gets the value of the listextraamount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listextraamount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTEXTRAAMOUNT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EXTRAAMOUNTType }
         * 
         * 
         */
        public List<EXTRAAMOUNTType> getLISTEXTRAAMOUNT() {
            if (listextraamount == null) {
                listextraamount = new ArrayList<EXTRAAMOUNTType>();
            }
            return this.listextraamount;
        }

        /**
         * Gets the value of the merchantreferencecode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMERCHANTREFERENCECODE() {
            return merchantreferencecode;
        }

        /**
         * Sets the value of the merchantreferencecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMERCHANTREFERENCECODE(Object value) {
            this.merchantreferencecode = value;
        }

        /**
         * Gets the value of the previousmerchantreferencecode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPREVIOUSMERCHANTREFERENCECODE() {
            return previousmerchantreferencecode;
        }

        /**
         * Sets the value of the previousmerchantreferencecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPREVIOUSMERCHANTREFERENCECODE(Object value) {
            this.previousmerchantreferencecode = value;
        }

        /**
         * Gets the value of the authorisationrequestid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAUTHORISATIONREQUESTID() {
            return authorisationrequestid;
        }

        /**
         * Sets the value of the authorisationrequestid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAUTHORISATIONREQUESTID(Object value) {
            this.authorisationrequestid = value;
        }

        /**
         * Gets the value of the authorizationapprovalcode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAUTHORIZATIONAPPROVALCODE() {
            return authorizationapprovalcode;
        }

        /**
         * Sets the value of the authorizationapprovalcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAUTHORIZATIONAPPROVALCODE(Object value) {
            this.authorizationapprovalcode = value;
        }

        /**
         * Gets the value of the validationstatusYesNo property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getVALIDATIONSTATUSYesNo() {
            return validationstatusYesNo;
        }

        /**
         * Sets the value of the validationstatusYesNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setVALIDATIONSTATUSYesNo(Object value) {
            this.validationstatusYesNo = value;
        }

        /**
         * Gets the value of the creditcardid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCREDITCARDID() {
            return creditcardid;
        }

        /**
         * Sets the value of the creditcardid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCREDITCARDID(Object value) {
            this.creditcardid = value;
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
         *         &lt;element name="MERCHANT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="MERCHANT_NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="MERCHANT_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="MERCHANT_PASSWORD" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="ACQUIRER_BIN" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="LOAD_FROM_DB" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "merchantid",
            "merchantname",
            "merchantcode",
            "merchantpassword",
            "acquirerbin",
            "countrycode",
            "loadfromdb"
        })
        public static class MERCHANTDATA
            implements Serializable
        {

            @XmlElement(name = "MERCHANT_ID", required = true)
            protected Object merchantid;
            @XmlElement(name = "MERCHANT_NAME", required = true)
            protected Object merchantname;
            @XmlElement(name = "MERCHANT_CODE", required = true)
            protected Object merchantcode;
            @XmlElement(name = "MERCHANT_PASSWORD", required = true)
            protected Object merchantpassword;
            @XmlElement(name = "ACQUIRER_BIN", required = true)
            protected Object acquirerbin;
            @XmlElement(name = "COUNTRY_CODE", required = true)
            protected Object countrycode;
            @XmlElement(name = "LOAD_FROM_DB")
            protected Object loadfromdb;

            /**
             * Gets the value of the merchantid property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getMERCHANTID() {
                return merchantid;
            }

            /**
             * Sets the value of the merchantid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setMERCHANTID(Object value) {
                this.merchantid = value;
            }

            /**
             * Gets the value of the merchantname property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getMERCHANTNAME() {
                return merchantname;
            }

            /**
             * Sets the value of the merchantname property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setMERCHANTNAME(Object value) {
                this.merchantname = value;
            }

            /**
             * Gets the value of the merchantcode property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getMERCHANTCODE() {
                return merchantcode;
            }

            /**
             * Sets the value of the merchantcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setMERCHANTCODE(Object value) {
                this.merchantcode = value;
            }

            /**
             * Gets the value of the merchantpassword property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getMERCHANTPASSWORD() {
                return merchantpassword;
            }

            /**
             * Sets the value of the merchantpassword property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setMERCHANTPASSWORD(Object value) {
                this.merchantpassword = value;
            }

            /**
             * Gets the value of the acquirerbin property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getACQUIRERBIN() {
                return acquirerbin;
            }

            /**
             * Sets the value of the acquirerbin property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setACQUIRERBIN(Object value) {
                this.acquirerbin = value;
            }

            /**
             * Gets the value of the countrycode property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCOUNTRYCODE() {
                return countrycode;
            }

            /**
             * Sets the value of the countrycode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCOUNTRYCODE(Object value) {
                this.countrycode = value;
            }

            /**
             * Gets the value of the loadfromdb property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getLOADFROMDB() {
                return loadfromdb;
            }

            /**
             * Sets the value of the loadfromdb property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setLOADFROMDB(Object value) {
                this.loadfromdb = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="ADDRESS_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="ACCOUNT_HOLDER_LASTNAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="BANK_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="BANK_NAME" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="PROCESSING_MODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="DATA_SHEET" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="CHECK_DIGIT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="DIRECT_DEBIT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "status",
        "accountnumber",
        "addressid",
        "accountholderlastname",
        "bankcode",
        "bankname",
        "processingmode",
        "datasheet",
        "checkdigit",
        "directdebitid"
    })
    public static class LISTDIRECTDEBIT
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected Object type;
        @XmlElement(name = "STATUS", required = true)
        protected Object status;
        @XmlElement(name = "ACCOUNT_NUMBER", required = true)
        protected Object accountnumber;
        @XmlElement(name = "ADDRESS_ID", required = true)
        protected Object addressid;
        @XmlElement(name = "ACCOUNT_HOLDER_LASTNAME", required = true)
        protected Object accountholderlastname;
        @XmlElement(name = "BANK_CODE", required = true)
        protected Object bankcode;
        @XmlElement(name = "BANK_NAME", required = true)
        protected Object bankname;
        @XmlElement(name = "PROCESSING_MODE", required = true)
        protected Object processingmode;
        @XmlElement(name = "DATA_SHEET", required = true)
        protected Object datasheet;
        @XmlElement(name = "CHECK_DIGIT", required = true)
        protected Object checkdigit;
        @XmlElement(name = "DIRECT_DEBIT_ID", required = true)
        protected Object directdebitid;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTYPE(Object value) {
            this.type = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTATUS(Object value) {
            this.status = value;
        }

        /**
         * Gets the value of the accountnumber property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getACCOUNTNUMBER() {
            return accountnumber;
        }

        /**
         * Sets the value of the accountnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setACCOUNTNUMBER(Object value) {
            this.accountnumber = value;
        }

        /**
         * Gets the value of the addressid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getADDRESSID() {
            return addressid;
        }

        /**
         * Sets the value of the addressid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setADDRESSID(Object value) {
            this.addressid = value;
        }

        /**
         * Gets the value of the accountholderlastname property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getACCOUNTHOLDERLASTNAME() {
            return accountholderlastname;
        }

        /**
         * Sets the value of the accountholderlastname property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setACCOUNTHOLDERLASTNAME(Object value) {
            this.accountholderlastname = value;
        }

        /**
         * Gets the value of the bankcode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getBANKCODE() {
            return bankcode;
        }

        /**
         * Sets the value of the bankcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setBANKCODE(Object value) {
            this.bankcode = value;
        }

        /**
         * Gets the value of the bankname property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getBANKNAME() {
            return bankname;
        }

        /**
         * Sets the value of the bankname property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setBANKNAME(Object value) {
            this.bankname = value;
        }

        /**
         * Gets the value of the processingmode property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPROCESSINGMODE() {
            return processingmode;
        }

        /**
         * Sets the value of the processingmode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPROCESSINGMODE(Object value) {
            this.processingmode = value;
        }

        /**
         * Gets the value of the datasheet property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDATASHEET() {
            return datasheet;
        }

        /**
         * Sets the value of the datasheet property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDATASHEET(Object value) {
            this.datasheet = value;
        }

        /**
         * Gets the value of the checkdigit property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCHECKDIGIT() {
            return checkdigit;
        }

        /**
         * Sets the value of the checkdigit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCHECKDIGIT(Object value) {
            this.checkdigit = value;
        }

        /**
         * Gets the value of the directdebitid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDIRECTDEBITID() {
            return directdebitid;
        }

        /**
         * Sets the value of the directdebitid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDIRECTDEBITID(Object value) {
            this.directdebitid = value;
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
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="FREE_TEXT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PAYMENT_REF" type="{}PAYMENT_REFType"/&gt;
     *         &lt;element name="OTHER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "status",
        "freetext",
        "amount",
        "paymentref",
        "otherid"
    })
    public static class LISTOTHER
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected Object type;
        @XmlElement(name = "STATUS", required = true)
        protected Object status;
        @XmlElement(name = "FREE_TEXT")
        protected Object freetext;
        @XmlElement(name = "AMOUNT", required = true)
        protected PAYMENT.LISTOTHER.AMOUNT amount;
        @XmlElement(name = "PAYMENT_REF", required = true)
        protected PAYMENTREFType paymentref;
        @XmlElement(name = "OTHER_ID", required = true)
        protected Object otherid;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTYPE(Object value) {
            this.type = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTATUS(Object value) {
            this.status = value;
        }

        /**
         * Gets the value of the freetext property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getFREETEXT() {
            return freetext;
        }

        /**
         * Sets the value of the freetext property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setFREETEXT(Object value) {
            this.freetext = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link PAYMENT.LISTOTHER.AMOUNT }
         *     
         */
        public PAYMENT.LISTOTHER.AMOUNT getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PAYMENT.LISTOTHER.AMOUNT }
         *     
         */
        public void setAMOUNT(PAYMENT.LISTOTHER.AMOUNT value) {
            this.amount = value;
        }

        /**
         * Gets the value of the paymentref property.
         * 
         * @return
         *     possible object is
         *     {@link PAYMENTREFType }
         *     
         */
        public PAYMENTREFType getPAYMENTREF() {
            return paymentref;
        }

        /**
         * Sets the value of the paymentref property.
         * 
         * @param value
         *     allowed object is
         *     {@link PAYMENTREFType }
         *     
         */
        public void setPAYMENTREF(PAYMENTREFType value) {
            this.paymentref = value;
        }

        /**
         * Gets the value of the otherid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOTHERID() {
            return otherid;
        }

        /**
         * Sets the value of the otherid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOTHERID(Object value) {
            this.otherid = value;
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
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AMOUNT
            implements Serializable
        {


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
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="FAMILY"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="VALIDITY_PERIODE" type="{}PERIODEType" minOccurs="0"/&gt;
     *                   &lt;element name="TRAVEL_DATE" type="{}PERIODEType" maxOccurs="3" minOccurs="0"/&gt;
     *                   &lt;element name="PROMOTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="POS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="AMOUNT" type="{}ExtendedAMOUNTValueType" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_CONVERTED_AMOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NUMBER_OF_CODES" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="PAYMENT_REF" type="{}PAYMENT_REFType" minOccurs="0"/&gt;
     *                   &lt;element name="FAMILY_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PROMOTION_CODE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="CODE_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="ESTIMATED_DISCOUNTED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="VALUE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="CODE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PROMO_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "status",
        "family",
        "promotioncode",
        "promoid"
    })
    public static class LISTPROMOTION
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected Object type;
        @XmlElement(name = "STATUS", required = true)
        protected Object status;
        @XmlElement(name = "FAMILY", required = true)
        protected PAYMENT.LISTPROMOTION.FAMILY family;
        @XmlElement(name = "PROMOTION_CODE", required = true)
        protected List<PAYMENT.LISTPROMOTION.PROMOTIONCODE> promotioncode;
        @XmlElement(name = "PROMO_ID")
        protected Object promoid;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTYPE(Object value) {
            this.type = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTATUS(Object value) {
            this.status = value;
        }

        /**
         * Gets the value of the family property.
         * 
         * @return
         *     possible object is
         *     {@link PAYMENT.LISTPROMOTION.FAMILY }
         *     
         */
        public PAYMENT.LISTPROMOTION.FAMILY getFAMILY() {
            return family;
        }

        /**
         * Sets the value of the family property.
         * 
         * @param value
         *     allowed object is
         *     {@link PAYMENT.LISTPROMOTION.FAMILY }
         *     
         */
        public void setFAMILY(PAYMENT.LISTPROMOTION.FAMILY value) {
            this.family = value;
        }

        /**
         * Gets the value of the promotioncode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotioncode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPROMOTIONCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PAYMENT.LISTPROMOTION.PROMOTIONCODE }
         * 
         * 
         */
        public List<PAYMENT.LISTPROMOTION.PROMOTIONCODE> getPROMOTIONCODE() {
            if (promotioncode == null) {
                promotioncode = new ArrayList<PAYMENT.LISTPROMOTION.PROMOTIONCODE>();
            }
            return this.promotioncode;
        }

        /**
         * Gets the value of the promoid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPROMOID() {
            return promoid;
        }

        /**
         * Sets the value of the promoid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPROMOID(Object value) {
            this.promoid = value;
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
         *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="VALIDITY_PERIODE" type="{}PERIODEType" minOccurs="0"/&gt;
         *         &lt;element name="TRAVEL_DATE" type="{}PERIODEType" maxOccurs="3" minOccurs="0"/&gt;
         *         &lt;element name="PROMOTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="POS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="AMOUNT" type="{}ExtendedAMOUNTValueType" minOccurs="0"/&gt;
         *         &lt;element name="LIST_CONVERTED_AMOUNT" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NUMBER_OF_CODES" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="PAYMENT_REF" type="{}PAYMENT_REFType" minOccurs="0"/&gt;
         *         &lt;element name="FAMILY_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "status",
            "name",
            "validityperiode",
            "traveldate",
            "promotiontype",
            "pos",
            "amount",
            "listconvertedamount",
            "numberofcodes",
            "paymentref",
            "familyid"
        })
        public static class FAMILY
            implements Serializable
        {

            @XmlElement(name = "STATUS", required = true)
            protected Object status;
            @XmlElement(name = "NAME")
            protected Object name;
            @XmlElement(name = "VALIDITY_PERIODE")
            protected PERIODEType validityperiode;
            @XmlElement(name = "TRAVEL_DATE")
            protected List<PERIODEType> traveldate;
            @XmlElement(name = "PROMOTION_TYPE")
            protected Object promotiontype;
            @XmlElement(name = "POS")
            protected Object pos;
            @XmlElement(name = "AMOUNT")
            protected ExtendedAMOUNTValueType amount;
            @XmlElement(name = "LIST_CONVERTED_AMOUNT")
            protected List<PAYMENT.LISTPROMOTION.FAMILY.LISTCONVERTEDAMOUNT> listconvertedamount;
            @XmlElement(name = "NUMBER_OF_CODES", required = true)
            protected Object numberofcodes;
            @XmlElement(name = "PAYMENT_REF")
            protected PAYMENTREFType paymentref;
            @XmlElement(name = "FAMILY_ID")
            protected Object familyid;

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSTATUS() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSTATUS(Object value) {
                this.status = value;
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

            /**
             * Gets the value of the validityperiode property.
             * 
             * @return
             *     possible object is
             *     {@link PERIODEType }
             *     
             */
            public PERIODEType getVALIDITYPERIODE() {
                return validityperiode;
            }

            /**
             * Sets the value of the validityperiode property.
             * 
             * @param value
             *     allowed object is
             *     {@link PERIODEType }
             *     
             */
            public void setVALIDITYPERIODE(PERIODEType value) {
                this.validityperiode = value;
            }

            /**
             * Gets the value of the traveldate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the traveldate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTRAVELDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PERIODEType }
             * 
             * 
             */
            public List<PERIODEType> getTRAVELDATE() {
                if (traveldate == null) {
                    traveldate = new ArrayList<PERIODEType>();
                }
                return this.traveldate;
            }

            /**
             * Gets the value of the promotiontype property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getPROMOTIONTYPE() {
                return promotiontype;
            }

            /**
             * Sets the value of the promotiontype property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setPROMOTIONTYPE(Object value) {
                this.promotiontype = value;
            }

            /**
             * Gets the value of the pos property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getPOS() {
                return pos;
            }

            /**
             * Sets the value of the pos property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setPOS(Object value) {
                this.pos = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link ExtendedAMOUNTValueType }
             *     
             */
            public ExtendedAMOUNTValueType getAMOUNT() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExtendedAMOUNTValueType }
             *     
             */
            public void setAMOUNT(ExtendedAMOUNTValueType value) {
                this.amount = value;
            }

            /**
             * Gets the value of the listconvertedamount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listconvertedamount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTCONVERTEDAMOUNT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PAYMENT.LISTPROMOTION.FAMILY.LISTCONVERTEDAMOUNT }
             * 
             * 
             */
            public List<PAYMENT.LISTPROMOTION.FAMILY.LISTCONVERTEDAMOUNT> getLISTCONVERTEDAMOUNT() {
                if (listconvertedamount == null) {
                    listconvertedamount = new ArrayList<PAYMENT.LISTPROMOTION.FAMILY.LISTCONVERTEDAMOUNT>();
                }
                return this.listconvertedamount;
            }

            /**
             * Gets the value of the numberofcodes property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getNUMBEROFCODES() {
                return numberofcodes;
            }

            /**
             * Sets the value of the numberofcodes property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setNUMBEROFCODES(Object value) {
                this.numberofcodes = value;
            }

            /**
             * Gets the value of the paymentref property.
             * 
             * @return
             *     possible object is
             *     {@link PAYMENTREFType }
             *     
             */
            public PAYMENTREFType getPAYMENTREF() {
                return paymentref;
            }

            /**
             * Sets the value of the paymentref property.
             * 
             * @param value
             *     allowed object is
             *     {@link PAYMENTREFType }
             *     
             */
            public void setPAYMENTREF(PAYMENTREFType value) {
                this.paymentref = value;
            }

            /**
             * Gets the value of the familyid property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getFAMILYID() {
                return familyid;
            }

            /**
             * Sets the value of the familyid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setFAMILYID(Object value) {
                this.familyid = value;
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
             *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
                "value",
                "currency"
            })
            public static class LISTCONVERTEDAMOUNT
                implements Serializable
            {

                @XmlElement(name = "VALUE", required = true)
                protected Object value;
                @XmlElement(name = "CURRENCY", required = true)
                protected Object currency;

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

                /**
                 * Gets the value of the currency property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getCURRENCY() {
                    return currency;
                }

                /**
                 * Sets the value of the currency property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setCURRENCY(Object value) {
                    this.currency = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="CODE_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="ESTIMATED_DISCOUNTED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="VALUE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="CODE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "status",
            "codevalue",
            "estimateddiscountedamount",
            "valuetype",
            "codeid",
            "segmentid"
        })
        public static class PROMOTIONCODE
            implements Serializable
        {

            @XmlElement(name = "STATUS", required = true)
            protected Object status;
            @XmlElement(name = "CODE_VALUE", required = true)
            protected Object codevalue;
            @XmlElement(name = "ESTIMATED_DISCOUNTED_AMOUNT")
            protected BigDecimal estimateddiscountedamount;
            @XmlElement(name = "VALUE_TYPE")
            protected String valuetype;
            @XmlElement(name = "CODE_ID")
            protected Object codeid;
            @XmlElement(name = "SEGMENT_ID")
            protected Object segmentid;

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSTATUS() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSTATUS(Object value) {
                this.status = value;
            }

            /**
             * Gets the value of the codevalue property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCODEVALUE() {
                return codevalue;
            }

            /**
             * Sets the value of the codevalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCODEVALUE(Object value) {
                this.codevalue = value;
            }

            /**
             * Gets the value of the estimateddiscountedamount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getESTIMATEDDISCOUNTEDAMOUNT() {
                return estimateddiscountedamount;
            }

            /**
             * Sets the value of the estimateddiscountedamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setESTIMATEDDISCOUNTEDAMOUNT(BigDecimal value) {
                this.estimateddiscountedamount = value;
            }

            /**
             * Gets the value of the valuetype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVALUETYPE() {
                return valuetype;
            }

            /**
             * Sets the value of the valuetype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVALUETYPE(String value) {
                this.valuetype = value;
            }

            /**
             * Gets the value of the codeid property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCODEID() {
                return codeid;
            }

            /**
             * Sets the value of the codeid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCODEID(Object value) {
                this.codeid = value;
            }

            /**
             * Gets the value of the segmentid property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSEGMENTID() {
                return segmentid;
            }

            /**
             * Sets the value of the segmentid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSEGMENTID(Object value) {
                this.segmentid = value;
            }

        }

    }

}
