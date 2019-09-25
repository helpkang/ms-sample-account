
package com.koreanair.external.eretail.vo.tripplan.payment_group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.OutputDateType;
import com.koreanair.external.eretail.vo.profile.commonprofileout.CODENAMEPAIRTYPE;


/**
 * <p>Java class for CERTIFICATE_INFORMATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CERTIFICATE_INFORMATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;group ref="{}LOYALTY_ACCOUNT_Group"/&gt;
 *         &lt;element name="STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="AVAILABLE"/&gt;
 *               &lt;enumeration value="RESERVED"/&gt;
 *               &lt;enumeration value="EXPIRED"/&gt;
 *               &lt;enumeration value="USED"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ETICKET_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXPIRY_DATE" type="{}OutputDateType" minOccurs="0"/&gt;
 *         &lt;group ref="{}BOOK_BY_Group"/&gt;
 *         &lt;group ref="{}FLY_BY_Group"/&gt;
 *         &lt;element name="LIST_RBD" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IGNORE_APPLICABILITY_RULES" type="{}IGNORE_APPLICABILITY_RULES_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CERTIFICATE_INFORMATIONType", propOrder = {
    "identifier",
    "accountnumber",
    "company",
    "status",
    "eticketnumber",
    "expirydate",
    "bookbystartdate",
    "bookbyenddate",
    "flybystartdate",
    "flybyenddate",
    "flybyblackoutdates",
    "listrbd",
    "ignoreapplicabilityrules"
})
public class CERTIFICATEINFORMATIONType implements Serializable
{

    @XmlElement(name = "IDENTIFIER", required = true)
    protected String identifier;
    @XmlElement(name = "ACCOUNT_NUMBER", required = true)
    protected String accountnumber;
    @XmlElement(name = "COMPANY", required = true)
    protected CODENAMEPAIRTYPE company;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "ETICKET_NUMBER")
    protected String eticketnumber;
    @XmlElement(name = "EXPIRY_DATE")
    protected OutputDateType expirydate;
    @XmlElement(name = "BOOK_BY_START_DATE")
    protected OutputDateType bookbystartdate;
    @XmlElement(name = "BOOK_BY_END_DATE")
    protected OutputDateType bookbyenddate;
    @XmlElement(name = "FLY_BY_START_DATE")
    protected OutputDateType flybystartdate;
    @XmlElement(name = "FLY_BY_END_DATE")
    protected OutputDateType flybyenddate;
    @XmlElement(name = "FLY_BY_BLACKOUT_DATES")
    protected CERTIFICATEINFORMATIONType.FLYBYBLACKOUTDATES flybyblackoutdates;
    @XmlElement(name = "LIST_RBD")
    protected CERTIFICATEINFORMATIONType.LISTRBD listrbd;
    @XmlElement(name = "IGNORE_APPLICABILITY_RULES")
    protected IGNOREAPPLICABILITYRULESType ignoreapplicabilityrules;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFIER() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFIER(String value) {
        this.identifier = value;
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
     * Gets the value of the bookbystartdate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getBOOKBYSTARTDATE() {
        return bookbystartdate;
    }

    /**
     * Sets the value of the bookbystartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setBOOKBYSTARTDATE(OutputDateType value) {
        this.bookbystartdate = value;
    }

    /**
     * Gets the value of the bookbyenddate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getBOOKBYENDDATE() {
        return bookbyenddate;
    }

    /**
     * Sets the value of the bookbyenddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setBOOKBYENDDATE(OutputDateType value) {
        this.bookbyenddate = value;
    }

    /**
     * Gets the value of the flybystartdate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getFLYBYSTARTDATE() {
        return flybystartdate;
    }

    /**
     * Sets the value of the flybystartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setFLYBYSTARTDATE(OutputDateType value) {
        this.flybystartdate = value;
    }

    /**
     * Gets the value of the flybyenddate property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getFLYBYENDDATE() {
        return flybyenddate;
    }

    /**
     * Sets the value of the flybyenddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setFLYBYENDDATE(OutputDateType value) {
        this.flybyenddate = value;
    }

    /**
     * Gets the value of the flybyblackoutdates property.
     * 
     * @return
     *     possible object is
     *     {@link CERTIFICATEINFORMATIONType.FLYBYBLACKOUTDATES }
     *     
     */
    public CERTIFICATEINFORMATIONType.FLYBYBLACKOUTDATES getFLYBYBLACKOUTDATES() {
        return flybyblackoutdates;
    }

    /**
     * Sets the value of the flybyblackoutdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CERTIFICATEINFORMATIONType.FLYBYBLACKOUTDATES }
     *     
     */
    public void setFLYBYBLACKOUTDATES(CERTIFICATEINFORMATIONType.FLYBYBLACKOUTDATES value) {
        this.flybyblackoutdates = value;
    }

    /**
     * Gets the value of the listrbd property.
     * 
     * @return
     *     possible object is
     *     {@link CERTIFICATEINFORMATIONType.LISTRBD }
     *     
     */
    public CERTIFICATEINFORMATIONType.LISTRBD getLISTRBD() {
        return listrbd;
    }

    /**
     * Sets the value of the listrbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CERTIFICATEINFORMATIONType.LISTRBD }
     *     
     */
    public void setLISTRBD(CERTIFICATEINFORMATIONType.LISTRBD value) {
        this.listrbd = value;
    }

    /**
     * Gets the value of the ignoreapplicabilityrules property.
     * 
     * @return
     *     possible object is
     *     {@link IGNOREAPPLICABILITYRULESType }
     *     
     */
    public IGNOREAPPLICABILITYRULESType getIGNOREAPPLICABILITYRULES() {
        return ignoreapplicabilityrules;
    }

    /**
     * Sets the value of the ignoreapplicabilityrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link IGNOREAPPLICABILITYRULESType }
     *     
     */
    public void setIGNOREAPPLICABILITYRULES(IGNOREAPPLICABILITYRULESType value) {
        this.ignoreapplicabilityrules = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="BLACKOUT_DAY" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DATE" type="{}OutputDateType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "blackoutday"
    })
    public static class FLYBYBLACKOUTDATES
        implements Serializable
    {

        @XmlElement(name = "BLACKOUT_DAY")
        protected List<CERTIFICATEINFORMATIONType.FLYBYBLACKOUTDATES.BLACKOUTDAY> blackoutday;

        /**
         * Gets the value of the blackoutday property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blackoutday property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBLACKOUTDAY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CERTIFICATEINFORMATIONType.FLYBYBLACKOUTDATES.BLACKOUTDAY }
         * 
         * 
         */
        public List<CERTIFICATEINFORMATIONType.FLYBYBLACKOUTDATES.BLACKOUTDAY> getBLACKOUTDAY() {
            if (blackoutday == null) {
                blackoutday = new ArrayList<CERTIFICATEINFORMATIONType.FLYBYBLACKOUTDATES.BLACKOUTDAY>();
            }
            return this.blackoutday;
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
         *       &lt;sequence&gt;
         *         &lt;element name="DATE" type="{}OutputDateType"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "date"
        })
        public static class BLACKOUTDAY
            implements Serializable
        {

            @XmlElement(name = "DATE", required = true)
            protected OutputDateType date;

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link OutputDateType }
             *     
             */
            public OutputDateType getDATE() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link OutputDateType }
             *     
             */
            public void setDATE(OutputDateType value) {
                this.date = value;
            }

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
     *       &lt;sequence&gt;
     *         &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rbd"
    })
    public static class LISTRBD
        implements Serializable
    {

        @XmlElement(name = "RBD", required = true)
        protected List<String> rbd;

        /**
         * Gets the value of the rbd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rbd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRBD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRBD() {
            if (rbd == null) {
                rbd = new ArrayList<String>();
            }
            return this.rbd;
        }

    }

}
