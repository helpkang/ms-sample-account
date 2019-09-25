
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.common.CODENAMETYPESIMPLE;


/**
 * <p>Java class for RESTAURANT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESTAURANT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CATEGORY" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}CODE_NAME_TYPE_SIMPLE"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROXIMITY" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CUISINE_TYPE" type="{}CODE_NAME_TYPE_SIMPLE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SERVED_MEAL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="SEATING_CAPACITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SERVICE_INFO" type="{}CODE_NAME_TYPE_SIMPLE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DRESS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CONTACT_DETAILS" type="{}CONTACT_DETAILS_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_OPERATION_SCHEDULE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
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
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_OPERATION_TIME" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{}LIST_DAY_TYPE"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SORT_INDEX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RESTAURANT_TYPE", propOrder = {
    "category",
    "proximity",
    "name",
    "listcuisinetype",
    "listservedmeal",
    "seatingcapacity",
    "listserviceinfo",
    "dresscode",
    "listdescription",
    "listcontactdetails",
    "listoperationschedule",
    "sortindex"
})
public class RESTAURANTTYPE
    implements Serializable
{

    @XmlElement(name = "CATEGORY")
    protected List<RESTAURANTTYPE.CATEGORY> category;
    @XmlElement(name = "PROXIMITY")
    protected CODENAMETYPESIMPLE proximity;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "LIST_CUISINE_TYPE")
    protected List<CODENAMETYPESIMPLE> listcuisinetype;
    @XmlElement(name = "LIST_SERVED_MEAL")
    protected List<String> listservedmeal;
    @XmlElement(name = "SEATING_CAPACITY")
    protected String seatingcapacity;
    @XmlElement(name = "LIST_SERVICE_INFO")
    protected List<CODENAMETYPESIMPLE> listserviceinfo;
    @XmlElement(name = "DRESS_CODE")
    protected String dresscode;
    @XmlElement(name = "LIST_DESCRIPTION")
    protected List<DESCRIPTIONMULTDESCTYPE> listdescription;
    @XmlElement(name = "LIST_CONTACT_DETAILS")
    protected List<CONTACTDETAILSTYPE> listcontactdetails;
    @XmlElement(name = "LIST_OPERATION_SCHEDULE")
    protected List<RESTAURANTTYPE.LISTOPERATIONSCHEDULE> listoperationschedule;
    @XmlElement(name = "SORT_INDEX")
    protected Object sortindex;

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCATEGORY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RESTAURANTTYPE.CATEGORY }
     * 
     * 
     */
    public List<RESTAURANTTYPE.CATEGORY> getCATEGORY() {
        if (category == null) {
            category = new ArrayList<RESTAURANTTYPE.CATEGORY>();
        }
        return this.category;
    }

    /**
     * Gets the value of the proximity property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public CODENAMETYPESIMPLE getPROXIMITY() {
        return proximity;
    }

    /**
     * Sets the value of the proximity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public void setPROXIMITY(CODENAMETYPESIMPLE value) {
        this.proximity = value;
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
     * Gets the value of the listcuisinetype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcuisinetype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCUISINETYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CODENAMETYPESIMPLE }
     * 
     * 
     */
    public List<CODENAMETYPESIMPLE> getLISTCUISINETYPE() {
        if (listcuisinetype == null) {
            listcuisinetype = new ArrayList<CODENAMETYPESIMPLE>();
        }
        return this.listcuisinetype;
    }

    /**
     * Gets the value of the listservedmeal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservedmeal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVEDMEAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTSERVEDMEAL() {
        if (listservedmeal == null) {
            listservedmeal = new ArrayList<String>();
        }
        return this.listservedmeal;
    }

    /**
     * Gets the value of the seatingcapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEATINGCAPACITY() {
        return seatingcapacity;
    }

    /**
     * Sets the value of the seatingcapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEATINGCAPACITY(String value) {
        this.seatingcapacity = value;
    }

    /**
     * Gets the value of the listserviceinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listserviceinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICEINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CODENAMETYPESIMPLE }
     * 
     * 
     */
    public List<CODENAMETYPESIMPLE> getLISTSERVICEINFO() {
        if (listserviceinfo == null) {
            listserviceinfo = new ArrayList<CODENAMETYPESIMPLE>();
        }
        return this.listserviceinfo;
    }

    /**
     * Gets the value of the dresscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRESSCODE() {
        return dresscode;
    }

    /**
     * Sets the value of the dresscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRESSCODE(String value) {
        this.dresscode = value;
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
     * Gets the value of the listcontactdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcontactdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCONTACTDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONTACTDETAILSTYPE }
     * 
     * 
     */
    public List<CONTACTDETAILSTYPE> getLISTCONTACTDETAILS() {
        if (listcontactdetails == null) {
            listcontactdetails = new ArrayList<CONTACTDETAILSTYPE>();
        }
        return this.listcontactdetails;
    }

    /**
     * Gets the value of the listoperationschedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listoperationschedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTOPERATIONSCHEDULE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RESTAURANTTYPE.LISTOPERATIONSCHEDULE }
     * 
     * 
     */
    public List<RESTAURANTTYPE.LISTOPERATIONSCHEDULE> getLISTOPERATIONSCHEDULE() {
        if (listoperationschedule == null) {
            listoperationschedule = new ArrayList<RESTAURANTTYPE.LISTOPERATIONSCHEDULE>();
        }
        return this.listoperationschedule;
    }

    /**
     * Gets the value of the sortindex property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSORTINDEX() {
        return sortindex;
    }

    /**
     * Sets the value of the sortindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSORTINDEX(Object value) {
        this.sortindex = value;
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
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CATEGORY
        extends CODENAMETYPESIMPLE
        implements Serializable
    {


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
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIST_OPERATION_TIME" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}LIST_DAY_TYPE"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
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
        "listcharge",
        "name",
        "listoperationtime"
    })
    public static class LISTOPERATIONSCHEDULE
        implements Serializable
    {

        @XmlElement(name = "LIST_CHARGE")
        protected List<RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE> listcharge;
        @XmlElement(name = "NAME")
        protected Object name;
        @XmlElement(name = "LIST_OPERATION_TIME")
        protected List<RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTOPERATIONTIME> listoperationtime;

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
         * {@link RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE }
         * 
         * 
         */
        public List<RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE> getLISTCHARGE() {
            if (listcharge == null) {
                listcharge = new ArrayList<RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE>();
            }
            return this.listcharge;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNAME(Object value) {
            this.name = value;
        }

        /**
         * Gets the value of the listoperationtime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listoperationtime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTOPERATIONTIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTOPERATIONTIME }
         * 
         * 
         */
        public List<RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTOPERATIONTIME> getLISTOPERATIONTIME() {
            if (listoperationtime == null) {
                listoperationtime = new ArrayList<RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTOPERATIONTIME>();
            }
            return this.listoperationtime;
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
            protected List<RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE.LISTDESCRIPTION> listdescription;

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
             * {@link RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE.LISTDESCRIPTION }
             * 
             * 
             */
            public List<RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE.LISTDESCRIPTION> getLISTDESCRIPTION() {
                if (listdescription == null) {
                    listdescription = new ArrayList<RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTCHARGE.LISTDESCRIPTION>();
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{}LIST_DAY_TYPE"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="FROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "from",
            "to"
        })
        public static class LISTOPERATIONTIME
            extends LISTDAYTYPE
            implements Serializable
        {

            @XmlElement(name = "FROM")
            protected String from;
            @XmlElement(name = "TO")
            protected String to;

            /**
             * Gets the value of the from property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFROM() {
                return from;
            }

            /**
             * Sets the value of the from property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFROM(String value) {
                this.from = value;
            }

            /**
             * Gets the value of the to property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTO() {
                return to;
            }

            /**
             * Sets the value of the to property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTO(String value) {
                this.to = value;
            }

        }

    }

}
