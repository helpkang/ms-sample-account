
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADDITIONAL_MILES_COST_INFO_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADDITIONAL_MILES_COST_INFO_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TAX_INCLUSIVE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TAX_INCLUSIVE_PROMOTION_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PROMOTION_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PROMOTION_DISCOUNT_PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADDITIONAL_MILES_COST_INFO_type", propOrder = {
    "tax",
    "taxinclusive",
    "taxinclusivepromotiondiscount",
    "promotiondiscount",
    "promotiondiscountpercentage"
})
public class ADDITIONALMILESCOSTINFOType
    implements Serializable
{

    @XmlElement(name = "TAX")
    protected BigInteger tax;
    @XmlElement(name = "TAX_INCLUSIVE")
    protected BigInteger taxinclusive;
    @XmlElement(name = "TAX_INCLUSIVE_PROMOTION_DISCOUNT")
    protected BigInteger taxinclusivepromotiondiscount;
    @XmlElement(name = "PROMOTION_DISCOUNT")
    protected BigInteger promotiondiscount;
    @XmlElement(name = "PROMOTION_DISCOUNT_PERCENTAGE")
    protected Object promotiondiscountpercentage;

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAX() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAX(BigInteger value) {
        this.tax = value;
    }

    /**
     * Gets the value of the taxinclusive property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINCLUSIVE() {
        return taxinclusive;
    }

    /**
     * Sets the value of the taxinclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINCLUSIVE(BigInteger value) {
        this.taxinclusive = value;
    }

    /**
     * Gets the value of the taxinclusivepromotiondiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTAXINCLUSIVEPROMOTIONDISCOUNT() {
        return taxinclusivepromotiondiscount;
    }

    /**
     * Sets the value of the taxinclusivepromotiondiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTAXINCLUSIVEPROMOTIONDISCOUNT(BigInteger value) {
        this.taxinclusivepromotiondiscount = value;
    }

    /**
     * Gets the value of the promotiondiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPROMOTIONDISCOUNT() {
        return promotiondiscount;
    }

    /**
     * Sets the value of the promotiondiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPROMOTIONDISCOUNT(BigInteger value) {
        this.promotiondiscount = value;
    }

    /**
     * Gets the value of the promotiondiscountpercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPROMOTIONDISCOUNTPERCENTAGE() {
        return promotiondiscountpercentage;
    }

    /**
     * Sets the value of the promotiondiscountpercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPROMOTIONDISCOUNTPERCENTAGE(Object value) {
        this.promotiondiscountpercentage = value;
    }

}
