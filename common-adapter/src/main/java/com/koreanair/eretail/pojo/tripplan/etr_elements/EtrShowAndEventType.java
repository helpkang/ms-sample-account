
package com.koreanair.eretail.pojo.tripplan.etr_elements;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrAddressType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrCommonElementsType;
import com.koreanair.eretail.pojo.tripplan.common.common_etr.EtrProviderType;


/**
 * ETR Show and Event.
 * 
 * <p>Java class for etrShowAndEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etrShowAndEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}etrCommonElementsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SERVICE_PROVIDER" type="{}etrProviderType" minOccurs="0"/&gt;
 *         &lt;element name="SEAT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element name="TICKET_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="START" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS" type="{}etrAddressType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="END" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VALIDITY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="START_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *                   &lt;element name="END_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CONFIRMATION" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="DURATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etrShowAndEventType", propOrder = {
    "name",
    "serviceprovider",
    "seatnumber",
    "ticketnumber",
    "start",
    "end",
    "validity",
    "confirmation",
    "duration"
})
public class EtrShowAndEventType
    extends EtrCommonElementsType
    implements Serializable
{

    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "SERVICE_PROVIDER")
    protected EtrProviderType serviceprovider;
    @XmlElement(name = "SEAT_NUMBER")
    protected List<String> seatnumber;
    @XmlElement(name = "TICKET_NUMBER")
    protected String ticketnumber;
    @XmlElement(name = "START")
    protected EtrShowAndEventType.START start;
    @XmlElement(name = "END")
    protected EtrShowAndEventType.END end;
    @XmlElement(name = "VALIDITY")
    protected EtrShowAndEventType.VALIDITY validity;
    @XmlElement(name = "CONFIRMATION")
    protected OutputDateType confirmation;
    @XmlElement(name = "DURATION")
    protected String duration;

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

    /**
     * Gets the value of the serviceprovider property.
     * 
     * @return
     *     possible object is
     *     {@link EtrProviderType }
     *     
     */
    public EtrProviderType getSERVICEPROVIDER() {
        return serviceprovider;
    }

    /**
     * Sets the value of the serviceprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrProviderType }
     *     
     */
    public void setSERVICEPROVIDER(EtrProviderType value) {
        this.serviceprovider = value;
    }

    /**
     * Gets the value of the seatnumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatnumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSEATNUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSEATNUMBER() {
        if (seatnumber == null) {
            seatnumber = new ArrayList<String>();
        }
        return this.seatnumber;
    }

    /**
     * Gets the value of the ticketnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETNUMBER() {
        return ticketnumber;
    }

    /**
     * Sets the value of the ticketnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETNUMBER(String value) {
        this.ticketnumber = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link EtrShowAndEventType.START }
     *     
     */
    public EtrShowAndEventType.START getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrShowAndEventType.START }
     *     
     */
    public void setSTART(EtrShowAndEventType.START value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link EtrShowAndEventType.END }
     *     
     */
    public EtrShowAndEventType.END getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrShowAndEventType.END }
     *     
     */
    public void setEND(EtrShowAndEventType.END value) {
        this.end = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link EtrShowAndEventType.VALIDITY }
     *     
     */
    public EtrShowAndEventType.VALIDITY getVALIDITY() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtrShowAndEventType.VALIDITY }
     *     
     */
    public void setVALIDITY(EtrShowAndEventType.VALIDITY value) {
        this.validity = value;
    }

    /**
     * Gets the value of the confirmation property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getCONFIRMATION() {
        return confirmation;
    }

    /**
     * Sets the value of the confirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setCONFIRMATION(OutputDateType value) {
        this.confirmation = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDURATION() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDURATION(String value) {
        this.duration = value;
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
     *         &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
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
        "datetime"
    })
    public static class END
        implements Serializable
    {

        @XmlElement(name = "DATE_TIME")
        protected OutputDateType datetime;

        /**
         * Gets the value of the datetime property.
         * 
         * @return
         *     possible object is
         *     {@link OutputDateType }
         *     
         */
        public OutputDateType getDATETIME() {
            return datetime;
        }

        /**
         * Sets the value of the datetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link OutputDateType }
         *     
         */
        public void setDATETIME(OutputDateType value) {
            this.datetime = value;
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
     *         &lt;element name="DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS" type="{}etrAddressType" minOccurs="0"/&gt;
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
        "datetime",
        "locationcode",
        "address"
    })
    public static class START
        implements Serializable
    {

        @XmlElement(name = "DATE_TIME")
        protected OutputDateType datetime;
        @XmlElement(name = "LOCATION_CODE")
        protected String locationcode;
        @XmlElement(name = "ADDRESS")
        protected EtrAddressType address;

        /**
         * Gets the value of the datetime property.
         * 
         * @return
         *     possible object is
         *     {@link OutputDateType }
         *     
         */
        public OutputDateType getDATETIME() {
            return datetime;
        }

        /**
         * Sets the value of the datetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link OutputDateType }
         *     
         */
        public void setDATETIME(OutputDateType value) {
            this.datetime = value;
        }

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

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link EtrAddressType }
         *     
         */
        public EtrAddressType getADDRESS() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link EtrAddressType }
         *     
         */
        public void setADDRESS(EtrAddressType value) {
            this.address = value;
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
     *         &lt;element name="START_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
     *         &lt;element name="END_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
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
        "startdate",
        "enddate"
    })
    public static class VALIDITY
        implements Serializable
    {

        @XmlElement(name = "START_DATE")
        protected OutputDateType startdate;
        @XmlElement(name = "END_DATE")
        protected OutputDateType enddate;

        /**
         * Gets the value of the startdate property.
         * 
         * @return
         *     possible object is
         *     {@link OutputDateType }
         *     
         */
        public OutputDateType getSTARTDATE() {
            return startdate;
        }

        /**
         * Sets the value of the startdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link OutputDateType }
         *     
         */
        public void setSTARTDATE(OutputDateType value) {
            this.startdate = value;
        }

        /**
         * Gets the value of the enddate property.
         * 
         * @return
         *     possible object is
         *     {@link OutputDateType }
         *     
         */
        public OutputDateType getENDDATE() {
            return enddate;
        }

        /**
         * Sets the value of the enddate property.
         * 
         * @param value
         *     allowed object is
         *     {@link OutputDateType }
         *     
         */
        public void setENDDATE(OutputDateType value) {
            this.enddate = value;
        }

    }

}
