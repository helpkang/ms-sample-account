
package com.koreanair.external.eretail.vo.pnr.genericservicinginput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.common.common.ElementType;
import com.koreanair.external.eretail.vo.common.common.TRAVELAPPROVER1;
import com.koreanair.external.eretail.vo.pnr.common.PARAMETERIDType;
import com.koreanair.external.eretail.vo.pnr.listelementtoadd.ListElementToAddType;
import com.koreanair.external.eretail.vo.tripplan.contact.CONTACT;
import com.koreanair.external.eretail.vo.tripplan.loyalty_card.LOYALTYCARD;
import com.koreanair.external.eretail.vo.tripplan.traveller_information.TRAVELLERINFORMATION;


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
 *         &lt;element name="IS_STRUCTURED_XML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANSACTION_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="SITE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LANGUAGE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="ACTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TYPE" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ELEMENT_TO_ADD" type="{}ListElementToAddType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ELEMENT_TO_REMOVE" type="{}elementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_OF_FARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_OF_BACKUP_FARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_PARAMETER" type="{}PARAMETER_ID_Type" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_BACKUP_PARAMETER" type="{}PARAMETER_ID_Type" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="FARE_COMMAND_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BACKUP_FARE_COMMAND_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FORCE_PTC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ACCEPT_PRICE_CHANGE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ACCEPT_SERVICE_FEE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BOOL_BOOK_SEATS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_INFORMATION" type="{}TRAVELLER_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}CONTACT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LOYALTY_CARD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="REGISTER_START_OVER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DISABLE_GETTRIPPLAN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HOTEL_REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAR_REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NICKNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRAVEL_APPROVER" type="{}TRAVEL_APPROVER_1" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENT_CARD_FEE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="WEB_FARE_DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="AH_IATA_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AH_SOURCE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonInputGroup"/&gt;
 *         &lt;element name="FULFILMENT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="RESEND_REPORT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                     &lt;element name="RESEND_BUDDY_EMAIL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORIGIN_SITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "isstructuredxml",
    "transactionid",
    "site",
    "language",
    "action",
    "type",
    "listtype",
    "listelementtoadd",
    "listelementtoremove",
    "typeoffare",
    "typeofbackupfare",
    "listfareparameter",
    "listfarebackupparameter",
    "farecommandid",
    "backupfarecommandid",
    "forceptc",
    "acceptpricechange",
    "acceptservicefee",
    "boolbookseats",
    "travellerinformation",
    "contact",
    "loyaltycard",
    "registerstartover",
    "disablegettripplan",
    "hotelremark",
    "carremark",
    "nickname",
    "travelapprover",
    "paymentcardfee",
    "webfarediscount",
    "ahiatanumber",
    "ahsourcecode",
    "listexternalid",
    "frompage",
    "requestinfo",
    "cleanoverrideonsiteswitch",
    "apischeckview",
    "apischeckcategory",
    "apischeckmandatory",
    "apischeckoptional",
    "apischeckstructure",
    "apischeckstructurepassenger",
    "fulfilment",
    "originsite"
})
@XmlRootElement(name = "GenericServicingInput")
public class GenericServicingInput
    implements Serializable
{

    @XmlElement(name = "IS_STRUCTURED_XML")
    protected String isstructuredxml;
    @XmlElement(name = "TRANSACTION_ID", required = true)
    protected String transactionid;
    @XmlElement(name = "SITE", required = true)
    protected String site;
    @XmlElement(name = "LANGUAGE", required = true)
    protected String language;
    @XmlElement(name = "ACTION")
    protected String action;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "LIST_TYPE")
    protected List<String> listtype;
    @XmlElement(name = "LIST_ELEMENT_TO_ADD")
    protected List<ListElementToAddType> listelementtoadd;
    @XmlElement(name = "LIST_ELEMENT_TO_REMOVE")
    protected List<ElementType> listelementtoremove;
    @XmlElement(name = "TYPE_OF_FARE")
    protected String typeoffare;
    @XmlElement(name = "TYPE_OF_BACKUP_FARE")
    protected String typeofbackupfare;
    @XmlElement(name = "LIST_FARE_PARAMETER")
    protected List<PARAMETERIDType> listfareparameter;
    @XmlElement(name = "LIST_FARE_BACKUP_PARAMETER")
    protected List<PARAMETERIDType> listfarebackupparameter;
    @XmlElement(name = "FARE_COMMAND_ID")
    protected String farecommandid;
    @XmlElement(name = "BACKUP_FARE_COMMAND_ID")
    protected String backupfarecommandid;
    @XmlElement(name = "FORCE_PTC")
    protected Boolean forceptc;
    @XmlElement(name = "ACCEPT_PRICE_CHANGE", defaultValue = "true")
    protected Boolean acceptpricechange;
    @XmlElement(name = "ACCEPT_SERVICE_FEE")
    protected Boolean acceptservicefee;
    @XmlElement(name = "BOOL_BOOK_SEATS", defaultValue = "false")
    protected Boolean boolbookseats;
    @XmlElement(name = "TRAVELLER_INFORMATION")
    protected List<TRAVELLERINFORMATION> travellerinformation;
    @XmlElement(name = "CONTACT")
    protected List<CONTACT> contact;
    @XmlElement(name = "LOYALTY_CARD")
    protected List<LOYALTYCARD> loyaltycard;
    @XmlElement(name = "REGISTER_START_OVER")
    protected Boolean registerstartover;
    @XmlElement(name = "DISABLE_GETTRIPPLAN")
    protected Boolean disablegettripplan;
    @XmlElement(name = "HOTEL_REMARK")
    protected String hotelremark;
    @XmlElement(name = "CAR_REMARK")
    protected String carremark;
    @XmlElement(name = "NICKNAME")
    protected String nickname;
    @XmlElement(name = "TRAVEL_APPROVER")
    protected TRAVELAPPROVER1 travelapprover;
    @XmlElement(name = "PAYMENT_CARD_FEE")
    protected Float paymentcardfee;
    @XmlElement(name = "WEB_FARE_DISCOUNT")
    protected Float webfarediscount;
    @XmlElement(name = "AH_IATA_NUMBER")
    protected String ahiatanumber;
    @XmlElement(name = "AH_SOURCE_CODE")
    protected String ahsourcecode;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<String> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "REQUEST_INFO")
    protected GenericServicingInput.REQUESTINFO requestinfo;
    @XmlElement(name = "CLEAN_OVERRIDE_ON_SITE_SWITCH")
    protected Boolean cleanoverrideonsiteswitch;
    @XmlElement(name = "APIS_CHECK_VIEW")
    protected Object apischeckview;
    @XmlElement(name = "APIS_CHECK_CATEGORY")
    protected Object apischeckcategory;
    @XmlElement(name = "APIS_CHECK_MANDATORY")
    protected Object apischeckmandatory;
    @XmlElement(name = "APIS_CHECK_OPTIONAL")
    protected Object apischeckoptional;
    @XmlElement(name = "APIS_CHECK_STRUCTURE")
    protected Object apischeckstructure;
    @XmlElement(name = "APIS_CHECK_STRUCTURE_PASSENGER")
    protected List<GenericServicingInput.APISCHECKSTRUCTUREPASSENGER> apischeckstructurepassenger;
    @XmlElement(name = "FULFILMENT")
    protected GenericServicingInput.FULFILMENT fulfilment;
    @XmlElement(name = "ORIGIN_SITE")
    protected String originsite;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the isstructuredxml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSTRUCTUREDXML() {
        return isstructuredxml;
    }

    /**
     * Sets the value of the isstructuredxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSTRUCTUREDXML(String value) {
        this.isstructuredxml = value;
    }

    /**
     * Gets the value of the transactionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONID() {
        return transactionid;
    }

    /**
     * Sets the value of the transactionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONID(String value) {
        this.transactionid = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITE() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITE(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTION() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTION(String value) {
        this.action = value;
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
     * Gets the value of the listtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTTYPE() {
        if (listtype == null) {
            listtype = new ArrayList<String>();
        }
        return this.listtype;
    }

    /**
     * Gets the value of the listelementtoadd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelementtoadd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENTTOADD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListElementToAddType }
     * 
     * 
     */
    public List<ListElementToAddType> getLISTELEMENTTOADD() {
        if (listelementtoadd == null) {
            listelementtoadd = new ArrayList<ListElementToAddType>();
        }
        return this.listelementtoadd;
    }

    /**
     * Gets the value of the listelementtoremove property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelementtoremove property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENTTOREMOVE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementType }
     * 
     * 
     */
    public List<ElementType> getLISTELEMENTTOREMOVE() {
        if (listelementtoremove == null) {
            listelementtoremove = new ArrayList<ElementType>();
        }
        return this.listelementtoremove;
    }

    /**
     * Gets the value of the typeoffare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEOFFARE() {
        return typeoffare;
    }

    /**
     * Sets the value of the typeoffare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEOFFARE(String value) {
        this.typeoffare = value;
    }

    /**
     * Gets the value of the typeofbackupfare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEOFBACKUPFARE() {
        return typeofbackupfare;
    }

    /**
     * Sets the value of the typeofbackupfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEOFBACKUPFARE(String value) {
        this.typeofbackupfare = value;
    }

    /**
     * Gets the value of the listfareparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAMETERIDType }
     * 
     * 
     */
    public List<PARAMETERIDType> getLISTFAREPARAMETER() {
        if (listfareparameter == null) {
            listfareparameter = new ArrayList<PARAMETERIDType>();
        }
        return this.listfareparameter;
    }

    /**
     * Gets the value of the listfarebackupparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarebackupparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREBACKUPPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PARAMETERIDType }
     * 
     * 
     */
    public List<PARAMETERIDType> getLISTFAREBACKUPPARAMETER() {
        if (listfarebackupparameter == null) {
            listfarebackupparameter = new ArrayList<PARAMETERIDType>();
        }
        return this.listfarebackupparameter;
    }

    /**
     * Gets the value of the farecommandid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECOMMANDID() {
        return farecommandid;
    }

    /**
     * Sets the value of the farecommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECOMMANDID(String value) {
        this.farecommandid = value;
    }

    /**
     * Gets the value of the backupfarecommandid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBACKUPFARECOMMANDID() {
        return backupfarecommandid;
    }

    /**
     * Sets the value of the backupfarecommandid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBACKUPFARECOMMANDID(String value) {
        this.backupfarecommandid = value;
    }

    /**
     * Gets the value of the forceptc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFORCEPTC() {
        return forceptc;
    }

    /**
     * Sets the value of the forceptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFORCEPTC(Boolean value) {
        this.forceptc = value;
    }

    /**
     * Gets the value of the acceptpricechange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCEPTPRICECHANGE() {
        return acceptpricechange;
    }

    /**
     * Sets the value of the acceptpricechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCEPTPRICECHANGE(Boolean value) {
        this.acceptpricechange = value;
    }

    /**
     * Gets the value of the acceptservicefee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCEPTSERVICEFEE() {
        return acceptservicefee;
    }

    /**
     * Sets the value of the acceptservicefee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCEPTSERVICEFEE(Boolean value) {
        this.acceptservicefee = value;
    }

    /**
     * Gets the value of the boolbookseats property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLBOOKSEATS() {
        return boolbookseats;
    }

    /**
     * Sets the value of the boolbookseats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLBOOKSEATS(Boolean value) {
        this.boolbookseats = value;
    }

    /**
     * Gets the value of the travellerinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRAVELLERINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELLERINFORMATION }
     * 
     * 
     */
    public List<TRAVELLERINFORMATION> getTRAVELLERINFORMATION() {
        if (travellerinformation == null) {
            travellerinformation = new ArrayList<TRAVELLERINFORMATION>();
        }
        return this.travellerinformation;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTACT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONTACT }
     * 
     * 
     */
    public List<CONTACT> getCONTACT() {
        if (contact == null) {
            contact = new ArrayList<CONTACT>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the loyaltycard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltycard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLOYALTYCARD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOYALTYCARD }
     * 
     * 
     */
    public List<LOYALTYCARD> getLOYALTYCARD() {
        if (loyaltycard == null) {
            loyaltycard = new ArrayList<LOYALTYCARD>();
        }
        return this.loyaltycard;
    }

    /**
     * Gets the value of the registerstartover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREGISTERSTARTOVER() {
        return registerstartover;
    }

    /**
     * Sets the value of the registerstartover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREGISTERSTARTOVER(Boolean value) {
        this.registerstartover = value;
    }

    /**
     * Gets the value of the disablegettripplan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDISABLEGETTRIPPLAN() {
        return disablegettripplan;
    }

    /**
     * Sets the value of the disablegettripplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDISABLEGETTRIPPLAN(Boolean value) {
        this.disablegettripplan = value;
    }

    /**
     * Gets the value of the hotelremark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOTELREMARK() {
        return hotelremark;
    }

    /**
     * Sets the value of the hotelremark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOTELREMARK(String value) {
        this.hotelremark = value;
    }

    /**
     * Gets the value of the carremark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARREMARK() {
        return carremark;
    }

    /**
     * Sets the value of the carremark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARREMARK(String value) {
        this.carremark = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNICKNAME() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNICKNAME(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the travelapprover property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELAPPROVER1 }
     *     
     */
    public TRAVELAPPROVER1 getTRAVELAPPROVER() {
        return travelapprover;
    }

    /**
     * Sets the value of the travelapprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELAPPROVER1 }
     *     
     */
    public void setTRAVELAPPROVER(TRAVELAPPROVER1 value) {
        this.travelapprover = value;
    }

    /**
     * Gets the value of the paymentcardfee property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPAYMENTCARDFEE() {
        return paymentcardfee;
    }

    /**
     * Sets the value of the paymentcardfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPAYMENTCARDFEE(Float value) {
        this.paymentcardfee = value;
    }

    /**
     * Gets the value of the webfarediscount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWEBFAREDISCOUNT() {
        return webfarediscount;
    }

    /**
     * Sets the value of the webfarediscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWEBFAREDISCOUNT(Float value) {
        this.webfarediscount = value;
    }

    /**
     * Gets the value of the ahiatanumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAHIATANUMBER() {
        return ahiatanumber;
    }

    /**
     * Sets the value of the ahiatanumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAHIATANUMBER(String value) {
        this.ahiatanumber = value;
    }

    /**
     * Gets the value of the ahsourcecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAHSOURCECODE() {
        return ahsourcecode;
    }

    /**
     * Sets the value of the ahsourcecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAHSOURCECODE(String value) {
        this.ahsourcecode = value;
    }

    /**
     * Gets the value of the listexternalid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listexternalid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXTERNALID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTEXTERNALID() {
        if (listexternalid == null) {
            listexternalid = new ArrayList<String>();
        }
        return this.listexternalid;
    }

    /**
     * Gets the value of the frompage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFROMPAGE() {
        return frompage;
    }

    /**
     * Sets the value of the frompage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFROMPAGE(Object value) {
        this.frompage = value;
    }

    /**
     * Gets the value of the requestinfo property.
     * 
     * @return
     *     possible object is
     *     {@link GenericServicingInput.REQUESTINFO }
     *     
     */
    public GenericServicingInput.REQUESTINFO getREQUESTINFO() {
        return requestinfo;
    }

    /**
     * Sets the value of the requestinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericServicingInput.REQUESTINFO }
     *     
     */
    public void setREQUESTINFO(GenericServicingInput.REQUESTINFO value) {
        this.requestinfo = value;
    }

    /**
     * Gets the value of the cleanoverrideonsiteswitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCLEANOVERRIDEONSITESWITCH() {
        return cleanoverrideonsiteswitch;
    }

    /**
     * Sets the value of the cleanoverrideonsiteswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCLEANOVERRIDEONSITESWITCH(Boolean value) {
        this.cleanoverrideonsiteswitch = value;
    }

    /**
     * Gets the value of the apischeckview property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKVIEW() {
        return apischeckview;
    }

    /**
     * Sets the value of the apischeckview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKVIEW(Object value) {
        this.apischeckview = value;
    }

    /**
     * Gets the value of the apischeckcategory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKCATEGORY() {
        return apischeckcategory;
    }

    /**
     * Sets the value of the apischeckcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKCATEGORY(Object value) {
        this.apischeckcategory = value;
    }

    /**
     * Gets the value of the apischeckmandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKMANDATORY() {
        return apischeckmandatory;
    }

    /**
     * Sets the value of the apischeckmandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKMANDATORY(Object value) {
        this.apischeckmandatory = value;
    }

    /**
     * Gets the value of the apischeckoptional property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKOPTIONAL() {
        return apischeckoptional;
    }

    /**
     * Sets the value of the apischeckoptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKOPTIONAL(Object value) {
        this.apischeckoptional = value;
    }

    /**
     * Gets the value of the apischeckstructure property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISCHECKSTRUCTURE() {
        return apischeckstructure;
    }

    /**
     * Sets the value of the apischeckstructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISCHECKSTRUCTURE(Object value) {
        this.apischeckstructure = value;
    }

    /**
     * Gets the value of the apischeckstructurepassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apischeckstructurepassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPISCHECKSTRUCTUREPASSENGER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericServicingInput.APISCHECKSTRUCTUREPASSENGER }
     * 
     * 
     */
    public List<GenericServicingInput.APISCHECKSTRUCTUREPASSENGER> getAPISCHECKSTRUCTUREPASSENGER() {
        if (apischeckstructurepassenger == null) {
            apischeckstructurepassenger = new ArrayList<GenericServicingInput.APISCHECKSTRUCTUREPASSENGER>();
        }
        return this.apischeckstructurepassenger;
    }

    /**
     * Gets the value of the fulfilment property.
     * 
     * @return
     *     possible object is
     *     {@link GenericServicingInput.FULFILMENT }
     *     
     */
    public GenericServicingInput.FULFILMENT getFULFILMENT() {
        return fulfilment;
    }

    /**
     * Sets the value of the fulfilment property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericServicingInput.FULFILMENT }
     *     
     */
    public void setFULFILMENT(GenericServicingInput.FULFILMENT value) {
        this.fulfilment = value;
    }

    /**
     * Gets the value of the originsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGINSITE() {
        return originsite;
    }

    /**
     * Sets the value of the originsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGINSITE(String value) {
        this.originsite = value;
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
     *         &lt;element name="TRAVELER_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_STRUCTURE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "travelerid",
        "liststructure"
    })
    public static class APISCHECKSTRUCTUREPASSENGER
        implements Serializable
    {

        @XmlElement(name = "TRAVELER_ID")
        protected Object travelerid;
        @XmlElement(name = "LIST_STRUCTURE")
        protected Object liststructure;

        /**
         * Gets the value of the travelerid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTRAVELERID() {
            return travelerid;
        }

        /**
         * Sets the value of the travelerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTRAVELERID(Object value) {
            this.travelerid = value;
        }

        /**
         * Gets the value of the liststructure property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLISTSTRUCTURE() {
            return liststructure;
        }

        /**
         * Sets the value of the liststructure property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLISTSTRUCTURE(Object value) {
            this.liststructure = value;
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
     *         &lt;choice&gt;
     *           &lt;element name="RESEND_REPORT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *           &lt;element name="RESEND_BUDDY_EMAIL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;/choice&gt;
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
        "resendreport",
        "resendbuddyemail"
    })
    public static class FULFILMENT
        implements Serializable
    {

        @XmlElement(name = "RESEND_REPORT")
        protected Object resendreport;
        @XmlElement(name = "RESEND_BUDDY_EMAIL")
        protected Object resendbuddyemail;

        /**
         * Gets the value of the resendreport property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRESENDREPORT() {
            return resendreport;
        }

        /**
         * Sets the value of the resendreport property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRESENDREPORT(Object value) {
            this.resendreport = value;
        }

        /**
         * Gets the value of the resendbuddyemail property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRESENDBUDDYEMAIL() {
            return resendbuddyemail;
        }

        /**
         * Sets the value of the resendbuddyemail property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRESENDBUDDYEMAIL(Object value) {
            this.resendbuddyemail = value;
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
     *         &lt;element name="REQUEST_URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IP_ADDRESSES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IS_SSL_REQUEST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="CLIENT_REFERRER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "requesturl",
        "ipaddresses",
        "issslrequest",
        "clientreferrer"
    })
    public static class REQUESTINFO
        implements Serializable
    {

        @XmlElement(name = "REQUEST_URL")
        protected String requesturl;
        @XmlElement(name = "IP_ADDRESSES")
        protected List<String> ipaddresses;
        @XmlElement(name = "IS_SSL_REQUEST")
        protected Boolean issslrequest;
        @XmlElement(name = "CLIENT_REFERRER")
        protected String clientreferrer;

        /**
         * Gets the value of the requesturl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREQUESTURL() {
            return requesturl;
        }

        /**
         * Sets the value of the requesturl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREQUESTURL(String value) {
            this.requesturl = value;
        }

        /**
         * Gets the value of the ipaddresses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ipaddresses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIPADDRESSES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIPADDRESSES() {
            if (ipaddresses == null) {
                ipaddresses = new ArrayList<String>();
            }
            return this.ipaddresses;
        }

        /**
         * Gets the value of the issslrequest property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISSSLREQUEST() {
            return issslrequest;
        }

        /**
         * Sets the value of the issslrequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISSSLREQUEST(Boolean value) {
            this.issslrequest = value;
        }

        /**
         * Gets the value of the clientreferrer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLIENTREFERRER() {
            return clientreferrer;
        }

        /**
         * Sets the value of the clientreferrer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLIENTREFERRER(String value) {
            this.clientreferrer = value;
        }

    }

}
