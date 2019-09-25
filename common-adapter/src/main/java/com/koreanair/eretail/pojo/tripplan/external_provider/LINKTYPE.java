
package com.koreanair.eretail.pojo.tripplan.external_provider;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINK_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LINK_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LINK_URL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LINK_TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINK_TYPE", propOrder = {
    "linkurl",
    "linktext"
})
public class LINKTYPE
    implements Serializable
{

    @XmlElement(name = "LINK_URL", required = true)
    protected String linkurl;
    @XmlElement(name = "LINK_TEXT", required = true)
    protected String linktext;

    /**
     * Gets the value of the linkurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKURL() {
        return linkurl;
    }

    /**
     * Sets the value of the linkurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKURL(String value) {
        this.linkurl = value;
    }

    /**
     * Gets the value of the linktext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKTEXT() {
        return linktext;
    }

    /**
     * Sets the value of the linktext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKTEXT(String value) {
        this.linktext = value;
    }

}
