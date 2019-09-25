
package com.koreanair.eretail.pojo.fareshopper.fareshoppercommonsimpletypes;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.DictionaryChoice;


/**
 *  Simple exchange rate with two currencies and a rate.
 * 
 * <p>Java class for Basic_ExchangeRate_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Basic_ExchangeRate_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="RATE_OF_EXCHANGE"/&gt;
 *               &lt;enumeration value="BANK_SELLING_RATE"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FROM_CURRENCY" type="{}DictionaryChoice"/&gt;
 *         &lt;element name="TO_CURRENCY" type="{}DictionaryChoice"/&gt;
 *         &lt;element name="RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ROUNDING_SIGNIFICANCE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ROUNDING_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Basic_ExchangeRate_Type", propOrder = {
    "type",
    "fromcurrency",
    "tocurrency",
    "rate",
    "roundingsignificance",
    "roundingvalue"
})
public class BasicExchangeRateType
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "FROM_CURRENCY", required = true)
    protected DictionaryChoice fromcurrency;
    @XmlElement(name = "TO_CURRENCY", required = true)
    protected DictionaryChoice tocurrency;
    @XmlElement(name = "RATE")
    protected BigDecimal rate;
    @XmlElement(name = "ROUNDING_SIGNIFICANCE")
    protected String roundingsignificance;
    @XmlElement(name = "ROUNDING_VALUE")
    protected BigDecimal roundingvalue;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the fromcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link DictionaryChoice }
     *     
     */
    public DictionaryChoice getFROMCURRENCY() {
        return fromcurrency;
    }

    /**
     * Sets the value of the fromcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryChoice }
     *     
     */
    public void setFROMCURRENCY(DictionaryChoice value) {
        this.fromcurrency = value;
    }

    /**
     * Gets the value of the tocurrency property.
     * 
     * @return
     *     possible object is
     *     {@link DictionaryChoice }
     *     
     */
    public DictionaryChoice getTOCURRENCY() {
        return tocurrency;
    }

    /**
     * Sets the value of the tocurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryChoice }
     *     
     */
    public void setTOCURRENCY(DictionaryChoice value) {
        this.tocurrency = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRATE() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRATE(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the roundingsignificance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUNDINGSIGNIFICANCE() {
        return roundingsignificance;
    }

    /**
     * Sets the value of the roundingsignificance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUNDINGSIGNIFICANCE(String value) {
        this.roundingsignificance = value;
    }

    /**
     * Gets the value of the roundingvalue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getROUNDINGVALUE() {
        return roundingvalue;
    }

    /**
     * Sets the value of the roundingvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setROUNDINGVALUE(BigDecimal value) {
        this.roundingvalue = value;
    }

}
