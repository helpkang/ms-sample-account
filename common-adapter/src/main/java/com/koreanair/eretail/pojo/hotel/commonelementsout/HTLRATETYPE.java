
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Rate type
 * 
 * <p>Java class for HTL_RATE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HTL_RATE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="RATE_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTL_RATE_TYPE", propOrder = {
    "ratecode",
    "ratedescription"
})
public class HTLRATETYPE
    implements Serializable
{

    @XmlElement(name = "RATE_CODE")
    protected String ratecode;
    @XmlElement(name = "RATE_DESCRIPTION")
    protected String ratedescription;

    /**
     * Gets the value of the ratecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATECODE() {
        return ratecode;
    }

    /**
     * Sets the value of the ratecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATECODE(String value) {
        this.ratecode = value;
    }

    /**
     * Gets the value of the ratedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATEDESCRIPTION() {
        return ratedescription;
    }

    /**
     * Sets the value of the ratedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATEDESCRIPTION(String value) {
        this.ratedescription = value;
    }

}
