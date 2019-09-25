
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DINING_FACILITIES_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DINING_FACILITIES_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_RESTAURANT" type="{}RESTAURANT_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RESTAURANT_QUANTITY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DINING_FACILITIES_TYPE", propOrder = {
    "listrestaurant",
    "restaurantquantity"
})
public class DININGFACILITIESTYPE
    implements Serializable
{

    @XmlElement(name = "LIST_RESTAURANT")
    protected List<RESTAURANTTYPE> listrestaurant;
    @XmlElement(name = "RESTAURANT_QUANTITY")
    protected BigInteger restaurantquantity;

    /**
     * Gets the value of the listrestaurant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listrestaurant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTRESTAURANT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RESTAURANTTYPE }
     * 
     * 
     */
    public List<RESTAURANTTYPE> getLISTRESTAURANT() {
        if (listrestaurant == null) {
            listrestaurant = new ArrayList<RESTAURANTTYPE>();
        }
        return this.listrestaurant;
    }

    /**
     * Gets the value of the restaurantquantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRESTAURANTQUANTITY() {
        return restaurantquantity;
    }

    /**
     * Sets the value of the restaurantquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRESTAURANTQUANTITY(BigInteger value) {
        this.restaurantquantity = value;
    }

}
