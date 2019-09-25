
package com.koreanair.eretail.pojo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.hotel.common.CODENAMETYPESTRICT;


/**
 * Transportation details
 * 
 * <p>Java class for TRANSPORTATION_OPTION_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRANSPORTATION_OPTION_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}CODE_NAME_TYPE_STRICT" minOccurs="0"/&gt;
 *         &lt;element name="NOTIFICATION_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TYPICAL_TRAVEL_TIME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_DESCRIPTION" type="{}DESCRIPTION_MULTDESC_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRANSPORTATION_OPTION_TYPE", propOrder = {
    "type",
    "notificationrequired",
    "typicaltraveltime",
    "listdescription"
})
public class TRANSPORTATIONOPTIONTYPE
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected CODENAMETYPESTRICT type;
    @XmlElement(name = "NOTIFICATION_REQUIRED")
    protected Boolean notificationrequired;
    @XmlElement(name = "TYPICAL_TRAVEL_TIME")
    protected String typicaltraveltime;
    @XmlElement(name = "LIST_DESCRIPTION")
    protected List<DESCRIPTIONMULTDESCTYPE> listdescription;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public CODENAMETYPESTRICT getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public void setTYPE(CODENAMETYPESTRICT value) {
        this.type = value;
    }

    /**
     * Gets the value of the notificationrequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNOTIFICATIONREQUIRED() {
        return notificationrequired;
    }

    /**
     * Sets the value of the notificationrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNOTIFICATIONREQUIRED(Boolean value) {
        this.notificationrequired = value;
    }

    /**
     * Gets the value of the typicaltraveltime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPICALTRAVELTIME() {
        return typicaltraveltime;
    }

    /**
     * Sets the value of the typicaltraveltime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPICALTRAVELTIME(String value) {
        this.typicaltraveltime = value;
    }

    /**
     * Gets the value of the listdescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTDESCRIPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESCRIPTIONMULTDESCTYPE }
     * 
     * 
     */
    public List<DESCRIPTIONMULTDESCTYPE> getLISTDESCRIPTION() {
        if (listdescription == null) {
            listdescription = new ArrayList<DESCRIPTIONMULTDESCTYPE>();
        }
        return this.listdescription;
    }

}
