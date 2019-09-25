
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.common.CODENAMETYPESTRICT;


/**
 * List of Room Types Available in this hotel
 * 
 * <p>Java class for ROOMS_DESC_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROOMS_DESC_TYPE"&gt;
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
@XmlType(name = "ROOMS_DESC_TYPE")
public class ROOMSDESCTYPE
    extends CODENAMETYPESTRICT
    implements Serializable
{


}
