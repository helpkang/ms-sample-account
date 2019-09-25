
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.CodeDescriptorType;


/**
 * The type representing the credit card information
 * 
 * <p>Java class for CREDIT_CARD_INFORMATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDIT_CARD_INFORMATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CC_TOBE_STORED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OWNER_FIRST_NAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OWNER_MIDDLE_NAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FULL_HOLDER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESS_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CREDIT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OWNER_NAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACCOUNT_NUMBER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="COMPANY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="2"/&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="0"/&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SUBTYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="USE_OF" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="P"/&gt;
 *                         &lt;enumeration value="C"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="0"/&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SOURCE" type="{}CodeDescriptorType" minOccurs="0"/&gt;
 *         &lt;element name="DIGIT_CODE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DIGIT_CODE_OPTION" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *               &lt;enumeration value="V"/&gt;
 *               &lt;enumeration value="I"/&gt;
 *               &lt;enumeration value="M"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ISSUE_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENT_TERM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMER_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_OF_BIRTH" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *         &lt;element name="START_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *         &lt;element name="TAC_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{}BILLINGDATA_REMARK" minOccurs="0"/&gt;
 *         &lt;element name="SWIPE_DATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IS_PCC_REQUESTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EMV_DATA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IS_EMV" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="EMV_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PIN_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CREDIT_CARD_INFORMATION_TYPE", propOrder = {

})
public class CREDITCARDINFORMATIONTYPE
    implements Serializable
{

    @XmlElement(name = "CC_TOBE_STORED")
    protected Boolean cctobestored;
    @XmlElement(name = "OWNER_FIRST_NAME")
    protected String ownerfirstname;
    @XmlElement(name = "OWNER_MIDDLE_NAME")
    protected String ownermiddlename;
    @XmlElement(name = "FULL_HOLDER_NAME")
    protected String fullholdername;
    @XmlElement(name = "ADDRESS_ID")
    protected String addressid;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "CREDIT_CARD_ID")
    protected String creditcardid;
    @XmlElement(name = "OWNER_NAME")
    protected String ownername;
    @XmlElement(name = "ACCOUNT_NUMBER")
    protected String accountnumber;
    @XmlElement(name = "EXPIRY_DATE")
    protected DATETYPEPROFILE expirydate;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "COMPANY")
    protected CREDITCARDINFORMATIONTYPE.COMPANY company;
    @XmlElement(name = "SUBTYPE")
    protected String subtype;
    @XmlElement(name = "USE_OF")
    protected CREDITCARDINFORMATIONTYPE.USEOF useof;
    @XmlElement(name = "SOURCE")
    protected CodeDescriptorType source;
    @XmlElement(name = "DIGIT_CODE")
    protected String digitcode;
    @XmlElement(name = "DIGIT_CODE_OPTION")
    protected String digitcodeoption;
    @XmlElement(name = "ISSUE_NUMBER")
    protected String issuenumber;
    @XmlElement(name = "PAYMENT_TERM")
    protected String paymentterm;
    @XmlElement(name = "CUSTOMER_NUMBER")
    protected String customernumber;
    @XmlElement(name = "DATE_OF_BIRTH")
    protected DATETYPEPROFILE dateofbirth;
    @XmlElement(name = "START_DATE")
    protected DATETYPEPROFILE startdate;
    @XmlElement(name = "TAC_CODE")
    protected String taccode;
    @XmlElement(name = "BILLINGDATA_REMARK")
    protected BILLINGDATAREMARK billingdataremark;
    @XmlElement(name = "SWIPE_DATA")
    protected String swipedata;
    @XmlElement(name = "IS_PCC_REQUESTED")
    protected Boolean ispccrequested;
    @XmlElement(name = "REMARKS")
    protected String remarks;
    @XmlElement(name = "EMV_DATA")
    protected CREDITCARDINFORMATIONTYPE.EMVDATA emvdata;
    @XmlElement(name = "PIN_CODE")
    protected Object pincode;

    /**
     * Gets the value of the cctobestored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCCTOBESTORED() {
        return cctobestored;
    }

    /**
     * Sets the value of the cctobestored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCCTOBESTORED(Boolean value) {
        this.cctobestored = value;
    }

    /**
     * Gets the value of the ownerfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOWNERFIRSTNAME() {
        return ownerfirstname;
    }

    /**
     * Sets the value of the ownerfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOWNERFIRSTNAME(String value) {
        this.ownerfirstname = value;
    }

    /**
     * Gets the value of the ownermiddlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOWNERMIDDLENAME() {
        return ownermiddlename;
    }

    /**
     * Sets the value of the ownermiddlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOWNERMIDDLENAME(String value) {
        this.ownermiddlename = value;
    }

    /**
     * Gets the value of the fullholdername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFULLHOLDERNAME() {
        return fullholdername;
    }

    /**
     * Sets the value of the fullholdername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFULLHOLDERNAME(String value) {
        this.fullholdername = value;
    }

    /**
     * Gets the value of the addressid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESSID() {
        return addressid;
    }

    /**
     * Sets the value of the addressid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESSID(String value) {
        this.addressid = value;
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
     * Gets the value of the creditcardid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITCARDID() {
        return creditcardid;
    }

    /**
     * Sets the value of the creditcardid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITCARDID(String value) {
        this.creditcardid = value;
    }

    /**
     * Gets the value of the ownername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOWNERNAME() {
        return ownername;
    }

    /**
     * Sets the value of the ownername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOWNERNAME(String value) {
        this.ownername = value;
    }

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTNUMBER() {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTNUMBER(String value) {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the expirydate property.
     * 
     * @return
     *     possible object is
     *     {@link DATETYPEPROFILE }
     *     
     */
    public DATETYPEPROFILE getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATETYPEPROFILE }
     *     
     */
    public void setEXPIRYDATE(DATETYPEPROFILE value) {
        this.expirydate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITCARDINFORMATIONTYPE.COMPANY }
     *     
     */
    public CREDITCARDINFORMATIONTYPE.COMPANY getCOMPANY() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITCARDINFORMATIONTYPE.COMPANY }
     *     
     */
    public void setCOMPANY(CREDITCARDINFORMATIONTYPE.COMPANY value) {
        this.company = value;
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
     * Gets the value of the useof property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITCARDINFORMATIONTYPE.USEOF }
     *     
     */
    public CREDITCARDINFORMATIONTYPE.USEOF getUSEOF() {
        return useof;
    }

    /**
     * Sets the value of the useof property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITCARDINFORMATIONTYPE.USEOF }
     *     
     */
    public void setUSEOF(CREDITCARDINFORMATIONTYPE.USEOF value) {
        this.useof = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setSOURCE(CodeDescriptorType value) {
        this.source = value;
    }

    /**
     * Gets the value of the digitcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIGITCODE() {
        return digitcode;
    }

    /**
     * Sets the value of the digitcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIGITCODE(String value) {
        this.digitcode = value;
    }

    /**
     * Gets the value of the digitcodeoption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIGITCODEOPTION() {
        return digitcodeoption;
    }

    /**
     * Sets the value of the digitcodeoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIGITCODEOPTION(String value) {
        this.digitcodeoption = value;
    }

    /**
     * Gets the value of the issuenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSUENUMBER() {
        return issuenumber;
    }

    /**
     * Sets the value of the issuenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSUENUMBER(String value) {
        this.issuenumber = value;
    }

    /**
     * Gets the value of the paymentterm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTTERM() {
        return paymentterm;
    }

    /**
     * Sets the value of the paymentterm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTTERM(String value) {
        this.paymentterm = value;
    }

    /**
     * Gets the value of the customernumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNUMBER() {
        return customernumber;
    }

    /**
     * Sets the value of the customernumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNUMBER(String value) {
        this.customernumber = value;
    }

    /**
     * Gets the value of the dateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link DATETYPEPROFILE }
     *     
     */
    public DATETYPEPROFILE getDATEOFBIRTH() {
        return dateofbirth;
    }

    /**
     * Sets the value of the dateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATETYPEPROFILE }
     *     
     */
    public void setDATEOFBIRTH(DATETYPEPROFILE value) {
        this.dateofbirth = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link DATETYPEPROFILE }
     *     
     */
    public DATETYPEPROFILE getSTARTDATE() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATETYPEPROFILE }
     *     
     */
    public void setSTARTDATE(DATETYPEPROFILE value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the taccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTACCODE() {
        return taccode;
    }

    /**
     * Sets the value of the taccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTACCODE(String value) {
        this.taccode = value;
    }

    /**
     * Store the Descriptive Billing Information data such as Airplus DBI fields and Amex BTA fields
     * 
     * @return
     *     possible object is
     *     {@link BILLINGDATAREMARK }
     *     
     */
    public BILLINGDATAREMARK getBILLINGDATAREMARK() {
        return billingdataremark;
    }

    /**
     * Sets the value of the billingdataremark property.
     * 
     * @param value
     *     allowed object is
     *     {@link BILLINGDATAREMARK }
     *     
     */
    public void setBILLINGDATAREMARK(BILLINGDATAREMARK value) {
        this.billingdataremark = value;
    }

    /**
     * Gets the value of the swipedata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIPEDATA() {
        return swipedata;
    }

    /**
     * Sets the value of the swipedata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIPEDATA(String value) {
        this.swipedata = value;
    }

    /**
     * Gets the value of the ispccrequested property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPCCREQUESTED() {
        return ispccrequested;
    }

    /**
     * Sets the value of the ispccrequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPCCREQUESTED(Boolean value) {
        this.ispccrequested = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARKS() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARKS(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the emvdata property.
     * 
     * @return
     *     possible object is
     *     {@link CREDITCARDINFORMATIONTYPE.EMVDATA }
     *     
     */
    public CREDITCARDINFORMATIONTYPE.EMVDATA getEMVDATA() {
        return emvdata;
    }

    /**
     * Sets the value of the emvdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREDITCARDINFORMATIONTYPE.EMVDATA }
     *     
     */
    public void setEMVDATA(CREDITCARDINFORMATIONTYPE.EMVDATA value) {
        this.emvdata = value;
    }

    /**
     * Gets the value of the pincode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPINCODE() {
        return pincode;
    }

    /**
     * Sets the value of the pincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPINCODE(Object value) {
        this.pincode = value;
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
     *       &lt;all&gt;
     *         &lt;element name="CODE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="2"/&gt;
     *               &lt;maxLength value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NAME" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="0"/&gt;
     *               &lt;maxLength value="40"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class COMPANY
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

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
     *         &lt;element name="IS_EMV" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="EMV_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "isemv",
        "emvid"
    })
    public static class EMVDATA
        implements Serializable
    {

        @XmlElement(name = "IS_EMV")
        protected boolean isemv;
        @XmlElement(name = "EMV_ID")
        protected String emvid;

        /**
         * Gets the value of the isemv property.
         * 
         */
        public boolean isISEMV() {
            return isemv;
        }

        /**
         * Sets the value of the isemv property.
         * 
         */
        public void setISEMV(boolean value) {
            this.isemv = value;
        }

        /**
         * Gets the value of the emvid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMVID() {
            return emvid;
        }

        /**
         * Sets the value of the emvid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMVID(String value) {
            this.emvid = value;
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
     *       &lt;all&gt;
     *         &lt;element name="CODE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="P"/&gt;
     *               &lt;enumeration value="C"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NAME" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="0"/&gt;
     *               &lt;maxLength value="40"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class USEOF
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

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

    }

}
