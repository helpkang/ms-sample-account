
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Video of a Multimedia Hotel Features category
 * 
 * <p>Java class for VideoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}DescriptionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CAPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LIST_FORMAT" type="{}VideoFormatType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoType", propOrder = {
    "caption",
    "type",
    "listformat"
})
public class VideoType
    extends DescriptionType
    implements Serializable
{

    @XmlElement(name = "CAPTION")
    protected String caption;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "LIST_FORMAT")
    protected List<VideoFormatType> listformat;

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
     * Gets the value of the listformat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listformat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFORMAT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoFormatType }
     * 
     * 
     */
    public List<VideoFormatType> getLISTFORMAT() {
        if (listformat == null) {
            listformat = new ArrayList<VideoFormatType>();
        }
        return this.listformat;
    }

}
