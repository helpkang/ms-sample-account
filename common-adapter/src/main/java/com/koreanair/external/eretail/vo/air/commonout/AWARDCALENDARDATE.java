
package com.koreanair.external.eretail.vo.air.commonout;

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
 * This is the date list format.
 * 
 * <p>Java class for AWARD_CALENDAR_DATE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AWARD_CALENDAR_DATE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NO_FLIGHT_AT_ALL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DATE_NOT_PROCESSED" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LIST_CABIN_STATUS" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CABIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LIST_FLIGHT" type="{}AWARD_FLIGHT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AWARD_CALENDAR_DATE", propOrder = {
    "date",
    "noflightatall",
    "datenotprocessed",
    "listcabinstatus",
    "listflight"
})
public class AWARDCALENDARDATE
    implements Serializable
{

    @XmlElement(name = "DATE", required = true)
    protected AWARDCALENDARDATE.DATE date;
    @XmlElement(name = "NO_FLIGHT_AT_ALL")
    protected boolean noflightatall;
    @XmlElement(name = "DATE_NOT_PROCESSED")
    protected boolean datenotprocessed;
    @XmlElement(name = "LIST_CABIN_STATUS")
    protected List<AWARDCALENDARDATE.LISTCABINSTATUS> listcabinstatus;
    @XmlElement(name = "LIST_FLIGHT")
    protected List<AWARDFLIGHT> listflight;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link AWARDCALENDARDATE.DATE }
     *     
     */
    public AWARDCALENDARDATE.DATE getDATE() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link AWARDCALENDARDATE.DATE }
     *     
     */
    public void setDATE(AWARDCALENDARDATE.DATE value) {
        this.date = value;
    }

    /**
     * Gets the value of the noflightatall property.
     * 
     */
    public boolean isNOFLIGHTATALL() {
        return noflightatall;
    }

    /**
     * Sets the value of the noflightatall property.
     * 
     */
    public void setNOFLIGHTATALL(boolean value) {
        this.noflightatall = value;
    }

    /**
     * Gets the value of the datenotprocessed property.
     * 
     */
    public boolean isDATENOTPROCESSED() {
        return datenotprocessed;
    }

    /**
     * Sets the value of the datenotprocessed property.
     * 
     */
    public void setDATENOTPROCESSED(boolean value) {
        this.datenotprocessed = value;
    }

    /**
     * Gets the value of the listcabinstatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcabinstatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCABINSTATUS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AWARDCALENDARDATE.LISTCABINSTATUS }
     * 
     * 
     */
    public List<AWARDCALENDARDATE.LISTCABINSTATUS> getLISTCABINSTATUS() {
        if (listcabinstatus == null) {
            listcabinstatus = new ArrayList<AWARDCALENDARDATE.LISTCABINSTATUS>();
        }
        return this.listcabinstatus;
    }

    /**
     * Gets the value of the listflight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listflight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFLIGHT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AWARDFLIGHT }
     * 
     * 
     */
    public List<AWARDFLIGHT> getLISTFLIGHT() {
        if (listflight == null) {
            listflight = new ArrayList<AWARDFLIGHT>();
        }
        return this.listflight;
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
    public static class DATE
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
     *         &lt;element name="CABIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "cabin",
        "status"
    })
    public static class LISTCABINSTATUS
        implements Serializable
    {

        @XmlElement(name = "CABIN", required = true)
        protected String cabin;
        @XmlElement(name = "STATUS", required = true)
        protected String status;

        /**
         * Gets the value of the cabin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCABIN() {
            return cabin;
        }

        /**
         * Sets the value of the cabin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCABIN(String value) {
            this.cabin = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUS(String value) {
            this.status = value;
        }

    }

}
