
package com.koreanair.eretail.pojo.pnr.retrievepnrinput;

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
import com.koreanair.eretail.pojo.bookinginformation.booking_channel.BOOKINGCHANNELType;
import com.koreanair.eretail.pojo.common.common.LISTRULEFRAMEWORKPARAMETER;
import com.koreanair.eretail.pojo.common.common.TRAVELAPPROVER1;
import com.koreanair.eretail.pojo.pnr.optionsinput.INPUTOPTIONSType;
import com.koreanair.eretail.pojo.tripplan.traveller_information.TRAVELLERINFORMATION;


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
 *         &lt;element name="TRIPLIST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ACTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="PAGE_TICKET" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element ref="{}DIRECT_LOGIN" minOccurs="0"/&gt;
 *         &lt;element ref="{}NUMBER_OF_PROFILES" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_INFORMATION" type="{}TRAVELLER_INFORMATION" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element name="REC_LOC" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="E_TICKET_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SWITCH_SITE_TO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STANDARD_SITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REDEMPTION_SITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BOOL_CONFIRMATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DISABLE_GETTRIPPLAN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ALLOW_RH_AFTER_XI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DIRECT_RETRIEVE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DIRECT_RETRIEVE_LASTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DIRECT_RETRIEVE_FIRSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEPARTURE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CMT_VERBHANDLER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRAVEL_APPROVER" type="{}TRAVEL_APPROVER_1" minOccurs="0"/&gt;
 *         &lt;element ref="{}RETRIEVE_PSF_CONFIG" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonInputGroup"/&gt;
 *         &lt;element name="PDR_CREATION_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REPRICING_OPTIONS" type="{}REPRICING_OPTIONS_Type" minOccurs="0"/&gt;
 *         &lt;element name="LIST_RULE_FRAMEWORK_PARAMETER" type="{}LIST_RULE_FRAMEWORK_PARAMETER" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OPTIONS" type="{}INPUT_OPTIONS_Type" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_CHANNEL" type="{}BOOKING_CHANNELType" minOccurs="0"/&gt;
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
    "triplist",
    "action",
    "pageticket",
    "directlogin",
    "numberofprofiles",
    "travellerinformation",
    "recloc",
    "eticketnumber",
    "switchsiteto",
    "standardsite",
    "redemptionsite",
    "category",
    "boolconfirmation",
    "disablegettripplan",
    "allowrhafterxi",
    "directretrieve",
    "directretrievelastname",
    "directretrievefirstname",
    "flightnumber",
    "departuredate",
    "cmtverbhandler",
    "travelapprover",
    "retrievepsfconfig",
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
    "pdrcreationdate",
    "repricingoptions",
    "listruleframeworkparameter",
    "options",
    "bookingchannel"
})
@XmlRootElement(name = "RetrievePNRInput")
public class RetrievePNRInput
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
    @XmlElement(name = "TRIPLIST")
    protected Boolean triplist;
    @XmlElement(name = "ACTION")
    protected String action;
    @XmlElement(name = "PAGE_TICKET")
    protected String pageticket;
    @XmlElement(name = "DIRECT_LOGIN")
    protected String directlogin;
    @XmlElement(name = "NUMBER_OF_PROFILES")
    protected BigInteger numberofprofiles;
    @XmlElement(name = "TRAVELLER_INFORMATION")
    protected List<TRAVELLERINFORMATION> travellerinformation;
    @XmlElement(name = "REC_LOC")
    protected String recloc;
    @XmlElement(name = "E_TICKET_NUMBER")
    protected String eticketnumber;
    @XmlElement(name = "SWITCH_SITE_TO")
    protected String switchsiteto;
    @XmlElement(name = "STANDARD_SITE")
    protected String standardsite;
    @XmlElement(name = "REDEMPTION_SITE")
    protected String redemptionsite;
    @XmlElement(name = "CATEGORY")
    protected String category;
    @XmlElement(name = "BOOL_CONFIRMATION")
    protected Boolean boolconfirmation;
    @XmlElement(name = "DISABLE_GETTRIPPLAN")
    protected Boolean disablegettripplan;
    @XmlElement(name = "ALLOW_RH_AFTER_XI")
    protected Boolean allowrhafterxi;
    @XmlElement(name = "DIRECT_RETRIEVE")
    protected Boolean directretrieve;
    @XmlElement(name = "DIRECT_RETRIEVE_LASTNAME")
    protected String directretrievelastname;
    @XmlElement(name = "DIRECT_RETRIEVE_FIRSTNAME")
    protected String directretrievefirstname;
    @XmlElement(name = "FLIGHT_NUMBER")
    protected String flightnumber;
    @XmlElement(name = "DEPARTURE_DATE")
    protected String departuredate;
    @XmlElement(name = "CMT_VERBHANDLER")
    protected String cmtverbhandler;
    @XmlElement(name = "TRAVEL_APPROVER")
    protected TRAVELAPPROVER1 travelapprover;
    @XmlElement(name = "RETRIEVE_PSF_CONFIG")
    protected Boolean retrievepsfconfig;
    @XmlElement(name = "LIST_EXTERNAL_ID")
    protected List<String> listexternalid;
    @XmlElement(name = "FROM_PAGE")
    protected Object frompage;
    @XmlElement(name = "REQUEST_INFO")
    protected RetrievePNRInput.REQUESTINFO requestinfo;
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
    protected List<RetrievePNRInput.APISCHECKSTRUCTUREPASSENGER> apischeckstructurepassenger;
    @XmlElement(name = "PDR_CREATION_DATE")
    protected RetrievePNRInput.PDRCREATIONDATE pdrcreationdate;
    @XmlElement(name = "REPRICING_OPTIONS")
    protected REPRICINGOPTIONSType repricingoptions;
    @XmlElement(name = "LIST_RULE_FRAMEWORK_PARAMETER")
    protected List<LISTRULEFRAMEWORKPARAMETER> listruleframeworkparameter;
    @XmlElement(name = "OPTIONS")
    protected INPUTOPTIONSType options;
    @XmlElement(name = "BOOKING_CHANNEL")
    protected BOOKINGCHANNELType bookingchannel;
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
     * Gets the value of the triplist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTRIPLIST() {
        return triplist;
    }

    /**
     * Sets the value of the triplist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTRIPLIST(Boolean value) {
        this.triplist = value;
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
     * Gets the value of the recloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECLOC() {
        return recloc;
    }

    /**
     * Sets the value of the recloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECLOC(String value) {
        this.recloc = value;
    }

    /**
     * Gets the value of the eticketnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETICKETNUMBER() {
        return eticketnumber;
    }

    /**
     * Sets the value of the eticketnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETICKETNUMBER(String value) {
        this.eticketnumber = value;
    }

    /**
     * Gets the value of the switchsiteto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWITCHSITETO() {
        return switchsiteto;
    }

    /**
     * Sets the value of the switchsiteto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWITCHSITETO(String value) {
        this.switchsiteto = value;
    }

    /**
     * Gets the value of the standardsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTANDARDSITE() {
        return standardsite;
    }

    /**
     * Sets the value of the standardsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTANDARDSITE(String value) {
        this.standardsite = value;
    }

    /**
     * Gets the value of the redemptionsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREDEMPTIONSITE() {
        return redemptionsite;
    }

    /**
     * Sets the value of the redemptionsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREDEMPTIONSITE(String value) {
        this.redemptionsite = value;
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

    /**
     * Gets the value of the boolconfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLCONFIRMATION() {
        return boolconfirmation;
    }

    /**
     * Sets the value of the boolconfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLCONFIRMATION(Boolean value) {
        this.boolconfirmation = value;
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
     * Gets the value of the allowrhafterxi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isALLOWRHAFTERXI() {
        return allowrhafterxi;
    }

    /**
     * Sets the value of the allowrhafterxi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setALLOWRHAFTERXI(Boolean value) {
        this.allowrhafterxi = value;
    }

    /**
     * Gets the value of the directretrieve property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDIRECTRETRIEVE() {
        return directretrieve;
    }

    /**
     * Sets the value of the directretrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDIRECTRETRIEVE(Boolean value) {
        this.directretrieve = value;
    }

    /**
     * Gets the value of the directretrievelastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRECTRETRIEVELASTNAME() {
        return directretrievelastname;
    }

    /**
     * Sets the value of the directretrievelastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRECTRETRIEVELASTNAME(String value) {
        this.directretrievelastname = value;
    }

    /**
     * Gets the value of the directretrievefirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRECTRETRIEVEFIRSTNAME() {
        return directretrievefirstname;
    }

    /**
     * Sets the value of the directretrievefirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRECTRETRIEVEFIRSTNAME(String value) {
        this.directretrievefirstname = value;
    }

    /**
     * Gets the value of the flightnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIGHTNUMBER() {
        return flightnumber;
    }

    /**
     * Sets the value of the flightnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIGHTNUMBER(String value) {
        this.flightnumber = value;
    }

    /**
     * Gets the value of the departuredate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPARTUREDATE() {
        return departuredate;
    }

    /**
     * Sets the value of the departuredate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPARTUREDATE(String value) {
        this.departuredate = value;
    }

    /**
     * Gets the value of the cmtverbhandler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMTVERBHANDLER() {
        return cmtverbhandler;
    }

    /**
     * Sets the value of the cmtverbhandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMTVERBHANDLER(String value) {
        this.cmtverbhandler = value;
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
     * Gets the value of the retrievepsfconfig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRETRIEVEPSFCONFIG() {
        return retrievepsfconfig;
    }

    /**
     * Sets the value of the retrievepsfconfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRETRIEVEPSFCONFIG(Boolean value) {
        this.retrievepsfconfig = value;
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
     *     {@link RetrievePNRInput.REQUESTINFO }
     *     
     */
    public RetrievePNRInput.REQUESTINFO getREQUESTINFO() {
        return requestinfo;
    }

    /**
     * Sets the value of the requestinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievePNRInput.REQUESTINFO }
     *     
     */
    public void setREQUESTINFO(RetrievePNRInput.REQUESTINFO value) {
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
     * {@link RetrievePNRInput.APISCHECKSTRUCTUREPASSENGER }
     * 
     * 
     */
    public List<RetrievePNRInput.APISCHECKSTRUCTUREPASSENGER> getAPISCHECKSTRUCTUREPASSENGER() {
        if (apischeckstructurepassenger == null) {
            apischeckstructurepassenger = new ArrayList<RetrievePNRInput.APISCHECKSTRUCTUREPASSENGER>();
        }
        return this.apischeckstructurepassenger;
    }

    /**
     * Gets the value of the pdrcreationdate property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievePNRInput.PDRCREATIONDATE }
     *     
     */
    public RetrievePNRInput.PDRCREATIONDATE getPDRCREATIONDATE() {
        return pdrcreationdate;
    }

    /**
     * Sets the value of the pdrcreationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievePNRInput.PDRCREATIONDATE }
     *     
     */
    public void setPDRCREATIONDATE(RetrievePNRInput.PDRCREATIONDATE value) {
        this.pdrcreationdate = value;
    }

    /**
     * Gets the value of the repricingoptions property.
     * 
     * @return
     *     possible object is
     *     {@link REPRICINGOPTIONSType }
     *     
     */
    public REPRICINGOPTIONSType getREPRICINGOPTIONS() {
        return repricingoptions;
    }

    /**
     * Sets the value of the repricingoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPRICINGOPTIONSType }
     *     
     */
    public void setREPRICINGOPTIONS(REPRICINGOPTIONSType value) {
        this.repricingoptions = value;
    }

    /**
     * Gets the value of the listruleframeworkparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listruleframeworkparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRULEFRAMEWORKPARAMETER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTRULEFRAMEWORKPARAMETER }
     * 
     * 
     */
    public List<LISTRULEFRAMEWORKPARAMETER> getLISTRULEFRAMEWORKPARAMETER() {
        if (listruleframeworkparameter == null) {
            listruleframeworkparameter = new ArrayList<LISTRULEFRAMEWORKPARAMETER>();
        }
        return this.listruleframeworkparameter;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link INPUTOPTIONSType }
     *     
     */
    public INPUTOPTIONSType getOPTIONS() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link INPUTOPTIONSType }
     *     
     */
    public void setOPTIONS(INPUTOPTIONSType value) {
        this.options = value;
    }

    /**
     * Gets the value of the bookingchannel property.
     * 
     * @return
     *     possible object is
     *     {@link BOOKINGCHANNELType }
     *     
     */
    public BOOKINGCHANNELType getBOOKINGCHANNEL() {
        return bookingchannel;
    }

    /**
     * Sets the value of the bookingchannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOOKINGCHANNELType }
     *     
     */
    public void setBOOKINGCHANNEL(BOOKINGCHANNELType value) {
        this.bookingchannel = value;
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PDRCREATIONDATE
        implements Serializable
    {


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
