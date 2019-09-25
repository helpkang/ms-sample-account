
package com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_ITINERARY_LightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ITINERARY_LightType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ELEMENT" type="{}ELEMENT_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_ITINERARY_LightType", propOrder = {
    "element"
})
@XmlSeeAlso({
    LISTITINERARYType.class
})
public class LISTITINERARYLightType
    implements Serializable
{

    @XmlElement(name = "ELEMENT", required = true)
    protected ELEMENTType element;

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link ELEMENTType }
     *     
     */
    public ELEMENTType getELEMENT() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELEMENTType }
     *     
     */
    public void setELEMENT(ELEMENTType value) {
        this.element = value;
    }

}
