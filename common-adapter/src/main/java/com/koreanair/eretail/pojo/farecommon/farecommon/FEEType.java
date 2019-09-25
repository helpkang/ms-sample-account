
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FEE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}FEE_TYPE_Type"/&gt;
 *         &lt;element name="SUBTYPE" type="{}FEE_SUBTYPE_Type" minOccurs="0"/&gt;
 *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="CURRENCY" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *             &lt;element name="CURRENCY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="CURRENCY_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="FEE_ID" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FEE_CODE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_VALUE" type="{}FEE_VALUE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IS_PREVIOUS_FEE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="COMMAND" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TAX_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CALCULATION" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="OCCURRENCE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PAYER_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PASSENGERS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ELEMENT" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BALANCE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IS_MODIFIABLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PSR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TAX" type="{}LIST_TAX_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BIN_RANGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEE_Type", propOrder = {
    "type",
    "subtype",
    "state",
    "currency",
    "currencyname",
    "currencyid",
    "feeid",
    "feecode",
    "listvalue",
    "ispreviousfee",
    "command",
    "calculation",
    "occurrence",
    "payernumber",
    "passengers",
    "listsegment",
    "listelement",
    "balance",
    "ismodifiable",
    "psr",
    "listtax",
    "binrange"
})
@XmlSeeAlso({
    APPLICABLEFEEType.class
})
public class FEEType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected FEETYPEType type;
    @XmlElement(name = "SUBTYPE")
    protected FEESUBTYPEType subtype;
    @XmlElement(name = "STATE")
    protected String state;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "CURRENCY_NAME")
    protected String currencyname;
    @XmlElement(name = "CURRENCY_ID")
    protected Integer currencyid;
    @XmlElement(name = "FEE_ID")
    protected FEEType.FEEID feeid;
    @XmlElement(name = "FEE_CODE")
    protected FEEType.FEECODE feecode;
    @XmlElement(name = "LIST_VALUE")
    protected List<FEEVALUEType> listvalue;
    @XmlElement(name = "IS_PREVIOUS_FEE")
    protected Boolean ispreviousfee;
    @XmlElement(name = "COMMAND")
    protected FEEType.COMMAND command;
    @XmlElement(name = "CALCULATION")
    protected BigInteger calculation;
    @XmlElement(name = "OCCURRENCE")
    protected BigInteger occurrence;
    @XmlElement(name = "PAYER_NUMBER")
    protected Object payernumber;
    @XmlElement(name = "PASSENGERS")
    protected List<FEEType.PASSENGERS> passengers;
    @XmlElement(name = "LIST_SEGMENT")
    protected List<String> listsegment;
    @XmlElement(name = "LIST_ELEMENT")
    protected List<String> listelement;
    @XmlElement(name = "BALANCE")
    protected FEEType.BALANCE balance;
    @XmlElement(name = "IS_MODIFIABLE")
    protected Object ismodifiable;
    @XmlElement(name = "PSR")
    protected Object psr;
    @XmlElement(name = "LIST_TAX")
    protected List<LISTTAXType> listtax;
    @XmlElement(name = "BIN_RANGE")
    protected String binrange;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FEETYPEType }
     *     
     */
    public FEETYPEType getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEETYPEType }
     *     
     */
    public void setTYPE(FEETYPEType value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link FEESUBTYPEType }
     *     
     */
    public FEESUBTYPEType getSUBTYPE() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEESUBTYPEType }
     *     
     */
    public void setSUBTYPE(FEESUBTYPEType value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATE(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the currencyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYNAME() {
        return currencyname;
    }

    /**
     * Sets the value of the currencyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYNAME(String value) {
        this.currencyname = value;
    }

    /**
     * Gets the value of the currencyid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCURRENCYID() {
        return currencyid;
    }

    /**
     * Sets the value of the currencyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCURRENCYID(Integer value) {
        this.currencyid = value;
    }

    /**
     * Gets the value of the feeid property.
     * 
     * @return
     *     possible object is
     *     {@link FEEType.FEEID }
     *     
     */
    public FEEType.FEEID getFEEID() {
        return feeid;
    }

    /**
     * Sets the value of the feeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEEType.FEEID }
     *     
     */
    public void setFEEID(FEEType.FEEID value) {
        this.feeid = value;
    }

    /**
     * Gets the value of the feecode property.
     * 
     * @return
     *     possible object is
     *     {@link FEEType.FEECODE }
     *     
     */
    public FEEType.FEECODE getFEECODE() {
        return feecode;
    }

    /**
     * Sets the value of the feecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEEType.FEECODE }
     *     
     */
    public void setFEECODE(FEEType.FEECODE value) {
        this.feecode = value;
    }

    /**
     * Gets the value of the listvalue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listvalue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTVALUE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEEVALUEType }
     * 
     * 
     */
    public List<FEEVALUEType> getLISTVALUE() {
        if (listvalue == null) {
            listvalue = new ArrayList<FEEVALUEType>();
        }
        return this.listvalue;
    }

    /**
     * Gets the value of the ispreviousfee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPREVIOUSFEE() {
        return ispreviousfee;
    }

    /**
     * Sets the value of the ispreviousfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPREVIOUSFEE(Boolean value) {
        this.ispreviousfee = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link FEEType.COMMAND }
     *     
     */
    public FEEType.COMMAND getCOMMAND() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEEType.COMMAND }
     *     
     */
    public void setCOMMAND(FEEType.COMMAND value) {
        this.command = value;
    }

    /**
     * Gets the value of the calculation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCALCULATION() {
        return calculation;
    }

    /**
     * Sets the value of the calculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCALCULATION(BigInteger value) {
        this.calculation = value;
    }

    /**
     * Gets the value of the occurrence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOCCURRENCE() {
        return occurrence;
    }

    /**
     * Sets the value of the occurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOCCURRENCE(BigInteger value) {
        this.occurrence = value;
    }

    /**
     * Gets the value of the payernumber property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPAYERNUMBER() {
        return payernumber;
    }

    /**
     * Sets the value of the payernumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPAYERNUMBER(Object value) {
        this.payernumber = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPASSENGERS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEEType.PASSENGERS }
     * 
     * 
     */
    public List<FEEType.PASSENGERS> getPASSENGERS() {
        if (passengers == null) {
            passengers = new ArrayList<FEEType.PASSENGERS>();
        }
        return this.passengers;
    }

    /**
     * Gets the value of the listsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<String>();
        }
        return this.listsegment;
    }

    /**
     * Gets the value of the listelement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTELEMENT() {
        if (listelement == null) {
            listelement = new ArrayList<String>();
        }
        return this.listelement;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link FEEType.BALANCE }
     *     
     */
    public FEEType.BALANCE getBALANCE() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEEType.BALANCE }
     *     
     */
    public void setBALANCE(FEEType.BALANCE value) {
        this.balance = value;
    }

    /**
     * Gets the value of the ismodifiable property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISMODIFIABLE() {
        return ismodifiable;
    }

    /**
     * Sets the value of the ismodifiable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISMODIFIABLE(Object value) {
        this.ismodifiable = value;
    }

    /**
     * Gets the value of the psr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPSR() {
        return psr;
    }

    /**
     * Sets the value of the psr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPSR(Object value) {
        this.psr = value;
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
     * {@link LISTTAXType }
     * 
     * 
     */
    public List<LISTTAXType> getLISTTAX() {
        if (listtax == null) {
            listtax = new ArrayList<LISTTAXType>();
        }
        return this.listtax;
    }

    /**
     * Gets the value of the binrange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBINRANGE() {
        return binrange;
    }

    /**
     * Sets the value of the binrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBINRANGE(String value) {
        this.binrange = value;
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
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
        "value"
    })
    public static class BALANCE
        implements Serializable
    {

        @XmlElement(name = "VALUE", required = true)
        protected BigDecimal value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVALUE(BigDecimal value) {
            this.value = value;
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
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TAX_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "taxcode"
    })
    public static class COMMAND
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected BigInteger code;
        @XmlElement(name = "TAX_CODE")
        protected String taxcode;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCODE(BigInteger value) {
            this.code = value;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
    public static class FEECODE
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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "id",
        "type"
    })
    public static class FEEID
        implements Serializable
    {

        @XmlElement(name = "ID", required = true)
        protected Object id;
        @XmlElement(name = "TYPE", required = true)
        protected Object type;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setID(Object value) {
            this.id = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTYPE(Object value) {
            this.type = value;
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
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "number"
    })
    public static class PASSENGERS
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "NUMBER")
        protected String number;

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

    }

}
