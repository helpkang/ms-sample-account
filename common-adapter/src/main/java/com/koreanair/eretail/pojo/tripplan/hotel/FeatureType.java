
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}SimpleFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_SUB_FEATURE" type="{}SimpleFeatureType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureType", propOrder = {
    "listsubfeature"
})
public class FeatureType
    extends SimpleFeatureType
    implements Serializable
{

    @XmlElement(name = "LIST_SUB_FEATURE")
    protected List<SimpleFeatureType> listsubfeature;

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
     * {@link SimpleFeatureType }
     * 
     * 
     */
    public List<SimpleFeatureType> getLISTSUBFEATURE() {
        if (listsubfeature == null) {
            listsubfeature = new ArrayList<SimpleFeatureType>();
        }
        return this.listsubfeature;
    }

}
