
package com.koreanair.external.eretail.vo.tripplan.status;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}unprotectedStringType"/&gt;
 *         &lt;element name="IS_TRAVEL_IN_MODIFICATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_MODIFICATION_IN_PROGRESS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_TRAVEL_IN_CREATION" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IS_TRAVEL_TEST_BOOKING" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "type",
    "istravelinmodification",
    "ismodificationinprogress",
    "istravelincreation",
    "istraveltestbooking"
})
@XmlRootElement(name = "STATUS")
public class STATUS
    implements Serializable
{

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "IS_TRAVEL_IN_MODIFICATION")
    protected Boolean istravelinmodification;
    @XmlElement(name = "IS_MODIFICATION_IN_PROGRESS")
    protected Boolean ismodificationinprogress;
    @XmlElement(name = "IS_TRAVEL_IN_CREATION")
    protected Boolean istravelincreation;
    @XmlElement(name = "IS_TRAVEL_TEST_BOOKING")
    protected Object istraveltestbooking;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the istravelinmodification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISTRAVELINMODIFICATION() {
        return istravelinmodification;
    }

    /**
     * Sets the value of the istravelinmodification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISTRAVELINMODIFICATION(Boolean value) {
        this.istravelinmodification = value;
    }

    /**
     * Gets the value of the ismodificationinprogress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISMODIFICATIONINPROGRESS() {
        return ismodificationinprogress;
    }

    /**
     * Sets the value of the ismodificationinprogress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISMODIFICATIONINPROGRESS(Boolean value) {
        this.ismodificationinprogress = value;
    }

    /**
     * Gets the value of the istravelincreation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISTRAVELINCREATION() {
        return istravelincreation;
    }

    /**
     * Sets the value of the istravelincreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISTRAVELINCREATION(Boolean value) {
        this.istravelincreation = value;
    }

    /**
     * Gets the value of the istraveltestbooking property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getISTRAVELTESTBOOKING() {
        return istraveltestbooking;
    }

    /**
     * Sets the value of the istraveltestbooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setISTRAVELTESTBOOKING(Object value) {
        this.istraveltestbooking = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
