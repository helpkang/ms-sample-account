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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify tariff details relating to a service or product.
 * 
 * <p>Java class for TariffInformationTypeI_133012S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformationTypeI_133012S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tariffInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}TariffInformationDetailsTypeI_188214C"/>
 *         &lt;element name="rateInformation" type="{http://xml.amadeus.com/PNRACC_13_2_1A}RateInformationTypeI" minOccurs="0"/>
 *         &lt;element name="chargeDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AssociatedChargesInformationTypeI" maxOccurs="30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformationTypeI_133012S", propOrder = {
    "tariffInfo",
    "rateInformation",
    "chargeDetails"
})
public class TariffInformationTypeI133012S {

    @XmlElement(required = true)
    protected TariffInformationDetailsTypeI188214C tariffInfo;
    protected RateInformationTypeI rateInformation;
    protected List<AssociatedChargesInformationTypeI> chargeDetails;

    /**
     * Gets the value of the tariffInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationDetailsTypeI188214C }
     *     
     */
    public TariffInformationDetailsTypeI188214C getTariffInfo() {
        return tariffInfo;
    }

    /**
     * Sets the value of the tariffInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationDetailsTypeI188214C }
     *     
     */
    public void setTariffInfo(TariffInformationDetailsTypeI188214C value) {
        this.tariffInfo = value;
    }

    /**
     * Gets the value of the rateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RateInformationTypeI }
     *     
     */
    public RateInformationTypeI getRateInformation() {
        return rateInformation;
    }

    /**
     * Sets the value of the rateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInformationTypeI }
     *     
     */
    public void setRateInformation(RateInformationTypeI value) {
        this.rateInformation = value;
    }

    /**
     * Gets the value of the chargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedChargesInformationTypeI }
     * 
     * 
     */
    public List<AssociatedChargesInformationTypeI> getChargeDetails() {
        if (chargeDetails == null) {
            chargeDetails = new ArrayList<AssociatedChargesInformationTypeI>();
        }
        return this.chargeDetails;
    }

}
