
package com.koreanair.eretail.pojo.tripplan.ancillary_services;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.profile.commonprofileout.LISTFREQUENTFLYERTYPE;


/**
 * <p>Java class for paxForServicePricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paxForServicePricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TYPE_CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="LIST_FREQUENT_FLYER" type="{}LIST_FREQUENT_FLYER_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paxForServicePricingType", propOrder = {
    "travellerid",
    "typecode",
    "listfrequentflyer"
})
public class PaxForServicePricingType
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_ID", required = true)
    protected BigInteger travellerid;
    @XmlElement(name = "TYPE_CODE", required = true)
    protected String typecode;
    @XmlElement(name = "LIST_FREQUENT_FLYER")
    protected List<LISTFREQUENTFLYERTYPE> listfrequentflyer;

    /**
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRAVELLERID(BigInteger value) {
        this.travellerid = value;
    }

    /**
     * Gets the value of the typecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPECODE() {
        return typecode;
    }

    /**
     * Sets the value of the typecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPECODE(String value) {
        this.typecode = value;
    }

    /**
     * Gets the value of the listfrequentflyer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listfrequentflyer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFREQUENTFLYER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFREQUENTFLYERTYPE }
     * 
     * 
     */
    public List<LISTFREQUENTFLYERTYPE> getLISTFREQUENTFLYER() {
        if (listfrequentflyer == null) {
            listfrequentflyer = new ArrayList<LISTFREQUENTFLYERTYPE>();
        }
        return this.listfrequentflyer;
    }

}
