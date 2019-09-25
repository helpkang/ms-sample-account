
package com.koreanair.external.eretail.vo.tripplan.tr_elements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.EtrAirType;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.EtrHotelType;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.EtrMeetingType;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.EtrMiscActivityType;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.EtrMiscEatAndDrinkType;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.EtrMiscMoveType;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.EtrMiscServiceType;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.EtrMiscSleepType;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.EtrRailType;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.EtrServiceType;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.EtrTaxiType;
import com.koreanair.external.eretail.vo.tripplan.etr_elements.EtrTransferType;


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
 *         &lt;element name="GENERIC_TRAVEL_REQUEST" type="{}trGenericTravelRequestType" maxOccurs="20" minOccurs="0"/&gt;
 *         &lt;element name="TRAVEL_REQUEST" type="{}trTravelRequestType" maxOccurs="20" minOccurs="0"/&gt;
 *         &lt;element name="SPECIALIZATION_REQUEST" type="{}trSpecializationRequestType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TR_MISC_ACTIVITY" type="{}trMiscActivityType" maxOccurs="50" minOccurs="0"/&gt;
 *         &lt;element name="ETR_AIR" type="{}etrAirType" maxOccurs="50" minOccurs="0"/&gt;
 *         &lt;element name="ETR_MEETING" type="{}etrMeetingType" maxOccurs="50" minOccurs="0"/&gt;
 *         &lt;element name="ETR_MISC_ACTIVITY" type="{}etrMiscActivityType" maxOccurs="50" minOccurs="0"/&gt;
 *         &lt;element name="ETR_MISC_EAT_AND_DRINK" type="{}etrMiscEatAndDrinkType" maxOccurs="50" minOccurs="0"/&gt;
 *         &lt;element name="ETR_MISC_MOVE" type="{}etrMiscMoveType" maxOccurs="50" minOccurs="0"/&gt;
 *         &lt;element name="ETR_MISC_SERVICE" type="{}etrMiscServiceType" maxOccurs="50" minOccurs="0"/&gt;
 *         &lt;element name="ETR_MISC_SLEEP" type="{}etrMiscSleepType" maxOccurs="50" minOccurs="0"/&gt;
 *         &lt;element name="ETR_SERVICE" type="{}etrServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ETR_TAXI" type="{}etrTaxiType" maxOccurs="50" minOccurs="0"/&gt;
 *         &lt;element name="ETR_TRANSFER" type="{}etrTransferType" maxOccurs="50" minOccurs="0"/&gt;
 *         &lt;element name="ETR_HOTEL" type="{}etrHotelType" maxOccurs="50" minOccurs="0"/&gt;
 *         &lt;element name="ETR_RAIL" type="{}etrRailType" maxOccurs="50" minOccurs="0"/&gt;
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
    "generictravelrequest",
    "travelrequest",
    "specializationrequest",
    "trmiscactivity",
    "etrair",
    "etrmeeting",
    "etrmiscactivity",
    "etrmisceatanddrink",
    "etrmiscmove",
    "etrmiscservice",
    "etrmiscsleep",
    "etrservice",
    "etrtaxi",
    "etrtransfer",
    "etrhotel",
    "etrrail"
})
@XmlRootElement(name = "TR")
public class TR
    implements Serializable
{

    @XmlElement(name = "GENERIC_TRAVEL_REQUEST")
    protected List<TrGenericTravelRequestType> generictravelrequest;
    @XmlElement(name = "TRAVEL_REQUEST")
    protected List<TrTravelRequestType> travelrequest;
    @XmlElement(name = "SPECIALIZATION_REQUEST")
    protected List<TrSpecializationRequestType> specializationrequest;
    @XmlElement(name = "TR_MISC_ACTIVITY")
    protected List<TrMiscActivityType> trmiscactivity;
    @XmlElement(name = "ETR_AIR")
    protected List<EtrAirType> etrair;
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
    @XmlElement(name = "ETR_HOTEL")
    protected List<EtrHotelType> etrhotel;
    @XmlElement(name = "ETR_RAIL")
    protected List<EtrRailType> etrrail;

    /**
     * Gets the value of the generictravelrequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generictravelrequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGENERICTRAVELREQUEST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrGenericTravelRequestType }
     * 
     * 
     */
    public List<TrGenericTravelRequestType> getGENERICTRAVELREQUEST() {
        if (generictravelrequest == null) {
            generictravelrequest = new ArrayList<TrGenericTravelRequestType>();
        }
        return this.generictravelrequest;
    }

    /**
     * Gets the value of the travelrequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelrequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRAVELREQUEST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrTravelRequestType }
     * 
     * 
     */
    public List<TrTravelRequestType> getTRAVELREQUEST() {
        if (travelrequest == null) {
            travelrequest = new ArrayList<TrTravelRequestType>();
        }
        return this.travelrequest;
    }

    /**
     * Gets the value of the specializationrequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specializationrequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPECIALIZATIONREQUEST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrSpecializationRequestType }
     * 
     * 
     */
    public List<TrSpecializationRequestType> getSPECIALIZATIONREQUEST() {
        if (specializationrequest == null) {
            specializationrequest = new ArrayList<TrSpecializationRequestType>();
        }
        return this.specializationrequest;
    }

    /**
     * Gets the value of the trmiscactivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trmiscactivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRMISCACTIVITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrMiscActivityType }
     * 
     * 
     */
    public List<TrMiscActivityType> getTRMISCACTIVITY() {
        if (trmiscactivity == null) {
            trmiscactivity = new ArrayList<TrMiscActivityType>();
        }
        return this.trmiscactivity;
    }

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

}
