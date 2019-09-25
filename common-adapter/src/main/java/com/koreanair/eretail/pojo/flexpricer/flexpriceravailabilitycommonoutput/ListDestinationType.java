
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
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
import com.koreanair.eretail.pojo.flexpricer.commonavailabilityoutput.LocationType;


/**
 * <p>Java class for ListDestinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListDestinationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="B_LOCATION" type="{}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="E_LOCATION" type="{}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="B_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="B_ANYTIME" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="B_TIME_WINDOW" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DATE_RANGE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="QUALIFIER"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="C"/&gt;
 *                         &lt;enumeration value="P"/&gt;
 *                         &lt;enumeration value="M"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORIGINAL_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MULTI_B_LOCATION" type="{}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MULTI_E_LOCATION" type="{}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListDestinationType", propOrder = {
    "blocation",
    "elocation",
    "bdate",
    "banytime",
    "btimewindow",
    "daterange",
    "originaltime",
    "listmultiblocation",
    "listmultielocation"
})
public class ListDestinationType
    implements Serializable
{

    @XmlElement(name = "B_LOCATION")
    protected LocationType blocation;
    @XmlElement(name = "E_LOCATION")
    protected LocationType elocation;
    @XmlElement(name = "B_DATE")
    protected ListDestinationType.BDATE bdate;
    @XmlElement(name = "B_ANYTIME")
    protected Boolean banytime;
    @XmlElement(name = "B_TIME_WINDOW")
    protected BigInteger btimewindow;
    @XmlElement(name = "DATE_RANGE")
    protected ListDestinationType.DATERANGE daterange;
    @XmlElement(name = "ORIGINAL_TIME")
    protected String originaltime;
    @XmlElement(name = "LIST_MULTI_B_LOCATION")
    protected List<LocationType> listmultiblocation;
    @XmlElement(name = "LIST_MULTI_E_LOCATION")
    protected List<LocationType> listmultielocation;

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setBLOCATION(LocationType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setELOCATION(LocationType value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link ListDestinationType.BDATE }
     *     
     */
    public ListDestinationType.BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListDestinationType.BDATE }
     *     
     */
    public void setBDATE(ListDestinationType.BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the banytime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBANYTIME() {
        return banytime;
    }

    /**
     * Sets the value of the banytime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBANYTIME(Boolean value) {
        this.banytime = value;
    }

    /**
     * Gets the value of the btimewindow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBTIMEWINDOW() {
        return btimewindow;
    }

    /**
     * Sets the value of the btimewindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBTIMEWINDOW(BigInteger value) {
        this.btimewindow = value;
    }

    /**
     * Gets the value of the daterange property.
     * 
     * @return
     *     possible object is
     *     {@link ListDestinationType.DATERANGE }
     *     
     */
    public ListDestinationType.DATERANGE getDATERANGE() {
        return daterange;
    }

    /**
     * Sets the value of the daterange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListDestinationType.DATERANGE }
     *     
     */
    public void setDATERANGE(ListDestinationType.DATERANGE value) {
        this.daterange = value;
    }

    /**
     * Gets the value of the originaltime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGINALTIME() {
        return originaltime;
    }

    /**
     * Sets the value of the originaltime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGINALTIME(String value) {
        this.originaltime = value;
    }

    /**
     * Gets the value of the listmultiblocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmultiblocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMULTIBLOCATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getLISTMULTIBLOCATION() {
        if (listmultiblocation == null) {
            listmultiblocation = new ArrayList<LocationType>();
        }
        return this.listmultiblocation;
    }

    /**
     * Gets the value of the listmultielocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmultielocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMULTIELOCATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getLISTMULTIELOCATION() {
        if (listmultielocation == null) {
            listmultielocation = new ArrayList<LocationType>();
        }
        return this.listmultielocation;
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
    public static class BDATE
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
     *         &lt;element name="QUALIFIER"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="C"/&gt;
     *               &lt;enumeration value="P"/&gt;
     *               &lt;enumeration value="M"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    public static class DATERANGE
        implements Serializable
    {

        @XmlElement(name = "QUALIFIER", required = true)
        protected String qualifier;
        @XmlElement(name = "VALUE", required = true)
        protected BigInteger value;

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
         *     {@link BigInteger }
         *     
         */
        public BigInteger getVALUE() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setVALUE(BigInteger value) {
            this.value = value;
        }

    }

}
