
package com.koreanair.external.eretail.vo.tripplan.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Pricing information required for condition popup
 * 
 * <p>Java class for AdditionalPricingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalPricingInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ADVANCED_BOOKING_RESTRICTIONS" type="{}AdvancedBookingRestrictionType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_RATE_DETAILS" type="{}RateDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FEATURE" type="{}FeatureType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FEE" type="{}FeeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_IN_OUT_TIME" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CHECK_IN" type="{}DateDescriptionType" minOccurs="0"/&gt;
 *                   &lt;element name="CHECK_OUT" type="{}DateDescriptionType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LENGTH_OF_STAY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MIN_LOS" type="{}NumberDescriptionType" minOccurs="0"/&gt;
 *                   &lt;element name="MAX_LOS" type="{}NumberDescriptionType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalPricingInfoType", propOrder = {
    "advancedbookingrestrictions",
    "listratedetails",
    "listfeature",
    "listfee",
    "checkinouttime",
    "lengthofstay"
})
public class AdditionalPricingInfoType
    implements Serializable
{

    @XmlElement(name = "ADVANCED_BOOKING_RESTRICTIONS")
    protected AdvancedBookingRestrictionType advancedbookingrestrictions;
    @XmlElement(name = "LIST_RATE_DETAILS")
    protected List<RateDetailType> listratedetails;
    @XmlElement(name = "LIST_FEATURE")
    protected List<FeatureType> listfeature;
    @XmlElement(name = "LIST_FEE")
    protected List<FeeType> listfee;
    @XmlElement(name = "CHECK_IN_OUT_TIME")
    protected AdditionalPricingInfoType.CHECKINOUTTIME checkinouttime;
    @XmlElement(name = "LENGTH_OF_STAY")
    protected AdditionalPricingInfoType.LENGTHOFSTAY lengthofstay;

    /**
     * Gets the value of the advancedbookingrestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link AdvancedBookingRestrictionType }
     *     
     */
    public AdvancedBookingRestrictionType getADVANCEDBOOKINGRESTRICTIONS() {
        return advancedbookingrestrictions;
    }

    /**
     * Sets the value of the advancedbookingrestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvancedBookingRestrictionType }
     *     
     */
    public void setADVANCEDBOOKINGRESTRICTIONS(AdvancedBookingRestrictionType value) {
        this.advancedbookingrestrictions = value;
    }

    /**
     * Gets the value of the listratedetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listratedetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRATEDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateDetailType }
     * 
     * 
     */
    public List<RateDetailType> getLISTRATEDETAILS() {
        if (listratedetails == null) {
            listratedetails = new ArrayList<RateDetailType>();
        }
        return this.listratedetails;
    }

    /**
     * Gets the value of the listfeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFEATURE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureType }
     * 
     * 
     */
    public List<FeatureType> getLISTFEATURE() {
        if (listfeature == null) {
            listfeature = new ArrayList<FeatureType>();
        }
        return this.listfeature;
    }

    /**
     * Gets the value of the listfee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFEE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getLISTFEE() {
        if (listfee == null) {
            listfee = new ArrayList<FeeType>();
        }
        return this.listfee;
    }

    /**
     * Gets the value of the checkinouttime property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalPricingInfoType.CHECKINOUTTIME }
     *     
     */
    public AdditionalPricingInfoType.CHECKINOUTTIME getCHECKINOUTTIME() {
        return checkinouttime;
    }

    /**
     * Sets the value of the checkinouttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalPricingInfoType.CHECKINOUTTIME }
     *     
     */
    public void setCHECKINOUTTIME(AdditionalPricingInfoType.CHECKINOUTTIME value) {
        this.checkinouttime = value;
    }

    /**
     * Gets the value of the lengthofstay property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalPricingInfoType.LENGTHOFSTAY }
     *     
     */
    public AdditionalPricingInfoType.LENGTHOFSTAY getLENGTHOFSTAY() {
        return lengthofstay;
    }

    /**
     * Sets the value of the lengthofstay property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalPricingInfoType.LENGTHOFSTAY }
     *     
     */
    public void setLENGTHOFSTAY(AdditionalPricingInfoType.LENGTHOFSTAY value) {
        this.lengthofstay = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CHECK_IN" type="{}DateDescriptionType" minOccurs="0"/&gt;
     *         &lt;element name="CHECK_OUT" type="{}DateDescriptionType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "checkin",
        "checkout"
    })
    public static class CHECKINOUTTIME
        implements Serializable
    {

        @XmlElement(name = "CHECK_IN")
        protected DateDescriptionType checkin;
        @XmlElement(name = "CHECK_OUT")
        protected DateDescriptionType checkout;

        /**
         * Gets the value of the checkin property.
         * 
         * @return
         *     possible object is
         *     {@link DateDescriptionType }
         *     
         */
        public DateDescriptionType getCHECKIN() {
            return checkin;
        }

        /**
         * Sets the value of the checkin property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateDescriptionType }
         *     
         */
        public void setCHECKIN(DateDescriptionType value) {
            this.checkin = value;
        }

        /**
         * Gets the value of the checkout property.
         * 
         * @return
         *     possible object is
         *     {@link DateDescriptionType }
         *     
         */
        public DateDescriptionType getCHECKOUT() {
            return checkout;
        }

        /**
         * Sets the value of the checkout property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateDescriptionType }
         *     
         */
        public void setCHECKOUT(DateDescriptionType value) {
            this.checkout = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="MIN_LOS" type="{}NumberDescriptionType" minOccurs="0"/&gt;
     *         &lt;element name="MAX_LOS" type="{}NumberDescriptionType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "minlos",
        "maxlos"
    })
    public static class LENGTHOFSTAY
        implements Serializable
    {

        @XmlElement(name = "MIN_LOS")
        protected NumberDescriptionType minlos;
        @XmlElement(name = "MAX_LOS")
        protected NumberDescriptionType maxlos;

        /**
         * Gets the value of the minlos property.
         * 
         * @return
         *     possible object is
         *     {@link NumberDescriptionType }
         *     
         */
        public NumberDescriptionType getMINLOS() {
            return minlos;
        }

        /**
         * Sets the value of the minlos property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberDescriptionType }
         *     
         */
        public void setMINLOS(NumberDescriptionType value) {
            this.minlos = value;
        }

        /**
         * Gets the value of the maxlos property.
         * 
         * @return
         *     possible object is
         *     {@link NumberDescriptionType }
         *     
         */
        public NumberDescriptionType getMAXLOS() {
            return maxlos;
        }

        /**
         * Sets the value of the maxlos property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberDescriptionType }
         *     
         */
        public void setMAXLOS(NumberDescriptionType value) {
            this.maxlos = value;
        }

    }

}
