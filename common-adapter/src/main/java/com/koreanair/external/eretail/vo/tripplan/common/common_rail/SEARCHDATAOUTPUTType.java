
package com.koreanair.external.eretail.vo.tripplan.common.common_rail;

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
 * <p>Java class for SEARCH_DATA_OUTPUT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEARCH_DATA_OUTPUT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}SYSTEM_PROVIDER" minOccurs="0"/&gt;
 *         &lt;element name="B_LOCATION" type="{}RAIL_LOCATION_Type"/&gt;
 *         &lt;element name="E_LOCATION" type="{}RAIL_LOCATION_Type"/&gt;
 *         &lt;element name="B_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_TRAIN_PREFERENCE" maxOccurs="3" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TRAIN_COMPANY" type="{}TRAIN_COMPANY_Type"/&gt;
 *                   &lt;element name="CLASS_OF_SERVICE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;length value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RATE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NEGOTIATED_RATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NUMBER_OF_TRAVELLERS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEARCH_DATA_OUTPUT_Type", propOrder = {
    "systemprovider",
    "blocation",
    "elocation",
    "bdate",
    "listtrainpreference",
    "numberoftravellers"
})
public class SEARCHDATAOUTPUTType
    implements Serializable
{

    @XmlElement(name = "SYSTEM_PROVIDER")
    protected String systemprovider;
    @XmlElement(name = "B_LOCATION", required = true)
    protected RAILLOCATIONType blocation;
    @XmlElement(name = "E_LOCATION", required = true)
    protected RAILLOCATIONType elocation;
    @XmlElement(name = "B_DATE", required = true)
    protected SEARCHDATAOUTPUTType.BDATE bdate;
    @XmlElement(name = "LIST_TRAIN_PREFERENCE")
    protected List<SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE> listtrainpreference;
    @XmlElement(name = "NUMBER_OF_TRAVELLERS")
    protected Integer numberoftravellers;

    /**
     * Type of search data. It is SNCF or DBAHN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSTEMPROVIDER() {
        return systemprovider;
    }

    /**
     * Sets the value of the systemprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSTEMPROVIDER(String value) {
        this.systemprovider = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public RAILLOCATIONType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public void setBLOCATION(RAILLOCATIONType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public RAILLOCATIONType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public void setELOCATION(RAILLOCATIONType value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link SEARCHDATAOUTPUTType.BDATE }
     *     
     */
    public SEARCHDATAOUTPUTType.BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEARCHDATAOUTPUTType.BDATE }
     *     
     */
    public void setBDATE(SEARCHDATAOUTPUTType.BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the listtrainpreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtrainpreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAINPREFERENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE }
     * 
     * 
     */
    public List<SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE> getLISTTRAINPREFERENCE() {
        if (listtrainpreference == null) {
            listtrainpreference = new ArrayList<SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE>();
        }
        return this.listtrainpreference;
    }

    /**
     * Gets the value of the numberoftravellers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUMBEROFTRAVELLERS() {
        return numberoftravellers;
    }

    /**
     * Sets the value of the numberoftravellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUMBEROFTRAVELLERS(Integer value) {
        this.numberoftravellers = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
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
    public static class BDATE
        implements Serializable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar code;

        /**
         * String type for value without CDATA
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
     *         &lt;element name="TRAIN_COMPANY" type="{}TRAIN_COMPANY_Type"/&gt;
     *         &lt;element name="CLASS_OF_SERVICE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;length value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RATE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NEGOTIATED_RATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "traincompany",
        "classofservice",
        "ratetype",
        "negotiatedratecode"
    })
    public static class LISTTRAINPREFERENCE
        implements Serializable
    {

        @XmlElement(name = "TRAIN_COMPANY", required = true)
        protected TRAINCOMPANYType traincompany;
        @XmlElement(name = "CLASS_OF_SERVICE", required = true)
        protected SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE.CLASSOFSERVICE classofservice;
        @XmlElement(name = "RATE_TYPE", required = true)
        protected String ratetype;
        @XmlElement(name = "NEGOTIATED_RATE_CODE")
        protected String negotiatedratecode;

        /**
         * Gets the value of the traincompany property.
         * 
         * @return
         *     possible object is
         *     {@link TRAINCOMPANYType }
         *     
         */
        public TRAINCOMPANYType getTRAINCOMPANY() {
            return traincompany;
        }

        /**
         * Sets the value of the traincompany property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRAINCOMPANYType }
         *     
         */
        public void setTRAINCOMPANY(TRAINCOMPANYType value) {
            this.traincompany = value;
        }

        /**
         * Gets the value of the classofservice property.
         * 
         * @return
         *     possible object is
         *     {@link SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE.CLASSOFSERVICE }
         *     
         */
        public SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE.CLASSOFSERVICE getCLASSOFSERVICE() {
            return classofservice;
        }

        /**
         * Sets the value of the classofservice property.
         * 
         * @param value
         *     allowed object is
         *     {@link SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE.CLASSOFSERVICE }
         *     
         */
        public void setCLASSOFSERVICE(SEARCHDATAOUTPUTType.LISTTRAINPREFERENCE.CLASSOFSERVICE value) {
            this.classofservice = value;
        }

        /**
         * Gets the value of the ratetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRATETYPE() {
            return ratetype;
        }

        /**
         * Sets the value of the ratetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRATETYPE(String value) {
            this.ratetype = value;
        }

        /**
         * Gets the value of the negotiatedratecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNEGOTIATEDRATECODE() {
            return negotiatedratecode;
        }

        /**
         * Sets the value of the negotiatedratecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNEGOTIATEDRATECODE(String value) {
            this.negotiatedratecode = value;
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
         *         &lt;element name="CODE"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;length value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "code",
            "name"
        })
        public static class CLASSOFSERVICE
            implements Serializable
        {

            @XmlElement(name = "CODE", required = true)
            protected String code;
            @XmlElement(name = "NAME")
            protected String name;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODE() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODE(String value) {
                this.code = value;
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

        }

    }

}
