
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FFCFFDictionaryMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FFCFFDictionaryMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_FARE_FAMILY" maxOccurs="6" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FARE_FAMILY" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="COMMERCIAL_FARE_FAMILY" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="LIST_QUALIFIER" maxOccurs="9" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                             &lt;element name="VALUE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;group ref="{}FareFamilyInformationGroup" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_RECO_LOWEST_PRICE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LIST_BOUND" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="LIST_RECOMMENDATION_ID" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="RECO_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="BEST_PRICE_RECOMMENDATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIST_SERVICE" maxOccurs="20" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SERVICE_STATUS" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="SERVICE_REFERENCE" type="{}unprotectedStringType"/&gt;
 *                             &lt;element name="SERVICE_FROM_PRICE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
@XmlType(name = "FFCFFDictionaryMapping", propOrder = {
    "listfarefamily"
})
public class FFCFFDictionaryMapping
    implements Serializable
{

    @XmlElement(name = "LIST_FARE_FAMILY")
    protected List<FFCFFDictionaryMapping.LISTFAREFAMILY> listfarefamily;

    /**
     * Gets the value of the listfarefamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarefamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREFAMILY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FFCFFDictionaryMapping.LISTFAREFAMILY }
     * 
     * 
     */
    public List<FFCFFDictionaryMapping.LISTFAREFAMILY> getLISTFAREFAMILY() {
        if (listfarefamily == null) {
            listfarefamily = new ArrayList<FFCFFDictionaryMapping.LISTFAREFAMILY>();
        }
        return this.listfarefamily;
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
     *         &lt;element name="FARE_FAMILY" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="COMMERCIAL_FARE_FAMILY" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="LIST_QUALIFIER" maxOccurs="9" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                   &lt;element name="VALUE" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;group ref="{}FareFamilyInformationGroup" minOccurs="0"/&gt;
     *         &lt;element name="LIST_RECO_LOWEST_PRICE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LIST_BOUND" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="LIST_RECOMMENDATION_ID" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="RECO_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="BEST_PRICE_RECOMMENDATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
     *         &lt;element name="LIST_SERVICE" maxOccurs="20" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SERVICE_STATUS" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="SERVICE_REFERENCE" type="{}unprotectedStringType"/&gt;
     *                   &lt;element name="SERVICE_FROM_PRICE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "farefamily",
        "commercialfarefamily",
        "listqualifier",
        "farefamilyref",
        "hierarchy",
        "brandname",
        "color",
        "highlightingcolor",
        "colorname",
        "listrecolowestprice",
        "listservice"
    })
    public static class LISTFAREFAMILY
        implements Serializable
    {

        @XmlElement(name = "FARE_FAMILY", required = true)
        protected String farefamily;
        @XmlElement(name = "COMMERCIAL_FARE_FAMILY", required = true)
        protected String commercialfarefamily;
        @XmlElement(name = "LIST_QUALIFIER")
        protected List<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTQUALIFIER> listqualifier;
        @XmlElement(name = "FARE_FAMILY_REF")
        protected Object farefamilyref;
        @XmlElement(name = "HIERARCHY")
        protected Object hierarchy;
        @XmlElement(name = "BRAND_NAME")
        protected Object brandname;
        @XmlElement(name = "COLOR")
        protected Object color;
        @XmlElement(name = "HIGHLIGHTING_COLOR")
        protected Object highlightingcolor;
        @XmlElement(name = "COLOR_NAME")
        protected Object colorname;
        @XmlElement(name = "LIST_RECO_LOWEST_PRICE")
        protected List<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE> listrecolowestprice;
        @XmlElement(name = "LIST_SERVICE")
        protected List<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTSERVICE> listservice;

        /**
         * Gets the value of the farefamily property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAREFAMILY() {
            return farefamily;
        }

        /**
         * Sets the value of the farefamily property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAREFAMILY(String value) {
            this.farefamily = value;
        }

        /**
         * Gets the value of the commercialfarefamily property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMMERCIALFAREFAMILY() {
            return commercialfarefamily;
        }

        /**
         * Sets the value of the commercialfarefamily property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMMERCIALFAREFAMILY(String value) {
            this.commercialfarefamily = value;
        }

        /**
         * Gets the value of the listqualifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listqualifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTQUALIFIER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FFCFFDictionaryMapping.LISTFAREFAMILY.LISTQUALIFIER }
         * 
         * 
         */
        public List<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTQUALIFIER> getLISTQUALIFIER() {
            if (listqualifier == null) {
                listqualifier = new ArrayList<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTQUALIFIER>();
            }
            return this.listqualifier;
        }

        /**
         * Gets the value of the farefamilyref property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getFAREFAMILYREF() {
            return farefamilyref;
        }

        /**
         * Sets the value of the farefamilyref property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setFAREFAMILYREF(Object value) {
            this.farefamilyref = value;
        }

        /**
         * Gets the value of the hierarchy property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getHIERARCHY() {
            return hierarchy;
        }

        /**
         * Sets the value of the hierarchy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setHIERARCHY(Object value) {
            this.hierarchy = value;
        }

        /**
         * Gets the value of the brandname property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getBRANDNAME() {
            return brandname;
        }

        /**
         * Sets the value of the brandname property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setBRANDNAME(Object value) {
            this.brandname = value;
        }

        /**
         * Gets the value of the color property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCOLOR() {
            return color;
        }

        /**
         * Sets the value of the color property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCOLOR(Object value) {
            this.color = value;
        }

        /**
         * Gets the value of the highlightingcolor property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getHIGHLIGHTINGCOLOR() {
            return highlightingcolor;
        }

        /**
         * Sets the value of the highlightingcolor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setHIGHLIGHTINGCOLOR(Object value) {
            this.highlightingcolor = value;
        }

        /**
         * Gets the value of the colorname property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCOLORNAME() {
            return colorname;
        }

        /**
         * Sets the value of the colorname property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCOLORNAME(Object value) {
            this.colorname = value;
        }

        /**
         * Gets the value of the listrecolowestprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listrecolowestprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTRECOLOWESTPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE }
         * 
         * 
         */
        public List<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE> getLISTRECOLOWESTPRICE() {
            if (listrecolowestprice == null) {
                listrecolowestprice = new ArrayList<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE>();
            }
            return this.listrecolowestprice;
        }

        /**
         * Gets the value of the listservice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listservice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTSERVICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FFCFFDictionaryMapping.LISTFAREFAMILY.LISTSERVICE }
         * 
         * 
         */
        public List<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTSERVICE> getLISTSERVICE() {
            if (listservice == null) {
                listservice = new ArrayList<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTSERVICE>();
            }
            return this.listservice;
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
         *         &lt;element name="QUALIFIER" type="{}unprotectedStringType" minOccurs="0"/&gt;
         *         &lt;element name="VALUE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "qualifier",
            "value"
        })
        public static class LISTQUALIFIER
            implements Serializable
        {

            @XmlElement(name = "QUALIFIER")
            protected String qualifier;
            @XmlElement(name = "VALUE")
            protected String value;

            /**
             * Gets the value of the qualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQUALIFIER() {
                return qualifier;
            }

            /**
             * Sets the value of the qualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQUALIFIER(String value) {
                this.qualifier = value;
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
         *         &lt;element name="LIST_BOUND" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="LIST_RECOMMENDATION_ID" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="RECO_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="BEST_PRICE_RECOMMENDATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
            "listbound"
        })
        public static class LISTRECOLOWESTPRICE
            implements Serializable
        {

            @XmlElement(name = "LIST_BOUND")
            protected List<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND> listbound;

            /**
             * Gets the value of the listbound property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listbound property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTBOUND().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND }
             * 
             * 
             */
            public List<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND> getLISTBOUND() {
                if (listbound == null) {
                    listbound = new ArrayList<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND>();
                }
                return this.listbound;
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
             *         &lt;element name="LIST_RECOMMENDATION_ID" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="RECO_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="BEST_PRICE_RECOMMENDATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
                "listrecommendationid",
                "boundid",
                "bestpricerecommendation"
            })
            public static class LISTBOUND
                implements Serializable
            {

                @XmlElement(name = "LIST_RECOMMENDATION_ID")
                protected List<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND.LISTRECOMMENDATIONID> listrecommendationid;
                @XmlElement(name = "BOUND_ID", required = true)
                protected Object boundid;
                @XmlElement(name = "BEST_PRICE_RECOMMENDATION")
                protected Boolean bestpricerecommendation;

                /**
                 * Gets the value of the listrecommendationid property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listrecommendationid property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTRECOMMENDATIONID().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND.LISTRECOMMENDATIONID }
                 * 
                 * 
                 */
                public List<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND.LISTRECOMMENDATIONID> getLISTRECOMMENDATIONID() {
                    if (listrecommendationid == null) {
                        listrecommendationid = new ArrayList<FFCFFDictionaryMapping.LISTFAREFAMILY.LISTRECOLOWESTPRICE.LISTBOUND.LISTRECOMMENDATIONID>();
                    }
                    return this.listrecommendationid;
                }

                /**
                 * Gets the value of the boundid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getBOUNDID() {
                    return boundid;
                }

                /**
                 * Sets the value of the boundid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setBOUNDID(Object value) {
                    this.boundid = value;
                }

                /**
                 * Gets the value of the bestpricerecommendation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isBESTPRICERECOMMENDATION() {
                    return bestpricerecommendation;
                }

                /**
                 * Sets the value of the bestpricerecommendation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setBESTPRICERECOMMENDATION(Boolean value) {
                    this.bestpricerecommendation = value;
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
                 *         &lt;element name="RECO_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
                    "recoid"
                })
                public static class LISTRECOMMENDATIONID
                    implements Serializable
                {

                    @XmlElement(name = "RECO_ID", required = true)
                    protected BigInteger recoid;

                    /**
                     * Gets the value of the recoid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRECOID() {
                        return recoid;
                    }

                    /**
                     * Sets the value of the recoid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRECOID(BigInteger value) {
                        this.recoid = value;
                    }

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
         *         &lt;element name="SERVICE_STATUS" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="SERVICE_REFERENCE" type="{}unprotectedStringType"/&gt;
         *         &lt;element name="SERVICE_FROM_PRICE" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
            "servicestatus",
            "servicereference",
            "servicefromprice"
        })
        public static class LISTSERVICE
            implements Serializable
        {

            @XmlElement(name = "SERVICE_STATUS", required = true)
            protected String servicestatus;
            @XmlElement(name = "SERVICE_REFERENCE", required = true)
            protected String servicereference;
            @XmlElement(name = "SERVICE_FROM_PRICE")
            protected String servicefromprice;

            /**
             * Gets the value of the servicestatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSERVICESTATUS() {
                return servicestatus;
            }

            /**
             * Sets the value of the servicestatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSERVICESTATUS(String value) {
                this.servicestatus = value;
            }

            /**
             * Gets the value of the servicereference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSERVICEREFERENCE() {
                return servicereference;
            }

            /**
             * Sets the value of the servicereference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSERVICEREFERENCE(String value) {
                this.servicereference = value;
            }

            /**
             * Gets the value of the servicefromprice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSERVICEFROMPRICE() {
                return servicefromprice;
            }

            /**
             * Sets the value of the servicefromprice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSERVICEFROMPRICE(String value) {
                this.servicefromprice = value;
            }

        }

    }

}
