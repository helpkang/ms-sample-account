
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Predefined location type.
 * 
 * <p>Java class for PREDEFINED_LOCATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PREDEFINED_LOCATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOCATION_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CITY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOOKUP_IN_DEST_BUILDER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_POI_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_CITY_TOWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PREDEFINED_LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_COUNTRY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_STATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_POI_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="STATE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_POI_CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_POI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_STREET_ADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_POSTAL_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PREDEFINED_LOCATION_TYPE", propOrder = {
    "locationtype",
    "countrycode",
    "countryname",
    "citycode",
    "cityname",
    "lookupindestbuilder",
    "hotelpoitype",
    "hotelcitytown",
    "predefinedlocationcode",
    "locationcode",
    "locationname",
    "hotelcountry",
    "hotelstate",
    "hotelpoicity",
    "statecode",
    "statename",
    "hotelpoicitycode",
    "hotelpoi",
    "hotelstreetaddr",
    "hotelpostalcode",
    "description"
})
public class PREDEFINEDLOCATIONTYPE
    implements Serializable
{

    @XmlElement(name = "LOCATION_TYPE")
    protected String locationtype;
    @XmlElement(name = "COUNTRY_CODE")
    protected String countrycode;
    @XmlElement(name = "COUNTRY_NAME")
    protected String countryname;
    @XmlElement(name = "CITY_CODE")
    protected String citycode;
    @XmlElement(name = "CITY_NAME")
    protected String cityname;
    @XmlElement(name = "LOOKUP_IN_DEST_BUILDER")
    protected Boolean lookupindestbuilder;
    @XmlElement(name = "HOTEL_POI_TYPE")
    protected String hotelpoitype;
    @XmlElement(name = "HOTEL_CITY_TOWN")
    protected String hotelcitytown;
    @XmlElement(name = "PREDEFINED_LOCATION_CODE")
    protected String predefinedlocationcode;
    @XmlElement(name = "LOCATION_CODE")
    protected String locationcode;
    @XmlElement(name = "LOCATION_NAME")
    protected String locationname;
    @XmlElement(name = "HOTEL_COUNTRY")
    protected String hotelcountry;
    @XmlElement(name = "HOTEL_STATE")
    protected String hotelstate;
    @XmlElement(name = "HOTEL_POI_CITY")
    protected String hotelpoicity;
    @XmlElement(name = "STATE_CODE")
    protected String statecode;
    @XmlElement(name = "STATE_NAME")
    protected String statename;
    @XmlElement(name = "HOTEL_POI_CITY_CODE")
    protected String hotelpoicitycode;
    @XmlElement(name = "HOTEL_POI")
    protected String hotelpoi;
    @XmlElement(name = "HOTEL_STREET_ADDR")
    protected String hotelstreetaddr;
    @XmlElement(name = "HOTEL_POSTAL_CODE")
    protected String hotelpostalcode;
    @XmlElement(name = "DESCRIPTION")
    protected String description;

    /**
     * Gets the value of the locationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONTYPE() {
        return locationtype;
    }

    /**
     * Sets the value of the locationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONTYPE(String value) {
        this.locationtype = value;
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
     * Gets the value of the lookupindestbuilder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLOOKUPINDESTBUILDER() {
        return lookupindestbuilder;
    }

    /**
     * Sets the value of the lookupindestbuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLOOKUPINDESTBUILDER(Boolean value) {
        this.lookupindestbuilder = value;
    }

    /**
     * Gets the value of the hotelpoitype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOTELPOITYPE() {
        return hotelpoitype;
    }

    /**
     * Sets the value of the hotelpoitype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOTELPOITYPE(String value) {
        this.hotelpoitype = value;
    }

    /**
     * Gets the value of the hotelcitytown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOTELCITYTOWN() {
        return hotelcitytown;
    }

    /**
     * Sets the value of the hotelcitytown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOTELCITYTOWN(String value) {
        this.hotelcitytown = value;
    }

    /**
     * Gets the value of the predefinedlocationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREDEFINEDLOCATIONCODE() {
        return predefinedlocationcode;
    }

    /**
     * Sets the value of the predefinedlocationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREDEFINEDLOCATIONCODE(String value) {
        this.predefinedlocationcode = value;
    }

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
     * Gets the value of the locationname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATIONNAME() {
        return locationname;
    }

    /**
     * Sets the value of the locationname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATIONNAME(String value) {
        this.locationname = value;
    }

    /**
     * Gets the value of the hotelcountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOTELCOUNTRY() {
        return hotelcountry;
    }

    /**
     * Sets the value of the hotelcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOTELCOUNTRY(String value) {
        this.hotelcountry = value;
    }

    /**
     * Gets the value of the hotelstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOTELSTATE() {
        return hotelstate;
    }

    /**
     * Sets the value of the hotelstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOTELSTATE(String value) {
        this.hotelstate = value;
    }

    /**
     * Gets the value of the hotelpoicity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOTELPOICITY() {
        return hotelpoicity;
    }

    /**
     * Sets the value of the hotelpoicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOTELPOICITY(String value) {
        this.hotelpoicity = value;
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
     * Gets the value of the hotelpoicitycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOTELPOICITYCODE() {
        return hotelpoicitycode;
    }

    /**
     * Sets the value of the hotelpoicitycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOTELPOICITYCODE(String value) {
        this.hotelpoicitycode = value;
    }

    /**
     * Gets the value of the hotelpoi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOTELPOI() {
        return hotelpoi;
    }

    /**
     * Sets the value of the hotelpoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOTELPOI(String value) {
        this.hotelpoi = value;
    }

    /**
     * Gets the value of the hotelstreetaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOTELSTREETADDR() {
        return hotelstreetaddr;
    }

    /**
     * Sets the value of the hotelstreetaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOTELSTREETADDR(String value) {
        this.hotelstreetaddr = value;
    }

    /**
     * Gets the value of the hotelpostalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOTELPOSTALCODE() {
        return hotelpostalcode;
    }

    /**
     * Sets the value of the hotelpostalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOTELPOSTALCODE(String value) {
        this.hotelpostalcode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

}
