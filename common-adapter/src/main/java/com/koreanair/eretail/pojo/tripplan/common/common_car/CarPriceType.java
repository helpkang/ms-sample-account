
package com.koreanair.eretail.pojo.tripplan.common.common_car;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CurrencyType;


/**
 * <p>Java class for carPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
 *         &lt;element name="EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NORMAL_PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DROPOFF_CHARGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="XMILE_PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carPriceType", propOrder = {
    "currency",
    "exchangerate",
    "normalprice",
    "totalprice",
    "dropoffcharge",
    "xmileprice"
})
public class CarPriceType
    implements Serializable
{

    @XmlElement(name = "CURRENCY")
    protected CurrencyType currency;
    @XmlElement(name = "EXCHANGE_RATE")
    protected BigDecimal exchangerate;
    @XmlElement(name = "NORMAL_PRICE")
    protected BigDecimal normalprice;
    @XmlElement(name = "TOTAL_PRICE")
    protected BigDecimal totalprice;
    @XmlElement(name = "DROPOFF_CHARGE")
    protected BigDecimal dropoffcharge;
    @XmlElement(name = "XMILE_PRICE")
    protected BigDecimal xmileprice;

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
     * Gets the value of the normalprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNORMALPRICE() {
        return normalprice;
    }

    /**
     * Sets the value of the normalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNORMALPRICE(BigDecimal value) {
        this.normalprice = value;
    }

    /**
     * Gets the value of the totalprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALPRICE() {
        return totalprice;
    }

    /**
     * Sets the value of the totalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALPRICE(BigDecimal value) {
        this.totalprice = value;
    }

    /**
     * Gets the value of the dropoffcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDROPOFFCHARGE() {
        return dropoffcharge;
    }

    /**
     * Sets the value of the dropoffcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDROPOFFCHARGE(BigDecimal value) {
        this.dropoffcharge = value;
    }

    /**
     * Gets the value of the xmileprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXMILEPRICE() {
        return xmileprice;
    }

    /**
     * Sets the value of the xmileprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXMILEPRICE(BigDecimal value) {
        this.xmileprice = value;
    }

}
