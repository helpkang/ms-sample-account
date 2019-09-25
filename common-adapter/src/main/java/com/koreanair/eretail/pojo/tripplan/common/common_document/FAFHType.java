
package com.koreanair.eretail.pojo.tripplan.common.common_document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.eretail.pojo.common.common.CurrencyType;


/**
 * <p>Java class for FAFH_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FAFH_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FAFH_ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IS_NEWLY_ISSUED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AIRLINE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CONJUNCTION_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_ETICKET" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TICKET_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROVIDER_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CITY_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ISSUE_DATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_DIGIT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="IATA_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CONFIRMATION_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TICKET_INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="PAX_INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="MANUAL_ISSUE_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="EXPIRATION_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_COUPONS" maxOccurs="16" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="IS_NO_SHOW" type="{}couponNoShowType" minOccurs="0"/&gt;
 *                   &lt;element name="FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="AIRLINE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
 *         &lt;element name="ASSOCIATED_SEGMENTS" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ASSOCIATED_PASSENGERS" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ASSOCIATED_OTHER" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ASSOCIATED_OTHER_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ASSOCIATED_TRAVELLER_IDS" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ASSOCIATED_ELEMENTS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="ASSOCIATED_ELEMENT_ID" type="{}unprotectedStringType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LINE_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SEQUENCE_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TATOO_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="ISSUER_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_ISSUER_IDENTIFICATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PHONE_INFORMATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="AGENT_SIGN" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CURRENCY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FREE_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="BALANCE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ASSOCIATED_ELEMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAFH_Type", propOrder = {
    "type",
    "fafhelementid",
    "isnewlyissued",
    "airlinecode",
    "documentnumber",
    "conjunctionidentifier",
    "iseticket",
    "tickettype",
    "status",
    "providercode",
    "citycode",
    "issuedate",
    "checkdigit",
    "iatanumber",
    "confirmationnumber",
    "ticketindicator",
    "paxindicator",
    "manualissuetype",
    "expirationdate",
    "listcoupons",
    "associatedsegments",
    "associatedpassengers",
    "associatedother",
    "associatedothertype",
    "associatedtravellerids",
    "listassociatedelements",
    "linenumber",
    "sequencenumber",
    "tatoonumber",
    "issuerinformation",
    "price",
    "freetext",
    "balance",
    "associatedelementtype"
})
@XmlSeeAlso({
    com.koreanair.eretail.pojo.tripplan.common.common_document.FOType.LISTFAFH.class
})
public class FAFHType
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "FAFH_ELEMENT_ID")
    protected String fafhelementid;
    @XmlElement(name = "IS_NEWLY_ISSUED")
    protected Boolean isnewlyissued;
    @XmlElement(name = "AIRLINE_CODE")
    protected String airlinecode;
    @XmlElement(name = "DOCUMENT_NUMBER")
    protected String documentnumber;
    @XmlElement(name = "CONJUNCTION_IDENTIFIER")
    protected Boolean conjunctionidentifier;
    @XmlElement(name = "IS_ETICKET")
    protected Boolean iseticket;
    @XmlElement(name = "TICKET_TYPE")
    protected String tickettype;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "PROVIDER_CODE")
    protected String providercode;
    @XmlElement(name = "CITY_CODE")
    protected String citycode;
    @XmlElement(name = "ISSUE_DATE")
    protected String issuedate;
    @XmlElement(name = "CHECK_DIGIT")
    protected String checkdigit;
    @XmlElement(name = "IATA_NUMBER")
    protected String iatanumber;
    @XmlElement(name = "CONFIRMATION_NUMBER")
    protected String confirmationnumber;
    @XmlElement(name = "TICKET_INDICATOR")
    protected String ticketindicator;
    @XmlElement(name = "PAX_INDICATOR")
    protected String paxindicator;
    @XmlElement(name = "MANUAL_ISSUE_TYPE")
    protected String manualissuetype;
    @XmlElement(name = "EXPIRATION_DATE")
    protected FAFHType.EXPIRATIONDATE expirationdate;
    @XmlElement(name = "LIST_COUPONS")
    protected List<FAFHType.LISTCOUPONS> listcoupons;
    @XmlElement(name = "ASSOCIATED_SEGMENTS")
    protected List<Object> associatedsegments;
    @XmlElement(name = "ASSOCIATED_PASSENGERS")
    protected List<Object> associatedpassengers;
    @XmlElement(name = "ASSOCIATED_OTHER")
    protected List<Object> associatedother;
    @XmlElement(name = "ASSOCIATED_OTHER_TYPE")
    protected List<Object> associatedothertype;
    @XmlElement(name = "ASSOCIATED_TRAVELLER_IDS")
    protected List<Object> associatedtravellerids;
    @XmlElement(name = "LIST_ASSOCIATED_ELEMENTS")
    protected List<FAFHType.LISTASSOCIATEDELEMENTS> listassociatedelements;
    @XmlElement(name = "LINE_NUMBER")
    protected String linenumber;
    @XmlElement(name = "SEQUENCE_NUMBER")
    protected String sequencenumber;
    @XmlElement(name = "TATOO_NUMBER")
    protected String tatoonumber;
    @XmlElement(name = "ISSUER_INFORMATION")
    protected FAFHType.ISSUERINFORMATION issuerinformation;
    @XmlElement(name = "PRICE")
    protected FAFHType.PRICE price;
    @XmlElement(name = "FREE_TEXT")
    protected String freetext;
    @XmlElement(name = "BALANCE")
    protected FAFHType.BALANCE balance;
    @XmlElement(name = "ASSOCIATED_ELEMENT_TYPE")
    protected Object associatedelementtype;

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
     * Gets the value of the fafhelementid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAFHELEMENTID() {
        return fafhelementid;
    }

    /**
     * Sets the value of the fafhelementid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAFHELEMENTID(String value) {
        this.fafhelementid = value;
    }

    /**
     * Gets the value of the isnewlyissued property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISNEWLYISSUED() {
        return isnewlyissued;
    }

    /**
     * Sets the value of the isnewlyissued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISNEWLYISSUED(Boolean value) {
        this.isnewlyissued = value;
    }

    /**
     * Gets the value of the airlinecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRLINECODE() {
        return airlinecode;
    }

    /**
     * Sets the value of the airlinecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRLINECODE(String value) {
        this.airlinecode = value;
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
     * Gets the value of the conjunctionidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCONJUNCTIONIDENTIFIER() {
        return conjunctionidentifier;
    }

    /**
     * Sets the value of the conjunctionidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCONJUNCTIONIDENTIFIER(Boolean value) {
        this.conjunctionidentifier = value;
    }

    /**
     * Gets the value of the iseticket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISETICKET() {
        return iseticket;
    }

    /**
     * Sets the value of the iseticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISETICKET(Boolean value) {
        this.iseticket = value;
    }

    /**
     * Gets the value of the tickettype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETTYPE() {
        return tickettype;
    }

    /**
     * Sets the value of the tickettype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETTYPE(String value) {
        this.tickettype = value;
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
     * Gets the value of the providercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDERCODE() {
        return providercode;
    }

    /**
     * Sets the value of the providercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDERCODE(String value) {
        this.providercode = value;
    }

    /**
     * Gets the value of the citycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITYCODE() {
        return citycode;
    }

    /**
     * Sets the value of the citycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITYCODE(String value) {
        this.citycode = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSUEDATE(String value) {
        this.issuedate = value;
    }

    /**
     * Gets the value of the checkdigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKDIGIT() {
        return checkdigit;
    }

    /**
     * Sets the value of the checkdigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKDIGIT(String value) {
        this.checkdigit = value;
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
     * Gets the value of the confirmationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIRMATIONNUMBER() {
        return confirmationnumber;
    }

    /**
     * Sets the value of the confirmationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIRMATIONNUMBER(String value) {
        this.confirmationnumber = value;
    }

    /**
     * Gets the value of the ticketindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTICKETINDICATOR() {
        return ticketindicator;
    }

    /**
     * Sets the value of the ticketindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTICKETINDICATOR(String value) {
        this.ticketindicator = value;
    }

    /**
     * Gets the value of the paxindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAXINDICATOR() {
        return paxindicator;
    }

    /**
     * Sets the value of the paxindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAXINDICATOR(String value) {
        this.paxindicator = value;
    }

    /**
     * Gets the value of the manualissuetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUALISSUETYPE() {
        return manualissuetype;
    }

    /**
     * Sets the value of the manualissuetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUALISSUETYPE(String value) {
        this.manualissuetype = value;
    }

    /**
     * Gets the value of the expirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link FAFHType.EXPIRATIONDATE }
     *     
     */
    public FAFHType.EXPIRATIONDATE getEXPIRATIONDATE() {
        return expirationdate;
    }

    /**
     * Sets the value of the expirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAFHType.EXPIRATIONDATE }
     *     
     */
    public void setEXPIRATIONDATE(FAFHType.EXPIRATIONDATE value) {
        this.expirationdate = value;
    }

    /**
     * Gets the value of the listcoupons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcoupons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOUPONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FAFHType.LISTCOUPONS }
     * 
     * 
     */
    public List<FAFHType.LISTCOUPONS> getLISTCOUPONS() {
        if (listcoupons == null) {
            listcoupons = new ArrayList<FAFHType.LISTCOUPONS>();
        }
        return this.listcoupons;
    }

    /**
     * Gets the value of the associatedsegments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedsegments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getASSOCIATEDSEGMENTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getASSOCIATEDSEGMENTS() {
        if (associatedsegments == null) {
            associatedsegments = new ArrayList<Object>();
        }
        return this.associatedsegments;
    }

    /**
     * Gets the value of the associatedpassengers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedpassengers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getASSOCIATEDPASSENGERS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getASSOCIATEDPASSENGERS() {
        if (associatedpassengers == null) {
            associatedpassengers = new ArrayList<Object>();
        }
        return this.associatedpassengers;
    }

    /**
     * Gets the value of the associatedother property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedother property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getASSOCIATEDOTHER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getASSOCIATEDOTHER() {
        if (associatedother == null) {
            associatedother = new ArrayList<Object>();
        }
        return this.associatedother;
    }

    /**
     * Gets the value of the associatedothertype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedothertype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getASSOCIATEDOTHERTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getASSOCIATEDOTHERTYPE() {
        if (associatedothertype == null) {
            associatedothertype = new ArrayList<Object>();
        }
        return this.associatedothertype;
    }

    /**
     * Gets the value of the associatedtravellerids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedtravellerids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getASSOCIATEDTRAVELLERIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getASSOCIATEDTRAVELLERIDS() {
        if (associatedtravellerids == null) {
            associatedtravellerids = new ArrayList<Object>();
        }
        return this.associatedtravellerids;
    }

    /**
     * Gets the value of the listassociatedelements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listassociatedelements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTASSOCIATEDELEMENTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FAFHType.LISTASSOCIATEDELEMENTS }
     * 
     * 
     */
    public List<FAFHType.LISTASSOCIATEDELEMENTS> getLISTASSOCIATEDELEMENTS() {
        if (listassociatedelements == null) {
            listassociatedelements = new ArrayList<FAFHType.LISTASSOCIATEDELEMENTS>();
        }
        return this.listassociatedelements;
    }

    /**
     * Gets the value of the linenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINENUMBER() {
        return linenumber;
    }

    /**
     * Sets the value of the linenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINENUMBER(String value) {
        this.linenumber = value;
    }

    /**
     * Gets the value of the sequencenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQUENCENUMBER() {
        return sequencenumber;
    }

    /**
     * Sets the value of the sequencenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQUENCENUMBER(String value) {
        this.sequencenumber = value;
    }

    /**
     * Gets the value of the tatoonumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTATOONUMBER() {
        return tatoonumber;
    }

    /**
     * Sets the value of the tatoonumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTATOONUMBER(String value) {
        this.tatoonumber = value;
    }

    /**
     * Gets the value of the issuerinformation property.
     * 
     * @return
     *     possible object is
     *     {@link FAFHType.ISSUERINFORMATION }
     *     
     */
    public FAFHType.ISSUERINFORMATION getISSUERINFORMATION() {
        return issuerinformation;
    }

    /**
     * Sets the value of the issuerinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAFHType.ISSUERINFORMATION }
     *     
     */
    public void setISSUERINFORMATION(FAFHType.ISSUERINFORMATION value) {
        this.issuerinformation = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link FAFHType.PRICE }
     *     
     */
    public FAFHType.PRICE getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAFHType.PRICE }
     *     
     */
    public void setPRICE(FAFHType.PRICE value) {
        this.price = value;
    }

    /**
     * Gets the value of the freetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREETEXT() {
        return freetext;
    }

    /**
     * Sets the value of the freetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREETEXT(String value) {
        this.freetext = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link FAFHType.BALANCE }
     *     
     */
    public FAFHType.BALANCE getBALANCE() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAFHType.BALANCE }
     *     
     */
    public void setBALANCE(FAFHType.BALANCE value) {
        this.balance = value;
    }

    /**
     * Gets the value of the associatedelementtype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getASSOCIATEDELEMENTTYPE() {
        return associatedelementtype;
    }

    /**
     * Sets the value of the associatedelementtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setASSOCIATEDELEMENTTYPE(Object value) {
        this.associatedelementtype = value;
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
     *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
        "currency",
        "value"
    })
    public static class BALANCE
        implements Serializable
    {

        @XmlElement(name = "CURRENCY", required = true)
        protected CurrencyType currency;
        @XmlElement(name = "VALUE")
        protected double value;

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
         * Gets the value of the value property.
         * 
         */
        public double getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setVALUE(double value) {
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
    public static class EXPIRATIONDATE
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
     *         &lt;element name="LIST_ISSUER_IDENTIFICATION" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PHONE_INFORMATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="AGENT_SIGN" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "listissueridentification",
        "phoneinformation",
        "agentsign"
    })
    public static class ISSUERINFORMATION
        implements Serializable
    {

        @XmlElement(name = "LIST_ISSUER_IDENTIFICATION")
        protected List<FAFHType.ISSUERINFORMATION.LISTISSUERIDENTIFICATION> listissueridentification;
        @XmlElement(name = "PHONE_INFORMATION")
        protected String phoneinformation;
        @XmlElement(name = "AGENT_SIGN")
        protected String agentsign;

        /**
         * Gets the value of the listissueridentification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listissueridentification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTISSUERIDENTIFICATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FAFHType.ISSUERINFORMATION.LISTISSUERIDENTIFICATION }
         * 
         * 
         */
        public List<FAFHType.ISSUERINFORMATION.LISTISSUERIDENTIFICATION> getLISTISSUERIDENTIFICATION() {
            if (listissueridentification == null) {
                listissueridentification = new ArrayList<FAFHType.ISSUERINFORMATION.LISTISSUERIDENTIFICATION>();
            }
            return this.listissueridentification;
        }

        /**
         * Gets the value of the phoneinformation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPHONEINFORMATION() {
            return phoneinformation;
        }

        /**
         * Sets the value of the phoneinformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPHONEINFORMATION(String value) {
            this.phoneinformation = value;
        }

        /**
         * Gets the value of the agentsign property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAGENTSIGN() {
            return agentsign;
        }

        /**
         * Sets the value of the agentsign property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAGENTSIGN(String value) {
            this.agentsign = value;
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
         *         &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "text"
        })
        public static class LISTISSUERIDENTIFICATION
            implements Serializable
        {

            @XmlElement(name = "TEXT")
            protected Object text;

            /**
             * Gets the value of the text property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTEXT() {
                return text;
            }

            /**
             * Sets the value of the text property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTEXT(Object value) {
                this.text = value;
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
     *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="ASSOCIATED_ELEMENT_ID" type="{}unprotectedStringType"/&gt;
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
        "associatedelementid"
    })
    public static class LISTASSOCIATEDELEMENTS
        implements Serializable
    {

        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "ASSOCIATED_ELEMENT_ID", required = true)
        protected String associatedelementid;

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
         * Gets the value of the associatedelementid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getASSOCIATEDELEMENTID() {
            return associatedelementid;
        }

        /**
         * Sets the value of the associatedelementid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setASSOCIATEDELEMENTID(String value) {
            this.associatedelementid = value;
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
     *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="IS_NO_SHOW" type="{}couponNoShowType" minOccurs="0"/&gt;
     *         &lt;element name="FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="AIRLINE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "status",
        "isnoshow",
        "flightnumber",
        "airline"
    })
    public static class LISTCOUPONS
        implements Serializable
    {

        @XmlElement(name = "STATUS")
        protected String status;
        @XmlElement(name = "IS_NO_SHOW")
        @XmlSchemaType(name = "string")
        protected CouponNoShowType isnoshow;
        @XmlElement(name = "FLIGHT_NUMBER")
        protected Object flightnumber;
        @XmlElement(name = "AIRLINE")
        protected FAFHType.LISTCOUPONS.AIRLINE airline;

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
         * Gets the value of the isnoshow property.
         * 
         * @return
         *     possible object is
         *     {@link CouponNoShowType }
         *     
         */
        public CouponNoShowType getISNOSHOW() {
            return isnoshow;
        }

        /**
         * Sets the value of the isnoshow property.
         * 
         * @param value
         *     allowed object is
         *     {@link CouponNoShowType }
         *     
         */
        public void setISNOSHOW(CouponNoShowType value) {
            this.isnoshow = value;
        }

        /**
         * Gets the value of the flightnumber property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getFLIGHTNUMBER() {
            return flightnumber;
        }

        /**
         * Sets the value of the flightnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setFLIGHTNUMBER(Object value) {
            this.flightnumber = value;
        }

        /**
         * Gets the value of the airline property.
         * 
         * @return
         *     possible object is
         *     {@link FAFHType.LISTCOUPONS.AIRLINE }
         *     
         */
        public FAFHType.LISTCOUPONS.AIRLINE getAIRLINE() {
            return airline;
        }

        /**
         * Sets the value of the airline property.
         * 
         * @param value
         *     allowed object is
         *     {@link FAFHType.LISTCOUPONS.AIRLINE }
         *     
         */
        public void setAIRLINE(FAFHType.LISTCOUPONS.AIRLINE value) {
            this.airline = value;
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "name"
        })
        public static class AIRLINE
            implements Serializable
        {

            @XmlElement(name = "CODE")
            protected Object code;
            @XmlElement(name = "NAME")
            protected Object name;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCODE(Object value) {
                this.code = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setNAME(Object value) {
                this.name = value;
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
     *         &lt;element name="CURRENCY" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "currency",
        "amount"
    })
    public static class PRICE
        implements Serializable
    {

        @XmlElement(name = "CURRENCY")
        protected String currency;
        @XmlElement(name = "AMOUNT")
        protected BigDecimal amount;

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCURRENCY(String value) {
            this.currency = value;
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

    }

}
