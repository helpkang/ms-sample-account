
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Multimedia information
 * 
 * <p>Java class for MULTIMEDIA_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MULTIMEDIA_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="THUMBNAIL_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_IMAGES_SIZES" type="{}HOTEL_FEATURES_IMAGE_SIZE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MARKETING_TEXT" type="{}MARKETING_TEXT_TYPE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MULTIMEDIA_TYPE", propOrder = {
    "thumbnailurl",
    "listimagessizes",
    "marketingtext"
})
public class MULTIMEDIATYPE
    implements Serializable
{

    @XmlElement(name = "THUMBNAIL_URL")
    protected String thumbnailurl;
    @XmlElement(name = "LIST_IMAGES_SIZES")
    protected List<HOTELFEATURESIMAGESIZETYPE> listimagessizes;
    @XmlElement(name = "MARKETING_TEXT")
    protected MARKETINGTEXTTYPE marketingtext;

    /**
     * Gets the value of the thumbnailurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTHUMBNAILURL() {
        return thumbnailurl;
    }

    /**
     * Sets the value of the thumbnailurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTHUMBNAILURL(String value) {
        this.thumbnailurl = value;
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
     * Gets the value of the marketingtext property.
     * 
     * @return
     *     possible object is
     *     {@link MARKETINGTEXTTYPE }
     *     
     */
    public MARKETINGTEXTTYPE getMARKETINGTEXT() {
        return marketingtext;
    }

    /**
     * Sets the value of the marketingtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARKETINGTEXTTYPE }
     *     
     */
    public void setMARKETINGTEXT(MARKETINGTEXTTYPE value) {
        this.marketingtext = value;
    }

}
