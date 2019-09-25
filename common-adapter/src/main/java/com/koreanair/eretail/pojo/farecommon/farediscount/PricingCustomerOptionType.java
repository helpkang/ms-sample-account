
package com.koreanair.eretail.pojo.farecommon.farediscount;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingCustomerOption_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingCustomerOption_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_CUSTOMER_DISCOUNT" type="{}CustomerDiscount_Type" maxOccurs="6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingCustomerOption_Type", propOrder = {
    "listcustomerdiscount"
})
public class PricingCustomerOptionType
    implements Serializable
{

    @XmlElement(name = "LIST_CUSTOMER_DISCOUNT", required = true)
    protected List<CustomerDiscountType> listcustomerdiscount;

    /**
     * Gets the value of the listcustomerdiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcustomerdiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTCUSTOMERDISCOUNT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerDiscountType }
     * 
     * 
     */
    public List<CustomerDiscountType> getLISTCUSTOMERDISCOUNT() {
        if (listcustomerdiscount == null) {
            listcustomerdiscount = new ArrayList<CustomerDiscountType>();
        }
        return this.listcustomerdiscount;
    }

}
