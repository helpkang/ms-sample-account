
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
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
 *         &lt;element name="AGENCY_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_AGENT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TEXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TEXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PHONE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="PSEUDO" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="QUEUING_OFFICE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="NORMAL_QUEUE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="CATEGORY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FAILURE_QUEUE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="CATEGORY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOUR_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="BRANCH_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="BANK_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="USER_NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_CONTACT_POINT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AGENCY_IATA_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="AGENCY_USER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    "agencyid",
    "bookingagent",
    "officeid",
    "text1",
    "text2",
    "phone",
    "pseudo",
    "queuingoffice",
    "tourcode",
    "accountcode",
    "branchcode",
    "bankcode",
    "username",
    "listcontactpoint",
    "agencyiatanumber",
    "agencyuserid"
})
@XmlRootElement(name = "TRAVEL_AGENCY_INFORMATION")
public class TRAVELAGENCYINFORMATION
    implements Serializable
{

    @XmlElement(name = "AGENCY_ID")
    protected String agencyid;
    @XmlElement(name = "BOOKING_AGENT")
    protected String bookingagent;
    @XmlElement(name = "OFFICE_ID")
    protected String officeid;
    @XmlElement(name = "TEXT1")
    protected String text1;
    @XmlElement(name = "TEXT2")
    protected String text2;
    @XmlElement(name = "PHONE")
    protected String phone;
    @XmlElement(name = "PSEUDO")
    protected String pseudo;
    @XmlElement(name = "QUEUING_OFFICE")
    protected TRAVELAGENCYINFORMATION.QUEUINGOFFICE queuingoffice;
    @XmlElement(name = "TOUR_CODE")
    protected String tourcode;
    @XmlElement(name = "ACCOUNT_CODE")
    protected String accountcode;
    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "BANK_CODE")
    protected String bankcode;
    @XmlElement(name = "USER_NAME")
    protected String username;
    @XmlElement(name = "LIST_CONTACT_POINT")
    protected List<CONTACTPOINTTYPE> listcontactpoint;
    @XmlElement(name = "AGENCY_IATA_NUMBER")
    protected Object agencyiatanumber;
    @XmlElement(name = "AGENCY_USER_ID")
    protected Object agencyuserid;

    /**
     * Gets the value of the agencyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGENCYID() {
        return agencyid;
    }

    /**
     * Sets the value of the agencyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGENCYID(String value) {
        this.agencyid = value;
    }

    /**
     * Gets the value of the bookingagent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKINGAGENT() {
        return bookingagent;
    }

    /**
     * Sets the value of the bookingagent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKINGAGENT(String value) {
        this.bookingagent = value;
    }

    /**
     * Gets the value of the officeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFICEID() {
        return officeid;
    }

    /**
     * Sets the value of the officeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFICEID(String value) {
        this.officeid = value;
    }

    /**
     * Gets the value of the text1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXT1() {
        return text1;
    }

    /**
     * Sets the value of the text1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXT1(String value) {
        this.text1 = value;
    }

    /**
     * Gets the value of the text2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXT2() {
        return text2;
    }

    /**
     * Sets the value of the text2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXT2(String value) {
        this.text2 = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHONE() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHONE(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the pseudo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSEUDO() {
        return pseudo;
    }

    /**
     * Sets the value of the pseudo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSEUDO(String value) {
        this.pseudo = value;
    }

    /**
     * Gets the value of the queuingoffice property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELAGENCYINFORMATION.QUEUINGOFFICE }
     *     
     */
    public TRAVELAGENCYINFORMATION.QUEUINGOFFICE getQUEUINGOFFICE() {
        return queuingoffice;
    }

    /**
     * Sets the value of the queuingoffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELAGENCYINFORMATION.QUEUINGOFFICE }
     *     
     */
    public void setQUEUINGOFFICE(TRAVELAGENCYINFORMATION.QUEUINGOFFICE value) {
        this.queuingoffice = value;
    }

    /**
     * Gets the value of the tourcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOURCODE() {
        return tourcode;
    }

    /**
     * Sets the value of the tourcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOURCODE(String value) {
        this.tourcode = value;
    }

    /**
     * Gets the value of the accountcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTCODE() {
        return accountcode;
    }

    /**
     * Sets the value of the accountcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTCODE(String value) {
        this.accountcode = value;
    }

    /**
     * Gets the value of the branchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHCODE() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHCODE(String value) {
        this.branchcode = value;
    }

    /**
     * Gets the value of the bankcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKCODE() {
        return bankcode;
    }

    /**
     * Sets the value of the bankcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKCODE(String value) {
        this.bankcode = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERNAME() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERNAME(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the listcontactpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcontactpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCONTACTPOINT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONTACTPOINTTYPE }
     * 
     * 
     */
    public List<CONTACTPOINTTYPE> getLISTCONTACTPOINT() {
        if (listcontactpoint == null) {
            listcontactpoint = new ArrayList<CONTACTPOINTTYPE>();
        }
        return this.listcontactpoint;
    }

    /**
     * Gets the value of the agencyiatanumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAGENCYIATANUMBER() {
        return agencyiatanumber;
    }

    /**
     * Sets the value of the agencyiatanumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAGENCYIATANUMBER(Object value) {
        this.agencyiatanumber = value;
    }

    /**
     * Gets the value of the agencyuserid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAGENCYUSERID() {
        return agencyuserid;
    }

    /**
     * Sets the value of the agencyuserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAGENCYUSERID(Object value) {
        this.agencyuserid = value;
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
     *         &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="NORMAL_QUEUE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="CATEGORY" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FAILURE_QUEUE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="CATEGORY" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    public static class QUEUINGOFFICE
        implements Serializable
    {

        @XmlElement(name = "QUEUE_ID")
        protected BigInteger queueid;
        @XmlElement(name = "NORMAL_QUEUE")
        protected TRAVELAGENCYINFORMATION.QUEUINGOFFICE.NORMALQUEUE normalqueue;
        @XmlElement(name = "FAILURE_QUEUE")
        protected TRAVELAGENCYINFORMATION.QUEUINGOFFICE.FAILUREQUEUE failurequeue;

        /**
         * Gets the value of the queueid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQUEUEID() {
            return queueid;
        }

        /**
         * Sets the value of the queueid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQUEUEID(BigInteger value) {
            this.queueid = value;
        }

        /**
         * Gets the value of the normalqueue property.
         * 
         * @return
         *     possible object is
         *     {@link TRAVELAGENCYINFORMATION.QUEUINGOFFICE.NORMALQUEUE }
         *     
         */
        public TRAVELAGENCYINFORMATION.QUEUINGOFFICE.NORMALQUEUE getNORMALQUEUE() {
            return normalqueue;
        }

        /**
         * Sets the value of the normalqueue property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRAVELAGENCYINFORMATION.QUEUINGOFFICE.NORMALQUEUE }
         *     
         */
        public void setNORMALQUEUE(TRAVELAGENCYINFORMATION.QUEUINGOFFICE.NORMALQUEUE value) {
            this.normalqueue = value;
        }

        /**
         * Gets the value of the failurequeue property.
         * 
         * @return
         *     possible object is
         *     {@link TRAVELAGENCYINFORMATION.QUEUINGOFFICE.FAILUREQUEUE }
         *     
         */
        public TRAVELAGENCYINFORMATION.QUEUINGOFFICE.FAILUREQUEUE getFAILUREQUEUE() {
            return failurequeue;
        }

        /**
         * Sets the value of the failurequeue property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRAVELAGENCYINFORMATION.QUEUINGOFFICE.FAILUREQUEUE }
         *     
         */
        public void setFAILUREQUEUE(TRAVELAGENCYINFORMATION.QUEUINGOFFICE.FAILUREQUEUE value) {
            this.failurequeue = value;
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
         *         &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="CATEGORY" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        public static class FAILUREQUEUE
            implements Serializable
        {

            @XmlElement(name = "OFFICE_ID", required = true)
            protected String officeid;
            @XmlElement(name = "NUMBER")
            protected BigInteger number;
            @XmlElement(name = "CATEGORY")
            protected String category;

            /**
             * Gets the value of the officeid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOFFICEID() {
                return officeid;
            }

            /**
             * Sets the value of the officeid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOFFICEID(String value) {
                this.officeid = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMBER() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMBER(BigInteger value) {
                this.number = value;
            }

            /**
             * Gets the value of the category property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCATEGORY() {
                return category;
            }

            /**
             * Sets the value of the category property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCATEGORY(String value) {
                this.category = value;
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
         *         &lt;element name="OFFICE_ID" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="CATEGORY" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        public static class NORMALQUEUE
            implements Serializable
        {

            @XmlElement(name = "OFFICE_ID", required = true)
            protected String officeid;
            @XmlElement(name = "NUMBER")
            protected BigInteger number;
            @XmlElement(name = "CATEGORY")
            protected String category;

            /**
             * Gets the value of the officeid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOFFICEID() {
                return officeid;
            }

            /**
             * Sets the value of the officeid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOFFICEID(String value) {
                this.officeid = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMBER() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMBER(BigInteger value) {
                this.number = value;
            }

            /**
             * Gets the value of the category property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCATEGORY() {
                return category;
            }

            /**
             * Sets the value of the category property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCATEGORY(String value) {
                this.category = value;
            }

        }

    }

}
