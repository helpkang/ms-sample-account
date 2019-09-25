
package com.koreanair.eretail.pojo.tripplan.common.common_document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.tripplan.common.common_segment.SegmentType;


/**
 * <p>Java class for PnrDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}segmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="REC_LOC" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrDataType", propOrder = {
    "listsegment",
    "recloc"
})
public class PnrDataType
    implements Serializable
{

    @XmlElement(name = "LIST_SEGMENT")
    protected List<SegmentType> listsegment;
    @XmlElement(name = "REC_LOC")
    protected String recloc;

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
     * {@link SegmentType }
     * 
     * 
     */
    public List<SegmentType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<SegmentType>();
        }
        return this.listsegment;
    }

    /**
     * Gets the value of the recloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECLOC() {
        return recloc;
    }

    /**
     * Sets the value of the recloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECLOC(String value) {
        this.recloc = value;
    }

}
