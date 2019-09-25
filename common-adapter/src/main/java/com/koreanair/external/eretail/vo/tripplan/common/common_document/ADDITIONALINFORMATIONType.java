
package com.koreanair.external.eretail.vo.tripplan.common.common_document;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADDITIONAL_INFORMATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADDITIONAL_INFORMATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QUANTITY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RATE_PER_UNIT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADDITIONAL_INFORMATIONType", propOrder = {
    "quantity",
    "price"
})
public class ADDITIONALINFORMATIONType
    implements Serializable
{

    @XmlElement(name = "QUANTITY")
    protected ADDITIONALINFORMATIONType.QUANTITY quantity;
    @XmlElement(name = "PRICE")
    protected ADDITIONALINFORMATIONType.PRICE price;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link ADDITIONALINFORMATIONType.QUANTITY }
     *     
     */
    public ADDITIONALINFORMATIONType.QUANTITY getQUANTITY() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDITIONALINFORMATIONType.QUANTITY }
     *     
     */
    public void setQUANTITY(ADDITIONALINFORMATIONType.QUANTITY value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link ADDITIONALINFORMATIONType.PRICE }
     *     
     */
    public ADDITIONALINFORMATIONType.PRICE getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDITIONALINFORMATIONType.PRICE }
     *     
     */
    public void setPRICE(ADDITIONALINFORMATIONType.PRICE value) {
        this.price = value;
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
     *         &lt;element name="RATE_PER_UNIT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "rateperunit",
        "currency"
    })
    public static class PRICE
        implements Serializable
    {

        @XmlElement(name = "RATE_PER_UNIT", required = true)
        protected Object rateperunit;
        @XmlElement(name = "CURRENCY")
        protected Object currency;

        /**
         * Gets the value of the rateperunit property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRATEPERUNIT() {
            return rateperunit;
        }

        /**
         * Sets the value of the rateperunit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRATEPERUNIT(Object value) {
            this.rateperunit = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCURRENCY(Object value) {
            this.currency = value;
        }

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
     *         &lt;element name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "quantity",
        "unit"
    })
    public static class QUANTITY
        implements Serializable
    {

        @XmlElement(name = "QUANTITY", required = true)
        protected Object quantity;
        @XmlElement(name = "UNIT")
        protected Object unit;

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getQUANTITY() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setQUANTITY(Object value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getUNIT() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setUNIT(Object value) {
            this.unit = value;
        }

    }

}
