
package com.koreanair.eretail.pojo.fareshopper.fareshoppercommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_MATCHING_LOCATIONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_MATCHING_LOCATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_B_LOCATION" type="{}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIST_E_LOCATION" type="{}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_MATCHING_LOCATIONType", propOrder = {
    "listblocation",
    "listelocation"
})
public class LISTMATCHINGLOCATIONType
    implements Serializable
{

    @XmlElement(name = "LIST_B_LOCATION")
    protected List<LocationType> listblocation;
    @XmlElement(name = "LIST_E_LOCATION")
    protected List<LocationType> listelocation;

    /**
     * Gets the value of the listblocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listblocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTBLOCATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getLISTBLOCATION() {
        if (listblocation == null) {
            listblocation = new ArrayList<LocationType>();
        }
        return this.listblocation;
    }

    /**
     * Gets the value of the listelocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELOCATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getLISTELOCATION() {
        if (listelocation == null) {
            listelocation = new ArrayList<LocationType>();
        }
        return this.listelocation;
    }

}
