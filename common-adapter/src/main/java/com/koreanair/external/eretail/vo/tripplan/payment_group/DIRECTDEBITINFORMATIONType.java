
package com.koreanair.external.eretail.vo.tripplan.payment_group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DIRECT_DEBIT_INFORMATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIRECT_DEBIT_INFORMATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="COUNTRY" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ACCOUNT_HOLDER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BANK_ACCOUNT_INFORMATION"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INTERNATIONAL_BANK_ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "DIRECT_DEBIT_INFORMATION_Type", propOrder = {

})
public class DIRECTDEBITINFORMATIONType implements Serializable
{

    @XmlElement(name = "COUNTRY")
    protected DIRECTDEBITINFORMATIONType.COUNTRY country;
    @XmlElement(name = "ACCOUNT_HOLDER_NAME")
    protected String accountholdername;
    @XmlElement(name = "BANK_ACCOUNT_INFORMATION", required = true)
    protected DIRECTDEBITINFORMATIONType.BANKACCOUNTINFORMATION bankaccountinformation;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link DIRECTDEBITINFORMATIONType.COUNTRY }
     *     
     */
    public DIRECTDEBITINFORMATIONType.COUNTRY getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIRECTDEBITINFORMATIONType.COUNTRY }
     *     
     */
    public void setCOUNTRY(DIRECTDEBITINFORMATIONType.COUNTRY value) {
        this.country = value;
    }

    /**
     * Gets the value of the accountholdername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTHOLDERNAME() {
        return accountholdername;
    }

    /**
     * Sets the value of the accountholdername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTHOLDERNAME(String value) {
        this.accountholdername = value;
    }

    /**
     * Gets the value of the bankaccountinformation property.
     * 
     * @return
     *     possible object is
     *     {@link DIRECTDEBITINFORMATIONType.BANKACCOUNTINFORMATION }
     *     
     */
    public DIRECTDEBITINFORMATIONType.BANKACCOUNTINFORMATION getBANKACCOUNTINFORMATION() {
        return bankaccountinformation;
    }

    /**
     * Sets the value of the bankaccountinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DIRECTDEBITINFORMATIONType.BANKACCOUNTINFORMATION }
     *     
     */
    public void setBANKACCOUNTINFORMATION(DIRECTDEBITINFORMATIONType.BANKACCOUNTINFORMATION value) {
        this.bankaccountinformation = value;
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
     *         &lt;element name="INTERNATIONAL_BANK_ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_INFORMATION" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "internationalbankaccountnumber",
        "listinformation"
    })
    public static class BANKACCOUNTINFORMATION
        implements Serializable
    {

        @XmlElement(name = "INTERNATIONAL_BANK_ACCOUNT_NUMBER")
        protected String internationalbankaccountnumber;
        @XmlElement(name = "LIST_INFORMATION")
        protected List<DIRECTDEBITINFORMATIONType.BANKACCOUNTINFORMATION.LISTINFORMATION> listinformation;

        /**
         * Gets the value of the internationalbankaccountnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERNATIONALBANKACCOUNTNUMBER() {
            return internationalbankaccountnumber;
        }

        /**
         * Sets the value of the internationalbankaccountnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERNATIONALBANKACCOUNTNUMBER(String value) {
            this.internationalbankaccountnumber = value;
        }

        /**
         * Gets the value of the listinformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listinformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTINFORMATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DIRECTDEBITINFORMATIONType.BANKACCOUNTINFORMATION.LISTINFORMATION }
         * 
         * 
         */
        public List<DIRECTDEBITINFORMATIONType.BANKACCOUNTINFORMATION.LISTINFORMATION> getLISTINFORMATION() {
            if (listinformation == null) {
                listinformation = new ArrayList<DIRECTDEBITINFORMATIONType.BANKACCOUNTINFORMATION.LISTINFORMATION>();
            }
            return this.listinformation;
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
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "type",
            "value"
        })
        public static class LISTINFORMATION
            implements Serializable
        {

            @XmlElement(name = "TYPE", required = true)
            protected String type;
            @XmlElement(name = "VALUE", required = true)
            protected String value;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVALUE() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVALUE(String value) {
                this.value = value;
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
     *       &lt;all&gt;
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    public static class COUNTRY
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME")
        protected String name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODE(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAME(String value) {
            this.name = value;
        }

    }

}
