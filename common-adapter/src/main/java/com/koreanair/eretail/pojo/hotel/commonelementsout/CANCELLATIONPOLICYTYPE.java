
package com.koreanair.eretail.pojo.hotel.commonelementsout;

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
 * <p>Java class for CANCELLATION_POLICY_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CANCELLATION_POLICY_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="START_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="END_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="POLICY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEADLINE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RELATIVE_DEADLINE_DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="UNIT" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PENALTY_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_FREETEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CANCELLATION_POLICY_TYPE", propOrder = {
    "startvaliditydate",
    "endvaliditydate",
    "policycode",
    "deadlinedate",
    "relativedeadlinedate",
    "penaltydescription",
    "listdescription"
})
public class CANCELLATIONPOLICYTYPE
    implements Serializable
{

    @XmlElement(name = "START_VALIDITY_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startvaliditydate;
    @XmlElement(name = "END_VALIDITY_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endvaliditydate;
    @XmlElement(name = "POLICY_CODE")
    protected String policycode;
    @XmlElement(name = "DEADLINE_DATE")
    protected String deadlinedate;
    @XmlElement(name = "RELATIVE_DEADLINE_DATE")
    protected CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE relativedeadlinedate;
    @XmlElement(name = "PENALTY_DESCRIPTION")
    protected String penaltydescription;
    @XmlElement(name = "LIST_DESCRIPTION")
    protected List<DESCRIPTIONFREETEXTTYPE> listdescription;

    /**
     * Gets the value of the startvaliditydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTARTVALIDITYDATE() {
        return startvaliditydate;
    }

    /**
     * Sets the value of the startvaliditydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTARTVALIDITYDATE(XMLGregorianCalendar value) {
        this.startvaliditydate = value;
    }

    /**
     * Gets the value of the endvaliditydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getENDVALIDITYDATE() {
        return endvaliditydate;
    }

    /**
     * Sets the value of the endvaliditydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setENDVALIDITYDATE(XMLGregorianCalendar value) {
        this.endvaliditydate = value;
    }

    /**
     * Gets the value of the policycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOLICYCODE() {
        return policycode;
    }

    /**
     * Sets the value of the policycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOLICYCODE(String value) {
        this.policycode = value;
    }

    /**
     * Gets the value of the deadlinedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEADLINEDATE() {
        return deadlinedate;
    }

    /**
     * Sets the value of the deadlinedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEADLINEDATE(String value) {
        this.deadlinedate = value;
    }

    /**
     * Gets the value of the relativedeadlinedate property.
     * 
     * @return
     *     possible object is
     *     {@link CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE }
     *     
     */
    public CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE getRELATIVEDEADLINEDATE() {
        return relativedeadlinedate;
    }

    /**
     * Sets the value of the relativedeadlinedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE }
     *     
     */
    public void setRELATIVEDEADLINEDATE(CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE value) {
        this.relativedeadlinedate = value;
    }

    /**
     * Gets the value of the penaltydescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENALTYDESCRIPTION() {
        return penaltydescription;
    }

    /**
     * Sets the value of the penaltydescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENALTYDESCRIPTION(String value) {
        this.penaltydescription = value;
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
     * {@link DESCRIPTIONFREETEXTTYPE }
     * 
     * 
     */
    public List<DESCRIPTIONFREETEXTTYPE> getLISTDESCRIPTION() {
        if (listdescription == null) {
            listdescription = new ArrayList<DESCRIPTIONFREETEXTTYPE>();
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
     *         &lt;element name="TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="UNIT" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "time",
        "reference",
        "unit",
        "value"
    })
    public static class RELATIVEDEADLINEDATE
        implements Serializable
    {

        @XmlElement(name = "TIME")
        protected String time;
        @XmlElement(name = "REFERENCE")
        protected String reference;
        @XmlElement(name = "UNIT")
        protected CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE.UNIT unit;
        @XmlElement(name = "VALUE")
        protected String value;

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTIME() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTIME(String value) {
            this.time = value;
        }

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFERENCE() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFERENCE(String value) {
            this.reference = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE.UNIT }
         *     
         */
        public CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE.UNIT getUNIT() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE.UNIT }
         *     
         */
        public void setUNIT(CANCELLATIONPOLICYTYPE.RELATIVEDEADLINEDATE.UNIT value) {
            this.unit = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVALUE() {
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
        public void setVALUE(String value) {
            this.value = value;
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "code"
        })
        public static class UNIT
            implements Serializable
        {

            @XmlElement(name = "CODE")
            protected String code;

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

        }

    }

}
