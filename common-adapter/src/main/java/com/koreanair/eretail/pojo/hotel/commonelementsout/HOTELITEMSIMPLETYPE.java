
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Hotel item simple type
 * 
 * <p>Java class for HOTEL_ITEM_SIMPLE_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HOTEL_ITEM_SIMPLE_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{}unprotectedStringType"/&gt;
 *         &lt;element ref="{}GDS_CODE" minOccurs="0"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HOTEL_ITEM_SIMPLE_TYPE", propOrder = {
    "code",
    "gdscode",
    "name"
})
@XmlSeeAlso({
    HOTELCOORDINATES.class,
    HOTELSIMPLETYPE.class,
    HOTELSIMPLETYPENOAVAIL.class,
    HOTELSIMPLETYPENEGO.class
})
public class HOTELITEMSIMPLETYPE
    implements Serializable
{

    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "GDS_CODE")
    protected Object gdscode;
    @XmlElement(name = "NAME")
    protected String name;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the gdscode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGDSCODE() {
        return gdscode;
    }

    /**
     * Sets the value of the gdscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGDSCODE(Object value) {
        this.gdscode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

}
