
package com.koreanair.external.eretail.vo.pnr.addelementsinput1;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_ROOMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ROOMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}ROOM_ID"/&gt;
 *         &lt;element ref="{}MULTIPLICITY" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_ROOMType", propOrder = {
    "roomid",
    "multiplicity"
})
public class LISTROOMType
    implements Serializable
{

    @XmlElement(name = "ROOM_ID", required = true)
    protected String roomid;
    @XmlElement(name = "MULTIPLICITY")
    protected BigInteger multiplicity;

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

}
