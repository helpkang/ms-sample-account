
package com.koreanair.external.eretail.vo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.reservation.common.CodeNameType;


/**
 * Empty type added only for model generation purpose
 * 
 * <p>Java class for InternalCompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternalCompanyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}CodeNameType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalCompanyType")
@XmlSeeAlso({
    CompanyType.class
})
public class InternalCompanyType
    extends CodeNameType
    implements Serializable
{


}
