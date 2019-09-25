
package com.koreanair.eretail.pojo.payment.paymentoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PERIODEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PERIODEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FROM" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="TO" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PERIODEType", propOrder = {
    "from",
    "to"
})
public class PERIODEType
    implements Serializable
{

    @XmlElement(name = "FROM", required = true)
    protected Object from;
    @XmlElement(name = "TO", required = true)
    protected Object to;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFROM() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFROM(Object value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTO() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTO(Object value) {
        this.to = value;
    }

}
