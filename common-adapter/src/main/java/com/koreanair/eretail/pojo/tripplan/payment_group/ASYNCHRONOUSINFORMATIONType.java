
package com.koreanair.eretail.pojo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ASYNCHRONOUS_INFORMATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASYNCHRONOUS_INFORMATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ASYNCHRONOUS_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BANK"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KEY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REFERENCE" type="{}ASYNC_REFERENCE_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASYNCHRONOUS_INFORMATIONType", propOrder = {
    "asynchronousstatus",
    "bank",
    "reference"
})
public class ASYNCHRONOUSINFORMATIONType implements Serializable
{

    @XmlElement(name = "ASYNCHRONOUS_STATUS", required = true)
    protected String asynchronousstatus;
    @XmlElement(name = "BANK", required = true)
    protected ASYNCHRONOUSINFORMATIONType.BANK bank;
    @XmlElement(name = "REFERENCE")
    protected ASYNCREFERENCEType reference;

    /**
     * Gets the value of the asynchronousstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASYNCHRONOUSSTATUS() {
        return asynchronousstatus;
    }

    /**
     * Sets the value of the asynchronousstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASYNCHRONOUSSTATUS(String value) {
        this.asynchronousstatus = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link ASYNCHRONOUSINFORMATIONType.BANK }
     *     
     */
    public ASYNCHRONOUSINFORMATIONType.BANK getBANK() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASYNCHRONOUSINFORMATIONType.BANK }
     *     
     */
    public void setBANK(ASYNCHRONOUSINFORMATIONType.BANK value) {
        this.bank = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ASYNCREFERENCEType }
     *     
     */
    public ASYNCREFERENCEType getREFERENCE() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASYNCREFERENCEType }
     *     
     */
    public void setREFERENCE(ASYNCREFERENCEType value) {
        this.reference = value;
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
     *         &lt;element name="KEY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "key",
        "provider"
    })
    public static class BANK
        implements Serializable
    {

        @XmlElement(name = "KEY", required = true)
        protected String key;
        @XmlElement(name = "PROVIDER", required = true)
        protected String provider;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKEY() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKEY(String value) {
            this.key = value;
        }

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROVIDER() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROVIDER(String value) {
            this.provider = value;
        }

    }

}
