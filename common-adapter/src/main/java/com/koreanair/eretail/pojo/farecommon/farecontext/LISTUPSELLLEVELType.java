
package com.koreanair.eretail.pojo.farecommon.farecontext;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_UPSELL_LEVEL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_UPSELL_LEVEL_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UPSELL_LEVEL"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="LEG"/&gt;
 *               &lt;enumeration value="BOUND"/&gt;
 *               &lt;enumeration value="ITINERARY"/&gt;
 *               &lt;enumeration value="UNDEFINED"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_UPSELL_LEVEL_Type", propOrder = {
    "upselllevel"
})
public class LISTUPSELLLEVELType
    implements Serializable
{

    @XmlElement(name = "UPSELL_LEVEL", required = true)
    protected String upselllevel;

    /**
     * Gets the value of the upselllevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPSELLLEVEL() {
        return upselllevel;
    }

    /**
     * Sets the value of the upselllevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPSELLLEVEL(String value) {
        this.upselllevel = value;
    }

}
