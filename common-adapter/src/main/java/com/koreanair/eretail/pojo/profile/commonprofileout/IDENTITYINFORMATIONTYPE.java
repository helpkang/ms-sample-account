
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The type containing user general information (not mandatory in booking process)
 * 
 * <p>Java class for IDENTITY_INFORMATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDENTITY_INFORMATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FIRST_NAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MIDDLE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAST_NAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_PASSENGER_NAMES" type="{}PASSENGER_NAMES_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DATE_OF_BIRTH" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *         &lt;element name="SUFFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SALUTATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GENDER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NATIONALITY" type="{}STRING_TYPE_NATIONALITY_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="AGE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="UNIT_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CITIZEN_OF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}LIST_CONTACT_POINT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_CONTACT_POINT_PASSENGER" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PASSPORT_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="PASSPORT_NUMBER" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="0"/&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PASSPORT_FIRST_NAME" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="49"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PASSPORT_NAME" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="2"/&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PASSPORT_COUNTRY_CODE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;minLength value="0"/&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *                   &lt;element name="IS_PASSPORT_HOLDER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADDRESS_ID_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TITLE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="AMB"/&gt;
 *                         &lt;enumeration value="BRIG"/&gt;
 *                         &lt;enumeration value="CAPT"/&gt;
 *                         &lt;enumeration value="COLO"/&gt;
 *                         &lt;enumeration value="DR"/&gt;
 *                         &lt;enumeration value="DRMR"/&gt;
 *                         &lt;enumeration value="DRMS"/&gt;
 *                         &lt;enumeration value="FR"/&gt;
 *                         &lt;enumeration value="GENE"/&gt;
 *                         &lt;enumeration value="HE"/&gt;
 *                         &lt;enumeration value="HEE"/&gt;
 *                         &lt;enumeration value="HH"/&gt;
 *                         &lt;enumeration value="HON"/&gt;
 *                         &lt;enumeration value="HRH"/&gt;
 *                         &lt;enumeration value="JUD"/&gt;
 *                         &lt;enumeration value="JUG"/&gt;
 *                         &lt;enumeration value="JUSTICE"/&gt;
 *                         &lt;enumeration value="LADY"/&gt;
 *                         &lt;enumeration value="LORD"/&gt;
 *                         &lt;enumeration value="MDM"/&gt;
 *                         &lt;enumeration value="MI"/&gt;
 *                         &lt;enumeration value="MISS"/&gt;
 *                         &lt;enumeration value="MIST"/&gt;
 *                         &lt;enumeration value="MR"/&gt;
 *                         &lt;enumeration value="MRDR"/&gt;
 *                         &lt;enumeration value="MRPROF"/&gt;
 *                         &lt;enumeration value="MRPROFDR"/&gt;
 *                         &lt;enumeration value="MRS"/&gt;
 *                         &lt;enumeration value="MRSDR"/&gt;
 *                         &lt;enumeration value="MRSPROF"/&gt;
 *                         &lt;enumeration value="MRSPROFDR"/&gt;
 *                         &lt;enumeration value="MS"/&gt;
 *                         &lt;enumeration value="MSPROFDR"/&gt;
 *                         &lt;enumeration value="MSPROF"/&gt;
 *                         &lt;enumeration value="MSTR"/&gt;
 *                         &lt;enumeration value="MTR"/&gt;
 *                         &lt;enumeration value="PRMR"/&gt;
 *                         &lt;enumeration value="PRMS"/&gt;
 *                         &lt;enumeration value="PROF"/&gt;
 *                         &lt;enumeration value="RABB"/&gt;
 *                         &lt;enumeration value="REV"/&gt;
 *                         &lt;enumeration value="SEN"/&gt;
 *                         &lt;enumeration value="SHAK"/&gt;
 *                         &lt;enumeration value="SHEK"/&gt;
 *                         &lt;enumeration value="SHK"/&gt;
 *                         &lt;enumeration value="SHKA"/&gt;
 *                         &lt;enumeration value="SIR"/&gt;
 *                         &lt;enumeration value="SR"/&gt;
 *                         &lt;enumeration value=""/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RELATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="MEMBER"/&gt;
 *                         &lt;enumeration value="SPOUSE"/&gt;
 *                         &lt;enumeration value="CHILD"/&gt;
 *                         &lt;enumeration value="INFANT"/&gt;
 *                         &lt;enumeration value="FAMILY"/&gt;
 *                         &lt;enumeration value="FRIEND"/&gt;
 *                         &lt;enumeration value="AUNT"/&gt;
 *                         &lt;enumeration value="BRLW"/&gt;
 *                         &lt;enumeration value="BROS"/&gt;
 *                         &lt;enumeration value="DALW"/&gt;
 *                         &lt;enumeration value="DAUG"/&gt;
 *                         &lt;enumeration value="DPDF"/&gt;
 *                         &lt;enumeration value="FALW"/&gt;
 *                         &lt;enumeration value="FATH"/&gt;
 *                         &lt;enumeration value="FICO"/&gt;
 *                         &lt;enumeration value="FODA"/&gt;
 *                         &lt;enumeration value="FOSO"/&gt;
 *                         &lt;enumeration value="GRDA"/&gt;
 *                         &lt;enumeration value="GRFA"/&gt;
 *                         &lt;enumeration value="GRMO"/&gt;
 *                         &lt;enumeration value="GRSO"/&gt;
 *                         &lt;enumeration value="HABR"/&gt;
 *                         &lt;enumeration value="HASI"/&gt;
 *                         &lt;enumeration value="HUSB"/&gt;
 *                         &lt;enumeration value="MOLW"/&gt;
 *                         &lt;enumeration value="MOTH"/&gt;
 *                         &lt;enumeration value="NEPH"/&gt;
 *                         &lt;enumeration value="NIEC"/&gt;
 *                         &lt;enumeration value="SELF"/&gt;
 *                         &lt;enumeration value="SILW"/&gt;
 *                         &lt;enumeration value="SIST"/&gt;
 *                         &lt;enumeration value="SOLW"/&gt;
 *                         &lt;enumeration value="SON"/&gt;
 *                         &lt;enumeration value="STBR"/&gt;
 *                         &lt;enumeration value="STDA"/&gt;
 *                         &lt;enumeration value="STFA"/&gt;
 *                         &lt;enumeration value="STMO"/&gt;
 *                         &lt;enumeration value="STSI"/&gt;
 *                         &lt;enumeration value="STSO"/&gt;
 *                         &lt;enumeration value="UNCL"/&gt;
 *                         &lt;enumeration value="WIFE"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}LIST_IDENTITY_DOCUMENT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_APIS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}APIS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDENTITY_INFORMATION_TYPE", propOrder = {
    "firstname",
    "middlename",
    "lastname",
    "listpassengernames",
    "dateofbirth",
    "suffix",
    "salutation",
    "gender",
    "nationality",
    "age",
    "citizenof",
    "listcontactpoint",
    "listcontactpointpassenger",
    "passportinformation",
    "addressidp",
    "title",
    "relation",
    "listidentitydocument",
    "listapis",
    "apis"
})
public class IDENTITYINFORMATIONTYPE
    implements Serializable
{

    @XmlElement(name = "FIRST_NAME")
    protected String firstname;
    @XmlElement(name = "MIDDLE_NAME")
    protected String middlename;
    @XmlElement(name = "LAST_NAME")
    protected String lastname;
    @XmlElement(name = "LIST_PASSENGER_NAMES")
    protected List<PASSENGERNAMESTYPE> listpassengernames;
    @XmlElement(name = "DATE_OF_BIRTH")
    protected DATETYPEPROFILE dateofbirth;
    @XmlElement(name = "SUFFIX")
    protected String suffix;
    @XmlElement(name = "SALUTATION")
    protected String salutation;
    @XmlElement(name = "GENDER")
    protected String gender;
    @XmlElement(name = "NATIONALITY")
    protected STRINGTYPENATIONALITYAPISPFIELD nationality;
    @XmlElement(name = "AGE")
    protected IDENTITYINFORMATIONTYPE.AGE age;
    @XmlElement(name = "CITIZEN_OF")
    protected String citizenof;
    @XmlElement(name = "LIST_CONTACT_POINT")
    protected List<CONTACTPOINTTYPE> listcontactpoint;
    @XmlElement(name = "LIST_CONTACT_POINT_PASSENGER")
    protected List<CONTACTPOINTTYPE> listcontactpointpassenger;
    @XmlElement(name = "PASSPORT_INFORMATION")
    protected IDENTITYINFORMATIONTYPE.PASSPORTINFORMATION passportinformation;
    @XmlElement(name = "ADDRESS_ID_p")
    protected String addressidp;
    @XmlElement(name = "TITLE")
    protected IDENTITYINFORMATIONTYPE.TITLE title;
    @XmlElement(name = "RELATION")
    protected IDENTITYINFORMATIONTYPE.RELATION relation;
    @XmlElement(name = "LIST_IDENTITY_DOCUMENT")
    protected List<IDENTITYDOCUMENTTYPE> listidentitydocument;
    @XmlElement(name = "LIST_APIS")
    protected List<LISTAPIS> listapis;
    @XmlElement(name = "APIS")
    protected APIS apis;

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTNAME() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTNAME(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIDDLENAME() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIDDLENAME(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTNAME() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTNAME(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the listpassengernames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpassengernames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPASSENGERNAMES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PASSENGERNAMESTYPE }
     * 
     * 
     */
    public List<PASSENGERNAMESTYPE> getLISTPASSENGERNAMES() {
        if (listpassengernames == null) {
            listpassengernames = new ArrayList<PASSENGERNAMESTYPE>();
        }
        return this.listpassengernames;
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
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUFFIX() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUFFIX(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALUTATION() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALUTATION(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENDER() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENDER(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPENATIONALITYAPISPFIELD }
     *     
     */
    public STRINGTYPENATIONALITYAPISPFIELD getNATIONALITY() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPENATIONALITYAPISPFIELD }
     *     
     */
    public void setNATIONALITY(STRINGTYPENATIONALITYAPISPFIELD value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link IDENTITYINFORMATIONTYPE.AGE }
     *     
     */
    public IDENTITYINFORMATIONTYPE.AGE getAGE() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTITYINFORMATIONTYPE.AGE }
     *     
     */
    public void setAGE(IDENTITYINFORMATIONTYPE.AGE value) {
        this.age = value;
    }

    /**
     * Gets the value of the citizenof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITIZENOF() {
        return citizenof;
    }

    /**
     * Sets the value of the citizenof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITIZENOF(String value) {
        this.citizenof = value;
    }

    /**
     * Gets the value of the listcontactpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcontactpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCONTACTPOINT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONTACTPOINTTYPE }
     * 
     * 
     */
    public List<CONTACTPOINTTYPE> getLISTCONTACTPOINT() {
        if (listcontactpoint == null) {
            listcontactpoint = new ArrayList<CONTACTPOINTTYPE>();
        }
        return this.listcontactpoint;
    }

    /**
     * Gets the value of the listcontactpointpassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcontactpointpassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCONTACTPOINTPASSENGER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONTACTPOINTTYPE }
     * 
     * 
     */
    public List<CONTACTPOINTTYPE> getLISTCONTACTPOINTPASSENGER() {
        if (listcontactpointpassenger == null) {
            listcontactpointpassenger = new ArrayList<CONTACTPOINTTYPE>();
        }
        return this.listcontactpointpassenger;
    }

    /**
     * Gets the value of the passportinformation property.
     * 
     * @return
     *     possible object is
     *     {@link IDENTITYINFORMATIONTYPE.PASSPORTINFORMATION }
     *     
     */
    public IDENTITYINFORMATIONTYPE.PASSPORTINFORMATION getPASSPORTINFORMATION() {
        return passportinformation;
    }

    /**
     * Sets the value of the passportinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTITYINFORMATIONTYPE.PASSPORTINFORMATION }
     *     
     */
    public void setPASSPORTINFORMATION(IDENTITYINFORMATIONTYPE.PASSPORTINFORMATION value) {
        this.passportinformation = value;
    }

    /**
     * Gets the value of the addressidp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESSIDP() {
        return addressidp;
    }

    /**
     * Sets the value of the addressidp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESSIDP(String value) {
        this.addressidp = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link IDENTITYINFORMATIONTYPE.TITLE }
     *     
     */
    public IDENTITYINFORMATIONTYPE.TITLE getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTITYINFORMATIONTYPE.TITLE }
     *     
     */
    public void setTITLE(IDENTITYINFORMATIONTYPE.TITLE value) {
        this.title = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link IDENTITYINFORMATIONTYPE.RELATION }
     *     
     */
    public IDENTITYINFORMATIONTYPE.RELATION getRELATION() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTITYINFORMATIONTYPE.RELATION }
     *     
     */
    public void setRELATION(IDENTITYINFORMATIONTYPE.RELATION value) {
        this.relation = value;
    }

    /**
     * Gets the value of the listidentitydocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listidentitydocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTIDENTITYDOCUMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDENTITYDOCUMENTTYPE }
     * 
     * 
     */
    public List<IDENTITYDOCUMENTTYPE> getLISTIDENTITYDOCUMENT() {
        if (listidentitydocument == null) {
            listidentitydocument = new ArrayList<IDENTITYDOCUMENTTYPE>();
        }
        return this.listidentitydocument;
    }

    /**
     * Gets the value of the listapis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listapis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAPIS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTAPIS }
     * 
     * 
     */
    public List<LISTAPIS> getLISTAPIS() {
        if (listapis == null) {
            listapis = new ArrayList<LISTAPIS>();
        }
        return this.listapis;
    }

    /**
     * Gets the value of the apis property.
     * 
     * @return
     *     possible object is
     *     {@link APIS }
     *     
     */
    public APIS getAPIS() {
        return apis;
    }

    /**
     * Sets the value of the apis property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIS }
     *     
     */
    public void setAPIS(APIS value) {
        this.apis = value;
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
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="UNIT_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
    public static class AGE
        implements Serializable
    {

        @XmlElement(name = "VALUE", required = true)
        protected BigInteger value;
        @XmlElement(name = "UNIT_VALUE")
        protected Object unitvalue;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setVALUE(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the unitvalue property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getUNITVALUE() {
            return unitvalue;
        }

        /**
         * Sets the value of the unitvalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setUNITVALUE(Object value) {
            this.unitvalue = value;
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
     *         &lt;element name="PASSPORT_NUMBER" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="0"/&gt;
     *               &lt;maxLength value="12"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PASSPORT_FIRST_NAME" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="49"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PASSPORT_NAME" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="2"/&gt;
     *               &lt;maxLength value="50"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PASSPORT_COUNTRY_CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;minLength value="0"/&gt;
     *               &lt;maxLength value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
     *         &lt;element name="IS_PASSPORT_HOLDER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    public static class PASSPORTINFORMATION
        implements Serializable
    {

        @XmlElement(name = "PASSPORT_NUMBER")
        protected String passportnumber;
        @XmlElement(name = "PASSPORT_FIRST_NAME")
        protected String passportfirstname;
        @XmlElement(name = "PASSPORT_NAME")
        protected String passportname;
        @XmlElement(name = "PASSPORT_COUNTRY_CODE")
        protected String passportcountrycode;
        @XmlElement(name = "EXPIRY_DATE")
        protected DATETYPEPROFILE expirydate;
        @XmlElement(name = "IS_PASSPORT_HOLDER")
        protected Boolean ispassportholder;

        /**
         * Gets the value of the passportnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPASSPORTNUMBER() {
            return passportnumber;
        }

        /**
         * Sets the value of the passportnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPASSPORTNUMBER(String value) {
            this.passportnumber = value;
        }

        /**
         * Gets the value of the passportfirstname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPASSPORTFIRSTNAME() {
            return passportfirstname;
        }

        /**
         * Sets the value of the passportfirstname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPASSPORTFIRSTNAME(String value) {
            this.passportfirstname = value;
        }

        /**
         * Gets the value of the passportname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPASSPORTNAME() {
            return passportname;
        }

        /**
         * Sets the value of the passportname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPASSPORTNAME(String value) {
            this.passportname = value;
        }

        /**
         * Gets the value of the passportcountrycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPASSPORTCOUNTRYCODE() {
            return passportcountrycode;
        }

        /**
         * Sets the value of the passportcountrycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPASSPORTCOUNTRYCODE(String value) {
            this.passportcountrycode = value;
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
         * Gets the value of the ispassportholder property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isISPASSPORTHOLDER() {
            return ispassportholder;
        }

        /**
         * Sets the value of the ispassportholder property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setISPASSPORTHOLDER(Boolean value) {
            this.ispassportholder = value;
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
     *               &lt;enumeration value="MEMBER"/&gt;
     *               &lt;enumeration value="SPOUSE"/&gt;
     *               &lt;enumeration value="CHILD"/&gt;
     *               &lt;enumeration value="INFANT"/&gt;
     *               &lt;enumeration value="FAMILY"/&gt;
     *               &lt;enumeration value="FRIEND"/&gt;
     *               &lt;enumeration value="AUNT"/&gt;
     *               &lt;enumeration value="BRLW"/&gt;
     *               &lt;enumeration value="BROS"/&gt;
     *               &lt;enumeration value="DALW"/&gt;
     *               &lt;enumeration value="DAUG"/&gt;
     *               &lt;enumeration value="DPDF"/&gt;
     *               &lt;enumeration value="FALW"/&gt;
     *               &lt;enumeration value="FATH"/&gt;
     *               &lt;enumeration value="FICO"/&gt;
     *               &lt;enumeration value="FODA"/&gt;
     *               &lt;enumeration value="FOSO"/&gt;
     *               &lt;enumeration value="GRDA"/&gt;
     *               &lt;enumeration value="GRFA"/&gt;
     *               &lt;enumeration value="GRMO"/&gt;
     *               &lt;enumeration value="GRSO"/&gt;
     *               &lt;enumeration value="HABR"/&gt;
     *               &lt;enumeration value="HASI"/&gt;
     *               &lt;enumeration value="HUSB"/&gt;
     *               &lt;enumeration value="MOLW"/&gt;
     *               &lt;enumeration value="MOTH"/&gt;
     *               &lt;enumeration value="NEPH"/&gt;
     *               &lt;enumeration value="NIEC"/&gt;
     *               &lt;enumeration value="SELF"/&gt;
     *               &lt;enumeration value="SILW"/&gt;
     *               &lt;enumeration value="SIST"/&gt;
     *               &lt;enumeration value="SOLW"/&gt;
     *               &lt;enumeration value="SON"/&gt;
     *               &lt;enumeration value="STBR"/&gt;
     *               &lt;enumeration value="STDA"/&gt;
     *               &lt;enumeration value="STFA"/&gt;
     *               &lt;enumeration value="STMO"/&gt;
     *               &lt;enumeration value="STSI"/&gt;
     *               &lt;enumeration value="STSO"/&gt;
     *               &lt;enumeration value="UNCL"/&gt;
     *               &lt;enumeration value="WIFE"/&gt;
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
    public static class RELATION
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
     *         &lt;element name="CODE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="AMB"/&gt;
     *               &lt;enumeration value="BRIG"/&gt;
     *               &lt;enumeration value="CAPT"/&gt;
     *               &lt;enumeration value="COLO"/&gt;
     *               &lt;enumeration value="DR"/&gt;
     *               &lt;enumeration value="DRMR"/&gt;
     *               &lt;enumeration value="DRMS"/&gt;
     *               &lt;enumeration value="FR"/&gt;
     *               &lt;enumeration value="GENE"/&gt;
     *               &lt;enumeration value="HE"/&gt;
     *               &lt;enumeration value="HEE"/&gt;
     *               &lt;enumeration value="HH"/&gt;
     *               &lt;enumeration value="HON"/&gt;
     *               &lt;enumeration value="HRH"/&gt;
     *               &lt;enumeration value="JUD"/&gt;
     *               &lt;enumeration value="JUG"/&gt;
     *               &lt;enumeration value="JUSTICE"/&gt;
     *               &lt;enumeration value="LADY"/&gt;
     *               &lt;enumeration value="LORD"/&gt;
     *               &lt;enumeration value="MDM"/&gt;
     *               &lt;enumeration value="MI"/&gt;
     *               &lt;enumeration value="MISS"/&gt;
     *               &lt;enumeration value="MIST"/&gt;
     *               &lt;enumeration value="MR"/&gt;
     *               &lt;enumeration value="MRDR"/&gt;
     *               &lt;enumeration value="MRPROF"/&gt;
     *               &lt;enumeration value="MRPROFDR"/&gt;
     *               &lt;enumeration value="MRS"/&gt;
     *               &lt;enumeration value="MRSDR"/&gt;
     *               &lt;enumeration value="MRSPROF"/&gt;
     *               &lt;enumeration value="MRSPROFDR"/&gt;
     *               &lt;enumeration value="MS"/&gt;
     *               &lt;enumeration value="MSPROFDR"/&gt;
     *               &lt;enumeration value="MSPROF"/&gt;
     *               &lt;enumeration value="MSTR"/&gt;
     *               &lt;enumeration value="MTR"/&gt;
     *               &lt;enumeration value="PRMR"/&gt;
     *               &lt;enumeration value="PRMS"/&gt;
     *               &lt;enumeration value="PROF"/&gt;
     *               &lt;enumeration value="RABB"/&gt;
     *               &lt;enumeration value="REV"/&gt;
     *               &lt;enumeration value="SEN"/&gt;
     *               &lt;enumeration value="SHAK"/&gt;
     *               &lt;enumeration value="SHEK"/&gt;
     *               &lt;enumeration value="SHK"/&gt;
     *               &lt;enumeration value="SHKA"/&gt;
     *               &lt;enumeration value="SIR"/&gt;
     *               &lt;enumeration value="SR"/&gt;
     *               &lt;enumeration value=""/&gt;
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
    public static class TITLE
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
