//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeDetailsInfoType_168126G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDetailsInfoType_168126G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feeInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}SpecificDataInformationType_67504S"/>
 *         &lt;element name="descriptionInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}InteractiveFreeTextType" minOccurs="0"/>
 *         &lt;element name="amountsInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}MonetaryInformationType_67503S" minOccurs="0"/>
 *         &lt;element name="formOfPaymentInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}FormOfPaymentType_148309S" minOccurs="0"/>
 *         &lt;element name="taxesDetailsInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}TaxDetailsType_67505S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDetailsInfoType_168126G", propOrder = {
    "feeInfo",
    "descriptionInfo",
    "amountsInfo",
    "formOfPaymentInfo",
    "taxesDetailsInfo"
})
public class FeeDetailsInfoType168126G {

    @XmlElement(required = true)
    protected SpecificDataInformationType67504S feeInfo;
    protected InteractiveFreeTextType descriptionInfo;
    protected MonetaryInformationType67503S amountsInfo;
    protected FormOfPaymentType148309S formOfPaymentInfo;
    protected TaxDetailsType67505S taxesDetailsInfo;

    /**
     * Gets the value of the feeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificDataInformationType67504S }
     *     
     */
    public SpecificDataInformationType67504S getFeeInfo() {
        return feeInfo;
    }

    /**
     * Sets the value of the feeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificDataInformationType67504S }
     *     
     */
    public void setFeeInfo(SpecificDataInformationType67504S value) {
        this.feeInfo = value;
    }

    /**
     * Gets the value of the descriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InteractiveFreeTextType }
     *     
     */
    public InteractiveFreeTextType getDescriptionInfo() {
        return descriptionInfo;
    }

    /**
     * Sets the value of the descriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractiveFreeTextType }
     *     
     */
    public void setDescriptionInfo(InteractiveFreeTextType value) {
        this.descriptionInfo = value;
    }

    /**
     * Gets the value of the amountsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType67503S }
     *     
     */
    public MonetaryInformationType67503S getAmountsInfo() {
        return amountsInfo;
    }

    /**
     * Sets the value of the amountsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType67503S }
     *     
     */
    public void setAmountsInfo(MonetaryInformationType67503S value) {
        this.amountsInfo = value;
    }

    /**
     * Gets the value of the formOfPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentType148309S }
     *     
     */
    public FormOfPaymentType148309S getFormOfPaymentInfo() {
        return formOfPaymentInfo;
    }

    /**
     * Sets the value of the formOfPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentType148309S }
     *     
     */
    public void setFormOfPaymentInfo(FormOfPaymentType148309S value) {
        this.formOfPaymentInfo = value;
    }

    /**
     * Gets the value of the taxesDetailsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailsType67505S }
     *     
     */
    public TaxDetailsType67505S getTaxesDetailsInfo() {
        return taxesDetailsInfo;
    }

    /**
     * Sets the value of the taxesDetailsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailsType67505S }
     *     
     */
    public void setTaxesDetailsInfo(TaxDetailsType67505S value) {
        this.taxesDetailsInfo = value;
    }

}
