
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STRUCTURED_OCCUPANCY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRUCTURED_OCCUPANCY"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OCCUPANCY_ADULT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OCCUPANCY_CHILD" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRUCTURED_OCCUPANCY", propOrder = {
    "occupancyadult",
    "occupancychild"
})
public class STRUCTUREDOCCUPANCY
    implements Serializable
{

    @XmlElement(name = "OCCUPANCY_ADULT", required = true)
    protected BigInteger occupancyadult;
    @XmlElement(name = "OCCUPANCY_CHILD")
    protected BigInteger occupancychild;

    /**
     * Gets the value of the occupancyadult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOCCUPANCYADULT() {
        return occupancyadult;
    }

    /**
     * Sets the value of the occupancyadult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOCCUPANCYADULT(BigInteger value) {
        this.occupancyadult = value;
    }

    /**
     * Gets the value of the occupancychild property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOCCUPANCYCHILD() {
        return occupancychild;
    }

    /**
     * Sets the value of the occupancychild property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOCCUPANCYCHILD(BigInteger value) {
        this.occupancychild = value;
    }

}
