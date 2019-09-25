
package com.koreanair.eretail.pojo.tripplan.common.common_tr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trAmountRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trAmountRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MIN" type="{}trAmount" minOccurs="0"/&gt;
 *         &lt;element name="MAX" type="{}trAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trAmountRange", propOrder = {
    "min",
    "max"
})
public class TrAmountRange
    implements Serializable
{

    @XmlElement(name = "MIN")
    protected TrAmount min;
    @XmlElement(name = "MAX")
    protected TrAmount max;

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link TrAmount }
     *     
     */
    public TrAmount getMIN() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrAmount }
     *     
     */
    public void setMIN(TrAmount value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link TrAmount }
     *     
     */
    public TrAmount getMAX() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrAmount }
     *     
     */
    public void setMAX(TrAmount value) {
        this.max = value;
    }

}
