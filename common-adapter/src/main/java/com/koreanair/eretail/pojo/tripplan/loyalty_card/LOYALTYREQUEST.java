
package com.koreanair.eretail.pojo.tripplan.loyalty_card;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.profile.commonprofileout.CODENAMEPAIRTYPE;
import com.koreanair.eretail.pojo.tripplan.common.common_technical_ids.TechnicalIds;


/**
 * <p>Java class for LOYALTY_REQUEST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOYALTY_REQUEST"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REQUEST_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="OPERATING_COMPANY" type="{}CODE_NAME_PAIR_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="IS_REQUEST_VALIDATED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVELER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TECHNICAL_IDS" type="{}TechnicalIds" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOYALTY_REQUEST", propOrder = {
    "requestid",
    "operatingcompany",
    "status",
    "isrequestvalidated",
    "comment",
    "listtravelerid",
    "listsegmentid",
    "technicalids"
})
@XmlSeeAlso({
    LOYALTYREDEMPTIONREQUEST.class
})
public class LOYALTYREQUEST
    implements Serializable
{

    @XmlElement(name = "REQUEST_ID")
    protected BigInteger requestid;
    @XmlElement(name = "OPERATING_COMPANY")
    protected CODENAMEPAIRTYPE operatingcompany;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "IS_REQUEST_VALIDATED")
    protected Boolean isrequestvalidated;
    @XmlElement(name = "COMMENT")
    protected String comment;
    @XmlElement(name = "LIST_TRAVELER_ID")
    protected List<BigInteger> listtravelerid;
    @XmlElement(name = "LIST_SEGMENT_ID")
    protected List<BigInteger> listsegmentid;
    @XmlElement(name = "TECHNICAL_IDS")
    protected TechnicalIds technicalids;

    /**
     * Gets the value of the requestid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getREQUESTID() {
        return requestid;
    }

    /**
     * Sets the value of the requestid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setREQUESTID(BigInteger value) {
        this.requestid = value;
    }

    /**
     * Gets the value of the operatingcompany property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public CODENAMEPAIRTYPE getOPERATINGCOMPANY() {
        return operatingcompany;
    }

    /**
     * Sets the value of the operatingcompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMEPAIRTYPE }
     *     
     */
    public void setOPERATINGCOMPANY(CODENAMEPAIRTYPE value) {
        this.operatingcompany = value;
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

    /**
     * Gets the value of the isrequestvalidated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISREQUESTVALIDATED() {
        return isrequestvalidated;
    }

    /**
     * Sets the value of the isrequestvalidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISREQUESTVALIDATED(Boolean value) {
        this.isrequestvalidated = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMENT() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMENT(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the listtravelerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravelerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTTRAVELERID() {
        if (listtravelerid == null) {
            listtravelerid = new ArrayList<BigInteger>();
        }
        return this.listtravelerid;
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
     * Gets the value of the technicalids property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalIds }
     *     
     */
    public TechnicalIds getTECHNICALIDS() {
        return technicalids;
    }

    /**
     * Sets the value of the technicalids property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalIds }
     *     
     */
    public void setTECHNICALIDS(TechnicalIds value) {
        this.technicalids = value;
    }

}
