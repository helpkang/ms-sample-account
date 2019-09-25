
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.reservation.common.DateType;


/**
 * Cancellation policies, for modification and cancel
 * 
 * <p>Java class for CancellationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancellationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POLICY_CODE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}HTL_unprotectedStringType"&gt;
 *               &lt;enumeration value="CANCELLATION"/&gt;
 *               &lt;enumeration value="ModificationFee"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DEADLINE_DATE" type="{}DateType" minOccurs="0"/&gt;
 *         &lt;element name="PENALTY_DESCRIPTION" type="{}HTL_unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="NUMBER_OF_NIGHTS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LIST_AMOUNT" type="{}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NON_REFUNDABLE_INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationType", propOrder = {
    "policycode",
    "deadlinedate",
    "penaltydescription",
    "numberofnights",
    "listamount",
    "percentage",
    "nonrefundableindicator"
})
public class CancellationType
    implements Serializable
{

    @XmlElement(name = "POLICY_CODE")
    protected String policycode;
    @XmlElement(name = "DEADLINE_DATE")
    protected DateType deadlinedate;
    @XmlElement(name = "PENALTY_DESCRIPTION")
    protected String penaltydescription;
    @XmlElement(name = "NUMBER_OF_NIGHTS")
    protected Integer numberofnights;
    @XmlElement(name = "LIST_AMOUNT")
    protected List<AmountType> listamount;
    @XmlElement(name = "PERCENTAGE")
    protected BigDecimal percentage;
    @XmlElement(name = "NON_REFUNDABLE_INDICATOR")
    protected Boolean nonrefundableindicator;

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
     *     {@link DateType }
     *     
     */
    public DateType getDEADLINEDATE() {
        return deadlinedate;
    }

    /**
     * Sets the value of the deadlinedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDEADLINEDATE(DateType value) {
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
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getLISTAMOUNT() {
        if (listamount == null) {
            listamount = new ArrayList<AmountType>();
        }
        return this.listamount;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCENTAGE() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCENTAGE(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the nonrefundableindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNONREFUNDABLEINDICATOR() {
        return nonrefundableindicator;
    }

    /**
     * Sets the value of the nonrefundableindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNONREFUNDABLEINDICATOR(Boolean value) {
        this.nonrefundableindicator = value;
    }

}
