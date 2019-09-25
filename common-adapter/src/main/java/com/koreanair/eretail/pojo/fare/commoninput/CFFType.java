
package com.koreanair.eretail.pojo.fare.commoninput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CFF_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CFF_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CFF" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFF_Type", propOrder = {
    "cff"
})
public class CFFType
    implements Serializable
{

    @XmlElement(name = "CFF")
    protected Object cff;

    /**
     * Gets the value of the cff property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCFF() {
        return cff;
    }

    /**
     * Sets the value of the cff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCFF(Object value) {
        this.cff = value;
    }

}
