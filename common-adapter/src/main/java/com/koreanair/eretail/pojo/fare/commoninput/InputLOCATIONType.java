
package com.koreanair.eretail.pojo.fare.commoninput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Input_LOCATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Input_LOCATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOCATION_CODE" type="{}CODE_Type"/&gt;
 *         &lt;element name="CITY_CODE" type="{}CODE_Type"/&gt;
 *         &lt;element name="STATE_CODE" type="{}CODE_Type" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY_CODE" type="{}CODE_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Input_LOCATION_Type", propOrder = {
    "locationcode",
    "citycode",
    "statecode",
    "countrycode"
})
public class InputLOCATIONType
    implements Serializable
{

    @XmlElement(name = "LOCATION_CODE", required = true)
    protected String locationcode;
    @XmlElement(name = "CITY_CODE", required = true)
    protected String citycode;
    @XmlElement(name = "STATE_CODE")
    protected String statecode;
    @XmlElement(name = "COUNTRY_CODE")
    protected String countrycode;

    /**
     * Gets the value of the locationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONCODE() {
        return locationcode;
    }

    /**
     * Sets the value of the locationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONCODE(String value) {
        this.locationcode = value;
    }

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

}
