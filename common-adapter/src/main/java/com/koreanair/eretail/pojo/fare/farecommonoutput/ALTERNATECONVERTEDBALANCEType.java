
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.CURRENCYType;


/**
 * <p>Java class for ALTERNATE_CONVERTED_BALANCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ALTERNATE_CONVERTED_BALANCE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}EXCHANGE_RATE"/&gt;
 *         &lt;element name="CURRENCY" type="{}CURRENCY_Type"/&gt;
 *         &lt;element name="ALTERNATE_BALANCE" type="{}ALTERNATE_BALANCE_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ALTERNATE_CONVERTED_BALANCE_Type", propOrder = {
    "exchangerate",
    "currency",
    "alternatebalance"
})
public class ALTERNATECONVERTEDBALANCEType
    implements Serializable
{

    @XmlElement(name = "EXCHANGE_RATE", required = true)
    protected BigDecimal exchangerate;
    @XmlElement(name = "CURRENCY", required = true)
    protected CURRENCYType currency;
    @XmlElement(name = "ALTERNATE_BALANCE", required = true)
    protected ALTERNATEBALANCEType alternatebalance;

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
     * Gets the value of the alternatebalance property.
     * 
     * @return
     *     possible object is
     *     {@link ALTERNATEBALANCEType }
     *     
     */
    public ALTERNATEBALANCEType getALTERNATEBALANCE() {
        return alternatebalance;
    }

    /**
     * Sets the value of the alternatebalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALTERNATEBALANCEType }
     *     
     */
    public void setALTERNATEBALANCE(ALTERNATEBALANCEType value) {
        this.alternatebalance = value;
    }

}
