
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The type representing addresses used in the user and traveler profiles
 * 
 * <p>Java class for ADDRESS_INFORMATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADDRESS_INFORMATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IS_STRUCTURED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EXT_VALIDATION_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUITE" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="STREET_NO" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="STREET_NO_SUFFIX" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="DIRECTION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" type="{}STRING_TYPE_PFIELD"/&gt;
 *                   &lt;element name="NAME" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PO_BOX" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="STATION" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="RR_NUMBER" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESS_ID" type="{}STRING_TYPE_PFIELD"/&gt;
 *         &lt;element name="TYPE" type="{}ADDRESS_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="LABEL" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="NAME" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="FIRST_ADDRESS_LINE" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="SECOND_ADDRESS_LINE" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="ZIP_CODE" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="CITY" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="STATE" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY_CODE" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="COMPANY_NAME" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="DEPARTMENT" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="SENDABLE" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="FIRST_NAME" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;restriction base="&lt;&gt;STRING_TYPE_PFIELD"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MIDDLE_NAME" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="LAST_NAME" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;restriction base="&lt;&gt;STRING_TYPE_PFIELD"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TITLE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;restriction base="&lt;&gt;UNPROTECTED_STRING_TYPE_PFIELD"&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TAX_PAYER_NUMBER" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADDRESS_INFORMATION_TYPE", propOrder = {

})
public class ADDRESSINFORMATIONTYPE
    implements Serializable
{

    @XmlElement(name = "IS_STRUCTURED")
    protected Boolean isstructured;
    @XmlElement(name = "EXT_VALIDATION_STATUS")
    protected String extvalidationstatus;
    @XmlElement(name = "SUITE")
    protected STRINGTYPEPFIELD suite;
    @XmlElement(name = "STREET_NO")
    protected STRINGTYPEPFIELD streetno;
    @XmlElement(name = "STREET_NO_SUFFIX")
    protected STRINGTYPEPFIELD streetnosuffix;
    @XmlElement(name = "DIRECTION")
    protected ADDRESSINFORMATIONTYPE.DIRECTION direction;
    @XmlElement(name = "PO_BOX")
    protected STRINGTYPEPFIELD pobox;
    @XmlElement(name = "STATION")
    protected STRINGTYPEPFIELD station;
    @XmlElement(name = "RR_NUMBER")
    protected STRINGTYPEPFIELD rrnumber;
    @XmlElement(name = "ADDRESS_ID", required = true)
    protected STRINGTYPEPFIELD addressid;
    @XmlElement(name = "TYPE")
    protected ADDRESSTYPEAPISPFIELD type;
    @XmlElement(name = "LABEL")
    protected STRINGTYPEPFIELD label;
    @XmlElement(name = "NAME")
    protected STRINGTYPEPFIELD name;
    @XmlElement(name = "FIRST_ADDRESS_LINE")
    protected STRINGTYPEAPISPFIELD firstaddressline;
    @XmlElement(name = "SECOND_ADDRESS_LINE")
    protected STRINGTYPEPFIELD secondaddressline;
    @XmlElement(name = "ZIP_CODE")
    protected STRINGTYPEAPISPFIELD zipcode;
    @XmlElement(name = "CITY")
    protected STRINGTYPEAPISPFIELD city;
    @XmlElement(name = "STATE")
    protected STRINGTYPEAPISPFIELD state;
    @XmlElement(name = "COUNTRY")
    protected STRINGTYPEAPISPFIELD country;
    @XmlElement(name = "COUNTRY_CODE")
    protected STRINGTYPEPFIELD countrycode;
    @XmlElement(name = "COMPANY_NAME")
    protected STRINGTYPEPFIELD companyname;
    @XmlElement(name = "DEPARTMENT")
    protected STRINGTYPEPFIELD department;
    @XmlElement(name = "SENDABLE")
    protected STRINGTYPEPFIELD sendable;
    @XmlElement(name = "FIRST_NAME")
    protected ADDRESSINFORMATIONTYPE.FIRSTNAME firstname;
    @XmlElement(name = "MIDDLE_NAME")
    protected STRINGTYPEPFIELD middlename;
    @XmlElement(name = "LAST_NAME")
    protected ADDRESSINFORMATIONTYPE.LASTNAME lastname;
    @XmlElement(name = "TITLE")
    protected ADDRESSINFORMATIONTYPE.TITLE title;
    @XmlElement(name = "TAX_PAYER_NUMBER")
    protected STRINGTYPEPFIELD taxpayernumber;

    /**
     * Gets the value of the isstructured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISSTRUCTURED() {
        return isstructured;
    }

    /**
     * Sets the value of the isstructured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISSTRUCTURED(Boolean value) {
        this.isstructured = value;
    }

    /**
     * Gets the value of the extvalidationstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTVALIDATIONSTATUS() {
        return extvalidationstatus;
    }

    /**
     * Sets the value of the extvalidationstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTVALIDATIONSTATUS(String value) {
        this.extvalidationstatus = value;
    }

    /**
     * Gets the value of the suite property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getSUITE() {
        return suite;
    }

    /**
     * Sets the value of the suite property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setSUITE(STRINGTYPEPFIELD value) {
        this.suite = value;
    }

    /**
     * Gets the value of the streetno property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getSTREETNO() {
        return streetno;
    }

    /**
     * Sets the value of the streetno property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setSTREETNO(STRINGTYPEPFIELD value) {
        this.streetno = value;
    }

    /**
     * Gets the value of the streetnosuffix property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getSTREETNOSUFFIX() {
        return streetnosuffix;
    }

    /**
     * Sets the value of the streetnosuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setSTREETNOSUFFIX(STRINGTYPEPFIELD value) {
        this.streetnosuffix = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESSINFORMATIONTYPE.DIRECTION }
     *     
     */
    public ADDRESSINFORMATIONTYPE.DIRECTION getDIRECTION() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESSINFORMATIONTYPE.DIRECTION }
     *     
     */
    public void setDIRECTION(ADDRESSINFORMATIONTYPE.DIRECTION value) {
        this.direction = value;
    }

    /**
     * Gets the value of the pobox property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getPOBOX() {
        return pobox;
    }

    /**
     * Sets the value of the pobox property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setPOBOX(STRINGTYPEPFIELD value) {
        this.pobox = value;
    }

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getSTATION() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setSTATION(STRINGTYPEPFIELD value) {
        this.station = value;
    }

    /**
     * Gets the value of the rrnumber property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getRRNUMBER() {
        return rrnumber;
    }

    /**
     * Sets the value of the rrnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setRRNUMBER(STRINGTYPEPFIELD value) {
        this.rrnumber = value;
    }

    /**
     * Gets the value of the addressid property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getADDRESSID() {
        return addressid;
    }

    /**
     * Sets the value of the addressid property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setADDRESSID(STRINGTYPEPFIELD value) {
        this.addressid = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESSTYPEAPISPFIELD }
     *     
     */
    public ADDRESSTYPEAPISPFIELD getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESSTYPEAPISPFIELD }
     *     
     */
    public void setTYPE(ADDRESSTYPEAPISPFIELD value) {
        this.type = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getLABEL() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setLABEL(STRINGTYPEPFIELD value) {
        this.label = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setNAME(STRINGTYPEPFIELD value) {
        this.name = value;
    }

    /**
     * Gets the value of the firstaddressline property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getFIRSTADDRESSLINE() {
        return firstaddressline;
    }

    /**
     * Sets the value of the firstaddressline property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setFIRSTADDRESSLINE(STRINGTYPEAPISPFIELD value) {
        this.firstaddressline = value;
    }

    /**
     * Gets the value of the secondaddressline property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getSECONDADDRESSLINE() {
        return secondaddressline;
    }

    /**
     * Sets the value of the secondaddressline property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setSECONDADDRESSLINE(STRINGTYPEPFIELD value) {
        this.secondaddressline = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getZIPCODE() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setZIPCODE(STRINGTYPEAPISPFIELD value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setCITY(STRINGTYPEAPISPFIELD value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setSTATE(STRINGTYPEAPISPFIELD value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setCOUNTRY(STRINGTYPEAPISPFIELD value) {
        this.country = value;
    }

    /**
     * Gets the value of the countrycode property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getCOUNTRYCODE() {
        return countrycode;
    }

    /**
     * Sets the value of the countrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setCOUNTRYCODE(STRINGTYPEPFIELD value) {
        this.countrycode = value;
    }

    /**
     * Gets the value of the companyname property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getCOMPANYNAME() {
        return companyname;
    }

    /**
     * Sets the value of the companyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setCOMPANYNAME(STRINGTYPEPFIELD value) {
        this.companyname = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getDEPARTMENT() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setDEPARTMENT(STRINGTYPEPFIELD value) {
        this.department = value;
    }

    /**
     * Gets the value of the sendable property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getSENDABLE() {
        return sendable;
    }

    /**
     * Sets the value of the sendable property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setSENDABLE(STRINGTYPEPFIELD value) {
        this.sendable = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESSINFORMATIONTYPE.FIRSTNAME }
     *     
     */
    public ADDRESSINFORMATIONTYPE.FIRSTNAME getFIRSTNAME() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESSINFORMATIONTYPE.FIRSTNAME }
     *     
     */
    public void setFIRSTNAME(ADDRESSINFORMATIONTYPE.FIRSTNAME value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getMIDDLENAME() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setMIDDLENAME(STRINGTYPEPFIELD value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESSINFORMATIONTYPE.LASTNAME }
     *     
     */
    public ADDRESSINFORMATIONTYPE.LASTNAME getLASTNAME() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESSINFORMATIONTYPE.LASTNAME }
     *     
     */
    public void setLASTNAME(ADDRESSINFORMATIONTYPE.LASTNAME value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESSINFORMATIONTYPE.TITLE }
     *     
     */
    public ADDRESSINFORMATIONTYPE.TITLE getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESSINFORMATIONTYPE.TITLE }
     *     
     */
    public void setTITLE(ADDRESSINFORMATIONTYPE.TITLE value) {
        this.title = value;
    }

    /**
     * Gets the value of the taxpayernumber property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getTAXPAYERNUMBER() {
        return taxpayernumber;
    }

    /**
     * Sets the value of the taxpayernumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setTAXPAYERNUMBER(STRINGTYPEPFIELD value) {
        this.taxpayernumber = value;
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
     *         &lt;element name="CODE" type="{}STRING_TYPE_PFIELD"/&gt;
     *         &lt;element name="NAME" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
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
    public static class DIRECTION
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected STRINGTYPEPFIELD code;
        @XmlElement(name = "NAME")
        protected STRINGTYPEPFIELD name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link STRINGTYPEPFIELD }
         *     
         */
        public STRINGTYPEPFIELD getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link STRINGTYPEPFIELD }
         *     
         */
        public void setCODE(STRINGTYPEPFIELD value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link STRINGTYPEPFIELD }
         *     
         */
        public STRINGTYPEPFIELD getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link STRINGTYPEPFIELD }
         *     
         */
        public void setNAME(STRINGTYPEPFIELD value) {
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
     *   &lt;simpleContent&gt;
     *     &lt;restriction base="&lt;&gt;STRING_TYPE_PFIELD"&gt;
     *     &lt;/restriction&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FIRSTNAME
        extends STRINGTYPEPFIELD
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
     *   &lt;simpleContent&gt;
     *     &lt;restriction base="&lt;&gt;STRING_TYPE_PFIELD"&gt;
     *     &lt;/restriction&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LASTNAME
        extends STRINGTYPEPFIELD
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
     *       &lt;all&gt;
     *         &lt;element name="CODE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;restriction base="&lt;&gt;UNPROTECTED_STRING_TYPE_PFIELD"&gt;
     *               &lt;/restriction&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NAME" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
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

        @XmlElement(name = "CODE")
        protected ADDRESSINFORMATIONTYPE.TITLE.CODE code;
        @XmlElement(name = "NAME")
        protected STRINGTYPEPFIELD name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link ADDRESSINFORMATIONTYPE.TITLE.CODE }
         *     
         */
        public ADDRESSINFORMATIONTYPE.TITLE.CODE getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link ADDRESSINFORMATIONTYPE.TITLE.CODE }
         *     
         */
        public void setCODE(ADDRESSINFORMATIONTYPE.TITLE.CODE value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link STRINGTYPEPFIELD }
         *     
         */
        public STRINGTYPEPFIELD getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link STRINGTYPEPFIELD }
         *     
         */
        public void setNAME(STRINGTYPEPFIELD value) {
            this.name = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;restriction base="&lt;&gt;UNPROTECTED_STRING_TYPE_PFIELD"&gt;
         *     &lt;/restriction&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CODE
            extends UNPROTECTEDSTRINGTYPEPFIELD
            implements Serializable
        {


        }

    }

}
