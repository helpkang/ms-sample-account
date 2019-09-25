
package com.koreanair.eretail.pojo.fare.minirulesoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CodeDescriptorType;


/**
 * <p>Java class for RuleCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}RuleCategoryType"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ASSUMPTION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ASSUMPTION_TEXT" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION" type="{}CodeDescriptorType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SITUATION" type="{}Situation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_RULE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SITUATION" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}SituationEnumeration"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{}KEY"/&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="VALUE"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;group ref="{}KeyValueGroup"/&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="LIST_VALUE" type="{}LIST_RULE_VALUE_type" maxOccurs="unbounded"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_FARE_COMPONENT" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleCategory", propOrder = {
    "type",
    "name",
    "assumption",
    "assumptiontext",
    "location",
    "listsituation",
    "listrule",
    "listfarecomponent"
})
public class RuleCategory
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    @XmlSchemaType(name = "string")
    protected RuleCategoryType type;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "ASSUMPTION")
    protected Boolean assumption;
    @XmlElement(name = "ASSUMPTION_TEXT")
    protected String assumptiontext;
    @XmlElement(name = "LOCATION")
    protected CodeDescriptorType location;
    @XmlElement(name = "LIST_SITUATION")
    protected List<Situation> listsituation;
    @XmlElement(name = "LIST_RULE")
    protected List<RuleCategory.LISTRULE> listrule;
    @XmlElement(name = "LIST_FARE_COMPONENT")
    protected List<BigInteger> listfarecomponent;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RuleCategoryType }
     *     
     */
    public RuleCategoryType getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleCategoryType }
     *     
     */
    public void setTYPE(RuleCategoryType value) {
        this.type = value;
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

    /**
     * Gets the value of the assumption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isASSUMPTION() {
        return assumption;
    }

    /**
     * Sets the value of the assumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setASSUMPTION(Boolean value) {
        this.assumption = value;
    }

    /**
     * Gets the value of the assumptiontext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSUMPTIONTEXT() {
        return assumptiontext;
    }

    /**
     * Sets the value of the assumptiontext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSUMPTIONTEXT(String value) {
        this.assumptiontext = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptorType }
     *     
     */
    public CodeDescriptorType getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptorType }
     *     
     */
    public void setLOCATION(CodeDescriptorType value) {
        this.location = value;
    }

    /**
     * Gets the value of the listsituation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsituation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSITUATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Situation }
     * 
     * 
     */
    public List<Situation> getLISTSITUATION() {
        if (listsituation == null) {
            listsituation = new ArrayList<Situation>();
        }
        return this.listsituation;
    }

    /**
     * Gets the value of the listrule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRULE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleCategory.LISTRULE }
     * 
     * 
     */
    public List<RuleCategory.LISTRULE> getLISTRULE() {
        if (listrule == null) {
            listrule = new ArrayList<RuleCategory.LISTRULE>();
        }
        return this.listrule;
    }

    /**
     * Gets the value of the listfarecomponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarecomponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARECOMPONENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTFARECOMPONENT() {
        if (listfarecomponent == null) {
            listfarecomponent = new ArrayList<BigInteger>();
        }
        return this.listfarecomponent;
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
     *         &lt;element name="SITUATION" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}SituationEnumeration"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{}KEY"/&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="VALUE"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;group ref="{}KeyValueGroup"/&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="LIST_VALUE" type="{}LIST_RULE_VALUE_type" maxOccurs="unbounded"/&gt;
     *         &lt;/sequence&gt;
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "situation",
        "key",
        "value",
        "listvalue",
        "description"
    })
    public static class LISTRULE
        implements Serializable
    {

        @XmlElement(name = "SITUATION")
        protected SituationEnumeration situation;
        @XmlElement(name = "KEY", required = true)
        protected String key;
        @XmlElement(name = "VALUE", required = true)
        protected RuleCategory.LISTRULE.VALUE value;
        @XmlElement(name = "LIST_VALUE", required = true)
        protected List<LISTRULEVALUEType> listvalue;
        @XmlElement(name = "DESCRIPTION")
        protected String description;

        /**
         * Gets the value of the situation property.
         * 
         * @return
         *     possible object is
         *     {@link SituationEnumeration }
         *     
         */
        public SituationEnumeration getSITUATION() {
            return situation;
        }

        /**
         * Sets the value of the situation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SituationEnumeration }
         *     
         */
        public void setSITUATION(SituationEnumeration value) {
            this.situation = value;
        }

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKEY() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKEY(String value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link RuleCategory.LISTRULE.VALUE }
         *     
         */
        public RuleCategory.LISTRULE.VALUE getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link RuleCategory.LISTRULE.VALUE }
         *     
         */
        public void setVALUE(RuleCategory.LISTRULE.VALUE value) {
            this.value = value;
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
         * {@link LISTRULEVALUEType }
         * 
         * 
         */
        public List<LISTRULEVALUEType> getLISTVALUE() {
            if (listvalue == null) {
                listvalue = new ArrayList<LISTRULEVALUEType>();
            }
            return this.listvalue;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;group ref="{}KeyValueGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "date",
            "monetaryamount",
            "flag",
            "flagaction"
        })
        public static class VALUE
            implements Serializable
        {

            @XmlElement(name = "DATE")
            protected LISTRULEVALUEType.DATE date;
            @XmlElement(name = "MONETARY_AMOUNT")
            protected LISTRULEVALUEType.MONETARYAMOUNT monetaryamount;
            @XmlElement(name = "FLAG")
            protected Boolean flag;
            @XmlElement(name = "FLAG_ACTION")
            protected String flagaction;

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link LISTRULEVALUEType.DATE }
             *     
             */
            public LISTRULEVALUEType.DATE getDATE() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTRULEVALUEType.DATE }
             *     
             */
            public void setDATE(LISTRULEVALUEType.DATE value) {
                this.date = value;
            }

            /**
             * Gets the value of the monetaryamount property.
             * 
             * @return
             *     possible object is
             *     {@link LISTRULEVALUEType.MONETARYAMOUNT }
             *     
             */
            public LISTRULEVALUEType.MONETARYAMOUNT getMONETARYAMOUNT() {
                return monetaryamount;
            }

            /**
             * Sets the value of the monetaryamount property.
             * 
             * @param value
             *     allowed object is
             *     {@link LISTRULEVALUEType.MONETARYAMOUNT }
             *     
             */
            public void setMONETARYAMOUNT(LISTRULEVALUEType.MONETARYAMOUNT value) {
                this.monetaryamount = value;
            }

            /**
             * Gets the value of the flag property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFLAG() {
                return flag;
            }

            /**
             * Sets the value of the flag property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFLAG(Boolean value) {
                this.flag = value;
            }

            /**
             * Gets the value of the flagaction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFLAGACTION() {
                return flagaction;
            }

            /**
             * Sets the value of the flagaction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFLAGACTION(String value) {
                this.flagaction = value;
            }

        }

    }

}
