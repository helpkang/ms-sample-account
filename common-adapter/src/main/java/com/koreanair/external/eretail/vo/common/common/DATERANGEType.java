
package com.koreanair.external.eretail.vo.common.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DATE_RANGE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DATE_RANGE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MIN" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="MAX" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="MIN_INCLUSIVE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MAX_INCLUSIVE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATE_RANGE_Type", propOrder = {
    "min",
    "max",
    "mininclusive",
    "maxinclusive"
})
public class DATERANGEType
    implements Serializable
{

    @XmlElement(name = "MIN")
    protected OutputDateType min;
    @XmlElement(name = "MAX")
    protected OutputDateType max;
    @XmlElement(name = "MIN_INCLUSIVE")
    protected Object mininclusive;
    @XmlElement(name = "MAX_INCLUSIVE")
    protected Object maxinclusive;

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getMIN() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setMIN(OutputDateType value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getMAX() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setMAX(OutputDateType value) {
        this.max = value;
    }

    /**
     * Gets the value of the mininclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMININCLUSIVE() {
        return mininclusive;
    }

    /**
     * Sets the value of the mininclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMININCLUSIVE(Object value) {
        this.mininclusive = value;
    }

    /**
     * Gets the value of the maxinclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMAXINCLUSIVE() {
        return maxinclusive;
    }

    /**
     * Sets the value of the maxinclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMAXINCLUSIVE(Object value) {
        this.maxinclusive = value;
    }

}
