
package com.koreanair.eretail.pojo.tripplan.common.common_rail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Contains all features of one itinerary
 * 
 * <p>Java class for OFFER_AVAIL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OFFER_AVAIL_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}RulesDrivenInformation"/&gt;
 *         &lt;element name="B_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_TICKETING"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="true"/&gt;
 *               &lt;pattern value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_DATE"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;unprotectedStringType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OFFER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BOOKABLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DURATION" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}SEGMENT_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="E_LOCATION" type="{}RAIL_LOCATION_Type"/&gt;
 *         &lt;element name="B_LOCATION" type="{}RAIL_LOCATION_Type"/&gt;
 *         &lt;element name="MIX_CABIN"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="true"/&gt;
 *               &lt;pattern value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRICE" type="{}TRAIN_PRICE_Type" minOccurs="0"/&gt;
 *         &lt;element name="OPERATING_INFORMATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OFFER_AVAIL_Type", propOrder = {
    "boolisoutofpolicy",
    "displayrank",
    "bdate",
    "eticketing",
    "edate",
    "offerid",
    "bookable",
    "duration",
    "listsegment",
    "elocation",
    "blocation",
    "mixcabin",
    "price",
    "operatinginformation"
})
public class OFFERAVAILType
    implements Serializable
{

    @XmlElement(name = "BOOL_IS_OUT_OF_POLICY")
    protected Boolean boolisoutofpolicy;
    @XmlElement(name = "DISPLAY_RANK")
    protected String displayrank;
    @XmlElement(name = "B_DATE", required = true)
    protected OFFERAVAILType.BDATE bdate;
    @XmlElement(name = "E_TICKETING")
    protected boolean eticketing;
    @XmlElement(name = "E_DATE", required = true)
    protected OFFERAVAILType.EDATE edate;
    @XmlElement(name = "OFFER_ID", required = true)
    protected String offerid;
    @XmlElement(name = "BOOKABLE")
    protected boolean bookable;
    @XmlElement(name = "DURATION", required = true)
    protected String duration;
    @XmlElement(name = "LIST_SEGMENT", required = true)
    protected List<SEGMENTType> listsegment;
    @XmlElement(name = "E_LOCATION", required = true)
    protected RAILLOCATIONType elocation;
    @XmlElement(name = "B_LOCATION", required = true)
    protected RAILLOCATIONType blocation;
    @XmlElement(name = "MIX_CABIN")
    protected boolean mixcabin;
    @XmlElement(name = "PRICE")
    protected TRAINPRICEType price;
    @XmlElement(name = "OPERATING_INFORMATION")
    protected String operatinginformation;

    /**
     * Gets the value of the boolisoutofpolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOLISOUTOFPOLICY() {
        return boolisoutofpolicy;
    }

    /**
     * Sets the value of the boolisoutofpolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOLISOUTOFPOLICY(Boolean value) {
        this.boolisoutofpolicy = value;
    }

    /**
     * Gets the value of the displayrank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPLAYRANK() {
        return displayrank;
    }

    /**
     * Sets the value of the displayrank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPLAYRANK(String value) {
        this.displayrank = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link OFFERAVAILType.BDATE }
     *     
     */
    public OFFERAVAILType.BDATE getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFFERAVAILType.BDATE }
     *     
     */
    public void setBDATE(OFFERAVAILType.BDATE value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the eticketing property.
     * 
     */
    public boolean isETICKETING() {
        return eticketing;
    }

    /**
     * Sets the value of the eticketing property.
     * 
     */
    public void setETICKETING(boolean value) {
        this.eticketing = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link OFFERAVAILType.EDATE }
     *     
     */
    public OFFERAVAILType.EDATE getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFFERAVAILType.EDATE }
     *     
     */
    public void setEDATE(OFFERAVAILType.EDATE value) {
        this.edate = value;
    }

    /**
     * Gets the value of the offerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFERID() {
        return offerid;
    }

    /**
     * Sets the value of the offerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFERID(String value) {
        this.offerid = value;
    }

    /**
     * Gets the value of the bookable property.
     * 
     */
    public boolean isBOOKABLE() {
        return bookable;
    }

    /**
     * Sets the value of the bookable property.
     * 
     */
    public void setBOOKABLE(boolean value) {
        this.bookable = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDURATION() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDURATION(String value) {
        this.duration = value;
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
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public RAILLOCATIONType getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public void setELOCATION(RAILLOCATIONType value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public RAILLOCATIONType getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAILLOCATIONType }
     *     
     */
    public void setBLOCATION(RAILLOCATIONType value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the mixcabin property.
     * 
     */
    public boolean isMIXCABIN() {
        return mixcabin;
    }

    /**
     * Sets the value of the mixcabin property.
     * 
     */
    public void setMIXCABIN(boolean value) {
        this.mixcabin = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link TRAINPRICEType }
     *     
     */
    public TRAINPRICEType getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAINPRICEType }
     *     
     */
    public void setPRICE(TRAINPRICEType value) {
        this.price = value;
    }

    /**
     * Gets the value of the operatinginformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATINGINFORMATION() {
        return operatinginformation;
    }

    /**
     * Sets the value of the operatinginformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATINGINFORMATION(String value) {
        this.operatinginformation = value;
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
    public static class BDATE
        implements Serializable
    {

        @XmlValue
        protected String value;

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
    public static class EDATE
        implements Serializable
    {

        @XmlValue
        protected String value;

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

    }

}
