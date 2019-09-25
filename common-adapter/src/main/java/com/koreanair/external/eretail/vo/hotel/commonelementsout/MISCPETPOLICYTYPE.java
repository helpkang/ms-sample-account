
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.external.eretail.vo.common.common.CurrencyType;
import com.koreanair.external.eretail.vo.hotel.common.CODENAMETYPESIMPLE;


/**
 * <p>Java class for MISC_PET_POLICY_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MISC_PET_POLICY_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="START_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="END_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ALLOWED" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *         &lt;element name="MAXIMUM_MEASURE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="UNIT" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{}CODE_NAME_TYPE_SIMPLE"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MAXIMUM_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_REFUNDABLE_DEPOSIT" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_NON_REFUNDABLE_FEE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
 *         &lt;element name="CHARGE_UNIT" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_TEXT" type="{}DESCRIPTION_FREETEXT_TEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MISC_PET_POLICY_TYPE", propOrder = {
    "startvaliditydate",
    "endvaliditydate",
    "allowed",
    "maximummeasure",
    "maximumquantity",
    "listrefundabledeposit",
    "listnonrefundablefee",
    "currency",
    "chargeunit",
    "listdescription"
})
public class MISCPETPOLICYTYPE
    implements Serializable
{

    @XmlElement(name = "START_VALIDITY_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startvaliditydate;
    @XmlElement(name = "END_VALIDITY_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endvaliditydate;
    @XmlElement(name = "ALLOWED")
    protected CODENAMETYPESIMPLE allowed;
    @XmlElement(name = "MAXIMUM_MEASURE")
    protected MISCPETPOLICYTYPE.MAXIMUMMEASURE maximummeasure;
    @XmlElement(name = "MAXIMUM_QUANTITY")
    protected String maximumquantity;
    @XmlElement(name = "LIST_REFUNDABLE_DEPOSIT")
    protected List<HTLPRICETYPE> listrefundabledeposit;
    @XmlElement(name = "LIST_NON_REFUNDABLE_FEE")
    protected List<HTLPRICETYPE> listnonrefundablefee;
    @XmlElement(name = "CURRENCY")
    protected CurrencyType currency;
    @XmlElement(name = "CHARGE_UNIT")
    protected CODENAMETYPESIMPLE chargeunit;
    @XmlElement(name = "LIST_DESCRIPTION")
    protected List<MISCPETPOLICYTYPE.LISTDESCRIPTION> listdescription;

    /**
     * Gets the value of the startvaliditydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTARTVALIDITYDATE() {
        return startvaliditydate;
    }

    /**
     * Sets the value of the startvaliditydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTARTVALIDITYDATE(XMLGregorianCalendar value) {
        this.startvaliditydate = value;
    }

    /**
     * Gets the value of the endvaliditydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getENDVALIDITYDATE() {
        return endvaliditydate;
    }

    /**
     * Sets the value of the endvaliditydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setENDVALIDITYDATE(XMLGregorianCalendar value) {
        this.endvaliditydate = value;
    }

    /**
     * Gets the value of the allowed property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public CODENAMETYPESIMPLE getALLOWED() {
        return allowed;
    }

    /**
     * Sets the value of the allowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public void setALLOWED(CODENAMETYPESIMPLE value) {
        this.allowed = value;
    }

    /**
     * Gets the value of the maximummeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MISCPETPOLICYTYPE.MAXIMUMMEASURE }
     *     
     */
    public MISCPETPOLICYTYPE.MAXIMUMMEASURE getMAXIMUMMEASURE() {
        return maximummeasure;
    }

    /**
     * Sets the value of the maximummeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISCPETPOLICYTYPE.MAXIMUMMEASURE }
     *     
     */
    public void setMAXIMUMMEASURE(MISCPETPOLICYTYPE.MAXIMUMMEASURE value) {
        this.maximummeasure = value;
    }

    /**
     * Gets the value of the maximumquantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXIMUMQUANTITY() {
        return maximumquantity;
    }

    /**
     * Sets the value of the maximumquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXIMUMQUANTITY(String value) {
        this.maximumquantity = value;
    }

    /**
     * Gets the value of the listrefundabledeposit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrefundabledeposit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREFUNDABLEDEPOSIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HTLPRICETYPE }
     * 
     * 
     */
    public List<HTLPRICETYPE> getLISTREFUNDABLEDEPOSIT() {
        if (listrefundabledeposit == null) {
            listrefundabledeposit = new ArrayList<HTLPRICETYPE>();
        }
        return this.listrefundabledeposit;
    }

    /**
     * Gets the value of the listnonrefundablefee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listnonrefundablefee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTNONREFUNDABLEFEE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HTLPRICETYPE }
     * 
     * 
     */
    public List<HTLPRICETYPE> getLISTNONREFUNDABLEFEE() {
        if (listnonrefundablefee == null) {
            listnonrefundablefee = new ArrayList<HTLPRICETYPE>();
        }
        return this.listnonrefundablefee;
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
     * Gets the value of the chargeunit property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public CODENAMETYPESIMPLE getCHARGEUNIT() {
        return chargeunit;
    }

    /**
     * Sets the value of the chargeunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public void setCHARGEUNIT(CODENAMETYPESIMPLE value) {
        this.chargeunit = value;
    }

    /**
     * Gets the value of the listdescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MISCPETPOLICYTYPE.LISTDESCRIPTION }
     * 
     * 
     */
    public List<MISCPETPOLICYTYPE.LISTDESCRIPTION> getLISTDESCRIPTION() {
        if (listdescription == null) {
            listdescription = new ArrayList<MISCPETPOLICYTYPE.LISTDESCRIPTION>();
        }
        return this.listdescription;
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
     *         &lt;element name="LIST_TEXT" type="{}DESCRIPTION_FREETEXT_TEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listtext"
    })
    public static class LISTDESCRIPTION
        implements Serializable
    {

        @XmlElement(name = "LIST_TEXT")
        protected List<DESCRIPTIONFREETEXTTEXTTYPE> listtext;

        /**
         * Gets the value of the listtext property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtext property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTEXT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DESCRIPTIONFREETEXTTEXTTYPE }
         * 
         * 
         */
        public List<DESCRIPTIONFREETEXTTEXTTYPE> getLISTTEXT() {
            if (listtext == null) {
                listtext = new ArrayList<DESCRIPTIONFREETEXTTEXTTYPE>();
            }
            return this.listtext;
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
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="UNIT" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}CODE_NAME_TYPE_SIMPLE"&gt;
     *               &lt;/extension&gt;
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
        "value",
        "unit"
    })
    public static class MAXIMUMMEASURE
        implements Serializable
    {

        @XmlElement(name = "VALUE")
        protected String value;
        @XmlElement(name = "UNIT")
        protected MISCPETPOLICYTYPE.MAXIMUMMEASURE.UNIT unit;

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
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link MISCPETPOLICYTYPE.MAXIMUMMEASURE.UNIT }
         *     
         */
        public MISCPETPOLICYTYPE.MAXIMUMMEASURE.UNIT getUNIT() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link MISCPETPOLICYTYPE.MAXIMUMMEASURE.UNIT }
         *     
         */
        public void setUNIT(MISCPETPOLICYTYPE.MAXIMUMMEASURE.UNIT value) {
            this.unit = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{}CODE_NAME_TYPE_SIMPLE"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UNIT
            extends CODENAMETYPESIMPLE
            implements Serializable
        {


        }

    }

}
