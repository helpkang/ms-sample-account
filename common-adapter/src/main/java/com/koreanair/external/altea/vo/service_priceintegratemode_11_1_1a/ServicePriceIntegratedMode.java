//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.external.altea.vo.service_priceintegratemode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="originatorInfoGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}OriginatorInfoType" minOccurs="0"/>
 *         &lt;element name="pricingTicketingSubsequent" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/>
 *         &lt;element name="conversionRate" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ConversionRateType" minOccurs="0"/>
 *         &lt;element name="discountAndPenaltyInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}DiscountAndPenaltyInformationType" minOccurs="0"/>
 *         &lt;element name="corporateFareInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}CorporateFareInformationType" minOccurs="0"/>
 *         &lt;element name="taxOptionsInfoGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}TaxOptionsInfoType" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="formOfPaymentInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}FormOfPaymentType" minOccurs="0"/>
 *         &lt;element name="passengerInfoGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}PassengerInfoType" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="passengerListGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}PassengerListType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="bookingClassInfoGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}BookingClassInfoType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="pricingTktOptionGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}PricingOptionType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="feeOptionsEncapInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}FeeOptionsType" minOccurs="0"/>
 *         &lt;element name="requestedSegmentInfoGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}RequestedSegmentInfoType" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="allFaresInfoGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AllFaresInfoType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="reissueRefundGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ReissueRefundType" minOccurs="0"/>
 *         &lt;element name="priceSchemeInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}TicketingPriceSchemeType" minOccurs="0"/>
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
    "originatorInfoGroup",
    "pricingTicketingSubsequent",
    "conversionRate",
    "discountAndPenaltyInfo",
    "corporateFareInfo",
    "taxOptionsInfoGroup",
    "formOfPaymentInfo",
    "passengerInfoGroup",
    "passengerListGroup",
    "bookingClassInfoGroup",
    "pricingTktOptionGroup",
    "feeOptionsEncapInfo",
    "requestedSegmentInfoGroup",
    "allFaresInfoGroup",
    "reissueRefundGroup",
    "priceSchemeInfo"
})
@XmlRootElement(name = "Service_PriceIntegratedMode")
public class ServicePriceIntegratedMode {

    protected OriginatorInfoType originatorInfoGroup;
    protected PricingOrTicketingSubsequentType pricingTicketingSubsequent;
    protected ConversionRateType conversionRate;
    protected DiscountAndPenaltyInformationType discountAndPenaltyInfo;
    protected CorporateFareInformationType corporateFareInfo;
    protected List<TaxOptionsInfoType> taxOptionsInfoGroup;
    protected FormOfPaymentType formOfPaymentInfo;
    protected List<PassengerInfoType> passengerInfoGroup;
    protected List<PassengerListType> passengerListGroup;
    protected List<BookingClassInfoType> bookingClassInfoGroup;
    protected List<PricingOptionType> pricingTktOptionGroup;
    protected FeeOptionsType feeOptionsEncapInfo;
    protected List<RequestedSegmentInfoType> requestedSegmentInfoGroup;
    protected List<AllFaresInfoType> allFaresInfoGroup;
    protected ReissueRefundType reissueRefundGroup;
    protected TicketingPriceSchemeType priceSchemeInfo;

    /**
     * Gets the value of the originatorInfoGroup property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorInfoType }
     *     
     */
    public OriginatorInfoType getOriginatorInfoGroup() {
        return originatorInfoGroup;
    }

    /**
     * Sets the value of the originatorInfoGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorInfoType }
     *     
     */
    public void setOriginatorInfoGroup(OriginatorInfoType value) {
        this.originatorInfoGroup = value;
    }

    /**
     * Gets the value of the pricingTicketingSubsequent property.
     * 
     * @return
     *     possible object is
     *     {@link PricingOrTicketingSubsequentType }
     *     
     */
    public PricingOrTicketingSubsequentType getPricingTicketingSubsequent() {
        return pricingTicketingSubsequent;
    }

    /**
     * Sets the value of the pricingTicketingSubsequent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingOrTicketingSubsequentType }
     *     
     */
    public void setPricingTicketingSubsequent(PricingOrTicketingSubsequentType value) {
        this.pricingTicketingSubsequent = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateType }
     *     
     */
    public ConversionRateType getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateType }
     *     
     */
    public void setConversionRate(ConversionRateType value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the discountAndPenaltyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountAndPenaltyInformationType }
     *     
     */
    public DiscountAndPenaltyInformationType getDiscountAndPenaltyInfo() {
        return discountAndPenaltyInfo;
    }

    /**
     * Sets the value of the discountAndPenaltyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountAndPenaltyInformationType }
     *     
     */
    public void setDiscountAndPenaltyInfo(DiscountAndPenaltyInformationType value) {
        this.discountAndPenaltyInfo = value;
    }

    /**
     * Gets the value of the corporateFareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateFareInformationType }
     *     
     */
    public CorporateFareInformationType getCorporateFareInfo() {
        return corporateFareInfo;
    }

    /**
     * Sets the value of the corporateFareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateFareInformationType }
     *     
     */
    public void setCorporateFareInfo(CorporateFareInformationType value) {
        this.corporateFareInfo = value;
    }

    /**
     * Gets the value of the taxOptionsInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxOptionsInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxOptionsInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxOptionsInfoType }
     * 
     * 
     */
    public List<TaxOptionsInfoType> getTaxOptionsInfoGroup() {
        if (taxOptionsInfoGroup == null) {
            taxOptionsInfoGroup = new ArrayList<TaxOptionsInfoType>();
        }
        return this.taxOptionsInfoGroup;
    }

    /**
     * Gets the value of the formOfPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentType }
     *     
     */
    public FormOfPaymentType getFormOfPaymentInfo() {
        return formOfPaymentInfo;
    }

    /**
     * Sets the value of the formOfPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentType }
     *     
     */
    public void setFormOfPaymentInfo(FormOfPaymentType value) {
        this.formOfPaymentInfo = value;
    }

    /**
     * Gets the value of the passengerInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInfoType }
     * 
     * 
     */
    public List<PassengerInfoType> getPassengerInfoGroup() {
        if (passengerInfoGroup == null) {
            passengerInfoGroup = new ArrayList<PassengerInfoType>();
        }
        return this.passengerInfoGroup;
    }

    /**
     * Gets the value of the passengerListGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerListGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerListGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerListType }
     * 
     * 
     */
    public List<PassengerListType> getPassengerListGroup() {
        if (passengerListGroup == null) {
            passengerListGroup = new ArrayList<PassengerListType>();
        }
        return this.passengerListGroup;
    }

    /**
     * Gets the value of the bookingClassInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClassInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClassInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingClassInfoType }
     * 
     * 
     */
    public List<BookingClassInfoType> getBookingClassInfoGroup() {
        if (bookingClassInfoGroup == null) {
            bookingClassInfoGroup = new ArrayList<BookingClassInfoType>();
        }
        return this.bookingClassInfoGroup;
    }

    /**
     * Gets the value of the pricingTktOptionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingTktOptionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingTktOptionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingOptionType }
     * 
     * 
     */
    public List<PricingOptionType> getPricingTktOptionGroup() {
        if (pricingTktOptionGroup == null) {
            pricingTktOptionGroup = new ArrayList<PricingOptionType>();
        }
        return this.pricingTktOptionGroup;
    }

    /**
     * Gets the value of the feeOptionsEncapInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FeeOptionsType }
     *     
     */
    public FeeOptionsType getFeeOptionsEncapInfo() {
        return feeOptionsEncapInfo;
    }

    /**
     * Sets the value of the feeOptionsEncapInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeOptionsType }
     *     
     */
    public void setFeeOptionsEncapInfo(FeeOptionsType value) {
        this.feeOptionsEncapInfo = value;
    }

    /**
     * Gets the value of the requestedSegmentInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedSegmentInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedSegmentInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedSegmentInfoType }
     * 
     * 
     */
    public List<RequestedSegmentInfoType> getRequestedSegmentInfoGroup() {
        if (requestedSegmentInfoGroup == null) {
            requestedSegmentInfoGroup = new ArrayList<RequestedSegmentInfoType>();
        }
        return this.requestedSegmentInfoGroup;
    }

    /**
     * Gets the value of the allFaresInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allFaresInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllFaresInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllFaresInfoType }
     * 
     * 
     */
    public List<AllFaresInfoType> getAllFaresInfoGroup() {
        if (allFaresInfoGroup == null) {
            allFaresInfoGroup = new ArrayList<AllFaresInfoType>();
        }
        return this.allFaresInfoGroup;
    }

    /**
     * Gets the value of the reissueRefundGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ReissueRefundType }
     *     
     */
    public ReissueRefundType getReissueRefundGroup() {
        return reissueRefundGroup;
    }

    /**
     * Sets the value of the reissueRefundGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReissueRefundType }
     *     
     */
    public void setReissueRefundGroup(ReissueRefundType value) {
        this.reissueRefundGroup = value;
    }

    /**
     * Gets the value of the priceSchemeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingPriceSchemeType }
     *     
     */
    public TicketingPriceSchemeType getPriceSchemeInfo() {
        return priceSchemeInfo;
    }

    /**
     * Sets the value of the priceSchemeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingPriceSchemeType }
     *     
     */
    public void setPriceSchemeInfo(TicketingPriceSchemeType value) {
        this.priceSchemeInfo = value;
    }

}
