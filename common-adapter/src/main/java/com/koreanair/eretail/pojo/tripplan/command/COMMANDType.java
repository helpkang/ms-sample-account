
package com.koreanair.eretail.pojo.tripplan.command;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.common.common.CurrencyType;
import com.koreanair.eretail.pojo.common.common.OutputDateType;
import com.koreanair.eretail.pojo.tripplan.common.common_permissions.LISTPERMISSIONSType;


/**
 * <p>Java class for COMMANDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMMANDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="ACTION_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ACTION_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_SUB_TYPE" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SCENARIO" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CONTENT"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AIRLINE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AUTHORIZE_OFFICE_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRODUCT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INVOICE_MODIFY_INFO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
 *                   &lt;element name="USAGE_SERVICE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SECURITY_OPTION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OPTION_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="LIST_PERMISSIONS" type="{}LIST_PERMISSIONSType" maxOccurs="4" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TIMESTAMP" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AGENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LOCAL_DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMMANDType", propOrder = {
    "type",
    "actionid",
    "actioncode",
    "listsubtype",
    "scenario",
    "content",
    "authorizeofficeid",
    "listtravellerid",
    "listproduct",
    "invoicemodifyinfo",
    "securityoption",
    "timestamp"
})
public class COMMANDType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "ACTION_ID")
    protected BigInteger actionid;
    @XmlElement(name = "ACTION_CODE", required = true)
    protected String actioncode;
    @XmlElement(name = "LIST_SUB_TYPE")
    protected List<String> listsubtype;
    @XmlElement(name = "SCENARIO")
    protected String scenario;
    @XmlElement(name = "CONTENT", required = true)
    protected COMMANDType.CONTENT content;
    @XmlElement(name = "AUTHORIZE_OFFICE_ID")
    protected List<String> authorizeofficeid;
    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<BigInteger> listtravellerid;
    @XmlElement(name = "LIST_PRODUCT")
    protected List<COMMANDType.LISTPRODUCT> listproduct;
    @XmlElement(name = "INVOICE_MODIFY_INFO")
    protected COMMANDType.INVOICEMODIFYINFO invoicemodifyinfo;
    @XmlElement(name = "SECURITY_OPTION")
    protected COMMANDType.SECURITYOPTION securityoption;
    @XmlElement(name = "TIMESTAMP")
    protected COMMANDType.TIMESTAMP timestamp;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the actionid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getACTIONID() {
        return actionid;
    }

    /**
     * Sets the value of the actionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setACTIONID(BigInteger value) {
        this.actionid = value;
    }

    /**
     * Gets the value of the actioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIONCODE() {
        return actioncode;
    }

    /**
     * Sets the value of the actioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIONCODE(String value) {
        this.actioncode = value;
    }

    /**
     * Gets the value of the listsubtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsubtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSUBTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTSUBTYPE() {
        if (listsubtype == null) {
            listsubtype = new ArrayList<String>();
        }
        return this.listsubtype;
    }

    /**
     * Gets the value of the scenario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCENARIO() {
        return scenario;
    }

    /**
     * Sets the value of the scenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCENARIO(String value) {
        this.scenario = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link COMMANDType.CONTENT }
     *     
     */
    public COMMANDType.CONTENT getCONTENT() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMMANDType.CONTENT }
     *     
     */
    public void setCONTENT(COMMANDType.CONTENT value) {
        this.content = value;
    }

    /**
     * Gets the value of the authorizeofficeid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizeofficeid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAUTHORIZEOFFICEID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAUTHORIZEOFFICEID() {
        if (authorizeofficeid == null) {
            authorizeofficeid = new ArrayList<String>();
        }
        return this.authorizeofficeid;
    }

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<BigInteger>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the listproduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRODUCT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COMMANDType.LISTPRODUCT }
     * 
     * 
     */
    public List<COMMANDType.LISTPRODUCT> getLISTPRODUCT() {
        if (listproduct == null) {
            listproduct = new ArrayList<COMMANDType.LISTPRODUCT>();
        }
        return this.listproduct;
    }

    /**
     * Gets the value of the invoicemodifyinfo property.
     * 
     * @return
     *     possible object is
     *     {@link COMMANDType.INVOICEMODIFYINFO }
     *     
     */
    public COMMANDType.INVOICEMODIFYINFO getINVOICEMODIFYINFO() {
        return invoicemodifyinfo;
    }

    /**
     * Sets the value of the invoicemodifyinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMMANDType.INVOICEMODIFYINFO }
     *     
     */
    public void setINVOICEMODIFYINFO(COMMANDType.INVOICEMODIFYINFO value) {
        this.invoicemodifyinfo = value;
    }

    /**
     * Gets the value of the securityoption property.
     * 
     * @return
     *     possible object is
     *     {@link COMMANDType.SECURITYOPTION }
     *     
     */
    public COMMANDType.SECURITYOPTION getSECURITYOPTION() {
        return securityoption;
    }

    /**
     * Sets the value of the securityoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMMANDType.SECURITYOPTION }
     *     
     */
    public void setSECURITYOPTION(COMMANDType.SECURITYOPTION value) {
        this.securityoption = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link COMMANDType.TIMESTAMP }
     *     
     */
    public COMMANDType.TIMESTAMP getTIMESTAMP() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMMANDType.TIMESTAMP }
     *     
     */
    public void setTIMESTAMP(COMMANDType.TIMESTAMP value) {
        this.timestamp = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
     *         &lt;element name="AIRLINE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "airline",
        "description"
    })
    public static class CONTENT
        implements Serializable
    {

        @XmlElement(name = "AIRLINE")
        protected String airline;
        @XmlElement(name = "DESCRIPTION", required = true)
        protected String description;

        /**
         * Gets the value of the airline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRLINE() {
            return airline;
        }

        /**
         * Sets the value of the airline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRLINE(String value) {
            this.airline = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
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
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
     *         &lt;element name="USAGE_SERVICE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "amount",
        "currency",
        "usageservice"
    })
    public static class INVOICEMODIFYINFO
        implements Serializable
    {

        @XmlElement(name = "AMOUNT")
        protected BigDecimal amount;
        @XmlElement(name = "CURRENCY")
        protected CurrencyType currency;
        @XmlElement(name = "USAGE_SERVICE")
        protected Object usageservice;

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
         * Gets the value of the usageservice property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getUSAGESERVICE() {
            return usageservice;
        }

        /**
         * Sets the value of the usageservice property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setUSAGESERVICE(Object value) {
            this.usageservice = value;
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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    public static class LISTPRODUCT
        implements Serializable
    {

        @XmlElement(name = "ID", required = true)
        protected BigInteger id;
        @XmlElement(name = "TYPE", required = true)
        protected String type;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setID(BigInteger value) {
            this.id = value;
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
     *         &lt;element name="OPTION_CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="LIST_PERMISSIONS" type="{}LIST_PERMISSIONSType" maxOccurs="4" minOccurs="0"/&gt;
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
        "optioncode",
        "listpermissions"
    })
    public static class SECURITYOPTION
        implements Serializable
    {

        @XmlElement(name = "OPTION_CODE", required = true)
        protected String optioncode;
        @XmlElement(name = "LIST_PERMISSIONS")
        protected List<LISTPERMISSIONSType> listpermissions;

        /**
         * Gets the value of the optioncode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOPTIONCODE() {
            return optioncode;
        }

        /**
         * Sets the value of the optioncode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOPTIONCODE(String value) {
            this.optioncode = value;
        }

        /**
         * Gets the value of the listpermissions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpermissions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPERMISSIONS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTPERMISSIONSType }
         * 
         * 
         */
        public List<LISTPERMISSIONSType> getLISTPERMISSIONS() {
            if (listpermissions == null) {
                listpermissions = new ArrayList<LISTPERMISSIONSType>();
            }
            return this.listpermissions;
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
     *         &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AGENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LOCAL_DATE_TIME" type="{}OutputDateType" minOccurs="0"/&gt;
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
        "officeid",
        "agentid",
        "localdatetime"
    })
    public static class TIMESTAMP
        implements Serializable
    {

        @XmlElement(name = "OFFICE_ID")
        protected String officeid;
        @XmlElement(name = "AGENT_ID")
        protected String agentid;
        @XmlElement(name = "LOCAL_DATE_TIME")
        protected OutputDateType localdatetime;

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
         * Gets the value of the agentid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAGENTID() {
            return agentid;
        }

        /**
         * Sets the value of the agentid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAGENTID(String value) {
            this.agentid = value;
        }

        /**
         * Gets the value of the localdatetime property.
         * 
         * @return
         *     possible object is
         *     {@link OutputDateType }
         *     
         */
        public OutputDateType getLOCALDATETIME() {
            return localdatetime;
        }

        /**
         * Sets the value of the localdatetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link OutputDateType }
         *     
         */
        public void setLOCALDATETIME(OutputDateType value) {
            this.localdatetime = value;
        }

    }

}
