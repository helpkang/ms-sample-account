
package com.koreanair.eretail.pojo.fareshopper.fareshoppercommon;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requested Fee
 * 
 * <p>Java class for FeeType_Input complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeType_Input"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SUBTYPE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CONDITION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;group ref="{}FormOfPaymentFeeConditionGroup"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "FeeType_Input", propOrder = {
    "typecode",
    "subtypecode",
    "condition"
})
public class FeeTypeInput
    implements Serializable
{

    @XmlElement(name = "TYPE_CODE", required = true)
    protected BigInteger typecode;
    @XmlElement(name = "SUBTYPE_CODE", required = true)
    protected String subtypecode;
    @XmlElement(name = "CONDITION")
    protected FeeTypeInput.CONDITION condition;

    /**
     * Gets the value of the typecode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTYPECODE() {
        return typecode;
    }

    /**
     * Sets the value of the typecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTYPECODE(BigInteger value) {
        this.typecode = value;
    }

    /**
     * Gets the value of the subtypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTYPECODE() {
        return subtypecode;
    }

    /**
     * Sets the value of the subtypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTYPECODE(String value) {
        this.subtypecode = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link FeeTypeInput.CONDITION }
     *     
     */
    public FeeTypeInput.CONDITION getCONDITION() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeTypeInput.CONDITION }
     *     
     */
    public void setCONDITION(FeeTypeInput.CONDITION value) {
        this.condition = value;
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
     *       &lt;choice&gt;
     *         &lt;group ref="{}FormOfPaymentFeeConditionGroup"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "creditcardbinnumber",
        "transactionamount"
    })
    public static class CONDITION
        implements Serializable
    {

        @XmlElement(name = "CREDIT_CARD_BIN_NUMBER")
        protected BigInteger creditcardbinnumber;
        @XmlElement(name = "TRANSACTION_AMOUNT")
        protected BigDecimal transactionamount;

        /**
         * Gets the value of the creditcardbinnumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCREDITCARDBINNUMBER() {
            return creditcardbinnumber;
        }

        /**
         * Sets the value of the creditcardbinnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCREDITCARDBINNUMBER(BigInteger value) {
            this.creditcardbinnumber = value;
        }

        /**
         * Gets the value of the transactionamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTRANSACTIONAMOUNT() {
            return transactionamount;
        }

        /**
         * Sets the value of the transactionamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTRANSACTIONAMOUNT(BigDecimal value) {
            this.transactionamount = value;
        }

    }

}
