
package com.koreanair.external.eretail.vo.pnr.productidgroup;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RECOMMENDATION_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LIST_ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirElementType", propOrder = {
    "recommendationid",
    "listelementid"
})
public class AirElementType
    implements Serializable
{

    @XmlElement(name = "RECOMMENDATION_ID", required = true)
    protected String recommendationid;
    @XmlElement(name = "LIST_ELEMENT_ID", required = true)
    protected List<BigInteger> listelementid;

    /**
     * Gets the value of the recommendationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECOMMENDATIONID() {
        return recommendationid;
    }

    /**
     * Sets the value of the recommendationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECOMMENDATIONID(String value) {
        this.recommendationid = value;
    }

    /**
     * Gets the value of the listelementid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listelementid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTELEMENTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTELEMENTID() {
        if (listelementid == null) {
            listelementid = new ArrayList<BigInteger>();
        }
        return this.listelementid;
    }

}
