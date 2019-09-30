//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:59 ���� KST 
//


package com.koreanair.external.altea.vo.fop_updateformofpaymentreply_12_1_1a;

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
 *         &lt;element name="transmissionError" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ErrorGroupType_96608G" minOccurs="0"/>
 *         &lt;element name="fopDescription" maxOccurs="127" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fopReference" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ElementManagementSegmentType"/>
 *                   &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ReferenceInformationType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="pnrElementAssociation" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ReferenceInfoType_76946S" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="freeFlowFop" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}FreeTextInformationType" minOccurs="0"/>
 *                   &lt;element name="fpElementError" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ErrorGroupType_96609G" minOccurs="0"/>
 *                   &lt;element name="mopDescription" maxOccurs="4" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fopSequenceNumber" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}SequenceDetailsTypeU"/>
 *                             &lt;element name="mopDetails" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}TicketingFormOfPaymentType_87832S"/>
 *                                       &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}FreeTextInformationType" minOccurs="0"/>
 *                                       &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="mopElementError" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ErrorGroupType_87970G" minOccurs="0"/>
 *                             &lt;element name="paymentModule" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}PaymentGroupType" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "transmissionError",
    "fopDescription"
})
@XmlRootElement(name = "FOP_UpdateFormOfPaymentReply")
public class FOPUpdateFormOfPaymentReply {

    protected ErrorGroupType96608G transmissionError;
    protected List<FOPUpdateFormOfPaymentReply.FopDescription> fopDescription;

    /**
     * Gets the value of the transmissionError property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorGroupType96608G }
     *     
     */
    public ErrorGroupType96608G getTransmissionError() {
        return transmissionError;
    }

    /**
     * Sets the value of the transmissionError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorGroupType96608G }
     *     
     */
    public void setTransmissionError(ErrorGroupType96608G value) {
        this.transmissionError = value;
    }

    /**
     * Gets the value of the fopDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fopDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFopDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FOPUpdateFormOfPaymentReply.FopDescription }
     * 
     * 
     */
    public List<FOPUpdateFormOfPaymentReply.FopDescription> getFopDescription() {
        if (fopDescription == null) {
            fopDescription = new ArrayList<FOPUpdateFormOfPaymentReply.FopDescription>();
        }
        return this.fopDescription;
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
     *         &lt;element name="fopReference" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ElementManagementSegmentType"/>
     *         &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ReferenceInformationType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="pnrElementAssociation" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ReferenceInfoType_76946S" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="freeFlowFop" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}FreeTextInformationType" minOccurs="0"/>
     *         &lt;element name="fpElementError" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ErrorGroupType_96609G" minOccurs="0"/>
     *         &lt;element name="mopDescription" maxOccurs="4" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fopSequenceNumber" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}SequenceDetailsTypeU"/>
     *                   &lt;element name="mopDetails" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}TicketingFormOfPaymentType_87832S"/>
     *                             &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}FreeTextInformationType" minOccurs="0"/>
     *                             &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="mopElementError" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ErrorGroupType_87970G" minOccurs="0"/>
     *                   &lt;element name="paymentModule" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}PaymentGroupType" minOccurs="0"/>
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
        "fopReference",
        "passengerAssociation",
        "pnrElementAssociation",
        "freeFlowFop",
        "fpElementError",
        "mopDescription"
    })
    public static class FopDescription {

        @XmlElement(required = true)
        protected ElementManagementSegmentType fopReference;
        protected List<ReferenceInformationType> passengerAssociation;
        protected List<ReferenceInfoType76946S> pnrElementAssociation;
        protected FreeTextInformationType freeFlowFop;
        protected ErrorGroupType96609G fpElementError;
        protected List<FOPUpdateFormOfPaymentReply.FopDescription.MopDescription> mopDescription;

        /**
         * Gets the value of the fopReference property.
         * 
         * @return
         *     possible object is
         *     {@link ElementManagementSegmentType }
         *     
         */
        public ElementManagementSegmentType getFopReference() {
            return fopReference;
        }

        /**
         * Sets the value of the fopReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementManagementSegmentType }
         *     
         */
        public void setFopReference(ElementManagementSegmentType value) {
            this.fopReference = value;
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
         * {@link ReferenceInformationType }
         * 
         * 
         */
        public List<ReferenceInformationType> getPassengerAssociation() {
            if (passengerAssociation == null) {
                passengerAssociation = new ArrayList<ReferenceInformationType>();
            }
            return this.passengerAssociation;
        }

        /**
         * Gets the value of the pnrElementAssociation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pnrElementAssociation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPnrElementAssociation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceInfoType76946S }
         * 
         * 
         */
        public List<ReferenceInfoType76946S> getPnrElementAssociation() {
            if (pnrElementAssociation == null) {
                pnrElementAssociation = new ArrayList<ReferenceInfoType76946S>();
            }
            return this.pnrElementAssociation;
        }

        /**
         * Gets the value of the freeFlowFop property.
         * 
         * @return
         *     possible object is
         *     {@link FreeTextInformationType }
         *     
         */
        public FreeTextInformationType getFreeFlowFop() {
            return freeFlowFop;
        }

        /**
         * Sets the value of the freeFlowFop property.
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextInformationType }
         *     
         */
        public void setFreeFlowFop(FreeTextInformationType value) {
            this.freeFlowFop = value;
        }

        /**
         * Gets the value of the fpElementError property.
         * 
         * @return
         *     possible object is
         *     {@link ErrorGroupType96609G }
         *     
         */
        public ErrorGroupType96609G getFpElementError() {
            return fpElementError;
        }

        /**
         * Sets the value of the fpElementError property.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorGroupType96609G }
         *     
         */
        public void setFpElementError(ErrorGroupType96609G value) {
            this.fpElementError = value;
        }

        /**
         * Gets the value of the mopDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mopDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMopDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FOPUpdateFormOfPaymentReply.FopDescription.MopDescription }
         * 
         * 
         */
        public List<FOPUpdateFormOfPaymentReply.FopDescription.MopDescription> getMopDescription() {
            if (mopDescription == null) {
                mopDescription = new ArrayList<FOPUpdateFormOfPaymentReply.FopDescription.MopDescription>();
            }
            return this.mopDescription;
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
         *         &lt;element name="fopSequenceNumber" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}SequenceDetailsTypeU"/>
         *         &lt;element name="mopDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}TicketingFormOfPaymentType_87832S"/>
         *                   &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}FreeTextInformationType" minOccurs="0"/>
         *                   &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="mopElementError" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}ErrorGroupType_87970G" minOccurs="0"/>
         *         &lt;element name="paymentModule" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}PaymentGroupType" minOccurs="0"/>
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
            "fopSequenceNumber",
            "mopDetails",
            "mopElementError",
            "paymentModule"
        })
        public static class MopDescription {

            @XmlElement(required = true)
            protected SequenceDetailsTypeU fopSequenceNumber;
            protected FOPUpdateFormOfPaymentReply.FopDescription.MopDescription.MopDetails mopDetails;
            protected ErrorGroupType87970G mopElementError;
            protected PaymentGroupType paymentModule;

            /**
             * Gets the value of the fopSequenceNumber property.
             * 
             * @return
             *     possible object is
             *     {@link SequenceDetailsTypeU }
             *     
             */
            public SequenceDetailsTypeU getFopSequenceNumber() {
                return fopSequenceNumber;
            }

            /**
             * Sets the value of the fopSequenceNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link SequenceDetailsTypeU }
             *     
             */
            public void setFopSequenceNumber(SequenceDetailsTypeU value) {
                this.fopSequenceNumber = value;
            }

            /**
             * Gets the value of the mopDetails property.
             * 
             * @return
             *     possible object is
             *     {@link FOPUpdateFormOfPaymentReply.FopDescription.MopDescription.MopDetails }
             *     
             */
            public FOPUpdateFormOfPaymentReply.FopDescription.MopDescription.MopDetails getMopDetails() {
                return mopDetails;
            }

            /**
             * Sets the value of the mopDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link FOPUpdateFormOfPaymentReply.FopDescription.MopDescription.MopDetails }
             *     
             */
            public void setMopDetails(FOPUpdateFormOfPaymentReply.FopDescription.MopDescription.MopDetails value) {
                this.mopDetails = value;
            }

            /**
             * Gets the value of the mopElementError property.
             * 
             * @return
             *     possible object is
             *     {@link ErrorGroupType87970G }
             *     
             */
            public ErrorGroupType87970G getMopElementError() {
                return mopElementError;
            }

            /**
             * Sets the value of the mopElementError property.
             * 
             * @param value
             *     allowed object is
             *     {@link ErrorGroupType87970G }
             *     
             */
            public void setMopElementError(ErrorGroupType87970G value) {
                this.mopElementError = value;
            }

            /**
             * Gets the value of the paymentModule property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentGroupType }
             *     
             */
            public PaymentGroupType getPaymentModule() {
                return paymentModule;
            }

            /**
             * Sets the value of the paymentModule property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentGroupType }
             *     
             */
            public void setPaymentModule(PaymentGroupType value) {
                this.paymentModule = value;
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
             *         &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}TicketingFormOfPaymentType_87832S"/>
             *         &lt;element name="oldFopFreeflow" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}FreeTextInformationType" minOccurs="0"/>
             *         &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
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
                "fopPNRDetails",
                "oldFopFreeflow",
                "pnrSupplementaryData"
            })
            public static class MopDetails {

                @XmlElement(required = true)
                protected TicketingFormOfPaymentType87832S fopPNRDetails;
                protected FreeTextInformationType oldFopFreeflow;
                protected List<PNRSupplementaryDataType> pnrSupplementaryData;

                /**
                 * Gets the value of the fopPNRDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TicketingFormOfPaymentType87832S }
                 *     
                 */
                public TicketingFormOfPaymentType87832S getFopPNRDetails() {
                    return fopPNRDetails;
                }

                /**
                 * Sets the value of the fopPNRDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TicketingFormOfPaymentType87832S }
                 *     
                 */
                public void setFopPNRDetails(TicketingFormOfPaymentType87832S value) {
                    this.fopPNRDetails = value;
                }

                /**
                 * Gets the value of the oldFopFreeflow property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformationType }
                 *     
                 */
                public FreeTextInformationType getOldFopFreeflow() {
                    return oldFopFreeflow;
                }

                /**
                 * Sets the value of the oldFopFreeflow property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformationType }
                 *     
                 */
                public void setOldFopFreeflow(FreeTextInformationType value) {
                    this.oldFopFreeflow = value;
                }

                /**
                 * Gets the value of the pnrSupplementaryData property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pnrSupplementaryData property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPnrSupplementaryData().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PNRSupplementaryDataType }
                 * 
                 * 
                 */
                public List<PNRSupplementaryDataType> getPnrSupplementaryData() {
                    if (pnrSupplementaryData == null) {
                        pnrSupplementaryData = new ArrayList<PNRSupplementaryDataType>();
                    }
                    return this.pnrSupplementaryData;
                }

            }

        }

    }

}
