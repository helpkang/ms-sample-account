
package com.koreanair.external.eretail.vo.tripplan.etr_discount;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.tripplan.common.common_etr.EtrCommonElementsType;


/**
 *  Discount element and common information
 * 
 * <p>Java class for etrDiscountElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrDiscountElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}etrCommonElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DISCOUNT_TYPE" type="{}etrDiscountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etrDiscountElementType", propOrder = {
    "discounttype"
})
public class EtrDiscountElementType
    extends EtrCommonElementsType
    implements Serializable
{

    @XmlElement(name = "DISCOUNT_TYPE", required = true)
    protected EtrDiscountType discounttype;

    /**
     * Gets the value of the discounttype property.
     * 
     * @return
     *     possible object is
     *     {@link EtrDiscountType }
     *     
     */
    public EtrDiscountType getDISCOUNTTYPE() {
        return discounttype;
    }

    /**
     * Sets the value of the discounttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrDiscountType }
     *     
     */
    public void setDISCOUNTTYPE(EtrDiscountType value) {
        this.discounttype = value;
    }

}
