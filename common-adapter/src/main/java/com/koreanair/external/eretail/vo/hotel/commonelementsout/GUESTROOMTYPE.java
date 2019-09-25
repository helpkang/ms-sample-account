
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.common.CODENAMETYPESIMPLE;


/**
 * <p>Java class for GUEST_ROOM_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GUEST_ROOM_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MAX_OCCUPANCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHILD_OCCUPANCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADULT_OCCUPANCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ROOM_TYPE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}ROOM_TYPE_1"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_BED_TYPE" type="{}BED_TYPE_1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NUMBER_OF_BEDS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="SIZE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="CLASSIFICATION" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *                   &lt;element name="CATEGORY" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *                   &lt;element name="VIEW" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *                   &lt;element name="TYPE" type="{}ROOM_CATEGORY_TYPE_1" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_ROOM_AMENITIES" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}CODE_NAME_TYPE_SIMPLE"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_CHARGE" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="INCLUDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="CHARGE_UNIT" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *                             &lt;element name="LIST_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="LIST_TEXT" type="{}DESCRIPTION_FREETEXT_TEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GUEST_ROOM_TYPE", propOrder = {
    "maxoccupancy",
    "childoccupancy",
    "adultoccupancy",
    "listroomtype",
    "listroomamenities",
    "listdescription"
})
public class GUESTROOMTYPE
    implements Serializable
{

    @XmlElement(name = "MAX_OCCUPANCY")
    protected String maxoccupancy;
    @XmlElement(name = "CHILD_OCCUPANCY")
    protected String childoccupancy;
    @XmlElement(name = "ADULT_OCCUPANCY")
    protected String adultoccupancy;
    @XmlElement(name = "LIST_ROOM_TYPE")
    protected List<GUESTROOMTYPE.LISTROOMTYPE> listroomtype;
    @XmlElement(name = "LIST_ROOM_AMENITIES")
    protected List<GUESTROOMTYPE.LISTROOMAMENITIES> listroomamenities;
    @XmlElement(name = "LIST_DESCRIPTION")
    protected List<DESCRIPTIONMULTDESCTYPE> listdescription;

    /**
     * Gets the value of the maxoccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXOCCUPANCY() {
        return maxoccupancy;
    }

    /**
     * Sets the value of the maxoccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXOCCUPANCY(String value) {
        this.maxoccupancy = value;
    }

    /**
     * Gets the value of the childoccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHILDOCCUPANCY() {
        return childoccupancy;
    }

    /**
     * Sets the value of the childoccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHILDOCCUPANCY(String value) {
        this.childoccupancy = value;
    }

    /**
     * Gets the value of the adultoccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADULTOCCUPANCY() {
        return adultoccupancy;
    }

    /**
     * Sets the value of the adultoccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADULTOCCUPANCY(String value) {
        this.adultoccupancy = value;
    }

    /**
     * Gets the value of the listroomtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listroomtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTROOMTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GUESTROOMTYPE.LISTROOMTYPE }
     * 
     * 
     */
    public List<GUESTROOMTYPE.LISTROOMTYPE> getLISTROOMTYPE() {
        if (listroomtype == null) {
            listroomtype = new ArrayList<GUESTROOMTYPE.LISTROOMTYPE>();
        }
        return this.listroomtype;
    }

    /**
     * Gets the value of the listroomamenities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listroomamenities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTROOMAMENITIES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GUESTROOMTYPE.LISTROOMAMENITIES }
     * 
     * 
     */
    public List<GUESTROOMTYPE.LISTROOMAMENITIES> getLISTROOMAMENITIES() {
        if (listroomamenities == null) {
            listroomamenities = new ArrayList<GUESTROOMTYPE.LISTROOMAMENITIES>();
        }
        return this.listroomamenities;
    }

    /**
     * Gets the value of the listdescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESCRIPTIONMULTDESCTYPE }
     * 
     * 
     */
    public List<DESCRIPTIONMULTDESCTYPE> getLISTDESCRIPTION() {
        if (listdescription == null) {
            listdescription = new ArrayList<DESCRIPTIONMULTDESCTYPE>();
        }
        return this.listdescription;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}CODE_NAME_TYPE_SIMPLE"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LIST_CHARGE" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="INCLUDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="CHARGE_UNIT" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
     *                   &lt;element name="LIST_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="LIST_TEXT" type="{}DESCRIPTION_FREETEXT_TEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "listcharge"
    })
    public static class LISTROOMAMENITIES
        extends CODENAMETYPESIMPLE
        implements Serializable
    {

        @XmlElement(name = "LIST_CHARGE")
        protected List<GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE> listcharge;

        /**
         * Gets the value of the listcharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCHARGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE }
         * 
         * 
         */
        public List<GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE> getLISTCHARGE() {
            if (listcharge == null) {
                listcharge = new ArrayList<GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE>();
            }
            return this.listcharge;
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
         *         &lt;element name="INCLUDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="CHARGE_UNIT" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
         *         &lt;element name="LIST_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="LIST_TEXT" type="{}DESCRIPTION_FREETEXT_TEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "included",
            "listprice",
            "chargeunit",
            "listdescription"
        })
        public static class LISTCHARGE
            implements Serializable
        {

            @XmlElement(name = "INCLUDED")
            protected Boolean included;
            @XmlElement(name = "LIST_PRICE")
            protected List<HTLPRICETYPE> listprice;
            @XmlElement(name = "CHARGE_UNIT")
            protected CODENAMETYPESIMPLE chargeunit;
            @XmlElement(name = "LIST_DESCRIPTION")
            protected List<GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE.LISTDESCRIPTION> listdescription;

            /**
             * Gets the value of the included property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isINCLUDED() {
                return included;
            }

            /**
             * Sets the value of the included property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setINCLUDED(Boolean value) {
                this.included = value;
            }

            /**
             * Gets the value of the listprice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listprice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTPRICE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link HTLPRICETYPE }
             * 
             * 
             */
            public List<HTLPRICETYPE> getLISTPRICE() {
                if (listprice == null) {
                    listprice = new ArrayList<HTLPRICETYPE>();
                }
                return this.listprice;
            }

            /**
             * Gets the value of the chargeunit property.
             * 
             * @return
             *     possible object is
             *     {@link CODENAMETYPESIMPLE }
             *     
             */
            public CODENAMETYPESIMPLE getCHARGEUNIT() {
                return chargeunit;
            }

            /**
             * Sets the value of the chargeunit property.
             * 
             * @param value
             *     allowed object is
             *     {@link CODENAMETYPESIMPLE }
             *     
             */
            public void setCHARGEUNIT(CODENAMETYPESIMPLE value) {
                this.chargeunit = value;
            }

            /**
             * Gets the value of the listdescription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listdescription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLISTDESCRIPTION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE.LISTDESCRIPTION }
             * 
             * 
             */
            public List<GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE.LISTDESCRIPTION> getLISTDESCRIPTION() {
                if (listdescription == null) {
                    listdescription = new ArrayList<GUESTROOMTYPE.LISTROOMAMENITIES.LISTCHARGE.LISTDESCRIPTION>();
                }
                return this.listdescription;
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
             *         &lt;element name="LIST_TEXT" type="{}DESCRIPTION_FREETEXT_TEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "listtext"
            })
            public static class LISTDESCRIPTION
                implements Serializable
            {

                @XmlElement(name = "LIST_TEXT")
                protected List<DESCRIPTIONFREETEXTTEXTTYPE> listtext;

                /**
                 * Gets the value of the listtext property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listtext property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLISTTEXT().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DESCRIPTIONFREETEXTTEXTTYPE }
                 * 
                 * 
                 */
                public List<DESCRIPTIONFREETEXTTEXTTYPE> getLISTTEXT() {
                    if (listtext == null) {
                        listtext = new ArrayList<DESCRIPTIONFREETEXTTEXTTYPE>();
                    }
                    return this.listtext;
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
     *     &lt;extension base="{}ROOM_TYPE_1"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LIST_BED_TYPE" type="{}BED_TYPE_1" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER_OF_BEDS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="SIZE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="CLASSIFICATION" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
     *         &lt;element name="CATEGORY" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
     *         &lt;element name="VIEW" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
     *         &lt;element name="TYPE" type="{}ROOM_CATEGORY_TYPE_1" minOccurs="0"/&gt;
     *         &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "listbedtype",
        "numberofbeds",
        "size",
        "classification",
        "category",
        "view",
        "type",
        "listdescription"
    })
    public static class LISTROOMTYPE
        extends ROOMTYPE1
        implements Serializable
    {

        @XmlElement(name = "LIST_BED_TYPE")
        protected List<BEDTYPE1> listbedtype;
        @XmlElement(name = "NUMBER_OF_BEDS")
        protected Integer numberofbeds;
        @XmlElement(name = "SIZE")
        protected BigInteger size;
        @XmlElement(name = "CLASSIFICATION")
        protected CODENAMETYPESIMPLE classification;
        @XmlElement(name = "CATEGORY")
        protected CODENAMETYPESIMPLE category;
        @XmlElement(name = "VIEW")
        protected CODENAMETYPESIMPLE view;
        @XmlElement(name = "TYPE")
        protected ROOMCATEGORYTYPE1 type;
        @XmlElement(name = "LIST_DESCRIPTION")
        protected List<DESCRIPTIONMULTDESCTYPE> listdescription;

        /**
         * Gets the value of the listbedtype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listbedtype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTBEDTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BEDTYPE1 }
         * 
         * 
         */
        public List<BEDTYPE1> getLISTBEDTYPE() {
            if (listbedtype == null) {
                listbedtype = new ArrayList<BEDTYPE1>();
            }
            return this.listbedtype;
        }

        /**
         * Gets the value of the numberofbeds property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNUMBEROFBEDS() {
            return numberofbeds;
        }

        /**
         * Sets the value of the numberofbeds property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNUMBEROFBEDS(Integer value) {
            this.numberofbeds = value;
        }

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSIZE() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSIZE(BigInteger value) {
            this.size = value;
        }

        /**
         * Gets the value of the classification property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAMETYPESIMPLE }
         *     
         */
        public CODENAMETYPESIMPLE getCLASSIFICATION() {
            return classification;
        }

        /**
         * Sets the value of the classification property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAMETYPESIMPLE }
         *     
         */
        public void setCLASSIFICATION(CODENAMETYPESIMPLE value) {
            this.classification = value;
        }

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAMETYPESIMPLE }
         *     
         */
        public CODENAMETYPESIMPLE getCATEGORY() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAMETYPESIMPLE }
         *     
         */
        public void setCATEGORY(CODENAMETYPESIMPLE value) {
            this.category = value;
        }

        /**
         * Gets the value of the view property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAMETYPESIMPLE }
         *     
         */
        public CODENAMETYPESIMPLE getVIEW() {
            return view;
        }

        /**
         * Sets the value of the view property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAMETYPESIMPLE }
         *     
         */
        public void setVIEW(CODENAMETYPESIMPLE value) {
            this.view = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link ROOMCATEGORYTYPE1 }
         *     
         */
        public ROOMCATEGORYTYPE1 getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link ROOMCATEGORYTYPE1 }
         *     
         */
        public void setTYPE(ROOMCATEGORYTYPE1 value) {
            this.type = value;
        }

        /**
         * Gets the value of the listdescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listdescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTDESCRIPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DESCRIPTIONMULTDESCTYPE }
         * 
         * 
         */
        public List<DESCRIPTIONMULTDESCTYPE> getLISTDESCRIPTION() {
            if (listdescription == null) {
                listdescription = new ArrayList<DESCRIPTIONMULTDESCTYPE>();
            }
            return this.listdescription;
        }

    }

}
