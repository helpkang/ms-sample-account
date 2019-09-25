
package com.koreanair.eretail.pojo.tripplan.ancillary_services;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CurrencyType;


/**
 * <p>Java class for servicePriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicePriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="DISCOUNT_INFORMATION" type="{}discountAmountType" minOccurs="0"/&gt;
 *             &lt;element name="INITIAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *             &lt;element name="BALANCED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *             &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *             &lt;group ref="{}servicePriceBreakdown" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicePriceType", propOrder = {
    "discountinformation",
    "initialamount",
    "balancedamount",
    "totalamount",
    "initialprice",
    "balancedprice",
    "totalprice",
    "currency"
})
public class ServicePriceType
    implements Serializable
{

    @XmlElement(name = "DISCOUNT_INFORMATION")
    protected DiscountAmountType discountinformation;
    @XmlElement(name = "INITIAL_AMOUNT")
    protected BigDecimal initialamount;
    @XmlElement(name = "BALANCED_AMOUNT")
    protected BigDecimal balancedamount;
    @XmlElement(name = "TOTAL_AMOUNT")
    protected BigDecimal totalamount;
    @XmlElement(name = "INITIAL_PRICE")
    protected AmountWithTaxes initialprice;
    @XmlElement(name = "BALANCED_PRICE")
    protected AmountWithTaxes balancedprice;
    @XmlElement(name = "TOTAL_PRICE")
    protected AmountWithTaxes totalprice;
    @XmlElement(name = "CURRENCY", required = true)
    protected CurrencyType currency;

    /**
     * Gets the value of the discountinformation property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountAmountType }
     *     
     */
    public DiscountAmountType getDISCOUNTINFORMATION() {
        return discountinformation;
    }

    /**
     * Sets the value of the discountinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountAmountType }
     *     
     */
    public void setDISCOUNTINFORMATION(DiscountAmountType value) {
        this.discountinformation = value;
    }

    /**
     * Gets the value of the initialamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINITIALAMOUNT() {
        return initialamount;
    }

    /**
     * Sets the value of the initialamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINITIALAMOUNT(BigDecimal value) {
        this.initialamount = value;
    }

    /**
     * Gets the value of the balancedamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBALANCEDAMOUNT() {
        return balancedamount;
    }

    /**
     * Sets the value of the balancedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBALANCEDAMOUNT(BigDecimal value) {
        this.balancedamount = value;
    }

    /**
     * Gets the value of the totalamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALAMOUNT() {
        return totalamount;
    }

    /**
     * Sets the value of the totalamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALAMOUNT(BigDecimal value) {
        this.totalamount = value;
    }

    /**
     * Gets the value of the initialprice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountWithTaxes }
     *     
     */
    public AmountWithTaxes getINITIALPRICE() {
        return initialprice;
    }

    /**
     * Sets the value of the initialprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountWithTaxes }
     *     
     */
    public void setINITIALPRICE(AmountWithTaxes value) {
        this.initialprice = value;
    }

    /**
     * Gets the value of the balancedprice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountWithTaxes }
     *     
     */
    public AmountWithTaxes getBALANCEDPRICE() {
        return balancedprice;
    }

    /**
     * Sets the value of the balancedprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountWithTaxes }
     *     
     */
    public void setBALANCEDPRICE(AmountWithTaxes value) {
        this.balancedprice = value;
    }

    /**
     * Gets the value of the totalprice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountWithTaxes }
     *     
     */
    public AmountWithTaxes getTOTALPRICE() {
        return totalprice;
    }

    /**
     * Sets the value of the totalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountWithTaxes }
     *     
     */
    public void setTOTALPRICE(AmountWithTaxes value) {
        this.totalprice = value;
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
