
package com.koreanair.eretail.pojo.air.segmentstandaloneavailabilitycommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This structure represents marriage groupings. One LIST_MARRIAGE is a group of married segments. It contains a LIST_SEGMENT_IDENTIFIER which are pointers to the segments (Segment Identifier) in the marriage group. If there is no marriage, this structure is not necessary (Or if Marriage Break is allowed ).
 * 
 * <p>Java class for LIST_MARRIAGE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_MARRIAGE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LIST_SEGMENT_IDENTIFIER" maxOccurs="6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_MARRIAGE_Type", propOrder = {
    "listsegmentidentifier"
})
public class LISTMARRIAGEType
    implements Serializable
{

    @XmlElement(name = "LIST_SEGMENT_IDENTIFIER", required = true)
    protected List<String> listsegmentidentifier;

    /**
     * Segment Identifier. Up to the API User to decide what's this Identifier (Can be an ID, Segment Tattoo). Must be mapped to a segment in LIST_SEGMENT/SEGMENT_IDENTIFIER. Gets the value of the listsegmentidentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegmentidentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENTIDENTIFIER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLISTSEGMENTIDENTIFIER() {
        if (listsegmentidentifier == null) {
            listsegmentidentifier = new ArrayList<String>();
        }
        return this.listsegmentidentifier;
    }

}
