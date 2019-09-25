
package com.koreanair.eretail.pojo.farecommon.farecommon;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of price per bound when performing a pricing with One Way Display option activated.
 * 
 * <p>Java class for LIST_BOUND_PRICE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_BOUND_PRICE_Type"&gt;
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
 *         &lt;element ref="{}ESTIMATED_DISCOUNT_AMOUNT" minOccurs="0"/&gt;
 *         &lt;element name="MILES_AND_CASH_COST" type="{}MILES_AND_CASH_COST_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}MILES_COST" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_DISPLAY_TAX" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FARE_INFO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FARE_CALC" type="{}LIST_FARECALC_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}RebookingAmountGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_BOUND_PRICE_Type", propOrder = {
    "totalamount",
    "amount",
    "amountwithouttax",
    "tax",
    "exchangerate",
    "currency",
    "listfee",
    "estimateddiscountamount",
    "milesandcashcost",
    "milescost",
    "listdisplaytax",
    "listfareinfo",
    "listfarecalc",
    "rebookfee",
    "noshowfee",
    "rebookbalance",
    "collectbalance",
    "totalcollectbalance",
    "refundbalance"
})
public class LISTBOUNDPRICEType
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
    @XmlElement(name = "ESTIMATED_DISCOUNT_AMOUNT")
    protected BigDecimal estimateddiscountamount;
    @XmlElement(name = "MILES_AND_CASH_COST")
    protected MILESANDCASHCOSTType milesandcashcost;
    @XmlElement(name = "MILES_COST")
    protected BigInteger milescost;
    @XmlElement(name = "LIST_DISPLAY_TAX")
    protected List<LISTTAXType> listdisplaytax;
    @XmlElement(name = "LIST_FARE_INFO")
    protected List<LISTFAREINFO> listfareinfo;
    @XmlElement(name = "LIST_FARE_CALC")
    protected List<LISTFARECALCType> listfarecalc;
    @XmlElement(name = "REBOOK_FEE")
    protected REBOOKFEEType rebookfee;
    @XmlElement(name = "NO_SHOW_FEE")
    protected REBOOKFEEType noshowfee;
    @XmlElement(name = "REBOOK_BALANCE")
    protected REBOOKBALANCEType rebookbalance;
    @XmlElement(name = "COLLECT_BALANCE")
    protected REBOOKBALANCEType collectbalance;
    @XmlElement(name = "TOTAL_COLLECT_BALANCE")
    protected REBOOKBALANCEType totalcollectbalance;
    @XmlElement(name = "REFUND_BALANCE")
    protected REBOOKBALANCEType refundbalance;

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
     * Gets the value of the estimateddiscountamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getESTIMATEDDISCOUNTAMOUNT() {
        return estimateddiscountamount;
    }

    /**
     * Sets the value of the estimateddiscountamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setESTIMATEDDISCOUNTAMOUNT(BigDecimal value) {
        this.estimateddiscountamount = value;
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
     * Gets the value of the listdisplaytax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdisplaytax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDISPLAYTAX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTAXType }
     * 
     * 
     */
    public List<LISTTAXType> getLISTDISPLAYTAX() {
        if (listdisplaytax == null) {
            listdisplaytax = new ArrayList<LISTTAXType>();
        }
        return this.listdisplaytax;
    }

    /**
     * Gets the value of the listfareinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfareinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFAREINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFAREINFO }
     * 
     * 
     */
    public List<LISTFAREINFO> getLISTFAREINFO() {
        if (listfareinfo == null) {
            listfareinfo = new ArrayList<LISTFAREINFO>();
        }
        return this.listfareinfo;
    }

    /**
     * Gets the value of the listfarecalc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfarecalc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFARECALC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFARECALCType }
     * 
     * 
     */
    public List<LISTFARECALCType> getLISTFARECALC() {
        if (listfarecalc == null) {
            listfarecalc = new ArrayList<LISTFARECALCType>();
        }
        return this.listfarecalc;
    }

    /**
     * Gets the value of the rebookfee property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKFEEType }
     *     
     */
    public REBOOKFEEType getREBOOKFEE() {
        return rebookfee;
    }

    /**
     * Sets the value of the rebookfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKFEEType }
     *     
     */
    public void setREBOOKFEE(REBOOKFEEType value) {
        this.rebookfee = value;
    }

    /**
     * Gets the value of the noshowfee property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKFEEType }
     *     
     */
    public REBOOKFEEType getNOSHOWFEE() {
        return noshowfee;
    }

    /**
     * Sets the value of the noshowfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKFEEType }
     *     
     */
    public void setNOSHOWFEE(REBOOKFEEType value) {
        this.noshowfee = value;
    }

    /**
     * Gets the value of the rebookbalance property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKBALANCEType }
     *     
     */
    public REBOOKBALANCEType getREBOOKBALANCE() {
        return rebookbalance;
    }

    /**
     * Sets the value of the rebookbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKBALANCEType }
     *     
     */
    public void setREBOOKBALANCE(REBOOKBALANCEType value) {
        this.rebookbalance = value;
    }

    /**
     * Gets the value of the collectbalance property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKBALANCEType }
     *     
     */
    public REBOOKBALANCEType getCOLLECTBALANCE() {
        return collectbalance;
    }

    /**
     * Sets the value of the collectbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKBALANCEType }
     *     
     */
    public void setCOLLECTBALANCE(REBOOKBALANCEType value) {
        this.collectbalance = value;
    }

    /**
     * Gets the value of the totalcollectbalance property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKBALANCEType }
     *     
     */
    public REBOOKBALANCEType getTOTALCOLLECTBALANCE() {
        return totalcollectbalance;
    }

    /**
     * Sets the value of the totalcollectbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKBALANCEType }
     *     
     */
    public void setTOTALCOLLECTBALANCE(REBOOKBALANCEType value) {
        this.totalcollectbalance = value;
    }

    /**
     * Gets the value of the refundbalance property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKBALANCEType }
     *     
     */
    public REBOOKBALANCEType getREFUNDBALANCE() {
        return refundbalance;
    }

    /**
     * Sets the value of the refundbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKBALANCEType }
     *     
     */
    public void setREFUNDBALANCE(REBOOKBALANCEType value) {
        this.refundbalance = value;
    }

}
