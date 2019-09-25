
package com.koreanair.external.eretail.vo.common.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * APIS Manager content dump
 * 
 * <p>Java class for APIS_MANAGER_OUTPUT_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIS_MANAGER_OUTPUT_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FLOW_CODE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ITINERARY_HAS_CHANGED" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_APIS_TARGET_DESCRIPTORS" type="{}APIS_TARGET_DESCRIPTOR_TYPE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIS_MANAGER_OUTPUT_TYPE", propOrder = {
    "flowcode",
    "itineraryhaschanged",
    "listapistargetdescriptors"
})
public class APISMANAGEROUTPUTTYPE
    implements Serializable
{

    @XmlElement(name = "FLOW_CODE")
    protected Object flowcode;
    @XmlElement(name = "ITINERARY_HAS_CHANGED")
    protected Object itineraryhaschanged;
    @XmlElement(name = "LIST_APIS_TARGET_DESCRIPTORS")
    protected List<APISTARGETDESCRIPTORTYPE> listapistargetdescriptors;

    /**
     * Gets the value of the flowcode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFLOWCODE() {
        return flowcode;
    }

    /**
     * Sets the value of the flowcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFLOWCODE(Object value) {
        this.flowcode = value;
    }

    /**
     * Gets the value of the itineraryhaschanged property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getITINERARYHASCHANGED() {
        return itineraryhaschanged;
    }

    /**
     * Sets the value of the itineraryhaschanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setITINERARYHASCHANGED(Object value) {
        this.itineraryhaschanged = value;
    }

    /**
     * Gets the value of the listapistargetdescriptors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listapistargetdescriptors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAPISTARGETDESCRIPTORS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APISTARGETDESCRIPTORTYPE }
     * 
     * 
     */
    public List<APISTARGETDESCRIPTORTYPE> getLISTAPISTARGETDESCRIPTORS() {
        if (listapistargetdescriptors == null) {
            listapistargetdescriptors = new ArrayList<APISTARGETDESCRIPTORTYPE>();
        }
        return this.listapistargetdescriptors;
    }

}
