
package com.koreanair.external.eretail.vo.payment.paymentoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.payment.amountcommon.AMOUNTValueType;


/**
 * <p>Java class for LIST_EXTERNAL_PAYMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_EXTERNAL_PAYMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="MERCHANT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ENCRYPTION_DATA" type="{}ENCRYPTION_DATAType" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENT_REFERENCE_RETURNED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PROVIDER_CONNECTION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PSP_URL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="ACKNOWLEDGMENT_URL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ENCRYPTION_CHECKSUM" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT" type="{}AMOUNTValueType" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="PAYMENT_REF" type="{}PAYMENT_REFType" minOccurs="0"/&gt;
 *         &lt;element name="EXT_PAYMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SUBEXTERNAL_PAYMENTS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MERCHANT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="PAYMENT_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOKEN" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PAYER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PAYPAL_ERROR_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_EXTERNAL_PAYMENT_Type", propOrder = {
    "status",
    "merchantid",
    "encryptiondata",
    "paymentreferencereturned",
    "providerconnection",
    "encryptionchecksum",
    "amount",
    "paymenttype",
    "paymentref",
    "extpaymentid",
    "location",
    "listsubexternalpayments",
    "token",
    "payerid",
    "paypalerrorcode"
})
public class LISTEXTERNALPAYMENTType
    implements Serializable
{

    @XmlElement(name = "STATUS", required = true)
    protected Object status;
    @XmlElement(name = "MERCHANT_ID")
    protected Object merchantid;
    @XmlElement(name = "ENCRYPTION_DATA")
    protected ENCRYPTIONDATAType encryptiondata;
    @XmlElement(name = "PAYMENT_REFERENCE_RETURNED")
    protected Object paymentreferencereturned;
    @XmlElement(name = "PROVIDER_CONNECTION")
    protected LISTEXTERNALPAYMENTType.PROVIDERCONNECTION providerconnection;
    @XmlElement(name = "ENCRYPTION_CHECKSUM")
    protected Object encryptionchecksum;
    @XmlElement(name = "AMOUNT")
    protected AMOUNTValueType amount;
    @XmlElement(name = "PAYMENT_TYPE", required = true)
    protected Object paymenttype;
    @XmlElement(name = "PAYMENT_REF")
    protected PAYMENTREFType paymentref;
    @XmlElement(name = "EXT_PAYMENT_ID")
    protected Object extpaymentid;
    @XmlElement(name = "LOCATION")
    protected Object location;
    @XmlElement(name = "LIST_SUBEXTERNAL_PAYMENTS")
    protected List<LISTEXTERNALPAYMENTType.LISTSUBEXTERNALPAYMENTS> listsubexternalpayments;
    @XmlElement(name = "TOKEN")
    protected Object token;
    @XmlElement(name = "PAYER_ID")
    protected Object payerid;
    @XmlElement(name = "PAYPAL_ERROR_CODE")
    protected Object paypalerrorcode;

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
     * Gets the value of the encryptiondata property.
     * 
     * @return
     *     possible object is
     *     {@link ENCRYPTIONDATAType }
     *     
     */
    public ENCRYPTIONDATAType getENCRYPTIONDATA() {
        return encryptiondata;
    }

    /**
     * Sets the value of the encryptiondata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENCRYPTIONDATAType }
     *     
     */
    public void setENCRYPTIONDATA(ENCRYPTIONDATAType value) {
        this.encryptiondata = value;
    }

    /**
     * Gets the value of the paymentreferencereturned property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPAYMENTREFERENCERETURNED() {
        return paymentreferencereturned;
    }

    /**
     * Sets the value of the paymentreferencereturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPAYMENTREFERENCERETURNED(Object value) {
        this.paymentreferencereturned = value;
    }

    /**
     * Gets the value of the providerconnection property.
     * 
     * @return
     *     possible object is
     *     {@link LISTEXTERNALPAYMENTType.PROVIDERCONNECTION }
     *     
     */
    public LISTEXTERNALPAYMENTType.PROVIDERCONNECTION getPROVIDERCONNECTION() {
        return providerconnection;
    }

    /**
     * Sets the value of the providerconnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTEXTERNALPAYMENTType.PROVIDERCONNECTION }
     *     
     */
    public void setPROVIDERCONNECTION(LISTEXTERNALPAYMENTType.PROVIDERCONNECTION value) {
        this.providerconnection = value;
    }

    /**
     * Gets the value of the encryptionchecksum property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getENCRYPTIONCHECKSUM() {
        return encryptionchecksum;
    }

    /**
     * Sets the value of the encryptionchecksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setENCRYPTIONCHECKSUM(Object value) {
        this.encryptionchecksum = value;
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
     * Gets the value of the paymenttype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPAYMENTTYPE() {
        return paymenttype;
    }

    /**
     * Sets the value of the paymenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPAYMENTTYPE(Object value) {
        this.paymenttype = value;
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
     * Gets the value of the extpaymentid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEXTPAYMENTID() {
        return extpaymentid;
    }

    /**
     * Sets the value of the extpaymentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEXTPAYMENTID(Object value) {
        this.extpaymentid = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLOCATION(Object value) {
        this.location = value;
    }

    /**
     * Gets the value of the listsubexternalpayments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsubexternalpayments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSUBEXTERNALPAYMENTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTEXTERNALPAYMENTType.LISTSUBEXTERNALPAYMENTS }
     * 
     * 
     */
    public List<LISTEXTERNALPAYMENTType.LISTSUBEXTERNALPAYMENTS> getLISTSUBEXTERNALPAYMENTS() {
        if (listsubexternalpayments == null) {
            listsubexternalpayments = new ArrayList<LISTEXTERNALPAYMENTType.LISTSUBEXTERNALPAYMENTS>();
        }
        return this.listsubexternalpayments;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTOKEN() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTOKEN(Object value) {
        this.token = value;
    }

    /**
     * Gets the value of the payerid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPAYERID() {
        return payerid;
    }

    /**
     * Sets the value of the payerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPAYERID(Object value) {
        this.payerid = value;
    }

    /**
     * Gets the value of the paypalerrorcode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPAYPALERRORCODE() {
        return paypalerrorcode;
    }

    /**
     * Sets the value of the paypalerrorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPAYPALERRORCODE(Object value) {
        this.paypalerrorcode = value;
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
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="PAYMENT_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "amount",
        "paymentreference",
        "status"
    })
    public static class LISTSUBEXTERNALPAYMENTS
        implements Serializable
    {

        @XmlElement(name = "MERCHANT_ID", required = true)
        protected Object merchantid;
        @XmlElement(name = "AMOUNT", required = true)
        protected Object amount;
        @XmlElement(name = "PAYMENT_REFERENCE", required = true)
        protected Object paymentreference;
        @XmlElement(name = "STATUS", required = true)
        protected Object status;

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
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAMOUNT(Object value) {
            this.amount = value;
        }

        /**
         * Gets the value of the paymentreference property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPAYMENTREFERENCE() {
            return paymentreference;
        }

        /**
         * Sets the value of the paymentreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPAYMENTREFERENCE(Object value) {
            this.paymentreference = value;
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
     *         &lt;element name="PSP_URL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="ACKNOWLEDGMENT_URL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "pspurl",
        "acknowledgmenturl"
    })
    public static class PROVIDERCONNECTION
        implements Serializable
    {

        @XmlElement(name = "PSP_URL", required = true)
        protected Object pspurl;
        @XmlElement(name = "ACKNOWLEDGMENT_URL", required = true)
        protected Object acknowledgmenturl;

        /**
         * Gets the value of the pspurl property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPSPURL() {
            return pspurl;
        }

        /**
         * Sets the value of the pspurl property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPSPURL(Object value) {
            this.pspurl = value;
        }

        /**
         * Gets the value of the acknowledgmenturl property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getACKNOWLEDGMENTURL() {
            return acknowledgmenturl;
        }

        /**
         * Sets the value of the acknowledgmenturl property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setACKNOWLEDGMENTURL(Object value) {
            this.acknowledgmenturl = value;
        }

    }

}
