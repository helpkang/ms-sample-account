
package com.koreanair.eretail.pojo.tripplan.hotel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.reservation.common.DateType;
import com.koreanair.eretail.pojo.hotel.reservation.common.ListPriceType;


/**
 *  Hotel/Room service pricing
 * 
 * <p>Java class for ServicePricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ListPriceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAX_INCLUDED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="START_VALIDITY_DATE" type="{}DateType" minOccurs="0"/&gt;
 *         &lt;element name="END_VALIDITY_DATE" type="{}DateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePricingType", propOrder = {
    "taxincluded",
    "startvaliditydate",
    "endvaliditydate"
})
public class ServicePricingType
    extends ListPriceType
    implements Serializable
{

    @XmlElement(name = "TAX_INCLUDED")
    protected Boolean taxincluded;
    @XmlElement(name = "START_VALIDITY_DATE")
    protected DateType startvaliditydate;
    @XmlElement(name = "END_VALIDITY_DATE")
    protected DateType endvaliditydate;

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
     *     {@link DateType }
     *     
     */
    public DateType getSTARTVALIDITYDATE() {
        return startvaliditydate;
    }

    /**
     * Sets the value of the startvaliditydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setSTARTVALIDITYDATE(DateType value) {
        this.startvaliditydate = value;
    }

    /**
     * Gets the value of the endvaliditydate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getENDVALIDITYDATE() {
        return endvaliditydate;
    }

    /**
     * Sets the value of the endvaliditydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setENDVALIDITYDATE(DateType value) {
        this.endvaliditydate = value;
    }

}
