
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The type representing the nationality type string with some profile fields attributes
 * 
 * <p>Java class for STRING_TYPE_NATIONALITY_PFIELD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRING_TYPE_NATIONALITY_PFIELD"&gt;
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
@XmlType(name = "STRING_TYPE_NATIONALITY_PFIELD")
@XmlSeeAlso({
    STRINGTYPENATIONALITYAPISPFIELD.class
})
public class STRINGTYPENATIONALITYPFIELD
    extends STRINGTYPEPFIELD
    implements Serializable
{


}
