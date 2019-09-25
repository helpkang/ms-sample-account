
package com.koreanair.external.eretail.vo.tripplan.payment_group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EXTRA_PAYMENT_INFO_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXTRA_PAYMENT_INFO_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_EXTRA_INFO" type="{}LIST_EXTRA_INFO_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXTRA_PAYMENT_INFO_Type", propOrder = {
    "listextrainfo"
})
public class EXTRAPAYMENTINFOType
    implements Serializable
{

    @XmlElement(name = "LIST_EXTRA_INFO")
    protected List<LISTEXTRAINFOType> listextrainfo;

    /**
     * Gets the value of the listextrainfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listextrainfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTEXTRAINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTEXTRAINFOType }
     * 
     * 
     */
    public List<LISTEXTRAINFOType> getLISTEXTRAINFO() {
        if (listextrainfo == null) {
            listextrainfo = new ArrayList<LISTEXTRAINFOType>();
        }
        return this.listextrainfo;
    }

}
