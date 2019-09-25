
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DESC_SERVICE_LEVEL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DESC_SERVICE_LEVEL_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SERVICE_LEVEL_SHORT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BRAND_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESC_SERVICE_LEVEL_Type", propOrder = {
    "servicelevelshortname",
    "brandname",
    "description"
})
public class DESCSERVICELEVELType
    implements Serializable
{

    @XmlElement(name = "SERVICE_LEVEL_SHORT_NAME", required = true)
    protected String servicelevelshortname;
    @XmlElement(name = "BRAND_NAME")
    protected String brandname;
    @XmlElement(name = "DESCRIPTION")
    protected String description;

    /**
     * Gets the value of the servicelevelshortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICELEVELSHORTNAME() {
        return servicelevelshortname;
    }

    /**
     * Sets the value of the servicelevelshortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICELEVELSHORTNAME(String value) {
        this.servicelevelshortname = value;
    }

    /**
     * Gets the value of the brandname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANDNAME() {
        return brandname;
    }

    /**
     * Sets the value of the brandname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANDNAME(String value) {
        this.brandname = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

}
