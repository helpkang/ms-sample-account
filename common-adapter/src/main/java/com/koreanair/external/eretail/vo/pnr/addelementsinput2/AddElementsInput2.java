
package com.koreanair.external.eretail.vo.pnr.addelementsinput2;

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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.external.eretail.vo.farecommon.farediscount.ListDiscountCredentialsType;
import com.koreanair.external.eretail.vo.farecommon.farediscount.ListResidentDiscountType;
import com.koreanair.external.eretail.vo.pnr.listelementtoadd.ListElementToAddType;
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
 *         &lt;element name="PAGE_TICKET" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="NO_VALIDATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="REQUESTED_VALIDATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element ref="{}DIRECT_LOGIN" minOccurs="0"/&gt;
 *         &lt;element name="SKIP_INSURANCE_CALL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FROM_PAX" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FROM_APIS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ELEMENT_TO_ADD" type="{}ListElementToAddType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}NUMBER_OF_PROFILES" minOccurs="0"/&gt;
 *         &lt;element name="BOOK_FOR_ANOTHER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="TRUE"/&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="FALSE"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRAVELLER_INFORMATION" type="{}TRAVELLER_INFORMATION" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element name="ASSOCIATED_TRAVELLER_FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ASSOCIATED_TRAVELLER_LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISABLE_GETTRIPPLAN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="GDS_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="GDS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LINE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ADD_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element ref="{}CLEAR_TRIP_PLAN" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonInputGroup"/&gt;
 *         &lt;element name="LIST_RESIDENT_DISCOUNT" type="{}listResidentDiscountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DISCOUNT_CREDENTIALS" type="{}listDiscountCredentialsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RESERVATION_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USE_FOP_CATALOG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "pageticket",
    "novalidation",
    "requestedvalidation",
    "directlogin",
    "skipinsurancecall",
    "frompax",
    "fromapis",
    "type",
    "listelementtoadd",
    "numberofprofiles",
    "bookforanother",
    "travellerinformation",
    "associatedtravellerfirstname",
    "associatedtravellerlastname",
    "disablegettripplan",
    "itemid",
    "gdsid",
    "gds",
    "linenumber",
    "addtype",
    "cleartripplan",
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
    "listresidentdiscount",
    "listdiscountcredentials",
    "reservationnumber",
    "usefopcatalog"
})
@XmlRootElement(name = "AddElementsInput2")
public class AddElementsInput2
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
    @XmlElement(name = "PAGE_TICKET", required = true)
    protected String pageticket;
    @XmlElement(name = "NO_VALIDATION")
    protected Object novalidation;
    @XmlElement(name = "REQUESTED_VALIDATION")
    protected Object requestedvalidation;
    @XmlElement(name = "DIRECT_LOGIN")
    protected String directlogin;
    @XmlElement(name = "SKIP_INSURANCE_CALL")
    protected Boolean skipinsurancecall;
    @XmlElement(name = "FROM_PAX")
    protected boolean frompax;
    @XmlElement(name = "FROM_APIS")
    protected Boolean fromapis;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "LIST_ELEMENT_TO_ADD")
    protected List<ListElementToAddType> listelementtoadd;
    @XmlElement(name = "NUMBER_OF_PROFILES")
    protected BigInteger numberofprofiles;
    @XmlElement(name = "BOOK_FOR_ANOTHER")
    protected String bookforanother;
    @XmlElement(name = "TRAVELLER_INFORMATION")
    protected List<TRAVELLERINFORMATION> travellerinformation;
    @XmlElement(name = "ASSOCIATED_TRAVELLER_FIRST_NAME")
    protected String associatedtravellerfirstname;
    @XmlElement(name = "ASSOCIATED_TRAVELLER_LAST_NAME")
    protected String associatedtravellerlastname;
    @XmlElement(name = "DISABLE_GETTRIPPLAN")
    protected Boolean disablegettripplan;
    @XmlElement(name = "ITEM_ID")
    protected BigInteger itemid;
    @XmlElement(name = "GDS_ID")
    protected String gdsid;
    @XmlElement(name = "GDS")
    protected String gds;
    @XmlElement(name = "LINE_NUMBER")
    protected BigInteger linenumber;
    @XmlElement(name = "ADD_TYPE")
    protected String addtype;
    @XmlElement(name = "CLEAR_TRIP_PLAN")
    protected Boolean cleartripplan;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<String> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "REQUEST_INFO")
    protected AddElementsInput2 .REQUESTINFO requestinfo;
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
    protected List<AddElementsInput2 .APISCHECKSTRUCTUREPASSENGER> apischeckstructurepassenger;
    @XmlElement(name = "LIST_RESIDENT_DISCOUNT")
    protected List<ListResidentDiscountType> listresidentdiscount;
    @XmlElement(name = "LIST_DISCOUNT_CREDENTIALS")
    protected List<ListDiscountCredentialsType> listdiscountcredentials;
    @XmlElement(name = "RESERVATION_NUMBER")
    protected String reservationnumber;
    @XmlElement(name = "USE_FOP_CATALOG")
    protected Boolean usefopcatalog;
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
     * Gets the value of the pageticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAGETICKET() {
        return pageticket;
    }

    /**
     * Sets the value of the pageticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAGETICKET(String value) {
        this.pageticket = value;
    }

    /**
     * Gets the value of the novalidation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNOVALIDATION() {
        return novalidation;
    }

    /**
     * Sets the value of the novalidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNOVALIDATION(Object value) {
        this.novalidation = value;
    }

    /**
     * Gets the value of the requestedvalidation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREQUESTEDVALIDATION() {
        return requestedvalidation;
    }

    /**
     * Sets the value of the requestedvalidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREQUESTEDVALIDATION(Object value) {
        this.requestedvalidation = value;
    }

    /**
     * Gets the value of the directlogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRECTLOGIN() {
        return directlogin;
    }

    /**
     * Sets the value of the directlogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRECTLOGIN(String value) {
        this.directlogin = value;
    }

    /**
     * Gets the value of the skipinsurancecall property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSKIPINSURANCECALL() {
        return skipinsurancecall;
    }

    /**
     * Sets the value of the skipinsurancecall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSKIPINSURANCECALL(Boolean value) {
        this.skipinsurancecall = value;
    }

    /**
     * Gets the value of the frompax property.
     * 
     */
    public boolean isFROMPAX() {
        return frompax;
    }

    /**
     * Sets the value of the frompax property.
     * 
     */
    public void setFROMPAX(boolean value) {
        this.frompax = value;
    }

    /**
     * Gets the value of the fromapis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFROMAPIS() {
        return fromapis;
    }

    /**
     * Sets the value of the fromapis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFROMAPIS(Boolean value) {
        this.fromapis = value;
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
     * Gets the value of the numberofprofiles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBEROFPROFILES() {
        return numberofprofiles;
    }

    /**
     * Sets the value of the numberofprofiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBEROFPROFILES(BigInteger value) {
        this.numberofprofiles = value;
    }

    /**
     * Gets the value of the bookforanother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOOKFORANOTHER() {
        return bookforanother;
    }

    /**
     * Sets the value of the bookforanother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOOKFORANOTHER(String value) {
        this.bookforanother = value;
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
     * Gets the value of the associatedtravellerfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSOCIATEDTRAVELLERFIRSTNAME() {
        return associatedtravellerfirstname;
    }

    /**
     * Sets the value of the associatedtravellerfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSOCIATEDTRAVELLERFIRSTNAME(String value) {
        this.associatedtravellerfirstname = value;
    }

    /**
     * Gets the value of the associatedtravellerlastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSOCIATEDTRAVELLERLASTNAME() {
        return associatedtravellerlastname;
    }

    /**
     * Sets the value of the associatedtravellerlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSOCIATEDTRAVELLERLASTNAME(String value) {
        this.associatedtravellerlastname = value;
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
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMID(BigInteger value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the gdsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDSID() {
        return gdsid;
    }

    /**
     * Sets the value of the gdsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDSID(String value) {
        this.gdsid = value;
    }

    /**
     * Gets the value of the gds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDS() {
        return gds;
    }

    /**
     * Sets the value of the gds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDS(String value) {
        this.gds = value;
    }

    /**
     * Gets the value of the linenumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLINENUMBER() {
        return linenumber;
    }

    /**
     * Sets the value of the linenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLINENUMBER(BigInteger value) {
        this.linenumber = value;
    }

    /**
     * Gets the value of the addtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDTYPE() {
        return addtype;
    }

    /**
     * Sets the value of the addtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDTYPE(String value) {
        this.addtype = value;
    }

    /**
     * Gets the value of the cleartripplan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCLEARTRIPPLAN() {
        return cleartripplan;
    }

    /**
     * Sets the value of the cleartripplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCLEARTRIPPLAN(Boolean value) {
        this.cleartripplan = value;
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
     *     {@link AddElementsInput2 .REQUESTINFO }
     *     
     */
    public AddElementsInput2 .REQUESTINFO getREQUESTINFO() {
        return requestinfo;
    }

    /**
     * Sets the value of the requestinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddElementsInput2 .REQUESTINFO }
     *     
     */
    public void setREQUESTINFO(AddElementsInput2 .REQUESTINFO value) {
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
     * {@link AddElementsInput2 .APISCHECKSTRUCTUREPASSENGER }
     * 
     * 
     */
    public List<AddElementsInput2 .APISCHECKSTRUCTUREPASSENGER> getAPISCHECKSTRUCTUREPASSENGER() {
        if (apischeckstructurepassenger == null) {
            apischeckstructurepassenger = new ArrayList<AddElementsInput2 .APISCHECKSTRUCTUREPASSENGER>();
        }
        return this.apischeckstructurepassenger;
    }

    /**
     * Gets the value of the listresidentdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listresidentdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRESIDENTDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListResidentDiscountType }
     * 
     * 
     */
    public List<ListResidentDiscountType> getLISTRESIDENTDISCOUNT() {
        if (listresidentdiscount == null) {
            listresidentdiscount = new ArrayList<ListResidentDiscountType>();
        }
        return this.listresidentdiscount;
    }

    /**
     * Gets the value of the listdiscountcredentials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscountcredentials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNTCREDENTIALS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListDiscountCredentialsType }
     * 
     * 
     */
    public List<ListDiscountCredentialsType> getLISTDISCOUNTCREDENTIALS() {
        if (listdiscountcredentials == null) {
            listdiscountcredentials = new ArrayList<ListDiscountCredentialsType>();
        }
        return this.listdiscountcredentials;
    }

    /**
     * Gets the value of the reservationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVATIONNUMBER() {
        return reservationnumber;
    }

    /**
     * Sets the value of the reservationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVATIONNUMBER(String value) {
        this.reservationnumber = value;
    }

    /**
     * Gets the value of the usefopcatalog property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSEFOPCATALOG() {
        return usefopcatalog;
    }

    /**
     * Sets the value of the usefopcatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSEFOPCATALOG(Boolean value) {
        this.usefopcatalog = value;
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
