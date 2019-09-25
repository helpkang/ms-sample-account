
package com.koreanair.eretail.pojo.tripplan.pnr;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Strucutured details of a service request.
 * 
 * <p>Java class for ServiceRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SEAT_REQUEST" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_SEATS" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SEAT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element ref="{}TRAVELLER_ID" minOccurs="0"/&gt;
 *                             &lt;element name="SEAT_FLIGHT_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SMOKING" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;enumeration value="00"/&gt;
 *                                             &lt;enumeration value="NS"/&gt;
 *                                             &lt;enumeration value="SM"/&gt;
 *                                             &lt;enumeration value=""/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SEAT_LOCATION" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;enumeration value="ST"/&gt;
 *                                             &lt;enumeration value="SA"/&gt;
 *                                             &lt;enumeration value="SC"/&gt;
 *                                             &lt;enumeration value="SW"/&gt;
 *                                             &lt;enumeration value="SB"/&gt;
 *                                             &lt;enumeration value=""/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NAME" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="40"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LIST_SEAT_CHARACTERISTIC" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                       &lt;element name="NAME" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="40"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SEAT_ASSIGNMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BABY_SEAT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="SEAT_STATUS" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="CODE" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{}unprotectedStringType"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NAME" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;minLength value="1"/&gt;
 *                                             &lt;maxLength value="50"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestDetailsType", propOrder = {
    "seatrequest"
})
public class ServiceRequestDetailsType
    implements Serializable
{

    @XmlElement(name = "SEAT_REQUEST")
    protected ServiceRequestDetailsType.SEATREQUEST seatrequest;

    /**
     * Gets the value of the seatrequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequestDetailsType.SEATREQUEST }
     *     
     */
    public ServiceRequestDetailsType.SEATREQUEST getSEATREQUEST() {
        return seatrequest;
    }

    /**
     * Sets the value of the seatrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequestDetailsType.SEATREQUEST }
     *     
     */
    public void setSEATREQUEST(ServiceRequestDetailsType.SEATREQUEST value) {
        this.seatrequest = value;
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
     *         &lt;element name="LIST_SEATS" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SEAT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element ref="{}TRAVELLER_ID" minOccurs="0"/&gt;
     *                   &lt;element name="SEAT_FLIGHT_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SMOKING" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;enumeration value="00"/&gt;
     *                                   &lt;enumeration value="NS"/&gt;
     *                                   &lt;enumeration value="SM"/&gt;
     *                                   &lt;enumeration value=""/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SEAT_LOCATION" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;enumeration value="ST"/&gt;
     *                                   &lt;enumeration value="SA"/&gt;
     *                                   &lt;enumeration value="SC"/&gt;
     *                                   &lt;enumeration value="SW"/&gt;
     *                                   &lt;enumeration value="SB"/&gt;
     *                                   &lt;enumeration value=""/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NAME" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="40"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_SEAT_CHARACTERISTIC" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                             &lt;element name="NAME" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="40"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SEAT_ASSIGNMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BABY_SEAT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="SEAT_STATUS" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="CODE" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{}unprotectedStringType"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NAME" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;minLength value="1"/&gt;
     *                                   &lt;maxLength value="50"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
        "listseats"
    })
    public static class SEATREQUEST
        implements Serializable
    {

        @XmlElement(name = "LIST_SEATS", required = true)
        protected List<ServiceRequestDetailsType.SEATREQUEST.LISTSEATS> listseats;

        /**
         * Gets the value of the listseats property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listseats property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEATS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS }
         * 
         * 
         */
        public List<ServiceRequestDetailsType.SEATREQUEST.LISTSEATS> getLISTSEATS() {
            if (listseats == null) {
                listseats = new ArrayList<ServiceRequestDetailsType.SEATREQUEST.LISTSEATS>();
            }
            return this.listseats;
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
         *         &lt;element name="SEAT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element ref="{}TRAVELLER_ID" minOccurs="0"/&gt;
         *         &lt;element name="SEAT_FLIGHT_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SMOKING" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;enumeration value="00"/&gt;
         *                         &lt;enumeration value="NS"/&gt;
         *                         &lt;enumeration value="SM"/&gt;
         *                         &lt;enumeration value=""/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SEAT_LOCATION" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;enumeration value="ST"/&gt;
         *                         &lt;enumeration value="SA"/&gt;
         *                         &lt;enumeration value="SC"/&gt;
         *                         &lt;enumeration value="SW"/&gt;
         *                         &lt;enumeration value="SB"/&gt;
         *                         &lt;enumeration value=""/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NAME" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="40"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_SEAT_CHARACTERISTIC" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                   &lt;element name="NAME" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="40"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SEAT_ASSIGNMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BABY_SEAT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="SEAT_STATUS" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="CODE" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{}unprotectedStringType"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NAME" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;minLength value="1"/&gt;
         *                         &lt;maxLength value="50"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/all&gt;
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
            "seatid",
            "travellerid",
            "seatflightindicator",
            "smoking",
            "seatlocation",
            "listseatcharacteristic",
            "seatassignment",
            "babyseat",
            "seatstatus"
        })
        public static class LISTSEATS
            implements Serializable
        {

            @XmlElement(name = "SEAT_ID")
            protected BigInteger seatid;
            @XmlElement(name = "TRAVELLER_ID")
            protected BigInteger travellerid;
            @XmlElement(name = "SEAT_FLIGHT_INDICATOR")
            protected String seatflightindicator;
            @XmlElement(name = "SMOKING")
            protected ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SMOKING smoking;
            @XmlElement(name = "SEAT_LOCATION")
            protected ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATLOCATION seatlocation;
            @XmlElement(name = "LIST_SEAT_CHARACTERISTIC")
            protected List<ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.LISTSEATCHARACTERISTIC> listseatcharacteristic;
            @XmlElement(name = "SEAT_ASSIGNMENT")
            protected String seatassignment;
            @XmlElement(name = "BABY_SEAT")
            protected Boolean babyseat;
            @XmlElement(name = "SEAT_STATUS")
            protected ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATSTATUS seatstatus;

            /**
             * Gets the value of the seatid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSEATID() {
                return seatid;
            }

            /**
             * Sets the value of the seatid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSEATID(BigInteger value) {
                this.seatid = value;
            }

            /**
             * Gets the value of the travellerid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTRAVELLERID() {
                return travellerid;
            }

            /**
             * Sets the value of the travellerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTRAVELLERID(BigInteger value) {
                this.travellerid = value;
            }

            /**
             * Gets the value of the seatflightindicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSEATFLIGHTINDICATOR() {
                return seatflightindicator;
            }

            /**
             * Sets the value of the seatflightindicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSEATFLIGHTINDICATOR(String value) {
                this.seatflightindicator = value;
            }

            /**
             * Gets the value of the smoking property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SMOKING }
             *     
             */
            public ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SMOKING getSMOKING() {
                return smoking;
            }

            /**
             * Sets the value of the smoking property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SMOKING }
             *     
             */
            public void setSMOKING(ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SMOKING value) {
                this.smoking = value;
            }

            /**
             * Gets the value of the seatlocation property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATLOCATION }
             *     
             */
            public ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATLOCATION getSEATLOCATION() {
                return seatlocation;
            }

            /**
             * Sets the value of the seatlocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATLOCATION }
             *     
             */
            public void setSEATLOCATION(ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATLOCATION value) {
                this.seatlocation = value;
            }

            /**
             * Gets the value of the listseatcharacteristic property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listseatcharacteristic property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTSEATCHARACTERISTIC().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.LISTSEATCHARACTERISTIC }
             * 
             * 
             */
            public List<ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.LISTSEATCHARACTERISTIC> getLISTSEATCHARACTERISTIC() {
                if (listseatcharacteristic == null) {
                    listseatcharacteristic = new ArrayList<ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.LISTSEATCHARACTERISTIC>();
                }
                return this.listseatcharacteristic;
            }

            /**
             * Gets the value of the seatassignment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSEATASSIGNMENT() {
                return seatassignment;
            }

            /**
             * Sets the value of the seatassignment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSEATASSIGNMENT(String value) {
                this.seatassignment = value;
            }

            /**
             * Gets the value of the babyseat property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBABYSEAT() {
                return babyseat;
            }

            /**
             * Sets the value of the babyseat property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBABYSEAT(Boolean value) {
                this.babyseat = value;
            }

            /**
             * Gets the value of the seatstatus property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATSTATUS }
             *     
             */
            public ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATSTATUS getSEATSTATUS() {
                return seatstatus;
            }

            /**
             * Sets the value of the seatstatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATSTATUS }
             *     
             */
            public void setSEATSTATUS(ServiceRequestDetailsType.SEATREQUEST.LISTSEATS.SEATSTATUS value) {
                this.seatstatus = value;
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
             *       &lt;all&gt;
             *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
             *         &lt;element name="NAME" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="40"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *       &lt;/all&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class LISTSEATCHARACTERISTIC
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "NAME")
                protected String name;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCODE() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCODE(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNAME() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNAME(String value) {
                    this.name = value;
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
             *       &lt;all&gt;
             *         &lt;element name="CODE"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;enumeration value="ST"/&gt;
             *               &lt;enumeration value="SA"/&gt;
             *               &lt;enumeration value="SC"/&gt;
             *               &lt;enumeration value="SW"/&gt;
             *               &lt;enumeration value="SB"/&gt;
             *               &lt;enumeration value=""/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NAME" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="40"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *       &lt;/all&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class SEATLOCATION
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "NAME")
                protected String name;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCODE() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCODE(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNAME() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNAME(String value) {
                    this.name = value;
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
             *       &lt;all&gt;
             *         &lt;element name="CODE" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;maxLength value="2"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NAME" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;minLength value="1"/&gt;
             *               &lt;maxLength value="50"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *       &lt;/all&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class SEATSTATUS
                implements Serializable
            {

                @XmlElement(name = "CODE")
                protected String code;
                @XmlElement(name = "NAME")
                protected String name;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCODE() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCODE(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNAME() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNAME(String value) {
                    this.name = value;
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
             *       &lt;all&gt;
             *         &lt;element name="CODE" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{}unprotectedStringType"&gt;
             *               &lt;enumeration value="00"/&gt;
             *               &lt;enumeration value="NS"/&gt;
             *               &lt;enumeration value="SM"/&gt;
             *               &lt;enumeration value=""/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/all&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class SMOKING
                implements Serializable
            {

                @XmlElement(name = "CODE")
                protected String code;
                @XmlElement(name = "NAME")
                protected String name;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCODE() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCODE(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNAME() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNAME(String value) {
                    this.name = value;
                }

            }

        }

    }

}
