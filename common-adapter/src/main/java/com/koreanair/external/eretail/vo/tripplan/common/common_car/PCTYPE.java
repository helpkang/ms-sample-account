
package com.koreanair.external.eretail.vo.tripplan.common.common_car;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PC_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PC_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PC_CODE" type="{}unprotectedStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PC_TYPE", propOrder = {
    "pccode"
})
public class PCTYPE
    implements Serializable
{

    @XmlElement(name = "PC_CODE", required = true)
    protected String pccode;

    /**
     * Gets the value of the pccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCCODE() {
        return pccode;
    }

    /**
     * Sets the value of the pccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCCODE(String value) {
        this.pccode = value;
    }

}
