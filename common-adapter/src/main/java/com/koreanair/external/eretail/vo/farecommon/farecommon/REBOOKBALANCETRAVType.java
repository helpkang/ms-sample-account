
package com.koreanair.external.eretail.vo.farecommon.farecommon;

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
 * <p>Java class for REBOOK_BALANCE_TRAV_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REBOOK_BALANCE_TRAV_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}AMOUNT_SIMPLE_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACTION" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AMOUNT_RETAINED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FEE_RETAINED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_RETAINED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TAX" type="{}LIST_TAX_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REBOOK_BALANCE_TRAV_Type", propOrder = {
    "action",
    "amountretained",
    "feeretained",
    "totalretained",
    "listtax",
    "balancestatus"
})
public class REBOOKBALANCETRAVType
    extends AMOUNTSIMPLEType
    implements Serializable
{

    @XmlElement(name = "ACTION")
    protected BigInteger action;
    @XmlElement(name = "AMOUNT_RETAINED")
    protected BigDecimal amountretained;
    @XmlElement(name = "FEE_RETAINED")
    protected BigDecimal feeretained;
    @XmlElement(name = "TOTAL_RETAINED")
    protected BigDecimal totalretained;
    @XmlElement(name = "LIST_TAX")
    protected List<LISTTAXType> listtax;
    @XmlElement(name = "BALANCE_STATUS")
    protected String balancestatus;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getACTION() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setACTION(BigInteger value) {
        this.action = value;
    }

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

}
