
package com.koreanair.eretail.pojo.hotel.commonout;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This XSD type is used to represent a set of hotels sharing the same pool id. Introduced by CR3951693.
 * 
 * <p>Java class for HOTEL_MULTISOURCE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_MULTISOURCE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}HOTEL_HBP_TYPE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_DUPE_HOTELS" type="{}HOTEL_DUPE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_MULTISOURCE_TYPE", propOrder = {
    "listdupehotels"
})
@XmlSeeAlso({
    RULESDRIVENHOTELTYPE.class
})
public class HOTELMULTISOURCETYPE
    extends HOTELHBPTYPE
{

    @XmlElement(name = "LIST_DUPE_HOTELS")
    protected List<HOTELDUPETYPE> listdupehotels;

    /**
     * Gets the value of the listdupehotels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdupehotels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDUPEHOTELS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HOTELDUPETYPE }
     * 
     * 
     */
    public List<HOTELDUPETYPE> getLISTDUPEHOTELS() {
        if (listdupehotels == null) {
            listdupehotels = new ArrayList<HOTELDUPETYPE>();
        }
        return this.listdupehotels;
    }

}
