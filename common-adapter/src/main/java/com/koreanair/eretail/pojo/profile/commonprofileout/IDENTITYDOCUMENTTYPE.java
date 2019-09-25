
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The identity document information type.
 * 
 * <p>Java class for IDENTITY_DOCUMENT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDENTITY_DOCUMENT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IDENTITY_DOCUMENT_ID" type="{}STRING_TYPE_APIS_PFIELD"/&gt;
 *         &lt;element name="DOCUMENT_TYPE" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="DOCUMENT_NUMBER" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="ISSUING_COUNTRY" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="NATIONALITY" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="DATE_OF_BIRTH" type="{}DATE_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="GENDER" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="FIRST_NAME" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="LAST_NAME" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="LAST_NAME2" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="MIDDLE_NAME" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="CONSENT_GIVEN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_PASSPORT_HOLDER" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="PLACE_OF_ISSUING" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="ISSUE_DATE" type="{}DATE_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="APPLICABLE_COUNTRY" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="PLACE_OF_BIRTH" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="MISCELLANEOUS" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORY" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="SEQNO" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="SCOPE" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDENTITY_DOCUMENT_TYPE", propOrder = {

})
public class IDENTITYDOCUMENTTYPE
    implements Serializable
{

    @XmlElement(name = "IDENTITY_DOCUMENT_ID", required = true)
    protected STRINGTYPEAPISPFIELD identitydocumentid;
    @XmlElement(name = "DOCUMENT_TYPE")
    protected STRINGTYPEAPISPFIELD documenttype;
    @XmlElement(name = "DOCUMENT_NUMBER")
    protected STRINGTYPEAPISPFIELD documentnumber;
    @XmlElement(name = "ISSUING_COUNTRY")
    protected STRINGTYPEAPISPFIELD issuingcountry;
    @XmlElement(name = "NATIONALITY")
    protected STRINGTYPEAPISPFIELD nationality;
    @XmlElement(name = "DATE_OF_BIRTH")
    protected DATETYPEAPISPFIELD dateofbirth;
    @XmlElement(name = "GENDER")
    protected STRINGTYPEAPISPFIELD gender;
    @XmlElement(name = "EXPIRY_DATE")
    protected DATETYPEAPISPFIELD expirydate;
    @XmlElement(name = "FIRST_NAME")
    protected STRINGTYPEAPISPFIELD firstname;
    @XmlElement(name = "LAST_NAME")
    protected STRINGTYPEAPISPFIELD lastname;
    @XmlElement(name = "LAST_NAME2")
    protected STRINGTYPEAPISPFIELD lastname2;
    @XmlElement(name = "MIDDLE_NAME")
    protected STRINGTYPEAPISPFIELD middlename;
    @XmlElement(name = "CONSENT_GIVEN")
    protected Boolean consentgiven;
    @XmlElement(name = "IS_PASSPORT_HOLDER")
    protected STRINGTYPEAPISPFIELD ispassportholder;
    @XmlElement(name = "PLACE_OF_ISSUING")
    protected STRINGTYPEAPISPFIELD placeofissuing;
    @XmlElement(name = "ISSUE_DATE")
    protected DATETYPEAPISPFIELD issuedate;
    @XmlElement(name = "APPLICABLE_COUNTRY")
    protected STRINGTYPEAPISPFIELD applicablecountry;
    @XmlElement(name = "PLACE_OF_BIRTH")
    protected STRINGTYPEAPISPFIELD placeofbirth;
    @XmlElement(name = "MISCELLANEOUS")
    protected STRINGTYPEPFIELD miscellaneous;
    @XmlElement(name = "CATEGORY")
    protected STRINGTYPEPFIELD category;
    @XmlElement(name = "SEQNO")
    protected STRINGTYPEPFIELD seqno;
    @XmlElement(name = "SCOPE")
    protected STRINGTYPEPFIELD scope;

    /**
     * Gets the value of the identitydocumentid property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getIDENTITYDOCUMENTID() {
        return identitydocumentid;
    }

    /**
     * Sets the value of the identitydocumentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setIDENTITYDOCUMENTID(STRINGTYPEAPISPFIELD value) {
        this.identitydocumentid = value;
    }

    /**
     * Gets the value of the documenttype property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getDOCUMENTTYPE() {
        return documenttype;
    }

    /**
     * Sets the value of the documenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setDOCUMENTTYPE(STRINGTYPEAPISPFIELD value) {
        this.documenttype = value;
    }

    /**
     * Gets the value of the documentnumber property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getDOCUMENTNUMBER() {
        return documentnumber;
    }

    /**
     * Sets the value of the documentnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setDOCUMENTNUMBER(STRINGTYPEAPISPFIELD value) {
        this.documentnumber = value;
    }

    /**
     * Gets the value of the issuingcountry property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getISSUINGCOUNTRY() {
        return issuingcountry;
    }

    /**
     * Sets the value of the issuingcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setISSUINGCOUNTRY(STRINGTYPEAPISPFIELD value) {
        this.issuingcountry = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getNATIONALITY() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setNATIONALITY(STRINGTYPEAPISPFIELD value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the dateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link DATETYPEAPISPFIELD }
     *     
     */
    public DATETYPEAPISPFIELD getDATEOFBIRTH() {
        return dateofbirth;
    }

    /**
     * Sets the value of the dateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATETYPEAPISPFIELD }
     *     
     */
    public void setDATEOFBIRTH(DATETYPEAPISPFIELD value) {
        this.dateofbirth = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getGENDER() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setGENDER(STRINGTYPEAPISPFIELD value) {
        this.gender = value;
    }

    /**
     * Gets the value of the expirydate property.
     * 
     * @return
     *     possible object is
     *     {@link DATETYPEAPISPFIELD }
     *     
     */
    public DATETYPEAPISPFIELD getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATETYPEAPISPFIELD }
     *     
     */
    public void setEXPIRYDATE(DATETYPEAPISPFIELD value) {
        this.expirydate = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getFIRSTNAME() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setFIRSTNAME(STRINGTYPEAPISPFIELD value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getLASTNAME() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setLASTNAME(STRINGTYPEAPISPFIELD value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the lastname2 property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getLASTNAME2() {
        return lastname2;
    }

    /**
     * Sets the value of the lastname2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setLASTNAME2(STRINGTYPEAPISPFIELD value) {
        this.lastname2 = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getMIDDLENAME() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setMIDDLENAME(STRINGTYPEAPISPFIELD value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the consentgiven property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCONSENTGIVEN() {
        return consentgiven;
    }

    /**
     * Sets the value of the consentgiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCONSENTGIVEN(Boolean value) {
        this.consentgiven = value;
    }

    /**
     * Gets the value of the ispassportholder property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getISPASSPORTHOLDER() {
        return ispassportholder;
    }

    /**
     * Sets the value of the ispassportholder property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setISPASSPORTHOLDER(STRINGTYPEAPISPFIELD value) {
        this.ispassportholder = value;
    }

    /**
     * Gets the value of the placeofissuing property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getPLACEOFISSUING() {
        return placeofissuing;
    }

    /**
     * Sets the value of the placeofissuing property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setPLACEOFISSUING(STRINGTYPEAPISPFIELD value) {
        this.placeofissuing = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link DATETYPEAPISPFIELD }
     *     
     */
    public DATETYPEAPISPFIELD getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATETYPEAPISPFIELD }
     *     
     */
    public void setISSUEDATE(DATETYPEAPISPFIELD value) {
        this.issuedate = value;
    }

    /**
     * Gets the value of the applicablecountry property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getAPPLICABLECOUNTRY() {
        return applicablecountry;
    }

    /**
     * Sets the value of the applicablecountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setAPPLICABLECOUNTRY(STRINGTYPEAPISPFIELD value) {
        this.applicablecountry = value;
    }

    /**
     * Gets the value of the placeofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getPLACEOFBIRTH() {
        return placeofbirth;
    }

    /**
     * Sets the value of the placeofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setPLACEOFBIRTH(STRINGTYPEAPISPFIELD value) {
        this.placeofbirth = value;
    }

    /**
     * Gets the value of the miscellaneous property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getMISCELLANEOUS() {
        return miscellaneous;
    }

    /**
     * Sets the value of the miscellaneous property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setMISCELLANEOUS(STRINGTYPEPFIELD value) {
        this.miscellaneous = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setCATEGORY(STRINGTYPEPFIELD value) {
        this.category = value;
    }

    /**
     * Gets the value of the seqno property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getSEQNO() {
        return seqno;
    }

    /**
     * Sets the value of the seqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setSEQNO(STRINGTYPEPFIELD value) {
        this.seqno = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getSCOPE() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setSCOPE(STRINGTYPEPFIELD value) {
        this.scope = value;
    }

}
