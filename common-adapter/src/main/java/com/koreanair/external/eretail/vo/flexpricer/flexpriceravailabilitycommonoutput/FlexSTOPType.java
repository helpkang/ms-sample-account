
package com.koreanair.external.eretail.vo.flexpricer.flexpriceravailabilitycommonoutput;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.DATEType;
import com.koreanair.external.eretail.vo.farecommon.farecommonitineraryoutput.EQUIPMENT;
import com.koreanair.external.eretail.vo.flexpricer.commonavailabilityoutput.LocationType;


/**
 * <p>Java class for Flex_STOP_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flex_STOP_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOCATION" type="{}LocationType"/&gt;
 *         &lt;element name="ARRIVAL_DATE" type="{}DATE_Type" minOccurs="0"/&gt;
 *         &lt;element name="DEPARTURE_DATE" type="{}DATE_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{}EQUIPMENT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flex_STOP_Type", propOrder = {
    "location",
    "arrivaldate",
    "departuredate",
    "equipment"
})
public class FlexSTOPType
    implements Serializable
{

    @XmlElement(name = "LOCATION", required = true)
    protected LocationType location;
    @XmlElement(name = "ARRIVAL_DATE")
    protected DATEType arrivaldate;
    @XmlElement(name = "DEPARTURE_DATE")
    protected DATEType departuredate;
    @XmlElement(name = "EQUIPMENT")
    protected EQUIPMENT equipment;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLOCATION(LocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the arrivaldate property.
     * 
     * @return
     *     possible object is
     *     {@link DATEType }
     *     
     */
    public DATEType getARRIVALDATE() {
        return arrivaldate;
    }

    /**
     * Sets the value of the arrivaldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATEType }
     *     
     */
    public void setARRIVALDATE(DATEType value) {
        this.arrivaldate = value;
    }

    /**
     * Gets the value of the departuredate property.
     * 
     * @return
     *     possible object is
     *     {@link DATEType }
     *     
     */
    public DATEType getDEPARTUREDATE() {
        return departuredate;
    }

    /**
     * Sets the value of the departuredate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATEType }
     *     
     */
    public void setDEPARTUREDATE(DATEType value) {
        this.departuredate = value;
    }

    /**
     * The presence of equipment indicates a change of gauge
     * 
     * @return
     *     possible object is
     *     {@link EQUIPMENT }
     *     
     */
    public EQUIPMENT getEQUIPMENT() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EQUIPMENT }
     *     
     */
    public void setEQUIPMENT(EQUIPMENT value) {
        this.equipment = value;
    }

}
