
package com.koreanair.eretail.pojo.tripplan.web_fare;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Location data
 * 
 * <p>Java class for CO2_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CO2_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CO2_Type", propOrder = {
    "amount",
    "unit"
})
public class CO2Type
    implements Serializable
{

    @XmlElement(name = "AMOUNT")
    protected int amount;
    @XmlElement(name = "UNIT", required = true)
    protected String unit;

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAMOUNT(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIT() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIT(String value) {
        this.unit = value;
    }

}
