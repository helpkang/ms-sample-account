
package com.koreanair.eretail.pojo.common.common;

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
 *         &lt;element ref="{}DISCOUNT_CODE"/&gt;
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
    "discountcode"
})
@XmlRootElement(name = "LIST_PROPOSE_FARE_DISCOUNT")
public class LISTPROPOSEFAREDISCOUNT
    implements Serializable
{

    @XmlElement(name = "DISCOUNT_CODE", required = true)
    protected String discountcode;

    /**
     * Gets the value of the discountcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTCODE() {
        return discountcode;
    }

    /**
     * Sets the value of the discountcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTCODE(String value) {
        this.discountcode = value;
    }

}
