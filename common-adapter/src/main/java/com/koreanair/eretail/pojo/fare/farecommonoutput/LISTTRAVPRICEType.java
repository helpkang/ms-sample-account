
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.farecommon.CURRENCYType;
import com.koreanair.eretail.pojo.farecommon.farecommon.FEEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTBOUNDPRICEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTFAREINFO;
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTTAXType;
import com.koreanair.eretail.pojo.farecommon.farecommon.MILESANDCASHCOSTType;
import com.koreanair.eretail.pojo.farecommon.farecommon.REBOOKBALANCEType;
import com.koreanair.eretail.pojo.farecommon.farecommon.REBOOKFEEType;


/**
 * <p>Java class for LIST_TRAV_PRICE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRAV_PRICE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}TOTAL_AMOUNT"/&gt;
 *         &lt;element ref="{}AMOUNT"/&gt;
 *         &lt;element ref="{}AMOUNT_WITHOUT_TAX"/&gt;
 *         &lt;element ref="{}TAX"/&gt;
 *         &lt;element name="LIST_TAX" type="{}LIST_TAX_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}EXCHANGE_RATE"/&gt;
 *         &lt;element name="CURRENCY" type="{}CURRENCY_Type"/&gt;
 *         &lt;element ref="{}BLUEBIZ_CREDITS" minOccurs="0"/&gt;
 *         &lt;element ref="{}REBOOK_FEE" minOccurs="0"/&gt;
 *         &lt;element ref="{}NO_SHOW_FEE" minOccurs="0"/&gt;
 *         &lt;element ref="{}SURCHARGES" minOccurs="0"/&gt;
 *         &lt;element ref="{}SERVICE_FEE_AMOUNT" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FEE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_BOUND_PRICE" type="{}LIST_BOUND_PRICE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="REBOOK_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
 *         &lt;element name="COLLECT_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_COLLECT_BALANCE" type="{}REBOOK_BALANCE_Type" minOccurs="0"/&gt;
 *         &lt;group ref="{}MilesOutputGroup" minOccurs="0"/&gt;
 *         &lt;element name="MILES_AND_CASH_COST" type="{}MILES_AND_CASH_COST_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_FARE_INFO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MILEAGE_ACCRUAL" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TRAV_PRICE_Type", propOrder = {
    "totalamount",
    "amount",
    "amountwithouttax",
    "tax",
    "listtax",
    "exchangerate",
    "currency",
    "bluebizcredits",
    "rebookfee",
    "noshowfee",
    "surcharges",
    "servicefeeamount",
    "listfee",
    "listboundprice",
    "rebookbalance",
    "collectbalance",
    "totalcollectbalance",
    "milescost",
    "additionalmilescostinfo",
    "milesandcashcost",
    "listfareinfo",
    "mileageaccrual"
})
public class LISTTRAVPRICEType
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
    @XmlElement(name = "LIST_TAX")
    protected List<LISTTAXType> listtax;
    @XmlElement(name = "EXCHANGE_RATE", required = true)
    protected BigDecimal exchangerate;
    @XmlElement(name = "CURRENCY", required = true)
    protected CURRENCYType currency;
    @XmlElement(name = "BLUEBIZ_CREDITS")
    protected Float bluebizcredits;
    @XmlElement(name = "REBOOK_FEE")
    protected REBOOKFEEType rebookfee;
    @XmlElement(name = "NO_SHOW_FEE")
    protected REBOOKFEEType noshowfee;
    @XmlElement(name = "SURCHARGES")
    protected BigDecimal surcharges;
    @XmlElement(name = "SERVICE_FEE_AMOUNT")
    protected BigDecimal servicefeeamount;
    @XmlElement(name = "LIST_FEE")
    protected List<FEEType> listfee;
    @XmlElement(name = "LIST_BOUND_PRICE")
    protected List<LISTBOUNDPRICEType> listboundprice;
    @XmlElement(name = "REBOOK_BALANCE")
    protected REBOOKBALANCEType rebookbalance;
    @XmlElement(name = "COLLECT_BALANCE")
    protected REBOOKBALANCEType collectbalance;
    @XmlElement(name = "TOTAL_COLLECT_BALANCE")
    protected REBOOKBALANCEType totalcollectbalance;
    @XmlElement(name = "MILES_COST")
    protected BigInteger milescost;
    @XmlElement(name = "ADDITIONAL_MILES_COST_INFO")
    protected ADDITIONALMILESCOSTINFOType additionalmilescostinfo;
    @XmlElement(name = "MILES_AND_CASH_COST")
    protected MILESANDCASHCOSTType milesandcashcost;
    @XmlElement(name = "LIST_FARE_INFO")
    protected List<LISTFAREINFO> listfareinfo;
    @XmlElement(name = "MILEAGE_ACCRUAL")
    protected BigInteger mileageaccrual;

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
     * Gets the value of the bluebizcredits property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBLUEBIZCREDITS() {
        return bluebizcredits;
    }

    /**
     * Sets the value of the bluebizcredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBLUEBIZCREDITS(Float value) {
        this.bluebizcredits = value;
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

}
