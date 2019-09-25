
package com.koreanair.eretail.pojo.tripplan.common.common_document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.tripplan.common.common_air_pricing.ReasonType;


/**
 * <p>Java class for miscPricingRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="miscPricingRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INITIAL_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSM_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TRAVELLER" type="{}TRAVELLERType" minOccurs="0"/&gt;
 *         &lt;element name="GENERAL" type="{}TSM_GENERALType" minOccurs="0"/&gt;
 *         &lt;element name="FARE" type="{}FAREType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_REMARKS" type="{}LIST_FARE_REMARKType" maxOccurs="7" minOccurs="0"/&gt;
 *         &lt;element name="LIST_COUPON" type="{}LIST_TSM_COUPONType" maxOccurs="16" minOccurs="0"/&gt;
 *         &lt;element name="ORIGINAL_ISSUE" type="{}FO_Type" minOccurs="0"/&gt;
 *         &lt;element name="CORRELATION_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OVERRIDE_REASON" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIST_REASON" type="{}reasonType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "miscPricingRecordType", propOrder = {
    "initialelement",
    "tsmid",
    "traveller",
    "general",
    "fare",
    "listfareremarks",
    "listcoupon",
    "originalissue",
    "correlationid",
    "overridereason"
})
public class MiscPricingRecordType
    implements Serializable
{

    @XmlElement(name = "INITIAL_ELEMENT")
    protected Boolean initialelement;
    @XmlElement(name = "TSM_ID")
    protected Object tsmid;
    @XmlElement(name = "TRAVELLER")
    protected TRAVELLERType traveller;
    @XmlElement(name = "GENERAL")
    protected TSMGENERALType general;
    @XmlElement(name = "FARE")
    protected FAREType fare;
    @XmlElement(name = "LIST_FARE_REMARKS")
    protected List<LISTFAREREMARKType> listfareremarks;
    @XmlElement(name = "LIST_COUPON")
    protected List<LISTTSMCOUPONType> listcoupon;
    @XmlElement(name = "ORIGINAL_ISSUE")
    protected FOType originalissue;
    @XmlElement(name = "CORRELATION_ID")
    protected Object correlationid;
    @XmlElement(name = "OVERRIDE_REASON")
    protected MiscPricingRecordType.OVERRIDEREASON overridereason;

    /**
     * Gets the value of the initialelement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINITIALELEMENT() {
        return initialelement;
    }

    /**
     * Sets the value of the initialelement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINITIALELEMENT(Boolean value) {
        this.initialelement = value;
    }

    /**
     * Gets the value of the tsmid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTSMID() {
        return tsmid;
    }

    /**
     * Sets the value of the tsmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTSMID(Object value) {
        this.tsmid = value;
    }

    /**
     * Gets the value of the traveller property.
     * 
     * @return
     *     possible object is
     *     {@link TRAVELLERType }
     *     
     */
    public TRAVELLERType getTRAVELLER() {
        return traveller;
    }

    /**
     * Sets the value of the traveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAVELLERType }
     *     
     */
    public void setTRAVELLER(TRAVELLERType value) {
        this.traveller = value;
    }

    /**
     * Gets the value of the general property.
     * 
     * @return
     *     possible object is
     *     {@link TSMGENERALType }
     *     
     */
    public TSMGENERALType getGENERAL() {
        return general;
    }

    /**
     * Sets the value of the general property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSMGENERALType }
     *     
     */
    public void setGENERAL(TSMGENERALType value) {
        this.general = value;
    }

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link FAREType }
     *     
     */
    public FAREType getFARE() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAREType }
     *     
     */
    public void setFARE(FAREType value) {
        this.fare = value;
    }

    /**
     * Gets the value of the listfareremarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareremarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREREMARKS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFAREREMARKType }
     * 
     * 
     */
    public List<LISTFAREREMARKType> getLISTFAREREMARKS() {
        if (listfareremarks == null) {
            listfareremarks = new ArrayList<LISTFAREREMARKType>();
        }
        return this.listfareremarks;
    }

    /**
     * Gets the value of the listcoupon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcoupon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCOUPON().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTSMCOUPONType }
     * 
     * 
     */
    public List<LISTTSMCOUPONType> getLISTCOUPON() {
        if (listcoupon == null) {
            listcoupon = new ArrayList<LISTTSMCOUPONType>();
        }
        return this.listcoupon;
    }

    /**
     * Gets the value of the originalissue property.
     * 
     * @return
     *     possible object is
     *     {@link FOType }
     *     
     */
    public FOType getORIGINALISSUE() {
        return originalissue;
    }

    /**
     * Sets the value of the originalissue property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOType }
     *     
     */
    public void setORIGINALISSUE(FOType value) {
        this.originalissue = value;
    }

    /**
     * Gets the value of the correlationid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCORRELATIONID() {
        return correlationid;
    }

    /**
     * Sets the value of the correlationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCORRELATIONID(Object value) {
        this.correlationid = value;
    }

    /**
     * Gets the value of the overridereason property.
     * 
     * @return
     *     possible object is
     *     {@link MiscPricingRecordType.OVERRIDEREASON }
     *     
     */
    public MiscPricingRecordType.OVERRIDEREASON getOVERRIDEREASON() {
        return overridereason;
    }

    /**
     * Sets the value of the overridereason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscPricingRecordType.OVERRIDEREASON }
     *     
     */
    public void setOVERRIDEREASON(MiscPricingRecordType.OVERRIDEREASON value) {
        this.overridereason = value;
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
     *         &lt;element name="LIST_REASON" type="{}reasonType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "listreason"
    })
    public static class OVERRIDEREASON
        implements Serializable
    {

        @XmlElement(name = "LIST_REASON")
        protected List<ReasonType> listreason;

        /**
         * Gets the value of the listreason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listreason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTREASON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReasonType }
         * 
         * 
         */
        public List<ReasonType> getLISTREASON() {
            if (listreason == null) {
                listreason = new ArrayList<ReasonType>();
            }
            return this.listreason;
        }

    }

}
