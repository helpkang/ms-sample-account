
package com.koreanair.eretail.pojo.tripplan.common.common_fare;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MARKETING_CARRIERType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARKETING_CARRIERType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ORIGINATOR_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARKETING_CARRIERType", propOrder = {
    "code",
    "originatortype"
})
public class MARKETINGCARRIERType
    implements Serializable
{

    @XmlElement(name = "CODE", required = true)
    protected Object code;
    @XmlElement(name = "ORIGINATOR_TYPE")
    protected Object originatortype;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCODE(Object value) {
        this.code = value;
    }

    /**
     * Gets the value of the originatortype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getORIGINATORTYPE() {
        return originatortype;
    }

    /**
     * Sets the value of the originatortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setORIGINATORTYPE(Object value) {
        this.originatortype = value;
    }

}
