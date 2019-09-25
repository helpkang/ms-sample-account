
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CR3923840 Factorized for reuse for automatic ticket update
 * 
 * <p>Java class for SEGMENT_RESPONSE_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEGMENT_RESPONSE_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="SEGMENT_INDEX" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="SEGMENT"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="FROM" type="{}unprotectedStringType"/&gt;
 *                     &lt;element name="TO" type="{}unprotectedStringType"/&gt;
 *                     &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element name="AIRLINE" type="{}unprotectedStringType"/&gt;
 *                     &lt;element ref="{}FLIGHT_NUMBER"/&gt;
 *                     &lt;element name="DEPARTURE_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="ARRIVAL_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element name="DEPARTURE_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element name="ARRIVAL_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element name="CLASS" type="{}unprotectedStringType"/&gt;
 *                     &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEGMENT_RESPONSE_type", propOrder = {
    "id",
    "segmentindex",
    "segment"
})
public class SEGMENTRESPONSEType
    implements Serializable
{

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "SEGMENT_INDEX")
    protected String segmentindex;
    @XmlElement(name = "SEGMENT")
    protected SEGMENTRESPONSEType.SEGMENT segment;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the segmentindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTINDEX() {
        return segmentindex;
    }

    /**
     * Sets the value of the segmentindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTINDEX(String value) {
        this.segmentindex = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link SEGMENTRESPONSEType.SEGMENT }
     *     
     */
    public SEGMENTRESPONSEType.SEGMENT getSEGMENT() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEGMENTRESPONSEType.SEGMENT }
     *     
     */
    public void setSEGMENT(SEGMENTRESPONSEType.SEGMENT value) {
        this.segment = value;
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
     *         &lt;element name="FROM" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="TO" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AIRLINE" type="{}unprotectedStringType"/&gt;
     *         &lt;element ref="{}FLIGHT_NUMBER"/&gt;
     *         &lt;element name="DEPARTURE_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ARRIVAL_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DEPARTURE_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ARRIVAL_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CLASS" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "from",
        "to",
        "date",
        "airline",
        "flightnumber",
        "departuredate",
        "arrivaldate",
        "departuretime",
        "arrivaltime",
        "_class",
        "status"
    })
    public static class SEGMENT
        implements Serializable
    {

        @XmlElement(name = "FROM", required = true)
        protected String from;
        @XmlElement(name = "TO", required = true)
        protected String to;
        @XmlElement(name = "DATE")
        protected String date;
        @XmlElement(name = "AIRLINE", required = true)
        protected String airline;
        @XmlElement(name = "FLIGHT_NUMBER", required = true)
        protected String flightnumber;
        @XmlElement(name = "DEPARTURE_DATE", required = true)
        protected String departuredate;
        @XmlElement(name = "ARRIVAL_DATE")
        protected String arrivaldate;
        @XmlElement(name = "DEPARTURE_TIME")
        protected String departuretime;
        @XmlElement(name = "ARRIVAL_TIME")
        protected String arrivaltime;
        @XmlElement(name = "CLASS", required = true)
        protected String _class;
        @XmlElement(name = "STATUS")
        protected String status;

        /**
         * Gets the value of the from property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFROM() {
            return from;
        }

        /**
         * Sets the value of the from property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFROM(String value) {
            this.from = value;
        }

        /**
         * Gets the value of the to property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTO() {
            return to;
        }

        /**
         * Sets the value of the to property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTO(String value) {
            this.to = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATE(String value) {
            this.date = value;
        }

        /**
         * Gets the value of the airline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRLINE() {
            return airline;
        }

        /**
         * Sets the value of the airline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRLINE(String value) {
            this.airline = value;
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
         * Gets the value of the departuredate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPARTUREDATE() {
            return departuredate;
        }

        /**
         * Sets the value of the departuredate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPARTUREDATE(String value) {
            this.departuredate = value;
        }

        /**
         * Gets the value of the arrivaldate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getARRIVALDATE() {
            return arrivaldate;
        }

        /**
         * Sets the value of the arrivaldate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setARRIVALDATE(String value) {
            this.arrivaldate = value;
        }

        /**
         * Gets the value of the departuretime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPARTURETIME() {
            return departuretime;
        }

        /**
         * Sets the value of the departuretime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPARTURETIME(String value) {
            this.departuretime = value;
        }

        /**
         * Gets the value of the arrivaltime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getARRIVALTIME() {
            return arrivaltime;
        }

        /**
         * Sets the value of the arrivaltime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setARRIVALTIME(String value) {
            this.arrivaltime = value;
        }

        /**
         * Gets the value of the class property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLASS() {
            return _class;
        }

        /**
         * Sets the value of the class property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLASS(String value) {
            this._class = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUS(String value) {
            this.status = value;
        }

    }

}
