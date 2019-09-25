
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilityinputtype;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_INCLUDED_EXCLUDED_AIRLINES_input_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_INCLUDED_EXCLUDED_AIRLINES_input_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AIRLINE_CODE" type="{}unprotectedStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_INCLUDED_EXCLUDED_AIRLINES_input_type", propOrder = {
    "airlinecode"
})
public class LISTINCLUDEDEXCLUDEDAIRLINESInputType
    implements Serializable
{

    @XmlElement(name = "AIRLINE_CODE", required = true)
    protected String airlinecode;

    /**
     * Gets the value of the airlinecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRLINECODE() {
        return airlinecode;
    }

    /**
     * Sets the value of the airlinecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRLINECODE(String value) {
        this.airlinecode = value;
    }

}
