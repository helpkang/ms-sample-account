//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.external.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to availability status or cabin configuration for a product.
 * 
 * <p>Java class for ProductInformationTypeI_20557S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationTypeI_20557S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookingClassDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ProductDetailsTypeI_36664C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformationTypeI_20557S", propOrder = {
    "bookingClassDetails"
})
public class ProductInformationTypeI20557S {

    @XmlElement(required = true)
    protected ProductDetailsTypeI36664C bookingClassDetails;

    /**
     * Gets the value of the bookingClassDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailsTypeI36664C }
     *     
     */
    public ProductDetailsTypeI36664C getBookingClassDetails() {
        return bookingClassDetails;
    }

    /**
     * Sets the value of the bookingClassDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailsTypeI36664C }
     *     
     */
    public void setBookingClassDetails(ProductDetailsTypeI36664C value) {
        this.bookingClassDetails = value;
    }

}
