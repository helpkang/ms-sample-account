
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
 * <p>Java class for AREA_RECREATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AREA_RECREATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *         &lt;element name="PROXIMITY_CODE" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_RECREATION_DETAILS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RECREATION_DETAIL" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="REC_CODE" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
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
@XmlType(name = "AREA_RECREATION_TYPE", propOrder = {
    "type",
    "proximitycode",
    "name",
    "listrecreationdetails",
    "listdescription"
})
public class AREARECREATIONTYPE
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected CODENAMETYPESIMPLE type;
    @XmlElement(name = "PROXIMITY_CODE")
    protected CODENAMETYPESIMPLE proximitycode;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "LIST_RECREATION_DETAILS")
    protected List<AREARECREATIONTYPE.LISTRECREATIONDETAILS> listrecreationdetails;
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
     * Gets the value of the proximitycode property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public CODENAMETYPESIMPLE getPROXIMITYCODE() {
        return proximitycode;
    }

    /**
     * Sets the value of the proximitycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESIMPLE }
     *     
     */
    public void setPROXIMITYCODE(CODENAMETYPESIMPLE value) {
        this.proximitycode = value;
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
     * Gets the value of the listrecreationdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrecreationdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRECREATIONDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AREARECREATIONTYPE.LISTRECREATIONDETAILS }
     * 
     * 
     */
    public List<AREARECREATIONTYPE.LISTRECREATIONDETAILS> getLISTRECREATIONDETAILS() {
        if (listrecreationdetails == null) {
            listrecreationdetails = new ArrayList<AREARECREATIONTYPE.LISTRECREATIONDETAILS>();
        }
        return this.listrecreationdetails;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="RECREATION_DETAIL" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="REC_CODE" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
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
        "recreationdetail"
    })
    public static class LISTRECREATIONDETAILS
        implements Serializable
    {

        @XmlElement(name = "RECREATION_DETAIL")
        protected List<AREARECREATIONTYPE.LISTRECREATIONDETAILS.RECREATIONDETAIL> recreationdetail;

        /**
         * Gets the value of the recreationdetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recreationdetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRECREATIONDETAIL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AREARECREATIONTYPE.LISTRECREATIONDETAILS.RECREATIONDETAIL }
         * 
         * 
         */
        public List<AREARECREATIONTYPE.LISTRECREATIONDETAILS.RECREATIONDETAIL> getRECREATIONDETAIL() {
            if (recreationdetail == null) {
                recreationdetail = new ArrayList<AREARECREATIONTYPE.LISTRECREATIONDETAILS.RECREATIONDETAIL>();
            }
            return this.recreationdetail;
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
         *         &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="REC_CODE" type="{}CODE_NAME_TYPE_SIMPLE" minOccurs="0"/&gt;
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
            "listdescription",
            "reccode"
        })
        public static class RECREATIONDETAIL
            implements Serializable
        {

            @XmlElement(name = "LIST_DESCRIPTION")
            protected List<DESCRIPTIONMULTDESCTYPE> listdescription;
            @XmlElement(name = "REC_CODE")
            protected CODENAMETYPESIMPLE reccode;

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
             * Gets the value of the reccode property.
             * 
             * @return
             *     possible object is
             *     {@link CODENAMETYPESIMPLE }
             *     
             */
            public CODENAMETYPESIMPLE getRECCODE() {
                return reccode;
            }

            /**
             * Sets the value of the reccode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CODENAMETYPESIMPLE }
             *     
             */
            public void setRECCODE(CODENAMETYPESIMPLE value) {
                this.reccode = value;
            }

        }

    }

}
