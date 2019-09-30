//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.external.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to routing status of a product.
 * 
 * <p>Java class for ProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productDetailsQualifier" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="bookingClassDetails" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}ProductDetailsType_159470C" maxOccurs="26" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformationType", propOrder = {
    "productDetailsQualifier",
    "bookingClassDetails"
})
public class ProductInformationType {

    protected String productDetailsQualifier;
    protected List<ProductDetailsType159470C> bookingClassDetails;

    /**
     * Gets the value of the productDetailsQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDetailsQualifier() {
        return productDetailsQualifier;
    }

    /**
     * Sets the value of the productDetailsQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDetailsQualifier(String value) {
        this.productDetailsQualifier = value;
    }

    /**
     * Gets the value of the bookingClassDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClassDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClassDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDetailsType159470C }
     * 
     * 
     */
    public List<ProductDetailsType159470C> getBookingClassDetails() {
        if (bookingClassDetails == null) {
            bookingClassDetails = new ArrayList<ProductDetailsType159470C>();
        }
        return this.bookingClassDetails;
    }

}
