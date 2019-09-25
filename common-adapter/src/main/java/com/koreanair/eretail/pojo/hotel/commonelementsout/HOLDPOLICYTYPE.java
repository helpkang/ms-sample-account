
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HOLD_POLICY_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOLD_POLICY_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}LIST_DAY_TYPE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="START_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="END_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HOLD_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOLD_POLICY_TYPE", propOrder = {
    "startvaliditydate",
    "endvaliditydate",
    "holdtime"
})
public class HOLDPOLICYTYPE
    extends LISTDAYTYPE
    implements Serializable
{

    @XmlElement(name = "START_VALIDITY_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startvaliditydate;
    @XmlElement(name = "END_VALIDITY_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endvaliditydate;
    @XmlElement(name = "HOLD_TIME")
    protected String holdtime;

    /**
     * Gets the value of the startvaliditydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTARTVALIDITYDATE() {
        return startvaliditydate;
    }

    /**
     * Sets the value of the startvaliditydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTARTVALIDITYDATE(XMLGregorianCalendar value) {
        this.startvaliditydate = value;
    }

    /**
     * Gets the value of the endvaliditydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getENDVALIDITYDATE() {
        return endvaliditydate;
    }

    /**
     * Sets the value of the endvaliditydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setENDVALIDITYDATE(XMLGregorianCalendar value) {
        this.endvaliditydate = value;
    }

    /**
     * Gets the value of the holdtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLDTIME() {
        return holdtime;
    }

    /**
     * Sets the value of the holdtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLDTIME(String value) {
        this.holdtime = value;
    }

}
