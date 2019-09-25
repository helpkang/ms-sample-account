
package com.koreanair.eretail.pojo.tripplan.common.common_fare;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CODEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="NATURE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODEType", propOrder = {
    "countrycode",
    "nature"
})
public class CODEType
    implements Serializable
{

    @XmlElement(name = "COUNTRY_CODE", required = true)
    protected Object countrycode;
    @XmlElement(name = "NATURE")
    protected Object nature;

    /**
     * Gets the value of the countrycode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCOUNTRYCODE() {
        return countrycode;
    }

    /**
     * Sets the value of the countrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCOUNTRYCODE(Object value) {
        this.countrycode = value;
    }

    /**
     * Gets the value of the nature property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNATURE() {
        return nature;
    }

    /**
     * Sets the value of the nature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNATURE(Object value) {
        this.nature = value;
    }

}
