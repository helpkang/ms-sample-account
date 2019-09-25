
package com.koreanair.external.eretail.vo.fare.minirulescommon;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines from which rule source (fare / tST / pnr / offer / eticket) we want mini rules.
 * 
 * <p>Java class for RuleSourceSelection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleSourceSelection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}RuleSource"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="LIST_SUB_SOURCE" maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;choice minOccurs="0"&gt;
 *                     &lt;group ref="{}RuleSource"/&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element ref="{}LIST_SEGMENT" maxOccurs="unbounded"/&gt;
 *                       &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;complexContent&gt;
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                               &lt;sequence&gt;
 *                                 &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                 &lt;element name="INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                               &lt;/sequence&gt;
 *                             &lt;/restriction&gt;
 *                           &lt;/complexContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ALL_SUBSOURCES" type="{}ALL_type" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleSourceSelection", propOrder = {
    "type",
    "id",
    "origin",
    "listsubsource",
    "allsubsources"
})
public class RuleSourceSelection
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    @XmlSchemaType(name = "string")
    protected SourceEnumeration type;
    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "ORIGIN")
    protected String origin;
    @XmlElement(name = "LIST_SUB_SOURCE")
    protected List<RuleSourceSelection.LISTSUBSOURCE> listsubsource;
    @XmlElement(name = "ALL_SUBSOURCES")
    protected ALLType allsubsources;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SourceEnumeration }
     *     
     */
    public SourceEnumeration getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceEnumeration }
     *     
     */
    public void setTYPE(SourceEnumeration value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     * Gets the value of the listsubsource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsubsource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSUBSOURCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleSourceSelection.LISTSUBSOURCE }
     * 
     * 
     */
    public List<RuleSourceSelection.LISTSUBSOURCE> getLISTSUBSOURCE() {
        if (listsubsource == null) {
            listsubsource = new ArrayList<RuleSourceSelection.LISTSUBSOURCE>();
        }
        return this.listsubsource;
    }

    /**
     * Gets the value of the allsubsources property.
     * 
     * @return
     *     possible object is
     *     {@link ALLType }
     *     
     */
    public ALLType getALLSUBSOURCES() {
        return allsubsources;
    }

    /**
     * Sets the value of the allsubsources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALLType }
     *     
     */
    public void setALLSUBSOURCES(ALLType value) {
        this.allsubsources = value;
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
     *       &lt;choice minOccurs="0"&gt;
     *         &lt;group ref="{}RuleSource"/&gt;
     *         &lt;sequence&gt;
     *           &lt;element ref="{}LIST_SEGMENT" maxOccurs="unbounded"/&gt;
     *           &lt;element name="LIST_TRAVELLER" maxOccurs="unbounded"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                     &lt;element name="INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *       &lt;/choice&gt;
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
        "id",
        "origin",
        "listsegment",
        "listtraveller"
    })
    public static class LISTSUBSOURCE
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        @XmlSchemaType(name = "string")
        protected SourceEnumeration type;
        @XmlElement(name = "ID")
        protected String id;
        @XmlElement(name = "ORIGIN")
        protected String origin;
        @XmlElement(name = "LIST_SEGMENT")
        protected List<LISTSEGMENT> listsegment;
        @XmlElement(name = "LIST_TRAVELLER")
        protected List<RuleSourceSelection.LISTSUBSOURCE.LISTTRAVELLER> listtraveller;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link SourceEnumeration }
         *     
         */
        public SourceEnumeration getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link SourceEnumeration }
         *     
         */
        public void setTYPE(SourceEnumeration value) {
            this.type = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
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
         * {@link LISTSEGMENT }
         * 
         * 
         */
        public List<LISTSEGMENT> getLISTSEGMENT() {
            if (listsegment == null) {
                listsegment = new ArrayList<LISTSEGMENT>();
            }
            return this.listsegment;
        }

        /**
         * Gets the value of the listtraveller property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtraveller property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRAVELLER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RuleSourceSelection.LISTSUBSOURCE.LISTTRAVELLER }
         * 
         * 
         */
        public List<RuleSourceSelection.LISTSUBSOURCE.LISTTRAVELLER> getLISTTRAVELLER() {
            if (listtraveller == null) {
                listtraveller = new ArrayList<RuleSourceSelection.LISTSUBSOURCE.LISTTRAVELLER>();
            }
            return this.listtraveller;
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
         *         &lt;element name="INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
            "infant"
        })
        public static class LISTTRAVELLER
            implements Serializable
        {

            @XmlElement(name = "ID", required = true)
            protected BigInteger id;
            @XmlElement(name = "INFANT")
            protected Boolean infant;

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
             * Gets the value of the infant property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isINFANT() {
                return infant;
            }

            /**
             * Sets the value of the infant property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setINFANT(Boolean value) {
                this.infant = value;
            }

        }

    }

}
