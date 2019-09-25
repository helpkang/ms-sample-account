
package com.koreanair.eretail.pojo.farecommon.ticketchangercommonexternal;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Added for CR 03667099 WAL-ATC: Disruption handling online. This structure contains the details of a Dynamic Waiver which has been applied to this fare for current traveler type, when applicable.
 * 
 * <p>Java class for WAIVER_INFORMATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WAIVER_INFORMATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HAS_WAIVER" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WAIVER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WAIVER_INFORMATION_Type", propOrder = {
    "haswaiver",
    "waivercode"
})
public class WAIVERINFORMATIONType
    implements Serializable
{

    @XmlElement(name = "HAS_WAIVER")
    protected boolean haswaiver;
    @XmlElement(name = "WAIVER_CODE")
    protected String waivercode;

    /**
     * Gets the value of the haswaiver property.
     * 
     */
    public boolean isHASWAIVER() {
        return haswaiver;
    }

    /**
     * Sets the value of the haswaiver property.
     * 
     */
    public void setHASWAIVER(boolean value) {
        this.haswaiver = value;
    }

    /**
     * Gets the value of the waivercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAIVERCODE() {
        return waivercode;
    }

    /**
     * Sets the value of the waivercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAIVERCODE(String value) {
        this.waivercode = value;
    }

}
