
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The type representing the type string with some profile fields attributes, allowedValues is a coma separated list of allowed values for the field
 * 
 * <p>Java class for STRING_TYPE_PFIELD_WITH_ALLOWED_VALUES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRING_TYPE_PFIELD_WITH_ALLOWED_VALUES"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mandatory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="allowedValues" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UIInputTag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRING_TYPE_PFIELD_WITH_ALLOWED_VALUES", propOrder = {
    "value"
})
public class STRINGTYPEPFIELDWITHALLOWEDVALUES
    implements Serializable
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "enabled")
    protected String enabled;
    @XmlAttribute(name = "mandatory")
    protected String mandatory;
    @XmlAttribute(name = "allowedValues")
    protected String allowedValues;
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
     * Gets the value of the allowedValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedValues() {
        return allowedValues;
    }

    /**
     * Sets the value of the allowedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedValues(String value) {
        this.allowedValues = value;
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
