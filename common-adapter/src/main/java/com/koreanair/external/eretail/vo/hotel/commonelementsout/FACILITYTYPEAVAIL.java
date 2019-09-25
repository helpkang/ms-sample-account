
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.common.CODENAMETYPESIMPLE;


/**
 * Facility Type - Available / Unavailable 
 * 
 * Facility Code + Name (localised)
 * 
 * <p>Java class for FACILITY_TYPE_AVAIL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FACILITY_TYPE_AVAIL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CODE_NAME_TYPE_SIMPLE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AVAILABLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FACILITY_TYPE_AVAIL", propOrder = {
    "available"
})
public class FACILITYTYPEAVAIL
    extends CODENAMETYPESIMPLE
    implements Serializable
{

    @XmlElement(name = "AVAILABLE")
    protected boolean available;

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAVAILABLE() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAVAILABLE(boolean value) {
        this.available = value;
    }

}
