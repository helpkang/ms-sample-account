
package com.koreanair.external.eretail.vo.farecommon.farecommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The references needed for fares-related subsequent services. For example when requesting the ticket image or fare calculation on an already returned fare.
 * 
 * <p>Java class for FARE_REFERENCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_REFERENCE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FARE_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FARE_REFERENCE_Type", propOrder = {
    "fareid"
})
public class FAREREFERENCEType
    implements Serializable
{

    @XmlElement(name = "FARE_ID", required = true)
    protected String fareid;

    /**
     * Gets the value of the fareid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREID() {
        return fareid;
    }

    /**
     * Sets the value of the fareid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREID(String value) {
        this.fareid = value;
    }

}
