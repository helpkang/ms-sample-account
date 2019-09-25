
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PAYMENT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYMENT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_CC_TYPE" type="{}LIST_CC_TYPE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PAYMENT_TYPE" type="{}LIST_PAYMENT_TYPEType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_MOB_INFO" type="{}MOB_TYPEType" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAYMENT_TYPE", propOrder = {
    "listcctype",
    "listpaymenttype",
    "listmobinfo"
})
@XmlSeeAlso({
    GUARANTEEDEPOSITTYPE.class
})
public class PAYMENTTYPE
    implements Serializable
{

    @XmlElement(name = "LIST_CC_TYPE")
    protected List<LISTCCTYPEType> listcctype;
    @XmlElement(name = "LIST_PAYMENT_TYPE")
    protected List<LISTPAYMENTTYPEType> listpaymenttype;
    @XmlElement(name = "LIST_MOB_INFO")
    protected List<MOBTYPEType> listmobinfo;

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
     * {@link LISTCCTYPEType }
     * 
     * 
     */
    public List<LISTCCTYPEType> getLISTCCTYPE() {
        if (listcctype == null) {
            listcctype = new ArrayList<LISTCCTYPEType>();
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
     * {@link LISTPAYMENTTYPEType }
     * 
     * 
     */
    public List<LISTPAYMENTTYPEType> getLISTPAYMENTTYPE() {
        if (listpaymenttype == null) {
            listpaymenttype = new ArrayList<LISTPAYMENTTYPEType>();
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
     * {@link MOBTYPEType }
     * 
     * 
     */
    public List<MOBTYPEType> getLISTMOBINFO() {
        if (listmobinfo == null) {
            listmobinfo = new ArrayList<MOBTYPEType>();
        }
        return this.listmobinfo;
    }

}
