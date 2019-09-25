
package com.koreanair.eretail.pojo.farecommon.farecontext;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CR 05708699
 * 
 * <p>Java class for LIST_BOUND_SEGMENT_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_BOUND_SEGMENT_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT_ID" type="{}SEGMENT_IDENTIFICATION_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_BOUND_SEGMENT_Type", propOrder = {
    "boundid",
    "listsegmentid"
})
public class LISTBOUNDSEGMENTType
    implements Serializable
{

    @XmlElement(name = "BOUND_ID")
    protected BigInteger boundid;
    @XmlElement(name = "LIST_SEGMENT_ID", required = true)
    protected List<SEGMENTIDENTIFICATIONType> listsegmentid;

    /**
     * Gets the value of the boundid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBOUNDID() {
        return boundid;
    }

    /**
     * Sets the value of the boundid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBOUNDID(BigInteger value) {
        this.boundid = value;
    }

    /**
     * Gets the value of the listsegmentid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegmentid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEGMENTIDENTIFICATIONType }
     * 
     * 
     */
    public List<SEGMENTIDENTIFICATIONType> getLISTSEGMENTID() {
        if (listsegmentid == null) {
            listsegmentid = new ArrayList<SEGMENTIDENTIFICATIONType>();
        }
        return this.listsegmentid;
    }

}
