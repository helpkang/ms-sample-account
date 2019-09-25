
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ListTabType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListTabType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="LIST_DATE" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="DATE"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;simpleContent&gt;
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                             &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/simpleContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="UM_PROP_FLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="LIST_CITY" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="CITY_CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LIST_RECOMMENDATION" type="{}ListRecommendationGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PROPOSED_BOUND" type="{}LIST_PROPOSED_BOUND_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListTabType", propOrder = {
    "listdate",
    "listcity",
    "listrecommendation",
    "listproposedbound"
})
public class ListTabType
    implements Serializable
{

    @XmlElement(name = "LIST_DATE")
    protected List<ListTabType.LISTDATE> listdate;
    @XmlElement(name = "LIST_CITY")
    protected List<ListTabType.LISTCITY> listcity;
    @XmlElement(name = "LIST_RECOMMENDATION")
    protected List<ListRecommendationGroupType> listrecommendation;
    @XmlElement(name = "LIST_PROPOSED_BOUND")
    protected List<LISTPROPOSEDBOUNDType> listproposedbound;

    /**
     * Gets the value of the listdate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListTabType.LISTDATE }
     * 
     * 
     */
    public List<ListTabType.LISTDATE> getLISTDATE() {
        if (listdate == null) {
            listdate = new ArrayList<ListTabType.LISTDATE>();
        }
        return this.listdate;
    }

    /**
     * Gets the value of the listcity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListTabType.LISTCITY }
     * 
     * 
     */
    public List<ListTabType.LISTCITY> getLISTCITY() {
        if (listcity == null) {
            listcity = new ArrayList<ListTabType.LISTCITY>();
        }
        return this.listcity;
    }

    /**
     * Gets the value of the listrecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRECOMMENDATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListRecommendationGroupType }
     * 
     * 
     */
    public List<ListRecommendationGroupType> getLISTRECOMMENDATION() {
        if (listrecommendation == null) {
            listrecommendation = new ArrayList<ListRecommendationGroupType>();
        }
        return this.listrecommendation;
    }

    /**
     * Gets the value of the listproposedbound property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproposedbound property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROPOSEDBOUND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTPROPOSEDBOUNDType }
     * 
     * 
     */
    public List<LISTPROPOSEDBOUNDType> getLISTPROPOSEDBOUND() {
        if (listproposedbound == null) {
            listproposedbound = new ArrayList<LISTPROPOSEDBOUNDType>();
        }
        return this.listproposedbound;
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
     *         &lt;element name="CITY_CODE" type="{}unprotectedStringType"/&gt;
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
        "citycode"
    })
    public static class LISTCITY
        implements Serializable
    {

        @XmlElement(name = "CITY_CODE", required = true)
        protected String citycode;

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
     *         &lt;element name="DATE"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="UM_PROP_FLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "date",
        "umpropflt"
    })
    public static class LISTDATE
        implements Serializable
    {

        @XmlElement(name = "DATE", required = true)
        protected ListTabType.LISTDATE.DATE date;
        @XmlElement(name = "UM_PROP_FLT")
        protected String umpropflt;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link ListTabType.LISTDATE.DATE }
         *     
         */
        public ListTabType.LISTDATE.DATE getDATE() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListTabType.LISTDATE.DATE }
         *     
         */
        public void setDATE(ListTabType.LISTDATE.DATE value) {
            this.date = value;
        }

        /**
         * Gets the value of the umpropflt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUMPROPFLT() {
            return umpropflt;
        }

        /**
         * Sets the value of the umpropflt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUMPROPFLT(String value) {
            this.umpropflt = value;
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
        public static class DATE
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
