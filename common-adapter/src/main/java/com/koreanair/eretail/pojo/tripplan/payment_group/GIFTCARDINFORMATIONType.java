
package com.koreanair.eretail.pojo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;


/**
 * <p>Java class for GIFTCARD_INFORMATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GIFTCARD_INFORMATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CARD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SECURITY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="LIST_BALANCES" type="{}BalancesType" minOccurs="0"/&gt;
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
@XmlType(name = "GIFTCARD_INFORMATIONType", propOrder = {
    "cardnumber",
    "securitycode",
    "status",
    "issuedate",
    "expirydate",
    "listbalances",
    "needtofetchdata"
})
public class GIFTCARDINFORMATIONType implements Serializable
{

    @XmlElement(name = "CARD_NUMBER", required = true)
    protected String cardnumber;
    @XmlElement(name = "SECURITY_CODE")
    protected String securitycode;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "ISSUE_DATE")
    protected OutputDateType issuedate;
    @XmlElement(name = "EXPIRY_DATE")
    protected OutputDateType expirydate;
    @XmlElement(name = "LIST_BALANCES")
    protected BalancesType listbalances;
    @XmlElement(name = "NEED_TO_FETCH_DATA")
    protected Boolean needtofetchdata;

    /**
     * Gets the value of the cardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNUMBER() {
        return cardnumber;
    }

    /**
     * Sets the value of the cardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNUMBER(String value) {
        this.cardnumber = value;
    }

    /**
     * Gets the value of the securitycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECURITYCODE() {
        return securitycode;
    }

    /**
     * Sets the value of the securitycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECURITYCODE(String value) {
        this.securitycode = value;
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
