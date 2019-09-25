
package com.koreanair.external.eretail.vo.tripplan.common.common_fare;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CLASS_DIFFERENTIAL_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CLASS_DIFFERENTIAL_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AMOUNT" type="{}AmountAsString_Type"/&gt;
 *         &lt;group ref="{}FROM_TO_Pair"/&gt;
 *         &lt;element name="LIST_IATA_CHECK" type="{}IATA_CHECK_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CLASS_DIFFERENTIAL_Type", propOrder = {
    "amount",
    "from",
    "to",
    "listiatacheck"
})
public class CLASSDIFFERENTIALType
    implements Serializable
{

    @XmlElement(name = "AMOUNT", required = true)
    protected String amount;
    @XmlElement(name = "FROM", required = true)
    protected String from;
    @XmlElement(name = "TO", required = true)
    protected String to;
    @XmlElement(name = "LIST_IATA_CHECK")
    protected List<IATACHECKType> listiatacheck;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNT(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFROM() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFROM(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTO() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTO(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the listiatacheck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listiatacheck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTIATACHECK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IATACHECKType }
     * 
     * 
     */
    public List<IATACHECKType> getLISTIATACHECK() {
        if (listiatacheck == null) {
            listiatacheck = new ArrayList<IATACHECKType>();
        }
        return this.listiatacheck;
    }

}
