
package com.koreanair.external.eretail.vo.pnr.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BOOL_DISPLAY_BLUE_LANE_STATUS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="BOOL_DISPLAY_INFANT_BLUE_LANE_STATUS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "booldisplaybluelanestatus",
    "booldisplayinfantbluelanestatus"
})
@XmlRootElement(name = "LIST_BLUE_LANE_STATUS")
public class LISTBLUELANESTATUS {

    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "BOOL_DISPLAY_BLUE_LANE_STATUS")
    protected boolean booldisplaybluelanestatus;
    @XmlElement(name = "BOOL_DISPLAY_INFANT_BLUE_LANE_STATUS")
    protected Boolean booldisplayinfantbluelanestatus;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the booldisplaybluelanestatus property.
     * 
     */
    public boolean isBOOLDISPLAYBLUELANESTATUS() {
        return booldisplaybluelanestatus;
    }

    /**
     * Sets the value of the booldisplaybluelanestatus property.
     * 
     */
    public void setBOOLDISPLAYBLUELANESTATUS(boolean value) {
        this.booldisplaybluelanestatus = value;
    }

    /**
     * Gets the value of the booldisplayinfantbluelanestatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLDISPLAYINFANTBLUELANESTATUS() {
        return booldisplayinfantbluelanestatus;
    }

    /**
     * Sets the value of the booldisplayinfantbluelanestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLDISPLAYINFANTBLUELANESTATUS(Boolean value) {
        this.booldisplayinfantbluelanestatus = value;
    }

}
