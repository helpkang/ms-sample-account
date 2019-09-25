
package com.koreanair.external.eretail.vo.tripplan.common.common_fare;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of Fare classes per air segment.
 * 
 * <p>Java class for listFareClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listFareClassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FARE_CLASS" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="FARE_BREAK_POINT" type="{}unprotectedStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listFareClassType", propOrder = {
    "segmentid",
    "fareclass",
    "farebreakpoint"
})
public class ListFareClassType
    implements Serializable
{

    @XmlElement(name = "SEGMENT_ID", required = true)
    protected BigInteger segmentid;
    @XmlElement(name = "FARE_CLASS", required = true)
    protected String fareclass;
    @XmlElement(name = "FARE_BREAK_POINT", required = true)
    protected String farebreakpoint;

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
     * Gets the value of the fareclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECLASS() {
        return fareclass;
    }

    /**
     * Sets the value of the fareclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECLASS(String value) {
        this.fareclass = value;
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

}
