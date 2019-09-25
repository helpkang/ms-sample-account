
package com.koreanair.eretail.pojo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;


/**
 * <p>Java class for TRAVEL_FUNDS_INFORMATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAVEL_FUNDS_INFORMATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECORD_LOCATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ACTIVE"/&gt;
 *               &lt;enumeration value="CANCELLED"/&gt;
 *               &lt;enumeration value="EXPIRED"/&gt;
 *               &lt;enumeration value="USED"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ISSUE_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="EXPIRY_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NAME_MATCH_ALGO_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_BALANCES" type="{}BalancesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAVEL_FUNDS_INFORMATIONType", propOrder = {
    "number",
    "recordlocator",
    "status",
    "issuedate",
    "expirydate",
    "firstname",
    "lastname",
    "namematchalgoid",
    "listbalances"
})
public class TRAVELFUNDSINFORMATIONType implements Serializable
{

    @XmlElement(name = "NUMBER")
    protected String number;
    @XmlElement(name = "RECORD_LOCATOR")
    protected String recordlocator;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "ISSUE_DATE")
    protected OutputDateType issuedate;
    @XmlElement(name = "EXPIRY_DATE")
    protected OutputDateType expirydate;
    @XmlElement(name = "FIRST_NAME")
    protected String firstname;
    @XmlElement(name = "LAST_NAME")
    protected String lastname;
    @XmlElement(name = "NAME_MATCH_ALGO_ID")
    protected String namematchalgoid;
    @XmlElement(name = "LIST_BALANCES")
    protected BalancesType listbalances;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMBER() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMBER(String value) {
        this.number = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the issuedate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getISSUEDATE() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setISSUEDATE(OutputDateType value) {
        this.issuedate = value;
    }

    /**
     * Gets the value of the expirydate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setEXPIRYDATE(OutputDateType value) {
        this.expirydate = value;
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
     * Gets the value of the namematchalgoid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMEMATCHALGOID() {
        return namematchalgoid;
    }

    /**
     * Sets the value of the namematchalgoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMEMATCHALGOID(String value) {
        this.namematchalgoid = value;
    }

    /**
     * Gets the value of the listbalances property.
     * 
     * @return
     *     possible object is
     *     {@link BalancesType }
     *     
     */
    public BalancesType getLISTBALANCES() {
        return listbalances;
    }

    /**
     * Sets the value of the listbalances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalancesType }
     *     
     */
    public void setLISTBALANCES(BalancesType value) {
        this.listbalances = value;
    }

}
