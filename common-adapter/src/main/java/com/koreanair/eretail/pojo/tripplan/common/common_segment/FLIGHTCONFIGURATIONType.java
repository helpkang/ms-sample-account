
package com.koreanair.eretail.pojo.tripplan.common.common_segment;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FLIGHT_CONFIGURATION_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FLIGHT_CONFIGURATION_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AIRCRAFT_CONFIG_VERSION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SALEABLE_CONFIG" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FLIGHT_CONFIGURATION_type", propOrder = {
    "aircraftconfigversion",
    "saleableconfig"
})
public class FLIGHTCONFIGURATIONType
    implements Serializable
{

    @XmlElement(name = "AIRCRAFT_CONFIG_VERSION")
    protected Object aircraftconfigversion;
    @XmlElement(name = "SALEABLE_CONFIG")
    protected String saleableconfig;

    /**
     * Gets the value of the aircraftconfigversion property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAIRCRAFTCONFIGVERSION() {
        return aircraftconfigversion;
    }

    /**
     * Sets the value of the aircraftconfigversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAIRCRAFTCONFIGVERSION(Object value) {
        this.aircraftconfigversion = value;
    }

    /**
     * Gets the value of the saleableconfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALEABLECONFIG() {
        return saleableconfig;
    }

    /**
     * Sets the value of the saleableconfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALEABLECONFIG(String value) {
        this.saleableconfig = value;
    }

}
