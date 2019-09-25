
package com.koreanair.eretail.pojo.flexpricer.flexpricercommoninput;

import java.io.Serializable;
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
 *         &lt;element name="SHORT_NAME" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="FARE_PUBLISHING_CARRIER" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="TYPE_OF_FARE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FARE_CLASS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="PRIME_BOOKING_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_FAMILY_COMBINABILITY"/&gt;
 *         &lt;element name="HIERARCHY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="COLOR_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="BRAND_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
    "shortname",
    "farepublishingcarrier",
    "typeoffare",
    "fareclass",
    "primebookingcode",
    "farefamilycombinability",
    "hierarchy",
    "colorcode",
    "brandname"
})
@XmlRootElement(name = "LIST_LIGHT_FARE_FAMILY")
public class LISTLIGHTFAREFAMILY
    implements Serializable
{

    @XmlElement(name = "SHORT_NAME", required = true)
    protected String shortname;
    @XmlElement(name = "FARE_PUBLISHING_CARRIER", required = true)
    protected String farepublishingcarrier;
    @XmlElement(name = "TYPE_OF_FARE")
    protected String typeoffare;
    @XmlElement(name = "FARE_CLASS")
    protected String fareclass;
    @XmlElement(name = "PRIME_BOOKING_CODE")
    protected String primebookingcode;
    @XmlElement(name = "FARE_FAMILY_COMBINABILITY")
    protected boolean farefamilycombinability;
    @XmlElement(name = "HIERARCHY", required = true)
    protected BigInteger hierarchy;
    @XmlElement(name = "COLOR_CODE")
    protected String colorcode;
    @XmlElement(name = "BRAND_NAME")
    protected String brandname;

    /**
     * Gets the value of the shortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHORTNAME() {
        return shortname;
    }

    /**
     * Sets the value of the shortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHORTNAME(String value) {
        this.shortname = value;
    }

    /**
     * Gets the value of the farepublishingcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREPUBLISHINGCARRIER() {
        return farepublishingcarrier;
    }

    /**
     * Sets the value of the farepublishingcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREPUBLISHINGCARRIER(String value) {
        this.farepublishingcarrier = value;
    }

    /**
     * Gets the value of the typeoffare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEOFFARE() {
        return typeoffare;
    }

    /**
     * Sets the value of the typeoffare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEOFFARE(String value) {
        this.typeoffare = value;
    }

    /**
     * Gets the value of the fareclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECLASS() {
        return fareclass;
    }

    /**
     * Sets the value of the fareclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECLASS(String value) {
        this.fareclass = value;
    }

    /**
     * Gets the value of the primebookingcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIMEBOOKINGCODE() {
        return primebookingcode;
    }

    /**
     * Sets the value of the primebookingcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIMEBOOKINGCODE(String value) {
        this.primebookingcode = value;
    }

    /**
     * Gets the value of the farefamilycombinability property.
     * 
     */
    public boolean isFAREFAMILYCOMBINABILITY() {
        return farefamilycombinability;
    }

    /**
     * Sets the value of the farefamilycombinability property.
     * 
     */
    public void setFAREFAMILYCOMBINABILITY(boolean value) {
        this.farefamilycombinability = value;
    }

    /**
     * Gets the value of the hierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHIERARCHY() {
        return hierarchy;
    }

    /**
     * Sets the value of the hierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHIERARCHY(BigInteger value) {
        this.hierarchy = value;
    }

    /**
     * Gets the value of the colorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLORCODE() {
        return colorcode;
    }

    /**
     * Sets the value of the colorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLORCODE(String value) {
        this.colorcode = value;
    }

    /**
     * Gets the value of the brandname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANDNAME() {
        return brandname;
    }

    /**
     * Sets the value of the brandname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANDNAME(String value) {
        this.brandname = value;
    }

}
