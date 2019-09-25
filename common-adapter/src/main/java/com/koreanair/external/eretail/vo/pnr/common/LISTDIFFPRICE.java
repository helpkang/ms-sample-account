
package com.koreanair.external.eretail.vo.pnr.common;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="OLD_PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="NEW_PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DIFF_PRICE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CURRENCY" type="{}CODE_NAME_TYPE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "type",
    "itemid",
    "oldprice",
    "newprice",
    "diffprice",
    "currency"
})
@XmlRootElement(name = "LIST_DIFF_PRICE")
public class LISTDIFFPRICE {

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "ITEM_ID")
    protected BigInteger itemid;
    @XmlElement(name = "OLD_PRICE", required = true)
    protected BigDecimal oldprice;
    @XmlElement(name = "NEW_PRICE", required = true)
    protected BigDecimal newprice;
    @XmlElement(name = "DIFF_PRICE", required = true)
    protected BigDecimal diffprice;
    @XmlElement(name = "CURRENCY", required = true, nillable = true)
    protected CODENAMETYPE currency;

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
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMID(BigInteger value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the oldprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOLDPRICE() {
        return oldprice;
    }

    /**
     * Sets the value of the oldprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOLDPRICE(BigDecimal value) {
        this.oldprice = value;
    }

    /**
     * Gets the value of the newprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNEWPRICE() {
        return newprice;
    }

    /**
     * Sets the value of the newprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNEWPRICE(BigDecimal value) {
        this.newprice = value;
    }

    /**
     * Gets the value of the diffprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDIFFPRICE() {
        return diffprice;
    }

    /**
     * Sets the value of the diffprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDIFFPRICE(BigDecimal value) {
        this.diffprice = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPE }
     *     
     */
    public CODENAMETYPE getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPE }
     *     
     */
    public void setCURRENCY(CODENAMETYPE value) {
        this.currency = value;
    }

}
