
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Frequent flyer reference from air preference structure
 * 
 * <p>Java class for FREQUENT_FLYER_REFERENCE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FREQUENT_FLYER_REFERENCE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FREQUENT_FLYER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRODUCT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FREQUENT_FLYER_REFERENCE_TYPE", propOrder = {

})
public class FREQUENTFLYERREFERENCETYPE
    implements Serializable
{

    @XmlElement(name = "INDEX")
    protected BigInteger index;
    @XmlElement(name = "FREQUENT_FLYER_ID")
    protected String frequentflyerid;
    @XmlElement(name = "PRODUCT")
    protected FREQUENTFLYERREFERENCETYPE.PRODUCT product;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINDEX() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINDEX(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the frequentflyerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREQUENTFLYERID() {
        return frequentflyerid;
    }

    /**
     * Sets the value of the frequentflyerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREQUENTFLYERID(String value) {
        this.frequentflyerid = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link FREQUENTFLYERREFERENCETYPE.PRODUCT }
     *     
     */
    public FREQUENTFLYERREFERENCETYPE.PRODUCT getPRODUCT() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link FREQUENTFLYERREFERENCETYPE.PRODUCT }
     *     
     */
    public void setPRODUCT(FREQUENTFLYERREFERENCETYPE.PRODUCT value) {
        this.product = value;
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
     *       &lt;all&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class PRODUCT
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "ITEM_ID")
        protected String itemid;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the itemid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getITEMID() {
            return itemid;
        }

        /**
         * Sets the value of the itemid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setITEMID(String value) {
            this.itemid = value;
        }

    }

}
