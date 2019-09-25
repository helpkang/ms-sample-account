
package com.koreanair.eretail.pojo.profile.commonprofileout;

import java.io.Serializable;
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
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LIST_BOOKING_LIST_FORM_OF_PAYMENT"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CREDIT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FOP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYMENT_TYPE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="CODE"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{}unprotectedStringType"&gt;
 *                                   &lt;enumeration value="ACC"/&gt;
 *                                   &lt;enumeration value="CAC"/&gt;
 *                                   &lt;enumeration value="CASH"/&gt;
 *                                   &lt;enumeration value="CC"/&gt;
 *                                   &lt;enumeration value="2CC"/&gt;
 *                                   &lt;enumeration value="CON"/&gt;
 *                                   &lt;enumeration value="DP"/&gt;
 *                                   &lt;enumeration value="INV"/&gt;
 *                                   &lt;enumeration value="TTA"/&gt;
 *                                   &lt;enumeration value="CHK"/&gt;
 *                                   &lt;enumeration value="EC"/&gt;
 *                                   &lt;enumeration value="EXT"/&gt;
 *                                   &lt;enumeration value="CC_1"/&gt;
 *                                   &lt;enumeration value="CC_2"/&gt;
 *                                   &lt;enumeration value="CC_3"/&gt;
 *                                   &lt;enumeration value="GHOST_1"/&gt;
 *                                   &lt;enumeration value="DD"/&gt;
 *                                   &lt;enumeration value="PLCC"/&gt;
 *                                   &lt;enumeration value="VACC"/&gt;
 *                                   &lt;enumeration value="NONE"/&gt;
 *                                   &lt;enumeration value="LCC_1"/&gt;
 *                                   &lt;enumeration value="INS_1"/&gt;
 *                                   &lt;enumeration value="ALLINC"/&gt;
 *                                   &lt;enumeration value="DBI"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
    "type",
    "listbookinglistformofpayment"
})
@XmlRootElement(name = "LIST_BOOKING_PAYMENT_INFORMATION")
public class LISTBOOKINGPAYMENTINFORMATION
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "LIST_BOOKING_LIST_FORM_OF_PAYMENT", required = true)
    protected LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT listbookinglistformofpayment;

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
     * Gets the value of the listbookinglistformofpayment property.
     * 
     * @return
     *     possible object is
     *     {@link LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT }
     *     
     */
    public LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT getLISTBOOKINGLISTFORMOFPAYMENT() {
        return listbookinglistformofpayment;
    }

    /**
     * Sets the value of the listbookinglistformofpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT }
     *     
     */
    public void setLISTBOOKINGLISTFORMOFPAYMENT(LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT value) {
        this.listbookinglistformofpayment = value;
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
     *         &lt;element name="CREDIT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FOP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYMENT_TYPE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{}unprotectedStringType"&gt;
     *                         &lt;enumeration value="ACC"/&gt;
     *                         &lt;enumeration value="CAC"/&gt;
     *                         &lt;enumeration value="CASH"/&gt;
     *                         &lt;enumeration value="CC"/&gt;
     *                         &lt;enumeration value="2CC"/&gt;
     *                         &lt;enumeration value="CON"/&gt;
     *                         &lt;enumeration value="DP"/&gt;
     *                         &lt;enumeration value="INV"/&gt;
     *                         &lt;enumeration value="TTA"/&gt;
     *                         &lt;enumeration value="CHK"/&gt;
     *                         &lt;enumeration value="EC"/&gt;
     *                         &lt;enumeration value="EXT"/&gt;
     *                         &lt;enumeration value="CC_1"/&gt;
     *                         &lt;enumeration value="CC_2"/&gt;
     *                         &lt;enumeration value="CC_3"/&gt;
     *                         &lt;enumeration value="GHOST_1"/&gt;
     *                         &lt;enumeration value="DD"/&gt;
     *                         &lt;enumeration value="PLCC"/&gt;
     *                         &lt;enumeration value="VACC"/&gt;
     *                         &lt;enumeration value="NONE"/&gt;
     *                         &lt;enumeration value="LCC_1"/&gt;
     *                         &lt;enumeration value="INS_1"/&gt;
     *                         &lt;enumeration value="ALLINC"/&gt;
     *                         &lt;enumeration value="DBI"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/all&gt;
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
        "creditcardid",
        "fopid",
        "amount",
        "paymenttype"
    })
    public static class LISTBOOKINGLISTFORMOFPAYMENT
        implements Serializable
    {

        @XmlElement(name = "CREDIT_CARD_ID")
        protected String creditcardid;
        @XmlElement(name = "FOP_ID")
        protected String fopid;
        @XmlElement(name = "AMOUNT")
        protected String amount;
        @XmlElement(name = "PAYMENT_TYPE")
        protected LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT.PAYMENTTYPE paymenttype;

        /**
         * Gets the value of the creditcardid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCREDITCARDID() {
            return creditcardid;
        }

        /**
         * Sets the value of the creditcardid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCREDITCARDID(String value) {
            this.creditcardid = value;
        }

        /**
         * Gets the value of the fopid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFOPID() {
            return fopid;
        }

        /**
         * Sets the value of the fopid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFOPID(String value) {
            this.fopid = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMOUNT(String value) {
            this.amount = value;
        }

        /**
         * Gets the value of the paymenttype property.
         * 
         * @return
         *     possible object is
         *     {@link LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT.PAYMENTTYPE }
         *     
         */
        public LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT.PAYMENTTYPE getPAYMENTTYPE() {
            return paymenttype;
        }

        /**
         * Sets the value of the paymenttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT.PAYMENTTYPE }
         *     
         */
        public void setPAYMENTTYPE(LISTBOOKINGPAYMENTINFORMATION.LISTBOOKINGLISTFORMOFPAYMENT.PAYMENTTYPE value) {
            this.paymenttype = value;
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
         *         &lt;element name="CODE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{}unprotectedStringType"&gt;
         *               &lt;enumeration value="ACC"/&gt;
         *               &lt;enumeration value="CAC"/&gt;
         *               &lt;enumeration value="CASH"/&gt;
         *               &lt;enumeration value="CC"/&gt;
         *               &lt;enumeration value="2CC"/&gt;
         *               &lt;enumeration value="CON"/&gt;
         *               &lt;enumeration value="DP"/&gt;
         *               &lt;enumeration value="INV"/&gt;
         *               &lt;enumeration value="TTA"/&gt;
         *               &lt;enumeration value="CHK"/&gt;
         *               &lt;enumeration value="EC"/&gt;
         *               &lt;enumeration value="EXT"/&gt;
         *               &lt;enumeration value="CC_1"/&gt;
         *               &lt;enumeration value="CC_2"/&gt;
         *               &lt;enumeration value="CC_3"/&gt;
         *               &lt;enumeration value="GHOST_1"/&gt;
         *               &lt;enumeration value="DD"/&gt;
         *               &lt;enumeration value="PLCC"/&gt;
         *               &lt;enumeration value="VACC"/&gt;
         *               &lt;enumeration value="NONE"/&gt;
         *               &lt;enumeration value="LCC_1"/&gt;
         *               &lt;enumeration value="INS_1"/&gt;
         *               &lt;enumeration value="ALLINC"/&gt;
         *               &lt;enumeration value="DBI"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
        public static class PAYMENTTYPE
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

}
