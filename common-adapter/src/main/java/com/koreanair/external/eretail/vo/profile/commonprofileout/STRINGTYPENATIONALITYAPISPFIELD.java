
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The type representing the nationality type string with some profile fields attributes
 * 
 * <p>Java class for STRING_TYPE_NATIONALITY_APIS_PFIELD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRING_TYPE_NATIONALITY_APIS_PFIELD"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;&gt;STRING_TYPE_NATIONALITY_PFIELD"&gt;
 *       &lt;attribute name="NatStructID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRING_TYPE_NATIONALITY_APIS_PFIELD")
public class STRINGTYPENATIONALITYAPISPFIELD
    extends STRINGTYPENATIONALITYPFIELD
    implements Serializable
{

    @XmlAttribute(name = "NatStructID")
    protected String natStructID;

    /**
     * Gets the value of the natStructID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatStructID() {
        return natStructID;
    }

    /**
     * Sets the value of the natStructID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatStructID(String value) {
        this.natStructID = value;
    }

}
