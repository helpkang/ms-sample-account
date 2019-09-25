
package com.koreanair.external.eretail.vo.farecommon.flowsignature;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Flow signature information
 * 
 * <p>Java class for FLOW_SIGNATURE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FLOW_SIGNATURE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRANSACTION" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TRANSACTION_MODE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="INITIAL_PRODUCT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_TYPE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FEATURE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
@XmlType(name = "FLOW_SIGNATURE_Type", propOrder = {
    "transaction",
    "transactionmode",
    "initialproduct",
    "bookingtype",
    "listfeature"
})
public class FLOWSIGNATUREType
    implements Serializable
{

    @XmlElement(name = "TRANSACTION")
    protected BigInteger transaction;
    @XmlElement(name = "TRANSACTION_MODE")
    protected BigInteger transactionmode;
    @XmlElement(name = "INITIAL_PRODUCT")
    protected BigInteger initialproduct;
    @XmlElement(name = "BOOKING_TYPE")
    protected BigInteger bookingtype;
    @XmlElement(name = "LIST_FEATURE")
    protected List<FLOWSIGNATUREType.LISTFEATURE> listfeature;

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRANSACTION() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRANSACTION(BigInteger value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the transactionmode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRANSACTIONMODE() {
        return transactionmode;
    }

    /**
     * Sets the value of the transactionmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRANSACTIONMODE(BigInteger value) {
        this.transactionmode = value;
    }

    /**
     * Gets the value of the initialproduct property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINITIALPRODUCT() {
        return initialproduct;
    }

    /**
     * Sets the value of the initialproduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINITIALPRODUCT(BigInteger value) {
        this.initialproduct = value;
    }

    /**
     * Gets the value of the bookingtype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBOOKINGTYPE() {
        return bookingtype;
    }

    /**
     * Sets the value of the bookingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBOOKINGTYPE(BigInteger value) {
        this.bookingtype = value;
    }

    /**
     * Gets the value of the listfeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFEATURE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FLOWSIGNATUREType.LISTFEATURE }
     * 
     * 
     */
    public List<FLOWSIGNATUREType.LISTFEATURE> getLISTFEATURE() {
        if (listfeature == null) {
            listfeature = new ArrayList<FLOWSIGNATUREType.LISTFEATURE>();
        }
        return this.listfeature;
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
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "code"
    })
    public static class LISTFEATURE
        implements Serializable
    {

        @XmlElement(name = "CODE", required = true)
        protected BigInteger code;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCODE(BigInteger value) {
            this.code = value;
        }

    }

}
