
package com.koreanair.eretail.pojo.air.commonin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of segments for the same requested segment / element
 * 
 * <p>Java class for BOOKED_ELEMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOOKED_ELEMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}BOOKED_SEGMENT_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOOKED_ELEMENT_Type", propOrder = {
    "listsegment"
})
public class BOOKEDELEMENTType
    implements Serializable
{

    @XmlElement(name = "LIST_SEGMENT", required = true)
    protected List<BOOKEDSEGMENTType> listsegment;

    /**
     * Gets the value of the listsegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOOKEDSEGMENTType }
     * 
     * 
     */
    public List<BOOKEDSEGMENTType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<BOOKEDSEGMENTType>();
        }
        return this.listsegment;
    }

}
