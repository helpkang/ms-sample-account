
package com.koreanair.external.eretail.vo.fare.minirulesoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for DURATION_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DURATION_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UNIT" type="{}DURATION_UNIT_type"/&gt;
 *         &lt;element name="PERIOD" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ISO_8601_STRING" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DURATION_type", propOrder = {
    "unit",
    "period",
    "iso8601STRING"
})
public class DURATIONType
    implements Serializable
{

    @XmlElement(name = "UNIT", required = true)
    @XmlSchemaType(name = "string")
    protected DURATIONUNITType unit;
    @XmlElement(name = "PERIOD")
    protected double period;
    @XmlElement(name = "ISO_8601_STRING", required = true)
    protected Duration iso8601STRING;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link DURATIONUNITType }
     *     
     */
    public DURATIONUNITType getUNIT() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATIONUNITType }
     *     
     */
    public void setUNIT(DURATIONUNITType value) {
        this.unit = value;
    }

    /**
     * Gets the value of the period property.
     * 
     */
    public double getPERIOD() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     */
    public void setPERIOD(double value) {
        this.period = value;
    }

    /**
     * Gets the value of the iso8601STRING property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getISO8601STRING() {
        return iso8601STRING;
    }

    /**
     * Sets the value of the iso8601STRING property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setISO8601STRING(Duration value) {
        this.iso8601STRING = value;
    }

}
