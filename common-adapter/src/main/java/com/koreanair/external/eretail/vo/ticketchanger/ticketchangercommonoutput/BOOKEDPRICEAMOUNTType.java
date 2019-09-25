
package com.koreanair.external.eretail.vo.ticketchanger.ticketchangercommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.AMOUNTSIMPLEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.CURRENCYType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.MILESANDCASHCOSTRefundType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.SingleAmountType;


/**
 * <p>Java class for BOOKED_PRICE_AMOUNT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOOKED_PRICE_AMOUNT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}AMOUNT_SIMPLE_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REFUND_BALANCE"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}SingleAmount_Type"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REUSABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="REFUNDABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="MILES_AND_CASH_COST" type="{}MILES_AND_CASH_COST_Refund_Type" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NON_REFUNDABLE_VALUE" type="{}AMOUNT_SIMPLE_Type" minOccurs="0"/&gt;
 *         &lt;element name="NON_REUSABLE_VALUE" type="{}SingleAmount_Type" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}CURRENCY_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOOKED_PRICE_AMOUNT_Type", propOrder = {
    "refundbalance",
    "nonrefundablevalue",
    "nonreusablevalue",
    "currency"
})
public class BOOKEDPRICEAMOUNTType
    extends AMOUNTSIMPLEType
    implements Serializable
{

    @XmlElement(name = "REFUND_BALANCE", required = true)
    protected BOOKEDPRICEAMOUNTType.REFUNDBALANCE refundbalance;
    @XmlElement(name = "NON_REFUNDABLE_VALUE")
    protected AMOUNTSIMPLEType nonrefundablevalue;
    @XmlElement(name = "NON_REUSABLE_VALUE")
    protected SingleAmountType nonreusablevalue;
    @XmlElement(name = "CURRENCY", required = true)
    protected CURRENCYType currency;

    /**
     * Gets the value of the refundbalance property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKEDPRICEAMOUNTType.REFUNDBALANCE }
     *     
     */
    public BOOKEDPRICEAMOUNTType.REFUNDBALANCE getREFUNDBALANCE() {
        return refundbalance;
    }

    /**
     * Sets the value of the refundbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKEDPRICEAMOUNTType.REFUNDBALANCE }
     *     
     */
    public void setREFUNDBALANCE(BOOKEDPRICEAMOUNTType.REFUNDBALANCE value) {
        this.refundbalance = value;
    }

    /**
     * Gets the value of the nonrefundablevalue property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTSIMPLEType }
     *     
     */
    public AMOUNTSIMPLEType getNONREFUNDABLEVALUE() {
        return nonrefundablevalue;
    }

    /**
     * Sets the value of the nonrefundablevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTSIMPLEType }
     *     
     */
    public void setNONREFUNDABLEVALUE(AMOUNTSIMPLEType value) {
        this.nonrefundablevalue = value;
    }

    /**
     * Gets the value of the nonreusablevalue property.
     * 
     * @return
     *     possible object is
     *     {@link SingleAmountType }
     *     
     */
    public SingleAmountType getNONREUSABLEVALUE() {
        return nonreusablevalue;
    }

    /**
     * Sets the value of the nonreusablevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleAmountType }
     *     
     */
    public void setNONREUSABLEVALUE(SingleAmountType value) {
        this.nonreusablevalue = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCYType }
     *     
     */
    public CURRENCYType getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCYType }
     *     
     */
    public void setCURRENCY(CURRENCYType value) {
        this.currency = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}SingleAmount_Type"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="REUSABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="REFUNDABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="MILES_AND_CASH_COST" type="{}MILES_AND_CASH_COST_Refund_Type" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reusableamount",
        "refundableamount",
        "milesandcashcost"
    })
    public static class REFUNDBALANCE
        extends SingleAmountType
        implements Serializable
    {

        @XmlElement(name = "REUSABLE_AMOUNT")
        protected Object reusableamount;
        @XmlElement(name = "REFUNDABLE_AMOUNT")
        protected Object refundableamount;
        @XmlElement(name = "MILES_AND_CASH_COST")
        protected MILESANDCASHCOSTRefundType milesandcashcost;

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

        /**
         * Gets the value of the milesandcashcost property.
         * 
         * @return
         *     possible object is
         *     {@link MILESANDCASHCOSTRefundType }
         *     
         */
        public MILESANDCASHCOSTRefundType getMILESANDCASHCOST() {
            return milesandcashcost;
        }

        /**
         * Sets the value of the milesandcashcost property.
         * 
         * @param value
         *     allowed object is
         *     {@link MILESANDCASHCOSTRefundType }
         *     
         */
        public void setMILESANDCASHCOST(MILESANDCASHCOSTRefundType value) {
            this.milesandcashcost = value;
        }

    }

}
