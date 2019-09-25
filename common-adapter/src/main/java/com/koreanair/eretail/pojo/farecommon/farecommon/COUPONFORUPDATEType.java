
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.COUPONType;


/**
 * CR3923840 The datastructure used for coupon representation in input
 * 
 * <p>Java class for COUPON_FOR_UPDATE_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COUPON_FOR_UPDATE_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}COUPON_type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="COUPON_ID" type="{}unprotectedStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COUPON_FOR_UPDATE_type", propOrder = {
    "couponid"
})
public class COUPONFORUPDATEType
    extends COUPONType
    implements Serializable
{

    @XmlElement(name = "COUPON_ID", required = true)
    protected String couponid;

    /**
     * Gets the value of the couponid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUPONID() {
        return couponid;
    }

    /**
     * Sets the value of the couponid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUPONID(String value) {
        this.couponid = value;
    }

}
