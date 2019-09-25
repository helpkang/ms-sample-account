
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MISC_GUEST_POLICY_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MISC_GUEST_POLICY_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="START_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="END_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="KIDS_STAY_FREE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MAX_CHILD_AGE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="USUAL_STAY_FREE_CHILD_PER_ADULT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MIN_GUEST_AGE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="USUAL_STAY_FREE_CUTOFF_AGE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_GUEST_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DESCRIPTION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_TEXT" type="{}DESCRIPTION_FREETEXT_TEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MISC_GUEST_POLICY_TYPE", propOrder = {
    "startvaliditydate",
    "endvaliditydate",
    "kidsstayfree",
    "maxchildage",
    "usualstayfreechildperadult",
    "minguestage",
    "usualstayfreecutoffage",
    "totalguestcount",
    "listdescription"
})
public class MISCGUESTPOLICYTYPE
    implements Serializable
{

    @XmlElement(name = "START_VALIDITY_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startvaliditydate;
    @XmlElement(name = "END_VALIDITY_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endvaliditydate;
    @XmlElement(name = "KIDS_STAY_FREE")
    protected Boolean kidsstayfree;
    @XmlElement(name = "MAX_CHILD_AGE")
    protected BigInteger maxchildage;
    @XmlElement(name = "USUAL_STAY_FREE_CHILD_PER_ADULT")
    protected BigInteger usualstayfreechildperadult;
    @XmlElement(name = "MIN_GUEST_AGE")
    protected BigInteger minguestage;
    @XmlElement(name = "USUAL_STAY_FREE_CUTOFF_AGE")
    protected BigInteger usualstayfreecutoffage;
    @XmlElement(name = "TOTAL_GUEST_COUNT")
    protected BigInteger totalguestcount;
    @XmlElement(name = "LIST_DESCRIPTION")
    protected List<MISCGUESTPOLICYTYPE.LISTDESCRIPTION> listdescription;

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
     * Gets the value of the kidsstayfree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKIDSSTAYFREE() {
        return kidsstayfree;
    }

    /**
     * Sets the value of the kidsstayfree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKIDSSTAYFREE(Boolean value) {
        this.kidsstayfree = value;
    }

    /**
     * Gets the value of the maxchildage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMAXCHILDAGE() {
        return maxchildage;
    }

    /**
     * Sets the value of the maxchildage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMAXCHILDAGE(BigInteger value) {
        this.maxchildage = value;
    }

    /**
     * Gets the value of the usualstayfreechildperadult property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUSUALSTAYFREECHILDPERADULT() {
        return usualstayfreechildperadult;
    }

    /**
     * Sets the value of the usualstayfreechildperadult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUSUALSTAYFREECHILDPERADULT(BigInteger value) {
        this.usualstayfreechildperadult = value;
    }

    /**
     * Gets the value of the minguestage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMINGUESTAGE() {
        return minguestage;
    }

    /**
     * Sets the value of the minguestage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMINGUESTAGE(BigInteger value) {
        this.minguestage = value;
    }

    /**
     * Gets the value of the usualstayfreecutoffage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUSUALSTAYFREECUTOFFAGE() {
        return usualstayfreecutoffage;
    }

    /**
     * Sets the value of the usualstayfreecutoffage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUSUALSTAYFREECUTOFFAGE(BigInteger value) {
        this.usualstayfreecutoffage = value;
    }

    /**
     * Gets the value of the totalguestcount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTOTALGUESTCOUNT() {
        return totalguestcount;
    }

    /**
     * Sets the value of the totalguestcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTOTALGUESTCOUNT(BigInteger value) {
        this.totalguestcount = value;
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
     * {@link MISCGUESTPOLICYTYPE.LISTDESCRIPTION }
     * 
     * 
     */
    public List<MISCGUESTPOLICYTYPE.LISTDESCRIPTION> getLISTDESCRIPTION() {
        if (listdescription == null) {
            listdescription = new ArrayList<MISCGUESTPOLICYTYPE.LISTDESCRIPTION>();
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
     *         &lt;element name="LIST_TEXT" type="{}DESCRIPTION_FREETEXT_TEXT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listtext"
    })
    public static class LISTDESCRIPTION
        implements Serializable
    {

        @XmlElement(name = "LIST_TEXT")
        protected List<DESCRIPTIONFREETEXTTEXTTYPE> listtext;

        /**
         * Gets the value of the listtext property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listtext property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTTEXT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DESCRIPTIONFREETEXTTEXTTYPE }
         * 
         * 
         */
        public List<DESCRIPTIONFREETEXTTEXTTYPE> getLISTTEXT() {
            if (listtext == null) {
                listtext = new ArrayList<DESCRIPTIONFREETEXTTEXTTYPE>();
            }
            return this.listtext;
        }

    }

}
