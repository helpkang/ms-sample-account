
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
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
 *         &lt;element name="STREET_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZIP_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="GEOCODE" type="{}GEOCODE_TYPE" minOccurs="0"/&gt;
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
    "streetaddress",
    "zipcode",
    "geocode"
})
@XmlRootElement(name = "LIST_ADDRESS")
public class LISTADDRESS
    implements Serializable
{

    @XmlElement(name = "STREET_ADDRESS")
    protected String streetaddress;
    @XmlElement(name = "ZIP_CODE")
    protected String zipcode;
    @XmlElement(name = "GEOCODE")
    protected GEOCODETYPE geocode;

    /**
     * Gets the value of the streetaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTREETADDRESS() {
        return streetaddress;
    }

    /**
     * Sets the value of the streetaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTREETADDRESS(String value) {
        this.streetaddress = value;
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
     * Gets the value of the geocode property.
     * 
     * @return
     *     possible object is
     *     {@link GEOCODETYPE }
     *     
     */
    public GEOCODETYPE getGEOCODE() {
        return geocode;
    }

    /**
     * Sets the value of the geocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEOCODETYPE }
     *     
     */
    public void setGEOCODE(GEOCODETYPE value) {
        this.geocode = value;
    }

}
