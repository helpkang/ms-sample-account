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
 * Train Product Information
 * 
 * <p>Java class for TrainProductInformationType_132986S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainProductInformationType_132986S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="railCompany" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To4"/>
 *         &lt;element name="trainDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}TrainDetailsType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainProductInformationType_132986S", propOrder = {
    "railCompany",
    "trainDetails",
    "type"
})
public class TrainProductInformationType132986S {

    @XmlElement(required = true)
    protected String railCompany;
    protected TrainDetailsType trainDetails;
    @XmlElement(required = true)
    protected String type;

    /**
     * Gets the value of the railCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailCompany() {
        return railCompany;
    }

    /**
     * Sets the value of the railCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailCompany(String value) {
        this.railCompany = value;
    }

    /**
     * Gets the value of the trainDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TrainDetailsType }
     *     
     */
    public TrainDetailsType getTrainDetails() {
        return trainDetails;
    }

    /**
     * Sets the value of the trainDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainDetailsType }
     *     
     */
    public void setTrainDetails(TrainDetailsType value) {
        this.trainDetails = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
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
    public void setType(String value) {
        this.type = value;
    }

}
