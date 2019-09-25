
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OFFSET_TIME_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OFFSET_TIME_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HOUR" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="DAY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="MONTH" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OFFSET_TIME_TYPE", propOrder = {
    "hour",
    "day",
    "month"
})
public class OFFSETTIMETYPE
    implements Serializable
{

    @XmlElement(name = "HOUR")
    protected Object hour;
    @XmlElement(name = "DAY")
    protected Object day;
    @XmlElement(name = "MONTH")
    protected Object month;

    /**
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHOUR() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHOUR(Object value) {
        this.hour = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDAY() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDAY(Object value) {
        this.day = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMONTH() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMONTH(Object value) {
        this.month = value;
    }

}
