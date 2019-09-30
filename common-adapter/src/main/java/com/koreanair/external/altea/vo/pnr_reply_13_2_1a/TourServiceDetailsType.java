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
 * Convey tour product details
 * 
 * <p>Java class for TourServiceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourServiceDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequenceNumberInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ItemNumberTypeU_25424S"/>
 *         &lt;element name="statusQuantityInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}QuantityAndActionTypeU_25425S" minOccurs="0"/>
 *         &lt;element name="productInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AdditionalProductDetailsTypeU"/>
 *         &lt;element name="confirmationInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ReservationControlInformationTypeU_25427S" minOccurs="0"/>
 *         &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ReferenceInfoType_25422S" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="serviceDetails" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}TravelProductInformationTypeU_25428S"/>
 *                   &lt;element name="serviceDurationInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}QuantityType_25433S" minOccurs="0"/>
 *                   &lt;element name="accomodationDetails" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="roomInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}HotelRoomType_25429S"/>
 *                             &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ReferenceInfoType_25422S" maxOccurs="9" minOccurs="0"/>
 *                             &lt;element name="roomMealPlanInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}DiningInformationType"/>
 *                             &lt;element name="occupancynInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}RangeDetailsTypeU" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="vehiculeDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="vehiculeInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}VehicleTypeU_25502S"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="transportationDetails" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="departureInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}PlaceLocationIdentificationTypeU_25436S"/>
 *                             &lt;element name="arrivalInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}PlaceLocationIdentificationTypeU_25436S"/>
 *                             &lt;element name="transportationInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}TravelProductInformationTypeI_25434S"/>
 *                             &lt;element name="transportationDuration" type="{http://xml.amadeus.com/PNRACC_13_2_1A}QuantityType_25433S" minOccurs="0"/>
 *                             &lt;element name="equipmentInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}EquipmentDetailsTypeU" minOccurs="0"/>
 *                             &lt;element name="transportationMealPlanInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}DiningInformationType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="productBCSDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="agentIdentification" type="{http://xml.amadeus.com/PNRACC_13_2_1A}UserIdentificationType_25447S"/>
 *                             &lt;element name="distributionChannelData" type="{http://xml.amadeus.com/PNRACC_13_2_1A}SystemDetailsInfoType_25482S"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "TourServiceDetailsType", propOrder = {
    "sequenceNumberInfo",
    "statusQuantityInfo",
    "productInfo",
    "confirmationInfo",
    "passengerAssociation",
    "serviceDetails"
})
public class TourServiceDetailsType {

    @XmlElement(required = true)
    protected ItemNumberTypeU25424S sequenceNumberInfo;
    protected QuantityAndActionTypeU25425S statusQuantityInfo;
    @XmlElement(required = true)
    protected AdditionalProductDetailsTypeU productInfo;
    protected ReservationControlInformationTypeU25427S confirmationInfo;
    protected List<ReferenceInfoType25422S> passengerAssociation;
    @XmlElement(required = true)
    protected List<TourServiceDetailsType.ServiceDetails> serviceDetails;

    /**
     * Gets the value of the sequenceNumberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberTypeU25424S }
     *     
     */
    public ItemNumberTypeU25424S getSequenceNumberInfo() {
        return sequenceNumberInfo;
    }

    /**
     * Sets the value of the sequenceNumberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberTypeU25424S }
     *     
     */
    public void setSequenceNumberInfo(ItemNumberTypeU25424S value) {
        this.sequenceNumberInfo = value;
    }

    /**
     * Gets the value of the statusQuantityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndActionTypeU25425S }
     *     
     */
    public QuantityAndActionTypeU25425S getStatusQuantityInfo() {
        return statusQuantityInfo;
    }

    /**
     * Sets the value of the statusQuantityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndActionTypeU25425S }
     *     
     */
    public void setStatusQuantityInfo(QuantityAndActionTypeU25425S value) {
        this.statusQuantityInfo = value;
    }

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductDetailsTypeU }
     *     
     */
    public AdditionalProductDetailsTypeU getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductDetailsTypeU }
     *     
     */
    public void setProductInfo(AdditionalProductDetailsTypeU value) {
        this.productInfo = value;
    }

    /**
     * Gets the value of the confirmationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationTypeU25427S }
     *     
     */
    public ReservationControlInformationTypeU25427S getConfirmationInfo() {
        return confirmationInfo;
    }

    /**
     * Sets the value of the confirmationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationTypeU25427S }
     *     
     */
    public void setConfirmationInfo(ReservationControlInformationTypeU25427S value) {
        this.confirmationInfo = value;
    }

    /**
     * Gets the value of the passengerAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfoType25422S }
     * 
     * 
     */
    public List<ReferenceInfoType25422S> getPassengerAssociation() {
        if (passengerAssociation == null) {
            passengerAssociation = new ArrayList<ReferenceInfoType25422S>();
        }
        return this.passengerAssociation;
    }

    /**
     * Gets the value of the serviceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourServiceDetailsType.ServiceDetails }
     * 
     * 
     */
    public List<TourServiceDetailsType.ServiceDetails> getServiceDetails() {
        if (serviceDetails == null) {
            serviceDetails = new ArrayList<TourServiceDetailsType.ServiceDetails>();
        }
        return this.serviceDetails;
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
     *         &lt;element name="serviceInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}TravelProductInformationTypeU_25428S"/>
     *         &lt;element name="serviceDurationInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}QuantityType_25433S" minOccurs="0"/>
     *         &lt;element name="accomodationDetails" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="roomInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}HotelRoomType_25429S"/>
     *                   &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ReferenceInfoType_25422S" maxOccurs="9" minOccurs="0"/>
     *                   &lt;element name="roomMealPlanInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}DiningInformationType"/>
     *                   &lt;element name="occupancynInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}RangeDetailsTypeU" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="vehiculeDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="vehiculeInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}VehicleTypeU_25502S"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="transportationDetails" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="departureInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}PlaceLocationIdentificationTypeU_25436S"/>
     *                   &lt;element name="arrivalInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}PlaceLocationIdentificationTypeU_25436S"/>
     *                   &lt;element name="transportationInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}TravelProductInformationTypeI_25434S"/>
     *                   &lt;element name="transportationDuration" type="{http://xml.amadeus.com/PNRACC_13_2_1A}QuantityType_25433S" minOccurs="0"/>
     *                   &lt;element name="equipmentInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}EquipmentDetailsTypeU" minOccurs="0"/>
     *                   &lt;element name="transportationMealPlanInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}DiningInformationType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="productBCSDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="agentIdentification" type="{http://xml.amadeus.com/PNRACC_13_2_1A}UserIdentificationType_25447S"/>
     *                   &lt;element name="distributionChannelData" type="{http://xml.amadeus.com/PNRACC_13_2_1A}SystemDetailsInfoType_25482S"/>
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
        "serviceInfo",
        "serviceDurationInfo",
        "accomodationDetails",
        "vehiculeDetails",
        "transportationDetails",
        "productBCSDetails"
    })
    public static class ServiceDetails {

        @XmlElement(required = true)
        protected TravelProductInformationTypeU25428S serviceInfo;
        protected QuantityType25433S serviceDurationInfo;
        protected List<TourServiceDetailsType.ServiceDetails.AccomodationDetails> accomodationDetails;
        protected TourServiceDetailsType.ServiceDetails.VehiculeDetails vehiculeDetails;
        protected List<TourServiceDetailsType.ServiceDetails.TransportationDetails> transportationDetails;
        protected TourServiceDetailsType.ServiceDetails.ProductBCSDetails productBCSDetails;

        /**
         * Gets the value of the serviceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TravelProductInformationTypeU25428S }
         *     
         */
        public TravelProductInformationTypeU25428S getServiceInfo() {
            return serviceInfo;
        }

        /**
         * Sets the value of the serviceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelProductInformationTypeU25428S }
         *     
         */
        public void setServiceInfo(TravelProductInformationTypeU25428S value) {
            this.serviceInfo = value;
        }

        /**
         * Gets the value of the serviceDurationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QuantityType25433S }
         *     
         */
        public QuantityType25433S getServiceDurationInfo() {
            return serviceDurationInfo;
        }

        /**
         * Sets the value of the serviceDurationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuantityType25433S }
         *     
         */
        public void setServiceDurationInfo(QuantityType25433S value) {
            this.serviceDurationInfo = value;
        }

        /**
         * Gets the value of the accomodationDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accomodationDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccomodationDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TourServiceDetailsType.ServiceDetails.AccomodationDetails }
         * 
         * 
         */
        public List<TourServiceDetailsType.ServiceDetails.AccomodationDetails> getAccomodationDetails() {
            if (accomodationDetails == null) {
                accomodationDetails = new ArrayList<TourServiceDetailsType.ServiceDetails.AccomodationDetails>();
            }
            return this.accomodationDetails;
        }

        /**
         * Gets the value of the vehiculeDetails property.
         * 
         * @return
         *     possible object is
         *     {@link TourServiceDetailsType.ServiceDetails.VehiculeDetails }
         *     
         */
        public TourServiceDetailsType.ServiceDetails.VehiculeDetails getVehiculeDetails() {
            return vehiculeDetails;
        }

        /**
         * Sets the value of the vehiculeDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link TourServiceDetailsType.ServiceDetails.VehiculeDetails }
         *     
         */
        public void setVehiculeDetails(TourServiceDetailsType.ServiceDetails.VehiculeDetails value) {
            this.vehiculeDetails = value;
        }

        /**
         * Gets the value of the transportationDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transportationDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransportationDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TourServiceDetailsType.ServiceDetails.TransportationDetails }
         * 
         * 
         */
        public List<TourServiceDetailsType.ServiceDetails.TransportationDetails> getTransportationDetails() {
            if (transportationDetails == null) {
                transportationDetails = new ArrayList<TourServiceDetailsType.ServiceDetails.TransportationDetails>();
            }
            return this.transportationDetails;
        }

        /**
         * Gets the value of the productBCSDetails property.
         * 
         * @return
         *     possible object is
         *     {@link TourServiceDetailsType.ServiceDetails.ProductBCSDetails }
         *     
         */
        public TourServiceDetailsType.ServiceDetails.ProductBCSDetails getProductBCSDetails() {
            return productBCSDetails;
        }

        /**
         * Sets the value of the productBCSDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link TourServiceDetailsType.ServiceDetails.ProductBCSDetails }
         *     
         */
        public void setProductBCSDetails(TourServiceDetailsType.ServiceDetails.ProductBCSDetails value) {
            this.productBCSDetails = value;
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
         *         &lt;element name="roomInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}HotelRoomType_25429S"/>
         *         &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ReferenceInfoType_25422S" maxOccurs="9" minOccurs="0"/>
         *         &lt;element name="roomMealPlanInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}DiningInformationType"/>
         *         &lt;element name="occupancynInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}RangeDetailsTypeU" minOccurs="0"/>
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
            "roomInfo",
            "passengerAssociation",
            "roomMealPlanInfo",
            "occupancynInfo"
        })
        public static class AccomodationDetails {

            @XmlElement(required = true)
            protected HotelRoomType25429S roomInfo;
            protected List<ReferenceInfoType25422S> passengerAssociation;
            @XmlElement(required = true)
            protected DiningInformationType roomMealPlanInfo;
            protected RangeDetailsTypeU occupancynInfo;

            /**
             * Gets the value of the roomInfo property.
             * 
             * @return
             *     possible object is
             *     {@link HotelRoomType25429S }
             *     
             */
            public HotelRoomType25429S getRoomInfo() {
                return roomInfo;
            }

            /**
             * Sets the value of the roomInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link HotelRoomType25429S }
             *     
             */
            public void setRoomInfo(HotelRoomType25429S value) {
                this.roomInfo = value;
            }

            /**
             * Gets the value of the passengerAssociation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passengerAssociation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassengerAssociation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ReferenceInfoType25422S }
             * 
             * 
             */
            public List<ReferenceInfoType25422S> getPassengerAssociation() {
                if (passengerAssociation == null) {
                    passengerAssociation = new ArrayList<ReferenceInfoType25422S>();
                }
                return this.passengerAssociation;
            }

            /**
             * Gets the value of the roomMealPlanInfo property.
             * 
             * @return
             *     possible object is
             *     {@link DiningInformationType }
             *     
             */
            public DiningInformationType getRoomMealPlanInfo() {
                return roomMealPlanInfo;
            }

            /**
             * Sets the value of the roomMealPlanInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link DiningInformationType }
             *     
             */
            public void setRoomMealPlanInfo(DiningInformationType value) {
                this.roomMealPlanInfo = value;
            }

            /**
             * Gets the value of the occupancynInfo property.
             * 
             * @return
             *     possible object is
             *     {@link RangeDetailsTypeU }
             *     
             */
            public RangeDetailsTypeU getOccupancynInfo() {
                return occupancynInfo;
            }

            /**
             * Sets the value of the occupancynInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link RangeDetailsTypeU }
             *     
             */
            public void setOccupancynInfo(RangeDetailsTypeU value) {
                this.occupancynInfo = value;
            }

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
         *         &lt;element name="agentIdentification" type="{http://xml.amadeus.com/PNRACC_13_2_1A}UserIdentificationType_25447S"/>
         *         &lt;element name="distributionChannelData" type="{http://xml.amadeus.com/PNRACC_13_2_1A}SystemDetailsInfoType_25482S"/>
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
            "agentIdentification",
            "distributionChannelData"
        })
        public static class ProductBCSDetails {

            @XmlElement(required = true)
            protected UserIdentificationType25447S agentIdentification;
            @XmlElement(required = true)
            protected SystemDetailsInfoType25482S distributionChannelData;

            /**
             * Gets the value of the agentIdentification property.
             * 
             * @return
             *     possible object is
             *     {@link UserIdentificationType25447S }
             *     
             */
            public UserIdentificationType25447S getAgentIdentification() {
                return agentIdentification;
            }

            /**
             * Sets the value of the agentIdentification property.
             * 
             * @param value
             *     allowed object is
             *     {@link UserIdentificationType25447S }
             *     
             */
            public void setAgentIdentification(UserIdentificationType25447S value) {
                this.agentIdentification = value;
            }

            /**
             * Gets the value of the distributionChannelData property.
             * 
             * @return
             *     possible object is
             *     {@link SystemDetailsInfoType25482S }
             *     
             */
            public SystemDetailsInfoType25482S getDistributionChannelData() {
                return distributionChannelData;
            }

            /**
             * Sets the value of the distributionChannelData property.
             * 
             * @param value
             *     allowed object is
             *     {@link SystemDetailsInfoType25482S }
             *     
             */
            public void setDistributionChannelData(SystemDetailsInfoType25482S value) {
                this.distributionChannelData = value;
            }

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
         *         &lt;element name="departureInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}PlaceLocationIdentificationTypeU_25436S"/>
         *         &lt;element name="arrivalInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}PlaceLocationIdentificationTypeU_25436S"/>
         *         &lt;element name="transportationInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}TravelProductInformationTypeI_25434S"/>
         *         &lt;element name="transportationDuration" type="{http://xml.amadeus.com/PNRACC_13_2_1A}QuantityType_25433S" minOccurs="0"/>
         *         &lt;element name="equipmentInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}EquipmentDetailsTypeU" minOccurs="0"/>
         *         &lt;element name="transportationMealPlanInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}DiningInformationType" minOccurs="0"/>
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
            "departureInfo",
            "arrivalInfo",
            "transportationInfo",
            "transportationDuration",
            "equipmentInfo",
            "transportationMealPlanInfo"
        })
        public static class TransportationDetails {

            @XmlElement(required = true)
            protected PlaceLocationIdentificationTypeU25436S departureInfo;
            @XmlElement(required = true)
            protected PlaceLocationIdentificationTypeU25436S arrivalInfo;
            @XmlElement(required = true)
            protected TravelProductInformationTypeI25434S transportationInfo;
            protected QuantityType25433S transportationDuration;
            protected EquipmentDetailsTypeU equipmentInfo;
            protected DiningInformationType transportationMealPlanInfo;

            /**
             * Gets the value of the departureInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PlaceLocationIdentificationTypeU25436S }
             *     
             */
            public PlaceLocationIdentificationTypeU25436S getDepartureInfo() {
                return departureInfo;
            }

            /**
             * Sets the value of the departureInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PlaceLocationIdentificationTypeU25436S }
             *     
             */
            public void setDepartureInfo(PlaceLocationIdentificationTypeU25436S value) {
                this.departureInfo = value;
            }

            /**
             * Gets the value of the arrivalInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PlaceLocationIdentificationTypeU25436S }
             *     
             */
            public PlaceLocationIdentificationTypeU25436S getArrivalInfo() {
                return arrivalInfo;
            }

            /**
             * Sets the value of the arrivalInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PlaceLocationIdentificationTypeU25436S }
             *     
             */
            public void setArrivalInfo(PlaceLocationIdentificationTypeU25436S value) {
                this.arrivalInfo = value;
            }

            /**
             * Gets the value of the transportationInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationTypeI25434S }
             *     
             */
            public TravelProductInformationTypeI25434S getTransportationInfo() {
                return transportationInfo;
            }

            /**
             * Sets the value of the transportationInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationTypeI25434S }
             *     
             */
            public void setTransportationInfo(TravelProductInformationTypeI25434S value) {
                this.transportationInfo = value;
            }

            /**
             * Gets the value of the transportationDuration property.
             * 
             * @return
             *     possible object is
             *     {@link QuantityType25433S }
             *     
             */
            public QuantityType25433S getTransportationDuration() {
                return transportationDuration;
            }

            /**
             * Sets the value of the transportationDuration property.
             * 
             * @param value
             *     allowed object is
             *     {@link QuantityType25433S }
             *     
             */
            public void setTransportationDuration(QuantityType25433S value) {
                this.transportationDuration = value;
            }

            /**
             * Gets the value of the equipmentInfo property.
             * 
             * @return
             *     possible object is
             *     {@link EquipmentDetailsTypeU }
             *     
             */
            public EquipmentDetailsTypeU getEquipmentInfo() {
                return equipmentInfo;
            }

            /**
             * Sets the value of the equipmentInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link EquipmentDetailsTypeU }
             *     
             */
            public void setEquipmentInfo(EquipmentDetailsTypeU value) {
                this.equipmentInfo = value;
            }

            /**
             * Gets the value of the transportationMealPlanInfo property.
             * 
             * @return
             *     possible object is
             *     {@link DiningInformationType }
             *     
             */
            public DiningInformationType getTransportationMealPlanInfo() {
                return transportationMealPlanInfo;
            }

            /**
             * Sets the value of the transportationMealPlanInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link DiningInformationType }
             *     
             */
            public void setTransportationMealPlanInfo(DiningInformationType value) {
                this.transportationMealPlanInfo = value;
            }

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
         *         &lt;element name="vehiculeInfo" type="{http://xml.amadeus.com/PNRACC_13_2_1A}VehicleTypeU_25502S"/>
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
            "vehiculeInfo"
        })
        public static class VehiculeDetails {

            @XmlElement(required = true)
            protected VehicleTypeU25502S vehiculeInfo;

            /**
             * Gets the value of the vehiculeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link VehicleTypeU25502S }
             *     
             */
            public VehicleTypeU25502S getVehiculeInfo() {
                return vehiculeInfo;
            }

            /**
             * Sets the value of the vehiculeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleTypeU25502S }
             *     
             */
            public void setVehiculeInfo(VehicleTypeU25502S value) {
                this.vehiculeInfo = value;
            }

        }

    }

}
