
package com.koreanair.external.eretail.vo.hotel.commonelementsout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.external.eretail.vo.hotel.common.CODENAMETYPESTRICT;


/**
 * Reference Points
 * 
 * <p>Java class for REFERENCE_POINT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REFERENCE_POINT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}CODE_NAME_TYPE_STRICT" minOccurs="0"/&gt;
 *         &lt;element name="NAME" type="{}unprotectedStringType" minOccurs="0"/&gt;
 *         &lt;element name="CODE" type="{}CODE_NAME_TYPE_STRICT" minOccurs="0"/&gt;
 *         &lt;element name="DISTANCE" type="{}DUAL_DISTANCE_TYPE" minOccurs="0"/&gt;
 *         &lt;element name="PRIMARY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NEAREST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LIST_TRANSPORTATION_OPTION" type="{}TRANSPORTATION_OPTION_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REFERENCE_POINT_TYPE", propOrder = {
    "type",
    "name",
    "code",
    "distance",
    "primary",
    "nearest",
    "listtransportationoption"
})
public class REFERENCEPOINTTYPE
    implements Serializable
{

    @XmlElement(name = "TYPE")
    protected CODENAMETYPESTRICT type;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "CODE")
    protected CODENAMETYPESTRICT code;
    @XmlElement(name = "DISTANCE")
    protected DUALDISTANCETYPE distance;
    @XmlElement(name = "PRIMARY")
    protected Boolean primary;
    @XmlElement(name = "NEAREST")
    protected Boolean nearest;
    @XmlElement(name = "LIST_TRANSPORTATION_OPTION")
    protected List<TRANSPORTATIONOPTIONTYPE> listtransportationoption;

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

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public CODENAMETYPESTRICT getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODENAMETYPESTRICT }
     *     
     */
    public void setCODE(CODENAMETYPESTRICT value) {
        this.code = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link DUALDISTANCETYPE }
     *     
     */
    public DUALDISTANCETYPE getDISTANCE() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUALDISTANCETYPE }
     *     
     */
    public void setDISTANCE(DUALDISTANCETYPE value) {
        this.distance = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPRIMARY() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPRIMARY(Boolean value) {
        this.primary = value;
    }

    /**
     * Gets the value of the nearest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNEAREST() {
        return nearest;
    }

    /**
     * Sets the value of the nearest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNEAREST(Boolean value) {
        this.nearest = value;
    }

    /**
     * Gets the value of the listtransportationoption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listtransportationoption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTTRANSPORTATIONOPTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRANSPORTATIONOPTIONTYPE }
     * 
     * 
     */
    public List<TRANSPORTATIONOPTIONTYPE> getLISTTRANSPORTATIONOPTION() {
        if (listtransportationoption == null) {
            listtransportationoption = new ArrayList<TRANSPORTATIONOPTIONTYPE>();
        }
        return this.listtransportationoption;
    }

}
