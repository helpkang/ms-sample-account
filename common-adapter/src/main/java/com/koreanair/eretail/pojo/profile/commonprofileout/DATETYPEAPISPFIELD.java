
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The type representing the date with some profile fields attributes
 * 
 * <p>Java class for DATE_TYPE_APIS_PFIELD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DATE_TYPE_APIS_PFIELD"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;&gt;DATE_TYPE_PFIELD"&gt;
 *       &lt;attribute name="PSPTRequirement" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IDENRequirement" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NATNRequirement" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="optionalRequirement" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATE_TYPE_APIS_PFIELD")
public class DATETYPEAPISPFIELD
    extends DATETYPEPFIELD
    implements Serializable
{

    @XmlAttribute(name = "PSPTRequirement")
    protected String psptRequirement;
    @XmlAttribute(name = "IDENRequirement")
    protected String idenRequirement;
    @XmlAttribute(name = "NATNRequirement")
    protected String natnRequirement;
    @XmlAttribute(name = "optionalRequirement")
    protected String optionalRequirement;

    /**
     * Gets the value of the psptRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSPTRequirement() {
        return psptRequirement;
    }

    /**
     * Sets the value of the psptRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSPTRequirement(String value) {
        this.psptRequirement = value;
    }

    /**
     * Gets the value of the idenRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENRequirement() {
        return idenRequirement;
    }

    /**
     * Sets the value of the idenRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENRequirement(String value) {
        this.idenRequirement = value;
    }

    /**
     * Gets the value of the natnRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATNRequirement() {
        return natnRequirement;
    }

    /**
     * Sets the value of the natnRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATNRequirement(String value) {
        this.natnRequirement = value;
    }

    /**
     * Gets the value of the optionalRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalRequirement() {
        return optionalRequirement;
    }

    /**
     * Sets the value of the optionalRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalRequirement(String value) {
        this.optionalRequirement = value;
    }

}
