
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.CURRENCYType;
import com.koreanair.eretail.pojo.farecommon.farecommon.FEEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.MILESANDCASHCOSTType;


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
 *         &lt;element ref="{}TOTAL_AMOUNT"/&gt;
 *         &lt;element ref="{}AMOUNT"/&gt;
 *         &lt;element ref="{}AMOUNT_WITHOUT_TAX"/&gt;
 *         &lt;element ref="{}TAX"/&gt;
 *         &lt;element ref="{}EXCHANGE_RATE"/&gt;
 *         &lt;element name="CURRENCY" type="{}CURRENCY_Type"/&gt;
 *         &lt;element ref="{}LIST_FEE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}MilesOutputGroup" minOccurs="0"/&gt;
 *         &lt;element name="MILES_AND_CASH_COST" type="{}MILES_AND_CASH_COST_Type" minOccurs="0"/&gt;
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
    "totalamount",
    "amount",
    "amountwithouttax",
    "tax",
    "exchangerate",
    "currency",
    "listfee",
    "milescost",
    "additionalmilescostinfo",
    "milesandcashcost"
})
@XmlRootElement(name = "LIST_BOUND_PRICE")
public class LISTBOUNDPRICE
    implements Serializable
{

    @XmlElement(name = "TOTAL_AMOUNT", required = true)
    protected BigDecimal totalamount;
    @XmlElement(name = "AMOUNT", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "AMOUNT_WITHOUT_TAX", required = true)
    protected BigDecimal amountwithouttax;
    @XmlElement(name = "TAX", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "EXCHANGE_RATE", required = true)
    protected BigDecimal exchangerate;
    @XmlElement(name = "CURRENCY", required = true)
    protected CURRENCYType currency;
    @XmlElement(name = "LIST_FEE")
    protected List<FEEType> listfee;
    @XmlElement(name = "MILES_COST")
    protected BigInteger milescost;
    @XmlElement(name = "ADDITIONAL_MILES_COST_INFO")
    protected ADDITIONALMILESCOSTINFOType additionalmilescostinfo;
    @XmlElement(name = "MILES_AND_CASH_COST")
    protected MILESANDCASHCOSTType milesandcashcost;

    /**
     * Gets the value of the totalamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALAMOUNT() {
        return totalamount;
    }

    /**
     * Sets the value of the totalamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALAMOUNT(BigDecimal value) {
        this.totalamount = value;
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
     * Gets the value of the amountwithouttax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTWITHOUTTAX() {
        return amountwithouttax;
    }

    /**
     * Sets the value of the amountwithouttax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTWITHOUTTAX(BigDecimal value) {
        this.amountwithouttax = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAX() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAX(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the exchangerate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXCHANGERATE() {
        return exchangerate;
    }

    /**
     * Sets the value of the exchangerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXCHANGERATE(BigDecimal value) {
        this.exchangerate = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCYType }
     *     
     */
    public CURRENCYType getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCYType }
     *     
     */
    public void setCURRENCY(CURRENCYType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the listfee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFEE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEEType }
     * 
     * 
     */
    public List<FEEType> getLISTFEE() {
        if (listfee == null) {
            listfee = new ArrayList<FEEType>();
        }
        return this.listfee;
    }

    /**
     * Gets the value of the milescost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMILESCOST() {
        return milescost;
    }

    /**
     * Sets the value of the milescost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMILESCOST(BigInteger value) {
        this.milescost = value;
    }

    /**
     * Gets the value of the additionalmilescostinfo property.
     * 
     * @return
     *     possible object is
     *     {@link ADDITIONALMILESCOSTINFOType }
     *     
     */
    public ADDITIONALMILESCOSTINFOType getADDITIONALMILESCOSTINFO() {
        return additionalmilescostinfo;
    }

    /**
     * Sets the value of the additionalmilescostinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDITIONALMILESCOSTINFOType }
     *     
     */
    public void setADDITIONALMILESCOSTINFO(ADDITIONALMILESCOSTINFOType value) {
        this.additionalmilescostinfo = value;
    }

    /**
     * Gets the value of the milesandcashcost property.
     * 
     * @return
     *     possible object is
     *     {@link MILESANDCASHCOSTType }
     *     
     */
    public MILESANDCASHCOSTType getMILESANDCASHCOST() {
        return milesandcashcost;
    }

    /**
     * Sets the value of the milesandcashcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link MILESANDCASHCOSTType }
     *     
     */
    public void setMILESANDCASHCOST(MILESANDCASHCOSTType value) {
        this.milesandcashcost = value;
    }

}
