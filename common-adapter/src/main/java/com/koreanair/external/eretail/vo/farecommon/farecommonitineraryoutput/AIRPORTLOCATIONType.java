
package com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AIRPORT_LOCATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AIRPORT_LOCATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}LOCATION_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TERMINAL" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AIRPORT_LOCATION_Type", propOrder = {
    "terminal"
})
public class AIRPORTLOCATIONType
    extends LOCATIONType
    implements Serializable
{

    @XmlElement(name = "TERMINAL")
    protected String terminal;

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTERMINAL() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTERMINAL(String value) {
        this.terminal = value;
    }

}
