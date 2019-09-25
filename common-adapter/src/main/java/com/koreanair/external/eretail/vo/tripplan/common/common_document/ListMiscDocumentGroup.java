
package com.koreanair.external.eretail.vo.tripplan.common.common_document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.tripplan.common.common_fare.Currency;


/**
 * <p>Java class for listMiscDocumentGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listMiscDocumentGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_MISC_DOCUMENT" type="{}listMiscDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SSR_CODE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="GROUP_BE_STATUS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ELIGIBLE_TO_CARRYOVER" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MAX_SSR_CARDINALITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_GROUP_PRICE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INITIAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="BALANCED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CURRENCY" type="{}currency"/&gt;
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
@XmlType(name = "listMiscDocumentGroup", propOrder = {
    "listmiscdocument",
    "groupid",
    "listtravellerid",
    "listsegmentid",
    "listelementid",
    "ssrcode",
    "groupbestatus",
    "eligibletocarryover",
    "maxssrcardinality",
    "listgroupprice"
})
public class ListMiscDocumentGroup
    implements Serializable
{

    @XmlElement(name = "LIST_MISC_DOCUMENT")
    protected List<ListMiscDocument> listmiscdocument;
    @XmlElement(name = "GROUP_ID")
    protected Integer groupid;
    @XmlElement(name = "LIST_TRAVELLER_ID")
    protected List<BigInteger> listtravellerid;
    @XmlElement(name = "LIST_SEGMENT_ID")
    protected List<BigInteger> listsegmentid;
    @XmlElement(name = "LIST_ELEMENT_ID")
    protected List<BigInteger> listelementid;
    @XmlElement(name = "SSR_CODE")
    protected String ssrcode;
    @XmlElement(name = "GROUP_BE_STATUS")
    protected Integer groupbestatus;
    @XmlElement(name = "ELIGIBLE_TO_CARRYOVER")
    protected Boolean eligibletocarryover;
    @XmlElement(name = "MAX_SSR_CARDINALITY")
    protected BigInteger maxssrcardinality;
    @XmlElement(name = "LIST_GROUP_PRICE")
    protected List<ListMiscDocumentGroup.LISTGROUPPRICE> listgroupprice;

    /**
     * Gets the value of the listmiscdocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmiscdocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMISCDOCUMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListMiscDocument }
     * 
     * 
     */
    public List<ListMiscDocument> getLISTMISCDOCUMENT() {
        if (listmiscdocument == null) {
            listmiscdocument = new ArrayList<ListMiscDocument>();
        }
        return this.listmiscdocument;
    }

    /**
     * Gets the value of the groupid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGROUPID() {
        return groupid;
    }

    /**
     * Sets the value of the groupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGROUPID(Integer value) {
        this.groupid = value;
    }

    /**
     * Gets the value of the listtravellerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTTRAVELLERID() {
        if (listtravellerid == null) {
            listtravellerid = new ArrayList<BigInteger>();
        }
        return this.listtravellerid;
    }

    /**
     * Gets the value of the listsegmentid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegmentid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTSEGMENTID() {
        if (listsegmentid == null) {
            listsegmentid = new ArrayList<BigInteger>();
        }
        return this.listsegmentid;
    }

    /**
     * Gets the value of the listelementid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelementid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTELEMENTID() {
        if (listelementid == null) {
            listelementid = new ArrayList<BigInteger>();
        }
        return this.listelementid;
    }

    /**
     * Gets the value of the ssrcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCODE() {
        return ssrcode;
    }

    /**
     * Sets the value of the ssrcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCODE(String value) {
        this.ssrcode = value;
    }

    /**
     * Gets the value of the groupbestatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGROUPBESTATUS() {
        return groupbestatus;
    }

    /**
     * Sets the value of the groupbestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGROUPBESTATUS(Integer value) {
        this.groupbestatus = value;
    }

    /**
     * Gets the value of the eligibletocarryover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isELIGIBLETOCARRYOVER() {
        return eligibletocarryover;
    }

    /**
     * Sets the value of the eligibletocarryover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setELIGIBLETOCARRYOVER(Boolean value) {
        this.eligibletocarryover = value;
    }

    /**
     * Gets the value of the maxssrcardinality property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMAXSSRCARDINALITY() {
        return maxssrcardinality;
    }

    /**
     * Sets the value of the maxssrcardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMAXSSRCARDINALITY(BigInteger value) {
        this.maxssrcardinality = value;
    }

    /**
     * Gets the value of the listgroupprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listgroupprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTGROUPPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListMiscDocumentGroup.LISTGROUPPRICE }
     * 
     * 
     */
    public List<ListMiscDocumentGroup.LISTGROUPPRICE> getLISTGROUPPRICE() {
        if (listgroupprice == null) {
            listgroupprice = new ArrayList<ListMiscDocumentGroup.LISTGROUPPRICE>();
        }
        return this.listgroupprice;
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
     *         &lt;element name="INITIAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="BALANCED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CURRENCY" type="{}currency"/&gt;
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
        "initialamount",
        "amount",
        "balancedamount",
        "currency"
    })
    public static class LISTGROUPPRICE
        implements Serializable
    {

        @XmlElement(name = "INITIAL_AMOUNT")
        protected BigDecimal initialamount;
        @XmlElement(name = "AMOUNT", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "BALANCED_AMOUNT")
        protected BigDecimal balancedamount;
        @XmlElement(name = "CURRENCY", required = true)
        protected Currency currency;

        /**
         * Gets the value of the initialamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINITIALAMOUNT() {
            return initialamount;
        }

        /**
         * Sets the value of the initialamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINITIALAMOUNT(BigDecimal value) {
            this.initialamount = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the balancedamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBALANCEDAMOUNT() {
            return balancedamount;
        }

        /**
         * Sets the value of the balancedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBALANCEDAMOUNT(BigDecimal value) {
            this.balancedamount = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link Currency }
         *     
         */
        public Currency getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link Currency }
         *     
         */
        public void setCURRENCY(Currency value) {
            this.currency = value;
        }

    }

}
