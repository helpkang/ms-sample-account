
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REDEMPTION_INFO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDEMPTION_INFO_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TRAVELLER" maxOccurs="9"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}FIRST_NAME"/&gt;
 *                   &lt;element ref="{}LAST_NAME"/&gt;
 *                   &lt;element ref="{}TITLE" minOccurs="0"/&gt;
 *                   &lt;element name="TRAVELLER_TYPE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{}TRAVELLER_ID"/&gt;
 *                   &lt;element name="INFANT" type="{}INFANT_Type" minOccurs="0"/&gt;
 *                   &lt;element ref="{}IS_PRIMARY_TRAVELLER" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_REDEMPTION" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REDEMPTION"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TYPE"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SUBTYPE"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
 *                   &lt;element name="LIST_TRAVELLER_TYPE" type="{}REDEMPTION_LIST_TRAVELLER_TYPE" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="TRIP_PRICE" type="{}BOOKED_PRICE_Type"/&gt;
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
@XmlType(name = "REDEMPTION_INFO_Type", propOrder = {
    "listtraveller",
    "listredemption"
})
public class REDEMPTIONINFOType
    implements Serializable
{

    @XmlElement(name = "LIST_TRAVELLER", required = true)
    protected List<REDEMPTIONINFOType.LISTTRAVELLER> listtraveller;
    @XmlElement(name = "LIST_REDEMPTION", required = true)
    protected List<REDEMPTIONINFOType.LISTREDEMPTION> listredemption;

    /**
     * Gets the value of the listtraveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtraveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REDEMPTIONINFOType.LISTTRAVELLER }
     * 
     * 
     */
    public List<REDEMPTIONINFOType.LISTTRAVELLER> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<REDEMPTIONINFOType.LISTTRAVELLER>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the listredemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listredemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREDEMPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REDEMPTIONINFOType.LISTREDEMPTION }
     * 
     * 
     */
    public List<REDEMPTIONINFOType.LISTREDEMPTION> getLISTREDEMPTION() {
        if (listredemption == null) {
            listredemption = new ArrayList<REDEMPTIONINFOType.LISTREDEMPTION>();
        }
        return this.listredemption;
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
     *         &lt;element name="REDEMPTION"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SUBTYPE"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
     *         &lt;element name="LIST_TRAVELLER_TYPE" type="{}REDEMPTION_LIST_TRAVELLER_TYPE" maxOccurs="unbounded"/&gt;
     *         &lt;element name="TRIP_PRICE" type="{}BOOKED_PRICE_Type"/&gt;
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
        "redemption",
        "listtravellertype",
        "tripprice"
    })
    public static class LISTREDEMPTION
        implements Serializable
    {

        @XmlElement(name = "REDEMPTION", required = true)
        protected REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION redemption;
        @XmlElement(name = "LIST_TRAVELLER_TYPE", required = true)
        protected List<REDEMPTIONLISTTRAVELLERTYPE> listtravellertype;
        @XmlElement(name = "TRIP_PRICE", required = true)
        protected BOOKEDPRICEType tripprice;

        /**
         * Gets the value of the redemption property.
         * 
         * @return
         *     possible object is
         *     {@link REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION }
         *     
         */
        public REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION getREDEMPTION() {
            return redemption;
        }

        /**
         * Sets the value of the redemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION }
         *     
         */
        public void setREDEMPTION(REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION value) {
            this.redemption = value;
        }

        /**
         * Gets the value of the listtravellertype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtravellertype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRAVELLERTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link REDEMPTIONLISTTRAVELLERTYPE }
         * 
         * 
         */
        public List<REDEMPTIONLISTTRAVELLERTYPE> getLISTTRAVELLERTYPE() {
            if (listtravellertype == null) {
                listtravellertype = new ArrayList<REDEMPTIONLISTTRAVELLERTYPE>();
            }
            return this.listtravellertype;
        }

        /**
         * Gets the value of the tripprice property.
         * 
         * @return
         *     possible object is
         *     {@link BOOKEDPRICEType }
         *     
         */
        public BOOKEDPRICEType getTRIPPRICE() {
            return tripprice;
        }

        /**
         * Sets the value of the tripprice property.
         * 
         * @param value
         *     allowed object is
         *     {@link BOOKEDPRICEType }
         *     
         */
        public void setTRIPPRICE(BOOKEDPRICEType value) {
            this.tripprice = value;
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
         *         &lt;element name="TYPE"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SUBTYPE"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
            "type",
            "subtype"
        })
        public static class REDEMPTION
            implements Serializable
        {

            @XmlElement(name = "TYPE", required = true)
            protected REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.TYPE type;
            @XmlElement(name = "SUBTYPE", required = true)
            protected REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.SUBTYPE subtype;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.TYPE }
             *     
             */
            public REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.TYPE getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.TYPE }
             *     
             */
            public void setTYPE(REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.TYPE value) {
                this.type = value;
            }

            /**
             * Gets the value of the subtype property.
             * 
             * @return
             *     possible object is
             *     {@link REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.SUBTYPE }
             *     
             */
            public REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.SUBTYPE getSUBTYPE() {
                return subtype;
            }

            /**
             * Sets the value of the subtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.SUBTYPE }
             *     
             */
            public void setSUBTYPE(REDEMPTIONINFOType.LISTREDEMPTION.REDEMPTION.SUBTYPE value) {
                this.subtype = value;
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
             *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
            public static class SUBTYPE
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
             *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
            public static class TYPE
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
     *         &lt;element ref="{}FIRST_NAME"/&gt;
     *         &lt;element ref="{}LAST_NAME"/&gt;
     *         &lt;element ref="{}TITLE" minOccurs="0"/&gt;
     *         &lt;element name="TRAVELLER_TYPE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{}TRAVELLER_ID"/&gt;
     *         &lt;element name="INFANT" type="{}INFANT_Type" minOccurs="0"/&gt;
     *         &lt;element ref="{}IS_PRIMARY_TRAVELLER" minOccurs="0"/&gt;
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
        "firstname",
        "lastname",
        "title",
        "travellertype",
        "travellerid",
        "infant",
        "isprimarytraveller"
    })
    public static class LISTTRAVELLER
        implements Serializable
    {

        @XmlElement(name = "FIRST_NAME", required = true)
        protected String firstname;
        @XmlElement(name = "LAST_NAME", required = true)
        protected String lastname;
        @XmlElement(name = "TITLE")
        protected String title;
        @XmlElement(name = "TRAVELLER_TYPE", required = true)
        protected REDEMPTIONINFOType.LISTTRAVELLER.TRAVELLERTYPE travellertype;
        @XmlElement(name = "TRAVELLER_ID", required = true)
        protected BigInteger travellerid;
        @XmlElement(name = "INFANT")
        protected INFANTType infant;
        @XmlElement(name = "IS_PRIMARY_TRAVELLER")
        protected Boolean isprimarytraveller;

        /**
         * Gets the value of the firstname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIRSTNAME() {
            return firstname;
        }

        /**
         * Sets the value of the firstname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIRSTNAME(String value) {
            this.firstname = value;
        }

        /**
         * Gets the value of the lastname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLASTNAME() {
            return lastname;
        }

        /**
         * Sets the value of the lastname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLASTNAME(String value) {
            this.lastname = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTITLE() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTITLE(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the travellertype property.
         * 
         * @return
         *     possible object is
         *     {@link REDEMPTIONINFOType.LISTTRAVELLER.TRAVELLERTYPE }
         *     
         */
        public REDEMPTIONINFOType.LISTTRAVELLER.TRAVELLERTYPE getTRAVELLERTYPE() {
            return travellertype;
        }

        /**
         * Sets the value of the travellertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link REDEMPTIONINFOType.LISTTRAVELLER.TRAVELLERTYPE }
         *     
         */
        public void setTRAVELLERTYPE(REDEMPTIONINFOType.LISTTRAVELLER.TRAVELLERTYPE value) {
            this.travellertype = value;
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
         * Gets the value of the infant property.
         * 
         * @return
         *     possible object is
         *     {@link INFANTType }
         *     
         */
        public INFANTType getINFANT() {
            return infant;
        }

        /**
         * Sets the value of the infant property.
         * 
         * @param value
         *     allowed object is
         *     {@link INFANTType }
         *     
         */
        public void setINFANT(INFANTType value) {
            this.infant = value;
        }

        /**
         * Gets the value of the isprimarytraveller property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISPRIMARYTRAVELLER() {
            return isprimarytraveller;
        }

        /**
         * Sets the value of the isprimarytraveller property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISPRIMARYTRAVELLER(Boolean value) {
            this.isprimarytraveller = value;
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
         *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
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
        public static class TRAVELLERTYPE
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
