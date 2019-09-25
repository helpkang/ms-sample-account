
package com.koreanair.external.eretail.vo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FEE_VALUE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEE_VALUE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}FEE_VALUE_TYPE_Type"/&gt;
 *         &lt;element name="CATEGORY" type="{}FEE_VALUE_CATEGORY_Type" minOccurs="0"/&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEE_VALUE_Type", propOrder = {
    "type",
    "category",
    "value"
})
public class FEEVALUEType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected FEEVALUETYPEType type;
    @XmlElement(name = "CATEGORY")
    protected FEEVALUECATEGORYType category;
    @XmlElement(name = "VALUE", required = true)
    protected BigDecimal value;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FEEVALUETYPEType }
     *     
     */
    public FEEVALUETYPEType getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEEVALUETYPEType }
     *     
     */
    public void setTYPE(FEEVALUETYPEType value) {
        this.type = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link FEEVALUECATEGORYType }
     *     
     */
    public FEEVALUECATEGORYType getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEEVALUECATEGORYType }
     *     
     */
    public void setCATEGORY(FEEVALUECATEGORYType value) {
        this.category = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALUE(BigDecimal value) {
        this.value = value;
    }

}
