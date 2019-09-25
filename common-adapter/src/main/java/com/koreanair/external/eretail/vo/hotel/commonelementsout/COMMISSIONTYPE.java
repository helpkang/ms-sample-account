
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Hotel rate commission type.
 * 
 * <p>Java class for COMMISSION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMMISSION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INDICATOR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}PROVIDER_DESCRIPTION" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="LIST_AMOUNT" type="{}AMOUNT_TYPE" maxOccurs="unbounded"/&gt;
 *           &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMMISSION_TYPE", propOrder = {
    "indicator",
    "providerdescription",
    "listamount",
    "percentage"
})
@XmlSeeAlso({
    COMMISSIONPOLICYTYPE.class
})
public class COMMISSIONTYPE
    implements Serializable
{

    @XmlElement(name = "INDICATOR")
    protected Boolean indicator;
    @XmlElement(name = "PROVIDER_DESCRIPTION")
    protected String providerdescription;
    @XmlElement(name = "LIST_AMOUNT")
    protected List<AMOUNTTYPE> listamount;
    @XmlElement(name = "PERCENTAGE")
    protected BigDecimal percentage;

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINDICATOR() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINDICATOR(Boolean value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the providerdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDERDESCRIPTION() {
        return providerdescription;
    }

    /**
     * Sets the value of the providerdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDERDESCRIPTION(String value) {
        this.providerdescription = value;
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
     * {@link AMOUNTTYPE }
     * 
     * 
     */
    public List<AMOUNTTYPE> getLISTAMOUNT() {
        if (listamount == null) {
            listamount = new ArrayList<AMOUNTTYPE>();
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

}
