
package com.koreanair.external.eretail.vo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRANSFORMATION_DATA_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRANSFORMATION_DATA_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRANSFORMATION_DATA_Type", propOrder = {
    "oex"
})
public class TRANSFORMATIONDATAType
    implements Serializable
{

    @XmlElement(name = "OEX")
    protected String oex;

    /**
     * Gets the value of the oex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOEX() {
        return oex;
    }

    /**
     * Sets the value of the oex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOEX(String value) {
        this.oex = value;
    }

}
