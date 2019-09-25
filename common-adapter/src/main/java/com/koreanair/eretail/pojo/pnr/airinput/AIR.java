
package com.koreanair.eretail.pojo.pnr.airinput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;


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
 *         &lt;element name="LIST_ITINERARY" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SEGMENT_ID" type="{}SEGMENT_ID" minOccurs="0"/&gt;
 *                             &lt;element name="E_LOCATION" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="LOCATION_CODE" type="{}SEGMENT_LOCATION_CODE"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="B_LOCATION" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="LOCATION_CODE" type="{}SEGMENT_LOCATION_CODE"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="E_DATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="E_TIME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="B_DATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="B_TIME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="FLIGHT_NUMBER" type="{}SEGMENT_FLIGHT_NUMBER" minOccurs="0"/&gt;
 *                             &lt;element name="AIRLINE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OTHER_AIRLINE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LIST_CABIN" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CABIN" type="{}SEGMENT_CABIN"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NB_SEATS" type="{}SEGMENT_NB_SEATS" minOccurs="0"/&gt;
 *                             &lt;element name="OPEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="BOOKING_ACTION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IS_DIRECT_ACCESS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="DIRECT_ACCESS_AIRLINE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="REC_LOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IS_INFORMATIONAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IS_AWARD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_ASSOCIATED_PAX" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LIST_PRICING_OPTIONS" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listitinerary"
})
@XmlRootElement(name = "AIR")
public class AIR
    implements Serializable
{

    @XmlElement(name = "LIST_ITINERARY", required = true)
    protected List<AIR.LISTITINERARY> listitinerary;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the listitinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listitinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTITINERARY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AIR.LISTITINERARY }
     * 
     * 
     */
    public List<AIR.LISTITINERARY> getLISTITINERARY() {
        if (listitinerary == null) {
            listitinerary = new ArrayList<AIR.LISTITINERARY>();
        }
        return this.listitinerary;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
     *         &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SEGMENT_ID" type="{}SEGMENT_ID" minOccurs="0"/&gt;
     *                   &lt;element name="E_LOCATION" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="LOCATION_CODE" type="{}SEGMENT_LOCATION_CODE"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="B_LOCATION" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="LOCATION_CODE" type="{}SEGMENT_LOCATION_CODE"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="E_DATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="E_TIME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="B_DATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="B_TIME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="FLIGHT_NUMBER" type="{}SEGMENT_FLIGHT_NUMBER" minOccurs="0"/&gt;
     *                   &lt;element name="AIRLINE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OTHER_AIRLINE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_CABIN" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CABIN" type="{}SEGMENT_CABIN"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NB_SEATS" type="{}SEGMENT_NB_SEATS" minOccurs="0"/&gt;
     *                   &lt;element name="OPEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="BOOKING_ACTION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IS_DIRECT_ACCESS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="DIRECT_ACCESS_AIRLINE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="REC_LOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IS_INFORMATIONAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IS_AWARD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_ASSOCIATED_PAX" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LIST_PRICING_OPTIONS" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listsegment"
    })
    public static class LISTITINERARY
        implements Serializable
    {

        @XmlElement(name = "LIST_SEGMENT", required = true)
        protected List<AIR.LISTITINERARY.LISTSEGMENT> listsegment;

        /**
         * Gets the value of the listsegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listsegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEGMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AIR.LISTITINERARY.LISTSEGMENT }
         * 
         * 
         */
        public List<AIR.LISTITINERARY.LISTSEGMENT> getLISTSEGMENT() {
            if (listsegment == null) {
                listsegment = new ArrayList<AIR.LISTITINERARY.LISTSEGMENT>();
            }
            return this.listsegment;
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
         *         &lt;element name="SEGMENT_ID" type="{}SEGMENT_ID" minOccurs="0"/&gt;
         *         &lt;element name="E_LOCATION" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="LOCATION_CODE" type="{}SEGMENT_LOCATION_CODE"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="B_LOCATION" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="LOCATION_CODE" type="{}SEGMENT_LOCATION_CODE"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="E_DATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="E_TIME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="B_DATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="B_TIME" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="FLIGHT_NUMBER" type="{}SEGMENT_FLIGHT_NUMBER" minOccurs="0"/&gt;
         *         &lt;element name="AIRLINE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OTHER_AIRLINE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_CABIN" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CABIN" type="{}SEGMENT_CABIN"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NB_SEATS" type="{}SEGMENT_NB_SEATS" minOccurs="0"/&gt;
         *         &lt;element name="OPEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="BOOKING_ACTION_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IS_DIRECT_ACCESS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="DIRECT_ACCESS_AIRLINE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="REC_LOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IS_INFORMATIONAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IS_AWARD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="LIST_ASSOCIATED_PAX" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LIST_PRICING_OPTIONS" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "segmentid",
            "elocation",
            "blocation",
            "edate",
            "etime",
            "bdate",
            "btime",
            "flightnumber",
            "airline",
            "otherairline",
            "listcabin",
            "nbseats",
            "open",
            "bookingactioncode",
            "isdirectaccess",
            "directaccessairline",
            "recloc",
            "isinformational",
            "isaward",
            "listassociatedpax",
            "listpricingoptions"
        })
        public static class LISTSEGMENT
            implements Serializable
        {

            @XmlElement(name = "SEGMENT_ID")
            protected BigInteger segmentid;
            @XmlElement(name = "E_LOCATION")
            protected AIR.LISTITINERARY.LISTSEGMENT.ELOCATION elocation;
            @XmlElement(name = "B_LOCATION")
            protected AIR.LISTITINERARY.LISTSEGMENT.BLOCATION blocation;
            @XmlElement(name = "E_DATE")
            protected String edate;
            @XmlElement(name = "E_TIME")
            protected String etime;
            @XmlElement(name = "B_DATE")
            protected String bdate;
            @XmlElement(name = "B_TIME")
            protected String btime;
            @XmlElement(name = "FLIGHT_NUMBER")
            protected String flightnumber;
            @XmlElement(name = "AIRLINE")
            protected AIR.LISTITINERARY.LISTSEGMENT.AIRLINE airline;
            @XmlElement(name = "OTHER_AIRLINE")
            protected AIR.LISTITINERARY.LISTSEGMENT.OTHERAIRLINE otherairline;
            @XmlElement(name = "LIST_CABIN")
            protected AIR.LISTITINERARY.LISTSEGMENT.LISTCABIN listcabin;
            @XmlElement(name = "NB_SEATS")
            protected BigInteger nbseats;
            @XmlElement(name = "OPEN")
            protected Boolean open;
            @XmlElement(name = "BOOKING_ACTION_CODE")
            protected String bookingactioncode;
            @XmlElement(name = "IS_DIRECT_ACCESS")
            protected Boolean isdirectaccess;
            @XmlElement(name = "DIRECT_ACCESS_AIRLINE")
            protected AIR.LISTITINERARY.LISTSEGMENT.DIRECTACCESSAIRLINE directaccessairline;
            @XmlElement(name = "REC_LOC")
            protected String recloc;
            @XmlElement(name = "IS_INFORMATIONAL")
            protected String isinformational;
            @XmlElement(name = "IS_AWARD")
            protected Boolean isaward;
            @XmlElement(name = "LIST_ASSOCIATED_PAX")
            protected List<AIR.LISTITINERARY.LISTSEGMENT.LISTASSOCIATEDPAX> listassociatedpax;
            @XmlElement(name = "LIST_PRICING_OPTIONS")
            protected List<BigInteger> listpricingoptions;

            /**
             * Gets the value of the segmentid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSEGMENTID() {
                return segmentid;
            }

            /**
             * Sets the value of the segmentid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSEGMENTID(BigInteger value) {
                this.segmentid = value;
            }

            /**
             * Gets the value of the elocation property.
             * 
             * @return
             *     possible object is
             *     {@link AIR.LISTITINERARY.LISTSEGMENT.ELOCATION }
             *     
             */
            public AIR.LISTITINERARY.LISTSEGMENT.ELOCATION getELOCATION() {
                return elocation;
            }

            /**
             * Sets the value of the elocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIR.LISTITINERARY.LISTSEGMENT.ELOCATION }
             *     
             */
            public void setELOCATION(AIR.LISTITINERARY.LISTSEGMENT.ELOCATION value) {
                this.elocation = value;
            }

            /**
             * Gets the value of the blocation property.
             * 
             * @return
             *     possible object is
             *     {@link AIR.LISTITINERARY.LISTSEGMENT.BLOCATION }
             *     
             */
            public AIR.LISTITINERARY.LISTSEGMENT.BLOCATION getBLOCATION() {
                return blocation;
            }

            /**
             * Sets the value of the blocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIR.LISTITINERARY.LISTSEGMENT.BLOCATION }
             *     
             */
            public void setBLOCATION(AIR.LISTITINERARY.LISTSEGMENT.BLOCATION value) {
                this.blocation = value;
            }

            /**
             * Gets the value of the edate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEDATE() {
                return edate;
            }

            /**
             * Sets the value of the edate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEDATE(String value) {
                this.edate = value;
            }

            /**
             * Gets the value of the etime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getETIME() {
                return etime;
            }

            /**
             * Sets the value of the etime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setETIME(String value) {
                this.etime = value;
            }

            /**
             * Gets the value of the bdate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBDATE() {
                return bdate;
            }

            /**
             * Sets the value of the bdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBDATE(String value) {
                this.bdate = value;
            }

            /**
             * Gets the value of the btime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBTIME() {
                return btime;
            }

            /**
             * Sets the value of the btime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBTIME(String value) {
                this.btime = value;
            }

            /**
             * Gets the value of the flightnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFLIGHTNUMBER() {
                return flightnumber;
            }

            /**
             * Sets the value of the flightnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFLIGHTNUMBER(String value) {
                this.flightnumber = value;
            }

            /**
             * Gets the value of the airline property.
             * 
             * @return
             *     possible object is
             *     {@link AIR.LISTITINERARY.LISTSEGMENT.AIRLINE }
             *     
             */
            public AIR.LISTITINERARY.LISTSEGMENT.AIRLINE getAIRLINE() {
                return airline;
            }

            /**
             * Sets the value of the airline property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIR.LISTITINERARY.LISTSEGMENT.AIRLINE }
             *     
             */
            public void setAIRLINE(AIR.LISTITINERARY.LISTSEGMENT.AIRLINE value) {
                this.airline = value;
            }

            /**
             * Gets the value of the otherairline property.
             * 
             * @return
             *     possible object is
             *     {@link AIR.LISTITINERARY.LISTSEGMENT.OTHERAIRLINE }
             *     
             */
            public AIR.LISTITINERARY.LISTSEGMENT.OTHERAIRLINE getOTHERAIRLINE() {
                return otherairline;
            }

            /**
             * Sets the value of the otherairline property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIR.LISTITINERARY.LISTSEGMENT.OTHERAIRLINE }
             *     
             */
            public void setOTHERAIRLINE(AIR.LISTITINERARY.LISTSEGMENT.OTHERAIRLINE value) {
                this.otherairline = value;
            }

            /**
             * Gets the value of the listcabin property.
             * 
             * @return
             *     possible object is
             *     {@link AIR.LISTITINERARY.LISTSEGMENT.LISTCABIN }
             *     
             */
            public AIR.LISTITINERARY.LISTSEGMENT.LISTCABIN getLISTCABIN() {
                return listcabin;
            }

            /**
             * Sets the value of the listcabin property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIR.LISTITINERARY.LISTSEGMENT.LISTCABIN }
             *     
             */
            public void setLISTCABIN(AIR.LISTITINERARY.LISTSEGMENT.LISTCABIN value) {
                this.listcabin = value;
            }

            /**
             * Gets the value of the nbseats property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNBSEATS() {
                return nbseats;
            }

            /**
             * Sets the value of the nbseats property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNBSEATS(BigInteger value) {
                this.nbseats = value;
            }

            /**
             * Gets the value of the open property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOPEN() {
                return open;
            }

            /**
             * Sets the value of the open property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOPEN(Boolean value) {
                this.open = value;
            }

            /**
             * Gets the value of the bookingactioncode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBOOKINGACTIONCODE() {
                return bookingactioncode;
            }

            /**
             * Sets the value of the bookingactioncode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBOOKINGACTIONCODE(String value) {
                this.bookingactioncode = value;
            }

            /**
             * Gets the value of the isdirectaccess property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISDIRECTACCESS() {
                return isdirectaccess;
            }

            /**
             * Sets the value of the isdirectaccess property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISDIRECTACCESS(Boolean value) {
                this.isdirectaccess = value;
            }

            /**
             * Gets the value of the directaccessairline property.
             * 
             * @return
             *     possible object is
             *     {@link AIR.LISTITINERARY.LISTSEGMENT.DIRECTACCESSAIRLINE }
             *     
             */
            public AIR.LISTITINERARY.LISTSEGMENT.DIRECTACCESSAIRLINE getDIRECTACCESSAIRLINE() {
                return directaccessairline;
            }

            /**
             * Sets the value of the directaccessairline property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIR.LISTITINERARY.LISTSEGMENT.DIRECTACCESSAIRLINE }
             *     
             */
            public void setDIRECTACCESSAIRLINE(AIR.LISTITINERARY.LISTSEGMENT.DIRECTACCESSAIRLINE value) {
                this.directaccessairline = value;
            }

            /**
             * Gets the value of the recloc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRECLOC() {
                return recloc;
            }

            /**
             * Sets the value of the recloc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRECLOC(String value) {
                this.recloc = value;
            }

            /**
             * Gets the value of the isinformational property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getISINFORMATIONAL() {
                return isinformational;
            }

            /**
             * Sets the value of the isinformational property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setISINFORMATIONAL(String value) {
                this.isinformational = value;
            }

            /**
             * Gets the value of the isaward property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISAWARD() {
                return isaward;
            }

            /**
             * Sets the value of the isaward property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISAWARD(Boolean value) {
                this.isaward = value;
            }

            /**
             * Gets the value of the listassociatedpax property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listassociatedpax property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTASSOCIATEDPAX().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AIR.LISTITINERARY.LISTSEGMENT.LISTASSOCIATEDPAX }
             * 
             * 
             */
            public List<AIR.LISTITINERARY.LISTSEGMENT.LISTASSOCIATEDPAX> getLISTASSOCIATEDPAX() {
                if (listassociatedpax == null) {
                    listassociatedpax = new ArrayList<AIR.LISTITINERARY.LISTSEGMENT.LISTASSOCIATEDPAX>();
                }
                return this.listassociatedpax;
            }

            /**
             * Gets the value of the listpricingoptions property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listpricingoptions property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTPRICINGOPTIONS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getLISTPRICINGOPTIONS() {
                if (listpricingoptions == null) {
                    listpricingoptions = new ArrayList<BigInteger>();
                }
                return this.listpricingoptions;
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
             *         &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE"/&gt;
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
                "code"
            })
            public static class AIRLINE
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;

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
             *         &lt;element name="LOCATION_CODE" type="{}SEGMENT_LOCATION_CODE"/&gt;
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
                "locationcode"
            })
            public static class BLOCATION
                implements Serializable
            {

                @XmlElement(name = "LOCATION_CODE", required = true)
                protected String locationcode;

                /**
                 * Gets the value of the locationcode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLOCATIONCODE() {
                    return locationcode;
                }

                /**
                 * Sets the value of the locationcode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLOCATIONCODE(String value) {
                    this.locationcode = value;
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
             *         &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE"/&gt;
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
                "code"
            })
            public static class DIRECTACCESSAIRLINE
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;

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
             *         &lt;element name="LOCATION_CODE" type="{}SEGMENT_LOCATION_CODE"/&gt;
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
                "locationcode"
            })
            public static class ELOCATION
                implements Serializable
            {

                @XmlElement(name = "LOCATION_CODE", required = true)
                protected String locationcode;

                /**
                 * Gets the value of the locationcode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLOCATIONCODE() {
                    return locationcode;
                }

                /**
                 * Sets the value of the locationcode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLOCATIONCODE(String value) {
                    this.locationcode = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class LISTASSOCIATEDPAX
                implements Serializable
            {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "isDeleted")
                protected Boolean isDeleted;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the isDeleted property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isIsDeleted() {
                    return isDeleted;
                }

                /**
                 * Sets the value of the isDeleted property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setIsDeleted(Boolean value) {
                    this.isDeleted = value;
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
             *         &lt;element name="CABIN" type="{}SEGMENT_CABIN"/&gt;
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
                "cabin"
            })
            public static class LISTCABIN
                implements Serializable
            {

                @XmlElement(name = "CABIN", required = true)
                protected String cabin;

                /**
                 * Gets the value of the cabin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCABIN() {
                    return cabin;
                }

                /**
                 * Sets the value of the cabin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCABIN(String value) {
                    this.cabin = value;
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
             *         &lt;element name="CODE" type="{}SEGMENT_AIRLINE_CODE"/&gt;
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
                "code"
            })
            public static class OTHERAIRLINE
                implements Serializable
            {

                @XmlElement(name = "CODE", required = true)
                protected String code;

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

            }

        }

    }

}
