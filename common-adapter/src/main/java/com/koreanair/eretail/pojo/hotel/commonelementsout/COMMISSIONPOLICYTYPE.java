
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for COMMISSION_POLICY_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COMMISSION_POLICY_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}COMMISSION_TYPE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="START_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="END_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TAX_INCLUDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="APPLICABILITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMMISSION_POLICY_TYPE", propOrder = {
    "startvaliditydate",
    "endvaliditydate",
    "taxincluded",
    "applicability"
})
public class COMMISSIONPOLICYTYPE
    extends COMMISSIONTYPE
    implements Serializable
{

    @XmlElement(name = "START_VALIDITY_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startvaliditydate;
    @XmlElement(name = "END_VALIDITY_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endvaliditydate;
    @XmlElement(name = "TAX_INCLUDED")
    protected Boolean taxincluded;
    @XmlElement(name = "APPLICABILITY")
    protected String applicability;

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
     * Gets the value of the taxincluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTAXINCLUDED() {
        return taxincluded;
    }

    /**
     * Sets the value of the taxincluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTAXINCLUDED(Boolean value) {
        this.taxincluded = value;
    }

    /**
     * Gets the value of the applicability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLICABILITY() {
        return applicability;
    }

    /**
     * Sets the value of the applicability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLICABILITY(String value) {
        this.applicability = value;
    }

}
