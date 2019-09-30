//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.external.altea.vo.pnr_reply_13_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelRoomRateInformationType_188211C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomRateInformationType_188211C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomType" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length3To3" minOccurs="0"/>
 *         &lt;element name="ratePlanCode" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length3To3" minOccurs="0"/>
 *         &lt;element name="rateCategoryCode" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To35" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="rateQualifiedIndic" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To1" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomRateInformationType_188211C", propOrder = {
    "roomType",
    "ratePlanCode",
    "rateCategoryCode",
    "rateQualifiedIndic"
})
public class HotelRoomRateInformationType188211C {

    protected String roomType;
    protected String ratePlanCode;
    protected List<String> rateCategoryCode;
    protected List<String> rateQualifiedIndic;

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the ratePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * Sets the value of the ratePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * Gets the value of the rateCategoryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateCategoryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateCategoryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRateCategoryCode() {
        if (rateCategoryCode == null) {
            rateCategoryCode = new ArrayList<String>();
        }
        return this.rateCategoryCode;
    }

    /**
     * Gets the value of the rateQualifiedIndic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateQualifiedIndic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateQualifiedIndic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRateQualifiedIndic() {
        if (rateQualifiedIndic == null) {
            rateQualifiedIndic = new ArrayList<String>();
        }
        return this.rateQualifiedIndic;
    }

}
