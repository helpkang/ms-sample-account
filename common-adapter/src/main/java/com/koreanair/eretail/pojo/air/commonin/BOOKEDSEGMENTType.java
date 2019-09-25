
package com.koreanair.eretail.pojo.air.commonin;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An Air Segment corresponding to a flight. Doesn't includes connecting flights but might include stop without flight change.
 * 
 * <p>Java class for BOOKED_SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOOKED_SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E_LOCATION" type="{}BOOKED_LOCATION_Type"/&gt;
 *         &lt;element name="B_LOCATION" type="{}BOOKED_LOCATION_Type"/&gt;
 *         &lt;element ref="{}E_DATE"/&gt;
 *         &lt;element ref="{}B_DATE"/&gt;
 *         &lt;element name="AIRLINE" type="{}BOOKED_AIRLINE_Type"/&gt;
 *         &lt;element name="FLIGHT_NUMBER" type="{}BOOKED_FLIGHT_NUMBER"/&gt;
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
    "elocation",
    "blocation",
    "edate",
    "bdate",
    "airline",
    "flightnumber"
})
public class BOOKEDSEGMENTType
    implements Serializable
{

    @XmlElement(name = "E_LOCATION", required = true)
    protected BOOKEDLOCATIONType elocation;
    @XmlElement(name = "B_LOCATION", required = true)
    protected BOOKEDLOCATIONType blocation;
    @XmlElement(name = "E_DATE", required = true)
    protected String edate;
    @XmlElement(name = "B_DATE", required = true)
    protected String bdate;
    @XmlElement(name = "AIRLINE", required = true)
    protected BOOKEDAIRLINEType airline;
    @XmlElement(name = "FLIGHT_NUMBER", required = true)
    protected String flightnumber;

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKEDLOCATIONType }
     *     
     */
    public BOOKEDLOCATIONType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKEDLOCATIONType }
     *     
     */
    public void setELOCATION(BOOKEDLOCATIONType value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKEDLOCATIONType }
     *     
     */
    public BOOKEDLOCATIONType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKEDLOCATIONType }
     *     
     */
    public void setBLOCATION(BOOKEDLOCATIONType value) {
        this.blocation = value;
    }

    /**
     * Ending date
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDATE(String value) {
        this.edate = value;
    }

    /**
     * Boarding date
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
     *     {@link BOOKEDAIRLINEType }
     *     
     */
    public BOOKEDAIRLINEType getAIRLINE() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKEDAIRLINEType }
     *     
     */
    public void setAIRLINE(BOOKEDAIRLINEType value) {
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

}
