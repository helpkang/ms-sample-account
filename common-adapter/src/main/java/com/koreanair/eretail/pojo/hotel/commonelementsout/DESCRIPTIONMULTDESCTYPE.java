
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.common.CODENAMETYPESTRICT;


/**
 * FreeText - may be in different languages
 * 
 * <p>Java class for DESCRIPTION_MULTDESC_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DESCRIPTION_MULTDESC_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}CODE_NAME_TYPE_STRICT" minOccurs="0"/&gt;
 *         &lt;element name="SUBTYPE" type="{}CODE_NAME_TYPE_STRICT" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TEXT" type="{}DESCRIPTION_FREETEXT_TEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_IMAGES" type="{}HOTEL_FEATURES_CATEGORIES_IMAGES_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_VIDEO" type="{}HOTEL_FEATURES_CATEGORIES_VIDEO_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TITLE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "DESCRIPTION_MULTDESC_TYPE", propOrder = {
    "type",
    "subtype",
    "listtext",
    "listimages",
    "listvideo",
    "title"
})
public class DESCRIPTIONMULTDESCTYPE
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected CODENAMETYPESTRICT type;
    @XmlElement(name = "SUBTYPE")
    protected CODENAMETYPESTRICT subtype;
    @XmlElement(name = "LIST_TEXT")
    protected List<DESCRIPTIONFREETEXTTEXTTYPE> listtext;
    @XmlElement(name = "LIST_IMAGES")
    protected List<HOTELFEATURESCATEGORIESIMAGESTYPE> listimages;
    @XmlElement(name = "LIST_VIDEO")
    protected List<HOTELFEATURESCATEGORIESVIDEOTYPE> listvideo;
    @XmlElement(name = "TITLE")
    protected DESCRIPTIONMULTDESCTYPE.TITLE title;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public CODENAMETYPESTRICT getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public void setTYPE(CODENAMETYPESTRICT value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public CODENAMETYPESTRICT getSUBTYPE() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public void setSUBTYPE(CODENAMETYPESTRICT value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the listtext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTEXT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESCRIPTIONFREETEXTTEXTTYPE }
     * 
     * 
     */
    public List<DESCRIPTIONFREETEXTTEXTTYPE> getLISTTEXT() {
        if (listtext == null) {
            listtext = new ArrayList<DESCRIPTIONFREETEXTTEXTTYPE>();
        }
        return this.listtext;
    }

    /**
     * Gets the value of the listimages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listimages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTIMAGES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HOTELFEATURESCATEGORIESIMAGESTYPE }
     * 
     * 
     */
    public List<HOTELFEATURESCATEGORIESIMAGESTYPE> getLISTIMAGES() {
        if (listimages == null) {
            listimages = new ArrayList<HOTELFEATURESCATEGORIESIMAGESTYPE>();
        }
        return this.listimages;
    }

    /**
     * Gets the value of the listvideo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listvideo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTVIDEO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HOTELFEATURESCATEGORIESVIDEOTYPE }
     * 
     * 
     */
    public List<HOTELFEATURESCATEGORIESVIDEOTYPE> getLISTVIDEO() {
        if (listvideo == null) {
            listvideo = new ArrayList<HOTELFEATURESCATEGORIESVIDEOTYPE>();
        }
        return this.listvideo;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link DESCRIPTIONMULTDESCTYPE.TITLE }
     *     
     */
    public DESCRIPTIONMULTDESCTYPE.TITLE getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link DESCRIPTIONMULTDESCTYPE.TITLE }
     *     
     */
    public void setTITLE(DESCRIPTIONMULTDESCTYPE.TITLE value) {
        this.title = value;
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
     *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "language",
        "text"
    })
    public static class TITLE
        implements Serializable
    {

        @XmlElement(name = "LANGUAGE")
        protected Object language;
        @XmlElement(name = "TEXT")
        protected Object text;

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLANGUAGE() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLANGUAGE(Object value) {
            this.language = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTEXT() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTEXT(Object value) {
            this.text = value;
        }

    }

}
