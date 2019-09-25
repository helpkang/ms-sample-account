
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A description of the hotel
 * 
 * <p>Java class for MarketingTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingTextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LONG_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SHORT_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingTextType", propOrder = {
    "longtext",
    "shorttext",
    "language"
})
public class MarketingTextType
    implements Serializable
{

    @XmlElement(name = "LONG_TEXT")
    protected String longtext;
    @XmlElement(name = "SHORT_TEXT")
    protected String shorttext;
    @XmlElement(name = "LANGUAGE")
    protected String language;

    /**
     * Gets the value of the longtext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLONGTEXT() {
        return longtext;
    }

    /**
     * Sets the value of the longtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLONGTEXT(String value) {
        this.longtext = value;
    }

    /**
     * Gets the value of the shorttext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHORTTEXT() {
        return shorttext;
    }

    /**
     * Sets the value of the shorttext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHORTTEXT(String value) {
        this.shorttext = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
    }

}
