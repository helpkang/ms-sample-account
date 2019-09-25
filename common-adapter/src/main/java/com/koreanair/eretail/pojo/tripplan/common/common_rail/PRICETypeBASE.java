
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.eretail.pojo.common.common.CurrencyType;


/**
 * Prices for one train offer. Up to two prices can be given. One is price that corresponds to requested traveller profile, the other is full fare.
 * 
 * <p>Java class for PRICE_Type_BASE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRICE_Type_BASE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="B_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="E_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}currencyType"/&gt;
 *         &lt;element name="NUMBER_OF_TRAVELLERS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TRAIN_COMPANY" type="{}TRAIN_COMPANY_Type" minOccurs="0"/&gt;
 *         &lt;element name="RATE_TYPE" type="{}TRAIN_RATE_TYPE_Type" minOccurs="0"/&gt;
 *         &lt;element name="RATE_SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRAIN_CABIN" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}TRAIN_CABIN_CODE_Type" minOccurs="0"/&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NEGOTIATED_RATE_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FARE_CLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRICE_Type_BASE", propOrder = {
    "bdate",
    "edate",
    "amount",
    "totalamount",
    "currency",
    "numberoftravellers",
    "traincompany",
    "ratetype",
    "ratesubtype",
    "traincabin",
    "negotiatedratecode",
    "fareclass"
})
@XmlSeeAlso({
    TRAVELLERPRICEType.class,
    TRAINPRICEBaseType.class
})
public class PRICETypeBASE
    implements Serializable
{

    @XmlElement(name = "B_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bdate;
    @XmlElement(name = "E_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar edate;
    @XmlElement(name = "AMOUNT", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "TOTAL_AMOUNT")
    protected BigDecimal totalamount;
    @XmlElement(name = "CURRENCY", required = true)
    protected CurrencyType currency;
    @XmlElement(name = "NUMBER_OF_TRAVELLERS")
    protected Integer numberoftravellers;
    @XmlElement(name = "TRAIN_COMPANY")
    protected TRAINCOMPANYType traincompany;
    @XmlElement(name = "RATE_TYPE")
    protected TRAINRATETYPEType ratetype;
    @XmlElement(name = "RATE_SUB_TYPE")
    protected String ratesubtype;
    @XmlElement(name = "TRAIN_CABIN")
    protected PRICETypeBASE.TRAINCABIN traincabin;
    @XmlElement(name = "NEGOTIATED_RATE_CODE")
    protected String negotiatedratecode;
    @XmlElement(name = "FARE_CLASS")
    protected String fareclass;

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBDATE(XMLGregorianCalendar value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEDATE(XMLGregorianCalendar value) {
        this.edate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNT(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the totalamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALAMOUNT() {
        return totalamount;
    }

    /**
     * Sets the value of the totalamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALAMOUNT(BigDecimal value) {
        this.totalamount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCURRENCY(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the numberoftravellers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUMBEROFTRAVELLERS() {
        return numberoftravellers;
    }

    /**
     * Sets the value of the numberoftravellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUMBEROFTRAVELLERS(Integer value) {
        this.numberoftravellers = value;
    }

    /**
     * Gets the value of the traincompany property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINCOMPANYType }
     *     
     */
    public TRAINCOMPANYType getTRAINCOMPANY() {
        return traincompany;
    }

    /**
     * Sets the value of the traincompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINCOMPANYType }
     *     
     */
    public void setTRAINCOMPANY(TRAINCOMPANYType value) {
        this.traincompany = value;
    }

    /**
     * Gets the value of the ratetype property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINRATETYPEType }
     *     
     */
    public TRAINRATETYPEType getRATETYPE() {
        return ratetype;
    }

    /**
     * Sets the value of the ratetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINRATETYPEType }
     *     
     */
    public void setRATETYPE(TRAINRATETYPEType value) {
        this.ratetype = value;
    }

    /**
     * Gets the value of the ratesubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATESUBTYPE() {
        return ratesubtype;
    }

    /**
     * Sets the value of the ratesubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATESUBTYPE(String value) {
        this.ratesubtype = value;
    }

    /**
     * Gets the value of the traincabin property.
     * 
     * @return
     *     possible object is
     *     {@link PRICETypeBASE.TRAINCABIN }
     *     
     */
    public PRICETypeBASE.TRAINCABIN getTRAINCABIN() {
        return traincabin;
    }

    /**
     * Sets the value of the traincabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICETypeBASE.TRAINCABIN }
     *     
     */
    public void setTRAINCABIN(PRICETypeBASE.TRAINCABIN value) {
        this.traincabin = value;
    }

    /**
     * Gets the value of the negotiatedratecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEGOTIATEDRATECODE() {
        return negotiatedratecode;
    }

    /**
     * Sets the value of the negotiatedratecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEGOTIATEDRATECODE(String value) {
        this.negotiatedratecode = value;
    }

    /**
     * Gets the value of the fareclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECLASS() {
        return fareclass;
    }

    /**
     * Sets the value of the fareclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECLASS(String value) {
        this.fareclass = value;
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
     *         &lt;element name="CODE" type="{}TRAIN_CABIN_CODE_Type" minOccurs="0"/&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "code",
        "name"
    })
    public static class TRAINCABIN
        implements Serializable
    {

        @XmlElement(name = "CODE")
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
