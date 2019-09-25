
package com.koreanair.eretail.pojo.import_git.com_amadeus_jcp_objectmodel_pnr_rebooking_waiver.waiveritem;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representation of central system ticketAttributesGrp in Ticket_CheckEligibility
 * 
 * <p>Java class for waiverTicketItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waiverTicketItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FROM" type="{}waiverLocationLists" minOccurs="0"/&gt;
 *         &lt;element name="TO" type="{}waiverLocationLists" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="LIST_DATE_RANGE" maxOccurs="9" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="FIRST_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="LAST_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="LIST_DATE_OFFSET" maxOccurs="9" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="OFFSET_BEFORE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                     &lt;element name="OFFSET_AFTER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waiverTicketItem", propOrder = {
    "from",
    "to",
    "listdaterange",
    "listdateoffset"
})
public class WaiverTicketItem
    implements Serializable
{

    @XmlElement(name = "FROM")
    protected WaiverLocationLists from;
    @XmlElement(name = "TO")
    protected WaiverLocationLists to;
    @XmlElement(name = "LIST_DATE_RANGE")
    protected List<WaiverTicketItem.LISTDATERANGE> listdaterange;
    @XmlElement(name = "LIST_DATE_OFFSET")
    protected List<WaiverTicketItem.LISTDATEOFFSET> listdateoffset;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link WaiverLocationLists }
     *     
     */
    public WaiverLocationLists getFROM() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverLocationLists }
     *     
     */
    public void setFROM(WaiverLocationLists value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link WaiverLocationLists }
     *     
     */
    public WaiverLocationLists getTO() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverLocationLists }
     *     
     */
    public void setTO(WaiverLocationLists value) {
        this.to = value;
    }

    /**
     * Gets the value of the listdaterange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdaterange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDATERANGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaiverTicketItem.LISTDATERANGE }
     * 
     * 
     */
    public List<WaiverTicketItem.LISTDATERANGE> getLISTDATERANGE() {
        if (listdaterange == null) {
            listdaterange = new ArrayList<WaiverTicketItem.LISTDATERANGE>();
        }
        return this.listdaterange;
    }

    /**
     * Gets the value of the listdateoffset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdateoffset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDATEOFFSET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaiverTicketItem.LISTDATEOFFSET }
     * 
     * 
     */
    public List<WaiverTicketItem.LISTDATEOFFSET> getLISTDATEOFFSET() {
        if (listdateoffset == null) {
            listdateoffset = new ArrayList<WaiverTicketItem.LISTDATEOFFSET>();
        }
        return this.listdateoffset;
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
     *         &lt;element name="OFFSET_BEFORE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="OFFSET_AFTER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
        "offsetbefore",
        "offsetafter"
    })
    public static class LISTDATEOFFSET
        implements Serializable
    {

        @XmlElement(name = "OFFSET_BEFORE")
        protected BigInteger offsetbefore;
        @XmlElement(name = "OFFSET_AFTER")
        protected BigInteger offsetafter;

        /**
         * Gets the value of the offsetbefore property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOFFSETBEFORE() {
            return offsetbefore;
        }

        /**
         * Sets the value of the offsetbefore property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOFFSETBEFORE(BigInteger value) {
            this.offsetbefore = value;
        }

        /**
         * Gets the value of the offsetafter property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOFFSETAFTER() {
            return offsetafter;
        }

        /**
         * Sets the value of the offsetafter property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOFFSETAFTER(BigInteger value) {
            this.offsetafter = value;
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
     *         &lt;element name="FIRST_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LAST_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "firstdate",
        "lastdate"
    })
    public static class LISTDATERANGE
        implements Serializable
    {

        @XmlElement(name = "FIRST_DATE", required = true)
        protected String firstdate;
        @XmlElement(name = "LAST_DATE", required = true)
        protected String lastdate;

        /**
         * Gets the value of the firstdate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIRSTDATE() {
            return firstdate;
        }

        /**
         * Sets the value of the firstdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIRSTDATE(String value) {
            this.firstdate = value;
        }

        /**
         * Gets the value of the lastdate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLASTDATE() {
            return lastdate;
        }

        /**
         * Sets the value of the lastdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLASTDATE(String value) {
            this.lastdate = value;
        }

    }

}
