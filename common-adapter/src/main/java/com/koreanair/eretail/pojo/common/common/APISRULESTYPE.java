
package com.koreanair.eretail.pojo.common.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This section contains the APIS rules configured for the site.
 * 
 * <p>Java class for APIS_RULES_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIS_RULES_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TIME_LIMIT_RULE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MISSING_PASSENGERS" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TR_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TARGET_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RULE_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="TARGET_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="STRUCTURE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "APIS_RULES_TYPE", propOrder = {
    "timelimitrule"
})
public class APISRULESTYPE
    implements Serializable
{

    @XmlElement(name = "TIME_LIMIT_RULE")
    protected List<APISRULESTYPE.TIMELIMITRULE> timelimitrule;

    /**
     * Gets the value of the timelimitrule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timelimitrule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIMELIMITRULE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APISRULESTYPE.TIMELIMITRULE }
     * 
     * 
     */
    public List<APISRULESTYPE.TIMELIMITRULE> getTIMELIMITRULE() {
        if (timelimitrule == null) {
            timelimitrule = new ArrayList<APISRULESTYPE.TIMELIMITRULE>();
        }
        return this.timelimitrule;
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
     *         &lt;element name="MISSING_PASSENGERS" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TR_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TARGET_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RULE_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="TARGET_VALUE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="STRUCTURE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "missingpassengers",
        "targettype",
        "date",
        "rulevalue",
        "targetvalue",
        "structure"
    })
    public static class TIMELIMITRULE
        implements Serializable
    {

        @XmlElement(name = "MISSING_PASSENGERS")
        protected List<APISRULESTYPE.TIMELIMITRULE.MISSINGPASSENGERS> missingpassengers;
        @XmlElement(name = "TARGET_TYPE")
        protected String targettype;
        @XmlElement(name = "DATE")
        protected String date;
        @XmlElement(name = "RULE_VALUE")
        protected Object rulevalue;
        @XmlElement(name = "TARGET_VALUE")
        protected Object targetvalue;
        @XmlElement(name = "STRUCTURE")
        protected Object structure;

        /**
         * Gets the value of the missingpassengers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the missingpassengers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMISSINGPASSENGERS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APISRULESTYPE.TIMELIMITRULE.MISSINGPASSENGERS }
         * 
         * 
         */
        public List<APISRULESTYPE.TIMELIMITRULE.MISSINGPASSENGERS> getMISSINGPASSENGERS() {
            if (missingpassengers == null) {
                missingpassengers = new ArrayList<APISRULESTYPE.TIMELIMITRULE.MISSINGPASSENGERS>();
            }
            return this.missingpassengers;
        }

        /**
         * Gets the value of the targettype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTARGETTYPE() {
            return targettype;
        }

        /**
         * Sets the value of the targettype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTARGETTYPE(String value) {
            this.targettype = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATE(String value) {
            this.date = value;
        }

        /**
         * Gets the value of the rulevalue property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRULEVALUE() {
            return rulevalue;
        }

        /**
         * Sets the value of the rulevalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRULEVALUE(Object value) {
            this.rulevalue = value;
        }

        /**
         * Gets the value of the targetvalue property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTARGETVALUE() {
            return targetvalue;
        }

        /**
         * Sets the value of the targetvalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTARGETVALUE(Object value) {
            this.targetvalue = value;
        }

        /**
         * Gets the value of the structure property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSTRUCTURE() {
            return structure;
        }

        /**
         * Sets the value of the structure property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSTRUCTURE(Object value) {
            this.structure = value;
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
         *         &lt;element name="TR_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "trid"
        })
        public static class MISSINGPASSENGERS
            implements Serializable
        {

            @XmlElement(name = "TR_ID")
            protected Object trid;

            /**
             * Gets the value of the trid property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getTRID() {
                return trid;
            }

            /**
             * Sets the value of the trid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setTRID(Object value) {
                this.trid = value;
            }

        }

    }

}
