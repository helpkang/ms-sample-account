
package com.koreanair.eretail.pojo.tripplan.document_data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.eretail.pojo.tripplan.common.common_shopping_basket.AMOUNT;


/**
 * Requirement data
 * 
 * <p>Java class for DOCUMENT_DATA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENT_DATA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DOCUMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DOCUMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT" type="{}AMOUNT" minOccurs="0"/&gt;
 *         &lt;element name="CREATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DISPATCH_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DISPATCH_DATE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="REASON" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PRINT_COPIES" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NUMBER_ORIGINAL" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="NUMBER_DUPLICATE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SENT_COPIES" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NUMBER_ORIGINAL" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="NUMBER_DUPLICATE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_EMAIL_RECIPIENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_FAX_RECIPIENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DOCUMENT_DATA", propOrder = {
    "documentid",
    "type",
    "subtype",
    "documentnumber",
    "amount",
    "creator",
    "listdispatchinfo"
})
public class DOCUMENTDATA
    implements Serializable
{

    @XmlElement(name = "DOCUMENT_ID")
    protected BigInteger documentid;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "SUB_TYPE", required = true)
    protected String subtype;
    @XmlElement(name = "DOCUMENT_NUMBER")
    protected String documentnumber;
    @XmlElement(name = "AMOUNT")
    protected AMOUNT amount;
    @XmlElement(name = "CREATOR")
    protected String creator;
    @XmlElement(name = "LIST_DISPATCH_INFO")
    protected List<DOCUMENTDATA.LISTDISPATCHINFO> listdispatchinfo;

    /**
     * Gets the value of the documentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDOCUMENTID() {
        return documentid;
    }

    /**
     * Sets the value of the documentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDOCUMENTID(BigInteger value) {
        this.documentid = value;
    }

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
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTYPE() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTYPE(String value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the documentnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTNUMBER() {
        return documentnumber;
    }

    /**
     * Sets the value of the documentnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTNUMBER(String value) {
        this.documentnumber = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNT }
     *     
     */
    public AMOUNT getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNT }
     *     
     */
    public void setAMOUNT(AMOUNT value) {
        this.amount = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATOR() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATOR(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the listdispatchinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdispatchinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISPATCHINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOCUMENTDATA.LISTDISPATCHINFO }
     * 
     * 
     */
    public List<DOCUMENTDATA.LISTDISPATCHINFO> getLISTDISPATCHINFO() {
        if (listdispatchinfo == null) {
            listdispatchinfo = new ArrayList<DOCUMENTDATA.LISTDISPATCHINFO>();
        }
        return this.listdispatchinfo;
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
     *         &lt;element name="DISPATCH_DATE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="REASON" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PRINT_COPIES" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NUMBER_ORIGINAL" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="NUMBER_DUPLICATE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SENT_COPIES" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NUMBER_ORIGINAL" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="NUMBER_DUPLICATE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_EMAIL_RECIPIENT" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_FAX_RECIPIENT" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "dispatchdate",
        "reason",
        "printcopies",
        "sentcopies",
        "listemailrecipient",
        "listfaxrecipient"
    })
    public static class LISTDISPATCHINFO
        implements Serializable
    {

        @XmlElement(name = "DISPATCH_DATE")
        protected DOCUMENTDATA.LISTDISPATCHINFO.DISPATCHDATE dispatchdate;
        @XmlElement(name = "REASON")
        protected DOCUMENTDATA.LISTDISPATCHINFO.REASON reason;
        @XmlElement(name = "PRINT_COPIES")
        protected DOCUMENTDATA.LISTDISPATCHINFO.PRINTCOPIES printcopies;
        @XmlElement(name = "SENT_COPIES")
        protected DOCUMENTDATA.LISTDISPATCHINFO.SENTCOPIES sentcopies;
        @XmlElement(name = "LIST_EMAIL_RECIPIENT")
        protected List<DOCUMENTDATA.LISTDISPATCHINFO.LISTEMAILRECIPIENT> listemailrecipient;
        @XmlElement(name = "LIST_FAX_RECIPIENT")
        protected List<DOCUMENTDATA.LISTDISPATCHINFO.LISTFAXRECIPIENT> listfaxrecipient;

        /**
         * Gets the value of the dispatchdate property.
         * 
         * @return
         *     possible object is
         *     {@link DOCUMENTDATA.LISTDISPATCHINFO.DISPATCHDATE }
         *     
         */
        public DOCUMENTDATA.LISTDISPATCHINFO.DISPATCHDATE getDISPATCHDATE() {
            return dispatchdate;
        }

        /**
         * Sets the value of the dispatchdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DOCUMENTDATA.LISTDISPATCHINFO.DISPATCHDATE }
         *     
         */
        public void setDISPATCHDATE(DOCUMENTDATA.LISTDISPATCHINFO.DISPATCHDATE value) {
            this.dispatchdate = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link DOCUMENTDATA.LISTDISPATCHINFO.REASON }
         *     
         */
        public DOCUMENTDATA.LISTDISPATCHINFO.REASON getREASON() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link DOCUMENTDATA.LISTDISPATCHINFO.REASON }
         *     
         */
        public void setREASON(DOCUMENTDATA.LISTDISPATCHINFO.REASON value) {
            this.reason = value;
        }

        /**
         * Gets the value of the printcopies property.
         * 
         * @return
         *     possible object is
         *     {@link DOCUMENTDATA.LISTDISPATCHINFO.PRINTCOPIES }
         *     
         */
        public DOCUMENTDATA.LISTDISPATCHINFO.PRINTCOPIES getPRINTCOPIES() {
            return printcopies;
        }

        /**
         * Sets the value of the printcopies property.
         * 
         * @param value
         *     allowed object is
         *     {@link DOCUMENTDATA.LISTDISPATCHINFO.PRINTCOPIES }
         *     
         */
        public void setPRINTCOPIES(DOCUMENTDATA.LISTDISPATCHINFO.PRINTCOPIES value) {
            this.printcopies = value;
        }

        /**
         * Gets the value of the sentcopies property.
         * 
         * @return
         *     possible object is
         *     {@link DOCUMENTDATA.LISTDISPATCHINFO.SENTCOPIES }
         *     
         */
        public DOCUMENTDATA.LISTDISPATCHINFO.SENTCOPIES getSENTCOPIES() {
            return sentcopies;
        }

        /**
         * Sets the value of the sentcopies property.
         * 
         * @param value
         *     allowed object is
         *     {@link DOCUMENTDATA.LISTDISPATCHINFO.SENTCOPIES }
         *     
         */
        public void setSENTCOPIES(DOCUMENTDATA.LISTDISPATCHINFO.SENTCOPIES value) {
            this.sentcopies = value;
        }

        /**
         * Gets the value of the listemailrecipient property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listemailrecipient property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTEMAILRECIPIENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DOCUMENTDATA.LISTDISPATCHINFO.LISTEMAILRECIPIENT }
         * 
         * 
         */
        public List<DOCUMENTDATA.LISTDISPATCHINFO.LISTEMAILRECIPIENT> getLISTEMAILRECIPIENT() {
            if (listemailrecipient == null) {
                listemailrecipient = new ArrayList<DOCUMENTDATA.LISTDISPATCHINFO.LISTEMAILRECIPIENT>();
            }
            return this.listemailrecipient;
        }

        /**
         * Gets the value of the listfaxrecipient property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listfaxrecipient property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTFAXRECIPIENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DOCUMENTDATA.LISTDISPATCHINFO.LISTFAXRECIPIENT }
         * 
         * 
         */
        public List<DOCUMENTDATA.LISTDISPATCHINFO.LISTFAXRECIPIENT> getLISTFAXRECIPIENT() {
            if (listfaxrecipient == null) {
                listfaxrecipient = new ArrayList<DOCUMENTDATA.LISTDISPATCHINFO.LISTFAXRECIPIENT>();
            }
            return this.listfaxrecipient;
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
        public static class DISPATCHDATE
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
         *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "address"
        })
        public static class LISTEMAILRECIPIENT
            implements Serializable
        {

            @XmlElement(name = "ADDRESS")
            protected String address;

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRESS() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRESS(String value) {
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
         *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "number"
        })
        public static class LISTFAXRECIPIENT
            implements Serializable
        {

            @XmlElement(name = "NUMBER")
            protected String number;

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNUMBER() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNUMBER(String value) {
                this.number = value;
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
         *         &lt;element name="NUMBER_ORIGINAL" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="NUMBER_DUPLICATE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
            "numberoriginal",
            "numberduplicate"
        })
        public static class PRINTCOPIES
            implements Serializable
        {

            @XmlElement(name = "NUMBER_ORIGINAL")
            protected BigInteger numberoriginal;
            @XmlElement(name = "NUMBER_DUPLICATE")
            protected BigInteger numberduplicate;

            /**
             * Gets the value of the numberoriginal property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMBERORIGINAL() {
                return numberoriginal;
            }

            /**
             * Sets the value of the numberoriginal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMBERORIGINAL(BigInteger value) {
                this.numberoriginal = value;
            }

            /**
             * Gets the value of the numberduplicate property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMBERDUPLICATE() {
                return numberduplicate;
            }

            /**
             * Sets the value of the numberduplicate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMBERDUPLICATE(BigInteger value) {
                this.numberduplicate = value;
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
        public static class REASON
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
         *         &lt;element name="NUMBER_ORIGINAL" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="NUMBER_DUPLICATE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
            "numberoriginal",
            "numberduplicate"
        })
        public static class SENTCOPIES
            implements Serializable
        {

            @XmlElement(name = "NUMBER_ORIGINAL")
            protected BigInteger numberoriginal;
            @XmlElement(name = "NUMBER_DUPLICATE")
            protected BigInteger numberduplicate;

            /**
             * Gets the value of the numberoriginal property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMBERORIGINAL() {
                return numberoriginal;
            }

            /**
             * Sets the value of the numberoriginal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMBERORIGINAL(BigInteger value) {
                this.numberoriginal = value;
            }

            /**
             * Gets the value of the numberduplicate property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMBERDUPLICATE() {
                return numberduplicate;
            }

            /**
             * Sets the value of the numberduplicate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMBERDUPLICATE(BigInteger value) {
                this.numberduplicate = value;
            }

        }

    }

}
