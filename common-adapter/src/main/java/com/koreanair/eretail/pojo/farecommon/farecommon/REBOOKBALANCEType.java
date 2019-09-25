
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
 * <p>Java class for REBOOK_BALANCE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REBOOK_BALANCE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}AMOUNT_SIMPLE_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AMOUNT_RETAINED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FEE_RETAINED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_RETAINED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_MILES_RETAINED" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MILES_AND_CASH_COST" type="{}MILES_AND_CASH_COST_Type" minOccurs="0"/&gt;
 *         &lt;element name="MILES_FEE_RETAINED" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TAX" type="{}LIST_TAX_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CURRENCY" type="{}DictionaryChoice" minOccurs="0"/&gt;
 *         &lt;element name="IS_REPRICE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BALANCE_STATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}unprotectedStringType"&gt;
 *               &lt;length value="15"/&gt;
 *               &lt;enumeration value="NO_REFUND"/&gt;
 *               &lt;enumeration value="REFUND"/&gt;
 *               &lt;enumeration value="PARTIAL_REFUND"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}MILES_COST" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRAVEL_FUND" type="{}TRAVEL_FUND_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REBOOK_BALANCE_Type", propOrder = {
    "amountretained",
    "feeretained",
    "totalretained",
    "totalmilesretained",
    "milesandcashcost",
    "milesfeeretained",
    "listtax",
    "currency",
    "isreprice",
    "balancestatus",
    "milescost",
    "listtravelfund"
})
public class REBOOKBALANCEType
    extends AMOUNTSIMPLEType
    implements Serializable
{

    @XmlElement(name = "AMOUNT_RETAINED")
    protected BigDecimal amountretained;
    @XmlElement(name = "FEE_RETAINED")
    protected BigDecimal feeretained;
    @XmlElement(name = "TOTAL_RETAINED")
    protected BigDecimal totalretained;
    @XmlElement(name = "TOTAL_MILES_RETAINED")
    protected Integer totalmilesretained;
    @XmlElement(name = "MILES_AND_CASH_COST")
    protected MILESANDCASHCOSTType milesandcashcost;
    @XmlElement(name = "MILES_FEE_RETAINED")
    protected Integer milesfeeretained;
    @XmlElement(name = "LIST_TAX")
    protected List<LISTTAXType> listtax;
    @XmlElement(name = "CURRENCY")
    protected DictionaryChoice currency;
    @XmlElement(name = "IS_REPRICE")
    protected Boolean isreprice;
    @XmlElement(name = "BALANCE_STATUS")
    protected String balancestatus;
    @XmlElement(name = "MILES_COST")
    protected BigInteger milescost;
    @XmlElement(name = "LIST_TRAVEL_FUND")
    protected List<TRAVELFUNDType> listtravelfund;

    /**
     * Gets the value of the amountretained property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTRETAINED() {
        return amountretained;
    }

    /**
     * Sets the value of the amountretained property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTRETAINED(BigDecimal value) {
        this.amountretained = value;
    }

    /**
     * Gets the value of the feeretained property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFEERETAINED() {
        return feeretained;
    }

    /**
     * Sets the value of the feeretained property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFEERETAINED(BigDecimal value) {
        this.feeretained = value;
    }

    /**
     * Gets the value of the totalretained property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALRETAINED() {
        return totalretained;
    }

    /**
     * Sets the value of the totalretained property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALRETAINED(BigDecimal value) {
        this.totalretained = value;
    }

    /**
     * Gets the value of the totalmilesretained property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTOTALMILESRETAINED() {
        return totalmilesretained;
    }

    /**
     * Sets the value of the totalmilesretained property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTOTALMILESRETAINED(Integer value) {
        this.totalmilesretained = value;
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
     * Gets the value of the milesfeeretained property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMILESFEERETAINED() {
        return milesfeeretained;
    }

    /**
     * Sets the value of the milesfeeretained property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMILESFEERETAINED(Integer value) {
        this.milesfeeretained = value;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link DictionaryChoice }
     *     
     */
    public DictionaryChoice getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryChoice }
     *     
     */
    public void setCURRENCY(DictionaryChoice value) {
        this.currency = value;
    }

    /**
     * Gets the value of the isreprice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISREPRICE() {
        return isreprice;
    }

    /**
     * Sets the value of the isreprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISREPRICE(Boolean value) {
        this.isreprice = value;
    }

    /**
     * Gets the value of the balancestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALANCESTATUS() {
        return balancestatus;
    }

    /**
     * Sets the value of the balancestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALANCESTATUS(String value) {
        this.balancestatus = value;
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
     * Gets the value of the listtravelfund property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtravelfund property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRAVELFUND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRAVELFUNDType }
     * 
     * 
     */
    public List<TRAVELFUNDType> getLISTTRAVELFUND() {
        if (listtravelfund == null) {
            listtravelfund = new ArrayList<TRAVELFUNDType>();
        }
        return this.listtravelfund;
    }

}
