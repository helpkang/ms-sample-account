
package com.koreanair.external.eretail.vo.hotel.commonout;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.BLOCATIONITEMTYPE5;
import com.koreanair.external.eretail.vo.hotel.commonelementsout.HTLPRICETYPE;


/**
 * Represents a hotel for AeTM. This elements inherits from other hotel types, be carefull to check the hierarchy before you add something !
 * 
 * <p>Java class for RULES_DRIVEN_HOTEL_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RULES_DRIVEN_HOTEL_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}HOTEL_MULTISOURCE_TYPE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IS_CA_PLUS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}BOOL_IS_OUT_OF_POLICY"/&gt;
 *         &lt;element name="RULE_MAX_BUDGET" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RULE_MAX_BUDGET_CURRENCY" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="RULE_MAX_BUDGET_PRICE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}DISPLAY_RANK" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PROVIDER_SPECIFIC_INFORMATION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="B_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BEST_AVAILABLE_RATE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_SPECIAL_RATE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="B_LOCATION" type="{}B_LOCATION_ITEM_TYPE_5" minOccurs="0"/&gt;
 *         &lt;element name="LOWEST_NEGOTIATED_RATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "RULES_DRIVEN_HOTEL_TYPE", propOrder = {
    "rest"
})
public class RULESDRIVENHOTELTYPE
    extends HOTELMULTISOURCETYPE
{

    @XmlElementRefs({
        @XmlElementRef(name = "RULE_MAX_BUDGET", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LIST_PROVIDER_SPECIFIC_INFORMATION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LOWEST_NEGOTIATED_RATE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DISPLAY_RANK", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BEST_AVAILABLE_RATE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LIST_SPECIAL_RATE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "B_DATE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "B_LOCATION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BOOL_IS_OUT_OF_POLICY", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IS_CA_PLUS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "E_DATE", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "BESTAVAILABLERATE" is used by two different parts of a schema. See: 
     * line 171 of file:/C:/Dev/workspace_ke/JOBDIR/XSD/AERE1711/hotel/commonOut.xsd
     * line 64 of file:/C:/Dev/workspace_ke/JOBDIR/XSD/AERE1711/hotel/commonOut.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RULESDRIVENHOTELTYPE.RULEMAXBUDGET }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link RULESDRIVENHOTELTYPE.LOWESTNEGOTIATEDRATE }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link RULESDRIVENHOTELTYPE.BDATE }{@code >}
     * {@link JAXBElement }{@code <}{@link BLOCATIONITEMTYPE5 }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link RULESDRIVENHOTELTYPE.EDATE }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
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
    public static class BDATE {

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
    public static class EDATE {

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
     *         &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded"/&gt;
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
        "listprice"
    })
    public static class LOWESTNEGOTIATEDRATE {

        @XmlElement(name = "LIST_PRICE", required = true)
        protected List<HTLPRICETYPE> listprice;

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
     *         &lt;element name="RULE_MAX_BUDGET_CURRENCY" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="RULE_MAX_BUDGET_PRICE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "rulemaxbudgetcurrency",
        "rulemaxbudgetprice"
    })
    public static class RULEMAXBUDGET {

        @XmlElement(name = "RULE_MAX_BUDGET_CURRENCY", required = true)
        protected String rulemaxbudgetcurrency;
        @XmlElement(name = "RULE_MAX_BUDGET_PRICE", required = true)
        protected BigInteger rulemaxbudgetprice;

        /**
         * Gets the value of the rulemaxbudgetcurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRULEMAXBUDGETCURRENCY() {
            return rulemaxbudgetcurrency;
        }

        /**
         * Sets the value of the rulemaxbudgetcurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRULEMAXBUDGETCURRENCY(String value) {
            this.rulemaxbudgetcurrency = value;
        }

        /**
         * Gets the value of the rulemaxbudgetprice property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRULEMAXBUDGETPRICE() {
            return rulemaxbudgetprice;
        }

        /**
         * Sets the value of the rulemaxbudgetprice property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRULEMAXBUDGETPRICE(BigInteger value) {
            this.rulemaxbudgetprice = value;
        }

    }

}
