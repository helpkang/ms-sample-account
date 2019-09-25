
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CodeDescriptorType;


/**
 * <p>Java class for fareFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareFamilyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AIRLINE_NAME" type="{}CodeDescriptorType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareFamilyType", propOrder = {
    "id",
    "name",
    "airlinename"
})
public class FareFamilyType
    implements Serializable
{

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "AIRLINE_NAME", required = true)
    protected CodeDescriptorType airlinename;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the airlinename property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getAIRLINENAME() {
        return airlinename;
    }

    /**
     * Sets the value of the airlinename property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setAIRLINENAME(CodeDescriptorType value) {
        this.airlinename = value;
    }

}
