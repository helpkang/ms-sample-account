
package com.koreanair.eretail.pojo.farecommon.farecontext;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farediscount.ListDiscountCredentialsType;
import com.koreanair.eretail.pojo.farecommon.farediscount.ListResidentDiscountType;


/**
 * @deprecated since the CR 3174432
 * 
 * <p>Java class for FARE_CONTEXT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_CONTEXT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{}LIST_DISCOUNT_CREDENTIALS" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{}LIST_RESIDENT_DISCOUNT" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}LIST_FARE_CLASS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OVERRIDE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PTC_DISCOUNT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TYPE_OF_CORPORATE_FARE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_CORPORATE_NUMBER" maxOccurs="3" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CORPORATE_NUMBER" type="{}unprotectedStringType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GLOBAL_INDICATOR_PRICING_OPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FARE_CONTEXT_Type", propOrder = {
    "listdiscountcredentials",
    "listresidentdiscount",
    "listfareclass",
    "override",
    "globalindicatorpricingoption"
})
public class FARECONTEXTType
    implements Serializable
{

    @XmlElement(name = "LIST_DISCOUNT_CREDENTIALS")
    protected List<ListDiscountCredentialsType> listdiscountcredentials;
    @XmlElement(name = "LIST_RESIDENT_DISCOUNT")
    protected List<ListResidentDiscountType> listresidentdiscount;
    @XmlElement(name = "LIST_FARE_CLASS")
    protected List<LISTFARECLASS> listfareclass;
    @XmlElement(name = "OVERRIDE")
    protected FARECONTEXTType.OVERRIDE override;
    @XmlElement(name = "GLOBAL_INDICATOR_PRICING_OPTION")
    protected String globalindicatorpricingoption;
    @XmlAttribute(name = "deprecated")
    protected Boolean deprecated;

    /**
     * Gets the value of the listdiscountcredentials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscountcredentials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNTCREDENTIALS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListDiscountCredentialsType }
     * 
     * 
     */
    public List<ListDiscountCredentialsType> getLISTDISCOUNTCREDENTIALS() {
        if (listdiscountcredentials == null) {
            listdiscountcredentials = new ArrayList<ListDiscountCredentialsType>();
        }
        return this.listdiscountcredentials;
    }

    /**
     * Gets the value of the listresidentdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listresidentdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRESIDENTDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListResidentDiscountType }
     * 
     * 
     */
    public List<ListResidentDiscountType> getLISTRESIDENTDISCOUNT() {
        if (listresidentdiscount == null) {
            listresidentdiscount = new ArrayList<ListResidentDiscountType>();
        }
        return this.listresidentdiscount;
    }

    /**
     * Gets the value of the listfareclass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareclass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARECLASS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFARECLASS }
     * 
     * 
     */
    public List<LISTFARECLASS> getLISTFARECLASS() {
        if (listfareclass == null) {
            listfareclass = new ArrayList<LISTFARECLASS>();
        }
        return this.listfareclass;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link FARECONTEXTType.OVERRIDE }
     *     
     */
    public FARECONTEXTType.OVERRIDE getOVERRIDE() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link FARECONTEXTType.OVERRIDE }
     *     
     */
    public void setOVERRIDE(FARECONTEXTType.OVERRIDE value) {
        this.override = value;
    }

    /**
     * Gets the value of the globalindicatorpricingoption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLOBALINDICATORPRICINGOPTION() {
        return globalindicatorpricingoption;
    }

    /**
     * Sets the value of the globalindicatorpricingoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLOBALINDICATORPRICINGOPTION(String value) {
        this.globalindicatorpricingoption = value;
    }

    /**
     * Gets the value of the deprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDeprecated() {
        if (deprecated == null) {
            return true;
        } else {
            return deprecated;
        }
    }

    /**
     * Sets the value of the deprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeprecated(Boolean value) {
        this.deprecated = value;
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
     *         &lt;element name="PTC_DISCOUNT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TYPE_OF_CORPORATE_FARE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="LIST_CORPORATE_NUMBER" maxOccurs="3" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CORPORATE_NUMBER" type="{}unprotectedStringType"/&gt;
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
    @XmlType(name = "", propOrder = {
        "ptcdiscountcode",
        "typeofcorporatefare",
        "listcorporatenumber"
    })
    public static class OVERRIDE
        implements Serializable
    {

        @XmlElement(name = "PTC_DISCOUNT_CODE")
        protected String ptcdiscountcode;
        @XmlElement(name = "TYPE_OF_CORPORATE_FARE")
        protected BigInteger typeofcorporatefare;
        @XmlElement(name = "LIST_CORPORATE_NUMBER")
        protected List<FARECONTEXTType.OVERRIDE.LISTCORPORATENUMBER> listcorporatenumber;

        /**
         * Gets the value of the ptcdiscountcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPTCDISCOUNTCODE() {
            return ptcdiscountcode;
        }

        /**
         * Sets the value of the ptcdiscountcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPTCDISCOUNTCODE(String value) {
            this.ptcdiscountcode = value;
        }

        /**
         * Gets the value of the typeofcorporatefare property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTYPEOFCORPORATEFARE() {
            return typeofcorporatefare;
        }

        /**
         * Sets the value of the typeofcorporatefare property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTYPEOFCORPORATEFARE(BigInteger value) {
            this.typeofcorporatefare = value;
        }

        /**
         * Gets the value of the listcorporatenumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcorporatenumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCORPORATENUMBER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FARECONTEXTType.OVERRIDE.LISTCORPORATENUMBER }
         * 
         * 
         */
        public List<FARECONTEXTType.OVERRIDE.LISTCORPORATENUMBER> getLISTCORPORATENUMBER() {
            if (listcorporatenumber == null) {
                listcorporatenumber = new ArrayList<FARECONTEXTType.OVERRIDE.LISTCORPORATENUMBER>();
            }
            return this.listcorporatenumber;
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
         *         &lt;element name="CORPORATE_NUMBER" type="{}unprotectedStringType"/&gt;
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
            "corporatenumber"
        })
        public static class LISTCORPORATENUMBER
            implements Serializable
        {

            @XmlElement(name = "CORPORATE_NUMBER", required = true)
            protected String corporatenumber;

            /**
             * Gets the value of the corporatenumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCORPORATENUMBER() {
                return corporatenumber;
            }

            /**
             * Sets the value of the corporatenumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCORPORATENUMBER(String value) {
                this.corporatenumber = value;
            }

        }

    }

}
