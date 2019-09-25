
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilityinputtype;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Segments associated to the given document.
 * 
 * <p>Java class for ASSOCIATED_SEGMENT_TypeFlex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASSOCIATED_SEGMENT_TypeFlex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SEGMENT_TATTOO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FLOWN_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASSOCIATED_SEGMENT_TypeFlex", propOrder = {
    "segmentid",
    "segmenttattoo",
    "flownindicator"
})
public class ASSOCIATEDSEGMENTTypeFlex
    implements Serializable
{

    @XmlElement(name = "SEGMENT_ID", required = true)
    protected BigInteger segmentid;
    @XmlElement(name = "SEGMENT_TATTOO")
    protected BigInteger segmenttattoo;
    @XmlElement(name = "FLOWN_INDICATOR")
    protected boolean flownindicator;

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTID(BigInteger value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the segmenttattoo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTTATTOO() {
        return segmenttattoo;
    }

    /**
     * Sets the value of the segmenttattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTTATTOO(BigInteger value) {
        this.segmenttattoo = value;
    }

    /**
     * Gets the value of the flownindicator property.
     * 
     */
    public boolean isFLOWNINDICATOR() {
        return flownindicator;
    }

    /**
     * Sets the value of the flownindicator property.
     * 
     */
    public void setFLOWNINDICATOR(boolean value) {
        this.flownindicator = value;
    }

}
