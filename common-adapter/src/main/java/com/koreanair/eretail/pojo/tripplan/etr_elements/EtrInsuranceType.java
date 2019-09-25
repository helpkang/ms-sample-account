
package com.koreanair.eretail.pojo.tripplan.etr_elements;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.tripplan.etr_insurance.EtrInsurance;


/**
 * ETR insurance.
 * 
 * <p>Java class for etrInsuranceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrInsuranceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}etrInsurance"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etrInsuranceType")
public class EtrInsuranceType
    extends EtrInsurance
    implements Serializable
{


}
