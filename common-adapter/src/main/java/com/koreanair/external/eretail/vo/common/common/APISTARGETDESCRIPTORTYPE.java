
package com.koreanair.external.eretail.vo.common.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIS_TARGET_DESCRIPTOR_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIS_TARGET_DESCRIPTOR_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}APIS_STRUCTURE_DESCRIPTION_GROUP" minOccurs="0"/&gt;
 *         &lt;element name="LIST_STRUCTURES_MAP" type="{}APIS_STRUCTURE_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="APIS_VI_AIR_IMP_COMPLIANCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIS_TARGET_DESCRIPTOR_TYPE", propOrder = {
    "source",
    "apisstructurename",
    "requirement",
    "requirementoptional",
    "liststructuresmap",
    "apisviairimpcompliance"
})
public class APISTARGETDESCRIPTORTYPE
    implements Serializable
{

    @XmlElement(name = "SOURCE")
    protected Object source;
    @XmlElement(name = "APIS_STRUCTURE_NAME")
    protected Object apisstructurename;
    @XmlElement(name = "REQUIREMENT")
    protected Object requirement;
    @XmlElement(name = "REQUIREMENT_OPTIONAL")
    protected Object requirementoptional;
    @XmlElement(name = "LIST_STRUCTURES_MAP")
    protected List<APISSTRUCTURETYPE> liststructuresmap;
    @XmlElement(name = "APIS_VI_AIR_IMP_COMPLIANCE")
    protected Object apisviairimpcompliance;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSOURCE(Object value) {
        this.source = value;
    }

    /**
     * Gets the value of the apisstructurename property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISSTRUCTURENAME() {
        return apisstructurename;
    }

    /**
     * Sets the value of the apisstructurename property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISSTRUCTURENAME(Object value) {
        this.apisstructurename = value;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREQUIREMENT() {
        return requirement;
    }

    /**
     * Sets the value of the requirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREQUIREMENT(Object value) {
        this.requirement = value;
    }

    /**
     * Gets the value of the requirementoptional property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getREQUIREMENTOPTIONAL() {
        return requirementoptional;
    }

    /**
     * Sets the value of the requirementoptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setREQUIREMENTOPTIONAL(Object value) {
        this.requirementoptional = value;
    }

    /**
     * Gets the value of the liststructuresmap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liststructuresmap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSTRUCTURESMAP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APISSTRUCTURETYPE }
     * 
     * 
     */
    public List<APISSTRUCTURETYPE> getLISTSTRUCTURESMAP() {
        if (liststructuresmap == null) {
            liststructuresmap = new ArrayList<APISSTRUCTURETYPE>();
        }
        return this.liststructuresmap;
    }

    /**
     * Gets the value of the apisviairimpcompliance property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPISVIAIRIMPCOMPLIANCE() {
        return apisviairimpcompliance;
    }

    /**
     * Sets the value of the apisviairimpcompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPISVIAIRIMPCOMPLIANCE(Object value) {
        this.apisviairimpcompliance = value;
    }

}
