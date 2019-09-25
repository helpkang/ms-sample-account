
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Distance type
 * 
 * <p>Java class for DISTANCE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DISTANCE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UNIT" type="{}UNIT_TYPE"/&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="DIRECTION" type="{}DIRECTION_TYPE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISTANCE_TYPE", propOrder = {
    "unit",
    "value",
    "direction"
})
public class DISTANCETYPE
    implements Serializable
{

    @XmlElement(name = "UNIT", required = true)
    protected UNITTYPE unit;
    @XmlElement(name = "VALUE")
    protected float value;
    @XmlElement(name = "DIRECTION", required = true)
    protected DIRECTIONTYPE direction;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link UNITTYPE }
     *     
     */
    public UNITTYPE getUNIT() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNITTYPE }
     *     
     */
    public void setUNIT(UNITTYPE value) {
        this.unit = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public float getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setVALUE(float value) {
        this.value = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link DIRECTIONTYPE }
     *     
     */
    public DIRECTIONTYPE getDIRECTION() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIRECTIONTYPE }
     *     
     */
    public void setDIRECTION(DIRECTIONTYPE value) {
        this.direction = value;
    }

}
