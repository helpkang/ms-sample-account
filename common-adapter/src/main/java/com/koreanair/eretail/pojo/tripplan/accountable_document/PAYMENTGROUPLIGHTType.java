
package com.koreanair.eretail.pojo.tripplan.accountable_document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is basically a subset of "PAYMENT_GROUP_Type" defined in "PAYMENT_GROUP.xsd".
 * 
 * <p>Java class for PAYMENT_GROUP_LIGHT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAYMENT_GROUP_LIGHT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="PAYMENT_GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIST_PAYMENT" type="{}PAYMENT_LIGHT_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAYMENT_GROUP_LIGHT_Type", propOrder = {
    "type",
    "paymentgroupid",
    "listpayment"
})
public class PAYMENTGROUPLIGHTType
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "PAYMENT_GROUP_ID")
    protected String paymentgroupid;
    @XmlElement(name = "LIST_PAYMENT")
    protected List<PAYMENTLIGHTType> listpayment;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the paymentgroupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTGROUPID() {
        return paymentgroupid;
    }

    /**
     * Sets the value of the paymentgroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTGROUPID(String value) {
        this.paymentgroupid = value;
    }

    /**
     * Gets the value of the listpayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPAYMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENTLIGHTType }
     * 
     * 
     */
    public List<PAYMENTLIGHTType> getLISTPAYMENT() {
        if (listpayment == null) {
            listpayment = new ArrayList<PAYMENTLIGHTType>();
        }
        return this.listpayment;
    }

}
