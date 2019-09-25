
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.reservation.common.DateType;


/**
 *  Date and string description
 * 
 * <p>Java class for DateDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATE_TIME" type="{}DateType" minOccurs="0"/&gt;
 *         &lt;element name="PROVIDER_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateDescriptionType", propOrder = {
    "datetime",
    "providerdescription"
})
public class DateDescriptionType
    implements Serializable
{

    @XmlElement(name = "DATE_TIME")
    protected DateType datetime;
    @XmlElement(name = "PROVIDER_DESCRIPTION")
    protected String providerdescription;

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDATETIME() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDATETIME(DateType value) {
        this.datetime = value;
    }

    /**
     * Gets the value of the providerdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDERDESCRIPTION() {
        return providerdescription;
    }

    /**
     * Sets the value of the providerdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDERDESCRIPTION(String value) {
        this.providerdescription = value;
    }

}
