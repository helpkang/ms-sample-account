
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoFormatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}SimpleMultimediaSize"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="STREAMING_SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoFormatType", propOrder = {
    "url",
    "streamingsource"
})
public class VideoFormatType
    extends SimpleMultimediaSize
    implements Serializable
{

    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "STREAMING_SOURCE")
    protected String streamingsource;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the streamingsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTREAMINGSOURCE() {
        return streamingsource;
    }

    /**
     * Sets the value of the streamingsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTREAMINGSOURCE(String value) {
        this.streamingsource = value;
    }

}
