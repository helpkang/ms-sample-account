
package com.koreanair.eretail.pojo.tripplan.etr_elements;

import java.io.Serializable;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOOKINGS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ETR_AIR" type="{}etrAirType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_AIR_SEAT" type="{}etrAirSeatType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_MEETING" type="{}etrMeetingType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_MISC_ACTIVITY" type="{}etrMiscActivityType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_MISC_EAT_AND_DRINK" type="{}etrMiscEatAndDrinkType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_MISC_MOVE" type="{}etrMiscMoveType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_MISC_SERVICE" type="{}etrMiscServiceType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_MISC_SLEEP" type="{}etrMiscSleepType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_SERVICE" type="{}etrServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_TAXI" type="{}etrTaxiType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_TRANSFER" type="{}etrTransferType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="QUOTATIONS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ETR_QUOTATION" type="{}etrQuotationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ETR_HOTEL" type="{}etrHotelType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_RAIL" type="{}etrRailType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_CAR" type="{}etrCarType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_CRUISE" type="{}etrCruiseType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_INSURANCE" type="{}etrInsuranceType" maxOccurs="50" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_SHOW_AND_EVENT" type="{}etrShowAndEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ETR_DISCOUNT" type="{}etrDiscountElement"/&gt;
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
@XmlType(name = "", propOrder = {
    "bookings"
})
@XmlRootElement(name = "ETR")
public class ETR
    implements Serializable
{

    @XmlElement(name = "BOOKINGS")
    protected ETR.BOOKINGS bookings;

    /**
     * Gets the value of the bookings property.
     * 
     * @return
     *     possible object is
     *     {@link ETR.BOOKINGS }
     *     
     */
    public ETR.BOOKINGS getBOOKINGS() {
        return bookings;
    }

    /**
     * Sets the value of the bookings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETR.BOOKINGS }
     *     
     */
    public void setBOOKINGS(ETR.BOOKINGS value) {
        this.bookings = value;
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
     *         &lt;element name="ETR_AIR" type="{}etrAirType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_AIR_SEAT" type="{}etrAirSeatType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_MEETING" type="{}etrMeetingType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_MISC_ACTIVITY" type="{}etrMiscActivityType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_MISC_EAT_AND_DRINK" type="{}etrMiscEatAndDrinkType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_MISC_MOVE" type="{}etrMiscMoveType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_MISC_SERVICE" type="{}etrMiscServiceType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_MISC_SLEEP" type="{}etrMiscSleepType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_SERVICE" type="{}etrServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ETR_TAXI" type="{}etrTaxiType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_TRANSFER" type="{}etrTransferType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="QUOTATIONS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ETR_QUOTATION" type="{}etrQuotationType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ETR_HOTEL" type="{}etrHotelType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_RAIL" type="{}etrRailType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_CAR" type="{}etrCarType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_CRUISE" type="{}etrCruiseType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_INSURANCE" type="{}etrInsuranceType" maxOccurs="50" minOccurs="0"/&gt;
     *         &lt;element name="ETR_SHOW_AND_EVENT" type="{}etrShowAndEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ETR_DISCOUNT" type="{}etrDiscountElement"/&gt;
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
        "etrair",
        "etrairseat",
        "etrmeeting",
        "etrmiscactivity",
        "etrmisceatanddrink",
        "etrmiscmove",
        "etrmiscservice",
        "etrmiscsleep",
        "etrservice",
        "etrtaxi",
        "etrtransfer",
        "quotations",
        "etrhotel",
        "etrrail",
        "etrcar",
        "etrcruise",
        "etrinsurance",
        "etrshowandevent",
        "etrdiscount"
    })
    public static class BOOKINGS
        implements Serializable
    {

        @XmlElement(name = "ETR_AIR")
        protected List<EtrAirType> etrair;
        @XmlElement(name = "ETR_AIR_SEAT")
        protected List<EtrAirSeatType> etrairseat;
        @XmlElement(name = "ETR_MEETING")
        protected List<EtrMeetingType> etrmeeting;
        @XmlElement(name = "ETR_MISC_ACTIVITY")
        protected List<EtrMiscActivityType> etrmiscactivity;
        @XmlElement(name = "ETR_MISC_EAT_AND_DRINK")
        protected List<EtrMiscEatAndDrinkType> etrmisceatanddrink;
        @XmlElement(name = "ETR_MISC_MOVE")
        protected List<EtrMiscMoveType> etrmiscmove;
        @XmlElement(name = "ETR_MISC_SERVICE")
        protected List<EtrMiscServiceType> etrmiscservice;
        @XmlElement(name = "ETR_MISC_SLEEP")
        protected List<EtrMiscSleepType> etrmiscsleep;
        @XmlElement(name = "ETR_SERVICE")
        protected List<EtrServiceType> etrservice;
        @XmlElement(name = "ETR_TAXI")
        protected List<EtrTaxiType> etrtaxi;
        @XmlElement(name = "ETR_TRANSFER")
        protected List<EtrTransferType> etrtransfer;
        @XmlElement(name = "QUOTATIONS")
        protected ETR.BOOKINGS.QUOTATIONS quotations;
        @XmlElement(name = "ETR_HOTEL")
        protected List<EtrHotelType> etrhotel;
        @XmlElement(name = "ETR_RAIL")
        protected List<EtrRailType> etrrail;
        @XmlElement(name = "ETR_CAR")
        protected List<EtrCarType> etrcar;
        @XmlElement(name = "ETR_CRUISE")
        protected List<EtrCruiseType> etrcruise;
        @XmlElement(name = "ETR_INSURANCE")
        protected List<EtrInsuranceType> etrinsurance;
        @XmlElement(name = "ETR_SHOW_AND_EVENT")
        protected List<EtrShowAndEventType> etrshowandevent;
        @XmlElement(name = "ETR_DISCOUNT", required = true)
        protected EtrDiscountElement etrdiscount;

        /**
         * Gets the value of the etrair property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrair property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRAIR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrAirType }
         * 
         * 
         */
        public List<EtrAirType> getETRAIR() {
            if (etrair == null) {
                etrair = new ArrayList<EtrAirType>();
            }
            return this.etrair;
        }

        /**
         * Gets the value of the etrairseat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrairseat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRAIRSEAT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrAirSeatType }
         * 
         * 
         */
        public List<EtrAirSeatType> getETRAIRSEAT() {
            if (etrairseat == null) {
                etrairseat = new ArrayList<EtrAirSeatType>();
            }
            return this.etrairseat;
        }

        /**
         * Gets the value of the etrmeeting property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrmeeting property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRMEETING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrMeetingType }
         * 
         * 
         */
        public List<EtrMeetingType> getETRMEETING() {
            if (etrmeeting == null) {
                etrmeeting = new ArrayList<EtrMeetingType>();
            }
            return this.etrmeeting;
        }

        /**
         * Gets the value of the etrmiscactivity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrmiscactivity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRMISCACTIVITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrMiscActivityType }
         * 
         * 
         */
        public List<EtrMiscActivityType> getETRMISCACTIVITY() {
            if (etrmiscactivity == null) {
                etrmiscactivity = new ArrayList<EtrMiscActivityType>();
            }
            return this.etrmiscactivity;
        }

        /**
         * Gets the value of the etrmisceatanddrink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrmisceatanddrink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRMISCEATANDDRINK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrMiscEatAndDrinkType }
         * 
         * 
         */
        public List<EtrMiscEatAndDrinkType> getETRMISCEATANDDRINK() {
            if (etrmisceatanddrink == null) {
                etrmisceatanddrink = new ArrayList<EtrMiscEatAndDrinkType>();
            }
            return this.etrmisceatanddrink;
        }

        /**
         * Gets the value of the etrmiscmove property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrmiscmove property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRMISCMOVE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrMiscMoveType }
         * 
         * 
         */
        public List<EtrMiscMoveType> getETRMISCMOVE() {
            if (etrmiscmove == null) {
                etrmiscmove = new ArrayList<EtrMiscMoveType>();
            }
            return this.etrmiscmove;
        }

        /**
         * Gets the value of the etrmiscservice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrmiscservice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRMISCSERVICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrMiscServiceType }
         * 
         * 
         */
        public List<EtrMiscServiceType> getETRMISCSERVICE() {
            if (etrmiscservice == null) {
                etrmiscservice = new ArrayList<EtrMiscServiceType>();
            }
            return this.etrmiscservice;
        }

        /**
         * Gets the value of the etrmiscsleep property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrmiscsleep property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRMISCSLEEP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrMiscSleepType }
         * 
         * 
         */
        public List<EtrMiscSleepType> getETRMISCSLEEP() {
            if (etrmiscsleep == null) {
                etrmiscsleep = new ArrayList<EtrMiscSleepType>();
            }
            return this.etrmiscsleep;
        }

        /**
         * Gets the value of the etrservice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrservice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRSERVICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrServiceType }
         * 
         * 
         */
        public List<EtrServiceType> getETRSERVICE() {
            if (etrservice == null) {
                etrservice = new ArrayList<EtrServiceType>();
            }
            return this.etrservice;
        }

        /**
         * Gets the value of the etrtaxi property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrtaxi property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRTAXI().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrTaxiType }
         * 
         * 
         */
        public List<EtrTaxiType> getETRTAXI() {
            if (etrtaxi == null) {
                etrtaxi = new ArrayList<EtrTaxiType>();
            }
            return this.etrtaxi;
        }

        /**
         * Gets the value of the etrtransfer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrtransfer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRTRANSFER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrTransferType }
         * 
         * 
         */
        public List<EtrTransferType> getETRTRANSFER() {
            if (etrtransfer == null) {
                etrtransfer = new ArrayList<EtrTransferType>();
            }
            return this.etrtransfer;
        }

        /**
         * Gets the value of the quotations property.
         * 
         * @return
         *     possible object is
         *     {@link ETR.BOOKINGS.QUOTATIONS }
         *     
         */
        public ETR.BOOKINGS.QUOTATIONS getQUOTATIONS() {
            return quotations;
        }

        /**
         * Sets the value of the quotations property.
         * 
         * @param value
         *     allowed object is
         *     {@link ETR.BOOKINGS.QUOTATIONS }
         *     
         */
        public void setQUOTATIONS(ETR.BOOKINGS.QUOTATIONS value) {
            this.quotations = value;
        }

        /**
         * Gets the value of the etrhotel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrhotel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRHOTEL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrHotelType }
         * 
         * 
         */
        public List<EtrHotelType> getETRHOTEL() {
            if (etrhotel == null) {
                etrhotel = new ArrayList<EtrHotelType>();
            }
            return this.etrhotel;
        }

        /**
         * Gets the value of the etrrail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrrail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRRAIL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrRailType }
         * 
         * 
         */
        public List<EtrRailType> getETRRAIL() {
            if (etrrail == null) {
                etrrail = new ArrayList<EtrRailType>();
            }
            return this.etrrail;
        }

        /**
         * Gets the value of the etrcar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrcar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRCAR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrCarType }
         * 
         * 
         */
        public List<EtrCarType> getETRCAR() {
            if (etrcar == null) {
                etrcar = new ArrayList<EtrCarType>();
            }
            return this.etrcar;
        }

        /**
         * Gets the value of the etrcruise property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrcruise property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRCRUISE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrCruiseType }
         * 
         * 
         */
        public List<EtrCruiseType> getETRCRUISE() {
            if (etrcruise == null) {
                etrcruise = new ArrayList<EtrCruiseType>();
            }
            return this.etrcruise;
        }

        /**
         * Gets the value of the etrinsurance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrinsurance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRINSURANCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrInsuranceType }
         * 
         * 
         */
        public List<EtrInsuranceType> getETRINSURANCE() {
            if (etrinsurance == null) {
                etrinsurance = new ArrayList<EtrInsuranceType>();
            }
            return this.etrinsurance;
        }

        /**
         * Gets the value of the etrshowandevent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etrshowandevent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETRSHOWANDEVENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EtrShowAndEventType }
         * 
         * 
         */
        public List<EtrShowAndEventType> getETRSHOWANDEVENT() {
            if (etrshowandevent == null) {
                etrshowandevent = new ArrayList<EtrShowAndEventType>();
            }
            return this.etrshowandevent;
        }

        /**
         * Gets the value of the etrdiscount property.
         * 
         * @return
         *     possible object is
         *     {@link EtrDiscountElement }
         *     
         */
        public EtrDiscountElement getETRDISCOUNT() {
            return etrdiscount;
        }

        /**
         * Sets the value of the etrdiscount property.
         * 
         * @param value
         *     allowed object is
         *     {@link EtrDiscountElement }
         *     
         */
        public void setETRDISCOUNT(EtrDiscountElement value) {
            this.etrdiscount = value;
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
         *         &lt;element name="ETR_QUOTATION" type="{}etrQuotationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "etrquotation"
        })
        public static class QUOTATIONS
            implements Serializable
        {

            @XmlElement(name = "ETR_QUOTATION")
            protected List<EtrQuotationType> etrquotation;

            /**
             * Gets the value of the etrquotation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the etrquotation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getETRQUOTATION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EtrQuotationType }
             * 
             * 
             */
            public List<EtrQuotationType> getETRQUOTATION() {
                if (etrquotation == null) {
                    etrquotation = new ArrayList<EtrQuotationType>();
                }
                return this.etrquotation;
            }

        }

    }

}
