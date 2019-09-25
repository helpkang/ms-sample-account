
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for REVIEW_COMPANY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REVIEW_COMPANY"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TEMPLATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="PRODUCT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="BRAND" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SUBBRAND" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SITE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REVIEW_COMPANY", propOrder = {
    "template",
    "product",
    "brand",
    "subbrand",
    "site"
})
public class REVIEWCOMPANY
    implements Serializable
{

    @XmlElement(name = "TEMPLATE")
    protected String template;
    @XmlElement(name = "PRODUCT")
    protected String product;
    @XmlElement(name = "BRAND")
    protected String brand;
    @XmlElement(name = "SUBBRAND")
    protected String subbrand;
    @XmlElement(name = "SITE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar site;

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMPLATE() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMPLATE(String value) {
        this.template = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCT() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCT(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRAND() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRAND(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the subbrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBBRAND() {
        return subbrand;
    }

    /**
     * Sets the value of the subbrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBBRAND(String value) {
        this.subbrand = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSITE() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSITE(XMLGregorianCalendar value) {
        this.site = value;
    }

}
