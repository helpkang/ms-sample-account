
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Guarantee/Deposit/Payment methods accepted by this hotel
 * 
 * <p>Java class for GUARANTEE_PAYMENT_METHOD_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GUARANTEE_PAYMENT_METHOD_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PAYMENT_METHOD_TYPE"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GUARANTEE_PAYMENT_METHOD_TYPE")
@XmlSeeAlso({
    com.koreanair.eretail.pojo.hotel.commonelementsout.MISCPOLICIESTYPE.LISTGUARANTEEPAYMENTPOLICY.class
})
public class GUARANTEEPAYMENTMETHODTYPE
    extends PAYMENTMETHODTYPE
    implements Serializable
{


}
