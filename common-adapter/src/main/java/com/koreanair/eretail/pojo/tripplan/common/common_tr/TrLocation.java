
package com.koreanair.eretail.pojo.tripplan.common.common_tr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Location type
 * 
 * <p>Java class for trLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COUNTRY" type="{}trAlphaNumericType"/&gt;
 *         &lt;element name="REGION" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="CITY" type="{}trAlphaNumericType"/&gt;
 *         &lt;element name="LINE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LINE2" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="ZIP" type="{}trAlphaNumericType"/&gt;
 *         &lt;element name="LATITUDE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LONGITUDE" type="{}unprotectedStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trLocation", propOrder = {
    "country",
    "region",
    "city",
    "line",
    "line2",
    "zip",
    "latitude",
    "longitude"
})
public class TrLocation
    implements Serializable
{

    @XmlElement(name = "COUNTRY", required = true)
    protected String country;
    @XmlElement(name = "REGION", required = true)
    protected String region;
    @XmlElement(name = "CITY", required = true)
    protected String city;
    @XmlElement(name = "LINE", required = true)
    protected String line;
    @XmlElement(name = "LINE2", required = true)
    protected String line2;
    @XmlElement(name = "ZIP", required = true)
    protected String zip;
    @XmlElement(name = "LATITUDE", required = true)
    protected String latitude;
    @XmlElement(name = "LONGITUDE", required = true)
    protected String longitude;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGION() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGION(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINE() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINE(String value) {
        this.line = value;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINE2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINE2(String value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIP() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIP(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLATITUDE() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLATITUDE(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLONGITUDE() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLONGITUDE(String value) {
        this.longitude = value;
    }

}
