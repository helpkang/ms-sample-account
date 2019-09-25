
package com.koreanair.external.eretail.vo.tripplan.ancillary_services;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for discountAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="discountAmountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NON_DISCOUNTED_TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT_REASON_INFORMATION" type="{}discountReasonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discountAmountType", propOrder = {
    "nondiscountedtotalamount",
    "discountreasoninformation"
})
public class DiscountAmountType
    implements Serializable
{

    @XmlElement(name = "NON_DISCOUNTED_TOTAL_AMOUNT")
    protected BigDecimal nondiscountedtotalamount;
    @XmlElement(name = "DISCOUNT_REASON_INFORMATION")
    protected List<DiscountReasonType> discountreasoninformation;

    /**
     * Gets the value of the nondiscountedtotalamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNONDISCOUNTEDTOTALAMOUNT() {
        return nondiscountedtotalamount;
    }

    /**
     * Sets the value of the nondiscountedtotalamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNONDISCOUNTEDTOTALAMOUNT(BigDecimal value) {
        this.nondiscountedtotalamount = value;
    }

    /**
     * Gets the value of the discountreasoninformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountreasoninformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDISCOUNTREASONINFORMATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountReasonType }
     * 
     * 
     */
    public List<DiscountReasonType> getDISCOUNTREASONINFORMATION() {
        if (discountreasoninformation == null) {
            discountreasoninformation = new ArrayList<DiscountReasonType>();
        }
        return this.discountreasoninformation;
    }

}
