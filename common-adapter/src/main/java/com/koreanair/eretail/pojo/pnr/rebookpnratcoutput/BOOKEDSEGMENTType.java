
package com.koreanair.eretail.pojo.pnr.rebookpnratcoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BOOKED_SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOOKED_SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEGMENT_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="BAGGAGE_ALLOWANCE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FARE_BASIS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="NVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NVB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOOKED_SEGMENT_Type", propOrder = {
    "segmentid",
    "baggageallowance",
    "farebasis",
    "nva",
    "nvb"
})
public class BOOKEDSEGMENTType
    implements Serializable
{

    @XmlElement(name = "SEGMENT_ID", required = true)
    protected String segmentid;
    @XmlElement(name = "BAGGAGE_ALLOWANCE")
    protected String baggageallowance;
    @XmlElement(name = "FARE_BASIS")
    protected String farebasis;
    @XmlElement(name = "NVA")
    protected String nva;
    @XmlElement(name = "NVB")
    protected String nvb;

    /**
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTID(String value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the baggageallowance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAGGAGEALLOWANCE() {
        return baggageallowance;
    }

    /**
     * Sets the value of the baggageallowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAGGAGEALLOWANCE(String value) {
        this.baggageallowance = value;
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
     * Gets the value of the nva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVA() {
        return nva;
    }

    /**
     * Sets the value of the nva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVA(String value) {
        this.nva = value;
    }

    /**
     * Gets the value of the nvb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVB() {
        return nvb;
    }

    /**
     * Sets the value of the nvb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVB(String value) {
        this.nvb = value;
    }

}
