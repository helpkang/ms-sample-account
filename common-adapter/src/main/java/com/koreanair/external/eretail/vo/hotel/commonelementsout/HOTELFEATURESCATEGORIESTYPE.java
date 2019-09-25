
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Multimedia Hotel Features categories
 * 
 * <p>Java class for HOTEL_FEATURES_CATEGORIES_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_FEATURES_CATEGORIES_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LIST_IMAGES" type="{}HOTEL_FEATURES_CATEGORIES_IMAGES_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_VIDEO" type="{}HOTEL_FEATURES_CATEGORIES_VIDEO_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_FEATURES_CATEGORIES_TYPE", propOrder = {
    "code",
    "listimages",
    "listvideo"
})
public class HOTELFEATURESCATEGORIESTYPE
    implements Serializable
{

    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "LIST_IMAGES")
    protected List<HOTELFEATURESCATEGORIESIMAGESTYPE> listimages;
    @XmlElement(name = "LIST_VIDEO")
    protected List<HOTELFEATURESCATEGORIESVIDEOTYPE> listvideo;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
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

}
