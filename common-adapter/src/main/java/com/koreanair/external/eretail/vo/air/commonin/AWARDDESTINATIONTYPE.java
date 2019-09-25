
package com.koreanair.external.eretail.vo.air.commonin;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.air.common.AWARDFLIGHTPREFERENCE;


/**
 * A light DESTINATION_Type for the award calendar.
 * 
 * <p>Java class for AWARD_DESTINATION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AWARD_DESTINATION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}B_DATE"/&gt;
 *         &lt;element name="MIN_BOUND" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MAX_BOUND" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element ref="{}B_LOCATION"/&gt;
 *         &lt;element ref="{}E_LOCATION"/&gt;
 *         &lt;element name="LIST_FLIGHT_PREFERENCE" type="{}AWARD_FLIGHT_PREFERENCE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AWARD_DESTINATION_TYPE", propOrder = {
    "bdate",
    "minbound",
    "maxbound",
    "blocation",
    "elocation",
    "listflightpreference"
})
public class AWARDDESTINATIONTYPE
    implements Serializable
{

    @XmlElement(name = "B_DATE", required = true)
    protected String bdate;
    @XmlElement(name = "MIN_BOUND", required = true)
    protected BigInteger minbound;
    @XmlElement(name = "MAX_BOUND", required = true)
    protected BigInteger maxbound;
    @XmlElement(name = "B_LOCATION", required = true)
    protected String blocation;
    @XmlElement(name = "E_LOCATION", required = true)
    protected String elocation;
    @XmlElement(name = "LIST_FLIGHT_PREFERENCE")
    protected List<AWARDFLIGHTPREFERENCE> listflightpreference;

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDATE(String value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the minbound property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMINBOUND() {
        return minbound;
    }

    /**
     * Sets the value of the minbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMINBOUND(BigInteger value) {
        this.minbound = value;
    }

    /**
     * Gets the value of the maxbound property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMAXBOUND() {
        return maxbound;
    }

    /**
     * Sets the value of the maxbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMAXBOUND(BigInteger value) {
        this.maxbound = value;
    }

    /**
     * Gets the value of the blocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLOCATION() {
        return blocation;
    }

    /**
     * Sets the value of the blocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLOCATION(String value) {
        this.blocation = value;
    }

    /**
     * Gets the value of the elocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELOCATION() {
        return elocation;
    }

    /**
     * Sets the value of the elocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELOCATION(String value) {
        this.elocation = value;
    }

    /**
     * Gets the value of the listflightpreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listflightpreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTFLIGHTPREFERENCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AWARDFLIGHTPREFERENCE }
     * 
     * 
     */
    public List<AWARDFLIGHTPREFERENCE> getLISTFLIGHTPREFERENCE() {
        if (listflightpreference == null) {
            listflightpreference = new ArrayList<AWARDFLIGHTPREFERENCE>();
        }
        return this.listflightpreference;
    }

}
