
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.common.CODENAMETYPESTRICT;


/**
 * Languages (Strict, localised language name must be provided)
 * 
 * Language Codes are standard ISO language codes, e.g. fr
 * 
 * <p>Java class for LANGUAGE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LANGUAGE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CODE_NAME_TYPE_STRICT"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LANGUAGE_TYPE")
public class LANGUAGETYPE
    extends CODENAMETYPESTRICT
    implements Serializable
{


}
