
package com.koreanair.eretail.pojo.fareshopper.fareshoppercommon;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CURRENCY_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeValueType", propOrder = {
    "value",
    "currencyid"
})
public class FeeValueType
    implements Serializable
{

    @XmlElement(name = "VALUE", required = true)
    protected BigDecimal value;
    @XmlElement(name = "CURRENCY_ID")
    protected Integer currencyid;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALUE(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the currencyid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCURRENCYID() {
        return currencyid;
    }

    /**
     * Sets the value of the currencyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCURRENCYID(Integer value) {
        this.currencyid = value;
    }

}
