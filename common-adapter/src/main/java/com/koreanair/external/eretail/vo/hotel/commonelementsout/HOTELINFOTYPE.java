
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.common.CODENAMETYPESIMPLE;


/**
 * <p>Java class for HOTEL_INFO_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_INFO_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HOTEL_STATUS" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *         &lt;element name="BUILD_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ROOM_INFO" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *                   &lt;element name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_RENOVATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="COMPLETION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_AREA" type="{}HTL_AREA_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_INFO_TYPE", propOrder = {
    "hotelstatus",
    "builddate",
    "listroominfo",
    "listrenovation",
    "listarea"
})
public class HOTELINFOTYPE
    implements Serializable
{

    @XmlElement(name = "HOTEL_STATUS")
    protected CODENAMETYPESIMPLE hotelstatus;
    @XmlElement(name = "BUILD_DATE")
    protected String builddate;
    @XmlElement(name = "LIST_ROOM_INFO")
    protected List<HOTELINFOTYPE.LISTROOMINFO> listroominfo;
    @XmlElement(name = "LIST_RENOVATION")
    protected List<HOTELINFOTYPE.LISTRENOVATION> listrenovation;
    @XmlElement(name = "LIST_AREA")
    protected List<HTLAREATYPE> listarea;

    /**
     * Gets the value of the hotelstatus property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public CODENAMETYPESIMPLE getHOTELSTATUS() {
        return hotelstatus;
    }

    /**
     * Sets the value of the hotelstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public void setHOTELSTATUS(CODENAMETYPESIMPLE value) {
        this.hotelstatus = value;
    }

    /**
     * Gets the value of the builddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUILDDATE() {
        return builddate;
    }

    /**
     * Sets the value of the builddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUILDDATE(String value) {
        this.builddate = value;
    }

    /**
     * Gets the value of the listroominfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listroominfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTROOMINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HOTELINFOTYPE.LISTROOMINFO }
     * 
     * 
     */
    public List<HOTELINFOTYPE.LISTROOMINFO> getLISTROOMINFO() {
        if (listroominfo == null) {
            listroominfo = new ArrayList<HOTELINFOTYPE.LISTROOMINFO>();
        }
        return this.listroominfo;
    }

    /**
     * Gets the value of the listrenovation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrenovation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRENOVATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HOTELINFOTYPE.LISTRENOVATION }
     * 
     * 
     */
    public List<HOTELINFOTYPE.LISTRENOVATION> getLISTRENOVATION() {
        if (listrenovation == null) {
            listrenovation = new ArrayList<HOTELINFOTYPE.LISTRENOVATION>();
        }
        return this.listrenovation;
    }

    /**
     * Gets the value of the listarea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listarea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAREA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HTLAREATYPE }
     * 
     * 
     */
    public List<HTLAREATYPE> getLISTAREA() {
        if (listarea == null) {
            listarea = new ArrayList<HTLAREATYPE>();
        }
        return this.listarea;
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
     *         &lt;element name="COMPLETION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "completiondate",
        "listdescription"
    })
    public static class LISTRENOVATION
        implements Serializable
    {

        @XmlElement(name = "COMPLETION_DATE")
        protected String completiondate;
        @XmlElement(name = "LIST_DESCRIPTION")
        protected List<DESCRIPTIONMULTDESCTYPE> listdescription;

        /**
         * Gets the value of the completiondate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPLETIONDATE() {
            return completiondate;
        }

        /**
         * Sets the value of the completiondate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPLETIONDATE(String value) {
            this.completiondate = value;
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
     *         &lt;element name="TYPE" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
     *         &lt;element name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "type",
        "quantity",
        "listdescription"
    })
    public static class LISTROOMINFO
        implements Serializable
    {

        @XmlElement(name = "TYPE")
        protected CODENAMETYPESIMPLE type;
        @XmlElement(name = "QUANTITY")
        protected Integer quantity;
        @XmlElement(name = "LIST_DESCRIPTION")
        protected List<DESCRIPTIONMULTDESCTYPE> listdescription;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link CODENAMETYPESIMPLE }
         *     
         */
        public CODENAMETYPESIMPLE getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link CODENAMETYPESIMPLE }
         *     
         */
        public void setTYPE(CODENAMETYPESIMPLE value) {
            this.type = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQUANTITY() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQUANTITY(Integer value) {
            this.quantity = value;
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
