
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.FareFamilyType;


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
 *         &lt;element name="LIST_FLIGHT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FLIGHT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="DISPLAY_LAST_SEATS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NUMBER_OF_LAST_SEATS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element ref="{}STATUS" minOccurs="0"/&gt;
 *                   &lt;element name="LSA_DEBUG_INFO" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="APPLIED_LAST_SEAT_RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FIRST_FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_FLIGHT_FACT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ELIGIBLE_OC_RECOMMENDATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="REF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_SEGMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{}SEGMENT_ID"/&gt;
 *                             &lt;element name="LIST_RBD_INFO" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{}RBD"/&gt;
 *                                       &lt;element name="POSTING_LEVEL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                     &lt;/sequence&gt;
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
 *         &lt;element name="FARE_FAMILY" type="{}FareFamilyType" minOccurs="0"/&gt;
 *         &lt;element name="SERVICE_LEVEL_SHORT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SERVICE_LEVEL_CHANGED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "listflight",
    "farefamily",
    "servicelevelshortname",
    "servicelevelchanged"
})
@XmlRootElement(name = "LIST_BOUND")
public class LISTBOUND
    implements Serializable
{

    @XmlElement(name = "LIST_FLIGHT")
    protected List<LISTBOUND.LISTFLIGHT> listflight;
    @XmlElement(name = "FARE_FAMILY")
    protected FareFamilyType farefamily;
    @XmlElement(name = "SERVICE_LEVEL_SHORT_NAME")
    protected String servicelevelshortname;
    @XmlElement(name = "SERVICE_LEVEL_CHANGED")
    protected String servicelevelchanged;

    /**
     * Gets the value of the listflight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listflight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFLIGHT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTBOUND.LISTFLIGHT }
     * 
     * 
     */
    public List<LISTBOUND.LISTFLIGHT> getLISTFLIGHT() {
        if (listflight == null) {
            listflight = new ArrayList<LISTBOUND.LISTFLIGHT>();
        }
        return this.listflight;
    }

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link FareFamilyType }
     *     
     */
    public FareFamilyType getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFamilyType }
     *     
     */
    public void setFAREFAMILY(FareFamilyType value) {
        this.farefamily = value;
    }

    /**
     * Gets the value of the servicelevelshortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICELEVELSHORTNAME() {
        return servicelevelshortname;
    }

    /**
     * Sets the value of the servicelevelshortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICELEVELSHORTNAME(String value) {
        this.servicelevelshortname = value;
    }

    /**
     * Gets the value of the servicelevelchanged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICELEVELCHANGED() {
        return servicelevelchanged;
    }

    /**
     * Sets the value of the servicelevelchanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICELEVELCHANGED(String value) {
        this.servicelevelchanged = value;
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
     *         &lt;element name="FLIGHT_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="DISPLAY_LAST_SEATS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER_OF_LAST_SEATS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element ref="{}STATUS" minOccurs="0"/&gt;
     *         &lt;element name="LSA_DEBUG_INFO" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="APPLIED_LAST_SEAT_RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FIRST_FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_FLIGHT_FACT" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ELIGIBLE_OC_RECOMMENDATION" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="REF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_SEGMENT" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{}SEGMENT_ID"/&gt;
     *                   &lt;element name="LIST_RBD_INFO" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{}RBD"/&gt;
     *                             &lt;element name="POSTING_LEVEL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightid",
        "displaylastseats",
        "numberoflastseats",
        "status",
        "lsadebuginfo",
        "listflightfact",
        "eligibleocrecommendation",
        "listsegment"
    })
    public static class LISTFLIGHT
        implements Serializable
    {

        @XmlElement(name = "FLIGHT_ID", required = true)
        protected BigInteger flightid;
        @XmlElement(name = "DISPLAY_LAST_SEATS")
        protected String displaylastseats;
        @XmlElement(name = "NUMBER_OF_LAST_SEATS")
        protected BigInteger numberoflastseats;
        @XmlElement(name = "STATUS")
        protected String status;
        @XmlElement(name = "LSA_DEBUG_INFO")
        protected LISTBOUND.LISTFLIGHT.LSADEBUGINFO lsadebuginfo;
        @XmlElement(name = "LIST_FLIGHT_FACT")
        protected List<LISTBOUND.LISTFLIGHT.LISTFLIGHTFACT> listflightfact;
        @XmlElement(name = "ELIGIBLE_OC_RECOMMENDATION")
        protected List<LISTBOUND.LISTFLIGHT.ELIGIBLEOCRECOMMENDATION> eligibleocrecommendation;
        @XmlElement(name = "LIST_SEGMENT")
        protected List<LISTBOUND.LISTFLIGHT.LISTSEGMENT> listsegment;

        /**
         * Gets the value of the flightid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFLIGHTID() {
            return flightid;
        }

        /**
         * Sets the value of the flightid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFLIGHTID(BigInteger value) {
            this.flightid = value;
        }

        /**
         * Gets the value of the displaylastseats property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISPLAYLASTSEATS() {
            return displaylastseats;
        }

        /**
         * Sets the value of the displaylastseats property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISPLAYLASTSEATS(String value) {
            this.displaylastseats = value;
        }

        /**
         * Gets the value of the numberoflastseats property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNUMBEROFLASTSEATS() {
            return numberoflastseats;
        }

        /**
         * Sets the value of the numberoflastseats property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNUMBEROFLASTSEATS(BigInteger value) {
            this.numberoflastseats = value;
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

        /**
         * Gets the value of the lsadebuginfo property.
         * 
         * @return
         *     possible object is
         *     {@link LISTBOUND.LISTFLIGHT.LSADEBUGINFO }
         *     
         */
        public LISTBOUND.LISTFLIGHT.LSADEBUGINFO getLSADEBUGINFO() {
            return lsadebuginfo;
        }

        /**
         * Sets the value of the lsadebuginfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTBOUND.LISTFLIGHT.LSADEBUGINFO }
         *     
         */
        public void setLSADEBUGINFO(LISTBOUND.LISTFLIGHT.LSADEBUGINFO value) {
            this.lsadebuginfo = value;
        }

        /**
         * Gets the value of the listflightfact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listflightfact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFLIGHTFACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTBOUND.LISTFLIGHT.LISTFLIGHTFACT }
         * 
         * 
         */
        public List<LISTBOUND.LISTFLIGHT.LISTFLIGHTFACT> getLISTFLIGHTFACT() {
            if (listflightfact == null) {
                listflightfact = new ArrayList<LISTBOUND.LISTFLIGHT.LISTFLIGHTFACT>();
            }
            return this.listflightfact;
        }

        /**
         * Gets the value of the eligibleocrecommendation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eligibleocrecommendation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getELIGIBLEOCRECOMMENDATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTBOUND.LISTFLIGHT.ELIGIBLEOCRECOMMENDATION }
         * 
         * 
         */
        public List<LISTBOUND.LISTFLIGHT.ELIGIBLEOCRECOMMENDATION> getELIGIBLEOCRECOMMENDATION() {
            if (eligibleocrecommendation == null) {
                eligibleocrecommendation = new ArrayList<LISTBOUND.LISTFLIGHT.ELIGIBLEOCRECOMMENDATION>();
            }
            return this.eligibleocrecommendation;
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
         * {@link LISTBOUND.LISTFLIGHT.LISTSEGMENT }
         * 
         * 
         */
        public List<LISTBOUND.LISTFLIGHT.LISTSEGMENT> getLISTSEGMENT() {
            if (listsegment == null) {
                listsegment = new ArrayList<LISTBOUND.LISTFLIGHT.LISTSEGMENT>();
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
         *         &lt;element name="REF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "ref"
        })
        public static class ELIGIBLEOCRECOMMENDATION
            implements Serializable
        {

            @XmlElement(name = "REF", required = true)
            protected String ref;

            /**
             * Gets the value of the ref property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREF() {
                return ref;
            }

            /**
             * Sets the value of the ref property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREF(String value) {
                this.ref = value;
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        public static class LISTFLIGHTFACT
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
         *         &lt;element ref="{}SEGMENT_ID"/&gt;
         *         &lt;element name="LIST_RBD_INFO" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{}RBD"/&gt;
         *                   &lt;element name="POSTING_LEVEL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            "segmentid",
            "listrbdinfo"
        })
        public static class LISTSEGMENT
            implements Serializable
        {

            @XmlElement(name = "SEGMENT_ID", required = true)
            protected BigInteger segmentid;
            @XmlElement(name = "LIST_RBD_INFO", required = true)
            protected List<LISTBOUND.LISTFLIGHT.LISTSEGMENT.LISTRBDINFO> listrbdinfo;

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
             * Gets the value of the listrbdinfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listrbdinfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTRBDINFO().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LISTBOUND.LISTFLIGHT.LISTSEGMENT.LISTRBDINFO }
             * 
             * 
             */
            public List<LISTBOUND.LISTFLIGHT.LISTSEGMENT.LISTRBDINFO> getLISTRBDINFO() {
                if (listrbdinfo == null) {
                    listrbdinfo = new ArrayList<LISTBOUND.LISTFLIGHT.LISTSEGMENT.LISTRBDINFO>();
                }
                return this.listrbdinfo;
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
             *         &lt;element ref="{}RBD"/&gt;
             *         &lt;element name="POSTING_LEVEL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
                "rbd",
                "postinglevel"
            })
            public static class LISTRBDINFO
                implements Serializable
            {

                @XmlElement(name = "RBD", required = true)
                protected String rbd;
                @XmlElement(name = "POSTING_LEVEL", required = true)
                protected Object postinglevel;

                /**
                 * Gets the value of the rbd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRBD() {
                    return rbd;
                }

                /**
                 * Sets the value of the rbd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRBD(String value) {
                    this.rbd = value;
                }

                /**
                 * Gets the value of the postinglevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getPOSTINGLEVEL() {
                    return postinglevel;
                }

                /**
                 * Sets the value of the postinglevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setPOSTINGLEVEL(Object value) {
                    this.postinglevel = value;
                }

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
         *         &lt;element name="APPLIED_LAST_SEAT_RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FIRST_FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "appliedlastseatrule",
            "firstflightnumber",
            "rbd"
        })
        public static class LSADEBUGINFO
            implements Serializable
        {

            @XmlElement(name = "APPLIED_LAST_SEAT_RULE")
            protected String appliedlastseatrule;
            @XmlElement(name = "FIRST_FLIGHT_NUMBER")
            protected Object firstflightnumber;
            @XmlElement(name = "RBD")
            protected Object rbd;

            /**
             * Gets the value of the appliedlastseatrule property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAPPLIEDLASTSEATRULE() {
                return appliedlastseatrule;
            }

            /**
             * Sets the value of the appliedlastseatrule property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAPPLIEDLASTSEATRULE(String value) {
                this.appliedlastseatrule = value;
            }

            /**
             * Gets the value of the firstflightnumber property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getFIRSTFLIGHTNUMBER() {
                return firstflightnumber;
            }

            /**
             * Sets the value of the firstflightnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setFIRSTFLIGHTNUMBER(Object value) {
                this.firstflightnumber = value;
            }

            /**
             * Gets the value of the rbd property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getRBD() {
                return rbd;
            }

            /**
             * Sets the value of the rbd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setRBD(Object value) {
                this.rbd = value;
            }

        }

    }

}
