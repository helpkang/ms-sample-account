
package com.koreanair.external.eretail.vo.tripplan.payment_group;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHECK_INFORMATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHECK_INFORMATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CHECK_NUMBER" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="BANK_ACCOUNT_NUMBER" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="CODE_BANK" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="AGENCY" type="{}unprotectedStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHECK_INFORMATION_Type", propOrder = {
    "checknumber",
    "bankaccountnumber",
    "codebank",
    "agency"
})
public class CHECKINFORMATIONType implements Serializable
{

    @XmlElement(name = "CHECK_NUMBER", required = true)
    protected String checknumber;
    @XmlElement(name = "BANK_ACCOUNT_NUMBER", required = true)
    protected String bankaccountnumber;
    @XmlElement(name = "CODE_BANK", required = true)
    protected String codebank;
    @XmlElement(name = "AGENCY", required = true)
    protected String agency;

    /**
     * Gets the value of the checknumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKNUMBER() {
        return checknumber;
    }

    /**
     * Sets the value of the checknumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKNUMBER(String value) {
        this.checknumber = value;
    }

    /**
     * Gets the value of the bankaccountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKACCOUNTNUMBER() {
        return bankaccountnumber;
    }

    /**
     * Sets the value of the bankaccountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKACCOUNTNUMBER(String value) {
        this.bankaccountnumber = value;
    }

    /**
     * Gets the value of the codebank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEBANK() {
        return codebank;
    }

    /**
     * Sets the value of the codebank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEBANK(String value) {
        this.codebank = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGENCY() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGENCY(String value) {
        this.agency = value;
    }

}
