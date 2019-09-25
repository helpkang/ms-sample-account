
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Product information.
 * 
 * <p>Java class for Product_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FARE_PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SEGMENT_PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SEGMENT_PRODUCT_UPSELL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SEGMENT_PRODUCT_DOWNSELL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product_Type", propOrder = {
    "fareproduct",
    "segmentproduct",
    "segmentproductupsell",
    "segmentproductdownsell"
})
public class ProductType
    implements Serializable
{

    @XmlElement(name = "FARE_PRODUCT", required = true)
    protected String fareproduct;
    @XmlElement(name = "SEGMENT_PRODUCT", required = true)
    protected String segmentproduct;
    @XmlElement(name = "SEGMENT_PRODUCT_UPSELL")
    protected boolean segmentproductupsell;
    @XmlElement(name = "SEGMENT_PRODUCT_DOWNSELL")
    protected boolean segmentproductdownsell;

    /**
     * Gets the value of the fareproduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREPRODUCT() {
        return fareproduct;
    }

    /**
     * Sets the value of the fareproduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREPRODUCT(String value) {
        this.fareproduct = value;
    }

    /**
     * Gets the value of the segmentproduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTPRODUCT() {
        return segmentproduct;
    }

    /**
     * Sets the value of the segmentproduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTPRODUCT(String value) {
        this.segmentproduct = value;
    }

    /**
     * Gets the value of the segmentproductupsell property.
     * 
     */
    public boolean isSEGMENTPRODUCTUPSELL() {
        return segmentproductupsell;
    }

    /**
     * Sets the value of the segmentproductupsell property.
     * 
     */
    public void setSEGMENTPRODUCTUPSELL(boolean value) {
        this.segmentproductupsell = value;
    }

    /**
     * Gets the value of the segmentproductdownsell property.
     * 
     */
    public boolean isSEGMENTPRODUCTDOWNSELL() {
        return segmentproductdownsell;
    }

    /**
     * Sets the value of the segmentproductdownsell property.
     * 
     */
    public void setSEGMENTPRODUCTDOWNSELL(boolean value) {
        this.segmentproductdownsell = value;
    }

}
