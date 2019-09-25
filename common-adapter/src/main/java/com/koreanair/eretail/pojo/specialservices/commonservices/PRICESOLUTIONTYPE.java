
package com.koreanair.eretail.pojo.specialservices.commonservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRICE_SOLUTION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRICE_SOLUTION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_PRICE_COMPONENT" type="{}priceElementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRICE_SOLUTION_TYPE", propOrder = {
    "listpricecomponent"
})
public class PRICESOLUTIONTYPE
    implements Serializable
{

    @XmlElement(name = "LIST_PRICE_COMPONENT")
    protected List<PriceElementType> listpricecomponent;

    /**
     * Gets the value of the listpricecomponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listpricecomponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICECOMPONENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceElementType }
     * 
     * 
     */
    public List<PriceElementType> getLISTPRICECOMPONENT() {
        if (listpricecomponent == null) {
            listpricecomponent = new ArrayList<PriceElementType>();
        }
        return this.listpricecomponent;
    }

}
