
package com.koreanair.external.eretail.vo.air.segmentstandaloneavailabilitycommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Segment which will have the availability checked.
 * 
 * <p>Java class for SEGMENT_Standalone_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEGMENT_Standalone_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="B_LOCATION" type="{}LOCATION_Input_Type"/&gt;
 *         &lt;element name="E_LOCATION" type="{}LOCATION_Input_Type"/&gt;
 *         &lt;element name="B_DATE" type="{}DATE_Input_Type"/&gt;
 *         &lt;element name="AIRLINE" type="{}AIRLINE_Input_Type" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_NUMBER" type="{}FLIGHT_NUMBER_Type" minOccurs="0"/&gt;
 *         &lt;element name="RBD" type="{}RBD_Input_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}SEGMENT_IDENTIFIER" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEGMENT_Standalone_Type", propOrder = {
    "blocation",
    "elocation",
    "bdate",
    "airline",
    "flightnumber",
    "rbd",
    "segmentidentifier"
})
public class SEGMENTStandaloneType
    implements Serializable
{

    @XmlElement(name = "B_LOCATION", required = true)
    protected String blocation;
    @XmlElement(name = "E_LOCATION", required = true)
    protected String elocation;
    @XmlElement(name = "B_DATE", required = true)
    protected String bdate;
    @XmlElement(name = "AIRLINE")
    protected String airline;
    @XmlElement(name = "FLIGHT_NUMBER")
    protected String flightnumber;
    @XmlElement(name = "RBD")
    protected String rbd;
    @XmlElement(name = "SEGMENT_IDENTIFIER")
    protected String segmentidentifier;

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLOCATION(String value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELOCATION(String value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDATE(String value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRLINE() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRLINE(String value) {
        this.airline = value;
    }

    /**
     * Gets the value of the flightnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIGHTNUMBER() {
        return flightnumber;
    }

    /**
     * Sets the value of the flightnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIGHTNUMBER(String value) {
        this.flightnumber = value;
    }

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
     * Any unique identifier for the segment (Can be a ID, or Central System Tattoo). The SEGMENT_IDENTIFIER is matched with the LIST_MARRIAGE/LIST_SEGMENT_IDENTIFIER in order to know which segments are in each marriage group. Mandatory for the ATC Upgrade Flow in Standalone Availability. Not necessary in ATC Upgrade Informative Repricing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTIDENTIFIER() {
        return segmentidentifier;
    }

    /**
     * Sets the value of the segmentidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTIDENTIFIER(String value) {
        this.segmentidentifier = value;
    }

}
