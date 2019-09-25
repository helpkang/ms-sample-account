
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FEE_TYPE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEE_TYPE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CONDITION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CREDIT_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIST_CREDIT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FEE_TYPE_Type", propOrder = {
    "code",
    "name",
    "condition"
})
public class FEETYPEType
    implements Serializable
{

    @XmlElement(name = "CODE", required = true)
    protected BigInteger code;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "CONDITION")
    protected FEETYPEType.CONDITION condition;

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

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link FEETYPEType.CONDITION }
     *     
     */
    public FEETYPEType.CONDITION getCONDITION() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEETYPEType.CONDITION }
     *     
     */
    public void setCONDITION(FEETYPEType.CONDITION value) {
        this.condition = value;
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
     *         &lt;element name="CREDIT_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIST_CREDIT_CARD_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "creditcard",
        "listcreditcardid"
    })
    public static class CONDITION
        implements Serializable
    {

        @XmlElement(name = "CREDIT_CARD")
        protected String creditcard;
        @XmlElement(name = "LIST_CREDIT_CARD_ID")
        protected List<Object> listcreditcardid;

        /**
         * Gets the value of the creditcard property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCREDITCARD() {
            return creditcard;
        }

        /**
         * Sets the value of the creditcard property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCREDITCARD(String value) {
            this.creditcard = value;
        }

        /**
         * Gets the value of the listcreditcardid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listcreditcardid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLISTCREDITCARDID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getLISTCREDITCARDID() {
            if (listcreditcardid == null) {
                listcreditcardid = new ArrayList<Object>();
            }
            return this.listcreditcardid;
        }

    }

}
