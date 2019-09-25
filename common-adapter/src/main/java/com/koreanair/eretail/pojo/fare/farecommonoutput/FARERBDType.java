
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FARE_RBD_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_RBD_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RBD" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="FARE_BASIS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FARE_BREAK_POINT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="AVAIL_CONNECTION_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SEGMENT_ID" type="{}SEGMENT_ID_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FARE_RBD_Type", propOrder = {
    "rbd",
    "farebasis",
    "farebreakpoint",
    "availconnectiontype",
    "segmentid"
})
public class FARERBDType
    implements Serializable
{

    @XmlElement(name = "RBD", required = true)
    protected String rbd;
    @XmlElement(name = "FARE_BASIS")
    protected String farebasis;
    @XmlElement(name = "FARE_BREAK_POINT")
    protected String farebreakpoint;
    @XmlElement(name = "AVAIL_CONNECTION_TYPE")
    protected String availconnectiontype;
    @XmlElement(name = "SEGMENT_ID", required = true)
    protected BigInteger segmentid;

    /**
     * Gets the value of the rbd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBD() {
        return rbd;
    }

    /**
     * Sets the value of the rbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBD(String value) {
        this.rbd = value;
    }

    /**
     * Gets the value of the farebasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREBASIS() {
        return farebasis;
    }

    /**
     * Sets the value of the farebasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREBASIS(String value) {
        this.farebasis = value;
    }

    /**
     * Gets the value of the farebreakpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREBREAKPOINT() {
        return farebreakpoint;
    }

    /**
     * Sets the value of the farebreakpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREBREAKPOINT(String value) {
        this.farebreakpoint = value;
    }

    /**
     * Gets the value of the availconnectiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVAILCONNECTIONTYPE() {
        return availconnectiontype;
    }

    /**
     * Sets the value of the availconnectiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVAILCONNECTIONTYPE(String value) {
        this.availconnectiontype = value;
    }

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

}
