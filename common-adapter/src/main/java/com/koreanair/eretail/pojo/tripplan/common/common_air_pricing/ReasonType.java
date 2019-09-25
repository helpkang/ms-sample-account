
package com.koreanair.eretail.pojo.tripplan.common.common_air_pricing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reasonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reasonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OVERRIDE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FREETEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reasonType", propOrder = {
    "overridetype",
    "code",
    "freetext"
})
public class ReasonType
    implements Serializable
{

    @XmlElement(name = "OVERRIDE_TYPE", required = true)
    protected String overridetype;
    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "FREETEXT")
    protected String freetext;

    /**
     * Gets the value of the overridetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVERRIDETYPE() {
        return overridetype;
    }

    /**
     * Sets the value of the overridetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVERRIDETYPE(String value) {
        this.overridetype = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the freetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREETEXT() {
        return freetext;
    }

    /**
     * Sets the value of the freetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREETEXT(String value) {
        this.freetext = value;
    }

}
