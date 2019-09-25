
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REFUND_BALANCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REFUND_BALANCE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}AMOUNT" minOccurs="0"/&gt;
 *         &lt;element ref="{}AMOUNT_WITHOUT_TAX" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT_WITHOUT_TAX_USED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT_WITHOUT_TAX_PAID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element ref="{}TAX" minOccurs="0"/&gt;
 *         &lt;element ref="{}TAX_PAID" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}CURRENCY_Type" minOccurs="0"/&gt;
 *         &lt;element name="PENALTY" type="{}REBOOK_FEE_Type" minOccurs="0"/&gt;
 *         &lt;element name="REUSABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="REFUNDABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REFUND_BALANCE_Type", propOrder = {
    "amount",
    "amountwithouttax",
    "amountwithouttaxused",
    "amountwithouttaxpaid",
    "tax",
    "taxpaid",
    "currency",
    "penalty",
    "reusableamount",
    "refundableamount"
})
public class REFUNDBALANCEType
    implements Serializable
{

    @XmlElement(name = "AMOUNT")
    protected BigDecimal amount;
    @XmlElement(name = "AMOUNT_WITHOUT_TAX")
    protected BigDecimal amountwithouttax;
    @XmlElement(name = "AMOUNT_WITHOUT_TAX_USED")
    protected BigDecimal amountwithouttaxused;
    @XmlElement(name = "AMOUNT_WITHOUT_TAX_PAID")
    protected Object amountwithouttaxpaid;
    @XmlElement(name = "TAX")
    protected BigDecimal tax;
    @XmlElement(name = "TAX_PAID")
    protected BigDecimal taxpaid;
    @XmlElement(name = "CURRENCY")
    protected CURRENCYType currency;
    @XmlElement(name = "PENALTY")
    protected REBOOKFEEType penalty;
    @XmlElement(name = "REUSABLE_AMOUNT")
    protected BigDecimal reusableamount;
    @XmlElement(name = "REFUNDABLE_AMOUNT")
    protected BigDecimal refundableamount;

    /**
     * Amount to be refunded =  AMOUNT_WITHOUT_TAX + TAX - REFUND_FEE
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
     * Base fare amount to be refunded
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
     * Gets the value of the amountwithouttaxused property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTWITHOUTTAXUSED() {
        return amountwithouttaxused;
    }

    /**
     * Sets the value of the amountwithouttaxused property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTWITHOUTTAXUSED(BigDecimal value) {
        this.amountwithouttaxused = value;
    }

    /**
     * Gets the value of the amountwithouttaxpaid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAMOUNTWITHOUTTAXPAID() {
        return amountwithouttaxpaid;
    }

    /**
     * Sets the value of the amountwithouttaxpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAMOUNTWITHOUTTAXPAID(Object value) {
        this.amountwithouttaxpaid = value;
    }

    /**
     * Tax amount that will be refunded
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
     * Original Tax paid amount
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAXPAID() {
        return taxpaid;
    }

    /**
     * Sets the value of the taxpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAXPAID(BigDecimal value) {
        this.taxpaid = value;
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
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKFEEType }
     *     
     */
    public REBOOKFEEType getPENALTY() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKFEEType }
     *     
     */
    public void setPENALTY(REBOOKFEEType value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the reusableamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREUSABLEAMOUNT() {
        return reusableamount;
    }

    /**
     * Sets the value of the reusableamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREUSABLEAMOUNT(BigDecimal value) {
        this.reusableamount = value;
    }

    /**
     * Gets the value of the refundableamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREFUNDABLEAMOUNT() {
        return refundableamount;
    }

    /**
     * Sets the value of the refundableamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREFUNDABLEAMOUNT(BigDecimal value) {
        this.refundableamount = value;
    }

}
