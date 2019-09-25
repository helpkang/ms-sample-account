
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The baggage allowence split into UNIT and VALUE. Can be for example UNIT = 'KG' and VALUE = '20', or UNIT = 'PC', VALUE = '2'.
 * 
 * <p>Java class for TYPED_BAGGAGE_ALLOWANCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TYPED_BAGGAGE_ALLOWANCE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UNIT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TYPED_BAGGAGE_ALLOWANCE_Type", propOrder = {
    "unit",
    "value"
})
public class TYPEDBAGGAGEALLOWANCEType
    implements Serializable
{

    @XmlElement(name = "UNIT")
    protected String unit;
    @XmlElement(name = "VALUE")
    protected double value;

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

    /**
     * Gets the value of the value property.
     * 
     */
    public double getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setVALUE(double value) {
        this.value = value;
    }

}
