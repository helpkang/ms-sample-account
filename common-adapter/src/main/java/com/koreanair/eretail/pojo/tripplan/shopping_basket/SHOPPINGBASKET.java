
package com.koreanair.eretail.pojo.tripplan.shopping_basket;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.eretail.pojo.tripplan.common.common_shopping_basket.AGENT;
import com.koreanair.eretail.pojo.tripplan.common.common_shopping_basket.AMOUNT;
import com.koreanair.eretail.pojo.tripplan.common.common_shopping_basket.EXTERNALREFERENCE;


/**
 * <p>Java class for SHOPPING_BASKET complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SHOPPING_BASKET"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="DOSSIER_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="DOSSIER_MID_OFFICE_REFERENCE" type="{}EXTERNAL_REFERENCE" minOccurs="0"/&gt;
 *         &lt;element name="DOSSIER_OWNER" type="{}AGENT" minOccurs="0"/&gt;
 *         &lt;element name="DOSSIER_CREATOR" type="{}AGENT" minOccurs="0"/&gt;
 *         &lt;element name="CREATION_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOSSIER_LAST_USER" type="{}AGENT" minOccurs="0"/&gt;
 *         &lt;element name="LAST_UPDATE_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOSSIER_STATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="MANUAL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOSSIER_COMPUTED_DATA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="START_DATE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="END_DATE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DOSSIER_DESCRIPTION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NAME" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="MANUAL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TRAVEL_PURPOSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CRM_CAMPAIGN_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOTAL_PRICE" type="{}AMOUNT" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_BILLABLE_PRICE" type="{}AMOUNT" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_PAYMENT" type="{}AMOUNT" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_BALANCE" type="{}AMOUNT" minOccurs="0"/&gt;
 *         &lt;element name="IS_EMPTY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHOPPING_BASKET", propOrder = {
    "type",
    "dossierid",
    "dossiermidofficereference",
    "dossierowner",
    "dossiercreator",
    "creationdate",
    "dossierlastuser",
    "lastupdatedate",
    "dossierstate",
    "dossiercomputeddata",
    "dossierdescription",
    "totalprice",
    "totalbillableprice",
    "totalpayment",
    "totalbalance",
    "isempty"
})
public class SHOPPINGBASKET
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "DOSSIER_ID", required = true)
    protected String dossierid;
    @XmlElement(name = "DOSSIER_MID_OFFICE_REFERENCE")
    protected EXTERNALREFERENCE dossiermidofficereference;
    @XmlElement(name = "DOSSIER_OWNER")
    protected AGENT dossierowner;
    @XmlElement(name = "DOSSIER_CREATOR")
    protected AGENT dossiercreator;
    @XmlElement(name = "CREATION_DATE")
    protected SHOPPINGBASKET.CREATIONDATE creationdate;
    @XmlElement(name = "DOSSIER_LAST_USER")
    protected AGENT dossierlastuser;
    @XmlElement(name = "LAST_UPDATE_DATE")
    protected SHOPPINGBASKET.LASTUPDATEDATE lastupdatedate;
    @XmlElement(name = "DOSSIER_STATE")
    protected SHOPPINGBASKET.DOSSIERSTATE dossierstate;
    @XmlElement(name = "DOSSIER_COMPUTED_DATA")
    protected SHOPPINGBASKET.DOSSIERCOMPUTEDDATA dossiercomputeddata;
    @XmlElement(name = "DOSSIER_DESCRIPTION")
    protected SHOPPINGBASKET.DOSSIERDESCRIPTION dossierdescription;
    @XmlElement(name = "TOTAL_PRICE")
    protected AMOUNT totalprice;
    @XmlElement(name = "TOTAL_BILLABLE_PRICE")
    protected AMOUNT totalbillableprice;
    @XmlElement(name = "TOTAL_PAYMENT")
    protected AMOUNT totalpayment;
    @XmlElement(name = "TOTAL_BALANCE")
    protected AMOUNT totalbalance;
    @XmlElement(name = "IS_EMPTY")
    protected Boolean isempty;

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
     * Gets the value of the dossierid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOSSIERID() {
        return dossierid;
    }

    /**
     * Sets the value of the dossierid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOSSIERID(String value) {
        this.dossierid = value;
    }

    /**
     * Gets the value of the dossiermidofficereference property.
     * 
     * @return
     *     possible object is
     *     {@link EXTERNALREFERENCE }
     *     
     */
    public EXTERNALREFERENCE getDOSSIERMIDOFFICEREFERENCE() {
        return dossiermidofficereference;
    }

    /**
     * Sets the value of the dossiermidofficereference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXTERNALREFERENCE }
     *     
     */
    public void setDOSSIERMIDOFFICEREFERENCE(EXTERNALREFERENCE value) {
        this.dossiermidofficereference = value;
    }

    /**
     * Gets the value of the dossierowner property.
     * 
     * @return
     *     possible object is
     *     {@link AGENT }
     *     
     */
    public AGENT getDOSSIEROWNER() {
        return dossierowner;
    }

    /**
     * Sets the value of the dossierowner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AGENT }
     *     
     */
    public void setDOSSIEROWNER(AGENT value) {
        this.dossierowner = value;
    }

    /**
     * Gets the value of the dossiercreator property.
     * 
     * @return
     *     possible object is
     *     {@link AGENT }
     *     
     */
    public AGENT getDOSSIERCREATOR() {
        return dossiercreator;
    }

    /**
     * Sets the value of the dossiercreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AGENT }
     *     
     */
    public void setDOSSIERCREATOR(AGENT value) {
        this.dossiercreator = value;
    }

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link SHOPPINGBASKET.CREATIONDATE }
     *     
     */
    public SHOPPINGBASKET.CREATIONDATE getCREATIONDATE() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHOPPINGBASKET.CREATIONDATE }
     *     
     */
    public void setCREATIONDATE(SHOPPINGBASKET.CREATIONDATE value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the dossierlastuser property.
     * 
     * @return
     *     possible object is
     *     {@link AGENT }
     *     
     */
    public AGENT getDOSSIERLASTUSER() {
        return dossierlastuser;
    }

    /**
     * Sets the value of the dossierlastuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link AGENT }
     *     
     */
    public void setDOSSIERLASTUSER(AGENT value) {
        this.dossierlastuser = value;
    }

    /**
     * Gets the value of the lastupdatedate property.
     * 
     * @return
     *     possible object is
     *     {@link SHOPPINGBASKET.LASTUPDATEDATE }
     *     
     */
    public SHOPPINGBASKET.LASTUPDATEDATE getLASTUPDATEDATE() {
        return lastupdatedate;
    }

    /**
     * Sets the value of the lastupdatedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHOPPINGBASKET.LASTUPDATEDATE }
     *     
     */
    public void setLASTUPDATEDATE(SHOPPINGBASKET.LASTUPDATEDATE value) {
        this.lastupdatedate = value;
    }

    /**
     * Gets the value of the dossierstate property.
     * 
     * @return
     *     possible object is
     *     {@link SHOPPINGBASKET.DOSSIERSTATE }
     *     
     */
    public SHOPPINGBASKET.DOSSIERSTATE getDOSSIERSTATE() {
        return dossierstate;
    }

    /**
     * Sets the value of the dossierstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHOPPINGBASKET.DOSSIERSTATE }
     *     
     */
    public void setDOSSIERSTATE(SHOPPINGBASKET.DOSSIERSTATE value) {
        this.dossierstate = value;
    }

    /**
     * Gets the value of the dossiercomputeddata property.
     * 
     * @return
     *     possible object is
     *     {@link SHOPPINGBASKET.DOSSIERCOMPUTEDDATA }
     *     
     */
    public SHOPPINGBASKET.DOSSIERCOMPUTEDDATA getDOSSIERCOMPUTEDDATA() {
        return dossiercomputeddata;
    }

    /**
     * Sets the value of the dossiercomputeddata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHOPPINGBASKET.DOSSIERCOMPUTEDDATA }
     *     
     */
    public void setDOSSIERCOMPUTEDDATA(SHOPPINGBASKET.DOSSIERCOMPUTEDDATA value) {
        this.dossiercomputeddata = value;
    }

    /**
     * Gets the value of the dossierdescription property.
     * 
     * @return
     *     possible object is
     *     {@link SHOPPINGBASKET.DOSSIERDESCRIPTION }
     *     
     */
    public SHOPPINGBASKET.DOSSIERDESCRIPTION getDOSSIERDESCRIPTION() {
        return dossierdescription;
    }

    /**
     * Sets the value of the dossierdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHOPPINGBASKET.DOSSIERDESCRIPTION }
     *     
     */
    public void setDOSSIERDESCRIPTION(SHOPPINGBASKET.DOSSIERDESCRIPTION value) {
        this.dossierdescription = value;
    }

    /**
     * Gets the value of the totalprice property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNT }
     *     
     */
    public AMOUNT getTOTALPRICE() {
        return totalprice;
    }

    /**
     * Sets the value of the totalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNT }
     *     
     */
    public void setTOTALPRICE(AMOUNT value) {
        this.totalprice = value;
    }

    /**
     * Gets the value of the totalbillableprice property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNT }
     *     
     */
    public AMOUNT getTOTALBILLABLEPRICE() {
        return totalbillableprice;
    }

    /**
     * Sets the value of the totalbillableprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNT }
     *     
     */
    public void setTOTALBILLABLEPRICE(AMOUNT value) {
        this.totalbillableprice = value;
    }

    /**
     * Gets the value of the totalpayment property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNT }
     *     
     */
    public AMOUNT getTOTALPAYMENT() {
        return totalpayment;
    }

    /**
     * Sets the value of the totalpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNT }
     *     
     */
    public void setTOTALPAYMENT(AMOUNT value) {
        this.totalpayment = value;
    }

    /**
     * Gets the value of the totalbalance property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNT }
     *     
     */
    public AMOUNT getTOTALBALANCE() {
        return totalbalance;
    }

    /**
     * Sets the value of the totalbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNT }
     *     
     */
    public void setTOTALBALANCE(AMOUNT value) {
        this.totalbalance = value;
    }

    /**
     * Gets the value of the isempty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISEMPTY() {
        return isempty;
    }

    /**
     * Sets the value of the isempty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISEMPTY(Boolean value) {
        this.isempty = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CREATIONDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
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
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
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
     *         &lt;element name="START_DATE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="END_DATE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "startdate",
        "enddate",
        "origin",
        "destination"
    })
    public static class DOSSIERCOMPUTEDDATA
        implements Serializable
    {

        @XmlElement(name = "START_DATE")
        protected SHOPPINGBASKET.DOSSIERCOMPUTEDDATA.STARTDATE startdate;
        @XmlElement(name = "END_DATE")
        protected SHOPPINGBASKET.DOSSIERCOMPUTEDDATA.ENDDATE enddate;
        @XmlElement(name = "ORIGIN")
        protected String origin;
        @XmlElement(name = "DESTINATION")
        protected String destination;

        /**
         * Gets the value of the startdate property.
         * 
         * @return
         *     possible object is
         *     {@link SHOPPINGBASKET.DOSSIERCOMPUTEDDATA.STARTDATE }
         *     
         */
        public SHOPPINGBASKET.DOSSIERCOMPUTEDDATA.STARTDATE getSTARTDATE() {
            return startdate;
        }

        /**
         * Sets the value of the startdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link SHOPPINGBASKET.DOSSIERCOMPUTEDDATA.STARTDATE }
         *     
         */
        public void setSTARTDATE(SHOPPINGBASKET.DOSSIERCOMPUTEDDATA.STARTDATE value) {
            this.startdate = value;
        }

        /**
         * Gets the value of the enddate property.
         * 
         * @return
         *     possible object is
         *     {@link SHOPPINGBASKET.DOSSIERCOMPUTEDDATA.ENDDATE }
         *     
         */
        public SHOPPINGBASKET.DOSSIERCOMPUTEDDATA.ENDDATE getENDDATE() {
            return enddate;
        }

        /**
         * Sets the value of the enddate property.
         * 
         * @param value
         *     allowed object is
         *     {@link SHOPPINGBASKET.DOSSIERCOMPUTEDDATA.ENDDATE }
         *     
         */
        public void setENDDATE(SHOPPINGBASKET.DOSSIERCOMPUTEDDATA.ENDDATE value) {
            this.enddate = value;
        }

        /**
         * Gets the value of the origin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORIGIN() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORIGIN(String value) {
            this.origin = value;
        }

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESTINATION() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESTINATION(String value) {
            this.destination = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ENDDATE
            implements Serializable
        {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "code", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar code;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
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
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCode(XMLGregorianCalendar value) {
                this.code = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class STARTDATE
            implements Serializable
        {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "code", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar code;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
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
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCode(XMLGregorianCalendar value) {
                this.code = value;
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
     *         &lt;element name="NAME" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="MANUAL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TRAVEL_PURPOSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CRM_CAMPAIGN_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "name",
        "travelpurpose",
        "crmcampaignid",
        "notes"
    })
    public static class DOSSIERDESCRIPTION
        implements Serializable
    {

        @XmlElement(name = "NAME")
        protected SHOPPINGBASKET.DOSSIERDESCRIPTION.NAME name;
        @XmlElement(name = "TRAVEL_PURPOSE")
        protected String travelpurpose;
        @XmlElement(name = "CRM_CAMPAIGN_ID")
        protected String crmcampaignid;
        @XmlElement(name = "NOTES")
        protected String notes;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link SHOPPINGBASKET.DOSSIERDESCRIPTION.NAME }
         *     
         */
        public SHOPPINGBASKET.DOSSIERDESCRIPTION.NAME getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link SHOPPINGBASKET.DOSSIERDESCRIPTION.NAME }
         *     
         */
        public void setNAME(SHOPPINGBASKET.DOSSIERDESCRIPTION.NAME value) {
            this.name = value;
        }

        /**
         * Gets the value of the travelpurpose property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRAVELPURPOSE() {
            return travelpurpose;
        }

        /**
         * Sets the value of the travelpurpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRAVELPURPOSE(String value) {
            this.travelpurpose = value;
        }

        /**
         * Gets the value of the crmcampaignid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRMCAMPAIGNID() {
            return crmcampaignid;
        }

        /**
         * Sets the value of the crmcampaignid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRMCAMPAIGNID(String value) {
            this.crmcampaignid = value;
        }

        /**
         * Gets the value of the notes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNOTES() {
            return notes;
        }

        /**
         * Sets the value of the notes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNOTES(String value) {
            this.notes = value;
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
         *         &lt;element name="MANUAL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
            "manual"
        })
        public static class NAME
            implements Serializable
        {

            @XmlElement(name = "VALUE", required = true)
            protected String value;
            @XmlElement(name = "MANUAL")
            protected boolean manual;

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
             * Gets the value of the manual property.
             * 
             */
            public boolean isMANUAL() {
                return manual;
            }

            /**
             * Sets the value of the manual property.
             * 
             */
            public void setMANUAL(boolean value) {
                this.manual = value;
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
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="MANUAL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "manual"
    })
    public static class DOSSIERSTATE
        implements Serializable
    {

        @XmlElement(name = "VALUE", required = true)
        protected String value;
        @XmlElement(name = "MANUAL")
        protected boolean manual;

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
         * Gets the value of the manual property.
         * 
         */
        public boolean isMANUAL() {
            return manual;
        }

        /**
         * Sets the value of the manual property.
         * 
         */
        public void setMANUAL(boolean value) {
            this.manual = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LASTUPDATEDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
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
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCode(XMLGregorianCalendar value) {
            this.code = value;
        }

    }

}
