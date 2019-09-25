
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The type to reuse for all discount cards
 * 
 * <p>Java class for DISCOUNT_CARD_COMPLEX_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DISCOUNT_CARD_COMPLEX_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="DISCOUNT_CARD_TYPE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="IS_SELECTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="EXPIRY_DATE" type="{}DATE_TYPE_PROFILE" minOccurs="0"/&gt;
 *         &lt;element name="COMPANY_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DISCOUNT_CARD_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISCOUNT_CARD_COMPLEX_TYPE", propOrder = {

})
public class DISCOUNTCARDCOMPLEXTYPE
    implements Serializable
{

    @XmlElement(name = "DISCOUNT_CARD_TYPE")
    protected String discountcardtype;
    @XmlElement(name = "IS_SELECTED")
    protected Boolean isselected;
    @XmlElement(name = "DISCOUNT_CARD_ID", required = true)
    protected BigInteger discountcardid;
    @XmlElement(name = "EXPIRY_DATE")
    protected DATETYPEPROFILE expirydate;
    @XmlElement(name = "COMPANY_INFORMATION")
    protected DISCOUNTCARDCOMPLEXTYPE.COMPANYINFORMATION companyinformation;
    @XmlElement(name = "DISCOUNT_CARD_LEVEL")
    protected String discountcardlevel;

    /**
     * Gets the value of the discountcardtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTCARDTYPE() {
        return discountcardtype;
    }

    /**
     * Sets the value of the discountcardtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTCARDTYPE(String value) {
        this.discountcardtype = value;
    }

    /**
     * Gets the value of the isselected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISSELECTED() {
        return isselected;
    }

    /**
     * Sets the value of the isselected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISSELECTED(Boolean value) {
        this.isselected = value;
    }

    /**
     * Gets the value of the discountcardid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDISCOUNTCARDID() {
        return discountcardid;
    }

    /**
     * Sets the value of the discountcardid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDISCOUNTCARDID(BigInteger value) {
        this.discountcardid = value;
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
     * Gets the value of the companyinformation property.
     * 
     * @return
     *     possible object is
     *     {@link DISCOUNTCARDCOMPLEXTYPE.COMPANYINFORMATION }
     *     
     */
    public DISCOUNTCARDCOMPLEXTYPE.COMPANYINFORMATION getCOMPANYINFORMATION() {
        return companyinformation;
    }

    /**
     * Sets the value of the companyinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOUNTCARDCOMPLEXTYPE.COMPANYINFORMATION }
     *     
     */
    public void setCOMPANYINFORMATION(DISCOUNTCARDCOMPLEXTYPE.COMPANYINFORMATION value) {
        this.companyinformation = value;
    }

    /**
     * Gets the value of the discountcardlevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISCOUNTCARDLEVEL() {
        return discountcardlevel;
    }

    /**
     * Sets the value of the discountcardlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISCOUNTCARDLEVEL(String value) {
        this.discountcardlevel = value;
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
     *         &lt;element name="COMPANY_ACCOUNT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="ACCOUNT_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
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
    public static class COMPANYINFORMATION
        implements Serializable
    {

        @XmlElement(name = "COMPANY_ACCOUNT_ID")
        protected BigInteger companyaccountid;
        @XmlElement(name = "ACCOUNT_NUMBER")
        protected String accountnumber;
        @XmlElement(name = "COMPANY")
        protected CODENAMEPAIRTYPE company;

        /**
         * Gets the value of the companyaccountid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCOMPANYACCOUNTID() {
            return companyaccountid;
        }

        /**
         * Sets the value of the companyaccountid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCOMPANYACCOUNTID(BigInteger value) {
            this.companyaccountid = value;
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
         * Gets the value of the company property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAMEPAIRTYPE }
         *     
         */
        public CODENAMEPAIRTYPE getCOMPANY() {
            return company;
        }

        /**
         * Sets the value of the company property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAMEPAIRTYPE }
         *     
         */
        public void setCOMPANY(CODENAMEPAIRTYPE value) {
            this.company = value;
        }

    }

}
