
package com.koreanair.eretail.pojo.common.common;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CR3710042: The structure bearing information about whether a service is operational on the given day. The day is indicated either by index or by date.  
 * 
 * <p>Java class for DayOfOperationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayOfOperationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="DAY_INDEX" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *           &lt;element name="DATE" type="{}OutputDateType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="SERVICE_OPERATIONAL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayOfOperationType", propOrder = {
    "dayindex",
    "date",
    "serviceoperational"
})
public class DayOfOperationType
    implements Serializable
{

    @XmlElement(name = "DAY_INDEX")
    protected BigInteger dayindex;
    @XmlElement(name = "DATE")
    protected OutputDateType date;
    @XmlElement(name = "SERVICE_OPERATIONAL")
    protected boolean serviceoperational;

    /**
     * Gets the value of the dayindex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDAYINDEX() {
        return dayindex;
    }

    /**
     * Sets the value of the dayindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDAYINDEX(BigInteger value) {
        this.dayindex = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link OutputDateType }
     *     
     */
    public OutputDateType getDATE() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDateType }
     *     
     */
    public void setDATE(OutputDateType value) {
        this.date = value;
    }

    /**
     * Gets the value of the serviceoperational property.
     * 
     */
    public boolean isSERVICEOPERATIONAL() {
        return serviceoperational;
    }

    /**
     * Sets the value of the serviceoperational property.
     * 
     */
    public void setSERVICEOPERATIONAL(boolean value) {
        this.serviceoperational = value;
    }

}
