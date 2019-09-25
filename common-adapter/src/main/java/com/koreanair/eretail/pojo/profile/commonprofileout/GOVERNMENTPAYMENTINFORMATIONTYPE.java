
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The type representing the government payment information
 * 
 * <p>Java class for GOVERNMENT_PAYMENT_INFORMATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GOVERNMENT_PAYMENT_INFORMATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="GOVERNMENT_PAYMENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOUNT_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACCOUNT_NUMBER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REFERENCE_LETTER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="NUMBER" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "GOVERNMENT_PAYMENT_INFORMATION_TYPE", propOrder = {

})
public class GOVERNMENTPAYMENTINFORMATIONTYPE
    implements Serializable
{

    @XmlElement(name = "GOVERNMENT_PAYMENT_ID")
    protected String governmentpaymentid;
    @XmlElement(name = "ACCOUNT_TYPE")
    protected String accounttype;
    @XmlElement(name = "ACCOUNT_NUMBER")
    protected String accountnumber;
    @XmlElement(name = "REFERENCE_LETTER")
    protected GOVERNMENTPAYMENTINFORMATIONTYPE.REFERENCELETTER referenceletter;

    /**
     * Gets the value of the governmentpaymentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGOVERNMENTPAYMENTID() {
        return governmentpaymentid;
    }

    /**
     * Sets the value of the governmentpaymentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGOVERNMENTPAYMENTID(String value) {
        this.governmentpaymentid = value;
    }

    /**
     * Gets the value of the accounttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTTYPE() {
        return accounttype;
    }

    /**
     * Sets the value of the accounttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTTYPE(String value) {
        this.accounttype = value;
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
     * Gets the value of the referenceletter property.
     * 
     * @return
     *     possible object is
     *     {@link GOVERNMENTPAYMENTINFORMATIONTYPE.REFERENCELETTER }
     *     
     */
    public GOVERNMENTPAYMENTINFORMATIONTYPE.REFERENCELETTER getREFERENCELETTER() {
        return referenceletter;
    }

    /**
     * Sets the value of the referenceletter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOVERNMENTPAYMENTINFORMATIONTYPE.REFERENCELETTER }
     *     
     */
    public void setREFERENCELETTER(GOVERNMENTPAYMENTINFORMATIONTYPE.REFERENCELETTER value) {
        this.referenceletter = value;
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
     *         &lt;element name="NUMBER" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="12"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
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
    public static class REFERENCELETTER
        implements Serializable
    {

        @XmlElement(name = "NUMBER")
        protected String number;
        @XmlElement(name = "DATE")
        protected DATETYPEPROFILE date;

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
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link DATETYPEPROFILE }
         *     
         */
        public DATETYPEPROFILE getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link DATETYPEPROFILE }
         *     
         */
        public void setDATE(DATETYPEPROFILE value) {
            this.date = value;
        }

    }

}
