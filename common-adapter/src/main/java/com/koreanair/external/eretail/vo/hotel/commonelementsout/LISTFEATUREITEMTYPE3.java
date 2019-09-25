
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List Feature.
 * 
 * <p>Java class for LIST_FEATURE_ITEM_TYPE_3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_FEATURE_ITEM_TYPE_3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}LIST_FEATURE_ITEM_TYPE_1"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_SUB_FEATURE" type="{}LIST_FEATURE_ITEM_TYPE_1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_FEATURE_ITEM_TYPE_3", propOrder = {
    "listsubfeature"
})
public class LISTFEATUREITEMTYPE3
    extends LISTFEATUREITEMTYPE1
    implements Serializable
{

    @XmlElement(name = "LIST_SUB_FEATURE")
    protected List<LISTFEATUREITEMTYPE1> listsubfeature;

    /**
     * Gets the value of the listsubfeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsubfeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSUBFEATURE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFEATUREITEMTYPE1 }
     * 
     * 
     */
    public List<LISTFEATUREITEMTYPE1> getLISTSUBFEATURE() {
        if (listsubfeature == null) {
            listsubfeature = new ArrayList<LISTFEATUREITEMTYPE1>();
        }
        return this.listsubfeature;
    }

}
