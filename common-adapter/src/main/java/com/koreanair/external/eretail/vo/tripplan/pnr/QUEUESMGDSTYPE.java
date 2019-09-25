
package com.koreanair.external.eretail.vo.tripplan.pnr;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Queue list used for multi GDS. The queue category is a String in this case. 
 * 
 * <p>Java class for QUEUES_MGDS_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QUEUES_MGDS_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QUEUE_OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="QUEUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="QUEUE_CATEGORY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="QUEUE_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="QUEUE_DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="QUEUE_DATE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QUEUE_TIME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="QUEUE_ACTION_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="QUEUE_AUTHORIZE_OFFICES" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="QUEUE_CREATION_OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QUEUE_IS_VIEWABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QUEUE_ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRODUCT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
@XmlType(name = "QUEUES_MGDS_TYPE", propOrder = {
    "queueofficeid",
    "queuenumber",
    "queuecategory",
    "queueid",
    "queuedescription",
    "queuedate",
    "queuetime",
    "queueactiontype",
    "queueauthorizeoffices",
    "queuecreationofficeid",
    "listtravellerid",
    "queueisviewable",
    "queueelementid",
    "listproduct"
})
public class QUEUESMGDSTYPE
    implements Serializable
{

    @XmlElement(name = "QUEUE_OFFICE_ID")
    protected String queueofficeid;
    @XmlElement(name = "QUEUE_NUMBER")
    protected BigInteger queuenumber;
    @XmlElement(name = "QUEUE_CATEGORY")
    protected String queuecategory;
    @XmlElement(name = "QUEUE_ID")
    protected BigInteger queueid;
    @XmlElement(name = "QUEUE_DESCRIPTION")
    protected String queuedescription;
    @XmlElement(name = "QUEUE_DATE")
    protected Object queuedate;
    @XmlElement(name = "QUEUE_TIME")
    protected Object queuetime;
    @XmlElement(name = "QUEUE_ACTION_TYPE")
    protected String queueactiontype;
    @XmlElement(name = "QUEUE_AUTHORIZE_OFFICES")
    protected String queueauthorizeoffices;
    @XmlElement(name = "QUEUE_CREATION_OFFICE_ID")
    protected String queuecreationofficeid;
    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<BigInteger> listtravellerid;
    @XmlElement(name = "QUEUE_IS_VIEWABLE")
    protected Boolean queueisviewable;
    @XmlElement(name = "QUEUE_ELEMENT_ID")
    protected BigInteger queueelementid;
    @XmlElement(name = "LIST_PRODUCT")
    protected List<QUEUESMGDSTYPE.LISTPRODUCT> listproduct;

    /**
     * Gets the value of the queueofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUEUEOFFICEID() {
        return queueofficeid;
    }

    /**
     * Sets the value of the queueofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUEUEOFFICEID(String value) {
        this.queueofficeid = value;
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
     * Gets the value of the queuedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUEUEDESCRIPTION() {
        return queuedescription;
    }

    /**
     * Sets the value of the queuedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUEUEDESCRIPTION(String value) {
        this.queuedescription = value;
    }

    /**
     * Gets the value of the queuedate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQUEUEDATE() {
        return queuedate;
    }

    /**
     * Sets the value of the queuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQUEUEDATE(Object value) {
        this.queuedate = value;
    }

    /**
     * Gets the value of the queuetime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getQUEUETIME() {
        return queuetime;
    }

    /**
     * Sets the value of the queuetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setQUEUETIME(Object value) {
        this.queuetime = value;
    }

    /**
     * Gets the value of the queueactiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUEUEACTIONTYPE() {
        return queueactiontype;
    }

    /**
     * Sets the value of the queueactiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUEUEACTIONTYPE(String value) {
        this.queueactiontype = value;
    }

    /**
     * Gets the value of the queueauthorizeoffices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUEUEAUTHORIZEOFFICES() {
        return queueauthorizeoffices;
    }

    /**
     * Sets the value of the queueauthorizeoffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUEUEAUTHORIZEOFFICES(String value) {
        this.queueauthorizeoffices = value;
    }

    /**
     * Gets the value of the queuecreationofficeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUEUECREATIONOFFICEID() {
        return queuecreationofficeid;
    }

    /**
     * Sets the value of the queuecreationofficeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUEUECREATIONOFFICEID(String value) {
        this.queuecreationofficeid = value;
    }

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<BigInteger>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the queueisviewable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQUEUEISVIEWABLE() {
        return queueisviewable;
    }

    /**
     * Sets the value of the queueisviewable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQUEUEISVIEWABLE(Boolean value) {
        this.queueisviewable = value;
    }

    /**
     * Gets the value of the queueelementid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQUEUEELEMENTID() {
        return queueelementid;
    }

    /**
     * Sets the value of the queueelementid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQUEUEELEMENTID(BigInteger value) {
        this.queueelementid = value;
    }

    /**
     * Gets the value of the listproduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRODUCT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QUEUESMGDSTYPE.LISTPRODUCT }
     * 
     * 
     */
    public List<QUEUESMGDSTYPE.LISTPRODUCT> getLISTPRODUCT() {
        if (listproduct == null) {
            listproduct = new ArrayList<QUEUESMGDSTYPE.LISTPRODUCT>();
        }
        return this.listproduct;
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
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "id"
    })
    public static class LISTPRODUCT
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "ID", required = true)
        protected BigInteger id;

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
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setID(BigInteger value) {
            this.id = value;
        }

    }

}
