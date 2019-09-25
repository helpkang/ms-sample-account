
package com.koreanair.eretail.pojo.specialservices.commonservices;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CurrencyType;
import com.koreanair.eretail.pojo.tripplan.ancillary_services.DiscountAmountType;


/**
 * <p>Java class for selectionTotalAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selectionTotalAmountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INITIAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BALANCED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *         &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT_INFORMATION" type="{}discountAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectionTotalAmountType", propOrder = {
    "initialamount",
    "balancedamount",
    "totalamount",
    "currency",
    "product",
    "pnr",
    "discountinformation"
})
public class SelectionTotalAmountType
    implements Serializable
{

    @XmlElement(name = "INITIAL_AMOUNT")
    protected BigDecimal initialamount;
    @XmlElement(name = "BALANCED_AMOUNT")
    protected BigDecimal balancedamount;
    @XmlElement(name = "TOTAL_AMOUNT", required = true)
    protected BigDecimal totalamount;
    @XmlElement(name = "CURRENCY", required = true)
    protected CurrencyType currency;
    @XmlElement(name = "PRODUCT")
    protected String product;
    @XmlElement(name = "PNR")
    protected String pnr;
    @XmlElement(name = "DISCOUNT_INFORMATION")
    protected DiscountAmountType discountinformation;

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

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCT() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCT(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the pnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNR() {
        return pnr;
    }

    /**
     * Sets the value of the pnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNR(String value) {
        this.pnr = value;
    }

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

}