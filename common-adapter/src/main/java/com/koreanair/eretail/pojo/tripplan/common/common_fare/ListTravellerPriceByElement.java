
package com.koreanair.eretail.pojo.tripplan.common.common_fare;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.common.common.CurrencyType;
import com.koreanair.eretail.pojo.farecommon.farecommon.FEEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTTAXType;
import com.koreanair.eretail.pojo.farecommon.farecommon.REBOOKBALANCEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.REBOOKFEEType;
import com.koreanair.eretail.pojo.tripplan.common.common_price.MILESANDCASHCOSTWITHSLIDERType;
import com.koreanair.eretail.pojo.tripplan.common.common_price.PRICEWITHDISCOUNTType;
import com.koreanair.eretail.pojo.tripplan.common.common_price.SEATFEEType;


/**
 * <p>Java class for ListTravellerPriceByElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListTravellerPriceByElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}fareListSegmentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{}CommonPriceTags" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListTravellerPriceByElement", propOrder = {
    "itemid",
    "listsegment",
    "listfareinfo",
    "amount",
    "milescost",
    "additionalmilescostinfo",
    "mileageaccrual",
    "milesandcashcost",
    "amountwithouttax",
    "tax",
    "taxdetails",
    "exchangerate",
    "currency",
    "listtax",
    "bluebizcredits",
    "servicefeeamount",
    "rebookfee",
    "noshowfee",
    "rebookbalance",
    "collectbalance",
    "refundbalance",
    "nonrefundableamount",
    "nonreusablevalue",
    "totalcollectbalance",
    "totalrebookbalance",
    "surcharges",
    "seatfee",
    "amountwithfees",
    "listfee",
    "totalamount",
    "pricewithdiscount",
    "totalsupplements",
    "unitprice",
    "numberofunits",
    "tsmamount",
    "tsmcurrency"
})
public class ListTravellerPriceByElement
    implements Serializable
{

    @XmlElement(name = "ITEM_ID", required = true)
    protected BigInteger itemid;
    @XmlElement(name = "LIST_SEGMENT")
    protected List<FareListSegmentsType> listsegment;
    @XmlElement(name = "LIST_FARE_INFO")
    protected List<ListTravellerPriceByElement.LISTFAREINFO> listfareinfo;
    @XmlElement(name = "AMOUNT")
    protected BigDecimal amount;
    @XmlElement(name = "MILES_COST")
    protected Integer milescost;
    @XmlElement(name = "ADDITIONAL_MILES_COST_INFO")
    protected ListTravellerPriceByElement.ADDITIONALMILESCOSTINFO additionalmilescostinfo;
    @XmlElement(name = "MILEAGE_ACCRUAL")
    protected Integer mileageaccrual;
    @XmlElement(name = "MILES_AND_CASH_COST")
    protected ListTravellerPriceByElement.MILESANDCASHCOST milesandcashcost;
    @XmlElement(name = "AMOUNT_WITHOUT_TAX")
    protected BigDecimal amountwithouttax;
    @XmlElement(name = "TAX")
    protected BigDecimal tax;
    @XmlElement(name = "TAX_DETAILS")
    protected ListTravellerPriceByElement.TAXDETAILS taxdetails;
    @XmlElement(name = "EXCHANGE_RATE")
    protected BigDecimal exchangerate;
    @XmlElement(name = "CURRENCY")
    protected CurrencyType currency;
    @XmlElement(name = "LIST_TAX")
    protected List<LISTTAXType> listtax;
    @XmlElement(name = "BLUEBIZ_CREDITS")
    protected BigDecimal bluebizcredits;
    @XmlElement(name = "SERVICE_FEE_AMOUNT")
    protected BigDecimal servicefeeamount;
    @XmlElement(name = "REBOOK_FEE")
    protected REBOOKFEEType rebookfee;
    @XmlElement(name = "NO_SHOW_FEE")
    protected REBOOKFEEType noshowfee;
    @XmlElement(name = "REBOOK_BALANCE")
    protected REBOOKBALANCEType rebookbalance;
    @XmlElement(name = "COLLECT_BALANCE")
    protected REBOOKBALANCEType collectbalance;
    @XmlElement(name = "REFUND_BALANCE")
    protected REBOOKBALANCEType refundbalance;
    @XmlElement(name = "NON_REFUNDABLE_AMOUNT")
    protected BigDecimal nonrefundableamount;
    @XmlElement(name = "NON_REUSABLE_VALUE")
    protected ListTravellerPriceByElement.NONREUSABLEVALUE nonreusablevalue;
    @XmlElement(name = "TOTAL_COLLECT_BALANCE")
    protected REBOOKBALANCEType totalcollectbalance;
    @XmlElement(name = "TOTAL_REBOOK_BALANCE")
    protected REBOOKBALANCEType totalrebookbalance;
    @XmlElement(name = "SURCHARGES")
    protected BigDecimal surcharges;
    @XmlElement(name = "SEAT_FEE")
    protected SEATFEEType seatfee;
    @XmlElement(name = "AMOUNT_WITH_FEES")
    protected BigDecimal amountwithfees;
    @XmlElement(name = "LIST_FEE")
    protected List<FEEType> listfee;
    @XmlElement(name = "TOTAL_AMOUNT")
    protected BigDecimal totalamount;
    @XmlElement(name = "PRICE_WITH_DISCOUNT")
    protected PRICEWITHDISCOUNTType pricewithdiscount;
    @XmlElement(name = "TOTAL_SUPPLEMENTS")
    protected BigDecimal totalsupplements;
    @XmlElement(name = "UNIT_PRICE")
    protected BigDecimal unitprice;
    @XmlElement(name = "NUMBER_OF_UNITS")
    protected BigInteger numberofunits;
    @XmlElement(name = "TSM_AMOUNT")
    protected BigDecimal tsmamount;
    @XmlElement(name = "TSM_CURRENCY")
    protected String tsmcurrency;

    /**
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMID(BigInteger value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the listsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareListSegmentsType }
     * 
     * 
     */
    public List<FareListSegmentsType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<FareListSegmentsType>();
        }
        return this.listsegment;
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
     * {@link ListTravellerPriceByElement.LISTFAREINFO }
     * 
     * 
     */
    public List<ListTravellerPriceByElement.LISTFAREINFO> getLISTFAREINFO() {
        if (listfareinfo == null) {
            listfareinfo = new ArrayList<ListTravellerPriceByElement.LISTFAREINFO>();
        }
        return this.listfareinfo;
    }

    /**
     * The price amount (after deduction of all applicable discounts).
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
     * Gets the value of the milescost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMILESCOST() {
        return milescost;
    }

    /**
     * Sets the value of the milescost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMILESCOST(Integer value) {
        this.milescost = value;
    }

    /**
     * Gets the value of the additionalmilescostinfo property.
     * 
     * @return
     *     possible object is
     *     {@link ListTravellerPriceByElement.ADDITIONALMILESCOSTINFO }
     *     
     */
    public ListTravellerPriceByElement.ADDITIONALMILESCOSTINFO getADDITIONALMILESCOSTINFO() {
        return additionalmilescostinfo;
    }

    /**
     * Sets the value of the additionalmilescostinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListTravellerPriceByElement.ADDITIONALMILESCOSTINFO }
     *     
     */
    public void setADDITIONALMILESCOSTINFO(ListTravellerPriceByElement.ADDITIONALMILESCOSTINFO value) {
        this.additionalmilescostinfo = value;
    }

    /**
     * Gets the value of the mileageaccrual property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMILEAGEACCRUAL() {
        return mileageaccrual;
    }

    /**
     * Sets the value of the mileageaccrual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMILEAGEACCRUAL(Integer value) {
        this.mileageaccrual = value;
    }

    /**
     * Gets the value of the milesandcashcost property.
     * 
     * @return
     *     possible object is
     *     {@link ListTravellerPriceByElement.MILESANDCASHCOST }
     *     
     */
    public ListTravellerPriceByElement.MILESANDCASHCOST getMILESANDCASHCOST() {
        return milesandcashcost;
    }

    /**
     * Sets the value of the milesandcashcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListTravellerPriceByElement.MILESANDCASHCOST }
     *     
     */
    public void setMILESANDCASHCOST(ListTravellerPriceByElement.MILESANDCASHCOST value) {
        this.milesandcashcost = value;
    }

    /**
     * The price amount without tax (after deduction of all applicable discounts).
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
     * Tax amount (after deduction of all applicable discounts).
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
     * Gets the value of the taxdetails property.
     * 
     * @return
     *     possible object is
     *     {@link ListTravellerPriceByElement.TAXDETAILS }
     *     
     */
    public ListTravellerPriceByElement.TAXDETAILS getTAXDETAILS() {
        return taxdetails;
    }

    /**
     * Sets the value of the taxdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListTravellerPriceByElement.TAXDETAILS }
     *     
     */
    public void setTAXDETAILS(ListTravellerPriceByElement.TAXDETAILS value) {
        this.taxdetails = value;
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
     * Gets the value of the listtax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTAX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTTAXType }
     * 
     * 
     */
    public List<LISTTAXType> getLISTTAX() {
        if (listtax == null) {
            listtax = new ArrayList<LISTTAXType>();
        }
        return this.listtax;
    }

    /**
     * Gets the value of the bluebizcredits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBLUEBIZCREDITS() {
        return bluebizcredits;
    }

    /**
     * Sets the value of the bluebizcredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBLUEBIZCREDITS(BigDecimal value) {
        this.bluebizcredits = value;
    }

    /**
     * Gets the value of the servicefeeamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSERVICEFEEAMOUNT() {
        return servicefeeamount;
    }

    /**
     * Sets the value of the servicefeeamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSERVICEFEEAMOUNT(BigDecimal value) {
        this.servicefeeamount = value;
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
     * Gets the value of the nonrefundableamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNONREFUNDABLEAMOUNT() {
        return nonrefundableamount;
    }

    /**
     * Sets the value of the nonrefundableamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNONREFUNDABLEAMOUNT(BigDecimal value) {
        this.nonrefundableamount = value;
    }

    /**
     * Gets the value of the nonreusablevalue property.
     * 
     * @return
     *     possible object is
     *     {@link ListTravellerPriceByElement.NONREUSABLEVALUE }
     *     
     */
    public ListTravellerPriceByElement.NONREUSABLEVALUE getNONREUSABLEVALUE() {
        return nonreusablevalue;
    }

    /**
     * Sets the value of the nonreusablevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListTravellerPriceByElement.NONREUSABLEVALUE }
     *     
     */
    public void setNONREUSABLEVALUE(ListTravellerPriceByElement.NONREUSABLEVALUE value) {
        this.nonreusablevalue = value;
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
     * Gets the value of the totalrebookbalance property.
     * 
     * @return
     *     possible object is
     *     {@link REBOOKBALANCEType }
     *     
     */
    public REBOOKBALANCEType getTOTALREBOOKBALANCE() {
        return totalrebookbalance;
    }

    /**
     * Sets the value of the totalrebookbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link REBOOKBALANCEType }
     *     
     */
    public void setTOTALREBOOKBALANCE(REBOOKBALANCEType value) {
        this.totalrebookbalance = value;
    }

    /**
     * Gets the value of the surcharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSURCHARGES() {
        return surcharges;
    }

    /**
     * Sets the value of the surcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSURCHARGES(BigDecimal value) {
        this.surcharges = value;
    }

    /**
     * Gets the value of the seatfee property.
     * 
     * @return
     *     possible object is
     *     {@link SEATFEEType }
     *     
     */
    public SEATFEEType getSEATFEE() {
        return seatfee;
    }

    /**
     * Sets the value of the seatfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEATFEEType }
     *     
     */
    public void setSEATFEE(SEATFEEType value) {
        this.seatfee = value;
    }

    /**
     * Gets the value of the amountwithfees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTWITHFEES() {
        return amountwithfees;
    }

    /**
     * Sets the value of the amountwithfees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTWITHFEES(BigDecimal value) {
        this.amountwithfees = value;
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
     * Gets the value of the pricewithdiscount property.
     * 
     * @return
     *     possible object is
     *     {@link PRICEWITHDISCOUNTType }
     *     
     */
    public PRICEWITHDISCOUNTType getPRICEWITHDISCOUNT() {
        return pricewithdiscount;
    }

    /**
     * Sets the value of the pricewithdiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICEWITHDISCOUNTType }
     *     
     */
    public void setPRICEWITHDISCOUNT(PRICEWITHDISCOUNTType value) {
        this.pricewithdiscount = value;
    }

    /**
     * Gets the value of the totalsupplements property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALSUPPLEMENTS() {
        return totalsupplements;
    }

    /**
     * Sets the value of the totalsupplements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALSUPPLEMENTS(BigDecimal value) {
        this.totalsupplements = value;
    }

    /**
     * Gets the value of the unitprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUNITPRICE() {
        return unitprice;
    }

    /**
     * Sets the value of the unitprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUNITPRICE(BigDecimal value) {
        this.unitprice = value;
    }

    /**
     * Gets the value of the numberofunits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBEROFUNITS() {
        return numberofunits;
    }

    /**
     * Sets the value of the numberofunits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBEROFUNITS(BigInteger value) {
        this.numberofunits = value;
    }

    /**
     * Sum of all the TSMs value of the PNR expressed in CURRENCY. If multiple or different currencies this total amount is not provided. This amount is NOT included in the TOTAL_AMOUNT.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSMAMOUNT() {
        return tsmamount;
    }

    /**
     * Sets the value of the tsmamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSMAMOUNT(BigDecimal value) {
        this.tsmamount = value;
    }

    /**
     * Currency of the sum of TSM total amounts set in field TSM_AMOUNT. Can be different from CURRENCY field which relates only to TST.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSMCURRENCY() {
        return tsmcurrency;
    }

    /**
     * Sets the value of the tsmcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSMCURRENCY(String value) {
        this.tsmcurrency = value;
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
     *         &lt;element name="TAX_INCLUSIVE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="TAX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="EXPIRED" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="REFUNDABLE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
        "taxinclusive",
        "tax",
        "expired",
        "refundable"
    })
    public static class ADDITIONALMILESCOSTINFO
        implements Serializable
    {

        @XmlElement(name = "TAX_INCLUSIVE")
        protected Integer taxinclusive;
        @XmlElement(name = "TAX")
        protected Integer tax;
        @XmlElement(name = "EXPIRED")
        protected Integer expired;
        @XmlElement(name = "REFUNDABLE")
        protected Integer refundable;

        /**
         * Gets the value of the taxinclusive property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTAXINCLUSIVE() {
            return taxinclusive;
        }

        /**
         * Sets the value of the taxinclusive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTAXINCLUSIVE(Integer value) {
            this.taxinclusive = value;
        }

        /**
         * Gets the value of the tax property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTAX() {
            return tax;
        }

        /**
         * Sets the value of the tax property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTAX(Integer value) {
            this.tax = value;
        }

        /**
         * Gets the value of the expired property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getEXPIRED() {
            return expired;
        }

        /**
         * Sets the value of the expired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setEXPIRED(Integer value) {
            this.expired = value;
        }

        /**
         * Gets the value of the refundable property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getREFUNDABLE() {
            return refundable;
        }

        /**
         * Sets the value of the refundable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setREFUNDABLE(Integer value) {
            this.refundable = value;
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
     *         &lt;element ref="{}AMOUNT" minOccurs="0"/&gt;
     *         &lt;element ref="{}AMOUNT_WITHOUT_TAX" minOccurs="0"/&gt;
     *         &lt;element ref="{}TAX" minOccurs="0"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "amount",
        "amountwithouttax",
        "tax",
        "type"
    })
    public static class LISTFAREINFO
        implements Serializable
    {

        @XmlElement(name = "AMOUNT")
        protected BigDecimal amount;
        @XmlElement(name = "AMOUNT_WITHOUT_TAX")
        protected BigDecimal amountwithouttax;
        @XmlElement(name = "TAX")
        protected BigDecimal tax;
        @XmlElement(name = "TYPE", required = true)
        protected Object type;

        /**
         * The price amount.
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
         * The price amount without tax
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
         * Tax amount.
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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTYPE(Object value) {
            this.type = value;
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
     *     &lt;extension base="{}MILES_AND_CASH_COST_WITH_SLIDER_Type"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MILESANDCASHCOST
        extends MILESANDCASHCOSTWITHSLIDERType
        implements Serializable
    {


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
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CURRENCY" type="{}currencyType" minOccurs="0"/&gt;
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
        "amount",
        "currency"
    })
    public static class NONREUSABLEVALUE
        implements Serializable
    {

        @XmlElement(name = "AMOUNT", required = true)
        protected String amount;
        @XmlElement(name = "CURRENCY")
        protected CurrencyType currency;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMOUNT(String value) {
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
     *         &lt;element name="GST_TAX" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="OTHER_TAX" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
        "gsttax",
        "othertax"
    })
    public static class TAXDETAILS
        implements Serializable
    {

        @XmlElement(name = "GST_TAX", required = true)
        protected BigDecimal gsttax;
        @XmlElement(name = "OTHER_TAX", required = true)
        protected BigDecimal othertax;

        /**
         * Gets the value of the gsttax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGSTTAX() {
            return gsttax;
        }

        /**
         * Sets the value of the gsttax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGSTTAX(BigDecimal value) {
            this.gsttax = value;
        }

        /**
         * Gets the value of the othertax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOTHERTAX() {
            return othertax;
        }

        /**
         * Sets the value of the othertax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOTHERTAX(BigDecimal value) {
            this.othertax = value;
        }

    }

}
