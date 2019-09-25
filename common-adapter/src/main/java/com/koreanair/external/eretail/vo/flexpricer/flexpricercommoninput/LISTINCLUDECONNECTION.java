
package com.koreanair.external.eretail.vo.flexpricer.flexpricercommoninput;

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
 *         &lt;element name="INCLUDE_LOCATION" type="{}unprotectedStringType"/&gt;
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
    "includelocation"
})
@XmlRootElement(name = "LIST_INCLUDE_CONNECTION")
public class LISTINCLUDECONNECTION
    implements Serializable
{

    @XmlElement(name = "INCLUDE_LOCATION", required = true)
    protected String includelocation;

    /**
     * Gets the value of the includelocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCLUDELOCATION() {
        return includelocation;
    }

    /**
     * Sets the value of the includelocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCLUDELOCATION(String value) {
        this.includelocation = value;
    }

}
