
package com.koreanair.external.eretail.vo.fareshopper.fareshoppercommonsimpletypes;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="TYPE_CODE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="C"/&gt;
 *               &lt;enumeration value="T"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAX_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="INTERNAL_TAX_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="VALUE_QUALIFIER" type="{}ValueQualifierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "typecode",
    "taxcode",
    "internaltaxcode",
    "value",
    "valuequalifier"
})
public class TaxType
    implements Serializable
{

    @XmlElement(name = "TYPE_CODE")
    protected String typecode;
    @XmlElement(name = "TAX_CODE")
    protected String taxcode;
    @XmlElement(name = "INTERNAL_TAX_CODE")
    protected String internaltaxcode;
    @XmlElement(name = "VALUE")
    protected BigDecimal value;
    @XmlElement(name = "VALUE_QUALIFIER")
    @XmlSchemaType(name = "string")
    protected ValueQualifierType valuequalifier;

    /**
     * Gets the value of the typecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPECODE() {
        return typecode;
    }

    /**
     * Sets the value of the typecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPECODE(String value) {
        this.typecode = value;
    }

    /**
     * Gets the value of the taxcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXCODE() {
        return taxcode;
    }

    /**
     * Sets the value of the taxcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXCODE(String value) {
        this.taxcode = value;
    }

    /**
     * Gets the value of the internaltaxcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERNALTAXCODE() {
        return internaltaxcode;
    }

    /**
     * Sets the value of the internaltaxcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERNALTAXCODE(String value) {
        this.internaltaxcode = value;
    }

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
     * Gets the value of the valuequalifier property.
     * 
     * @return
     *     possible object is
     *     {@link ValueQualifierType }
     *     
     */
    public ValueQualifierType getVALUEQUALIFIER() {
        return valuequalifier;
    }

    /**
     * Sets the value of the valuequalifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueQualifierType }
     *     
     */
    public void setVALUEQUALIFIER(ValueQualifierType value) {
        this.valuequalifier = value;
    }

}
