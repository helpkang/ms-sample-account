
package com.koreanair.eretail.pojo.flexpricer.farefamilydescriptioncommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CodeDescriptorType;


/**
 * <p>Java class for cityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CITY" type="{}CodeDescriptorType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cityType", propOrder = {
    "city"
})
public class CityType
    implements Serializable
{

    @XmlElement(name = "CITY", required = true)
    protected CodeDescriptorType city;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setCITY(CodeDescriptorType value) {
        this.city = value;
    }

}
