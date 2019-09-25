
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TRAIN_TRAVELLER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRAIN_TRAVELLER_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAVELLER_TYPE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LIST_CONTACT_POINT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="H1"/&gt;
 *                         &lt;enumeration value="M1"/&gt;
 *                         &lt;enumeration value="F1"/&gt;
 *                         &lt;enumeration value="B1"/&gt;
 *                         &lt;enumeration value="P1"/&gt;
 *                         &lt;enumeration value="E1"/&gt;
 *                         &lt;enumeration value="E2"/&gt;
 *                         &lt;enumeration value="E3"/&gt;
 *                         &lt;enumeration value="S1"/&gt;
 *                         &lt;enumeration value="T1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}LIST_DISCOUNT_CARD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MEAL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_FREQUENT_TRAVELLER" maxOccurs="3" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="COMPANY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAYMENT_INFORMATION" type="{}PAYMENT_INFORMATION_Type" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_INFORMATION" type="{}DELIVERY_INFORMATION_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRAIN_TRAVELLER_Type", propOrder = {
    "travellertype",
    "title",
    "lastname",
    "firstname",
    "dateofbirth",
    "age",
    "listcontactpoint",
    "listdiscountcard",
    "meal",
    "listfrequenttraveller",
    "paymentinformation",
    "deliveryinformation"
})
public class TRAINTRAVELLERType
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_TYPE")
    protected TRAINTRAVELLERType.TRAVELLERTYPE travellertype;
    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "LAST_NAME")
    protected String lastname;
    @XmlElement(name = "FIRST_NAME")
    protected String firstname;
    @XmlElement(name = "DATE_OF_BIRTH")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateofbirth;
    @XmlElement(name = "AGE")
    protected Integer age;
    @XmlElement(name = "LIST_CONTACT_POINT")
    protected List<TRAINTRAVELLERType.LISTCONTACTPOINT> listcontactpoint;
    @XmlElement(name = "LIST_DISCOUNT_CARD")
    protected List<TRAINDISCOUNTCARDType> listdiscountcard;
    @XmlElement(name = "MEAL")
    protected TRAINTRAVELLERType.MEAL meal;
    @XmlElement(name = "LIST_FREQUENT_TRAVELLER")
    protected List<TRAINTRAVELLERType.LISTFREQUENTTRAVELLER> listfrequenttraveller;
    @XmlElement(name = "PAYMENT_INFORMATION")
    protected PAYMENTINFORMATIONType paymentinformation;
    @XmlElement(name = "DELIVERY_INFORMATION")
    protected DELIVERYINFORMATIONType deliveryinformation;

    /**
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINTRAVELLERType.TRAVELLERTYPE }
     *     
     */
    public TRAINTRAVELLERType.TRAVELLERTYPE getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINTRAVELLERType.TRAVELLERTYPE }
     *     
     */
    public void setTRAVELLERTYPE(TRAINTRAVELLERType.TRAVELLERTYPE value) {
        this.travellertype = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITLE(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTNAME() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTNAME(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTNAME() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTNAME(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the dateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEOFBIRTH() {
        return dateofbirth;
    }

    /**
     * Sets the value of the dateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEOFBIRTH(XMLGregorianCalendar value) {
        this.dateofbirth = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAGE() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAGE(Integer value) {
        this.age = value;
    }

    /**
     * Gets the value of the listcontactpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcontactpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCONTACTPOINT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAINTRAVELLERType.LISTCONTACTPOINT }
     * 
     * 
     */
    public List<TRAINTRAVELLERType.LISTCONTACTPOINT> getLISTCONTACTPOINT() {
        if (listcontactpoint == null) {
            listcontactpoint = new ArrayList<TRAINTRAVELLERType.LISTCONTACTPOINT>();
        }
        return this.listcontactpoint;
    }

    /**
     * List of dicount cards: only user profile associated Gets the value of the listdiscountcard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdiscountcard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISCOUNTCARD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAINDISCOUNTCARDType }
     * 
     * 
     */
    public List<TRAINDISCOUNTCARDType> getLISTDISCOUNTCARD() {
        if (listdiscountcard == null) {
            listdiscountcard = new ArrayList<TRAINDISCOUNTCARDType>();
        }
        return this.listdiscountcard;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINTRAVELLERType.MEAL }
     *     
     */
    public TRAINTRAVELLERType.MEAL getMEAL() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINTRAVELLERType.MEAL }
     *     
     */
    public void setMEAL(TRAINTRAVELLERType.MEAL value) {
        this.meal = value;
    }

    /**
     * Gets the value of the listfrequenttraveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfrequenttraveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFREQUENTTRAVELLER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAINTRAVELLERType.LISTFREQUENTTRAVELLER }
     * 
     * 
     */
    public List<TRAINTRAVELLERType.LISTFREQUENTTRAVELLER> getLISTFREQUENTTRAVELLER() {
        if (listfrequenttraveller == null) {
            listfrequenttraveller = new ArrayList<TRAINTRAVELLERType.LISTFREQUENTTRAVELLER>();
        }
        return this.listfrequenttraveller;
    }

    /**
     * Gets the value of the paymentinformation property.
     * 
     * @return
     *     possible object is
     *     {@link PAYMENTINFORMATIONType }
     *     
     */
    public PAYMENTINFORMATIONType getPAYMENTINFORMATION() {
        return paymentinformation;
    }

    /**
     * Sets the value of the paymentinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYMENTINFORMATIONType }
     *     
     */
    public void setPAYMENTINFORMATION(PAYMENTINFORMATIONType value) {
        this.paymentinformation = value;
    }

    /**
     * Gets the value of the deliveryinformation property.
     * 
     * @return
     *     possible object is
     *     {@link DELIVERYINFORMATIONType }
     *     
     */
    public DELIVERYINFORMATIONType getDELIVERYINFORMATION() {
        return deliveryinformation;
    }

    /**
     * Sets the value of the deliveryinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DELIVERYINFORMATIONType }
     *     
     */
    public void setDELIVERYINFORMATION(DELIVERYINFORMATIONType value) {
        this.deliveryinformation = value;
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
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="H1"/&gt;
     *               &lt;enumeration value="M1"/&gt;
     *               &lt;enumeration value="F1"/&gt;
     *               &lt;enumeration value="B1"/&gt;
     *               &lt;enumeration value="P1"/&gt;
     *               &lt;enumeration value="E1"/&gt;
     *               &lt;enumeration value="E2"/&gt;
     *               &lt;enumeration value="E3"/&gt;
     *               &lt;enumeration value="S1"/&gt;
     *               &lt;enumeration value="T1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    public static class LISTCONTACTPOINT
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected String code;
        @XmlElement(name = "NAME", required = true)
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
     *         &lt;element name="COMPANY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "company",
        "code",
        "number"
    })
    public static class LISTFREQUENTTRAVELLER
        implements Serializable
    {

        @XmlElement(name = "COMPANY", required = true)
        protected String company;
        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "NUMBER", required = true)
        protected String number;

        /**
         * Gets the value of the company property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPANY() {
            return company;
        }

        /**
         * Sets the value of the company property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPANY(String value) {
            this.company = value;
        }

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
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBER() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBER(String value) {
            this.number = value;
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
    public static class MEAL
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
     *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
    public static class TRAVELLERTYPE
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
