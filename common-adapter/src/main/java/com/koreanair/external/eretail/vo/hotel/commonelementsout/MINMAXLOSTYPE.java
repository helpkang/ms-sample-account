
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The max and min number of days for the stay
 * 
 * <p>Java class for MIN_MAX_LOS_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MIN_MAX_LOS_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MIN_LOS" type="{}LENGTH_OF_STAY" minOccurs="0"/&gt;
 *         &lt;element name="MAX_LOS" type="{}LENGTH_OF_STAY" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MIN_MAX_LOS_TYPE", propOrder = {
    "minlos",
    "maxlos"
})
public class MINMAXLOSTYPE
    implements Serializable
{

    @XmlElement(name = "MIN_LOS")
    protected LENGTHOFSTAY minlos;
    @XmlElement(name = "MAX_LOS")
    protected LENGTHOFSTAY maxlos;

    /**
     * Gets the value of the minlos property.
     * 
     * @return
     *     possible object is
     *     {@link LENGTHOFSTAY }
     *     
     */
    public LENGTHOFSTAY getMINLOS() {
        return minlos;
    }

    /**
     * Sets the value of the minlos property.
     * 
     * @param value
     *     allowed object is
     *     {@link LENGTHOFSTAY }
     *     
     */
    public void setMINLOS(LENGTHOFSTAY value) {
        this.minlos = value;
    }

    /**
     * Gets the value of the maxlos property.
     * 
     * @return
     *     possible object is
     *     {@link LENGTHOFSTAY }
     *     
     */
    public LENGTHOFSTAY getMAXLOS() {
        return maxlos;
    }

    /**
     * Sets the value of the maxlos property.
     * 
     * @param value
     *     allowed object is
     *     {@link LENGTHOFSTAY }
     *     
     */
    public void setMAXLOS(LENGTHOFSTAY value) {
        this.maxlos = value;
    }

}
