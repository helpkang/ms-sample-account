
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The information concerning sending notification
 * 
 * <p>Java class for NOTIFICATION_INFORMATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NOTIFICATION_INFORMATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TYPE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="E"/&gt;
 *               &lt;enumeration value="M"/&gt;
 *               &lt;enumeration value="R"/&gt;
 *               &lt;enumeration value=""/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OVERSEAS_CODE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AIRLINE" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="LANGUAGE" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="SERVICE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PERMISSIONS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="PERMISSION" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="W"/&gt;
 *                         &lt;enumeration value="R"/&gt;
 *                         &lt;enumeration value=""/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="THIRD_PARTY_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOTIFICATION_INFORMATION_TYPE", propOrder = {
    "index",
    "type",
    "value",
    "overseascode",
    "airline",
    "language",
    "serviceindicator",
    "listpermissions",
    "thirdpartyindicator"
})
public class NOTIFICATIONINFORMATIONTYPE
    implements Serializable
{

    @XmlElement(name = "INDEX", required = true)
    protected BigInteger index;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "VALUE", required = true)
    protected String value;
    @XmlElement(name = "OVERSEAS_CODE")
    protected String overseascode;
    @XmlElement(name = "AIRLINE")
    protected CODENAMEPAIRTYPE airline;
    @XmlElement(name = "LANGUAGE")
    protected CODENAMEPAIRTYPE language;
    @XmlElement(name = "SERVICE_INDICATOR")
    protected String serviceindicator;
    @XmlElement(name = "LIST_PERMISSIONS")
    protected List<NOTIFICATIONINFORMATIONTYPE.LISTPERMISSIONS> listpermissions;
    @XmlElement(name = "THIRD_PARTY_INDICATOR")
    protected Boolean thirdpartyindicator;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINDEX() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINDEX(BigInteger value) {
        this.index = value;
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
     * Gets the value of the overseascode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVERSEASCODE() {
        return overseascode;
    }

    /**
     * Sets the value of the overseascode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVERSEASCODE(String value) {
        this.overseascode = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public CODENAMEPAIRTYPE getAIRLINE() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public void setAIRLINE(CODENAMEPAIRTYPE value) {
        this.airline = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public CODENAMEPAIRTYPE getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public void setLANGUAGE(CODENAMEPAIRTYPE value) {
        this.language = value;
    }

    /**
     * Gets the value of the serviceindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICEINDICATOR() {
        return serviceindicator;
    }

    /**
     * Sets the value of the serviceindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICEINDICATOR(String value) {
        this.serviceindicator = value;
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
     * {@link NOTIFICATIONINFORMATIONTYPE.LISTPERMISSIONS }
     * 
     * 
     */
    public List<NOTIFICATIONINFORMATIONTYPE.LISTPERMISSIONS> getLISTPERMISSIONS() {
        if (listpermissions == null) {
            listpermissions = new ArrayList<NOTIFICATIONINFORMATIONTYPE.LISTPERMISSIONS>();
        }
        return this.listpermissions;
    }

    /**
     * Gets the value of the thirdpartyindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTHIRDPARTYINDICATOR() {
        return thirdpartyindicator;
    }

    /**
     * Sets the value of the thirdpartyindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTHIRDPARTYINDICATOR(Boolean value) {
        this.thirdpartyindicator = value;
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
     *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="PERMISSION" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="W"/&gt;
     *               &lt;enumeration value="R"/&gt;
     *               &lt;enumeration value=""/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
        "index",
        "officeid",
        "permission"
    })
    public static class LISTPERMISSIONS
        implements Serializable
    {

        @XmlElement(name = "INDEX", required = true)
        protected BigInteger index;
        @XmlElement(name = "OFFICE_ID")
        protected Object officeid;
        @XmlElement(name = "PERMISSION")
        protected String permission;

        /**
         * Gets the value of the index property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getINDEX() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setINDEX(BigInteger value) {
            this.index = value;
        }

        /**
         * Gets the value of the officeid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOFFICEID() {
            return officeid;
        }

        /**
         * Sets the value of the officeid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOFFICEID(Object value) {
            this.officeid = value;
        }

        /**
         * Gets the value of the permission property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPERMISSION() {
            return permission;
        }

        /**
         * Sets the value of the permission property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPERMISSION(String value) {
            this.permission = value;
        }

    }

}
