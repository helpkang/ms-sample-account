
package com.koreanair.eretail.pojo.fareshopper.fareshoppercommon;

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
 *         &lt;element name="BACKEND_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
    "backendid"
})
@XmlRootElement(name = "PROVIDER_CONTEXT")
public class PROVIDERCONTEXT
    implements Serializable
{

    @XmlElement(name = "BACKEND_ID")
    protected String backendid;

    /**
     * Gets the value of the backendid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACKENDID() {
        return backendid;
    }

    /**
     * Sets the value of the backendid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACKENDID(String value) {
        this.backendid = value;
    }

}
