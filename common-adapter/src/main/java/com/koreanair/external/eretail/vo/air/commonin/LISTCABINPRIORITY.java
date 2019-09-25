
package com.koreanair.external.eretail.vo.air.commonin;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}CABIN"/&gt;
 *         &lt;element name="CABIN_PRIORITY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cabin",
    "cabinpriority"
})
@XmlRootElement(name = "LIST_CABIN_PRIORITY")
public class LISTCABINPRIORITY
    implements Serializable
{

    @XmlElement(name = "CABIN", required = true)
    protected String cabin;
    @XmlElement(name = "CABIN_PRIORITY")
    protected String cabinpriority;

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCABIN() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCABIN(String value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the cabinpriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCABINPRIORITY() {
        return cabinpriority;
    }

    /**
     * Sets the value of the cabinpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCABINPRIORITY(String value) {
        this.cabinpriority = value;
    }

}
