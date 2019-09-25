
package com.koreanair.eretail.pojo.flexpricer.commonavailabilityoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputCityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputCityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CITY_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GEOCODE" type="{}GeoCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputCityType", propOrder = {
    "citycode",
    "cityname",
    "statecode",
    "statename",
    "countrycode",
    "countryname",
    "geocode"
})
@XmlSeeAlso({
    LocationType.class
})
public class OutputCityType
    implements Serializable
{

    @XmlElement(name = "CITY_CODE", required = true)
    protected String citycode;
    @XmlElement(name = "CITY_NAME", required = true)
    protected String cityname;
    @XmlElement(name = "STATE_CODE")
    protected String statecode;
    @XmlElement(name = "STATE_NAME")
    protected String statename;
    @XmlElement(name = "COUNTRY_CODE")
    protected String countrycode;
    @XmlElement(name = "COUNTRY_NAME")
    protected String countryname;
    @XmlElement(name = "GEOCODE")
    protected GeoCode geocode;

    /**
     * Gets the value of the citycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITYCODE() {
        return citycode;
    }

    /**
     * Sets the value of the citycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITYCODE(String value) {
        this.citycode = value;
    }

    /**
     * Gets the value of the cityname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITYNAME() {
        return cityname;
    }

    /**
     * Sets the value of the cityname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITYNAME(String value) {
        this.cityname = value;
    }

    /**
     * Gets the value of the statecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATECODE() {
        return statecode;
    }

    /**
     * Sets the value of the statecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATECODE(String value) {
        this.statecode = value;
    }

    /**
     * Gets the value of the statename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATENAME() {
        return statename;
    }

    /**
     * Sets the value of the statename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATENAME(String value) {
        this.statename = value;
    }

    /**
     * Gets the value of the countrycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRYCODE() {
        return countrycode;
    }

    /**
     * Sets the value of the countrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRYCODE(String value) {
        this.countrycode = value;
    }

    /**
     * Gets the value of the countryname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRYNAME() {
        return countryname;
    }

    /**
     * Sets the value of the countryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRYNAME(String value) {
        this.countryname = value;
    }

    /**
     * Gets the value of the geocode property.
     * 
     * @return
     *     possible object is
     *     {@link GeoCode }
     *     
     */
    public GeoCode getGEOCODE() {
        return geocode;
    }

    /**
     * Sets the value of the geocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCode }
     *     
     */
    public void setGEOCODE(GeoCode value) {
        this.geocode = value;
    }

}
