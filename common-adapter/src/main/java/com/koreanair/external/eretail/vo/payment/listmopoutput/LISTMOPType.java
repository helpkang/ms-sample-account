
package com.koreanair.external.eretail.vo.payment.listmopoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of Method Of Payment available per type of product to pay.
 * 
 * <p>Java class for LIST_MOP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_MOP_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="PROVIDER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PAYMENT_TYPE" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="SUBCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="LOCALIZATION_MAP" type="{}LOCALIZATION_MAP_Type" minOccurs="0"/&gt;
 *                   &lt;element name="PROVIDER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="EXTERNAL_PROCESS_NEEDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="ALLOW_ON_HOLD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="APC_ENABLED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="DUE_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="FEES" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="REFUNDABLE_ONLINE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="FOP_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_PARAMETER" type="{}LIST_MOP_PARAMETER_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LIST_MOP_Type", propOrder = {
    "type",
    "provider",
    "listpaymenttype"
})
public class LISTMOPType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "PROVIDER")
    protected String provider;
    @XmlElement(name = "LIST_PAYMENT_TYPE", required = true)
    protected List<LISTMOPType.LISTPAYMENTTYPE> listpaymenttype;

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
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDER() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDER(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the listpaymenttype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpaymenttype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPAYMENTTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMOPType.LISTPAYMENTTYPE }
     * 
     * 
     */
    public List<LISTMOPType.LISTPAYMENTTYPE> getLISTPAYMENTTYPE() {
        if (listpaymenttype == null) {
            listpaymenttype = new ArrayList<LISTMOPType.LISTPAYMENTTYPE>();
        }
        return this.listpaymenttype;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="SUBCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="LOCALIZATION_MAP" type="{}LOCALIZATION_MAP_Type" minOccurs="0"/&gt;
     *         &lt;element name="PROVIDER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNAL_PROCESS_NEEDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="ALLOW_ON_HOLD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="APC_ENABLED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="DUE_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="FEES" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="REFUNDABLE_ONLINE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="FOP_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_PARAMETER" type="{}LIST_MOP_PARAMETER_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "code",
        "subcode",
        "name",
        "localizationmap",
        "provider",
        "externalprocessneeded",
        "selected",
        "allowonhold",
        "apcenabled",
        "duedate",
        "fees",
        "refundableonline",
        "fopformat",
        "listparameter"
    })
    public static class LISTPAYMENTTYPE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "SUBCODE")
        protected String subcode;
        @XmlElement(name = "NAME")
        protected String name;
        @XmlElement(name = "LOCALIZATION_MAP")
        protected LOCALIZATIONMAPType localizationmap;
        @XmlElement(name = "PROVIDER")
        protected String provider;
        @XmlElement(name = "EXTERNAL_PROCESS_NEEDED")
        protected Boolean externalprocessneeded;
        @XmlElement(name = "SELECTED")
        protected Boolean selected;
        @XmlElement(name = "ALLOW_ON_HOLD")
        protected Object allowonhold;
        @XmlElement(name = "APC_ENABLED")
        protected Boolean apcenabled;
        @XmlElement(name = "DUE_DATE")
        protected Object duedate;
        @XmlElement(name = "FEES")
        protected List<LISTMOPType.LISTPAYMENTTYPE.FEES> fees;
        @XmlElement(name = "REFUNDABLE_ONLINE")
        protected Boolean refundableonline;
        @XmlElement(name = "FOP_FORMAT")
        protected String fopformat;
        @XmlElement(name = "LIST_PARAMETER")
        protected List<LISTMOPPARAMETERType> listparameter;

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
         * Gets the value of the subcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUBCODE() {
            return subcode;
        }

        /**
         * Sets the value of the subcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUBCODE(String value) {
            this.subcode = value;
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

        /**
         * Gets the value of the localizationmap property.
         * 
         * @return
         *     possible object is
         *     {@link LOCALIZATIONMAPType }
         *     
         */
        public LOCALIZATIONMAPType getLOCALIZATIONMAP() {
            return localizationmap;
        }

        /**
         * Sets the value of the localizationmap property.
         * 
         * @param value
         *     allowed object is
         *     {@link LOCALIZATIONMAPType }
         *     
         */
        public void setLOCALIZATIONMAP(LOCALIZATIONMAPType value) {
            this.localizationmap = value;
        }

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVIDER() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVIDER(String value) {
            this.provider = value;
        }

        /**
         * Gets the value of the externalprocessneeded property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEXTERNALPROCESSNEEDED() {
            return externalprocessneeded;
        }

        /**
         * Sets the value of the externalprocessneeded property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEXTERNALPROCESSNEEDED(Boolean value) {
            this.externalprocessneeded = value;
        }

        /**
         * Gets the value of the selected property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSELECTED() {
            return selected;
        }

        /**
         * Sets the value of the selected property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSELECTED(Boolean value) {
            this.selected = value;
        }

        /**
         * Gets the value of the allowonhold property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getALLOWONHOLD() {
            return allowonhold;
        }

        /**
         * Sets the value of the allowonhold property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setALLOWONHOLD(Object value) {
            this.allowonhold = value;
        }

        /**
         * Gets the value of the apcenabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAPCENABLED() {
            return apcenabled;
        }

        /**
         * Sets the value of the apcenabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAPCENABLED(Boolean value) {
            this.apcenabled = value;
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

        /**
         * Gets the value of the fees property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fees property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFEES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTMOPType.LISTPAYMENTTYPE.FEES }
         * 
         * 
         */
        public List<LISTMOPType.LISTPAYMENTTYPE.FEES> getFEES() {
            if (fees == null) {
                fees = new ArrayList<LISTMOPType.LISTPAYMENTTYPE.FEES>();
            }
            return this.fees;
        }

        /**
         * Gets the value of the refundableonline property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isREFUNDABLEONLINE() {
            return refundableonline;
        }

        /**
         * Sets the value of the refundableonline property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setREFUNDABLEONLINE(Boolean value) {
            this.refundableonline = value;
        }

        /**
         * Gets the value of the fopformat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFOPFORMAT() {
            return fopformat;
        }

        /**
         * Sets the value of the fopformat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFOPFORMAT(String value) {
            this.fopformat = value;
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
         * {@link LISTMOPPARAMETERType }
         * 
         * 
         */
        public List<LISTMOPPARAMETERType> getLISTPARAMETER() {
            if (listparameter == null) {
                listparameter = new ArrayList<LISTMOPPARAMETERType>();
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
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            "amount",
            "currency"
        })
        public static class FEES
            implements Serializable
        {

            @XmlElement(name = "AMOUNT", required = true)
            protected Object amount;
            @XmlElement(name = "CURRENCY", required = true)
            protected Object currency;

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

}
