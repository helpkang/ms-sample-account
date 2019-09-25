
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.common.CODENAMETYPESTRICT;


/**
 * Payment Methods Accepted By This Hotel
 * 
 * <p>Java class for PAYMENT_METHOD_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYMENT_METHOD_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="METHOD" type="{}CODE_NAME_TYPE_STRICT" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PAYMENT_CARD" type="{}PAYMENT_CARDS_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAYMENT_METHOD_TYPE", propOrder = {
    "method",
    "listpaymentcard"
})
@XmlSeeAlso({
    GUARANTEEPAYMENTMETHODTYPE.class
})
public class PAYMENTMETHODTYPE
    implements Serializable
{

    @XmlElement(name = "METHOD")
    protected CODENAMETYPESTRICT method;
    @XmlElement(name = "LIST_PAYMENT_CARD")
    protected List<PAYMENTCARDSTYPE> listpaymentcard;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public CODENAMETYPESTRICT getMETHOD() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public void setMETHOD(CODENAMETYPESTRICT value) {
        this.method = value;
    }

    /**
     * Gets the value of the listpaymentcard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpaymentcard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPAYMENTCARD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENTCARDSTYPE }
     * 
     * 
     */
    public List<PAYMENTCARDSTYPE> getLISTPAYMENTCARD() {
        if (listpaymentcard == null) {
            listpaymentcard = new ArrayList<PAYMENTCARDSTYPE>();
        }
        return this.listpaymentcard;
    }

}
