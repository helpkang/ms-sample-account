//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.external.altea.vo.service_priceintegratemode_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of data to be sent and to qualify the data when required.
 * 
 * <p>Java class for DataTypeInformationType_159331C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataTypeInformationType_159331C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AMA_EDICodesetType_Length1to3"/>
 *         &lt;element name="statusEvent" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTypeInformationType_159331C", propOrder = {
    "type",
    "statusEvent"
})
public class DataTypeInformationType159331C {

    @XmlElement(required = true)
    protected String type;
    protected String statusEvent;

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

    /**
     * Gets the value of the statusEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusEvent() {
        return statusEvent;
    }

    /**
     * Sets the value of the statusEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusEvent(String value) {
        this.statusEvent = value;
    }

}
