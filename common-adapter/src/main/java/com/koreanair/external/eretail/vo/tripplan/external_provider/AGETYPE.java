
package com.koreanair.external.eretail.vo.tripplan.external_provider;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="EXACT_AGE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *           &lt;element name="AGE_RANGE" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="MIN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                     &lt;element name="MAX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="AGE_UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGE_TYPE", propOrder = {
    "exactage",
    "agerange",
    "ageunit"
})
public class AGETYPE
    implements Serializable
{

    @XmlElement(name = "EXACT_AGE")
    protected Integer exactage;
    @XmlElement(name = "AGE_RANGE")
    protected AGETYPE.AGERANGE agerange;
    @XmlElement(name = "AGE_UNIT", required = true)
    protected String ageunit;

    /**
     * Gets the value of the exactage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEXACTAGE() {
        return exactage;
    }

    /**
     * Sets the value of the exactage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEXACTAGE(Integer value) {
        this.exactage = value;
    }

    /**
     * Gets the value of the agerange property.
     * 
     * @return
     *     possible object is
     *     {@link AGETYPE.AGERANGE }
     *     
     */
    public AGETYPE.AGERANGE getAGERANGE() {
        return agerange;
    }

    /**
     * Sets the value of the agerange property.
     * 
     * @param value
     *     allowed object is
     *     {@link AGETYPE.AGERANGE }
     *     
     */
    public void setAGERANGE(AGETYPE.AGERANGE value) {
        this.agerange = value;
    }

    /**
     * Gets the value of the ageunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGEUNIT() {
        return ageunit;
    }

    /**
     * Sets the value of the ageunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGEUNIT(String value) {
        this.ageunit = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="MIN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="MAX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "min",
        "max"
    })
    public static class AGERANGE
        implements Serializable
    {

        @XmlElement(name = "MIN")
        protected BigDecimal min;
        @XmlElement(name = "MAX")
        protected BigDecimal max;

        /**
         * Gets the value of the min property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMIN() {
            return min;
        }

        /**
         * Sets the value of the min property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMIN(BigDecimal value) {
            this.min = value;
        }

        /**
         * Gets the value of the max property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMAX() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMAX(BigDecimal value) {
            this.max = value;
        }

    }

}
