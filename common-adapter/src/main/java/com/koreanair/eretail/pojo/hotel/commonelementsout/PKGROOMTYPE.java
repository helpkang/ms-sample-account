
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PKG_ROOM_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PKG_ROOM_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}MULTIPLICITY" minOccurs="0"/&gt;
 *         &lt;element ref="{}ROOM_ID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PKG_ROOM_TYPE", propOrder = {
    "multiplicity",
    "roomid"
})
public class PKGROOMTYPE
    implements Serializable
{

    @XmlElement(name = "MULTIPLICITY")
    protected BigInteger multiplicity;
    @XmlElement(name = "ROOM_ID", required = true)
    protected String roomid;

    /**
     * Gets the value of the multiplicity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMULTIPLICITY() {
        return multiplicity;
    }

    /**
     * Sets the value of the multiplicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMULTIPLICITY(BigInteger value) {
        this.multiplicity = value;
    }

    /**
     * Gets the value of the roomid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROOMID() {
        return roomid;
    }

    /**
     * Sets the value of the roomid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROOMID(String value) {
        this.roomid = value;
    }

}
