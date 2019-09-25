
package com.koreanair.external.eretail.vo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CR3923840 : factorized to reuse for booked itinerary repricing and automatic ticket update
 * 
 * <p>Java class for TICKET_DOCUMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TICKET_DOCUMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DOCUMENT_NUMBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ASSOCIATED_TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ASSOCIATED_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ASSOCIATED_TST_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_ASSOCIATED_TSM_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PAX_INDICATOR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="PAX"/&gt;
 *               &lt;enumeration value="INF"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FUTURE_USE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TICKET_DOCUMENT_Type", propOrder = {
    "documentnumber",
    "associatedtravellerid",
    "listassociatedsegmentid",
    "associatedtstid",
    "listassociatedtsmid",
    "paxindicator",
    "futureuse"
})
public class TICKETDOCUMENTType
    implements Serializable
{

    @XmlElement(name = "DOCUMENT_NUMBER", required = true)
    protected String documentnumber;
    @XmlElement(name = "ASSOCIATED_TRAVELLER_ID")
    protected BigInteger associatedtravellerid;
    @XmlElement(name = "LIST_ASSOCIATED_SEGMENT_ID")
    protected List<BigInteger> listassociatedsegmentid;
    @XmlElement(name = "ASSOCIATED_TST_ID")
    protected BigInteger associatedtstid;
    @XmlElement(name = "LIST_ASSOCIATED_TSM_ID")
    protected List<BigInteger> listassociatedtsmid;
    @XmlElement(name = "PAX_INDICATOR")
    protected String paxindicator;
    @XmlElement(name = "FUTURE_USE")
    protected Boolean futureuse;

    /**
     * Gets the value of the documentnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCUMENTNUMBER() {
        return documentnumber;
    }

    /**
     * Sets the value of the documentnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCUMENTNUMBER(String value) {
        this.documentnumber = value;
    }

    /**
     * Gets the value of the associatedtravellerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getASSOCIATEDTRAVELLERID() {
        return associatedtravellerid;
    }

    /**
     * Sets the value of the associatedtravellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setASSOCIATEDTRAVELLERID(BigInteger value) {
        this.associatedtravellerid = value;
    }

    /**
     * Gets the value of the listassociatedsegmentid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listassociatedsegmentid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTASSOCIATEDSEGMENTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTASSOCIATEDSEGMENTID() {
        if (listassociatedsegmentid == null) {
            listassociatedsegmentid = new ArrayList<BigInteger>();
        }
        return this.listassociatedsegmentid;
    }

    /**
     * Gets the value of the associatedtstid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getASSOCIATEDTSTID() {
        return associatedtstid;
    }

    /**
     * Sets the value of the associatedtstid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setASSOCIATEDTSTID(BigInteger value) {
        this.associatedtstid = value;
    }

    /**
     * Gets the value of the listassociatedtsmid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listassociatedtsmid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTASSOCIATEDTSMID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTASSOCIATEDTSMID() {
        if (listassociatedtsmid == null) {
            listassociatedtsmid = new ArrayList<BigInteger>();
        }
        return this.listassociatedtsmid;
    }

    /**
     * Gets the value of the paxindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAXINDICATOR() {
        return paxindicator;
    }

    /**
     * Sets the value of the paxindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAXINDICATOR(String value) {
        this.paxindicator = value;
    }

    /**
     * Gets the value of the futureuse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFUTUREUSE() {
        return futureuse;
    }

    /**
     * Sets the value of the futureuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFUTUREUSE(Boolean value) {
        this.futureuse = value;
    }

}
