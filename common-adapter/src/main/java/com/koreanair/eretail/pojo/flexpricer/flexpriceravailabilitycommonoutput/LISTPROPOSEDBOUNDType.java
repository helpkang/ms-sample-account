
package com.koreanair.eretail.pojo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_PROPOSED_BOUND_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_PROPOSED_BOUND_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOUND_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LIST_FLIGHT" type="{}LIST_FLIGHTType" maxOccurs="200"/&gt;
 *         &lt;element name="NPO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_PROPOSED_BOUND_Type", propOrder = {
    "boundid",
    "listflight",
    "npo"
})
public class LISTPROPOSEDBOUNDType
    implements Serializable
{

    @XmlElement(name = "BOUND_ID")
    protected BigInteger boundid;
    @XmlElement(name = "LIST_FLIGHT", required = true)
    protected List<LISTFLIGHTType> listflight;
    @XmlElement(name = "NPO")
    protected BigInteger npo;

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
     * Gets the value of the listflight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listflight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFLIGHT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTFLIGHTType }
     * 
     * 
     */
    public List<LISTFLIGHTType> getLISTFLIGHT() {
        if (listflight == null) {
            listflight = new ArrayList<LISTFLIGHTType>();
        }
        return this.listflight;
    }

    /**
     * Gets the value of the npo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNPO() {
        return npo;
    }

    /**
     * Sets the value of the npo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNPO(BigInteger value) {
        this.npo = value;
    }

}
