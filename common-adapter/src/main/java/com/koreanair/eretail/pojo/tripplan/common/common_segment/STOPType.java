
package com.koreanair.eretail.pojo.tripplan.common.common_segment;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STOP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STOP_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOCATION" type="{}Leg_LOCATION_Type"/&gt;
 *         &lt;element name="DURATION" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STOP_Type", propOrder = {
    "location",
    "duration"
})
public class STOPType
    implements Serializable
{

    @XmlElement(name = "LOCATION", required = true)
    protected LegLOCATIONType location;
    @XmlElement(name = "DURATION")
    protected BigInteger duration;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LegLOCATIONType }
     *     
     */
    public LegLOCATIONType getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegLOCATIONType }
     *     
     */
    public void setLOCATION(LegLOCATIONType value) {
        this.location = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDURATION() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDURATION(BigInteger value) {
        this.duration = value;
    }

}
