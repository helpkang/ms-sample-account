
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

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
 * <p>Java class for ON_HOLD_INFORMATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ON_HOLD_INFORMATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IS_TRIP_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ON_HOLD_TIME_LIMIT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_ON_HOLD_CITIES_TIME_LIMIT" type="{}LIST_ON_HOLD_CITIES_TIME_LIMIT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ON_HOLD_INFORMATION_Type", propOrder = {
    "istripeligible",
    "onholdtimelimit",
    "listonholdcitiestimelimit"
})
public class ONHOLDINFORMATIONType
    implements Serializable
{

    @XmlElement(name = "IS_TRIP_ELIGIBLE")
    protected boolean istripeligible;
    @XmlElement(name = "ON_HOLD_TIME_LIMIT")
    protected ONHOLDINFORMATIONType.ONHOLDTIMELIMIT onholdtimelimit;
    @XmlElement(name = "LIST_ON_HOLD_CITIES_TIME_LIMIT")
    protected List<LISTONHOLDCITIESTIMELIMITType> listonholdcitiestimelimit;

    /**
     * Gets the value of the istripeligible property.
     * 
     */
    public boolean isISTRIPELIGIBLE() {
        return istripeligible;
    }

    /**
     * Sets the value of the istripeligible property.
     * 
     */
    public void setISTRIPELIGIBLE(boolean value) {
        this.istripeligible = value;
    }

    /**
     * Gets the value of the onholdtimelimit property.
     * 
     * @return
     *     possible object is
     *     {@link ONHOLDINFORMATIONType.ONHOLDTIMELIMIT }
     *     
     */
    public ONHOLDINFORMATIONType.ONHOLDTIMELIMIT getONHOLDTIMELIMIT() {
        return onholdtimelimit;
    }

    /**
     * Sets the value of the onholdtimelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ONHOLDINFORMATIONType.ONHOLDTIMELIMIT }
     *     
     */
    public void setONHOLDTIMELIMIT(ONHOLDINFORMATIONType.ONHOLDTIMELIMIT value) {
        this.onholdtimelimit = value;
    }

    /**
     * Gets the value of the listonholdcitiestimelimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listonholdcitiestimelimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTONHOLDCITIESTIMELIMIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTONHOLDCITIESTIMELIMITType }
     * 
     * 
     */
    public List<LISTONHOLDCITIESTIMELIMITType> getLISTONHOLDCITIESTIMELIMIT() {
        if (listonholdcitiestimelimit == null) {
            listonholdcitiestimelimit = new ArrayList<LISTONHOLDCITIESTIMELIMITType>();
        }
        return this.listonholdcitiestimelimit;
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
    public static class ONHOLDTIMELIMIT
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
