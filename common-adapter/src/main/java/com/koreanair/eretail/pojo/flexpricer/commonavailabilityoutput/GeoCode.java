
package com.koreanair.eretail.pojo.flexpricer.commonavailabilityoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LATITUDE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="LONGITUDE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoCode", propOrder = {
    "latitude",
    "longitude"
})
public class GeoCode
    implements Serializable
{

    @XmlElement(name = "LATITUDE")
    protected double latitude;
    @XmlElement(name = "LONGITUDE")
    protected double longitude;

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLATITUDE() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLATITUDE(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLONGITUDE() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLONGITUDE(double value) {
        this.longitude = value;
    }

}
