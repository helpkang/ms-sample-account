
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains the various methods of Guarantee or forms of payment for a Deposit.
 * 
 * <p>Java class for GUARANTEE_DEPOSIT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GUARANTEE_DEPOSIT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PAYMENT_TYPE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CORPORATE_ID_ACCEPTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BOOKING_SOURCE_ACCEPTED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HOLD_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GUARANTEE_DEPOSIT_TYPE", propOrder = {
    "corporateidaccepted",
    "bookingsourceaccepted",
    "holdtime",
    "description"
})
public class GUARANTEEDEPOSITTYPE
    extends PAYMENTTYPE
    implements Serializable
{

    @XmlElement(name = "CORPORATE_ID_ACCEPTED")
    protected Boolean corporateidaccepted;
    @XmlElement(name = "BOOKING_SOURCE_ACCEPTED")
    protected Boolean bookingsourceaccepted;
    @XmlElement(name = "HOLD_TIME")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar holdtime;
    @XmlElement(name = "DESCRIPTION")
    protected String description;

    /**
     * Gets the value of the corporateidaccepted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCORPORATEIDACCEPTED() {
        return corporateidaccepted;
    }

    /**
     * Sets the value of the corporateidaccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCORPORATEIDACCEPTED(Boolean value) {
        this.corporateidaccepted = value;
    }

    /**
     * Gets the value of the bookingsourceaccepted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOOKINGSOURCEACCEPTED() {
        return bookingsourceaccepted;
    }

    /**
     * Sets the value of the bookingsourceaccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOOKINGSOURCEACCEPTED(Boolean value) {
        this.bookingsourceaccepted = value;
    }

    /**
     * Gets the value of the holdtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHOLDTIME() {
        return holdtime;
    }

    /**
     * Sets the value of the holdtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHOLDTIME(XMLGregorianCalendar value) {
        this.holdtime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

}
