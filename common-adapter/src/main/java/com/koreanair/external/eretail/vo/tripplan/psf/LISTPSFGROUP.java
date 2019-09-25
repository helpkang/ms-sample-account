
package com.koreanair.external.eretail.vo.tripplan.psf;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="CONFIGURATION_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="INSTANCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="STATUS" type="{}STATUS_ENUM" minOccurs="0"/&gt;
 *         &lt;element name="PASSENGER_ASSOCIATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="PASSENGER_ID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEGMENT_ASSOCIATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="AIRLINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_ITEM" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="CONFIGURATION_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="INSTANCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="CS_ORDER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="STATUS" type="{}STATUS_ENUM" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_PARAMETER" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence minOccurs="0"&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TYPE" type="{}ITEM_TYPE_ENUM" minOccurs="0"/&gt;
 *                   &lt;element name="ADDITIONAL_INFO" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence minOccurs="0"&gt;
 *                             &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NUMBER_IN_PARTY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="DATE" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_BOOKABLE_ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IS_PACK" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "configurationid",
    "instancenumber",
    "status",
    "passengerassociation",
    "segmentassociation",
    "listitem",
    "ispack"
})
@XmlRootElement(name = "LIST_PSF_GROUP")
public class LISTPSFGROUP
    implements Serializable
{

    @XmlElement(name = "CONFIGURATION_ID")
    protected String configurationid;
    @XmlElement(name = "INSTANCE_NUMBER")
    protected Integer instancenumber;
    @XmlElement(name = "STATUS")
    @XmlSchemaType(name = "string")
    protected STATUSENUM status;
    @XmlElement(name = "PASSENGER_ASSOCIATION")
    protected LISTPSFGROUP.PASSENGERASSOCIATION passengerassociation;
    @XmlElement(name = "SEGMENT_ASSOCIATION")
    protected LISTPSFGROUP.SEGMENTASSOCIATION segmentassociation;
    @XmlElement(name = "LIST_ITEM")
    protected List<LISTPSFGROUP.LISTITEM> listitem;
    @XmlElement(name = "IS_PACK")
    protected Boolean ispack;

    /**
     * Gets the value of the configurationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIGURATIONID() {
        return configurationid;
    }

    /**
     * Sets the value of the configurationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIGURATIONID(String value) {
        this.configurationid = value;
    }

    /**
     * Gets the value of the instancenumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getINSTANCENUMBER() {
        return instancenumber;
    }

    /**
     * Sets the value of the instancenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setINSTANCENUMBER(Integer value) {
        this.instancenumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link STATUSENUM }
     *     
     */
    public STATUSENUM getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUSENUM }
     *     
     */
    public void setSTATUS(STATUSENUM value) {
        this.status = value;
    }

    /**
     * Gets the value of the passengerassociation property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPSFGROUP.PASSENGERASSOCIATION }
     *     
     */
    public LISTPSFGROUP.PASSENGERASSOCIATION getPASSENGERASSOCIATION() {
        return passengerassociation;
    }

    /**
     * Sets the value of the passengerassociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPSFGROUP.PASSENGERASSOCIATION }
     *     
     */
    public void setPASSENGERASSOCIATION(LISTPSFGROUP.PASSENGERASSOCIATION value) {
        this.passengerassociation = value;
    }

    /**
     * Gets the value of the segmentassociation property.
     * 
     * @return
     *     possible object is
     *     {@link LISTPSFGROUP.SEGMENTASSOCIATION }
     *     
     */
    public LISTPSFGROUP.SEGMENTASSOCIATION getSEGMENTASSOCIATION() {
        return segmentassociation;
    }

    /**
     * Sets the value of the segmentassociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTPSFGROUP.SEGMENTASSOCIATION }
     *     
     */
    public void setSEGMENTASSOCIATION(LISTPSFGROUP.SEGMENTASSOCIATION value) {
        this.segmentassociation = value;
    }

    /**
     * Gets the value of the listitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPSFGROUP.LISTITEM }
     * 
     * 
     */
    public List<LISTPSFGROUP.LISTITEM> getLISTITEM() {
        if (listitem == null) {
            listitem = new ArrayList<LISTPSFGROUP.LISTITEM>();
        }
        return this.listitem;
    }

    /**
     * Gets the value of the ispack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPACK() {
        return ispack;
    }

    /**
     * Sets the value of the ispack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPACK(Boolean value) {
        this.ispack = value;
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
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="CONFIGURATION_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="INSTANCE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="CS_ORDER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="STATUS" type="{}STATUS_ENUM" minOccurs="0"/&gt;
     *         &lt;element name="LIST_PARAMETER" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence minOccurs="0"&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TYPE" type="{}ITEM_TYPE_ENUM" minOccurs="0"/&gt;
     *         &lt;element name="ADDITIONAL_INFO" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence minOccurs="0"&gt;
     *                   &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NUMBER_IN_PARTY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="DATE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_BOOKABLE_ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "configurationid",
        "instancenumber",
        "csorder",
        "status",
        "listparameter",
        "type",
        "additionalinfo",
        "listbookableid"
    })
    public static class LISTITEM
        implements Serializable
    {

        @XmlElement(name = "CONFIGURATION_ID")
        protected String configurationid;
        @XmlElement(name = "INSTANCE_NUMBER")
        protected Integer instancenumber;
        @XmlElement(name = "CS_ORDER")
        protected Integer csorder;
        @XmlElement(name = "STATUS")
        @XmlSchemaType(name = "string")
        protected STATUSENUM status;
        @XmlElement(name = "LIST_PARAMETER")
        protected List<LISTPSFGROUP.LISTITEM.LISTPARAMETER> listparameter;
        @XmlElement(name = "TYPE")
        @XmlSchemaType(name = "string")
        protected ITEMTYPEENUM type;
        @XmlElement(name = "ADDITIONAL_INFO")
        protected LISTPSFGROUP.LISTITEM.ADDITIONALINFO additionalinfo;
        @XmlElement(name = "LIST_BOOKABLE_ID")
        protected List<String> listbookableid;

        /**
         * Gets the value of the configurationid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONFIGURATIONID() {
            return configurationid;
        }

        /**
         * Sets the value of the configurationid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONFIGURATIONID(String value) {
            this.configurationid = value;
        }

        /**
         * Gets the value of the instancenumber property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getINSTANCENUMBER() {
            return instancenumber;
        }

        /**
         * Sets the value of the instancenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setINSTANCENUMBER(Integer value) {
            this.instancenumber = value;
        }

        /**
         * Gets the value of the csorder property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCSORDER() {
            return csorder;
        }

        /**
         * Sets the value of the csorder property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCSORDER(Integer value) {
            this.csorder = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link STATUSENUM }
         *     
         */
        public STATUSENUM getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link STATUSENUM }
         *     
         */
        public void setSTATUS(STATUSENUM value) {
            this.status = value;
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
         * {@link LISTPSFGROUP.LISTITEM.LISTPARAMETER }
         * 
         * 
         */
        public List<LISTPSFGROUP.LISTITEM.LISTPARAMETER> getLISTPARAMETER() {
            if (listparameter == null) {
                listparameter = new ArrayList<LISTPSFGROUP.LISTITEM.LISTPARAMETER>();
            }
            return this.listparameter;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link ITEMTYPEENUM }
         *     
         */
        public ITEMTYPEENUM getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link ITEMTYPEENUM }
         *     
         */
        public void setTYPE(ITEMTYPEENUM value) {
            this.type = value;
        }

        /**
         * Gets the value of the additionalinfo property.
         * 
         * @return
         *     possible object is
         *     {@link LISTPSFGROUP.LISTITEM.ADDITIONALINFO }
         *     
         */
        public LISTPSFGROUP.LISTITEM.ADDITIONALINFO getADDITIONALINFO() {
            return additionalinfo;
        }

        /**
         * Sets the value of the additionalinfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTPSFGROUP.LISTITEM.ADDITIONALINFO }
         *     
         */
        public void setADDITIONALINFO(LISTPSFGROUP.LISTITEM.ADDITIONALINFO value) {
            this.additionalinfo = value;
        }

        /**
         * Gets the value of the listbookableid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listbookableid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTBOOKABLEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTBOOKABLEID() {
            if (listbookableid == null) {
                listbookableid = new ArrayList<String>();
            }
            return this.listbookableid;
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
         *       &lt;sequence minOccurs="0"&gt;
         *         &lt;element name="CARRIER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NUMBER_IN_PARTY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="DATE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="QUEUE_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="STATUS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "carriercode",
            "numberinparty",
            "date",
            "officeid",
            "queuecategory",
            "queuenumber",
            "statuscode",
            "origin",
            "destination"
        })
        public static class ADDITIONALINFO
            implements Serializable
        {

            @XmlElement(name = "CARRIER_CODE")
            protected String carriercode;
            @XmlElement(name = "NUMBER_IN_PARTY")
            protected BigInteger numberinparty;
            @XmlElement(name = "DATE")
            protected LISTPSFGROUP.LISTITEM.ADDITIONALINFO.DATE date;
            @XmlElement(name = "OFFICE_ID")
            protected String officeid;
            @XmlElement(name = "QUEUE_CATEGORY")
            protected String queuecategory;
            @XmlElement(name = "QUEUE_NUMBER")
            protected BigInteger queuenumber;
            @XmlElement(name = "STATUS_CODE")
            protected String statuscode;
            @XmlElement(name = "ORIGIN")
            protected String origin;
            @XmlElement(name = "DESTINATION")
            protected String destination;

            /**
             * Gets the value of the carriercode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCARRIERCODE() {
                return carriercode;
            }

            /**
             * Sets the value of the carriercode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCARRIERCODE(String value) {
                this.carriercode = value;
            }

            /**
             * Gets the value of the numberinparty property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMBERINPARTY() {
                return numberinparty;
            }

            /**
             * Sets the value of the numberinparty property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMBERINPARTY(BigInteger value) {
                this.numberinparty = value;
            }

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link LISTPSFGROUP.LISTITEM.ADDITIONALINFO.DATE }
             *     
             */
            public LISTPSFGROUP.LISTITEM.ADDITIONALINFO.DATE getDATE() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTPSFGROUP.LISTITEM.ADDITIONALINFO.DATE }
             *     
             */
            public void setDATE(LISTPSFGROUP.LISTITEM.ADDITIONALINFO.DATE value) {
                this.date = value;
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
             * Gets the value of the queuecategory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQUEUECATEGORY() {
                return queuecategory;
            }

            /**
             * Sets the value of the queuecategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQUEUECATEGORY(String value) {
                this.queuecategory = value;
            }

            /**
             * Gets the value of the queuenumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQUEUENUMBER() {
                return queuenumber;
            }

            /**
             * Sets the value of the queuenumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQUEUENUMBER(BigInteger value) {
                this.queuenumber = value;
            }

            /**
             * Gets the value of the statuscode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATUSCODE() {
                return statuscode;
            }

            /**
             * Sets the value of the statuscode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATUSCODE(String value) {
                this.statuscode = value;
            }

            /**
             * Gets the value of the origin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getORIGIN() {
                return origin;
            }

            /**
             * Sets the value of the origin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setORIGIN(String value) {
                this.origin = value;
            }

            /**
             * Gets the value of the destination property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDESTINATION() {
                return destination;
            }

            /**
             * Sets the value of the destination property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDESTINATION(String value) {
                this.destination = value;
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
             *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
            public static class DATE
                implements Serializable
            {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "code", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar code;

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
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCode(XMLGregorianCalendar value) {
                    this.code = value;
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
         *       &lt;sequence minOccurs="0"&gt;
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "code",
            "value"
        })
        public static class LISTPARAMETER
            implements Serializable
        {

            @XmlElement(name = "CODE")
            protected String code;
            @XmlElement(name = "VALUE")
            protected String value;

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
             *     {@link String }
             *     
             */
            public String getVALUE() {
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
            public void setVALUE(String value) {
                this.value = value;
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
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="PASSENGER_ID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "passengerid"
    })
    public static class PASSENGERASSOCIATION
        implements Serializable
    {

        @XmlElement(name = "PASSENGER_ID", type = Integer.class)
        protected List<Integer> passengerid;

        /**
         * Gets the value of the passengerid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPASSENGERID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getPASSENGERID() {
            if (passengerid == null) {
                passengerid = new ArrayList<Integer>();
            }
            return this.passengerid;
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
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="AIRLINE_ID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "airlineid"
    })
    public static class SEGMENTASSOCIATION
        implements Serializable
    {

        @XmlElement(name = "SEGMENT_ID", type = Integer.class)
        protected List<Integer> segmentid;
        @XmlElement(name = "AIRLINE_ID")
        protected List<String> airlineid;

        /**
         * Gets the value of the segmentid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSEGMENTID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getSEGMENTID() {
            if (segmentid == null) {
                segmentid = new ArrayList<Integer>();
            }
            return this.segmentid;
        }

        /**
         * Gets the value of the airlineid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAIRLINEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAIRLINEID() {
            if (airlineid == null) {
                airlineid = new ArrayList<String>();
            }
            return this.airlineid;
        }

    }

}
