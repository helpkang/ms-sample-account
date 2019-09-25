
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The type representing the date with some profile fields attributes
 * 
 * <p>Java class for DATE_TYPE_PFIELD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DATE_TYPE_PFIELD"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mandatory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UIInputTag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATE_TYPE_PFIELD", propOrder = {
    "value"
})
@XmlSeeAlso({
    DATETYPEAPISPFIELD.class
})
public class DATETYPEPFIELD
    implements Serializable
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "code")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar code;
    @XmlAttribute(name = "enabled")
    protected String enabled;
    @XmlAttribute(name = "mandatory")
    protected String mandatory;
    @XmlAttribute(name = "UIInputTag")
    protected String uiInputTag;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCode(XMLGregorianCalendar value) {
        this.code = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatory(String value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the uiInputTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIInputTag() {
        return uiInputTag;
    }

    /**
     * Sets the value of the uiInputTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIInputTag(String value) {
        this.uiInputTag = value;
    }

}
