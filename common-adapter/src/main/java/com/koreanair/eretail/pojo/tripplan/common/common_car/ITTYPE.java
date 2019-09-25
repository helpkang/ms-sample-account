
package com.koreanair.eretail.pojo.tripplan.common.common_car;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IT_CODE" type="{}unprotectedStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IT_TYPE", propOrder = {
    "itcode"
})
public class ITTYPE
    implements Serializable
{

    @XmlElement(name = "IT_CODE", required = true)
    protected String itcode;

    /**
     * Gets the value of the itcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITCODE() {
        return itcode;
    }

    /**
     * Sets the value of the itcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITCODE(String value) {
        this.itcode = value;
    }

}
