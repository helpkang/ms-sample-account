
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  Hotel/Room service pricing
 * 
 * <p>Java class for SERVICE_PRICING_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SERVICE_PRICING_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LIST_PRICE" type="{}HTL_PRICE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TAX_INCLUDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="START_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="END_VALIDITY_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SERVICE_PRICING_TYPE", propOrder = {
    "listprice",
    "taxincluded",
    "startvaliditydate",
    "endvaliditydate"
})
public class SERVICEPRICINGTYPE
    implements Serializable
{

    @XmlElement(name = "LIST_PRICE")
    protected List<HTLPRICETYPE> listprice;
    @XmlElement(name = "TAX_INCLUDED")
    protected Boolean taxincluded;
    @XmlElement(name = "START_VALIDITY_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startvaliditydate;
    @XmlElement(name = "END_VALIDITY_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endvaliditydate;

    /**
     * Gets the value of the listprice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listprice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTPRICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HTLPRICETYPE }
     * 
     * 
     */
    public List<HTLPRICETYPE> getLISTPRICE() {
        if (listprice == null) {
            listprice = new ArrayList<HTLPRICETYPE>();
        }
        return this.listprice;
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

}
