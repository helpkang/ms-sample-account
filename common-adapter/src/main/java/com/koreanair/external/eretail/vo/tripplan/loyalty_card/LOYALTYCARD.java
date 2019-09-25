
package com.koreanair.external.eretail.vo.tripplan.loyalty_card;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.external.eretail.vo.profile.commonprofileout.CODENAMEPAIRTYPE;
import com.koreanair.external.eretail.vo.profile.commonprofileout.IDENTITYTYPE;


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
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="OWNER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="IS_VALIDATED" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LOYALTY_CARD_INFORMATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
 *                   &lt;element name="CARD_NUMBER" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="TIER_LEVEL" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *                   &lt;element name="ALLIANCE_TIER_LEVEL" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *                   &lt;element name="PRIORITY_CODE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;element name="ALLIANCE_PRIORITY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMER_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MILEAGE" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                   &lt;element name="PIN_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="EXPIRY_DATE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OWNER_INFORMATION" type="{}IDENTITY_TYPE" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_MILES_REQUESTS" type="{}LOYALTY_REQUEST" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SERVICING_REQUESTS" type="{}LOYALTY_REQUEST" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_OWNER_REQUESTS" type="{}LOYALTY_REQUEST" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_REDEMPTION_REQUESTS" type="{}LOYALTY_REDEMPTION_REQUEST" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_UPGRADE_REQUESTS" type="{}LOYALTY_UPGRADE_REQUEST" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "itemid",
    "ownerid",
    "isvalidated",
    "loyaltycardinformation",
    "listmilesrequests",
    "listservicingrequests",
    "listownerrequests",
    "listredemptionrequests",
    "listupgraderequests"
})
@XmlRootElement(name = "LOYALTY_CARD")
public class LOYALTYCARD
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "ITEM_ID")
    protected BigInteger itemid;
    @XmlElement(name = "OWNER_ID")
    protected BigInteger ownerid;
    @XmlElement(name = "IS_VALIDATED")
    protected BigInteger isvalidated;
    @XmlElement(name = "LOYALTY_CARD_INFORMATION")
    protected LOYALTYCARD.LOYALTYCARDINFORMATION loyaltycardinformation;
    @XmlElement(name = "LIST_MILES_REQUESTS")
    protected List<LOYALTYREQUEST> listmilesrequests;
    @XmlElement(name = "LIST_SERVICING_REQUESTS")
    protected List<LOYALTYREQUEST> listservicingrequests;
    @XmlElement(name = "LIST_OWNER_REQUESTS")
    protected List<LOYALTYREQUEST> listownerrequests;
    @XmlElement(name = "LIST_REDEMPTION_REQUESTS")
    protected List<LOYALTYREDEMPTIONREQUEST> listredemptionrequests;
    @XmlElement(name = "LIST_UPGRADE_REQUESTS")
    protected List<LOYALTYUPGRADEREQUEST> listupgraderequests;

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
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMID(BigInteger value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the ownerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOWNERID() {
        return ownerid;
    }

    /**
     * Sets the value of the ownerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOWNERID(BigInteger value) {
        this.ownerid = value;
    }

    /**
     * Gets the value of the isvalidated property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getISVALIDATED() {
        return isvalidated;
    }

    /**
     * Sets the value of the isvalidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setISVALIDATED(BigInteger value) {
        this.isvalidated = value;
    }

    /**
     * Gets the value of the loyaltycardinformation property.
     * 
     * @return
     *     possible object is
     *     {@link LOYALTYCARD.LOYALTYCARDINFORMATION }
     *     
     */
    public LOYALTYCARD.LOYALTYCARDINFORMATION getLOYALTYCARDINFORMATION() {
        return loyaltycardinformation;
    }

    /**
     * Sets the value of the loyaltycardinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOYALTYCARD.LOYALTYCARDINFORMATION }
     *     
     */
    public void setLOYALTYCARDINFORMATION(LOYALTYCARD.LOYALTYCARDINFORMATION value) {
        this.loyaltycardinformation = value;
    }

    /**
     * Gets the value of the listmilesrequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmilesrequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMILESREQUESTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOYALTYREQUEST }
     * 
     * 
     */
    public List<LOYALTYREQUEST> getLISTMILESREQUESTS() {
        if (listmilesrequests == null) {
            listmilesrequests = new ArrayList<LOYALTYREQUEST>();
        }
        return this.listmilesrequests;
    }

    /**
     * Gets the value of the listservicingrequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservicingrequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICINGREQUESTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOYALTYREQUEST }
     * 
     * 
     */
    public List<LOYALTYREQUEST> getLISTSERVICINGREQUESTS() {
        if (listservicingrequests == null) {
            listservicingrequests = new ArrayList<LOYALTYREQUEST>();
        }
        return this.listservicingrequests;
    }

    /**
     * Gets the value of the listownerrequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listownerrequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOWNERREQUESTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOYALTYREQUEST }
     * 
     * 
     */
    public List<LOYALTYREQUEST> getLISTOWNERREQUESTS() {
        if (listownerrequests == null) {
            listownerrequests = new ArrayList<LOYALTYREQUEST>();
        }
        return this.listownerrequests;
    }

    /**
     * Gets the value of the listredemptionrequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listredemptionrequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTREDEMPTIONREQUESTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOYALTYREDEMPTIONREQUEST }
     * 
     * 
     */
    public List<LOYALTYREDEMPTIONREQUEST> getLISTREDEMPTIONREQUESTS() {
        if (listredemptionrequests == null) {
            listredemptionrequests = new ArrayList<LOYALTYREDEMPTIONREQUEST>();
        }
        return this.listredemptionrequests;
    }

    /**
     * Gets the value of the listupgraderequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listupgraderequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTUPGRADEREQUESTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOYALTYUPGRADEREQUEST }
     * 
     * 
     */
    public List<LOYALTYUPGRADEREQUEST> getLISTUPGRADEREQUESTS() {
        if (listupgraderequests == null) {
            listupgraderequests = new ArrayList<LOYALTYUPGRADEREQUEST>();
        }
        return this.listupgraderequests;
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
     *         &lt;element name="COMPANY" type="{}CODE_NAME_PAIR_TYPE"/&gt;
     *         &lt;element name="CARD_NUMBER" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="TIER_LEVEL" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
     *         &lt;element name="ALLIANCE_TIER_LEVEL" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
     *         &lt;element name="PRIORITY_CODE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;element name="ALLIANCE_PRIORITY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMER_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MILEAGE" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *         &lt;element name="PIN_NUMBER" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="EXPIRY_DATE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OWNER_INFORMATION" type="{}IDENTITY_TYPE" minOccurs="0"/&gt;
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
        "company",
        "cardnumber",
        "tierlevel",
        "alliancetierlevel",
        "prioritycode",
        "allianceprioritycode",
        "customervalue",
        "mileage",
        "pinnumber",
        "expirydate",
        "ownerinformation"
    })
    public static class LOYALTYCARDINFORMATION
        implements Serializable
    {

        @XmlElement(name = "COMPANY", required = true)
        protected CODENAMEPAIRTYPE company;
        @XmlElement(name = "CARD_NUMBER", required = true)
        protected String cardnumber;
        @XmlElement(name = "TIER_LEVEL")
        protected CODENAMEPAIRTYPE tierlevel;
        @XmlElement(name = "ALLIANCE_TIER_LEVEL")
        protected CODENAMEPAIRTYPE alliancetierlevel;
        @XmlElement(name = "PRIORITY_CODE")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger prioritycode;
        @XmlElement(name = "ALLIANCE_PRIORITY_CODE")
        protected String allianceprioritycode;
        @XmlElement(name = "CUSTOMER_VALUE")
        protected String customervalue;
        @XmlElement(name = "MILEAGE")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger mileage;
        @XmlElement(name = "PIN_NUMBER")
        protected Object pinnumber;
        @XmlElement(name = "EXPIRY_DATE")
        protected LOYALTYCARD.LOYALTYCARDINFORMATION.EXPIRYDATE expirydate;
        @XmlElement(name = "OWNER_INFORMATION")
        protected IDENTITYTYPE ownerinformation;

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
         * Gets the value of the cardnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARDNUMBER() {
            return cardnumber;
        }

        /**
         * Sets the value of the cardnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARDNUMBER(String value) {
            this.cardnumber = value;
        }

        /**
         * Gets the value of the tierlevel property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAMEPAIRTYPE }
         *     
         */
        public CODENAMEPAIRTYPE getTIERLEVEL() {
            return tierlevel;
        }

        /**
         * Sets the value of the tierlevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAMEPAIRTYPE }
         *     
         */
        public void setTIERLEVEL(CODENAMEPAIRTYPE value) {
            this.tierlevel = value;
        }

        /**
         * Gets the value of the alliancetierlevel property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAMEPAIRTYPE }
         *     
         */
        public CODENAMEPAIRTYPE getALLIANCETIERLEVEL() {
            return alliancetierlevel;
        }

        /**
         * Sets the value of the alliancetierlevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAMEPAIRTYPE }
         *     
         */
        public void setALLIANCETIERLEVEL(CODENAMEPAIRTYPE value) {
            this.alliancetierlevel = value;
        }

        /**
         * Gets the value of the prioritycode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPRIORITYCODE() {
            return prioritycode;
        }

        /**
         * Sets the value of the prioritycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPRIORITYCODE(BigInteger value) {
            this.prioritycode = value;
        }

        /**
         * Gets the value of the allianceprioritycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getALLIANCEPRIORITYCODE() {
            return allianceprioritycode;
        }

        /**
         * Sets the value of the allianceprioritycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setALLIANCEPRIORITYCODE(String value) {
            this.allianceprioritycode = value;
        }

        /**
         * Gets the value of the customervalue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERVALUE() {
            return customervalue;
        }

        /**
         * Sets the value of the customervalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERVALUE(String value) {
            this.customervalue = value;
        }

        /**
         * Gets the value of the mileage property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMILEAGE() {
            return mileage;
        }

        /**
         * Sets the value of the mileage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMILEAGE(BigInteger value) {
            this.mileage = value;
        }

        /**
         * Gets the value of the pinnumber property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPINNUMBER() {
            return pinnumber;
        }

        /**
         * Sets the value of the pinnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPINNUMBER(Object value) {
            this.pinnumber = value;
        }

        /**
         * Gets the value of the expirydate property.
         * 
         * @return
         *     possible object is
         *     {@link LOYALTYCARD.LOYALTYCARDINFORMATION.EXPIRYDATE }
         *     
         */
        public LOYALTYCARD.LOYALTYCARDINFORMATION.EXPIRYDATE getEXPIRYDATE() {
            return expirydate;
        }

        /**
         * Sets the value of the expirydate property.
         * 
         * @param value
         *     allowed object is
         *     {@link LOYALTYCARD.LOYALTYCARDINFORMATION.EXPIRYDATE }
         *     
         */
        public void setEXPIRYDATE(LOYALTYCARD.LOYALTYCARDINFORMATION.EXPIRYDATE value) {
            this.expirydate = value;
        }

        /**
         * Gets the value of the ownerinformation property.
         * 
         * @return
         *     possible object is
         *     {@link IDENTITYTYPE }
         *     
         */
        public IDENTITYTYPE getOWNERINFORMATION() {
            return ownerinformation;
        }

        /**
         * Sets the value of the ownerinformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link IDENTITYTYPE }
         *     
         */
        public void setOWNERINFORMATION(IDENTITYTYPE value) {
            this.ownerinformation = value;
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
        public static class EXPIRYDATE
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

}
