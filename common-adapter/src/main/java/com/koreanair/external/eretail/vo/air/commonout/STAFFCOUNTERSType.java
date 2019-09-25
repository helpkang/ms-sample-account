
package com.koreanair.external.eretail.vo.air.commonout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STAFF_COUNTERSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STAFF_COUNTERSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AVAILABILITY_FOR_SALE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CABIN_CAPACITY" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="NUMBER_OF_BENEFICIARIES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_STAFF_BOOKINGS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="EXPECTED_TO_BOARD" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STAFF_COUNTERSType", propOrder = {
    "availabilityforsale",
    "cabincapacity",
    "numberofbeneficiaries",
    "totalstaffbookings",
    "expectedtoboard"
})
public class STAFFCOUNTERSType
    implements Serializable
{

    @XmlElement(name = "AVAILABILITY_FOR_SALE")
    protected Object availabilityforsale;
    @XmlElement(name = "CABIN_CAPACITY")
    protected Object cabincapacity;
    @XmlElement(name = "NUMBER_OF_BENEFICIARIES")
    protected Object numberofbeneficiaries;
    @XmlElement(name = "TOTAL_STAFF_BOOKINGS")
    protected Object totalstaffbookings;
    @XmlElement(name = "EXPECTED_TO_BOARD")
    protected Object expectedtoboard;

    /**
     * Gets the value of the availabilityforsale property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAVAILABILITYFORSALE() {
        return availabilityforsale;
    }

    /**
     * Sets the value of the availabilityforsale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAVAILABILITYFORSALE(Object value) {
        this.availabilityforsale = value;
    }

    /**
     * Gets the value of the cabincapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCABINCAPACITY() {
        return cabincapacity;
    }

    /**
     * Sets the value of the cabincapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCABINCAPACITY(Object value) {
        this.cabincapacity = value;
    }

    /**
     * Gets the value of the numberofbeneficiaries property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNUMBEROFBENEFICIARIES() {
        return numberofbeneficiaries;
    }

    /**
     * Sets the value of the numberofbeneficiaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNUMBEROFBENEFICIARIES(Object value) {
        this.numberofbeneficiaries = value;
    }

    /**
     * Gets the value of the totalstaffbookings property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTOTALSTAFFBOOKINGS() {
        return totalstaffbookings;
    }

    /**
     * Sets the value of the totalstaffbookings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTOTALSTAFFBOOKINGS(Object value) {
        this.totalstaffbookings = value;
    }

    /**
     * Gets the value of the expectedtoboard property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEXPECTEDTOBOARD() {
        return expectedtoboard;
    }

    /**
     * Sets the value of the expectedtoboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEXPECTEDTOBOARD(Object value) {
        this.expectedtoboard = value;
    }

}
