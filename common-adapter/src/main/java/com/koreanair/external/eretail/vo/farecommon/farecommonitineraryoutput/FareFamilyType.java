
package com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A textual description of fare family that fare and flights belong to.
 * 
 * <p>Java class for FareFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFamilyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="SHORT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="BRAND_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="COLOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="HIGHLIGHTING_COLOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="COLOR_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="HIERARCHY" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *           &lt;element name="IS_DYNAMIC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="REF_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFamilyType", propOrder = {
    "shortname",
    "brandname",
    "color",
    "highlightingcolor",
    "colorname",
    "hierarchy",
    "isdynamic",
    "refnumber"
})
public class FareFamilyType
    implements Serializable
{

    @XmlElement(name = "SHORT_NAME")
    protected String shortname;
    @XmlElement(name = "BRAND_NAME")
    protected String brandname;
    @XmlElement(name = "COLOR")
    protected String color;
    @XmlElement(name = "HIGHLIGHTING_COLOR")
    protected String highlightingcolor;
    @XmlElement(name = "COLOR_NAME")
    protected String colorname;
    @XmlElement(name = "HIERARCHY")
    protected BigInteger hierarchy;
    @XmlElement(name = "IS_DYNAMIC")
    protected Boolean isdynamic;
    @XmlElement(name = "REF_NUMBER")
    protected Object refnumber;

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

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLOR() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLOR(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the highlightingcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHIGHLIGHTINGCOLOR() {
        return highlightingcolor;
    }

    /**
     * Sets the value of the highlightingcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHIGHLIGHTINGCOLOR(String value) {
        this.highlightingcolor = value;
    }

    /**
     * Gets the value of the colorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLORNAME() {
        return colorname;
    }

    /**
     * Sets the value of the colorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLORNAME(String value) {
        this.colorname = value;
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
     * Gets the value of the isdynamic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISDYNAMIC() {
        return isdynamic;
    }

    /**
     * Sets the value of the isdynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISDYNAMIC(Boolean value) {
        this.isdynamic = value;
    }

    /**
     * Gets the value of the refnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREFNUMBER() {
        return refnumber;
    }

    /**
     * Sets the value of the refnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREFNUMBER(Object value) {
        this.refnumber = value;
    }

}
