
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Images of a Multimedia Hotel Features category
 * 
 * <p>Java class for HOTEL_FEATURES_CATEGORIES_IMAGES_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_FEATURES_CATEGORIES_IMAGES_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CAPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_IMAGES_SIZES" type="{}HOTEL_FEATURES_IMAGE_SIZE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ORIGINAL_IMAGE_SIZE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
@XmlType(name = "HOTEL_FEATURES_CATEGORIES_IMAGES_TYPE", propOrder = {
    "caption",
    "description",
    "language",
    "listimagessizes",
    "originalimagesize"
})
public class HOTELFEATURESCATEGORIESIMAGESTYPE
    implements Serializable
{

    @XmlElement(name = "CAPTION")
    protected String caption;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "LANGUAGE")
    protected String language;
    @XmlElement(name = "LIST_IMAGES_SIZES")
    protected List<HOTELFEATURESIMAGESIZETYPE> listimagessizes;
    @XmlElement(name = "ORIGINAL_IMAGE_SIZE")
    protected HOTELFEATURESCATEGORIESIMAGESTYPE.ORIGINALIMAGESIZE originalimagesize;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPTION() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPTION(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the listimagessizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listimagessizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTIMAGESSIZES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HOTELFEATURESIMAGESIZETYPE }
     * 
     * 
     */
    public List<HOTELFEATURESIMAGESIZETYPE> getLISTIMAGESSIZES() {
        if (listimagessizes == null) {
            listimagessizes = new ArrayList<HOTELFEATURESIMAGESIZETYPE>();
        }
        return this.listimagessizes;
    }

    /**
     * Gets the value of the originalimagesize property.
     * 
     * @return
     *     possible object is
     *     {@link HOTELFEATURESCATEGORIESIMAGESTYPE.ORIGINALIMAGESIZE }
     *     
     */
    public HOTELFEATURESCATEGORIESIMAGESTYPE.ORIGINALIMAGESIZE getORIGINALIMAGESIZE() {
        return originalimagesize;
    }

    /**
     * Sets the value of the originalimagesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOTELFEATURESCATEGORIESIMAGESTYPE.ORIGINALIMAGESIZE }
     *     
     */
    public void setORIGINALIMAGESIZE(HOTELFEATURESCATEGORIESIMAGESTYPE.ORIGINALIMAGESIZE value) {
        this.originalimagesize = value;
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
     *         &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "width",
        "height"
    })
    public static class ORIGINALIMAGESIZE
        implements Serializable
    {

        @XmlElement(name = "WIDTH", required = true)
        protected BigInteger width;
        @XmlElement(name = "HEIGHT", required = true)
        protected BigInteger height;

        /**
         * Gets the value of the width property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWIDTH() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWIDTH(BigInteger value) {
            this.width = value;
        }

        /**
         * Gets the value of the height property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHEIGHT() {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHEIGHT(BigInteger value) {
            this.height = value;
        }

    }

}
