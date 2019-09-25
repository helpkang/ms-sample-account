
package com.koreanair.external.eretail.vo.payment.amopconfirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * AMOP confirmation information from PSP
 * 
 * <p>Java class for AMOP_CONFIRMATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMOP_CONFIRMATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RAW" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMOP_CONFIRMATION_Type", propOrder = {
    "raw"
})
public class AMOPCONFIRMATIONType
    implements Serializable
{

    @XmlElement(name = "RAW", required = true)
    protected String raw;

    /**
     * Gets the value of the raw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAW() {
        return raw;
    }

    /**
     * Sets the value of the raw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAW(String value) {
        this.raw = value;
    }

}
