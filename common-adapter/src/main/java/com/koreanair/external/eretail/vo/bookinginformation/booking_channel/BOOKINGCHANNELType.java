
package com.koreanair.external.eretail.vo.bookinginformation.booking_channel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the system used to book (for reporting purpose).
 * 
 * <p>Java class for BOOKING_CHANNELType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOOKING_CHANNELType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="APP_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="APP_VERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OS_VERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEVICE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOOKING_CHANNELType", propOrder = {
    "appname",
    "appversion",
    "osversion",
    "devicename"
})
public class BOOKINGCHANNELType
    implements Serializable
{

    @XmlElement(name = "APP_NAME")
    protected String appname;
    @XmlElement(name = "APP_VERSION")
    protected String appversion;
    @XmlElement(name = "OS_VERSION")
    protected String osversion;
    @XmlElement(name = "DEVICE_NAME")
    protected String devicename;

    /**
     * Gets the value of the appname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPNAME() {
        return appname;
    }

    /**
     * Sets the value of the appname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPNAME(String value) {
        this.appname = value;
    }

    /**
     * Gets the value of the appversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPVERSION() {
        return appversion;
    }

    /**
     * Sets the value of the appversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPVERSION(String value) {
        this.appversion = value;
    }

    /**
     * Gets the value of the osversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSVERSION() {
        return osversion;
    }

    /**
     * Sets the value of the osversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSVERSION(String value) {
        this.osversion = value;
    }

    /**
     * Gets the value of the devicename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEVICENAME() {
        return devicename;
    }

    /**
     * Sets the value of the devicename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEVICENAME(String value) {
        this.devicename = value;
    }

}
