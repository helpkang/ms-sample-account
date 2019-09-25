
package com.koreanair.external.eretail.vo.tripplan.ancillary_services;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LIST_TRIP_PRICE" type="{}servicePriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SERVICE" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{}specialServiceOutputGroup"/&gt;
 *                   &lt;element name="STATUS"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                         &lt;enumeration value="3"/&gt;
 *                         &lt;enumeration value="4"/&gt;
 *                         &lt;enumeration value="11"/&gt;
 *                         &lt;enumeration value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="QUOTA_BASED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="ELIGIBLE_TO_CARRYOVER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_SSR_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_MISC_DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TICKET_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "type",
    "listtripprice",
    "listservice"
})
@XmlRootElement(name = "ANCILLARY_SERVICES")
public class ANCILLARYSERVICES
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "LIST_TRIP_PRICE")
    protected List<ServicePriceType> listtripprice;
    @XmlElement(name = "LIST_SERVICE", required = true)
    protected List<ANCILLARYSERVICES.LISTSERVICE> listservice;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the listtripprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtripprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRIPPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePriceType }
     * 
     * 
     */
    public List<ServicePriceType> getLISTTRIPPRICE() {
        if (listtripprice == null) {
            listtripprice = new ArrayList<ServicePriceType>();
        }
        return this.listtripprice;
    }

    /**
     * Gets the value of the listservice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ANCILLARYSERVICES.LISTSERVICE }
     * 
     * 
     */
    public List<ANCILLARYSERVICES.LISTSERVICE> getLISTSERVICE() {
        if (listservice == null) {
            listservice = new ArrayList<ANCILLARYSERVICES.LISTSERVICE>();
        }
        return this.listservice;
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
     *         &lt;group ref="{}specialServiceOutputGroup"/&gt;
     *         &lt;element name="STATUS"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="2"/&gt;
     *               &lt;enumeration value="3"/&gt;
     *               &lt;enumeration value="4"/&gt;
     *               &lt;enumeration value="11"/&gt;
     *               &lt;enumeration value="12"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="QUOTA_BASED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="ELIGIBLE_TO_CARRYOVER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_SSR_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_MISC_DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TICKET_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "serviceid",
        "servicecode",
        "travellerid",
        "listparameter",
        "rfic",
        "rfisc",
        "bookingmethod",
        "servicename",
        "servicedescription",
        "associationid",
        "listsegmentid",
        "listserviceelementid",
        "listserviceprice",
        "chargeable",
        "travellerassociated",
        "displayedby",
        "ptcrequested",
        "ptcapplied",
        "error",
        "listavailableparameter",
        "status",
        "quotabased",
        "eligibletocarryover",
        "listssrid",
        "listmiscdocumentnumber",
        "listticketnumber"
    })
    public static class LISTSERVICE
        implements Serializable
    {

        @XmlElement(name = "SERVICE_ID", required = true)
        protected BigInteger serviceid;
        @XmlElement(name = "SERVICE_CODE", required = true)
        protected String servicecode;
        @XmlElement(name = "TRAVELLER_ID")
        protected BigInteger travellerid;
        @XmlElement(name = "LIST_PARAMETER")
        protected List<ANCILLARYSERVICES.LISTSERVICE.LISTPARAMETER> listparameter;
        @XmlElement(name = "RFIC")
        protected String rfic;
        @XmlElement(name = "RFISC")
        protected String rfisc;
        @XmlElement(name = "BOOKING_METHOD")
        protected String bookingmethod;
        @XmlElement(name = "SERVICE_NAME")
        protected Object servicename;
        @XmlElement(name = "SERVICE_DESCRIPTION")
        protected String servicedescription;
        @XmlElement(name = "ASSOCIATION_ID")
        protected BigInteger associationid;
        @XmlElement(name = "LIST_SEGMENT_ID")
        protected List<BigInteger> listsegmentid;
        @XmlElement(name = "LIST_SERVICE_ELEMENT_ID")
        protected List<BigInteger> listserviceelementid;
        @XmlElement(name = "LIST_SERVICE_PRICE")
        protected List<ServicePriceType> listserviceprice;
        @XmlElement(name = "CHARGEABLE")
        protected boolean chargeable;
        @XmlElement(name = "TRAVELLER_ASSOCIATED")
        protected boolean travellerassociated;
        @XmlElement(name = "DISPLAYED_BY")
        protected String displayedby;
        @XmlElement(name = "PTC_REQUESTED")
        protected String ptcrequested;
        @XmlElement(name = "PTC_APPLIED")
        protected String ptcapplied;
        @XmlElement(name = "ERROR")
        protected ANCILLARYSERVICES.LISTSERVICE.ERROR error;
        @XmlElement(name = "LIST_AVAILABLE_PARAMETER")
        protected List<ANCILLARYSERVICES.LISTSERVICE.LISTAVAILABLEPARAMETER> listavailableparameter;
        @XmlElement(name = "STATUS", required = true)
        protected BigInteger status;
        @XmlElement(name = "QUOTA_BASED")
        protected Object quotabased;
        @XmlElement(name = "ELIGIBLE_TO_CARRYOVER")
        protected Object eligibletocarryover;
        @XmlElement(name = "LIST_SSR_ID")
        protected List<Object> listssrid;
        @XmlElement(name = "LIST_MISC_DOCUMENT_NUMBER")
        protected List<Object> listmiscdocumentnumber;
        @XmlElement(name = "LIST_TICKET_NUMBER")
        protected List<Object> listticketnumber;

        /**
         * Gets the value of the serviceid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSERVICEID() {
            return serviceid;
        }

        /**
         * Sets the value of the serviceid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSERVICEID(BigInteger value) {
            this.serviceid = value;
        }

        /**
         * Gets the value of the servicecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSERVICECODE() {
            return servicecode;
        }

        /**
         * Sets the value of the servicecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSERVICECODE(String value) {
            this.servicecode = value;
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
         * Gets the value of the listparameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listparameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPARAMETER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ANCILLARYSERVICES.LISTSERVICE.LISTPARAMETER }
         * 
         * 
         */
        public List<ANCILLARYSERVICES.LISTSERVICE.LISTPARAMETER> getLISTPARAMETER() {
            if (listparameter == null) {
                listparameter = new ArrayList<ANCILLARYSERVICES.LISTSERVICE.LISTPARAMETER>();
            }
            return this.listparameter;
        }

        /**
         * Gets the value of the rfic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRFIC() {
            return rfic;
        }

        /**
         * Sets the value of the rfic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRFIC(String value) {
            this.rfic = value;
        }

        /**
         * Gets the value of the rfisc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRFISC() {
            return rfisc;
        }

        /**
         * Sets the value of the rfisc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRFISC(String value) {
            this.rfisc = value;
        }

        /**
         * Gets the value of the bookingmethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOOKINGMETHOD() {
            return bookingmethod;
        }

        /**
         * Sets the value of the bookingmethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOOKINGMETHOD(String value) {
            this.bookingmethod = value;
        }

        /**
         * Gets the value of the servicename property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSERVICENAME() {
            return servicename;
        }

        /**
         * Sets the value of the servicename property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSERVICENAME(Object value) {
            this.servicename = value;
        }

        /**
         * Gets the value of the servicedescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSERVICEDESCRIPTION() {
            return servicedescription;
        }

        /**
         * Sets the value of the servicedescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSERVICEDESCRIPTION(String value) {
            this.servicedescription = value;
        }

        /**
         * Gets the value of the associationid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getASSOCIATIONID() {
            return associationid;
        }

        /**
         * Sets the value of the associationid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setASSOCIATIONID(BigInteger value) {
            this.associationid = value;
        }

        /**
         * Gets the value of the listsegmentid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listsegmentid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSEGMENTID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getLISTSEGMENTID() {
            if (listsegmentid == null) {
                listsegmentid = new ArrayList<BigInteger>();
            }
            return this.listsegmentid;
        }

        /**
         * Gets the value of the listserviceelementid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listserviceelementid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSERVICEELEMENTID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getLISTSERVICEELEMENTID() {
            if (listserviceelementid == null) {
                listserviceelementid = new ArrayList<BigInteger>();
            }
            return this.listserviceelementid;
        }

        /**
         * Gets the value of the listserviceprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listserviceprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSERVICEPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServicePriceType }
         * 
         * 
         */
        public List<ServicePriceType> getLISTSERVICEPRICE() {
            if (listserviceprice == null) {
                listserviceprice = new ArrayList<ServicePriceType>();
            }
            return this.listserviceprice;
        }

        /**
         * Gets the value of the chargeable property.
         * 
         */
        public boolean isCHARGEABLE() {
            return chargeable;
        }

        /**
         * Sets the value of the chargeable property.
         * 
         */
        public void setCHARGEABLE(boolean value) {
            this.chargeable = value;
        }

        /**
         * Gets the value of the travellerassociated property.
         * 
         */
        public boolean isTRAVELLERASSOCIATED() {
            return travellerassociated;
        }

        /**
         * Sets the value of the travellerassociated property.
         * 
         */
        public void setTRAVELLERASSOCIATED(boolean value) {
            this.travellerassociated = value;
        }

        /**
         * Gets the value of the displayedby property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISPLAYEDBY() {
            return displayedby;
        }

        /**
         * Sets the value of the displayedby property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISPLAYEDBY(String value) {
            this.displayedby = value;
        }

        /**
         * Gets the value of the ptcrequested property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPTCREQUESTED() {
            return ptcrequested;
        }

        /**
         * Sets the value of the ptcrequested property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPTCREQUESTED(String value) {
            this.ptcrequested = value;
        }

        /**
         * Gets the value of the ptcapplied property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPTCAPPLIED() {
            return ptcapplied;
        }

        /**
         * Sets the value of the ptcapplied property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPTCAPPLIED(String value) {
            this.ptcapplied = value;
        }

        /**
         * Gets the value of the error property.
         * 
         * @return
         *     possible object is
         *     {@link ANCILLARYSERVICES.LISTSERVICE.ERROR }
         *     
         */
        public ANCILLARYSERVICES.LISTSERVICE.ERROR getERROR() {
            return error;
        }

        /**
         * Sets the value of the error property.
         * 
         * @param value
         *     allowed object is
         *     {@link ANCILLARYSERVICES.LISTSERVICE.ERROR }
         *     
         */
        public void setERROR(ANCILLARYSERVICES.LISTSERVICE.ERROR value) {
            this.error = value;
        }

        /**
         * Gets the value of the listavailableparameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listavailableparameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTAVAILABLEPARAMETER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ANCILLARYSERVICES.LISTSERVICE.LISTAVAILABLEPARAMETER }
         * 
         * 
         */
        public List<ANCILLARYSERVICES.LISTSERVICE.LISTAVAILABLEPARAMETER> getLISTAVAILABLEPARAMETER() {
            if (listavailableparameter == null) {
                listavailableparameter = new ArrayList<ANCILLARYSERVICES.LISTSERVICE.LISTAVAILABLEPARAMETER>();
            }
            return this.listavailableparameter;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSTATUS(BigInteger value) {
            this.status = value;
        }

        /**
         * Gets the value of the quotabased property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getQUOTABASED() {
            return quotabased;
        }

        /**
         * Sets the value of the quotabased property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setQUOTABASED(Object value) {
            this.quotabased = value;
        }

        /**
         * Gets the value of the eligibletocarryover property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getELIGIBLETOCARRYOVER() {
            return eligibletocarryover;
        }

        /**
         * Sets the value of the eligibletocarryover property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setELIGIBLETOCARRYOVER(Object value) {
            this.eligibletocarryover = value;
        }

        /**
         * Gets the value of the listssrid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listssrid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSSRID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getLISTSSRID() {
            if (listssrid == null) {
                listssrid = new ArrayList<Object>();
            }
            return this.listssrid;
        }

        /**
         * Gets the value of the listmiscdocumentnumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listmiscdocumentnumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTMISCDOCUMENTNUMBER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getLISTMISCDOCUMENTNUMBER() {
            if (listmiscdocumentnumber == null) {
                listmiscdocumentnumber = new ArrayList<Object>();
            }
            return this.listmiscdocumentnumber;
        }

        /**
         * Gets the value of the listticketnumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listticketnumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTICKETNUMBER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getLISTTICKETNUMBER() {
            if (listticketnumber == null) {
                listticketnumber = new ArrayList<Object>();
            }
            return this.listticketnumber;
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
         *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="MESSAGE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "number",
            "message"
        })
        public static class ERROR
            implements Serializable
        {

            @XmlElement(name = "NUMBER", required = true)
            protected BigInteger number;
            @XmlElement(name = "MESSAGE")
            protected String message;

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
             * Gets the value of the message property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMESSAGE() {
                return message;
            }

            /**
             * Sets the value of the message property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMESSAGE(String value) {
                this.message = value;
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
         *         &lt;element name="TYPE" type="{}serviceParameterType"/&gt;
         *         &lt;element name="MANDATORY" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="MIN_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *           &lt;element name="MAX_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *           &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *           &lt;element name="POSSIBLE_VALUES" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;/sequence&gt;
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
            "mandatory",
            "minvalue",
            "maxvalue",
            "unit",
            "possiblevalues"
        })
        public static class LISTAVAILABLEPARAMETER
            implements Serializable
        {

            @XmlElement(name = "TYPE", required = true)
            @XmlSchemaType(name = "string")
            protected ServiceParameterType type;
            @XmlElement(name = "MANDATORY")
            protected boolean mandatory;
            @XmlElement(name = "MIN_VALUE")
            protected Object minvalue;
            @XmlElement(name = "MAX_VALUE")
            protected Object maxvalue;
            @XmlElement(name = "UNIT")
            protected Object unit;
            @XmlElement(name = "POSSIBLE_VALUES")
            protected List<Object> possiblevalues;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceParameterType }
             *     
             */
            public ServiceParameterType getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceParameterType }
             *     
             */
            public void setTYPE(ServiceParameterType value) {
                this.type = value;
            }

            /**
             * Gets the value of the mandatory property.
             * 
             */
            public boolean isMANDATORY() {
                return mandatory;
            }

            /**
             * Sets the value of the mandatory property.
             * 
             */
            public void setMANDATORY(boolean value) {
                this.mandatory = value;
            }

            /**
             * Gets the value of the minvalue property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getMINVALUE() {
                return minvalue;
            }

            /**
             * Sets the value of the minvalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setMINVALUE(Object value) {
                this.minvalue = value;
            }

            /**
             * Gets the value of the maxvalue property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getMAXVALUE() {
                return maxvalue;
            }

            /**
             * Sets the value of the maxvalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setMAXVALUE(Object value) {
                this.maxvalue = value;
            }

            /**
             * Gets the value of the unit property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getUNIT() {
                return unit;
            }

            /**
             * Sets the value of the unit property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setUNIT(Object value) {
                this.unit = value;
            }

            /**
             * Gets the value of the possiblevalues property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the possiblevalues property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPOSSIBLEVALUES().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getPOSSIBLEVALUES() {
                if (possiblevalues == null) {
                    possiblevalues = new ArrayList<Object>();
                }
                return this.possiblevalues;
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
         *       &lt;group ref="{}SpecialServiceParameterGroup" minOccurs="0"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "value",
            "unit",
            "intvalue",
            "listvalue"
        })
        public static class LISTPARAMETER
            implements Serializable
        {

            @XmlElement(name = "CODE")
            protected String code;
            @XmlElement(name = "VALUE")
            protected Object value;
            @XmlElement(name = "UNIT")
            protected Object unit;
            @XmlElement(name = "INT_VALUE")
            protected BigInteger intvalue;
            @XmlElement(name = "LIST_VALUE")
            protected List<String> listvalue;

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
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getVALUE() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setVALUE(Object value) {
                this.value = value;
            }

            /**
             * Gets the value of the unit property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getUNIT() {
                return unit;
            }

            /**
             * Sets the value of the unit property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setUNIT(Object value) {
                this.unit = value;
            }

            /**
             * Gets the value of the intvalue property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getINTVALUE() {
                return intvalue;
            }

            /**
             * Sets the value of the intvalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setINTVALUE(BigInteger value) {
                this.intvalue = value;
            }

            /**
             * Gets the value of the listvalue property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listvalue property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTVALUE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getLISTVALUE() {
                if (listvalue == null) {
                    listvalue = new ArrayList<String>();
                }
                return this.listvalue;
            }

        }

    }

}
