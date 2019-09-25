
package com.koreanair.eretail.pojo.tripplan.common.common_document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.tripplan.common.common_air_pricing.TicketType;
import com.koreanair.eretail.pojo.tripplan.common.common_fare.Currency;
import com.koreanair.eretail.pojo.tripplan.common.common_price.AmountType;


/**
 * <p>Java class for listETicketRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listETicketRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DOCUMENT_NUMBER" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER_LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IS_INTERNATIONAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOUR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRICE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AMOUNT_TYPE" type="{}amount_type"/&gt;
 *                   &lt;element name="BASE_FARE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="TAX_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_TAX" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TAX_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="TAX_CODE" type="{}unprotectedStringType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CURRENCY" type="{}currency" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FARE_CALCULATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="FREQUENT_FLYER_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CONJUNCTION_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SETTLEMENT_AUTHORIZATION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="TICKET_DATA" type="{}ticketType" minOccurs="0"/&gt;
 *         &lt;element name="PNR_DATA" type="{}PnrDataType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_ELEMENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="FO_DETAIL" type="{}FO_Type" minOccurs="0"/&gt;
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
@XmlType(name = "listETicketRecord", propOrder = {
    "documentnumber",
    "travellerid",
    "travellerfirstname",
    "travellerlastname",
    "isinternational",
    "officeid",
    "tourcode",
    "listprice",
    "farecalculation",
    "frequentflyernumber",
    "conjunctionnumber",
    "settlementauthorization",
    "ticketdata",
    "pnrdata",
    "listfareelement"
})
public class ListETicketRecord
    implements Serializable
{

    @XmlElement(name = "DOCUMENT_NUMBER", required = true)
    protected String documentnumber;
    @XmlElement(name = "TRAVELLER_ID")
    protected BigInteger travellerid;
    @XmlElement(name = "TRAVELLER_FIRST_NAME")
    protected String travellerfirstname;
    @XmlElement(name = "TRAVELLER_LAST_NAME")
    protected String travellerlastname;
    @XmlElement(name = "IS_INTERNATIONAL")
    protected Boolean isinternational;
    @XmlElement(name = "OFFICE_ID")
    protected String officeid;
    @XmlElement(name = "TOUR_CODE")
    protected String tourcode;
    @XmlElement(name = "LIST_PRICE")
    protected List<ListETicketRecord.LISTPRICE> listprice;
    @XmlElement(name = "FARE_CALCULATION")
    protected String farecalculation;
    @XmlElement(name = "FREQUENT_FLYER_NUMBER")
    protected String frequentflyernumber;
    @XmlElement(name = "CONJUNCTION_NUMBER")
    protected String conjunctionnumber;
    @XmlElement(name = "SETTLEMENT_AUTHORIZATION")
    protected String settlementauthorization;
    @XmlElement(name = "TICKET_DATA")
    protected TicketType ticketdata;
    @XmlElement(name = "PNR_DATA")
    protected PnrDataType pnrdata;
    @XmlElement(name = "LIST_FARE_ELEMENT")
    protected List<ListETicketRecord.LISTFAREELEMENT> listfareelement;

    /**
     * Gets the value of the documentnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTNUMBER() {
        return documentnumber;
    }

    /**
     * Sets the value of the documentnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTNUMBER(String value) {
        this.documentnumber = value;
    }

    /**
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRAVELLERID(BigInteger value) {
        this.travellerid = value;
    }

    /**
     * Gets the value of the travellerfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERFIRSTNAME() {
        return travellerfirstname;
    }

    /**
     * Sets the value of the travellerfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERFIRSTNAME(String value) {
        this.travellerfirstname = value;
    }

    /**
     * Gets the value of the travellerlastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAVELLERLASTNAME() {
        return travellerlastname;
    }

    /**
     * Sets the value of the travellerlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAVELLERLASTNAME(String value) {
        this.travellerlastname = value;
    }

    /**
     * Gets the value of the isinternational property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISINTERNATIONAL() {
        return isinternational;
    }

    /**
     * Sets the value of the isinternational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISINTERNATIONAL(Boolean value) {
        this.isinternational = value;
    }

    /**
     * Gets the value of the officeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFICEID() {
        return officeid;
    }

    /**
     * Sets the value of the officeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFICEID(String value) {
        this.officeid = value;
    }

    /**
     * Gets the value of the tourcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOURCODE() {
        return tourcode;
    }

    /**
     * Sets the value of the tourcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOURCODE(String value) {
        this.tourcode = value;
    }

    /**
     * Gets the value of the listprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListETicketRecord.LISTPRICE }
     * 
     * 
     */
    public List<ListETicketRecord.LISTPRICE> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<ListETicketRecord.LISTPRICE>();
        }
        return this.listprice;
    }

    /**
     * Gets the value of the farecalculation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARECALCULATION() {
        return farecalculation;
    }

    /**
     * Sets the value of the farecalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARECALCULATION(String value) {
        this.farecalculation = value;
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
     * Gets the value of the conjunctionnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONJUNCTIONNUMBER() {
        return conjunctionnumber;
    }

    /**
     * Sets the value of the conjunctionnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONJUNCTIONNUMBER(String value) {
        this.conjunctionnumber = value;
    }

    /**
     * Gets the value of the settlementauthorization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSETTLEMENTAUTHORIZATION() {
        return settlementauthorization;
    }

    /**
     * Sets the value of the settlementauthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSETTLEMENTAUTHORIZATION(String value) {
        this.settlementauthorization = value;
    }

    /**
     * Gets the value of the ticketdata property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType }
     *     
     */
    public TicketType getTICKETDATA() {
        return ticketdata;
    }

    /**
     * Sets the value of the ticketdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType }
     *     
     */
    public void setTICKETDATA(TicketType value) {
        this.ticketdata = value;
    }

    /**
     * Gets the value of the pnrdata property.
     * 
     * @return
     *     possible object is
     *     {@link PnrDataType }
     *     
     */
    public PnrDataType getPNRDATA() {
        return pnrdata;
    }

    /**
     * Sets the value of the pnrdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnrDataType }
     *     
     */
    public void setPNRDATA(PnrDataType value) {
        this.pnrdata = value;
    }

    /**
     * Gets the value of the listfareelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListETicketRecord.LISTFAREELEMENT }
     * 
     * 
     */
    public List<ListETicketRecord.LISTFAREELEMENT> getLISTFAREELEMENT() {
        if (listfareelement == null) {
            listfareelement = new ArrayList<ListETicketRecord.LISTFAREELEMENT>();
        }
        return this.listfareelement;
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
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="FO_DETAIL" type="{}FO_Type" minOccurs="0"/&gt;
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
        "value",
        "type",
        "fodetail"
    })
    public static class LISTFAREELEMENT
        implements Serializable
    {

        @XmlElement(name = "VALUE", required = true)
        protected String value;
        @XmlElement(name = "TYPE", required = true)
        protected String type;
        @XmlElement(name = "FO_DETAIL")
        protected FOType fodetail;

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
         * Gets the value of the fodetail property.
         * 
         * @return
         *     possible object is
         *     {@link FOType }
         *     
         */
        public FOType getFODETAIL() {
            return fodetail;
        }

        /**
         * Sets the value of the fodetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link FOType }
         *     
         */
        public void setFODETAIL(FOType value) {
            this.fodetail = value;
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
     *         &lt;element name="AMOUNT_TYPE" type="{}amount_type"/&gt;
     *         &lt;element name="BASE_FARE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="TAX_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LIST_TAX" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TAX_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="TAX_CODE" type="{}unprotectedStringType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CURRENCY" type="{}currency" minOccurs="0"/&gt;
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
        "amounttype",
        "basefareamount",
        "taxamount",
        "totalamount",
        "listtax",
        "currency"
    })
    public static class LISTPRICE
        implements Serializable
    {

        @XmlElement(name = "AMOUNT_TYPE", required = true)
        @XmlSchemaType(name = "string")
        protected AmountType amounttype;
        @XmlElement(name = "BASE_FARE_AMOUNT")
        protected BigDecimal basefareamount;
        @XmlElement(name = "TAX_AMOUNT")
        protected BigDecimal taxamount;
        @XmlElement(name = "TOTAL_AMOUNT")
        protected BigDecimal totalamount;
        @XmlElement(name = "LIST_TAX")
        protected List<ListETicketRecord.LISTPRICE.LISTTAX> listtax;
        @XmlElement(name = "CURRENCY")
        protected Currency currency;

        /**
         * Gets the value of the amounttype property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getAMOUNTTYPE() {
            return amounttype;
        }

        /**
         * Sets the value of the amounttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setAMOUNTTYPE(AmountType value) {
            this.amounttype = value;
        }

        /**
         * Gets the value of the basefareamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBASEFAREAMOUNT() {
            return basefareamount;
        }

        /**
         * Sets the value of the basefareamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBASEFAREAMOUNT(BigDecimal value) {
            this.basefareamount = value;
        }

        /**
         * Gets the value of the taxamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTAXAMOUNT() {
            return taxamount;
        }

        /**
         * Sets the value of the taxamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTAXAMOUNT(BigDecimal value) {
            this.taxamount = value;
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
         * Gets the value of the listtax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTAX().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListETicketRecord.LISTPRICE.LISTTAX }
         * 
         * 
         */
        public List<ListETicketRecord.LISTPRICE.LISTTAX> getLISTTAX() {
            if (listtax == null) {
                listtax = new ArrayList<ListETicketRecord.LISTPRICE.LISTTAX>();
            }
            return this.listtax;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link Currency }
         *     
         */
        public Currency getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link Currency }
         *     
         */
        public void setCURRENCY(Currency value) {
            this.currency = value;
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
         *         &lt;element name="TAX_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="TAX_CODE" type="{}unprotectedStringType"/&gt;
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
            "taxamount",
            "taxcode"
        })
        public static class LISTTAX
            implements Serializable
        {

            @XmlElement(name = "TAX_AMOUNT")
            protected BigDecimal taxamount;
            @XmlElement(name = "TAX_CODE", required = true)
            protected String taxcode;

            /**
             * Gets the value of the taxamount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTAXAMOUNT() {
                return taxamount;
            }

            /**
             * Sets the value of the taxamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTAXAMOUNT(BigDecimal value) {
                this.taxamount = value;
            }

            /**
             * Gets the value of the taxcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTAXCODE() {
                return taxcode;
            }

            /**
             * Sets the value of the taxcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTAXCODE(String value) {
                this.taxcode = value;
            }

        }

    }

}
