
package com.koreanair.eretail.pojo.fare.minirulesoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.koreanair.eretail.pojo.common.common.CodeDescriptorType;
import com.koreanair.eretail.pojo.common.common.CurrencyType;
import com.koreanair.eretail.pojo.common.common.LISTMSG;
import com.koreanair.eretail.pojo.fare.farecommonoutput.BasicTransportSegmentType;
import com.koreanair.eretail.pojo.fare.farecommonoutput.TRAVELERType;
import com.koreanair.eretail.pojo.fare.minirulescommon.RuleSourceSelection;


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
 *         &lt;element ref="{}PAGE_TICKET" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}MiniRulesOutputGroup" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "pageticket",
    "listmsg",
    "listminirulegroup",
    "dictionary"
})
@XmlRootElement(name = "MiniRulesOutput")
public class MiniRulesOutput
    implements Serializable
{

    @XmlElement(name = "PAGE_TICKET")
    protected String pageticket;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;
    @XmlElement(name = "LIST_MINI_RULE_GROUP")
    protected List<MiniRulesOutput.LISTMINIRULEGROUP> listminirulegroup;
    @XmlElement(name = "DICTIONARY")
    protected MiniRulesOutput.DICTIONARY dictionary;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the pageticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAGETICKET() {
        return pageticket;
    }

    /**
     * Sets the value of the pageticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAGETICKET(String value) {
        this.pageticket = value;
    }

    /**
     * Gets the value of the listmsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMSG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMSG }
     * 
     * 
     */
    public List<LISTMSG> getLISTMSG() {
        if (listmsg == null) {
            listmsg = new ArrayList<LISTMSG>();
        }
        return this.listmsg;
    }

    /**
     * Gets the value of the listminirulegroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listminirulegroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMINIRULEGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiniRulesOutput.LISTMINIRULEGROUP }
     * 
     * 
     */
    public List<MiniRulesOutput.LISTMINIRULEGROUP> getLISTMINIRULEGROUP() {
        if (listminirulegroup == null) {
            listminirulegroup = new ArrayList<MiniRulesOutput.LISTMINIRULEGROUP>();
        }
        return this.listminirulegroup;
    }

    /**
     * Gets the value of the dictionary property.
     * 
     * @return
     *     possible object is
     *     {@link MiniRulesOutput.DICTIONARY }
     *     
     */
    public MiniRulesOutput.DICTIONARY getDICTIONARY() {
        return dictionary;
    }

    /**
     * Sets the value of the dictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiniRulesOutput.DICTIONARY }
     *     
     */
    public void setDICTIONARY(MiniRulesOutput.DICTIONARY value) {
        this.dictionary = value;
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
     *         &lt;element name="LIST_FARE_COMPONENT" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="FROM" type="{}CodeDescriptorType"/&gt;
     *                   &lt;element name="TO" type="{}CodeDescriptorType"/&gt;
     *                   &lt;element name="LIST_SEGMENT" type="{}BasicTransportSegment_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIST_TRAVELLER" type="{}Traveller" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LIST_CURRENCY" type="{}currencyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listfarecomponent",
        "listtraveller",
        "listcurrency"
    })
    public static class DICTIONARY
        implements Serializable
    {

        @XmlElement(name = "LIST_FARE_COMPONENT")
        protected List<MiniRulesOutput.DICTIONARY.LISTFARECOMPONENT> listfarecomponent;
        @XmlElement(name = "LIST_TRAVELLER")
        protected List<Traveller> listtraveller;
        @XmlElement(name = "LIST_CURRENCY")
        protected List<CurrencyType> listcurrency;

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
         * {@link MiniRulesOutput.DICTIONARY.LISTFARECOMPONENT }
         * 
         * 
         */
        public List<MiniRulesOutput.DICTIONARY.LISTFARECOMPONENT> getLISTFARECOMPONENT() {
            if (listfarecomponent == null) {
                listfarecomponent = new ArrayList<MiniRulesOutput.DICTIONARY.LISTFARECOMPONENT>();
            }
            return this.listfarecomponent;
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
         * {@link Traveller }
         * 
         * 
         */
        public List<Traveller> getLISTTRAVELLER() {
            if (listtraveller == null) {
                listtraveller = new ArrayList<Traveller>();
            }
            return this.listtraveller;
        }

        /**
         * Gets the value of the listcurrency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcurrency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCURRENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CurrencyType }
         * 
         * 
         */
        public List<CurrencyType> getLISTCURRENCY() {
            if (listcurrency == null) {
                listcurrency = new ArrayList<CurrencyType>();
            }
            return this.listcurrency;
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
         *         &lt;element name="FARE_BASIS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="FROM" type="{}CodeDescriptorType"/&gt;
         *         &lt;element name="TO" type="{}CodeDescriptorType"/&gt;
         *         &lt;element name="LIST_SEGMENT" type="{}BasicTransportSegment_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "farebasis",
            "from",
            "to",
            "listsegment"
        })
        public static class LISTFARECOMPONENT
            implements Serializable
        {

            @XmlElement(name = "ID", required = true)
            protected BigInteger id;
            @XmlElement(name = "FARE_BASIS", required = true)
            protected String farebasis;
            @XmlElement(name = "FROM", required = true)
            protected CodeDescriptorType from;
            @XmlElement(name = "TO", required = true)
            protected CodeDescriptorType to;
            @XmlElement(name = "LIST_SEGMENT")
            protected List<BasicTransportSegmentType> listsegment;

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
             * Gets the value of the farebasis property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAREBASIS() {
                return farebasis;
            }

            /**
             * Sets the value of the farebasis property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAREBASIS(String value) {
                this.farebasis = value;
            }

            /**
             * Gets the value of the from property.
             * 
             * @return
             *     possible object is
             *     {@link CodeDescriptorType }
             *     
             */
            public CodeDescriptorType getFROM() {
                return from;
            }

            /**
             * Sets the value of the from property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeDescriptorType }
             *     
             */
            public void setFROM(CodeDescriptorType value) {
                this.from = value;
            }

            /**
             * Gets the value of the to property.
             * 
             * @return
             *     possible object is
             *     {@link CodeDescriptorType }
             *     
             */
            public CodeDescriptorType getTO() {
                return to;
            }

            /**
             * Sets the value of the to property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeDescriptorType }
             *     
             */
            public void setTO(CodeDescriptorType value) {
                this.to = value;
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
             * {@link BasicTransportSegmentType }
             * 
             * 
             */
            public List<BasicTransportSegmentType> getLISTSEGMENT() {
                if (listsegment == null) {
                    listsegment = new ArrayList<BasicTransportSegmentType>();
                }
                return this.listsegment;
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
     *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SOURCE" type="{}RuleSourceSelection"/&gt;
     *         &lt;element name="LIST_TRAVELLER_TYPE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TRAVELLER_TYPE" type="{}TRAVELER_Type"/&gt;
     *                   &lt;element name="LIST_DISCOUNT" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_TRAVELLER" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_FARE_COMPONENT" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FARE_COMPONENT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="LIST_CATEGORY" type="{}RuleCategory" maxOccurs="unbounded"/&gt;
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
        "listmsg",
        "source",
        "listtravellertype"
    })
    public static class LISTMINIRULEGROUP
        implements Serializable
    {

        @XmlElement(name = "LIST_MSG")
        protected List<LISTMSG> listmsg;
        @XmlElement(name = "SOURCE", required = true)
        protected RuleSourceSelection source;
        @XmlElement(name = "LIST_TRAVELLER_TYPE", required = true)
        protected List<MiniRulesOutput.LISTMINIRULEGROUP.LISTTRAVELLERTYPE> listtravellertype;

        /**
         * Gets the value of the listmsg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listmsg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTMSG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LISTMSG }
         * 
         * 
         */
        public List<LISTMSG> getLISTMSG() {
            if (listmsg == null) {
                listmsg = new ArrayList<LISTMSG>();
            }
            return this.listmsg;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link RuleSourceSelection }
         *     
         */
        public RuleSourceSelection getSOURCE() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link RuleSourceSelection }
         *     
         */
        public void setSOURCE(RuleSourceSelection value) {
            this.source = value;
        }

        /**
         * Gets the value of the listtravellertype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtravellertype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTRAVELLERTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MiniRulesOutput.LISTMINIRULEGROUP.LISTTRAVELLERTYPE }
         * 
         * 
         */
        public List<MiniRulesOutput.LISTMINIRULEGROUP.LISTTRAVELLERTYPE> getLISTTRAVELLERTYPE() {
            if (listtravellertype == null) {
                listtravellertype = new ArrayList<MiniRulesOutput.LISTMINIRULEGROUP.LISTTRAVELLERTYPE>();
            }
            return this.listtravellertype;
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
         *         &lt;element name="TRAVELLER_TYPE" type="{}TRAVELER_Type"/&gt;
         *         &lt;element name="LIST_DISCOUNT" type="{}CodeDescriptorType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="LIST_TRAVELLER" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="LIST_FARE_COMPONENT" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FARE_COMPONENT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="LIST_CATEGORY" type="{}RuleCategory" maxOccurs="unbounded"/&gt;
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
            "travellertype",
            "listdiscount",
            "listtraveller",
            "listfarecomponent"
        })
        public static class LISTTRAVELLERTYPE
            implements Serializable
        {

            @XmlElement(name = "TRAVELLER_TYPE", required = true)
            protected TRAVELERType travellertype;
            @XmlElement(name = "LIST_DISCOUNT")
            protected List<CodeDescriptorType> listdiscount;
            @XmlElement(name = "LIST_TRAVELLER")
            protected List<BigInteger> listtraveller;
            @XmlElement(name = "LIST_FARE_COMPONENT", required = true)
            protected List<MiniRulesOutput.LISTMINIRULEGROUP.LISTTRAVELLERTYPE.LISTFARECOMPONENT> listfarecomponent;

            /**
             * Gets the value of the travellertype property.
             * 
             * @return
             *     possible object is
             *     {@link TRAVELERType }
             *     
             */
            public TRAVELERType getTRAVELLERTYPE() {
                return travellertype;
            }

            /**
             * Sets the value of the travellertype property.
             * 
             * @param value
             *     allowed object is
             *     {@link TRAVELERType }
             *     
             */
            public void setTRAVELLERTYPE(TRAVELERType value) {
                this.travellertype = value;
            }

            /**
             * Gets the value of the listdiscount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listdiscount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTDISCOUNT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CodeDescriptorType }
             * 
             * 
             */
            public List<CodeDescriptorType> getLISTDISCOUNT() {
                if (listdiscount == null) {
                    listdiscount = new ArrayList<CodeDescriptorType>();
                }
                return this.listdiscount;
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
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getLISTTRAVELLER() {
                if (listtraveller == null) {
                    listtraveller = new ArrayList<BigInteger>();
                }
                return this.listtraveller;
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
             * {@link MiniRulesOutput.LISTMINIRULEGROUP.LISTTRAVELLERTYPE.LISTFARECOMPONENT }
             * 
             * 
             */
            public List<MiniRulesOutput.LISTMINIRULEGROUP.LISTTRAVELLERTYPE.LISTFARECOMPONENT> getLISTFARECOMPONENT() {
                if (listfarecomponent == null) {
                    listfarecomponent = new ArrayList<MiniRulesOutput.LISTMINIRULEGROUP.LISTTRAVELLERTYPE.LISTFARECOMPONENT>();
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
             *         &lt;element name="FARE_COMPONENT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="LIST_CATEGORY" type="{}RuleCategory" maxOccurs="unbounded"/&gt;
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
                "farecomponent",
                "listcategory"
            })
            public static class LISTFARECOMPONENT
                implements Serializable
            {

                @XmlElement(name = "FARE_COMPONENT", required = true)
                protected BigInteger farecomponent;
                @XmlElement(name = "LIST_CATEGORY", required = true)
                protected List<RuleCategory> listcategory;

                /**
                 * Gets the value of the farecomponent property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getFARECOMPONENT() {
                    return farecomponent;
                }

                /**
                 * Sets the value of the farecomponent property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setFARECOMPONENT(BigInteger value) {
                    this.farecomponent = value;
                }

                /**
                 * Gets the value of the listcategory property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listcategory property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTCATEGORY().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link RuleCategory }
                 * 
                 * 
                 */
                public List<RuleCategory> getLISTCATEGORY() {
                    if (listcategory == null) {
                        listcategory = new ArrayList<RuleCategory>();
                    }
                    return this.listcategory;
                }

            }

        }

    }

}
