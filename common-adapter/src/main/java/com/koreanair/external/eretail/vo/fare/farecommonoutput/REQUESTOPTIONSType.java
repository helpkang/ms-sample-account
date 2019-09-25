
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains parameters used for faring/pricing command
 * 			
 * 
 * <p>Java class for REQUEST_OPTIONS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REQUEST_OPTIONS_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FARING_BY_FARECLASS_NEEDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REQUEST_OPTIONS_Type", propOrder = {
    "faringbyfareclassneeded"
})
public class REQUESTOPTIONSType
    implements Serializable
{

    @XmlElement(name = "FARING_BY_FARECLASS_NEEDED")
    protected Boolean faringbyfareclassneeded;

    /**
     * Gets the value of the faringbyfareclassneeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFARINGBYFARECLASSNEEDED() {
        return faringbyfareclassneeded;
    }

    /**
     * Sets the value of the faringbyfareclassneeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFARINGBYFARECLASSNEEDED(Boolean value) {
        this.faringbyfareclassneeded = value;
    }

}
