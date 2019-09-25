
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.reservation.common.DateType;


/**
 * <p>Java class for PaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_CC_TYPE" type="{}CreditCardType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PAYMENT_TYPE" type="{}PaymentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MOB_INFO" type="{}MethodOfBookingType" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="HOLD_TIME" type="{}DateType" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInformationType", propOrder = {
    "listcctype",
    "listpaymenttype",
    "listmobinfo",
    "holdtime",
    "description"
})
public class PaymentInformationType
    implements Serializable
{

    @XmlElement(name = "LIST_CC_TYPE")
    protected List<CreditCardType> listcctype;
    @XmlElement(name = "LIST_PAYMENT_TYPE")
    protected List<PaymentType> listpaymenttype;
    @XmlElement(name = "LIST_MOB_INFO")
    protected List<MethodOfBookingType> listmobinfo;
    @XmlElement(name = "HOLD_TIME")
    protected DateType holdtime;
    @XmlElement(name = "DESCRIPTION")
    protected String description;

    /**
     * Gets the value of the listcctype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcctype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCCTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardType }
     * 
     * 
     */
    public List<CreditCardType> getLISTCCTYPE() {
        if (listcctype == null) {
            listcctype = new ArrayList<CreditCardType>();
        }
        return this.listcctype;
    }

    /**
     * Gets the value of the listpaymenttype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpaymenttype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPAYMENTTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentType }
     * 
     * 
     */
    public List<PaymentType> getLISTPAYMENTTYPE() {
        if (listpaymenttype == null) {
            listpaymenttype = new ArrayList<PaymentType>();
        }
        return this.listpaymenttype;
    }

    /**
     * Gets the value of the listmobinfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmobinfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMOBINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodOfBookingType }
     * 
     * 
     */
    public List<MethodOfBookingType> getLISTMOBINFO() {
        if (listmobinfo == null) {
            listmobinfo = new ArrayList<MethodOfBookingType>();
        }
        return this.listmobinfo;
    }

    /**
     * Gets the value of the holdtime property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getHOLDTIME() {
        return holdtime;
    }

    /**
     * Sets the value of the holdtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setHOLDTIME(DateType value) {
        this.holdtime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

}
