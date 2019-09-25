
package com.koreanair.eretail.pojo.tripplan.etr_elements;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.tripplan.etr_car.EtrCar;


/**
 * ETR car.
 * 
 * <p>Java class for etrCarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrCarType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}etrCar"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etrCarType")
public class EtrCarType
    extends EtrCar
    implements Serializable
{


}
