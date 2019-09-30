//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:25 AM KST 
//


package com.koreanair.external.altea.vo.service_standalonepricingreply_15_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortionProposedServiceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortionProposedServiceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="proposedServicePortionRef" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}ActionDetailsType"/>
 *         &lt;element name="proposedServiceDetailsGroup" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}ProposedServiceDetailsType" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortionProposedServiceInfoType", propOrder = {
    "proposedServicePortionRef",
    "proposedServiceDetailsGroup"
})
public class PortionProposedServiceInfoType {

    @XmlElement(required = true)
    protected ActionDetailsType proposedServicePortionRef;
    protected List<ProposedServiceDetailsType> proposedServiceDetailsGroup;

    /**
     * Gets the value of the proposedServicePortionRef property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsType }
     *     
     */
    public ActionDetailsType getProposedServicePortionRef() {
        return proposedServicePortionRef;
    }

    /**
     * Sets the value of the proposedServicePortionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsType }
     *     
     */
    public void setProposedServicePortionRef(ActionDetailsType value) {
        this.proposedServicePortionRef = value;
    }

    /**
     * Gets the value of the proposedServiceDetailsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proposedServiceDetailsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProposedServiceDetailsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProposedServiceDetailsType }
     * 
     * 
     */
    public List<ProposedServiceDetailsType> getProposedServiceDetailsGroup() {
        if (proposedServiceDetailsGroup == null) {
            proposedServiceDetailsGroup = new ArrayList<ProposedServiceDetailsType>();
        }
        return this.proposedServiceDetailsGroup;
    }

}
