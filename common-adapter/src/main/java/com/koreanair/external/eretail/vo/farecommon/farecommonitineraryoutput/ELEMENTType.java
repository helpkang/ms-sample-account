
package com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ELEMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ELEMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}LIST_SEGMENT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}HIGHLIGHT" minOccurs="0"/&gt;
 *         &lt;element ref="{}ITEM_ID" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element ref="{}FARE_FAMILY" minOccurs="0"/&gt;
 *         &lt;element ref="{}MODIFICATION_STATUS" minOccurs="0"/&gt;
 *         &lt;element name="SERVICE_LEVEL_SHORT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DISPLAY_LAST_SEATS" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="NUMBER_OF_LAST_SEATS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ELEMENT_Type", propOrder = {
    "listsegment",
    "highlight",
    "itemid",
    "type",
    "farefamily",
    "modificationstatus",
    "servicelevelshortname",
    "displaylastseats",
    "numberoflastseats"
})
public class ELEMENTType
    implements Serializable
{

    @XmlElement(name = "LIST_SEGMENT")
    protected List<LISTSEGMENTType> listsegment;
    @XmlElement(name = "HIGHLIGHT")
    protected Boolean highlight;
    @XmlElement(name = "ITEM_ID")
    protected BigInteger itemid;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "FARE_FAMILY")
    protected FAREFAMILYFareType farefamily;
    @XmlElement(name = "MODIFICATION_STATUS")
    protected String modificationstatus;
    @XmlElement(name = "SERVICE_LEVEL_SHORT_NAME")
    protected String servicelevelshortname;
    @XmlElement(name = "DISPLAY_LAST_SEATS")
    protected String displaylastseats;
    @XmlElement(name = "NUMBER_OF_LAST_SEATS")
    protected BigInteger numberoflastseats;

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
     * {@link LISTSEGMENTType }
     * 
     * 
     */
    public List<LISTSEGMENTType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<LISTSEGMENTType>();
        }
        return this.listsegment;
    }

    /**
     * Gets the value of the highlight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHIGHLIGHT() {
        return highlight;
    }

    /**
     * Sets the value of the highlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHIGHLIGHT(Boolean value) {
        this.highlight = value;
    }

    /**
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMID(BigInteger value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the farefamily property.
     * 
     * @return
     *     possible object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public FAREFAMILYFareType getFAREFAMILY() {
        return farefamily;
    }

    /**
     * Sets the value of the farefamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAREFAMILYFareType }
     *     
     */
    public void setFAREFAMILY(FAREFAMILYFareType value) {
        this.farefamily = value;
    }

    /**
     * Gets the value of the modificationstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODIFICATIONSTATUS() {
        return modificationstatus;
    }

    /**
     * Sets the value of the modificationstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODIFICATIONSTATUS(String value) {
        this.modificationstatus = value;
    }

    /**
     * Gets the value of the servicelevelshortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICELEVELSHORTNAME() {
        return servicelevelshortname;
    }

    /**
     * Sets the value of the servicelevelshortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICELEVELSHORTNAME(String value) {
        this.servicelevelshortname = value;
    }

    /**
     * Gets the value of the displaylastseats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPLAYLASTSEATS() {
        return displaylastseats;
    }

    /**
     * Sets the value of the displaylastseats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPLAYLASTSEATS(String value) {
        this.displaylastseats = value;
    }

    /**
     * Gets the value of the numberoflastseats property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBEROFLASTSEATS() {
        return numberoflastseats;
    }

    /**
     * Sets the value of the numberoflastseats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBEROFLASTSEATS(BigInteger value) {
        this.numberoflastseats = value;
    }

}
