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
 * a collection of Award elements.
 * 
 * <p>Java class for AwardsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="award" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AwardType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardsType", propOrder = {
    "award"
})
public class AwardsType {

    @XmlElement(required = true)
    protected AwardType award;

    /**
     * Gets the value of the award property.
     * 
     * @return
     *     possible object is
     *     {@link AwardType }
     *     
     */
    public AwardType getAward() {
        return award;
    }

    /**
     * Sets the value of the award property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardType }
     *     
     */
    public void setAward(AwardType value) {
        this.award = value;
    }

}
