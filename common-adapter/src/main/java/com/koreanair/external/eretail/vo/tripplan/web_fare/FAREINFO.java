
package com.koreanair.external.eretail.vo.tripplan.web_fare;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition of the fare information. Related to a segment from the itinerary, refer to the SEGMENT_IDENTIFIER to find the related segment.
 * 
 * <p>Java class for FARE_INFO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_INFO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SEGMENT_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FARE_INFO"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "FARE_INFO", propOrder = {
    "segmentidentifier",
    "fareinfo"
})
public class FAREINFO
    implements Serializable
{

    @XmlElement(name = "SEGMENT_IDENTIFIER", required = true)
    protected String segmentidentifier;
    @XmlElement(name = "FARE_INFO", required = true)
    protected FAREINFO.FAREINFORename fareinfo;

    /**
     * Gets the value of the segmentidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTIDENTIFIER() {
        return segmentidentifier;
    }

    /**
     * Sets the value of the segmentidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTIDENTIFIER(String value) {
        this.segmentidentifier = value;
    }

    /**
     * Gets the value of the fareinfo property.
     * 
     * @return
     *     possible object is
     *     {@link FAREINFO.FAREINFORename }
     *     
     */
    public FAREINFO.FAREINFORename getFAREINFO() {
        return fareinfo;
    }

    /**
     * Sets the value of the fareinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAREINFO.FAREINFORename }
     *     
     */
    public void setFAREINFO(FAREINFO.FAREINFORename value) {
        this.fareinfo = value;
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
     *         &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "rbd"
    })
    public static class FAREINFORename
        implements Serializable
    {

        @XmlElement(name = "RBD", required = true)
        protected String rbd;

        /**
         * Gets the value of the rbd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRBD() {
            return rbd;
        }

        /**
         * Sets the value of the rbd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRBD(String value) {
            this.rbd = value;
        }

    }

}
