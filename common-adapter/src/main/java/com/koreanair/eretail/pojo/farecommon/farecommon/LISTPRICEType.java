
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Amount data containing balance and rebooking information.
 * 
 * <p>Java class for LIST_PRICE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_PRICE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}REBOOK_FEE" minOccurs="0"/&gt;
 *         &lt;element ref="{}NO_SHOW_FEE" minOccurs="0"/&gt;
 *         &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CURRENCY" type="{}CURRENCY_Type"/&gt;
 *         &lt;element name="REBOOK_BALANCE" type="{}REBOOK_BALANCE_TRAV_Type"/&gt;
 *         &lt;element name="COLLECT_BALANCE" type="{}REBOOK_BALANCE_TRAV_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_PRICE_Type", propOrder = {
    "rebookfee",
    "noshowfee",
    "exchangerate",
    "currency",
    "rebookbalance",
    "collectbalance"
})
public class LISTPRICEType
    implements Serializable
{

    @XmlElement(name = "REBOOK_FEE")
    protected REBOOKFEEType rebookfee;
    @XmlElement(name = "NO_SHOW_FEE")
    protected REBOOKFEEType noshowfee;
    @XmlElement(name = "EXCHANGE_RATE", required = true)
    protected BigDecimal exchangerate;
    @XmlElement(name = "CURRENCY", required = true)
    protected CURRENCYType currency;
    @XmlElement(name = "REBOOK_BALANCE", required = true)
    protected REBOOKBALANCETRAVType rebookbalance;
    @XmlElement(name = "COLLECT_BALANCE")
    protected REBOOKBALANCETRAVType collectbalance;

    /**
     * Gets the value of the rebookfee property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKFEEType }
     *     
     */
    public REBOOKFEEType getREBOOKFEE() {
        return rebookfee;
    }

    /**
     * Sets the value of the rebookfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKFEEType }
     *     
     */
    public void setREBOOKFEE(REBOOKFEEType value) {
        this.rebookfee = value;
    }

    /**
     * Gets the value of the noshowfee property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKFEEType }
     *     
     */
    public REBOOKFEEType getNOSHOWFEE() {
        return noshowfee;
    }

    /**
     * Sets the value of the noshowfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKFEEType }
     *     
     */
    public void setNOSHOWFEE(REBOOKFEEType value) {
        this.noshowfee = value;
    }

    /**
     * Gets the value of the exchangerate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXCHANGERATE() {
        return exchangerate;
    }

    /**
     * Sets the value of the exchangerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXCHANGERATE(BigDecimal value) {
        this.exchangerate = value;
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
     * Gets the value of the rebookbalance property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKBALANCETRAVType }
     *     
     */
    public REBOOKBALANCETRAVType getREBOOKBALANCE() {
        return rebookbalance;
    }

    /**
     * Sets the value of the rebookbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKBALANCETRAVType }
     *     
     */
    public void setREBOOKBALANCE(REBOOKBALANCETRAVType value) {
        this.rebookbalance = value;
    }

    /**
     * Gets the value of the collectbalance property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKBALANCETRAVType }
     *     
     */
    public REBOOKBALANCETRAVType getCOLLECTBALANCE() {
        return collectbalance;
    }

    /**
     * Sets the value of the collectbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKBALANCETRAVType }
     *     
     */
    public void setCOLLECTBALANCE(REBOOKBALANCETRAVType value) {
        this.collectbalance = value;
    }

}
