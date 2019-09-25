
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Images of a Multimedia Hotel Features category
 * 
 * <p>Java class for ImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}DescriptionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CAPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_IMAGES_SIZES" type="{}ImageSizeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ORIGINAL_IMAGE_SIZE" type="{}SimpleMultimediaSize" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageType", propOrder = {
    "caption",
    "listimagessizes",
    "originalimagesize"
})
public class ImageType
    extends DescriptionType
    implements Serializable
{

    @XmlElement(name = "CAPTION")
    protected String caption;
    @XmlElement(name = "LIST_IMAGES_SIZES")
    protected List<ImageSizeType> listimagessizes;
    @XmlElement(name = "ORIGINAL_IMAGE_SIZE")
    protected SimpleMultimediaSize originalimagesize;

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
     * {@link ImageSizeType }
     * 
     * 
     */
    public List<ImageSizeType> getLISTIMAGESSIZES() {
        if (listimagessizes == null) {
            listimagessizes = new ArrayList<ImageSizeType>();
        }
        return this.listimagessizes;
    }

    /**
     * Gets the value of the originalimagesize property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleMultimediaSize }
     *     
     */
    public SimpleMultimediaSize getORIGINALIMAGESIZE() {
        return originalimagesize;
    }

    /**
     * Sets the value of the originalimagesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleMultimediaSize }
     *     
     */
    public void setORIGINALIMAGESIZE(SimpleMultimediaSize value) {
        this.originalimagesize = value;
    }

}
