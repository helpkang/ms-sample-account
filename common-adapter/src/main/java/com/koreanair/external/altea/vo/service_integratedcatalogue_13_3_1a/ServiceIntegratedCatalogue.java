//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 05:09:39 ���� KST 
//


package com.koreanair.external.altea.vo.service_integratedcatalogue_13_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricingOption" maxOccurs="999">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pricingOptionKey" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}PricingOptionKeyType"/>
 *                   &lt;element name="optionDetail" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}AttributeType" minOccurs="0"/>
 *                   &lt;element name="carrierInformation" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}TransportIdentifierType" minOccurs="0"/>
 *                   &lt;element name="currency" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}CurrenciesType" minOccurs="0"/>
 *                   &lt;element name="dateInformation" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="frequentFlyerInformation" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
 *                   &lt;element name="formOfPaymentInformation" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}FormOfPaymentType" minOccurs="0"/>
 *                   &lt;element name="locationInformation" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}PlaceLocationIdentificationType" minOccurs="0"/>
 *                   &lt;element name="ticketInformation" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}TicketNumberTypeI" minOccurs="0"/>
 *                   &lt;element name="paxSegTstReference" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}ReferenceInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pricingOption"
})
@XmlRootElement(name = "Service_IntegratedCatalogue")
public class ServiceIntegratedCatalogue {

    @XmlElement(required = true)
    protected List<ServiceIntegratedCatalogue.PricingOption> pricingOption;

    /**
     * Gets the value of the pricingOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceIntegratedCatalogue.PricingOption }
     * 
     * 
     */
    public List<ServiceIntegratedCatalogue.PricingOption> getPricingOption() {
        if (pricingOption == null) {
            pricingOption = new ArrayList<ServiceIntegratedCatalogue.PricingOption>();
        }
        return this.pricingOption;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="pricingOptionKey" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}PricingOptionKeyType"/>
     *         &lt;element name="optionDetail" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}AttributeType" minOccurs="0"/>
     *         &lt;element name="carrierInformation" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}TransportIdentifierType" minOccurs="0"/>
     *         &lt;element name="currency" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}CurrenciesType" minOccurs="0"/>
     *         &lt;element name="dateInformation" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="frequentFlyerInformation" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
     *         &lt;element name="formOfPaymentInformation" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}FormOfPaymentType" minOccurs="0"/>
     *         &lt;element name="locationInformation" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}PlaceLocationIdentificationType" minOccurs="0"/>
     *         &lt;element name="ticketInformation" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}TicketNumberTypeI" minOccurs="0"/>
     *         &lt;element name="paxSegTstReference" type="{http://xml.amadeus.com/TPICGQ_13_3_1A}ReferenceInfoType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pricingOptionKey",
        "optionDetail",
        "carrierInformation",
        "currency",
        "dateInformation",
        "frequentFlyerInformation",
        "formOfPaymentInformation",
        "locationInformation",
        "ticketInformation",
        "paxSegTstReference"
    })
    public static class PricingOption {

        @XmlElement(required = true)
        protected PricingOptionKeyType pricingOptionKey;
        protected AttributeType optionDetail;
        protected TransportIdentifierType carrierInformation;
        protected CurrenciesType currency;
        protected List<StructuredDateTimeInformationType> dateInformation;
        protected FrequentTravellerIdentificationCodeType frequentFlyerInformation;
        protected FormOfPaymentType formOfPaymentInformation;
        protected PlaceLocationIdentificationType locationInformation;
        protected TicketNumberTypeI ticketInformation;
        protected ReferenceInfoType paxSegTstReference;

        /**
         * Gets the value of the pricingOptionKey property.
         * 
         * @return
         *     possible object is
         *     {@link PricingOptionKeyType }
         *     
         */
        public PricingOptionKeyType getPricingOptionKey() {
            return pricingOptionKey;
        }

        /**
         * Sets the value of the pricingOptionKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingOptionKeyType }
         *     
         */
        public void setPricingOptionKey(PricingOptionKeyType value) {
            this.pricingOptionKey = value;
        }

        /**
         * Gets the value of the optionDetail property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeType }
         *     
         */
        public AttributeType getOptionDetail() {
            return optionDetail;
        }

        /**
         * Sets the value of the optionDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeType }
         *     
         */
        public void setOptionDetail(AttributeType value) {
            this.optionDetail = value;
        }

        /**
         * Gets the value of the carrierInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TransportIdentifierType }
         *     
         */
        public TransportIdentifierType getCarrierInformation() {
            return carrierInformation;
        }

        /**
         * Sets the value of the carrierInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransportIdentifierType }
         *     
         */
        public void setCarrierInformation(TransportIdentifierType value) {
            this.carrierInformation = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrenciesType }
         *     
         */
        public CurrenciesType getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrenciesType }
         *     
         */
        public void setCurrency(CurrenciesType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the dateInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dateInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDateInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredDateTimeInformationType }
         * 
         * 
         */
        public List<StructuredDateTimeInformationType> getDateInformation() {
            if (dateInformation == null) {
                dateInformation = new ArrayList<StructuredDateTimeInformationType>();
            }
            return this.dateInformation;
        }

        /**
         * Gets the value of the frequentFlyerInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FrequentTravellerIdentificationCodeType }
         *     
         */
        public FrequentTravellerIdentificationCodeType getFrequentFlyerInformation() {
            return frequentFlyerInformation;
        }

        /**
         * Sets the value of the frequentFlyerInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FrequentTravellerIdentificationCodeType }
         *     
         */
        public void setFrequentFlyerInformation(FrequentTravellerIdentificationCodeType value) {
            this.frequentFlyerInformation = value;
        }

        /**
         * Gets the value of the formOfPaymentInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FormOfPaymentType }
         *     
         */
        public FormOfPaymentType getFormOfPaymentInformation() {
            return formOfPaymentInformation;
        }

        /**
         * Sets the value of the formOfPaymentInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormOfPaymentType }
         *     
         */
        public void setFormOfPaymentInformation(FormOfPaymentType value) {
            this.formOfPaymentInformation = value;
        }

        /**
         * Gets the value of the locationInformation property.
         * 
         * @return
         *     possible object is
         *     {@link PlaceLocationIdentificationType }
         *     
         */
        public PlaceLocationIdentificationType getLocationInformation() {
            return locationInformation;
        }

        /**
         * Sets the value of the locationInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlaceLocationIdentificationType }
         *     
         */
        public void setLocationInformation(PlaceLocationIdentificationType value) {
            this.locationInformation = value;
        }

        /**
         * Gets the value of the ticketInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public TicketNumberTypeI getTicketInformation() {
            return ticketInformation;
        }

        /**
         * Sets the value of the ticketInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public void setTicketInformation(TicketNumberTypeI value) {
            this.ticketInformation = value;
        }

        /**
         * Gets the value of the paxSegTstReference property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType }
         *     
         */
        public ReferenceInfoType getPaxSegTstReference() {
            return paxSegTstReference;
        }

        /**
         * Sets the value of the paxSegTstReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType }
         *     
         */
        public void setPaxSegTstReference(ReferenceInfoType value) {
            this.paxSegTstReference = value;
        }

    }

}
