
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_FARE_HOST_COMMAND_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_FARE_HOST_COMMAND_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FARE_HOST_COMMAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_FARE_HOST_COMMAND_Type", propOrder = {
    "farehostcommand"
})
public class LISTFAREHOSTCOMMANDType
    implements Serializable
{

    @XmlElement(name = "FARE_HOST_COMMAND")
    protected String farehostcommand;

    /**
     * Gets the value of the farehostcommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREHOSTCOMMAND() {
        return farehostcommand;
    }

    /**
     * Sets the value of the farehostcommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREHOSTCOMMAND(String value) {
        this.farehostcommand = value;
    }

}
