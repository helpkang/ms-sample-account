
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Account Reference.  Mandatory if DELIVERY_TYPE = ETCKT 
 * 
 * <p>Java class for FOID_INFORMATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FOID_INFORMATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FOID_AIRLINE_CODE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FOID_AIRLINE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_TYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="00"/&gt;
 *                         &lt;enumeration value="AB"/&gt;
 *                         &lt;enumeration value="CC"/&gt;
 *                         &lt;enumeration value="DL"/&gt;
 *                         &lt;enumeration value="FF"/&gt;
 *                         &lt;enumeration value="NI"/&gt;
 *                         &lt;enumeration value="OT"/&gt;
 *                         &lt;enumeration value="PP"/&gt;
 *                         &lt;enumeration value="TP"/&gt;
 *                         &lt;enumeration value="BC"/&gt;
 *                         &lt;enumeration value="DC"/&gt;
 *                         &lt;enumeration value="EM"/&gt;
 *                         &lt;enumeration value="MP"/&gt;
 *                         &lt;enumeration value="PH"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOCUMENT_NUMBER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOCUMENT_ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_ID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_VENDOR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MEMO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ADDRESS_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FAX_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MEMO_TYPE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="FAX_MEMO"/&gt;
 *                                   &lt;enumeration value="EMAIL_MEMO"/&gt;
 *                                   &lt;enumeration value="MAIL_MEMO"/&gt;
 *                                   &lt;enumeration value="NO_MEMO"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="E_MAIL_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FOID_IDENTIFICATION_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ASSOCIATED_DOCUMENT" type="{}LIST_ASSOCIATED_DOCUMENT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FOID_INFORMATION_TYPE", propOrder = {
    "foidairlinecode",
    "foidairlinename",
    "documenttype",
    "documentnumber",
    "documentorigin",
    "expirydate",
    "documentid",
    "ccid",
    "ddid",
    "documentvendor",
    "memo",
    "foididentificationnumber",
    "listassociateddocument"
})
public class FOIDINFORMATIONTYPE
    implements Serializable
{

    @XmlElement(name = "FOID_AIRLINE_CODE")
    protected String foidairlinecode;
    @XmlElement(name = "FOID_AIRLINE_NAME")
    protected String foidairlinename;
    @XmlElement(name = "DOCUMENT_TYPE")
    protected FOIDINFORMATIONTYPE.DOCUMENTTYPE documenttype;
    @XmlElement(name = "DOCUMENT_NUMBER")
    protected String documentnumber;
    @XmlElement(name = "DOCUMENT_ORIGIN")
    protected String documentorigin;
    @XmlElement(name = "EXPIRY_DATE")
    protected DATETYPEPROFILE expirydate;
    @XmlElement(name = "DOCUMENT_ID")
    protected String documentid;
    @XmlElement(name = "CC_ID")
    protected String ccid;
    @XmlElement(name = "DD_ID")
    protected String ddid;
    @XmlElement(name = "DOCUMENT_VENDOR")
    protected FOIDINFORMATIONTYPE.DOCUMENTVENDOR documentvendor;
    @XmlElement(name = "MEMO")
    protected FOIDINFORMATIONTYPE.MEMO memo;
    @XmlElement(name = "FOID_IDENTIFICATION_NUMBER")
    protected String foididentificationnumber;
    @XmlElement(name = "LIST_ASSOCIATED_DOCUMENT")
    protected List<LISTASSOCIATEDDOCUMENT> listassociateddocument;

    /**
     * Gets the value of the foidairlinecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOIDAIRLINECODE() {
        return foidairlinecode;
    }

    /**
     * Sets the value of the foidairlinecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOIDAIRLINECODE(String value) {
        this.foidairlinecode = value;
    }

    /**
     * Gets the value of the foidairlinename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOIDAIRLINENAME() {
        return foidairlinename;
    }

    /**
     * Sets the value of the foidairlinename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOIDAIRLINENAME(String value) {
        this.foidairlinename = value;
    }

    /**
     * Gets the value of the documenttype property.
     * 
     * @return
     *     possible object is
     *     {@link FOIDINFORMATIONTYPE.DOCUMENTTYPE }
     *     
     */
    public FOIDINFORMATIONTYPE.DOCUMENTTYPE getDOCUMENTTYPE() {
        return documenttype;
    }

    /**
     * Sets the value of the documenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOIDINFORMATIONTYPE.DOCUMENTTYPE }
     *     
     */
    public void setDOCUMENTTYPE(FOIDINFORMATIONTYPE.DOCUMENTTYPE value) {
        this.documenttype = value;
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
     * Gets the value of the documentorigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTORIGIN() {
        return documentorigin;
    }

    /**
     * Sets the value of the documentorigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTORIGIN(String value) {
        this.documentorigin = value;
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
     * Gets the value of the documentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTID() {
        return documentid;
    }

    /**
     * Sets the value of the documentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTID(String value) {
        this.documentid = value;
    }

    /**
     * Gets the value of the ccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCID() {
        return ccid;
    }

    /**
     * Sets the value of the ccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCID(String value) {
        this.ccid = value;
    }

    /**
     * Gets the value of the ddid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDID() {
        return ddid;
    }

    /**
     * Sets the value of the ddid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDID(String value) {
        this.ddid = value;
    }

    /**
     * Gets the value of the documentvendor property.
     * 
     * @return
     *     possible object is
     *     {@link FOIDINFORMATIONTYPE.DOCUMENTVENDOR }
     *     
     */
    public FOIDINFORMATIONTYPE.DOCUMENTVENDOR getDOCUMENTVENDOR() {
        return documentvendor;
    }

    /**
     * Sets the value of the documentvendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOIDINFORMATIONTYPE.DOCUMENTVENDOR }
     *     
     */
    public void setDOCUMENTVENDOR(FOIDINFORMATIONTYPE.DOCUMENTVENDOR value) {
        this.documentvendor = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link FOIDINFORMATIONTYPE.MEMO }
     *     
     */
    public FOIDINFORMATIONTYPE.MEMO getMEMO() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOIDINFORMATIONTYPE.MEMO }
     *     
     */
    public void setMEMO(FOIDINFORMATIONTYPE.MEMO value) {
        this.memo = value;
    }

    /**
     * Gets the value of the foididentificationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOIDIDENTIFICATIONNUMBER() {
        return foididentificationnumber;
    }

    /**
     * Sets the value of the foididentificationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOIDIDENTIFICATIONNUMBER(String value) {
        this.foididentificationnumber = value;
    }

    /**
     * Gets the value of the listassociateddocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listassociateddocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTASSOCIATEDDOCUMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTASSOCIATEDDOCUMENT }
     * 
     * 
     */
    public List<LISTASSOCIATEDDOCUMENT> getLISTASSOCIATEDDOCUMENT() {
        if (listassociateddocument == null) {
            listassociateddocument = new ArrayList<LISTASSOCIATEDDOCUMENT>();
        }
        return this.listassociateddocument;
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
     *         &lt;element name="CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="00"/&gt;
     *               &lt;enumeration value="AB"/&gt;
     *               &lt;enumeration value="CC"/&gt;
     *               &lt;enumeration value="DL"/&gt;
     *               &lt;enumeration value="FF"/&gt;
     *               &lt;enumeration value="NI"/&gt;
     *               &lt;enumeration value="OT"/&gt;
     *               &lt;enumeration value="PP"/&gt;
     *               &lt;enumeration value="TP"/&gt;
     *               &lt;enumeration value="BC"/&gt;
     *               &lt;enumeration value="DC"/&gt;
     *               &lt;enumeration value="EM"/&gt;
     *               &lt;enumeration value="MP"/&gt;
     *               &lt;enumeration value="PH"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    public static class DOCUMENTTYPE
        implements Serializable
    {

        @XmlElement(name = "CODE")
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
     *       &lt;all&gt;
     *         &lt;element name="CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;maxLength value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    public static class DOCUMENTVENDOR
        implements Serializable
    {

        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "NAME")
        protected Object name;

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
     *         &lt;element name="ADDRESS_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FAX_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MEMO_TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="FAX_MEMO"/&gt;
     *                         &lt;enumeration value="EMAIL_MEMO"/&gt;
     *                         &lt;enumeration value="MAIL_MEMO"/&gt;
     *                         &lt;enumeration value="NO_MEMO"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="E_MAIL_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    public static class MEMO
        implements Serializable
    {

        @XmlElement(name = "ADDRESS_ID")
        protected String addressid;
        @XmlElement(name = "FAX_REFERENCE")
        protected String faxreference;
        @XmlElement(name = "MEMO_TYPE")
        protected FOIDINFORMATIONTYPE.MEMO.MEMOTYPE memotype;
        @XmlElement(name = "E_MAIL_REFERENCE")
        protected String emailreference;

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
         * Gets the value of the faxreference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAXREFERENCE() {
            return faxreference;
        }

        /**
         * Sets the value of the faxreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAXREFERENCE(String value) {
            this.faxreference = value;
        }

        /**
         * Gets the value of the memotype property.
         * 
         * @return
         *     possible object is
         *     {@link FOIDINFORMATIONTYPE.MEMO.MEMOTYPE }
         *     
         */
        public FOIDINFORMATIONTYPE.MEMO.MEMOTYPE getMEMOTYPE() {
            return memotype;
        }

        /**
         * Sets the value of the memotype property.
         * 
         * @param value
         *     allowed object is
         *     {@link FOIDINFORMATIONTYPE.MEMO.MEMOTYPE }
         *     
         */
        public void setMEMOTYPE(FOIDINFORMATIONTYPE.MEMO.MEMOTYPE value) {
            this.memotype = value;
        }

        /**
         * Gets the value of the emailreference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMAILREFERENCE() {
            return emailreference;
        }

        /**
         * Sets the value of the emailreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMAILREFERENCE(String value) {
            this.emailreference = value;
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
         *         &lt;element name="CODE" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="FAX_MEMO"/&gt;
         *               &lt;enumeration value="EMAIL_MEMO"/&gt;
         *               &lt;enumeration value="MAIL_MEMO"/&gt;
         *               &lt;enumeration value="NO_MEMO"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        public static class MEMOTYPE
            implements Serializable
        {

            @XmlElement(name = "CODE")
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

}
