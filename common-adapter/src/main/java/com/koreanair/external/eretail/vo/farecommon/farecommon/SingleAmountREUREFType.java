
package com.koreanair.external.eretail.vo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SingleAmount_REU_REF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SingleAmount_REU_REF_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}AMOUNT"/&gt;
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
@XmlType(name = "SingleAmount_REU_REF_Type", propOrder = {
    "amount",
    "reusableamount",
    "refundableamount"
})
public class SingleAmountREUREFType
    implements Serializable
{

    @XmlElement(name = "AMOUNT", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "REUSABLE_AMOUNT")
    protected Object reusableamount;
    @XmlElement(name = "REFUNDABLE_AMOUNT")
    protected Object refundableamount;

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
