
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Common structure shared (in theory) between TRIP_FARE, LIST_TRIP_FARE, LIST_PRICING_SOLUTION and LIST_REPRICING_SOLUTION.
 * 
 * <p>Java class for FareOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}TRIP_FARE_Type"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareOutputType")
public class FareOutputType
    extends TRIPFAREType
    implements Serializable
{


}
