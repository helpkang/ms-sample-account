
package com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.common.common.CodeDescriptorType;


/**
 * Display Meal Services
 * 
 * <p>Java class for LIST_MEAL_SERVICES_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_MEAL_SERVICES_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOOKING_CLASS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="LIST_SERVICE" type="{}CodeDescriptorType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_MEAL_SERVICES_Type", propOrder = {
    "bookingclass",
    "listservice"
})
public class LISTMEALSERVICESType
    implements Serializable
{

    @XmlElement(name = "BOOKING_CLASS", required = true)
    protected Object bookingclass;
    @XmlElement(name = "LIST_SERVICE", required = true)
    protected List<CodeDescriptorType> listservice;

    /**
     * Gets the value of the bookingclass property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBOOKINGCLASS() {
        return bookingclass;
    }

    /**
     * Sets the value of the bookingclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBOOKINGCLASS(Object value) {
        this.bookingclass = value;
    }

    /**
     * Gets the value of the listservice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listservice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSERVICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeDescriptorType }
     * 
     * 
     */
    public List<CodeDescriptorType> getLISTSERVICE() {
        if (listservice == null) {
            listservice = new ArrayList<CodeDescriptorType>();
        }
        return this.listservice;
    }

}
