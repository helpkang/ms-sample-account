
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Multimedia information
 * 
 * <p>Java class for MultimediaInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultimediaInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="THUMBNAIL_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MARKETING_TEXT" type="{}MarketingTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaInformationType", propOrder = {
    "thumbnailurl",
    "marketingtext"
})
public class MultimediaInformationType
    implements Serializable
{

    @XmlElement(name = "THUMBNAIL_URL")
    protected String thumbnailurl;
    @XmlElement(name = "MARKETING_TEXT")
    protected MarketingTextType marketingtext;

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
     * Gets the value of the marketingtext property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingTextType }
     *     
     */
    public MarketingTextType getMARKETINGTEXT() {
        return marketingtext;
    }

    /**
     * Sets the value of the marketingtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingTextType }
     *     
     */
    public void setMARKETINGTEXT(MarketingTextType value) {
        this.marketingtext = value;
    }

}
