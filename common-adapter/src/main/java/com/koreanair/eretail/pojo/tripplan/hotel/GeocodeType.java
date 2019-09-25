
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geocode type
 * 
 * <p>Java class for GeocodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeocodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LATITUDE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LONGITUDE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeType", propOrder = {
    "latitude",
    "longitude"
})
public class GeocodeType
    implements Serializable
{

    @XmlElement(name = "LATITUDE")
    protected int latitude;
    @XmlElement(name = "LONGITUDE")
    protected int longitude;

    /**
     * Gets the value of the latitude property.
     * 
     */
    public int getLATITUDE() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLATITUDE(int value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public int getLONGITUDE() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLONGITUDE(int value) {
        this.longitude = value;
    }

}
