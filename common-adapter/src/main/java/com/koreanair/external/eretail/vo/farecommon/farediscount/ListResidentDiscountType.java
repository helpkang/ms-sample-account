
package com.koreanair.external.eretail.vo.farecommon.farediscount;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of resident discounts.
 * 
 * <p>Java class for listResidentDiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listResidentDiscountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAVELLER_TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DISCOUNT_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="PAX_CATEGORY" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="CARD_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ZIP_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CERT_NUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listResidentDiscountType", propOrder = {
    "travellertype",
    "travellerid",
    "discountcode",
    "paxcategory",
    "cardnum",
    "zipcode",
    "certnum"
})
public class ListResidentDiscountType
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_TYPE", required = true)
    protected String travellertype;
    @XmlElement(name = "TRAVELLER_ID", required = true)
    protected BigInteger travellerid;
    @XmlElement(name = "DISCOUNT_CODE", required = true)
    protected String discountcode;
    @XmlElement(name = "PAX_CATEGORY", required = true)
    protected String paxcategory;
    @XmlElement(name = "CARD_NUM", required = true)
    protected String cardnum;
    @XmlElement(name = "ZIP_CODE", required = true)
    protected String zipcode;
    @XmlElement(name = "CERT_NUM")
    protected String certnum;

    /**
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERTYPE(String value) {
        this.travellertype = value;
    }

    /**
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRAVELLERID(BigInteger value) {
        this.travellerid = value;
    }

    /**
     * Gets the value of the discountcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTCODE() {
        return discountcode;
    }

    /**
     * Sets the value of the discountcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTCODE(String value) {
        this.discountcode = value;
    }

    /**
     * Gets the value of the paxcategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAXCATEGORY() {
        return paxcategory;
    }

    /**
     * Sets the value of the paxcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAXCATEGORY(String value) {
        this.paxcategory = value;
    }

    /**
     * Gets the value of the cardnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNUM() {
        return cardnum;
    }

    /**
     * Sets the value of the cardnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNUM(String value) {
        this.cardnum = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPCODE() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPCODE(String value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the certnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCERTNUM() {
        return certnum;
    }

    /**
     * Sets the value of the certnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCERTNUM(String value) {
        this.certnum = value;
    }

}
