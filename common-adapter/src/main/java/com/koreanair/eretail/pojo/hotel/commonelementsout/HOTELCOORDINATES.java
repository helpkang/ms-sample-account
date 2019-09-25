
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Basic hotel coordinates.
 * 
 * <p>Java class for HOTEL_COORDINATES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_COORDINATES"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}HOTEL_ITEM_SIMPLE_TYPE"&gt;
 *       &lt;group ref="{}PHONE_GROUP"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_COORDINATES", propOrder = {
    "phonenumber",
    "telexnumber",
    "faxnumber"
})
public class HOTELCOORDINATES
    extends HOTELITEMSIMPLETYPE
    implements Serializable
{

    @XmlElement(name = "PHONE_NUMBER")
    protected String phonenumber;
    @XmlElement(name = "TELEX_NUMBER")
    protected String telexnumber;
    @XmlElement(name = "FAX_NUMBER")
    protected String faxnumber;

    /**
     * Gets the value of the phonenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHONENUMBER() {
        return phonenumber;
    }

    /**
     * Sets the value of the phonenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHONENUMBER(String value) {
        this.phonenumber = value;
    }

    /**
     * Gets the value of the telexnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEXNUMBER() {
        return telexnumber;
    }

    /**
     * Sets the value of the telexnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEXNUMBER(String value) {
        this.telexnumber = value;
    }

    /**
     * Gets the value of the faxnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAXNUMBER() {
        return faxnumber;
    }

    /**
     * Sets the value of the faxnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAXNUMBER(String value) {
        this.faxnumber = value;
    }

}
