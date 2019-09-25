
package com.koreanair.eretail.pojo.tripplan.contact;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CodeDescriptorType;
import com.koreanair.eretail.pojo.tripplan.common.common_permissions.LISTPERMISSIONSType;
import com.koreanair.eretail.pojo.tripplan.common.common_permissions.PERMISSIONENUM;


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
 *         &lt;element name="CONTACT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PHYSICAL_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="OTHER"/&gt;
 *               &lt;enumeration value="PHONE"/&gt;
 *               &lt;enumeration value="FAX"/&gt;
 *               &lt;enumeration value="PAGER"/&gt;
 *               &lt;enumeration value="EMAIL"/&gt;
 *               &lt;enumeration value="MOBILE"/&gt;
 *               &lt;enumeration value="ADDRESS"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="USE_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="AGENCY"/&gt;
 *               &lt;enumeration value="BUSINESS"/&gt;
 *               &lt;enumeration value="HOME"/&gt;
 *               &lt;enumeration value="HOTEL"/&gt;
 *               &lt;enumeration value="TRAVEL AGENT"/&gt;
 *               &lt;enumeration value="OTHER"/&gt;
 *               &lt;enumeration value="INFORMATION"/&gt;
 *               &lt;enumeration value="BILLING"/&gt;
 *               &lt;enumeration value="DELIVERY"/&gt;
 *               &lt;enumeration value="MAILING"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PURPOSE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="STANDARD"/&gt;
 *               &lt;enumeration value="NOTIFICATION"/&gt;
 *               &lt;enumeration value="SPONSOR"/&gt;
 *               &lt;enumeration value="DESTINATION"/&gt;
 *               &lt;enumeration value="DROPOFF"/&gt;
 *               &lt;enumeration value="PICKUP"/&gt;
 *               &lt;enumeration value="UMNR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AIRLINE_SUPPORT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CONTACT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="CONTACT_POINT" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                     &lt;element name="OVERSEAS_CODE" minOccurs="0"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                           &lt;minLength value="0"/&gt;
 *                           &lt;maxLength value="60"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="AREA_CODE" minOccurs="0"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                           &lt;minLength value="0"/&gt;
 *                           &lt;maxLength value="60"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="CITY_CODE" minOccurs="0"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                           &lt;minLength value="0"/&gt;
 *                           &lt;maxLength value="60"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="COUNTRY_CODE" minOccurs="0"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                           &lt;maxLength value="60"/&gt;
 *                           &lt;minLength value="0"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="LIST_LOCATIONS" type="{}LOCATION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;element name="ALTERNATE_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ADDRESS_INFORMATION" type="{}ADDRESS_TYPE" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AIRLINE" type="{}CodeDescriptorType" minOccurs="0"/&gt;
 *         &lt;element name="IS_THIRD_PARTY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LANGUAGE" type="{}CodeDescriptorType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PERMISSIONS" type="{}LIST_PERMISSIONSType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="APPLICABLE_PERMISSION" type="{}PERMISSION_ENUM" minOccurs="0"/&gt;
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
    "contactid",
    "physicaltype",
    "usetype",
    "purpose",
    "airlinesupport",
    "contactname",
    "contactpoint",
    "addressinformation",
    "listtravellerid",
    "airline",
    "isthirdparty",
    "language",
    "listpermissions",
    "applicablepermission"
})
@XmlRootElement(name = "CONTACT")
public class CONTACT
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "CONTACT_ID")
    protected BigInteger contactid;
    @XmlElement(name = "PHYSICAL_TYPE")
    protected String physicaltype;
    @XmlElement(name = "USE_TYPE")
    protected String usetype;
    @XmlElement(name = "PURPOSE")
    protected String purpose;
    @XmlElement(name = "AIRLINE_SUPPORT")
    protected Object airlinesupport;
    @XmlElement(name = "CONTACT_NAME")
    protected String contactname;
    @XmlElement(name = "CONTACT_POINT")
    protected CONTACT.CONTACTPOINT contactpoint;
    @XmlElement(name = "ADDRESS_INFORMATION")
    protected ADDRESSTYPE addressinformation;
    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<BigInteger> listtravellerid;
    @XmlElement(name = "AIRLINE")
    protected CodeDescriptorType airline;
    @XmlElement(name = "IS_THIRD_PARTY")
    protected Boolean isthirdparty;
    @XmlElement(name = "LANGUAGE")
    protected CodeDescriptorType language;
    @XmlElement(name = "LIST_PERMISSIONS")
    protected List<LISTPERMISSIONSType> listpermissions;
    @XmlElement(name = "APPLICABLE_PERMISSION")
    @XmlSchemaType(name = "string")
    protected PERMISSIONENUM applicablepermission;

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
     * Gets the value of the contactid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCONTACTID() {
        return contactid;
    }

    /**
     * Sets the value of the contactid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCONTACTID(BigInteger value) {
        this.contactid = value;
    }

    /**
     * Gets the value of the physicaltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHYSICALTYPE() {
        return physicaltype;
    }

    /**
     * Sets the value of the physicaltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHYSICALTYPE(String value) {
        this.physicaltype = value;
    }

    /**
     * Gets the value of the usetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSETYPE() {
        return usetype;
    }

    /**
     * Sets the value of the usetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSETYPE(String value) {
        this.usetype = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURPOSE() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURPOSE(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the airlinesupport property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAIRLINESUPPORT() {
        return airlinesupport;
    }

    /**
     * Sets the value of the airlinesupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAIRLINESUPPORT(Object value) {
        this.airlinesupport = value;
    }

    /**
     * Gets the value of the contactname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTACTNAME() {
        return contactname;
    }

    /**
     * Sets the value of the contactname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTACTNAME(String value) {
        this.contactname = value;
    }

    /**
     * Gets the value of the contactpoint property.
     * 
     * @return
     *     possible object is
     *     {@link CONTACT.CONTACTPOINT }
     *     
     */
    public CONTACT.CONTACTPOINT getCONTACTPOINT() {
        return contactpoint;
    }

    /**
     * Sets the value of the contactpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTACT.CONTACTPOINT }
     *     
     */
    public void setCONTACTPOINT(CONTACT.CONTACTPOINT value) {
        this.contactpoint = value;
    }

    /**
     * Gets the value of the addressinformation property.
     * 
     * @return
     *     possible object is
     *     {@link ADDRESSTYPE }
     *     
     */
    public ADDRESSTYPE getADDRESSINFORMATION() {
        return addressinformation;
    }

    /**
     * Sets the value of the addressinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDRESSTYPE }
     *     
     */
    public void setADDRESSINFORMATION(ADDRESSTYPE value) {
        this.addressinformation = value;
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
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getAIRLINE() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setAIRLINE(CodeDescriptorType value) {
        this.airline = value;
    }

    /**
     * Gets the value of the isthirdparty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISTHIRDPARTY() {
        return isthirdparty;
    }

    /**
     * Sets the value of the isthirdparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISTHIRDPARTY(Boolean value) {
        this.isthirdparty = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setLANGUAGE(CodeDescriptorType value) {
        this.language = value;
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

    /**
     * Gets the value of the applicablepermission property.
     * 
     * @return
     *     possible object is
     *     {@link PERMISSIONENUM }
     *     
     */
    public PERMISSIONENUM getAPPLICABLEPERMISSION() {
        return applicablepermission;
    }

    /**
     * Sets the value of the applicablepermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link PERMISSIONENUM }
     *     
     */
    public void setAPPLICABLEPERMISSION(PERMISSIONENUM value) {
        this.applicablepermission = value;
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
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="OVERSEAS_CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="0"/&gt;
     *               &lt;maxLength value="60"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AREA_CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="0"/&gt;
     *               &lt;maxLength value="60"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CITY_CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="0"/&gt;
     *               &lt;maxLength value="60"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="COUNTRY_CODE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="60"/&gt;
     *               &lt;minLength value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_LOCATIONS" type="{}LOCATION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ALTERNATE_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "overseascode",
        "areacode",
        "citycode",
        "countrycode",
        "listlocations",
        "alternatevalue"
    })
    public static class CONTACTPOINT
        implements Serializable
    {

        @XmlElement(name = "VALUE")
        protected Object value;
        @XmlElement(name = "OVERSEAS_CODE")
        protected String overseascode;
        @XmlElement(name = "AREA_CODE")
        protected String areacode;
        @XmlElement(name = "CITY_CODE")
        protected String citycode;
        @XmlElement(name = "COUNTRY_CODE")
        protected String countrycode;
        @XmlElement(name = "LIST_LOCATIONS")
        protected List<LOCATIONTYPE> listlocations;
        @XmlElement(name = "ALTERNATE_VALUE")
        protected String alternatevalue;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setVALUE(Object value) {
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
         * Gets the value of the areacode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAREACODE() {
            return areacode;
        }

        /**
         * Sets the value of the areacode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAREACODE(String value) {
            this.areacode = value;
        }

        /**
         * Gets the value of the citycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITYCODE() {
            return citycode;
        }

        /**
         * Sets the value of the citycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITYCODE(String value) {
            this.citycode = value;
        }

        /**
         * Gets the value of the countrycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYCODE() {
            return countrycode;
        }

        /**
         * Sets the value of the countrycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYCODE(String value) {
            this.countrycode = value;
        }

        /**
         * Gets the value of the listlocations property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listlocations property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTLOCATIONS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LOCATIONTYPE }
         * 
         * 
         */
        public List<LOCATIONTYPE> getLISTLOCATIONS() {
            if (listlocations == null) {
                listlocations = new ArrayList<LOCATIONTYPE>();
            }
            return this.listlocations;
        }

        /**
         * Gets the value of the alternatevalue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getALTERNATEVALUE() {
            return alternatevalue;
        }

        /**
         * Sets the value of the alternatevalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setALTERNATEVALUE(String value) {
            this.alternatevalue = value;
        }

    }

}
