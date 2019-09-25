
package com.koreanair.external.eretail.vo.tripplan.ancillary_services;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itineraryForServicePricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itineraryForServicePricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LIST_SEGMENT" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="MKT_AIRLINE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="MKT_AIRLINE_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="OPER_AIRLINE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="FLIGHT" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="BOOKING_CLASS" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="CABIN" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="B_AIRPORT_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="E_AIRPORT_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="B_DATE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="E_DATE" type="{}unprotectedStringType"/&gt;
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
@XmlType(name = "itineraryForServicePricingType", propOrder = {
    "boundid",
    "listsegment"
})
public class ItineraryForServicePricingType
    implements Serializable
{

    @XmlElement(name = "BOUND_ID", required = true)
    protected BigInteger boundid;
    @XmlElement(name = "LIST_SEGMENT", required = true)
    protected List<ItineraryForServicePricingType.LISTSEGMENT> listsegment;

    /**
     * Gets the value of the boundid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBOUNDID() {
        return boundid;
    }

    /**
     * Sets the value of the boundid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBOUNDID(BigInteger value) {
        this.boundid = value;
    }

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
     * {@link ItineraryForServicePricingType.LISTSEGMENT }
     * 
     * 
     */
    public List<ItineraryForServicePricingType.LISTSEGMENT> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<ItineraryForServicePricingType.LISTSEGMENT>();
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
     *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="MKT_AIRLINE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="MKT_AIRLINE_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="OPER_AIRLINE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="FLIGHT" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="BOOKING_CLASS" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="CABIN" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="B_AIRPORT_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="E_AIRPORT_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="B_DATE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="E_DATE" type="{}unprotectedStringType"/&gt;
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
        "mktairline",
        "mktairlinename",
        "operairline",
        "flight",
        "bookingclass",
        "cabin",
        "bairportcode",
        "eairportcode",
        "bdate",
        "edate"
    })
    public static class LISTSEGMENT
        implements Serializable
    {

        @XmlElement(name = "SEGMENT_ID", required = true)
        protected BigInteger segmentid;
        @XmlElement(name = "MKT_AIRLINE", required = true)
        protected String mktairline;
        @XmlElement(name = "MKT_AIRLINE_NAME")
        protected String mktairlinename;
        @XmlElement(name = "OPER_AIRLINE")
        protected String operairline;
        @XmlElement(name = "FLIGHT", required = true)
        protected String flight;
        @XmlElement(name = "BOOKING_CLASS", required = true)
        protected String bookingclass;
        @XmlElement(name = "CABIN", required = true)
        protected String cabin;
        @XmlElement(name = "B_AIRPORT_CODE", required = true)
        protected String bairportcode;
        @XmlElement(name = "E_AIRPORT_CODE", required = true)
        protected String eairportcode;
        @XmlElement(name = "B_DATE", required = true)
        protected String bdate;
        @XmlElement(name = "E_DATE", required = true)
        protected String edate;

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
         * Gets the value of the mktairline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMKTAIRLINE() {
            return mktairline;
        }

        /**
         * Sets the value of the mktairline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMKTAIRLINE(String value) {
            this.mktairline = value;
        }

        /**
         * Gets the value of the mktairlinename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMKTAIRLINENAME() {
            return mktairlinename;
        }

        /**
         * Sets the value of the mktairlinename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMKTAIRLINENAME(String value) {
            this.mktairlinename = value;
        }

        /**
         * Gets the value of the operairline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOPERAIRLINE() {
            return operairline;
        }

        /**
         * Sets the value of the operairline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOPERAIRLINE(String value) {
            this.operairline = value;
        }

        /**
         * Gets the value of the flight property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFLIGHT() {
            return flight;
        }

        /**
         * Sets the value of the flight property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFLIGHT(String value) {
            this.flight = value;
        }

        /**
         * Gets the value of the bookingclass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOOKINGCLASS() {
            return bookingclass;
        }

        /**
         * Sets the value of the bookingclass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOOKINGCLASS(String value) {
            this.bookingclass = value;
        }

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

        /**
         * Gets the value of the bairportcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBAIRPORTCODE() {
            return bairportcode;
        }

        /**
         * Sets the value of the bairportcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBAIRPORTCODE(String value) {
            this.bairportcode = value;
        }

        /**
         * Gets the value of the eairportcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEAIRPORTCODE() {
            return eairportcode;
        }

        /**
         * Sets the value of the eairportcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEAIRPORTCODE(String value) {
            this.eairportcode = value;
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

    }

}
