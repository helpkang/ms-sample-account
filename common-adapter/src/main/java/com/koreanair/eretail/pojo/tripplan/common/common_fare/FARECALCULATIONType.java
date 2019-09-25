
package com.koreanair.eretail.pojo.tripplan.common.common_fare;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FARE_CALCULATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_CALCULATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FC_LINE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FCPI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="FCRI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FARE_CALCULATIONType", propOrder = {
    "fcline",
    "fcpi",
    "fcri"
})
public class FARECALCULATIONType
    implements Serializable
{

    @XmlElement(name = "FC_LINE")
    protected Object fcline;
    @XmlElement(name = "FCPI")
    protected Object fcpi;
    @XmlElement(name = "FCRI")
    protected Object fcri;

    /**
     * Gets the value of the fcline property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFCLINE() {
        return fcline;
    }

    /**
     * Sets the value of the fcline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFCLINE(Object value) {
        this.fcline = value;
    }

    /**
     * Gets the value of the fcpi property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFCPI() {
        return fcpi;
    }

    /**
     * Sets the value of the fcpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFCPI(Object value) {
        this.fcpi = value;
    }

    /**
     * Gets the value of the fcri property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFCRI() {
        return fcri;
    }

    /**
     * Sets the value of the fcri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFCRI(Object value) {
        this.fcri = value;
    }

}
