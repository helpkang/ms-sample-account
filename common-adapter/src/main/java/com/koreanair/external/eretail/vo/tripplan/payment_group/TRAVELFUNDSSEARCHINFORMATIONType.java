
package com.koreanair.external.eretail.vo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.OutputDateType;


/**
 * <p>Java class for TRAVEL_FUNDS_SEARCH_INFORMATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAVEL_FUNDS_SEARCH_INFORMATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RTF_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ETICKET_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECORD_LOCATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CREDIT_CARD_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CREDIT_CARD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VALIDATING_CARRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_FROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLIGHT_TO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FREQUENT_FLYER_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NEED_TO_FETCH_DATA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAVEL_FUNDS_SEARCH_INFORMATIONType", propOrder = {
    "rtfid",
    "eticketnumber",
    "recordlocator",
    "firstname",
    "lastname",
    "creditcardtype",
    "creditcardnumber",
    "validatingcarrier",
    "flightdate",
    "flightnumber",
    "flightfrom",
    "flightto",
    "frequentflyernumber",
    "needtofetchdata"
})
public class TRAVELFUNDSSEARCHINFORMATIONType implements Serializable
{

    @XmlElement(name = "RTF_ID")
    protected String rtfid;
    @XmlElement(name = "ETICKET_NUMBER")
    protected String eticketnumber;
    @XmlElement(name = "RECORD_LOCATOR")
    protected String recordlocator;
    @XmlElement(name = "FIRST_NAME")
    protected String firstname;
    @XmlElement(name = "LAST_NAME")
    protected String lastname;
    @XmlElement(name = "CREDIT_CARD_TYPE")
    protected String creditcardtype;
    @XmlElement(name = "CREDIT_CARD_NUMBER")
    protected String creditcardnumber;
    @XmlElement(name = "VALIDATING_CARRIER")
    protected String validatingcarrier;
    @XmlElement(name = "FLIGHT_DATE")
    protected OutputDateType flightdate;
    @XmlElement(name = "FLIGHT_NUMBER")
    protected String flightnumber;
    @XmlElement(name = "FLIGHT_FROM")
    protected String flightfrom;
    @XmlElement(name = "FLIGHT_TO")
    protected String flightto;
    @XmlElement(name = "FREQUENT_FLYER_NUMBER")
    protected String frequentflyernumber;
    @XmlElement(name = "NEED_TO_FETCH_DATA")
    protected Boolean needtofetchdata;

    /**
     * Gets the value of the rtfid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTFID() {
        return rtfid;
    }

    /**
     * Sets the value of the rtfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTFID(String value) {
        this.rtfid = value;
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
     * Gets the value of the recordlocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECORDLOCATOR() {
        return recordlocator;
    }

    /**
     * Sets the value of the recordlocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECORDLOCATOR(String value) {
        this.recordlocator = value;
    }

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
     * Gets the value of the creditcardtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITCARDTYPE() {
        return creditcardtype;
    }

    /**
     * Sets the value of the creditcardtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITCARDTYPE(String value) {
        this.creditcardtype = value;
    }

    /**
     * Gets the value of the creditcardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITCARDNUMBER() {
        return creditcardnumber;
    }

    /**
     * Sets the value of the creditcardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITCARDNUMBER(String value) {
        this.creditcardnumber = value;
    }

    /**
     * Gets the value of the validatingcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDATINGCARRIER() {
        return validatingcarrier;
    }

    /**
     * Sets the value of the validatingcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDATINGCARRIER(String value) {
        this.validatingcarrier = value;
    }

    /**
     * Gets the value of the flightdate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getFLIGHTDATE() {
        return flightdate;
    }

    /**
     * Sets the value of the flightdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setFLIGHTDATE(OutputDateType value) {
        this.flightdate = value;
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
     * Gets the value of the flightfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIGHTFROM() {
        return flightfrom;
    }

    /**
     * Sets the value of the flightfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIGHTFROM(String value) {
        this.flightfrom = value;
    }

    /**
     * Gets the value of the flightto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLIGHTTO() {
        return flightto;
    }

    /**
     * Sets the value of the flightto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLIGHTTO(String value) {
        this.flightto = value;
    }

    /**
     * Gets the value of the frequentflyernumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFREQUENTFLYERNUMBER() {
        return frequentflyernumber;
    }

    /**
     * Sets the value of the frequentflyernumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFREQUENTFLYERNUMBER(String value) {
        this.frequentflyernumber = value;
    }

    /**
     * Gets the value of the needtofetchdata property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNEEDTOFETCHDATA() {
        return needtofetchdata;
    }

    /**
     * Sets the value of the needtofetchdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNEEDTOFETCHDATA(Boolean value) {
        this.needtofetchdata = value;
    }

}
