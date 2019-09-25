
package com.koreanair.external.eretail.vo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_TAX_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TAX_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAX_STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="S"/&gt;
 *               &lt;enumeration value="E"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element ref="{}REISSUE_STATUS" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}CURRENCY_Type" minOccurs="0"/&gt;
 *         &lt;element name="TAX_NATURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TAX_Type", propOrder = {
    "taxstatus",
    "code",
    "value",
    "reissuestatus",
    "currency",
    "taxnature"
})
public class LISTTAXType
    implements Serializable
{

    @XmlElement(name = "TAX_STATUS")
    protected String taxstatus;
    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "VALUE", required = true)
    protected BigDecimal value;
    @XmlElement(name = "REISSUE_STATUS")
    protected String reissuestatus;
    @XmlElement(name = "CURRENCY")
    protected CURRENCYType currency;
    @XmlElement(name = "TAX_NATURE")
    protected String taxnature;

    /**
     * Gets the value of the taxstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXSTATUS() {
        return taxstatus;
    }

    /**
     * Sets the value of the taxstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXSTATUS(String value) {
        this.taxstatus = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
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
     * Gets the value of the reissuestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREISSUESTATUS() {
        return reissuestatus;
    }

    /**
     * Sets the value of the reissuestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREISSUESTATUS(String value) {
        this.reissuestatus = value;
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
     * Gets the value of the taxnature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXNATURE() {
        return taxnature;
    }

    /**
     * Sets the value of the taxnature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXNATURE(String value) {
        this.taxnature = value;
    }

}
