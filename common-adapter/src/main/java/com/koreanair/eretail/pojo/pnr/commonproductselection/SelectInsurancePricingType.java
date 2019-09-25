
package com.koreanair.eretail.pojo.pnr.commonproductselection;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * If you want to select an insurance pricing from the structure: LIST_INSURANCE_PRICING_PER_PRODUCT
 * 
 * 
 * <p>Java class for SelectInsurancePricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectInsurancePricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PROVIDER_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="PRODUCT_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="EXTENSION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectInsurancePricingType", propOrder = {
    "providercode",
    "productcode",
    "extensioncode",
    "travellerid",
    "contactid"
})
public class SelectInsurancePricingType {

    @XmlElement(name = "PROVIDER_CODE", required = true)
    protected String providercode;
    @XmlElement(name = "PRODUCT_CODE", required = true)
    protected String productcode;
    @XmlElement(name = "EXTENSION_CODE")
    protected String extensioncode;
    @XmlElement(name = "TRAVELLER_ID", required = true)
    protected BigInteger travellerid;
    @XmlElement(name = "CONTACT_ID")
    protected BigInteger contactid;

    /**
     * Gets the value of the providercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDERCODE() {
        return providercode;
    }

    /**
     * Sets the value of the providercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDERCODE(String value) {
        this.providercode = value;
    }

    /**
     * Gets the value of the productcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTCODE() {
        return productcode;
    }

    /**
     * Sets the value of the productcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTCODE(String value) {
        this.productcode = value;
    }

    /**
     * Gets the value of the extensioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTENSIONCODE() {
        return extensioncode;
    }

    /**
     * Sets the value of the extensioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTENSIONCODE(String value) {
        this.extensioncode = value;
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
     * Gets the value of the contactid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCONTACTID() {
        return contactid;
    }

    /**
     * Sets the value of the contactid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCONTACTID(BigInteger value) {
        this.contactid = value;
    }

}
