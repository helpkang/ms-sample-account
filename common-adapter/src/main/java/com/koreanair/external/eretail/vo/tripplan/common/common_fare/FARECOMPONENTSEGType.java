
package com.koreanair.external.eretail.vo.tripplan.common.common_fare;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FARE_COMPONENT_SEG_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FARE_COMPONENT_SEG_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}FROM_TO_Pair"/&gt;
 *         &lt;element name="AIRLINE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="SIDE_TRIP_INDICATOR" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;group ref="{}Q_FareComponentSegmentSurcharge_Group"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FARE_COMPONENT_SEG_Type", propOrder = {
    "from",
    "to",
    "airline",
    "indicator",
    "sidetripindicator",
    "surchargeprice",
    "listsurchargeprice"
})
public class FARECOMPONENTSEGType
    implements Serializable
{

    @XmlElement(name = "FROM", required = true)
    protected String from;
    @XmlElement(name = "TO", required = true)
    protected String to;
    @XmlElement(name = "AIRLINE", required = true)
    protected String airline;
    @XmlElement(name = "INDICATOR")
    protected String indicator;
    @XmlElement(name = "SIDE_TRIP_INDICATOR")
    protected String sidetripindicator;
    @XmlElement(name = "SURCHARGE_PRICE")
    protected String surchargeprice;
    @XmlElement(name = "LIST_SURCHARGE_PRICE")
    protected List<String> listsurchargeprice;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFROM() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFROM(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTO() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTO(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIRLINE() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIRLINE(String value) {
        this.airline = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICATOR() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICATOR(String value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the sidetripindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIDETRIPINDICATOR() {
        return sidetripindicator;
    }

    /**
     * Sets the value of the sidetripindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIDETRIPINDICATOR(String value) {
        this.sidetripindicator = value;
    }

    /**
     * Gets the value of the surchargeprice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSURCHARGEPRICE() {
        return surchargeprice;
    }

    /**
     * Sets the value of the surchargeprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSURCHARGEPRICE(String value) {
        this.surchargeprice = value;
    }

    /**
     * Gets the value of the listsurchargeprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsurchargeprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSURCHARGEPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTSURCHARGEPRICE() {
        if (listsurchargeprice == null) {
            listsurchargeprice = new ArrayList<String>();
        }
        return this.listsurchargeprice;
    }

}
