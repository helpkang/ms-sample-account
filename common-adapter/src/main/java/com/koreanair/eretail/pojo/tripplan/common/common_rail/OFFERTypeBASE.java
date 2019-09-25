
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OFFER_Type_BASE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OFFER_Type_BASE"&gt;
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
 *         &lt;element name="E_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DURATION" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}SEGMENT_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OPERATING_INFORMATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OFFER_Type_BASE", propOrder = {
    "systemprovider",
    "blocation",
    "elocation",
    "bdate",
    "edate",
    "duration",
    "listsegment",
    "operatinginformation"
})
@XmlSeeAlso({
    BOOKEDOFFERType.class,
    OFFERType.class
})
public class OFFERTypeBASE
    implements Serializable
{

    @XmlElement(name = "SYSTEM_PROVIDER")
    protected String systemprovider;
    @XmlElement(name = "B_LOCATION", required = true)
    protected RAILLOCATIONType blocation;
    @XmlElement(name = "E_LOCATION", required = true)
    protected RAILLOCATIONType elocation;
    @XmlElement(name = "B_DATE", required = true)
    protected OFFERTypeBASE.BDATE bdate;
    @XmlElement(name = "E_DATE", required = true)
    protected OFFERTypeBASE.EDATE edate;
    @XmlElement(name = "DURATION", required = true)
    protected String duration;
    @XmlElement(name = "LIST_SEGMENT", required = true)
    protected List<SEGMENTType> listsegment;
    @XmlElement(name = "OPERATING_INFORMATION")
    protected String operatinginformation;

    /**
     * Gets the value of the systemprovider property.
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
     *     {@link OFFERTypeBASE.BDATE }
     *     
     */
    public OFFERTypeBASE.BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFFERTypeBASE.BDATE }
     *     
     */
    public void setBDATE(OFFERTypeBASE.BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link OFFERTypeBASE.EDATE }
     *     
     */
    public OFFERTypeBASE.EDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFFERTypeBASE.EDATE }
     *     
     */
    public void setEDATE(OFFERTypeBASE.EDATE value) {
        this.edate = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDURATION() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDURATION(String value) {
        this.duration = value;
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
     * {@link SEGMENTType }
     * 
     * 
     */
    public List<SEGMENTType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<SEGMENTType>();
        }
        return this.listsegment;
    }

    /**
     * Gets the value of the operatinginformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATINGINFORMATION() {
        return operatinginformation;
    }

    /**
     * Sets the value of the operatinginformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATINGINFORMATION(String value) {
        this.operatinginformation = value;
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
    public static class EDATE
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

}
