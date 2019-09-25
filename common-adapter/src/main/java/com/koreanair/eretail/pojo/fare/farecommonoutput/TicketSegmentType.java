
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketSegment_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketSegment_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FARE_SEGMENT_INFO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}SEGMENT_Type"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INDICATORS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TRANSFER_STOPOVER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="SIDE_TRIP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRANSPORTATION_SEGMENT_INFO" type="{}BasicTransportSegment_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketSegment_Type", propOrder = {
    "faresegmentinfo",
    "transportationsegmentinfo"
})
public class TicketSegmentType
    implements Serializable
{

    @XmlElement(name = "FARE_SEGMENT_INFO")
    protected TicketSegmentType.FARESEGMENTINFO faresegmentinfo;
    @XmlElement(name = "TRANSPORTATION_SEGMENT_INFO", required = true)
    protected BasicTransportSegmentType transportationsegmentinfo;

    /**
     * Gets the value of the faresegmentinfo property.
     * 
     * @return
     *     possible object is
     *     {@link TicketSegmentType.FARESEGMENTINFO }
     *     
     */
    public TicketSegmentType.FARESEGMENTINFO getFARESEGMENTINFO() {
        return faresegmentinfo;
    }

    /**
     * Sets the value of the faresegmentinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketSegmentType.FARESEGMENTINFO }
     *     
     */
    public void setFARESEGMENTINFO(TicketSegmentType.FARESEGMENTINFO value) {
        this.faresegmentinfo = value;
    }

    /**
     * Gets the value of the transportationsegmentinfo property.
     * 
     * @return
     *     possible object is
     *     {@link BasicTransportSegmentType }
     *     
     */
    public BasicTransportSegmentType getTRANSPORTATIONSEGMENTINFO() {
        return transportationsegmentinfo;
    }

    /**
     * Sets the value of the transportationsegmentinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicTransportSegmentType }
     *     
     */
    public void setTRANSPORTATIONSEGMENTINFO(BasicTransportSegmentType value) {
        this.transportationsegmentinfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}SEGMENT_Type"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="INDICATORS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TRANSFER_STOPOVER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="SIDE_TRIP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "indicators"
    })
    public static class FARESEGMENTINFO
        extends SEGMENTType
        implements Serializable
    {

        @XmlElement(name = "INDICATORS")
        protected TicketSegmentType.FARESEGMENTINFO.INDICATORS indicators;

        /**
         * Gets the value of the indicators property.
         * 
         * @return
         *     possible object is
         *     {@link TicketSegmentType.FARESEGMENTINFO.INDICATORS }
         *     
         */
        public TicketSegmentType.FARESEGMENTINFO.INDICATORS getINDICATORS() {
            return indicators;
        }

        /**
         * Sets the value of the indicators property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketSegmentType.FARESEGMENTINFO.INDICATORS }
         *     
         */
        public void setINDICATORS(TicketSegmentType.FARESEGMENTINFO.INDICATORS value) {
            this.indicators = value;
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
         *         &lt;element name="TRANSFER_STOPOVER" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="SIDE_TRIP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
            "transferstopover",
            "sidetrip"
        })
        public static class INDICATORS
            implements Serializable
        {

            @XmlElement(name = "TRANSFER_STOPOVER")
            protected String transferstopover;
            @XmlElement(name = "SIDE_TRIP")
            protected Boolean sidetrip;

            /**
             * Gets the value of the transferstopover property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTRANSFERSTOPOVER() {
                return transferstopover;
            }

            /**
             * Sets the value of the transferstopover property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTRANSFERSTOPOVER(String value) {
                this.transferstopover = value;
            }

            /**
             * Gets the value of the sidetrip property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSIDETRIP() {
                return sidetrip;
            }

            /**
             * Sets the value of the sidetrip property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSIDETRIP(Boolean value) {
                this.sidetrip = value;
            }

        }

    }

}
