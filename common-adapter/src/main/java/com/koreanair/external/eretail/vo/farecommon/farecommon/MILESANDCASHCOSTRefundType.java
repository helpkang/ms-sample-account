
package com.koreanair.external.eretail.vo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MILES_AND_CASH_COST_Refund_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MILES_AND_CASH_COST_Refund_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}CONVERTED_CASH_MILES"/&gt;
 *         &lt;element name="NON_CONVERTED_AMOUNT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}AMOUNT"/&gt;
 *                   &lt;element ref="{}TAX" minOccurs="0"/&gt;
 *                   &lt;element ref="{}AMOUNT_WITHOUT_TAX" minOccurs="0"/&gt;
 *                   &lt;element name="REUSABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="REFUNDABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}CONVERTED_AMOUNT" minOccurs="0"/&gt;
 *         &lt;element name="RESULTING_MILES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT_WITHOUT_TAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}MINIMUM_MILES_COST" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MILES_AND_CASH_COST_Refund_Type", propOrder = {
    "convertedcashmiles",
    "nonconvertedamount",
    "convertedamount",
    "resultingmiles",
    "minimummilescost"
})
public class MILESANDCASHCOSTRefundType
    implements Serializable
{

    @XmlElement(name = "CONVERTED_CASH_MILES", required = true)
    protected BigInteger convertedcashmiles;
    @XmlElement(name = "NON_CONVERTED_AMOUNT")
    protected MILESANDCASHCOSTRefundType.NONCONVERTEDAMOUNT nonconvertedamount;
    @XmlElement(name = "CONVERTED_AMOUNT")
    protected CONVERTEDAMOUNT convertedamount;
    @XmlElement(name = "RESULTING_MILES")
    protected MILESANDCASHCOSTRefundType.RESULTINGMILES resultingmiles;
    @XmlElement(name = "MINIMUM_MILES_COST")
    protected BigInteger minimummilescost;

    /**
     * Gets the value of the convertedcashmiles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCONVERTEDCASHMILES() {
        return convertedcashmiles;
    }

    /**
     * Sets the value of the convertedcashmiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCONVERTEDCASHMILES(BigInteger value) {
        this.convertedcashmiles = value;
    }

    /**
     * Gets the value of the nonconvertedamount property.
     * 
     * @return
     *     possible object is
     *     {@link MILESANDCASHCOSTRefundType.NONCONVERTEDAMOUNT }
     *     
     */
    public MILESANDCASHCOSTRefundType.NONCONVERTEDAMOUNT getNONCONVERTEDAMOUNT() {
        return nonconvertedamount;
    }

    /**
     * Sets the value of the nonconvertedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MILESANDCASHCOSTRefundType.NONCONVERTEDAMOUNT }
     *     
     */
    public void setNONCONVERTEDAMOUNT(MILESANDCASHCOSTRefundType.NONCONVERTEDAMOUNT value) {
        this.nonconvertedamount = value;
    }

    /**
     * Gets the value of the convertedamount property.
     * 
     * @return
     *     possible object is
     *     {@link CONVERTEDAMOUNT }
     *     
     */
    public CONVERTEDAMOUNT getCONVERTEDAMOUNT() {
        return convertedamount;
    }

    /**
     * Sets the value of the convertedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONVERTEDAMOUNT }
     *     
     */
    public void setCONVERTEDAMOUNT(CONVERTEDAMOUNT value) {
        this.convertedamount = value;
    }

    /**
     * Gets the value of the resultingmiles property.
     * 
     * @return
     *     possible object is
     *     {@link MILESANDCASHCOSTRefundType.RESULTINGMILES }
     *     
     */
    public MILESANDCASHCOSTRefundType.RESULTINGMILES getRESULTINGMILES() {
        return resultingmiles;
    }

    /**
     * Sets the value of the resultingmiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link MILESANDCASHCOSTRefundType.RESULTINGMILES }
     *     
     */
    public void setRESULTINGMILES(MILESANDCASHCOSTRefundType.RESULTINGMILES value) {
        this.resultingmiles = value;
    }

    /**
     * Gets the value of the minimummilescost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMINIMUMMILESCOST() {
        return minimummilescost;
    }

    /**
     * Sets the value of the minimummilescost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMINIMUMMILESCOST(BigInteger value) {
        this.minimummilescost = value;
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
     *         &lt;element ref="{}AMOUNT"/&gt;
     *         &lt;element ref="{}TAX" minOccurs="0"/&gt;
     *         &lt;element ref="{}AMOUNT_WITHOUT_TAX" minOccurs="0"/&gt;
     *         &lt;element name="REUSABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="REFUNDABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "tax",
        "amountwithouttax",
        "reusableamount",
        "refundableamount"
    })
    public static class NONCONVERTEDAMOUNT
        implements Serializable
    {

        @XmlElement(name = "AMOUNT", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "TAX")
        protected BigDecimal tax;
        @XmlElement(name = "AMOUNT_WITHOUT_TAX")
        protected BigDecimal amountwithouttax;
        @XmlElement(name = "REUSABLE_AMOUNT")
        protected Object reusableamount;
        @XmlElement(name = "REFUNDABLE_AMOUNT")
        protected Object refundableamount;

        /**
         * The total non converted cash amount. In the cash to miles conversion, some parts of the fare are converted to miles, and some others are not. The non-converted amout is provided here. 
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
         * The total non converted taxes amount. In the cash to miles conversion, some taxes of the fare are converted and some are not. The non-converted taxes is provided here.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTAX() {
            return tax;
        }

        /**
         * Sets the value of the tax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTAX(BigDecimal value) {
            this.tax = value;
        }

        /**
         * Gets the value of the amountwithouttax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNTWITHOUTTAX() {
            return amountwithouttax;
        }

        /**
         * Sets the value of the amountwithouttax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNTWITHOUTTAX(BigDecimal value) {
            this.amountwithouttax = value;
        }

        /**
         * Gets the value of the reusableamount property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getREUSABLEAMOUNT() {
            return reusableamount;
        }

        /**
         * Sets the value of the reusableamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setREUSABLEAMOUNT(Object value) {
            this.reusableamount = value;
        }

        /**
         * Gets the value of the refundableamount property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getREFUNDABLEAMOUNT() {
            return refundableamount;
        }

        /**
         * Sets the value of the refundableamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setREFUNDABLEAMOUNT(Object value) {
            this.refundableamount = value;
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
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT_WITHOUT_TAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "tax",
        "amountwithouttax"
    })
    public static class RESULTINGMILES
        implements Serializable
    {

        @XmlElement(name = "AMOUNT", required = true)
        protected BigInteger amount;
        @XmlElement(name = "TAX")
        protected BigInteger tax;
        @XmlElement(name = "AMOUNT_WITHOUT_TAX")
        protected BigInteger amountwithouttax;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAMOUNT(BigInteger value) {
            this.amount = value;
        }

        /**
         * Gets the value of the tax property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTAX() {
            return tax;
        }

        /**
         * Sets the value of the tax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTAX(BigInteger value) {
            this.tax = value;
        }

        /**
         * Gets the value of the amountwithouttax property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAMOUNTWITHOUTTAX() {
            return amountwithouttax;
        }

        /**
         * Sets the value of the amountwithouttax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAMOUNTWITHOUTTAX(BigInteger value) {
            this.amountwithouttax = value;
        }

    }

}
