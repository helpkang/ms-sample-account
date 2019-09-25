
package com.koreanair.eretail.pojo.air.commonout;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the type of the informations of the flights.
 * 
 * <p>Java class for AWARD_FLIGHT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AWARD_FLIGHT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DURATION" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="LIST_SEGMENT" type="{}AWARD_SEGMENT_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AWARD_FLIGHT", propOrder = {
    "duration",
    "listsegment"
})
public class AWARDFLIGHT
    implements Serializable
{

    @XmlElement(name = "DURATION", required = true)
    protected BigInteger duration;
    @XmlElement(name = "LIST_SEGMENT", required = true)
    protected List<AWARDSEGMENTType> listsegment;

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDURATION() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDURATION(BigInteger value) {
        this.duration = value;
    }

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
     * {@link AWARDSEGMENTType }
     * 
     * 
     */
    public List<AWARDSEGMENTType> getLISTSEGMENT() {
        if (listsegment == null) {
            listsegment = new ArrayList<AWARDSEGMENTType>();
        }
        return this.listsegment;
    }

}
