
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Cancellation policies, for modification and cancel
 * 
 * <p>Java class for CANCELLATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CANCELLATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POLICY_CODE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;enumeration value="CANCELLATION"/&gt;
 *               &lt;enumeration value="ModificationFee"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DEADLINE_DATE" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="PENALTY_DESCRIPTION" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="NUMBER_OF_NIGHTS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AMOUNT" type="{}AMOUNT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CANCELLATION_TYPE", propOrder = {
    "policycode",
    "deadlinedate",
    "penaltydescription",
    "numberofnights",
    "listamount",
    "percentage"
})
public class CANCELLATIONTYPE
    implements Serializable
{

    @XmlElement(name = "POLICY_CODE", required = true)
    protected String policycode;
    @XmlElement(name = "DEADLINE_DATE")
    protected String deadlinedate;
    @XmlElement(name = "PENALTY_DESCRIPTION")
    protected String penaltydescription;
    @XmlElement(name = "NUMBER_OF_NIGHTS")
    protected Integer numberofnights;
    @XmlElement(name = "LIST_AMOUNT")
    protected List<AMOUNTTYPE> listamount;
    @XmlElement(name = "PERCENTAGE")
    protected Object percentage;

    /**
     * Gets the value of the policycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOLICYCODE() {
        return policycode;
    }

    /**
     * Sets the value of the policycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOLICYCODE(String value) {
        this.policycode = value;
    }

    /**
     * Gets the value of the deadlinedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEADLINEDATE() {
        return deadlinedate;
    }

    /**
     * Sets the value of the deadlinedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEADLINEDATE(String value) {
        this.deadlinedate = value;
    }

    /**
     * Gets the value of the penaltydescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPENALTYDESCRIPTION() {
        return penaltydescription;
    }

    /**
     * Sets the value of the penaltydescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPENALTYDESCRIPTION(String value) {
        this.penaltydescription = value;
    }

    /**
     * Gets the value of the numberofnights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNUMBEROFNIGHTS() {
        return numberofnights;
    }

    /**
     * Sets the value of the numberofnights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNUMBEROFNIGHTS(Integer value) {
        this.numberofnights = value;
    }

    /**
     * Gets the value of the listamount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listamount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAMOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AMOUNTTYPE }
     * 
     * 
     */
    public List<AMOUNTTYPE> getLISTAMOUNT() {
        if (listamount == null) {
            listamount = new ArrayList<AMOUNTTYPE>();
        }
        return this.listamount;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPERCENTAGE() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPERCENTAGE(Object value) {
        this.percentage = value;
    }

}
