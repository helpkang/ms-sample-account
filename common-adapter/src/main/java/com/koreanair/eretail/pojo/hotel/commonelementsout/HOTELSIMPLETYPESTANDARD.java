
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Hotel simple type standard
 * 
 * <p>Java class for HOTEL_SIMPLE_TYPE_STANDARD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_SIMPLE_TYPE_STANDARD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}HOTEL_SIMPLE_TYPE_NEGO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PROVIDER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_SIMPLE_TYPE_STANDARD", propOrder = {
    "provider"
})
public class HOTELSIMPLETYPESTANDARD
    extends HOTELSIMPLETYPENEGO
    implements Serializable
{

    @XmlElement(name = "PROVIDER")
    protected String provider;

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDER() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDER(String value) {
        this.provider = value;
    }

}
