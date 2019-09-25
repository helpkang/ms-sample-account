
package com.koreanair.external.eretail.vo.tripplan.traveller_information;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.profile.commonprofileout.ADDITIONALINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.ADDRESSINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.BANKACCOUNTINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.CHECKINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.CORPORATEINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.CREDITCARDINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.EBANKVOUCHERINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.GOVERNMENTPAYMENTINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.IDENTITYINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTADDITIONALINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTCUSTOMFIELDSINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTDELIVERYINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTECLIDS;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTFHFA;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTGUARANTEEINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTINSURANCEINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTOFFICEAGENCYINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTPAYMENTINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTPREFERENCES;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTREMARKS;
import com.koreanair.external.eretail.vo.profile.commonprofileout.LISTWEBFARESADDITIONALINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.NOTIFICATIONINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.PROFILEINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.SPONSORINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.TRAVELAGENCYINFORMATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.TRAVELLERTYPETYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.USERAUTHENTIFICATION;
import com.koreanair.external.eretail.vo.profile.commonprofileout.VOUCHERACCOUNTINFORMATIONTYPE;
import com.koreanair.external.eretail.vo.tripplan.common.common_technical_ids.TechnicalIds;


/**
 * <p>Java class for TRAVELLER_INFORMATION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAVELLER_INFORMATION"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_TYPE" type="{}TRAVELLER_TYPE_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="TD_ROLE" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ROLE" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_RAIL_TYPE" type="{}TRAVELLER_TYPE_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="ELEMENT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TOUR_TRAVELLER_ID" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TOUR_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="PNR_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LOGIN_PROFILE_INDEX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}INFANT" minOccurs="0"/&gt;
 *         &lt;element ref="{}USER_AUTHENTIFICATION" minOccurs="0"/&gt;
 *         &lt;element ref="{}CORPORATE_INFORMATION" minOccurs="0"/&gt;
 *         &lt;element ref="{}IDENTITY_INFORMATION" minOccurs="0"/&gt;
 *         &lt;element ref="{}PROFILE_INFORMATION" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_NOTIFICATION_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PREFERENCES" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FHFA" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}TRAVEL_AGENCY_INFORMATION" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_OFFICE_AGENCY_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}ADDITIONAL_INFORMATION" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_ADDITIONAL_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_INSURANCE_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}SPONSOR_INFORMATION" minOccurs="0"/&gt;
 *         &lt;element name="TATOO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TATOO_OTHER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_ADDRESS_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_ECL_IDS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_CREDIT_CARD_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_GOVERNMENT_PAYMENT_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_PAYMENT_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_BANK_ACCOUNT_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_EBANK_VOUCHER_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_CHECK_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_VOUCHER_ACCOUNT_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_DELIVERY_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_GUARANTEE_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_REMARKS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HAS_INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_CUSTOM_FIELDS_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EXTERNAL_SESSION_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NON_PRIORITARY_PROFILE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_WEBFARES_ADDITIONAL_INFORMATION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VIRTUAL_TRAVELLER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TECHNICAL_IDS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}TechnicalIds"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "TRAVELLER_INFORMATION", propOrder = {
    "type",
    "travellerid",
    "travellertype",
    "tdrole",
    "role",
    "travellerrailtype",
    "elementnumber",
    "tourtravellerid",
    "tourcode",
    "pnrtype",
    "loginprofileindex",
    "infant",
    "userauthentification",
    "corporateinformation",
    "identityinformation",
    "profileinformation",
    "listnotificationinformation",
    "listpreferences",
    "listfhfa",
    "travelagencyinformation",
    "listofficeagencyinformation",
    "additionalinformation",
    "listadditionalinformation",
    "listinsuranceinformation",
    "sponsorinformation",
    "tatoo",
    "tatooother",
    "listaddressinformation",
    "listeclids",
    "listcreditcardinformation",
    "listgovernmentpaymentinformation",
    "listpaymentinformation",
    "listbankaccountinformation",
    "listebankvoucherinformation",
    "listcheckinformation",
    "listvoucheraccountinformation",
    "listdeliveryinformation",
    "listguaranteeinformation",
    "listremarks",
    "hasinfant",
    "listcustomfieldsinformation",
    "externalsessionid",
    "nonprioritaryprofile",
    "listwebfaresadditionalinformation",
    "virtualtraveller",
    "listtechnicalids"
})
public class TRAVELLERINFORMATION
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "TRAVELLER_ID")
    protected BigInteger travellerid;
    @XmlElement(name = "TRAVELLER_TYPE")
    protected TRAVELLERTYPETYPE travellertype;
    @XmlElement(name = "TD_ROLE")
    protected List<String> tdrole;
    @XmlElement(name = "ROLE")
    protected List<String> role;
    @XmlElement(name = "TRAVELLER_RAIL_TYPE")
    protected TRAVELLERTYPETYPE travellerrailtype;
    @XmlElement(name = "ELEMENT_NUMBER")
    protected BigInteger elementnumber;
    @XmlElement(name = "TOUR_TRAVELLER_ID")
    protected String tourtravellerid;
    @XmlElement(name = "TOUR_CODE")
    protected String tourcode;
    @XmlElement(name = "PNR_TYPE")
    protected String pnrtype;
    @XmlElement(name = "LOGIN_PROFILE_INDEX")
    protected BigInteger loginprofileindex;
    @XmlElement(name = "INFANT")
    protected IDENTITYINFORMATIONTYPE infant;
    @XmlElement(name = "USER_AUTHENTIFICATION")
    protected USERAUTHENTIFICATION userauthentification;
    @XmlElement(name = "CORPORATE_INFORMATION")
    protected CORPORATEINFORMATION corporateinformation;
    @XmlElement(name = "IDENTITY_INFORMATION")
    protected IDENTITYINFORMATIONTYPE identityinformation;
    @XmlElement(name = "PROFILE_INFORMATION")
    protected PROFILEINFORMATION profileinformation;
    @XmlElement(name = "LIST_NOTIFICATION_INFORMATION")
    protected List<NOTIFICATIONINFORMATIONTYPE> listnotificationinformation;
    @XmlElement(name = "LIST_PREFERENCES")
    protected List<LISTPREFERENCES> listpreferences;
    @XmlElement(name = "LIST_FHFA")
    protected List<LISTFHFA> listfhfa;
    @XmlElement(name = "TRAVEL_AGENCY_INFORMATION")
    protected TRAVELAGENCYINFORMATION travelagencyinformation;
    @XmlElement(name = "LIST_OFFICE_AGENCY_INFORMATION")
    protected List<LISTOFFICEAGENCYINFORMATION> listofficeagencyinformation;
    @XmlElement(name = "ADDITIONAL_INFORMATION")
    protected ADDITIONALINFORMATION additionalinformation;
    @XmlElement(name = "LIST_ADDITIONAL_INFORMATION")
    protected List<LISTADDITIONALINFORMATION> listadditionalinformation;
    @XmlElement(name = "LIST_INSURANCE_INFORMATION")
    protected List<LISTINSURANCEINFORMATION> listinsuranceinformation;
    @XmlElement(name = "SPONSOR_INFORMATION")
    protected SPONSORINFORMATION sponsorinformation;
    @XmlElement(name = "TATOO")
    protected BigInteger tatoo;
    @XmlElement(name = "TATOO_OTHER")
    protected BigInteger tatooother;
    @XmlElement(name = "LIST_ADDRESS_INFORMATION")
    protected List<ADDRESSINFORMATIONTYPE> listaddressinformation;
    @XmlElement(name = "LIST_ECL_IDS")
    protected List<LISTECLIDS> listeclids;
    @XmlElement(name = "LIST_CREDIT_CARD_INFORMATION")
    protected List<CREDITCARDINFORMATIONTYPE> listcreditcardinformation;
    @XmlElement(name = "LIST_GOVERNMENT_PAYMENT_INFORMATION")
    protected List<GOVERNMENTPAYMENTINFORMATIONTYPE> listgovernmentpaymentinformation;
    @XmlElement(name = "LIST_PAYMENT_INFORMATION")
    protected List<LISTPAYMENTINFORMATION> listpaymentinformation;
    @XmlElement(name = "LIST_BANK_ACCOUNT_INFORMATION")
    protected List<BANKACCOUNTINFORMATIONTYPE> listbankaccountinformation;
    @XmlElement(name = "LIST_EBANK_VOUCHER_INFORMATION")
    protected List<EBANKVOUCHERINFORMATIONTYPE> listebankvoucherinformation;
    @XmlElement(name = "LIST_CHECK_INFORMATION")
    protected List<CHECKINFORMATIONTYPE> listcheckinformation;
    @XmlElement(name = "LIST_VOUCHER_ACCOUNT_INFORMATION")
    protected List<VOUCHERACCOUNTINFORMATIONTYPE> listvoucheraccountinformation;
    @XmlElement(name = "LIST_DELIVERY_INFORMATION")
    protected List<LISTDELIVERYINFORMATION> listdeliveryinformation;
    @XmlElement(name = "LIST_GUARANTEE_INFORMATION")
    protected List<LISTGUARANTEEINFORMATION> listguaranteeinformation;
    @XmlElement(name = "LIST_REMARKS")
    protected List<LISTREMARKS> listremarks;
    @XmlElement(name = "HAS_INFANT")
    protected Boolean hasinfant;
    @XmlElement(name = "LIST_CUSTOM_FIELDS_INFORMATION")
    protected List<LISTCUSTOMFIELDSINFORMATION> listcustomfieldsinformation;
    @XmlElement(name = "EXTERNAL_SESSION_ID")
    protected String externalsessionid;
    @XmlElement(name = "NON_PRIORITARY_PROFILE")
    protected Boolean nonprioritaryprofile;
    @XmlElement(name = "LIST_WEBFARES_ADDITIONAL_INFORMATION")
    protected List<LISTWEBFARESADDITIONALINFORMATION> listwebfaresadditionalinformation;
    @XmlElement(name = "VIRTUAL_TRAVELLER")
    protected Boolean virtualtraveller;
    @XmlElement(name = "LIST_TECHNICAL_IDS")
    protected List<TRAVELLERINFORMATION.LISTTECHNICALIDS> listtechnicalids;

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
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELLERTYPETYPE }
     *     
     */
    public TRAVELLERTYPETYPE getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELLERTYPETYPE }
     *     
     */
    public void setTRAVELLERTYPE(TRAVELLERTYPETYPE value) {
        this.travellertype = value;
    }

    /**
     * Gets the value of the tdrole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdrole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDROLE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTDROLE() {
        if (tdrole == null) {
            tdrole = new ArrayList<String>();
        }
        return this.tdrole;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getROLE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getROLE() {
        if (role == null) {
            role = new ArrayList<String>();
        }
        return this.role;
    }

    /**
     * Gets the value of the travellerrailtype property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELLERTYPETYPE }
     *     
     */
    public TRAVELLERTYPETYPE getTRAVELLERRAILTYPE() {
        return travellerrailtype;
    }

    /**
     * Sets the value of the travellerrailtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELLERTYPETYPE }
     *     
     */
    public void setTRAVELLERRAILTYPE(TRAVELLERTYPETYPE value) {
        this.travellerrailtype = value;
    }

    /**
     * Gets the value of the elementnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getELEMENTNUMBER() {
        return elementnumber;
    }

    /**
     * Sets the value of the elementnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setELEMENTNUMBER(BigInteger value) {
        this.elementnumber = value;
    }

    /**
     * Gets the value of the tourtravellerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOURTRAVELLERID() {
        return tourtravellerid;
    }

    /**
     * Sets the value of the tourtravellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOURTRAVELLERID(String value) {
        this.tourtravellerid = value;
    }

    /**
     * Gets the value of the tourcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOURCODE() {
        return tourcode;
    }

    /**
     * Sets the value of the tourcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOURCODE(String value) {
        this.tourcode = value;
    }

    /**
     * Gets the value of the pnrtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRTYPE() {
        return pnrtype;
    }

    /**
     * Sets the value of the pnrtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRTYPE(String value) {
        this.pnrtype = value;
    }

    /**
     * Gets the value of the loginprofileindex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLOGINPROFILEINDEX() {
        return loginprofileindex;
    }

    /**
     * Sets the value of the loginprofileindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLOGINPROFILEINDEX(BigInteger value) {
        this.loginprofileindex = value;
    }

    /**
     * Infant identity.  Mandatory if the traveller travels with an infant. 
     * 
     * @return
     *     possible object is
     *     {@link IDENTITYINFORMATIONTYPE }
     *     
     */
    public IDENTITYINFORMATIONTYPE getINFANT() {
        return infant;
    }

    /**
     * Sets the value of the infant property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTITYINFORMATIONTYPE }
     *     
     */
    public void setINFANT(IDENTITYINFORMATIONTYPE value) {
        this.infant = value;
    }

    /**
     * Mandatory here.  
     * 
     * @return
     *     possible object is
     *     {@link USERAUTHENTIFICATION }
     *     
     */
    public USERAUTHENTIFICATION getUSERAUTHENTIFICATION() {
        return userauthentification;
    }

    /**
     * Sets the value of the userauthentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link USERAUTHENTIFICATION }
     *     
     */
    public void setUSERAUTHENTIFICATION(USERAUTHENTIFICATION value) {
        this.userauthentification = value;
    }

    /**
     * Corporate information.
     * 
     * @return
     *     possible object is
     *     {@link CORPORATEINFORMATION }
     *     
     */
    public CORPORATEINFORMATION getCORPORATEINFORMATION() {
        return corporateinformation;
    }

    /**
     * Sets the value of the corporateinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CORPORATEINFORMATION }
     *     
     */
    public void setCORPORATEINFORMATION(CORPORATEINFORMATION value) {
        this.corporateinformation = value;
    }

    /**
     * Gets the value of the identityinformation property.
     * 
     * @return
     *     possible object is
     *     {@link IDENTITYINFORMATIONTYPE }
     *     
     */
    public IDENTITYINFORMATIONTYPE getIDENTITYINFORMATION() {
        return identityinformation;
    }

    /**
     * Sets the value of the identityinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTITYINFORMATIONTYPE }
     *     
     */
    public void setIDENTITYINFORMATION(IDENTITYINFORMATIONTYPE value) {
        this.identityinformation = value;
    }

    /**
     * Gets the value of the profileinformation property.
     * 
     * @return
     *     possible object is
     *     {@link PROFILEINFORMATION }
     *     
     */
    public PROFILEINFORMATION getPROFILEINFORMATION() {
        return profileinformation;
    }

    /**
     * Sets the value of the profileinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROFILEINFORMATION }
     *     
     */
    public void setPROFILEINFORMATION(PROFILEINFORMATION value) {
        this.profileinformation = value;
    }

    /**
     * Gets the value of the listnotificationinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listnotificationinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTNOTIFICATIONINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NOTIFICATIONINFORMATIONTYPE }
     * 
     * 
     */
    public List<NOTIFICATIONINFORMATIONTYPE> getLISTNOTIFICATIONINFORMATION() {
        if (listnotificationinformation == null) {
            listnotificationinformation = new ArrayList<NOTIFICATIONINFORMATIONTYPE>();
        }
        return this.listnotificationinformation;
    }

    /**
     * Gets the value of the listpreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPREFERENCES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPREFERENCES }
     * 
     * 
     */
    public List<LISTPREFERENCES> getLISTPREFERENCES() {
        if (listpreferences == null) {
            listpreferences = new ArrayList<LISTPREFERENCES>();
        }
        return this.listpreferences;
    }

    /**
     * Includes ticketed air segments list.  FH or FA command in PNR on central system  Gets the value of the listfhfa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfhfa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFHFA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFHFA }
     * 
     * 
     */
    public List<LISTFHFA> getLISTFHFA() {
        if (listfhfa == null) {
            listfhfa = new ArrayList<LISTFHFA>();
        }
        return this.listfhfa;
    }

    /**
     * Mandatory if PNR_TYPE = PR  
     * 
     * @return
     *     possible object is
     *     {@link TRAVELAGENCYINFORMATION }
     *     
     */
    public TRAVELAGENCYINFORMATION getTRAVELAGENCYINFORMATION() {
        return travelagencyinformation;
    }

    /**
     * Sets the value of the travelagencyinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELAGENCYINFORMATION }
     *     
     */
    public void setTRAVELAGENCYINFORMATION(TRAVELAGENCYINFORMATION value) {
        this.travelagencyinformation = value;
    }

    /**
     * Gets the value of the listofficeagencyinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listofficeagencyinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOFFICEAGENCYINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTOFFICEAGENCYINFORMATION }
     * 
     * 
     */
    public List<LISTOFFICEAGENCYINFORMATION> getLISTOFFICEAGENCYINFORMATION() {
        if (listofficeagencyinformation == null) {
            listofficeagencyinformation = new ArrayList<LISTOFFICEAGENCYINFORMATION>();
        }
        return this.listofficeagencyinformation;
    }

    /**
     * Mandatory if PNR_TYPE = PR  
     * 
     * @return
     *     possible object is
     *     {@link ADDITIONALINFORMATION }
     *     
     */
    public ADDITIONALINFORMATION getADDITIONALINFORMATION() {
        return additionalinformation;
    }

    /**
     * Sets the value of the additionalinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDITIONALINFORMATION }
     *     
     */
    public void setADDITIONALINFORMATION(ADDITIONALINFORMATION value) {
        this.additionalinformation = value;
    }

    /**
     * Gets the value of the listadditionalinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listadditionalinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDITIONALINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTADDITIONALINFORMATION }
     * 
     * 
     */
    public List<LISTADDITIONALINFORMATION> getLISTADDITIONALINFORMATION() {
        if (listadditionalinformation == null) {
            listadditionalinformation = new ArrayList<LISTADDITIONALINFORMATION>();
        }
        return this.listadditionalinformation;
    }

    /**
     * Gets the value of the listinsuranceinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listinsuranceinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTINSURANCEINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTINSURANCEINFORMATION }
     * 
     * 
     */
    public List<LISTINSURANCEINFORMATION> getLISTINSURANCEINFORMATION() {
        if (listinsuranceinformation == null) {
            listinsuranceinformation = new ArrayList<LISTINSURANCEINFORMATION>();
        }
        return this.listinsuranceinformation;
    }

    /**
     * Gets the value of the sponsorinformation property.
     * 
     * @return
     *     possible object is
     *     {@link SPONSORINFORMATION }
     *     
     */
    public SPONSORINFORMATION getSPONSORINFORMATION() {
        return sponsorinformation;
    }

    /**
     * Sets the value of the sponsorinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPONSORINFORMATION }
     *     
     */
    public void setSPONSORINFORMATION(SPONSORINFORMATION value) {
        this.sponsorinformation = value;
    }

    /**
     * Gets the value of the tatoo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTATOO() {
        return tatoo;
    }

    /**
     * Sets the value of the tatoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTATOO(BigInteger value) {
        this.tatoo = value;
    }

    /**
     * Gets the value of the tatooother property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTATOOOTHER() {
        return tatooother;
    }

    /**
     * Sets the value of the tatooother property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTATOOOTHER(BigInteger value) {
        this.tatooother = value;
    }

    /**
     * Gets the value of the listaddressinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaddressinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTADDRESSINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ADDRESSINFORMATIONTYPE }
     * 
     * 
     */
    public List<ADDRESSINFORMATIONTYPE> getLISTADDRESSINFORMATION() {
        if (listaddressinformation == null) {
            listaddressinformation = new ArrayList<ADDRESSINFORMATIONTYPE>();
        }
        return this.listaddressinformation;
    }

    /**
     * Gets the value of the listeclids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeclids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTECLIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTECLIDS }
     * 
     * 
     */
    public List<LISTECLIDS> getLISTECLIDS() {
        if (listeclids == null) {
            listeclids = new ArrayList<LISTECLIDS>();
        }
        return this.listeclids;
    }

    /**
     * Gets the value of the listcreditcardinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcreditcardinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCREDITCARDINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CREDITCARDINFORMATIONTYPE }
     * 
     * 
     */
    public List<CREDITCARDINFORMATIONTYPE> getLISTCREDITCARDINFORMATION() {
        if (listcreditcardinformation == null) {
            listcreditcardinformation = new ArrayList<CREDITCARDINFORMATIONTYPE>();
        }
        return this.listcreditcardinformation;
    }

    /**
     * Gets the value of the listgovernmentpaymentinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listgovernmentpaymentinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTGOVERNMENTPAYMENTINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GOVERNMENTPAYMENTINFORMATIONTYPE }
     * 
     * 
     */
    public List<GOVERNMENTPAYMENTINFORMATIONTYPE> getLISTGOVERNMENTPAYMENTINFORMATION() {
        if (listgovernmentpaymentinformation == null) {
            listgovernmentpaymentinformation = new ArrayList<GOVERNMENTPAYMENTINFORMATIONTYPE>();
        }
        return this.listgovernmentpaymentinformation;
    }

    /**
     * Gets the value of the listpaymentinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpaymentinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPAYMENTINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPAYMENTINFORMATION }
     * 
     * 
     */
    public List<LISTPAYMENTINFORMATION> getLISTPAYMENTINFORMATION() {
        if (listpaymentinformation == null) {
            listpaymentinformation = new ArrayList<LISTPAYMENTINFORMATION>();
        }
        return this.listpaymentinformation;
    }

    /**
     * Gets the value of the listbankaccountinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listbankaccountinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBANKACCOUNTINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BANKACCOUNTINFORMATIONTYPE }
     * 
     * 
     */
    public List<BANKACCOUNTINFORMATIONTYPE> getLISTBANKACCOUNTINFORMATION() {
        if (listbankaccountinformation == null) {
            listbankaccountinformation = new ArrayList<BANKACCOUNTINFORMATIONTYPE>();
        }
        return this.listbankaccountinformation;
    }

    /**
     * Gets the value of the listebankvoucherinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listebankvoucherinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEBANKVOUCHERINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EBANKVOUCHERINFORMATIONTYPE }
     * 
     * 
     */
    public List<EBANKVOUCHERINFORMATIONTYPE> getLISTEBANKVOUCHERINFORMATION() {
        if (listebankvoucherinformation == null) {
            listebankvoucherinformation = new ArrayList<EBANKVOUCHERINFORMATIONTYPE>();
        }
        return this.listebankvoucherinformation;
    }

    /**
     * Gets the value of the listcheckinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcheckinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCHECKINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHECKINFORMATIONTYPE }
     * 
     * 
     */
    public List<CHECKINFORMATIONTYPE> getLISTCHECKINFORMATION() {
        if (listcheckinformation == null) {
            listcheckinformation = new ArrayList<CHECKINFORMATIONTYPE>();
        }
        return this.listcheckinformation;
    }

    /**
     * Gets the value of the listvoucheraccountinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listvoucheraccountinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTVOUCHERACCOUNTINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VOUCHERACCOUNTINFORMATIONTYPE }
     * 
     * 
     */
    public List<VOUCHERACCOUNTINFORMATIONTYPE> getLISTVOUCHERACCOUNTINFORMATION() {
        if (listvoucheraccountinformation == null) {
            listvoucheraccountinformation = new ArrayList<VOUCHERACCOUNTINFORMATIONTYPE>();
        }
        return this.listvoucheraccountinformation;
    }

    /**
     * Gets the value of the listdeliveryinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdeliveryinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDELIVERYINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTDELIVERYINFORMATION }
     * 
     * 
     */
    public List<LISTDELIVERYINFORMATION> getLISTDELIVERYINFORMATION() {
        if (listdeliveryinformation == null) {
            listdeliveryinformation = new ArrayList<LISTDELIVERYINFORMATION>();
        }
        return this.listdeliveryinformation;
    }

    /**
     * Gets the value of the listguaranteeinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listguaranteeinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTGUARANTEEINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTGUARANTEEINFORMATION }
     * 
     * 
     */
    public List<LISTGUARANTEEINFORMATION> getLISTGUARANTEEINFORMATION() {
        if (listguaranteeinformation == null) {
            listguaranteeinformation = new ArrayList<LISTGUARANTEEINFORMATION>();
        }
        return this.listguaranteeinformation;
    }

    /**
     * Gets the value of the listremarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listremarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREMARKS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTREMARKS }
     * 
     * 
     */
    public List<LISTREMARKS> getLISTREMARKS() {
        if (listremarks == null) {
            listremarks = new ArrayList<LISTREMARKS>();
        }
        return this.listremarks;
    }

    /**
     * Gets the value of the hasinfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHASINFANT() {
        return hasinfant;
    }

    /**
     * Sets the value of the hasinfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHASINFANT(Boolean value) {
        this.hasinfant = value;
    }

    /**
     * Gets the value of the listcustomfieldsinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcustomfieldsinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCUSTOMFIELDSINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTCUSTOMFIELDSINFORMATION }
     * 
     * 
     */
    public List<LISTCUSTOMFIELDSINFORMATION> getLISTCUSTOMFIELDSINFORMATION() {
        if (listcustomfieldsinformation == null) {
            listcustomfieldsinformation = new ArrayList<LISTCUSTOMFIELDSINFORMATION>();
        }
        return this.listcustomfieldsinformation;
    }

    /**
     * Gets the value of the externalsessionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALSESSIONID() {
        return externalsessionid;
    }

    /**
     * Sets the value of the externalsessionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALSESSIONID(String value) {
        this.externalsessionid = value;
    }

    /**
     * Gets the value of the nonprioritaryprofile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNONPRIORITARYPROFILE() {
        return nonprioritaryprofile;
    }

    /**
     * Sets the value of the nonprioritaryprofile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNONPRIORITARYPROFILE(Boolean value) {
        this.nonprioritaryprofile = value;
    }

    /**
     * Gets the value of the listwebfaresadditionalinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listwebfaresadditionalinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTWEBFARESADDITIONALINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTWEBFARESADDITIONALINFORMATION }
     * 
     * 
     */
    public List<LISTWEBFARESADDITIONALINFORMATION> getLISTWEBFARESADDITIONALINFORMATION() {
        if (listwebfaresadditionalinformation == null) {
            listwebfaresadditionalinformation = new ArrayList<LISTWEBFARESADDITIONALINFORMATION>();
        }
        return this.listwebfaresadditionalinformation;
    }

    /**
     * Gets the value of the virtualtraveller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVIRTUALTRAVELLER() {
        return virtualtraveller;
    }

    /**
     * Sets the value of the virtualtraveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVIRTUALTRAVELLER(Boolean value) {
        this.virtualtraveller = value;
    }

    /**
     * Gets the value of the listtechnicalids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtechnicalids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTECHNICALIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELLERINFORMATION.LISTTECHNICALIDS }
     * 
     * 
     */
    public List<TRAVELLERINFORMATION.LISTTECHNICALIDS> getLISTTECHNICALIDS() {
        if (listtechnicalids == null) {
            listtechnicalids = new ArrayList<TRAVELLERINFORMATION.LISTTECHNICALIDS>();
        }
        return this.listtechnicalids;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}TechnicalIds"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "index"
    })
    public static class LISTTECHNICALIDS
        extends TechnicalIds
        implements Serializable
    {

        @XmlElement(name = "INDEX")
        protected Object index;

        /**
         * Gets the value of the index property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getINDEX() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setINDEX(Object value) {
            this.index = value;
        }

    }

}
