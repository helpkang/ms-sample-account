
package com.koreanair.eretail.pojo.farecommon.farecommon;

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
 *         &lt;element name="MEAL_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="DESCRIPTION" type="{}unprotectedStringType"/&gt;
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
    "mealcode",
    "description"
})
@XmlRootElement(name = "LIST_MEAL")
public class LISTMEAL
    implements Serializable
{

    @XmlElement(name = "MEAL_CODE", required = true)
    protected String mealcode;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;

    /**
     * Gets the value of the mealcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEALCODE() {
        return mealcode;
    }

    /**
     * Sets the value of the mealcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEALCODE(String value) {
        this.mealcode = value;
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
