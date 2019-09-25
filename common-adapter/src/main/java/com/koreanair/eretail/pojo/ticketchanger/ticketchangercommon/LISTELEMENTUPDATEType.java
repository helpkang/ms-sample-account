
package com.koreanair.eretail.pojo.ticketchanger.ticketchangercommon;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_ELEMENT_UPDATE_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ELEMENT_UPDATE_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ITEM_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ITEM_ID_SOURCE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{}elementUpdateType" minOccurs="0"/&gt;
 *         &lt;element name="LIST_SEGMENT_UPDATE" type="{}LIST_SEGMENT_UPDATE_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_ELEMENT_UPDATE_Type", propOrder = {
    "itemid",
    "itemidsource",
    "type",
    "listsegmentupdate"
})
public class LISTELEMENTUPDATEType
    implements Serializable
{

    @XmlElement(name = "ITEM_ID", required = true)
    protected BigInteger itemid;
    @XmlElement(name = "ITEM_ID_SOURCE")
    protected Object itemidsource;
    @XmlElement(name = "TYPE")
    @XmlSchemaType(name = "string")
    protected ElementUpdateType type;
    @XmlElement(name = "LIST_SEGMENT_UPDATE")
    protected List<LISTSEGMENTUPDATEType> listsegmentupdate;

    /**
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMID(BigInteger value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the itemidsource property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getITEMIDSOURCE() {
        return itemidsource;
    }

    /**
     * Sets the value of the itemidsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setITEMIDSOURCE(Object value) {
        this.itemidsource = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ElementUpdateType }
     *     
     */
    public ElementUpdateType getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementUpdateType }
     *     
     */
    public void setTYPE(ElementUpdateType value) {
        this.type = value;
    }

    /**
     * Gets the value of the listsegmentupdate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsegmentupdate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTSEGMENTUPDATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTSEGMENTUPDATEType }
     * 
     * 
     */
    public List<LISTSEGMENTUPDATEType> getLISTSEGMENTUPDATE() {
        if (listsegmentupdate == null) {
            listsegmentupdate = new ArrayList<LISTSEGMENTUPDATEType>();
        }
        return this.listsegmentupdate;
    }

}
