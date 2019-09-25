
package com.koreanair.eretail.pojo.tripplan.common.common_price;

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
import com.koreanair.eretail.pojo.farecommon.farecommon.LISTTAXType;


/**
 * <p>Java class for SEAT_FEE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEAT_FEE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}AMOUNT"/&gt;
 *         &lt;element ref="{}AMOUNT_WITHOUT_TAX"/&gt;
 *         &lt;element name="CURRENCY" type="{}CURRENCY_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}TAX"/&gt;
 *         &lt;element name="LIST_TAX" type="{}LIST_TAX_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NUMBER_OF_PAX" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="AMOUNT_FOR_ONE_PAX" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="BASE_FEE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEAT_FEE_Type", propOrder = {
    "amount",
    "amountwithouttax",
    "currency",
    "tax",
    "listtax",
    "numberofpax",
    "amountforonepax",
    "basefee"
})
public class SEATFEEType
    implements Serializable
{

    @XmlElement(name = "AMOUNT", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "AMOUNT_WITHOUT_TAX", required = true)
    protected BigDecimal amountwithouttax;
    @XmlElement(name = "CURRENCY")
    protected CURRENCYType currency;
    @XmlElement(name = "TAX", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "LIST_TAX")
    protected List<LISTTAXType> listtax;
    @XmlElement(name = "NUMBER_OF_PAX", required = true)
    protected BigInteger numberofpax;
    @XmlElement(name = "AMOUNT_FOR_ONE_PAX", required = true)
    protected BigDecimal amountforonepax;
    @XmlElement(name = "BASE_FEE", required = true)
    protected BigDecimal basefee;

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
     * Gets the value of the numberofpax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUMBEROFPAX() {
        return numberofpax;
    }

    /**
     * Sets the value of the numberofpax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUMBEROFPAX(BigInteger value) {
        this.numberofpax = value;
    }

    /**
     * Gets the value of the amountforonepax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTFORONEPAX() {
        return amountforonepax;
    }

    /**
     * Sets the value of the amountforonepax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTFORONEPAX(BigDecimal value) {
        this.amountforonepax = value;
    }

    /**
     * Gets the value of the basefee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBASEFEE() {
        return basefee;
    }

    /**
     * Sets the value of the basefee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBASEFEE(BigDecimal value) {
        this.basefee = value;
    }

}
