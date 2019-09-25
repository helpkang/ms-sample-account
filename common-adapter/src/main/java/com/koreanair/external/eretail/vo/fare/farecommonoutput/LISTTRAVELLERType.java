
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.LISTPRICEType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.REBOOKBALANCETRAVType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.REBOOKFEEType;


/**
 * <p>Java class for LIST_TRAVELLER_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRAVELLER_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}HAS_INFANT"/&gt;
 *         &lt;element ref="{}DATE_OF_BIRTH" minOccurs="0"/&gt;
 *         &lt;element ref="{}IS_PRIMARY_TRAVELLER"/&gt;
 *         &lt;element ref="{}REQUESTED_TRAVELLER_TYPE"/&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{}REBOOK_FEE" minOccurs="0"/&gt;
 *         &lt;element ref="{}NO_SHOW_FEE" minOccurs="0"/&gt;
 *         &lt;element name="REBOOK_BALANCE" type="{}REBOOK_BALANCE_TRAV_Type" minOccurs="0"/&gt;
 *         &lt;element name="COLLECT_BALANCE" type="{}REBOOK_BALANCE_TRAV_Type" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_COLLECT_BALANCE" type="{}REBOOK_BALANCE_TRAV_Type" minOccurs="0"/&gt;
 *         &lt;element name="REFUND_BALANCE" type="{}REBOOK_BALANCE_TRAV_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}RELATIONSHIP" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PRICE" type="{}LIST_PRICE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}MilesOutputGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TRAVELLER_Type", propOrder = {
    "hasinfant",
    "dateofbirth",
    "isprimarytraveller",
    "requestedtravellertype",
    "travellerid",
    "rebookfee",
    "noshowfee",
    "rebookbalance",
    "collectbalance",
    "totalcollectbalance",
    "refundbalance",
    "relationship",
    "listprice",
    "milescost",
    "additionalmilescostinfo"
})
public class LISTTRAVELLERType
    implements Serializable
{

    @XmlElement(name = "HAS_INFANT")
    protected boolean hasinfant;
    @XmlElement(name = "DATE_OF_BIRTH")
    protected String dateofbirth;
    @XmlElement(name = "IS_PRIMARY_TRAVELLER")
    protected boolean isprimarytraveller;
    @XmlElement(name = "REQUESTED_TRAVELLER_TYPE", required = true)
    protected TRAVELERType requestedtravellertype;
    @XmlElement(name = "TRAVELLER_ID")
    protected BigInteger travellerid;
    @XmlElement(name = "REBOOK_FEE")
    protected REBOOKFEEType rebookfee;
    @XmlElement(name = "NO_SHOW_FEE")
    protected REBOOKFEEType noshowfee;
    @XmlElement(name = "REBOOK_BALANCE")
    protected REBOOKBALANCETRAVType rebookbalance;
    @XmlElement(name = "COLLECT_BALANCE")
    protected REBOOKBALANCETRAVType collectbalance;
    @XmlElement(name = "TOTAL_COLLECT_BALANCE")
    protected REBOOKBALANCETRAVType totalcollectbalance;
    @XmlElement(name = "REFUND_BALANCE")
    protected REBOOKBALANCETRAVType refundbalance;
    @XmlElement(name = "RELATIONSHIP")
    protected String relationship;
    @XmlElement(name = "LIST_PRICE")
    protected List<LISTPRICEType> listprice;
    @XmlElement(name = "MILES_COST")
    protected BigInteger milescost;
    @XmlElement(name = "ADDITIONAL_MILES_COST_INFO")
    protected ADDITIONALMILESCOSTINFOType additionalmilescostinfo;

    /**
     * Gets the value of the hasinfant property.
     * 
     */
    public boolean isHASINFANT() {
        return hasinfant;
    }

    /**
     * Sets the value of the hasinfant property.
     * 
     */
    public void setHASINFANT(boolean value) {
        this.hasinfant = value;
    }

    /**
     * Gets the value of the dateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEOFBIRTH() {
        return dateofbirth;
    }

    /**
     * Sets the value of the dateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEOFBIRTH(String value) {
        this.dateofbirth = value;
    }

    /**
     * Gets the value of the isprimarytraveller property.
     * 
     */
    public boolean isISPRIMARYTRAVELLER() {
        return isprimarytraveller;
    }

    /**
     * Sets the value of the isprimarytraveller property.
     * 
     */
    public void setISPRIMARYTRAVELLER(boolean value) {
        this.isprimarytraveller = value;
    }

    /**
     * Gets the value of the requestedtravellertype property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELERType }
     *     
     */
    public TRAVELERType getREQUESTEDTRAVELLERTYPE() {
        return requestedtravellertype;
    }

    /**
     * Sets the value of the requestedtravellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELERType }
     *     
     */
    public void setREQUESTEDTRAVELLERTYPE(TRAVELERType value) {
        this.requestedtravellertype = value;
    }

    /**
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRAVELLERID(BigInteger value) {
        this.travellerid = value;
    }

    /**
     * Gets the value of the rebookfee property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKFEEType }
     *     
     */
    public REBOOKFEEType getREBOOKFEE() {
        return rebookfee;
    }

    /**
     * Sets the value of the rebookfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKFEEType }
     *     
     */
    public void setREBOOKFEE(REBOOKFEEType value) {
        this.rebookfee = value;
    }

    /**
     * Gets the value of the noshowfee property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKFEEType }
     *     
     */
    public REBOOKFEEType getNOSHOWFEE() {
        return noshowfee;
    }

    /**
     * Sets the value of the noshowfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKFEEType }
     *     
     */
    public void setNOSHOWFEE(REBOOKFEEType value) {
        this.noshowfee = value;
    }

    /**
     * Gets the value of the rebookbalance property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKBALANCETRAVType }
     *     
     */
    public REBOOKBALANCETRAVType getREBOOKBALANCE() {
        return rebookbalance;
    }

    /**
     * Sets the value of the rebookbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKBALANCETRAVType }
     *     
     */
    public void setREBOOKBALANCE(REBOOKBALANCETRAVType value) {
        this.rebookbalance = value;
    }

    /**
     * Gets the value of the collectbalance property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKBALANCETRAVType }
     *     
     */
    public REBOOKBALANCETRAVType getCOLLECTBALANCE() {
        return collectbalance;
    }

    /**
     * Sets the value of the collectbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKBALANCETRAVType }
     *     
     */
    public void setCOLLECTBALANCE(REBOOKBALANCETRAVType value) {
        this.collectbalance = value;
    }

    /**
     * Gets the value of the totalcollectbalance property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKBALANCETRAVType }
     *     
     */
    public REBOOKBALANCETRAVType getTOTALCOLLECTBALANCE() {
        return totalcollectbalance;
    }

    /**
     * Sets the value of the totalcollectbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKBALANCETRAVType }
     *     
     */
    public void setTOTALCOLLECTBALANCE(REBOOKBALANCETRAVType value) {
        this.totalcollectbalance = value;
    }

    /**
     * Gets the value of the refundbalance property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKBALANCETRAVType }
     *     
     */
    public REBOOKBALANCETRAVType getREFUNDBALANCE() {
        return refundbalance;
    }

    /**
     * Sets the value of the refundbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKBALANCETRAVType }
     *     
     */
    public void setREFUNDBALANCE(REBOOKBALANCETRAVType value) {
        this.refundbalance = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELATIONSHIP() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELATIONSHIP(String value) {
        this.relationship = value;
    }

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
     * {@link LISTPRICEType }
     * 
     * 
     */
    public List<LISTPRICEType> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<LISTPRICEType>();
        }
        return this.listprice;
    }

    /**
     * Gets the value of the milescost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMILESCOST() {
        return milescost;
    }

    /**
     * Sets the value of the milescost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMILESCOST(BigInteger value) {
        this.milescost = value;
    }

    /**
     * Gets the value of the additionalmilescostinfo property.
     * 
     * @return
     *     possible object is
     *     {@link ADDITIONALMILESCOSTINFOType }
     *     
     */
    public ADDITIONALMILESCOSTINFOType getADDITIONALMILESCOSTINFO() {
        return additionalmilescostinfo;
    }

    /**
     * Sets the value of the additionalmilescostinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDITIONALMILESCOSTINFOType }
     *     
     */
    public void setADDITIONALMILESCOSTINFO(ADDITIONALMILESCOSTINFOType value) {
        this.additionalmilescostinfo = value;
    }

}
