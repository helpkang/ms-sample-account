
package com.koreanair.eretail.pojo.tripplan.requirement;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.tripplan.requirement_data.REQUIREMENTDATA;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REQUIREMENT_DATA" type="{}REQUIREMENT_DATA"/&gt;
 *         &lt;element name="LIST_PRODUCT_ID" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requirementdata",
    "listproductid"
})
@XmlRootElement(name = "REQUIREMENT")
public class REQUIREMENT
    implements Serializable
{

    @XmlElement(name = "REQUIREMENT_DATA", required = true)
    protected REQUIREMENTDATA requirementdata;
    @XmlElement(name = "LIST_PRODUCT_ID")
    protected List<BigInteger> listproductid;

    /**
     * Gets the value of the requirementdata property.
     * 
     * @return
     *     possible object is
     *     {@link REQUIREMENTDATA }
     *     
     */
    public REQUIREMENTDATA getREQUIREMENTDATA() {
        return requirementdata;
    }

    /**
     * Sets the value of the requirementdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link REQUIREMENTDATA }
     *     
     */
    public void setREQUIREMENTDATA(REQUIREMENTDATA value) {
        this.requirementdata = value;
    }

    /**
     * Gets the value of the listproductid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listproductid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRODUCTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTPRODUCTID() {
        if (listproductid == null) {
            listproductid = new ArrayList<BigInteger>();
        }
        return this.listproductid;
    }

}
