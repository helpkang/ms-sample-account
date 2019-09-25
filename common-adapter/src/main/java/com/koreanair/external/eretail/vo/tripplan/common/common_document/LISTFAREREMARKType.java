
package com.koreanair.external.eretail.vo.tripplan.common.common_document;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_FARE_REMARKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_FARE_REMARKType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{}FareRemarkGroup" minOccurs="0"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_FARE_REMARKType", propOrder = {
    "value",
    "type",
    "passengertype",
    "listpassengerid",
    "listsegmentid",
    "endorsement",
    "isglobalcommission",
    "discountcouponinformation"
})
public class LISTFAREREMARKType
    implements Serializable
{

    @XmlElement(name = "VALUE")
    protected String value;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "PASSENGER_TYPE")
    protected String passengertype;
    @XmlElement(name = "LIST_PASSENGER_ID")
    protected List<BigInteger> listpassengerid;
    @XmlElement(name = "LIST_SEGMENT_ID")
    protected List<BigInteger> listsegmentid;
    @XmlElement(name = "ENDORSEMENT")
    protected LISTFAREREMARKType.ENDORSEMENT endorsement;
    @XmlElement(name = "IS_GLOBAL_COMMISSION")
    protected Boolean isglobalcommission;
    @XmlElement(name = "DISCOUNT_COUPON_INFORMATION")
    protected LISTFAREREMARKType.DISCOUNTCOUPONINFORMATION discountcouponinformation;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUE() {
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
    public void setVALUE(String value) {
        this.value = value;
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
     * Gets the value of the passengertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSENGERTYPE() {
        return passengertype;
    }

    /**
     * Sets the value of the passengertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSENGERTYPE(String value) {
        this.passengertype = value;
    }

    /**
     * Gets the value of the listpassengerid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpassengerid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPASSENGERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTPASSENGERID() {
        if (listpassengerid == null) {
            listpassengerid = new ArrayList<BigInteger>();
        }
        return this.listpassengerid;
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
     * Gets the value of the endorsement property.
     * 
     * @return
     *     possible object is
     *     {@link LISTFAREREMARKType.ENDORSEMENT }
     *     
     */
    public LISTFAREREMARKType.ENDORSEMENT getENDORSEMENT() {
        return endorsement;
    }

    /**
     * Sets the value of the endorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTFAREREMARKType.ENDORSEMENT }
     *     
     */
    public void setENDORSEMENT(LISTFAREREMARKType.ENDORSEMENT value) {
        this.endorsement = value;
    }

    /**
     * Gets the value of the isglobalcommission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISGLOBALCOMMISSION() {
        return isglobalcommission;
    }

    /**
     * Sets the value of the isglobalcommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISGLOBALCOMMISSION(Boolean value) {
        this.isglobalcommission = value;
    }

    /**
     * Gets the value of the discountcouponinformation property.
     * 
     * @return
     *     possible object is
     *     {@link LISTFAREREMARKType.DISCOUNTCOUPONINFORMATION }
     *     
     */
    public LISTFAREREMARKType.DISCOUNTCOUPONINFORMATION getDISCOUNTCOUPONINFORMATION() {
        return discountcouponinformation;
    }

    /**
     * Sets the value of the discountcouponinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTFAREREMARKType.DISCOUNTCOUPONINFORMATION }
     *     
     */
    public void setDISCOUNTCOUPONINFORMATION(LISTFAREREMARKType.DISCOUNTCOUPONINFORMATION value) {
        this.discountcouponinformation = value;
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
     *         &lt;element name="FARE_DISCOUNT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DISCOUNT_COUPON_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="APPROVAL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "farediscountcode",
        "discountcouponnumber",
        "approvalcode"
    })
    public static class DISCOUNTCOUPONINFORMATION
        implements Serializable
    {

        @XmlElement(name = "FARE_DISCOUNT_CODE")
        protected String farediscountcode;
        @XmlElement(name = "DISCOUNT_COUPON_NUMBER")
        protected String discountcouponnumber;
        @XmlElement(name = "APPROVAL_CODE")
        protected String approvalcode;

        /**
         * Gets the value of the farediscountcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAREDISCOUNTCODE() {
            return farediscountcode;
        }

        /**
         * Sets the value of the farediscountcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAREDISCOUNTCODE(String value) {
            this.farediscountcode = value;
        }

        /**
         * Gets the value of the discountcouponnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISCOUNTCOUPONNUMBER() {
            return discountcouponnumber;
        }

        /**
         * Sets the value of the discountcouponnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISCOUNTCOUPONNUMBER(String value) {
            this.discountcouponnumber = value;
        }

        /**
         * Gets the value of the approvalcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAPPROVALCODE() {
            return approvalcode;
        }

        /**
         * Sets the value of the approvalcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAPPROVALCODE(String value) {
            this.approvalcode = value;
        }

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
     *         &lt;element name="CREATION_METHOD" type="{}unprotectedStringType" minOccurs="0"/&gt;
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
        "creationmethod"
    })
    public static class ENDORSEMENT
        implements Serializable
    {

        @XmlElement(name = "CREATION_METHOD")
        protected String creationmethod;

        /**
         * Gets the value of the creationmethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCREATIONMETHOD() {
            return creationmethod;
        }

        /**
         * Sets the value of the creationmethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCREATIONMETHOD(String value) {
            this.creationmethod = value;
        }

    }

}
