
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.FEEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTBOUNDPRICEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTFARECALCType;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTFAREINFO;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTTAXType;
import com.koreanair.eretail.pojo.farecommon.farecommon.MILESANDCASHCOSTType;
import com.koreanair.eretail.pojo.farecommon.farecommon.REBOOKBALANCEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.REBOOKFEEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.SingleAmountType;


/**
 * <p>Java class for PriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}PriceGroup"/&gt;
 *         &lt;group ref="{}RebookingAmountGroup"/&gt;
 *         &lt;element name="EXCHANGE_VALUE" type="{}SingleAmount_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType", propOrder = {
    "totalamount",
    "amount",
    "amountwithouttax",
    "tax",
    "exchangerate",
    "currency",
    "currencycode",
    "milescost",
    "milesandcashcost",
    "listfee",
    "listboundprice",
    "listdisplaytax",
    "listfareinfo",
    "mileageaccrual",
    "listfarecalc",
    "rebookfee",
    "noshowfee",
    "rebookbalance",
    "collectbalance",
    "totalcollectbalance",
    "refundbalance",
    "exchangevalue"
})
public class PriceType
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
    @XmlElement(name = "CURRENCY")
    protected com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput.TripPriceType.CURRENCY currency;
    @XmlElement(name = "CURRENCY_CODE")
    protected Object currencycode;
    @XmlElement(name = "MILES_COST")
    protected BigInteger milescost;
    @XmlElement(name = "MILES_AND_CASH_COST")
    protected MILESANDCASHCOSTType milesandcashcost;
    @XmlElement(name = "LIST_FEE")
    protected List<FEEType> listfee;
    @XmlElement(name = "LIST_BOUND_PRICE")
    protected List<LISTBOUNDPRICEType> listboundprice;
    @XmlElement(name = "LIST_DISPLAY_TAX")
    protected List<LISTTAXType> listdisplaytax;
    @XmlElement(name = "LIST_FARE_INFO")
    protected List<LISTFAREINFO> listfareinfo;
    @XmlElement(name = "MILEAGE_ACCRUAL")
    protected BigInteger mileageaccrual;
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
    @XmlElement(name = "EXCHANGE_VALUE")
    protected SingleAmountType exchangevalue;

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
     *     {@link com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput.TripPriceType.CURRENCY }
     *     
     */
    public com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput.TripPriceType.CURRENCY getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput.TripPriceType.CURRENCY }
     *     
     */
    public void setCURRENCY(com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput.TripPriceType.CURRENCY value) {
        this.currency = value;
    }

    /**
     * Gets the value of the currencycode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCURRENCYCODE() {
        return currencycode;
    }

    /**
     * Sets the value of the currencycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCURRENCYCODE(Object value) {
        this.currencycode = value;
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
     * Gets the value of the listboundprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listboundprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBOUNDPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTBOUNDPRICEType }
     * 
     * 
     */
    public List<LISTBOUNDPRICEType> getLISTBOUNDPRICE() {
        if (listboundprice == null) {
            listboundprice = new ArrayList<LISTBOUNDPRICEType>();
        }
        return this.listboundprice;
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
     * Gets the value of the mileageaccrual property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMILEAGEACCRUAL() {
        return mileageaccrual;
    }

    /**
     * Sets the value of the mileageaccrual property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMILEAGEACCRUAL(BigInteger value) {
        this.mileageaccrual = value;
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

    /**
     * Gets the value of the exchangevalue property.
     * 
     * @return
     *     possible object is
     *     {@link SingleAmountType }
     *     
     */
    public SingleAmountType getEXCHANGEVALUE() {
        return exchangevalue;
    }

    /**
     * Sets the value of the exchangevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleAmountType }
     *     
     */
    public void setEXCHANGEVALUE(SingleAmountType value) {
        this.exchangevalue = value;
    }

}
