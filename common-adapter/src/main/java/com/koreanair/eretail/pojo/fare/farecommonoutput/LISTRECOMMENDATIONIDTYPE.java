
package com.koreanair.eretail.pojo.fare.farecommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_RECOMMENDATION_ID_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_RECOMMENDATION_ID_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}RECOMMENDATION_ID"/&gt;
 *         &lt;element ref="{}LIST_FLIGHT_ID" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_RECOMMENDATION_ID_TYPE", propOrder = {
    "recommendationid",
    "listflightid"
})
public class LISTRECOMMENDATIONIDTYPE
    implements Serializable
{

    @XmlElement(name = "RECOMMENDATION_ID", required = true)
    protected BigInteger recommendationid;
    @XmlElement(name = "LIST_FLIGHT_ID", required = true)
    protected List<BigInteger> listflightid;

    /**
     * Gets the value of the recommendationid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRECOMMENDATIONID() {
        return recommendationid;
    }

    /**
     * Sets the value of the recommendationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRECOMMENDATIONID(BigInteger value) {
        this.recommendationid = value;
    }

    /**
     * Gets the value of the listflightid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listflightid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFLIGHTID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getLISTFLIGHTID() {
        if (listflightid == null) {
            listflightid = new ArrayList<BigInteger>();
        }
        return this.listflightid;
    }

}
