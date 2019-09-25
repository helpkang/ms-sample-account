
package com.koreanair.external.eretail.vo.common.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_ELEMENT_STATUS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ELEMENT_STATUS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FUNCTIONAL_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ELEMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ELEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element ref="{}LIST_MSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_ELEMENT_STATUS", propOrder = {
    "functionalid",
    "elementtype",
    "elementid",
    "listmsg"
})
public class LISTELEMENTSTATUS
    implements Serializable
{

    @XmlElement(name = "FUNCTIONAL_ID")
    protected Object functionalid;
    @XmlElement(name = "ELEMENT_TYPE")
    protected Object elementtype;
    @XmlElement(name = "ELEMENT_ID")
    protected Object elementid;
    @XmlElement(name = "LIST_MSG")
    protected List<LISTMSG> listmsg;

    /**
     * Gets the value of the functionalid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFUNCTIONALID() {
        return functionalid;
    }

    /**
     * Sets the value of the functionalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFUNCTIONALID(Object value) {
        this.functionalid = value;
    }

    /**
     * Gets the value of the elementtype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getELEMENTTYPE() {
        return elementtype;
    }

    /**
     * Sets the value of the elementtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setELEMENTTYPE(Object value) {
        this.elementtype = value;
    }

    /**
     * Gets the value of the elementid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getELEMENTID() {
        return elementid;
    }

    /**
     * Sets the value of the elementid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setELEMENTID(Object value) {
        this.elementid = value;
    }

    /**
     * Gets the value of the listmsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listmsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTMSG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTMSG }
     * 
     * 
     */
    public List<LISTMSG> getLISTMSG() {
        if (listmsg == null) {
            listmsg = new ArrayList<LISTMSG>();
        }
        return this.listmsg;
    }

}
