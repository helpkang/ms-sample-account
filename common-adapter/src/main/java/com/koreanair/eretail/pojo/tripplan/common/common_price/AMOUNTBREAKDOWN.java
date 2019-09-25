
package com.koreanair.eretail.pojo.tripplan.common.common_price;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AMOUNT_BREAKDOWN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMOUNT_BREAKDOWN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}AMOUNTS_TYPE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BASE_FARE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FEE" type="{}AMOUNT_DETAILS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SURCHARGE" type="{}AMOUNT_DETAILS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TAX" type="{}AMOUNT_DETAILS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMOUNT_BREAKDOWN", propOrder = {
    "basefare",
    "listfee",
    "listsurcharge",
    "listtax"
})
public class AMOUNTBREAKDOWN
    extends AMOUNTSTYPE
    implements Serializable
{

    @XmlElement(name = "BASE_FARE")
    protected Object basefare;
    @XmlElement(name = "LIST_FEE")
    protected List<AMOUNTDETAILS> listfee;
    @XmlElement(name = "LIST_SURCHARGE")
    protected List<AMOUNTDETAILS> listsurcharge;
    @XmlElement(name = "LIST_TAX")
    protected List<AMOUNTDETAILS> listtax;

    /**
     * Gets the value of the basefare property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBASEFARE() {
        return basefare;
    }

    /**
     * Sets the value of the basefare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBASEFARE(Object value) {
        this.basefare = value;
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
     * {@link AMOUNTDETAILS }
     * 
     * 
     */
    public List<AMOUNTDETAILS> getLISTFEE() {
        if (listfee == null) {
            listfee = new ArrayList<AMOUNTDETAILS>();
        }
        return this.listfee;
    }

    /**
     * Gets the value of the listsurcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsurcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSURCHARGE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AMOUNTDETAILS }
     * 
     * 
     */
    public List<AMOUNTDETAILS> getLISTSURCHARGE() {
        if (listsurcharge == null) {
            listsurcharge = new ArrayList<AMOUNTDETAILS>();
        }
        return this.listsurcharge;
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
     * {@link AMOUNTDETAILS }
     * 
     * 
     */
    public List<AMOUNTDETAILS> getLISTTAX() {
        if (listtax == null) {
            listtax = new ArrayList<AMOUNTDETAILS>();
        }
        return this.listtax;
    }

}
