
package com.koreanair.external.eretail.vo.flexpricer.flexpricercommon;

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
 *         &lt;element name="PARAMETER_ID" type="{}unprotectedStringType"/&gt;
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
    "parameterid"
})
@XmlRootElement(name = "LIST_FARE_PARAMETER")
public class LISTFAREPARAMETER
    implements Serializable
{

    @XmlElement(name = "PARAMETER_ID", required = true)
    protected String parameterid;

    /**
     * Gets the value of the parameterid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARAMETERID() {
        return parameterid;
    }

    /**
     * Sets the value of the parameterid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARAMETERID(String value) {
        this.parameterid = value;
    }

}
