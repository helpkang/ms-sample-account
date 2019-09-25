
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The type representing the type of address.Possible types are P (Personal), Z (Business), B (Billing), D (Delivery), H (Home), I (Invoicing), A (Agency), C (Customer), O (other), M (Mailing)
 * 
 * <p>Java class for ADDRESS_TYPE_PFIELD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADDRESS_TYPE_PFIELD"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;&gt;STRING_TYPE_PFIELD"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADDRESS_TYPE_PFIELD")
@XmlSeeAlso({
    ADDRESSTYPEAPISPFIELD.class
})
public class ADDRESSTYPEPFIELD
    extends STRINGTYPEPFIELD
    implements Serializable
{


}
