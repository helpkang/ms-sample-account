//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.27 at 10:34:16 ���� KST 
//


package com.koreanair.external.altea.vo.pnr_searchreply_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning excess baggage charges and the associated baggage details.
 * 
 * <p>Java class for ExcessBaggageTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcessBaggageTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bagTagDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}BagtagDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessBaggageTypeI", propOrder = {
    "bagTagDetails"
})
public class ExcessBaggageTypeI {

    @XmlElement(required = true)
    protected BagtagDetailsTypeI bagTagDetails;

    /**
     * Gets the value of the bagTagDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BagtagDetailsTypeI }
     *     
     */
    public BagtagDetailsTypeI getBagTagDetails() {
        return bagTagDetails;
    }

    /**
     * Sets the value of the bagTagDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagtagDetailsTypeI }
     *     
     */
    public void setBagTagDetails(BagtagDetailsTypeI value) {
        this.bagTagDetails = value;
    }

}
