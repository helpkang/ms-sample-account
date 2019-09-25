
package com.koreanair.eretail.pojo.farecommon.farecommonitineraryoutput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MILEAGE_INFORMATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MILEAGE_INFORMATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TICKETED_POINT_MILEAGE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MAXIMUM_PERMITTED_MILEAGE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MILEAGE_INFORMATION_Type", propOrder = {
    "ticketedpointmileage",
    "maximumpermittedmileage"
})
public class MILEAGEINFORMATIONType
    implements Serializable
{

    @XmlElement(name = "TICKETED_POINT_MILEAGE")
    protected BigInteger ticketedpointmileage;
    @XmlElement(name = "MAXIMUM_PERMITTED_MILEAGE")
    protected BigInteger maximumpermittedmileage;

    /**
     * Gets the value of the ticketedpointmileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTICKETEDPOINTMILEAGE() {
        return ticketedpointmileage;
    }

    /**
     * Sets the value of the ticketedpointmileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTICKETEDPOINTMILEAGE(BigInteger value) {
        this.ticketedpointmileage = value;
    }

    /**
     * Gets the value of the maximumpermittedmileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMAXIMUMPERMITTEDMILEAGE() {
        return maximumpermittedmileage;
    }

    /**
     * Sets the value of the maximumpermittedmileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMAXIMUMPERMITTEDMILEAGE(BigInteger value) {
        this.maximumpermittedmileage = value;
    }

}
