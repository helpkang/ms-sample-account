
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
 * <p>Java class for LIST_DAY_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_DAY_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_DAY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="7" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_DAY_TYPE", propOrder = {
    "listday"
})
@XmlSeeAlso({
    com.koreanair.eretail.pojo.hotel.commonelementsout.RESTAURANTTYPE.LISTOPERATIONSCHEDULE.LISTOPERATIONTIME.class,
    HOLDPOLICYTYPE.class
})
public class LISTDAYTYPE
    implements Serializable
{

    @XmlElement(name = "LIST_DAY")
    protected List<String> listday;

    /**
     * Gets the value of the listday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDAY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTDAY() {
        if (listday == null) {
            listday = new ArrayList<String>();
        }
        return this.listday;
    }

}
