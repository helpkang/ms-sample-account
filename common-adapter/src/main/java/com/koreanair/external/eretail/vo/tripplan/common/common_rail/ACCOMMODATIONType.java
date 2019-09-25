
package com.koreanair.external.eretail.vo.tripplan.common.common_rail;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.CurrencyType;


/**
 * <p>Java class for ACCOMMODATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACCOMMODATION_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AVAILABLE_PREFERENCE_ID" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}integer {http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/union&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="SEGMENT_ID" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_PROFILE_PREFERENCE" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TRAVELLER_ID" type="{}unprotectedStringType"/&gt;
 *                   &lt;element name="LIST_PREFERENCE_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NEAR_TO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="STATUS"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="AVAILABLE"/&gt;
 *                         &lt;enumeration value="TO_BOOK"/&gt;
 *                         &lt;enumeration value="FROM_PNR"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CARRIAGE_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="SEAT_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *                   &lt;element name="SELECTION_TYPE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}unprotectedStringType"&gt;
 *                         &lt;enumeration value="AUTOMATIC"/&gt;
 *                         &lt;enumeration value="ASSIGNMENT"/&gt;
 *                         &lt;enumeration value="PREFERENCE"/&gt;
 *                         &lt;enumeration value="NO_ACCOMMODATION"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "ACCOMMODATION_Type", propOrder = {
    "id",
    "code",
    "description",
    "amount",
    "currency",
    "listavailablepreferenceid",
    "type",
    "segmentid",
    "listprofilepreference"
})
public class ACCOMMODATIONType
    implements Serializable
{

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "AMOUNT")
    protected BigDecimal amount;
    @XmlElement(name = "CURRENCY")
    protected CurrencyType currency;
    @XmlElement(name = "LIST_AVAILABLE_PREFERENCE_ID")
    protected List<String> listavailablepreferenceid;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "SEGMENT_ID", required = true)
    protected String segmentid;
    @XmlElement(name = "LIST_PROFILE_PREFERENCE", required = true)
    protected List<ACCOMMODATIONType.LISTPROFILEPREFERENCE> listprofilepreference;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCURRENCY(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the listavailablepreferenceid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listavailablepreferenceid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAVAILABLEPREFERENCEID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTAVAILABLEPREFERENCEID() {
        if (listavailablepreferenceid == null) {
            listavailablepreferenceid = new ArrayList<String>();
        }
        return this.listavailablepreferenceid;
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
     * Gets the value of the segmentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTID() {
        return segmentid;
    }

    /**
     * Sets the value of the segmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTID(String value) {
        this.segmentid = value;
    }

    /**
     * Gets the value of the listprofilepreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprofilepreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPROFILEPREFERENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACCOMMODATIONType.LISTPROFILEPREFERENCE }
     * 
     * 
     */
    public List<ACCOMMODATIONType.LISTPROFILEPREFERENCE> getLISTPROFILEPREFERENCE() {
        if (listprofilepreference == null) {
            listprofilepreference = new ArrayList<ACCOMMODATIONType.LISTPROFILEPREFERENCE>();
        }
        return this.listprofilepreference;
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
     *         &lt;element name="TRAVELLER_ID" type="{}unprotectedStringType"/&gt;
     *         &lt;element name="LIST_PREFERENCE_ID" type="{}unprotectedStringType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NEAR_TO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="STATUS"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="AVAILABLE"/&gt;
     *               &lt;enumeration value="TO_BOOK"/&gt;
     *               &lt;enumeration value="FROM_PNR"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CARRIAGE_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="SEAT_NUMBER" type="{}unprotectedStringType" minOccurs="0"/&gt;
     *         &lt;element name="SELECTION_TYPE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}unprotectedStringType"&gt;
     *               &lt;enumeration value="AUTOMATIC"/&gt;
     *               &lt;enumeration value="ASSIGNMENT"/&gt;
     *               &lt;enumeration value="PREFERENCE"/&gt;
     *               &lt;enumeration value="NO_ACCOMMODATION"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
    @XmlType(name = "", propOrder = {
        "travellerid",
        "listpreferenceid",
        "nearto",
        "status",
        "carriagenumber",
        "seatnumber",
        "selectiontype"
    })
    public static class LISTPROFILEPREFERENCE
        implements Serializable
    {

        @XmlElement(name = "TRAVELLER_ID", required = true)
        protected String travellerid;
        @XmlElement(name = "LIST_PREFERENCE_ID")
        protected List<String> listpreferenceid;
        @XmlElement(name = "NEAR_TO")
        protected Boolean nearto;
        @XmlElement(name = "STATUS", required = true)
        protected String status;
        @XmlElement(name = "CARRIAGE_NUMBER")
        protected String carriagenumber;
        @XmlElement(name = "SEAT_NUMBER")
        protected String seatnumber;
        @XmlElement(name = "SELECTION_TYPE")
        protected String selectiontype;

        /**
         * Gets the value of the travellerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRAVELLERID() {
            return travellerid;
        }

        /**
         * Sets the value of the travellerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRAVELLERID(String value) {
            this.travellerid = value;
        }

        /**
         * Gets the value of the listpreferenceid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listpreferenceid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTPREFERENCEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLISTPREFERENCEID() {
            if (listpreferenceid == null) {
                listpreferenceid = new ArrayList<String>();
            }
            return this.listpreferenceid;
        }

        /**
         * Gets the value of the nearto property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNEARTO() {
            return nearto;
        }

        /**
         * Sets the value of the nearto property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNEARTO(Boolean value) {
            this.nearto = value;
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
         * Gets the value of the carriagenumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARRIAGENUMBER() {
            return carriagenumber;
        }

        /**
         * Sets the value of the carriagenumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARRIAGENUMBER(String value) {
            this.carriagenumber = value;
        }

        /**
         * Gets the value of the seatnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSEATNUMBER() {
            return seatnumber;
        }

        /**
         * Sets the value of the seatnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSEATNUMBER(String value) {
            this.seatnumber = value;
        }

        /**
         * Gets the value of the selectiontype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSELECTIONTYPE() {
            return selectiontype;
        }

        /**
         * Sets the value of the selectiontype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSELECTIONTYPE(String value) {
            this.selectiontype = value;
        }

    }

}
