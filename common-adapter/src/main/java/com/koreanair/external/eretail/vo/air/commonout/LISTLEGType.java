
package com.koreanair.external.eretail.vo.air.commonout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_LEGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_LEGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="STAFF_COUNTERS" type="{}STAFF_COUNTERSType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_LEGType", propOrder = {
    "staffcounters"
})
public class LISTLEGType
    implements Serializable
{

    @XmlElement(name = "STAFF_COUNTERS")
    protected STAFFCOUNTERSType staffcounters;

    /**
     * Gets the value of the staffcounters property.
     * 
     * @return
     *     possible object is
     *     {@link STAFFCOUNTERSType }
     *     
     */
    public STAFFCOUNTERSType getSTAFFCOUNTERS() {
        return staffcounters;
    }

    /**
     * Sets the value of the staffcounters property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAFFCOUNTERSType }
     *     
     */
    public void setSTAFFCOUNTERS(STAFFCOUNTERSType value) {
        this.staffcounters = value;
    }

}
