
package com.koreanair.external.eretail.vo.tripplan.common.common_rail;

import java.io.Serializable;
import java.math.BigDecimal;
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
import com.koreanair.external.eretail.vo.common.common.CurrencyType;


/**
 * <p>Java class for RAIL_TICKET_INFORMATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RAIL_TICKET_INFORMATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TICKET_NUMBER_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TICKET_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="TICKET_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="NUMBER_OF_COUPONS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="REFUNDABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BOUND_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="BOUND_TATTOO" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SUPPLEMENT_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ACCOMMODATION_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_BOUND_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="METHOD_OF_TICKETING" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ISSUE_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
 *         &lt;element name="OFFICE_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="IATA_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TICKETING_STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RAIL_TICKET_INFORMATION_Type", propOrder = {
    "ticketnumbertype",
    "ticketid",
    "ticketnumber",
    "numberofcoupons",
    "status",
    "refundable",
    "boundid",
    "boundtattoo",
    "supplementid",
    "accommodationid",
    "listboundid",
    "listtravellerid",
    "methodofticketing",
    "issuedate",
    "amount",
    "currency",
    "officeid",
    "iatanumber",
    "ticketingstatus"
})
public class RAILTICKETINFORMATIONType
    implements Serializable
{

    @XmlElement(name = "TICKET_NUMBER_TYPE")
    protected String ticketnumbertype;
    @XmlElement(name = "TICKET_ID", required = true)
    protected String ticketid;
    @XmlElement(name = "TICKET_NUMBER")
    protected String ticketnumber;
    @XmlElement(name = "NUMBER_OF_COUPONS")
    protected Integer numberofcoupons;
    @XmlElement(name = "STATUS", required = true)
    protected String status;
    @XmlElement(name = "REFUNDABLE")
    protected Boolean refundable;
    @XmlElement(name = "BOUND_ID")
    protected String boundid;
    @XmlElement(name = "BOUND_TATTOO")
    protected String boundtattoo;
    @XmlElement(name = "SUPPLEMENT_ID")
    protected String supplementid;
    @XmlElement(name = "ACCOMMODATION_ID")
    protected String accommodationid;
    @XmlElement(name = "LIST_BOUND_ID")
    protected List<String> listboundid;
    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<String> listtravellerid;
    @XmlElement(name = "METHOD_OF_TICKETING")
    protected String methodofticketing;
    @XmlElement(name = "ISSUE_DATE")
    protected RAILTICKETINFORMATIONType.ISSUEDATE issuedate;
    @XmlElement(name = "AMOUNT")
    protected BigDecimal amount;
    @XmlElement(name = "CURRENCY")
    protected CurrencyType currency;
    @XmlElement(name = "OFFICE_ID")
    protected String officeid;
    @XmlElement(name = "IATA_NUMBER")
    protected String iatanumber;
    @XmlElement(name = "TICKETING_STATUS")
    protected String ticketingstatus;

    /**
     * Gets the value of the ticketnumbertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETNUMBERTYPE() {
        return ticketnumbertype;
    }

    /**
     * Sets the value of the ticketnumbertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETNUMBERTYPE(String value) {
        this.ticketnumbertype = value;
    }

    /**
     * Gets the value of the ticketid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETID() {
        return ticketid;
    }

    /**
     * Sets the value of the ticketid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETID(String value) {
        this.ticketid = value;
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
     * Gets the value of the numberofcoupons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUMBEROFCOUPONS() {
        return numberofcoupons;
    }

    /**
     * Sets the value of the numberofcoupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUMBEROFCOUPONS(Integer value) {
        this.numberofcoupons = value;
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
     * Gets the value of the refundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREFUNDABLE() {
        return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREFUNDABLE(Boolean value) {
        this.refundable = value;
    }

    /**
     * Gets the value of the boundid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOUNDID() {
        return boundid;
    }

    /**
     * Sets the value of the boundid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOUNDID(String value) {
        this.boundid = value;
    }

    /**
     * Gets the value of the boundtattoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOUNDTATTOO() {
        return boundtattoo;
    }

    /**
     * Sets the value of the boundtattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOUNDTATTOO(String value) {
        this.boundtattoo = value;
    }

    /**
     * Gets the value of the supplementid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLEMENTID() {
        return supplementid;
    }

    /**
     * Sets the value of the supplementid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLEMENTID(String value) {
        this.supplementid = value;
    }

    /**
     * Gets the value of the accommodationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOMMODATIONID() {
        return accommodationid;
    }

    /**
     * Sets the value of the accommodationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOMMODATIONID(String value) {
        this.accommodationid = value;
    }

    /**
     * Gets the value of the listboundid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listboundid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBOUNDID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTBOUNDID() {
        if (listboundid == null) {
            listboundid = new ArrayList<String>();
        }
        return this.listboundid;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<String>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the methodofticketing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMETHODOFTICKETING() {
        return methodofticketing;
    }

    /**
     * Sets the value of the methodofticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMETHODOFTICKETING(String value) {
        this.methodofticketing = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link RAILTICKETINFORMATIONType.ISSUEDATE }
     *     
     */
    public RAILTICKETINFORMATIONType.ISSUEDATE getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILTICKETINFORMATIONType.ISSUEDATE }
     *     
     */
    public void setISSUEDATE(RAILTICKETINFORMATIONType.ISSUEDATE value) {
        this.issuedate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNT(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCURRENCY(CurrencyType value) {
        this.currency = value;
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
     * Gets the value of the iatanumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANUMBER() {
        return iatanumber;
    }

    /**
     * Sets the value of the iatanumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATANUMBER(String value) {
        this.iatanumber = value;
    }

    /**
     * Gets the value of the ticketingstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETINGSTATUS() {
        return ticketingstatus;
    }

    /**
     * Sets the value of the ticketingstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETINGSTATUS(String value) {
        this.ticketingstatus = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
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
    public static class ISSUEDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * String type for value without CDATA
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
