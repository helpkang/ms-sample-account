
package com.koreanair.eretail.pojo.tripplan.common.common_tr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;


/**
 * <p>Java class for trExternalSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trExternalSystemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CREATION" type="{}OutputDateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trExternalSystemType", propOrder = {
    "creation"
})
public class TrExternalSystemType
    implements Serializable
{

    @XmlElement(name = "CREATION")
    protected OutputDateType creation;

    /**
     * Gets the value of the creation property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getCREATION() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setCREATION(OutputDateType value) {
        this.creation = value;
    }

}
