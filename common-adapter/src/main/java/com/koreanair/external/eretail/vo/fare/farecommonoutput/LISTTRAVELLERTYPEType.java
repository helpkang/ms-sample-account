
package com.koreanair.external.eretail.vo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecalculation.FARECALCULATIONRAWType;
import com.koreanair.external.eretail.vo.farecommon.farecalculation.FARECALCULATIONType;
import com.koreanair.external.eretail.vo.farecommon.farecommon.APPLICABLEFEEType;
import com.koreanair.external.eretail.vo.farecommon.ticketchangercommonexternal.WAIVERINFORMATIONType;
import com.koreanair.external.eretail.vo.farecommon.travellercommon.INPUTTRAVELLERType;


/**
 * <p>Java class for LIST_TRAVELLER_TYPE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRAVELLER_TYPE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_TRAVELLER" type="{}LIST_TRAVELLER_Type" maxOccurs="9"/&gt;
 *         &lt;element name="TRAVELLER_TYPE" type="{}INPUT_TRAVELLER_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}NUMBER"/&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}SEGMENT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}TICKET_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element ref="{}FARE_TYPE" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_TRAVELLER_PRICE" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}LIST_TRAVELLER_TYPE_PRICE" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}FAMILY_FARE" minOccurs="0"/&gt;
 *         &lt;element ref="{}E_TICKET_DISCOUNT" minOccurs="0"/&gt;
 *         &lt;element ref="{}PTC_DISCOUNTED" minOccurs="0"/&gt;
 *         &lt;element ref="{}ENDORSE_MSG" minOccurs="0"/&gt;
 *         &lt;element name="FARE_CALCULATION" type="{}FARE_CALCULATION_Type" minOccurs="0"/&gt;
 *         &lt;element name="FARE_CALCULATION_RAW" type="{}FARE_CALCULATION_RAW_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}REVALIDATION_INDICATOR" minOccurs="0"/&gt;
 *         &lt;element name="WAIVER_INFORMATION" type="{}WAIVER_INFORMATION_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_APPLICABLE_MARKUP_DISCOUNT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FORM_OF_PAYMENT_FEES_ELIGIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_FAMILY_DESC_SEGMENT" type="{}LIST_FARE_FAMILY_DESC_SEGMENT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TRAVELLER_TYPE_Type", propOrder = {
    "listtraveller",
    "travellertype",
    "number",
    "listsegment",
    "ticketindicator",
    "faretype",
    "listtravellerprice",
    "listtravellertypeprice",
    "familyfare",
    "eticketdiscount",
    "ptcdiscounted",
    "endorsemsg",
    "farecalculation",
    "farecalculationraw",
    "revalidationindicator",
    "waiverinformation",
    "listapplicablemarkupdiscount",
    "formofpaymentfeeseligible",
    "listfarefamilydescsegment"
})
public class LISTTRAVELLERTYPEType
    implements Serializable
{

    @XmlElement(name = "LIST_TRAVELLER", required = true)
    protected List<LISTTRAVELLERType> listtraveller;
    @XmlElement(name = "TRAVELLER_TYPE")
    protected INPUTTRAVELLERType travellertype;
    @XmlElement(name = "NUMBER", required = true)
    protected BigInteger number;
    @XmlElement(name = "LIST_SEGMENT")
    protected List<SEGMENTType> listsegment;
    @XmlElement(name = "TICKET_INDICATOR")
    protected TICKETINDICATORType ticketindicator;
    @XmlElement(name = "FARE_TYPE")
    protected FARETYPEType faretype;
    @XmlElement(name = "LIST_TRAVELLER_PRICE", required = true)
    protected List<LISTTRAVPRICEType> listtravellerprice;
    @XmlElement(name = "LIST_TRAVELLER_TYPE_PRICE", required = true)
    protected List<LISTTRAVTYPEPRICEType> listtravellertypeprice;
    @XmlElement(name = "FAMILY_FARE")
    protected Boolean familyfare;
    @XmlElement(name = "E_TICKET_DISCOUNT")
    protected Boolean eticketdiscount;
    @XmlElement(name = "PTC_DISCOUNTED")
    protected Boolean ptcdiscounted;
    @XmlElement(name = "ENDORSE_MSG")
    protected String endorsemsg;
    @XmlElement(name = "FARE_CALCULATION")
    protected FARECALCULATIONType farecalculation;
    @XmlElement(name = "FARE_CALCULATION_RAW")
    protected FARECALCULATIONRAWType farecalculationraw;
    @XmlElement(name = "REVALIDATION_INDICATOR")
    protected Boolean revalidationindicator;
    @XmlElement(name = "WAIVER_INFORMATION")
    protected WAIVERINFORMATIONType waiverinformation;
    @XmlElement(name = "LIST_APPLICABLE_MARKUP_DISCOUNT")
    protected List<APPLICABLEFEEType> listapplicablemarkupdiscount;
    @XmlElement(name = "FORM_OF_PAYMENT_FEES_ELIGIBLE")
    protected Boolean formofpaymentfeeseligible;
    @XmlElement(name = "LIST_FARE_FAMILY_DESC_SEGMENT")
    protected List<LISTFAREFAMILYDESCSEGMENTType> listfarefamilydescsegment;

    /**
     * Gets the value of the listtraveller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtraveller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRAVELLERType }
     * 
     * 
     */
    public List<LISTTRAVELLERType> getLISTTRAVELLER() {
        if (listtraveller == null) {
            listtraveller = new ArrayList<LISTTRAVELLERType>();
        }
        return this.listtraveller;
    }

    /**
     * Gets the value of the travellertype property.
     * 
     * @return
     *     possible object is
     *     {@link INPUTTRAVELLERType }
     *     
     */
    public INPUTTRAVELLERType getTRAVELLERTYPE() {
        return travellertype;
    }

    /**
     * Sets the value of the travellertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link INPUTTRAVELLERType }
     *     
     */
    public void setTRAVELLERTYPE(INPUTTRAVELLERType value) {
        this.travellertype = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBER() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBER(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the listsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEGMENTType }
     * 
     * 
     */
    public List<SEGMENTType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<SEGMENTType>();
        }
        return this.listsegment;
    }

    /**
     * Gets the value of the ticketindicator property.
     * 
     * @return
     *     possible object is
     *     {@link TICKETINDICATORType }
     *     
     */
    public TICKETINDICATORType getTICKETINDICATOR() {
        return ticketindicator;
    }

    /**
     * Sets the value of the ticketindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TICKETINDICATORType }
     *     
     */
    public void setTICKETINDICATOR(TICKETINDICATORType value) {
        this.ticketindicator = value;
    }

    /**
     * The type of fare: Published, Negotiated, Private, Corporate. Optional in LIST_ORIGINATING_RECOMMENDATION.
     * 
     * @return
     *     possible object is
     *     {@link FARETYPEType }
     *     
     */
    public FARETYPEType getFARETYPE() {
        return faretype;
    }

    /**
     * Sets the value of the faretype property.
     * 
     * @param value
     *     allowed object is
     *     {@link FARETYPEType }
     *     
     */
    public void setFARETYPE(FARETYPEType value) {
        this.faretype = value;
    }

    /**
     * Gets the value of the listtravellerprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellerprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRAVPRICEType }
     * 
     * 
     */
    public List<LISTTRAVPRICEType> getLISTTRAVELLERPRICE() {
        if (listtravellerprice == null) {
            listtravellerprice = new ArrayList<LISTTRAVPRICEType>();
        }
        return this.listtravellerprice;
    }

    /**
     * Gets the value of the listtravellertypeprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravellertypeprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELLERTYPEPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTRAVTYPEPRICEType }
     * 
     * 
     */
    public List<LISTTRAVTYPEPRICEType> getLISTTRAVELLERTYPEPRICE() {
        if (listtravellertypeprice == null) {
            listtravellertypeprice = new ArrayList<LISTTRAVTYPEPRICEType>();
        }
        return this.listtravellertypeprice;
    }

    /**
     * This indicator shows whether or not a family fare type has been retrieved for one passenger at least in the group type. The value of this parameter can be equal to "true" or "false". Optional in LIST_ORIGINATING_RECOMMENDATION.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFAMILYFARE() {
        return familyfare;
    }

    /**
     * Sets the value of the familyfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFAMILYFARE(Boolean value) {
        this.familyfare = value;
    }

    /**
     * Set to true if an E-Ticketing discount was applied.  Optional in LIST_ORIGINATING_RECOMMENDATION.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isETICKETDISCOUNT() {
        return eticketdiscount;
    }

    /**
     * Sets the value of the eticketdiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETICKETDISCOUNT(Boolean value) {
        this.eticketdiscount = value;
    }

    /**
     * Set to true if PTC Discount code  is applied for that traveller type. Optional in LIST_ORIGINATING_RECOMMENDATION.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPTCDISCOUNTED() {
        return ptcdiscounted;
    }

    /**
     * Sets the value of the ptcdiscounted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPTCDISCOUNTED(Boolean value) {
        this.ptcdiscounted = value;
    }

    /**
     * Gets the value of the endorsemsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDORSEMSG() {
        return endorsemsg;
    }

    /**
     * Sets the value of the endorsemsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDORSEMSG(String value) {
        this.endorsemsg = value;
    }

    /**
     * Gets the value of the farecalculation property.
     * 
     * @return
     *     possible object is
     *     {@link FARECALCULATIONType }
     *     
     */
    public FARECALCULATIONType getFARECALCULATION() {
        return farecalculation;
    }

    /**
     * Sets the value of the farecalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FARECALCULATIONType }
     *     
     */
    public void setFARECALCULATION(FARECALCULATIONType value) {
        this.farecalculation = value;
    }

    /**
     * Gets the value of the farecalculationraw property.
     * 
     * @return
     *     possible object is
     *     {@link FARECALCULATIONRAWType }
     *     
     */
    public FARECALCULATIONRAWType getFARECALCULATIONRAW() {
        return farecalculationraw;
    }

    /**
     * Sets the value of the farecalculationraw property.
     * 
     * @param value
     *     allowed object is
     *     {@link FARECALCULATIONRAWType }
     *     
     */
    public void setFARECALCULATIONRAW(FARECALCULATIONRAWType value) {
        this.farecalculationraw = value;
    }

    /**
     * Gets the value of the revalidationindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isREVALIDATIONINDICATOR() {
        return revalidationindicator;
    }

    /**
     * Sets the value of the revalidationindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setREVALIDATIONINDICATOR(Boolean value) {
        this.revalidationindicator = value;
    }

    /**
     * Gets the value of the waiverinformation property.
     * 
     * @return
     *     possible object is
     *     {@link WAIVERINFORMATIONType }
     *     
     */
    public WAIVERINFORMATIONType getWAIVERINFORMATION() {
        return waiverinformation;
    }

    /**
     * Sets the value of the waiverinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WAIVERINFORMATIONType }
     *     
     */
    public void setWAIVERINFORMATION(WAIVERINFORMATIONType value) {
        this.waiverinformation = value;
    }

    /**
     * Gets the value of the listapplicablemarkupdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listapplicablemarkupdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAPPLICABLEMARKUPDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APPLICABLEFEEType }
     * 
     * 
     */
    public List<APPLICABLEFEEType> getLISTAPPLICABLEMARKUPDISCOUNT() {
        if (listapplicablemarkupdiscount == null) {
            listapplicablemarkupdiscount = new ArrayList<APPLICABLEFEEType>();
        }
        return this.listapplicablemarkupdiscount;
    }

    /**
     * Gets the value of the formofpaymentfeeseligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFORMOFPAYMENTFEESELIGIBLE() {
        return formofpaymentfeeseligible;
    }

    /**
     * Sets the value of the formofpaymentfeeseligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFORMOFPAYMENTFEESELIGIBLE(Boolean value) {
        this.formofpaymentfeeseligible = value;
    }

    /**
     * Gets the value of the listfarefamilydescsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarefamilydescsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREFAMILYDESCSEGMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFAREFAMILYDESCSEGMENTType }
     * 
     * 
     */
    public List<LISTFAREFAMILYDESCSEGMENTType> getLISTFAREFAMILYDESCSEGMENT() {
        if (listfarefamilydescsegment == null) {
            listfarefamilydescsegment = new ArrayList<LISTFAREFAMILYDESCSEGMENTType>();
        }
        return this.listfarefamilydescsegment;
    }

}
