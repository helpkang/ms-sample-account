
package com.koreanair.external.eretail.vo.profile.commonprofileout;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The APIS structure reference entry type.
 * 
 * <p>Java class for APIS_ENTRY_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIS_ENTRY_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="TARGET" type="{}APIS_TARGET_type"/&gt;
 *         &lt;element name="INDEX" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="STRUCTURE_ID" type="{}STRING_TYPE_APIS_PFIELD" minOccurs="0"/&gt;
 *         &lt;element name="APIS_ENTRY_ID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIS_ENTRY_type", propOrder = {

})
public class APISENTRYType
    implements Serializable
{

    @XmlElement(name = "TARGET", required = true)
    protected APISTARGETType target;
    @XmlElement(name = "INDEX", required = true)
    protected String index;
    @XmlElement(name = "STRUCTURE_ID")
    protected STRINGTYPEAPISPFIELD structureid;
    @XmlElement(name = "APIS_ENTRY_ID", required = true)
    protected Object apisentryid;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link APISTARGETType }
     *     
     */
    public APISTARGETType getTARGET() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISTARGETType }
     *     
     */
    public void setTARGET(APISTARGETType value) {
        this.target = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDEX() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDEX(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the structureid property.
     * 
     * @return
     *     possible object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public STRINGTYPEAPISPFIELD getSTRUCTUREID() {
        return structureid;
    }

    /**
     * Sets the value of the structureid property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRINGTYPEAPISPFIELD }
     *     
     */
    public void setSTRUCTUREID(STRINGTYPEAPISPFIELD value) {
        this.structureid = value;
    }

    /**
     * Gets the value of the apisentryid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISENTRYID() {
        return apisentryid;
    }

    /**
     * Sets the value of the apisentryid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISENTRYID(Object value) {
        this.apisentryid = value;
    }

}
