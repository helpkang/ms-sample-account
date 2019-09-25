
package com.koreanair.external.eretail.vo.tripplan.common.common_air_pricing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAX_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="NATURE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TAX_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IS_EXEMPTED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxType", propOrder = {
    "taxcode",
    "naturecode",
    "taxamount",
    "currencycode",
    "type",
    "isexempted"
})
public class TaxType
    implements Serializable
{

    @XmlElement(name = "TAX_CODE")
    protected String taxcode;
    @XmlElement(name = "NATURE_CODE")
    protected String naturecode;
    @XmlElement(name = "TAX_AMOUNT")
    protected String taxamount;
    @XmlElement(name = "CURRENCY_CODE")
    protected String currencycode;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "IS_EXEMPTED")
    protected Object isexempted;

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
     * Gets the value of the naturecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATURECODE() {
        return naturecode;
    }

    /**
     * Sets the value of the naturecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATURECODE(String value) {
        this.naturecode = value;
    }

    /**
     * Gets the value of the taxamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXAMOUNT() {
        return taxamount;
    }

    /**
     * Sets the value of the taxamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXAMOUNT(String value) {
        this.taxamount = value;
    }

    /**
     * Gets the value of the currencycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYCODE() {
        return currencycode;
    }

    /**
     * Sets the value of the currencycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYCODE(String value) {
        this.currencycode = value;
    }

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
     * Gets the value of the isexempted property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISEXEMPTED() {
        return isexempted;
    }

    /**
     * Sets the value of the isexempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISEXEMPTED(Object value) {
        this.isexempted = value;
    }

}
