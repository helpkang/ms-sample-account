//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for FareComponentsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constructionContextInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}FareComponentInformationTypeI"/>
 *         &lt;element name="pricingUnitInfoGroup" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}PricingUnitInfoType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentsInfoType", propOrder = {
    "constructionContextInfo",
    "pricingUnitInfoGroup"
})
public class FareComponentsInfoType {

    @XmlElement(required = true)
    protected FareComponentInformationTypeI constructionContextInfo;
    protected List<PricingUnitInfoType> pricingUnitInfoGroup;

    /**
     * Gets the value of the constructionContextInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentInformationTypeI }
     *     
     */
    public FareComponentInformationTypeI getConstructionContextInfo() {
        return constructionContextInfo;
    }

    /**
     * Sets the value of the constructionContextInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentInformationTypeI }
     *     
     */
    public void setConstructionContextInfo(FareComponentInformationTypeI value) {
        this.constructionContextInfo = value;
    }

    /**
     * Gets the value of the pricingUnitInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingUnitInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingUnitInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingUnitInfoType }
     * 
     * 
     */
    public List<PricingUnitInfoType> getPricingUnitInfoGroup() {
        if (pricingUnitInfoGroup == null) {
            pricingUnitInfoGroup = new ArrayList<PricingUnitInfoType>();
        }
        return this.pricingUnitInfoGroup;
    }

}
