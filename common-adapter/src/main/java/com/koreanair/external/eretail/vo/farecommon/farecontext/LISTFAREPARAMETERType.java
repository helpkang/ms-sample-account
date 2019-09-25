
package com.koreanair.external.eretail.vo.farecommon.farecontext;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Expanded parameters
 * 
 * <p>Java class for LIST_FARE_PARAMETER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_FARE_PARAMETER_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PARAMETER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_FARE_PARAMETER_Type", propOrder = {
    "parameterid"
})
public class LISTFAREPARAMETERType
    implements Serializable
{

    @XmlElement(name = "PARAMETER_ID", required = true)
    protected BigInteger parameterid;

    /**
     * Gets the value of the parameterid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPARAMETERID() {
        return parameterid;
    }

    /**
     * Sets the value of the parameterid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPARAMETERID(BigInteger value) {
        this.parameterid = value;
    }

}
