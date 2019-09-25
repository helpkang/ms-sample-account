
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Faring information.
 * 
 * <p>Java class for FARING_DETAIL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARING_DETAIL_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ALLOW_RESTRICTED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FARING_DETAIL_Type", propOrder = {
    "allowrestricted"
})
public class FARINGDETAILType
    implements Serializable
{

    @XmlElement(name = "ALLOW_RESTRICTED")
    protected boolean allowrestricted;

    /**
     * Gets the value of the allowrestricted property.
     * 
     */
    public boolean isALLOWRESTRICTED() {
        return allowrestricted;
    }

    /**
     * Sets the value of the allowrestricted property.
     * 
     */
    public void setALLOWRESTRICTED(boolean value) {
        this.allowrestricted = value;
    }

}
