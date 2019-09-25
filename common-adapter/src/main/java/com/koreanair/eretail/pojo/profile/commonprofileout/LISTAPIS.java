
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="APIS_TARGET_ID" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="APIS_TARGET_TYPE" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="APIS_TARGET_CODE" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY_CODE" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PSPT_ID" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="VISA_ID" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESS_TYPE" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESS_ID" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="RESIDENCE_ADDRESS_ID" type="{}STRING_TYPE_PFIELD" minOccurs="0"/&gt;
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
@XmlRootElement(name = "LIST_APIS")
public class LISTAPIS
    implements Serializable
{

    @XmlElement(name = "APIS_TARGET_ID")
    protected STRINGTYPEPFIELD apistargetid;
    @XmlElement(name = "APIS_TARGET_TYPE")
    protected STRINGTYPEPFIELD apistargettype;
    @XmlElement(name = "APIS_TARGET_CODE")
    protected STRINGTYPEPFIELD apistargetcode;
    @XmlElement(name = "COUNTRY_CODE")
    protected STRINGTYPEPFIELD countrycode;
    @XmlElement(name = "SEGMENT_ID")
    protected BigInteger segmentid;
    @XmlElement(name = "PSPT_ID")
    protected STRINGTYPEPFIELD psptid;
    @XmlElement(name = "VISA_ID")
    protected STRINGTYPEPFIELD visaid;
    @XmlElement(name = "ADDRESS_TYPE")
    protected STRINGTYPEPFIELD addresstype;
    @XmlElement(name = "ADDRESS_ID")
    protected STRINGTYPEPFIELD addressid;
    @XmlElement(name = "RESIDENCE_ADDRESS_ID")
    protected STRINGTYPEPFIELD residenceaddressid;

    /**
     * Gets the value of the apistargetid property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getAPISTARGETID() {
        return apistargetid;
    }

    /**
     * Sets the value of the apistargetid property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setAPISTARGETID(STRINGTYPEPFIELD value) {
        this.apistargetid = value;
    }

    /**
     * Gets the value of the apistargettype property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getAPISTARGETTYPE() {
        return apistargettype;
    }

    /**
     * Sets the value of the apistargettype property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setAPISTARGETTYPE(STRINGTYPEPFIELD value) {
        this.apistargettype = value;
    }

    /**
     * Gets the value of the apistargetcode property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getAPISTARGETCODE() {
        return apistargetcode;
    }

    /**
     * Sets the value of the apistargetcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setAPISTARGETCODE(STRINGTYPEPFIELD value) {
        this.apistargetcode = value;
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
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSEGMENTID(BigInteger value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the psptid property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getPSPTID() {
        return psptid;
    }

    /**
     * Sets the value of the psptid property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setPSPTID(STRINGTYPEPFIELD value) {
        this.psptid = value;
    }

    /**
     * Gets the value of the visaid property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getVISAID() {
        return visaid;
    }

    /**
     * Sets the value of the visaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setVISAID(STRINGTYPEPFIELD value) {
        this.visaid = value;
    }

    /**
     * Gets the value of the addresstype property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getADDRESSTYPE() {
        return addresstype;
    }

    /**
     * Sets the value of the addresstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setADDRESSTYPE(STRINGTYPEPFIELD value) {
        this.addresstype = value;
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
     * Gets the value of the residenceaddressid property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public STRINGTYPEPFIELD getRESIDENCEADDRESSID() {
        return residenceaddressid;
    }

    /**
     * Sets the value of the residenceaddressid property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEPFIELD }
     *     
     */
    public void setRESIDENCEADDRESSID(STRINGTYPEPFIELD value) {
        this.residenceaddressid = value;
    }

}
